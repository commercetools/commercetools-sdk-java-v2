
package com.commercetools.api.client;

import java.util.function.UnaryOperator;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyInStoreKeyByStoreKeyCustomersRequestBuilder
        implements ByProjectKeyInStoreKeyByStoreKeyCustomersRequestMixin {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;
    private final String storeKey;

    public ByProjectKeyInStoreKeyByStoreKeyCustomersRequestBuilder(final ApiHttpClient apiHttpClient,
            final String projectKey, final String storeKey) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
        this.storeKey = storeKey;
    }

    public ByProjectKeyInStoreKeyByStoreKeyCustomersGet get() {
        return new ByProjectKeyInStoreKeyByStoreKeyCustomersGet(apiHttpClient, projectKey, storeKey);
    }

    public ByProjectKeyInStoreKeyByStoreKeyCustomersPost post(
            com.commercetools.api.models.customer.CustomerDraft customerDraft) {
        return new ByProjectKeyInStoreKeyByStoreKeyCustomersPost(apiHttpClient, projectKey, storeKey, customerDraft);
    }

    public ByProjectKeyInStoreKeyByStoreKeyCustomersPost post(
            UnaryOperator<com.commercetools.api.models.customer.CustomerDraftBuilder> op) {
        return post(op.apply(com.commercetools.api.models.customer.CustomerDraftBuilder.of()).build());
    }

    public ByProjectKeyInStoreKeyByStoreKeyCustomersPasswordTokenByPasswordTokenRequestBuilder withPasswordToken(
            String passwordToken) {
        return new ByProjectKeyInStoreKeyByStoreKeyCustomersPasswordTokenByPasswordTokenRequestBuilder(apiHttpClient,
            projectKey, storeKey, passwordToken);
    }

    public ByProjectKeyInStoreKeyByStoreKeyCustomersEmailTokenByEmailTokenRequestBuilder withEmailToken(
            String emailToken) {
        return new ByProjectKeyInStoreKeyByStoreKeyCustomersEmailTokenByEmailTokenRequestBuilder(apiHttpClient,
            projectKey, storeKey, emailToken);
    }

    public ByProjectKeyInStoreKeyByStoreKeyCustomersEmailTokenRequestBuilder emailToken() {
        return new ByProjectKeyInStoreKeyByStoreKeyCustomersEmailTokenRequestBuilder(apiHttpClient, projectKey,
            storeKey);
    }

    public ByProjectKeyInStoreKeyByStoreKeyCustomersEmailConfirmRequestBuilder emailConfirm() {
        return new ByProjectKeyInStoreKeyByStoreKeyCustomersEmailConfirmRequestBuilder(apiHttpClient, projectKey,
            storeKey);
    }

    public ByProjectKeyInStoreKeyByStoreKeyCustomersPasswordRequestBuilder password() {
        return new ByProjectKeyInStoreKeyByStoreKeyCustomersPasswordRequestBuilder(apiHttpClient, projectKey, storeKey);
    }

    public ByProjectKeyInStoreKeyByStoreKeyCustomersPasswordResetRequestBuilder passwordReset() {
        return new ByProjectKeyInStoreKeyByStoreKeyCustomersPasswordResetRequestBuilder(apiHttpClient, projectKey,
            storeKey);
    }

    public ByProjectKeyInStoreKeyByStoreKeyCustomersPasswordTokenRequestBuilder passwordToken() {
        return new ByProjectKeyInStoreKeyByStoreKeyCustomersPasswordTokenRequestBuilder(apiHttpClient, projectKey,
            storeKey);
    }

    public ByProjectKeyInStoreKeyByStoreKeyCustomersKeyByKeyRequestBuilder withKey(String key) {
        return new ByProjectKeyInStoreKeyByStoreKeyCustomersKeyByKeyRequestBuilder(apiHttpClient, projectKey, storeKey,
            key);
    }

    public ByProjectKeyInStoreKeyByStoreKeyCustomersByIDRequestBuilder withId(String ID) {
        return new ByProjectKeyInStoreKeyByStoreKeyCustomersByIDRequestBuilder(apiHttpClient, projectKey, storeKey, ID);
    }

}
