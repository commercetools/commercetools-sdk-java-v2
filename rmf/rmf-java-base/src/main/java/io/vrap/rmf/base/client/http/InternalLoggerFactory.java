package io.vrap.rmf.base.client.http;

import io.vrap.rmf.base.client.ApiHttpRequest;
import org.slf4j.Logger;

@FunctionalInterface
public interface InternalLoggerFactory {
    InternalLogger createFor(ApiHttpRequest request);
}
