
package io.vrap.rmf.base.client;

import java.util.Map;

public interface ContextApiHttpClient extends AutoCloseable, ApiHttpClient, ContextAware<ContextApiHttpClient> {
    static ContextApiHttpClient of(final ApiHttpClient client) {
        return new ContextApiHttpClientImpl(client);
    }

    static ContextApiHttpClient of(final ApiHttpClient client, final Map<Object, Object> contextMap) {
        return new ContextApiHttpClientImpl(client, contextMap);
    }

    static ContextApiHttpClient of(final ApiHttpClient client, final Context context) {
        return new ContextApiHttpClientImpl(client).addContext(context);
    }

    static ContextApiHttpClient withMdc(final ApiHttpClient client) {
        return new ContextApiHttpClientImpl(client).addContext(new MDCContext());
    }

    static ContextApiHttpClient of(final ApiHttpClient client, final boolean closeHttpClient) {
        return new ContextApiHttpClientImpl(client, closeHttpClient);
    }

    static ContextApiHttpClient of(final ApiHttpClient client, final Map<Object, Object> contextMap,
            final boolean closeHttpClient) {
        return new ContextApiHttpClientImpl(client, contextMap, closeHttpClient);
    }

    static ContextApiHttpClient of(final ApiHttpClient client, final Context context, final boolean closeHttpClient) {
        return new ContextApiHttpClientImpl(client, closeHttpClient).addContext(context);
    }

    static ContextApiHttpClient withMdc(final ApiHttpClient client, final boolean closeHttpClient) {
        return new ContextApiHttpClientImpl(client, closeHttpClient).addContext(new MDCContext());
    }
}
