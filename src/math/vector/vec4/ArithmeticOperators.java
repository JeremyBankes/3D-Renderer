/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package math.vector.vec4;

import math.Glm;
import math.matrix.mat4.Matrix4;

/**
 *
 * @author GBarbieri
 */
abstract class ArithmeticOperators {

    public static final int SIZE = 4 * Float.BYTES;

    public float x, y, z, w;

    public Vector4 add_(float b) {
        return Glm.add(new Vector4(), (Vector4) this, b, b, b, b);
    }

    public Vector4 add_(float bX, float bY, float bZ, float bW) {
        return Glm.add(new Vector4(), (Vector4) this, bX, bY, bZ, bW);
    }

    public Vector4 add_(Vector4 b) {
        return Glm.add(new Vector4(), (Vector4) this, b.x, b.y, b.z, b.w);
    }

    public Vector4 add(float b) {
        return Glm.add((Vector4) this, (Vector4) this, b, b, b, b);
    }

    public Vector4 add(float bX, float bY, float bZ, float bW) {
        return Glm.add((Vector4) this, (Vector4) this, bX, bY, bZ, bW);
    }

    public Vector4 add(Vector4 b) {
        return Glm.add((Vector4) this, (Vector4) this, b.x, b.y, b.z, b.w);
    }

    public Vector4 add(float b, Vector4 res) {
        return Glm.add(res, (Vector4) this, b, b, b, b);
    }

    public Vector4 add(float bX, float bY, float bZ, float bW, Vector4 res) {
        return Glm.add(res, (Vector4) this, bX, bY, bZ, bW);
    }

    public Vector4 add(Vector4 b, Vector4 res) {
        return Glm.add(res, (Vector4) this, b.x, b.y, b.z, b.w);
    }

    public Vector4 sub_(float b) {
        return Glm.sub(new Vector4(), (Vector4) this, b, b, b, b);
    }

    public Vector4 sub_(float bX, float bY, float bZ, float bW) {
        return Glm.sub(new Vector4(), (Vector4) this, bX, bY, bZ, bW);
    }

    public Vector4 sub_(Vector4 b) {
        return Glm.sub(new Vector4(), (Vector4) this, b.x, b.y, b.z, b.w);
    }

    public Vector4 sub(float b) {
        return Glm.sub((Vector4) this, (Vector4) this, b, b, b, b);
    }

    public Vector4 sub(float bX, float bY, float bZ, float bW) {
        return Glm.sub((Vector4) this, (Vector4) this, bX, bY, bZ, bW);
    }

    public Vector4 sub(Vector4 b) {
        return Glm.sub((Vector4) this, (Vector4) this, b.x, b.y, b.z, b.w);
    }

    public Vector4 sub(float b, Vector4 res) {
        return Glm.sub(res, (Vector4) this, b, b, b, b);
    }

    public Vector4 sub(float bX, float bY, float bZ, float bW, Vector4 res) {
        return Glm.sub(res, (Vector4) this, bX, bY, bZ, bW);
    }

    public Vector4 sub(Vector4 b, Vector4 res) {
        return Glm.sub(res, (Vector4) this, b.x, b.y, b.z, b.w);
    }

    public Vector4 mul_(float b) {
        return Glm.mul(new Vector4(), (Vector4) this, b, b, b, b);
    }

    public Vector4 mul_(float bX, float bY, float bZ, float bW) {
        return Glm.mul(new Vector4(), (Vector4) this, bX, bY, bZ, bW);
    }

    public Vector4 mul_(Vector4 b) {
        return Glm.mul(new Vector4(), (Vector4) this, b.x, b.y, b.z, b.w);
    }

    public Vector4 mul(float b) {
        return Glm.mul((Vector4) this, (Vector4) this, b, b, b, b);
    }

    public Vector4 mul(float bX, float bY, float bZ, float bW) {
        return Glm.mul((Vector4) this, (Vector4) this, bX, bY, bZ, bW);
    }

    public Vector4 mul(Vector4 b) {
        return Glm.mul((Vector4) this, (Vector4) this, b.x, b.y, b.z, b.w);
    }

    public Vector4 mul(float b, Vector4 res) {
        return Glm.mul(res, (Vector4) this, b, b, b, b);
    }

    public Vector4 mul(float bX, float bY, float bZ, float bW, Vector4 res) {
        return Glm.mul(res, (Vector4) this, bX, bY, bZ, bW);
    }

    public Vector4 mul(Vector4 b, Vector4 res) {
        return Glm.mul(res, (Vector4) this, b.x, b.y, b.z, b.w);
    }

    public Vector4 mul(Matrix4 mat) {
        return mul(mat, (Vector4) this);
    }

    public Vector4 mul_(Matrix4 mat) {
        return mul(mat, new Vector4());
    }

    public Vector4 mul(Matrix4 mat, Vector4 res) {
        res.set(mat.m00 * x + mat.m10 * y + mat.m20 * z + mat.m30 * w,
                mat.m01 * x + mat.m11 * y + mat.m21 * z + mat.m31 * w,
                mat.m02 * x + mat.m12 * y + mat.m22 * z + mat.m32 * w,
                mat.m03 * x + mat.m13 * y + mat.m23 * z + mat.m33 * w);
        return res;
    }

    public Vector4 div_(float b) {
        return Glm.div(new Vector4(), (Vector4) this, b, b, b, b);
    }

    public Vector4 div_(float bX, float bY, float bZ, float bW) {
        return Glm.div(new Vector4(), (Vector4) this, bX, bY, bZ, bW);
    }

    public Vector4 div_(Vector4 b) {
        return Glm.div(new Vector4(), (Vector4) this, b.x, b.y, b.z, b.w);
    }

    public Vector4 div(float b) {
        return Glm.div((Vector4) this, (Vector4) this, b, b, b, b);
    }

    public Vector4 div(float bX, float bY, float bZ, float bW) {
        return Glm.div((Vector4) this, (Vector4) this, bX, bY, bZ, bW);
    }

    public Vector4 div(Vector4 b) {
        return Glm.div((Vector4) this, (Vector4) this, b.x, b.y, b.z, b.w);
    }

    public Vector4 div(float b, Vector4 res) {
        return Glm.div(res, (Vector4) this, b, b, b, b);
    }

    public Vector4 div(float bX, float bY, float bZ, float bW, Vector4 res) {
        return Glm.div(res, (Vector4) this, bX, bY, bZ, bW);
    }

    public Vector4 div(Vector4 b, Vector4 res) {
        return Glm.div(res, (Vector4) this, b.x, b.y, b.z, b.w);
    }

    public Vector4 incr_() {
        return Glm.incr_((Vector4) this);
    }

    public Vector4 incr() {
        return Glm.incr((Vector4) this);
    }

    public Vector4 incr(Vector4 res) {
        return Glm.incr(res, (Vector4) this);
    }

    public Vector4 decr_() {
        return Glm.decr_((Vector4) this);
    }

    public Vector4 decr() {
        return Glm.decr((Vector4) this);
    }

    public Vector4 decr(Vector4 res) {
        return Glm.decr(res, (Vector4) this);
    }
}
