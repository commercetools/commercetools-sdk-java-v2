
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
*  <p>Set a new password using a token.</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ByProjectKeyCustomersPasswordResetPost extends
        BodyApiMethod<ByProjectKeyCustomersPasswordResetPost, com.commercetools.api.models.customer.Customer, com.commercetools.api.models.customer.CustomerResetPassword>
        implements com.commercetools.api.client.ErrorableTrait<ByProjectKeyCustomersPasswordResetPost> {

    private String projectKey;

    private com.commercetools.api.models.customer.CustomerResetPassword customerResetPassword;

    public ByProjectKeyCustomersPasswordResetPost(final ApiHttpClient apiHttpClient, String projectKey,
            com.commercetools.api.models.customer.CustomerResetPassword customerResetPassword) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.customerResetPassword = customerResetPassword;
    }

    public ByProjectKeyCustomersPasswordResetPost(ByProjectKeyCustomersPasswordResetPost t) {
        super(t);
        this.projectKey = t.projectKey;
        this.customerResetPassword = t.customerResetPassword;
    }

    @Override
    protected ApiHttpRequest buildHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("/%s/customers/password/reset", this.projectKey);
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }
        return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(),
            io.vrap.rmf.base.client.utils.json.JsonUtils
                    .executing(() -> apiHttpClient().getSerializerService().toJsonByteArray(customerResetPassword)));

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

    public com.commercetools.api.models.customer.CustomerResetPassword getBody() {
        return customerResetPassword;
    }

    public ByProjectKeyCustomersPasswordResetPost withBody(
            com.commercetools.api.models.customer.CustomerResetPassword customerResetPassword) {
        ByProjectKeyCustomersPasswordResetPost t = copy();
        t.customerResetPassword = customerResetPassword;
        return t;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ByProjectKeyCustomersPasswordResetPost that = (ByProjectKeyCustomersPasswordResetPost) o;

        return new EqualsBuilder().append(projectKey, that.projectKey)
                .append(customerResetPassword, that.customerResetPassword)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(projectKey).append(customerResetPassword).toHashCode();
    }

    @Override
    protected ByProjectKeyCustomersPasswordResetPost copy() {
        return new ByProjectKeyCustomersPasswordResetPost(this);
    }
}
