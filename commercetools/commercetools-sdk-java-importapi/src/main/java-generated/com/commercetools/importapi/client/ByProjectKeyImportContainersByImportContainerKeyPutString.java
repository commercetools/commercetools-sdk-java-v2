
package com.commercetools.importapi.client;

import java.net.URI;
import java.nio.charset.StandardCharsets;
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
 *  <p>Updates the Import Container given by the key.</p>
 *
 * <hr>
 * <div class=code-example>
 * <pre><code class='java'>{@code
 *   CompletableFuture<ApiHttpResponse<com.commercetools.importapi.models.importcontainers.ImportContainer>> result = apiRoot
 *            .withProjectKeyValue("{projectKey}")
 *            .importContainers()
 *            .withImportContainerKeyValue("{importContainerKey}")
 *            .put("")
 *            .execute()
 * }</code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyImportContainersByImportContainerKeyPutString extends
        StringBodyApiMethod<ByProjectKeyImportContainersByImportContainerKeyPutString, com.commercetools.importapi.models.importcontainers.ImportContainer>
        implements
        com.commercetools.importapi.client.Secured_by_manage_import_containersTrait<ByProjectKeyImportContainersByImportContainerKeyPutString> {

    @Override
    public TypeReference<com.commercetools.importapi.models.importcontainers.ImportContainer> resultType() {
        return new TypeReference<com.commercetools.importapi.models.importcontainers.ImportContainer>() {
        };
    }

    private String projectKey;
    private String importContainerKey;

    private String importContainerUpdateDraft;

    public ByProjectKeyImportContainersByImportContainerKeyPutString(final ApiHttpClient apiHttpClient,
            String projectKey, String importContainerKey, String importContainerUpdateDraft) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.importContainerKey = importContainerKey;
        this.importContainerUpdateDraft = importContainerUpdateDraft;
    }

    public ByProjectKeyImportContainersByImportContainerKeyPutString(
            ByProjectKeyImportContainersByImportContainerKeyPutString t) {
        super(t);
        this.projectKey = t.projectKey;
        this.importContainerKey = t.importContainerKey;
        this.importContainerUpdateDraft = t.importContainerUpdateDraft;
    }

    @Override
    protected ApiHttpRequest buildHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("%s/import-containers/%s", this.projectKey, this.importContainerKey);
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }
        return new ApiHttpRequest(ApiHttpMethod.PUT, URI.create(httpRequestPath), getHeaders(),
            importContainerUpdateDraft.getBytes(StandardCharsets.UTF_8));

    }

    @Override
    public ApiHttpResponse<com.commercetools.importapi.models.importcontainers.ImportContainer> executeBlocking(
            final ApiHttpClient client, final Duration timeout) {
        return executeBlocking(client, timeout,
            com.commercetools.importapi.models.importcontainers.ImportContainer.class);
    }

    @Override
    public CompletableFuture<ApiHttpResponse<com.commercetools.importapi.models.importcontainers.ImportContainer>> execute(
            final ApiHttpClient client) {
        return execute(client, com.commercetools.importapi.models.importcontainers.ImportContainer.class);
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

    public String getBody() {
        return importContainerUpdateDraft;
    }

    public ByProjectKeyImportContainersByImportContainerKeyPutString withBody(String importContainerUpdateDraft) {
        ByProjectKeyImportContainersByImportContainerKeyPutString t = copy();
        t.importContainerUpdateDraft = importContainerUpdateDraft;
        return t;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ByProjectKeyImportContainersByImportContainerKeyPutString that = (ByProjectKeyImportContainersByImportContainerKeyPutString) o;

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
    protected ByProjectKeyImportContainersByImportContainerKeyPutString copy() {
        return new ByProjectKeyImportContainersByImportContainerKeyPutString(this);
    }
}
