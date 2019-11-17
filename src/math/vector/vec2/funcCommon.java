/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package math.vector.vec2;

import math.Glm;
import math.vector.vec2.bool.Vec2bool;
import math.vector.vec2.i.Vec2i;

/**
 * TODO ldexp, frexp, modf, roundEven, trunc
 *
 * @author GBarbieri
 */
abstract class funcCommon extends BooleanOperators {

    public Vector2 abs() {
        return abs((Vector2) this);
    }

    public Vector2 abs_() {
        return abs(new Vector2());
    }

    public Vector2 abs(Vector2 result) {
        return abs((Vector2) this, result);
    }

    public static Vector2 abs(Vector2 x, Vector2 result) {
        result.x = Math.abs(x.x);
        result.y = Math.abs(x.y);
        return result;
    }

    public Vector2 ceil() {
        return ceil((Vector2) this);
    }

    public Vector2 ceil_() {
        return ceil(new Vector2());
    }

    public Vector2 ceil(Vector2 result) {
        return ceil((Vector2) this, (Vector2) this);
    }

    public static Vector2 ceil(Vector2 x, Vector2 result) {
        result.x = (float) Math.ceil(x.x);
        result.y = (float) Math.ceil(x.y);
        return result;
    }

    public Vector2 clamp(float minVal, float maxVal) {
        return clamp(minVal, maxVal, (Vector2) this);
    }

    public Vector2 clamp_(float minVal, float maxVal) {
        return clamp(minVal, maxVal, new Vector2());
    }

    public Vector2 clamp(float minVal, float maxVal, Vector2 result) {
        return clamp((Vector2) this, minVal, maxVal, result);
    }

    public static Vector2 clamp(Vector2 x, float minVal, float maxVal, Vector2 result) {
        result.x = Math.min(Math.max(x.x, minVal), maxVal);
        result.y = Math.min(Math.max(x.y, minVal), maxVal);
        return result;
    }

    public Vector2 clamp(Vector2 minVal, Vector2 maxVal) {
        return clamp(minVal, maxVal, (Vector2) this);
    }

    public Vector2 clamp_(Vector2 minVal, Vector2 maxVal) {
        return clamp(minVal, maxVal, new Vector2());
    }

    public Vector2 clamp(Vector2 minVal, Vector2 maxVal, Vector2 result) {
        return clamp((Vector2) this, minVal, maxVal, result);
    }

    public static Vector2 clamp(Vector2 x, Vector2 minVal, Vector2 maxVal, Vector2 result) {
        result.x = Math.min(Math.max(x.x, minVal.x), maxVal.x);
        result.y = Math.min(Math.max(x.y, minVal.y), maxVal.y);
        return result;
    }

    public Vec2i floatToIntBits_() {
        return floatToIntBits((Vector2) this, new Vec2i());
    }

    public Vec2i floatToIntBits(Vec2i result) {
        return floatToIntBits((Vector2) this, result);
    }

    public static Vec2i floatToIntBits(Vector2 x, Vec2i result) {
        result.x = Float.floatToIntBits(x.x);
        result.y = Float.floatToIntBits(x.y);
        return result;
    }

    public Vector2 floor() {
        return floor((Vector2) this);
    }

    public Vector2 floor_() {
        return floor(new Vector2());
    }

    public Vector2 floor(Vector2 result) {
        return floor((Vector2) this, result);
    }

    public static Vector2 floor(Vector2 x, Vector2 result) {
        result.x = (float) Math.floor(x.x);
        result.y = (float) Math.floor(x.y);
        return result;
    }

    public Vector2 fma(Vector2 b, Vector2 c) {
        return fma(b, c, (Vector2) this);
    }

    public Vector2 fma_(Vector2 b, Vector2 c) {
        return fma(b, c, new Vector2());
    }

    public Vector2 fma(Vector2 b, Vector2 c, Vector2 result) {
        return fma((Vector2) this, b, c, result);
    }

    public static Vector2 fma(Vector2 a, Vector2 b, Vector2 c, Vector2 result) {
        result.x = a.x * b.x + c.x;
        result.y = a.y * b.y + c.y;
        return result;
    }

