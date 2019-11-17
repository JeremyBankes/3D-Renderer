/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package math.vector.vec3;

/**
 *
 * @author elect
 */
abstract class funcGeometric extends funcCommon {

    public Vector3 cross(Vector3 y) {
        return cross(y, (Vector3) this);
    }

    public Vector3 cross_(Vector3 y) {
        return cross(y, new Vector3());
    }

    public Vector3 cross(Vector3 y, Vector3 res) {
        return cross((Vector3) this, y, res);
    }

    public static Vector3 cross(Vector3 x, Vector3 y, Vector3 res) {
        return res.set(
                x.y * y.z - y.y * x.z,
                x.z * y.x - y.z * x.x,
                x.x * y.y - y.x * x.y);
    }

    public float dot(Vector3 y) {
        return dot((Vector3) this, y);
    }

    public static float dot(Vector3 x, Vector3 y) {
        float tX = x.x * y.x;
        float tY = x.y * y.y;
        float tZ = x.z * y.z;
        return tX + tY + tZ;
    }

    /**
     * Normalize this vector.
     *
     * @return this
     */
    public Vector3 normalize() {
        return normalize((Vector3) this);
    }

    public Vector3 normalize_() {
        return normalize(new Vector3());
    }

    /**
     * Normalize this vector and store the result in <code>res</code>.
     *
     * @param res will hold the result
     * @return
     */
    public Vector3 normalize(Vector3 res) {
        float invLength = (float) (1.0 / Math.sqrt(x * x + y * y + z * z));
        res.x = x * invLength;
        res.y = y * invLength;
        res.z = z * invLength;
        return res;
    }
}
