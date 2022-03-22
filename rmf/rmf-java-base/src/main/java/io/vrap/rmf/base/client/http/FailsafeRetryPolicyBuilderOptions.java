
package io.vrap.rmf.base.client.http;

import java.util.function.Function;

import dev.failsafe.RetryPolicyBuilder;

import io.vrap.rmf.base.client.ApiHttpResponse;

public interface FailsafeRetryPolicyBuilderOptions
        extends Function<RetryPolicyBuilder<ApiHttpResponse<byte[]>>, RetryPolicyBuilder<ApiHttpResponse<byte[]>>> {
}
