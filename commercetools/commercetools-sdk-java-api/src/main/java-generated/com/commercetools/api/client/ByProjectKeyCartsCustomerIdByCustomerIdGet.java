
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

/**
*  <p>Retrieves the active cart of the customer that has been modified most recently.
*  It does not consider carts with CartOrigin Merchant. If no active cart exists, a 404 Not Found error is returned.</p>
*  <p>The cart may not contain up-to-date prices, discounts etc. If you want to ensure they're up-to-date,
*  send an Update request with the Recalculate update action instead.</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ByProjectKeyCartsCustomerIdByCustomerIdGet
        extends ApiMethod<ByProjectKeyCartsCustomerIdByCustomerIdGet, com.commercetools.api.models.cart.Cart>
        implements com.commercetools.api.client.ExpandableTrait<ByProjectKeyCartsCustomerIdByCustomerIdGet>,
        com.commercetools.api.client.ErrorableTrait<ByProjectKeyCartsCustomerIdByCustomerIdGet>,
        com.commercetools.api.client.Deprecatable200Trait<ByProjectKeyCartsCustomerIdByCustomerIdGet> {

    private String projectKey;
    private String customerId;

    public ByProjectKeyCartsCustomerIdByCustomerIdGet(final ApiHttpClient apiHttpClient, String projectKey,
            String customerId) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.customerId = customerId;
    }

    public ByProjectKeyCartsCustomerIdByCustomerIdGet(ByProjectKeyCartsCustomerIdByCustomerIdGet t) {
        super(t);
        this.projectKey = t.projectKey;
        this.customerId = t.customerId;
    }

    @Override
    protected ApiHttpRequest buildHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("/%s/carts/customer-id=%s", this.projectKey, this.customerId);
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }
        return new ApiHttpRequest(ApiHttpMethod.GET, URI.create(httpRequestPath), getHeaders(), null);
    }

    @Override
    public ApiHttpResponse<com.commercetools.api.models.cart.Cart> executeBlocking(final ApiHttpClient client,
            final Duration timeout) {
        return executeBlocking(client, timeout, com.commercetools.api.models.cart.Cart.class);
    }

    @Override
    public CompletableFuture<ApiHttpResponse<com.commercetools.api.models.cart.Cart>> execute(
            final ApiHttpClient client) {
        return execute(client, com.commercetools.api.models.cart.Cart.class);
    }

    public String getProjectKey() {
        return this.projectKey;
    }

    public String getCustomerId() {
        return this.customerId;
    }

    public List<String> getExpand() {
        return this.getQueryParam("expand");
    }

    public void setProjectKey(final String projectKey) {
        this.projectKey = projectKey;
    }

    public void setCustomerId(final String customerId) {
        this.customerId = customerId;
    }

    /**
     * set expand with the specified value
     */
    public <TValue> ByProjectKeyCartsCustomerIdByCustomerIdGet withExpand(final TValue expand) {
        return copy().withQueryParam("expand", expand);
    }

    /**
     * add additional expand query parameter
     */
    public <TValue> ByProjectKeyCartsCustomerIdByCustomerIdGet addExpand(final TValue expand) {
        return copy().addQueryParam("expand", expand);
    }

    /**
     * set expand with the specified value
     */
    public ByProjectKeyCartsCustomerIdByCustomerIdGet withExpand(final Supplier<String> supplier) {
        return copy().withQueryParam("expand", supplier.get());
    }

    /**
     * add additional expand query parameter
     */
    public ByProjectKeyCartsCustomerIdByCustomerIdGet addExpand(final Supplier<String> supplier) {
        return copy().addQueryParam("expand", supplier.get());
    }

    /**
     * set expand with the specified value
     */
    public ByProjectKeyCartsCustomerIdByCustomerIdGet withExpand(final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("expand", op.apply(new StringBuilder()));
    }

    /**
     * add additional expand query parameter
     */
    public ByProjectKeyCartsCustomerIdByCustomerIdGet addExpand(final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("expand", op.apply(new StringBuilder()));
    }

    /**
     * set expand with the specified values
     */
    public <TValue> ByProjectKeyCartsCustomerIdByCustomerIdGet withExpand(final List<TValue> expand) {
        return copy().withoutQueryParam("expand")
                .addQueryParams(
                    expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional expand query parameters
     */
    public <TValue> ByProjectKeyCartsCustomerIdByCustomerIdGet addExpand(final List<TValue> expand) {
        return copy().addQueryParams(
            expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList()));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ByProjectKeyCartsCustomerIdByCustomerIdGet that = (ByProjectKeyCartsCustomerIdByCustomerIdGet) o;

        return new EqualsBuilder().append(projectKey, that.projectKey).append(customerId, that.customerId).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(projectKey).append(customerId).toHashCode();
    }

    @Override
    protected ByProjectKeyCartsCustomerIdByCustomerIdGet copy() {
        return new ByProjectKeyCartsCustomerIdByCustomerIdGet(this);
    }
}
