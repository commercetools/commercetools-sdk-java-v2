
package com.commercetools.money;

import java.text.MessageFormat;
import java.util.ServiceLoader;

public class MonetarySupplier {
    private static final MonetaryProvider MONETARY_PROVIDER;

    static {
        MONETARY_PROVIDER = of();
    }

    public static MonetaryProvider instance() {
        return MONETARY_PROVIDER;
    }

    public static MonetaryProvider of() {
        final ServiceLoader<MonetaryProvider> loader = ServiceLoader.load(MonetaryProvider.class,
            MonetaryProvider.class.getClassLoader());
        MonetaryProvider provider = null;
        try {
            provider = loader.iterator().next();
        }
        catch (Throwable ignored) {
        }

        if (provider == null) {
            final String s = MessageFormat.format("No {0} found. A service locator definition is missing or erroneous.",
                MonetaryProvider.class.getCanonicalName());
            throw new NoClassDefFoundError(s);
        }
        return provider;
    }
}