    public Vector2 fract() {
        return fract((Vector2) this);
    }

    public Vector2 fract_() {
        return fract(new Vector2());
    }

    public Vector2 fract(Vector2 result) {
        return fract((Vector2) this, result);
    }

    public static Vector2 fract(Vector2 x, Vector2 result) {
        result.x = (float) (x.x - Math.floor(x.x));
        result.y = (float) (x.y - Math.floor(x.y));
        return result;
    }

    public Vec2bool isInf_() {
        return isInf((Vector2) this, new Vec2bool());
    }

    public Vec2bool isInf(Vec2bool result) {
        return isInf((Vector2) this, result);
    }

    public static Vec2bool isInf(Vector2 x, Vec2bool result) {
        result.x = Float.isInfinite(x.x);
        result.y = Float.isInfinite(x.y);
        return result;
    }

    public Vec2bool isNan() {
        return isNan((Vector2) this, new Vec2bool());
    }

    public Vec2bool isNan(Vec2bool result) {
        return isNan((Vector2) this, result);
    }

    public static Vec2bool isNan(Vector2 x, Vec2bool result) {
        result.x = Float.isNaN(x.x);
        result.y = Float.isNaN(x.y);
        return result;
    }

    public Vector2 max(Vector2 y) {
        return max(y, (Vector2) this);
    }

    public Vector2 max_(Vector2 y) {
        return max((Vector2) this, y, new Vector2());
    }

    public Vector2 max(Vector2 y, Vector2 result) {
        return max((Vector2) this, y, result);
    }

    public static Vector2 max(Vector2 x, Vector2 y, Vector2 result) {
        result.x = Math.max(x.x, y.x);
        result.y = Math.max(x.y, y.y);
        return result;
    }

    public Vector2 min(Vector2 y) {
        return min(y, (Vector2) this);
    }

    public Vector2 min_(Vector2 y) {
        return min(y, new Vector2());
    }

    public Vector2 min(Vector2 y, Vector2 result) {
        return min((Vector2) this, y, result);
    }

    public static Vector2 min(Vector2 x, Vector2 y, Vector2 result) {
        result.x = Math.min(x.x, y.x);
        result.y = Math.min(x.y, y.y);
        return result;
    }

    public Vector2 mix(Vector2 y, boolean a) {
        return mix(y, a, (Vector2) this);
    }

    public Vector2 mix_(Vector2 y, boolean a) {
        return mix(y, a, new Vector2());
    }

    public Vector2 mix(Vector2 y, boolean a, Vector2 result) {
        return mix((Vector2) this, y, a, result);
    }

    public static Vector2 mix(Vector2 x, Vector2 y, boolean a, Vector2 result) {
        result.x = a ? y.x : x.x;
        result.y = a ? y.y : x.y;
        return result;
    }

    public Vector2 mix(Vector2 y, Vec2bool a) {
        return mix(y, a, (Vector2) this);
    }

    public Vector2 mix_(Vector2 y, Vec2bool a) {
        return mix(y, a, new Vector2());
    }

    public Vector2 mix(Vector2 y, Vec2bool a, Vector2 result) {
        return mix((Vector2) this, y, a, result);
    }

    public static Vector2 mix(Vector2 x, Vector2 y, Vec2bool a, Vector2 result) {
        result.x = a.x ? y.x : x.x;
        result.y = a.y ? y.y : x.y;
        return result;
    }

    public Vector2 mix(Vector2 y, float a) {
        return mix(y, a, (Vector2) this);
    }

    public Vector2 mix_(Vector2 y, float a) {
        return mix(y, a, new Vector2());
    }

    public Vector2 mix(Vector2 y, float a, Vector2 result) {
        return mix((Vector2) this, y, a, result);
    }

    public static Vector2 mix(Vector2 x, Vector2 y, float a, Vector2 result) {
        result.x = x.x + a * (y.x - x.x);
        result.y = x.y + a * (y.y - x.y);
        return result;
    }

