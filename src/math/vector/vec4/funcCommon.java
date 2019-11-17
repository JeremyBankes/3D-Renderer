/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package math.vector.vec4;

import math.Glm;
import math.vector.vec4.b.Vec4b;
import math.vector.vec4.i.Vec4i;

/**
 *
 * @author GBarbieri
 */
abstract class funcCommon extends ArithmeticOperators {

    public Vector4 abs() {
        return abs((Vector4) this);
    }

    public Vector4 abs_() {
        return abs(new Vector4());
    }

    public Vector4 abs(Vector4 result) {
        return abs((Vector4) this, result);
    }

    public static Vector4 abs(Vector4 x, Vector4 result) {
        result.x = Math.abs(x.x);
        result.y = Math.abs(x.y);
        result.z = Math.abs(x.z);
        result.w = Math.abs(x.w);
        return result;
    }

    public Vector4 ceil() {
        return ceil((Vector4) this);
    }

    public Vector4 ceil_() {
        return ceil(new Vector4());
    }

    public Vector4 ceil(Vector4 result) {
        return ceil((Vector4) this, (Vector4) this);
    }

    public static Vector4 ceil(Vector4 x, Vector4 result) {
        result.x = (float) Math.ceil(x.x);
        result.y = (float) Math.ceil(x.y);
        result.z = (float) Math.ceil(x.z);
        result.w = (float) Math.ceil(x.w);
        return result;
    }

    public Vector4 clamp(float minVal, float maxVal) {
        return clamp(minVal, maxVal, (Vector4) this);
    }

    public Vector4 clamp_(float minVal, float maxVal) {
        return clamp(minVal, maxVal, new Vector4());
    }

    public Vector4 clamp(float minVal, float maxVal, Vector4 result) {
        return clamp((Vector4) this, minVal, maxVal, result);
    }

    public static Vector4 clamp(Vector4 x, float minVal, float maxVal, Vector4 result) {
        result.x = Math.min(Math.max(x.x, minVal), maxVal);
        result.y = Math.min(Math.max(x.y, minVal), maxVal);
        result.z = Math.min(Math.max(x.z, minVal), maxVal);
        result.w = Math.min(Math.max(x.w, minVal), maxVal);
        return result;
    }

    public Vector4 clamp(Vector4 minVal, Vector4 maxVal) {
        return clamp(minVal, maxVal, (Vector4) this);
    }

    public Vector4 clamp_(Vector4 minVal, Vector4 maxVal) {
        return clamp(minVal, maxVal, new Vector4());
    }

    public Vector4 clamp(Vector4 minVal, Vector4 maxVal, Vector4 result) {
        return clamp((Vector4) this, minVal, maxVal, result);
    }

    public static Vector4 clamp(Vector4 x, Vector4 minVal, Vector4 maxVal, Vector4 result) {
        result.x = Math.min(Math.max(x.x, minVal.x), maxVal.x);
        result.y = Math.min(Math.max(x.y, minVal.y), maxVal.y);
        result.z = Math.min(Math.max(x.z, minVal.z), maxVal.z);
        result.w = Math.min(Math.max(x.w, minVal.w), maxVal.w);
        return result;
    }

    public Vec4i floatToIntBits_() {
        return floatToIntBits((Vector4) this, new Vec4i());
    }

    public Vec4i floatToIntBits(Vec4i result) {
        return floatToIntBits((Vector4) this, result);
    }

    public static Vec4i floatToIntBits(Vector4 x, Vec4i result) {
        result.x = Float.floatToIntBits(x.x);
        result.y = Float.floatToIntBits(x.y);
        result.z = Float.floatToIntBits(x.z);
        result.w = Float.floatToIntBits(x.w);
        return result;
    }

    public Vector4 floor() {
        return floor((Vector4) this);
    }

    public Vector4 floor_() {
        return floor(new Vector4());
    }

    public Vector4 floor(Vector4 result) {
        return floor((Vector4) this, result);
    }

    public static Vector4 floor(Vector4 x, Vector4 result) {
        result.x = (float) Math.floor(x.x);
        result.y = (float) Math.floor(x.y);
        result.z = (float) Math.floor(x.z);
        result.w = (float) Math.floor(x.w);
        return result;
    }

    public Vector4 fma(Vector4 b, Vector4 c) {
        return fma(b, c, (Vector4) this);
    }

    public Vector4 fma_(Vector4 b, Vector4 c) {
        return fma(b, c, new Vector4());
    }

    public Vector4 fma(Vector4 b, Vector4 c, Vector4 result) {
        return fma((Vector4) this, b, c, result);
    }

    public static Vector4 fma(Vector4 a, Vector4 b, Vector4 c, Vector4 result) {
        result.x = a.x * b.x + c.x;
        result.y = a.y * b.y + c.y;
        result.z = a.z * b.z + c.z;
        result.w = a.w * b.w + c.w;
        return result;
    }

    public Vector4 fract() {
        return fract((Vector4) this);
    }

    public Vector4 fract_() {
        return fract(new Vector4());
    }

