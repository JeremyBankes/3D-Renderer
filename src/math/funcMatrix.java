/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package math;

import math.matrix.mat4.Matrix4;

/**
 *
 * @author GBarbieri
 */
abstract class funcMatrix extends Packing {

    public static Matrix4 transpose_(Matrix4 mat) {
        return Matrix4.transpose(mat, new Matrix4());
    }

    public static Matrix4 transpose(Matrix4 mat, Matrix4 dest) {
        return Matrix4.transpose(mat, dest);
    }
}
