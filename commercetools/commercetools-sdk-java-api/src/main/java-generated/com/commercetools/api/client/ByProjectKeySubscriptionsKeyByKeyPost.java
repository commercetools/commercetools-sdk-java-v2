
package com.commercetools.api.client;

import java.net.URI;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;

import com.fasterxml.jackson.core.type.TypeReference;

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
 *            .post(null)
 *            .execute()
 * }</code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeySubscriptionsKeyByKeyPost extends
        TypeBodyApiMethod<ByProjectKeySubscriptionsKeyByKeyPost, com.commercetools.api.models.subscription.Subscription, com.commercetools.api.models.subscription.SubscriptionUpdate>
        implements com.commercetools.api.client.ConflictingTrait<ByProjectKeySubscriptionsKeyByKeyPost>,
        com.commercetools.api.client.Deprecatable200Trait<ByProjectKeySubscriptionsKeyByKeyPost>,
        com.commercetools.api.client.ErrorableTrait<ByProjectKeySubscriptionsKeyByKeyPost> {

    @Override
    public TypeReference<com.commercetools.api.models.subscription.Subscription> resultType() {
        return new TypeReference<com.commercetools.api.models.subscription.Subscription>() {
        };
    }

    private String projectKey;
    private String key;

    private com.commercetools.api.models.subscription.SubscriptionUpdate subscriptionUpdate;

    public ByProjectKeySubscriptionsKeyByKeyPost(final ApiHttpClient apiHttpClient, String projectKey, String key,
            com.commercetools.api.models.subscription.SubscriptionUpdate subscriptionUpdate) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.key = key;
        this.subscriptionUpdate = subscriptionUpdate;
    }

    public ByProjectKeySubscriptionsKeyByKeyPost(ByProjectKeySubscriptionsKeyByKeyPost t) {
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
            io.vrap.rmf.base.client.utils.json.JsonUtils
                    .executing(() -> apiHttpClient().getSerializerService().toJsonByteArray(subscriptionUpdate)));

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

    public void setProjectKey(final String projectKey) {
        this.projectKey = projectKey;
    }

    public void setKey(final String key) {
        this.key = key;
    }

    public com.commercetools.api.models.subscription.SubscriptionUpdate getBody() {
        return subscriptionUpdate;
    }

    public ByProjectKeySubscriptionsKeyByKeyPost withBody(
            com.commercetools.api.models.subscription.SubscriptionUpdate subscriptionUpdate) {
        ByProjectKeySubscriptionsKeyByKeyPost t = copy();
        t.subscriptionUpdate = subscriptionUpdate;
        return t;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ByProjectKeySubscriptionsKeyByKeyPost that = (ByProjectKeySubscriptionsKeyByKeyPost) o;

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
    protected ByProjectKeySubscriptionsKeyByKeyPost copy() {
        return new ByProjectKeySubscriptionsKeyByKeyPost(this);
    }
}
