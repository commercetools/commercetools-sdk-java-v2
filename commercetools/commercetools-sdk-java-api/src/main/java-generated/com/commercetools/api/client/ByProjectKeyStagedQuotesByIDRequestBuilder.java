
package com.commercetools.api.client;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyStagedQuotesByIDRequestBuilder {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;
    private final String ID;

    public ByProjectKeyStagedQuotesByIDRequestBuilder(final ApiHttpClient apiHttpClient, final String projectKey,
            final String ID) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
        this.ID = ID;
    }

    public ByProjectKeyStagedQuotesByIDGet get() {
        return new ByProjectKeyStagedQuotesByIDGet(apiHttpClient, projectKey, ID);
    }

    public ByProjectKeyStagedQuotesByIDPost post(
            com.commercetools.api.models.staged_quote.StagedQuoteUpdate stagedQuoteUpdate) {
        return new ByProjectKeyStagedQuotesByIDPost(apiHttpClient, projectKey, ID, stagedQuoteUpdate);
    }

    public ByProjectKeyStagedQuotesByIDDelete delete() {
        return new ByProjectKeyStagedQuotesByIDDelete(apiHttpClient, projectKey, ID);
    }

}
