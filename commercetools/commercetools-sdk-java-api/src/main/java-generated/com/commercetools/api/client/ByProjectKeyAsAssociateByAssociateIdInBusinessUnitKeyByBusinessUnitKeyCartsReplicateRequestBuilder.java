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
public class ByProjectKeyAsAssociateByAssociateIdInBusinessUnitKeyByBusinessUnitKeyCartsReplicateRequestBuilder  {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;
    private final String associateId;
    private final String businessUnitKey;
    

    public ByProjectKeyAsAssociateByAssociateIdInBusinessUnitKeyByBusinessUnitKeyCartsReplicateRequestBuilder (final ApiHttpClient apiHttpClient,final String projectKey,final String associateId,final String businessUnitKey) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
        this.associateId = associateId;
        this.businessUnitKey = businessUnitKey;
    }

    public ByProjectKeyAsAssociateByAssociateIdInBusinessUnitKeyByBusinessUnitKeyCartsReplicatePost post(com.commercetools.api.models.cart.ReplicaCartDraft replicaCartDraft) {
        return new ByProjectKeyAsAssociateByAssociateIdInBusinessUnitKeyByBusinessUnitKeyCartsReplicatePost(apiHttpClient, projectKey, associateId, businessUnitKey, replicaCartDraft);
    }
    
    
    public ByProjectKeyAsAssociateByAssociateIdInBusinessUnitKeyByBusinessUnitKeyCartsReplicatePostString post(final String replicaCartDraft) {
        return new ByProjectKeyAsAssociateByAssociateIdInBusinessUnitKeyByBusinessUnitKeyCartsReplicatePostString(apiHttpClient, projectKey, associateId, businessUnitKey, replicaCartDraft);
    }
    public ByProjectKeyAsAssociateByAssociateIdInBusinessUnitKeyByBusinessUnitKeyCartsReplicatePost post(UnaryOperator<com.commercetools.api.models.cart.ReplicaCartDraftBuilder> op) {
        return post(op.apply(com.commercetools.api.models.cart.ReplicaCartDraftBuilder.of()).build());
    }

    
}
