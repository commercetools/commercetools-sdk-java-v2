
package com.commercetools.api.client;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyStagedQuotesRequestBuilder {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;

    public ByProjectKeyStagedQuotesRequestBuilder(final ApiHttpClient apiHttpClient, final String projectKey) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
    }

    public ByProjectKeyStagedQuotesGet get() {
        return new ByProjectKeyStagedQuotesGet(apiHttpClient, projectKey);
    }

    public ByProjectKeyStagedQuotesPost post(
            com.commercetools.api.models.staged_quote.StagedQuoteDraft stagedQuoteDraft) {
        return new ByProjectKeyStagedQuotesPost(apiHttpClient, projectKey, stagedQuoteDraft);
    }

    public ByProjectKeyStagedQuotesKeyByKeyRequestBuilder withKey(String key) {
        return new ByProjectKeyStagedQuotesKeyByKeyRequestBuilder(apiHttpClient, projectKey, key);
    }

    public ByProjectKeyStagedQuotesByIDRequestBuilder withId(String ID) {
        return new ByProjectKeyStagedQuotesByIDRequestBuilder(apiHttpClient, projectKey, ID);
    }
}
