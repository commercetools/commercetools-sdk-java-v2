
package com.commercetools.api.client;

import java.util.function.UnaryOperator;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyMePaymentsByIDRequestBuilder {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;
    private final String ID;

    public ByProjectKeyMePaymentsByIDRequestBuilder(final ApiHttpClient apiHttpClient, final String projectKey,
            final String ID) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
        this.ID = ID;
    }

    public ByProjectKeyMePaymentsByIDGet get() {
        return new ByProjectKeyMePaymentsByIDGet(apiHttpClient, projectKey, ID);
    }

    public ByProjectKeyMePaymentsByIDPost post(com.commercetools.api.models.me.MyPaymentUpdate myPaymentUpdate) {
        return new ByProjectKeyMePaymentsByIDPost(apiHttpClient, projectKey, ID, myPaymentUpdate);
    }

    public ByProjectKeyMePaymentsByIDPostString post(final String myPaymentUpdate) {
        return new ByProjectKeyMePaymentsByIDPostString(apiHttpClient, projectKey, ID, myPaymentUpdate);
    }

    public ByProjectKeyMePaymentsByIDPost post(
            UnaryOperator<com.commercetools.api.models.me.MyPaymentUpdateBuilder> op) {
        return post(op.apply(com.commercetools.api.models.me.MyPaymentUpdateBuilder.of()).build());
    }

    public ByProjectKeyMePaymentsByIDDelete delete() {
        return new ByProjectKeyMePaymentsByIDDelete(apiHttpClient, projectKey, ID);
    }

    public <TValue> ByProjectKeyMePaymentsByIDDelete delete(TValue version) {
        return delete().withVersion(version);
    }

}
