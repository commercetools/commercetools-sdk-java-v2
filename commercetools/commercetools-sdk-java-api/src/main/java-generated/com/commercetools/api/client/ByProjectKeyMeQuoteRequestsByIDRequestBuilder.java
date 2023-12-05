
package com.commercetools.api.client;

import java.util.function.UnaryOperator;

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

    public ByProjectKeyMeQuoteRequestsByIDHead head() {
        return new ByProjectKeyMeQuoteRequestsByIDHead(apiHttpClient, projectKey, ID);
    }

    public ByProjectKeyMeQuoteRequestsByIDPost post(
            com.commercetools.api.models.me.MyQuoteRequestUpdate myQuoteRequestUpdate) {
        return new ByProjectKeyMeQuoteRequestsByIDPost(apiHttpClient, projectKey, ID, myQuoteRequestUpdate);
    }

    public ByProjectKeyMeQuoteRequestsByIDPostString post(final String myQuoteRequestUpdate) {
        return new ByProjectKeyMeQuoteRequestsByIDPostString(apiHttpClient, projectKey, ID, myQuoteRequestUpdate);
    }

    public ByProjectKeyMeQuoteRequestsByIDPost post(
            UnaryOperator<com.commercetools.api.models.me.MyQuoteRequestUpdateBuilder> op) {
        return post(op.apply(com.commercetools.api.models.me.MyQuoteRequestUpdateBuilder.of()).build());
    }

    public ByProjectKeyMeQuoteRequestsByIDDelete delete() {
        return new ByProjectKeyMeQuoteRequestsByIDDelete(apiHttpClient, projectKey, ID);
    }

    public <TValue> ByProjectKeyMeQuoteRequestsByIDDelete delete(TValue version) {
        return delete().withVersion(version);
    }

}
