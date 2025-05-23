
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
 *  <p>Updates an Order in the Project using one or more update actions.</p>
 *
 * <hr>
 * <div class=code-example>
 * <pre><code class='java'>{@code
 *   CompletableFuture<ApiHttpResponse<com.commercetools.api.models.order.Order>> result = apiRoot
 *            .withProjectKey("{projectKey}")
 *            .orders()
 *            .withOrderNumber("{orderNumber}")
 *            .post(null)
 *            .execute()
 * }</code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyOrdersOrderNumberByOrderNumberPost extends
        TypeBodyApiMethod<ByProjectKeyOrdersOrderNumberByOrderNumberPost, com.commercetools.api.models.order.Order, com.commercetools.api.models.order.OrderUpdate>
        implements com.commercetools.api.client.ConflictingTrait<ByProjectKeyOrdersOrderNumberByOrderNumberPost>,
        com.commercetools.api.client.ExpandableTrait<ByProjectKeyOrdersOrderNumberByOrderNumberPost>,
        com.commercetools.api.client.Deprecatable200Trait<ByProjectKeyOrdersOrderNumberByOrderNumberPost>,
        com.commercetools.api.client.ErrorableTrait<ByProjectKeyOrdersOrderNumberByOrderNumberPost> {

    @Override
    public TypeReference<com.commercetools.api.models.order.Order> resultType() {
        return new TypeReference<com.commercetools.api.models.order.Order>() {
        };
    }

    private String projectKey;
    private String orderNumber;

    private com.commercetools.api.models.order.OrderUpdate orderUpdate;

    public ByProjectKeyOrdersOrderNumberByOrderNumberPost(final ApiHttpClient apiHttpClient, String projectKey,
            String orderNumber, com.commercetools.api.models.order.OrderUpdate orderUpdate) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.orderNumber = orderNumber;
        this.orderUpdate = orderUpdate;
    }

    public ByProjectKeyOrdersOrderNumberByOrderNumberPost(ByProjectKeyOrdersOrderNumberByOrderNumberPost t) {
        super(t);
        this.projectKey = t.projectKey;
        this.orderNumber = t.orderNumber;
        this.orderUpdate = t.orderUpdate;
    }

    @Override
    protected ApiHttpRequest buildHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("%s/orders/order-number=%s", encodePathParam(this.projectKey),
            encodePathParam(this.orderNumber));
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }
        return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(),
            io.vrap.rmf.base.client.utils.json.JsonUtils
                    .executing(() -> apiHttpClient().getSerializerService().toJsonByteArray(orderUpdate)));

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

    public String getOrderNumber() {
        return this.orderNumber;
    }

    public List<String> getExpand() {
        return this.getQueryParam("expand");
    }

    public void setProjectKey(final String projectKey) {
        this.projectKey = projectKey;
    }

    public void setOrderNumber(final String orderNumber) {
        this.orderNumber = orderNumber;
    }

    /**
     * set expand with the specified value
     * @param expand value to be set
     * @param <TValue> value type
     * @return ByProjectKeyOrdersOrderNumberByOrderNumberPost
     */
    public <TValue> ByProjectKeyOrdersOrderNumberByOrderNumberPost withExpand(final TValue expand) {
        return copy().withQueryParam("expand", expand);
    }

    /**
     * add additional expand query parameter
     * @param expand value to be added
     * @param <TValue> value type
     * @return ByProjectKeyOrdersOrderNumberByOrderNumberPost
     */
    public <TValue> ByProjectKeyOrdersOrderNumberByOrderNumberPost addExpand(final TValue expand) {
        return copy().addQueryParam("expand", expand);
    }

    /**
     * set expand with the specified value
     * @param supplier supplier for the value to be set
     * @return ByProjectKeyOrdersOrderNumberByOrderNumberPost
     */
    public ByProjectKeyOrdersOrderNumberByOrderNumberPost withExpand(final Supplier<String> supplier) {
        return copy().withQueryParam("expand", supplier.get());
    }

    /**
     * add additional expand query parameter
     * @param supplier supplier for the value to be added
     * @return ByProjectKeyOrdersOrderNumberByOrderNumberPost
     */
    public ByProjectKeyOrdersOrderNumberByOrderNumberPost addExpand(final Supplier<String> supplier) {
        return copy().addQueryParam("expand", supplier.get());
    }

    /**
     * set expand with the specified value
     * @param op builder for the value to be set
     * @return ByProjectKeyOrdersOrderNumberByOrderNumberPost
     */
    public ByProjectKeyOrdersOrderNumberByOrderNumberPost withExpand(final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("expand", op.apply(new StringBuilder()));
    }

    /**
     * add additional expand query parameter
     * @param op builder for the value to be added
     * @return ByProjectKeyOrdersOrderNumberByOrderNumberPost
     */
    public ByProjectKeyOrdersOrderNumberByOrderNumberPost addExpand(final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("expand", op.apply(new StringBuilder()));
    }

    /**
     * set expand with the specified values
     * @param expand values to be set
     * @param <TValue> value type
     * @return ByProjectKeyOrdersOrderNumberByOrderNumberPost
     */
    public <TValue> ByProjectKeyOrdersOrderNumberByOrderNumberPost withExpand(final Collection<TValue> expand) {
        return copy().withoutQueryParam("expand")
                .addQueryParams(
                    expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional expand query parameters
     * @param expand values to be added
     * @param <TValue> value type
     * @return ByProjectKeyOrdersOrderNumberByOrderNumberPost
     */
    public <TValue> ByProjectKeyOrdersOrderNumberByOrderNumberPost addExpand(final Collection<TValue> expand) {
        return copy().addQueryParams(
            expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList()));
    }

    public com.commercetools.api.models.order.OrderUpdate getBody() {
        return orderUpdate;
    }

    public ByProjectKeyOrdersOrderNumberByOrderNumberPost withBody(
            com.commercetools.api.models.order.OrderUpdate orderUpdate) {
        ByProjectKeyOrdersOrderNumberByOrderNumberPost t = copy();
        t.orderUpdate = orderUpdate;
        return t;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ByProjectKeyOrdersOrderNumberByOrderNumberPost that = (ByProjectKeyOrdersOrderNumberByOrderNumberPost) o;

        return new EqualsBuilder().append(projectKey, that.projectKey)
                .append(orderNumber, that.orderNumber)
                .append(orderUpdate, that.orderUpdate)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(projectKey).append(orderNumber).append(orderUpdate).toHashCode();
    }

    @Override
    protected ByProjectKeyOrdersOrderNumberByOrderNumberPost copy() {
        return new ByProjectKeyOrdersOrderNumberByOrderNumberPost(this);
    }
}
