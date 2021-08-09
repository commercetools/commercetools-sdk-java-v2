
package com.commercetools.api.client;

import static io.vrap.rmf.base.client.utils.ClientUtils.blockingWait;

import java.net.URI;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;

import io.vrap.rmf.base.client.*;
import io.vrap.rmf.base.client.utils.Generated;

/**
*  <p>To create a payment object a payment draft object has to be given with the request.</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ByProjectKeyPaymentsPost
        extends ApiMethod<ByProjectKeyPaymentsPost, com.commercetools.api.models.payment.Payment>
        implements com.commercetools.api.client.ExpandableTrait<ByProjectKeyPaymentsPost>,
        com.commercetools.api.client.Deprecatable201Trait<ByProjectKeyPaymentsPost>,
        com.commercetools.api.client.ErrorableTrait<ByProjectKeyPaymentsPost> {

    private String projectKey;

    private com.commercetools.api.models.payment.PaymentDraft paymentDraft;

    public ByProjectKeyPaymentsPost(final ApiHttpClient apiHttpClient, String projectKey,
            com.commercetools.api.models.payment.PaymentDraft paymentDraft) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.paymentDraft = paymentDraft;
    }

    public ByProjectKeyPaymentsPost(ByProjectKeyPaymentsPost t) {
        super(t);
        this.projectKey = t.projectKey;
        this.paymentDraft = t.paymentDraft;
    }

    @Override
    public ApiHttpRequest createHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("/%s/payments", this.projectKey);
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }
        try {
            final byte[] body = apiHttpClient().getSerializerService().toJsonByteArray(paymentDraft);
            return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(), body);
        }
        catch (Exception e) {
            e.printStackTrace();
        }

        return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(), null);
    }

    @Override
    public ApiHttpResponse<com.commercetools.api.models.payment.Payment> executeBlocking(final ApiHttpClient client,
            Duration timeout) {
        ApiHttpRequest request = this.createHttpRequest();
        return blockingWait(client.execute(request, com.commercetools.api.models.payment.Payment.class), request,
            timeout);
    }

    @Override
    public CompletableFuture<ApiHttpResponse<com.commercetools.api.models.payment.Payment>> execute(
            final ApiHttpClient client) {
        return client.execute(this.createHttpRequest(), com.commercetools.api.models.payment.Payment.class);
    }

    public String getProjectKey() {
        return this.projectKey;
    }

    public List<String> getExpand() {
        return this.getQueryParam("expand");
    }

    public void setProjectKey(final String projectKey) {
        this.projectKey = projectKey;
    }

    /**
     * set expand with the specificied value
     */
    public ByProjectKeyPaymentsPost withExpand(final String expand) {
        return copy().withQueryParam("expand", expand);
    }

    /**
     * add additional expand query parameter
     */
    public ByProjectKeyPaymentsPost addExpand(final String expand) {
        return copy().addQueryParam("expand", expand);
    }

    @Override
    protected ByProjectKeyPaymentsPost copy() {
        return new ByProjectKeyPaymentsPost(this);
    }
}
