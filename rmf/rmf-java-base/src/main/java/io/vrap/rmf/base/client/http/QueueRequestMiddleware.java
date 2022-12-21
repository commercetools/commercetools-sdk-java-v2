
package io.vrap.rmf.base.client.http;

import java.time.Duration;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

import dev.failsafe.spi.Scheduler;

/**
 * Middleware to limit the number of concurrent request using a Queue
 *
 * @include.example io.vrap.rmf.base.client.QueueMiddlewareTest#queueConfiguration()
 */
public interface QueueRequestMiddleware extends Middleware {
    public static QueueRequestMiddleware of(final ExecutorService executorService, final int maxRequests,
            final Duration maxWaitTime) {
        return new QueueMiddleware(executorService, maxRequests, maxWaitTime);
    }

    public static QueueRequestMiddleware of(final ScheduledExecutorService executorService, final int maxRequests,
            final Duration maxWaitTime) {
        return new QueueMiddleware(executorService, maxRequests, maxWaitTime);
    }

    public static QueueRequestMiddleware of(final Scheduler scheduler, final int maxRequests,
            final Duration maxWaitTime) {
        return new QueueMiddleware(scheduler, maxRequests, maxWaitTime);
    }

    public static QueueRequestMiddleware of(final int maxRequests, final Duration maxWaitTime) {
        return new QueueMiddleware(maxRequests, maxWaitTime);
    }
}
