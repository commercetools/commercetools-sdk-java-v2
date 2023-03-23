
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
 *  <p>Changing the password of the Customer produces the CustomerPasswordUpdated Message with <code>reset=false</code>.</p>
 *  <p>If the current password does not match, an InvalidCurrentPassword error is returned.</p>
 *
 * <hr>
 * <div class=code-example>
 * <pre><code class='java'>{@code
 *   CompletableFuture<ApiHttpResponse<com.commercetools.api.models.customer.Customer>> result = apiRoot
 *            .withProjectKey("{projectKey}")
 *            .me()
 *            .password()
 *            .post("")
 *            .execute()
 * }</code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyMePasswordPostString
        extends StringBodyApiMethod<ByProjectKeyMePasswordPostString, com.commercetools.api.models.customer.Customer>
        implements com.commercetools.api.client.ConflictingTrait<ByProjectKeyMePasswordPostString>,
        com.commercetools.api.client.ErrorableTrait<ByProjectKeyMePasswordPostString> {

    private String projectKey;

    private String myCustomerChangePassword;

    public ByProjectKeyMePasswordPostString(final ApiHttpClient apiHttpClient, String projectKey,
            String myCustomerChangePassword) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.myCustomerChangePassword = myCustomerChangePassword;
    }

    public ByProjectKeyMePasswordPostString(ByProjectKeyMePasswordPostString t) {
        super(t);
        this.projectKey = t.projectKey;
        this.myCustomerChangePassword = t.myCustomerChangePassword;
    }

    @Override
    protected ApiHttpRequest buildHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("%s/me/password", this.projectKey);
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }
        return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(),
            myCustomerChangePassword.getBytes(StandardCharsets.UTF_8));

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
        return myCustomerChangePassword;
    }

    public ByProjectKeyMePasswordPostString withBody(String myCustomerChangePassword) {
        ByProjectKeyMePasswordPostString t = copy();
        t.myCustomerChangePassword = myCustomerChangePassword;
        return t;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ByProjectKeyMePasswordPostString that = (ByProjectKeyMePasswordPostString) o;

        return new EqualsBuilder().append(projectKey, that.projectKey)
                .append(myCustomerChangePassword, that.myCustomerChangePassword)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(projectKey).append(myCustomerChangePassword).toHashCode();
    }

    @Override
    protected ByProjectKeyMePasswordPostString copy() {
        return new ByProjectKeyMePasswordPostString(this);
    }
}
