
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
*  <p>Creates a request for creating new ProductVariants or updating existing ones.</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ByProjectKeyProductVariantsImportContainersByImportContainerKeyPost extends
        BodyApiMethod<ByProjectKeyProductVariantsImportContainersByImportContainerKeyPost, com.commercetools.importapi.models.importrequests.ImportResponse, com.commercetools.importapi.models.importrequests.ProductVariantImportRequest>
        implements
        com.commercetools.importapi.client.Secured_by_manage_productsTrait<ByProjectKeyProductVariantsImportContainersByImportContainerKeyPost> {

    private String projectKey;
    private String importContainerKey;

    private com.commercetools.importapi.models.importrequests.ProductVariantImportRequest productVariantImportRequest;

    public ByProjectKeyProductVariantsImportContainersByImportContainerKeyPost(final ApiHttpClient apiHttpClient,
            String projectKey, String importContainerKey,
            com.commercetools.importapi.models.importrequests.ProductVariantImportRequest productVariantImportRequest) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.importContainerKey = importContainerKey;
        this.productVariantImportRequest = productVariantImportRequest;
    }

    public ByProjectKeyProductVariantsImportContainersByImportContainerKeyPost(
            ByProjectKeyProductVariantsImportContainersByImportContainerKeyPost t) {
        super(t);
        this.projectKey = t.projectKey;
        this.importContainerKey = t.importContainerKey;
        this.productVariantImportRequest = t.productVariantImportRequest;
    }

    @Override
    protected ApiHttpRequest buildHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("/%s/product-variants/import-containers/%s", this.projectKey,
            this.importContainerKey);
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }
        return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(),
            io.vrap.rmf.base.client.utils.json.JsonUtils.executing(
                () -> apiHttpClient().getSerializerService().toJsonByteArray(productVariantImportRequest)));

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

    public com.commercetools.importapi.models.importrequests.ProductVariantImportRequest getBody() {
        return productVariantImportRequest;
    }

    public ByProjectKeyProductVariantsImportContainersByImportContainerKeyPost withBody(
            com.commercetools.importapi.models.importrequests.ProductVariantImportRequest productVariantImportRequest) {
        ByProjectKeyProductVariantsImportContainersByImportContainerKeyPost t = copy();
        t.productVariantImportRequest = productVariantImportRequest;
        return t;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ByProjectKeyProductVariantsImportContainersByImportContainerKeyPost that = (ByProjectKeyProductVariantsImportContainersByImportContainerKeyPost) o;

        return new EqualsBuilder().append(projectKey, that.projectKey)
                .append(importContainerKey, that.importContainerKey)
                .append(productVariantImportRequest, that.productVariantImportRequest)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(projectKey)
                .append(importContainerKey)
                .append(productVariantImportRequest)
                .toHashCode();
    }

    @Override
    protected ByProjectKeyProductVariantsImportContainersByImportContainerKeyPost copy() {
        return new ByProjectKeyProductVariantsImportContainersByImportContainerKeyPost(this);
    }
}
