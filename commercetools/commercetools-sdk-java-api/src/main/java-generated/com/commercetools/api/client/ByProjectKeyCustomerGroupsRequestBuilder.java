
package com.commercetools.api.client;

import java.util.function.UnaryOperator;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyCustomerGroupsRequestBuilder implements ByProjectKeyCustomerGroupsRequestBuilderMixin {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;

    public ByProjectKeyCustomerGroupsRequestBuilder(final ApiHttpClient apiHttpClient, final String projectKey) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
    }

    public ByProjectKeyCustomerGroupsGet get() {
        return new ByProjectKeyCustomerGroupsGet(apiHttpClient, projectKey);
    }

    public ByProjectKeyCustomerGroupsPost post(
            com.commercetools.api.models.customer_group.CustomerGroupDraft customerGroupDraft) {
        return new ByProjectKeyCustomerGroupsPost(apiHttpClient, projectKey, customerGroupDraft);
    }

    public ByProjectKeyCustomerGroupsPost post(
            UnaryOperator<com.commercetools.api.models.customer_group.CustomerGroupDraftBuilder> op) {
        return post(op.apply(com.commercetools.api.models.customer_group.CustomerGroupDraftBuilder.of()).build());
    }

    public ByProjectKeyCustomerGroupsKeyByKeyRequestBuilder withKey(String key) {
        return new ByProjectKeyCustomerGroupsKeyByKeyRequestBuilder(apiHttpClient, projectKey, key);
    }

    public ByProjectKeyCustomerGroupsByIDRequestBuilder withId(String ID) {
        return new ByProjectKeyCustomerGroupsByIDRequestBuilder(apiHttpClient, projectKey, ID);
    }

    public ByProjectKeyCustomerGroupsByIDPost update(
            com.commercetools.api.models.Versioned<com.commercetools.api.models.customer_group.CustomerGroup> customerGroup,
            java.util.List<com.commercetools.api.models.customer_group.CustomerGroupUpdateAction> actions) {
        return withId(customerGroup.getId())
                .post(builder -> com.commercetools.api.models.customer_group.CustomerGroupUpdate.builder()
                        .version(customerGroup.getVersion())
                        .actions(actions));
    }

    public ByProjectKeyCustomerGroupsByIDPost update(
            com.commercetools.api.models.Versioned<com.commercetools.api.models.customer_group.CustomerGroup> customerGroup,
            UnaryOperator<UpdateActionBuilder<com.commercetools.api.models.customer_group.CustomerGroupUpdateAction, com.commercetools.api.models.customer_group.CustomerGroupUpdateActionBuilder>> op) {
        return withId(customerGroup.getId()).post(
            builder -> com.commercetools.api.models.customer_group.CustomerGroupUpdate.builder()
                    .version(customerGroup.getVersion())
                    .actions(op.apply(UpdateActionBuilder.of(
                        com.commercetools.api.models.customer_group.CustomerGroupUpdateActionBuilder::of)).actions));
    }

    public WithUpdateActionBuilder<com.commercetools.api.models.customer_group.CustomerGroupUpdateAction, com.commercetools.api.models.customer_group.CustomerGroupUpdateActionBuilder, ByProjectKeyCustomerGroupsByIDPost> update(
            com.commercetools.api.models.Versioned<com.commercetools.api.models.customer_group.CustomerGroup> customerGroup) {
        return builder -> withId(customerGroup.getId()).post(
            b -> com.commercetools.api.models.customer_group.CustomerGroupUpdate.builder()
                    .version(customerGroup.getVersion())
                    .actions(builder.apply(UpdateActionBuilder.of(
                        com.commercetools.api.models.customer_group.CustomerGroupUpdateActionBuilder::of)).actions));
    }

    public ByProjectKeyCustomerGroupsByIDDelete delete(
            com.commercetools.api.models.Versioned<com.commercetools.api.models.customer_group.CustomerGroup> customerGroup) {
        return withId(customerGroup.getId()).delete().withVersion(customerGroup.getVersion());
    }

    public ByProjectKeyCustomerGroupsPost create(
            com.commercetools.api.models.customer_group.CustomerGroupDraft customerGroupDraft) {
        return post(customerGroupDraft);
    }

    public ByProjectKeyCustomerGroupsPost create(
            UnaryOperator<com.commercetools.api.models.customer_group.CustomerGroupDraftBuilder> op) {
        return post(op.apply(com.commercetools.api.models.customer_group.CustomerGroupDraftBuilder.of()).build());
    }

}
