
package com.commercetools.importapi.client;

import static io.vrap.rmf.base.client.utils.ClientUtils.blockingWait;

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
*  <p>Updates the import container given by the key.</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ByProjectKeyImportContainersByImportContainerKeyPut extends
        ApiMethod<ByProjectKeyImportContainersByImportContainerKeyPut, com.commercetools.importapi.models.importcontainers.ImportContainer>
        implements
        com.commercetools.importapi.client.Secured_by_manage_import_containersTrait<ByProjectKeyImportContainersByImportContainerKeyPut> {

    private String projectKey;
    private String importContainerKey;

    private com.commercetools.importapi.models.importcontainers.ImportContainerUpdateDraft importContainerUpdateDraft;

    public ByProjectKeyImportContainersByImportContainerKeyPut(final ApiHttpClient apiHttpClient, String projectKey,
            String importContainerKey,
            com.commercetools.importapi.models.importcontainers.ImportContainerUpdateDraft importContainerUpdateDraft) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.importContainerKey = importContainerKey;
        this.importContainerUpdateDraft = importContainerUpdateDraft;
    }

    public ByProjectKeyImportContainersByImportContainerKeyPut(ByProjectKeyImportContainersByImportContainerKeyPut t) {
        super(t);
        this.projectKey = t.projectKey;
        this.importContainerKey = t.importContainerKey;
        this.importContainerUpdateDraft = t.importContainerUpdateDraft;
    }

    @Override
    public ApiHttpRequest createHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("/%s/import-containers/%s", this.projectKey, this.importContainerKey);
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }
        try {
            final byte[] body = apiHttpClient().getSerializerService().toJsonByteArray(importContainerUpdateDraft);
            return new ApiHttpRequest(ApiHttpMethod.PUT, URI.create(httpRequestPath), getHeaders(), body);
        }
        catch (Exception e) {
            e.printStackTrace();
        }

        return new ApiHttpRequest(ApiHttpMethod.PUT, URI.create(httpRequestPath), getHeaders(), null);
    }

    @Override
    public ApiHttpResponse<com.commercetools.importapi.models.importcontainers.ImportContainer> executeBlocking(
            final ApiHttpClient client, Duration timeout) {
        ApiHttpRequest request = this.createHttpRequest();
        return blockingWait(
            client.execute(request, com.commercetools.importapi.models.importcontainers.ImportContainer.class)
                    .toCompletableFuture(),
            request, timeout);
    }

    @Override
    public CompletableFuture<ApiHttpResponse<com.commercetools.importapi.models.importcontainers.ImportContainer>> execute(
            final ApiHttpClient client) {
        return client
                .execute(this.createHttpRequest(),
                    com.commercetools.importapi.models.importcontainers.ImportContainer.class)
                .toCompletableFuture();
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

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ByProjectKeyImportContainersByImportContainerKeyPut that = (ByProjectKeyImportContainersByImportContainerKeyPut) o;

        return new EqualsBuilder().append(projectKey, that.projectKey)
                .append(importContainerKey, that.importContainerKey)
                .append(importContainerUpdateDraft, that.importContainerUpdateDraft)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(projectKey)
                .append(importContainerKey)
                .append(importContainerUpdateDraft)
                .toHashCode();
    }

    @Override
    protected ByProjectKeyImportContainersByImportContainerKeyPut copy() {
        return new ByProjectKeyImportContainersByImportContainerKeyPut(this);
    }
}