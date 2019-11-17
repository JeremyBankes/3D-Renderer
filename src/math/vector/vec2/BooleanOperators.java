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
abstract class BooleanOperators extends BasicOperators {

    public boolean equals(Vector2 b) {
        return math.Glm.equals((Vector2) this, b);
    }

    public boolean notEquals(Vector2 b) {
        return math.Glm.notEquals((Vector2) this, b);
    }
}
