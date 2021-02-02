
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
*  <p>Delete Cart by key</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ByProjectKeyCartsKeyByKeyDelete
        extends ApiMethod<ByProjectKeyCartsKeyByKeyDelete, com.commercetools.api.models.cart.Cart>
        implements com.commercetools.api.client.DataerasureTrait<ByProjectKeyCartsKeyByKeyDelete>,
        com.commercetools.api.client.VersionedTrait<ByProjectKeyCartsKeyByKeyDelete>,
        com.commercetools.api.client.ConflictingTrait<ByProjectKeyCartsKeyByKeyDelete>,
        com.commercetools.api.client.ExpandableTrait<ByProjectKeyCartsKeyByKeyDelete>,
        com.commercetools.api.client.ErrorableTrait<ByProjectKeyCartsKeyByKeyDelete>,
        com.commercetools.api.client.DeprecatableTrait<ByProjectKeyCartsKeyByKeyDelete> {

    private String projectKey;
    private String key;

    public ByProjectKeyCartsKeyByKeyDelete(final ApiHttpClient apiHttpClient, String projectKey, String key) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.key = key;
    }

    public ByProjectKeyCartsKeyByKeyDelete(ByProjectKeyCartsKeyByKeyDelete t) {
        super(t);
        this.projectKey = t.projectKey;
        this.key = t.key;
    }

    @Override
    public ApiHttpRequest createHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("/%s/carts/key=%s", this.projectKey, this.key);
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }

        return new ApiHttpRequest(ApiHttpMethod.DELETE, URI.create(httpRequestPath), getHeaders(), null);
    }

    @Override
    public ApiHttpResponse<com.commercetools.api.models.cart.Cart> executeBlocking(Duration timeout) {
        return blockingWait(execute(), timeout);
    }

    @Override
    public CompletableFuture<ApiHttpResponse<com.commercetools.api.models.cart.Cart>> execute() {
        return apiHttpClient().execute(this.createHttpRequest(), com.commercetools.api.models.cart.Cart.class);
    }

    public String getProjectKey() {
        return this.projectKey;
    }

    public String getKey() {
        return this.key;
    }

    public List<String> getDataErasure() {
        return this.getQueryParam("dataErasure");
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

    public void setKey(final String key) {
        this.key = key;
    }

    public ByProjectKeyCartsKeyByKeyDelete withDataErasure(final Boolean dataErasure) {
        return copy().withQueryParam("dataErasure", dataErasure);
    }

    public ByProjectKeyCartsKeyByKeyDelete addDataErasure(final Boolean dataErasure) {
        return copy().addQueryParam("dataErasure", dataErasure);
    }

    public ByProjectKeyCartsKeyByKeyDelete withVersion(final Long version) {
        return copy().withQueryParam("version", version);
    }

    public ByProjectKeyCartsKeyByKeyDelete addVersion(final Long version) {
        return copy().addQueryParam("version", version);
    }

    public ByProjectKeyCartsKeyByKeyDelete withExpand(final String expand) {
        return copy().withQueryParam("expand", expand);
    }

    public ByProjectKeyCartsKeyByKeyDelete addExpand(final String expand) {
        return copy().addQueryParam("expand", expand);
    }

    @Override
    protected ByProjectKeyCartsKeyByKeyDelete copy() {
        return new ByProjectKeyCartsKeyByKeyDelete(this);
    }
}
