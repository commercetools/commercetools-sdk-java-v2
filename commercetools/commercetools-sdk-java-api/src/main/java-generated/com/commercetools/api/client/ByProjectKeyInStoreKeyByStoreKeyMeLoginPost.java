
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
 *  <p>Retrieves the authenticated Customer (that matches the given email/password pair) if they are part of a specific <a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Store</a>.</p>
 *  <p>If used with an optional <a href="https://docs.commercetools.com/apis/ctp:api:type:AnonymousSession" rel="nofollow">access token for an anonymous session</a>, all Orders and Carts that belong to the <code>anonymousId</code> are assigned to the newly logged-in Customer.</p>
 *  <ul>
 *   <li>If the Customer does not have a Cart, the most recently modified anonymous cart becomes the Customer's Cart.</li>
 *   <li>If the Customer already has a Cart, the most recently modified anonymous cart is handled according to <a href="https://docs.commercetools.com/apis/ctp:api:type:AnonymousCartSignInMode" rel="nofollow">AnonymousCartSignInMode</a>.</li>
 *  </ul>
 *  <p>A Cart returned in the <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomerSignInResult" rel="nofollow">CustomerSignInResult</a> has any invalid Line Items removed and is <span>updated</span> with the latest prices, taxes, and discounts. During these updates, the following errors can be returned: <a href="https://docs.commercetools.com/apis/ctp:api:type:MatchingPriceNotFoundError" rel="nofollow">MatchingPriceNotFound</a> and <a href="https://docs.commercetools.com/apis/ctp:api:type:MissingTaxRateForCountryError" rel="nofollow">MissingTaxRateForCountry</a>.</p>
 *  <p>If an account with the given credentials is not found, an <a href="https://docs.commercetools.com/apis/ctp:api:type:InvalidCredentialsError" rel="nofollow">InvalidCredentials</a> error is returned.</p>
 *
 * <hr>
 * <div class=code-example>
 * <pre><code class='java'>{@code
 *   CompletableFuture<ApiHttpResponse<com.commercetools.api.models.customer.CustomerSignInResult>> result = apiRoot
 *            .withProjectKey("{projectKey}")
 *            .inStoreKeyWithStoreKeyValue("{storeKey}")
 *            .me()
 *            .login()
 *            .post(null)
 *            .execute()
 * }</code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyInStoreKeyByStoreKeyMeLoginPost extends
        TypeBodyApiMethod<ByProjectKeyInStoreKeyByStoreKeyMeLoginPost, com.commercetools.api.models.customer.CustomerSignInResult, com.commercetools.api.models.customer.MyCustomerSignin>
        implements com.commercetools.api.client.ErrorableTrait<ByProjectKeyInStoreKeyByStoreKeyMeLoginPost> {

    @Override
    public TypeReference<com.commercetools.api.models.customer.CustomerSignInResult> resultType() {
        return new TypeReference<com.commercetools.api.models.customer.CustomerSignInResult>() {
        };
    }

    private String projectKey;
    private String storeKey;

    private com.commercetools.api.models.customer.MyCustomerSignin myCustomerSignin;

    public ByProjectKeyInStoreKeyByStoreKeyMeLoginPost(final ApiHttpClient apiHttpClient, String projectKey,
            String storeKey, com.commercetools.api.models.customer.MyCustomerSignin myCustomerSignin) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.storeKey = storeKey;
        this.myCustomerSignin = myCustomerSignin;
    }

    public ByProjectKeyInStoreKeyByStoreKeyMeLoginPost(ByProjectKeyInStoreKeyByStoreKeyMeLoginPost t) {
        super(t);
        this.projectKey = t.projectKey;
        this.storeKey = t.storeKey;
        this.myCustomerSignin = t.myCustomerSignin;
    }

    @Override
    protected ApiHttpRequest buildHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("%s/in-store/key=%s/me/login", encodePathParam(this.projectKey),
            encodePathParam(this.storeKey));
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }
        return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(),
            io.vrap.rmf.base.client.utils.json.JsonUtils
                    .executing(() -> apiHttpClient().getSerializerService().toJsonByteArray(myCustomerSignin)));

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

    public com.commercetools.api.models.customer.MyCustomerSignin getBody() {
        return myCustomerSignin;
    }

    public ByProjectKeyInStoreKeyByStoreKeyMeLoginPost withBody(
            com.commercetools.api.models.customer.MyCustomerSignin myCustomerSignin) {
        ByProjectKeyInStoreKeyByStoreKeyMeLoginPost t = copy();
        t.myCustomerSignin = myCustomerSignin;
        return t;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ByProjectKeyInStoreKeyByStoreKeyMeLoginPost that = (ByProjectKeyInStoreKeyByStoreKeyMeLoginPost) o;

        return new EqualsBuilder().append(projectKey, that.projectKey)
                .append(storeKey, that.storeKey)
                .append(myCustomerSignin, that.myCustomerSignin)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(projectKey).append(storeKey).append(myCustomerSignin).toHashCode();
    }

    @Override
    protected ByProjectKeyInStoreKeyByStoreKeyMeLoginPost copy() {
        return new ByProjectKeyInStoreKeyByStoreKeyMeLoginPost(this);
    }
}
