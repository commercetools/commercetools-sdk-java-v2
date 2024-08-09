
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
 *  <p>This is the last step in the password reset process of the authenticated Customer.</p>
 *  <p>Resetting a password produces the Customer CustomerPasswordUpdated Message with <code>reset=true</code>.</p>
 *  <p>A ResourceNotFound error is returned in the following scenarios:</p>
 *  <ul>
 *   <li>If no Customer exists with the <code>id</code> specified in the customer:{id} scope.</li>
 *   <li>If the Customer exists but is associated with a different Store than what is specified in the <code>manage_my_profile:{projectKey}:{storeKey}</code> scope.</li>
 *  </ul>
 *
 * <hr>
 * <div class=code-example>
 * <pre><code class='java'>{@code
 *   CompletableFuture<ApiHttpResponse<com.commercetools.api.models.customer.Customer>> result = apiRoot
 *            .withProjectKey("{projectKey}")
 *            .inStoreKeyWithStoreKeyValue("{storeKey}")
 *            .me()
 *            .password()
 *            .reset()
 *            .post("")
 *            .execute()
 * }</code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyInStoreKeyByStoreKeyMePasswordResetPostString extends
        StringBodyApiMethod<ByProjectKeyInStoreKeyByStoreKeyMePasswordResetPostString, com.commercetools.api.models.customer.Customer>
        implements
        com.commercetools.api.client.ErrorableTrait<ByProjectKeyInStoreKeyByStoreKeyMePasswordResetPostString> {

    @Override
    public TypeReference<com.commercetools.api.models.customer.Customer> resultType() {
        return new TypeReference<com.commercetools.api.models.customer.Customer>() {
        };
    }

    private String projectKey;
    private String storeKey;

    private String myCustomerResetPassword;

    public ByProjectKeyInStoreKeyByStoreKeyMePasswordResetPostString(final ApiHttpClient apiHttpClient,
            String projectKey, String storeKey, String myCustomerResetPassword) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.storeKey = storeKey;
        this.myCustomerResetPassword = myCustomerResetPassword;
    }

    public ByProjectKeyInStoreKeyByStoreKeyMePasswordResetPostString(
            ByProjectKeyInStoreKeyByStoreKeyMePasswordResetPostString t) {
        super(t);
        this.projectKey = t.projectKey;
        this.storeKey = t.storeKey;
        this.myCustomerResetPassword = t.myCustomerResetPassword;
    }

    @Override
    protected ApiHttpRequest buildHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("%s/in-store/key=%s/me/password/reset", this.projectKey, this.storeKey);
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }
        return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(),
            myCustomerResetPassword.getBytes(StandardCharsets.UTF_8));

    }

    @Override
    public ApiHttpResponse<com.commercetools.api.models.customer.Customer> executeBlocking(final ApiHttpClient client,
            final Duration timeout) {
        return executeBlocking(client, timeout, com.commercetools.api.models.customer.Customer.class);
    }

    @Override
    public CompletableFuture<ApiHttpResponse<com.commercetools.api.models.customer.Customer>> execute(
            final ApiHttpClient client) {
        return execute(client, com.commercetools.api.models.customer.Customer.class);
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
        return myCustomerResetPassword;
    }

    public ByProjectKeyInStoreKeyByStoreKeyMePasswordResetPostString withBody(String myCustomerResetPassword) {
        ByProjectKeyInStoreKeyByStoreKeyMePasswordResetPostString t = copy();
        t.myCustomerResetPassword = myCustomerResetPassword;
        return t;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ByProjectKeyInStoreKeyByStoreKeyMePasswordResetPostString that = (ByProjectKeyInStoreKeyByStoreKeyMePasswordResetPostString) o;

        return new EqualsBuilder().append(projectKey, that.projectKey)
                .append(storeKey, that.storeKey)
                .append(myCustomerResetPassword, that.myCustomerResetPassword)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(projectKey)
                .append(storeKey)
                .append(myCustomerResetPassword)
                .toHashCode();
    }

    @Override
    protected ByProjectKeyInStoreKeyByStoreKeyMePasswordResetPostString copy() {
        return new ByProjectKeyInStoreKeyByStoreKeyMePasswordResetPostString(this);
    }
}
