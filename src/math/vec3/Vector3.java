/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package math.vector.vec3;

import java.io.PrintStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

import math.Glm;
import math.vector.vec4.Vector4;

/**
 *
 * @author GBarbieri
 */
public class Vector3 extends funcRelational {

    public Vector3() {
        x = 0f;
        y = 0f;
        z = 0f;
    }

    public Vector3(Vector3 v) {
        x = v.x;
        y = v.y;
        z = v.z;
    }

    public Vector3(Vector4 v) {
        x = v.x;
        y = v.y;
        z = v.z;
    }

    public Vector3(float f) {
        x = f;
        y = f;
        z = f;
    }

    public Vector3(float x, float y, float z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Vector3(float[] fa) {
        this(fa, 0);
    }

    public Vector3(float[] fa, int i) {
        x = fa[i + 0];
        y = fa[i + 1];
        z = fa[i + 2];
    }

    public Vector3(double x, double y, double z) {
        this.x = (float) x;
        this.y = (float) y;
        this.z = (float) z;
    }

    public Vector3 set(Vector3 v) {
        return set(v.x, v.y, v.z);
    }

    public Vector3 set(float f) {
        x = f;
        y = f;
        z = f;
        return this;
    }

    public Vector3 set(double x, double y, double z) {
        return set((float) x, (float) y, (float) z);
    }

    public Vector3 set(float x, float y, float z) {
        this.x = x;
        this.y = y;
        this.z = z;
        return this;
    }

    public Vector3 set(float[] fa) {
        x = fa[0];
        y = fa[1];
        z = fa[2];
        return this;
    }

    public static Vector3 linearRand_(Vector3 min, Vector3 max) {
        return linearRand(min, max, new Vector3());
    }

    public static Vector3 linearRand(Vector3 min, Vector3 max, Vector3 res) {
        res.x = (float) Glm.linearRand(min.x, max.x);
        res.y = (float) Glm.linearRand(min.y, max.y);
        res.z = (float) Glm.linearRand(min.z, max.z);
        return res;
    }

    public Vector3 negate() {
        return negate(this);
    }

    public Vector3 negate_() {
        return negate(new Vector3());
    }

    public Vector3 negate(Vector3 res) {
        res.x = -x;
        res.y = -y;
        res.z = -z;
        return res;
    }

    public float length() {
        return (float) Math.sqrt(x * x + y * y + z * z);
    }

    public Vector4 toVec4_() {
        return toVec4(new Vector4());
    }

    public Vector4 toVec4(Vector4 res) {
        return res.set(x, y, z, 1.0f);
    }

    public float[] toFa_() {
        return toFa(new float[3]);
    }

    public float[] toFa(float[] fa) {
        fa[0] = x;
        fa[1] = y;
        fa[2] = z;
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
                .put(index + 2, z);
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
                .putFloat(index + 2 * Float.BYTES, z);
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ", " + z + ")";
    }

    public void print() {
        print("", System.out);
    }

    public void print(String title) {
        print(title, System.out);
    }

    public void print(String title, PrintStream printStream) {
        printStream.println(title + "\n(" + x + ", " + y + ", " + z + ")");
    }
}
