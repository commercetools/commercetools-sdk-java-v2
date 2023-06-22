
package com.commercetools.http.javanet;

import java.util.concurrent.ExecutorService;
import java.util.function.Supplier;

import io.vrap.rmf.base.client.BaseHttpClientSupplier;
import io.vrap.rmf.base.client.VrapHttpClient;

public class JavaNetHttpClientSupplier extends BaseHttpClientSupplier {

    @Override
    public VrapHttpClient get() {
        return new CtJavaNetHttpClient();
    }

    @Override
    public Supplier<VrapHttpClient> get(ExecutorService executorService) {
        return () -> new CtJavaNetHttpClient(executorService);
    }
}
