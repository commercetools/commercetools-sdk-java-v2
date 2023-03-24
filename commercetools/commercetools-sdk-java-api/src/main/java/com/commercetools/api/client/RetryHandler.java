
package com.commercetools.api.client;

import java.util.concurrent.CompletableFuture;
import java.util.function.BiFunction;
import java.util.function.Function;

import com.commercetools.api.models.ResourceUpdate;

import io.vrap.rmf.base.client.*;

/**
 * Handler functions to retry single requests.
 * @param <TResult> type of the result
 * {@include.example commercetools.ConcurrentModificationTest#concurrentMod()}
 */
public interface RetryHandler<TResult> {
    CompletableFuture<ApiHttpResponse<TResult>> execute();

    static <T extends BodyApiMethod<T, TResult, TBody>, TResult, TBody extends ResourceUpdate<TBody, ?, TBuilder>, TBuilder extends Builder<TBody>> RequestCommand<TResult> concurrentModification(
            T request, Function<TBody, TBuilder> builderCopyFn, BiFunction<TBuilder, Long, TBuilder> updateFn) {
        return new ConcurrentModificationRetryHandler<>(request, builderCopyFn, updateFn);
    }

    static <T extends ApiDeleteMethod<T, TResult>, TResult> RequestCommand<TResult> concurrentModification(T request) {
        return new ConcurrentModificationDeleteRetryHandler<>(request,
            (apiRequest, newVersion) -> request.withVersion(newVersion).asBaseType());
    }
}
