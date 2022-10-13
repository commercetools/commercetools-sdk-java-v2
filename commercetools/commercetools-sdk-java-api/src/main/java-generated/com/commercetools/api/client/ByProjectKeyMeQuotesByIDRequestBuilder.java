
package com.commercetools.api.client;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyMeQuotesByIDRequestBuilder {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;
    private final String ID;

    public ByProjectKeyMeQuotesByIDRequestBuilder(final ApiHttpClient apiHttpClient, final String projectKey,
            final String ID) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
        this.ID = ID;
    }

    public ByProjectKeyMeQuotesByIDGet get() {
        return new ByProjectKeyMeQuotesByIDGet(apiHttpClient, projectKey, ID);
    }

    public ByProjectKeyMeQuotesByIDPost post(com.commercetools.api.models.me.MyQuoteUpdate myQuoteUpdate) {
        return new ByProjectKeyMeQuotesByIDPost(apiHttpClient, projectKey, ID, myQuoteUpdate);
    }

}
