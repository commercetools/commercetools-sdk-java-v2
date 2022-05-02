
package com.commercetools.api.client;

import java.net.URI;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;

import io.vrap.rmf.base.client.*;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ByProjectKeyInStoreKeyByStoreKeyMeSignupPost extends
        BodyApiMethod<ByProjectKeyInStoreKeyByStoreKeyMeSignupPost, com.commercetools.api.models.customer.CustomerSignInResult, com.commercetools.api.models.me.MyCustomerDraft>
        implements com.commercetools.api.client.ErrorableTrait<ByProjectKeyInStoreKeyByStoreKeyMeSignupPost> {

    private String projectKey;
    private String storeKey;

    private com.commercetools.api.models.me.MyCustomerDraft myCustomerDraft;

    public ByProjectKeyInStoreKeyByStoreKeyMeSignupPost(final ApiHttpClient apiHttpClient, String projectKey,
            String storeKey, com.commercetools.api.models.me.MyCustomerDraft myCustomerDraft) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.storeKey = storeKey;
        this.myCustomerDraft = myCustomerDraft;
    }

    public ByProjectKeyInStoreKeyByStoreKeyMeSignupPost(ByProjectKeyInStoreKeyByStoreKeyMeSignupPost t) {
        super(t);
        this.projectKey = t.projectKey;
        this.storeKey = t.storeKey;
        this.myCustomerDraft = t.myCustomerDraft;
    }

    @Override
    protected ApiHttpRequest buildHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("/%s/in-store/key=%s/me/signup", this.projectKey, this.storeKey);
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }
        return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(),
            io.vrap.rmf.base.client.utils.json.JsonUtils
                    .executing(() -> apiHttpClient().getSerializerService().toJsonByteArray(myCustomerDraft)));

    }

    @Override
    public ApiHttpResponse<com.commercetools.api.models.customer.CustomerSignInResult> executeBlocking(
            final ApiHttpClient client, final Duration timeout) {
        return executeBlocking(client, timeout, com.commercetools.api.models.customer.CustomerSignInResult.class);
    }

    @Override
    public CompletableFuture<ApiHttpResponse<com.commercetools.api.models.customer.CustomerSignInResult>> execute(
            final ApiHttpClient client) {
        return execute(client, com.commercetools.api.models.customer.CustomerSignInResult.class);
    }

    public String getProjectKey() {
        return this.projectKey;
    }

    public String getStoreKey() {
        return this.storeKey;
    }

    public void setProjectKey(final String projectKey) {
        this.projectKey = projectKey;
    }

    public void setStoreKey(final String storeKey) {
        this.storeKey = storeKey;
    }

    public com.commercetools.api.models.me.MyCustomerDraft getBody() {
        return myCustomerDraft;
    }

    public ByProjectKeyInStoreKeyByStoreKeyMeSignupPost withBody(
            com.commercetools.api.models.me.MyCustomerDraft myCustomerDraft) {
        ByProjectKeyInStoreKeyByStoreKeyMeSignupPost t = copy();
        t.myCustomerDraft = myCustomerDraft;
        return t;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ByProjectKeyInStoreKeyByStoreKeyMeSignupPost that = (ByProjectKeyInStoreKeyByStoreKeyMeSignupPost) o;

        return new EqualsBuilder().append(projectKey, that.projectKey)
                .append(storeKey, that.storeKey)
                .append(myCustomerDraft, that.myCustomerDraft)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(projectKey).append(storeKey).append(myCustomerDraft).toHashCode();
    }

    @Override
    protected ByProjectKeyInStoreKeyByStoreKeyMeSignupPost copy() {
        return new ByProjectKeyInStoreKeyByStoreKeyMeSignupPost(this);
    }
}
