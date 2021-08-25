
package com.commercetools.http.apachehttp;

import java.util.concurrent.CompletableFuture;

import org.apache.hc.core5.concurrent.FutureCallback;

final class CompletableFutureCallbackAdapter<T> implements FutureCallback<T> {
    private final CompletableFuture<T> future;

    public CompletableFutureCallbackAdapter(final CompletableFuture<T> future) {
        this.future = future;
    }

    @Override
    public void cancelled() {
        future.cancel(true);
    }

    @Override
    public void completed(final T result) {
        future.complete(result);
    }

    @Override
    public void failed(final Exception e) {
        future.completeExceptionally(e);
    }
}
