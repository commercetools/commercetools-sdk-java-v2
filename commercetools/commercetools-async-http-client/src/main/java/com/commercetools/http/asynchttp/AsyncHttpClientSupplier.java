
package com.commercetools.http.asynchttp;

import io.vrap.rmf.base.client.BaseHttpClientSupplier;
import io.vrap.rmf.base.client.VrapHttpClient;

public class AsyncHttpClientSupplier extends BaseHttpClientSupplier {

    @Override
    public VrapHttpClient get() {
        return new CtAsyncHttpClient();
    }
}
