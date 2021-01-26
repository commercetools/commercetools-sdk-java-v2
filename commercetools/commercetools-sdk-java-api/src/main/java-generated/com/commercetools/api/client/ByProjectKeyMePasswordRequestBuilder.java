
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

    public ByProjectKeyMePasswordPost post(Object obj) {
        return new ByProjectKeyMePasswordPost(apiHttpClient, projectKey, obj);
    }

    public ByProjectKeyMePasswordResetRequestBuilder reset() {
        return new ByProjectKeyMePasswordResetRequestBuilder(apiHttpClient, projectKey);
    }
}
