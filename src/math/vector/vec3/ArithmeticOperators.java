/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package math.vector.vec3;

import math.Glm;

/**
 *
 * @author GBarbieri
 */
abstract class ArithmeticOperators {

    public static final int SIZE = 3 * Float.BYTES;

    public float x, y, z;

    public Vector3 add_(float b) {
        return Glm.add(new Vector3(), (Vector3) this, b, b, b);
    }

    public Vector3 add_(float bX, float bY, float bZ) {
        return Glm.add(new Vector3(), (Vector3) this, bX, bY, bZ);
    }

    public Vector3 add_(Vector3 b) {
        return Glm.add(new Vector3(), (Vector3) this, b.x, b.y, b.z);
    }

    public Vector3 add(float b) {
        return Glm.add((Vector3) this, (Vector3) this, b, b, b);
    }

    public Vector3 add(float bX, float bY, float bZ) {
        return Glm.add((Vector3) this, (Vector3) this, bX, bY, bZ);
    }

    public Vector3 add(Vector3 b) {
        return Glm.add((Vector3) this, (Vector3) this, b.x, b.y, b.z);
    }

    public Vector3 add(float b, Vector3 res) {
        return Glm.add(res, (Vector3) this, b, b, b);
    }

    public Vector3 add(float bX, float bY, float bZ, Vector3 res) {
        return Glm.add(res, (Vector3) this, bX, bY, bZ);
    }

    public Vector3 add(Vector3 b, Vector3 res) {
        return Glm.add(res, (Vector3) this, b.x, b.y, b.z);
    }

    public Vector3 sub_(float b) {
        return Glm.sub(new Vector3(), (Vector3) this, b, b, b);
    }

    public Vector3 sub_(float bX, float bY, float bZ) {
        return Glm.sub(new Vector3(), (Vector3) this, bX, bY, bZ);
    }

    public Vector3 sub_(Vector3 b) {
        return Glm.sub(new Vector3(), (Vector3) this, b.x, b.y, b.z);
    }

    public Vector3 sub(float b) {
        return Glm.sub((Vector3) this, (Vector3) this, b, b, b);
    }

    public Vector3 sub(float bX, float bY, float bZ) {
        return Glm.sub((Vector3) this, (Vector3) this, bX, bY, bZ);
    }

    public Vector3 sub(Vector3 b) {
        return Glm.sub((Vector3) this, (Vector3) this, b.x, b.y, b.z);
    }

    public Vector3 sub(float b, Vector3 res) {
        return Glm.sub(res, (Vector3) this, b, b, b);
    }

    public Vector3 sub(float bX, float bY, float bZ, Vector3 res) {
        return Glm.sub(res, (Vector3) this, bX, bY, bZ);
    }

    public Vector3 sub(Vector3 b, Vector3 res) {
        return Glm.sub(res, (Vector3) this, b.x, b.y, b.z);
    }

    public Vector3 mul_(float b) {
        return Glm.mul(new Vector3(), (Vector3) this, b, b, b);
    }

    public Vector3 mul_(float bX, float bY, float bZ) {
        return Glm.mul(new Vector3(), (Vector3) this, bX, bY, bZ);
    }

    public Vector3 mul_(Vector3 b) {
        return Glm.mul(new Vector3(), (Vector3) this, b.x, b.y, b.z);
    }

    public Vector3 mul(float b) {
        return Glm.mul((Vector3) this, (Vector3) this, b, b, b);
    }

    public Vector3 mul(float bX, float bY, float bZ) {
        return Glm.mul((Vector3) this, (Vector3) this, bX, bY, bZ);
    }

    public Vector3 mul(Vector3 b) {
        return Glm.mul((Vector3) this, (Vector3) this, b.x, b.y, b.z);
    }

    public Vector3 mul(float b, Vector3 res) {
        return Glm.mul(res, (Vector3) this, b, b, b);
    }

    public Vector3 mul(float bX, float bY, float bZ, Vector3 res) {
        return Glm.mul(res, (Vector3) this, bX, bY, bZ);
    }

    public Vector3 mul(Vector3 b, Vector3 res) {
        return Glm.mul(res, (Vector3) this, b.x, b.y, b.z);
    }

    public Vector3 div_(float b) {
        return Glm.div(new Vector3(), (Vector3) this, b, b, b);
    }

    public Vector3 div_(float bX, float bY, float bZ) {
        return Glm.div(new Vector3(), (Vector3) this, bX, bY, bZ);
    }

    public Vector3 div_(Vector3 b) {
        return Glm.div(new Vector3(), (Vector3) this, b.x, b.y, b.z);
    }

    public Vector3 div(float b) {
        return Glm.div((Vector3) this, (Vector3) this, b, b, b);
    }

    public Vector3 div(float bX, float bY, float bZ) {
        return Glm.div((Vector3) this, (Vector3) this, bX, bY, bZ);
    }

    public Vector3 div(Vector3 b) {
        return Glm.div((Vector3) this, (Vector3) this, b.x, b.y, b.z);
    }

    public Vector3 div(float b, Vector3 res) {
        return Glm.div(res, (Vector3) this, b, b, b);
    }

    public Vector3 div(float bX, float bY, float bZ, Vector3 res) {
        return Glm.div(res, (Vector3) this, bX, bY, bZ);
    }

    public Vector3 div(Vector3 b, Vector3 res) {
        return Glm.div(res, (Vector3) this, b.x, b.y, b.z);
    }

    public Vector3 incr_() {
        return Glm.incr_((Vector3) this);
    }

    public Vector3 incr() {
        return Glm.incr((Vector3) this);
    }

    public Vector3 incr(Vector3 res) {
        return Glm.incr(res, (Vector3) this);
    }

    public Vector3 decr_() {
        return Glm.decr_((Vector3) this);
    }

    public Vector3 decr() {
        return Glm.decr((Vector3) this);
    }

    public Vector3 decr(Vector3 res) {
        return Glm.decr(res, (Vector3) this);
    }
}
