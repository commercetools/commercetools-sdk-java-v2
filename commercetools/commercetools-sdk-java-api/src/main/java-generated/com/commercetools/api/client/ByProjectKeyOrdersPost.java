
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
*  <p>Creates an order from a Cart.
*  The cart must have a shipping address set before creating an order.
*  When using the Platform TaxMode, the shipping address is used for tax calculation.</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ByProjectKeyOrdersPost extends ApiMethod<ByProjectKeyOrdersPost, com.commercetools.api.models.order.Order>
        implements com.commercetools.api.client.ExpandableTrait<ByProjectKeyOrdersPost>,
        com.commercetools.api.client.ErrorableTrait<ByProjectKeyOrdersPost>,
        com.commercetools.api.client.DeprecatableTrait<ByProjectKeyOrdersPost> {

    private String projectKey;

    private com.commercetools.api.models.order.OrderFromCartDraft orderFromCartDraft;

    public ByProjectKeyOrdersPost(final ApiHttpClient apiHttpClient, String projectKey,
            com.commercetools.api.models.order.OrderFromCartDraft orderFromCartDraft) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.orderFromCartDraft = orderFromCartDraft;
    }

    public ByProjectKeyOrdersPost(ByProjectKeyOrdersPost t) {
        super(t);
        this.projectKey = t.projectKey;
        this.orderFromCartDraft = t.orderFromCartDraft;
    }

    @Override
    public ApiHttpRequest createHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("/%s/orders", this.projectKey);
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }
        try {
            final byte[] body = apiHttpClient().getSerializerService().toJsonByteArray(orderFromCartDraft);
            return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(), body);
        }
        catch (Exception e) {
            e.printStackTrace();
        }

        return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(), null);
    }

    @Override
    public ApiHttpResponse<com.commercetools.api.models.order.Order> executeBlocking(Duration timeout) {
        return blockingWait(execute(), timeout);
    }

    @Override
    public CompletableFuture<ApiHttpResponse<com.commercetools.api.models.order.Order>> execute() {
        return apiHttpClient().execute(this.createHttpRequest(), com.commercetools.api.models.order.Order.class);
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

    public ByProjectKeyOrdersPost withExpand(final String expand) {
        return copy().withQueryParam("expand", expand);
    }

    public ByProjectKeyOrdersPost addExpand(final String expand) {
        return copy().addQueryParam("expand", expand);
    }

    @Override
    protected ByProjectKeyOrdersPost copy() {
        return new ByProjectKeyOrdersPost(this);
    }
}
