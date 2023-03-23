
package com.commercetools.api.client;

import java.util.function.UnaryOperator;

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

    public ByProjectKeyMeQuoteRequestsKeyByKeyPost post(
            com.commercetools.api.models.me.MyQuoteRequestUpdate myQuoteRequestUpdate) {
        return new ByProjectKeyMeQuoteRequestsKeyByKeyPost(apiHttpClient, projectKey, key, myQuoteRequestUpdate);
    }

    public ByProjectKeyMeQuoteRequestsKeyByKeyPostString post(final String myQuoteRequestUpdate) {
        return new ByProjectKeyMeQuoteRequestsKeyByKeyPostString(apiHttpClient, projectKey, key, myQuoteRequestUpdate);
    }

    public ByProjectKeyMeQuoteRequestsKeyByKeyPost post(
            UnaryOperator<com.commercetools.api.models.me.MyQuoteRequestUpdateBuilder> op) {
        return post(op.apply(com.commercetools.api.models.me.MyQuoteRequestUpdateBuilder.of()).build());
    }

    public ByProjectKeyMeQuoteRequestsKeyByKeyDelete delete() {
        return new ByProjectKeyMeQuoteRequestsKeyByKeyDelete(apiHttpClient, projectKey, key);
    }

    public <TValue> ByProjectKeyMeQuoteRequestsKeyByKeyDelete delete(TValue version) {
        return delete().withVersion(version);
    }

    public ByProjectKeyMeQuoteRequestsKeyByKeyGet get() {
        return new ByProjectKeyMeQuoteRequestsKeyByKeyGet(apiHttpClient, projectKey, key);
    }

}
