
package com.commercetools.ml.client;

import static io.vrap.rmf.base.client.utils.ClientUtils.blockingWait;

import java.net.URI;
import java.nio.file.Files;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;

import io.vrap.rmf.base.client.*;
import io.vrap.rmf.base.client.utils.Generated;

/**
*  <p>Accepts an image file and returns similar products from product catalogue.</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ByProjectKeyImageSearchPost
        extends ApiMethod<ByProjectKeyImageSearchPost, com.commercetools.ml.models.image_search.ImageSearchResponse> {

    private String projectKey;

    private java.io.File file;

    public ByProjectKeyImageSearchPost(final ApiHttpClient apiHttpClient, String projectKey, java.io.File file) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.file = file;
    }

    public ByProjectKeyImageSearchPost(ByProjectKeyImageSearchPost t) {
        super(t);
        this.projectKey = t.projectKey;
        this.file = t.file;
    }

    @Override
    public ApiHttpRequest createHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("/%s/image-search", this.projectKey);
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }
        try {
            return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(),
                Files.readAllBytes(file.toPath()));
        }
        catch (Exception e) {
            e.printStackTrace();
        }

        return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(), null);
    }

    @Override
    public ApiHttpResponse<com.commercetools.ml.models.image_search.ImageSearchResponse> executeBlocking(
            Duration timeout) {
        return blockingWait(execute(), timeout);
    }

    @Override
    public CompletableFuture<ApiHttpResponse<com.commercetools.ml.models.image_search.ImageSearchResponse>> execute() {
        return apiHttpClient().execute(this.createHttpRequest(),
            com.commercetools.ml.models.image_search.ImageSearchResponse.class);
    }

    public String getProjectKey() {
        return this.projectKey;
    }

    public List<String> getLimit() {
        return this.getQueryParam("limit");
    }

    public List<String> getOffset() {
        return this.getQueryParam("offset");
    }

    public void setProjectKey(final String projectKey) {
        this.projectKey = projectKey;
    }

    public ByProjectKeyImageSearchPost withLimit(final Integer limit) {
        return copy().withQueryParam("limit", limit);
    }

    public ByProjectKeyImageSearchPost addLimit(final Integer limit) {
        return copy().addQueryParam("limit", limit);
    }

    public ByProjectKeyImageSearchPost withOffset(final Integer offset) {
        return copy().withQueryParam("offset", offset);
    }

    public ByProjectKeyImageSearchPost addOffset(final Integer offset) {
        return copy().addQueryParam("offset", offset);
    }

    @Override
    protected ByProjectKeyImageSearchPost copy() {
        return new ByProjectKeyImageSearchPost(this);
    }
}
