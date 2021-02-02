
package com.commercetools.api.client;

import static io.vrap.rmf.base.client.utils.ClientUtils.blockingWait;

import java.net.URI;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;

import io.vrap.rmf.base.client.*;
import io.vrap.rmf.base.client.utils.Generated;

/**
*  <p>The creation of a Subscription is eventually consistent, it may take up to a minute before it becomes fully active.
*  In order to test that the destination is correctly configured, a test message will be put into the queue.
*  If the message could not be delivered, the subscription will not be created.
*  The payload of the test message is a notification of type ResourceCreated for the resourceTypeId subscription.
*  Currently, a maximum of 25 subscriptions can be created per project.</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ByProjectKeySubscriptionsPost
        extends ApiMethod<ByProjectKeySubscriptionsPost, com.commercetools.api.models.subscription.Subscription>
        implements com.commercetools.api.client.ExpandableTrait<ByProjectKeySubscriptionsPost>,
        com.commercetools.api.client.ErrorableTrait<ByProjectKeySubscriptionsPost>,
        com.commercetools.api.client.DeprecatableTrait<ByProjectKeySubscriptionsPost> {

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
        try {
            final byte[] body = apiHttpClient().getSerializerService().toJsonByteArray(subscriptionDraft);
            return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(), body);
        }
        catch (Exception e) {
            e.printStackTrace();
        }

        return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(), null);
    }

    @Override
    public ApiHttpResponse<com.commercetools.api.models.subscription.Subscription> executeBlocking(Duration timeout) {
        return blockingWait(execute(), timeout);
    }

    @Override
    public CompletableFuture<ApiHttpResponse<com.commercetools.api.models.subscription.Subscription>> execute() {
        return apiHttpClient().execute(this.createHttpRequest(),
            com.commercetools.api.models.subscription.Subscription.class);
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

    public ByProjectKeySubscriptionsPost withExpand(final String expand) {
        return copy().withQueryParam("expand", expand);
    }

    public ByProjectKeySubscriptionsPost addExpand(final String expand) {
        return copy().addQueryParam("expand", expand);
    }

    @Override
    protected ByProjectKeySubscriptionsPost copy() {
        return new ByProjectKeySubscriptionsPost(this);
    }
}
