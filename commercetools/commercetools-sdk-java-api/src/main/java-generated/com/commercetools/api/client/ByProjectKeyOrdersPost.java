
package com.commercetools.api.client;

import java.net.URI;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;

import com.fasterxml.jackson.core.type.TypeReference;

import io.vrap.rmf.base.client.*;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 *  <p>Creates an Order from a Cart.</p>
 *  <p>The Cart must have a shipping address and an active Shipping Method set.</p>
 *  <p>The shipping address is used for tax calculation for a Cart with <code>Platform</code> TaxMode.</p>
 *  <p>Creating an Order produces the OrderCreated Message. If the Order is created from a Recurring Order schedule, the OrderCreatedFromRecurringOrder Message is generated.</p>
 *  <p>If a server-side problem occurs, indicated by a 500 Internal Server Error HTTP response, the Order creation may still successfully complete after the error is returned. If you receive this error, you should verify the status of the Order by querying a unique identifier supplied during the creation request, such as the Order number.</p>
 *  <p>Specific Error Codes:</p>
 *  <ul>
 *   <li>OutOfStock</li>
 *   <li>PriceChanged</li>
 *   <li>DiscountCodeNonApplicable</li>
 *   <li>ShippingMethodDoesNotMatchCart</li>
 *   <li>InvalidItemShippingDetails</li>
 *   <li>InvalidOperation</li>
 *   <li>MatchingPriceNotFound</li>
 *   <li>MissingTaxRateForCountry</li>
 *  </ul>
 *
 * <hr>
 * <div class=code-example>
 * <pre><code class='java'>{@code
 *   CompletableFuture<ApiHttpResponse<com.commercetools.api.models.order.Order>> result = apiRoot
 *            .withProjectKey("{projectKey}")
 *            .orders()
 *            .post(null)
 *            .execute()
 * }</code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyOrdersPost extends
        TypeBodyApiMethod<ByProjectKeyOrdersPost, com.commercetools.api.models.order.Order, com.commercetools.api.models.order.OrderFromCartDraft>
        implements com.commercetools.api.client.ConflictingTrait<ByProjectKeyOrdersPost>,
        com.commercetools.api.client.ExpandableTrait<ByProjectKeyOrdersPost>,
        com.commercetools.api.client.Deprecatable201Trait<ByProjectKeyOrdersPost>,
        com.commercetools.api.client.ErrorableTrait<ByProjectKeyOrdersPost> {

    @Override
    public TypeReference<com.commercetools.api.models.order.Order> resultType() {
        return new TypeReference<com.commercetools.api.models.order.Order>() {
        };
    }

    private String projectKey;

    private com.commercetools.api.models.order.OrderFromCartDraft orderFromCartDraft;

    public ByProjectKeyOrdersPost(final ApiHttpClient apiHttpClient, String projectKey,
            com.commercetools.api.models.order.OrderFromCartDraft orderFromCartDraft) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.orderFromCartDraft = orderFromCartDraft;
    }

    public ByProjectKeyOrdersPost(ByProjectKeyOrdersPost t) {
        super(t);
        this.projectKey = t.projectKey;
        this.orderFromCartDraft = t.orderFromCartDraft;
    }

    @Override
    protected ApiHttpRequest buildHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("%s/orders", encodePathParam(this.projectKey));
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }
        return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(),
            io.vrap.rmf.base.client.utils.json.JsonUtils
                    .executing(() -> apiHttpClient().getSerializerService().toJsonByteArray(orderFromCartDraft)));

    }

    @Override
    public ApiHttpResponse<com.commercetools.api.models.order.Order> executeBlocking(final ApiHttpClient client,
            final Duration timeout) {
        return executeBlocking(client, timeout, com.commercetools.api.models.order.Order.class);
    }

    @Override
    public CompletableFuture<ApiHttpResponse<com.commercetools.api.models.order.Order>> execute(
            final ApiHttpClient client) {
        return execute(client, com.commercetools.api.models.order.Order.class);
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
     * @param expand value to be set
     * @param <TValue> value type
     * @return ByProjectKeyOrdersPost
     */
    public <TValue> ByProjectKeyOrdersPost withExpand(final TValue expand) {
        return copy().withQueryParam("expand", expand);
    }

    /**
     * add additional expand query parameter
     * @param expand value to be added
     * @param <TValue> value type
     * @return ByProjectKeyOrdersPost
     */
    public <TValue> ByProjectKeyOrdersPost addExpand(final TValue expand) {
        return copy().addQueryParam("expand", expand);
    }

    /**
     * set expand with the specified value
     * @param supplier supplier for the value to be set
     * @return ByProjectKeyOrdersPost
     */
    public ByProjectKeyOrdersPost withExpand(final Supplier<String> supplier) {
        return copy().withQueryParam("expand", supplier.get());
    }

    /**
     * add additional expand query parameter
     * @param supplier supplier for the value to be added
     * @return ByProjectKeyOrdersPost
     */
    public ByProjectKeyOrdersPost addExpand(final Supplier<String> supplier) {
        return copy().addQueryParam("expand", supplier.get());
    }

    /**
     * set expand with the specified value
     * @param op builder for the value to be set
     * @return ByProjectKeyOrdersPost
     */
    public ByProjectKeyOrdersPost withExpand(final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("expand", op.apply(new StringBuilder()));
    }

    /**
     * add additional expand query parameter
     * @param op builder for the value to be added
     * @return ByProjectKeyOrdersPost
     */
    public ByProjectKeyOrdersPost addExpand(final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("expand", op.apply(new StringBuilder()));
    }

    /**
     * set expand with the specified values
     * @param expand values to be set
     * @param <TValue> value type
     * @return ByProjectKeyOrdersPost
     */
    public <TValue> ByProjectKeyOrdersPost withExpand(final Collection<TValue> expand) {
        return copy().withoutQueryParam("expand")
                .addQueryParams(
                    expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional expand query parameters
     * @param expand values to be added
     * @param <TValue> value type
     * @return ByProjectKeyOrdersPost
     */
    public <TValue> ByProjectKeyOrdersPost addExpand(final Collection<TValue> expand) {
        return copy().addQueryParams(
            expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList()));
    }

    public com.commercetools.api.models.order.OrderFromCartDraft getBody() {
        return orderFromCartDraft;
    }

    public ByProjectKeyOrdersPost withBody(com.commercetools.api.models.order.OrderFromCartDraft orderFromCartDraft) {
        ByProjectKeyOrdersPost t = copy();
        t.orderFromCartDraft = orderFromCartDraft;
        return t;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ByProjectKeyOrdersPost that = (ByProjectKeyOrdersPost) o;

        return new EqualsBuilder().append(projectKey, that.projectKey)
                .append(orderFromCartDraft, that.orderFromCartDraft)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(projectKey).append(orderFromCartDraft).toHashCode();
    }

    @Override
    protected ByProjectKeyOrdersPost copy() {
        return new ByProjectKeyOrdersPost(this);
    }
}
