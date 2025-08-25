
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
 *  <p>Authenticates a global Customer not associated with a Store. For more information, see <span>Global versus Store-specific Customers</span>. If the Customer is registered in a Store, use the <a href="https://docs.commercetools.com/apis/ctp:api:endpoint:/{projectKey}/in-store/key={storeKey}/login:POST" rel="nofollow">Authenticate (sign in) Customer in Store</a> method.</p>
 *  <p>Triggers <span>Cart merge during sign-in</span>.</p>
 *  <p>A Cart returned in the <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomerSignInResult" rel="nofollow">CustomerSignInResult</a> has any invalid Line Items removed and is <span>updated</span> with the latest prices, taxes, and discounts. During these updates, the following errors can be returned: <a href="https://docs.commercetools.com/apis/ctp:api:type:MatchingPriceNotFoundError" rel="nofollow">MatchingPriceNotFound</a> and <a href="https://docs.commercetools.com/apis/ctp:api:type:MissingTaxRateForCountryError" rel="nofollow">MissingTaxRateForCountry</a>.</p>
 *  <p>If an account with the given credentials is not found, an <a href="https://docs.commercetools.com/apis/ctp:api:type:InvalidCredentialsError" rel="nofollow">InvalidCredentials</a> error is returned.</p>
 *
 * <hr>
 * <div class=code-example>
 * <pre><code class='java'>{@code
 *   CompletableFuture<ApiHttpResponse<com.commercetools.api.models.customer.CustomerSignInResult>> result = apiRoot
 *            .withProjectKey("{projectKey}")
 *            .login()
 *            .post(null)
 *            .execute()
 * }</code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyLoginPost extends
        TypeBodyApiMethod<ByProjectKeyLoginPost, com.commercetools.api.models.customer.CustomerSignInResult, com.commercetools.api.models.customer.CustomerSignin>
        implements com.commercetools.api.client.ErrorableTrait<ByProjectKeyLoginPost> {

    @Override
    public TypeReference<com.commercetools.api.models.customer.CustomerSignInResult> resultType() {
        return new TypeReference<com.commercetools.api.models.customer.CustomerSignInResult>() {
        };
    }

    private String projectKey;

    private com.commercetools.api.models.customer.CustomerSignin customerSignin;

    public ByProjectKeyLoginPost(final ApiHttpClient apiHttpClient, String projectKey,
            com.commercetools.api.models.customer.CustomerSignin customerSignin) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.customerSignin = customerSignin;
    }

    public ByProjectKeyLoginPost(ByProjectKeyLoginPost t) {
        super(t);
        this.projectKey = t.projectKey;
        this.customerSignin = t.customerSignin;
    }

    @Override
    protected ApiHttpRequest buildHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("%s/login", encodePathParam(this.projectKey));
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }
        return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(),
            io.vrap.rmf.base.client.utils.json.JsonUtils
                    .executing(() -> apiHttpClient().getSerializerService().toJsonByteArray(customerSignin)));

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

    public com.commercetools.api.models.customer.CustomerSignin getBody() {
        return customerSignin;
    }

    public ByProjectKeyLoginPost withBody(com.commercetools.api.models.customer.CustomerSignin customerSignin) {
        ByProjectKeyLoginPost t = copy();
        t.customerSignin = customerSignin;
        return t;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ByProjectKeyLoginPost that = (ByProjectKeyLoginPost) o;

        return new EqualsBuilder().append(projectKey, that.projectKey)
                .append(customerSignin, that.customerSignin)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(projectKey).append(customerSignin).toHashCode();
    }

    @Override
    protected ByProjectKeyLoginPost copy() {
        return new ByProjectKeyLoginPost(this);
    }
}
