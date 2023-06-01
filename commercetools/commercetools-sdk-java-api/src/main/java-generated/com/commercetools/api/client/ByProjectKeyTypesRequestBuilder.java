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
public class ByProjectKeyTypesRequestBuilder implements ByProjectKeyTypesRequestBuilderMixin {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;
    

    public ByProjectKeyTypesRequestBuilder (final ApiHttpClient apiHttpClient,final String projectKey) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
    }

    public ByProjectKeyTypesGet get() {
        return new ByProjectKeyTypesGet(apiHttpClient, projectKey);
    }
    
    
    
    public ByProjectKeyTypesPost post(com.commercetools.api.models.type.TypeDraft typeDraft) {
        return new ByProjectKeyTypesPost(apiHttpClient, projectKey, typeDraft);
    }
    
    
    public ByProjectKeyTypesPostString post(final String typeDraft) {
        return new ByProjectKeyTypesPostString(apiHttpClient, projectKey, typeDraft);
    }
    public ByProjectKeyTypesPost post(UnaryOperator<com.commercetools.api.models.type.TypeDraftBuilder> op) {
        return post(op.apply(com.commercetools.api.models.type.TypeDraftBuilder.of()).build());
    }

    
    public ByProjectKeyTypesKeyByKeyRequestBuilder withKey(String key) {
        return new ByProjectKeyTypesKeyByKeyRequestBuilder(apiHttpClient, projectKey, key);
    }
    
    public ByProjectKeyTypesByIDRequestBuilder withId(String ID) {
        return new ByProjectKeyTypesByIDRequestBuilder(apiHttpClient, projectKey, ID);
    }
    
}