    public Vector4 fract(Vector4 result) {
        return fract((Vector4) this, result);
    }

    public static Vector4 fract(Vector4 x, Vector4 result) {
        result.x = (float) (x.x - Math.floor(x.x));
        result.y = (float) (x.y - Math.floor(x.y));
        result.z = (float) (x.z - Math.floor(x.z));
        result.w = (float) (x.w - Math.floor(x.w));
        return result;
    }

    public Vec4b isInf_() {
        return isInf((Vector4) this, new Vec4b());
    }

    public Vec4b isInf(Vec4b result) {
        return isInf((Vector4) this, result);
    }

    public static Vec4b isInf(Vector4 x, Vec4b result) {
        result.x = (byte) (Float.isInfinite(x.x) ? 1 : 0);
        result.y = (byte) (Float.isInfinite(x.y) ? 1 : 0);
        result.z = (byte) (Float.isInfinite(x.z) ? 1 : 0);
        result.w = (byte) (Float.isInfinite(x.w) ? 1 : 0);
        return result;
    }

    public Vec4b isNan() {
        return isNan((Vector4) this, new Vec4b());
    }

    public Vec4b isNan(Vec4b result) {
        return isNan((Vector4) this, result);
    }

    public static Vec4b isNan(Vector4 x, Vec4b result) {
        result.x = (byte) (Float.isNaN(x.x) ? 1 : 0);
        result.y = (byte) (Float.isNaN(x.y) ? 1 : 0);
        result.z = (byte) (Float.isNaN(x.z) ? 1 : 0);
        result.w = (byte) (Float.isNaN(x.z) ? 1 : 0);
        return result;
    }

    public Vector4 max(Vector4 y) {
        return max(y, (Vector4) this);
    }

    public Vector4 max_(Vector4 y) {
        return max((Vector4) this, y, new Vector4());
    }

    public Vector4 max(Vector4 y, Vector4 result) {
        return max((Vector4) this, y, result);
    }

    public static Vector4 max(Vector4 x, Vector4 y, Vector4 result) {
        result.x = Math.max(x.x, y.x);
        result.y = Math.max(x.y, y.y);
        result.z = Math.max(x.z, y.z);
        result.w = Math.max(x.z, y.z);
        return result;
    }

    public Vector4 min(Vector4 y) {
        return min(y, (Vector4) this);
    }

    public Vector4 min_(Vector4 y) {
        return min(y, new Vector4());
    }

    public Vector4 min(Vector4 y, Vector4 result) {
        return min((Vector4) this, y, result);
    }

    public static Vector4 min(Vector4 x, Vector4 y, Vector4 result) {
        result.x = Math.min(x.x, y.x);
        result.y = Math.min(x.y, y.y);
        result.z = Math.min(x.z, y.z);
        result.w = Math.min(x.w, y.w);
        return result;
    }

    public Vector4 mix(Vector4 y, boolean a) {
        return mix(y, a, (Vector4) this);
    }

    public Vector4 mix_(Vector4 y, boolean a) {
        return mix(y, a, new Vector4());
    }

    public Vector4 mix(Vector4 y, boolean a, Vector4 result) {
        return mix((Vector4) this, y, a, result);
    }

    public static Vector4 mix(Vector4 x, Vector4 y, boolean a, Vector4 result) {
        return mix(x, y, a, a, a, a, result);
    }

    public Vector4 mix(Vector4 y, Vec4b a) {
        return mix(y, a, (Vector4) this);
    }

    public Vector4 mix_(Vector4 y, Vec4b a) {
        return mix(y, a, new Vector4());
    }

    public Vector4 mix(Vector4 y, Vec4b a, Vector4 result) {
        return mix((Vector4) this, y, a, result);
    }

    public static Vector4 mix(Vector4 x, Vector4 y, Vec4b a, Vector4 result) {
        return mix(x, y, a.x, a.y, a.z, a.w, result);
    }

    public static Vector4 mix(Vector4 x, Vector4 y, boolean a0, boolean a1, boolean a2, boolean a3, Vector4 result) {
        result.x = a0 ? y.x : x.x;
        result.y = a1 ? y.y : x.y;
        result.z = a2 ? y.z : x.z;
        result.w = a3 ? y.w : x.w;
        return result;
    }

    public Vector4 mix(Vector4 y, float a) {
        return mix(y, a, (Vector4) this);
    }

    public Vector4 mix_(Vector4 y, float a) {
        return mix(y, a, new Vector4());
    }

    public Vector4 mix(Vector4 y, float a, Vector4 result) {
        return mix((Vector4) this, y, a, result);
    }

    public static Vector4 mix(Vector4 x, Vector4 y, float a, Vector4 result) {
        return mix(x, y, a, a, a, a, result);
    }

    public Vector4 mix(Vector4 y, Vector4 a) {
        return mix(y, a, (Vector4) this);
    }

    public Vector4 mix_(Vector4 y, Vector4 a) {
        return mix(y, a, new Vector4());
    }

