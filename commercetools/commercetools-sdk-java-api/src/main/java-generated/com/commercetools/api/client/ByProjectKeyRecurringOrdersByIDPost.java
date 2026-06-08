
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
 *  <p>Updates a Recurring Order using one or more <span>update actions</span>.</p>
 *  <p>A Recurring Order can only be updated when it is not processing an Order. Otherwise, an <a href="https://docs.commercetools.com/apis/ctp:api:type:InvalidOperationError" rel="nofollow">InvalidOperation</a> error is returned.</p>
 *
 * <hr>
 * <div class=code-example>
 * <pre><code class='java'>{@code
 *   CompletableFuture<ApiHttpResponse<com.commercetools.api.models.recurring_order.RecurringOrder>> result = apiRoot
 *            .withProjectKey("{projectKey}")
 *            .recurringOrders()
 *            .withId("{ID}")
 *            .post(null)
 *            .execute()
 * }</code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyRecurringOrdersByIDPost extends
        TypeBodyApiMethod<ByProjectKeyRecurringOrdersByIDPost, com.commercetools.api.models.recurring_order.RecurringOrder, com.commercetools.api.models.recurring_order.RecurringOrderUpdate>
        implements com.commercetools.api.client.ConflictingTrait<ByProjectKeyRecurringOrdersByIDPost>,
        com.commercetools.api.client.ExpandableTrait<ByProjectKeyRecurringOrdersByIDPost>,
        com.commercetools.api.client.Deprecatable200Trait<ByProjectKeyRecurringOrdersByIDPost>,
        com.commercetools.api.client.ErrorableTrait<ByProjectKeyRecurringOrdersByIDPost> {

    @Override
    public TypeReference<com.commercetools.api.models.recurring_order.RecurringOrder> resultType() {
        return new TypeReference<com.commercetools.api.models.recurring_order.RecurringOrder>() {
        };
    }

    private String projectKey;
    private String ID;

    private com.commercetools.api.models.recurring_order.RecurringOrderUpdate recurringOrderUpdate;

    public ByProjectKeyRecurringOrdersByIDPost(final ApiHttpClient apiHttpClient, String projectKey, String ID,
            com.commercetools.api.models.recurring_order.RecurringOrderUpdate recurringOrderUpdate) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.ID = ID;
        this.recurringOrderUpdate = recurringOrderUpdate;
    }

    public ByProjectKeyRecurringOrdersByIDPost(ByProjectKeyRecurringOrdersByIDPost t) {
        super(t);
        this.projectKey = t.projectKey;
        this.ID = t.ID;
        this.recurringOrderUpdate = t.recurringOrderUpdate;
    }

    @Override
    protected ApiHttpRequest buildHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("%s/recurring-orders/%s", encodePathParam(this.projectKey),
            encodePathParam(this.ID));
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }
        return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(),
            io.vrap.rmf.base.client.utils.json.JsonUtils
                    .executing(() -> apiHttpClient().getSerializerService().toJsonByteArray(recurringOrderUpdate)));

    }

    @Override
    public ApiHttpResponse<com.commercetools.api.models.recurring_order.RecurringOrder> executeBlocking(
            final ApiHttpClient client, final Duration timeout) {
        return executeBlocking(client, timeout, com.commercetools.api.models.recurring_order.RecurringOrder.class);
    }

    @Override
    public CompletableFuture<ApiHttpResponse<com.commercetools.api.models.recurring_order.RecurringOrder>> execute(
            final ApiHttpClient client) {
        return execute(client, com.commercetools.api.models.recurring_order.RecurringOrder.class);
    }

    public String getProjectKey() {
        return this.projectKey;
    }

    public String getID() {
        return this.ID;
    }

    public List<String> getExpand() {
        return this.getQueryParam("expand");
    }

    public void setProjectKey(final String projectKey) {
        this.projectKey = projectKey;
    }

    public void setID(final String ID) {
        this.ID = ID;
    }

    /**
     * set expand with the specified value
     * @param expand value to be set
     * @param <TValue> value type
     * @return ByProjectKeyRecurringOrdersByIDPost
     */
    public <TValue> ByProjectKeyRecurringOrdersByIDPost withExpand(final TValue expand) {
        return copy().withQueryParam("expand", expand);
    }

    /**
     * add additional expand query parameter
     * @param expand value to be added
     * @param <TValue> value type
     * @return ByProjectKeyRecurringOrdersByIDPost
     */
    public <TValue> ByProjectKeyRecurringOrdersByIDPost addExpand(final TValue expand) {
        return copy().addQueryParam("expand", expand);
    }

    /**
     * set expand with the specified value
     * @param supplier supplier for the value to be set
     * @return ByProjectKeyRecurringOrdersByIDPost
     */
    public ByProjectKeyRecurringOrdersByIDPost withExpand(final Supplier<String> supplier) {
        return copy().withQueryParam("expand", supplier.get());
    }

    /**
     * add additional expand query parameter
     * @param supplier supplier for the value to be added
     * @return ByProjectKeyRecurringOrdersByIDPost
     */
    public ByProjectKeyRecurringOrdersByIDPost addExpand(final Supplier<String> supplier) {
        return copy().addQueryParam("expand", supplier.get());
    }

    /**
     * set expand with the specified value
     * @param op builder for the value to be set
     * @return ByProjectKeyRecurringOrdersByIDPost
     */
    public ByProjectKeyRecurringOrdersByIDPost withExpand(final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("expand", op.apply(new StringBuilder()));
    }

    /**
     * add additional expand query parameter
     * @param op builder for the value to be added
     * @return ByProjectKeyRecurringOrdersByIDPost
     */
    public ByProjectKeyRecurringOrdersByIDPost addExpand(final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("expand", op.apply(new StringBuilder()));
    }

    /**
     * set expand with the specified values
     * @param expand values to be set
     * @param <TValue> value type
     * @return ByProjectKeyRecurringOrdersByIDPost
     */
    public <TValue> ByProjectKeyRecurringOrdersByIDPost withExpand(final Collection<TValue> expand) {
        return copy().withoutQueryParam("expand")
                .addQueryParams(
                    expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional expand query parameters
     * @param expand values to be added
     * @param <TValue> value type
     * @return ByProjectKeyRecurringOrdersByIDPost
     */
    public <TValue> ByProjectKeyRecurringOrdersByIDPost addExpand(final Collection<TValue> expand) {
        return copy().addQueryParams(
            expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList()));
    }

    public com.commercetools.api.models.recurring_order.RecurringOrderUpdate getBody() {
        return recurringOrderUpdate;
    }

    public ByProjectKeyRecurringOrdersByIDPost withBody(
            com.commercetools.api.models.recurring_order.RecurringOrderUpdate recurringOrderUpdate) {
        ByProjectKeyRecurringOrdersByIDPost t = copy();
        t.recurringOrderUpdate = recurringOrderUpdate;
        return t;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ByProjectKeyRecurringOrdersByIDPost that = (ByProjectKeyRecurringOrdersByIDPost) o;

        return new EqualsBuilder().append(projectKey, that.projectKey)
                .append(ID, that.ID)
                .append(recurringOrderUpdate, that.recurringOrderUpdate)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(projectKey).append(ID).append(recurringOrderUpdate).toHashCode();
    }

    @Override
    protected ByProjectKeyRecurringOrdersByIDPost copy() {
        return new ByProjectKeyRecurringOrdersByIDPost(this);
    }
}
