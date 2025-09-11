
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
 *  <p>If used with an optional <a href="https://docs.commercetools.com/apis/ctp:api:type:AnonymousSession" rel="nofollow">access token for an anonymous session</a>, all Orders and Carts that belong to the <code>anonymousId</code> are assigned to the newly created Customer.</p>
 *  <p>Creating a Customer produces the <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomerCreatedMessage" rel="nofollow">CustomerCreated</a> Message.</p>
 *
 * <hr>
 * <div class=code-example>
 * <pre><code class='java'>{@code
 *   CompletableFuture<ApiHttpResponse<com.commercetools.api.models.customer.CustomerSignInResult>> result = apiRoot
 *            .withProjectKey("{projectKey}")
 *            .me()
 *            .signup()
 *            .post(null)
 *            .execute()
 * }</code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyMeSignupPost extends
        TypeBodyApiMethod<ByProjectKeyMeSignupPost, com.commercetools.api.models.customer.CustomerSignInResult, com.commercetools.api.models.me.MyCustomerDraft>
        implements com.commercetools.api.client.ErrorableTrait<ByProjectKeyMeSignupPost> {

    @Override
    public TypeReference<com.commercetools.api.models.customer.CustomerSignInResult> resultType() {
        return new TypeReference<com.commercetools.api.models.customer.CustomerSignInResult>() {
        };
    }

    private String projectKey;

    private com.commercetools.api.models.me.MyCustomerDraft myCustomerDraft;

    public ByProjectKeyMeSignupPost(final ApiHttpClient apiHttpClient, String projectKey,
            com.commercetools.api.models.me.MyCustomerDraft myCustomerDraft) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.myCustomerDraft = myCustomerDraft;
    }

    public ByProjectKeyMeSignupPost(ByProjectKeyMeSignupPost t) {
        super(t);
        this.projectKey = t.projectKey;
        this.myCustomerDraft = t.myCustomerDraft;
    }

    @Override
    protected ApiHttpRequest buildHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("%s/me/signup", encodePathParam(this.projectKey));
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

    public void setProjectKey(final String projectKey) {
        this.projectKey = projectKey;
    }

    public com.commercetools.api.models.me.MyCustomerDraft getBody() {
        return myCustomerDraft;
    }

    public ByProjectKeyMeSignupPost withBody(com.commercetools.api.models.me.MyCustomerDraft myCustomerDraft) {
        ByProjectKeyMeSignupPost t = copy();
        t.myCustomerDraft = myCustomerDraft;
        return t;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ByProjectKeyMeSignupPost that = (ByProjectKeyMeSignupPost) o;

        return new EqualsBuilder().append(projectKey, that.projectKey)
                .append(myCustomerDraft, that.myCustomerDraft)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(projectKey).append(myCustomerDraft).toHashCode();
    }

    @Override
    protected ByProjectKeyMeSignupPost copy() {
        return new ByProjectKeyMeSignupPost(this);
    }
}
