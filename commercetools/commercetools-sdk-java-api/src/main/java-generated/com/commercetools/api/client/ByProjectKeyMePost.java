
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
*  <p>Update my customer</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ByProjectKeyMePost extends ApiMethod<ByProjectKeyMePost, com.commercetools.api.models.me.MyCustomer>
        implements com.commercetools.api.client.ErrorableTrait<ByProjectKeyMePost>,
        com.commercetools.api.client.DeprecatableTrait<ByProjectKeyMePost> {

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
    public ApiHttpRequest createHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("/%s/me", this.projectKey);
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }
        try {
            final byte[] body = apiHttpClient().getSerializerService().toJsonByteArray(myCustomerUpdate);
            return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(), body);
        }
        catch (Exception e) {
            e.printStackTrace();
        }

        return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(), null);
    }

    @Override
    public ApiHttpResponse<com.commercetools.api.models.me.MyCustomer> executeBlocking(Duration timeout) {
        return blockingWait(execute(), timeout);
    }

    @Override
    public CompletableFuture<ApiHttpResponse<com.commercetools.api.models.me.MyCustomer>> execute() {
        return apiHttpClient().execute(this.createHttpRequest(), com.commercetools.api.models.me.MyCustomer.class);
    }

    public String getProjectKey() {
        return this.projectKey;
    }

    public void setProjectKey(final String projectKey) {
        this.projectKey = projectKey;
    }

    @Override
    protected ByProjectKeyMePost copy() {
        return new ByProjectKeyMePost(this);
    }
}
