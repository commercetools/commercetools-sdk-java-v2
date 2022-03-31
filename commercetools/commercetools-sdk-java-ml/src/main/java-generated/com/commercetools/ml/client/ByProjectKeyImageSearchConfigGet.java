
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
*  <p>Get the current image search config.</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ByProjectKeyImageSearchConfigGet extends
        ApiMethod<ByProjectKeyImageSearchConfigGet, com.commercetools.ml.models.image_search_config.ImageSearchConfigResponse> {

    private String projectKey;

    public ByProjectKeyImageSearchConfigGet(final ApiHttpClient apiHttpClient, String projectKey) {
        super(apiHttpClient);
        this.projectKey = projectKey;
    }

    public ByProjectKeyImageSearchConfigGet(ByProjectKeyImageSearchConfigGet t) {
        super(t);
        this.projectKey = t.projectKey;
    }

    @Override
    protected ApiHttpRequest buildHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("/%s/image-search/config", this.projectKey);
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }
        return new ApiHttpRequest(ApiHttpMethod.GET, URI.create(httpRequestPath), getHeaders(), null);
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

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ByProjectKeyImageSearchConfigGet that = (ByProjectKeyImageSearchConfigGet) o;

        return new EqualsBuilder().append(projectKey, that.projectKey).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(projectKey).toHashCode();
    }

    @Override
    protected ByProjectKeyImageSearchConfigGet copy() {
        return new ByProjectKeyImageSearchConfigGet(this);
    }
}
