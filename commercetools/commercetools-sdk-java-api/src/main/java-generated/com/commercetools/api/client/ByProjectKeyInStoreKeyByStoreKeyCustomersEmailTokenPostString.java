
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
 *  <p>Use this method to create an email token for a Store-specific Customer during their email verification process.</p>
 *  <p>If the Customer exists in the Project but the <code>stores</code> field references a different Store, this method returns a ResourceNotFound error.</p>
 *
 * <hr>
 * <div class=code-example>
 * <pre><code class='java'>{@code
 *   CompletableFuture<ApiHttpResponse<com.commercetools.api.models.customer.CustomerToken>> result = apiRoot
 *            .withProjectKey("{projectKey}")
 *            .inStoreKeyWithStoreKeyValue("{storeKey}")
 *            .customers()
 *            .emailToken()
 *            .post("")
 *            .execute()
 * }</code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyInStoreKeyByStoreKeyCustomersEmailTokenPostString extends
        StringBodyApiMethod<ByProjectKeyInStoreKeyByStoreKeyCustomersEmailTokenPostString, com.commercetools.api.models.customer.CustomerToken>
        implements
        com.commercetools.api.client.ErrorableTrait<ByProjectKeyInStoreKeyByStoreKeyCustomersEmailTokenPostString> {

    @Override
    public TypeReference<com.commercetools.api.models.customer.CustomerToken> resultType() {
        return new TypeReference<com.commercetools.api.models.customer.CustomerToken>() {
        };
    }

    private String projectKey;
    private String storeKey;

    private String customerCreateEmailToken;

    public ByProjectKeyInStoreKeyByStoreKeyCustomersEmailTokenPostString(final ApiHttpClient apiHttpClient,
            String projectKey, String storeKey, String customerCreateEmailToken) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.storeKey = storeKey;
        this.customerCreateEmailToken = customerCreateEmailToken;
    }

    public ByProjectKeyInStoreKeyByStoreKeyCustomersEmailTokenPostString(
            ByProjectKeyInStoreKeyByStoreKeyCustomersEmailTokenPostString t) {
        super(t);
        this.projectKey = t.projectKey;
        this.storeKey = t.storeKey;
        this.customerCreateEmailToken = t.customerCreateEmailToken;
    }

    @Override
    protected ApiHttpRequest buildHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("%s/in-store/key=%s/customers/email-token", this.projectKey,
            this.storeKey);
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }
        return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(),
            customerCreateEmailToken.getBytes(StandardCharsets.UTF_8));

    }

    @Override
    public ApiHttpResponse<com.commercetools.api.models.customer.CustomerToken> executeBlocking(
            final ApiHttpClient client, final Duration timeout) {
        return executeBlocking(client, timeout, com.commercetools.api.models.customer.CustomerToken.class);
    }

    @Override
    public CompletableFuture<ApiHttpResponse<com.commercetools.api.models.customer.CustomerToken>> execute(
            final ApiHttpClient client) {
        return execute(client, com.commercetools.api.models.customer.CustomerToken.class);
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
        return customerCreateEmailToken;
    }

    public ByProjectKeyInStoreKeyByStoreKeyCustomersEmailTokenPostString withBody(String customerCreateEmailToken) {
        ByProjectKeyInStoreKeyByStoreKeyCustomersEmailTokenPostString t = copy();
        t.customerCreateEmailToken = customerCreateEmailToken;
        return t;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ByProjectKeyInStoreKeyByStoreKeyCustomersEmailTokenPostString that = (ByProjectKeyInStoreKeyByStoreKeyCustomersEmailTokenPostString) o;

        return new EqualsBuilder().append(projectKey, that.projectKey)
                .append(storeKey, that.storeKey)
                .append(customerCreateEmailToken, that.customerCreateEmailToken)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(projectKey)
                .append(storeKey)
                .append(customerCreateEmailToken)
                .toHashCode();
    }

    @Override
    protected ByProjectKeyInStoreKeyByStoreKeyCustomersEmailTokenPostString copy() {
        return new ByProjectKeyInStoreKeyByStoreKeyCustomersEmailTokenPostString(this);
    }
}
