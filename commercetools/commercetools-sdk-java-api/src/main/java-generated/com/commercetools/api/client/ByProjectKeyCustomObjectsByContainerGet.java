
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
public class ByProjectKeyCustomObjectsByContainerGet extends
        ApiMethod<ByProjectKeyCustomObjectsByContainerGet, com.commercetools.api.models.custom_object.CustomObjectPagedQueryResponse>
        implements com.commercetools.api.client.QueryTrait<ByProjectKeyCustomObjectsByContainerGet>,
        com.commercetools.api.client.ExpandableTrait<ByProjectKeyCustomObjectsByContainerGet>,
        com.commercetools.api.client.ErrorableTrait<ByProjectKeyCustomObjectsByContainerGet>,
        com.commercetools.api.client.Deprecatable200Trait<ByProjectKeyCustomObjectsByContainerGet> {

    private String projectKey;
    private String container;

    public ByProjectKeyCustomObjectsByContainerGet(final ApiHttpClient apiHttpClient, String projectKey,
            String container) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.container = container;
    }

    public ByProjectKeyCustomObjectsByContainerGet(ByProjectKeyCustomObjectsByContainerGet t) {
        super(t);
        this.projectKey = t.projectKey;
        this.container = t.container;
    }

    @Override
    public ApiHttpRequest createHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("/%s/custom-objects/%s", this.projectKey, this.container);
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }

        return new ApiHttpRequest(ApiHttpMethod.GET, URI.create(httpRequestPath), getHeaders(), null);
    }

    @Override
    public ApiHttpResponse<com.commercetools.api.models.custom_object.CustomObjectPagedQueryResponse> executeBlocking(
            final ApiHttpClient client, Duration timeout) {
        ApiHttpRequest request = this.createHttpRequest();
        return blockingWait(
            client.execute(request, com.commercetools.api.models.custom_object.CustomObjectPagedQueryResponse.class),
            request, timeout);
    }

    @Override
    public CompletableFuture<ApiHttpResponse<com.commercetools.api.models.custom_object.CustomObjectPagedQueryResponse>> execute(
            final ApiHttpClient client) {
        return client.execute(this.createHttpRequest(),
            com.commercetools.api.models.custom_object.CustomObjectPagedQueryResponse.class);
    }

    public String getProjectKey() {
        return this.projectKey;
    }

    public String getContainer() {
        return this.container;
    }

    public List<String> getWhere() {
        return this.getQueryParam("where");
    }

    public List<String> getExpand() {
        return this.getQueryParam("expand");
    }

    public void setProjectKey(final String projectKey) {
        this.projectKey = projectKey;
    }

    public void setContainer(final String container) {
        this.container = container;
    }

    /**
     * set where with the specificied value
     */
    public ByProjectKeyCustomObjectsByContainerGet withWhere(final String where) {
        return copy().withQueryParam("where", where);
    }

    /**
     * add additional where query parameter
     */
    public ByProjectKeyCustomObjectsByContainerGet addWhere(final String where) {
        return copy().addQueryParam("where", where);
    }

    /**
     * set expand with the specificied value
     */
    public ByProjectKeyCustomObjectsByContainerGet withExpand(final String expand) {
        return copy().withQueryParam("expand", expand);
    }

    /**
     * add additional expand query parameter
     */
    public ByProjectKeyCustomObjectsByContainerGet addExpand(final String expand) {
        return copy().addQueryParam("expand", expand);
    }

    /**
     * set predicateVar with the specificied value
     */
    public ByProjectKeyCustomObjectsByContainerGet withPredicateVar(final String varName, final String predicateVar) {
        return copy().withQueryParam(String.format("var.%s", varName), predicateVar);
    }

    /**
     * add additional predicateVar query parameter
     */
    public ByProjectKeyCustomObjectsByContainerGet addPredicateVar(final String varName, final String predicateVar) {
        return copy().addQueryParam(String.format("var.%s", varName), predicateVar);
    }

    @Override
    protected ByProjectKeyCustomObjectsByContainerGet copy() {
        return new ByProjectKeyCustomObjectsByContainerGet(this);
    }
}
