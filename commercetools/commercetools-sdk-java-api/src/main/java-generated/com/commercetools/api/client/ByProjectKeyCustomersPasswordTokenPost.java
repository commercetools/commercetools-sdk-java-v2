
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
*  <p>The token value is used to reset the password of the customer with the given email. The token is
*  valid only for 10 minutes.</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ByProjectKeyCustomersPasswordTokenPost extends
        BodyApiMethod<ByProjectKeyCustomersPasswordTokenPost, com.commercetools.api.models.customer.CustomerToken, com.commercetools.api.models.customer.CustomerCreatePasswordResetToken>
        implements com.commercetools.api.client.ErrorableTrait<ByProjectKeyCustomersPasswordTokenPost> {

    private String projectKey;

    private com.commercetools.api.models.customer.CustomerCreatePasswordResetToken customerCreatePasswordResetToken;

    public ByProjectKeyCustomersPasswordTokenPost(final ApiHttpClient apiHttpClient, String projectKey,
            com.commercetools.api.models.customer.CustomerCreatePasswordResetToken customerCreatePasswordResetToken) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.customerCreatePasswordResetToken = customerCreatePasswordResetToken;
    }

    public ByProjectKeyCustomersPasswordTokenPost(ByProjectKeyCustomersPasswordTokenPost t) {
        super(t);
        this.projectKey = t.projectKey;
        this.customerCreatePasswordResetToken = t.customerCreatePasswordResetToken;
    }

    @Override
    protected ApiHttpRequest buildHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("/%s/customers/password-token", this.projectKey);
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }
        return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(),
            io.vrap.rmf.base.client.utils.json.JsonUtils.executing(
                () -> apiHttpClient().getSerializerService().toJsonByteArray(customerCreatePasswordResetToken)));

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

    public void setProjectKey(final String projectKey) {
        this.projectKey = projectKey;
    }

    public com.commercetools.api.models.customer.CustomerCreatePasswordResetToken getBody() {
        return customerCreatePasswordResetToken;
    }

    public ByProjectKeyCustomersPasswordTokenPost withBody(
            com.commercetools.api.models.customer.CustomerCreatePasswordResetToken customerCreatePasswordResetToken) {
        ByProjectKeyCustomersPasswordTokenPost t = copy();
        t.customerCreatePasswordResetToken = customerCreatePasswordResetToken;
        return t;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ByProjectKeyCustomersPasswordTokenPost that = (ByProjectKeyCustomersPasswordTokenPost) o;

        return new EqualsBuilder().append(projectKey, that.projectKey)
                .append(customerCreatePasswordResetToken, that.customerCreatePasswordResetToken)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(projectKey).append(customerCreatePasswordResetToken).toHashCode();
    }

    @Override
    protected ByProjectKeyCustomersPasswordTokenPost copy() {
        return new ByProjectKeyCustomersPasswordTokenPost(this);
    }
}
