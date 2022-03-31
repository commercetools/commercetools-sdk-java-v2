
package com.commercetools.importapi.client;

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
*  <p>Creates a request for creating new ProductDrafts or updating existing ones.</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ByProjectKeyProductDraftsImportContainersByImportContainerKeyPost extends
        BodyApiMethod<ByProjectKeyProductDraftsImportContainersByImportContainerKeyPost, com.commercetools.importapi.models.importrequests.ImportResponse, com.commercetools.importapi.models.importrequests.ProductDraftImportRequest>
        implements
        com.commercetools.importapi.client.Secured_by_manage_productsTrait<ByProjectKeyProductDraftsImportContainersByImportContainerKeyPost> {

    private String projectKey;
    private String importContainerKey;

    private com.commercetools.importapi.models.importrequests.ProductDraftImportRequest productDraftImportRequest;

    public ByProjectKeyProductDraftsImportContainersByImportContainerKeyPost(final ApiHttpClient apiHttpClient,
            String projectKey, String importContainerKey,
            com.commercetools.importapi.models.importrequests.ProductDraftImportRequest productDraftImportRequest) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.importContainerKey = importContainerKey;
        this.productDraftImportRequest = productDraftImportRequest;
    }

    public ByProjectKeyProductDraftsImportContainersByImportContainerKeyPost(
            ByProjectKeyProductDraftsImportContainersByImportContainerKeyPost t) {
        super(t);
        this.projectKey = t.projectKey;
        this.importContainerKey = t.importContainerKey;
        this.productDraftImportRequest = t.productDraftImportRequest;
    }

    @Override
    protected ApiHttpRequest buildHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("/%s/product-drafts/import-containers/%s", this.projectKey,
            this.importContainerKey);
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }
        return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(),
            io.vrap.rmf.base.client.utils.json.JsonUtils.executing(
                () -> apiHttpClient().getSerializerService().toJsonByteArray(productDraftImportRequest)));

    }

    @Override
    public ApiHttpResponse<com.commercetools.importapi.models.importrequests.ImportResponse> executeBlocking(
            final ApiHttpClient client, final Duration timeout) {
        return executeBlocking(client, timeout, com.commercetools.importapi.models.importrequests.ImportResponse.class);
    }

    @Override
    public CompletableFuture<ApiHttpResponse<com.commercetools.importapi.models.importrequests.ImportResponse>> execute(
            final ApiHttpClient client) {
        return execute(client, com.commercetools.importapi.models.importrequests.ImportResponse.class);
    }

    public String getProjectKey() {
        return this.projectKey;
    }

    public String getImportContainerKey() {
        return this.importContainerKey;
    }

    public void setProjectKey(final String projectKey) {
        this.projectKey = projectKey;
    }

    public void setImportContainerKey(final String importContainerKey) {
        this.importContainerKey = importContainerKey;
    }

    public com.commercetools.importapi.models.importrequests.ProductDraftImportRequest getBody() {
        return productDraftImportRequest;
    }

    public ByProjectKeyProductDraftsImportContainersByImportContainerKeyPost withBody(
            com.commercetools.importapi.models.importrequests.ProductDraftImportRequest productDraftImportRequest) {
        ByProjectKeyProductDraftsImportContainersByImportContainerKeyPost t = copy();
        t.productDraftImportRequest = productDraftImportRequest;
        return t;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ByProjectKeyProductDraftsImportContainersByImportContainerKeyPost that = (ByProjectKeyProductDraftsImportContainersByImportContainerKeyPost) o;

        return new EqualsBuilder().append(projectKey, that.projectKey)
                .append(importContainerKey, that.importContainerKey)
                .append(productDraftImportRequest, that.productDraftImportRequest)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(projectKey)
                .append(importContainerKey)
                .append(productDraftImportRequest)
                .toHashCode();
    }

    @Override
    protected ByProjectKeyProductDraftsImportContainersByImportContainerKeyPost copy() {
        return new ByProjectKeyProductDraftsImportContainersByImportContainerKeyPost(this);
    }
}
