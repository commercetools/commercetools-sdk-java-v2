
package com.commercetools.api.client;

import static io.vrap.rmf.base.client.utils.ClientUtils.blockingWait;

import java.net.URI;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;

import io.vrap.rmf.base.client.*;
import io.vrap.rmf.base.client.utils.Generated;

/**
*  <p>Creates a new custom object or updates an existing custom object.
*  If an object with the given container/key exists,
*  the object will be replaced with the new value and the version is incremented.
*  If the request contains a version and an object with the given container/key exists then the version
*  must match the version of the existing object. Concurrent updates for the same custom object still can result
*  in a Conflict (409) even if the version is not provided.
*  Fields with null values will not be saved.</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ByProjectKeyCustomObjectsPost
        extends ApiMethod<ByProjectKeyCustomObjectsPost, com.commercetools.api.models.custom_object.CustomObject>
        implements com.commercetools.api.client.ExpandableTrait<ByProjectKeyCustomObjectsPost>,
        com.commercetools.api.client.ErrorableTrait<ByProjectKeyCustomObjectsPost>,
        com.commercetools.api.client.DeprecatableTrait<ByProjectKeyCustomObjectsPost> {

    private String projectKey;

    private com.commercetools.api.models.custom_object.CustomObjectDraft customObjectDraft;

    public ByProjectKeyCustomObjectsPost(final ApiHttpClient apiHttpClient, String projectKey,
            com.commercetools.api.models.custom_object.CustomObjectDraft customObjectDraft) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.customObjectDraft = customObjectDraft;
    }

    public ByProjectKeyCustomObjectsPost(ByProjectKeyCustomObjectsPost t) {
        super(t);
        this.projectKey = t.projectKey;
        this.customObjectDraft = t.customObjectDraft;
    }

    @Override
    public ApiHttpRequest createHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("/%s/custom-objects", this.projectKey);
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }
        try {
            final byte[] body = apiHttpClient().getSerializerService().toJsonByteArray(customObjectDraft);
            return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(), body);
        }
        catch (Exception e) {
            e.printStackTrace();
        }

        return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(), null);
    }

    @Override
    public ApiHttpResponse<com.commercetools.api.models.custom_object.CustomObject> executeBlocking(Duration timeout) {
        return blockingWait(execute(), timeout);
    }

    @Override
    public CompletableFuture<ApiHttpResponse<com.commercetools.api.models.custom_object.CustomObject>> execute() {
        return apiHttpClient().execute(this.createHttpRequest(),
            com.commercetools.api.models.custom_object.CustomObject.class);
    }

    public String getProjectKey() {
        return this.projectKey;
    }

    public List<String> getExpand() {
        return this.getQueryParam("expand");
    }

    public void setProjectKey(final String projectKey) {
        this.projectKey = projectKey;
    }

    public ByProjectKeyCustomObjectsPost withExpand(final String expand) {
        return copy().withQueryParam("expand", expand);
    }

    public ByProjectKeyCustomObjectsPost addExpand(final String expand) {
        return copy().addQueryParam("expand", expand);
    }

    @Override
    protected ByProjectKeyCustomObjectsPost copy() {
        return new ByProjectKeyCustomObjectsPost(this);
    }
}
