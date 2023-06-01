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
public class ByProjectKeyMeBusinessUnitsRequestBuilder  {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;
    

    public ByProjectKeyMeBusinessUnitsRequestBuilder (final ApiHttpClient apiHttpClient,final String projectKey) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
    }

    public ByProjectKeyMeBusinessUnitsGet get() {
        return new ByProjectKeyMeBusinessUnitsGet(apiHttpClient, projectKey);
    }
    
    
    
    public ByProjectKeyMeBusinessUnitsPost post(com.commercetools.api.models.me.MyBusinessUnitDraft myBusinessUnitDraft) {
        return new ByProjectKeyMeBusinessUnitsPost(apiHttpClient, projectKey, myBusinessUnitDraft);
    }
    
    
    public ByProjectKeyMeBusinessUnitsPostString post(final String myBusinessUnitDraft) {
        return new ByProjectKeyMeBusinessUnitsPostString(apiHttpClient, projectKey, myBusinessUnitDraft);
    }
    public ByProjectKeyMeBusinessUnitsPost post(Function<com.commercetools.api.models.me.MyBusinessUnitDraftBuilder, Builder<? extends com.commercetools.api.models.me.MyBusinessUnitDraft>> op) {
        return post(op.apply(com.commercetools.api.models.me.MyBusinessUnitDraftBuilder.of()).build());
    }

    
    public ByProjectKeyMeBusinessUnitsByIDRequestBuilder withId(String ID) {
        return new ByProjectKeyMeBusinessUnitsByIDRequestBuilder(apiHttpClient, projectKey, ID);
    }
    
    public ByProjectKeyMeBusinessUnitsKeyByKeyRequestBuilder withKey(String key) {
        return new ByProjectKeyMeBusinessUnitsKeyByKeyRequestBuilder(apiHttpClient, projectKey, key);
    }
    
}
