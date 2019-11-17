/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package math;

import math.vector.vec2.Vector2;
import math.vector.vec2.b.Vec2b;
import math.vector.vec2.bool.Vec2bool;
import math.vector.vec2.d.Vec2d;
import math.vector.vec2.i.Vec2i;
import math.vector.vec2.l.Vec2l;
import math.vector.vec2.s.Vec2s;
import math.vector.vec2.ub.Vec2ub;
import math.vector.vec2.ui.Vec2ui;
import math.vector.vec2.ul.Vec2ul;
import math.vector.vec2.us.Vec2us;
import math.vector.vec3.Vector3;
import math.vector.vec3.b.Vec3b;
import math.vector.vec3.bool.Vec3bool;
import math.vector.vec3.d.Vec3d;
import math.vector.vec3.i.Vec3i;
import math.vector.vec3.l.Vec3l;
import math.vector.vec3.s.Vec3s;
import math.vector.vec3.ub.Vec3ub;
import math.vector.vec3.ui.Vec3ui;
import math.vector.vec3.ul.Vec3ul;
import math.vector.vec3.us.Vec3us;
import math.vector.vec4.Vector4;
import math.vector.vec4.b.Vec4b;
import math.vector.vec4.bool.Vec4bool;
import math.vector.vec4.d.Vec4d;
import math.vector.vec4.i.Vec4i;
import math.vector.vec4.l.Vec4l;
import math.vector.vec4.s.Vec4s;
import math.vector.vec4.ub.Vec4ub;
import math.vector.vec4.ui.Vec4ui;
import math.vector.vec4.ul.Vec4ul;
import math.vector.vec4.us.Vec4us;
import unsigned.UByte;
import unsigned.UInt;
import unsigned.ULong;
import unsigned.UShort;

/**
 * TODO frexp, ldexp, modf,
 *
 * @author elect
 */
abstract class FuncCommon extends FuncRelational {

    public static int MAX_ULPS = 2;

    // abs ----------------------------------------------------------------------------------------------------------
    public static float abs(float s) {
        return Math.abs(s);
    }

    public static double abs(double s) {
        return Math.abs(s);
    }

    public static int abs(int s) {
        return Math.abs(s);
    }

    public static Vector2 abs_(Vector2 v) {
        return abs(v, new Vector2());
    }

    public static Vector2 abs(Vector2 v, Vector2 res) {
        return res.set(abs(v.x), abs(v.y));
    }

    public static Vec2d abs_(Vec2d v) {
        return abs(v, new Vec2d());
    }

    public static Vec2d abs(Vec2d v, Vec2d res) {
        return res.set(abs(v.x), abs(v.y));
    }

    public static Vec2i abs_(Vec2i v) {
        return abs(v, new Vec2i());
    }

    public static Vec2i abs(Vec2i v, Vec2i res) {
        return res.set(abs(v.x), abs(v.y));
    }

    public static Vector3 abs_(Vector3 v) {
        return abs(v, new Vector3());
    }

    public static Vector3 abs(Vector3 v, Vector3 res) {
        return res.set(abs(v.x), abs(v.y), abs(v.z));
    }

    public static Vec3d abs_(Vec3d v) {
        return abs(v, new Vec3d());
    }

    public static Vec3d abs(Vec3d v, Vec3d res) {
        return res.set(abs(v.x), abs(v.y), abs(v.z));
    }

    public static Vec3i abs_(Vec3i v) {
        return abs(v, new Vec3i());
    }

    public static Vec3i abs(Vec3i v, Vec3i res) {
        return res.set(abs(v.x), abs(v.y), abs(v.z));
    }

    public static Vector4 abs_(Vector4 v) {
        return abs(v, new Vector4());
    }

    public static Vector4 abs(Vector4 v, Vector4 res) {
        return res.set(abs(v.x), abs(v.y), abs(v.z), abs(v.w));
    }

    public static Vec4d abs_(Vec4d v) {
        return abs(v, new Vec4d());
    }

    public static Vec4d abs(Vec4d v, Vec4d res) {
        return res.set(abs(v.x), abs(v.y), abs(v.z), abs(v.w));
    }

    public static Vec4i abs_(Vec4i v) {
        return abs(v, new Vec4i());
    }

    public static Vec4i abs(Vec4i v, Vec4i res) {
        return res.set(abs(v.x), abs(v.y), abs(v.z), abs(v.w));
    }

    // ceil ---------------------------------------------------------------------------------------------------------
    public static float ceil(float s) {
        return (float) Math.ceil(s);
    }

    public static double ceil(double s) {
        return Math.ceil(s);
    }

    public static Vector2 ceil_(Vector2 v) {
        return ceil(v, new Vector2());
    }

    public static Vector2 ceil(Vector2 v, Vector2 res) {
        return res.set(ceil(v.x), ceil(v.y));
    }

    public static Vec2d ceil_(Vec2d v) {
        return ceil(v, new Vec2d());
    }

    public static Vec2d ceil(Vec2d v, Vec2d res) {
        return res.set(ceil(v.x), ceil(v.y));
    }

    public static Vector3 ceil_(Vector3 v) {
        return ceil(v, new Vector3());
    }

    public static Vector3 ceil(Vector3 v, Vector3 res) {
        return res.set(ceil(v.x), ceil(v.y), ceil(v.z));
    }

    public static Vec3d ceil_(Vec3d v) {
        return ceil(v, new Vec3d());
    }

    public static Vec3d ceil(Vec3d v, Vec3d res) {
        return res.set(ceil(v.x), ceil(v.y), ceil(v.z));
    }

    public static Vector4 ceil_(Vector4 v) {
        return ceil(v, new Vector4());
    }

    public static Vector4 ceil(Vector4 v, Vector4 res) {
        return res.set(ceil(v.x), ceil(v.y), ceil(v.z), ceil(v.w));
    }

    public static Vec4d ceil_(Vec4d v) {
        return ceil(v, new Vec4d());
    }

    public static Vec4d ceil(Vec4d v, Vec4d res) {
        return res.set(ceil(v.x), ceil(v.y), ceil(v.z), ceil(v.w));
    }

    // clamp --------------------------------------------------------------------------------------------------------
    public static float clamp(float s, float min, float max) {
        return min(max(s, min), max);
    }

    public static double clamp(double s, double min, double max) {
        return min(max(s, min), max);
    }

    public static int clamp(int s, int min, int max) {
        return min(max(s, min), max);
    }

    public static long clamp(long s, long min, long max) {
        return min(max(s, min), max);
    }

    public static UByte clamp(UByte s, UByte min, UByte max) {
        return min(max(s, min), max);
    }

    public static UInt clamp(UInt s, UInt min, UInt max) {
        return min(max(s, min), max);
    }

    public static ULong clamp(ULong s, ULong min, ULong max) {
        return min(max(s, min), max);
    }

    public static UShort clamp(UShort s, UShort min, UShort max) {
        return min(max(s, min), max);
    }

    // clamp(vec2, scalar) -----------------------------------------------------
    public static Vector2 clamp_(Vector2 v, float min, float max) {
        return clamp(v, min, max, new Vector2());
    }

    public static Vector2 clamp(Vector2 v, float min, float max, Vector2 res) {
        return res.set(clamp(v.x, min, max), clamp(v.y, min, max));
    }

    public static Vec2b clamp_(Vec2b v, byte min, byte max) {
        return clamp(v, min, max, new Vec2b());
    }

    public static Vec2b clamp(Vec2b v, byte min, byte max, Vec2b res) {
        return res.set(clamp(v.x, min, max), clamp(v.y, min, max));
    }

    public static Vec2d clamp_(Vec2d v, double min, double max) {
        return clamp(v, min, max, new Vec2d());
    }

    public static Vec2d clamp(Vec2d v, double min, double max, Vec2d res) {
        return res.set(clamp(v.x, min, max), clamp(v.y, min, max));
    }

    public static Vec2i clamp_(Vec2i v, int min, int max) {
        return clamp(v, min, max, new Vec2i());
    }

    public static Vec2i clamp(Vec2i v, int min, int max, Vec2i res) {
        return res.set(clamp(v.x, min, max), clamp(v.y, min, max));
    }

    public static Vec2l clamp_(Vec2l v, long min, long max) {
        return clamp(v, min, max, new Vec2l());
    }

    public static Vec2l clamp(Vec2l v, long min, long max, Vec2l res) {
        return res.set(clamp(v.x, min, max), clamp(v.y, min, max));
    }

    public static Vec2s clamp_(Vec2s v, short min, short max) {
        return clamp(v, min, max, new Vec2s());
    }

    public static Vec2s clamp(Vec2s v, short min, short max, Vec2s res) {
        return res.set(clamp(v.x, min, max), clamp(v.y, min, max));
    }

    public static Vec2ub clamp_(Vec2ub v, UByte min, UByte max) {
        return clamp(v, min, max, new Vec2ub());
    }

    public static Vec2ub clamp(Vec2ub v, UByte min, UByte max, Vec2ub res) {
        return res.set(clamp(v.x, min, max), clamp(v.y, min, max));
    }

    public static Vec2ui clamp_(Vec2ui v, UInt min, UInt max) {
        return clamp(v, min, max, new Vec2ui());
    }

    public static Vec2ui clamp(Vec2ui v, UInt min, UInt max, Vec2ui res) {
        return res.set(clamp(v.x, min, max), clamp(v.y, min, max));
    }

    public static Vec2ul clamp_(Vec2ul v, ULong min, ULong max) {
        return clamp(v, min, max, new Vec2ul());
    }

    public static Vec2ul clamp(Vec2ul v, ULong min, ULong max, Vec2ul res) {
        return res.set(clamp(v.x, min, max), clamp(v.y, min, max));
    }

    public static Vec2us clamp_(Vec2us v, UShort min, UShort max) {
        return clamp(v, min, max, new Vec2us());
    }

    public static Vec2us clamp(Vec2us v, UShort min, UShort max, Vec2us res) {
        return res.set(clamp(v.x, min, max), clamp(v.y, min, max));
    }

    // clamp(vec2, vec2) -------------------------------------------------------
    public static Vector2 clamp_(Vector2 v, Vector2 min, Vector2 max) {
        return clamp(v, min, max, new Vector2());
    }

    public static Vector2 clamp(Vector2 v, Vector2 min, Vector2 max, Vector2 res) {
        return res.set(clamp(v.x, min.x, max.x), clamp(v.y, min.y, max.y));
    }

    public static Vec2b clamp_(Vec2b v, Vec2b min, Vec2b max) {
        return clamp(v, min, max, new Vec2b());
    }

    public static Vec2b clamp(Vec2b v, Vec2b min, Vec2b max, Vec2b res) {
        return res.set(clamp(v.x, min.x, max.x), clamp(v.y, min.y, max.y));
    }

    public static Vec2d clamp_(Vec2d v, Vec2d min, Vec2d max) {
        return clamp(v, min, max, new Vec2d());
    }

    public static Vec2d clamp(Vec2d v, Vec2d min, Vec2d max, Vec2d res) {
        return res.set(clamp(v.x, min.x, max.x), clamp(v.y, min.y, max.y));
    }

    public static Vec2i clamp_(Vec2i v, Vec2i min, Vec2i max) {
        return clamp(v, min, max, new Vec2i());
    }

    public static Vec2i clamp(Vec2i v, Vec2i min, Vec2i max, Vec2i res) {
        return res.set(clamp(v.x, min.x, max.x), clamp(v.y, min.y, max.y));
    }

    public static Vec2l clamp_(Vec2l v, Vec2l min, Vec2l max) {
        return clamp(v, min, max, new Vec2l());
    }

    public static Vec2l clamp(Vec2l v, Vec2l min, Vec2l max, Vec2l res) {
        return res.set(clamp(v.x, min.x, max.x), clamp(v.y, min.y, max.y));
    }

    public static Vec2s clamp_(Vec2s v, Vec2s min, Vec2s max) {
        return clamp(v, min, max, new Vec2s());
    }

    public static Vec2s clamp(Vec2s v, Vec2s min, Vec2s max, Vec2s res) {
        return res.set(clamp(v.x, min.x, max.x), clamp(v.y, min.y, max.y));
    }

    public static Vec2ub clamp_(Vec2ub v, Vec2ub min, Vec2ub max) {
        return clamp(v, min, max, new Vec2ub());
    }

    public static Vec2ub clamp(Vec2ub v, Vec2ub min, Vec2ub max, Vec2ub res) {
        return res.set(clamp(v.x, min.x, max.x), clamp(v.y, min.y, max.y));
    }

    public static Vec2ui clamp_(Vec2ui v, Vec2ui min, Vec2ui max) {
        return clamp(v, min, max, new Vec2ui());
    }

    public static Vec2ui clamp(Vec2ui v, Vec2ui min, Vec2ui max, Vec2ui res) {
        return res.set(clamp(v.x, min.x, max.x), clamp(v.y, min.y, max.y));
    }

    public static Vec2ul clamp_(Vec2ul v, Vec2ul min, Vec2ul max) {
        return clamp(v, min, max, new Vec2ul());
    }

    public static Vec2ul clamp(Vec2ul v, Vec2ul min, Vec2ul max, Vec2ul res) {
        return res.set(clamp(v.x, min.x, max.x), clamp(v.y, min.y, max.y));
    }

    public static Vec2us clamp_(Vec2us v, Vec2us min, Vec2us max) {
        return clamp(v, min, max, new Vec2us());
    }

    public static Vec2us clamp(Vec2us v, Vec2us min, Vec2us max, Vec2us res) {
        return res.set(clamp(v.x, min.x, max.x), clamp(v.y, min.y, max.y));
    }

    // clamp(vec3, scalar) -----------------------------------------------------
    public static Vector3 clamp_(Vector3 v, float min, float max) {
        return clamp(v, min, max, new Vector3());
    }

    public static Vector3 clamp(Vector3 v, float min, float max, Vector3 res) {
        return res.set(clamp(v.x, min, max), clamp(v.y, min, max), clamp(v.z, min, max));
    }

    public static Vec3b clamp_(Vec3b v, byte min, byte max) {
        return clamp(v, min, max, new Vec3b());
    }

    public static Vec3b clamp(Vec3b v, byte min, byte max, Vec3b res) {
        return res.set(clamp(v.x, min, max), clamp(v.y, min, max), clamp(v.z, min, max));
    }

    public static Vec3d clamp_(Vec3d v, double min, double max) {
        return clamp(v, min, max, new Vec3d());
    }

    public static Vec3d clamp(Vec3d v, double min, double max, Vec3d res) {
        return res.set(clamp(v.x, min, max), clamp(v.y, min, max), clamp(v.z, min, max));
    }

    public static Vec3i clamp_(Vec3i v, int min, int max) {
        return clamp(v, min, max, new Vec3i());
    }

    public static Vec3i clamp(Vec3i v, int min, int max, Vec3i res) {
        return res.set(clamp(v.x, min, max), clamp(v.y, min, max), clamp(v.z, min, max));
    }

    public static Vec3l clamp_(Vec3l v, long min, long max) {
        return clamp(v, min, max, new Vec3l());
    }

    public static Vec3l clamp(Vec3l v, long min, long max, Vec3l res) {
        return res.set(clamp(v.x, min, max), clamp(v.y, min, max), clamp(v.z, min, max));
    }

    public static Vec3s clamp_(Vec3s v, short min, short max) {
        return clamp(v, min, max, new Vec3s());
    }

    public static Vec3s clamp(Vec3s v, short min, short max, Vec3s res) {
        return res.set(clamp(v.x, min, max), clamp(v.y, min, max), clamp(v.z, min, max));
    }

    public static Vec3ub clamp_(Vec3ub v, UByte min, UByte max) {
        return clamp(v, min, max, new Vec3ub());
    }

    public static Vec3ub clamp(Vec3ub v, UByte min, UByte max, Vec3ub res) {
        return res.set(clamp(v.x, min, max), clamp(v.y, min, max), clamp(v.z, min, max));
    }

    public static Vec3ui clamp_(Vec3ui v, UInt min, UInt max) {
        return clamp(v, min, max, new Vec3ui());
    }

    public static Vec3ui clamp(Vec3ui v, UInt min, UInt max, Vec3ui res) {
        return res.set(clamp(v.x, min, max), clamp(v.y, min, max), clamp(v.z, min, max));
    }

    public static Vec3ul clamp_(Vec3ul v, ULong min, ULong max) {
        return clamp(v, min, max, new Vec3ul());
    }

    public static Vec3ul clamp(Vec3ul v, ULong min, ULong max, Vec3ul res) {
        return res.set(clamp(v.x, min, max), clamp(v.y, min, max), clamp(v.z, min, max));
    }

    public static Vec3us clamp_(Vec3us v, UShort min, UShort max) {
        return clamp(v, min, max, new Vec3us());
    }

    public static Vec3us clamp(Vec3us v, UShort min, UShort max, Vec3us res) {
        return res.set(clamp(v.x, min, max), clamp(v.y, min, max), clamp(v.z, min, max));
    }

    // clamp(vec3, vec3) -------------------------------------------------------
    public static Vector3 clamp_(Vector3 v, Vector3 min, Vector3 max) {
        return clamp(v, min, max, new Vector3());
    }

    public static Vector3 clamp(Vector3 v, Vector3 min, Vector3 max, Vector3 res) {
        return res.set(clamp(v.x, min.x, max.x), clamp(v.y, min.y, max.y), clamp(v.z, min.z, max.z));
    }

