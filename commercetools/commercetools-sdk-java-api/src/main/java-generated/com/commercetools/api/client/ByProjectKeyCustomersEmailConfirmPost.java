
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
*  <p>Verifies customer's email using a token.</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ByProjectKeyCustomersEmailConfirmPost extends
        BodyApiMethod<ByProjectKeyCustomersEmailConfirmPost, com.commercetools.api.models.customer.Customer, com.commercetools.api.models.customer.CustomerEmailVerify>
        implements com.commercetools.api.client.ErrorableTrait<ByProjectKeyCustomersEmailConfirmPost> {

    private String projectKey;

    private com.commercetools.api.models.customer.CustomerEmailVerify customerEmailVerify;

    public ByProjectKeyCustomersEmailConfirmPost(final ApiHttpClient apiHttpClient, String projectKey,
            com.commercetools.api.models.customer.CustomerEmailVerify customerEmailVerify) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.customerEmailVerify = customerEmailVerify;
    }

    public ByProjectKeyCustomersEmailConfirmPost(ByProjectKeyCustomersEmailConfirmPost t) {
        super(t);
        this.projectKey = t.projectKey;
        this.customerEmailVerify = t.customerEmailVerify;
    }

    @Override
    protected ApiHttpRequest buildHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("/%s/customers/email/confirm", this.projectKey);
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }
        return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(),
            io.vrap.rmf.base.client.utils.json.JsonUtils
                    .executing(() -> apiHttpClient().getSerializerService().toJsonByteArray(customerEmailVerify)));

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

    public com.commercetools.api.models.customer.CustomerEmailVerify getBody() {
        return customerEmailVerify;
    }

    public ByProjectKeyCustomersEmailConfirmPost withBody(
            com.commercetools.api.models.customer.CustomerEmailVerify customerEmailVerify) {
        ByProjectKeyCustomersEmailConfirmPost t = copy();
        t.customerEmailVerify = customerEmailVerify;
        return t;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ByProjectKeyCustomersEmailConfirmPost that = (ByProjectKeyCustomersEmailConfirmPost) o;

        return new EqualsBuilder().append(projectKey, that.projectKey)
                .append(customerEmailVerify, that.customerEmailVerify)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(projectKey).append(customerEmailVerify).toHashCode();
    }

    @Override
    protected ByProjectKeyCustomersEmailConfirmPost copy() {
        return new ByProjectKeyCustomersEmailConfirmPost(this);
    }
}
