
package com.commercetools.ml.client;

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
*  <p>Endpoint to update the image search config.</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ByProjectKeyImageSearchConfigPost extends
        BodyApiMethod<ByProjectKeyImageSearchConfigPost, com.commercetools.ml.models.image_search_config.ImageSearchConfigResponse, com.commercetools.ml.models.image_search_config.ImageSearchConfigRequest> {

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
    protected ApiHttpRequest buildHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("/%s/image-search/config", this.projectKey);
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }
        return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(),
            io.vrap.rmf.base.client.utils.json.JsonUtils
                    .executing(() -> apiHttpClient().getSerializerService().toJsonByteArray(imageSearchConfigRequest)));

    }

    @Override
    public ApiHttpResponse<com.commercetools.ml.models.image_search_config.ImageSearchConfigResponse> executeBlocking(
            final ApiHttpClient client, final Duration timeout) {
        return executeBlocking(client, timeout,
            com.commercetools.ml.models.image_search_config.ImageSearchConfigResponse.class);
    }

    @Override
    public CompletableFuture<ApiHttpResponse<com.commercetools.ml.models.image_search_config.ImageSearchConfigResponse>> execute(
            final ApiHttpClient client) {
        return execute(client, com.commercetools.ml.models.image_search_config.ImageSearchConfigResponse.class);
    }

    public String getProjectKey() {
        return this.projectKey;
    }

    public void setProjectKey(final String projectKey) {
        this.projectKey = projectKey;
    }

    public com.commercetools.ml.models.image_search_config.ImageSearchConfigRequest getBody() {
        return imageSearchConfigRequest;
    }

    public ByProjectKeyImageSearchConfigPost withBody(
            com.commercetools.ml.models.image_search_config.ImageSearchConfigRequest imageSearchConfigRequest) {
        ByProjectKeyImageSearchConfigPost t = copy();
        t.imageSearchConfigRequest = imageSearchConfigRequest;
        return t;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ByProjectKeyImageSearchConfigPost that = (ByProjectKeyImageSearchConfigPost) o;

        return new EqualsBuilder().append(projectKey, that.projectKey)
                .append(imageSearchConfigRequest, that.imageSearchConfigRequest)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(projectKey).append(imageSearchConfigRequest).toHashCode();
    }

    @Override
    protected ByProjectKeyImageSearchConfigPost copy() {
        return new ByProjectKeyImageSearchConfigPost(this);
    }
}
