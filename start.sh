#create *.jar
mvn clean package
#create docker image
docker-compose up -d