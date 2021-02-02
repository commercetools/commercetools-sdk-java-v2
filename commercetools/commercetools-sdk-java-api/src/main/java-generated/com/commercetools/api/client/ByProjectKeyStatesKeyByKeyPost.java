
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
*  <p>Update State by Key</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ByProjectKeyStatesKeyByKeyPost
        extends ApiMethod<ByProjectKeyStatesKeyByKeyPost, com.commercetools.api.models.state.State>
        implements com.commercetools.api.client.ConflictingTrait<ByProjectKeyStatesKeyByKeyPost>,
        com.commercetools.api.client.ExpandableTrait<ByProjectKeyStatesKeyByKeyPost>,
        com.commercetools.api.client.ErrorableTrait<ByProjectKeyStatesKeyByKeyPost>,
        com.commercetools.api.client.DeprecatableTrait<ByProjectKeyStatesKeyByKeyPost> {

    private String projectKey;
    private String key;

    private com.commercetools.api.models.state.StateUpdate stateUpdate;

    public ByProjectKeyStatesKeyByKeyPost(final ApiHttpClient apiHttpClient, String projectKey, String key,
            com.commercetools.api.models.state.StateUpdate stateUpdate) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.key = key;
        this.stateUpdate = stateUpdate;
    }

    public ByProjectKeyStatesKeyByKeyPost(ByProjectKeyStatesKeyByKeyPost t) {
        super(t);
        this.projectKey = t.projectKey;
        this.key = t.key;
        this.stateUpdate = t.stateUpdate;
    }

    @Override
    public ApiHttpRequest createHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("/%s/states/key=%s", this.projectKey, this.key);
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }
        try {
            final byte[] body = apiHttpClient().getSerializerService().toJsonByteArray(stateUpdate);
            return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(), body);
        }
        catch (Exception e) {
            e.printStackTrace();
        }

        return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(), null);
    }

    @Override
    public ApiHttpResponse<com.commercetools.api.models.state.State> executeBlocking(Duration timeout) {
        return blockingWait(execute(), timeout);
    }

    @Override
    public CompletableFuture<ApiHttpResponse<com.commercetools.api.models.state.State>> execute() {
        return apiHttpClient().execute(this.createHttpRequest(), com.commercetools.api.models.state.State.class);
    }

    public String getProjectKey() {
        return this.projectKey;
    }

    public String getKey() {
        return this.key;
    }

    public List<String> getExpand() {
        return this.getQueryParam("expand");
    }

    public void setProjectKey(final String projectKey) {
        this.projectKey = projectKey;
    }

    public void setKey(final String key) {
        this.key = key;
    }

    public ByProjectKeyStatesKeyByKeyPost withExpand(final String expand) {
        return copy().withQueryParam("expand", expand);
    }

    public ByProjectKeyStatesKeyByKeyPost addExpand(final String expand) {
        return copy().addQueryParam("expand", expand);
    }

    @Override
    protected ByProjectKeyStatesKeyByKeyPost copy() {
        return new ByProjectKeyStatesKeyByKeyPost(this);
    }
}
