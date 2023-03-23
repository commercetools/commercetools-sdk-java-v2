
package com.commercetools.api.client;

import java.net.URI;
import java.nio.charset.StandardCharsets;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;

import io.vrap.rmf.base.client.*;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 *  <p>This is the last step in the password reset process of a Customer.</p>
 *  <p>Resetting a password of the Customer produces the CustomerPasswordUpdated Message with <code>reset=true</code>.</p>
 *
 * <hr>
 * <div class=code-example>
 * <pre><code class='java'>{@code
 *   CompletableFuture<ApiHttpResponse<com.commercetools.api.models.customer.Customer>> result = apiRoot
 *            .withProjectKey("{projectKey}")
 *            .me()
 *            .password()
 *            .reset()
 *            .post("")
 *            .execute()
 * }</code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyMePasswordResetPostString extends
        StringBodyApiMethod<ByProjectKeyMePasswordResetPostString, com.commercetools.api.models.customer.Customer>
        implements com.commercetools.api.client.ErrorableTrait<ByProjectKeyMePasswordResetPostString> {

    private String projectKey;

    private String myCustomerResetPassword;

    public ByProjectKeyMePasswordResetPostString(final ApiHttpClient apiHttpClient, String projectKey,
            String myCustomerResetPassword) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.myCustomerResetPassword = myCustomerResetPassword;
    }

    public ByProjectKeyMePasswordResetPostString(ByProjectKeyMePasswordResetPostString t) {
        super(t);
        this.projectKey = t.projectKey;
        this.myCustomerResetPassword = t.myCustomerResetPassword;
    }

    @Override
    protected ApiHttpRequest buildHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("%s/me/password/reset", this.projectKey);
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

    public void setProjectKey(final String projectKey) {
        this.projectKey = projectKey;
    }

    public String getBody() {
        return myCustomerResetPassword;
    }

    public ByProjectKeyMePasswordResetPostString withBody(String myCustomerResetPassword) {
        ByProjectKeyMePasswordResetPostString t = copy();
        t.myCustomerResetPassword = myCustomerResetPassword;
        return t;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ByProjectKeyMePasswordResetPostString that = (ByProjectKeyMePasswordResetPostString) o;

        return new EqualsBuilder().append(projectKey, that.projectKey)
                .append(myCustomerResetPassword, that.myCustomerResetPassword)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(projectKey).append(myCustomerResetPassword).toHashCode();
    }

    @Override
    protected ByProjectKeyMePasswordResetPostString copy() {
        return new ByProjectKeyMePasswordResetPostString(this);
    }
}
