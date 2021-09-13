
package io.vrap.rmf.base.client.http;

import io.vrap.rmf.base.client.ApiHttpRequest;

/**
 * Creates the {@link InternalLogger} instances for the specified request
 */
public interface InternalLoggerFactory {
    InternalLogger createFor(final ApiHttpRequest request, final String topic);
}
