#version 330 core

in vec2 texture_coord;
in vec3 surfaceNormal;
in vec3 toLightVector;
in vec3 toCameraVector;

out vec4 frag_color;

uniform sampler2D sampler;
uniform vec3 lightColor;
uniform float shine;
uniform float reflectivity;

void main() {
	vec3 surfaceNormalNormd = normalize(surfaceNormal);
	vec3 toLightVectorNormd = normalize(toLightVector);
	vec3 toCameraVectorNormd = normalize(toCameraVector);
	vec3 incomingLightVector = -toLightVectorNormd;

	float brightness = clamp(dot(surfaceNormalNormd, toLightVectorNormd), 0, 5);
	vec3 diffuse = brightness * lightColor + 1;

	vec3 reflectedLightVector = reflect(incomingLightVector, surfaceNormalNormd);
	float specularFactor = clamp(dot(reflectedLightVector, toCameraVectorNormd), 0, 5);
	float dampeningFactor = pow(specularFactor, shine);
	vec3 specularLight = lightColor * reflectivity * dampeningFactor * 3;

	frag_color = vec4(diffuse, 1) * texture(sampler, texture_coord) + vec4(specularLight, 1);
}
