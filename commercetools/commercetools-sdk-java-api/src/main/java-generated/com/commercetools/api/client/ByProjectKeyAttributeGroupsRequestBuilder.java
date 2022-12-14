
package com.commercetools.api.client;

import java.util.function.UnaryOperator;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyAttributeGroupsRequestBuilder {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;

    public ByProjectKeyAttributeGroupsRequestBuilder(final ApiHttpClient apiHttpClient, final String projectKey) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
    }

    public ByProjectKeyAttributeGroupsGet get() {
        return new ByProjectKeyAttributeGroupsGet(apiHttpClient, projectKey);
    }

    public ByProjectKeyAttributeGroupsPost post(
            com.commercetools.api.models.attribute_group.AttributeGroupDraft attributeGroupDraft) {
        return new ByProjectKeyAttributeGroupsPost(apiHttpClient, projectKey, attributeGroupDraft);
    }

    public ByProjectKeyAttributeGroupsPost post(
            UnaryOperator<com.commercetools.api.models.attribute_group.AttributeGroupDraftBuilder> op) {
        return post(op.apply(com.commercetools.api.models.attribute_group.AttributeGroupDraftBuilder.of()).build());
    }

    public ByProjectKeyAttributeGroupsKeyByKeyRequestBuilder withKey(String key) {
        return new ByProjectKeyAttributeGroupsKeyByKeyRequestBuilder(apiHttpClient, projectKey, key);
    }

    public ByProjectKeyAttributeGroupsByIDRequestBuilder withId(String ID) {
        return new ByProjectKeyAttributeGroupsByIDRequestBuilder(apiHttpClient, projectKey, ID);
    }

    public ByProjectKeyAttributeGroupsByIDPost update(
            com.commercetools.api.models.Versioned<com.commercetools.api.models.attribute_group.AttributeGroup> attributeGroup,
            java.util.List<com.commercetools.api.models.attribute_group.AttributeGroupUpdateAction> actions) {
        return withId(attributeGroup.getId())
                .post(builder -> com.commercetools.api.models.attribute_group.AttributeGroupUpdate.builder()
                        .version(attributeGroup.getVersion())
                        .actions(actions));
    }

    public ByProjectKeyAttributeGroupsByIDPost update(
            com.commercetools.api.models.Versioned<com.commercetools.api.models.attribute_group.AttributeGroup> attributeGroup,
            UnaryOperator<UpdateActionBuilder<com.commercetools.api.models.attribute_group.AttributeGroupUpdateAction, com.commercetools.api.models.attribute_group.AttributeGroupUpdateActionBuilder>> op) {
        return withId(attributeGroup.getId()).post(
            builder -> com.commercetools.api.models.attribute_group.AttributeGroupUpdate.builder()
                    .version(attributeGroup.getVersion())
                    .actions(op.apply(UpdateActionBuilder.of(
                        com.commercetools.api.models.attribute_group.AttributeGroupUpdateActionBuilder::of)).actions));
    }

    public WithUpdateActionBuilder<com.commercetools.api.models.attribute_group.AttributeGroupUpdateAction, com.commercetools.api.models.attribute_group.AttributeGroupUpdateActionBuilder, ByProjectKeyAttributeGroupsByIDPost> update(
            com.commercetools.api.models.Versioned<com.commercetools.api.models.attribute_group.AttributeGroup> attributeGroup) {
        return builder -> withId(attributeGroup.getId()).post(
            b -> com.commercetools.api.models.attribute_group.AttributeGroupUpdate.builder()
                    .version(attributeGroup.getVersion())
                    .actions(builder.apply(UpdateActionBuilder.of(
                        com.commercetools.api.models.attribute_group.AttributeGroupUpdateActionBuilder::of)).actions));
    }

    public ByProjectKeyAttributeGroupsByIDDelete delete(
            com.commercetools.api.models.Versioned<com.commercetools.api.models.attribute_group.AttributeGroup> attributeGroup) {
        return withId(attributeGroup.getId()).delete().withVersion(attributeGroup.getVersion());
    }

    public ByProjectKeyAttributeGroupsPost create(
            com.commercetools.api.models.attribute_group.AttributeGroupDraft attributeGroupDraft) {
        return post(attributeGroupDraft);
    }

    public ByProjectKeyAttributeGroupsPost create(
            UnaryOperator<com.commercetools.api.models.attribute_group.AttributeGroupDraftBuilder> op) {
        return post(op.apply(com.commercetools.api.models.attribute_group.AttributeGroupDraftBuilder.of()).build());
    }

}
