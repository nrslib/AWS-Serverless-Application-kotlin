plugins {
    kotlin("jvm").version("1.3.41")
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib-jdk8"))
    implementation("com.amazonaws:aws-lambda-java-core:1.2.1")
    implementation("com.amazonaws:aws-lambda-java-events:3.6.0")
    testImplementation("junit:junit:4.12")
}
