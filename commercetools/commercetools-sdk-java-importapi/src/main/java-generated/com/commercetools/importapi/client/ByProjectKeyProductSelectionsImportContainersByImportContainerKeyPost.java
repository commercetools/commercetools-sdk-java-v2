
package com.commercetools.importapi.client;

import java.net.URI;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;

import com.fasterxml.jackson.core.type.TypeReference;

import io.vrap.rmf.base.client.*;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 *  <p>Creates an Import Request for Product Selections.</p>
 *
 * <hr>
 * <div class=code-example>
 * <pre><code class='java'>{@code
 *   CompletableFuture<ApiHttpResponse<com.commercetools.importapi.models.importrequests.ImportResponse>> result = apiRoot
 *            .withProjectKeyValue("{projectKey}")
 *            .productSelections()
 *            .importContainers()
 *            .withImportContainerKeyValue("{importContainerKey}")
 *            .post(null)
 *            .execute()
 * }</code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyProductSelectionsImportContainersByImportContainerKeyPost extends
        TypeBodyApiMethod<ByProjectKeyProductSelectionsImportContainersByImportContainerKeyPost, com.commercetools.importapi.models.importrequests.ImportResponse, com.commercetools.importapi.models.importrequests.ProductSelectionImportRequest>
        implements
        com.commercetools.importapi.client.Secured_by_manage_product_selectionsTrait<ByProjectKeyProductSelectionsImportContainersByImportContainerKeyPost> {

    @Override
    public TypeReference<com.commercetools.importapi.models.importrequests.ImportResponse> resultType() {
        return new TypeReference<com.commercetools.importapi.models.importrequests.ImportResponse>() {
        };
    }

    private String projectKey;
    private String importContainerKey;

    private com.commercetools.importapi.models.importrequests.ProductSelectionImportRequest productSelectionImportRequest;

    public ByProjectKeyProductSelectionsImportContainersByImportContainerKeyPost(final ApiHttpClient apiHttpClient,
            String projectKey, String importContainerKey,
            com.commercetools.importapi.models.importrequests.ProductSelectionImportRequest productSelectionImportRequest) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.importContainerKey = importContainerKey;
        this.productSelectionImportRequest = productSelectionImportRequest;
    }

    public ByProjectKeyProductSelectionsImportContainersByImportContainerKeyPost(
            ByProjectKeyProductSelectionsImportContainersByImportContainerKeyPost t) {
        super(t);
        this.projectKey = t.projectKey;
        this.importContainerKey = t.importContainerKey;
        this.productSelectionImportRequest = t.productSelectionImportRequest;
    }

    @Override
    protected ApiHttpRequest buildHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("%s/product-selections/import-containers/%s",
            encodePathParam(this.projectKey), encodePathParam(this.importContainerKey));
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }
        return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(),
            io.vrap.rmf.base.client.utils.json.JsonUtils.executing(
                () -> apiHttpClient().getSerializerService().toJsonByteArray(productSelectionImportRequest)));

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

    public com.commercetools.importapi.models.importrequests.ProductSelectionImportRequest getBody() {
        return productSelectionImportRequest;
    }

    public ByProjectKeyProductSelectionsImportContainersByImportContainerKeyPost withBody(
            com.commercetools.importapi.models.importrequests.ProductSelectionImportRequest productSelectionImportRequest) {
        ByProjectKeyProductSelectionsImportContainersByImportContainerKeyPost t = copy();
        t.productSelectionImportRequest = productSelectionImportRequest;
        return t;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ByProjectKeyProductSelectionsImportContainersByImportContainerKeyPost that = (ByProjectKeyProductSelectionsImportContainersByImportContainerKeyPost) o;

        return new EqualsBuilder().append(projectKey, that.projectKey)
                .append(importContainerKey, that.importContainerKey)
                .append(productSelectionImportRequest, that.productSelectionImportRequest)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(projectKey)
                .append(importContainerKey)
                .append(productSelectionImportRequest)
                .toHashCode();
    }

    @Override
    protected ByProjectKeyProductSelectionsImportContainersByImportContainerKeyPost copy() {
        return new ByProjectKeyProductSelectionsImportContainersByImportContainerKeyPost(this);
    }
}
