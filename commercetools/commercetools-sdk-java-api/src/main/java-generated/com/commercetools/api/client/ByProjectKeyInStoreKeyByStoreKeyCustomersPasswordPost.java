
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
*  <p>Change a customers password</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ByProjectKeyInStoreKeyByStoreKeyCustomersPasswordPost extends
        BodyApiMethod<ByProjectKeyInStoreKeyByStoreKeyCustomersPasswordPost, com.commercetools.api.models.customer.Customer, com.commercetools.api.models.customer.CustomerChangePassword>
        implements com.commercetools.api.client.ErrorableTrait<ByProjectKeyInStoreKeyByStoreKeyCustomersPasswordPost> {

    private String projectKey;
    private String storeKey;

    private com.commercetools.api.models.customer.CustomerChangePassword customerChangePassword;

    public ByProjectKeyInStoreKeyByStoreKeyCustomersPasswordPost(final ApiHttpClient apiHttpClient, String projectKey,
            String storeKey, com.commercetools.api.models.customer.CustomerChangePassword customerChangePassword) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.storeKey = storeKey;
        this.customerChangePassword = customerChangePassword;
    }

    public ByProjectKeyInStoreKeyByStoreKeyCustomersPasswordPost(
            ByProjectKeyInStoreKeyByStoreKeyCustomersPasswordPost t) {
        super(t);
        this.projectKey = t.projectKey;
        this.storeKey = t.storeKey;
        this.customerChangePassword = t.customerChangePassword;
    }

    @Override
    protected ApiHttpRequest buildHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("/%s/in-store/key=%s/customers/password", this.projectKey,
            this.storeKey);
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }
        return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(),
            io.vrap.rmf.base.client.utils.json.JsonUtils
                    .executing(() -> apiHttpClient().getSerializerService().toJsonByteArray(customerChangePassword)));

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

    public com.commercetools.api.models.customer.CustomerChangePassword getBody() {
        return customerChangePassword;
    }

    public ByProjectKeyInStoreKeyByStoreKeyCustomersPasswordPost withBody(
            com.commercetools.api.models.customer.CustomerChangePassword customerChangePassword) {
        ByProjectKeyInStoreKeyByStoreKeyCustomersPasswordPost t = copy();
        t.customerChangePassword = customerChangePassword;
        return t;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ByProjectKeyInStoreKeyByStoreKeyCustomersPasswordPost that = (ByProjectKeyInStoreKeyByStoreKeyCustomersPasswordPost) o;

        return new EqualsBuilder().append(projectKey, that.projectKey)
                .append(storeKey, that.storeKey)
                .append(customerChangePassword, that.customerChangePassword)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(projectKey)
                .append(storeKey)
                .append(customerChangePassword)
                .toHashCode();
    }

    @Override
    protected ByProjectKeyInStoreKeyByStoreKeyCustomersPasswordPost copy() {
        return new ByProjectKeyInStoreKeyByStoreKeyCustomersPasswordPost(this);
    }
}
