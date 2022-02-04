
package com.commercetools.api.client;

import java.net.URI;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;

import io.vrap.rmf.base.client.*;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ByProjectKeyProductTypesKeyByKeyPost extends
        BodyApiMethod<ByProjectKeyProductTypesKeyByKeyPost, com.commercetools.api.models.product_type.ProductType, com.commercetools.api.models.product_type.ProductTypeUpdate>
        implements com.commercetools.api.client.ConflictingTrait<ByProjectKeyProductTypesKeyByKeyPost>,
        com.commercetools.api.client.ExpandableTrait<ByProjectKeyProductTypesKeyByKeyPost>,
        com.commercetools.api.client.Deprecatable200Trait<ByProjectKeyProductTypesKeyByKeyPost>,
        com.commercetools.api.client.ErrorableTrait<ByProjectKeyProductTypesKeyByKeyPost> {

    private String projectKey;
    private String key;

    private com.commercetools.api.models.product_type.ProductTypeUpdate productTypeUpdate;

    public ByProjectKeyProductTypesKeyByKeyPost(final ApiHttpClient apiHttpClient, String projectKey, String key,
            com.commercetools.api.models.product_type.ProductTypeUpdate productTypeUpdate) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.key = key;
        this.productTypeUpdate = productTypeUpdate;
    }

    public ByProjectKeyProductTypesKeyByKeyPost(ByProjectKeyProductTypesKeyByKeyPost t) {
        super(t);
        this.projectKey = t.projectKey;
        this.key = t.key;
        this.productTypeUpdate = t.productTypeUpdate;
    }

    @Override
    public ApiHttpRequest createHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("/%s/product-types/key=%s", this.projectKey, this.key);
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }
        return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(),
            io.vrap.rmf.base.client.utils.json.JsonUtils
                    .executing(() -> apiHttpClient().getSerializerService().toJsonByteArray(productTypeUpdate)));

    }

    @Override
    public ApiHttpResponse<com.commercetools.api.models.product_type.ProductType> executeBlocking(
            final ApiHttpClient client, final Duration timeout) {
        return executeBlocking(client, timeout, com.commercetools.api.models.product_type.ProductType.class);
    }

    @Override
    public CompletableFuture<ApiHttpResponse<com.commercetools.api.models.product_type.ProductType>> execute(
            final ApiHttpClient client) {
        return execute(client, com.commercetools.api.models.product_type.ProductType.class);
    }

    public String getProjectKey() {
        return this.projectKey;
    }

    public String getKey() {
        return this.key;
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
     * set expand with the specificied value
     */
    public ByProjectKeyProductTypesKeyByKeyPost withExpand(final String expand) {
        return copy().withQueryParam("expand", expand);
    }

    /**
     * add additional expand query parameter
     */
    public ByProjectKeyProductTypesKeyByKeyPost addExpand(final String expand) {
        return copy().addQueryParam("expand", expand);
    }

    /**
     * set expand with the specificied values
     */
    public ByProjectKeyProductTypesKeyByKeyPost withExpand(final List<String> expand) {
        return copy().withoutQueryParam("expand")
                .addQueryParams(
                    expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional expand query parameters
     */
    public ByProjectKeyProductTypesKeyByKeyPost addExpand(final List<String> expand) {
        return copy().addQueryParams(
            expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList()));
    }

    public com.commercetools.api.models.product_type.ProductTypeUpdate getBody() {
        return productTypeUpdate;
    }

    public ByProjectKeyProductTypesKeyByKeyPost withBody(
            com.commercetools.api.models.product_type.ProductTypeUpdate productTypeUpdate) {
        ByProjectKeyProductTypesKeyByKeyPost t = copy();
        t.productTypeUpdate = productTypeUpdate;
        return t;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ByProjectKeyProductTypesKeyByKeyPost that = (ByProjectKeyProductTypesKeyByKeyPost) o;

        return new EqualsBuilder().append(projectKey, that.projectKey)
                .append(key, that.key)
                .append(productTypeUpdate, that.productTypeUpdate)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(projectKey).append(key).append(productTypeUpdate).toHashCode();
    }

    @Override
    protected ByProjectKeyProductTypesKeyByKeyPost copy() {
        return new ByProjectKeyProductTypesKeyByKeyPost(this);
    }
}
