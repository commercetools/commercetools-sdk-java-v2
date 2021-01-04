package io.vrap.rmf.okhttp;

import io.vrap.rmf.base.client.BaseHttpClientSupplier;
import io.vrap.rmf.base.client.VrapHttpClient;

public class OkHttpClientSupplier extends BaseHttpClientSupplier {

    @Override
    public VrapHttpClient get() {
        return new VrapOkHttpClient();
    }
}