    public static Vec3b clamp_(Vec3b v, Vec3b min, Vec3b max) {
        return clamp(v, min, max, new Vec3b());
    }

    public static Vec3b clamp(Vec3b v, Vec3b min, Vec3b max, Vec3b res) {
        return res.set(clamp(v.x, min.x, max.x), clamp(v.y, min.y, max.y), clamp(v.z, min.z, max.z));
    }

    public static Vec3d clamp_(Vec3d v, Vec3d min, Vec3d max) {
        return clamp(v, min, max, new Vec3d());
    }

    public static Vec3d clamp(Vec3d v, Vec3d min, Vec3d max, Vec3d res) {
        return res.set(clamp(v.x, min.x, max.x), clamp(v.y, min.y, max.y), clamp(v.z, min.z, max.z));
    }

    public static Vec3i clamp_(Vec3i v, Vec3i min, Vec3i max) {
        return clamp(v, min, max, new Vec3i());
    }

    public static Vec3i clamp(Vec3i v, Vec3i min, Vec3i max, Vec3i res) {
        return res.set(clamp(v.x, min.x, max.x), clamp(v.y, min.y, max.y), clamp(v.z, min.z, max.z));
    }

    public static Vec3l clamp_(Vec3l v, Vec3l min, Vec3l max) {
        return clamp(v, min, max, new Vec3l());
    }

    public static Vec3l clamp(Vec3l v, Vec3l min, Vec3l max, Vec3l res) {
        return res.set(clamp(v.x, min.x, max.x), clamp(v.y, min.y, max.y), clamp(v.z, min.z, max.z));
    }

    public static Vec3s clamp_(Vec3s v, Vec3s min, Vec3s max) {
        return clamp(v, min, max, new Vec3s());
    }

    public static Vec3s clamp(Vec3s v, Vec3s min, Vec3s max, Vec3s res) {
        return res.set(clamp(v.x, min.x, max.x), clamp(v.y, min.y, max.y), clamp(v.z, min.z, max.z));
    }

    public static Vec3ub clamp_(Vec3ub v, Vec3ub min, Vec3ub max) {
        return clamp(v, min, max, new Vec3ub());
    }

    public static Vec3ub clamp(Vec3ub v, Vec3ub min, Vec3ub max, Vec3ub res) {
        return res.set(clamp(v.x, min.x, max.x), clamp(v.y, min.y, max.y), clamp(v.z, min.z, max.z));
    }

    public static Vec3ui clamp_(Vec3ui v, Vec3ui min, Vec3ui max) {
        return clamp(v, min, max, new Vec3ui());
    }

    public static Vec3ui clamp(Vec3ui v, Vec3ui min, Vec3ui max, Vec3ui res) {
        return res.set(clamp(v.x, min.x, max.x), clamp(v.y, min.y, max.y), clamp(v.z, min.z, max.z));
    }

    public static Vec3ul clamp_(Vec3ul v, Vec3ul min, Vec3ul max) {
        return clamp(v, min, max, new Vec3ul());
    }

    public static Vec3ul clamp(Vec3ul v, Vec3ul min, Vec3ul max, Vec3ul res) {
        return res.set(clamp(v.x, min.x, max.x), clamp(v.y, min.y, max.y), clamp(v.z, min.z, max.z));
    }

    public static Vec3us clamp_(Vec3us v, Vec3us min, Vec3us max) {
        return clamp(v, min, max, new Vec3us());
    }

    public static Vec3us clamp(Vec3us v, Vec3us min, Vec3us max, Vec3us res) {
        return res.set(clamp(v.x, min.x, max.x), clamp(v.y, min.y, max.y), clamp(v.z, min.z, max.z));
    }

    // max(vec4, scalar) -------------------------------------------------------
    public static Vector4 clamp_(Vector4 v, float min, float max) {
        return clamp(v, min, max, new Vector4());
    }

    public static Vector4 clamp(Vector4 v, float min, float max, Vector4 res) {
        return res.set(clamp(v.x, min, max), clamp(v.y, min, max), clamp(v.z, min, max), clamp(v.w, min, max));
    }

    public static Vec4b clamp_(Vec4b v, byte min, byte max) {
        return clamp(v, min, max, new Vec4b());
    }

    public static Vec4b clamp(Vec4b v, byte min, byte max, Vec4b res) {
        return res.set(clamp(v.x, min, max), clamp(v.y, min, max), clamp(v.z, min, max), clamp(v.w, min, max));
    }

    public static Vec4d clamp_(Vec4d v, double min, double max) {
        return clamp(v, min, max, new Vec4d());
    }

    public static Vec4d clamp(Vec4d v, double min, double max, Vec4d res) {
        return res.set(clamp(v.x, min, max), clamp(v.y, min, max), clamp(v.z, min, max), clamp(v.w, min, max));
    }

    public static Vec4i clamp_(Vec4i v, int min, int max) {
        return clamp(v, min, max, new Vec4i());
    }

    public static Vec4i clamp(Vec4i v, int min, int max, Vec4i res) {
        return res.set(clamp(v.x, min, max), clamp(v.y, min, max), clamp(v.z, min, max), clamp(v.w, min, max));
    }

    public static Vec4l clamp_(Vec4l v, long min, long max) {
        return clamp(v, min, max, new Vec4l());
    }

    public static Vec4l clamp(Vec4l v, long min, long max, Vec4l res) {
        return res.set(clamp(v.x, min, max), clamp(v.y, min, max), clamp(v.z, min, max), clamp(v.w, min, max));
    }

    public static Vec4s clamp_(Vec4s v, short min, short max) {
        return clamp(v, min, max, new Vec4s());
    }

    public static Vec4s clamp(Vec4s v, short min, short max, Vec4s res) {
        return res.set(clamp(v.x, min, max), clamp(v.y, min, max), clamp(v.z, min, max), clamp(v.w, min, max));
    }

    public static Vec4ub clamp_(Vec4ub v, UByte min, UByte max) {
        return clamp(v, min, max, new Vec4ub());
    }

    public static Vec4ub clamp(Vec4ub v, UByte min, UByte max, Vec4ub res) {
        return res.set(clamp(v.x, min, max), clamp(v.y, min, max), clamp(v.z, min, max), clamp(v.w, min, max));
    }

    public static Vec4ui clamp_(Vec4ui v, UInt min, UInt max) {
        return clamp(v, min, max, new Vec4ui());
    }

    public static Vec4ui clamp(Vec4ui v, UInt min, UInt max, Vec4ui res) {
        return res.set(clamp(v.x, min, max), clamp(v.y, min, max), clamp(v.z, min, max), clamp(v.w, min, max));
    }

    public static Vec4ul clamp_(Vec4ul v, ULong min, ULong max) {
        return clamp(v, min, max, new Vec4ul());
    }

    public static Vec4ul clamp(Vec4ul v, ULong min, ULong max, Vec4ul res) {
        return res.set(clamp(v.x, min, max), clamp(v.y, min, max), clamp(v.z, min, max), clamp(v.w, min, max));
    }

    public static Vec4us clamp_(Vec4us v, UShort min, UShort max) {
        return clamp(v, min, max, new Vec4us());
    }

    public static Vec4us clamp(Vec4us v, UShort min, UShort max, Vec4us res) {
        return res.set(clamp(v.x, min, max), clamp(v.y, min, max), clamp(v.z, min, max), clamp(v.w, min, max));
    }

    // clamp(vec4, vec4) -------------------------------------------------------
    public static Vector4 clamp_(Vector4 v, Vector4 min, Vector4 max) {
        return clamp(v, min, max, new Vector4());
    }

    public static Vector4 clamp(Vector4 v, Vector4 min, Vector4 max, Vector4 res) {
        return res.set(clamp(v.x, min.x, max.x), clamp(v.y, min.y, max.y), clamp(v.z, min.z, max.z), clamp(v.w, min.w, max.w));
    }

    public static Vec4b clamp_(Vec4b v, Vec4b min, Vec4b max) {
        return clamp(v, min, max, new Vec4b());
    }

    public static Vec4b clamp(Vec4b v, Vec4b min, Vec4b max, Vec4b res) {
        return res.set(clamp(v.x, min.x, max.x), clamp(v.y, min.y, max.y), clamp(v.z, min.z, max.z), clamp(v.w, min.w, max.w));
    }

    public static Vec4d clamp_(Vec4d v, Vec4d min, Vec4d max) {
        return clamp(v, min, max, new Vec4d());
    }

    public static Vec4d clamp(Vec4d v, Vec4d min, Vec4d max, Vec4d res) {
        return res.set(clamp(v.x, min.x, max.x), clamp(v.y, min.y, max.y), clamp(v.z, min.z, max.z), clamp(v.w, min.w, max.w));
    }

    public static Vec4i clamp_(Vec4i v, Vec4i min, Vec4i max) {
        return clamp(v, min, max, new Vec4i());
    }

    public static Vec4i clamp(Vec4i v, Vec4i min, Vec4i max, Vec4i res) {
        return res.set(clamp(v.x, min.x, max.x), clamp(v.y, min.y, max.y), clamp(v.z, min.z, max.z), clamp(v.w, min.w, max.w));
    }

    public static Vec4l clamp_(Vec4l v, Vec4l min, Vec4l max) {
        return clamp(v, min, max, new Vec4l());
    }

    public static Vec4l clamp(Vec4l v, Vec4l mix, Vec4l max, Vec4l res) {
        return res.set(clamp(v.x, mix.x, max.x), clamp(v.y, mix.y, max.y), clamp(v.z, mix.z, max.z), clamp(v.w, mix.w, max.w));
    }

    public static Vec4s clamp_(Vec4s v, Vec4s min, Vec4s max) {
        return clamp(v, min, max, new Vec4s());
    }

    public static Vec4s clamp(Vec4s v, Vec4s min, Vec4s max, Vec4s res) {
        return res.set(clamp(v.x, min.x, max.x), clamp(v.y, min.y, max.y), clamp(v.z, min.z, max.z), clamp(v.w, min.w, max.w));
    }

    public static Vec4ub clamp_(Vec4ub v, Vec4ub min, Vec4ub max) {
        return clamp(v, min, max, new Vec4ub());
    }

    public static Vec4ub clamp(Vec4ub v, Vec4ub min, Vec4ub max, Vec4ub res) {
        return res.set(clamp(v.x, min.x, max.x), clamp(v.y, min.y, max.y), clamp(v.z, min.z, max.z), clamp(v.w, min.w, max.w));
    }

    public static Vec4ui clamp_(Vec4ui v, Vec4ui min, Vec4ui max) {
        return clamp(v, min, max, new Vec4ui());
    }

    public static Vec4ui clamp(Vec4ui v, Vec4ui min, Vec4ui max, Vec4ui res) {
        return res.set(clamp(v.x, min.x, max.x), clamp(v.y, min.y, max.y), clamp(v.z, min.z, max.z), clamp(v.w, min.w, max.w));
    }

    public static Vec4ul clamp_(Vec4ul v, Vec4ul min, Vec4ul max) {
        return clamp(v, min, max, new Vec4ul());
    }

    public static Vec4ul clamp(Vec4ul v, Vec4ul min, Vec4ul max, Vec4ul res) {
        return res.set(clamp(v.x, min.x, max.x), clamp(v.y, min.y, max.y), clamp(v.z, min.z, max.z), clamp(v.w, min.w, max.w));
    }

    public static Vec4us clamp_(Vec4us v, Vec4us min, Vec4us max) {
        return clamp(v, min, max, new Vec4us());
    }

    public static Vec4us clamp(Vec4us v, Vec4us min, Vec4us max, Vec4us res) {
        return res.set(clamp(v.x, min.x, max.x), clamp(v.y, min.y, max.y), clamp(v.z, min.z, max.z), clamp(v.w, min.w, max.w));
    }

    // floatBitsToInt -----------------------------------------------------------------------------------------------
    public static int floatBitsToInt(float s) {
        return Float.floatToIntBits(s);
    }

    public static Vec2i floatBitsToInt_(Vector2 v) {
        return floatBitsToInt(v, new Vec2i());
    }

    public static Vec2i floatBitsToInt(Vector2 v, Vec2i res) {
        res.x = Float.floatToIntBits(v.x);
        res.y = Float.floatToIntBits(v.y);
        return res;
    }

    public static Vec3i floatBitsToInt_(Vector3 v) {
        return floatBitsToInt(v, new Vec3i());
    }

    public static Vec3i floatBitsToInt(Vector3 v, Vec3i res) {
        res.x = Float.floatToIntBits(v.x);
        res.y = Float.floatToIntBits(v.y);
        res.z = Float.floatToIntBits(v.z);
        return res;
    }

    public static Vec4i floatBitsToInt_(Vector4 v) {
        return floatBitsToInt(v, new Vec4i());
    }

    public static Vec4i floatBitsToInt(Vector4 v, Vec4i res) {
        res.x = Float.floatToIntBits(v.x);
        res.y = Float.floatToIntBits(v.y);
        res.z = Float.floatToIntBits(v.z);
        res.w = Float.floatToIntBits(v.w);
        return res;
    }

    // floatBitsToUInt -----------------------------------------------------------------------------------------------
    public static int floatBitsToUInt(float s) {
        if (s < 0) {
            throw new NumberFormatException("Value is out of range : " + s);
        }
        return (int) (Double.doubleToLongBits(s) & UInt.MAX_VALUE);
    }

    public static Vec2i floatBitsToUInt_(Vector2 v) {
        return floatBitsToUInt(v, new Vec2i());
    }

    public static Vec2i floatBitsToUInt(Vector2 v, Vec2i res) {
        if (v.x < 0 || v.y < 0) {
            throw new NumberFormatException("Value is out of range : "); //TODO print
        }
        res.x = (int) (Double.doubleToLongBits(v.x) & UInt.MAX_VALUE);
        res.y = (int) (Double.doubleToLongBits(v.y) & UInt.MAX_VALUE);
        return res;
    }

    public static Vec3i floatBitsToUInt_(Vector3 v) {
        return floatBitsToUInt(v, new Vec3i());
    }

    public static Vec3i floatBitsToUInt(Vector3 v, Vec3i res) {
        if (v.x < 0 || v.y < 0 || v.z < 0) {
            throw new NumberFormatException("Value is out of range : "); //TODO print
        }
        res.x = (int) (Double.doubleToLongBits(v.x) & UInt.MAX_VALUE);
        res.y = (int) (Double.doubleToLongBits(v.y) & UInt.MAX_VALUE);
        res.z = (int) (Double.doubleToLongBits(v.z) & UInt.MAX_VALUE);
        return res;
    }

    public static Vec4i floatBitsToUInt_(Vector4 v) {
        return floatBitsToUInt(v, new Vec4i());
    }

    public static Vec4i floatBitsToUInt(Vector4 v, Vec4i res) {
        if (v.x < 0 || v.y < 0 || v.z < 0 || v.w < 0) {
            throw new NumberFormatException("Value is out of range : "); //TODO print
        }
        res.x = (int) (Double.doubleToLongBits(v.x) & UInt.MAX_VALUE);
        res.y = (int) (Double.doubleToLongBits(v.y) & UInt.MAX_VALUE);
        res.z = (int) (Double.doubleToLongBits(v.z) & UInt.MAX_VALUE);
        res.w = (int) (Double.doubleToLongBits(v.w) & UInt.MAX_VALUE);
        return res;
    }

    // intBitsToFloat -----------------------------------------------------------------------------------------------
    public static float intBitsToFloat(int s) {
        return Float.intBitsToFloat(s);
    }

    public static Vector2 intBitsToFloat_(Vec2i v) {
        return intBitsToFloat(v, new Vector2());
    }

    public static Vector2 intBitsToFloat(Vec2i v, Vector2 res) {
        res.x = Float.intBitsToFloat(v.x);
        res.y = Float.intBitsToFloat(v.y);
        return res;
    }

    public static Vector3 intBitsToFloat_(Vec3i v) {
        return intBitsToFloat(v, new Vector3());
    }

    public static Vector3 intBitsToFloat(Vec3i v, Vector3 res) {
        res.x = Float.intBitsToFloat(v.x);
        res.y = Float.intBitsToFloat(v.y);
        res.z = Float.intBitsToFloat(v.z);
        return res;
    }

    public static Vector4 intBitsToFloat_(Vec4i v) {
        return intBitsToFloat(v, new Vector4());
    }

    public static Vector4 intBitsToFloat(Vec4i v, Vector4 res) {
        res.x = Float.intBitsToFloat(v.x);
        res.y = Float.intBitsToFloat(v.y);
        res.z = Float.intBitsToFloat(v.z);
        res.w = Float.intBitsToFloat(v.w);
        return res;
    }

    // uintBitsToFloat ----------------------------------------------------------------------------------------------
    public static float uintBitsToFloat(UInt s) {
        return (float) Double.longBitsToDouble(s.value);
    }

    public static Vector2 uintBitsToFloat_(Vec2ui v) {
        return uintBitsToFloat(v, new Vector2());
    }

    public static Vector2 uintBitsToFloat(Vec2ui v, Vector2 res) {
        res.x = (float) Double.longBitsToDouble(v.x.value);
        res.y = (float) Double.longBitsToDouble(v.y.value);
        return res;
    }

    public static Vector3 uintBitsToFloat_(Vec3ui v) {
        return uintBitsToFloat(v, new Vector3());
    }

