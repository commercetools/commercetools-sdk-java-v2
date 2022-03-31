
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
*  <p>Creates a new import sink.</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ByProjectKeyImportSinksPost extends
        BodyApiMethod<ByProjectKeyImportSinksPost, com.commercetools.importapi.models.importsinks.ImportSink, com.commercetools.importapi.models.importsinks.ImportSinkDraft>
        implements com.commercetools.importapi.client.Secured_by_manage_import_sinksTrait<ByProjectKeyImportSinksPost> {

    private String projectKey;

    private com.commercetools.importapi.models.importsinks.ImportSinkDraft importSinkDraft;

    public ByProjectKeyImportSinksPost(final ApiHttpClient apiHttpClient, String projectKey,
            com.commercetools.importapi.models.importsinks.ImportSinkDraft importSinkDraft) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.importSinkDraft = importSinkDraft;
    }

    public ByProjectKeyImportSinksPost(ByProjectKeyImportSinksPost t) {
        super(t);
        this.projectKey = t.projectKey;
        this.importSinkDraft = t.importSinkDraft;
    }

    @Override
    protected ApiHttpRequest buildHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("/%s/import-sinks", this.projectKey);
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }
        return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(),
            io.vrap.rmf.base.client.utils.json.JsonUtils
                    .executing(() -> apiHttpClient().getSerializerService().toJsonByteArray(importSinkDraft)));

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

    public void setProjectKey(final String projectKey) {
        this.projectKey = projectKey;
    }

    public com.commercetools.importapi.models.importsinks.ImportSinkDraft getBody() {
        return importSinkDraft;
    }

    public ByProjectKeyImportSinksPost withBody(
            com.commercetools.importapi.models.importsinks.ImportSinkDraft importSinkDraft) {
        ByProjectKeyImportSinksPost t = copy();
        t.importSinkDraft = importSinkDraft;
        return t;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ByProjectKeyImportSinksPost that = (ByProjectKeyImportSinksPost) o;

        return new EqualsBuilder().append(projectKey, that.projectKey)
                .append(importSinkDraft, that.importSinkDraft)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(projectKey).append(importSinkDraft).toHashCode();
    }

    @Override
    protected ByProjectKeyImportSinksPost copy() {
        return new ByProjectKeyImportSinksPost(this);
    }
}
