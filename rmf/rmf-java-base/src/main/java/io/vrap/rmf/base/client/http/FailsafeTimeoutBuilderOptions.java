
package io.vrap.rmf.base.client.http;

import java.util.Objects;

import io.vrap.rmf.base.client.ApiHttpResponse;

import dev.failsafe.TimeoutBuilder;

/**
 * Interface to enable the configuration of Failsafe instances
 */
@FunctionalInterface
public interface FailsafeTimeoutBuilderOptions {
    TimeoutBuilder<ApiHttpResponse<byte[]>> apply(TimeoutBuilder<ApiHttpResponse<byte[]>> options);

    default FailsafeTimeoutBuilderOptions andThen(FailsafeTimeoutBuilderOptions after) {
        Objects.requireNonNull(after);
        return (t) -> after.apply(apply(t));
    }
}
