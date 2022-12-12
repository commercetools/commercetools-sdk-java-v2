
package com.commercetools.api.client;

import java.util.function.UnaryOperator;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyCustomersRequestBuilder {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;

    public ByProjectKeyCustomersRequestBuilder(final ApiHttpClient apiHttpClient, final String projectKey) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
    }

    public ByProjectKeyCustomersGet get() {
        return new ByProjectKeyCustomersGet(apiHttpClient, projectKey);
    }

    public ByProjectKeyCustomersPost post(com.commercetools.api.models.customer.CustomerDraft customerDraft) {
        return new ByProjectKeyCustomersPost(apiHttpClient, projectKey, customerDraft);
    }

    public ByProjectKeyCustomersPost post(
            UnaryOperator<com.commercetools.api.models.customer.CustomerDraftBuilder> op) {
        return post(op.apply(com.commercetools.api.models.customer.CustomerDraftBuilder.of()).build());
    }

    public ByProjectKeyCustomersPasswordTokenByPasswordTokenRequestBuilder withPasswordToken(String passwordToken) {
        return new ByProjectKeyCustomersPasswordTokenByPasswordTokenRequestBuilder(apiHttpClient, projectKey,
            passwordToken);
    }

    public ByProjectKeyCustomersEmailTokenByEmailTokenRequestBuilder withEmailToken(String emailToken) {
        return new ByProjectKeyCustomersEmailTokenByEmailTokenRequestBuilder(apiHttpClient, projectKey, emailToken);
    }

    public ByProjectKeyCustomersEmailTokenRequestBuilder emailToken() {
        return new ByProjectKeyCustomersEmailTokenRequestBuilder(apiHttpClient, projectKey);
    }

    public ByProjectKeyCustomersEmailConfirmRequestBuilder emailConfirm() {
        return new ByProjectKeyCustomersEmailConfirmRequestBuilder(apiHttpClient, projectKey);
    }

    public ByProjectKeyCustomersPasswordRequestBuilder password() {
        return new ByProjectKeyCustomersPasswordRequestBuilder(apiHttpClient, projectKey);
    }

    public ByProjectKeyCustomersPasswordResetRequestBuilder passwordReset() {
        return new ByProjectKeyCustomersPasswordResetRequestBuilder(apiHttpClient, projectKey);
    }

    public ByProjectKeyCustomersPasswordTokenRequestBuilder passwordToken() {
        return new ByProjectKeyCustomersPasswordTokenRequestBuilder(apiHttpClient, projectKey);
    }

    public ByProjectKeyCustomersKeyByKeyRequestBuilder withKey(String key) {
        return new ByProjectKeyCustomersKeyByKeyRequestBuilder(apiHttpClient, projectKey, key);
    }

    public ByProjectKeyCustomersByIDRequestBuilder withId(String ID) {
        return new ByProjectKeyCustomersByIDRequestBuilder(apiHttpClient, projectKey, ID);
    }

    public ByProjectKeyCustomersByIDPost update(
            com.commercetools.api.models.Versioned<com.commercetools.api.models.customer.Customer> customer,
            java.util.List<com.commercetools.api.models.customer.CustomerUpdateAction> actions) {
        return withId(customer.getId()).post(builder -> com.commercetools.api.models.customer.CustomerUpdate.builder()
                .version(customer.getVersion())
                .actions(actions));
    }

    public ByProjectKeyCustomersByIDPost update(
            com.commercetools.api.models.Versioned<com.commercetools.api.models.customer.Customer> customer,
            UnaryOperator<UpdateActionBuilder<com.commercetools.api.models.customer.CustomerUpdateAction, com.commercetools.api.models.customer.CustomerUpdateActionBuilder>> op) {
        return withId(customer.getId()).post(builder -> com.commercetools.api.models.customer.CustomerUpdate.builder()
                .version(customer.getVersion())
                .actions(op.apply(UpdateActionBuilder
                        .of(com.commercetools.api.models.customer.CustomerUpdateActionBuilder::of)).actions));
    }

    public WithUpdateActionBuilder<com.commercetools.api.models.customer.CustomerUpdateAction, com.commercetools.api.models.customer.CustomerUpdateActionBuilder, ByProjectKeyCustomersByIDPost> update(
            com.commercetools.api.models.Versioned<com.commercetools.api.models.customer.Customer> customer) {
        return builder -> withId(customer.getId())
                .post(b -> com.commercetools.api.models.customer.CustomerUpdate.builder()
                        .version(customer.getVersion())
                        .actions(builder.apply(UpdateActionBuilder
                                .of(com.commercetools.api.models.customer.CustomerUpdateActionBuilder::of)).actions));
    }

    public ByProjectKeyCustomersByIDDelete delete(
            com.commercetools.api.models.Versioned<com.commercetools.api.models.customer.Customer> customer) {
        return withId(customer.getId()).delete().withVersion(customer.getVersion());
    }

    public ByProjectKeyCustomersPost create(com.commercetools.api.models.customer.CustomerDraft customerDraft) {
        return post(customerDraft);
    }

    public ByProjectKeyCustomersPost create(
            UnaryOperator<com.commercetools.api.models.customer.CustomerDraftBuilder> op) {
        return post(op.apply(com.commercetools.api.models.customer.CustomerDraftBuilder.of()).build());
    }

}
