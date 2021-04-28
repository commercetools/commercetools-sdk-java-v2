
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
public class ByProjectKeyMissingDataAttributesPost
        extends ApiMethod<ByProjectKeyMissingDataAttributesPost, com.commercetools.ml.models.common.TaskToken> {

    private String projectKey;

    private com.commercetools.ml.models.missing_data.MissingAttributesSearchRequest missingAttributesSearchRequest;

    public ByProjectKeyMissingDataAttributesPost(final ApiHttpClient apiHttpClient, String projectKey,
            com.commercetools.ml.models.missing_data.MissingAttributesSearchRequest missingAttributesSearchRequest) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.missingAttributesSearchRequest = missingAttributesSearchRequest;
    }

    public ByProjectKeyMissingDataAttributesPost(ByProjectKeyMissingDataAttributesPost t) {
        super(t);
        this.projectKey = t.projectKey;
        this.missingAttributesSearchRequest = t.missingAttributesSearchRequest;
    }

    @Override
    public ApiHttpRequest createHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("/%s/missing-data/attributes", this.projectKey);
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }
        try {
            final byte[] body = apiHttpClient().getSerializerService().toJsonByteArray(missingAttributesSearchRequest);
            return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(), body);
        }
        catch (Exception e) {
            e.printStackTrace();
        }

        return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(), null);
    }

    @Override
    public ApiHttpResponse<com.commercetools.ml.models.common.TaskToken> executeBlocking(final ApiHttpClient client,
            Duration timeout) {
        ApiHttpRequest request = this.createHttpRequest();
        return blockingWait(client.execute(request, com.commercetools.ml.models.common.TaskToken.class), request,
            timeout);
    }

    @Override
    public CompletableFuture<ApiHttpResponse<com.commercetools.ml.models.common.TaskToken>> execute(
            final ApiHttpClient client) {
        return client.execute(this.createHttpRequest(), com.commercetools.ml.models.common.TaskToken.class);
    }

    public String getProjectKey() {
        return this.projectKey;
    }

    public void setProjectKey(final String projectKey) {
        this.projectKey = projectKey;
    }

    @Override
    protected ByProjectKeyMissingDataAttributesPost copy() {
        return new ByProjectKeyMissingDataAttributesPost(this);
    }
}