    public static Vector3 uintBitsToFloat(Vec3ui v, Vector3 res) {
        res.x = (float) Double.longBitsToDouble(v.x.value);
        res.y = (float) Double.longBitsToDouble(v.y.value);
        res.z = (float) Double.longBitsToDouble(v.z.value);
        return res;
    }

    public static Vector4 uintBitsToFloat_(Vec4ui v) {
        return uintBitsToFloat(v, new Vector4());
    }

    public static Vector4 uintBitsToFloat(Vec4ui v, Vector4 res) {
        res.x = (float) Double.longBitsToDouble(v.x.value);
        res.y = (float) Double.longBitsToDouble(v.y.value);
        res.z = (float) Double.longBitsToDouble(v.z.value);
        res.w = (float) Double.longBitsToDouble(v.w.value);
        return res;
    }

    // floor --------------------------------------------------------------------------------------------------------
    public static float floor(float s) {
        return (float) Math.floor(s);
    }

    public static double floor(double s) {
        return Math.floor(s);
    }

    public static Vector2 floor_(Vector2 v) {
        return floor(v, new Vector2());
    }

    public static Vector2 floor(Vector2 v, Vector2 res) {
        return res.set(floor(v.x), floor(v.y));
    }

    public static Vec2d floor_(Vec2d v) {
        return floor(v, new Vec2d());
    }

    public static Vec2d floor(Vec2d v, Vec2d res) {
        return res.set(floor(v.x), floor(v.y));
    }

    public static Vector3 floor_(Vector3 v) {
        return floor(v, new Vector3());
    }

    public static Vector3 floor(Vector3 v, Vector3 res) {
        return res.set(floor(v.x), floor(v.y), floor(v.z));
    }

    public static Vec3d floor_(Vec3d v) {
        return floor(v, new Vec3d());
    }

    public static Vec3d floor(Vec3d v, Vec3d res) {
        return res.set(floor(v.x), floor(v.y), floor(v.z));
    }

    public static Vector4 floor_(Vector4 v) {
        return floor(v, new Vector4());
    }

    public static Vector4 floor(Vector4 v, Vector4 res) {
        return res.set(floor(v.x), floor(v.y), floor(v.z), floor(v.w));
    }

    public static Vec4d floor_(Vec4d v) {
        return floor(v, new Vec4d());
    }

    public static Vec4d floor(Vec4d v, Vec4d res) {
        return res.set(floor(v.x), floor(v.y), floor(v.z), floor(v.w));
    }

    // fma ----------------------------------------------------------------------------------------------------------
    public static float fma(float a, float b, float c) {
        return a * b + c;
    }

    public static double fma(double a, double b, double c) {
        return a * b + c;
    }

    public static Vector2 fma_(Vector2 a, Vector2 b, Vector2 c) {
        return fma(a, b, c, new Vector2());
    }

    public static Vector2 fma(Vector2 a, Vector2 b, Vector2 c, Vector2 res) {
        res.x = a.x * b.x + c.x;
        res.y = a.y * b.y + c.y;
        return res;
    }

    public static Vec2d fma_(Vec2d a, Vec2d b, Vec2d c) {
        return fma(a, b, c, new Vec2d());
    }

    public static Vec2d fma(Vec2d a, Vec2d b, Vec2d c, Vec2d res) {
        res.x = a.x * b.x + c.x;
        res.y = a.y * b.y + c.y;
        return res;
    }

    public static Vector3 fma_(Vector3 a, Vector3 b, Vector3 c) {
        return fma(a, b, c, new Vector3());
    }

    public static Vector3 fma(Vector3 a, Vector3 b, Vector3 c, Vector3 res) {
        res.x = a.x * b.x + c.x;
        res.y = a.y * b.y + c.y;
        res.z = a.z * b.z + c.z;
        return res;
    }

    public static Vec3d fma_(Vec3d a, Vec3d b, Vec3d c) {
        return fma(a, b, c, new Vec3d());
    }

    public static Vec3d fma(Vec3d a, Vec3d b, Vec3d c, Vec3d res) {
        res.x = a.x * b.x + c.x;
        res.y = a.y * b.y + c.y;
        res.z = a.z * b.z + c.z;
        return res;
    }

    public static Vector4 fma_(Vector4 a, Vector4 b, Vector4 c) {
        return fma(a, b, c, new Vector4());
    }

    public static Vector4 fma(Vector4 a, Vector4 b, Vector4 c, Vector4 res) {
        res.x = a.x * b.x + c.x;
        res.y = a.y * b.y + c.y;
        res.z = a.z * b.z + c.z;
        res.w = a.w * b.w + c.w;
        return res;
    }

    public static Vec4d fma_(Vec4d a, Vec4d b, Vec4d c) {
        return fma(a, b, c, new Vec4d());
    }

    public static Vec4d fma(Vec4d a, Vec4d b, Vec4d c, Vec4d res) {
        res.x = a.x * b.x + c.x;
        res.y = a.y * b.y + c.y;
        res.z = a.z * b.z + c.z;
        res.w = a.w * b.w + c.w;
        return res;
    }

    // fract --------------------------------------------------------------------------------------------------------
    public static float fract(float s) {
        return s - floor(s);
    }

    public static double fract(double s) {
        return s - floor(s);
    }

    public static Vector2 fract_(Vector2 v) {
        return fract(v, new Vector2());
    }

    public static Vector2 fract(Vector2 v, Vector2 res) {
        return res.set(fract(v.x), fract(v.y));
    }

    public static Vec2d fract_(Vec2d v) {
        return fract(v, new Vec2d());
    }

    public static Vec2d fract(Vec2d v, Vec2d res) {
        return res.set(fract(v.x), fract(v.y));
    }

    public static Vector3 fract_(Vector3 v) {
        return fract(v, new Vector3());
    }

    public static Vector3 fract(Vector3 v, Vector3 res) {
        return res.set(fract(v.x), fract(v.y), fract(v.z));
    }

    public static Vec3d fract_(Vec3d v) {
        return fract(v, new Vec3d());
    }

    public static Vec3d fract(Vec3d v, Vec3d res) {
        return res.set(fract(v.x), fract(v.y), fract(v.z));
    }

    public static Vector4 fract_(Vector4 v) {
        return fract(v, new Vector4());
    }

    public static Vector4 fract(Vector4 v, Vector4 res) {
        return res.set(fract(v.x), fract(v.y), fract(v.z), fract(v.w));
    }

    public static Vec4d fract_(Vec4d v) {
        return fract(v, new Vec4d());
    }

    public static Vec4d fract(Vec4d v, Vec4d res) {
        return res.set(fract(v.x), fract(v.y), fract(v.z), fract(v.w));
    }

    // isInf --------------------------------------------------------------------------------------------------------
    public static boolean isInf(double s) {
        return Double.isInfinite(s);
    }

    public static boolean isInf(float s) {
        return Float.isInfinite(s);
    }

    public static Vec2bool isInf(Vec2d v) {
        return isInf(v, new Vec2bool());
    }

    public static Vec2bool isInf(Vec2d v, Vec2bool res) {
        res.x = Double.isInfinite(v.x);
        res.y = Double.isInfinite(v.y);
        return res;
    }

    public static Vec2bool isInf(Vector2 v) {
        return isInf(v, new Vec2bool());
    }

    public static Vec2bool isInf(Vector2 v, Vec2bool res) {
        res.x = Float.isInfinite(v.x);
        res.y = Float.isInfinite(v.y);
        return res;
    }

    public static Vec3bool isInf(Vec3d v) {
        return isInf(v, new Vec3bool());
    }

    public static Vec3bool isInf(Vec3d v, Vec3bool res) {
        res.x = Double.isInfinite(v.x);
        res.y = Double.isInfinite(v.y);
        res.z = Double.isInfinite(v.z);
        return res;
    }

    public static Vec3bool isInf(Vector3 v) {
        return isInf(v, new Vec3bool());
    }

    public static Vec3bool isInf(Vector3 v, Vec3bool res) {
        res.x = Float.isInfinite(v.x);
        res.y = Float.isInfinite(v.y);
        res.z = Float.isInfinite(v.z);
        return res;
    }

    public static Vec4bool isInf(Vec4d v) {
        return isInf(v, new Vec4bool());
    }

    public static Vec4bool isInf(Vec4d v, Vec4bool res) {
        res.x = Double.isInfinite(v.x);
        res.y = Double.isInfinite(v.y);
        res.z = Double.isInfinite(v.z);
        res.w = Double.isInfinite(v.w);
        return res;
    }

    public static Vec4bool isInf(Vector4 v) {
        return isInf(v, new Vec4bool());
    }

    public static Vec4bool isInf(Vector4 v, Vec4bool res) {
        res.x = Float.isInfinite(v.x);
        res.y = Float.isInfinite(v.y);
        res.z = Float.isInfinite(v.z);
        res.w = Float.isInfinite(v.w);
        return res;
    }

    // isNan --------------------------------------------------------------------------------------------------------
    public static boolean isNan(double s) {
        return Double.isNaN(s);
    }

    public static boolean isNan(float s) {
        return Float.isNaN(s);
    }

    public static Vec2bool isNan(Vec2d v) {
        return isNan(v, new Vec2bool());
    }

    public static Vec2bool isNan(Vec2d v, Vec2bool res) {
        res.x = Double.isNaN(v.x);
        res.y = Double.isNaN(v.y);
        return res;
    }

    public static Vec2bool isNan(Vector2 v) {
        return isNan(v, new Vec2bool());
    }

    public static Vec2bool isNan(Vector2 v, Vec2bool res) {
        res.x = Float.isNaN(v.x);
        res.y = Float.isNaN(v.y);
        return res;
    }

    public static Vec3bool isNan(Vec3d v) {
        return isNan(v, new Vec3bool());
    }

    public static Vec3bool isNan(Vec3d v, Vec3bool res) {
        res.x = Double.isNaN(v.x);
        res.y = Double.isNaN(v.y);
        res.z = Double.isNaN(v.z);
        return res;
    }

    public static Vec3bool isNan(Vector3 v) {
        return isNan(v, new Vec3bool());
    }

    public static Vec3bool isNan(Vector3 v, Vec3bool res) {
        res.x = Float.isNaN(v.x);
        res.y = Float.isNaN(v.y);
        res.z = Float.isNaN(v.z);
        return res;
    }

    public static Vec4bool isNan(Vec4d v) {
        return isNan(v, new Vec4bool());
    }

    public static Vec4bool isNan(Vec4d v, Vec4bool res) {
        res.x = Double.isNaN(v.x);
        res.y = Double.isNaN(v.y);
        res.z = Double.isNaN(v.z);
        res.w = Double.isNaN(v.w);
        return res;
    }

    public static Vec4bool isNan(Vector4 v) {
        return isNan(v, new Vec4bool());
    }

    public static Vec4bool isNan(Vector4 v, Vec4bool res) {
        res.x = Float.isNaN(v.x);
        res.y = Float.isNaN(v.y);
        res.z = Float.isNaN(v.z);
        res.w = Float.isNaN(v.w);
        return res;
    }

    // max ----------------------------------------------------------------------------------------------------------
    public static float max(float sA, float sB) {
        return Math.max(sA, sB);
    }

    public static double max(double sA, double sB) {
        return Math.max(sA, sB);
    }

    public static int max(int sA, int sB) {
        return Math.max(sA, sB);
    }

    public static long max(long sA, long sB) {
        return Math.max(sA, sB);
    }

    public static UByte max(UByte sA, UByte sB) {
        return UMath.max(sA, sB);
    }

    public static UInt max(UInt sA, UInt sB) {
        return UMath.max(sA, sB);
    }

    public static ULong max(ULong sA, ULong sB) {
        return UMath.max(sA, sB);
    }

    public static UShort max(UShort sA, UShort sB) {
        return UMath.max(sA, sB);
    }

    // max(vec2, scalar) -------------------------------------------------------
    public static Vector2 max_(Vector2 v, float s) {
        return max(v, s, new Vector2());
    }

    public static Vector2 max(Vector2 v, float s, Vector2 res) {
        return res.set(max(v.x, s), max(v.y, s));
    }

    public static Vec2b max_(Vec2b v, byte s) {
        return max(v, s, new Vec2b());
    }

    public static Vec2b max(Vec2b v, byte s, Vec2b res) {
        return res.set(max(v.x, s), max(v.y, s));
    }

    public static Vec2d max_(Vec2d v, double s) {
        return max(v, s, new Vec2d());
    }

    public static Vec2d max(Vec2d v, double s, Vec2d res) {
        return res.set(max(v.x, s), max(v.y, s));
    }

    public static Vec2i max_(Vec2i v, int s) {
        return max(v, s, new Vec2i());
    }

    public static Vec2i max(Vec2i v, int s, Vec2i res) {
        return res.set(max(v.x, s), max(v.y, s));
    }

    public static Vec2l max_(Vec2l v, long s) {
        return max(v, s, new Vec2l());
    }

    public static Vec2l max(Vec2l v, long s, Vec2l res) {
        return res.set(max(v.x, s), max(v.y, s));
    }

    public static Vec2s max_(Vec2s v, short s) {
        return max(v, s, new Vec2s());
    }

    public static Vec2s max(Vec2s v, short s, Vec2s res) {
        return res.set(max(v.x, s), max(v.y, s));
    }

    public static Vec2ub max_(Vec2ub v, UByte s) {
        return max(v, s, new Vec2ub());
    }

    public static Vec2ub max(Vec2ub v, UByte s, Vec2ub res) {
        return res.set(max(v.x, s), max(v.y, s));
    }

    public static Vec2ui max_(Vec2ui v, UInt s) {
        return max(v, s, new Vec2ui());
    }

    public static Vec2ui max(Vec2ui v, UInt s, Vec2ui res) {
        return res.set(max(v.x, s), max(v.y, s));
    }

    public static Vec2ul max_(Vec2ul v, ULong s) {
        return max(v, s, new Vec2ul());
    }

    public static Vec2ul max(Vec2ul v, ULong s, Vec2ul res) {
        return res.set(max(v.x, s), max(v.y, s));
    }

    public static Vec2us max_(Vec2us v, UShort s) {
        return max(v, s, new Vec2us());
    }

    public static Vec2us max(Vec2us v, UShort s, Vec2us res) {
        return res.set(max(v.x, s), max(v.y, s));
    }

    // max(vec2, vec2) ---------------------------------------------------------
    public static Vector2 max_(Vector2 vA, Vector2 vB) {
        return max(vA, vB, new Vector2());
    }

    public static Vector2 max(Vector2 vA, Vector2 vB, Vector2 res) {
        return res.set(max(vA.x, vB.x), max(vA.y, vB.y));
    }

    public static Vec2b max_(Vec2b vA, Vec2b vB) {
        return max(vA, vB, new Vec2b());
    }

    public static Vec2b max(Vec2b va, Vec2b vB, Vec2b res) {
        return res.set(max(va.x, vB.x), max(va.y, vB.y));
    }

    public static Vec2d max_(Vec2d vA, Vec2d vB) {
        return max(vA, vB, new Vec2d());
    }

    public static Vec2d max(Vec2d vA, Vec2d vB, Vec2d res) {
        return res.set(max(vA.x, vB.x), max(vA.y, vB.y));
    }

    public static Vec2i max_(Vec2i vA, Vec2i vB) {
        return max(vA, vB, new Vec2i());
    }

    public static Vec2i max(Vec2i vA, Vec2i vB, Vec2i res) {
        return res.set(max(vA.x, vB.x), max(vA.y, vB.y));
    }

    public static Vec2l max_(Vec2l vA, Vec2l vB) {
        return max(vA, vB, new Vec2l());
    }

    public static Vec2l max(Vec2l vA, Vec2l vB, Vec2l res) {
        return res.set(max(vA.x, vB.x), max(vA.y, vB.y));
    }

    public static Vec2s max_(Vec2s vA, Vec2s vB) {
        return max(vA, vB, new Vec2s());
    }

    public static Vec2s max(Vec2s vA, Vec2s vB, Vec2s res) {
        return res.set(max(vA.x, vB.x), max(vA.y, vB.y));
    }

    public static Vec2ub max_(Vec2ub vA, Vec2ub vB) {
        return max(vA, vB, new Vec2ub());
    }

    public static Vec2ub max(Vec2ub vA, Vec2ub vB, Vec2ub res) {
        return res.set(max(vA.x, vB.x), max(vA.y, vB.y));
    }

    public static Vec2ui max_(Vec2ui vA, Vec2ui vB) {
        return max(vA, vB, new Vec2ui());
    }

    public static Vec2ui max(Vec2ui vA, Vec2ui vB, Vec2ui res) {
        return res.set(max(vA.x, vB.x), max(vA.y, vB.y));
    }

    public static Vec2ul max_(Vec2ul vA, Vec2ul vB) {
        return max(vA, vB, new Vec2ul());
    }

    public static Vec2ul max(Vec2ul vA, Vec2ul vB, Vec2ul res) {
        return res.set(max(vA.x, vB.x), max(vA.y, vB.y));
    }

    public static Vec2us max_(Vec2us vA, Vec2us vB) {
        return max(vA, vB, new Vec2us());
    }

    public static Vec2us max(Vec2us vA, Vec2us vB, Vec2us res) {
        return res.set(max(vA.x, vB.x), max(vA.y, vB.y));
    }

    // max(vec3, scalar) -------------------------------------------------------
    public static Vector3 max_(Vector3 v, float s) {
        return max(v, s, new Vector3());
    }

    public static Vector3 max(Vector3 v, float s, Vector3 res) {
        return res.set(max(v.x, s), max(v.y, s), max(v.z, s));
    }

