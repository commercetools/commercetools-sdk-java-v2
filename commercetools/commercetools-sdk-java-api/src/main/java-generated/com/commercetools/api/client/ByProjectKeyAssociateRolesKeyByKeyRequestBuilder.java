
package com.commercetools.api.client;

import java.util.function.UnaryOperator;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyAssociateRolesKeyByKeyRequestBuilder {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;
    private final String key;

    public ByProjectKeyAssociateRolesKeyByKeyRequestBuilder(final ApiHttpClient apiHttpClient, final String projectKey,
            final String key) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
        this.key = key;
    }

    public ByProjectKeyAssociateRolesKeyByKeyGet get() {
        return new ByProjectKeyAssociateRolesKeyByKeyGet(apiHttpClient, projectKey, key);
    }

    public ByProjectKeyAssociateRolesKeyByKeyPost post(
            com.commercetools.api.models.associate_role.AssociateRoleUpdate associateRoleUpdate) {
        return new ByProjectKeyAssociateRolesKeyByKeyPost(apiHttpClient, projectKey, key, associateRoleUpdate);
    }

    public ByProjectKeyAssociateRolesKeyByKeyPostString post(final String associateRoleUpdate) {
        return new ByProjectKeyAssociateRolesKeyByKeyPostString(apiHttpClient, projectKey, key, associateRoleUpdate);
    }

    public ByProjectKeyAssociateRolesKeyByKeyPost post(
            UnaryOperator<com.commercetools.api.models.associate_role.AssociateRoleUpdateBuilder> op) {
        return post(op.apply(com.commercetools.api.models.associate_role.AssociateRoleUpdateBuilder.of()).build());
    }

    public ByProjectKeyAssociateRolesKeyByKeyDelete delete() {
        return new ByProjectKeyAssociateRolesKeyByKeyDelete(apiHttpClient, projectKey, key);
    }

    public <TValue> ByProjectKeyAssociateRolesKeyByKeyDelete delete(TValue version) {
        return delete().withVersion(version);
    }

}
