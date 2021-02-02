
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
*  <p>Delete ProductDiscount by key</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ByProjectKeyProductDiscountsKeyByKeyDelete extends
        ApiMethod<ByProjectKeyProductDiscountsKeyByKeyDelete, com.commercetools.api.models.product_discount.ProductDiscount>
        implements com.commercetools.api.client.VersionedTrait<ByProjectKeyProductDiscountsKeyByKeyDelete>,
        com.commercetools.api.client.ConflictingTrait<ByProjectKeyProductDiscountsKeyByKeyDelete>,
        com.commercetools.api.client.ExpandableTrait<ByProjectKeyProductDiscountsKeyByKeyDelete>,
        com.commercetools.api.client.ErrorableTrait<ByProjectKeyProductDiscountsKeyByKeyDelete>,
        com.commercetools.api.client.DeprecatableTrait<ByProjectKeyProductDiscountsKeyByKeyDelete> {

    private String projectKey;
    private String key;

    public ByProjectKeyProductDiscountsKeyByKeyDelete(final ApiHttpClient apiHttpClient, String projectKey,
            String key) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.key = key;
    }

    public ByProjectKeyProductDiscountsKeyByKeyDelete(ByProjectKeyProductDiscountsKeyByKeyDelete t) {
        super(t);
        this.projectKey = t.projectKey;
        this.key = t.key;
    }

    @Override
    public ApiHttpRequest createHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("/%s/product-discounts/key=%s", this.projectKey, this.key);
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }

        return new ApiHttpRequest(ApiHttpMethod.DELETE, URI.create(httpRequestPath), getHeaders(), null);
    }

    @Override
    public ApiHttpResponse<com.commercetools.api.models.product_discount.ProductDiscount> executeBlocking(
            Duration timeout) {
        return blockingWait(execute(), timeout);
    }

    @Override
    public CompletableFuture<ApiHttpResponse<com.commercetools.api.models.product_discount.ProductDiscount>> execute() {
        return apiHttpClient().execute(this.createHttpRequest(),
            com.commercetools.api.models.product_discount.ProductDiscount.class);
    }

    public String getProjectKey() {
        return this.projectKey;
    }

    public String getKey() {
        return this.key;
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

    public ByProjectKeyProductDiscountsKeyByKeyDelete withVersion(final Long version) {
        return copy().withQueryParam("version", version);
    }

    public ByProjectKeyProductDiscountsKeyByKeyDelete addVersion(final Long version) {
        return copy().addQueryParam("version", version);
    }

    public ByProjectKeyProductDiscountsKeyByKeyDelete withExpand(final String expand) {
        return copy().withQueryParam("expand", expand);
    }

    public ByProjectKeyProductDiscountsKeyByKeyDelete addExpand(final String expand) {
        return copy().addQueryParam("expand", expand);
    }

    @Override
    protected ByProjectKeyProductDiscountsKeyByKeyDelete copy() {
        return new ByProjectKeyProductDiscountsKeyByKeyDelete(this);
    }
}
