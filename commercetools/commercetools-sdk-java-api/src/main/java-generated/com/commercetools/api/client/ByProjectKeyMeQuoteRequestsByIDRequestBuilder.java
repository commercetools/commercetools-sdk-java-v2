
package com.commercetools.api.client;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyMeQuoteRequestsByIDRequestBuilder {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;
    private final String ID;

    public ByProjectKeyMeQuoteRequestsByIDRequestBuilder(final ApiHttpClient apiHttpClient, final String projectKey,
            final String ID) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
        this.ID = ID;
    }

    public ByProjectKeyMeQuoteRequestsByIDGet get() {
        return new ByProjectKeyMeQuoteRequestsByIDGet(apiHttpClient, projectKey, ID);
    }

    public ByProjectKeyMeQuoteRequestsByIDPost post(
            com.commercetools.api.models.me.MyQuoteRequestUpdate myQuoteRequestUpdate) {
        return new ByProjectKeyMeQuoteRequestsByIDPost(apiHttpClient, projectKey, ID, myQuoteRequestUpdate);
    }

    public ByProjectKeyMeQuoteRequestsByIDDelete delete() {
        return new ByProjectKeyMeQuoteRequestsByIDDelete(apiHttpClient, projectKey, ID);
    }

}
