
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
 *  <p>Verifying the email of the Customer produces the CustomerEmailVerified Message.</p>
 *
 * <hr>
 * <div class=code-example>
 * <pre><code class='java'>{@code
 *   CompletableFuture<ApiHttpResponse<com.commercetools.api.models.customer.Customer>> result = apiRoot
 *            .withProjectKey("{projectKey}")
 *            .customers()
 *            .emailConfirm()
 *            .post("")
 *            .execute()
 * }</code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyCustomersEmailConfirmPostString extends
        StringBodyApiMethod<ByProjectKeyCustomersEmailConfirmPostString, com.commercetools.api.models.customer.Customer>
        implements com.commercetools.api.client.ErrorableTrait<ByProjectKeyCustomersEmailConfirmPostString> {

    public TypeReference<com.commercetools.api.models.customer.Customer> resultType() {
        return new TypeReference<com.commercetools.api.models.customer.Customer>() {
        };
    }

    private String projectKey;

    private String customerEmailVerify;

    public ByProjectKeyCustomersEmailConfirmPostString(final ApiHttpClient apiHttpClient, String projectKey,
            String customerEmailVerify) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.customerEmailVerify = customerEmailVerify;
    }

    public ByProjectKeyCustomersEmailConfirmPostString(ByProjectKeyCustomersEmailConfirmPostString t) {
        super(t);
        this.projectKey = t.projectKey;
        this.customerEmailVerify = t.customerEmailVerify;
    }

    @Override
    protected ApiHttpRequest buildHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("%s/customers/email/confirm", this.projectKey);
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }
        return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(),
            customerEmailVerify.getBytes(StandardCharsets.UTF_8));

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
        return customerEmailVerify;
    }

    public ByProjectKeyCustomersEmailConfirmPostString withBody(String customerEmailVerify) {
        ByProjectKeyCustomersEmailConfirmPostString t = copy();
        t.customerEmailVerify = customerEmailVerify;
        return t;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ByProjectKeyCustomersEmailConfirmPostString that = (ByProjectKeyCustomersEmailConfirmPostString) o;

        return new EqualsBuilder().append(projectKey, that.projectKey)
                .append(customerEmailVerify, that.customerEmailVerify)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(projectKey).append(customerEmailVerify).toHashCode();
    }

    @Override
    protected ByProjectKeyCustomersEmailConfirmPostString copy() {
        return new ByProjectKeyCustomersEmailConfirmPostString(this);
    }
}
