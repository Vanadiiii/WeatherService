#create *.jar
mvn clean package
#create docker image
docker build -t vanadiiii/weather:firsttry .
#run image
docker run --name weather -p 8080:8080 -d vanadiiii/weather:firsttry
