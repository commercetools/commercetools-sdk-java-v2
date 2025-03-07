
package com.commercetools.api.client;

import java.net.URI;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;

import com.fasterxml.jackson.core.type.TypeReference;

import io.vrap.rmf.base.client.*;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 *  <p>If an object with the given container/key exists, the object will be replaced with the new value and the version is incremented. If the request contains a version and an object with the given container/key, then the version must match the version of the existing object. Concurrent updates to the same Custom Object returns a ConcurrentModification error even if the version is not provided.</p>
 *  <p>Fields within <code>value</code> that have <code>null</code> values <strong>are not saved</strong>.</p>
 *
 * <hr>
 * <div class=code-example>
 * <pre><code class='java'>{@code
 *   CompletableFuture<ApiHttpResponse<com.commercetools.api.models.custom_object.CustomObject>> result = apiRoot
 *            .withProjectKey("{projectKey}")
 *            .customObjects()
 *            .post(null)
 *            .execute()
 * }</code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyCustomObjectsPost extends
        TypeBodyApiMethod<ByProjectKeyCustomObjectsPost, com.commercetools.api.models.custom_object.CustomObject, com.commercetools.api.models.custom_object.CustomObjectDraft>
        implements com.commercetools.api.client.ExpandableTrait<ByProjectKeyCustomObjectsPost>,
        com.commercetools.api.client.Deprecatable201Trait<ByProjectKeyCustomObjectsPost>,
        com.commercetools.api.client.ErrorableTrait<ByProjectKeyCustomObjectsPost> {

    @Override
    public TypeReference<com.commercetools.api.models.custom_object.CustomObject> resultType() {
        return new TypeReference<com.commercetools.api.models.custom_object.CustomObject>() {
        };
    }

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
        String httpRequestPath = String.format("%s/custom-objects", encodePathParam(this.projectKey));
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
     * @param expand value to be set
     * @param <TValue> value type
     * @return ByProjectKeyCustomObjectsPost
     */
    public <TValue> ByProjectKeyCustomObjectsPost withExpand(final TValue expand) {
        return copy().withQueryParam("expand", expand);
    }

    /**
     * add additional expand query parameter
     * @param expand value to be added
     * @param <TValue> value type
     * @return ByProjectKeyCustomObjectsPost
     */
    public <TValue> ByProjectKeyCustomObjectsPost addExpand(final TValue expand) {
        return copy().addQueryParam("expand", expand);
    }

    /**
     * set expand with the specified value
     * @param supplier supplier for the value to be set
     * @return ByProjectKeyCustomObjectsPost
     */
    public ByProjectKeyCustomObjectsPost withExpand(final Supplier<String> supplier) {
        return copy().withQueryParam("expand", supplier.get());
    }

    /**
     * add additional expand query parameter
     * @param supplier supplier for the value to be added
     * @return ByProjectKeyCustomObjectsPost
     */
    public ByProjectKeyCustomObjectsPost addExpand(final Supplier<String> supplier) {
        return copy().addQueryParam("expand", supplier.get());
    }

    /**
     * set expand with the specified value
     * @param op builder for the value to be set
     * @return ByProjectKeyCustomObjectsPost
     */
    public ByProjectKeyCustomObjectsPost withExpand(final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("expand", op.apply(new StringBuilder()));
    }

    /**
     * add additional expand query parameter
     * @param op builder for the value to be added
     * @return ByProjectKeyCustomObjectsPost
     */
    public ByProjectKeyCustomObjectsPost addExpand(final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("expand", op.apply(new StringBuilder()));
    }

    /**
     * set expand with the specified values
     * @param expand values to be set
     * @param <TValue> value type
     * @return ByProjectKeyCustomObjectsPost
     */
    public <TValue> ByProjectKeyCustomObjectsPost withExpand(final Collection<TValue> expand) {
        return copy().withoutQueryParam("expand")
                .addQueryParams(
                    expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional expand query parameters
     * @param expand values to be added
     * @param <TValue> value type
     * @return ByProjectKeyCustomObjectsPost
     */
    public <TValue> ByProjectKeyCustomObjectsPost addExpand(final Collection<TValue> expand) {
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
