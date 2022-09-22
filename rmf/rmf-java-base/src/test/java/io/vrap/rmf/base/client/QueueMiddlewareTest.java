package io.vrap.rmf.base.client;

import io.vrap.rmf.base.client.http.QueueMiddleware;

import java.time.Duration;

public class QueueMiddlewareTest {

    public void queueConfiguration() {
        final ApiHttpClient build = ClientBuilder.of()
                // ...
                .addMiddleware(new QueueMiddleware(64, Duration.ofSeconds(10))).build();
    }
}