    public Vector4 mix(Vector4 y, Vector4 a, Vector4 result) {
        return mix((Vector4) this, y, a, result);
    }

    public static Vector4 mix(Vector4 x, Vector4 y, Vector4 a, Vector4 result) {
        return mix(x, y, a.x, a.y, a.z, a.w, result);
    }

    public static Vector4 mix(Vector4 x, Vector4 y, float a0, float a1, float a2, float a3, Vector4 result) {
        result.x = x.x + a0 * (y.x - x.x);
        result.y = x.y + a1 * (y.y - x.y);
        result.z = x.z + a2 * (y.z - x.z);
        result.w = x.w + a3 * (y.w - x.w);
        return result;
    }

    public Vector4 mod(Vector4 y) {
        return mod(y, (Vector4) this);
    }

    public Vector4 mod_(Vector4 y) {
        return mod(y, new Vector4());
    }

    public Vector4 mod(Vector4 y, Vector4 result) {
        return mod((Vector4) this, y, result);
    }

    public static Vector4 mod(Vector4 x, Vector4 y, Vector4 result) {
        result.x = (float) (x.x - y.x * Glm.floor(x.x / y.x));
        result.y = (float) (x.y - y.y * Glm.floor(x.y / y.y));
        result.z = (float) (x.z - y.z * Glm.floor(x.z / y.z));
        result.w = (float) (x.w - y.w * Glm.floor(x.w / y.w));
        return result;
    }

    public Vec4i round_() {
        return round(new Vec4i());
    }

    public Vec4i round(Vec4i result) {
        return round((Vector4) this, result);
    }

    public static Vec4i round(Vector4 x, Vec4i result) {
        result.x = Math.round(x.x);
        result.y = Math.round(x.y);
        result.z = Math.round(x.z);
        result.w = Math.round(x.z);
        return result;
    }

    public Vector4 sign() {
        return sign((Vector4) this, (Vector4) this);
    }

    public Vector4 sign_() {
        return sign(new Vector4());
    }

    public Vector4 sign(Vector4 result) {
        return sign((Vector4) this, result);
    }

    public static Vector4 sign(Vector4 x, Vector4 result) {
        result.x = Math.signum(x.x);
        result.y = Math.signum(x.y);
        result.z = Math.signum(x.z);
        result.w = Math.signum(x.w);
        return result;
    }

    public Vector4 smoothStep(Vector4 edge0, Vector4 edge1) {
        return smoothStep(edge0, edge1, (Vector4) this);
    }

    public Vector4 smoothStep_(Vector4 edge0, Vector4 edge1) {
        return smoothStep(edge0, edge1, new Vector4());
    }

    public Vector4 smoothStep(Vector4 edge0, Vector4 edge1, Vector4 result) {
        return smoothStep(edge0, edge1, (Vector4) this, result);
    }

    public static Vector4 smoothStep(Vector4 edge0, Vector4 edge1, Vector4 x, Vector4 result) {
        // clamp
        float tmpX = Math.min(Math.max((x.x - edge0.x) / (edge1.x - edge0.x), 0), 1);
        float tmpY = Math.min(Math.max((x.y - edge0.y) / (edge1.y - edge0.y), 0), 1);
        float tmpZ = Math.min(Math.max((x.z - edge0.z) / (edge1.z - edge0.z), 0), 1);
        float tmpW = Math.min(Math.max((x.w - edge0.w) / (edge1.w - edge0.w), 0), 1);
        result.x = tmpX * tmpX * (3 - 2 * tmpX);
        result.y = tmpY * tmpY * (3 - 2 * tmpY);
        result.z = tmpZ * tmpZ * (3 - 2 * tmpZ);
        result.w = tmpW * tmpW * (3 - 2 * tmpW);
        return result;
    }

    public Vector4 step(Vector4 edge) {
        return step(edge, (Vector4) this);
    }

    public Vector4 step_(Vector4 edge) {
        return step(edge, new Vector4());
    }

    public Vector4 step(Vector4 edge, Vector4 result) {
        return step(edge, (Vector4) this, result);
    }

    public static Vector4 step(Vector4 edge, Vector4 x, Vector4 result) {
        result.x = x.x < edge.x ? 0f : 1f;
        result.y = x.y < edge.y ? 0f : 1f;
        result.z = x.z < edge.z ? 0f : 1f;
        result.w = x.w < edge.w ? 0f : 1f;
        return result;
    }

    public Vector4 toUnsignedFloat() {
        return toUnsignedFloat((Vector4) this);
    }

    public Vector4 toUnsignedFloat_() {
        return toUnsignedFloat(new Vector4());
    }

    public Vector4 toUnsignedFloat(Vector4 result) {
        return toUnsignedFloat((Vector4) this, result);
    }

    public static Vector4 toUnsignedFloat(Vector4 x, Vector4 result) {
        result.x = Float.intBitsToFloat((int) x.x);
        result.y = Float.intBitsToFloat((int) x.y);
        result.z = Float.intBitsToFloat((int) x.z);
        result.w = Float.intBitsToFloat((int) x.w);
        return result;
    }
}
