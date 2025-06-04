
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
 *  <p>This is the last step in the email verification process of a Customer.</p>
 *  <p>After the email is verified, all email tokens issued previously through the email verification flow are invalidated. This invalidation of tokens is eventually consistent.</p>
 *
 * <hr>
 * <div class=code-example>
 * <pre><code class='java'>{@code
 *   CompletableFuture<ApiHttpResponse<com.commercetools.api.models.customer.Customer>> result = apiRoot
 *            .withProjectKey("{projectKey}")
 *            .me()
 *            .emailConfirm()
 *            .post("")
 *            .execute()
 * }</code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyMeEmailConfirmPostString extends
        StringBodyApiMethod<ByProjectKeyMeEmailConfirmPostString, com.commercetools.api.models.customer.Customer>
        implements com.commercetools.api.client.ErrorableTrait<ByProjectKeyMeEmailConfirmPostString> {

    @Override
    public TypeReference<com.commercetools.api.models.customer.Customer> resultType() {
        return new TypeReference<com.commercetools.api.models.customer.Customer>() {
        };
    }

    private String projectKey;

    private String myCustomerEmailVerify;

    public ByProjectKeyMeEmailConfirmPostString(final ApiHttpClient apiHttpClient, String projectKey,
            String myCustomerEmailVerify) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.myCustomerEmailVerify = myCustomerEmailVerify;
    }

    public ByProjectKeyMeEmailConfirmPostString(ByProjectKeyMeEmailConfirmPostString t) {
        super(t);
        this.projectKey = t.projectKey;
        this.myCustomerEmailVerify = t.myCustomerEmailVerify;
    }

    @Override
    protected ApiHttpRequest buildHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("%s/me/email/confirm", this.projectKey);
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }
        return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(),
            myCustomerEmailVerify.getBytes(StandardCharsets.UTF_8));

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
        return myCustomerEmailVerify;
    }

    public ByProjectKeyMeEmailConfirmPostString withBody(String myCustomerEmailVerify) {
        ByProjectKeyMeEmailConfirmPostString t = copy();
        t.myCustomerEmailVerify = myCustomerEmailVerify;
        return t;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ByProjectKeyMeEmailConfirmPostString that = (ByProjectKeyMeEmailConfirmPostString) o;

        return new EqualsBuilder().append(projectKey, that.projectKey)
                .append(myCustomerEmailVerify, that.myCustomerEmailVerify)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(projectKey).append(myCustomerEmailVerify).toHashCode();
    }

    @Override
    protected ByProjectKeyMeEmailConfirmPostString copy() {
        return new ByProjectKeyMeEmailConfirmPostString(this);
    }
}
