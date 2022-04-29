
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
public class ByProjectKeyMissingDataImagesPost extends
        BodyApiMethod<ByProjectKeyMissingDataImagesPost, com.commercetools.ml.models.common.TaskToken, com.commercetools.ml.models.missing_data.MissingImagesSearchRequest> {

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
    protected ApiHttpRequest buildHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("/%s/missing-data/images", this.projectKey);
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }
        return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(),
            io.vrap.rmf.base.client.utils.json.JsonUtils.executing(
                () -> apiHttpClient().getSerializerService().toJsonByteArray(missingImagesSearchRequest)));

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

    public com.commercetools.ml.models.missing_data.MissingImagesSearchRequest getBody() {
        return missingImagesSearchRequest;
    }

    public ByProjectKeyMissingDataImagesPost withBody(
            com.commercetools.ml.models.missing_data.MissingImagesSearchRequest missingImagesSearchRequest) {
        ByProjectKeyMissingDataImagesPost t = copy();
        t.missingImagesSearchRequest = missingImagesSearchRequest;
        return t;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ByProjectKeyMissingDataImagesPost that = (ByProjectKeyMissingDataImagesPost) o;

        return new EqualsBuilder().append(projectKey, that.projectKey)
                .append(missingImagesSearchRequest, that.missingImagesSearchRequest)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(projectKey).append(missingImagesSearchRequest).toHashCode();
    }

    @Override
    protected ByProjectKeyMissingDataImagesPost copy() {
        return new ByProjectKeyMissingDataImagesPost(this);
    }
}
