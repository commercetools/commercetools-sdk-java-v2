
package com.commercetools.ml.client;

import java.net.URI;
import java.nio.charset.StandardCharsets;
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
 *
 * <hr>
 * <div class=code-example>
 * <pre><code class='java'>{@code
 *   CompletableFuture<ApiHttpResponse<com.commercetools.ml.models.image_search_config.ImageSearchConfigResponse>> result = apiRoot
 *            .withProjectKey("{projectKey}")
 *            .imageSearch()
 *            .config()
 *            .post("")
 *            .execute()
 * }</code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyImageSearchConfigPostString extends
        StringBodyApiMethod<ByProjectKeyImageSearchConfigPostString, com.commercetools.ml.models.image_search_config.ImageSearchConfigResponse> {

    private String projectKey;

    private String imageSearchConfigRequest;

    public ByProjectKeyImageSearchConfigPostString(final ApiHttpClient apiHttpClient, String projectKey,
            String imageSearchConfigRequest) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.imageSearchConfigRequest = imageSearchConfigRequest;
    }

    public ByProjectKeyImageSearchConfigPostString(ByProjectKeyImageSearchConfigPostString t) {
        super(t);
        this.projectKey = t.projectKey;
        this.imageSearchConfigRequest = t.imageSearchConfigRequest;
    }

    @Override
    protected ApiHttpRequest buildHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("%s/image-search/config", this.projectKey);
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }
        return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(),
            imageSearchConfigRequest.getBytes(StandardCharsets.UTF_8));

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

    public String getBody() {
        return imageSearchConfigRequest;
    }

    public ByProjectKeyImageSearchConfigPostString withBody(String imageSearchConfigRequest) {
        ByProjectKeyImageSearchConfigPostString t = copy();
        t.imageSearchConfigRequest = imageSearchConfigRequest;
        return t;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ByProjectKeyImageSearchConfigPostString that = (ByProjectKeyImageSearchConfigPostString) o;

        return new EqualsBuilder().append(projectKey, that.projectKey)
                .append(imageSearchConfigRequest, that.imageSearchConfigRequest)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(projectKey).append(imageSearchConfigRequest).toHashCode();
    }

    @Override
    protected ByProjectKeyImageSearchConfigPostString copy() {
        return new ByProjectKeyImageSearchConfigPostString(this);
    }
}
