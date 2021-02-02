
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
*  <p>Create an Order by Import</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ByProjectKeyOrdersImportPost
        extends ApiMethod<ByProjectKeyOrdersImportPost, com.commercetools.api.models.order.Order>
        implements com.commercetools.api.client.ErrorableTrait<ByProjectKeyOrdersImportPost>,
        com.commercetools.api.client.DeprecatableTrait<ByProjectKeyOrdersImportPost> {

    private String projectKey;

    private com.commercetools.api.models.order.OrderImportDraft orderImportDraft;

    public ByProjectKeyOrdersImportPost(final ApiHttpClient apiHttpClient, String projectKey,
            com.commercetools.api.models.order.OrderImportDraft orderImportDraft) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.orderImportDraft = orderImportDraft;
    }

    public ByProjectKeyOrdersImportPost(ByProjectKeyOrdersImportPost t) {
        super(t);
        this.projectKey = t.projectKey;
        this.orderImportDraft = t.orderImportDraft;
    }

    @Override
    public ApiHttpRequest createHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("/%s/orders/import", this.projectKey);
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }
        try {
            final byte[] body = apiHttpClient().getSerializerService().toJsonByteArray(orderImportDraft);
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

    public void setProjectKey(final String projectKey) {
        this.projectKey = projectKey;
    }

    @Override
    protected ByProjectKeyOrdersImportPost copy() {
        return new ByProjectKeyOrdersImportPost(this);
    }
}
