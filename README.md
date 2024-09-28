# order-management-kafka
Real-time Order Management using Spring Boot and Kafka

Place order :
POST : http://localhost:8080/api/orders/place

Confirm Order :
PUT : http://localhost:8080/api/orders/confirm/--orderId--

Deliver order :
POST : http://localhost:9292/shipping/--orderId--/deliver

