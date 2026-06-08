
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
 *  <p>Changing the password produces the <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomerPasswordUpdatedMessage" rel="nofollow">CustomerPasswordUpdated</a> Message with <code>reset=false</code>.</p>
 *
 * <hr>
 * <div class=code-example>
 * <pre><code class='java'>{@code
 *   CompletableFuture<ApiHttpResponse<com.commercetools.api.models.customer.Customer>> result = apiRoot
 *            .withProjectKey("{projectKey}")
 *            .customers()
 *            .password()
 *            .post("")
 *            .execute()
 * }</code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyCustomersPasswordPostString extends
        StringBodyApiMethod<ByProjectKeyCustomersPasswordPostString, com.commercetools.api.models.customer.Customer>
        implements com.commercetools.api.client.ErrorableTrait<ByProjectKeyCustomersPasswordPostString> {

    @Override
    public TypeReference<com.commercetools.api.models.customer.Customer> resultType() {
        return new TypeReference<com.commercetools.api.models.customer.Customer>() {
        };
    }

    private String projectKey;

    private String customerChangePassword;

    public ByProjectKeyCustomersPasswordPostString(final ApiHttpClient apiHttpClient, String projectKey,
            String customerChangePassword) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.customerChangePassword = customerChangePassword;
    }

    public ByProjectKeyCustomersPasswordPostString(ByProjectKeyCustomersPasswordPostString t) {
        super(t);
        this.projectKey = t.projectKey;
        this.customerChangePassword = t.customerChangePassword;
    }

    @Override
    protected ApiHttpRequest buildHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("%s/customers/password", this.projectKey);
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }
        return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(),
            customerChangePassword.getBytes(StandardCharsets.UTF_8));

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
        return customerChangePassword;
    }

    public ByProjectKeyCustomersPasswordPostString withBody(String customerChangePassword) {
        ByProjectKeyCustomersPasswordPostString t = copy();
        t.customerChangePassword = customerChangePassword;
        return t;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ByProjectKeyCustomersPasswordPostString that = (ByProjectKeyCustomersPasswordPostString) o;

        return new EqualsBuilder().append(projectKey, that.projectKey)
                .append(customerChangePassword, that.customerChangePassword)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(projectKey).append(customerChangePassword).toHashCode();
    }

    @Override
    protected ByProjectKeyCustomersPasswordPostString copy() {
        return new ByProjectKeyCustomersPasswordPostString(this);
    }
}
