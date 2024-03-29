
package com.commercetools.api.client;

import java.net.URI;
import java.nio.charset.StandardCharsets;
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
 *            .withId("{ID}")
 *            .post("")
 *            .execute()
 * }</code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeySubscriptionsByIDPostString extends
        StringBodyApiMethod<ByProjectKeySubscriptionsByIDPostString, com.commercetools.api.models.subscription.Subscription>
        implements com.commercetools.api.client.ConflictingTrait<ByProjectKeySubscriptionsByIDPostString>,
        com.commercetools.api.client.Deprecatable200Trait<ByProjectKeySubscriptionsByIDPostString>,
        com.commercetools.api.client.ErrorableTrait<ByProjectKeySubscriptionsByIDPostString> {

    @Override
    public TypeReference<com.commercetools.api.models.subscription.Subscription> resultType() {
        return new TypeReference<com.commercetools.api.models.subscription.Subscription>() {
        };
    }

    private String projectKey;
    private String ID;

    private String subscriptionUpdate;

    public ByProjectKeySubscriptionsByIDPostString(final ApiHttpClient apiHttpClient, String projectKey, String ID,
            String subscriptionUpdate) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.ID = ID;
        this.subscriptionUpdate = subscriptionUpdate;
    }

    public ByProjectKeySubscriptionsByIDPostString(ByProjectKeySubscriptionsByIDPostString t) {
        super(t);
        this.projectKey = t.projectKey;
        this.ID = t.ID;
        this.subscriptionUpdate = t.subscriptionUpdate;
    }

    @Override
    protected ApiHttpRequest buildHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("%s/subscriptions/%s", this.projectKey, this.ID);
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

    public String getID() {
        return this.ID;
    }

    public void setProjectKey(final String projectKey) {
        this.projectKey = projectKey;
    }

    public void setID(final String ID) {
        this.ID = ID;
    }

    public String getBody() {
        return subscriptionUpdate;
    }

    public ByProjectKeySubscriptionsByIDPostString withBody(String subscriptionUpdate) {
        ByProjectKeySubscriptionsByIDPostString t = copy();
        t.subscriptionUpdate = subscriptionUpdate;
        return t;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ByProjectKeySubscriptionsByIDPostString that = (ByProjectKeySubscriptionsByIDPostString) o;

        return new EqualsBuilder().append(projectKey, that.projectKey)
                .append(ID, that.ID)
                .append(subscriptionUpdate, that.subscriptionUpdate)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(projectKey).append(ID).append(subscriptionUpdate).toHashCode();
    }

    @Override
    protected ByProjectKeySubscriptionsByIDPostString copy() {
        return new ByProjectKeySubscriptionsByIDPostString(this);
    }
}
