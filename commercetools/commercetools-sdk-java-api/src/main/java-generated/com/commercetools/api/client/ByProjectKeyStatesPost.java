
package com.commercetools.api.client;

import static io.vrap.rmf.base.client.utils.ClientUtils.blockingWait;

import java.net.URI;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;

import io.vrap.rmf.base.client.*;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ByProjectKeyStatesPost extends ApiMethod<ByProjectKeyStatesPost, com.commercetools.api.models.state.State>
        implements com.commercetools.api.client.ExpandableTrait<ByProjectKeyStatesPost>,
        com.commercetools.api.client.Deprecatable201Trait<ByProjectKeyStatesPost>,
        com.commercetools.api.client.ErrorableTrait<ByProjectKeyStatesPost> {

    private String projectKey;

    private com.commercetools.api.models.state.StateDraft stateDraft;

    public ByProjectKeyStatesPost(final ApiHttpClient apiHttpClient, String projectKey,
            com.commercetools.api.models.state.StateDraft stateDraft) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.stateDraft = stateDraft;
    }

    public ByProjectKeyStatesPost(ByProjectKeyStatesPost t) {
        super(t);
        this.projectKey = t.projectKey;
        this.stateDraft = t.stateDraft;
    }

    @Override
    public ApiHttpRequest createHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("/%s/states", this.projectKey);
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }
        try {
            final byte[] body = apiHttpClient().getSerializerService().toJsonByteArray(stateDraft);
            return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(), body);
        }
        catch (Exception e) {
            e.printStackTrace();
        }

        return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(), null);
    }

    @Override
    public ApiHttpResponse<com.commercetools.api.models.state.State> executeBlocking(final ApiHttpClient client,
            Duration timeout) {
        ApiHttpRequest request = this.createHttpRequest();
        return blockingWait(client.execute(request, com.commercetools.api.models.state.State.class), request, timeout);
    }

    @Override
    public CompletableFuture<ApiHttpResponse<com.commercetools.api.models.state.State>> execute(
            final ApiHttpClient client) {
        return client.execute(this.createHttpRequest(), com.commercetools.api.models.state.State.class);
    }

    public String getProjectKey() {
        return this.projectKey;
    }

    public List<String> getExpand() {
        return this.getQueryParam("expand");
    }

    public void setProjectKey(final String projectKey) {
        this.projectKey = projectKey;
    }

    /**
     * set expand with the specificied value
     */
    public ByProjectKeyStatesPost withExpand(final String expand) {
        return copy().withQueryParam("expand", expand);
    }

    /**
     * add additional expand query parameter
     */
    public ByProjectKeyStatesPost addExpand(final String expand) {
        return copy().addQueryParam("expand", expand);
    }

    @Override
    protected ByProjectKeyStatesPost copy() {
        return new ByProjectKeyStatesPost(this);
    }
}
