/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package math.vector.vec2;

import math.Glm;

/**
 *
 * @author elect
 */
abstract class funcExponential extends funcCommon {

    public Vector2 exp() {
        return exp((Vector2) this, (Vector2) this);
    }

    public Vector2 exp_() {
        return exp((Vector2) this);
    }

    public Vector2 exp(Vector2 result) {
        return exp((Vector2) this, result);
    }

    public static Vector2 exp(Vector2 x, Vector2 result) {
        result.x = (float) Math.exp(x.x);
        result.y = (float) Math.exp(x.y);
        return result;
    }

    public Vector2 exp2() {
        return exp2((Vector2) this, (Vector2) this);
    }

    public Vector2 exp2_() {
        return exp2((Vector2) this);
    }

    public Vector2 exp2(Vector2 result) {
        return exp2((Vector2) this, result);
    }

    public static Vector2 exp2(Vector2 x, Vector2 result) {
        result.x = (float) Math.pow(2, x.x);
        result.y = (float) Math.pow(2, x.y);
        return result;
    }

    public Vector2 inverseSqrt() {
        return inverseSqrt((Vector2) this);
    }

    public Vector2 inverseSqrt_() {
        return inverseSqrt(new Vector2());
    }

    public Vector2 inverseSqrt(Vector2 result) {
        return inverseSqrt((Vector2) this, result);
    }

    public static Vector2 inverseSqrt(Vector2 x, Vector2 result) {
        result.x = Glm.inverseSqrt(x.x);
        result.y = Glm.inverseSqrt(x.y);
        return result;
    }

    public Vector2 log() {
        return log((Vector2) this);
    }

    public Vector2 log_() {
        return log(new Vector2());
    }

    public Vector2 log(Vector2 result) {
        return log((Vector2) this, result);
    }

    public static Vector2 log(Vector2 x, Vector2 result) {
        result.x = (float) Math.log(x.x);
        result.y = (float) Math.log(x.y);
        return result;
    }

    public Vector2 log2() {
        return log2((Vector2) this);
    }

    public Vector2 log2_() {
        return log2(new Vector2());
    }

    public Vector2 log2(Vector2 result) {
        return log2((Vector2) this, result);
    }

    public static Vector2 log2(Vector2 x, Vector2 result) {
        result.x = (float) (Math.log(x.x) / Math.log(2));
        result.y = (float) (Math.log(x.y) / Math.log(2));
        return result;
    }

    public Vector2 pow(Vector2 y) {
        return pow(y, (Vector2) this);
    }

    public Vector2 pow_(Vector2 y) {
        return pow(y, new Vector2());
    }

    public Vector2 pow(Vector2 y, Vector2 result) {
        return pow((Vector2) this, y, result);
    }

    public static Vector2 pow(Vector2 x, Vector2 y, Vector2 result) {
        result.x = (float) Math.pow(x.x, y.x);
        result.y = (float) Math.pow(x.y, y.y);
        return result;
    }

    public Vector2 sqrt() {
        return sqrt((Vector2) this);
    }

    public Vector2 sqrt_() {
        return sqrt(new Vector2());
    }

    public Vector2 sqrt(Vector2 result) {
        return sqrt((Vector2) this, result);
    }

    public static Vector2 sqrt(Vector2 x, Vector2 result) {
        result.x = (float) Math.sqrt(x.x);
        result.y = (float) Math.sqrt(x.y);
        return result;
    }

}
