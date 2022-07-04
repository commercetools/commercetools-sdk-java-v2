
package com.commercetools.api.client;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyMeQuoteRequestsKeyByKeyRequestBuilder {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;
    private final String key;

    public ByProjectKeyMeQuoteRequestsKeyByKeyRequestBuilder(final ApiHttpClient apiHttpClient, final String projectKey,
            final String key) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
        this.key = key;
    }

    public ByProjectKeyMeQuoteRequestsKeyByKeyGet get() {
        return new ByProjectKeyMeQuoteRequestsKeyByKeyGet(apiHttpClient, projectKey, key);
    }

    public ByProjectKeyMeQuoteRequestsKeyByKeyPost post(
            com.commercetools.api.models.me.MyQuoteRequestUpdate myQuoteRequestUpdate) {
        return new ByProjectKeyMeQuoteRequestsKeyByKeyPost(apiHttpClient, projectKey, key, myQuoteRequestUpdate);
    }

    public ByProjectKeyMeQuoteRequestsKeyByKeyDelete delete() {
        return new ByProjectKeyMeQuoteRequestsKeyByKeyDelete(apiHttpClient, projectKey, key);
    }

}
