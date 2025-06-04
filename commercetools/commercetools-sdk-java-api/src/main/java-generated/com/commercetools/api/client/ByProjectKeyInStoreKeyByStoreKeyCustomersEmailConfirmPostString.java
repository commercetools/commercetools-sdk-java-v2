
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
 *  <p>Use this method to verify a Store-specific Customer's email during their email verification process.</p>
 *  <p>Verifying the email of the Customer produces the CustomerEmailVerified Message.</p>
 *  <p>If the Customer exists in the Project but the <code>stores</code> field references a different Store, this method returns a ResourceNotFound error.</p>
 *  <p>After the email is verified, all email tokens issued previously through the email verification flow are invalidated. This invalidation of tokens is eventually consistent.</p>
 *
 * <hr>
 * <div class=code-example>
 * <pre><code class='java'>{@code
 *   CompletableFuture<ApiHttpResponse<com.commercetools.api.models.customer.Customer>> result = apiRoot
 *            .withProjectKey("{projectKey}")
 *            .inStoreKeyWithStoreKeyValue("{storeKey}")
 *            .customers()
 *            .emailConfirm()
 *            .post("")
 *            .execute()
 * }</code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyInStoreKeyByStoreKeyCustomersEmailConfirmPostString extends
        StringBodyApiMethod<ByProjectKeyInStoreKeyByStoreKeyCustomersEmailConfirmPostString, com.commercetools.api.models.customer.Customer>
        implements
        com.commercetools.api.client.ErrorableTrait<ByProjectKeyInStoreKeyByStoreKeyCustomersEmailConfirmPostString> {

    @Override
    public TypeReference<com.commercetools.api.models.customer.Customer> resultType() {
        return new TypeReference<com.commercetools.api.models.customer.Customer>() {
        };
    }

    private String projectKey;
    private String storeKey;

    private String customerEmailVerify;

    public ByProjectKeyInStoreKeyByStoreKeyCustomersEmailConfirmPostString(final ApiHttpClient apiHttpClient,
            String projectKey, String storeKey, String customerEmailVerify) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.storeKey = storeKey;
        this.customerEmailVerify = customerEmailVerify;
    }

    public ByProjectKeyInStoreKeyByStoreKeyCustomersEmailConfirmPostString(
            ByProjectKeyInStoreKeyByStoreKeyCustomersEmailConfirmPostString t) {
        super(t);
        this.projectKey = t.projectKey;
        this.storeKey = t.storeKey;
        this.customerEmailVerify = t.customerEmailVerify;
    }

    @Override
    protected ApiHttpRequest buildHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("%s/in-store/key=%s/customers/email/confirm", this.projectKey,
            this.storeKey);
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
        return customerEmailVerify;
    }

    public ByProjectKeyInStoreKeyByStoreKeyCustomersEmailConfirmPostString withBody(String customerEmailVerify) {
        ByProjectKeyInStoreKeyByStoreKeyCustomersEmailConfirmPostString t = copy();
        t.customerEmailVerify = customerEmailVerify;
        return t;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ByProjectKeyInStoreKeyByStoreKeyCustomersEmailConfirmPostString that = (ByProjectKeyInStoreKeyByStoreKeyCustomersEmailConfirmPostString) o;

        return new EqualsBuilder().append(projectKey, that.projectKey)
                .append(storeKey, that.storeKey)
                .append(customerEmailVerify, that.customerEmailVerify)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(projectKey).append(storeKey).append(customerEmailVerify).toHashCode();
    }

    @Override
    protected ByProjectKeyInStoreKeyByStoreKeyCustomersEmailConfirmPostString copy() {
        return new ByProjectKeyInStoreKeyByStoreKeyCustomersEmailConfirmPostString(this);
    }
}
