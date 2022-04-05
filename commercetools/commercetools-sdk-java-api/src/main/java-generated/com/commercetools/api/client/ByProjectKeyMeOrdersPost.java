
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
public class ByProjectKeyMeOrdersPost extends
        BodyApiMethod<ByProjectKeyMeOrdersPost, com.commercetools.api.models.order.Order, com.commercetools.api.models.me.MyOrderFromCartDraft>
        implements com.commercetools.api.client.ConflictingTrait<ByProjectKeyMeOrdersPost>,
        com.commercetools.api.client.ExpandableTrait<ByProjectKeyMeOrdersPost>,
        com.commercetools.api.client.Deprecatable201Trait<ByProjectKeyMeOrdersPost>,
        com.commercetools.api.client.ErrorableTrait<ByProjectKeyMeOrdersPost> {

    private String projectKey;

    private com.commercetools.api.models.me.MyOrderFromCartDraft myOrderFromCartDraft;

    public ByProjectKeyMeOrdersPost(final ApiHttpClient apiHttpClient, String projectKey,
            com.commercetools.api.models.me.MyOrderFromCartDraft myOrderFromCartDraft) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.myOrderFromCartDraft = myOrderFromCartDraft;
    }

    public ByProjectKeyMeOrdersPost(ByProjectKeyMeOrdersPost t) {
        super(t);
        this.projectKey = t.projectKey;
        this.myOrderFromCartDraft = t.myOrderFromCartDraft;
    }

    @Override
    protected ApiHttpRequest buildHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("/%s/me/orders", this.projectKey);
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }
        return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(),
            io.vrap.rmf.base.client.utils.json.JsonUtils
                    .executing(() -> apiHttpClient().getSerializerService().toJsonByteArray(myOrderFromCartDraft)));

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
     */
    public <TValue> ByProjectKeyMeOrdersPost withExpand(final TValue expand) {
        return copy().withQueryParam("expand", expand);
    }

    /**
     * add additional expand query parameter
     */
    public <TValue> ByProjectKeyMeOrdersPost addExpand(final TValue expand) {
        return copy().addQueryParam("expand", expand);
    }

    /**
     * set expand with the specified value
     */
    public ByProjectKeyMeOrdersPost withExpand(final Supplier<String> supplier) {
        return copy().withQueryParam("expand", supplier.get());
    }

    /**
     * add additional expand query parameter
     */
    public ByProjectKeyMeOrdersPost addExpand(final Supplier<String> supplier) {
        return copy().addQueryParam("expand", supplier.get());
    }

    /**
     * set expand with the specified value
     */
    public ByProjectKeyMeOrdersPost withExpand(final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("expand", op.apply(new StringBuilder()));
    }

    /**
     * add additional expand query parameter
     */
    public ByProjectKeyMeOrdersPost addExpand(final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("expand", op.apply(new StringBuilder()));
    }

    /**
     * set expand with the specified values
     */
    public <TValue> ByProjectKeyMeOrdersPost withExpand(final List<TValue> expand) {
        return copy().withoutQueryParam("expand")
                .addQueryParams(
                    expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional expand query parameters
     */
    public <TValue> ByProjectKeyMeOrdersPost addExpand(final List<TValue> expand) {
        return copy().addQueryParams(
            expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList()));
    }

    public com.commercetools.api.models.me.MyOrderFromCartDraft getBody() {
        return myOrderFromCartDraft;
    }

    public ByProjectKeyMeOrdersPost withBody(
            com.commercetools.api.models.me.MyOrderFromCartDraft myOrderFromCartDraft) {
        ByProjectKeyMeOrdersPost t = copy();
        t.myOrderFromCartDraft = myOrderFromCartDraft;
        return t;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ByProjectKeyMeOrdersPost that = (ByProjectKeyMeOrdersPost) o;

        return new EqualsBuilder().append(projectKey, that.projectKey)
                .append(myOrderFromCartDraft, that.myOrderFromCartDraft)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(projectKey).append(myOrderFromCartDraft).toHashCode();
    }

    @Override
    protected ByProjectKeyMeOrdersPost copy() {
        return new ByProjectKeyMeOrdersPost(this);
    }
}
