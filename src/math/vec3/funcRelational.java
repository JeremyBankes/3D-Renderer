/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package math.vector.vec3;

import math.Glm;
import math.vector.vec3.bool.Vec3bool;

/**
 *
 * @author elect
 */
abstract class funcRelational extends funcGeometric {

    public boolean any() {
        return Glm.any((Vector3) this);
    }

    public boolean all() {
        return Glm.all((Vector3) this);
    }
    
    public Vector3 not_() {
        return Glm.not((Vector3) this, new Vector3());
    }

    public Vector3 not() {
        return Glm.not((Vector3) this, (Vector3) this);
    }
    
    public Vec3bool lessThan__(Vector3 b) {
        return Glm.lessThan((Vector3) this, b, new Vec3bool());
    }

    public Vec3bool lessThan(Vector3 b, Vec3bool res) {
        return Glm.lessThan((Vector3) this, b, res);
    }

    public Vec3bool lessThanEqual__(Vector3 b) {
        return Glm.lessThanEqual((Vector3) this, b, new Vec3bool());
    }

    public Vec3bool lessThanEqual(Vector3 b, Vec3bool res) {
        return Glm.lessThanEqual((Vector3) this, b, res);
    }

    public Vec3bool greaterThan__(Vector3 b) {
        return Glm.greaterThan((Vector3) this, b, new Vec3bool());
    }

    public Vec3bool greaterThan(Vector3 b, Vec3bool res) {
        return Glm.greaterThan((Vector3) this, b, res);
    }

    public Vec3bool greaterThanEqual__(Vector3 b) {
        return Glm.greaterThanEqual((Vector3) this, b, new Vec3bool());
    }

    public Vec3bool greaterThanEqual(Vector3 b, Vec3bool res) {
        return Glm.greaterThanEqual((Vector3) this, b, res);
    }

    public Vec3bool equal__(Vector3 b) {
        return Glm.equal((Vector3) this, b, new Vec3bool());
    }

    public Vec3bool equal(Vector3 b, Vec3bool res) {
        return Glm.equal((Vector3) this, b, res);
    }

    public Vec3bool notEqual__(Vector3 b) {
        return Glm.notEqual((Vector3) this, b, new Vec3bool());
    }

    public Vec3bool notEqual(Vector3 b, Vec3bool res) {
        return Glm.notEqual((Vector3) this, b, res);
    }

    public Vector3 lessThan(Vector3 b) {
        return Glm.lessThan((Vector3) this, b, (Vector3) this);
    }

    public Vector3 lessThan_(Vector3 b) {
        return Glm.lessThan((Vector3) this, b, new Vector3());
    }

    public Vector3 lessThan(Vector3 b, Vector3 res) {
        return Glm.lessThan((Vector3) this, b, res);
    }

    public Vector3 lessThanEqual(Vector3 b) {
        return Glm.lessThanEqual((Vector3) this, b, (Vector3) this);
    }

    public Vector3 lessThanEqual_(Vector3 b) {
        return Glm.lessThanEqual((Vector3) this, b, new Vector3());
    }

    public Vector3 lessThanEqual(Vector3 b, Vector3 res) {
        return Glm.lessThanEqual((Vector3) this, b, res);
    }

    public Vector3 greaterThan(Vector3 b) {
        return Glm.greaterThan((Vector3) this, b, (Vector3) this);
    }

    public Vector3 greaterThan_(Vector3 b) {
        return Glm.greaterThan((Vector3) this, b, new Vector3());
    }

    public Vector3 greaterThan(Vector3 b, Vector3 res) {
        return Glm.greaterThan((Vector3) this, b, res);
    }

    public Vector3 greaterThanEqual(Vector3 b) {
        return Glm.greaterThanEqual((Vector3) this, b, (Vector3) this);
    }

    public Vector3 greaterThanEqual_(Vector3 b) {
        return Glm.greaterThanEqual((Vector3) this, b, new Vector3());
    }

    public Vector3 greaterThanEqual(Vector3 b, Vector3 res) {
        return Glm.greaterThanEqual((Vector3) this, b, res);
    }

    public Vector3 equal(Vector3 b) {
        return Glm.equal((Vector3) this, b, (Vector3) this);
    }

    public Vector3 equal_(Vector3 b) {
        return Glm.equal((Vector3) this, b, new Vector3());
    }

    public Vector3 equal(Vector3 b, Vector3 res) {
        return Glm.equal((Vector3) this, b, res);
    }

    public Vector3 notEqual(Vector3 b) {
        return Glm.notEqual((Vector3) this, b, (Vector3) this);
    }

    public Vector3 notEqual_(Vector3 b) {
        return Glm.notEqual((Vector3) this, b, new Vector3());
    }

    public Vector3 notEqual(Vector3 b, Vector3 res) {
        return Glm.notEqual((Vector3) this, b, res);
    }
}
