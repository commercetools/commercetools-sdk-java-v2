
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

import io.vrap.rmf.base.client.*;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 *
 *
 * <hr>
 * <div class=code-example>
 * <pre><code class='java'>{@code
 *   CompletableFuture<ApiHttpResponse<com.commercetools.api.models.attribute_group.AttributeGroup>> result = apiRoot
 *            .withProjectKey("{projectKey}")
 *            .attributeGroups()
 *            .post(null)
 *            .execute()
 * }</code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyAttributeGroupsPost extends
        BodyApiMethod<ByProjectKeyAttributeGroupsPost, com.commercetools.api.models.attribute_group.AttributeGroup, com.commercetools.api.models.attribute_group.AttributeGroupDraft>
        implements com.commercetools.api.client.ExpandableTrait<ByProjectKeyAttributeGroupsPost>,
        com.commercetools.api.client.Deprecatable201Trait<ByProjectKeyAttributeGroupsPost>,
        com.commercetools.api.client.ErrorableTrait<ByProjectKeyAttributeGroupsPost> {

    private String projectKey;

    private com.commercetools.api.models.attribute_group.AttributeGroupDraft attributeGroupDraft;

    public ByProjectKeyAttributeGroupsPost(final ApiHttpClient apiHttpClient, String projectKey,
            com.commercetools.api.models.attribute_group.AttributeGroupDraft attributeGroupDraft) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.attributeGroupDraft = attributeGroupDraft;
    }

    public ByProjectKeyAttributeGroupsPost(ByProjectKeyAttributeGroupsPost t) {
        super(t);
        this.projectKey = t.projectKey;
        this.attributeGroupDraft = t.attributeGroupDraft;
    }

    @Override
    protected ApiHttpRequest buildHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("/%s/attribute-groups", this.projectKey);
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }
        return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(),
            io.vrap.rmf.base.client.utils.json.JsonUtils
                    .executing(() -> apiHttpClient().getSerializerService().toJsonByteArray(attributeGroupDraft)));

    }

    @Override
    public ApiHttpResponse<com.commercetools.api.models.attribute_group.AttributeGroup> executeBlocking(
            final ApiHttpClient client, final Duration timeout) {
        return executeBlocking(client, timeout, com.commercetools.api.models.attribute_group.AttributeGroup.class);
    }

    @Override
    public CompletableFuture<ApiHttpResponse<com.commercetools.api.models.attribute_group.AttributeGroup>> execute(
            final ApiHttpClient client) {
        return execute(client, com.commercetools.api.models.attribute_group.AttributeGroup.class);
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
    public <TValue> ByProjectKeyAttributeGroupsPost withExpand(final TValue expand) {
        return copy().withQueryParam("expand", expand);
    }

    /**
     * add additional expand query parameter
     */
    public <TValue> ByProjectKeyAttributeGroupsPost addExpand(final TValue expand) {
        return copy().addQueryParam("expand", expand);
    }

    /**
     * set expand with the specified value
     */
    public ByProjectKeyAttributeGroupsPost withExpand(final Supplier<String> supplier) {
        return copy().withQueryParam("expand", supplier.get());
    }

    /**
     * add additional expand query parameter
     */
    public ByProjectKeyAttributeGroupsPost addExpand(final Supplier<String> supplier) {
        return copy().addQueryParam("expand", supplier.get());
    }

    /**
     * set expand with the specified value
     */
    public ByProjectKeyAttributeGroupsPost withExpand(final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("expand", op.apply(new StringBuilder()));
    }

    /**
     * add additional expand query parameter
     */
    public ByProjectKeyAttributeGroupsPost addExpand(final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("expand", op.apply(new StringBuilder()));
    }

    /**
     * set expand with the specified values
     */
    public <TValue> ByProjectKeyAttributeGroupsPost withExpand(final Collection<TValue> expand) {
        return copy().withoutQueryParam("expand")
                .addQueryParams(
                    expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional expand query parameters
     */
    public <TValue> ByProjectKeyAttributeGroupsPost addExpand(final Collection<TValue> expand) {
        return copy().addQueryParams(
            expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList()));
    }

    public com.commercetools.api.models.attribute_group.AttributeGroupDraft getBody() {
        return attributeGroupDraft;
    }

    public ByProjectKeyAttributeGroupsPost withBody(
            com.commercetools.api.models.attribute_group.AttributeGroupDraft attributeGroupDraft) {
        ByProjectKeyAttributeGroupsPost t = copy();
        t.attributeGroupDraft = attributeGroupDraft;
        return t;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ByProjectKeyAttributeGroupsPost that = (ByProjectKeyAttributeGroupsPost) o;

        return new EqualsBuilder().append(projectKey, that.projectKey)
                .append(attributeGroupDraft, that.attributeGroupDraft)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(projectKey).append(attributeGroupDraft).toHashCode();
    }

    @Override
    protected ByProjectKeyAttributeGroupsPost copy() {
        return new ByProjectKeyAttributeGroupsPost(this);
    }
}
