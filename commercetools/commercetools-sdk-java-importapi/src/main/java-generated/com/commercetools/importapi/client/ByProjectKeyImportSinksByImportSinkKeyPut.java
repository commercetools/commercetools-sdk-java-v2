
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
*  <p>Updates the import sink given by the key.</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ByProjectKeyImportSinksByImportSinkKeyPut extends
        BodyApiMethod<ByProjectKeyImportSinksByImportSinkKeyPut, com.commercetools.importapi.models.importsinks.ImportSink, com.commercetools.importapi.models.importsinks.ImportSinkUpdateDraft>
        implements
        com.commercetools.importapi.client.Secured_by_manage_import_sinksTrait<ByProjectKeyImportSinksByImportSinkKeyPut> {

    private String projectKey;
    private String importSinkKey;

    private com.commercetools.importapi.models.importsinks.ImportSinkUpdateDraft importSinkUpdateDraft;

    public ByProjectKeyImportSinksByImportSinkKeyPut(final ApiHttpClient apiHttpClient, String projectKey,
            String importSinkKey,
            com.commercetools.importapi.models.importsinks.ImportSinkUpdateDraft importSinkUpdateDraft) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.importSinkKey = importSinkKey;
        this.importSinkUpdateDraft = importSinkUpdateDraft;
    }

    public ByProjectKeyImportSinksByImportSinkKeyPut(ByProjectKeyImportSinksByImportSinkKeyPut t) {
        super(t);
        this.projectKey = t.projectKey;
        this.importSinkKey = t.importSinkKey;
        this.importSinkUpdateDraft = t.importSinkUpdateDraft;
    }

    @Override
    protected ApiHttpRequest buildHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("/%s/import-sinks/%s", this.projectKey, this.importSinkKey);
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }
        return new ApiHttpRequest(ApiHttpMethod.PUT, URI.create(httpRequestPath), getHeaders(),
            io.vrap.rmf.base.client.utils.json.JsonUtils
                    .executing(() -> apiHttpClient().getSerializerService().toJsonByteArray(importSinkUpdateDraft)));

    }

    @Override
    public ApiHttpResponse<com.commercetools.importapi.models.importsinks.ImportSink> executeBlocking(
            final ApiHttpClient client, final Duration timeout) {
        return executeBlocking(client, timeout, com.commercetools.importapi.models.importsinks.ImportSink.class);
    }

    @Override
    public CompletableFuture<ApiHttpResponse<com.commercetools.importapi.models.importsinks.ImportSink>> execute(
            final ApiHttpClient client) {
        return execute(client, com.commercetools.importapi.models.importsinks.ImportSink.class);
    }

    public String getProjectKey() {
        return this.projectKey;
    }

    public String getImportSinkKey() {
        return this.importSinkKey;
    }

    public void setProjectKey(final String projectKey) {
        this.projectKey = projectKey;
    }

    public void setImportSinkKey(final String importSinkKey) {
        this.importSinkKey = importSinkKey;
    }

    public com.commercetools.importapi.models.importsinks.ImportSinkUpdateDraft getBody() {
        return importSinkUpdateDraft;
    }

    public ByProjectKeyImportSinksByImportSinkKeyPut withBody(
            com.commercetools.importapi.models.importsinks.ImportSinkUpdateDraft importSinkUpdateDraft) {
        ByProjectKeyImportSinksByImportSinkKeyPut t = copy();
        t.importSinkUpdateDraft = importSinkUpdateDraft;
        return t;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ByProjectKeyImportSinksByImportSinkKeyPut that = (ByProjectKeyImportSinksByImportSinkKeyPut) o;

        return new EqualsBuilder().append(projectKey, that.projectKey)
                .append(importSinkKey, that.importSinkKey)
                .append(importSinkUpdateDraft, that.importSinkUpdateDraft)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(projectKey)
                .append(importSinkKey)
                .append(importSinkUpdateDraft)
                .toHashCode();
    }

    @Override
    protected ByProjectKeyImportSinksByImportSinkKeyPut copy() {
        return new ByProjectKeyImportSinksByImportSinkKeyPut(this);
    }
}
