
package com.commercetools.api.client;

import java.net.URI;
import java.nio.charset.StandardCharsets;
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
 *  <p>Creates an Order from a Cart for the Customer or anonymous user. The <code>customerId</code> or <code>anonymousId</code> field on the Order is automatically set based on the customer:{id} or anonymous_id:{id} scope.</p>
 *  <p>The Cart must have a shipping address and an active Shipping Method set. When creating B2B Orders, the Customer must have the <code>CreateMyOrdersFromMyCarts</code> Permission.</p>
 *  <p>If the Cart's <code>customerId</code> does not match the customer:{id} scope, or the <code>anonymousId</code> does not match the anonymous_id:{id} scope, a ResourceNotFound error is returned.</p>
 *  <p>Creating an Order produces the OrderCreated Message.</p>
 *  <p>If a server-side problem occurs, indicated by a 500 Internal Server Error HTTP response, the Order creation may still successfully complete after the error is returned. If you receive this error, you should verify the status of the Order by querying a unique identifier supplied during the creation request, such as the Order number.</p>
 *  <p>Specific Error Codes:</p>
 *  <ul>
 *   <li>AssociateMissingPermission</li>
 *   <li>DiscountCodeNonApplicable</li>
 *   <li>InvalidItemShippingDetails</li>
 *   <li>OutOfStock</li>
 *   <li>PriceChanged</li>
 *   <li>ShippingMethodDoesNotMatchCart</li>
 *   <li>MatchingPriceNotFound</li>
 *   <li>MissingTaxRateForCountry</li>
 *  </ul>
 *
 * <hr>
 * <div class=code-example>
 * <pre><code class='java'>{@code
 *   CompletableFuture<ApiHttpResponse<com.commercetools.api.models.order.Order>> result = apiRoot
 *            .withProjectKey("{projectKey}")
 *            .me()
 *            .orders()
 *            .post("")
 *            .execute()
 * }</code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyMeOrdersPostString
        extends StringBodyApiMethod<ByProjectKeyMeOrdersPostString, com.commercetools.api.models.order.Order>
        implements com.commercetools.api.client.ConflictingTrait<ByProjectKeyMeOrdersPostString>,
        com.commercetools.api.client.ExpandableTrait<ByProjectKeyMeOrdersPostString>,
        com.commercetools.api.client.Deprecatable201Trait<ByProjectKeyMeOrdersPostString>,
        com.commercetools.api.client.ErrorableTrait<ByProjectKeyMeOrdersPostString> {

    @Override
    public TypeReference<com.commercetools.api.models.order.Order> resultType() {
        return new TypeReference<com.commercetools.api.models.order.Order>() {
        };
    }

    private String projectKey;

    private String myOrderFromCartDraft;

    public ByProjectKeyMeOrdersPostString(final ApiHttpClient apiHttpClient, String projectKey,
            String myOrderFromCartDraft) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.myOrderFromCartDraft = myOrderFromCartDraft;
    }

    public ByProjectKeyMeOrdersPostString(ByProjectKeyMeOrdersPostString t) {
        super(t);
        this.projectKey = t.projectKey;
        this.myOrderFromCartDraft = t.myOrderFromCartDraft;
    }

    @Override
    protected ApiHttpRequest buildHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("%s/me/orders", this.projectKey);
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }
        return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(),
            myOrderFromCartDraft.getBytes(StandardCharsets.UTF_8));

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
     * @param <TValue> value type
     * @param expand value to be set
     * @return ByProjectKeyMeOrdersPostString
     */
    public <TValue> ByProjectKeyMeOrdersPostString withExpand(final TValue expand) {
        return copy().withQueryParam("expand", expand);
    }

    /**
     * add additional expand query parameter
     * @param <TValue> value type
     * @param expand value to be added
     * @return ByProjectKeyMeOrdersPostString
     */
    public <TValue> ByProjectKeyMeOrdersPostString addExpand(final TValue expand) {
        return copy().addQueryParam("expand", expand);
    }

    /**
     * set expand with the specified value
     * @param supplier supplier for the value to be set
     * @return ByProjectKeyMeOrdersPostString
     */
    public ByProjectKeyMeOrdersPostString withExpand(final Supplier<String> supplier) {
        return copy().withQueryParam("expand", supplier.get());
    }

    /**
     * add additional expand query parameter
     * @param supplier supplier for the value to be added
     * @return ByProjectKeyMeOrdersPostString
     */
    public ByProjectKeyMeOrdersPostString addExpand(final Supplier<String> supplier) {
        return copy().addQueryParam("expand", supplier.get());
    }

    /**
     * set expand with the specified value
     * @param op builder for the value to be set
     * @return ByProjectKeyMeOrdersPostString
     */
    public ByProjectKeyMeOrdersPostString withExpand(final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("expand", op.apply(new StringBuilder()));
    }

    /**
     * add additional expand query parameter
     * @param op builder for the value to be added
     * @return ByProjectKeyMeOrdersPostString
     */
    public ByProjectKeyMeOrdersPostString addExpand(final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("expand", op.apply(new StringBuilder()));
    }

    /**
     * set expand with the specified values
     * @param <TValue> value type
     * @param expand values to be set
     * @return ByProjectKeyMeOrdersPostString
     */
    public <TValue> ByProjectKeyMeOrdersPostString withExpand(final Collection<TValue> expand) {
        return copy().withoutQueryParam("expand")
                .addQueryParams(
                    expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional expand query parameters
     * @param <TValue> value type
     * @param expand values to be added
     * @return ByProjectKeyMeOrdersPostString
     */
    public <TValue> ByProjectKeyMeOrdersPostString addExpand(final Collection<TValue> expand) {
        return copy().addQueryParams(
            expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList()));
    }

    public String getBody() {
        return myOrderFromCartDraft;
    }

    public ByProjectKeyMeOrdersPostString withBody(String myOrderFromCartDraft) {
        ByProjectKeyMeOrdersPostString t = copy();
        t.myOrderFromCartDraft = myOrderFromCartDraft;
        return t;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ByProjectKeyMeOrdersPostString that = (ByProjectKeyMeOrdersPostString) o;

        return new EqualsBuilder().append(projectKey, that.projectKey)
                .append(myOrderFromCartDraft, that.myOrderFromCartDraft)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(projectKey).append(myOrderFromCartDraft).toHashCode();
    }

    @Override
    protected ByProjectKeyMeOrdersPostString copy() {
        return new ByProjectKeyMeOrdersPostString(this);
    }
}
