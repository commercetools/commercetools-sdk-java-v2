
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
public class ByProjectKeyMeLoginPost extends
        BodyApiMethod<ByProjectKeyMeLoginPost, com.commercetools.api.models.customer.CustomerSignInResult, com.commercetools.api.models.customer.CustomerSignin>
        implements com.commercetools.api.client.ErrorableTrait<ByProjectKeyMeLoginPost> {

    private String projectKey;

    private com.commercetools.api.models.customer.CustomerSignin customerSignin;

    public ByProjectKeyMeLoginPost(final ApiHttpClient apiHttpClient, String projectKey,
            com.commercetools.api.models.customer.CustomerSignin customerSignin) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.customerSignin = customerSignin;
    }

    public ByProjectKeyMeLoginPost(ByProjectKeyMeLoginPost t) {
        super(t);
        this.projectKey = t.projectKey;
        this.customerSignin = t.customerSignin;
    }

    @Override
    protected ApiHttpRequest buildHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("/%s/me/login", this.projectKey);
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }
        return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(),
            io.vrap.rmf.base.client.utils.json.JsonUtils
                    .executing(() -> apiHttpClient().getSerializerService().toJsonByteArray(customerSignin)));

    }

    @Override
    public ApiHttpResponse<com.commercetools.api.models.customer.CustomerSignInResult> executeBlocking(
            final ApiHttpClient client, final Duration timeout) {
        return executeBlocking(client, timeout, com.commercetools.api.models.customer.CustomerSignInResult.class);
    }

    @Override
    public CompletableFuture<ApiHttpResponse<com.commercetools.api.models.customer.CustomerSignInResult>> execute(
            final ApiHttpClient client) {
        return execute(client, com.commercetools.api.models.customer.CustomerSignInResult.class);
    }

    public String getProjectKey() {
        return this.projectKey;
    }

    public void setProjectKey(final String projectKey) {
        this.projectKey = projectKey;
    }

    public com.commercetools.api.models.customer.CustomerSignin getBody() {
        return customerSignin;
    }

    public ByProjectKeyMeLoginPost withBody(com.commercetools.api.models.customer.CustomerSignin customerSignin) {
        ByProjectKeyMeLoginPost t = copy();
        t.customerSignin = customerSignin;
        return t;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ByProjectKeyMeLoginPost that = (ByProjectKeyMeLoginPost) o;

        return new EqualsBuilder().append(projectKey, that.projectKey)
                .append(customerSignin, that.customerSignin)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(projectKey).append(customerSignin).toHashCode();
    }

    @Override
    protected ByProjectKeyMeLoginPost copy() {
        return new ByProjectKeyMeLoginPost(this);
    }
}
