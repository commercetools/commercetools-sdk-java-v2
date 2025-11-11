
package com.commercetools.http.okhttp4;

import java.util.concurrent.ExecutorService;
import java.util.function.Supplier;

import io.vrap.rmf.base.client.BaseHttpClientSupplier;
import io.vrap.rmf.base.client.VrapHttpClient;

public class OkHttp4ClientSupplier extends BaseHttpClientSupplier {

    @Override
    public VrapHttpClient get() {
        return new CtOkHttp4Client();
    }

    @Override
    public Supplier<VrapHttpClient> get(ExecutorService executorService) {
        return () -> new CtOkHttp4Client(executorService);
    }
}
