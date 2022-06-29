
package io.vrap.rmf.base.client;

import java.io.Closeable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;

import io.vrap.rmf.base.client.error.BaseException;

public abstract class HttpClientBase implements VrapHttpClient, Closeable {
    private final ExecutorService executorService;

    protected HttpClientBase() {
        this.executorService = new ForkJoinPool();
    }

    protected HttpClientBase(ExecutorService executorService) {
        this.executorService = executorService;
    }

    @Override
    public final void close() {
        try {
            executorService.shutdown();
            closeDelegate();
        }
        catch (final Throwable e) {
            throw new BaseException(e);
        }
    }

    protected abstract void closeDelegate() throws Throwable;

    protected final Executor executor() {
        return executorService;
    }
}
