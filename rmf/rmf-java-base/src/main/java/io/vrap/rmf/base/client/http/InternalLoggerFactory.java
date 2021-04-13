
package io.vrap.rmf.base.client.http;

import io.vrap.rmf.base.client.ApiHttpRequest;

public interface InternalLoggerFactory {
    InternalLogger createFor(final ApiHttpRequest request, final String topic);
}
