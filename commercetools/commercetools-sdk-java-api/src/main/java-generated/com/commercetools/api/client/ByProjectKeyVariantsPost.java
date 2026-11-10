
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

import tools.jackson.core.type.TypeReference;

/**
 *  <p>Creates a new Variant with only the current representation. Produces the <a href="https://docs.commercetools.com/apis/ctp:api:type:VariantCreatedMessage" rel="nofollow">VariantCreated</a> Message.</p>
 *
 * <hr>
 * <div class=code-example>
 * <pre><code class='java'>{@code
 *   CompletableFuture<ApiHttpResponse<com.commercetools.api.models.variant.Variant>> result = apiRoot
 *            .withProjectKey("{projectKey}")
 *            .variants()
 *            .post(null)
 *            .execute()
 * }</code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyVariantsPost extends
        TypeBodyApiMethod<ByProjectKeyVariantsPost, com.commercetools.api.models.variant.Variant, com.commercetools.api.models.variant.VariantDraft>
        implements com.commercetools.api.client.ExpandableTrait<ByProjectKeyVariantsPost>,
        com.commercetools.api.client.Deprecatable201Trait<ByProjectKeyVariantsPost>,
        com.commercetools.api.client.ErrorableTrait<ByProjectKeyVariantsPost> {

    @Override
    public TypeReference<com.commercetools.api.models.variant.Variant> resultType() {
        return new TypeReference<com.commercetools.api.models.variant.Variant>() {
        };
    }

    private String projectKey;

    private com.commercetools.api.models.variant.VariantDraft variantDraft;

    public ByProjectKeyVariantsPost(final ApiHttpClient apiHttpClient, String projectKey,
            com.commercetools.api.models.variant.VariantDraft variantDraft) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.variantDraft = variantDraft;
    }

    public ByProjectKeyVariantsPost(ByProjectKeyVariantsPost t) {
        super(t);
        this.projectKey = t.projectKey;
        this.variantDraft = t.variantDraft;
    }

    @Override
    protected ApiHttpRequest buildHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("%s/variants", encodePathParam(this.projectKey));
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }
        return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(),
            io.vrap.rmf.base.client.utils.json.JsonUtils
                    .executing(() -> apiHttpClient().getSerializerService().toJsonByteArray(variantDraft)));

    }

    @Override
    public ApiHttpResponse<com.commercetools.api.models.variant.Variant> executeBlocking(final ApiHttpClient client,
            final Duration timeout) {
        return executeBlocking(client, timeout, com.commercetools.api.models.variant.Variant.class);
    }

    @Override
    public CompletableFuture<ApiHttpResponse<com.commercetools.api.models.variant.Variant>> execute(
            final ApiHttpClient client) {
        return execute(client, com.commercetools.api.models.variant.Variant.class);
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
     * @return ByProjectKeyVariantsPost
     */
    public <TValue> ByProjectKeyVariantsPost withExpand(final TValue expand) {
        return copy().withQueryParam("expand", expand);
    }

    /**
     * add additional expand query parameter
     * @param expand value to be added
     * @param <TValue> value type
     * @return ByProjectKeyVariantsPost
     */
    public <TValue> ByProjectKeyVariantsPost addExpand(final TValue expand) {
        return copy().addQueryParam("expand", expand);
    }

    /**
     * set expand with the specified value
     * @param supplier supplier for the value to be set
     * @return ByProjectKeyVariantsPost
     */
    public ByProjectKeyVariantsPost withExpand(final Supplier<String> supplier) {
        return copy().withQueryParam("expand", supplier.get());
    }

    /**
     * add additional expand query parameter
     * @param supplier supplier for the value to be added
     * @return ByProjectKeyVariantsPost
     */
    public ByProjectKeyVariantsPost addExpand(final Supplier<String> supplier) {
        return copy().addQueryParam("expand", supplier.get());
    }

    /**
     * set expand with the specified value
     * @param op builder for the value to be set
     * @return ByProjectKeyVariantsPost
     */
    public ByProjectKeyVariantsPost withExpand(final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("expand", op.apply(new StringBuilder()));
    }

    /**
     * add additional expand query parameter
     * @param op builder for the value to be added
     * @return ByProjectKeyVariantsPost
     */
    public ByProjectKeyVariantsPost addExpand(final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("expand", op.apply(new StringBuilder()));
    }

    /**
     * set expand with the specified values
     * @param expand values to be set
     * @param <TValue> value type
     * @return ByProjectKeyVariantsPost
     */
    public <TValue> ByProjectKeyVariantsPost withExpand(final Collection<TValue> expand) {
        return copy().withoutQueryParam("expand")
                .addQueryParams(
                    expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional expand query parameters
     * @param expand values to be added
     * @param <TValue> value type
     * @return ByProjectKeyVariantsPost
     */
    public <TValue> ByProjectKeyVariantsPost addExpand(final Collection<TValue> expand) {
        return copy().addQueryParams(
            expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList()));
    }

    public com.commercetools.api.models.variant.VariantDraft getBody() {
        return variantDraft;
    }

    public ByProjectKeyVariantsPost withBody(com.commercetools.api.models.variant.VariantDraft variantDraft) {
        ByProjectKeyVariantsPost t = copy();
        t.variantDraft = variantDraft;
        return t;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ByProjectKeyVariantsPost that = (ByProjectKeyVariantsPost) o;

        return new EqualsBuilder().append(projectKey, that.projectKey)
                .append(variantDraft, that.variantDraft)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(projectKey).append(variantDraft).toHashCode();
    }

    @Override
    protected ByProjectKeyVariantsPost copy() {
        return new ByProjectKeyVariantsPost(this);
    }
}
