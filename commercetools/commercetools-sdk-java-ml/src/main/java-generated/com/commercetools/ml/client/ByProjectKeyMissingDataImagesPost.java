
package com.commercetools.ml.client;

import static io.vrap.rmf.base.client.utils.ClientUtils.blockingWait;

import java.net.URI;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;

import io.vrap.rmf.base.client.*;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ByProjectKeyMissingDataImagesPost
        extends ApiMethod<ByProjectKeyMissingDataImagesPost, com.commercetools.ml.models.common.TaskToken> {

    private String projectKey;

    private com.commercetools.ml.models.missing_data.MissingImagesSearchRequest missingImagesSearchRequest;

    public ByProjectKeyMissingDataImagesPost(final ApiHttpClient apiHttpClient, String projectKey,
            com.commercetools.ml.models.missing_data.MissingImagesSearchRequest missingImagesSearchRequest) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.missingImagesSearchRequest = missingImagesSearchRequest;
    }

    public ByProjectKeyMissingDataImagesPost(ByProjectKeyMissingDataImagesPost t) {
        super(t);
        this.projectKey = t.projectKey;
        this.missingImagesSearchRequest = t.missingImagesSearchRequest;
    }

    @Override
    public ApiHttpRequest createHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("/%s/missing-data/images", this.projectKey);
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }
        try {
            final byte[] body = apiHttpClient().getSerializerService().toJsonByteArray(missingImagesSearchRequest);
            return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(), body);
        }
        catch (Exception e) {
            e.printStackTrace();
        }

        return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(), null);
    }

    @Override
    public ApiHttpResponse<com.commercetools.ml.models.common.TaskToken> executeBlocking(Duration timeout) {
        return blockingWait(execute(), timeout);
    }

    @Override
    public CompletableFuture<ApiHttpResponse<com.commercetools.ml.models.common.TaskToken>> execute() {
        return apiHttpClient().execute(this.createHttpRequest(), com.commercetools.ml.models.common.TaskToken.class);
    }

    public String getProjectKey() {
        return this.projectKey;
    }

    public void setProjectKey(final String projectKey) {
        this.projectKey = projectKey;
    }

    @Override
    protected ByProjectKeyMissingDataImagesPost copy() {
        return new ByProjectKeyMissingDataImagesPost(this);
    }
}
