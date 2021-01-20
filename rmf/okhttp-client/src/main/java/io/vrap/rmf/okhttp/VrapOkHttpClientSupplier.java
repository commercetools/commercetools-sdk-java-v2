
package io.vrap.rmf.okhttp;

import io.vrap.rmf.base.client.BaseHttpClientSupplier;
import io.vrap.rmf.base.client.VrapHttpClient;

@Deprecated
public class VrapOkHttpClientSupplier extends BaseHttpClientSupplier {

    @Override
    public VrapHttpClient get() {
        return new VrapOkHttpClient();
    }
}
