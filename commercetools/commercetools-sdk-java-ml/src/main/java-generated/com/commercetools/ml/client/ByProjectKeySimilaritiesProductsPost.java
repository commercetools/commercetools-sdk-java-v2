
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

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ByProjectKeySimilaritiesProductsPost extends
        BodyApiMethod<ByProjectKeySimilaritiesProductsPost, com.commercetools.ml.models.common.TaskToken, com.commercetools.ml.models.similar_products.SimilarProductSearchRequest> {

    private String projectKey;

    private com.commercetools.ml.models.similar_products.SimilarProductSearchRequest similarProductSearchRequest;

    public ByProjectKeySimilaritiesProductsPost(final ApiHttpClient apiHttpClient, String projectKey,
            com.commercetools.ml.models.similar_products.SimilarProductSearchRequest similarProductSearchRequest) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.similarProductSearchRequest = similarProductSearchRequest;
    }

    public ByProjectKeySimilaritiesProductsPost(ByProjectKeySimilaritiesProductsPost t) {
        super(t);
        this.projectKey = t.projectKey;
        this.similarProductSearchRequest = t.similarProductSearchRequest;
    }

    @Override
    protected ApiHttpRequest buildHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("/%s/similarities/products", this.projectKey);
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }
        return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(),
            io.vrap.rmf.base.client.utils.json.JsonUtils.executing(
                () -> apiHttpClient().getSerializerService().toJsonByteArray(similarProductSearchRequest)));

    }

    @Override
    public ApiHttpResponse<com.commercetools.ml.models.common.TaskToken> executeBlocking(final ApiHttpClient client,
            final Duration timeout) {
        return executeBlocking(client, timeout, com.commercetools.ml.models.common.TaskToken.class);
    }

    @Override
    public CompletableFuture<ApiHttpResponse<com.commercetools.ml.models.common.TaskToken>> execute(
            final ApiHttpClient client) {
        return execute(client, com.commercetools.ml.models.common.TaskToken.class);
    }

    public String getProjectKey() {
        return this.projectKey;
    }

    public void setProjectKey(final String projectKey) {
        this.projectKey = projectKey;
    }

    public com.commercetools.ml.models.similar_products.SimilarProductSearchRequest getBody() {
        return similarProductSearchRequest;
    }

    public ByProjectKeySimilaritiesProductsPost withBody(
            com.commercetools.ml.models.similar_products.SimilarProductSearchRequest similarProductSearchRequest) {
        ByProjectKeySimilaritiesProductsPost t = copy();
        t.similarProductSearchRequest = similarProductSearchRequest;
        return t;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ByProjectKeySimilaritiesProductsPost that = (ByProjectKeySimilaritiesProductsPost) o;

        return new EqualsBuilder().append(projectKey, that.projectKey)
                .append(similarProductSearchRequest, that.similarProductSearchRequest)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(projectKey).append(similarProductSearchRequest).toHashCode();
    }

    @Override
    protected ByProjectKeySimilaritiesProductsPost copy() {
        return new ByProjectKeySimilaritiesProductsPost(this);
    }
}
