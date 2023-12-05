
package com.commercetools.api.client;

import java.util.function.UnaryOperator;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyAttributeGroupsByIDRequestBuilder {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;
    private final String ID;

    public ByProjectKeyAttributeGroupsByIDRequestBuilder(final ApiHttpClient apiHttpClient, final String projectKey,
            final String ID) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
        this.ID = ID;
    }

    public ByProjectKeyAttributeGroupsByIDGet get() {
        return new ByProjectKeyAttributeGroupsByIDGet(apiHttpClient, projectKey, ID);
    }

    public ByProjectKeyAttributeGroupsByIDHead head() {
        return new ByProjectKeyAttributeGroupsByIDHead(apiHttpClient, projectKey, ID);
    }

    public ByProjectKeyAttributeGroupsByIDPost post(
            com.commercetools.api.models.attribute_group.AttributeGroupUpdate attributeGroupUpdate) {
        return new ByProjectKeyAttributeGroupsByIDPost(apiHttpClient, projectKey, ID, attributeGroupUpdate);
    }

    public ByProjectKeyAttributeGroupsByIDPostString post(final String attributeGroupUpdate) {
        return new ByProjectKeyAttributeGroupsByIDPostString(apiHttpClient, projectKey, ID, attributeGroupUpdate);
    }

    public ByProjectKeyAttributeGroupsByIDPost post(
            UnaryOperator<com.commercetools.api.models.attribute_group.AttributeGroupUpdateBuilder> op) {
        return post(op.apply(com.commercetools.api.models.attribute_group.AttributeGroupUpdateBuilder.of()).build());
    }

    public ByProjectKeyAttributeGroupsByIDDelete delete() {
        return new ByProjectKeyAttributeGroupsByIDDelete(apiHttpClient, projectKey, ID);
    }

    public <TValue> ByProjectKeyAttributeGroupsByIDDelete delete(TValue version) {
        return delete().withVersion(version);
    }

}
