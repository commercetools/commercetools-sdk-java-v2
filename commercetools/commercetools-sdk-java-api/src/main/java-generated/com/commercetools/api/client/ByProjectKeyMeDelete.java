
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
*  <p>Delete my Customer</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ByProjectKeyMeDelete extends ApiMethod<ByProjectKeyMeDelete, com.commercetools.api.models.me.MyCustomer>
        implements com.commercetools.api.client.VersionedTrait<ByProjectKeyMeDelete>,
        com.commercetools.api.client.ConflictingTrait<ByProjectKeyMeDelete>,
        com.commercetools.api.client.ErrorableTrait<ByProjectKeyMeDelete>,
        com.commercetools.api.client.DeprecatableTrait<ByProjectKeyMeDelete> {

    private String projectKey;

    public ByProjectKeyMeDelete(final ApiHttpClient apiHttpClient, String projectKey) {
        super(apiHttpClient);
        this.projectKey = projectKey;
    }

    public ByProjectKeyMeDelete(ByProjectKeyMeDelete t) {
        super(t);
        this.projectKey = t.projectKey;
    }

    @Override
    public ApiHttpRequest createHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("/%s/me", this.projectKey);
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }

        return new ApiHttpRequest(ApiHttpMethod.DELETE, URI.create(httpRequestPath), getHeaders(), null);
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

    public List<String> getVersion() {
        return this.getQueryParam("version");
    }

    public void setProjectKey(final String projectKey) {
        this.projectKey = projectKey;
    }

    public ByProjectKeyMeDelete withVersion(final Long version) {
        return copy().withQueryParam("version", version);
    }

    public ByProjectKeyMeDelete addVersion(final Long version) {
        return copy().addQueryParam("version", version);
    }

    @Override
    protected ByProjectKeyMeDelete copy() {
        return new ByProjectKeyMeDelete(this);
    }
}
