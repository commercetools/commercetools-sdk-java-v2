
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
public class ByProjectKeyInStoreKeyByStoreKeyMeLoginPost extends
        BodyApiMethod<ByProjectKeyInStoreKeyByStoreKeyMeLoginPost, com.commercetools.api.models.customer.CustomerSignInResult, com.commercetools.api.models.customer.CustomerSignin>
        implements com.commercetools.api.client.ErrorableTrait<ByProjectKeyInStoreKeyByStoreKeyMeLoginPost> {

    private String projectKey;
    private String storeKey;

    private com.commercetools.api.models.customer.CustomerSignin customerSignin;

    public ByProjectKeyInStoreKeyByStoreKeyMeLoginPost(final ApiHttpClient apiHttpClient, String projectKey,
            String storeKey, com.commercetools.api.models.customer.CustomerSignin customerSignin) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.storeKey = storeKey;
        this.customerSignin = customerSignin;
    }

    public ByProjectKeyInStoreKeyByStoreKeyMeLoginPost(ByProjectKeyInStoreKeyByStoreKeyMeLoginPost t) {
        super(t);
        this.projectKey = t.projectKey;
        this.storeKey = t.storeKey;
        this.customerSignin = t.customerSignin;
    }

    @Override
    protected ApiHttpRequest buildHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("/%s/in-store/key=%s/me/login", this.projectKey, this.storeKey);
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

    public String getStoreKey() {
        return this.storeKey;
    }

    public void setProjectKey(final String projectKey) {
        this.projectKey = projectKey;
    }

    public void setStoreKey(final String storeKey) {
        this.storeKey = storeKey;
    }

    public com.commercetools.api.models.customer.CustomerSignin getBody() {
        return customerSignin;
    }

    public ByProjectKeyInStoreKeyByStoreKeyMeLoginPost withBody(
            com.commercetools.api.models.customer.CustomerSignin customerSignin) {
        ByProjectKeyInStoreKeyByStoreKeyMeLoginPost t = copy();
        t.customerSignin = customerSignin;
        return t;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ByProjectKeyInStoreKeyByStoreKeyMeLoginPost that = (ByProjectKeyInStoreKeyByStoreKeyMeLoginPost) o;

        return new EqualsBuilder().append(projectKey, that.projectKey)
                .append(storeKey, that.storeKey)
                .append(customerSignin, that.customerSignin)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(projectKey).append(storeKey).append(customerSignin).toHashCode();
    }

    @Override
    protected ByProjectKeyInStoreKeyByStoreKeyMeLoginPost copy() {
        return new ByProjectKeyInStoreKeyByStoreKeyMeLoginPost(this);
    }
}
