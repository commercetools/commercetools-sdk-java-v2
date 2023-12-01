
package com.commercetools.api.client;

import java.util.function.UnaryOperator;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyAttributeGroupsRequestBuilder implements ByProjectKeyAttributeGroupsRequestBuilderMixin {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;

    public ByProjectKeyAttributeGroupsRequestBuilder(final ApiHttpClient apiHttpClient, final String projectKey) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
    }

    public ByProjectKeyAttributeGroupsGet get() {
        return new ByProjectKeyAttributeGroupsGet(apiHttpClient, projectKey);
    }

    public ByProjectKeyAttributeGroupsHead head() {
        return new ByProjectKeyAttributeGroupsHead(apiHttpClient, projectKey);
    }

    public ByProjectKeyAttributeGroupsPost post(
            com.commercetools.api.models.attribute_group.AttributeGroupDraft attributeGroupDraft) {
        return new ByProjectKeyAttributeGroupsPost(apiHttpClient, projectKey, attributeGroupDraft);
    }

    public ByProjectKeyAttributeGroupsPostString post(final String attributeGroupDraft) {
        return new ByProjectKeyAttributeGroupsPostString(apiHttpClient, projectKey, attributeGroupDraft);
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

}
