
package com.commercetools.api.client;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ByProjectKeyMePasswordRequestBuilder {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;

    public ByProjectKeyMePasswordRequestBuilder(final ApiHttpClient apiHttpClient, final String projectKey) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
    }

    public ByProjectKeyMePasswordPost post(
            com.commercetools.api.models.customer.MyCustomerChangePassword myCustomerChangePassword) {
        return new ByProjectKeyMePasswordPost(apiHttpClient, projectKey, myCustomerChangePassword);
    }

    public ByProjectKeyMePasswordResetRequestBuilder reset() {
        return new ByProjectKeyMePasswordResetRequestBuilder(apiHttpClient, projectKey);
    }
}
