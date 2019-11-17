/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package math.vector.vec2;

import math.Glm;

/**
 *
 * @author GBarbieri
 */
abstract class BasicOperators {

    public static final int SIZE = 2 * Float.BYTES;

    public float x, y;

    public Vector2 add_(float b) {
        return Glm.add(new Vector2(), (Vector2) this, b, b);
    }

    public Vector2 add_(float bX, float bY) {
        return Glm.add(new Vector2(), (Vector2) this, bX, bY);
    }

    public Vector2 add_(Vector2 b) {
        return Glm.add(new Vector2(), (Vector2) this, b.x, b.y);
    }

    public Vector2 add(float b) {
        return Glm.add((Vector2) this, (Vector2) this, b, b);
    }

    public Vector2 add(float bX, float bY) {
        return Glm.add((Vector2) this, (Vector2) this, bX, bY);
    }

    public Vector2 add(Vector2 b) {
        return Glm.add((Vector2) this, (Vector2) this, b.x, b.y);
    }

    public Vector2 add(float b, Vector2 res) {
        return Glm.add(res, (Vector2) this, b, b);
    }

    public Vector2 add(float bX, float bY, Vector2 res) {
        return Glm.add(res, (Vector2) this, bX, bY);
    }

    public Vector2 add(Vector2 b, Vector2 res) {
        return Glm.add(res, (Vector2) this, b.x, b.y);
    }

    public Vector2 sub_(float b) {
        return Glm.sub(new Vector2(), (Vector2) this, b, b);
    }

    public Vector2 sub_(float bX, float bY) {
        return Glm.sub(new Vector2(), (Vector2) this, bX, bY);
    }

    public Vector2 sub_(Vector2 b) {
        return Glm.sub(new Vector2(), (Vector2) this, b.x, b.y);
    }

    public Vector2 sub(float b) {
        return Glm.sub((Vector2) this, (Vector2) this, b, b);
    }

    public Vector2 sub(float bX, float bY) {
        return Glm.sub((Vector2) this, (Vector2) this, bX, bY);
    }

    public Vector2 sub(Vector2 b) {
        return Glm.sub((Vector2) this, (Vector2) this, b.x, b.y);
    }

    public Vector2 sub(float b, Vector2 res) {
        return Glm.sub(res, (Vector2) this, b, b);
    }

    public Vector2 sub(float bX, float bY, Vector2 res) {
        return Glm.sub(res, (Vector2) this, bX, bY);
    }

    public Vector2 sub(Vector2 b, Vector2 res) {
        return Glm.sub(res, (Vector2) this, b.x, b.y);
    }

    public Vector2 mul_(float b) {
        return Glm.mul(new Vector2(), (Vector2) this, b, b);
    }

    public Vector2 mul_(float bX, float bY) {
        return Glm.mul(new Vector2(), (Vector2) this, bX, bY);
    }

    public Vector2 mul_(Vector2 b) {
        return Glm.mul(new Vector2(), (Vector2) this, b.x, b.y);
    }

    public Vector2 mul(float b) {
        return Glm.mul((Vector2) this, (Vector2) this, b, b);
    }

    public Vector2 mul(float bX, float bY) {
        return Glm.mul((Vector2) this, (Vector2) this, bX, bY);
    }

    public Vector2 mul(Vector2 b) {
        return Glm.mul((Vector2) this, (Vector2) this, b.x, b.y);
    }

    public Vector2 mul(float b, Vector2 res) {
        return Glm.mul(res, (Vector2) this, b, b);
    }

    public Vector2 mul(float bX, float bY, Vector2 res) {
        return Glm.mul(res, (Vector2) this, bX, bY);
    }

    public Vector2 mul(Vector2 b, Vector2 res) {
        return Glm.mul(res, (Vector2) this, b.x, b.y);
    }

    public Vector2 div_(float b) {
        return Glm.div(new Vector2(), (Vector2) this, b, b);
    }

    public Vector2 div_(float bX, float bY) {
        return Glm.div(new Vector2(), (Vector2) this, bX, bY);
    }

    public Vector2 div_(Vector2 b) {
        return Glm.div(new Vector2(), (Vector2) this, b.x, b.y);
    }

    public Vector2 div(float b) {
        return Glm.div((Vector2) this, (Vector2) this, b, b);
    }

    public Vector2 div(float bX, float bY) {
        return Glm.div((Vector2) this, (Vector2) this, bX, bY);
    }

    public Vector2 div(Vector2 b) {
        return Glm.div((Vector2) this, (Vector2) this, b.x, b.y);
    }

    public Vector2 div(float b, Vector2 res) {
        return Glm.div(res, (Vector2) this, b, b);
    }

    public Vector2 div(float bX, float bY, Vector2 res) {
        return Glm.div(res, (Vector2) this, bX, bY);
    }

    public Vector2 div(Vector2 b, Vector2 res) {
        return Glm.div(res, (Vector2) this, b.x, b.y);
    }

    public Vector2 incr_() {
        return Glm.incr_((Vector2) this);
    }

    public Vector2 incr() {
        return Glm.incr((Vector2) this);
    }

    public Vector2 incr(Vector2 res) {
        return Glm.incr(res, (Vector2) this);
    }

    public Vector2 decr_() {
        return Glm.decr_((Vector2) this);
    }

    public Vector2 decr() {
        return Glm.decr((Vector2) this);
    }

    public Vector2 decr(Vector2 res) {
        return Glm.decr(res, (Vector2) this);
    }
}
