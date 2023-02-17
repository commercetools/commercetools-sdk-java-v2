
package io.vrap.rmf.base.client;

import java.util.Map;

public interface ContextApiHttpClient extends AutoCloseable, ApiHttpClient, ContextAware<ContextApiHttpClient> {
    static ContextApiHttpClient of(ApiHttpClient client) {
        return new ContextApiHttpClientImpl(client);
    }

    static ContextApiHttpClient of(ApiHttpClient client, Map<Object, Object> contextMap) {
        return new ContextApiHttpClientImpl(client, contextMap);
    }

    static ContextApiHttpClient of(ApiHttpClient client, Context context) {
        return new ContextApiHttpClientImpl(client).addContext(context);
    }

    static ContextApiHttpClient withMdc(ApiHttpClient client) {
        return new ContextApiHttpClientImpl(client).addContext(new MDCContext());
    }
}
