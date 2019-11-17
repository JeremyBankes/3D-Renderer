/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package math.vector.vec4;

import math.Glm;
import math.vector.vec4.bool.Vec4bool;

/**
 *
 * @author elect
 */
abstract class FuncRelational extends funcGeometric {

    public boolean any() {
        return Glm.any((Vector4) this);
    }

    public boolean all() {
        return Glm.all((Vector4) this);
    }
    
    public Vector4 not_() {
        return Glm.not((Vector4) this, new Vector4());
    }

    public Vector4 not() {
        return Glm.not((Vector4) this, (Vector4) this);
    }
    
    public Vec4bool lessThan__(Vector4 b) {
        return Glm.lessThan((Vector4) this, b, new Vec4bool());
    }

    public Vec4bool lessThan(Vector4 b, Vec4bool res) {
        return Glm.lessThan((Vector4) this, b, res);
    }

    public Vec4bool lessThanEqual__(Vector4 b) {
        return Glm.lessThanEqual((Vector4) this, b, new Vec4bool());
    }

    public Vec4bool lessThanEqual(Vector4 b, Vec4bool res) {
        return Glm.lessThanEqual((Vector4) this, b, res);
    }

    public Vec4bool greaterThan__(Vector4 b) {
        return Glm.greaterThan((Vector4) this, b, new Vec4bool());
    }

    public Vec4bool greaterThan(Vector4 b, Vec4bool res) {
        return Glm.greaterThan((Vector4) this, b, res);
    }

    public Vec4bool greaterThanEqual__(Vector4 b) {
        return Glm.greaterThanEqual((Vector4) this, b, new Vec4bool());
    }

    public Vec4bool greaterThanEqual(Vector4 b, Vec4bool res) {
        return Glm.greaterThanEqual((Vector4) this, b, res);
    }

    public Vec4bool equal__(Vector4 b) {
        return Glm.equal((Vector4) this, b, new Vec4bool());
    }

    public Vec4bool equal(Vector4 b, Vec4bool res) {
        return Glm.equal((Vector4) this, b, res);
    }

    public Vec4bool notEqual__(Vector4 b) {
        return Glm.notEqual((Vector4) this, b, new Vec4bool());
    }

    public Vec4bool notEqual(Vector4 b, Vec4bool res) {
        return Glm.notEqual((Vector4) this, b, res);
    }

    public Vector4 lessThan(Vector4 b) {
        return Glm.lessThan((Vector4) this, b, (Vector4) this);
    }

    public Vector4 lessThan_(Vector4 b) {
        return Glm.lessThan((Vector4) this, b, new Vector4());
    }

    public Vector4 lessThan(Vector4 b, Vector4 res) {
        return Glm.lessThan((Vector4) this, b, res);
    }

    public Vector4 lessThanEqual(Vector4 b) {
        return Glm.lessThanEqual((Vector4) this, b, (Vector4) this);
    }

    public Vector4 lessThanEqual_(Vector4 b) {
        return Glm.lessThanEqual((Vector4) this, b, new Vector4());
    }

    public Vector4 lessThanEqual(Vector4 b, Vector4 res) {
        return Glm.lessThanEqual((Vector4) this, b, res);
    }

    public Vector4 greaterThan(Vector4 b) {
        return Glm.greaterThan((Vector4) this, b, (Vector4) this);
    }

    public Vector4 greaterThan_(Vector4 b) {
        return Glm.greaterThan((Vector4) this, b, new Vector4());
    }

    public Vector4 greaterThan(Vector4 b, Vector4 res) {
        return Glm.greaterThan((Vector4) this, b, res);
    }

    public Vector4 greaterThanEqual(Vector4 b) {
        return Glm.greaterThanEqual((Vector4) this, b, (Vector4) this);
    }

    public Vector4 greaterThanEqual_(Vector4 b) {
        return Glm.greaterThanEqual((Vector4) this, b, new Vector4());
    }

    public Vector4 greaterThanEqual(Vector4 b, Vector4 res) {
        return Glm.greaterThanEqual((Vector4) this, b, res);
    }

    public Vector4 equal(Vector4 b) {
        return Glm.equal((Vector4) this, b, (Vector4) this);
    }

    public Vector4 equal_(Vector4 b) {
        return Glm.equal((Vector4) this, b, new Vector4());
    }

    public Vector4 equal(Vector4 b, Vector4 res) {
        return Glm.equal((Vector4) this, b, res);
    }

    public Vector4 notEqual(Vector4 b) {
        return Glm.notEqual((Vector4) this, b, (Vector4) this);
    }

    public Vector4 notEqual_(Vector4 b) {
        return Glm.notEqual((Vector4) this, b, new Vector4());
    }

    public Vector4 notEqual(Vector4 b, Vector4 res) {
        return Glm.notEqual((Vector4) this, b, res);
    }
}
