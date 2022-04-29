
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

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ByProjectKeyMePasswordPost extends
        BodyApiMethod<ByProjectKeyMePasswordPost, com.commercetools.api.models.customer.Customer, com.commercetools.api.models.customer.MyCustomerChangePassword>
        implements com.commercetools.api.client.ConflictingTrait<ByProjectKeyMePasswordPost>,
        com.commercetools.api.client.ErrorableTrait<ByProjectKeyMePasswordPost> {

    private String projectKey;

    private com.commercetools.api.models.customer.MyCustomerChangePassword myCustomerChangePassword;

    public ByProjectKeyMePasswordPost(final ApiHttpClient apiHttpClient, String projectKey,
            com.commercetools.api.models.customer.MyCustomerChangePassword myCustomerChangePassword) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.myCustomerChangePassword = myCustomerChangePassword;
    }

    public ByProjectKeyMePasswordPost(ByProjectKeyMePasswordPost t) {
        super(t);
        this.projectKey = t.projectKey;
        this.myCustomerChangePassword = t.myCustomerChangePassword;
    }

    @Override
    protected ApiHttpRequest buildHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("/%s/me/password", this.projectKey);
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }
        return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(),
            io.vrap.rmf.base.client.utils.json.JsonUtils
                    .executing(() -> apiHttpClient().getSerializerService().toJsonByteArray(myCustomerChangePassword)));

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

    public com.commercetools.api.models.customer.MyCustomerChangePassword getBody() {
        return myCustomerChangePassword;
    }

    public ByProjectKeyMePasswordPost withBody(
            com.commercetools.api.models.customer.MyCustomerChangePassword myCustomerChangePassword) {
        ByProjectKeyMePasswordPost t = copy();
        t.myCustomerChangePassword = myCustomerChangePassword;
        return t;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ByProjectKeyMePasswordPost that = (ByProjectKeyMePasswordPost) o;

        return new EqualsBuilder().append(projectKey, that.projectKey)
                .append(myCustomerChangePassword, that.myCustomerChangePassword)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(projectKey).append(myCustomerChangePassword).toHashCode();
    }

    @Override
    protected ByProjectKeyMePasswordPost copy() {
        return new ByProjectKeyMePasswordPost(this);
    }
}
