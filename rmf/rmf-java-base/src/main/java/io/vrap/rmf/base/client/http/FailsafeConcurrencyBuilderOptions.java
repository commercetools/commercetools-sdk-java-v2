
package io.vrap.rmf.base.client.http;

import java.util.Objects;

import io.vrap.rmf.base.client.ApiHttpResponse;

import dev.failsafe.BulkheadBuilder;

/**
 * Interface to enable the configuration of Failsafe instances
 */
@FunctionalInterface
public interface FailsafeConcurrencyBuilderOptions {
    BulkheadBuilder<ApiHttpResponse<byte[]>> apply(BulkheadBuilder<ApiHttpResponse<byte[]>> options);

    default FailsafeConcurrencyBuilderOptions andThen(FailsafeConcurrencyBuilderOptions after) {
        Objects.requireNonNull(after);
        return (t) -> after.apply(apply(t));
    }
}
