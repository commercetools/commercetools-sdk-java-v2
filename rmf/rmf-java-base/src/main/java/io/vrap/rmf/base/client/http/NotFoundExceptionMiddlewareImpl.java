
package io.vrap.rmf.base.client.http;

import java.util.concurrent.CompletableFuture;
import java.util.function.Function;

import com.spotify.futures.CompletableFutures;

import io.vrap.rmf.base.client.ApiHttpRequest;
import io.vrap.rmf.base.client.ApiHttpResponse;
import io.vrap.rmf.base.client.error.NotFoundException;

class NotFoundExceptionMiddlewareImpl implements NotFoundExceptionMiddleware {
    @Override
    public CompletableFuture<ApiHttpResponse<byte[]>> invoke(ApiHttpRequest request,
            Function<ApiHttpRequest, CompletableFuture<ApiHttpResponse<byte[]>>> next) {
        return CompletableFutures.exceptionallyCompose(next.apply(request), (throwable) -> {
            if (throwable.getCause() instanceof NotFoundException) {
                ApiHttpResponse<byte[]> response = ((NotFoundException) throwable.getCause()).getResponse();
                return CompletableFuture
                        .completedFuture(new ApiHttpResponse<>(response.getStatusCode(), response.getHeaders(), null));
            }
            CompletableFuture<ApiHttpResponse<byte[]>> future = new CompletableFuture<>();
            future.completeExceptionally(throwable.getCause());
            return future;
        }).toCompletableFuture();
    }
}
