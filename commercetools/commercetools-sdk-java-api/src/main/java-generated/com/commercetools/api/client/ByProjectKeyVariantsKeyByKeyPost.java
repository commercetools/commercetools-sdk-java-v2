
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
 *  <p>Updates a Variant identified by its key.</p>
 *
 * <hr>
 * <div class=code-example>
 * <pre><code class='java'>{@code
 *   CompletableFuture<ApiHttpResponse<com.commercetools.api.models.variant.Variant>> result = apiRoot
 *            .withProjectKey("{projectKey}")
 *            .variants()
 *            .withKey("{key}")
 *            .post(null)
 *            .execute()
 * }</code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyVariantsKeyByKeyPost extends
        TypeBodyApiMethod<ByProjectKeyVariantsKeyByKeyPost, com.commercetools.api.models.variant.Variant, com.commercetools.api.models.variant.VariantUpdate>
        implements com.commercetools.api.client.ConflictingTrait<ByProjectKeyVariantsKeyByKeyPost>,
        com.commercetools.api.client.ExpandableTrait<ByProjectKeyVariantsKeyByKeyPost>,
        com.commercetools.api.client.Deprecatable200Trait<ByProjectKeyVariantsKeyByKeyPost>,
        com.commercetools.api.client.ErrorableTrait<ByProjectKeyVariantsKeyByKeyPost> {

    @Override
    public TypeReference<com.commercetools.api.models.variant.Variant> resultType() {
        return new TypeReference<com.commercetools.api.models.variant.Variant>() {
        };
    }

    private String projectKey;
    private String key;

    private com.commercetools.api.models.variant.VariantUpdate variantUpdate;

    public ByProjectKeyVariantsKeyByKeyPost(final ApiHttpClient apiHttpClient, String projectKey, String key,
            com.commercetools.api.models.variant.VariantUpdate variantUpdate) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.key = key;
        this.variantUpdate = variantUpdate;
    }

    public ByProjectKeyVariantsKeyByKeyPost(ByProjectKeyVariantsKeyByKeyPost t) {
        super(t);
        this.projectKey = t.projectKey;
        this.key = t.key;
        this.variantUpdate = t.variantUpdate;
    }

    @Override
    protected ApiHttpRequest buildHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("%s/variants/key=%s", encodePathParam(this.projectKey),
            encodePathParam(this.key));
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }
        return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(),
            io.vrap.rmf.base.client.utils.json.JsonUtils
                    .executing(() -> apiHttpClient().getSerializerService().toJsonByteArray(variantUpdate)));

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

    public String getKey() {
        return this.key;
    }

    public List<String> getExpand() {
        return this.getQueryParam("expand");
    }

    public void setProjectKey(final String projectKey) {
        this.projectKey = projectKey;
    }

    public void setKey(final String key) {
        this.key = key;
    }

    /**
     * set expand with the specified value
     * @param expand value to be set
     * @param <TValue> value type
     * @return ByProjectKeyVariantsKeyByKeyPost
     */
    public <TValue> ByProjectKeyVariantsKeyByKeyPost withExpand(final TValue expand) {
        return copy().withQueryParam("expand", expand);
    }

    /**
     * add additional expand query parameter
     * @param expand value to be added
     * @param <TValue> value type
     * @return ByProjectKeyVariantsKeyByKeyPost
     */
    public <TValue> ByProjectKeyVariantsKeyByKeyPost addExpand(final TValue expand) {
        return copy().addQueryParam("expand", expand);
    }

    /**
     * set expand with the specified value
     * @param supplier supplier for the value to be set
     * @return ByProjectKeyVariantsKeyByKeyPost
     */
    public ByProjectKeyVariantsKeyByKeyPost withExpand(final Supplier<String> supplier) {
        return copy().withQueryParam("expand", supplier.get());
    }

    /**
     * add additional expand query parameter
     * @param supplier supplier for the value to be added
     * @return ByProjectKeyVariantsKeyByKeyPost
     */
    public ByProjectKeyVariantsKeyByKeyPost addExpand(final Supplier<String> supplier) {
        return copy().addQueryParam("expand", supplier.get());
    }

    /**
     * set expand with the specified value
     * @param op builder for the value to be set
     * @return ByProjectKeyVariantsKeyByKeyPost
     */
    public ByProjectKeyVariantsKeyByKeyPost withExpand(final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("expand", op.apply(new StringBuilder()));
    }

    /**
     * add additional expand query parameter
     * @param op builder for the value to be added
     * @return ByProjectKeyVariantsKeyByKeyPost
     */
    public ByProjectKeyVariantsKeyByKeyPost addExpand(final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("expand", op.apply(new StringBuilder()));
    }

    /**
     * set expand with the specified values
     * @param expand values to be set
     * @param <TValue> value type
     * @return ByProjectKeyVariantsKeyByKeyPost
     */
    public <TValue> ByProjectKeyVariantsKeyByKeyPost withExpand(final Collection<TValue> expand) {
        return copy().withoutQueryParam("expand")
                .addQueryParams(
                    expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional expand query parameters
     * @param expand values to be added
     * @param <TValue> value type
     * @return ByProjectKeyVariantsKeyByKeyPost
     */
    public <TValue> ByProjectKeyVariantsKeyByKeyPost addExpand(final Collection<TValue> expand) {
        return copy().addQueryParams(
            expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList()));
    }

    public com.commercetools.api.models.variant.VariantUpdate getBody() {
        return variantUpdate;
    }

    public ByProjectKeyVariantsKeyByKeyPost withBody(com.commercetools.api.models.variant.VariantUpdate variantUpdate) {
        ByProjectKeyVariantsKeyByKeyPost t = copy();
        t.variantUpdate = variantUpdate;
        return t;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ByProjectKeyVariantsKeyByKeyPost that = (ByProjectKeyVariantsKeyByKeyPost) o;

        return new EqualsBuilder().append(projectKey, that.projectKey)
                .append(key, that.key)
                .append(variantUpdate, that.variantUpdate)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(projectKey).append(key).append(variantUpdate).toHashCode();
    }

    @Override
    protected ByProjectKeyVariantsKeyByKeyPost copy() {
        return new ByProjectKeyVariantsKeyByKeyPost(this);
    }
}
