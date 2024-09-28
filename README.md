# order-management-kafka
Real-time Order Management using Spring Boot, MongoDB and Kafka
Pre-requisite :
1. MongoDB
2. Kafka
3. Postman
4. Java 17


Place order :
POST : http://localhost:8080/api/orders/place

Confirm Order :
PUT : http://localhost:8080/api/orders/confirm/--orderId--

Deliver order :
POST : http://localhost:9292/shipping/--orderId--/deliver

