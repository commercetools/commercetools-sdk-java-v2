
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
*  <p>Delete Subscription by key</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ByProjectKeySubscriptionsKeyByKeyDelete extends
        ApiMethod<ByProjectKeySubscriptionsKeyByKeyDelete, com.commercetools.api.models.subscription.Subscription>
        implements com.commercetools.api.client.VersionedTrait<ByProjectKeySubscriptionsKeyByKeyDelete>,
        com.commercetools.api.client.ConflictingTrait<ByProjectKeySubscriptionsKeyByKeyDelete>,
        com.commercetools.api.client.ExpandableTrait<ByProjectKeySubscriptionsKeyByKeyDelete>,
        com.commercetools.api.client.ErrorableTrait<ByProjectKeySubscriptionsKeyByKeyDelete>,
        com.commercetools.api.client.DeprecatableTrait<ByProjectKeySubscriptionsKeyByKeyDelete> {

    private String projectKey;
    private String key;

    public ByProjectKeySubscriptionsKeyByKeyDelete(final ApiHttpClient apiHttpClient, String projectKey, String key) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.key = key;
    }

    public ByProjectKeySubscriptionsKeyByKeyDelete(ByProjectKeySubscriptionsKeyByKeyDelete t) {
        super(t);
        this.projectKey = t.projectKey;
        this.key = t.key;
    }

    @Override
    public ApiHttpRequest createHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("/%s/subscriptions/key=%s", this.projectKey, this.key);
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }

        return new ApiHttpRequest(ApiHttpMethod.DELETE, URI.create(httpRequestPath), getHeaders(), null);
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

    public String getKey() {
        return this.key;
    }

    public List<String> getVersion() {
        return this.getQueryParam("version");
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

    public ByProjectKeySubscriptionsKeyByKeyDelete withVersion(final Long version) {
        return copy().withQueryParam("version", version);
    }

    public ByProjectKeySubscriptionsKeyByKeyDelete addVersion(final Long version) {
        return copy().addQueryParam("version", version);
    }

    public ByProjectKeySubscriptionsKeyByKeyDelete withExpand(final String expand) {
        return copy().withQueryParam("expand", expand);
    }

    public ByProjectKeySubscriptionsKeyByKeyDelete addExpand(final String expand) {
        return copy().addQueryParam("expand", expand);
    }

    @Override
    protected ByProjectKeySubscriptionsKeyByKeyDelete copy() {
        return new ByProjectKeySubscriptionsKeyByKeyDelete(this);
    }
}
