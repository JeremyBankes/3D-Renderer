/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package math.vector.vec2;

/**
 *
 * @author elect
 */
abstract class funcGeometric extends funcExponential {

    public Vector2 cross(Vector2 y) {
        return cross(y, (Vector2) this);
    }

    public Vector2 cross_(Vector2 y) {
        return cross(y, new Vector2());
    }

    public Vector2 cross(Vector2 y, Vector2 result) {
        return cross((Vector2) this, y, result);
    }

    public static Vector2 cross(Vector2 x, Vector2 y, Vector2 result) {
        result.y = x.x * y.y - y.x * x.y;
        result.x = 0f;
        return result;
    }

    public float distance(Vector2 p0, Vector2 p1) {
        float t0x = p0.x - p1.x;
        float t0y = p0.y - p1.y;
        float dot = t0x * t0y + t0x * t0y;
        return (float) Math.sqrt(dot);
    }

    public float dot(Vector2 y) {
        return dot((Vector2) this, y);
    }

    public static float dot(Vector2 x, Vector2 y) {
        float tX = x.x * y.x;
        float tY = x.y * y.y;
        return tX + tY;
    }

    public static float length(Vector2 x, Vector2 result) {
        return (float) Math.sqrt(dot(x, x));
    }
}
