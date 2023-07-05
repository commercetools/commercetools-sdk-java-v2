
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

import io.vrap.rmf.base.client.*;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 *  <p>Updates an order in the Store specified by {storeKey}.</p>
 *  <p>If the Order exists in the Project but does not have the <code>store</code> field, or the <code>store</code> field references a different Store, this method returns a ResourceNotFound error. In case the orderNumber does not match the regular expression [a-zA-Z0-9_-]+, it should be provided in URL-encoded format.</p>
 *
 * <hr>
 * <div class=code-example>
 * <pre><code class='java'>{@code
 *   CompletableFuture<ApiHttpResponse<com.commercetools.api.models.order.Order>> result = apiRoot
 *            .withProjectKey("{projectKey}")
 *            .inStoreKeyWithStoreKeyValue("{storeKey}")
 *            .orders()
 *            .withOrderNumber("{orderNumber}")
 *            .post(null)
 *            .execute()
 * }</code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyInStoreKeyByStoreKeyOrdersOrderNumberByOrderNumberPost extends
        BodyApiMethod<ByProjectKeyInStoreKeyByStoreKeyOrdersOrderNumberByOrderNumberPost, com.commercetools.api.models.order.Order, com.commercetools.api.models.order.OrderUpdate>
        implements
        com.commercetools.api.client.ConflictingTrait<ByProjectKeyInStoreKeyByStoreKeyOrdersOrderNumberByOrderNumberPost>,
        com.commercetools.api.client.ExpandableTrait<ByProjectKeyInStoreKeyByStoreKeyOrdersOrderNumberByOrderNumberPost>,
        com.commercetools.api.client.Deprecatable200Trait<ByProjectKeyInStoreKeyByStoreKeyOrdersOrderNumberByOrderNumberPost>,
        com.commercetools.api.client.ErrorableTrait<ByProjectKeyInStoreKeyByStoreKeyOrdersOrderNumberByOrderNumberPost> {

    private String projectKey;
    private String storeKey;
    private String orderNumber;

    private com.commercetools.api.models.order.OrderUpdate orderUpdate;

    public ByProjectKeyInStoreKeyByStoreKeyOrdersOrderNumberByOrderNumberPost(final ApiHttpClient apiHttpClient,
            String projectKey, String storeKey, String orderNumber,
            com.commercetools.api.models.order.OrderUpdate orderUpdate) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.storeKey = storeKey;
        this.orderNumber = orderNumber;
        this.orderUpdate = orderUpdate;
    }

    public ByProjectKeyInStoreKeyByStoreKeyOrdersOrderNumberByOrderNumberPost(
            ByProjectKeyInStoreKeyByStoreKeyOrdersOrderNumberByOrderNumberPost t) {
        super(t);
        this.projectKey = t.projectKey;
        this.storeKey = t.storeKey;
        this.orderNumber = t.orderNumber;
        this.orderUpdate = t.orderUpdate;
    }

    @Override
    protected ApiHttpRequest buildHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("%s/in-store/key=%s/orders/order-number=%s", this.projectKey,
            this.storeKey, this.orderNumber);
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

    public String getStoreKey() {
        return this.storeKey;
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

    public void setStoreKey(final String storeKey) {
        this.storeKey = storeKey;
    }

    public void setOrderNumber(final String orderNumber) {
        this.orderNumber = orderNumber;
    }

    /**
     * set expand with the specified value
     * @param expand value to be set
     * @param <TValue> value type
     * @return ByProjectKeyInStoreKeyByStoreKeyOrdersOrderNumberByOrderNumberPost
     */
    public <TValue> ByProjectKeyInStoreKeyByStoreKeyOrdersOrderNumberByOrderNumberPost withExpand(final TValue expand) {
        return copy().withQueryParam("expand", expand);
    }

    /**
     * add additional expand query parameter
     * @param expand value to be added
     * @param <TValue> value type
     * @return ByProjectKeyInStoreKeyByStoreKeyOrdersOrderNumberByOrderNumberPost
     */
    public <TValue> ByProjectKeyInStoreKeyByStoreKeyOrdersOrderNumberByOrderNumberPost addExpand(final TValue expand) {
        return copy().addQueryParam("expand", expand);
    }

    /**
     * set expand with the specified value
     * @param supplier supplier for the value to be set
     * @return ByProjectKeyInStoreKeyByStoreKeyOrdersOrderNumberByOrderNumberPost
     */
    public ByProjectKeyInStoreKeyByStoreKeyOrdersOrderNumberByOrderNumberPost withExpand(
            final Supplier<String> supplier) {
        return copy().withQueryParam("expand", supplier.get());
    }

    /**
     * add additional expand query parameter
     * @param supplier supplier for the value to be added
     * @return ByProjectKeyInStoreKeyByStoreKeyOrdersOrderNumberByOrderNumberPost
     */
    public ByProjectKeyInStoreKeyByStoreKeyOrdersOrderNumberByOrderNumberPost addExpand(
            final Supplier<String> supplier) {
        return copy().addQueryParam("expand", supplier.get());
    }

    /**
     * set expand with the specified value
     * @param op builder for the value to be set
     * @return ByProjectKeyInStoreKeyByStoreKeyOrdersOrderNumberByOrderNumberPost
     */
    public ByProjectKeyInStoreKeyByStoreKeyOrdersOrderNumberByOrderNumberPost withExpand(
            final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("expand", op.apply(new StringBuilder()));
    }

    /**
     * add additional expand query parameter
     * @param op builder for the value to be added
     * @return ByProjectKeyInStoreKeyByStoreKeyOrdersOrderNumberByOrderNumberPost
     */
    public ByProjectKeyInStoreKeyByStoreKeyOrdersOrderNumberByOrderNumberPost addExpand(
            final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("expand", op.apply(new StringBuilder()));
    }

    /**
     * set expand with the specified values
     * @param expand values to be set
     * @param <TValue> value type
     * @return ByProjectKeyInStoreKeyByStoreKeyOrdersOrderNumberByOrderNumberPost
     */
    public <TValue> ByProjectKeyInStoreKeyByStoreKeyOrdersOrderNumberByOrderNumberPost withExpand(
            final Collection<TValue> expand) {
        return copy().withoutQueryParam("expand")
                .addQueryParams(
                    expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional expand query parameters
     * @param expand values to be added
     * @param <TValue> value type
     * @return ByProjectKeyInStoreKeyByStoreKeyOrdersOrderNumberByOrderNumberPost
     */
    public <TValue> ByProjectKeyInStoreKeyByStoreKeyOrdersOrderNumberByOrderNumberPost addExpand(
            final Collection<TValue> expand) {
        return copy().addQueryParams(
            expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList()));
    }

    public com.commercetools.api.models.order.OrderUpdate getBody() {
        return orderUpdate;
    }

    public ByProjectKeyInStoreKeyByStoreKeyOrdersOrderNumberByOrderNumberPost withBody(
            com.commercetools.api.models.order.OrderUpdate orderUpdate) {
        ByProjectKeyInStoreKeyByStoreKeyOrdersOrderNumberByOrderNumberPost t = copy();
        t.orderUpdate = orderUpdate;
        return t;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ByProjectKeyInStoreKeyByStoreKeyOrdersOrderNumberByOrderNumberPost that = (ByProjectKeyInStoreKeyByStoreKeyOrdersOrderNumberByOrderNumberPost) o;

        return new EqualsBuilder().append(projectKey, that.projectKey)
                .append(storeKey, that.storeKey)
                .append(orderNumber, that.orderNumber)
                .append(orderUpdate, that.orderUpdate)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(projectKey)
                .append(storeKey)
                .append(orderNumber)
                .append(orderUpdate)
                .toHashCode();
    }

    @Override
    protected ByProjectKeyInStoreKeyByStoreKeyOrdersOrderNumberByOrderNumberPost copy() {
        return new ByProjectKeyInStoreKeyByStoreKeyOrdersOrderNumberByOrderNumberPost(this);
    }
}
