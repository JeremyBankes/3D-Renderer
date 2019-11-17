/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package math;

import math.quat.Quat;
import math.vector.vec3.Vector3;
import math.vector.vec4.Vector4;

/**
 *
 * @author GBarbieri
 */
abstract class funcGeometric extends funcExponential {

    public static Quat angleAxis_(float degAngle, Vector3 v) {
        return Quat.angleAxis_(degAngle, v);
    }
    
    public static Quat angleAxis(float degAngle, Vector3 v, Quat res) {
        return Quat.angleAxis(degAngle, v, res);
    }
    
    public static float length(float x) {
        return (float)Math.abs(x);
    }
    
    public static float dot(Vector4 v0, Vector4 v1) {
        return Vector4.dot(v0, v1);
    }
    
    public static float dot(Quat v0, Quat v1) {
        return Quat.dot(v0, v1);
    }
    
    public static Vector3 cross(Vector3 v0, Vector3 v1) {
        return v0.cross(v1);
    }
    
    public static Vector3 cross_(Vector3 v0, Vector3 v1) {
        return v0.cross_(v1);
    }
}
