
package com.commercetools.http.netty;

import java.util.concurrent.ExecutorService;
import java.util.function.Supplier;

import io.vrap.rmf.base.client.BaseHttpClientSupplier;
import io.vrap.rmf.base.client.VrapHttpClient;

public class NettyHttpClientSupplier extends BaseHttpClientSupplier {

    @Override
    public VrapHttpClient get() {
        return new CtNettyHttpClient();
    }

    @Override
    public Supplier<VrapHttpClient> get(ExecutorService executorService) {
        return () -> new CtNettyHttpClient(executorService);
    }
}
