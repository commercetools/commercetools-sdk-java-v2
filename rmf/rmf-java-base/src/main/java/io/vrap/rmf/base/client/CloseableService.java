package io.vrap.rmf.base.client;

import io.vrap.rmf.base.client.http.InternalLogger;

import java.io.Closeable;
import java.util.function.Supplier;

public abstract class CloseableService extends Base implements AutoCloseable {
    private boolean closed = false;

    protected CloseableService() {
        log(() -> "Creating " + getLogName());
    }

    private void log(final Supplier<Object> message) {
        InternalLogger.getLogger(this.getClass()).trace(message);
    }

    private String getLogName() {
        return this.getClass().getCanonicalName();
    }

    @Override
    public final synchronized void close() {
        try {
            internalClose();
        } finally {
            closed = true;
            log(() -> "Closing " + getLogName());
        }
    }

    protected abstract void internalClose();

    protected final boolean isClosed() {
        return closed;
    }

    protected void rejectExecutionIfClosed(final String message) {
        if (isClosed()) {
            throw new IllegalStateException(message);//rejection for execution so the exception will not be in the CompletionStage
        }
    }

    public static void closeQuietly(final AutoCloseable closeable) {
        try {
            if (closeable != null) {
                closeable.close();
            }
        } catch (final Exception e) {
            InternalLogger.getLogger(CloseableService.class).error(() -> "Error on closing resource.", e);
        }
    }
}
