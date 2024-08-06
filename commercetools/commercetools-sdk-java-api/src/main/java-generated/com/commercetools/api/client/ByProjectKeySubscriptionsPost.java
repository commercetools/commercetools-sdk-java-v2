
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
 *  <p>A test notification is sent to ensure the correct configuration of the Destination. If the notification cannot be delivered, the Subscription will not be created. The payload of the test notification is of type ResourceCreated for the <code>resourceTypeId</code> <code>subscription</code>.</p>
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
        TypeBodyApiMethod<ByProjectKeySubscriptionsPost, com.commercetools.api.models.subscription.Subscription, com.commercetools.api.models.subscription.SubscriptionDraft>
        implements com.commercetools.api.client.Deprecatable201Trait<ByProjectKeySubscriptionsPost>,
        com.commercetools.api.client.ErrorableTrait<ByProjectKeySubscriptionsPost> {

    @Override
    public TypeReference<com.commercetools.api.models.subscription.Subscription> resultType() {
        return new TypeReference<com.commercetools.api.models.subscription.Subscription>() {
        };
    }

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
        String httpRequestPath = String.format("%s/subscriptions", encodePathParam(this.projectKey));
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

    public void setProjectKey(final String projectKey) {
        this.projectKey = projectKey;
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
