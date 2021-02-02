
package com.commercetools.api.client;

import static io.vrap.rmf.base.client.utils.ClientUtils.blockingWait;

import java.net.URI;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;

import io.vrap.rmf.base.client.*;
import io.vrap.rmf.base.client.utils.Generated;

/**
*  <p>Verifies customer's email using a token.</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ByProjectKeyInStoreKeyByStoreKeyCustomersEmailConfirmPost extends
        ApiMethod<ByProjectKeyInStoreKeyByStoreKeyCustomersEmailConfirmPost, com.fasterxml.jackson.databind.JsonNode>
        implements
        com.commercetools.api.client.ErrorableTrait<ByProjectKeyInStoreKeyByStoreKeyCustomersEmailConfirmPost>,
        com.commercetools.api.client.DeprecatableTrait<ByProjectKeyInStoreKeyByStoreKeyCustomersEmailConfirmPost> {

    private String projectKey;
    private String storeKey;

    private com.commercetools.api.models.customer.CustomerEmailVerify customerEmailVerify;

    public ByProjectKeyInStoreKeyByStoreKeyCustomersEmailConfirmPost(final ApiHttpClient apiHttpClient,
            String projectKey, String storeKey,
            com.commercetools.api.models.customer.CustomerEmailVerify customerEmailVerify) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.storeKey = storeKey;
        this.customerEmailVerify = customerEmailVerify;
    }

    public ByProjectKeyInStoreKeyByStoreKeyCustomersEmailConfirmPost(
            ByProjectKeyInStoreKeyByStoreKeyCustomersEmailConfirmPost t) {
        super(t);
        this.projectKey = t.projectKey;
        this.storeKey = t.storeKey;
        this.customerEmailVerify = t.customerEmailVerify;
    }

    @Override
    public ApiHttpRequest createHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("/%s/in-store/key=%s/customers/email/confirm", this.projectKey,
            this.storeKey);
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }
        try {
            final byte[] body = apiHttpClient().getSerializerService().toJsonByteArray(customerEmailVerify);
            return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(), body);
        }
        catch (Exception e) {
            e.printStackTrace();
        }

        return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(), null);
    }

    @Override
    public ApiHttpResponse<com.fasterxml.jackson.databind.JsonNode> executeBlocking(Duration timeout) {
        return blockingWait(execute(), timeout);
    }

    @Override
    public CompletableFuture<ApiHttpResponse<com.fasterxml.jackson.databind.JsonNode>> execute() {
        return apiHttpClient().execute(this.createHttpRequest(), com.fasterxml.jackson.databind.JsonNode.class);
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

    @Override
    protected ByProjectKeyInStoreKeyByStoreKeyCustomersEmailConfirmPost copy() {
        return new ByProjectKeyInStoreKeyByStoreKeyCustomersEmailConfirmPost(this);
    }
}
