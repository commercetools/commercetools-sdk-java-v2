
package com.commercetools.api.client;

import static io.vrap.rmf.base.client.utils.ClientUtils.blockingWait;

import java.time.Duration;
import java.util.concurrent.CompletableFuture;
import java.util.function.BiFunction;
import java.util.function.Function;

import com.commercetools.api.client.error.ConcurrentModificationException;
import com.commercetools.api.models.ResourceUpdate;

import io.vrap.rmf.base.client.ApiHttpResponse;
import io.vrap.rmf.base.client.BodyApiMethod;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.RequestCommand;

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
            if (throwable.getCause() instanceof ConcurrentModificationException) {
                final TBuilder body1 = updateFn.apply(builderCopyFn.apply(request.getBody()),
                    ((ConcurrentModificationException) throwable.getCause()).getCurrentVersion());
                return request.withBody(body1.build()).execute();
            }

            CompletableFuture<ApiHttpResponse<TResult>> f = new CompletableFuture<>();
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
