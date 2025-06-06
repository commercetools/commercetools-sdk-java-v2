
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
 *  <p>Creates an OrderEdit in the Project. You can either create multiple Order Edits for an Order and apply them sequentially to an Order, or create multiple Order Edits parallelly (as alternatives to each other) and apply one of them to the Order.</p>
 *  <p>You can only create an Order Edit if the InventoryMode of the Order and its LineItems is <code>None</code>.</p>
 *
 * <hr>
 * <div class=code-example>
 * <pre><code class='java'>{@code
 *   CompletableFuture<ApiHttpResponse<com.commercetools.api.models.order_edit.OrderEdit>> result = apiRoot
 *            .withProjectKey("{projectKey}")
 *            .orders()
 *            .edits()
 *            .post("")
 *            .execute()
 * }</code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyOrdersEditsPostString extends
        StringBodyApiMethod<ByProjectKeyOrdersEditsPostString, com.commercetools.api.models.order_edit.OrderEdit>
        implements com.commercetools.api.client.ExpandableTrait<ByProjectKeyOrdersEditsPostString>,
        com.commercetools.api.client.Deprecatable201Trait<ByProjectKeyOrdersEditsPostString>,
        com.commercetools.api.client.ErrorableTrait<ByProjectKeyOrdersEditsPostString> {

    @Override
    public TypeReference<com.commercetools.api.models.order_edit.OrderEdit> resultType() {
        return new TypeReference<com.commercetools.api.models.order_edit.OrderEdit>() {
        };
    }

    private String projectKey;

    private String orderEditDraft;

    public ByProjectKeyOrdersEditsPostString(final ApiHttpClient apiHttpClient, String projectKey,
            String orderEditDraft) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.orderEditDraft = orderEditDraft;
    }

    public ByProjectKeyOrdersEditsPostString(ByProjectKeyOrdersEditsPostString t) {
        super(t);
        this.projectKey = t.projectKey;
        this.orderEditDraft = t.orderEditDraft;
    }

    @Override
    protected ApiHttpRequest buildHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("%s/orders/edits", this.projectKey);
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }
        return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(),
            orderEditDraft.getBytes(StandardCharsets.UTF_8));

    }

    @Override
    public ApiHttpResponse<com.commercetools.api.models.order_edit.OrderEdit> executeBlocking(
            final ApiHttpClient client, final Duration timeout) {
        return executeBlocking(client, timeout, com.commercetools.api.models.order_edit.OrderEdit.class);
    }

    @Override
    public CompletableFuture<ApiHttpResponse<com.commercetools.api.models.order_edit.OrderEdit>> execute(
            final ApiHttpClient client) {
        return execute(client, com.commercetools.api.models.order_edit.OrderEdit.class);
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
     * @return ByProjectKeyOrdersEditsPostString
     */
    public <TValue> ByProjectKeyOrdersEditsPostString withExpand(final TValue expand) {
        return copy().withQueryParam("expand", expand);
    }

    /**
     * add additional expand query parameter
     * @param <TValue> value type
     * @param expand value to be added
     * @return ByProjectKeyOrdersEditsPostString
     */
    public <TValue> ByProjectKeyOrdersEditsPostString addExpand(final TValue expand) {
        return copy().addQueryParam("expand", expand);
    }

    /**
     * set expand with the specified value
     * @param supplier supplier for the value to be set
     * @return ByProjectKeyOrdersEditsPostString
     */
    public ByProjectKeyOrdersEditsPostString withExpand(final Supplier<String> supplier) {
        return copy().withQueryParam("expand", supplier.get());
    }

    /**
     * add additional expand query parameter
     * @param supplier supplier for the value to be added
     * @return ByProjectKeyOrdersEditsPostString
     */
    public ByProjectKeyOrdersEditsPostString addExpand(final Supplier<String> supplier) {
        return copy().addQueryParam("expand", supplier.get());
    }

    /**
     * set expand with the specified value
     * @param op builder for the value to be set
     * @return ByProjectKeyOrdersEditsPostString
     */
    public ByProjectKeyOrdersEditsPostString withExpand(final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("expand", op.apply(new StringBuilder()));
    }

    /**
     * add additional expand query parameter
     * @param op builder for the value to be added
     * @return ByProjectKeyOrdersEditsPostString
     */
    public ByProjectKeyOrdersEditsPostString addExpand(final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("expand", op.apply(new StringBuilder()));
    }

    /**
     * set expand with the specified values
     * @param <TValue> value type
     * @param expand values to be set
     * @return ByProjectKeyOrdersEditsPostString
     */
    public <TValue> ByProjectKeyOrdersEditsPostString withExpand(final Collection<TValue> expand) {
        return copy().withoutQueryParam("expand")
                .addQueryParams(
                    expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional expand query parameters
     * @param <TValue> value type
     * @param expand values to be added
     * @return ByProjectKeyOrdersEditsPostString
     */
    public <TValue> ByProjectKeyOrdersEditsPostString addExpand(final Collection<TValue> expand) {
        return copy().addQueryParams(
            expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList()));
    }

    public String getBody() {
        return orderEditDraft;
    }

    public ByProjectKeyOrdersEditsPostString withBody(String orderEditDraft) {
        ByProjectKeyOrdersEditsPostString t = copy();
        t.orderEditDraft = orderEditDraft;
        return t;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ByProjectKeyOrdersEditsPostString that = (ByProjectKeyOrdersEditsPostString) o;

        return new EqualsBuilder().append(projectKey, that.projectKey)
                .append(orderEditDraft, that.orderEditDraft)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(projectKey).append(orderEditDraft).toHashCode();
    }

    @Override
    protected ByProjectKeyOrdersEditsPostString copy() {
        return new ByProjectKeyOrdersEditsPostString(this);
    }
}
