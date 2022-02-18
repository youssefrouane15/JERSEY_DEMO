# JERSEY_DEMO
A jersey 2 demo (exploring all key functionalities of the api core, an embedded http is used to run a sever that exposes rest endpoints)
- a request filter, interceptor, and an exception mapper were implemented
- Java Constraints Api was also used
- if there is an issue running the unit tests with eclipse (change junit version to 4 in the file properties to run the tests on the Junit 4 environment)
- to run the JerseyClientIntegrationTest.java test cases successfully, the embedded http server(/jersey_demo/src/main/java/com/luv2kode/jersey/server/http/EmbeddedHttpServer.java)   should be run first.
