
package com.commercetools.api.client;

import java.net.URI;
import java.nio.charset.StandardCharsets;
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
 *  <p>Fields with <code>null</code> values will <strong>not be saved</strong>.</p>
 *
 * <hr>
 * <div class=code-example>
 * <pre><code class='java'>{@code
 *   CompletableFuture<ApiHttpResponse<com.commercetools.api.models.custom_object.CustomObject>> result = apiRoot
 *            .withProjectKey("{projectKey}")
 *            .customObjects()
 *            .post("")
 *            .execute()
 * }</code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyCustomObjectsPostString extends
        StringBodyApiMethod<ByProjectKeyCustomObjectsPostString, com.commercetools.api.models.custom_object.CustomObject>
        implements com.commercetools.api.client.ExpandableTrait<ByProjectKeyCustomObjectsPostString>,
        com.commercetools.api.client.Deprecatable201Trait<ByProjectKeyCustomObjectsPostString>,
        com.commercetools.api.client.ErrorableTrait<ByProjectKeyCustomObjectsPostString> {

    @Override
    public TypeReference<com.commercetools.api.models.custom_object.CustomObject> resultType() {
        return new TypeReference<com.commercetools.api.models.custom_object.CustomObject>() {
        };
    }

    private String projectKey;

    private String customObjectDraft;

    public ByProjectKeyCustomObjectsPostString(final ApiHttpClient apiHttpClient, String projectKey,
            String customObjectDraft) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.customObjectDraft = customObjectDraft;
    }

    public ByProjectKeyCustomObjectsPostString(ByProjectKeyCustomObjectsPostString t) {
        super(t);
        this.projectKey = t.projectKey;
        this.customObjectDraft = t.customObjectDraft;
    }

    @Override
    protected ApiHttpRequest buildHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("%s/custom-objects", this.projectKey);
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }
        return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(),
            customObjectDraft.getBytes(StandardCharsets.UTF_8));

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
     * @param <TValue> value type
     * @param expand value to be set
     * @return ByProjectKeyCustomObjectsPostString
     */
    public <TValue> ByProjectKeyCustomObjectsPostString withExpand(final TValue expand) {
        return copy().withQueryParam("expand", expand);
    }

    /**
     * add additional expand query parameter
     * @param <TValue> value type
     * @param expand value to be added
     * @return ByProjectKeyCustomObjectsPostString
     */
    public <TValue> ByProjectKeyCustomObjectsPostString addExpand(final TValue expand) {
        return copy().addQueryParam("expand", expand);
    }

    /**
     * set expand with the specified value
     * @param supplier supplier for the value to be set
     * @return ByProjectKeyCustomObjectsPostString
     */
    public ByProjectKeyCustomObjectsPostString withExpand(final Supplier<String> supplier) {
        return copy().withQueryParam("expand", supplier.get());
    }

    /**
     * add additional expand query parameter
     * @param supplier supplier for the value to be added
     * @return ByProjectKeyCustomObjectsPostString
     */
    public ByProjectKeyCustomObjectsPostString addExpand(final Supplier<String> supplier) {
        return copy().addQueryParam("expand", supplier.get());
    }

    /**
     * set expand with the specified value
     * @param op builder for the value to be set
     * @return ByProjectKeyCustomObjectsPostString
     */
    public ByProjectKeyCustomObjectsPostString withExpand(final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("expand", op.apply(new StringBuilder()));
    }

    /**
     * add additional expand query parameter
     * @param op builder for the value to be added
     * @return ByProjectKeyCustomObjectsPostString
     */
    public ByProjectKeyCustomObjectsPostString addExpand(final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("expand", op.apply(new StringBuilder()));
    }

    /**
     * set expand with the specified values
     * @param <TValue> value type
     * @param expand values to be set
     * @return ByProjectKeyCustomObjectsPostString
     */
    public <TValue> ByProjectKeyCustomObjectsPostString withExpand(final Collection<TValue> expand) {
        return copy().withoutQueryParam("expand")
                .addQueryParams(
                    expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional expand query parameters
     * @param <TValue> value type
     * @param expand values to be added
     * @return ByProjectKeyCustomObjectsPostString
     */
    public <TValue> ByProjectKeyCustomObjectsPostString addExpand(final Collection<TValue> expand) {
        return copy().addQueryParams(
            expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList()));
    }

    public String getBody() {
        return customObjectDraft;
    }

    public ByProjectKeyCustomObjectsPostString withBody(String customObjectDraft) {
        ByProjectKeyCustomObjectsPostString t = copy();
        t.customObjectDraft = customObjectDraft;
        return t;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ByProjectKeyCustomObjectsPostString that = (ByProjectKeyCustomObjectsPostString) o;

        return new EqualsBuilder().append(projectKey, that.projectKey)
                .append(customObjectDraft, that.customObjectDraft)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(projectKey).append(customObjectDraft).toHashCode();
    }

    @Override
    protected ByProjectKeyCustomObjectsPostString copy() {
        return new ByProjectKeyCustomObjectsPostString(this);
    }
}
