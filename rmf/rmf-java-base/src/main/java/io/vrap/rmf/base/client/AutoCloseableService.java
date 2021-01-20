
package io.vrap.rmf.base.client;

import java.util.function.Supplier;

import io.vrap.rmf.base.client.http.InternalLogger;

public abstract class AutoCloseableService extends Base implements AutoCloseable {
    private boolean closed = false;

    protected AutoCloseableService() {
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
        }
        finally {
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
        }
        catch (final Exception e) {
            InternalLogger.getLogger(AutoCloseableService.class).error(() -> "Error on closing resource.", e);
        }
    }
}
