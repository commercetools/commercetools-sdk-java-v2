
package io.vrap.rmf.base.client.http;

import java.util.Objects;

import io.vrap.rmf.base.client.ApiHttpResponse;

import dev.failsafe.RetryPolicyBuilder;

@FunctionalInterface
public interface FailsafeRetryPolicyBuilderOptions {
    RetryPolicyBuilder<ApiHttpResponse<byte[]>> apply(RetryPolicyBuilder<ApiHttpResponse<byte[]>> options);

    default FailsafeRetryPolicyBuilderOptions andThen(FailsafeRetryPolicyBuilderOptions after) {
        Objects.requireNonNull(after);
        return (t) -> after.apply(apply(t));
    }
}
