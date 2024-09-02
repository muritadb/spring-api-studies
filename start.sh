docker-compose down

# build backend image
docker build -t spring-api:latest ./

#start environment
docker-compose up --build --force-recreate --remove-orphans