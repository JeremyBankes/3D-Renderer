/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package math.vector.vec4;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

import math.vector.vec2.Vector2;
import math.vector.vec3.Vector3;

/**
 *
 * @author GBarbieri
 */
public class Vector4 extends colorSpace {

    public Vector4() {
        this(0);
    }

    public Vector4(Vector4 v) {
        this(v.x, v.y, v.z, v.w);
    }

    public Vector4(float f) {
        this(f, f, f, f);
    }

    public Vector4(float[] fa) {
        this(fa, 0);
    }

    public Vector4(float[] fa, int i) {
        this(fa[i + 0], fa[i + 1], fa[i + 2], fa[i + 3]);
    }

    public Vector4(double d) {
        this((float) d);
    }

    public Vector4(double[] da) {
        this(da, 0);
    }

    public Vector4(double[] da, int i) {
        this(da[i + 0], da[i + 1], da[i + 2], da[i + 3]);
    }

    public Vector4(float f, Vector3 v) {
        this(f, v.x, v.y, v.z);
    }

    public Vector4(Vector3 v, float f) {
        this(v.x, v.y, v.z, f);
    }

    public Vector4(Vector2 v0, Vector2 v1) {
        this(v0.x, v0.y, v1.x, v1.y);
    }

    public Vector4(Vector2 v, float f0, float f1) {
        this(v.x, v.y, f0, f1);
    }

    public Vector4(double x, double y, double z, double w) {
        this((float) x, (float) y, (float) z, (float) w);
    }

    public Vector4(float x, float y, float z, float w) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.w = w;
    }

    public Vector4 set() {
        return set(0);
    }

    public Vector4 set(Vector4 v) {
        return set(v.x, v.y, v.z, v.w);
    }

    public Vector4 set(float f) {
        return set(f, f, f, f);
    }

    public Vector4 set(float[] fa) {
        return set(fa, 0);
    }

    public Vector4 set(float[] fa, int i) {
        return set(fa[i + 0], fa[i + 1], fa[i + 2], fa[i + 3]);
    }

    public Vector4 set(double d) {
        return set(d, d, d, d);
    }

    public Vector4 set(double[] da) {
        return set(da, 0);
    }

    public Vector4 set(double[] da, int i) {
        return set(da[i + 0], da[i + 1], da[i + 2], da[i + 3]);
    }

    public Vector4 set(float f, Vector3 v) {
        return set(f, v.x, v.y, v.z);
    }

    public Vector4 set(Vector3 v, float f) {
        return set(v.x, v.y, v.z, f);
    }

    public Vector4 set(Vector2 v0, Vector2 v1) {
        return set(v0.x, v0.y, v1.x, v1.y);
    }

    public Vector4 set(Vector2 v, float f0, float f1) {
        return set(v.x, v.y, f0, f1);
    }

    public Vector4 set(double x, double y, double z, double w) {
        return set((float) x, (float) y, (float) z, (float) w);
    }

    public Vector4 set(float x, float y, float z, float w) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.w = w;
        return this;
    }

    public Vector3 toVec3_() {
        return toVec3(new Vector3());
    }

    public Vector3 toVec3(Vector3 res) {
        return res.set(x, y, z);
    }
    
    public float[] toFA_() {
        return toFA(new float[4]);
    }

    public float[] toFA(float[] fa) {
        fa[0] = x;
        fa[1] = y;
        fa[2] = z;
        fa[3] = w;
        return fa;
    }

    public FloatBuffer toDfb_() {
        return toDfb(ByteBuffer.allocateDirect(SIZE).order(ByteOrder.nativeOrder()).asFloatBuffer());
    }

    public FloatBuffer toDfb(FloatBuffer fb) {
        return toDfb(fb, 0);
    }

    public FloatBuffer toDfb(FloatBuffer fb, int index) {
        return fb
                .put(index + 0, x)
                .put(index + 1, y)
                .put(index + 2, z)
                .put(index + 3, w);
    }

    public ByteBuffer toDbb_() {
        return toDbb(ByteBuffer.allocateDirect(SIZE).order(ByteOrder.nativeOrder()));
    }

    public ByteBuffer toDbb(ByteBuffer bb) {
        return toDbb(bb, 0);
    }

    public ByteBuffer toDbb(ByteBuffer bb, int index) {
        return bb
                .putFloat(index + 0 * Float.BYTES, x)
                .putFloat(index + 1 * Float.BYTES, y)
                .putFloat(index + 2 * Float.BYTES, z)
                .putFloat(index + 3 * Float.BYTES, w);
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ", " + z + ", " + w + ")";
    }
    
    public void print() {
        print("", true);
    }

    public void print(String title) {
        print(title, true);
    }

    public void print(boolean outStream) {
        print("", outStream);
    }

    public void print(String title, boolean outStream) {
        String res = title + "\n(" + x + ", " + y + ", " + z + ", " + w + ")";
        if (outStream) {
            System.out.print(res);
        } else {
            System.err.print(res);
        }
    }
}
