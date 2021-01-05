#create *.jar
mvn clean package
#create docker image
docker build -t vanadiiii/weather:1.1 .
#run image
docker run --name weather -p 8080:8080 -d vanadiiii/weather:1.1
