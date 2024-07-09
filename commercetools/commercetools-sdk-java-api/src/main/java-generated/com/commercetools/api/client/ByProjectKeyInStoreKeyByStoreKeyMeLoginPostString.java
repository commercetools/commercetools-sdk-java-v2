
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
 *  <p>Retrieves the authenticated Customer (that matches the given email/password pair) if they are part of a specific Store.</p>
 *  <ul>
 *   <li>If the Customer does not have a Cart, the most recently modified anonymous cart becomes the Customer's Cart.</li>
 *   <li>If the Customer already has a Cart, the most recently modified anonymous cart is handled according to AnonymousCartSignInMode.</li>
 *  </ul>
 *  <p>A Cart returned in the CustomerSignInResult has any invalid Line Items removed and is updated with the latest prices, taxes, and discounts. During these updates, the following errors can be returned: MatchingPriceNotFound and MissingTaxRateForCountry.</p>
 *  <p>If an account with the given credentials is not found, an InvalidCredentials error is returned.</p>
 *
 * <hr>
 * <div class=code-example>
 * <pre><code class='java'>{@code
 *   CompletableFuture<ApiHttpResponse<com.commercetools.api.models.customer.CustomerSignInResult>> result = apiRoot
 *            .withProjectKey("{projectKey}")
 *            .inStoreKeyWithStoreKeyValue("{storeKey}")
 *            .me()
 *            .login()
 *            .post("")
 *            .execute()
 * }</code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyInStoreKeyByStoreKeyMeLoginPostString extends
        StringBodyApiMethod<ByProjectKeyInStoreKeyByStoreKeyMeLoginPostString, com.commercetools.api.models.customer.CustomerSignInResult>
        implements com.commercetools.api.client.ErrorableTrait<ByProjectKeyInStoreKeyByStoreKeyMeLoginPostString> {

    @Override
    public TypeReference<com.commercetools.api.models.customer.CustomerSignInResult> resultType() {
        return new TypeReference<com.commercetools.api.models.customer.CustomerSignInResult>() {
        };
    }

    private String projectKey;
    private String storeKey;

    private String myCustomerSignin;

    public ByProjectKeyInStoreKeyByStoreKeyMeLoginPostString(final ApiHttpClient apiHttpClient, String projectKey,
            String storeKey, String myCustomerSignin) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.storeKey = storeKey;
        this.myCustomerSignin = myCustomerSignin;
    }

    public ByProjectKeyInStoreKeyByStoreKeyMeLoginPostString(ByProjectKeyInStoreKeyByStoreKeyMeLoginPostString t) {
        super(t);
        this.projectKey = t.projectKey;
        this.storeKey = t.storeKey;
        this.myCustomerSignin = t.myCustomerSignin;
    }

    @Override
    protected ApiHttpRequest buildHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("%s/in-store/key=%s/me/login", this.projectKey, this.storeKey);
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }
        return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(),
            myCustomerSignin.getBytes(StandardCharsets.UTF_8));

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

    public String getBody() {
        return myCustomerSignin;
    }

    public ByProjectKeyInStoreKeyByStoreKeyMeLoginPostString withBody(String myCustomerSignin) {
        ByProjectKeyInStoreKeyByStoreKeyMeLoginPostString t = copy();
        t.myCustomerSignin = myCustomerSignin;
        return t;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ByProjectKeyInStoreKeyByStoreKeyMeLoginPostString that = (ByProjectKeyInStoreKeyByStoreKeyMeLoginPostString) o;

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
    protected ByProjectKeyInStoreKeyByStoreKeyMeLoginPostString copy() {
        return new ByProjectKeyInStoreKeyByStoreKeyMeLoginPostString(this);
    }
}
