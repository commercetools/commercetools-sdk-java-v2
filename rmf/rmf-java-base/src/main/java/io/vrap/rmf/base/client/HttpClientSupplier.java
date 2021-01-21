
package io.vrap.rmf.base.client;

import java.util.ServiceLoader;
import java.util.function.Supplier;

import io.vrap.rmf.base.client.error.BaseException;

public interface HttpClientSupplier extends Supplier<VrapHttpClient> {

    static Supplier<VrapHttpClient> of() {
        ServiceLoader<HttpClientSupplier> loader = ServiceLoader.load(HttpClientSupplier.class,
            HttpClientSupplier.class.getClassLoader());
        HttpClientSupplier httpClientFactory = loader.iterator().next();
        if (httpClientFactory == null) {
            throw new BaseException(new NoClassDefFoundError(HttpClientSupplier.class.getCanonicalName()));
        }
        return httpClientFactory;
    }
}
