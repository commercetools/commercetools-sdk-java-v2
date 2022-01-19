
package com.commercetools.api.client;

import java.net.URI;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;

import io.vrap.rmf.base.client.*;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

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
        com.commercetools.api.client.Deprecatable201Trait<ByProjectKeyCustomObjectsPost>,
        com.commercetools.api.client.ErrorableTrait<ByProjectKeyCustomObjectsPost> {

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
    public ApiHttpResponse<com.commercetools.api.models.custom_object.CustomObject> executeBlocking(
            final ApiHttpClient client, final Duration timeout) {
        return executeBlocking(client, timeout, com.commercetools.api.models.custom_object.CustomObject.class);
    }

    @Override
    public CompletableFuture<ApiHttpResponse<com.commercetools.api.models.custom_object.CustomObject>> execute(
            final ApiHttpClient client) {
        return execute(client, com.commercetools.api.models.custom_object.CustomObject.class);
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

    /**
     * set expand with the specificied value
     */
    public ByProjectKeyCustomObjectsPost withExpand(final String expand) {
        return copy().withQueryParam("expand", expand);
    }

    /**
     * add additional expand query parameter
     */
    public ByProjectKeyCustomObjectsPost addExpand(final String expand) {
        return copy().addQueryParam("expand", expand);
    }

    /**
     * set expand with the specificied values
     */
    public ByProjectKeyCustomObjectsPost withExpand(final List<String> expand) {
        return copy().withoutQueryParam("expand")
                .addQueryParams(
                    expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional expand query parameters
     */
    public ByProjectKeyCustomObjectsPost addExpand(final List<String> expand) {
        return copy().addQueryParams(
            expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList()));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ByProjectKeyCustomObjectsPost that = (ByProjectKeyCustomObjectsPost) o;

        return new EqualsBuilder().append(projectKey, that.projectKey)
                .append(customObjectDraft, that.customObjectDraft)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(projectKey).append(customObjectDraft).toHashCode();
    }

    @Override
    protected ByProjectKeyCustomObjectsPost copy() {
        return new ByProjectKeyCustomObjectsPost(this);
    }
}
