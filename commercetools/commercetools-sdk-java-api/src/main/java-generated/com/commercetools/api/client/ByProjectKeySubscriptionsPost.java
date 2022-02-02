
package com.commercetools.api.client;

import java.net.URI;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;

import io.vrap.rmf.base.client.*;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
*  <p>The creation of a Subscription is eventually consistent, it may take up to a minute before it becomes fully active.
*  In order to test that the destination is correctly configured, a test message will be put into the queue.
*  If the message could not be delivered, the subscription will not be created.
*  The payload of the test message is a notification of type ResourceCreated for the resourceTypeId subscription.
*  Currently, a maximum of 25 subscriptions can be created per project.</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
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
    public ApiHttpRequest createHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("/%s/subscriptions", this.projectKey);
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
     * set expand with the specificied value
     */
    public ByProjectKeySubscriptionsPost withExpand(final String expand) {
        return copy().withQueryParam("expand", expand);
    }

    /**
     * add additional expand query parameter
     */
    public ByProjectKeySubscriptionsPost addExpand(final String expand) {
        return copy().addQueryParam("expand", expand);
    }

    /**
     * set expand with the specificied values
     */
    public ByProjectKeySubscriptionsPost withExpand(final List<String> expand) {
        return copy().withoutQueryParam("expand")
                .addQueryParams(
                    expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional expand query parameters
     */
    public ByProjectKeySubscriptionsPost addExpand(final List<String> expand) {
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
