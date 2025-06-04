
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
 *  <p>This is the last step in the password reset process of a Customer.</p>
 *  <p>Resetting a password of the Customer produces the CustomerPasswordUpdated Message with <code>reset=true</code>.</p>
 *  <p>After the password is reset, all password tokens issued previously through the password reset flow are invalidated. In addition, any access and refresh tokens issued previously through the password flow and refresh token flow are invalidated. This invalidation of tokens is eventually consistent.</p>
 *
 * <hr>
 * <div class=code-example>
 * <pre><code class='java'>{@code
 *   CompletableFuture<ApiHttpResponse<com.commercetools.api.models.customer.Customer>> result = apiRoot
 *            .withProjectKey("{projectKey}")
 *            .me()
 *            .password()
 *            .reset()
 *            .post(null)
 *            .execute()
 * }</code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyMePasswordResetPost extends
        TypeBodyApiMethod<ByProjectKeyMePasswordResetPost, com.commercetools.api.models.customer.Customer, com.commercetools.api.models.customer.MyCustomerResetPassword>
        implements com.commercetools.api.client.ErrorableTrait<ByProjectKeyMePasswordResetPost> {

    @Override
    public TypeReference<com.commercetools.api.models.customer.Customer> resultType() {
        return new TypeReference<com.commercetools.api.models.customer.Customer>() {
        };
    }

    private String projectKey;

    private com.commercetools.api.models.customer.MyCustomerResetPassword myCustomerResetPassword;

    public ByProjectKeyMePasswordResetPost(final ApiHttpClient apiHttpClient, String projectKey,
            com.commercetools.api.models.customer.MyCustomerResetPassword myCustomerResetPassword) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.myCustomerResetPassword = myCustomerResetPassword;
    }

    public ByProjectKeyMePasswordResetPost(ByProjectKeyMePasswordResetPost t) {
        super(t);
        this.projectKey = t.projectKey;
        this.myCustomerResetPassword = t.myCustomerResetPassword;
    }

    @Override
    protected ApiHttpRequest buildHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("%s/me/password/reset", encodePathParam(this.projectKey));
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }
        return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(),
            io.vrap.rmf.base.client.utils.json.JsonUtils
                    .executing(() -> apiHttpClient().getSerializerService().toJsonByteArray(myCustomerResetPassword)));

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

    public com.commercetools.api.models.customer.MyCustomerResetPassword getBody() {
        return myCustomerResetPassword;
    }

    public ByProjectKeyMePasswordResetPost withBody(
            com.commercetools.api.models.customer.MyCustomerResetPassword myCustomerResetPassword) {
        ByProjectKeyMePasswordResetPost t = copy();
        t.myCustomerResetPassword = myCustomerResetPassword;
        return t;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ByProjectKeyMePasswordResetPost that = (ByProjectKeyMePasswordResetPost) o;

        return new EqualsBuilder().append(projectKey, that.projectKey)
                .append(myCustomerResetPassword, that.myCustomerResetPassword)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(projectKey).append(myCustomerResetPassword).toHashCode();
    }

    @Override
    protected ByProjectKeyMePasswordResetPost copy() {
        return new ByProjectKeyMePasswordResetPost(this);
    }
}
