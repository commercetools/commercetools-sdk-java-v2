
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
 *  <p>If omitted in the request body, the Customer <code>stores</code> field is set to the Store specified in the path parameter.</p>
 *  <p>Creating a Customer produces the CustomerCreated Message.</p>
 *
 * <hr>
 * <div class=code-example>
 * <pre><code class='java'>{@code
 *   CompletableFuture<ApiHttpResponse<com.commercetools.api.models.customer.CustomerSignInResult>> result = apiRoot
 *            .withProjectKey("{projectKey}")
 *            .inStoreKeyWithStoreKeyValue("{storeKey}")
 *            .me()
 *            .signup()
 *            .post("")
 *            .execute()
 * }</code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyInStoreKeyByStoreKeyMeSignupPostString extends
        StringBodyApiMethod<ByProjectKeyInStoreKeyByStoreKeyMeSignupPostString, com.commercetools.api.models.customer.CustomerSignInResult>
        implements com.commercetools.api.client.ErrorableTrait<ByProjectKeyInStoreKeyByStoreKeyMeSignupPostString> {

    public TypeReference<com.commercetools.api.models.customer.CustomerSignInResult> resultType() {
        return new TypeReference<com.commercetools.api.models.customer.CustomerSignInResult>() {
        };
    }

    private String projectKey;
    private String storeKey;

    private String myCustomerDraft;

    public ByProjectKeyInStoreKeyByStoreKeyMeSignupPostString(final ApiHttpClient apiHttpClient, String projectKey,
            String storeKey, String myCustomerDraft) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.storeKey = storeKey;
        this.myCustomerDraft = myCustomerDraft;
    }

    public ByProjectKeyInStoreKeyByStoreKeyMeSignupPostString(ByProjectKeyInStoreKeyByStoreKeyMeSignupPostString t) {
        super(t);
        this.projectKey = t.projectKey;
        this.storeKey = t.storeKey;
        this.myCustomerDraft = t.myCustomerDraft;
    }

    @Override
    protected ApiHttpRequest buildHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("%s/in-store/key=%s/me/signup", this.projectKey, this.storeKey);
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }
        return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(),
            myCustomerDraft.getBytes(StandardCharsets.UTF_8));

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

    public String getBody() {
        return myCustomerDraft;
    }

    public ByProjectKeyInStoreKeyByStoreKeyMeSignupPostString withBody(String myCustomerDraft) {
        ByProjectKeyInStoreKeyByStoreKeyMeSignupPostString t = copy();
        t.myCustomerDraft = myCustomerDraft;
        return t;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ByProjectKeyInStoreKeyByStoreKeyMeSignupPostString that = (ByProjectKeyInStoreKeyByStoreKeyMeSignupPostString) o;

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
    protected ByProjectKeyInStoreKeyByStoreKeyMeSignupPostString copy() {
        return new ByProjectKeyInStoreKeyByStoreKeyMeSignupPostString(this);
    }
}