    public static Vec3b max_(Vec3b v, byte s) {
        return max(v, s, new Vec3b());
    }

    public static Vec3b max(Vec3b v, byte s, Vec3b res) {
        return res.set(max(v.x, s), max(v.y, s), max(v.z, s));
    }

    public static Vec3d max_(Vec3d v, double s) {
        return max(v, s, new Vec3d());
    }

    public static Vec3d max(Vec3d v, double s, Vec3d res) {
        return res.set(max(v.x, s), max(v.y, s), max(v.z, s));
    }

    public static Vec3i max_(Vec3i v, int s) {
        return max(v, s, new Vec3i());
    }

    public static Vec3i max(Vec3i v, int s, Vec3i res) {
        return res.set(max(v.x, s), max(v.y, s), max(v.z, s));
    }

    public static Vec3l max_(Vec3l v, long s) {
        return max(v, s, new Vec3l());
    }

    public static Vec3l max(Vec3l v, long s, Vec3l res) {
        return res.set(max(v.x, s), max(v.y, s), max(v.z, s));
    }

    public static Vec3s max_(Vec3s v, short s) {
        return max(v, s, new Vec3s());
    }

    public static Vec3s max(Vec3s v, short s, Vec3s res) {
        return res.set(max(v.x, s), max(v.y, s), max(v.z, s));
    }

    public static Vec3ub max_(Vec3ub v, UByte s) {
        return max(v, s, new Vec3ub());
    }

    public static Vec3ub max(Vec3ub v, UByte s, Vec3ub res) {
        return res.set(max(v.x, s), max(v.y, s), max(v.z, s));
    }

    public static Vec3ui max_(Vec3ui v, UInt s) {
        return max(v, s, new Vec3ui());
    }

    public static Vec3ui max(Vec3ui v, UInt s, Vec3ui res) {
        return res.set(max(v.x, s), max(v.y, s), max(v.z, s));
    }

    public static Vec3ul max_(Vec3ul v, ULong s) {
        return max(v, s, new Vec3ul());
    }

    public static Vec3ul max(Vec3ul v, ULong s, Vec3ul res) {
        return res.set(max(v.x, s), max(v.y, s), max(v.z, s));
    }

    public static Vec3us max_(Vec3us v, UShort s) {
        return max(v, s, new Vec3us());
    }

    public static Vec3us max(Vec3us v, UShort s, Vec3us res) {
        return res.set(max(v.x, s), max(v.y, s), max(v.z, s));
    }

    // max(vec3, vec3) ---------------------------------------------------------
    public static Vector3 max_(Vector3 vA, Vector3 vB) {
        return max(vA, vB, new Vector3());
    }

    public static Vector3 max(Vector3 vA, Vector3 vB, Vector3 res) {
        return res.set(max(vA.x, vB.x), max(vA.y, vB.y), max(vA.z, vB.z));
    }

    public static Vec3b max_(Vec3b vA, Vec3b vB) {
        return max(vA, vB, new Vec3b());
    }

    public static Vec3b max(Vec3b vA, Vec3b vB, Vec3b res) {
        return res.set(max(vA.x, vB.x), max(vA.y, vB.y), max(vA.z, vB.z));
    }

    public static Vec3d max_(Vec3d vA, Vec3d vB) {
        return max(vA, vB, new Vec3d());
    }

    public static Vec3d max(Vec3d vA, Vec3d vB, Vec3d res) {
        return res.set(max(vA.x, vB.x), max(vA.y, vB.y), max(vA.z, vB.z));
    }

    public static Vec3i max_(Vec3i vA, Vec3i vB) {
        return max(vA, vB, new Vec3i());
    }

    public static Vec3i max(Vec3i vA, Vec3i vB, Vec3i res) {
        return res.set(max(vA.x, vB.x), max(vA.y, vB.y), max(vA.z, vB.z));
    }

    public static Vec3l max_(Vec3l vA, Vec3l vB) {
        return max(vA, vB, new Vec3l());
    }

    public static Vec3l max(Vec3l vA, Vec3l vB, Vec3l res) {
        return res.set(max(vA.x, vB.x), max(vA.y, vB.y), max(vA.z, vB.z));
    }

    public static Vec3s max_(Vec3s vA, Vec3s vB) {
        return max(vA, vB, new Vec3s());
    }

    public static Vec3s max(Vec3s vA, Vec3s vB, Vec3s res) {
        return res.set(max(vA.x, vB.x), max(vA.y, vB.y), max(vA.z, vB.z));
    }

    public static Vec3ub max_(Vec3ub vA, Vec3ub vB) {
        return max(vA, vB, new Vec3ub());
    }

    public static Vec3ub max(Vec3ub vA, Vec3ub vB, Vec3ub res) {
        return res.set(max(vA.x, vB.x), max(vA.y, vB.y), max(vA.z, vB.z));
    }

    public static Vec3ui max_(Vec3ui vA, Vec3ui vB) {
        return max(vA, vB, new Vec3ui());
    }

    public static Vec3ui max(Vec3ui vA, Vec3ui vB, Vec3ui res) {
        return res.set(max(vA.x, vB.x), max(vA.y, vB.y), max(vA.z, vB.z));
    }

    public static Vec3ul max_(Vec3ul vA, Vec3ul vB) {
        return max(vA, vB, new Vec3ul());
    }

    public static Vec3ul max(Vec3ul vA, Vec3ul vB, Vec3ul res) {
        return res.set(max(vA.x, vB.x), max(vA.y, vB.y), max(vA.z, vB.z));
    }

    public static Vec3us max_(Vec3us vA, Vec3us vB) {
        return max(vA, vB, new Vec3us());
    }

    public static Vec3us max(Vec3us vA, Vec3us vB, Vec3us res) {
        return res.set(max(vA.x, vB.x), max(vA.y, vB.y), max(vA.z, vB.z));
    }

    // max(vec4, scalar) -------------------------------------------------------
    public static Vector4 max_(Vector4 v, float s) {
        return max(v, s, new Vector4());
    }

    public static Vector4 max(Vector4 v, float s, Vector4 res) {
        return res.set(max(v.x, s), max(v.y, s), max(v.z, s), max(v.w, s));
    }

    public static Vec4b max_(Vec4b v, byte s) {
        return max(v, s, new Vec4b());
    }

    public static Vec4b max(Vec4b v, byte s, Vec4b res) {
        return res.set(max(v.x, s), max(v.y, s), max(v.z, s), max(v.w, s));
    }

    public static Vec4d max_(Vec4d v, double s) {
        return max(v, s, new Vec4d());
    }

    public static Vec4d max(Vec4d v, double s, Vec4d res) {
        return res.set(max(v.x, s), max(v.y, s), max(v.z, s), max(v.w, s));
    }

    public static Vec4i max_(Vec4i v, int s) {
        return max(v, s, new Vec4i());
    }

    public static Vec4i max(Vec4i v, int s, Vec4i res) {
        return res.set(max(v.x, s), max(v.y, s), max(v.z, s), max(v.w, s));
    }

    public static Vec4l max_(Vec4l v, long s) {
        return max(v, s, new Vec4l());
    }

    public static Vec4l max(Vec4l v, long s, Vec4l res) {
        return res.set(max(v.x, s), max(v.y, s), max(v.z, s), max(v.w, s));
    }

    public static Vec4s max_(Vec4s v, short s) {
        return max(v, s, new Vec4s());
    }

    public static Vec4s max(Vec4s v, short s, Vec4s res) {
        return res.set(max(v.x, s), max(v.y, s), max(v.z, s), max(v.w, s));
    }

    public static Vec4ub max_(Vec4ub v, UByte s) {
        return max(v, s, new Vec4ub());
    }

    public static Vec4ub max(Vec4ub v, UByte s, Vec4ub res) {
        return res.set(max(v.x, s), max(v.y, s), max(v.z, s), max(v.w, s));
    }

    public static Vec4ui max_(Vec4ui v, UInt s) {
        return max(v, s, new Vec4ui());
    }

    public static Vec4ui max(Vec4ui v, UInt s, Vec4ui res) {
        return res.set(max(v.x, s), max(v.y, s), max(v.z, s), max(v.w, s));
    }

    public static Vec4ul max_(Vec4ul v, ULong s) {
        return max(v, s, new Vec4ul());
    }

    public static Vec4ul max(Vec4ul v, ULong s, Vec4ul res) {
        return res.set(max(v.x, s), max(v.y, s), max(v.z, s), max(v.w, s));
    }

    public static Vec4us max_(Vec4us v, UShort s) {
        return max(v, s, new Vec4us());
    }

    public static Vec4us max(Vec4us v, UShort s, Vec4us res) {
        return res.set(max(v.x, s), max(v.y, s), max(v.z, s), max(v.w, s));
    }

    // max(vec4, vec4) ---------------------------------------------------------
    public static Vector4 max_(Vector4 vA, Vector4 vB) {
        return max(vA, vB, new Vector4());
    }

    public static Vector4 max(Vector4 vA, Vector4 vB, Vector4 res) {
        return res.set(max(vA.x, vB.x), max(vA.y, vB.y), max(vA.z, vB.z), max(vA.w, vB.w));
    }

    public static Vec4b max_(Vec4b vA, Vec4b vB) {
        return max(vA, vB, new Vec4b());
    }

    public static Vec4b max(Vec4b vA, Vec4b vB, Vec4b res) {
        return res.set(max(vA.x, vB.x), max(vA.y, vB.y), max(vA.z, vB.z), max(vA.w, vB.w));
    }

    public static Vec4d max_(Vec4d vA, Vec4d vB) {
        return max(vA, vB, new Vec4d());
    }

    public static Vec4d max(Vec4d vA, Vec4d vB, Vec4d res) {
        return res.set(max(vA.x, vB.x), max(vA.y, vB.y), max(vA.z, vB.z), max(vA.w, vB.w));
    }

    public static Vec4i max_(Vec4i vA, Vec4i vB) {
        return max(vA, vB, new Vec4i());
    }

    public static Vec4i max(Vec4i vA, Vec4i vB, Vec4i res) {
        return res.set(max(vA.x, vB.x), max(vA.y, vB.y), max(vA.z, vB.z), max(vA.w, vB.w));
    }

    public static Vec4l max_(Vec4l vA, Vec4l vB) {
        return max(vA, vB, new Vec4l());
    }

    public static Vec4l max(Vec4l vA, Vec4l vB, Vec4l res) {
        return res.set(max(vA.x, vB.x), max(vA.y, vB.y), max(vA.z, vB.z), max(vA.w, vB.w));
    }

    public static Vec4s max_(Vec4s vA, Vec4s vB) {
        return max(vA, vB, new Vec4s());
    }

    public static Vec4s max(Vec4s vA, Vec4s vB, Vec4s res) {
        return res.set(max(vA.x, vB.x), max(vA.y, vB.y), max(vA.z, vB.z), max(vA.w, vB.w));
    }

    public static Vec4ub max_(Vec4ub vA, Vec4ub vB) {
        return max(vA, vB, new Vec4ub());
    }

    public static Vec4ub max(Vec4ub vA, Vec4ub vB, Vec4ub res) {
        return res.set(max(vA.x, vB.x), max(vA.y, vB.y), max(vA.z, vB.z), max(vA.w, vB.w));
    }

    public static Vec4ui max_(Vec4ui vA, Vec4ui vB) {
        return max(vA, vB, new Vec4ui());
    }

    public static Vec4ui max(Vec4ui vA, Vec4ui vB, Vec4ui res) {
        return res.set(max(vA.x, vB.x), max(vA.y, vB.y), max(vA.z, vB.z), max(vA.w, vB.w));
    }

    public static Vec4ul max_(Vec4ul vA, Vec4ul vB) {
        return max(vA, vB, new Vec4ul());
    }

    public static Vec4ul max(Vec4ul vA, Vec4ul vB, Vec4ul res) {
        return res.set(max(vA.x, vB.x), max(vA.y, vB.y), max(vA.z, vB.z), max(vA.w, vB.w));
    }

    public static Vec4us max_(Vec4us vA, Vec4us vB) {
        return max(vA, vB, new Vec4us());
    }

    public static Vec4us max(Vec4us vA, Vec4us vB, Vec4us res) {
        return res.set(max(vA.x, vB.x), max(vA.y, vB.y), max(vA.z, vB.z), max(vA.w, vB.w));
    }

    // min ----------------------------------------------------------------------------------------------------------
    public static float min(float sA, float sB) {
        return Math.min(sA, sB);
    }

    public static double min(double sA, double sB) {
        return Math.min(sA, sB);
    }

    public static int min(int sA, int sB) {
        return Math.min(sA, sB);
    }

    public static long min(long sA, long sB) {
        return Math.min(sA, sB);
    }

    public static UByte min(UByte sA, UByte sB) {
        return UMath.min(sA, sB);
    }

    public static UInt min(UInt sA, UInt sB) {
        return UMath.min(sA, sB);
    }

    public static ULong min(ULong sA, ULong sB) {
        return UMath.min(sA, sB);
    }

    public static UShort min(UShort sA, UShort sB) {
        return UMath.min(sA, sB);
    }

    // min(vec2, scalar) -------------------------------------------------------
    public static Vector2 min_(Vector2 v, float s) {
        return min(v, s, new Vector2());
    }

    public static Vector2 min(Vector2 v, float s, Vector2 res) {
        return res.set(min(v.x, s), min(v.y, s));
    }

    public static Vec2b min_(Vec2b v, byte s) {
        return min(v, s, new Vec2b());
    }

    public static Vec2b min(Vec2b v, byte s, Vec2b res) {
        return res.set(min(v.x, s), min(v.y, s));
    }

    public static Vec2d min_(Vec2d v, double s) {
        return min(v, s, new Vec2d());
    }

    public static Vec2d min(Vec2d v, double s, Vec2d res) {
        return res.set(min(v.x, s), min(v.y, s));
    }

    public static Vec2i min_(Vec2i v, int s) {
        return min(v, s, new Vec2i());
    }

    public static Vec2i min(Vec2i v, int s, Vec2i res) {
        return res.set(min(v.x, s), min(v.y, s));
    }

    public static Vec2l min_(Vec2l v, long s) {
        return min(v, s, new Vec2l());
    }

    public static Vec2l min(Vec2l v, long s, Vec2l res) {
        return res.set(min(v.x, s), min(v.y, s));
    }

    public static Vec2s min_(Vec2s v, short s) {
        return min(v, s, new Vec2s());
    }

    public static Vec2s min(Vec2s v, short s, Vec2s res) {
        return res.set(min(v.x, s), min(v.y, s));
    }

    public static Vec2ub min_(Vec2ub v, UByte s) {
        return min(v, s, new Vec2ub());
    }

    public static Vec2ub min(Vec2ub v, UByte s, Vec2ub res) {
        return res.set(min(v.x, s), min(v.y, s));
    }

    public static Vec2ui min_(Vec2ui v, UInt s) {
        return min(v, s, new Vec2ui());
    }

    public static Vec2ui min(Vec2ui v, UInt s, Vec2ui res) {
        return res.set(min(v.x, s), min(v.y, s));
    }

    public static Vec2ul min_(Vec2ul v, ULong s) {
        return min(v, s, new Vec2ul());
    }

    public static Vec2ul min(Vec2ul v, ULong s, Vec2ul res) {
        return res.set(min(v.x, s), min(v.y, s));
    }

    public static Vec2us min_(Vec2us v, UShort s) {
        return min(v, s, new Vec2us());
    }

    public static Vec2us min(Vec2us v, UShort s, Vec2us res) {
        return res.set(min(v.x, s), min(v.y, s));
    }

    // min(vec2, vec2) ---------------------------------------------------------
    public static Vector2 min_(Vector2 vA, Vector2 vB) {
        return min(vA, vB, new Vector2());
    }

    public static Vector2 min(Vector2 vA, Vector2 vB, Vector2 res) {
        return res.set(min(vA.x, vB.x), min(vA.y, vB.y));
    }

    public static Vec2b min_(Vec2b vA, Vec2b vB) {
        return min(vA, vB, new Vec2b());
    }

    public static Vec2b min(Vec2b va, Vec2b vB, Vec2b res) {
        return res.set(max(va.x, vB.x), max(va.y, vB.y));
    }

    public static Vec2d min_(Vec2d vA, Vec2d vB) {
        return min(vA, vB, new Vec2d());
    }

    public static Vec2d min(Vec2d vA, Vec2d vB, Vec2d res) {
        return res.set(min(vA.x, vB.x), min(vA.y, vB.y));
    }

    public static Vec2i min_(Vec2i vA, Vec2i vB) {
        return min(vA, vB, new Vec2i());
    }

    public static Vec2i min(Vec2i vA, Vec2i vB, Vec2i res) {
        return res.set(min(vA.x, vB.x), min(vA.y, vB.y));
    }

    public static Vec2l min_(Vec2l vA, Vec2l vB) {
        return min(vA, vB, new Vec2l());
    }

    public static Vec2l min(Vec2l vA, Vec2l vB, Vec2l res) {
        return res.set(min(vA.x, vB.x), min(vA.y, vB.y));
    }

    public static Vec2s min_(Vec2s vA, Vec2s vB) {
        return min(vA, vB, new Vec2s());
    }

    public static Vec2s min(Vec2s vA, Vec2s vB, Vec2s res) {
        return res.set(min(vA.x, vB.x), min(vA.y, vB.y));
    }

