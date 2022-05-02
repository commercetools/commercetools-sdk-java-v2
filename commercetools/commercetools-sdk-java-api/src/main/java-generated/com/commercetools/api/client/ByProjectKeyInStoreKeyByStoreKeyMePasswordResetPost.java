
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
public class ByProjectKeyInStoreKeyByStoreKeyMePasswordResetPost extends
        BodyApiMethod<ByProjectKeyInStoreKeyByStoreKeyMePasswordResetPost, com.commercetools.api.models.customer.Customer, com.commercetools.api.models.customer.MyCustomerResetPassword>
        implements com.commercetools.api.client.ErrorableTrait<ByProjectKeyInStoreKeyByStoreKeyMePasswordResetPost> {

    private String projectKey;
    private String storeKey;

    private com.commercetools.api.models.customer.MyCustomerResetPassword myCustomerResetPassword;

    public ByProjectKeyInStoreKeyByStoreKeyMePasswordResetPost(final ApiHttpClient apiHttpClient, String projectKey,
            String storeKey, com.commercetools.api.models.customer.MyCustomerResetPassword myCustomerResetPassword) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.storeKey = storeKey;
        this.myCustomerResetPassword = myCustomerResetPassword;
    }

    public ByProjectKeyInStoreKeyByStoreKeyMePasswordResetPost(ByProjectKeyInStoreKeyByStoreKeyMePasswordResetPost t) {
        super(t);
        this.projectKey = t.projectKey;
        this.storeKey = t.storeKey;
        this.myCustomerResetPassword = t.myCustomerResetPassword;
    }

    @Override
    protected ApiHttpRequest buildHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("/%s/in-store/key=%s/me/password/reset", this.projectKey, this.storeKey);
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

    public String getStoreKey() {
        return this.storeKey;
    }

    public void setProjectKey(final String projectKey) {
        this.projectKey = projectKey;
    }

    public void setStoreKey(final String storeKey) {
        this.storeKey = storeKey;
    }

    public com.commercetools.api.models.customer.MyCustomerResetPassword getBody() {
        return myCustomerResetPassword;
    }

    public ByProjectKeyInStoreKeyByStoreKeyMePasswordResetPost withBody(
            com.commercetools.api.models.customer.MyCustomerResetPassword myCustomerResetPassword) {
        ByProjectKeyInStoreKeyByStoreKeyMePasswordResetPost t = copy();
        t.myCustomerResetPassword = myCustomerResetPassword;
        return t;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ByProjectKeyInStoreKeyByStoreKeyMePasswordResetPost that = (ByProjectKeyInStoreKeyByStoreKeyMePasswordResetPost) o;

        return new EqualsBuilder().append(projectKey, that.projectKey)
                .append(storeKey, that.storeKey)
                .append(myCustomerResetPassword, that.myCustomerResetPassword)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(projectKey)
                .append(storeKey)
                .append(myCustomerResetPassword)
                .toHashCode();
    }

    @Override
    protected ByProjectKeyInStoreKeyByStoreKeyMePasswordResetPost copy() {
        return new ByProjectKeyInStoreKeyByStoreKeyMePasswordResetPost(this);
    }
}
