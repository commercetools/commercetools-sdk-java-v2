
package io.vrap.rmf.base.client;

import java.util.concurrent.ExecutorService;
import java.util.function.Supplier;

public interface ExecutorHttpClientSupplier {
    public abstract Supplier<VrapHttpClient> get(ExecutorService executorService);
}
