/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package math.vector.vec4;

/**
 *
 * @author GBarbieri
 */
public abstract class colorSpace extends noise {

    public Vector4 convertLinearToSRGB() {
        return compute_rgbToSrgb((Vector4) this, 0.41666f, (Vector4) this);
    }

    public Vector4 convertLinearToSRGB_() {
        return compute_rgbToSrgb((Vector4) this, 0.41666f, new Vector4());
    }

    public Vector4 convertLinearToSRGB(Vector4 colorSRGB) {
        return compute_rgbToSrgb((Vector4) this, 0.41666f, colorSRGB);
    }

    public static Vector4 compute_rgbToSrgb(Vector4 colorRGB, float gammaCorrection, Vector4 colorSRGB) {
        // vecType<T, P> const ClampedColor(clamp(ColorRGB, static_cast<T>(0), static_cast<T>(1)));
        float clampedColorX = Math.min(Math.max(colorRGB.x, 0), 1);
        float clampedColorY = Math.min(Math.max(colorRGB.y, 0), 1);
        float clampedColorZ = Math.min(Math.max(colorRGB.z, 0), 1);
        // x = pow(ClampedColor, vecType<T, P>(GammaCorrection)) * static_cast<T>(1.055) - static_cast<T>(0.055)
        float xX = (float) (Math.pow(clampedColorX, gammaCorrection) * 1.055 - 0.055);
        float xY = (float) (Math.pow(clampedColorY, gammaCorrection) * 1.055 - 0.055);
        float xZ = (float) (Math.pow(clampedColorZ, gammaCorrection) * 1.055 - 0.055);
        // y = ClampedColor * static_cast<T>(12.92)
        float yX = clampedColorX * 12.92f;
        float yY = clampedColorY * 12.92f;
        float yZ = clampedColorZ * 12.92f;
        // a = lessThan(ClampedColor, vecType<T, P>(static_cast<T>(0.0031308)))
        float aX = clampedColorX < 0.0031308f ? 1 : 0;
        float aY = clampedColorY < 0.0031308f ? 1 : 0;
        float aZ = clampedColorZ < 0.0031308f ? 1 : 0;
        // mix(x, y, a)
        colorSRGB.x = xX + aX * (yX - xX);
        colorSRGB.y = xY + aY * (yY - xY);
        colorSRGB.z = xZ + aZ * (yZ - xZ);
        colorSRGB.w = colorRGB.w;
        return colorSRGB;
    }
}
