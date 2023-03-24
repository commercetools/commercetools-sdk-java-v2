
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
 *  <p>A test message is sent to ensure the correct configuration of the Destination. If the message cannot be delivered, the Subscription will not be created. The payload of the test message is a notification of type ResourceCreated for the <code>resourceTypeId</code> <code>subscription</code>.</p>
 *
 * <hr>
 * <div class=code-example>
 * <pre><code class='java'>{@code
 *   CompletableFuture<ApiHttpResponse<com.commercetools.api.models.subscription.Subscription>> result = apiRoot
 *            .withProjectKey("{projectKey}")
 *            .subscriptions()
 *            .post(null)
 *            .execute()
 * }</code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeySubscriptionsPost extends
        BodyApiMethod<ByProjectKeySubscriptionsPost, com.commercetools.api.models.subscription.Subscription, com.commercetools.api.models.subscription.SubscriptionDraft>
        implements com.commercetools.api.client.ExpandableTrait<ByProjectKeySubscriptionsPost>,
        com.commercetools.api.client.Deprecatable201Trait<ByProjectKeySubscriptionsPost>,
        com.commercetools.api.client.ErrorableTrait<ByProjectKeySubscriptionsPost> {

    private String projectKey;

    private com.commercetools.api.models.subscription.SubscriptionDraft subscriptionDraft;

    public ByProjectKeySubscriptionsPost(final ApiHttpClient apiHttpClient, String projectKey,
            com.commercetools.api.models.subscription.SubscriptionDraft subscriptionDraft) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.subscriptionDraft = subscriptionDraft;
    }

    public ByProjectKeySubscriptionsPost(ByProjectKeySubscriptionsPost t) {
        super(t);
        this.projectKey = t.projectKey;
        this.subscriptionDraft = t.subscriptionDraft;
    }

    @Override
    protected ApiHttpRequest buildHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("%s/subscriptions", this.projectKey);
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }
        return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(),
            io.vrap.rmf.base.client.utils.json.JsonUtils
                    .executing(() -> apiHttpClient().getSerializerService().toJsonByteArray(subscriptionDraft)));

    }

    @Override
    public ApiHttpResponse<com.commercetools.api.models.subscription.Subscription> executeBlocking(
            final ApiHttpClient client, final Duration timeout) {
        return executeBlocking(client, timeout, com.commercetools.api.models.subscription.Subscription.class);
    }

    @Override
    public CompletableFuture<ApiHttpResponse<com.commercetools.api.models.subscription.Subscription>> execute(
            final ApiHttpClient client) {
        return execute(client, com.commercetools.api.models.subscription.Subscription.class);
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
     * @return ByProjectKeySubscriptionsPost
     */
    public <TValue> ByProjectKeySubscriptionsPost withExpand(final TValue expand) {
        return copy().withQueryParam("expand", expand);
    }

    /**
     * add additional expand query parameter
     * @param expand value to be added
     * @param <TValue> value type
     * @return ByProjectKeySubscriptionsPost
     */
    public <TValue> ByProjectKeySubscriptionsPost addExpand(final TValue expand) {
        return copy().addQueryParam("expand", expand);
    }

    /**
     * set expand with the specified value
     * @param supplier supplier for the value to be set
     * @return ByProjectKeySubscriptionsPost
     */
    public ByProjectKeySubscriptionsPost withExpand(final Supplier<String> supplier) {
        return copy().withQueryParam("expand", supplier.get());
    }

    /**
     * add additional expand query parameter
     * @param supplier supplier for the value to be added
     * @return ByProjectKeySubscriptionsPost
     */
    public ByProjectKeySubscriptionsPost addExpand(final Supplier<String> supplier) {
        return copy().addQueryParam("expand", supplier.get());
    }

    /**
     * set expand with the specified value
     * @param op builder for the value to be set
     * @return ByProjectKeySubscriptionsPost
     */
    public ByProjectKeySubscriptionsPost withExpand(final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("expand", op.apply(new StringBuilder()));
    }

    /**
     * add additional expand query parameter
     * @param op builder for the value to be added
     * @return ByProjectKeySubscriptionsPost
     */
    public ByProjectKeySubscriptionsPost addExpand(final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("expand", op.apply(new StringBuilder()));
    }

    /**
     * set expand with the specified values
     * @param expand values to be set
     * @param <TValue> value type
     * @return ByProjectKeySubscriptionsPost
     */
    public <TValue> ByProjectKeySubscriptionsPost withExpand(final Collection<TValue> expand) {
        return copy().withoutQueryParam("expand")
                .addQueryParams(
                    expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional expand query parameters
     * @param expand values to be added
     * @param <TValue> value type
     * @return ByProjectKeySubscriptionsPost
     */
    public <TValue> ByProjectKeySubscriptionsPost addExpand(final Collection<TValue> expand) {
        return copy().addQueryParams(
            expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList()));
    }

    public com.commercetools.api.models.subscription.SubscriptionDraft getBody() {
        return subscriptionDraft;
    }

    public ByProjectKeySubscriptionsPost withBody(
            com.commercetools.api.models.subscription.SubscriptionDraft subscriptionDraft) {
        ByProjectKeySubscriptionsPost t = copy();
        t.subscriptionDraft = subscriptionDraft;
        return t;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ByProjectKeySubscriptionsPost that = (ByProjectKeySubscriptionsPost) o;

        return new EqualsBuilder().append(projectKey, that.projectKey)
                .append(subscriptionDraft, that.subscriptionDraft)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(projectKey).append(subscriptionDraft).toHashCode();
    }

    @Override
    protected ByProjectKeySubscriptionsPost copy() {
        return new ByProjectKeySubscriptionsPost(this);
    }
}