    public static Vec2ub min_(Vec2ub vA, Vec2ub vB) {
        return min(vA, vB, new Vec2ub());
    }

    public static Vec2ub min(Vec2ub vA, Vec2ub vB, Vec2ub res) {
        return res.set(min(vA.x, vB.x), min(vA.y, vB.y));
    }

    public static Vec2ui min_(Vec2ui vA, Vec2ui vB) {
        return min(vA, vB, new Vec2ui());
    }

    public static Vec2ui min(Vec2ui vA, Vec2ui vB, Vec2ui res) {
        return res.set(min(vA.x, vB.x), min(vA.y, vB.y));
    }

    public static Vec2ul min_(Vec2ul vA, Vec2ul vB) {
        return min(vA, vB, new Vec2ul());
    }

    public static Vec2ul min(Vec2ul vA, Vec2ul vB, Vec2ul res) {
        return res.set(min(vA.x, vB.x), min(vA.y, vB.y));
    }

    public static Vec2us min_(Vec2us vA, Vec2us vB) {
        return min(vA, vB, new Vec2us());
    }

    public static Vec2us min(Vec2us vA, Vec2us vB, Vec2us res) {
        return res.set(min(vA.x, vB.x), min(vA.y, vB.y));
    }

    // min(vec3, scalar) -------------------------------------------------------
    public static Vector3 min_(Vector3 v, float s) {
        return min(v, s, new Vector3());
    }

    public static Vector3 min(Vector3 v, float s, Vector3 res) {
        return res.set(min(v.x, s), min(v.y, s), min(v.z, s));
    }

    public static Vec3b min_(Vec3b v, byte s) {
        return min(v, s, new Vec3b());
    }

    public static Vec3b min(Vec3b v, byte s, Vec3b res) {
        return res.set(min(v.x, s), min(v.y, s), min(v.z, s));
    }

    public static Vec3d min_(Vec3d v, double s) {
        return min(v, s, new Vec3d());
    }

    public static Vec3d min(Vec3d v, double s, Vec3d res) {
        return res.set(min(v.x, s), min(v.y, s), min(v.z, s));
    }

    public static Vec3i min_(Vec3i v, int s) {
        return min(v, s, new Vec3i());
    }

    public static Vec3i min(Vec3i v, int s, Vec3i res) {
        return res.set(min(v.x, s), min(v.y, s), min(v.z, s));
    }

    public static Vec3l min_(Vec3l v, long s) {
        return min(v, s, new Vec3l());
    }

    public static Vec3l min(Vec3l v, long s, Vec3l res) {
        return res.set(min(v.x, s), min(v.y, s), min(v.z, s));
    }

    public static Vec3s min_(Vec3s v, short s) {
        return min(v, s, new Vec3s());
    }

    public static Vec3s min(Vec3s v, short s, Vec3s res) {
        return res.set(min(v.x, s), min(v.y, s), min(v.z, s));
    }

    public static Vec3ub min_(Vec3ub v, UByte s) {
        return min(v, s, new Vec3ub());
    }

    public static Vec3ub min(Vec3ub v, UByte s, Vec3ub res) {
        return res.set(min(v.x, s), min(v.y, s), min(v.z, s));
    }

    public static Vec3ui min_(Vec3ui v, UInt s) {
        return min(v, s, new Vec3ui());
    }

    public static Vec3ui min(Vec3ui v, UInt s, Vec3ui res) {
        return res.set(min(v.x, s), min(v.y, s), min(v.z, s));
    }

    public static Vec3ul min_(Vec3ul v, ULong s) {
        return min(v, s, new Vec3ul());
    }

    public static Vec3ul min(Vec3ul v, ULong s, Vec3ul res) {
        return res.set(min(v.x, s), min(v.y, s), min(v.z, s));
    }

    public static Vec3us min_(Vec3us v, UShort s) {
        return min(v, s, new Vec3us());
    }

    public static Vec3us min(Vec3us v, UShort s, Vec3us res) {
        return res.set(min(v.x, s), min(v.y, s), min(v.z, s));
    }

    // min(vec3, vec3) ---------------------------------------------------------
    public static Vector3 min_(Vector3 vA, Vector3 vB) {
        return min(vA, vB, new Vector3());
    }

    public static Vector3 min(Vector3 vA, Vector3 vB, Vector3 res) {
        return res.set(min(vA.x, vB.x), min(vA.y, vB.y), min(vA.z, vB.z));
    }

    public static Vec3b min_(Vec3b vA, Vec3b vB) {
        return min(vA, vB, new Vec3b());
    }

    public static Vec3b min(Vec3b vA, Vec3b vB, Vec3b res) {
        return res.set(min(vA.x, vB.x), min(vA.y, vB.y), min(vA.z, vB.z));
    }

    public static Vec3d min_(Vec3d vA, Vec3d vB) {
        return min(vA, vB, new Vec3d());
    }

    public static Vec3d min(Vec3d vA, Vec3d vB, Vec3d res) {
        return res.set(min(vA.x, vB.x), min(vA.y, vB.y), min(vA.z, vB.z));
    }

    public static Vec3i min_(Vec3i vA, Vec3i vB) {
        return min(vA, vB, new Vec3i());
    }

    public static Vec3i min(Vec3i vA, Vec3i vB, Vec3i res) {
        return res.set(min(vA.x, vB.x), min(vA.y, vB.y), min(vA.z, vB.z));
    }

    public static Vec3l min_(Vec3l vA, Vec3l vB) {
        return min(vA, vB, new Vec3l());
    }

    public static Vec3l min(Vec3l vA, Vec3l vB, Vec3l res) {
        return res.set(min(vA.x, vB.x), min(vA.y, vB.y), min(vA.z, vB.z));
    }

    public static Vec3s min_(Vec3s vA, Vec3s vB) {
        return min(vA, vB, new Vec3s());
    }

    public static Vec3s min(Vec3s vA, Vec3s vB, Vec3s res) {
        return res.set(min(vA.x, vB.x), min(vA.y, vB.y), min(vA.z, vB.z));
    }

    public static Vec3ub min_(Vec3ub vA, Vec3ub vB) {
        return min(vA, vB, new Vec3ub());
    }

    public static Vec3ub min(Vec3ub vA, Vec3ub vB, Vec3ub res) {
        return res.set(min(vA.x, vB.x), min(vA.y, vB.y), min(vA.z, vB.z));
    }

    public static Vec3ui min_(Vec3ui vA, Vec3ui vB) {
        return min(vA, vB, new Vec3ui());
    }

    public static Vec3ui min(Vec3ui vA, Vec3ui vB, Vec3ui res) {
        return res.set(min(vA.x, vB.x), min(vA.y, vB.y), min(vA.z, vB.z));
    }

    public static Vec3ul min_(Vec3ul vA, Vec3ul vB) {
        return min(vA, vB, new Vec3ul());
    }

    public static Vec3ul min(Vec3ul vA, Vec3ul vB, Vec3ul res) {
        return res.set(min(vA.x, vB.x), min(vA.y, vB.y), min(vA.z, vB.z));
    }

    public static Vec3us min_(Vec3us vA, Vec3us vB) {
        return min(vA, vB, new Vec3us());
    }

    public static Vec3us min(Vec3us vA, Vec3us vB, Vec3us res) {
        return res.set(min(vA.x, vB.x), min(vA.y, vB.y), min(vA.z, vB.z));
    }

    // min(vec4, scalar) -------------------------------------------------------
    public static Vector4 min_(Vector4 v, float s) {
        return min(v, s, new Vector4());
    }

    public static Vector4 min(Vector4 v, float s, Vector4 res) {
        return res.set(min(v.x, s), min(v.y, s), min(v.z, s), min(v.w, s));
    }

    public static Vec4b min_(Vec4b v, byte s) {
        return min(v, s, new Vec4b());
    }

    public static Vec4b min(Vec4b v, byte s, Vec4b res) {
        return res.set(min(v.x, s), min(v.y, s), min(v.z, s), min(v.w, s));
    }

    public static Vec4d min_(Vec4d v, double s) {
        return min(v, s, new Vec4d());
    }

    public static Vec4d min(Vec4d v, double s, Vec4d res) {
        return res.set(min(v.x, s), min(v.y, s), min(v.z, s), min(v.w, s));
    }

    public static Vec4i min_(Vec4i v, int s) {
        return min(v, s, new Vec4i());
    }

    public static Vec4i min(Vec4i v, int s, Vec4i res) {
        return res.set(min(v.x, s), min(v.y, s), min(v.z, s), min(v.w, s));
    }

    public static Vec4l min_(Vec4l v, long s) {
        return min(v, s, new Vec4l());
    }

    public static Vec4l min(Vec4l v, long s, Vec4l res) {
        return res.set(min(v.x, s), min(v.y, s), min(v.z, s), min(v.w, s));
    }

    public static Vec4s min_(Vec4s v, short s) {
        return min(v, s, new Vec4s());
    }

    public static Vec4s min(Vec4s v, short s, Vec4s res) {
        return res.set(min(v.x, s), min(v.y, s), min(v.z, s), min(v.w, s));
    }

    public static Vec4ub min_(Vec4ub v, UByte s) {
        return min(v, s, new Vec4ub());
    }

    public static Vec4ub min(Vec4ub v, UByte s, Vec4ub res) {
        return res.set(min(v.x, s), min(v.y, s), min(v.z, s), min(v.w, s));
    }

    public static Vec4ui min_(Vec4ui v, UInt s) {
        return min(v, s, new Vec4ui());
    }

    public static Vec4ui min(Vec4ui v, UInt s, Vec4ui res) {
        return res.set(min(v.x, s), min(v.y, s), min(v.z, s), min(v.w, s));
    }

    public static Vec4ul min_(Vec4ul v, ULong s) {
        return min(v, s, new Vec4ul());
    }

    public static Vec4ul min(Vec4ul v, ULong s, Vec4ul res) {
        return res.set(min(v.x, s), min(v.y, s), min(v.z, s), min(v.w, s));
    }

    public static Vec4us min_(Vec4us v, UShort s) {
        return min(v, s, new Vec4us());
    }

    public static Vec4us min(Vec4us v, UShort s, Vec4us res) {
        return res.set(min(v.x, s), min(v.y, s), min(v.z, s), min(v.w, s));
    }

    // min(vec4, vec4) ---------------------------------------------------------
    public static Vector4 min_(Vector4 vA, Vector4 vB) {
        return min(vA, vB, new Vector4());
    }

    public static Vector4 min(Vector4 vA, Vector4 vB, Vector4 res) {
        return res.set(min(vA.x, vB.x), min(vA.y, vB.y), min(vA.z, vB.z), min(vA.w, vB.w));
    }

    public static Vec4b min_(Vec4b vA, Vec4b vB) {
        return min(vA, vB, new Vec4b());
    }

    public static Vec4b min(Vec4b vA, Vec4b vB, Vec4b res) {
        return res.set(min(vA.x, vB.x), min(vA.y, vB.y), min(vA.z, vB.z), min(vA.w, vB.w));
    }

    public static Vec4d min_(Vec4d vA, Vec4d vB) {
        return min(vA, vB, new Vec4d());
    }

    public static Vec4d min(Vec4d vA, Vec4d vB, Vec4d res) {
        return res.set(min(vA.x, vB.x), min(vA.y, vB.y), min(vA.z, vB.z), min(vA.w, vB.w));
    }

    public static Vec4i min_(Vec4i vA, Vec4i vB) {
        return min(vA, vB, new Vec4i());
    }

    public static Vec4i min(Vec4i vA, Vec4i vB, Vec4i res) {
        return res.set(min(vA.x, vB.x), min(vA.y, vB.y), min(vA.z, vB.z), min(vA.w, vB.w));
    }

    public static Vec4l min_(Vec4l vA, Vec4l vB) {
        return min(vA, vB, new Vec4l());
    }

    public static Vec4l min(Vec4l vA, Vec4l vB, Vec4l res) {
        return res.set(min(vA.x, vB.x), min(vA.y, vB.y), min(vA.z, vB.z), min(vA.w, vB.w));
    }

    public static Vec4s min_(Vec4s vA, Vec4s vB) {
        return min(vA, vB, new Vec4s());
    }

    public static Vec4s min(Vec4s vA, Vec4s vB, Vec4s res) {
        return res.set(min(vA.x, vB.x), min(vA.y, vB.y), min(vA.z, vB.z), min(vA.w, vB.w));
    }

    public static Vec4ub min_(Vec4ub vA, Vec4ub vB) {
        return min(vA, vB, new Vec4ub());
    }

    public static Vec4ub min(Vec4ub vA, Vec4ub vB, Vec4ub res) {
        return res.set(min(vA.x, vB.x), min(vA.y, vB.y), min(vA.z, vB.z), min(vA.w, vB.w));
    }

    public static Vec4ui min_(Vec4ui vA, Vec4ui vB) {
        return min(vA, vB, new Vec4ui());
    }

    public static Vec4ui min(Vec4ui vA, Vec4ui vB, Vec4ui res) {
        return res.set(min(vA.x, vB.x), min(vA.y, vB.y), min(vA.z, vB.z), min(vA.w, vB.w));
    }

    public static Vec4ul min_(Vec4ul vA, Vec4ul vB) {
        return min(vA, vB, new Vec4ul());
    }

    public static Vec4ul min(Vec4ul vA, Vec4ul vB, Vec4ul res) {
        return res.set(min(vA.x, vB.x), min(vA.y, vB.y), min(vA.z, vB.z), min(vA.w, vB.w));
    }

    public static Vec4us min_(Vec4us vA, Vec4us vB) {
        return min(vA, vB, new Vec4us());
    }

    public static Vec4us min(Vec4us vA, Vec4us vB, Vec4us res) {
        return res.set(min(vA.x, vB.x), min(vA.y, vB.y), min(vA.z, vB.z), min(vA.w, vB.w));
    }

    // mix (scalar - scalar) ----------------------------------------------------------------------------------------
    public static float mix(float a, float b, float s) {
        return a + s * (b - a);
    }

    public static float mix(float a, float b, boolean bool) {
        return bool ? a : b;
    }

    public static double mix(double a, double b, double s) {
        return a + s * (b - a);
    }

    public static double mix(double a, double b, boolean bool) {
        return bool ? a : b;
    }

    public static int mix(int a, int b, int s) {
        return a + s * (b - a);
    }

    public static int mix(int a, int b, boolean bool) {
        return bool ? a : b;
    }

    public static long mix(long a, long b, long s) {
        return a + s * (b - a);
    }

    public static long mix(long a, long b, boolean bool) {
        return bool ? a : b;
    }

    // mix (vec - scalar) ------------------------------------------------------
    public static Vector2 mix_(Vector2 a, Vector2 b, float s) {
        return mix(a, b, s, new Vector2());
    }

    public static Vector2 mix(Vector2 a, Vector2 b, float s, Vector2 res) {
        res.x = mix(a.x, b.x, s);
        res.y = mix(a.y, b.y, s);
        return res;
    }

    public static Vector2 mix_(Vector2 a, Vector2 b, boolean bool) {
        return mix(a, b, bool, new Vector2());
    }

    public static Vector2 mix(Vector2 a, Vector2 b, boolean bool, Vector2 res) {
        res.x = mix(a.x, b.x, bool);
        res.y = mix(a.y, b.y, bool);
        return res;
    }

    public static Vec2d mix_(Vec2d a, Vec2d b, double s) {
        return mix(a, b, s, new Vec2d());
    }

    public static Vec2d mix(Vec2d a, Vec2d b, double s, Vec2d res) {
        res.x = mix(a.x, b.x, s);
        res.y = mix(a.y, b.y, s);
        return res;
    }

    public static Vec2d mix_(Vec2d a, Vec2d b, boolean bool) {
        return mix(a, b, bool, new Vec2d());
    }

    public static Vec2d mix(Vec2d a, Vec2d b, boolean bool, Vec2d res) {
        res.x = mix(a.x, b.x, bool);
        res.y = mix(a.y, b.y, bool);
        return res;
    }

    public static Vector3 mix_(Vector3 a, Vector3 b, float s) {
        return mix(a, b, s, new Vector3());
    }

    public static Vector3 mix(Vector3 a, Vector3 b, float s, Vector3 res) {
        res.x = mix(a.x, b.x, s);
        res.y = mix(a.y, b.y, s);
        res.z = mix(a.z, b.z, s);
        return res;
    }

    public static Vector3 mix_(Vector3 a, Vector3 b, boolean bool) {
        return mix(a, b, bool, new Vector3());
    }

    public static Vector3 mix(Vector3 a, Vector3 b, boolean bool, Vector3 res) {
        res.x = mix(a.x, b.x, bool);
        res.y = mix(a.y, b.y, bool);
        res.z = mix(a.z, b.z, bool);
        return res;
    }

    public static Vec3d mix_(Vec3d a, Vec3d b, double s) {
        return mix(a, b, s, new Vec3d());
    }

    public static Vec3d mix(Vec3d a, Vec3d b, double s, Vec3d res) {
        res.x = mix(a.x, b.x, s);
        res.y = mix(a.y, b.y, s);
        res.z = mix(a.z, b.z, s);
        return res;
    }

    public static Vec3d mix_(Vec3d a, Vec3d b, boolean bool) {
        return mix(a, b, bool, new Vec3d());
    }

    public static Vec3d mix(Vec3d a, Vec3d b, boolean bool, Vec3d res) {
        res.x = mix(a.x, b.x, bool);
        res.y = mix(a.y, b.y, bool);
        res.z = mix(a.z, b.z, bool);
        return res;
    }

