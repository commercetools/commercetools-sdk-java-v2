
package com.commercetools.api.client;

import static io.vrap.rmf.base.client.utils.ClientUtils.blockingWait;

import java.time.Duration;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;
import java.util.function.BiFunction;
import java.util.function.Function;

import com.commercetools.api.client.error.ConcurrentModificationException;

import io.vrap.rmf.base.client.*;

/**
 * This handler can be used to retry a single request in case of a {@link ConcurrentModificationException concurrent modification} for delete requests.
 */
final class ConcurrentModificationDeleteRetryHandler<T extends ApiDeleteMethod<T, TResult>, TResult>
        implements RequestCommand<TResult> {
    private final T request;
    private final BiFunction<T, Long, T> updateFn;

    ConcurrentModificationDeleteRetryHandler(T request, BiFunction<T, Long, T> updateFn) {
        this.request = request;
        this.updateFn = updateFn;
    }

    @SuppressWarnings("unchecked")
    public CompletableFuture<ApiHttpResponse<TResult>> execute() {
        Function<Throwable, CompletableFuture<ApiHttpResponse<TResult>>> fn = (throwable) -> {
            final Throwable cause = throwable instanceof CompletionException ? throwable.getCause() : throwable;
            if (cause instanceof ConcurrentModificationException) {
                return updateFn
                        .apply(request, ((ConcurrentModificationException) throwable.getCause()).getCurrentVersion())
                        .execute();
            }

            final CompletableFuture<ApiHttpResponse<TResult>> f = new CompletableFuture<>();
            f.completeExceptionally(throwable);
            return f;
        };

        return request.execute()
                .handle((r, ex) -> (ex == null) ? this : fn.apply(ex))
                .thenCompose(x -> (CompletableFuture<ApiHttpResponse<TResult>>) x);
    }

    @Override
    public ApiHttpResponse<TResult> executeBlocking() {
        return executeBlocking(Duration.ofSeconds(120));
    }

    @Override
    public ApiHttpResponse<TResult> executeBlocking(Duration timeout) {
        return blockingWait(execute(), timeout);
    }
}
