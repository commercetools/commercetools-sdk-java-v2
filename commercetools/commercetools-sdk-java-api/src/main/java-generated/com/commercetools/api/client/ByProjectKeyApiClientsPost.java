
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
public class ByProjectKeyApiClientsPost
        extends ApiMethod<ByProjectKeyApiClientsPost, com.commercetools.api.models.api_client.ApiClient>
        implements com.commercetools.api.client.ExpandableTrait<ByProjectKeyApiClientsPost>,
        com.commercetools.api.client.Deprecatable201Trait<ByProjectKeyApiClientsPost>,
        com.commercetools.api.client.ErrorableTrait<ByProjectKeyApiClientsPost> {

    private String projectKey;

    private com.commercetools.api.models.api_client.ApiClientDraft apiClientDraft;

    public ByProjectKeyApiClientsPost(final ApiHttpClient apiHttpClient, String projectKey,
            com.commercetools.api.models.api_client.ApiClientDraft apiClientDraft) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.apiClientDraft = apiClientDraft;
    }

    public ByProjectKeyApiClientsPost(ByProjectKeyApiClientsPost t) {
        super(t);
        this.projectKey = t.projectKey;
        this.apiClientDraft = t.apiClientDraft;
    }

    @Override
    public ApiHttpRequest createHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("/%s/api-clients", this.projectKey);
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }
        try {
            final byte[] body = apiHttpClient().getSerializerService().toJsonByteArray(apiClientDraft);
            return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(), body);
        }
        catch (Exception e) {
            e.printStackTrace();
        }

        return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(), null);
    }

    @Override
    public ApiHttpResponse<com.commercetools.api.models.api_client.ApiClient> executeBlocking(
            final ApiHttpClient client, Duration timeout) {
        ApiHttpRequest request = this.createHttpRequest();
        return blockingWait(client.execute(request, com.commercetools.api.models.api_client.ApiClient.class), request,
            timeout);
    }

    @Override
    public CompletableFuture<ApiHttpResponse<com.commercetools.api.models.api_client.ApiClient>> execute(
            final ApiHttpClient client) {
        return client.execute(this.createHttpRequest(), com.commercetools.api.models.api_client.ApiClient.class);
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
    public ByProjectKeyApiClientsPost withExpand(final String expand) {
        return copy().withQueryParam("expand", expand);
    }

    /**
     * add additional expand query parameter
     */
    public ByProjectKeyApiClientsPost addExpand(final String expand) {
        return copy().addQueryParam("expand", expand);
    }

    @Override
    protected ByProjectKeyApiClientsPost copy() {
        return new ByProjectKeyApiClientsPost(this);
    }
}