    public static Vector4 mix_(Vector4 a, Vector4 b, float s) {
        return mix(a, b, s, new Vector4());
    }

    public static Vector4 mix(Vector4 a, Vector4 b, float s, Vector4 res) {
        res.x = mix(a.x, b.x, s);
        res.y = mix(a.y, b.y, s);
        res.z = mix(a.z, b.z, s);
        res.w = mix(a.w, b.w, s);
        return res;
    }

    public static Vector4 mix_(Vector4 a, Vector4 b, boolean bool) {
        return mix(a, b, bool, new Vector4());
    }

    public static Vector4 mix(Vector4 a, Vector4 b, boolean bool, Vector4 res) {
        res.x = mix(a.x, b.x, bool);
        res.y = mix(a.y, b.y, bool);
        res.z = mix(a.z, b.z, bool);
        res.w = mix(a.w, b.w, bool);
        return res;
    }

    public static Vec4d mix_(Vec4d a, Vec4d b, double s) {
        return mix(a, b, s, new Vec4d());
    }

    public static Vec4d mix(Vec4d a, Vec4d b, double s, Vec4d res) {
        res.x = mix(a.x, b.x, s);
        res.y = mix(a.y, b.y, s);
        res.z = mix(a.z, b.z, s);
        res.w = mix(a.w, b.w, s);
        return res;
    }

    public static Vec4d mix_(Vec4d a, Vec4d b, boolean bool) {
        return mix(a, b, bool, new Vec4d());
    }

    public static Vec4d mix(Vec4d a, Vec4d b, boolean bool, Vec4d res) {
        res.x = mix(a.x, b.x, bool);
        res.y = mix(a.y, b.y, bool);
        res.z = mix(a.z, b.z, bool);
        res.w = mix(a.w, b.w, bool);
        return res;
    }

    // mix (vec - vec) ---------------------------------------------------------
    public static Vector2 mix_(Vector2 a, Vector2 b, Vector2 v) {
        return mix(a, b, v, new Vector2());
    }

    public static Vector2 mix(Vector2 a, Vector2 b, Vector2 v, Vector2 res) {
        res.x = mix(a.x, b.x, v.x);
        res.y = mix(a.y, b.y, v.y);
        return res;
    }

    public static Vector2 mix_(Vector2 a, Vector2 b, Vec2bool v) {
        return mix(a, b, v, new Vector2());
    }

    public static Vector2 mix(Vector2 a, Vector2 b, Vec2bool v, Vector2 res) {
        res.x = mix(a.x, b.x, v.x);
        res.y = mix(a.y, b.y, v.y);
        return res;
    }

    public static Vec2d mix_(Vec2d a, Vec2d b, Vec2d v) {
        return mix(a, b, v, new Vec2d());
    }

    public static Vec2d mix(Vec2d a, Vec2d b, Vec2d v, Vec2d res) {
        res.x = mix(a.x, b.x, v.x);
        res.y = mix(a.y, b.y, v.y);
        return res;
    }

    public static Vec2d mix_(Vec2d a, Vec2d b, Vec2bool v) {
        return mix(a, b, v, new Vec2d());
    }

    public static Vec2d mix(Vec2d a, Vec2d b, Vec2bool v, Vec2d res) {
        res.x = mix(a.x, b.x, v.x);
        res.y = mix(a.y, b.y, v.y);
        return res;
    }

    public static Vector3 mix_(Vector3 a, Vector3 b, Vector3 v) {
        return mix(a, b, v, new Vector3());
    }

    public static Vector3 mix(Vector3 a, Vector3 b, Vector3 v, Vector3 res) {
        res.x = mix(a.x, b.x, v.x);
        res.y = mix(a.y, b.y, v.y);
        res.z = mix(a.z, b.z, v.z);
        return res;
    }

    public static Vector3 mix_(Vector3 a, Vector3 b, Vec3bool v) {
        return mix(a, b, v, new Vector3());
    }

    public static Vector3 mix(Vector3 a, Vector3 b, Vec3bool v, Vector3 res) {
        res.x = mix(a.x, b.x, v.x);
        res.y = mix(a.y, b.y, v.y);
        res.z = mix(a.z, b.z, v.z);
        return res;
    }

    public static Vec3d mix_(Vec3d a, Vec3d b, Vec3d v) {
        return mix(a, b, v, new Vec3d());
    }

    public static Vec3d mix(Vec3d a, Vec3d b, Vec3d v, Vec3d res) {
        res.x = mix(a.x, b.x, v.x);
        res.y = mix(a.y, b.y, v.y);
        res.z = mix(a.z, b.z, v.z);
        return res;
    }

    public static Vec3d mix_(Vec3d a, Vec3d b, Vec3bool v) {
        return mix(a, b, v, new Vec3d());
    }

    public static Vec3d mix(Vec3d a, Vec3d b, Vec3bool v, Vec3d res) {
        res.x = mix(a.x, b.x, v.x);
        res.y = mix(a.y, b.y, v.y);
        res.z = mix(a.z, b.z, v.z);
        return res;
    }

    public static Vector4 mix_(Vector4 a, Vector4 b, Vector4 v) {
        return mix(a, b, v, new Vector4());
    }

    public static Vector4 mix(Vector4 a, Vector4 b, Vector4 v, Vector4 res) {
        res.x = mix(a.x, b.x, v.x);
        res.y = mix(a.y, b.y, v.y);
        res.z = mix(a.z, b.z, v.z);
        res.w = mix(a.w, b.w, v.w);
        return res;
    }

    public static Vector4 mix_(Vector4 a, Vector4 b, Vec4bool v) {
        return mix(a, b, v, new Vector4());
    }

    public static Vector4 mix(Vector4 a, Vector4 b, Vec4bool v, Vector4 res) {
        res.x = mix(a.x, b.x, v.x);
        res.y = mix(a.y, b.y, v.y);
        res.z = mix(a.z, b.z, v.z);
        res.w = mix(a.w, b.w, v.w);
        return res;
    }

    public static Vec4d mix_(Vec4d a, Vec4d b, Vec4d v) {
        return mix(a, b, v, new Vec4d());
    }

    public static Vec4d mix(Vec4d a, Vec4d b, Vec4d v, Vec4d res) {
        res.x = mix(a.x, b.x, v.x);
        res.y = mix(a.y, b.y, v.y);
        res.z = mix(a.z, b.z, v.z);
        res.w = mix(a.w, b.w, v.w);
        return res;
    }

    public static Vec4d mix_(Vec4d a, Vec4d b, Vec4bool v) {
        return mix(a, b, v, new Vec4d());
    }

    public static Vec4d mix(Vec4d a, Vec4d b, Vec4bool v, Vec4d res) {
        res.x = mix(a.x, b.x, v.x);
        res.y = mix(a.y, b.y, v.y);
        res.z = mix(a.z, b.z, v.z);
        res.w = mix(a.w, b.w, v.w);
        return res;
    }

    // mod ---------------------------------------------------------------------
    public static float mod(float x, float y) {
        return x - y * floor(x / y);
    }

    public static double mod(double x, double y) {
        return x - y * floor(x / y);
    }

    public static Vector2 mod_(Vector2 v, float f) {
        return mod(v, f, new Vector2());
    }

    public static Vector2 mod(Vector2 v, float f, Vector2 res) {
        return res.set(mod(v.x, f), mod(v.y, f));
    }

    public static Vec2d mod_(Vec2d v, double d) {
        return mod(v, d, new Vec2d());
    }

    public static Vec2d mod(Vec2d v, double d, Vec2d res) {
        return res.set(mod(v.x, d), mod(v.y, d));
    }

    public static Vector2 mod_(Vector2 a, Vector2 b) {
        return mod(a, b, new Vector2());
    }

    public static Vector2 mod(Vector2 a, Vector2 b, Vector2 res) {
        return res.set(mod(a.x, b.x), mod(a.y, b.y));
    }

    public static Vec2d mod_(Vec2d a, Vec2d b) {
        return mod(a, b, new Vec2d());
    }

    public static Vec2d mod(Vec2d a, Vec2d b, Vec2d res) {
        return res.set(mod(a.x, b.x), mod(a.y, b.y));
    }

    public static Vector3 mod_(Vector3 v, float f) {
        return mod(v, f, new Vector3());
    }

    public static Vector3 mod(Vector3 v, float f, Vector3 res) {
        return res.set(mod(v.x, f), mod(v.y, f), mod(v.z, f));
    }

    public static Vec3d mod_(Vec3d v, double d) {
        return mod(v, d, new Vec3d());
    }

    public static Vec3d mod(Vec3d v, double d, Vec3d res) {
        return res.set(mod(v.x, d), mod(v.y, d), mod(v.z, d));
    }

    public static Vector3 mod_(Vector3 a, Vector3 b) {
        return mod(a, b, new Vector3());
    }

    public static Vector3 mod(Vector3 a, Vector3 b, Vector3 res) {
        return res.set(mod(a.x, b.x), mod(a.y, b.y), mod(a.z, b.z));
    }

    public static Vec3d mod_(Vec3d a, Vec3d b) {
        return mod(a, b, new Vec3d());
    }

    public static Vec3d mod(Vec3d a, Vec3d b, Vec3d res) {
        return res.set(mod(a.x, b.x), mod(a.y, b.y), mod(a.z, b.z));
    }

    public static Vector4 mod_(Vector4 v, float f) {
        return mod(v, f, new Vector4());
    }

    public static Vector4 mod(Vector4 v, float f, Vector4 res) {
        return res.set(mod(v.x, f), mod(v.y, f), mod(v.z, f), mod(v.w, f));
    }

    public static Vec4d mod_(Vec4d v, double d) {
        return mod(v, d, new Vec4d());
    }

    public static Vec4d mod(Vec4d v, double d, Vec4d res) {
        return res.set(mod(v.x, d), mod(v.y, d), mod(v.z, d), mod(v.w, d));
    }

    public static Vector4 mod_(Vector4 a, Vector4 b) {
        return mod(a, b, new Vector4());
    }

    public static Vector4 mod(Vector4 a, Vector4 b, Vector4 res) {
        return res.set(mod(a.x, b.x), mod(a.y, b.y), mod(a.z, b.z), mod(a.w, b.w));
    }

    public static Vec4d mod_(Vec4d a, Vec4d b) {
        return mod(a, b, new Vec4d());
    }

    public static Vec4d mod(Vec4d a, Vec4d b, Vec4d res) {
        return res.set(mod(a.x, b.x), mod(a.y, b.y), mod(a.z, b.z), mod(a.w, b.w));
    }

    // round -------------------------------------------------------------------
    public static int round(float f) {
        return Math.round(f);
    }

    public static long round(double d) {
        return Math.round(d);
    }

    public static Vector2 round_(Vector2 v) {
        return round(v, new Vector2());
    }

    public static Vector2 round(Vector2 v, Vector2 res) {
        return res.set(round(v.x), round(v.y));
    }

    public static Vec2d round_(Vec2d v) {
        return round(v, new Vec2d());
    }

    public static Vec2d round(Vec2d v, Vec2d res) {
        return res.set(round(v.x), round(v.y));
    }

    public static Vector3 round_(Vector3 v) {
        return round(v, new Vector3());
    }

    public static Vector3 round(Vector3 v, Vector3 res) {
        return res.set(round(v.x), round(v.y), round(v.z));
    }

    public static Vec3d round_(Vec3d v) {
        return round(v, new Vec3d());
    }

    public static Vec3d round(Vec3d v, Vec3d res) {
        return res.set(round(v.x), round(v.y), round(v.z));
    }

    public static Vector4 round_(Vector4 v) {
        return round(v, new Vector4());
    }

    public static Vector4 round(Vector4 v, Vector4 res) {
        return res.set(round(v.x), round(v.y), round(v.z), round(v.w));
    }

    public static Vec4d round_(Vec4d v) {
        return round(v, new Vec4d());
    }

    public static Vec4d round(Vec4d v, Vec4d res) {
        return res.set(round(v.x), round(v.y), round(v.z), round(v.w));
    }

    // roundEven ---------------------------------------------------------------
    public static int roundEven(float f) {
        int integerPart = (int) f;
        float fractionalPart = fract(f);
        if (fractionalPart > 0.5f || fractionalPart < 0.5f) {
            return round(f);
        } else if ((integerPart % 2) == 0) {
            return integerPart;
        } else if (f <= 0) {    // Work around... 
            return integerPart - 1;
        } else {
            return integerPart + 1;
        }
    }

    public static long roundEven(double d) {
        long integerPart = (long) d;
        double fractionalPart = fract(d);
        if (fractionalPart > 0.5f || fractionalPart < 0.5f) {
            return round(d);
        } else if ((integerPart % 2) == 0) {
            return integerPart;
        } else if (d <= 0) {    // Work around... 
            return integerPart - 1;
        } else {
            return integerPart + 1;
        }
    }

    public static Vector2 roundEven_(Vector2 v) {
        return roundEven(v, new Vector2());
    }

    public static Vector2 roundEven(Vector2 v, Vector2 res) {
        return res.set(roundEven(v.x), roundEven(v.y));
    }

    public static Vec2d roundEven_(Vec2d v) {
        return roundEven(v, new Vec2d());
    }

    public static Vec2d roundEven(Vec2d v, Vec2d res) {
        return res.set(roundEven(v.x), roundEven(v.y));
    }

    public static Vector3 roundEven_(Vector3 v) {
        return roundEven(v, new Vector3());
    }

    public static Vector3 roundEven(Vector3 v, Vector3 res) {
        return res.set(roundEven(v.x), roundEven(v.y), roundEven(v.z));
    }

    public static Vec3d roundEven_(Vec3d v) {
        return roundEven(v, new Vec3d());
    }

    public static Vec3d roundEven(Vec3d v, Vec3d res) {
        return res.set(roundEven(v.x), roundEven(v.y), roundEven(v.z));
    }

    public static Vector4 roundEven_(Vector4 v) {
        return roundEven(v, new Vector4());
    }

    public static Vector4 roundEven(Vector4 v, Vector4 res) {
        return res.set(roundEven(v.x), roundEven(v.y), roundEven(v.z), roundEven(v.w));
    }

    public static Vec4d roundEven_(Vec4d v) {
        return roundEven(v, new Vec4d());
    }

    public static Vec4d roundEven(Vec4d v, Vec4d res) {
        return res.set(roundEven(v.x), roundEven(v.y), roundEven(v.z), roundEven(v.w));
    }

    // sign --------------------------------------------------------------------
    public static float sign(float f) {
        return Math.signum(f);
    }

    public static double sign(double d) {
        return Math.signum(d);
    }

    public static int sign(int i) {
        return (int) Math.signum(i);
    }

    public static Vector2 sign_(Vector2 v) {
        return sign(v, new Vector2());
    }

    public static Vector2 sign(Vector2 v, Vector2 res) {
        return res.set(sign(v.x), sign(v.y));
    }

    public static Vec2d sign_(Vec2d v) {
        return sign(v, new Vec2d());
    }

    public static Vec2d sign(Vec2d v, Vec2d res) {
        return res.set(sign(v.x), sign(v.y));
    }

    public static Vec2i sign_(Vec2i v) {
        return sign(v, new Vec2i());
    }

    public static Vec2i sign(Vec2i v, Vec2i res) {
        return res.set(sign(v.x), sign(v.y));
    }

    public static Vector3 sign_(Vector3 v) {
        return sign(v, new Vector3());
    }

    public static Vector3 sign(Vector3 v, Vector3 res) {
        return res.set(sign(v.x), sign(v.y), sign(v.z));
    }

    public static Vec3d sign_(Vec3d v) {
        return sign(v, new Vec3d());
    }

    public static Vec3d sign(Vec3d v, Vec3d res) {
        return res.set(sign(v.x), sign(v.y), sign(v.z));
    }

    public static Vec3i sign_(Vec3i v) {
        return sign(v, new Vec3i());
    }

    public static Vec3i sign(Vec3i v, Vec3i res) {
        return res.set(sign(v.x), sign(v.y), sign(v.z));
    }

    public static Vector4 sign_(Vector4 v) {
        return sign(v, new Vector4());
    }

    public static Vector4 sign(Vector4 v, Vector4 res) {
        return res.set(sign(v.x), sign(v.y), sign(v.z), sign(v.w));
    }

    public static Vec4d sign_(Vec4d v) {
        return sign(v, new Vec4d());
    }

    public static Vec4d sign(Vec4d v, Vec4d res) {
        return res.set(sign(v.x), sign(v.y), sign(v.z), sign(v.w));
    }

    public static Vec4i sign_(Vec4i v) {
        return sign(v, new Vec4i());
    }

    public static Vec4i sign(Vec4i v, Vec4i res) {
        return res.set(sign(v.x), sign(v.y), sign(v.z), sign(v.w));
    }

    // smoothstep ---------------------------------------------------------------------------------------------------
    public static double smoothstep(double edge0, double edge1, double s) {
        double t = clamp((s - edge0) / (edge1 - edge0), 0, 1);
        return t * t * (3 - 2 * t);
    }

    public static float smoothstep(float edge0, float edge1, float s) {
        float t = clamp((s - edge0) / (edge1 - edge0), 0, 1);
        return t * t * (3 - 2 * t);
    }

    public static Vec2d smoothstep_(double edge0, double edge1, Vec2d s) {
        return smoothstep(edge0, edge1, s, new Vec2d());
    }

