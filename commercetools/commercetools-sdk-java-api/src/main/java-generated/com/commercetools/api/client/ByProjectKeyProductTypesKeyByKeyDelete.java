
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
public class ByProjectKeyProductTypesKeyByKeyDelete
        extends ApiMethod<ByProjectKeyProductTypesKeyByKeyDelete, com.commercetools.api.models.product_type.ProductType>
        implements com.commercetools.api.client.VersionedTrait<ByProjectKeyProductTypesKeyByKeyDelete>,
        com.commercetools.api.client.ConflictingTrait<ByProjectKeyProductTypesKeyByKeyDelete>,
        com.commercetools.api.client.ExpandableTrait<ByProjectKeyProductTypesKeyByKeyDelete>,
        com.commercetools.api.client.ErrorableTrait<ByProjectKeyProductTypesKeyByKeyDelete>,
        com.commercetools.api.client.Deprecatable200Trait<ByProjectKeyProductTypesKeyByKeyDelete> {

    private String projectKey;
    private String key;

    public ByProjectKeyProductTypesKeyByKeyDelete(final ApiHttpClient apiHttpClient, String projectKey, String key) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.key = key;
    }

    public ByProjectKeyProductTypesKeyByKeyDelete(ByProjectKeyProductTypesKeyByKeyDelete t) {
        super(t);
        this.projectKey = t.projectKey;
        this.key = t.key;
    }

    @Override
    public ApiHttpRequest createHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("/%s/product-types/key=%s", this.projectKey, this.key);
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }

        return new ApiHttpRequest(ApiHttpMethod.DELETE, URI.create(httpRequestPath), getHeaders(), null);
    }

    @Override
    public ApiHttpResponse<com.commercetools.api.models.product_type.ProductType> executeBlocking(
            final ApiHttpClient client, Duration timeout) {
        ApiHttpRequest request = this.createHttpRequest();
        return blockingWait(client.execute(request, com.commercetools.api.models.product_type.ProductType.class),
            request, timeout);
    }

    @Override
    public CompletableFuture<ApiHttpResponse<com.commercetools.api.models.product_type.ProductType>> execute(
            final ApiHttpClient client) {
        return client.execute(this.createHttpRequest(), com.commercetools.api.models.product_type.ProductType.class);
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

    /**
     * set version with the specificied value
     */
    public ByProjectKeyProductTypesKeyByKeyDelete withVersion(final long version) {
        return copy().withQueryParam("version", version);
    }

    /**
     * add additional version query parameter
     */
    public ByProjectKeyProductTypesKeyByKeyDelete addVersion(final long version) {
        return copy().addQueryParam("version", version);
    }

    /**
     * set expand with the specificied value
     */
    public ByProjectKeyProductTypesKeyByKeyDelete withExpand(final String expand) {
        return copy().withQueryParam("expand", expand);
    }

    /**
     * add additional expand query parameter
     */
    public ByProjectKeyProductTypesKeyByKeyDelete addExpand(final String expand) {
        return copy().addQueryParam("expand", expand);
    }

    @Override
    protected ByProjectKeyProductTypesKeyByKeyDelete copy() {
        return new ByProjectKeyProductTypesKeyByKeyDelete(this);
    }
}
