
package com.commercetools.api.client;

import java.util.function.UnaryOperator;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyInStoreKeyByStoreKeyMeSignupRequestBuilder {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;
    private final String storeKey;

    public ByProjectKeyInStoreKeyByStoreKeyMeSignupRequestBuilder(final ApiHttpClient apiHttpClient,
            final String projectKey, final String storeKey) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
        this.storeKey = storeKey;
    }

    public ByProjectKeyInStoreKeyByStoreKeyMeSignupPost post(
            com.commercetools.api.models.me.MyCustomerDraft myCustomerDraft) {
        return new ByProjectKeyInStoreKeyByStoreKeyMeSignupPost(apiHttpClient, projectKey, storeKey, myCustomerDraft);
    }

    public ByProjectKeyInStoreKeyByStoreKeyMeSignupPostString post(final String myCustomerDraft) {
        return new ByProjectKeyInStoreKeyByStoreKeyMeSignupPostString(apiHttpClient, projectKey, storeKey,
            myCustomerDraft);
    }

    public ByProjectKeyInStoreKeyByStoreKeyMeSignupPost post(
            UnaryOperator<com.commercetools.api.models.me.MyCustomerDraftBuilder> op) {
        return post(op.apply(com.commercetools.api.models.me.MyCustomerDraftBuilder.of()).build());
    }

}
