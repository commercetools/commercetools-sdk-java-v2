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
public class ByProjectKeyMePaymentsKeyByKeyRequestBuilder  {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;
    private final String key;
    

    public ByProjectKeyMePaymentsKeyByKeyRequestBuilder (final ApiHttpClient apiHttpClient,final String projectKey,final String key) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
        this.key = key;
    }

    public ByProjectKeyMePaymentsKeyByKeyGet get() {
        return new ByProjectKeyMePaymentsKeyByKeyGet(apiHttpClient, projectKey, key);
    }
    
    
    
    public ByProjectKeyMePaymentsKeyByKeyPost post(com.commercetools.api.models.me.MyPaymentUpdate myPaymentUpdate) {
        return new ByProjectKeyMePaymentsKeyByKeyPost(apiHttpClient, projectKey, key, myPaymentUpdate);
    }
    
    
    public ByProjectKeyMePaymentsKeyByKeyPostString post(final String myPaymentUpdate) {
        return new ByProjectKeyMePaymentsKeyByKeyPostString(apiHttpClient, projectKey, key, myPaymentUpdate);
    }
    public ByProjectKeyMePaymentsKeyByKeyPost post(UnaryOperator<com.commercetools.api.models.me.MyPaymentUpdateBuilder> op) {
        return post(op.apply(com.commercetools.api.models.me.MyPaymentUpdateBuilder.of()).build());
    }
    
    public ByProjectKeyMePaymentsKeyByKeyDelete delete() {
        return new ByProjectKeyMePaymentsKeyByKeyDelete(apiHttpClient, projectKey, key);
    }
    public <TValue> ByProjectKeyMePaymentsKeyByKeyDelete delete(TValue version) {
        return delete().withVersion(version);
    }
    

    
}
