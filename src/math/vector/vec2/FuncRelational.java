/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package math.vector.vec2;

import math.Glm;
import math.vector.vec2.bool.Vec2bool;

/**
 *
 * @author elect
 */
abstract class FuncRelational extends funcGeometric {

    public boolean any() {
        return Glm.any((Vector2) this);
    }

    public boolean all() {
        return Glm.all((Vector2) this);
    }
    
    public Vector2 not_() {
        return Glm.not((Vector2) this, new Vector2());
    }

    public Vector2 not() {
        return Glm.not((Vector2) this, (Vector2) this);
    }

    public Vec2bool lessThan__(Vector2 b) {
        return Glm.lessThan((Vector2) this, b, new Vec2bool());
    }

    public Vec2bool lessThan(Vector2 b, Vec2bool res) {
        return Glm.lessThan((Vector2) this, b, res);
    }

    public Vec2bool lessThanEqual__(Vector2 b) {
        return Glm.lessThanEqual((Vector2) this, b, new Vec2bool());
    }

    public Vec2bool lessThanEqual(Vector2 b, Vec2bool res) {
        return Glm.lessThanEqual((Vector2) this, b, res);
    }

    public Vec2bool greaterThan__(Vector2 b) {
        return Glm.greaterThan((Vector2) this, b, new Vec2bool());
    }

    public Vec2bool greaterThan(Vector2 b, Vec2bool res) {
        return Glm.greaterThan((Vector2) this, b, res);
    }

    public Vec2bool greaterThanEqual__(Vector2 b) {
        return Glm.greaterThanEqual((Vector2) this, b, new Vec2bool());
    }

    public Vec2bool greaterThanEqual(Vector2 b, Vec2bool res) {
        return Glm.greaterThanEqual((Vector2) this, b, res);
    }

    public Vec2bool equal__(Vector2 b) {
        return Glm.equal((Vector2) this, b, new Vec2bool());
    }

    public Vec2bool equal(Vector2 b, Vec2bool res) {
        return Glm.equal((Vector2) this, b, res);
    }

    public Vec2bool notEqual__(Vector2 b) {
        return Glm.notEqual((Vector2) this, b, new Vec2bool());
    }

    public Vec2bool notEqual(Vector2 b, Vec2bool res) {
        return Glm.notEqual((Vector2) this, b, res);
    }

    public Vector2 lessThan(Vector2 b) {
        return Glm.lessThan((Vector2) this, b, (Vector2) this);
    }

    public Vector2 lessThan_(Vector2 b) {
        return Glm.lessThan((Vector2) this, b, new Vector2());
    }

    public Vector2 lessThan(Vector2 b, Vector2 res) {
        return Glm.lessThan((Vector2) this, b, res);
    }

    public Vector2 lessThanEqual(Vector2 b) {
        return Glm.lessThanEqual((Vector2) this, b, (Vector2) this);
    }

    public Vector2 lessThanEqual_(Vector2 b) {
        return Glm.lessThanEqual((Vector2) this, b, new Vector2());
    }

    public Vector2 lessThanEqual(Vector2 b, Vector2 res) {
        return Glm.lessThanEqual((Vector2) this, b, res);
    }

    public Vector2 greaterThan(Vector2 b) {
        return Glm.greaterThan((Vector2) this, b, (Vector2) this);
    }

    public Vector2 greaterThan_(Vector2 b) {
        return Glm.greaterThan((Vector2) this, b, new Vector2());
    }

    public Vector2 greaterThan(Vector2 b, Vector2 res) {
        return Glm.greaterThan((Vector2) this, b, res);
    }

    public Vector2 greaterThanEqual(Vector2 b) {
        return Glm.greaterThanEqual((Vector2) this, b, (Vector2) this);
    }

    public Vector2 greaterThanEqual_(Vector2 b) {
        return Glm.greaterThanEqual((Vector2) this, b, new Vector2());
    }

    public Vector2 greaterThanEqual(Vector2 b, Vector2 res) {
        return Glm.greaterThanEqual((Vector2) this, b, res);
    }

    public Vector2 equal(Vector2 b) {
        return Glm.equal((Vector2) this, b, (Vector2) this);
    }

    public Vector2 equal_(Vector2 b) {
        return Glm.equal((Vector2) this, b, new Vector2());
    }

    public Vector2 equal(Vector2 b, Vector2 res) {
        return Glm.equal((Vector2) this, b, res);
    }

    public Vector2 notEqual(Vector2 b) {
        return Glm.notEqual((Vector2) this, b, (Vector2) this);
    }

    public Vector2 notEqual_(Vector2 b) {
        return Glm.notEqual((Vector2) this, b, new Vector2());
    }

    public Vector2 notEqual(Vector2 b, Vector2 res) {
        return Glm.notEqual((Vector2) this, b, res);
    }
}
