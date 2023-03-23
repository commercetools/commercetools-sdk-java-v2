
package com.commercetools.importapi.client;

import java.util.function.UnaryOperator;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyImportContainersByImportContainerKeyRequestBuilder {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;
    private final String importContainerKey;

    public ByProjectKeyImportContainersByImportContainerKeyRequestBuilder(final ApiHttpClient apiHttpClient,
            final String projectKey, final String importContainerKey) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
        this.importContainerKey = importContainerKey;
    }

    public ByProjectKeyImportContainersByImportContainerKeyPut put(
            com.commercetools.importapi.models.importcontainers.ImportContainerUpdateDraft importContainerUpdateDraft) {
        return new ByProjectKeyImportContainersByImportContainerKeyPut(apiHttpClient, projectKey, importContainerKey,
            importContainerUpdateDraft);
    }

    public ByProjectKeyImportContainersByImportContainerKeyPutString put(final String importContainerUpdateDraft) {
        return new ByProjectKeyImportContainersByImportContainerKeyPutString(apiHttpClient, projectKey,
            importContainerKey, importContainerUpdateDraft);
    }

    public ByProjectKeyImportContainersByImportContainerKeyPut put(
            UnaryOperator<com.commercetools.importapi.models.importcontainers.ImportContainerUpdateDraftBuilder> op) {
        return put(op.apply(com.commercetools.importapi.models.importcontainers.ImportContainerUpdateDraftBuilder.of())
                .build());
    }

    public ByProjectKeyImportContainersByImportContainerKeyGet get() {
        return new ByProjectKeyImportContainersByImportContainerKeyGet(apiHttpClient, projectKey, importContainerKey);
    }

    public ByProjectKeyImportContainersByImportContainerKeyDelete delete() {
        return new ByProjectKeyImportContainersByImportContainerKeyDelete(apiHttpClient, projectKey,
            importContainerKey);
    }

    public ByProjectKeyImportContainersByImportContainerKeyImportSummariesRequestBuilder importSummaries() {
        return new ByProjectKeyImportContainersByImportContainerKeyImportSummariesRequestBuilder(apiHttpClient,
            projectKey, importContainerKey);
    }

    public ByProjectKeyImportContainersByImportContainerKeyImportOperationsRequestBuilder importOperations() {
        return new ByProjectKeyImportContainersByImportContainerKeyImportOperationsRequestBuilder(apiHttpClient,
            projectKey, importContainerKey);
    }

}
