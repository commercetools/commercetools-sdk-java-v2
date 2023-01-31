
package com.commercetools.api.client;

import java.net.URI;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;

import io.vrap.rmf.base.client.*;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 *  <p>This is the last step in the email verification process of a Customer.</p>
 *
 * <hr>
 * <div class=code-example>
 * <pre><code class='java'>{@code
 *   CompletableFuture<ApiHttpResponse<com.commercetools.api.models.customer.Customer>> result = apiRoot
 *            .withProjectKey("{projectKey}")
 *            .me()
 *            .emailConfirm()
 *            .post(null)
 *            .execute()
 * }</code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyMeEmailConfirmPost extends
        BodyApiMethod<ByProjectKeyMeEmailConfirmPost, com.commercetools.api.models.customer.Customer, com.commercetools.api.models.customer.MyCustomerEmailVerify>
        implements com.commercetools.api.client.ErrorableTrait<ByProjectKeyMeEmailConfirmPost> {

    private String projectKey;

    private com.commercetools.api.models.customer.MyCustomerEmailVerify myCustomerEmailVerify;

    public ByProjectKeyMeEmailConfirmPost(final ApiHttpClient apiHttpClient, String projectKey,
            com.commercetools.api.models.customer.MyCustomerEmailVerify myCustomerEmailVerify) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.myCustomerEmailVerify = myCustomerEmailVerify;
    }

    public ByProjectKeyMeEmailConfirmPost(ByProjectKeyMeEmailConfirmPost t) {
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
            io.vrap.rmf.base.client.utils.json.JsonUtils
                    .executing(() -> apiHttpClient().getSerializerService().toJsonByteArray(myCustomerEmailVerify)));

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

    public com.commercetools.api.models.customer.MyCustomerEmailVerify getBody() {
        return myCustomerEmailVerify;
    }

    public ByProjectKeyMeEmailConfirmPost withBody(
            com.commercetools.api.models.customer.MyCustomerEmailVerify myCustomerEmailVerify) {
        ByProjectKeyMeEmailConfirmPost t = copy();
        t.myCustomerEmailVerify = myCustomerEmailVerify;
        return t;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ByProjectKeyMeEmailConfirmPost that = (ByProjectKeyMeEmailConfirmPost) o;

        return new EqualsBuilder().append(projectKey, that.projectKey)
                .append(myCustomerEmailVerify, that.myCustomerEmailVerify)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(projectKey).append(myCustomerEmailVerify).toHashCode();
    }

    @Override
    protected ByProjectKeyMeEmailConfirmPost copy() {
        return new ByProjectKeyMeEmailConfirmPost(this);
    }
}
