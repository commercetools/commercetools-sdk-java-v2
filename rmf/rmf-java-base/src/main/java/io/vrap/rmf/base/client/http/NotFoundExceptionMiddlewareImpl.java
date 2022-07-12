
package io.vrap.rmf.base.client.http;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;
import java.util.function.Function;
import java.util.function.Predicate;

import com.spotify.futures.CompletableFutures;

import io.vrap.rmf.base.client.ApiHttpRequest;
import io.vrap.rmf.base.client.ApiHttpResponse;
import io.vrap.rmf.base.client.error.NotFoundException;

class NotFoundExceptionMiddlewareImpl implements NotFoundExceptionMiddleware {
    private final Predicate<ApiHttpRequest> requestPredicate;

    public NotFoundExceptionMiddlewareImpl() {
        requestPredicate = apiHttpRequest -> true;
    }

    public NotFoundExceptionMiddlewareImpl(final Predicate<ApiHttpRequest> requestPredicate) {
        this.requestPredicate = requestPredicate;
    }

    @Override
    public CompletableFuture<ApiHttpResponse<byte[]>> invoke(ApiHttpRequest request,
            Function<ApiHttpRequest, CompletableFuture<ApiHttpResponse<byte[]>>> next) {
        return CompletableFutures.exceptionallyCompose(next.apply(request), (throwable) -> {
            Throwable cause = throwable instanceof CompletionException ? throwable.getCause() : throwable;
            if (cause instanceof NotFoundException && requestPredicate.test(request)) {
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
