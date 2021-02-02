
package com.commercetools.ml.client;

import static io.vrap.rmf.base.client.utils.ClientUtils.blockingWait;

import java.net.URI;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;

import io.vrap.rmf.base.client.*;
import io.vrap.rmf.base.client.utils.Generated;

/**
*  <p>Endpoint to update the image search config.</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ByProjectKeyImageSearchConfigPost extends
        ApiMethod<ByProjectKeyImageSearchConfigPost, com.commercetools.ml.models.image_search_config.ImageSearchConfigResponse> {

    private String projectKey;

    private com.commercetools.ml.models.image_search_config.ImageSearchConfigRequest imageSearchConfigRequest;

    public ByProjectKeyImageSearchConfigPost(final ApiHttpClient apiHttpClient, String projectKey,
            com.commercetools.ml.models.image_search_config.ImageSearchConfigRequest imageSearchConfigRequest) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.imageSearchConfigRequest = imageSearchConfigRequest;
    }

    public ByProjectKeyImageSearchConfigPost(ByProjectKeyImageSearchConfigPost t) {
        super(t);
        this.projectKey = t.projectKey;
        this.imageSearchConfigRequest = t.imageSearchConfigRequest;
    }

    @Override
    public ApiHttpRequest createHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("/%s/image-search/config", this.projectKey);
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }
        try {
            final byte[] body = apiHttpClient().getSerializerService().toJsonByteArray(imageSearchConfigRequest);
            return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(), body);
        }
        catch (Exception e) {
            e.printStackTrace();
        }

        return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(), null);
    }

    @Override
    public ApiHttpResponse<com.commercetools.ml.models.image_search_config.ImageSearchConfigResponse> executeBlocking(
            Duration timeout) {
        return blockingWait(execute(), timeout);
    }

    @Override
    public CompletableFuture<ApiHttpResponse<com.commercetools.ml.models.image_search_config.ImageSearchConfigResponse>> execute() {
        return apiHttpClient().execute(this.createHttpRequest(),
            com.commercetools.ml.models.image_search_config.ImageSearchConfigResponse.class);
    }

    public String getProjectKey() {
        return this.projectKey;
    }

    public void setProjectKey(final String projectKey) {
        this.projectKey = projectKey;
    }

    @Override
    protected ByProjectKeyImageSearchConfigPost copy() {
        return new ByProjectKeyImageSearchConfigPost(this);
    }
}
