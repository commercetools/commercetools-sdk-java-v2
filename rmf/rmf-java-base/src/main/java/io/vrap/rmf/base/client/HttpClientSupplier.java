
package io.vrap.rmf.base.client;

import java.util.ServiceLoader;
import java.util.function.Supplier;

import io.vrap.rmf.base.client.error.BaseException;

public interface HttpClientSupplier extends Supplier<VrapHttpClient> {

    static Supplier<VrapHttpClient> of() {
        ServiceLoader<BaseHttpClientSupplier> loader = ServiceLoader.load(BaseHttpClientSupplier.class,
            BaseHttpClientSupplier.class.getClassLoader());
        BaseHttpClientSupplier httpClientFactory = loader.iterator().next();
        if (httpClientFactory == null) {
            throw new BaseException(new NoClassDefFoundError(BaseHttpClientSupplier.class.getCanonicalName()));
        }
        return httpClientFactory;
    }
}
