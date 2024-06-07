
package com.commercetools.api.client;

import static io.vrap.rmf.base.client.utils.ClientUtils.blockingWait;

import java.time.Duration;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;
import java.util.function.BiFunction;
import java.util.function.Function;

import com.commercetools.api.client.error.ConcurrentModificationException;
import com.commercetools.api.models.ResourceUpdate;
import com.spotify.futures.CompletableFutures;

import io.vrap.rmf.base.client.*;

/**
 * This handler can be used to retry a single request in case of a {@link ConcurrentModificationException concurrent modification}.
 */
final class ConcurrentModificationRetryHandler<T extends BodyApiMethod<T, TResult, TBody>, TResult, TBody extends ResourceUpdate<TBody, ?, TBuilder>, TBuilder extends Builder<TBody>>
        implements RequestCommand<TResult> {
    private final T request;
    private final Function<TBody, TBuilder> builderCopyFn;
    private final BiFunction<TBuilder, Long, TBuilder> updateFn;

    ConcurrentModificationRetryHandler(T request, Function<TBody, TBuilder> builderCopyFn,
            BiFunction<TBuilder, Long, TBuilder> updateFn) {
        this.request = request;
        this.builderCopyFn = builderCopyFn;
        this.updateFn = updateFn;
    }

    @SuppressWarnings("unchecked")
    public CompletableFuture<ApiHttpResponse<TResult>> execute() {
        Function<Throwable, CompletableFuture<ApiHttpResponse<TResult>>> fn = (throwable) -> {
            final Throwable cause = throwable instanceof CompletionException ? throwable.getCause() : throwable;
            if (cause instanceof ConcurrentModificationException) {
                final TBuilder body = updateFn.apply(builderCopyFn.apply(request.getBody()),
                    ((ConcurrentModificationException) cause).getCurrentVersion());
                return request.withBody(body.build()).execute();
            }

            final CompletableFuture<ApiHttpResponse<TResult>> f = new CompletableFuture<>();
            f.completeExceptionally(throwable);
            return f;
        };

        return CompletableFutures.exceptionallyCompose(request.execute(), fn).toCompletableFuture();
    }

    @Override
    public ApiHttpResponse<TResult> executeBlocking(Duration timeout) {
        return blockingWait(execute(), timeout);
    }
}
