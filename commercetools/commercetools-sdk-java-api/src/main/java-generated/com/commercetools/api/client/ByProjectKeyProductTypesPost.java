
package com.commercetools.api.client;

import java.net.URI;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;

import io.vrap.rmf.base.client.*;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ByProjectKeyProductTypesPost extends
        BodyApiMethod<ByProjectKeyProductTypesPost, com.commercetools.api.models.product_type.ProductType, com.commercetools.api.models.product_type.ProductTypeDraft>
        implements com.commercetools.api.client.ExpandableTrait<ByProjectKeyProductTypesPost>,
        com.commercetools.api.client.Deprecatable201Trait<ByProjectKeyProductTypesPost>,
        com.commercetools.api.client.ErrorableTrait<ByProjectKeyProductTypesPost> {

    private String projectKey;

    private com.commercetools.api.models.product_type.ProductTypeDraft productTypeDraft;

    public ByProjectKeyProductTypesPost(final ApiHttpClient apiHttpClient, String projectKey,
            com.commercetools.api.models.product_type.ProductTypeDraft productTypeDraft) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.productTypeDraft = productTypeDraft;
    }

    public ByProjectKeyProductTypesPost(ByProjectKeyProductTypesPost t) {
        super(t);
        this.projectKey = t.projectKey;
        this.productTypeDraft = t.productTypeDraft;
    }

    @Override
    protected ApiHttpRequest buildHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("/%s/product-types", this.projectKey);
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }
        return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(),
            io.vrap.rmf.base.client.utils.json.JsonUtils
                    .executing(() -> apiHttpClient().getSerializerService().toJsonByteArray(productTypeDraft)));

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

    public List<String> getExpand() {
        return this.getQueryParam("expand");
    }

    public void setProjectKey(final String projectKey) {
        this.projectKey = projectKey;
    }

    /**
     * set expand with the specified value
     */
    public <TValue> ByProjectKeyProductTypesPost withExpand(final TValue expand) {
        return copy().withQueryParam("expand", expand);
    }

    /**
     * add additional expand query parameter
     */
    public <TValue> ByProjectKeyProductTypesPost addExpand(final TValue expand) {
        return copy().addQueryParam("expand", expand);
    }

    /**
     * set expand with the specified value
     */
    public ByProjectKeyProductTypesPost withExpand(final Supplier<String> supplier) {
        return copy().withQueryParam("expand", supplier.get());
    }

    /**
     * add additional expand query parameter
     */
    public ByProjectKeyProductTypesPost addExpand(final Supplier<String> supplier) {
        return copy().addQueryParam("expand", supplier.get());
    }

    /**
     * set expand with the specified value
     */
    public ByProjectKeyProductTypesPost withExpand(final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("expand", op.apply(new StringBuilder()));
    }

    /**
     * add additional expand query parameter
     */
    public ByProjectKeyProductTypesPost addExpand(final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("expand", op.apply(new StringBuilder()));
    }

    /**
     * set expand with the specified values
     */
    public <TValue> ByProjectKeyProductTypesPost withExpand(final List<TValue> expand) {
        return copy().withoutQueryParam("expand")
                .addQueryParams(
                    expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional expand query parameters
     */
    public <TValue> ByProjectKeyProductTypesPost addExpand(final List<TValue> expand) {
        return copy().addQueryParams(
            expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList()));
    }

    public com.commercetools.api.models.product_type.ProductTypeDraft getBody() {
        return productTypeDraft;
    }

    public ByProjectKeyProductTypesPost withBody(
            com.commercetools.api.models.product_type.ProductTypeDraft productTypeDraft) {
        ByProjectKeyProductTypesPost t = copy();
        t.productTypeDraft = productTypeDraft;
        return t;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ByProjectKeyProductTypesPost that = (ByProjectKeyProductTypesPost) o;

        return new EqualsBuilder().append(projectKey, that.projectKey)
                .append(productTypeDraft, that.productTypeDraft)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(projectKey).append(productTypeDraft).toHashCode();
    }

    @Override
    protected ByProjectKeyProductTypesPost copy() {
        return new ByProjectKeyProductTypesPost(this);
    }
}
