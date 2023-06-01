package com.commercetools.api.client;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.UnaryOperator;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.ApiMethod;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class ByProjectKeyAttributeGroupsKeyByKeyRequestBuilder  {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;
    private final String key;
    

    public ByProjectKeyAttributeGroupsKeyByKeyRequestBuilder (final ApiHttpClient apiHttpClient,final String projectKey,final String key) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
        this.key = key;
    }

    public ByProjectKeyAttributeGroupsKeyByKeyGet get() {
        return new ByProjectKeyAttributeGroupsKeyByKeyGet(apiHttpClient, projectKey, key);
    }
    
    
    
    public ByProjectKeyAttributeGroupsKeyByKeyPost post(com.commercetools.api.models.attribute_group.AttributeGroupUpdate attributeGroupUpdate) {
        return new ByProjectKeyAttributeGroupsKeyByKeyPost(apiHttpClient, projectKey, key, attributeGroupUpdate);
    }
    
    
    public ByProjectKeyAttributeGroupsKeyByKeyPostString post(final String attributeGroupUpdate) {
        return new ByProjectKeyAttributeGroupsKeyByKeyPostString(apiHttpClient, projectKey, key, attributeGroupUpdate);
    }
    public ByProjectKeyAttributeGroupsKeyByKeyPost post(UnaryOperator<com.commercetools.api.models.attribute_group.AttributeGroupUpdateBuilder> op) {
        return post(op.apply(com.commercetools.api.models.attribute_group.AttributeGroupUpdateBuilder.of()).build());
    }
    
    public ByProjectKeyAttributeGroupsKeyByKeyDelete delete() {
        return new ByProjectKeyAttributeGroupsKeyByKeyDelete(apiHttpClient, projectKey, key);
    }
    public <TValue> ByProjectKeyAttributeGroupsKeyByKeyDelete delete(TValue version) {
        return delete().withVersion(version);
    }
    

    
}