    public Vector2 mix(Vector2 y, Vector2 a) {
        return mix(y, a, (Vector2) this);
    }

    public Vector2 mix_(Vector2 y, Vector2 a) {
        return mix(y, a, new Vector2());
    }

    public Vector2 mix(Vector2 y, Vector2 a, Vector2 result) {
        return mix((Vector2) this, y, a, result);
    }

    public static Vector2 mix(Vector2 x, Vector2 y, Vector2 a, Vector2 result) {
        result.x = x.x + a.x * (y.x - x.x);
        result.y = x.y + a.y * (y.y - x.y);
        return result;
    }

    public Vector2 mod(Vector2 y) {
        return mod(y, (Vector2) this);
    }

    public Vector2 mod_(Vector2 y) {
        return mod(y, new Vector2());
    }

    public Vector2 mod(Vector2 y, Vector2 result) {
        return mod((Vector2) this, y, result);
    }

    // TODO check floor return type
    public static Vector2 mod(Vector2 x, Vector2 y, Vector2 result) {
        result.x = (float) (x.x - y.x * Glm.floor(x.x / y.x));
        result.y = (float) (x.y - y.y * Glm.floor(x.y / y.y));
        return result;
    }

    public Vec2i round_() {
        return round(new Vec2i());
    }

    public Vec2i round(Vec2i result) {
        return round((Vector2) this, result);
    }

    public static Vec2i round(Vector2 x, Vec2i result) {
        result.x = Math.round(x.x);
        result.y = Math.round(x.y);
        return result;
    }

    public Vector2 sign() {
        return sign((Vector2) this, (Vector2) this);
    }

    public Vector2 sign_() {
        return sign(new Vector2());
    }

    public Vector2 sign(Vector2 result) {
        return sign((Vector2) this, result);
    }

    public static Vector2 sign(Vector2 x, Vector2 result) {
        result.x = Math.signum(x.x);
        result.y = Math.signum(x.y);
        return result;
    }

    public Vector2 smoothStep(Vector2 edge0, Vector2 edge1) {
        return smoothStep(edge0, edge1, (Vector2) this);
    }

    public Vector2 smoothStep_(Vector2 edge0, Vector2 edge1) {
        return smoothStep(edge0, edge1, new Vector2());
    }

    public Vector2 smoothStep(Vector2 edge0, Vector2 edge1, Vector2 result) {
        return smoothStep(edge0, edge1, (Vector2) this, result);
    }

    public static Vector2 smoothStep(Vector2 edge0, Vector2 edge1, Vector2 x, Vector2 result) {
        // clamp
        float tmpX = Math.min(Math.max((x.x - edge0.x) / (edge1.x - edge0.x), 0), 1);
        float tmpY = Math.min(Math.max((x.y - edge0.y) / (edge1.y - edge0.y), 0), 1);
        result.x = tmpX * tmpX * (3 - 2 * tmpX);
        result.y = tmpY * tmpY * (3 - 2 * tmpY);
        return result;
    }

    public Vector2 step(Vector2 edge) {
        return step(edge, (Vector2) this);
    }

    public Vector2 step_(Vector2 edge) {
        return step(edge, new Vector2());
    }

    public Vector2 step(Vector2 edge, Vector2 result) {
        return step(edge, (Vector2) this, result);
    }

    public static Vector2 step(Vector2 edge, Vector2 x, Vector2 result) {
        result.x = x.x < edge.x ? 0f : 1f;
        result.y = x.y < edge.y ? 0f : 1f;
        return result;
    }

    public Vector2 toUnsignedFloat() {
        return toUnsignedFloat((Vector2) this);
    }

    public Vector2 toUnsignedFloat_() {
        return toUnsignedFloat(new Vector2());
    }

    public Vector2 toUnsignedFloat(Vector2 result) {
        return toUnsignedFloat((Vector2) this, result);
    }

    public static Vector2 toUnsignedFloat(Vector2 x, Vector2 result) {
        result.x = Float.intBitsToFloat((int) x.x);
        result.y = Float.intBitsToFloat((int) x.y);
        return result;
    }
}
