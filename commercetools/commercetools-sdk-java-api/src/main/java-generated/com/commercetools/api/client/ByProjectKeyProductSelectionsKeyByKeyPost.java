
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
public class ByProjectKeyProductSelectionsKeyByKeyPost extends
        BodyApiMethod<ByProjectKeyProductSelectionsKeyByKeyPost, com.commercetools.api.models.product_selection.ProductSelection, com.commercetools.api.models.product_selection.ProductSelectionUpdate>
        implements com.commercetools.api.client.ConflictingTrait<ByProjectKeyProductSelectionsKeyByKeyPost>,
        com.commercetools.api.client.ExpandableTrait<ByProjectKeyProductSelectionsKeyByKeyPost>,
        com.commercetools.api.client.Deprecatable200Trait<ByProjectKeyProductSelectionsKeyByKeyPost>,
        com.commercetools.api.client.ErrorableTrait<ByProjectKeyProductSelectionsKeyByKeyPost> {

    private String projectKey;
    private String key;

    private com.commercetools.api.models.product_selection.ProductSelectionUpdate productSelectionUpdate;

    public ByProjectKeyProductSelectionsKeyByKeyPost(final ApiHttpClient apiHttpClient, String projectKey, String key,
            com.commercetools.api.models.product_selection.ProductSelectionUpdate productSelectionUpdate) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.key = key;
        this.productSelectionUpdate = productSelectionUpdate;
    }

    public ByProjectKeyProductSelectionsKeyByKeyPost(ByProjectKeyProductSelectionsKeyByKeyPost t) {
        super(t);
        this.projectKey = t.projectKey;
        this.key = t.key;
        this.productSelectionUpdate = t.productSelectionUpdate;
    }

    @Override
    protected ApiHttpRequest buildHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("/%s/product-selections/key=%s", this.projectKey, this.key);
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }
        return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(),
            io.vrap.rmf.base.client.utils.json.JsonUtils
                    .executing(() -> apiHttpClient().getSerializerService().toJsonByteArray(productSelectionUpdate)));

    }

    @Override
    public ApiHttpResponse<com.commercetools.api.models.product_selection.ProductSelection> executeBlocking(
            final ApiHttpClient client, final Duration timeout) {
        return executeBlocking(client, timeout, com.commercetools.api.models.product_selection.ProductSelection.class);
    }

    @Override
    public CompletableFuture<ApiHttpResponse<com.commercetools.api.models.product_selection.ProductSelection>> execute(
            final ApiHttpClient client) {
        return execute(client, com.commercetools.api.models.product_selection.ProductSelection.class);
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
     * set expand with the specified value
     */
    public <TValue> ByProjectKeyProductSelectionsKeyByKeyPost withExpand(final TValue expand) {
        return copy().withQueryParam("expand", expand);
    }

    /**
     * add additional expand query parameter
     */
    public <TValue> ByProjectKeyProductSelectionsKeyByKeyPost addExpand(final TValue expand) {
        return copy().addQueryParam("expand", expand);
    }

    /**
     * set expand with the specified value
     */
    public ByProjectKeyProductSelectionsKeyByKeyPost withExpand(final Supplier<String> supplier) {
        return copy().withQueryParam("expand", supplier.get());
    }

    /**
     * add additional expand query parameter
     */
    public ByProjectKeyProductSelectionsKeyByKeyPost addExpand(final Supplier<String> supplier) {
        return copy().addQueryParam("expand", supplier.get());
    }

    /**
     * set expand with the specified value
     */
    public ByProjectKeyProductSelectionsKeyByKeyPost withExpand(final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("expand", op.apply(new StringBuilder()));
    }

    /**
     * add additional expand query parameter
     */
    public ByProjectKeyProductSelectionsKeyByKeyPost addExpand(final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("expand", op.apply(new StringBuilder()));
    }

    /**
     * set expand with the specified values
     */
    public <TValue> ByProjectKeyProductSelectionsKeyByKeyPost withExpand(final List<TValue> expand) {
        return copy().withoutQueryParam("expand")
                .addQueryParams(
                    expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional expand query parameters
     */
    public <TValue> ByProjectKeyProductSelectionsKeyByKeyPost addExpand(final List<TValue> expand) {
        return copy().addQueryParams(
            expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList()));
    }

    public com.commercetools.api.models.product_selection.ProductSelectionUpdate getBody() {
        return productSelectionUpdate;
    }

    public ByProjectKeyProductSelectionsKeyByKeyPost withBody(
            com.commercetools.api.models.product_selection.ProductSelectionUpdate productSelectionUpdate) {
        ByProjectKeyProductSelectionsKeyByKeyPost t = copy();
        t.productSelectionUpdate = productSelectionUpdate;
        return t;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ByProjectKeyProductSelectionsKeyByKeyPost that = (ByProjectKeyProductSelectionsKeyByKeyPost) o;

        return new EqualsBuilder().append(projectKey, that.projectKey)
                .append(key, that.key)
                .append(productSelectionUpdate, that.productSelectionUpdate)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(projectKey).append(key).append(productSelectionUpdate).toHashCode();
    }

    @Override
    protected ByProjectKeyProductSelectionsKeyByKeyPost copy() {
        return new ByProjectKeyProductSelectionsKeyByKeyPost(this);
    }
}
