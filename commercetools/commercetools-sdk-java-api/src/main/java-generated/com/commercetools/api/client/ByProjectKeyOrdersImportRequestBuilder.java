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
public class ByProjectKeyOrdersImportRequestBuilder  {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;
    

    public ByProjectKeyOrdersImportRequestBuilder (final ApiHttpClient apiHttpClient,final String projectKey) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
    }

    public ByProjectKeyOrdersImportPost post(com.commercetools.api.models.order.OrderImportDraft orderImportDraft) {
        return new ByProjectKeyOrdersImportPost(apiHttpClient, projectKey, orderImportDraft);
    }
    
    
    public ByProjectKeyOrdersImportPostString post(final String orderImportDraft) {
        return new ByProjectKeyOrdersImportPostString(apiHttpClient, projectKey, orderImportDraft);
    }
    public ByProjectKeyOrdersImportPost post(UnaryOperator<com.commercetools.api.models.order.OrderImportDraftBuilder> op) {
        return post(op.apply(com.commercetools.api.models.order.OrderImportDraftBuilder.of()).build());
    }

    
}
