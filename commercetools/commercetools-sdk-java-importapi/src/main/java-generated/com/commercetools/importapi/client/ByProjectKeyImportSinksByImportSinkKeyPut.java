
package com.commercetools.importapi.client;

import static io.vrap.rmf.base.client.utils.ClientUtils.blockingWait;

import java.net.URI;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;

import io.vrap.rmf.base.client.*;
import io.vrap.rmf.base.client.utils.Generated;

/**
*  <p>Updates the import sink given by the key.</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ByProjectKeyImportSinksByImportSinkKeyPut extends
        ApiMethod<ByProjectKeyImportSinksByImportSinkKeyPut, com.commercetools.importapi.models.importsinks.ImportSink>
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
    public ApiHttpRequest createHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("/%s/import-sinks/%s", this.projectKey, this.importSinkKey);
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }
        try {
            final byte[] body = apiHttpClient().getSerializerService().toJsonByteArray(importSinkUpdateDraft);
            return new ApiHttpRequest(ApiHttpMethod.PUT, URI.create(httpRequestPath), getHeaders(), body);
        }
        catch (Exception e) {
            e.printStackTrace();
        }

        return new ApiHttpRequest(ApiHttpMethod.PUT, URI.create(httpRequestPath), getHeaders(), null);
    }

    @Override
    public ApiHttpResponse<com.commercetools.importapi.models.importsinks.ImportSink> executeBlocking(
            final ApiHttpClient client, Duration timeout) {
        ApiHttpRequest request = this.createHttpRequest();
        return blockingWait(client.execute(request, com.commercetools.importapi.models.importsinks.ImportSink.class),
            request, timeout);
    }

    @Override
    public CompletableFuture<ApiHttpResponse<com.commercetools.importapi.models.importsinks.ImportSink>> execute(
            final ApiHttpClient client) {
        return client.execute(this.createHttpRequest(),
            com.commercetools.importapi.models.importsinks.ImportSink.class);
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

    @Override
    protected ByProjectKeyImportSinksByImportSinkKeyPut copy() {
        return new ByProjectKeyImportSinksByImportSinkKeyPut(this);
    }
}
