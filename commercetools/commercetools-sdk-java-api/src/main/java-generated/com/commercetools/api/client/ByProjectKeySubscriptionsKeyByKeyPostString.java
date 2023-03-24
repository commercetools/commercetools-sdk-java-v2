
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

import io.vrap.rmf.base.client.*;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 *
 *
 * <hr>
 * <div class=code-example>
 * <pre><code class='java'>{@code
 *   CompletableFuture<ApiHttpResponse<com.commercetools.api.models.subscription.Subscription>> result = apiRoot
 *            .withProjectKey("{projectKey}")
 *            .subscriptions()
 *            .withKey("{key}")
 *            .post("")
 *            .execute()
 * }</code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeySubscriptionsKeyByKeyPostString extends
        StringBodyApiMethod<ByProjectKeySubscriptionsKeyByKeyPostString, com.commercetools.api.models.subscription.Subscription>
        implements com.commercetools.api.client.ConflictingTrait<ByProjectKeySubscriptionsKeyByKeyPostString>,
        com.commercetools.api.client.ExpandableTrait<ByProjectKeySubscriptionsKeyByKeyPostString>,
        com.commercetools.api.client.Deprecatable200Trait<ByProjectKeySubscriptionsKeyByKeyPostString>,
        com.commercetools.api.client.ErrorableTrait<ByProjectKeySubscriptionsKeyByKeyPostString> {

    private String projectKey;
    private String key;

    private String subscriptionUpdate;

    public ByProjectKeySubscriptionsKeyByKeyPostString(final ApiHttpClient apiHttpClient, String projectKey, String key,
            String subscriptionUpdate) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.key = key;
        this.subscriptionUpdate = subscriptionUpdate;
    }

    public ByProjectKeySubscriptionsKeyByKeyPostString(ByProjectKeySubscriptionsKeyByKeyPostString t) {
        super(t);
        this.projectKey = t.projectKey;
        this.key = t.key;
        this.subscriptionUpdate = t.subscriptionUpdate;
    }

    @Override
    protected ApiHttpRequest buildHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("%s/subscriptions/key=%s", this.projectKey, this.key);
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }
        return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(),
            subscriptionUpdate.getBytes(StandardCharsets.UTF_8));

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

    public String getKey() {
        return this.key;
    }

    public List<String> getExpand() {
        return this.getQueryParam("expand");
    }

    public void setProjectKey(final String projectKey) {
        this.projectKey = projectKey;
    }

    public void setKey(final String key) {
        this.key = key;
    }

    /**
     * set expand with the specified value
     * @param <TValue> value type
     * @param expand value to be set
     * @return ByProjectKeySubscriptionsKeyByKeyPostString
     */
    public <TValue> ByProjectKeySubscriptionsKeyByKeyPostString withExpand(final TValue expand) {
        return copy().withQueryParam("expand", expand);
    }

    /**
     * add additional expand query parameter
     * @param <TValue> value type
     * @param expand value to be added
     * @return ByProjectKeySubscriptionsKeyByKeyPostString
     */
    public <TValue> ByProjectKeySubscriptionsKeyByKeyPostString addExpand(final TValue expand) {
        return copy().addQueryParam("expand", expand);
    }

    /**
     * set expand with the specified value
     * @param supplier supplier for the value to be set
     * @return ByProjectKeySubscriptionsKeyByKeyPostString
     */
    public ByProjectKeySubscriptionsKeyByKeyPostString withExpand(final Supplier<String> supplier) {
        return copy().withQueryParam("expand", supplier.get());
    }

    /**
     * add additional expand query parameter
     * @param supplier supplier for the value to be added
     * @return ByProjectKeySubscriptionsKeyByKeyPostString
     */
    public ByProjectKeySubscriptionsKeyByKeyPostString addExpand(final Supplier<String> supplier) {
        return copy().addQueryParam("expand", supplier.get());
    }

    /**
     * set expand with the specified value
     * @param op builder for the value to be set
     * @return ByProjectKeySubscriptionsKeyByKeyPostString
     */
    public ByProjectKeySubscriptionsKeyByKeyPostString withExpand(final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("expand", op.apply(new StringBuilder()));
    }

    /**
     * add additional expand query parameter
     * @param op builder for the value to be added
     * @return ByProjectKeySubscriptionsKeyByKeyPostString
     */
    public ByProjectKeySubscriptionsKeyByKeyPostString addExpand(final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("expand", op.apply(new StringBuilder()));
    }

    /**
     * set expand with the specified values
     * @param <TValue> value type
     * @param expand values to be set
     * @return ByProjectKeySubscriptionsKeyByKeyPostString
     */
    public <TValue> ByProjectKeySubscriptionsKeyByKeyPostString withExpand(final Collection<TValue> expand) {
        return copy().withoutQueryParam("expand")
                .addQueryParams(
                    expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional expand query parameters
     * @param <TValue> value type
     * @param expand values to be added
     * @return ByProjectKeySubscriptionsKeyByKeyPostString
     */
    public <TValue> ByProjectKeySubscriptionsKeyByKeyPostString addExpand(final Collection<TValue> expand) {
        return copy().addQueryParams(
            expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList()));
    }

    public String getBody() {
        return subscriptionUpdate;
    }

    public ByProjectKeySubscriptionsKeyByKeyPostString withBody(String subscriptionUpdate) {
        ByProjectKeySubscriptionsKeyByKeyPostString t = copy();
        t.subscriptionUpdate = subscriptionUpdate;
        return t;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ByProjectKeySubscriptionsKeyByKeyPostString that = (ByProjectKeySubscriptionsKeyByKeyPostString) o;

        return new EqualsBuilder().append(projectKey, that.projectKey)
                .append(key, that.key)
                .append(subscriptionUpdate, that.subscriptionUpdate)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(projectKey).append(key).append(subscriptionUpdate).toHashCode();
    }

    @Override
    protected ByProjectKeySubscriptionsKeyByKeyPostString copy() {
        return new ByProjectKeySubscriptionsKeyByKeyPostString(this);
    }
}
