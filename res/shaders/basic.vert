#version 330 core

layout (location = 0) in vec3 pos;
layout (location = 1) in vec2 tex;
layout (location = 2) in vec3 nor;

out vec2 texture_coord;
out vec3 surfaceNormal;
out vec3 toLightVector;
out vec3 toCameraVector;

uniform mat4 transform;
uniform mat4 view;
uniform mat4 projection;
uniform vec3 lightPosition;

void main() {
	vec4 worldPos = transform * vec4(pos, 1);
    gl_Position = projection * view * worldPos;
	texture_coord = tex;

	surfaceNormal = (transform * vec4(nor, 1)).xyz;
	toLightVector = lightPosition - worldPos.xyz;
	toCameraVector = (inverse(view) * vec4(0, 0, 0, 1)).xyz - worldPos.xyz;
}
