
package io.vrap.rmf.okhttp;

import java.util.concurrent.ExecutorService;
import java.util.function.Supplier;

import io.vrap.rmf.base.client.BaseHttpClientSupplier;
import io.vrap.rmf.base.client.VrapHttpClient;

@Deprecated
public class VrapOkHttpClientSupplier extends BaseHttpClientSupplier {

    @Override
    public VrapHttpClient get() {
        return new VrapOkHttpClient();
    }

    @Override
    public Supplier<VrapHttpClient> get(ExecutorService executorService) {
        return () -> new VrapOkHttpClient(executorService, 64, 64);
    }
}
