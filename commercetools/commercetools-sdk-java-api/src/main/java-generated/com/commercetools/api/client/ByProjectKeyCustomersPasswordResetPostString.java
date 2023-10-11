
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
 *  <p>Resetting the password of the Customer produces the CustomerPasswordUpdated Message with <code>reset=true</code>.</p>
 *
 * <hr>
 * <div class=code-example>
 * <pre><code class='java'>{@code
 *   CompletableFuture<ApiHttpResponse<com.commercetools.api.models.customer.Customer>> result = apiRoot
 *            .withProjectKey("{projectKey}")
 *            .customers()
 *            .passwordReset()
 *            .post("")
 *            .execute()
 * }</code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyCustomersPasswordResetPostString extends
        StringBodyApiMethod<ByProjectKeyCustomersPasswordResetPostString, com.commercetools.api.models.customer.Customer>
        implements com.commercetools.api.client.ErrorableTrait<ByProjectKeyCustomersPasswordResetPostString> {

    public TypeReference<com.commercetools.api.models.customer.Customer> resultType() {
        return new TypeReference<com.commercetools.api.models.customer.Customer>() {
        };
    }

    private String projectKey;

    private String customerResetPassword;

    public ByProjectKeyCustomersPasswordResetPostString(final ApiHttpClient apiHttpClient, String projectKey,
            String customerResetPassword) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.customerResetPassword = customerResetPassword;
    }

    public ByProjectKeyCustomersPasswordResetPostString(ByProjectKeyCustomersPasswordResetPostString t) {
        super(t);
        this.projectKey = t.projectKey;
        this.customerResetPassword = t.customerResetPassword;
    }

    @Override
    protected ApiHttpRequest buildHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("%s/customers/password/reset", this.projectKey);
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }
        return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(),
            customerResetPassword.getBytes(StandardCharsets.UTF_8));

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
        return customerResetPassword;
    }

    public ByProjectKeyCustomersPasswordResetPostString withBody(String customerResetPassword) {
        ByProjectKeyCustomersPasswordResetPostString t = copy();
        t.customerResetPassword = customerResetPassword;
        return t;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ByProjectKeyCustomersPasswordResetPostString that = (ByProjectKeyCustomersPasswordResetPostString) o;

        return new EqualsBuilder().append(projectKey, that.projectKey)
                .append(customerResetPassword, that.customerResetPassword)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(projectKey).append(customerResetPassword).toHashCode();
    }

    @Override
    protected ByProjectKeyCustomersPasswordResetPostString copy() {
        return new ByProjectKeyCustomersPasswordResetPostString(this);
    }
}
