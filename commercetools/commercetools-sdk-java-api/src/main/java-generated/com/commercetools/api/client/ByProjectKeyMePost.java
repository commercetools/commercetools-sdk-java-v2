
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
*  <p>Update my customer</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ByProjectKeyMePost extends
        BodyApiMethod<ByProjectKeyMePost, com.commercetools.api.models.customer.Customer, com.commercetools.api.models.me.MyCustomerUpdate>
        implements com.commercetools.api.client.ErrorableTrait<ByProjectKeyMePost> {

    private String projectKey;

    private com.commercetools.api.models.me.MyCustomerUpdate myCustomerUpdate;

    public ByProjectKeyMePost(final ApiHttpClient apiHttpClient, String projectKey,
            com.commercetools.api.models.me.MyCustomerUpdate myCustomerUpdate) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.myCustomerUpdate = myCustomerUpdate;
    }

    public ByProjectKeyMePost(ByProjectKeyMePost t) {
        super(t);
        this.projectKey = t.projectKey;
        this.myCustomerUpdate = t.myCustomerUpdate;
    }

    @Override
    protected ApiHttpRequest buildHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("/%s/me", this.projectKey);
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }
        return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(),
            io.vrap.rmf.base.client.utils.json.JsonUtils
                    .executing(() -> apiHttpClient().getSerializerService().toJsonByteArray(myCustomerUpdate)));

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

    public com.commercetools.api.models.me.MyCustomerUpdate getBody() {
        return myCustomerUpdate;
    }

    public ByProjectKeyMePost withBody(com.commercetools.api.models.me.MyCustomerUpdate myCustomerUpdate) {
        ByProjectKeyMePost t = copy();
        t.myCustomerUpdate = myCustomerUpdate;
        return t;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ByProjectKeyMePost that = (ByProjectKeyMePost) o;

        return new EqualsBuilder().append(projectKey, that.projectKey)
                .append(myCustomerUpdate, that.myCustomerUpdate)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(projectKey).append(myCustomerUpdate).toHashCode();
    }

    @Override
    protected ByProjectKeyMePost copy() {
        return new ByProjectKeyMePost(this);
    }
}
