

##Run docker container for elastic
docker run -p 9200:9200 -p 9300:9300 -e "discovery.type=single-node" docker.elastic.co/elasticsearch/elasticsearch:7.12.0


##Run docker container for kibana

docker run --link {elastic-container-id}:elasticsearch -p 5601:5601 docker.elastic.co/kibana/kibana:7.12.0
