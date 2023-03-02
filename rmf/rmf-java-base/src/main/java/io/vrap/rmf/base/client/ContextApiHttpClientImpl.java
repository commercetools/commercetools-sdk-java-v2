
package io.vrap.rmf.base.client;

import java.net.URI;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JavaType;

public class ContextApiHttpClientImpl extends AutoCloseableService implements ContextApiHttpClient {
    private final ApiHttpClient client;

    private Map<Object, Object> contextMap;

    private final Consumer<ContextAware<ContextApiHttpClient>> consumer;

    public ContextApiHttpClientImpl(ApiHttpClient client) {
        this(client, new HashMap<>(), null);
    }

    public ContextApiHttpClientImpl(ApiHttpClient client, Map<Object, Object> contextMap) {
        this(client, contextMap, null);
    }

    public ContextApiHttpClientImpl(ApiHttpClient client, Map<Object, Object> contextMap,
            Consumer<ContextAware<ContextApiHttpClient>> consumer) {
        this.client = client;
        this.contextMap = contextMap;
        this.consumer = consumer;
    }

    public ContextApiHttpClientImpl(final ContextApiHttpClientImpl c) {
        this.client = c.client;
        this.contextMap = c.contextMap;
        this.consumer = c.consumer;
    }

    public Map<Object, Object> getContextMap() {
        return contextMap;
    }

    public ContextApiHttpClient withContextMap(final Map<Object, Object> contextMap) {
        final ContextApiHttpClientImpl client = copy();
        client.contextMap = new HashMap<>(contextMap);

        return client;
    }

    @SuppressWarnings("unchecked")
    public <T> T getContext(Class<T> key) {
        return (T) contextMap.get(key);
    }

    public <T> ContextApiHttpClient addContext(T value) {
        final ContextApiHttpClientImpl client = copy();
        final Map<Object, Object> contextMap = new HashMap<>(client.contextMap);
        contextMap.put(value.getClass(), value);
        client.contextMap = contextMap;

        return client;
    }

    public Object getContext(Object key) {
        return contextMap.get(key);
    }

    public ContextApiHttpClient addContext(Object key, Object value) {
        final ContextApiHttpClientImpl client = copy();
        final Map<Object, Object> contextMap = new HashMap<>(client.contextMap);
        contextMap.put(key, value);
        client.contextMap = contextMap;

        return client;
    }

    private ContextApiHttpClientImpl copy() {
        return new ContextApiHttpClientImpl(this);
    }

    private void restoreContext() {
        Optional.ofNullable(consumer).ifPresent(c -> c.accept(this));
    }

    @Override
    public <O> CompletableFuture<ApiHttpResponse<O>> execute(ApiHttpRequest request, Class<O> outputType) {
        restoreContext();
        return client.execute(request.withContextMap(contextMap), outputType);
    }

    @Override
    public <O> CompletableFuture<ApiHttpResponse<O>> execute(ApiHttpRequest request, TypeReference<O> outputType) {
        restoreContext();
        return client.execute(request.withContextMap(contextMap), outputType);
    }

    @Override
    public <O> CompletableFuture<ApiHttpResponse<O>> execute(ApiHttpRequest request, JavaType outputType) {
        restoreContext();
        return client.execute(request.withContextMap(contextMap), outputType);
    }

    @Override
    public <O> CompletableFuture<ApiHttpResponse<O>> execute(ClientRequestCommand<O> method) {
        restoreContext();
        return method.execute(this);
    }

    @Override
    public ResponseSerializer getSerializerService() {
        return client.getSerializerService();
    }

    @Override
    public URI getBaseUri() {
        return client.getBaseUri();
    }

    @Override
    public CompletableFuture<ApiHttpResponse<byte[]>> execute(ApiHttpRequest request) {
        restoreContext();
        return client.execute(request.withContextMap(contextMap));
    }

    @Override
    protected void internalClose() {
        closeQuietly(client);
    }
}
