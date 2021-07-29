
package io.vrap.rmf.base.client;

import java.text.MessageFormat;
import java.util.ServiceLoader;
import java.util.function.Supplier;

import io.vrap.rmf.base.client.error.BaseException;

public interface HttpClientSupplier extends Supplier<VrapHttpClient> {

    static Supplier<VrapHttpClient> of() {
        final ServiceLoader<HttpClientSupplier> loader = ServiceLoader.load(HttpClientSupplier.class,
            HttpClientSupplier.class.getClassLoader());
        HttpClientSupplier httpClientFactory = null;
        try {
            httpClientFactory = loader.iterator().next();
        }
        catch (Throwable ignored) {
        }

        if (httpClientFactory == null) {
            final String s = MessageFormat.format(
                "No {0} found. A dependency providing a compatible HTTP client may be missing e.g. commercetools-http-client.",
                HttpClientSupplier.class.getCanonicalName());
            throw new BaseException(new NoClassDefFoundError(s));
        }
        return httpClientFactory;
    }
}
