
package com.commercetools.http.okhttp3;

import java.util.concurrent.ExecutorService;
import java.util.function.Supplier;

import io.vrap.rmf.base.client.BaseHttpClientSupplier;
import io.vrap.rmf.base.client.VrapHttpClient;

public class OkHttp3ClientSupplier extends BaseHttpClientSupplier {

    @Override
    public VrapHttpClient get() {
        return new CtOkHttp3Client();
    }

    @Override
    public Supplier<VrapHttpClient> get(ExecutorService executorService) {
        return () -> new CtOkHttp3Client(executorService);
    }
}
