
package com.commercetools.api.client;

import static io.vrap.rmf.base.client.utils.ClientUtils.blockingWait;

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
public class ByProjectKeyCartDiscountsKeyByKeyGet
        extends ApiMethod<ByProjectKeyCartDiscountsKeyByKeyGet, com.commercetools.api.models.cart_discount.CartDiscount>
        implements com.commercetools.api.client.ExpandableTrait<ByProjectKeyCartDiscountsKeyByKeyGet>,
        com.commercetools.api.client.ErrorableTrait<ByProjectKeyCartDiscountsKeyByKeyGet>,
        com.commercetools.api.client.Deprecatable200Trait<ByProjectKeyCartDiscountsKeyByKeyGet> {

    private String projectKey;
    private String key;

    public ByProjectKeyCartDiscountsKeyByKeyGet(final ApiHttpClient apiHttpClient, String projectKey, String key) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.key = key;
    }

    public ByProjectKeyCartDiscountsKeyByKeyGet(ByProjectKeyCartDiscountsKeyByKeyGet t) {
        super(t);
        this.projectKey = t.projectKey;
        this.key = t.key;
    }

    @Override
    public ApiHttpRequest createHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("/%s/cart-discounts/key=%s", this.projectKey, this.key);
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }

        return new ApiHttpRequest(ApiHttpMethod.GET, URI.create(httpRequestPath), getHeaders(), null);
    }

    @Override
    public ApiHttpResponse<com.commercetools.api.models.cart_discount.CartDiscount> executeBlocking(
            final ApiHttpClient client, Duration timeout) {
        ApiHttpRequest request = this.createHttpRequest();
        return blockingWait(client.execute(request, com.commercetools.api.models.cart_discount.CartDiscount.class)
                .toCompletableFuture(),
            request, timeout);
    }

    @Override
    public CompletableFuture<ApiHttpResponse<com.commercetools.api.models.cart_discount.CartDiscount>> execute(
            final ApiHttpClient client) {
        return client.execute(this.createHttpRequest(), com.commercetools.api.models.cart_discount.CartDiscount.class)
                .toCompletableFuture();
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
    public ByProjectKeyCartDiscountsKeyByKeyGet withExpand(final String expand) {
        return copy().withQueryParam("expand", expand);
    }

    /**
     * add additional expand query parameter
     */
    public ByProjectKeyCartDiscountsKeyByKeyGet addExpand(final String expand) {
        return copy().addQueryParam("expand", expand);
    }

    /**
     * set expand with the specificied values
     */
    public ByProjectKeyCartDiscountsKeyByKeyGet withExpand(final List<String> expand) {
        return copy().withoutQueryParam("expand")
                .addQueryParams(
                    expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional expand query parameters
     */
    public ByProjectKeyCartDiscountsKeyByKeyGet addExpand(final List<String> expand) {
        return copy().addQueryParams(
            expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList()));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ByProjectKeyCartDiscountsKeyByKeyGet that = (ByProjectKeyCartDiscountsKeyByKeyGet) o;

        return new EqualsBuilder().append(projectKey, that.projectKey).append(key, that.key).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(projectKey).append(key).toHashCode();
    }

    @Override
    protected ByProjectKeyCartDiscountsKeyByKeyGet copy() {
        return new ByProjectKeyCartDiscountsKeyByKeyGet(this);
    }
}