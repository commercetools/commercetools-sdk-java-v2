
package com.commercetools.api.client;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeySubscriptionsByIDRequestBuilder {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;
    private final String ID;

    public ByProjectKeySubscriptionsByIDRequestBuilder(final ApiHttpClient apiHttpClient, final String projectKey,
            final String ID) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
        this.ID = ID;
    }

    public ByProjectKeySubscriptionsByIDGet get() {
        return new ByProjectKeySubscriptionsByIDGet(apiHttpClient, projectKey, ID);
    }

    public ByProjectKeySubscriptionsByIDPost post(
            com.commercetools.api.models.subscription.SubscriptionUpdate subscriptionUpdate) {
        return new ByProjectKeySubscriptionsByIDPost(apiHttpClient, projectKey, ID, subscriptionUpdate);
    }

    public ByProjectKeySubscriptionsByIDDelete delete() {
        return new ByProjectKeySubscriptionsByIDDelete(apiHttpClient, projectKey, ID);
    }

    public ByProjectKeySubscriptionsByIDHealthRequestBuilder withIdHealth() {
        return new ByProjectKeySubscriptionsByIDHealthRequestBuilder(apiHttpClient, projectKey, ID);
    }
}
