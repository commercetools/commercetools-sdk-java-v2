
package com.commercetools.api.client;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyMeQuoteRequestsRequestBuilder {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;

    public ByProjectKeyMeQuoteRequestsRequestBuilder(final ApiHttpClient apiHttpClient, final String projectKey) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
    }

    public ByProjectKeyMeQuoteRequestsGet get() {
        return new ByProjectKeyMeQuoteRequestsGet(apiHttpClient, projectKey);
    }

    public ByProjectKeyMeQuoteRequestsPost post(
            com.commercetools.api.models.me.MyQuoteRequestDraft myQuoteRequestDraft) {
        return new ByProjectKeyMeQuoteRequestsPost(apiHttpClient, projectKey, myQuoteRequestDraft);
    }

    public ByProjectKeyMeQuoteRequestsByIDRequestBuilder withId(String ID) {
        return new ByProjectKeyMeQuoteRequestsByIDRequestBuilder(apiHttpClient, projectKey, ID);
    }

    public ByProjectKeyMeQuoteRequestsKeyByKeyRequestBuilder withKey(String key) {
        return new ByProjectKeyMeQuoteRequestsKeyByKeyRequestBuilder(apiHttpClient, projectKey, key);
    }
}
