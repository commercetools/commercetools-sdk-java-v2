
package com.commercetools.api.client;

import java.util.function.UnaryOperator;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyInStoreKeyByStoreKeyStagedQuotesByIDRequestBuilder {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;
    private final String storeKey;
    private final String ID;

    public ByProjectKeyInStoreKeyByStoreKeyStagedQuotesByIDRequestBuilder(final ApiHttpClient apiHttpClient,
            final String projectKey, final String storeKey, final String ID) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
        this.storeKey = storeKey;
        this.ID = ID;
    }

    public ByProjectKeyInStoreKeyByStoreKeyStagedQuotesByIDGet get() {
        return new ByProjectKeyInStoreKeyByStoreKeyStagedQuotesByIDGet(apiHttpClient, projectKey, storeKey, ID);
    }

    public ByProjectKeyInStoreKeyByStoreKeyStagedQuotesByIDHead head() {
        return new ByProjectKeyInStoreKeyByStoreKeyStagedQuotesByIDHead(apiHttpClient, projectKey, storeKey, ID);
    }

    public ByProjectKeyInStoreKeyByStoreKeyStagedQuotesByIDPost post(
            com.commercetools.api.models.staged_quote.StagedQuoteUpdate stagedQuoteUpdate) {
        return new ByProjectKeyInStoreKeyByStoreKeyStagedQuotesByIDPost(apiHttpClient, projectKey, storeKey, ID,
            stagedQuoteUpdate);
    }

    public ByProjectKeyInStoreKeyByStoreKeyStagedQuotesByIDPostString post(final String stagedQuoteUpdate) {
        return new ByProjectKeyInStoreKeyByStoreKeyStagedQuotesByIDPostString(apiHttpClient, projectKey, storeKey, ID,
            stagedQuoteUpdate);
    }

    public ByProjectKeyInStoreKeyByStoreKeyStagedQuotesByIDPost post(
            UnaryOperator<com.commercetools.api.models.staged_quote.StagedQuoteUpdateBuilder> op) {
        return post(op.apply(com.commercetools.api.models.staged_quote.StagedQuoteUpdateBuilder.of()).build());
    }

    public ByProjectKeyInStoreKeyByStoreKeyStagedQuotesByIDDelete delete() {
        return new ByProjectKeyInStoreKeyByStoreKeyStagedQuotesByIDDelete(apiHttpClient, projectKey, storeKey, ID);
    }

    public <TValue> ByProjectKeyInStoreKeyByStoreKeyStagedQuotesByIDDelete delete(TValue version) {
        return delete().withVersion(version);
    }

}
