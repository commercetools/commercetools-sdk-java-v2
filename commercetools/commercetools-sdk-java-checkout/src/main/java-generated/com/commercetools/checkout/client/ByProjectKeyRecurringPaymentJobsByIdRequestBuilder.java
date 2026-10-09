
package com.commercetools.checkout.client;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyRecurringPaymentJobsByIdRequestBuilder {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;
    private final String id;

    public ByProjectKeyRecurringPaymentJobsByIdRequestBuilder(final ApiHttpClient apiHttpClient,
            final String projectKey, final String id) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
        this.id = id;
    }

    public ByProjectKeyRecurringPaymentJobsByIdGet get() {
        return new ByProjectKeyRecurringPaymentJobsByIdGet(apiHttpClient, projectKey, id);
    }

    public ByProjectKeyRecurringPaymentJobsByIdDelete delete() {
        return new ByProjectKeyRecurringPaymentJobsByIdDelete(apiHttpClient, projectKey, id);
    }

    public <TValue> ByProjectKeyRecurringPaymentJobsByIdDelete delete(TValue version) {
        return delete().withVersion(version);
    }

}
