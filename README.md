
shortners

Simple URL Shortener built in Java.

Overview

A basic URL shortening service where you can input a long URL and get a shorter alias that redirects to the original.
Built using Java and common web‑framework components.

Features

Generate short URLs for long links

Redirect short URLs to corresponding long links

Basic persistence (stores mapping of short→long)

Simple command‑line or web interface (depending on configuration)

Developed for demonstration / small‑scale use

Technologies

Java (100% codebase)

Maven for build and dependency management (via pom.xml)

Spring Boot (probably) or similar web‑framework (based on typical patterns)

A relational or in‑memory database for storing mappings

Maven wrapper files included (mvnw, mvnw.cmd) for ease of build

Getting Started
Prerequisites

Java 8 or above

Maven

(Optional) Database if you switch from in‑memory to persistent storage

Build & Run

Clone the repository

git clone https://github.com/vishnusinghh/shortners.git


Navigate to project root

cd shortners


Build via Maven

./mvnw clean install


Run the application

./mvnw spring-boot:run


or run the generated JAR from target/ directory

java -jar target/shortners-<version>.jar


Use the web interface (e.g., http://localhost:8080) or a REST endpoint to shorten URLs.

Usage

Enter a long URL → get a short code (e.g., abc123).

Access the short URL (http://<host>/<code>) → gets redirected to original URL.

(Optional) Admin interface to view mappings, delete mappings, etc.

Configuration

Application properties (e.g., application.yml or application.properties) to set server port, database connection, etc.

You can configure the persistence mechanism (H2/in‑memory vs MySQL/PostgreSQL)

Logging and error‑handling can be enhanced as needed

Limitations & To‑Do

No user authentication / multi‑tenant support

No analytics on link usage (click counts, unique visitors)

No custom alias support (user‑specified short code)

URL expiration or deletion by time not implemented

Scalability (caching, high availability) is limited

Needs more robust tests & documentation

License

This project is licensed under the MIT License.
Feel free to use, modify and distribute this code in accordance with the terms of the MIT license.
