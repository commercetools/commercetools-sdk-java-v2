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
public class ByProjectKeyAsAssociateByAssociateIdRequestBuilder  {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;
    private final String associateId;
    

    public ByProjectKeyAsAssociateByAssociateIdRequestBuilder (final ApiHttpClient apiHttpClient,final String projectKey,final String associateId) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
        this.associateId = associateId;
    }


    
    public ByProjectKeyAsAssociateByAssociateIdBusinessUnitsRequestBuilder businessUnits() {
        return new ByProjectKeyAsAssociateByAssociateIdBusinessUnitsRequestBuilder(apiHttpClient, projectKey, associateId);
    }
    
    public ByProjectKeyAsAssociateByAssociateIdInBusinessUnitKeyByBusinessUnitKeyRequestBuilder inBusinessUnitKeyWithBusinessUnitKeyValue(String businessUnitKey) {
        return new ByProjectKeyAsAssociateByAssociateIdInBusinessUnitKeyByBusinessUnitKeyRequestBuilder(apiHttpClient, projectKey, associateId, businessUnitKey);
    }
    
}
