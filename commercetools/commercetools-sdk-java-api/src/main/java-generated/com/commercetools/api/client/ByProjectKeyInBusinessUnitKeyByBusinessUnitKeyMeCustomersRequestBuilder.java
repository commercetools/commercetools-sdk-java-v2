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
public class ByProjectKeyInBusinessUnitKeyByBusinessUnitKeyMeCustomersRequestBuilder  {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;
    private final String businessUnitKey;
    

    public ByProjectKeyInBusinessUnitKeyByBusinessUnitKeyMeCustomersRequestBuilder (final ApiHttpClient apiHttpClient,final String projectKey,final String businessUnitKey) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
        this.businessUnitKey = businessUnitKey;
    }

    public ByProjectKeyInBusinessUnitKeyByBusinessUnitKeyMeCustomersPost post(com.commercetools.api.models.me.MyBusinessUnitAssociateDraft myBusinessUnitAssociateDraft) {
        return new ByProjectKeyInBusinessUnitKeyByBusinessUnitKeyMeCustomersPost(apiHttpClient, projectKey, businessUnitKey, myBusinessUnitAssociateDraft);
    }
    
    
    public ByProjectKeyInBusinessUnitKeyByBusinessUnitKeyMeCustomersPostString post(final String myBusinessUnitAssociateDraft) {
        return new ByProjectKeyInBusinessUnitKeyByBusinessUnitKeyMeCustomersPostString(apiHttpClient, projectKey, businessUnitKey, myBusinessUnitAssociateDraft);
    }
    public ByProjectKeyInBusinessUnitKeyByBusinessUnitKeyMeCustomersPost post(UnaryOperator<com.commercetools.api.models.me.MyBusinessUnitAssociateDraftBuilder> op) {
        return post(op.apply(com.commercetools.api.models.me.MyBusinessUnitAssociateDraftBuilder.of()).build());
    }

    
}
