
package io.vrap.rmf.base.client;

import java.net.URI;
import java.util.concurrent.CompletableFuture;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JavaType;

import io.vrap.rmf.base.client.http.HandlerStack;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 * Default implementation of an {@link ApiHttpClient}
 */
public class ApiHttpClientImpl extends AutoCloseableService implements ApiHttpClient {

    private final HandlerStack stack;
    private final URI baseUri;
    private final ResponseSerializer serializer;

    public ApiHttpClientImpl(final String baseUri, final HandlerStack stack) {
        this(URI.create(baseUri), stack, ResponseSerializer.of());
    }

    public ApiHttpClientImpl(final URI baseUri, final HandlerStack stack) {
        this(baseUri, stack, ResponseSerializer.of());
    }

    public ApiHttpClientImpl(final URI baseUri, final HandlerStack stack, final ResponseSerializer serializer) {
        this.stack = stack;
        this.baseUri = baseUri;
        this.serializer = serializer;
    }

    @Override
    public CompletableFuture<ApiHttpResponse<byte[]>> execute(final ApiHttpRequest request) {
        rejectExecutionIfClosed(CLOSED_MESSAGE);
        return stack.invoke(request.resolve(baseUri));
    }

    @Override
    public <O> CompletableFuture<ApiHttpResponse<O>> execute(final ClientRequestCommand<O> method) {
        return method.execute(this);
    }

    @Override
    public <O> CompletableFuture<ApiHttpResponse<O>> execute(final ApiHttpRequest request, final Class<O> outputType) {
        return execute(request).thenApply(response -> serializer.convertResponse(response, outputType));
    }

    @Override
    public <O> CompletableFuture<ApiHttpResponse<O>> execute(final ApiHttpRequest request,
            final TypeReference<O> outputType) {
        return execute(request).thenApply(response -> serializer.convertResponse(response, outputType));
    }

    @Override
    public <O> CompletableFuture<ApiHttpResponse<O>> execute(final ApiHttpRequest request, final JavaType outputType) {
        return execute(request).thenApply(response -> serializer.convertResponse(response, outputType));
    }

    @Override
    public ResponseSerializer getSerializerService() {
        return serializer;
    }

    @Override
    protected void internalClose() {
        closeQuietly(stack);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ApiHttpClientImpl that = (ApiHttpClientImpl) o;

        return new EqualsBuilder().append(stack, that.stack)
                .append(baseUri, that.baseUri)
                .append(serializer, that.serializer)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(stack).append(baseUri).append(serializer).toHashCode();
    }
}
