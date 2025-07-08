
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
 *  <p>Creates a Recurring Order in the Project. The Cart is validated to ensure that it is convertible to an Order. If validation fails, an error is returned.</p>
 *  <p>Produces the RecurringOrderCreated message.</p>
 *  <p>If a server-side problem occurs, indicated by a 500 Internal Server Error HTTP response, the Recurring Order creation may still successfully complete after the error is returned. If you receive this error, you should verify the status of the Recurring Order by querying a unique identifier supplied during the creation request, such as the key.</p>
 *
 * <hr>
 * <div class=code-example>
 * <pre><code class='java'>{@code
 *   CompletableFuture<ApiHttpResponse<com.commercetools.api.models.recurring_order.RecurringOrder>> result = apiRoot
 *            .withProjectKey("{projectKey}")
 *            .recurringOrders()
 *            .post("")
 *            .execute()
 * }</code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyRecurringOrdersPostString extends
        StringBodyApiMethod<ByProjectKeyRecurringOrdersPostString, com.commercetools.api.models.recurring_order.RecurringOrder>
        implements com.commercetools.api.client.ConflictingTrait<ByProjectKeyRecurringOrdersPostString>,
        com.commercetools.api.client.ExpandableTrait<ByProjectKeyRecurringOrdersPostString>,
        com.commercetools.api.client.Deprecatable201Trait<ByProjectKeyRecurringOrdersPostString>,
        com.commercetools.api.client.ErrorableTrait<ByProjectKeyRecurringOrdersPostString> {

    @Override
    public TypeReference<com.commercetools.api.models.recurring_order.RecurringOrder> resultType() {
        return new TypeReference<com.commercetools.api.models.recurring_order.RecurringOrder>() {
        };
    }

    private String projectKey;

    private String recurringOrderDraft;

    public ByProjectKeyRecurringOrdersPostString(final ApiHttpClient apiHttpClient, String projectKey,
            String recurringOrderDraft) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.recurringOrderDraft = recurringOrderDraft;
    }

    public ByProjectKeyRecurringOrdersPostString(ByProjectKeyRecurringOrdersPostString t) {
        super(t);
        this.projectKey = t.projectKey;
        this.recurringOrderDraft = t.recurringOrderDraft;
    }

    @Override
    protected ApiHttpRequest buildHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("%s/recurring-orders", this.projectKey);
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }
        return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(),
            recurringOrderDraft.getBytes(StandardCharsets.UTF_8));

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
     * @return ByProjectKeyRecurringOrdersPostString
     */
    public <TValue> ByProjectKeyRecurringOrdersPostString withExpand(final TValue expand) {
        return copy().withQueryParam("expand", expand);
    }

    /**
     * add additional expand query parameter
     * @param <TValue> value type
     * @param expand value to be added
     * @return ByProjectKeyRecurringOrdersPostString
     */
    public <TValue> ByProjectKeyRecurringOrdersPostString addExpand(final TValue expand) {
        return copy().addQueryParam("expand", expand);
    }

    /**
     * set expand with the specified value
     * @param supplier supplier for the value to be set
     * @return ByProjectKeyRecurringOrdersPostString
     */
    public ByProjectKeyRecurringOrdersPostString withExpand(final Supplier<String> supplier) {
        return copy().withQueryParam("expand", supplier.get());
    }

    /**
     * add additional expand query parameter
     * @param supplier supplier for the value to be added
     * @return ByProjectKeyRecurringOrdersPostString
     */
    public ByProjectKeyRecurringOrdersPostString addExpand(final Supplier<String> supplier) {
        return copy().addQueryParam("expand", supplier.get());
    }

    /**
     * set expand with the specified value
     * @param op builder for the value to be set
     * @return ByProjectKeyRecurringOrdersPostString
     */
    public ByProjectKeyRecurringOrdersPostString withExpand(final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("expand", op.apply(new StringBuilder()));
    }

    /**
     * add additional expand query parameter
     * @param op builder for the value to be added
     * @return ByProjectKeyRecurringOrdersPostString
     */
    public ByProjectKeyRecurringOrdersPostString addExpand(final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("expand", op.apply(new StringBuilder()));
    }

    /**
     * set expand with the specified values
     * @param <TValue> value type
     * @param expand values to be set
     * @return ByProjectKeyRecurringOrdersPostString
     */
    public <TValue> ByProjectKeyRecurringOrdersPostString withExpand(final Collection<TValue> expand) {
        return copy().withoutQueryParam("expand")
                .addQueryParams(
                    expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional expand query parameters
     * @param <TValue> value type
     * @param expand values to be added
     * @return ByProjectKeyRecurringOrdersPostString
     */
    public <TValue> ByProjectKeyRecurringOrdersPostString addExpand(final Collection<TValue> expand) {
        return copy().addQueryParams(
            expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList()));
    }

    public String getBody() {
        return recurringOrderDraft;
    }

    public ByProjectKeyRecurringOrdersPostString withBody(String recurringOrderDraft) {
        ByProjectKeyRecurringOrdersPostString t = copy();
        t.recurringOrderDraft = recurringOrderDraft;
        return t;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ByProjectKeyRecurringOrdersPostString that = (ByProjectKeyRecurringOrdersPostString) o;

        return new EqualsBuilder().append(projectKey, that.projectKey)
                .append(recurringOrderDraft, that.recurringOrderDraft)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(projectKey).append(recurringOrderDraft).toHashCode();
    }

    @Override
    protected ByProjectKeyRecurringOrdersPostString copy() {
        return new ByProjectKeyRecurringOrdersPostString(this);
    }
}
