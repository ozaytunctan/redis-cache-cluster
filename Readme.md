
https://medium.com/@mertcakmak2/redis-cluster-integration-in-spring-boot-af9e1fab574e

![img.png](img.png)

#Cluster 1 replicas
``
>> redis-cli --cluster create redis1:6379 redis2:6379 redis3:6379 redis4:6379 redis5:6379 redis6:6379 --cluster-replicas 1

``

