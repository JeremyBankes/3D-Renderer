package com.jeremy.renderer.graphics.data;

import java.awt.image.BufferedImage;
import java.awt.image.DataBuffer;
import java.awt.image.DataBufferByte;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import javax.imageio.ImageIO;

import com.jeremy.utilities.Logger;

public class Image {

	private BufferedImage image;
	private int width;
	private int height;

	public Image(String path) {
		try {
			InputStream stream = Image.class.getResourceAsStream(path);
			if (stream == null) {
				Logger.error(new FileNotFoundException("Failed to find file '" + path + "'"), true);
			}
			image = ImageIO.read(stream);
			width = image.getWidth();
			height = image.getHeight();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public int[] getABGR() {
		int[] result = new int[0];
		result = new int[image.getWidth() * image.getHeight()];
		DataBuffer buffer = image.getRaster().getDataBuffer();
		if (buffer instanceof DataBufferByte) {
			DataBufferByte byteBuffer = (DataBufferByte) buffer;
			byte[] data = byteBuffer.getData();
			for (int i = 0, len = data.length; i < len; i += 4) {
				int pixel = data[i + 3] & 0xFF;
				pixel |= (data[i + 2] & 0xFF) << 8;
				pixel |= (data[i + 1] & 0xFF) << 16;
				pixel |= (data[i + 0] & 0xFF) << 24;
				result[i / 4] = pixel;
			}
		} else {
			Logger.warn("Attempted to load texture that's data buffer didn't contain bytes.");
		}
		return result;
	}

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}

}
