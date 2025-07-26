curl --location 'http://localhost:8090/movie-info/save' \
--header 'Content-Type: application/json' \
--data '[
{
"name": "Spring Boot Security",
"description": "Comprehensive tutorial for Spring Security Framework",
"path": "SpringSecurity-mp4"
},
{
"name": "JavaFX Background Tasks",
"description": "Make JavaFX GUI smooth",
"path": "JavaFX Background Tasks.mp4"
},
{
"name": "JavaFX 14 Tutorial",
"description": "Learn new features of JavaFX 14",
"path": "JavaFX14.mp4"
},
{
"name": "Spring Boot with Android Client",
"description": "Create client-server app with Spring boot server and Android client",
"path": "Spring Boot with Android Client.mp4"
}
]
'



need to install https://zipkin.io/pages/quickstart form docker. other way