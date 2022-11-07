
package com.commercetools.api.client;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyAttributeGroupsKeyByKeyRequestBuilder {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;
    private final String key;

    public ByProjectKeyAttributeGroupsKeyByKeyRequestBuilder(final ApiHttpClient apiHttpClient, final String projectKey,
            final String key) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
        this.key = key;
    }

    public ByProjectKeyAttributeGroupsKeyByKeyGet get() {
        return new ByProjectKeyAttributeGroupsKeyByKeyGet(apiHttpClient, projectKey, key);
    }

    public ByProjectKeyAttributeGroupsKeyByKeyPost post(
            com.commercetools.api.models.attribute_group.AttributeGroupUpdate attributeGroupUpdate) {
        return new ByProjectKeyAttributeGroupsKeyByKeyPost(apiHttpClient, projectKey, key, attributeGroupUpdate);
    }

    public ByProjectKeyAttributeGroupsKeyByKeyDelete delete() {
        return new ByProjectKeyAttributeGroupsKeyByKeyDelete(apiHttpClient, projectKey, key);
    }

}
