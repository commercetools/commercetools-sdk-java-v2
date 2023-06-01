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
public class ByProjectKeyAssociateRolesRequestBuilder  {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;
    

    public ByProjectKeyAssociateRolesRequestBuilder (final ApiHttpClient apiHttpClient,final String projectKey) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
    }

    public ByProjectKeyAssociateRolesGet get() {
        return new ByProjectKeyAssociateRolesGet(apiHttpClient, projectKey);
    }
    
    
    
    public ByProjectKeyAssociateRolesPost post(com.commercetools.api.models.associate_role.AssociateRoleDraft associateRoleDraft) {
        return new ByProjectKeyAssociateRolesPost(apiHttpClient, projectKey, associateRoleDraft);
    }
    
    
    public ByProjectKeyAssociateRolesPostString post(final String associateRoleDraft) {
        return new ByProjectKeyAssociateRolesPostString(apiHttpClient, projectKey, associateRoleDraft);
    }
    public ByProjectKeyAssociateRolesPost post(UnaryOperator<com.commercetools.api.models.associate_role.AssociateRoleDraftBuilder> op) {
        return post(op.apply(com.commercetools.api.models.associate_role.AssociateRoleDraftBuilder.of()).build());
    }

    
    public ByProjectKeyAssociateRolesKeyByKeyRequestBuilder withKey(String key) {
        return new ByProjectKeyAssociateRolesKeyByKeyRequestBuilder(apiHttpClient, projectKey, key);
    }
    
    public ByProjectKeyAssociateRolesByIDRequestBuilder withId(String ID) {
        return new ByProjectKeyAssociateRolesByIDRequestBuilder(apiHttpClient, projectKey, ID);
    }
    
}
