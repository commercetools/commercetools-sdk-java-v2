
package com.commercetools.importapi.client;

import java.util.function.UnaryOperator;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyImportContainersRequestBuilder {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;

    public ByProjectKeyImportContainersRequestBuilder(final ApiHttpClient apiHttpClient, final String projectKey) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
    }

    public ByProjectKeyImportContainersPost post(
            com.commercetools.importapi.models.importcontainers.ImportContainerDraft importContainerDraft) {
        return new ByProjectKeyImportContainersPost(apiHttpClient, projectKey, importContainerDraft);
    }

    public ByProjectKeyImportContainersPost post(
            UnaryOperator<com.commercetools.importapi.models.importcontainers.ImportContainerDraftBuilder> op) {
        return post(
            op.apply(com.commercetools.importapi.models.importcontainers.ImportContainerDraftBuilder.of()).build());
    }

    public ByProjectKeyImportContainersGet get() {
        return new ByProjectKeyImportContainersGet(apiHttpClient, projectKey);
    }

    public ByProjectKeyImportContainersByImportContainerKeyRequestBuilder withImportContainerKeyValue(
            String importContainerKey) {
        return new ByProjectKeyImportContainersByImportContainerKeyRequestBuilder(apiHttpClient, projectKey,
            importContainerKey);
    }

}
