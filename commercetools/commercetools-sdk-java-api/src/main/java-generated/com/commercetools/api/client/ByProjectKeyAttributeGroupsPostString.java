
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
 *
 *
 * <hr>
 * <div class=code-example>
 * <pre><code class='java'>{@code
 *   CompletableFuture<ApiHttpResponse<com.commercetools.api.models.attribute_group.AttributeGroup>> result = apiRoot
 *            .withProjectKey("{projectKey}")
 *            .attributeGroups()
 *            .post("")
 *            .execute()
 * }</code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyAttributeGroupsPostString extends
        StringBodyApiMethod<ByProjectKeyAttributeGroupsPostString, com.commercetools.api.models.attribute_group.AttributeGroup>
        implements com.commercetools.api.client.ExpandableTrait<ByProjectKeyAttributeGroupsPostString>,
        com.commercetools.api.client.Deprecatable201Trait<ByProjectKeyAttributeGroupsPostString>,
        com.commercetools.api.client.ErrorableTrait<ByProjectKeyAttributeGroupsPostString> {

    public TypeReference<com.commercetools.api.models.attribute_group.AttributeGroup> resultType() {
        return new TypeReference<com.commercetools.api.models.attribute_group.AttributeGroup>() {
        };
    }

    private String projectKey;

    private String attributeGroupDraft;

    public ByProjectKeyAttributeGroupsPostString(final ApiHttpClient apiHttpClient, String projectKey,
            String attributeGroupDraft) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.attributeGroupDraft = attributeGroupDraft;
    }

    public ByProjectKeyAttributeGroupsPostString(ByProjectKeyAttributeGroupsPostString t) {
        super(t);
        this.projectKey = t.projectKey;
        this.attributeGroupDraft = t.attributeGroupDraft;
    }

    @Override
    protected ApiHttpRequest buildHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("%s/attribute-groups", this.projectKey);
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }
        return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(),
            attributeGroupDraft.getBytes(StandardCharsets.UTF_8));

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
     * @param <TValue> value type
     * @param expand value to be set
     * @return ByProjectKeyAttributeGroupsPostString
     */
    public <TValue> ByProjectKeyAttributeGroupsPostString withExpand(final TValue expand) {
        return copy().withQueryParam("expand", expand);
    }

    /**
     * add additional expand query parameter
     * @param <TValue> value type
     * @param expand value to be added
     * @return ByProjectKeyAttributeGroupsPostString
     */
    public <TValue> ByProjectKeyAttributeGroupsPostString addExpand(final TValue expand) {
        return copy().addQueryParam("expand", expand);
    }

    /**
     * set expand with the specified value
     * @param supplier supplier for the value to be set
     * @return ByProjectKeyAttributeGroupsPostString
     */
    public ByProjectKeyAttributeGroupsPostString withExpand(final Supplier<String> supplier) {
        return copy().withQueryParam("expand", supplier.get());
    }

    /**
     * add additional expand query parameter
     * @param supplier supplier for the value to be added
     * @return ByProjectKeyAttributeGroupsPostString
     */
    public ByProjectKeyAttributeGroupsPostString addExpand(final Supplier<String> supplier) {
        return copy().addQueryParam("expand", supplier.get());
    }

    /**
     * set expand with the specified value
     * @param op builder for the value to be set
     * @return ByProjectKeyAttributeGroupsPostString
     */
    public ByProjectKeyAttributeGroupsPostString withExpand(final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("expand", op.apply(new StringBuilder()));
    }

    /**
     * add additional expand query parameter
     * @param op builder for the value to be added
     * @return ByProjectKeyAttributeGroupsPostString
     */
    public ByProjectKeyAttributeGroupsPostString addExpand(final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("expand", op.apply(new StringBuilder()));
    }

    /**
     * set expand with the specified values
     * @param <TValue> value type
     * @param expand values to be set
     * @return ByProjectKeyAttributeGroupsPostString
     */
    public <TValue> ByProjectKeyAttributeGroupsPostString withExpand(final Collection<TValue> expand) {
        return copy().withoutQueryParam("expand")
                .addQueryParams(
                    expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional expand query parameters
     * @param <TValue> value type
     * @param expand values to be added
     * @return ByProjectKeyAttributeGroupsPostString
     */
    public <TValue> ByProjectKeyAttributeGroupsPostString addExpand(final Collection<TValue> expand) {
        return copy().addQueryParams(
            expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList()));
    }

    public String getBody() {
        return attributeGroupDraft;
    }

    public ByProjectKeyAttributeGroupsPostString withBody(String attributeGroupDraft) {
        ByProjectKeyAttributeGroupsPostString t = copy();
        t.attributeGroupDraft = attributeGroupDraft;
        return t;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ByProjectKeyAttributeGroupsPostString that = (ByProjectKeyAttributeGroupsPostString) o;

        return new EqualsBuilder().append(projectKey, that.projectKey)
                .append(attributeGroupDraft, that.attributeGroupDraft)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(projectKey).append(attributeGroupDraft).toHashCode();
    }

    @Override
    protected ByProjectKeyAttributeGroupsPostString copy() {
        return new ByProjectKeyAttributeGroupsPostString(this);
    }
}
