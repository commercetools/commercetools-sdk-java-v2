
package io.vrap.rmf.base.client;

import java.util.concurrent.CompletableFuture;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * Implementation of a non executable {@link ApiHttpClient}
 */
public class SerializerOnlyApiHttpClient implements ApiHttpClient {
    public static final String NO_EXECUTABLE_API_CLIENT = "No executable api client";
    private final ResponseSerializer serializer;

    private SerializerOnlyApiHttpClient(ResponseSerializer serializer) {
        this.serializer = serializer;
    }

    public static SerializerOnlyApiHttpClient of() {
        return new SerializerOnlyApiHttpClient(ResponseSerializer.of());
    }

    public static SerializerOnlyApiHttpClient of(ObjectMapper objectMapper) {
        return new SerializerOnlyApiHttpClient(ResponseSerializer.of(objectMapper));
    }

    public static SerializerOnlyApiHttpClient of(ResponseSerializer serializer) {
        return new SerializerOnlyApiHttpClient(serializer);
    }

    @Override
    public <O> CompletableFuture<ApiHttpResponse<O>> execute(ApiHttpRequest request, Class<O> outputType) {
        throw new IllegalStateException(NO_EXECUTABLE_API_CLIENT);
    }

    @Override
    public <O> CompletableFuture<ApiHttpResponse<O>> execute(ApiHttpRequest request, TypeReference<O> outputType) {
        throw new IllegalStateException(NO_EXECUTABLE_API_CLIENT);
    }

    @Override
    public <O> CompletableFuture<ApiHttpResponse<O>> execute(ApiHttpRequest request, JavaType outputType) {
        throw new IllegalStateException(NO_EXECUTABLE_API_CLIENT);
    }

    @Override
    public <O> CompletableFuture<ApiHttpResponse<O>> execute(ClientRequestCommand<O> method) {
        throw new IllegalStateException(NO_EXECUTABLE_API_CLIENT);
    }

    @Override
    public ResponseSerializer getSerializerService() {
        return serializer;
    }

    @Override
    public CompletableFuture<ApiHttpResponse<byte[]>> execute(ApiHttpRequest request) {
        throw new IllegalStateException(NO_EXECUTABLE_API_CLIENT);
    }

    @Override
    public void close() throws Exception {

    }
}
