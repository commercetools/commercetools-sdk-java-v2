
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
*  <p>Delete ShippingMethod by ID</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ByProjectKeyShippingMethodsByIDDelete extends
        ApiMethod<ByProjectKeyShippingMethodsByIDDelete, com.commercetools.api.models.shipping_method.ShippingMethod>
        implements com.commercetools.api.client.VersionedTrait<ByProjectKeyShippingMethodsByIDDelete>,
        com.commercetools.api.client.ConflictingTrait<ByProjectKeyShippingMethodsByIDDelete>,
        com.commercetools.api.client.ExpandableTrait<ByProjectKeyShippingMethodsByIDDelete>,
        com.commercetools.api.client.ErrorableTrait<ByProjectKeyShippingMethodsByIDDelete>,
        com.commercetools.api.client.DeprecatableTrait<ByProjectKeyShippingMethodsByIDDelete> {

    private String projectKey;
    private String ID;

    public ByProjectKeyShippingMethodsByIDDelete(final ApiHttpClient apiHttpClient, String projectKey, String ID) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.ID = ID;
    }

    public ByProjectKeyShippingMethodsByIDDelete(ByProjectKeyShippingMethodsByIDDelete t) {
        super(t);
        this.projectKey = t.projectKey;
        this.ID = t.ID;
    }

    @Override
    public ApiHttpRequest createHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("/%s/shipping-methods/%s", this.projectKey, this.ID);
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }

        return new ApiHttpRequest(ApiHttpMethod.DELETE, URI.create(httpRequestPath), getHeaders(), null);
    }

    @Override
    public ApiHttpResponse<com.commercetools.api.models.shipping_method.ShippingMethod> executeBlocking(
            Duration timeout) {
        return blockingWait(execute(), timeout);
    }

    @Override
    public CompletableFuture<ApiHttpResponse<com.commercetools.api.models.shipping_method.ShippingMethod>> execute() {
        return apiHttpClient().execute(this.createHttpRequest(),
            com.commercetools.api.models.shipping_method.ShippingMethod.class);
    }

    public String getProjectKey() {
        return this.projectKey;
    }

    public String getID() {
        return this.ID;
    }

    public List<String> getVersion() {
        return this.getQueryParam("version");
    }

    public List<String> getExpand() {
        return this.getQueryParam("expand");
    }

    public void setProjectKey(final String projectKey) {
        this.projectKey = projectKey;
    }

    public void setID(final String ID) {
        this.ID = ID;
    }

    public ByProjectKeyShippingMethodsByIDDelete withVersion(final Long version) {
        return copy().withQueryParam("version", version);
    }

    public ByProjectKeyShippingMethodsByIDDelete addVersion(final Long version) {
        return copy().addQueryParam("version", version);
    }

    public ByProjectKeyShippingMethodsByIDDelete withExpand(final String expand) {
        return copy().withQueryParam("expand", expand);
    }

    public ByProjectKeyShippingMethodsByIDDelete addExpand(final String expand) {
        return copy().addQueryParam("expand", expand);
    }

    @Override
    protected ByProjectKeyShippingMethodsByIDDelete copy() {
        return new ByProjectKeyShippingMethodsByIDDelete(this);
    }
}