    public static Vec2d smoothstep(double edge0, double edge1, Vec2d s, Vec2d res) {
        double tX = clamp((s.x - edge0) / (edge1 - edge0), 0, 1);
        double tY = clamp((s.y - edge0) / (edge1 - edge0), 0, 1);
        res.x = tX * tX * (3 - 2 * tX);
        res.y = tY * tY * (3 - 2 * tY);
        return res;
    }

    public static Vector2 smoothstep_(float edge0, float edge1, Vector2 s) {
        return smoothstep(edge0, edge1, s, new Vector2());
    }

    public static Vector2 smoothstep(float edge0, float edge1, Vector2 s, Vector2 res) {
        float tX = clamp((s.x - edge0) / (edge1 - edge0), 0, 1);
        float tY = clamp((s.y - edge0) / (edge1 - edge0), 0, 1);
        res.x = tX * tX * (3 - 2 * tX);
        res.y = tY * tY * (3 - 2 * tY);
        return res;
    }

    public static Vec3d smoothstep_(double edge0, double edge1, Vec3d s) {
        return smoothstep(edge0, edge1, s, new Vec3d());
    }

    public static Vec3d smoothstep(double edge0, double edge1, Vec3d s, Vec3d res) {
        double tX = clamp((s.x - edge0) / (edge1 - edge0), 0, 1);
        double tY = clamp((s.y - edge0) / (edge1 - edge0), 0, 1);
        double tZ = clamp((s.z - edge0) / (edge1 - edge0), 0, 1);
        res.x = tX * tX * (3 - 2 * tX);
        res.y = tY * tY * (3 - 2 * tY);
        res.z = tZ * tZ * (3 - 2 * tZ);
        return res;
    }

    public static Vector3 smoothstep_(float edge0, float edge1, Vector3 s) {
        return smoothstep(edge0, edge1, s, new Vector3());
    }

    public static Vector3 smoothstep(float edge0, float edge1, Vector3 s, Vector3 res) {
        float tX = clamp((s.x - edge0) / (edge1 - edge0), 0, 1);
        float tY = clamp((s.y - edge0) / (edge1 - edge0), 0, 1);
        float tZ = clamp((s.z - edge0) / (edge1 - edge0), 0, 1);
        res.x = tX * tX * (3 - 2 * tX);
        res.y = tY * tY * (3 - 2 * tY);
        res.z = tZ * tZ * (3 - 2 * tZ);
        return res;
    }

    public static Vec4d smoothstep_(double edge0, double edge1, Vec4d s) {
        return smoothstep(edge0, edge1, s, new Vec4d());
    }

    public static Vec4d smoothstep(double edge0, double edge1, Vec4d s, Vec4d res) {
        double tX = clamp((s.x - edge0) / (edge1 - edge0), 0, 1);
        double tY = clamp((s.y - edge0) / (edge1 - edge0), 0, 1);
        double tZ = clamp((s.z - edge0) / (edge1 - edge0), 0, 1);
        double tW = clamp((s.w - edge0) / (edge1 - edge0), 0, 1);
        res.x = tX * tX * (3 - 2 * tX);
        res.y = tY * tY * (3 - 2 * tY);
        res.z = tZ * tZ * (3 - 2 * tZ);
        res.w = tW * tW * (3 - 2 * tW);
        return res;
    }

    public static Vector4 smoothstep_(float edge0, float edge1, Vector4 s) {
        return smoothstep(edge0, edge1, s, new Vector4());
    }

    public static Vector4 smoothstep(float edge0, float edge1, Vector4 s, Vector4 res) {
        float tX = clamp((s.x - edge0) / (edge1 - edge0), 0, 1);
        float tY = clamp((s.y - edge0) / (edge1 - edge0), 0, 1);
        float tZ = clamp((s.z - edge0) / (edge1 - edge0), 0, 1);
        float tW = clamp((s.w - edge0) / (edge1 - edge0), 0, 1);
        res.x = tX * tX * (3 - 2 * tX);
        res.y = tY * tY * (3 - 2 * tY);
        res.z = tZ * tZ * (3 - 2 * tZ);
        res.w = tW * tW * (3 - 2 * tW);
        return res;
    }

    // step ---------------------------------------------------------------------------------------------------------
    public static float step(byte edge, byte s) {
        return s < edge ? 0 : 1;
    }

    public static float step(double edge, double s) {
        return s < edge ? 0 : 1;
    }

    public static float step(float edge, float s) {
        return s < edge ? 0 : 1;
    }

    public static float step(int edge, int s) {
        return s < edge ? 0 : 1;
    }

    public static float step(long edge, long s) {
        return s < edge ? 0 : 1;
    }

    public static float step(short edge, short s) {
        return s < edge ? 0 : 1;
    }

    // step (scalar, vec2) -----------------------------------------------------
    public static Vec2b step_(byte edge, Vec2b v) {
        return step(edge, v, new Vec2b());
    }

    public static Vec2b step(byte edge, Vec2b v, Vec2b res) {
        res.x = v.x < edge ? (byte) 0 : (byte) 1;
        res.y = v.y < edge ? (byte) 0 : (byte) 1;
        return res;
    }

    public static Vec2d step_(double edge, Vec2d v) {
        return step(edge, v, new Vec2d());
    }

    public static Vec2d step(double edge, Vec2d v, Vec2d res) {
        res.x = v.x < edge ? 0 : 1;
        res.y = v.y < edge ? 0 : 1;
        return res;
    }

    public static Vector2 step_(float edge, Vector2 v) {
        return step(edge, v, new Vector2());
    }

    public static Vector2 step(float edge, Vector2 v, Vector2 res) {
        res.x = v.x < edge ? 0 : 1;
        res.y = v.y < edge ? 0 : 1;
        return res;
    }

    public static Vec2i step_(int edge, Vec2i v) {
        return step(edge, v, new Vec2i());
    }

    public static Vec2i step(int edge, Vec2i v, Vec2i res) {
        res.x = v.x < edge ? 0 : 1;
        res.y = v.y < edge ? 0 : 1;
        return res;
    }

    public static Vec2l step_(long edge, Vec2l v) {
        return step(edge, v, new Vec2l());
    }

    public static Vec2l step(long edge, Vec2l v, Vec2l res) {
        res.x = v.x < edge ? 0 : 1;
        res.y = v.y < edge ? 0 : 1;
        return res;
    }

    public static Vec2s step_(short edge, Vec2s v) {
        return step(edge, v, new Vec2s());
    }

    public static Vec2s step(short edge, Vec2s v, Vec2s res) {
        res.x = v.x < edge ? (short) 0 : (short) 1;
        res.y = v.y < edge ? (short) 0 : (short) 1;
        return res;
    }

    public static Vec2ub step_(UByte edge, Vec2ub v) {
        return step(edge, v, new Vec2ub());
    }

    public static Vec2ub step(UByte edge, Vec2ub v, Vec2ub res) {
        res.x.value = (byte) (v.x.compareTo(edge) < 0 ? 0 : 1);
        res.y.value = (byte) (v.y.compareTo(edge) < 0 ? 0 : 1);
        return res;
    }

    public static Vec2ui step_(UInt edge, Vec2ui v) {
        return step(edge, v, new Vec2ui());
    }

    public static Vec2ui step(UInt edge, Vec2ui v, Vec2ui res) {
        res.x.value = v.x.compareTo(edge) < 0 ? 0 : 1;
        res.y.value = v.y.compareTo(edge) < 0 ? 0 : 1;
        return res;
    }

    public static Vec2ul step_(ULong edge, Vec2ul v) {
        return step(edge, v, new Vec2ul());
    }

    public static Vec2ul step(ULong edge, Vec2ul v, Vec2ul res) {
        res.x.value = v.x.compareTo(edge) < 0 ? 0 : 1;
        res.y.value = v.y.compareTo(edge) < 0 ? 0 : 1;
        return res;
    }

    public static Vec2us step_(UShort edge, Vec2us v) {
        return step(edge, v, new Vec2us());
    }

    public static Vec2us step(UShort edge, Vec2us v, Vec2us res) {
        res.x.value = (short) (v.x.compareTo(edge) < 0 ? 0 : 1);
        res.y.value = (short) (v.y.compareTo(edge) < 0 ? 0 : 1);
        return res;
    }

    // step (scalar, vec3) -----------------------------------------------------
    public static Vec3b step_(byte edge, Vec3b v) {
        return step(edge, v, new Vec3b());
    }

    public static Vec3b step(byte edge, Vec3b v, Vec3b res) {
        res.x = v.x < edge ? (byte) 0 : (byte) 1;
        res.y = v.y < edge ? (byte) 0 : (byte) 1;
        res.z = v.z < edge ? (byte) 0 : (byte) 1;
        return res;
    }

    public static Vec3d step_(double edge, Vec3d v) {
        return step(edge, v, new Vec3d());
    }

    public static Vec3d step(double edge, Vec3d v, Vec3d res) {
        res.x = v.x < edge ? 0 : 1;
        res.y = v.y < edge ? 0 : 1;
        res.z = v.z < edge ? 0 : 1;
        return res;
    }

    public static Vector3 step_(float edge, Vector3 v) {
        return step(edge, v, new Vector3());
    }

    public static Vector3 step(float edge, Vector3 v, Vector3 res) {
        res.x = v.x < edge ? 0 : 1;
        res.y = v.y < edge ? 0 : 1;
        res.z = v.z < edge ? 0 : 1;
        return res;
    }

    public static Vec3i step_(int edge, Vec3i v) {
        return step(edge, v, new Vec3i());
    }

    public static Vec3i step(int edge, Vec3i v, Vec3i res) {
        res.x = v.x < edge ? 0 : 1;
        res.y = v.y < edge ? 0 : 1;
        res.z = v.z < edge ? 0 : 1;
        return res;
    }

    public static Vec3l step_(long edge, Vec3l v) {
        return step(edge, v, new Vec3l());
    }

    public static Vec3l step(long edge, Vec3l v, Vec3l res) {
        res.x = v.x < edge ? 0 : 1;
        res.y = v.y < edge ? 0 : 1;
        res.z = v.z < edge ? 0 : 1;
        return res;
    }

    public static Vec3s step_(short edge, Vec3s v) {
        return step(edge, v, new Vec3s());
    }

    public static Vec3s step(short edge, Vec3s v, Vec3s res) {
        res.x = v.x < edge ? (short) 0 : (short) 1;
        res.y = v.y < edge ? (short) 0 : (short) 1;
        res.z = v.z < edge ? (short) 0 : (short) 1;
        return res;
    }

    public static Vec3ub step_(UByte edge, Vec3ub v) {
        return step(edge, v, new Vec3ub());
    }

    public static Vec3ub step(UByte edge, Vec3ub v, Vec3ub res) {
        res.x.value = (byte) (v.x.compareTo(edge) < 0 ? 0 : 1);
        res.y.value = (byte) (v.y.compareTo(edge) < 0 ? 0 : 1);
        res.z.value = (byte) (v.z.compareTo(edge) < 0 ? 0 : 1);
        return res;
    }

    public static Vec3ui step_(UInt edge, Vec3ui v) {
        return step(edge, v, new Vec3ui());
    }

    public static Vec3ui step(UInt edge, Vec3ui v, Vec3ui res) {
        res.x.value = v.x.compareTo(edge) < 0 ? 0 : 1;
        res.y.value = v.y.compareTo(edge) < 0 ? 0 : 1;
        res.z.value = v.z.compareTo(edge) < 0 ? 0 : 1;
        return res;
    }

    public static Vec3ul step_(ULong edge, Vec3ul v) {
        return step(edge, v, new Vec3ul());
    }

    public static Vec3ul step(ULong edge, Vec3ul v, Vec3ul res) {
        res.x.value = v.x.compareTo(edge) < 0 ? 0 : 1;
        res.y.value = v.y.compareTo(edge) < 0 ? 0 : 1;
        res.z.value = v.z.compareTo(edge) < 0 ? 0 : 1;
        return res;
    }

    public static Vec3us step_(UShort edge, Vec3us v) {
        return step(edge, v, new Vec3us());
    }

    public static Vec3us step(UShort edge, Vec3us v, Vec3us res) {
        res.x.value = (short) (v.x.compareTo(edge) < 0 ? 0 : 1);
        res.y.value = (short) (v.y.compareTo(edge) < 0 ? 0 : 1);
        res.z.value = (short) (v.z.compareTo(edge) < 0 ? 0 : 1);
        return res;
    }

    // step (scalara, vec4) ----------------------------------------------------
    public static Vec4b step_(byte edge, Vec4b v) {
        return step(edge, v, new Vec4b());
    }

    public static Vec4b step(byte edge, Vec4b v, Vec4b res) {
        res.x = v.x < edge ? (byte) 0 : (byte) 1;
        res.y = v.y < edge ? (byte) 0 : (byte) 1;
        res.z = v.z < edge ? (byte) 0 : (byte) 1;
        return res;
    }

    public static Vec4d step_(double edge, Vec4d v) {
        return step(edge, v, new Vec4d());
    }

    public static Vec4d step(double edge, Vec4d v, Vec4d res) {
        res.x = v.x < edge ? 0 : 1;
        res.y = v.y < edge ? 0 : 1;
        res.z = v.z < edge ? 0 : 1;
        res.w = v.w < edge ? 0 : 1;
        return res;
    }

    public static Vector4 step_(float edge, Vector4 v) {
        return step(edge, v, new Vector4());
    }

    public static Vector4 step(float edge, Vector4 v, Vector4 res) {
        res.x = v.x < edge ? 0 : 1;
        res.y = v.y < edge ? 0 : 1;
        res.z = v.z < edge ? 0 : 1;
        res.w = v.w < edge ? 0 : 1;
        return res;
    }

    public static Vec4i step_(int edge, Vec4i v) {
        return step(edge, v, new Vec4i());
    }

    public static Vec4i step(int edge, Vec4i v, Vec4i res) {
        res.x = v.x < edge ? 0 : 1;
        res.y = v.y < edge ? 0 : 1;
        res.z = v.z < edge ? 0 : 1;
        res.w = v.w < edge ? 0 : 1;
        return res;
    }

    public static Vec4l step_(long edge, Vec4l v) {
        return step(edge, v, new Vec4l());
    }

    public static Vec4l step(long edge, Vec4l v, Vec4l res) {
        res.x = v.x < edge ? 0 : 1;
        res.y = v.y < edge ? 0 : 1;
        res.z = v.z < edge ? 0 : 1;
        res.w = v.w < edge ? 0 : 1;
        return res;
    }

    public static Vec4s step_(short edge, Vec4s v) {
        return step(edge, v, new Vec4s());
    }

    public static Vec4s step(short edge, Vec4s v, Vec4s res) {
        res.x = v.x < edge ? (short) 0 : (short) 1;
        res.y = v.y < edge ? (short) 0 : (short) 1;
        res.z = v.z < edge ? (short) 0 : (short) 1;
        res.w = v.w < edge ? (short) 0 : (short) 1;
        return res;
    }

    public static Vec4ub step_(UByte edge, Vec4ub v) {
        return step(edge, v, new Vec4ub());
    }

    public static Vec4ub step(UByte edge, Vec4ub v, Vec4ub res) {
        res.x.value = (byte) (v.x.compareTo(edge) < 0 ? 0 : 1);
        res.y.value = (byte) (v.y.compareTo(edge) < 0 ? 0 : 1);
        res.z.value = (byte) (v.z.compareTo(edge) < 0 ? 0 : 1);
        return res;
    }

    public static Vec4ui step_(UInt edge, Vec4ui v) {
        return step(edge, v, new Vec4ui());
    }

    public static Vec4ui step(UInt edge, Vec4ui v, Vec4ui res) {
        res.x.value = v.x.compareTo(edge) < 0 ? 0 : 1;
        res.y.value = v.y.compareTo(edge) < 0 ? 0 : 1;
        res.z.value = v.z.compareTo(edge) < 0 ? 0 : 1;
        res.w.value = v.w.compareTo(edge) < 0 ? 0 : 1;
        return res;
    }

    public static Vec4ul step_(ULong edge, Vec4ul v) {
        return step(edge, v, new Vec4ul());
    }

    public static Vec4ul step(ULong edge, Vec4ul v, Vec4ul res) {
        res.x.value = v.x.compareTo(edge) < 0 ? 0 : 1;
        res.y.value = v.y.compareTo(edge) < 0 ? 0 : 1;
        res.z.value = v.z.compareTo(edge) < 0 ? 0 : 1;
        res.w.value = v.w.compareTo(edge) < 0 ? 0 : 1;
        return res;
    }

    public static Vec4us step_(UShort edge, Vec4us v) {
        return step(edge, v, new Vec4us());
    }

    public static Vec4us step(UShort edge, Vec4us v, Vec4us res) {
        res.x.value = (short) (v.x.compareTo(edge) < 0 ? 0 : 1);
        res.y.value = (short) (v.y.compareTo(edge) < 0 ? 0 : 1);
        res.z.value = (short) (v.z.compareTo(edge) < 0 ? 0 : 1);
        res.w.value = (short) (v.w.compareTo(edge) < 0 ? 0 : 1);
        return res;
    }

    // step (vec2, vec2) -----------------------------------------------------
    public static Vec2b step_(Vec2b edge, Vec2b v) {
        return step(edge, v, new Vec2b());
    }

    public static Vec2b step(Vec2b edge, Vec2b v, Vec2b res) {
        res.x = v.x < edge.x ? (byte) 0 : (byte) 1;
        res.y = v.y < edge.y ? (byte) 0 : (byte) 1;
        return res;
    }

