# Tuning the client

## Blocking client

In a lot of frameworks there is no support for asynchronous execution and so it is necessary to wait for the responses.

The Client can wait for responses with the method `executeBlocking()`. This method enforces a timeout for resilience and throws directly ApiHttpExceptions.

```java
Project project = apiRoot
        .withProjectKey("my-project")
        .get()
        .executeBlocking().getBody();
```
