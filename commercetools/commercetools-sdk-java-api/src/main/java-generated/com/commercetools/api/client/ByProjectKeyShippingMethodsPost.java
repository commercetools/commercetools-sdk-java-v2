
package com.commercetools.api.client;

import static io.vrap.rmf.base.client.utils.ClientUtils.blockingWait;

import java.net.URI;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;

import io.vrap.rmf.base.client.*;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ByProjectKeyShippingMethodsPost
        extends ApiMethod<ByProjectKeyShippingMethodsPost, com.commercetools.api.models.shipping_method.ShippingMethod>
        implements com.commercetools.api.client.ExpandableTrait<ByProjectKeyShippingMethodsPost>,
        com.commercetools.api.client.Deprecatable201Trait<ByProjectKeyShippingMethodsPost>,
        com.commercetools.api.client.ErrorableTrait<ByProjectKeyShippingMethodsPost> {

    private String projectKey;

    private com.commercetools.api.models.shipping_method.ShippingMethodDraft shippingMethodDraft;

    public ByProjectKeyShippingMethodsPost(final ApiHttpClient apiHttpClient, String projectKey,
            com.commercetools.api.models.shipping_method.ShippingMethodDraft shippingMethodDraft) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.shippingMethodDraft = shippingMethodDraft;
    }

    public ByProjectKeyShippingMethodsPost(ByProjectKeyShippingMethodsPost t) {
        super(t);
        this.projectKey = t.projectKey;
        this.shippingMethodDraft = t.shippingMethodDraft;
    }

    @Override
    public ApiHttpRequest createHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("/%s/shipping-methods", this.projectKey);
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }
        try {
            final byte[] body = apiHttpClient().getSerializerService().toJsonByteArray(shippingMethodDraft);
            return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(), body);
        }
        catch (Exception e) {
            e.printStackTrace();
        }

        return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(), null);
    }

    @Override
    public ApiHttpResponse<com.commercetools.api.models.shipping_method.ShippingMethod> executeBlocking(
            final ApiHttpClient client, Duration timeout) {
        ApiHttpRequest request = this.createHttpRequest();
        return blockingWait(client.execute(request, com.commercetools.api.models.shipping_method.ShippingMethod.class),
            request, timeout);
    }

    @Override
    public CompletableFuture<ApiHttpResponse<com.commercetools.api.models.shipping_method.ShippingMethod>> execute(
            final ApiHttpClient client) {
        return client.execute(this.createHttpRequest(),
            com.commercetools.api.models.shipping_method.ShippingMethod.class);
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
    public ByProjectKeyShippingMethodsPost withExpand(final String expand) {
        return copy().withQueryParam("expand", expand);
    }

    /**
     * add additional expand query parameter
     */
    public ByProjectKeyShippingMethodsPost addExpand(final String expand) {
        return copy().addQueryParam("expand", expand);
    }

    @Override
    protected ByProjectKeyShippingMethodsPost copy() {
        return new ByProjectKeyShippingMethodsPost(this);
    }
}
