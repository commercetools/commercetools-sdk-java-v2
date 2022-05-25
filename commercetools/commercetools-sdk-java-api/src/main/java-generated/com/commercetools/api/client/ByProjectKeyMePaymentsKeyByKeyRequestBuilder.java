
package com.commercetools.api.client;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyMePaymentsKeyByKeyRequestBuilder {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;
    private final String key;

    public ByProjectKeyMePaymentsKeyByKeyRequestBuilder(final ApiHttpClient apiHttpClient, final String projectKey,
            final String key) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
        this.key = key;
    }

    public ByProjectKeyMePaymentsKeyByKeyGet get() {
        return new ByProjectKeyMePaymentsKeyByKeyGet(apiHttpClient, projectKey, key);
    }

    public ByProjectKeyMePaymentsKeyByKeyPost post(com.commercetools.api.models.me.MyPaymentUpdate myPaymentUpdate) {
        return new ByProjectKeyMePaymentsKeyByKeyPost(apiHttpClient, projectKey, key, myPaymentUpdate);
    }

    public ByProjectKeyMePaymentsKeyByKeyDelete delete() {
        return new ByProjectKeyMePaymentsKeyByKeyDelete(apiHttpClient, projectKey, key);
    }

}