    public static Vec2d step_(Vec2d edge, Vec2d v) {
        return step(edge, v, new Vec2d());
    }

    public static Vec2d step(Vec2d edge, Vec2d v, Vec2d res) {
        res.x = v.x < edge.x ? 0 : 1;
        res.y = v.y < edge.y ? 0 : 1;
        return res;
    }

    public static Vector2 step_(Vector2 edge, Vector2 v) {
        return step(edge, v, new Vector2());
    }

    public static Vector2 step(Vector2 edge, Vector2 v, Vector2 res) {
        res.x = v.x < edge.x ? 0 : 1;
        res.y = v.y < edge.y ? 0 : 1;
        return res;
    }

    public static Vec2i step_(Vec2i edge, Vec2i v) {
        return step(edge, v, new Vec2i());
    }

    public static Vec2i step(Vec2i edge, Vec2i v, Vec2i res) {
        res.x = v.x < edge.x ? 0 : 1;
        res.y = v.y < edge.y ? 0 : 1;
        return res;
    }

    public static Vec2l step_(Vec2l edge, Vec2l v) {
        return step(edge, v, new Vec2l());
    }

    public static Vec2l step(Vec2l edge, Vec2l v, Vec2l res) {
        res.x = v.x < edge.x ? 0 : 1;
        res.y = v.y < edge.y ? 0 : 1;
        return res;
    }

    public static Vec2s step_(Vec2s edge, Vec2s v) {
        return step(edge, v, new Vec2s());
    }

    public static Vec2s step(Vec2s edge, Vec2s v, Vec2s res) {
        res.x = v.x < edge.x ? (short) 0 : (short) 1;
        res.y = v.y < edge.y ? (short) 0 : (short) 1;
        return res;
    }

    public static Vec2ub step_(Vec2ub edge, Vec2ub v) {
        return step(edge, v, new Vec2ub());
    }

    public static Vec2ub step(Vec2ub edge, Vec2ub v, Vec2ub res) {
        res.x.value = (byte) (v.x.compareTo(edge.x) < 0 ? 0 : 1);
        res.y.value = (byte) (v.y.compareTo(edge.x) < 0 ? 0 : 1);
        return res;
    }

    public static Vec2ui step_(Vec2ui edge, Vec2ui v) {
        return step(edge, v, new Vec2ui());
    }

    public static Vec2ui step(Vec2ui edge, Vec2ui v, Vec2ui res) {
        res.x.value = v.x.compareTo(edge.x) < 0 ? 0 : 1;
        res.y.value = v.y.compareTo(edge.y) < 0 ? 0 : 1;
        return res;
    }

    public static Vec2ul step_(Vec2ul edge, Vec2ul v) {
        return step(edge, v, new Vec2ul());
    }

    public static Vec2ul step(Vec2ul edge, Vec2ul v, Vec2ul res) {
        res.x.value = v.x.compareTo(edge.x) < 0 ? 0 : 1;
        res.y.value = v.y.compareTo(edge.y) < 0 ? 0 : 1;
        return res;
    }

    public static Vec2us step_(Vec2us edge, Vec2us v) {
        return step(edge, v, new Vec2us());
    }

    public static Vec2us step(Vec2us edge, Vec2us v, Vec2us res) {
        res.x.value = (short) (v.x.compareTo(edge.x) < 0 ? 0 : 1);
        res.y.value = (short) (v.y.compareTo(edge.y) < 0 ? 0 : 1);
        return res;
    }

    // step (vec3, vec3) -------------------------------------------------------
    public static Vec3b step_(Vec3b edge, Vec3b v) {
        return step(edge, v, new Vec3b());
    }

    public static Vec3b step(Vec3b edge, Vec3b v, Vec3b res) {
        res.x = v.x < edge.x ? (byte) 0 : (byte) 1;
        res.y = v.y < edge.y ? (byte) 0 : (byte) 1;
        res.z = v.z < edge.z ? (byte) 0 : (byte) 1;
        return res;
    }

    public static Vec3d step_(Vec3d edge, Vec3d v) {
        return step(edge, v, new Vec3d());
    }

    public static Vec3d step(Vec3d edge, Vec3d v, Vec3d res) {
        res.x = v.x < edge.x ? 0 : 1;
        res.y = v.y < edge.y ? 0 : 1;
        res.z = v.z < edge.z ? 0 : 1;
        return res;
    }

    public static Vector3 step_(Vector3 edge, Vector3 v) {
        return step(edge, v, new Vector3());
    }

    public static Vector3 step(Vector3 edge, Vector3 v, Vector3 res) {
        res.x = v.x < edge.x ? 0 : 1;
        res.y = v.y < edge.y ? 0 : 1;
        res.z = v.z < edge.z ? 0 : 1;
        return res;
    }

    public static Vec3i step_(Vec3i edge, Vec3i v) {
        return step(edge, v, new Vec3i());
    }

    public static Vec3i step(Vec3i edge, Vec3i v, Vec3i res) {
        res.x = v.x < edge.x ? 0 : 1;
        res.y = v.y < edge.y ? 0 : 1;
        res.z = v.z < edge.z ? 0 : 1;
        return res;
    }

    public static Vec3l step_(Vec3l edge, Vec3l v) {
        return step(edge, v, new Vec3l());
    }

    public static Vec3l step(Vec3l edge, Vec3l v, Vec3l res) {
        res.x = v.x < edge.x ? 0 : 1;
        res.y = v.y < edge.y ? 0 : 1;
        res.z = v.z < edge.z ? 0 : 1;
        return res;
    }

    public static Vec3s step_(Vec3s edge, Vec3s v) {
        return step(edge, v, new Vec3s());
    }

    public static Vec3s step(Vec3s edge, Vec3s v, Vec3s res) {
        res.x = v.x < edge.x ? (short) 0 : (short) 1;
        res.y = v.y < edge.y ? (short) 0 : (short) 1;
        res.z = v.z < edge.z ? (short) 0 : (short) 1;
        return res;
    }

    public static Vec3ub step_(Vec3ub edge, Vec3ub v) {
        return step(edge, v, new Vec3ub());
    }

    public static Vec3ub step(Vec3ub edge, Vec3ub v, Vec3ub res) {
        res.x.value = (byte) (v.x.compareTo(edge.x) < 0 ? 0 : 1);
        res.y.value = (byte) (v.y.compareTo(edge.y) < 0 ? 0 : 1);
        res.z.value = (byte) (v.z.compareTo(edge.z) < 0 ? 0 : 1);
        return res;
    }

    public static Vec3ui step_(Vec3ui edge, Vec3ui v) {
        return step(edge, v, new Vec3ui());
    }

    public static Vec3ui step(Vec3ui edge, Vec3ui v, Vec3ui res) {
        res.x.value = v.x.compareTo(edge.x) < 0 ? 0 : 1;
        res.y.value = v.y.compareTo(edge.y) < 0 ? 0 : 1;
        res.z.value = v.z.compareTo(edge.z) < 0 ? 0 : 1;
        return res;
    }

    public static Vec3ul step_(Vec3ul edge, Vec3ul v) {
        return step(edge, v, new Vec3ul());
    }

    public static Vec3ul step(Vec3ul edge, Vec3ul v, Vec3ul res) {
        res.x.value = v.x.compareTo(edge.x) < 0 ? 0 : 1;
        res.y.value = v.y.compareTo(edge.y) < 0 ? 0 : 1;
        res.z.value = v.z.compareTo(edge.z) < 0 ? 0 : 1;
        return res;
    }

    public static Vec3us step_(Vec3us edge, Vec3us v) {
        return step(edge, v, new Vec3us());
    }

    public static Vec3us step(Vec3us edge, Vec3us v, Vec3us res) {
        res.x.value = (short) (v.x.compareTo(edge.x) < 0 ? 0 : 1);
        res.y.value = (short) (v.y.compareTo(edge.y) < 0 ? 0 : 1);
        res.z.value = (short) (v.z.compareTo(edge.z) < 0 ? 0 : 1);
        return res;
    }

    // step (vec4, vec4) -------------------------------------------------------
    public static Vec4b step_(Vec4b edge, Vec4b v) {
        return step(edge, v, new Vec4b());
    }

    public static Vec4b step(Vec4b edge, Vec4b v, Vec4b res) {
        res.x = v.x < edge.x ? (byte) 0 : (byte) 1;
        res.y = v.y < edge.y ? (byte) 0 : (byte) 1;
        res.z = v.z < edge.z ? (byte) 0 : (byte) 1;
        res.w = v.w < edge.w ? (byte) 0 : (byte) 1;
        return res;
    }

    public static Vec4d step_(Vec4d edge, Vec4d v) {
        return step(edge, v, new Vec4d());
    }

    public static Vec4d step(Vec4d edge, Vec4d v, Vec4d res) {
        res.x = v.x < edge.x ? 0 : 1;
        res.y = v.y < edge.y ? 0 : 1;
        res.z = v.z < edge.z ? 0 : 1;
        res.w = v.w < edge.w ? 0 : 1;
        return res;
    }

    public static Vector4 step_(Vector4 edge, Vector4 v) {
        return step(edge, v, new Vector4());
    }

    public static Vector4 step(Vector4 edge, Vector4 v, Vector4 res) {
        res.x = v.x < edge.x ? 0 : 1;
        res.y = v.y < edge.y ? 0 : 1;
        res.z = v.z < edge.z ? 0 : 1;
        res.w = v.w < edge.w ? 0 : 1;
        return res;
    }

    public static Vec4i step_(Vec4i edge, Vec4i v) {
        return step(edge, v, new Vec4i());
    }

    public static Vec4i step(Vec4i edge, Vec4i v, Vec4i res) {
        res.x = v.x < edge.x ? 0 : 1;
        res.y = v.y < edge.y ? 0 : 1;
        res.z = v.z < edge.z ? 0 : 1;
        res.w = v.w < edge.w ? 0 : 1;
        return res;
    }

    public static Vec4l step_(Vec4l edge, Vec4l v) {
        return step(edge, v, new Vec4l());
    }

    public static Vec4l step(Vec4l edge, Vec4l v, Vec4l res) {
        res.x = v.x < edge.x ? 0 : 1;
        res.y = v.y < edge.y ? 0 : 1;
        res.z = v.z < edge.z ? 0 : 1;
        res.w = v.w < edge.w ? 0 : 1;
        return res;
    }

    public static Vec4s step_(Vec4s edge, Vec4s v) {
        return step(edge, v, new Vec4s());
    }

    public static Vec4s step(Vec4s edge, Vec4s v, Vec4s res) {
        res.x = v.x < edge.x ? (short) 0 : (short) 1;
        res.y = v.y < edge.y ? (short) 0 : (short) 1;
        res.z = v.z < edge.z ? (short) 0 : (short) 1;
        res.w = v.w < edge.w ? (short) 0 : (short) 1;
        return res;
    }

    public static Vec4ub step_(Vec4ub edge, Vec4ub v) {
        return step(edge, v, new Vec4ub());
    }

    public static Vec4ub step(Vec4ub edge, Vec4ub v, Vec4ub res) {
        res.x.value = (byte) (v.x.compareTo(edge.x) < 0 ? 0 : 1);
        res.y.value = (byte) (v.y.compareTo(edge.y) < 0 ? 0 : 1);
        res.z.value = (byte) (v.z.compareTo(edge.z) < 0 ? 0 : 1);
        res.w.value = (byte) (v.w.compareTo(edge.w) < 0 ? 0 : 1);
        return res;
    }

    public static Vec4ui step_(Vec4ui edge, Vec4ui v) {
        return step(edge, v, new Vec4ui());
    }

    public static Vec4ui step(Vec4ui edge, Vec4ui v, Vec4ui res) {
        res.x.value = v.x.compareTo(edge.x) < 0 ? 0 : 1;
        res.y.value = v.y.compareTo(edge.y) < 0 ? 0 : 1;
        res.z.value = v.z.compareTo(edge.z) < 0 ? 0 : 1;
        res.w.value = v.w.compareTo(edge.w) < 0 ? 0 : 1;
        return res;
    }

    public static Vec4ul step_(Vec4ul edge, Vec4ul v) {
        return step(edge, v, new Vec4ul());
    }

    public static Vec4ul step(Vec4ul edge, Vec4ul v, Vec4ul res) {
        res.x.value = v.x.compareTo(edge.x) < 0 ? 0 : 1;
        res.y.value = v.y.compareTo(edge.y) < 0 ? 0 : 1;
        res.z.value = v.z.compareTo(edge.z) < 0 ? 0 : 1;
        res.w.value = v.w.compareTo(edge.w) < 0 ? 0 : 1;
        return res;
    }

    public static Vec4us step_(Vec4us edge, Vec4us v) {
        return step(edge, v, new Vec4us());
    }

    public static Vec4us step(Vec4us edge, Vec4us v, Vec4us res) {
        res.x.value = (short) (v.x.compareTo(edge.x) < 0 ? 0 : 1);
        res.y.value = (short) (v.y.compareTo(edge.y) < 0 ? 0 : 1);
        res.z.value = (short) (v.z.compareTo(edge.z) < 0 ? 0 : 1);
        res.w.value = (short) (v.w.compareTo(edge.w) < 0 ? 0 : 1);
        return res;
    }

    // trunc -------------------------------------------------------------------
    public static double trunc(float f) {
        return f < 0 ? -floor(-f) : floor(f);
    }

    public static double trunc(double d) {
        return d < 0 ? -floor(-d) : floor(d);
    }

    public static Vector2 trunc_(Vector2 v) {
        return trunc(v, new Vector2());
    }

    public static Vector2 trunc(Vector2 v, Vector2 res) {
        return res.set(trunc(v.x), trunc(v.y));
    }

    public static Vec2d trunc_(Vec2d v) {
        return trunc(v, new Vec2d());
    }

    public static Vec2d trunc(Vec2d v, Vec2d res) {
        return res.set(trunc(v.x), trunc(v.y));
    }

    public static Vector3 trunc_(Vector3 v) {
        return trunc(v, new Vector3());
    }

    public static Vector3 trunc(Vector3 v, Vector3 res) {
        return res.set(trunc(v.x), trunc(v.y), trunc(v.z));
    }

    public static Vec3d trunc_(Vec3d v) {
        return trunc(v, new Vec3d());
    }

    public static Vec3d trunc(Vec3d v, Vec3d res) {
        return res.set(trunc(v.x), trunc(v.y), trunc(v.z));
    }

    public static Vector4 trunc_(Vector4 v) {
        return trunc(v, new Vector4());
    }

    public static Vector4 trunc(Vector4 v, Vector4 res) {
        return res.set(trunc(v.x), trunc(v.y), trunc(v.z), trunc(v.w));
    }

    public static Vec4d trunc_(Vec4d v) {
        return trunc(v, new Vec4d());
    }

    public static Vec4d trunc(Vec4d v, Vec4d res) {
        return res.set(trunc(v.x), trunc(v.y), trunc(v.z), trunc(v.w));
    }

    /**
     * Compare two floating points for equality within a margin of error.
     *
     * This can be used to compensate for inequality caused by accumulated
     * floating point math errors.
     *
     * The error margin is specified in ULPs (units of least precision). A
     * one-ULP difference means there are no representable floats in between.
     * E.g. 0f and 1.4e-45f are one ULP apart. So are -6.1340704f and -6.13407f.
     * Depending on the number of calculations involved, typically a margin of
     * 1-5 ULPs should be enough.
     *
     * @param expected The expected value.
     * @param actual The actual value.
     * @param maxUlps The maximum difference in ULPs.
     * @return
     */
    public static boolean compareFloatEquals(float expected, float actual) {
        return compareFloatEquals(expected, actual, MAX_ULPS);
    }

    public static boolean compareFloatEquals(float expected, float actual, int maxUlps) {

        int expectedBits = Float.floatToIntBits(expected) < 0
                ? 0x80000000 - Float.floatToIntBits(expected) : Float.floatToIntBits(expected);
        int actualBits = Float.floatToIntBits(actual) < 0
                ? 0x80000000 - Float.floatToIntBits(actual) : Float.floatToIntBits(actual);
        int difference = expectedBits > actualBits ? expectedBits - actualBits : actualBits - expectedBits;
        if (difference > maxUlps) {
//            System.out.println("expected: " + expected + ", actual: " + actual);
//            System.out.println("diff " + difference);
        }
        return !Float.isNaN(expected) && !Float.isNaN(actual) && Math.abs(difference) <= maxUlps;
    }

    public static boolean compareDoubleEquals(double expected, double actual) {
        return compareDoubleEquals(expected, actual, MAX_ULPS);
    }

    public static boolean compareDoubleEquals(double expected, double actual, int maxUlps) {
        long expectedBits = Double.doubleToLongBits(expected) < 0 ? 0x8000000000000000L
                - Double.doubleToLongBits(expected) : Double.doubleToLongBits(expected);
        long actualBits = Double.doubleToLongBits(actual) < 0
                ? 0x8000000000000000L - Double.doubleToLongBits(actual) : Double.doubleToLongBits(actual);
        long difference = expectedBits > actualBits ? expectedBits - actualBits : actualBits - expectedBits;
        if (difference > maxUlps) {
//            System.out.println("expected: " + expected + ", actual: " + actual);
//            System.out.println("diff " + difference);
        }
        return !Double.isNaN(expected) && !Double.isNaN(actual) && Math.abs(difference) <= maxUlps;
    }
}
