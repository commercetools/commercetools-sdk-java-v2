
package com.commercetools.api.client;

import java.util.function.UnaryOperator;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyMeRequestBuilder {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;

    public ByProjectKeyMeRequestBuilder(final ApiHttpClient apiHttpClient, final String projectKey) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
    }

    public ByProjectKeyMeGet get() {
        return new ByProjectKeyMeGet(apiHttpClient, projectKey);
    }

    public ByProjectKeyMePost post(com.commercetools.api.models.me.MyCustomerUpdate myCustomerUpdate) {
        return new ByProjectKeyMePost(apiHttpClient, projectKey, myCustomerUpdate);
    }

    public ByProjectKeyMePostString post(final String myCustomerUpdate) {
        return new ByProjectKeyMePostString(apiHttpClient, projectKey, myCustomerUpdate);
    }

    public ByProjectKeyMePost post(UnaryOperator<com.commercetools.api.models.me.MyCustomerUpdateBuilder> op) {
        return post(op.apply(com.commercetools.api.models.me.MyCustomerUpdateBuilder.of()).build());
    }

    public ByProjectKeyMeDelete delete() {
        return new ByProjectKeyMeDelete(apiHttpClient, projectKey);
    }

    public <TValue> ByProjectKeyMeDelete delete(TValue version) {
        return delete().withVersion(version);
    }

    public ByProjectKeyMeEmailConfirmRequestBuilder emailConfirm() {
        return new ByProjectKeyMeEmailConfirmRequestBuilder(apiHttpClient, projectKey);
    }

    public ByProjectKeyMePasswordRequestBuilder password() {
        return new ByProjectKeyMePasswordRequestBuilder(apiHttpClient, projectKey);
    }

    public ByProjectKeyMeSignupRequestBuilder signup() {
        return new ByProjectKeyMeSignupRequestBuilder(apiHttpClient, projectKey);
    }

    public ByProjectKeyMeLoginRequestBuilder login() {
        return new ByProjectKeyMeLoginRequestBuilder(apiHttpClient, projectKey);
    }

    public ByProjectKeyMeActiveCartRequestBuilder activeCart() {
        return new ByProjectKeyMeActiveCartRequestBuilder(apiHttpClient, projectKey);
    }

    public ByProjectKeyMeBusinessUnitsRequestBuilder businessUnits() {
        return new ByProjectKeyMeBusinessUnitsRequestBuilder(apiHttpClient, projectKey);
    }

    public ByProjectKeyMeCartsRequestBuilder carts() {
        return new ByProjectKeyMeCartsRequestBuilder(apiHttpClient, projectKey);
    }

    public ByProjectKeyMeOrdersRequestBuilder orders() {
        return new ByProjectKeyMeOrdersRequestBuilder(apiHttpClient, projectKey);
    }

    public ByProjectKeyMePaymentsRequestBuilder payments() {
        return new ByProjectKeyMePaymentsRequestBuilder(apiHttpClient, projectKey);
    }

    public ByProjectKeyMeQuoteRequestsRequestBuilder quoteRequests() {
        return new ByProjectKeyMeQuoteRequestsRequestBuilder(apiHttpClient, projectKey);
    }

    public ByProjectKeyMeQuotesRequestBuilder quotes() {
        return new ByProjectKeyMeQuotesRequestBuilder(apiHttpClient, projectKey);
    }

    public ByProjectKeyMeShoppingListsRequestBuilder shoppingLists() {
        return new ByProjectKeyMeShoppingListsRequestBuilder(apiHttpClient, projectKey);
    }

}
