
package com.commercetools.api.client;

import java.util.function.UnaryOperator;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyAssociateRolesByIDRequestBuilder {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;
    private final String ID;

    public ByProjectKeyAssociateRolesByIDRequestBuilder(final ApiHttpClient apiHttpClient, final String projectKey,
            final String ID) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
        this.ID = ID;
    }

    public ByProjectKeyAssociateRolesByIDGet get() {
        return new ByProjectKeyAssociateRolesByIDGet(apiHttpClient, projectKey, ID);
    }

    public ByProjectKeyAssociateRolesByIDHead head() {
        return new ByProjectKeyAssociateRolesByIDHead(apiHttpClient, projectKey, ID);
    }

    public ByProjectKeyAssociateRolesByIDPost post(
            com.commercetools.api.models.associate_role.AssociateRoleUpdate associateRoleUpdate) {
        return new ByProjectKeyAssociateRolesByIDPost(apiHttpClient, projectKey, ID, associateRoleUpdate);
    }

    public ByProjectKeyAssociateRolesByIDPostString post(final String associateRoleUpdate) {
        return new ByProjectKeyAssociateRolesByIDPostString(apiHttpClient, projectKey, ID, associateRoleUpdate);
    }

    public ByProjectKeyAssociateRolesByIDPost post(
            UnaryOperator<com.commercetools.api.models.associate_role.AssociateRoleUpdateBuilder> op) {
        return post(op.apply(com.commercetools.api.models.associate_role.AssociateRoleUpdateBuilder.of()).build());
    }

    public ByProjectKeyAssociateRolesByIDDelete delete() {
        return new ByProjectKeyAssociateRolesByIDDelete(apiHttpClient, projectKey, ID);
    }

    public <TValue> ByProjectKeyAssociateRolesByIDDelete delete(TValue version) {
        return delete().withVersion(version);
    }

}
