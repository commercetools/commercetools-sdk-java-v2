
package com.commercetools.api.client;

import java.net.URI;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;

import io.vrap.rmf.base.client.*;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
*  <p>If an object with the given container/key exists, the object will be replaced with the new value and the version is incremented.
*  If the request contains a version and an object with the given container/key, then the version must match the version of the existing object. Concurrent updates for the same Custom Object can result in a <a href="/../api/errors#409-conflict">409 Conflict</a> even if the version is not provided.</p>
*  <p>Fields with <code>null</code> values will <strong>not be saved</strong>.</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ByProjectKeyCustomObjectsPost extends
        BodyApiMethod<ByProjectKeyCustomObjectsPost, com.commercetools.api.models.custom_object.CustomObject, com.commercetools.api.models.custom_object.CustomObjectDraft>
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
    protected ApiHttpRequest buildHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("/%s/custom-objects", this.projectKey);
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }
        return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(),
            io.vrap.rmf.base.client.utils.json.JsonUtils
                    .executing(() -> apiHttpClient().getSerializerService().toJsonByteArray(customObjectDraft)));

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
     * set expand with the specified value
     */
    public <TValue> ByProjectKeyCustomObjectsPost withExpand(final TValue expand) {
        return copy().withQueryParam("expand", expand);
    }

    /**
     * add additional expand query parameter
     */
    public <TValue> ByProjectKeyCustomObjectsPost addExpand(final TValue expand) {
        return copy().addQueryParam("expand", expand);
    }

    /**
     * set expand with the specified value
     */
    public ByProjectKeyCustomObjectsPost withExpand(final Supplier<String> supplier) {
        return copy().withQueryParam("expand", supplier.get());
    }

    /**
     * add additional expand query parameter
     */
    public ByProjectKeyCustomObjectsPost addExpand(final Supplier<String> supplier) {
        return copy().addQueryParam("expand", supplier.get());
    }

    /**
     * set expand with the specified value
     */
    public ByProjectKeyCustomObjectsPost withExpand(final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("expand", op.apply(new StringBuilder()));
    }

    /**
     * add additional expand query parameter
     */
    public ByProjectKeyCustomObjectsPost addExpand(final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("expand", op.apply(new StringBuilder()));
    }

    /**
     * set expand with the specified values
     */
    public <TValue> ByProjectKeyCustomObjectsPost withExpand(final List<TValue> expand) {
        return copy().withoutQueryParam("expand")
                .addQueryParams(
                    expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional expand query parameters
     */
    public <TValue> ByProjectKeyCustomObjectsPost addExpand(final List<TValue> expand) {
        return copy().addQueryParams(
            expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList()));
    }

    public com.commercetools.api.models.custom_object.CustomObjectDraft getBody() {
        return customObjectDraft;
    }

    public ByProjectKeyCustomObjectsPost withBody(
            com.commercetools.api.models.custom_object.CustomObjectDraft customObjectDraft) {
        ByProjectKeyCustomObjectsPost t = copy();
        t.customObjectDraft = customObjectDraft;
        return t;
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
