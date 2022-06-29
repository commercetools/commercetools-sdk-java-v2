
package io.vrap.rmf.base.client;

import java.util.concurrent.ExecutorService;
import java.util.function.Supplier;

/**
 * In order to work, the sdk needs an {@link VrapHttpClient} provider, this can be done by extending {@link HttpClientSupplier}
 * and exposing it as a service
 */
public abstract class BaseHttpClientSupplier implements HttpClientSupplier {

    /**
     * The {@link VrapHttpClient} provider method
     * @return HttpClient implementation
     */
    public abstract VrapHttpClient get();

    public abstract Supplier<VrapHttpClient> get(ExecutorService executorService);
}
