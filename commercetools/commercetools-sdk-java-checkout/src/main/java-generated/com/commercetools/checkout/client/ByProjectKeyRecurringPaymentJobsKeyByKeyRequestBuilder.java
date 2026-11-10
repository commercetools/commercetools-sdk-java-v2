
package com.commercetools.checkout.client;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyRecurringPaymentJobsKeyByKeyRequestBuilder {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;
    private final String key;

    public ByProjectKeyRecurringPaymentJobsKeyByKeyRequestBuilder(final ApiHttpClient apiHttpClient,
            final String projectKey, final String key) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
        this.key = key;
    }

    public ByProjectKeyRecurringPaymentJobsKeyByKeyGet get() {
        return new ByProjectKeyRecurringPaymentJobsKeyByKeyGet(apiHttpClient, projectKey, key);
    }

    public ByProjectKeyRecurringPaymentJobsKeyByKeyDelete delete() {
        return new ByProjectKeyRecurringPaymentJobsKeyByKeyDelete(apiHttpClient, projectKey, key);
    }

    public <TValue> ByProjectKeyRecurringPaymentJobsKeyByKeyDelete delete(TValue version) {
        return delete().withVersion(version);
    }

}
