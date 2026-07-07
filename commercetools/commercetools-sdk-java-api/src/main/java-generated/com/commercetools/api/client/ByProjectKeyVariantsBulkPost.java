
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
 *  <p>Applies update actions to multiple Variants in a single request. Returns a <code>207 Multi-Status</code> response with the result for each Variant. Each Variant is updated independently, so some may succeed while others fail.</p>
 *
 * <hr>
 * <div class=code-example>
 * <pre><code class='java'>{@code
 *   CompletableFuture<ApiHttpResponse<com.commercetools.api.models.variant.VariantBulkUpdateResponse>> result = apiRoot
 *            .withProjectKey("{projectKey}")
 *            .variants()
 *            .bulk()
 *            .post(null)
 *            .execute()
 * }</code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyVariantsBulkPost extends
        TypeBodyApiMethod<ByProjectKeyVariantsBulkPost, com.commercetools.api.models.variant.VariantBulkUpdateResponse, com.commercetools.api.models.variant.VariantBulkUpdate> {

    @Override
    public TypeReference<com.commercetools.api.models.variant.VariantBulkUpdateResponse> resultType() {
        return new TypeReference<com.commercetools.api.models.variant.VariantBulkUpdateResponse>() {
        };
    }

    private String projectKey;

    private com.commercetools.api.models.variant.VariantBulkUpdate variantBulkUpdate;

    public ByProjectKeyVariantsBulkPost(final ApiHttpClient apiHttpClient, String projectKey,
            com.commercetools.api.models.variant.VariantBulkUpdate variantBulkUpdate) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.variantBulkUpdate = variantBulkUpdate;
    }

    public ByProjectKeyVariantsBulkPost(ByProjectKeyVariantsBulkPost t) {
        super(t);
        this.projectKey = t.projectKey;
        this.variantBulkUpdate = t.variantBulkUpdate;
    }

    @Override
    protected ApiHttpRequest buildHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("%s/variants/bulk", encodePathParam(this.projectKey));
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }
        return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(),
            io.vrap.rmf.base.client.utils.json.JsonUtils
                    .executing(() -> apiHttpClient().getSerializerService().toJsonByteArray(variantBulkUpdate)));

    }

    @Override
    public ApiHttpResponse<com.commercetools.api.models.variant.VariantBulkUpdateResponse> executeBlocking(
            final ApiHttpClient client, final Duration timeout) {
        return executeBlocking(client, timeout, com.commercetools.api.models.variant.VariantBulkUpdateResponse.class);
    }

    @Override
    public CompletableFuture<ApiHttpResponse<com.commercetools.api.models.variant.VariantBulkUpdateResponse>> execute(
            final ApiHttpClient client) {
        return execute(client, com.commercetools.api.models.variant.VariantBulkUpdateResponse.class);
    }

    public String getProjectKey() {
        return this.projectKey;
    }

    public List<String> getVersionControl() {
        return this.getQueryParam("versionControl");
    }

    public void setProjectKey(final String projectKey) {
        this.projectKey = projectKey;
    }

    /**
     * set versionControl with the specified value
     * @param versionControl value to be set
     * @param <TValue> value type
     * @return ByProjectKeyVariantsBulkPost
     */
    public <TValue> ByProjectKeyVariantsBulkPost withVersionControl(final TValue versionControl) {
        return copy().withQueryParam("versionControl", versionControl);
    }

    /**
     * add additional versionControl query parameter
     * @param versionControl value to be added
     * @param <TValue> value type
     * @return ByProjectKeyVariantsBulkPost
     */
    public <TValue> ByProjectKeyVariantsBulkPost addVersionControl(final TValue versionControl) {
        return copy().addQueryParam("versionControl", versionControl);
    }

    /**
     * set versionControl with the specified value
     * @param supplier supplier for the value to be set
     * @return ByProjectKeyVariantsBulkPost
     */
    public ByProjectKeyVariantsBulkPost withVersionControl(final Supplier<String> supplier) {
        return copy().withQueryParam("versionControl", supplier.get());
    }

    /**
     * add additional versionControl query parameter
     * @param supplier supplier for the value to be added
     * @return ByProjectKeyVariantsBulkPost
     */
    public ByProjectKeyVariantsBulkPost addVersionControl(final Supplier<String> supplier) {
        return copy().addQueryParam("versionControl", supplier.get());
    }

    /**
     * set versionControl with the specified value
     * @param op builder for the value to be set
     * @return ByProjectKeyVariantsBulkPost
     */
    public ByProjectKeyVariantsBulkPost withVersionControl(final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("versionControl", op.apply(new StringBuilder()));
    }

    /**
     * add additional versionControl query parameter
     * @param op builder for the value to be added
     * @return ByProjectKeyVariantsBulkPost
     */
    public ByProjectKeyVariantsBulkPost addVersionControl(final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("versionControl", op.apply(new StringBuilder()));
    }

    /**
     * set versionControl with the specified values
     * @param versionControl values to be set
     * @param <TValue> value type
     * @return ByProjectKeyVariantsBulkPost
     */
    public <TValue> ByProjectKeyVariantsBulkPost withVersionControl(final Collection<TValue> versionControl) {
        return copy().withoutQueryParam("versionControl")
                .addQueryParams(versionControl.stream()
                        .map(s -> new ParamEntry<>("versionControl", s.toString()))
                        .collect(Collectors.toList()));
    }

    /**
     * add additional versionControl query parameters
     * @param versionControl values to be added
     * @param <TValue> value type
     * @return ByProjectKeyVariantsBulkPost
     */
    public <TValue> ByProjectKeyVariantsBulkPost addVersionControl(final Collection<TValue> versionControl) {
        return copy().addQueryParams(versionControl.stream()
                .map(s -> new ParamEntry<>("versionControl", s.toString()))
                .collect(Collectors.toList()));
    }

    public com.commercetools.api.models.variant.VariantBulkUpdate getBody() {
        return variantBulkUpdate;
    }

    public ByProjectKeyVariantsBulkPost withBody(
            com.commercetools.api.models.variant.VariantBulkUpdate variantBulkUpdate) {
        ByProjectKeyVariantsBulkPost t = copy();
        t.variantBulkUpdate = variantBulkUpdate;
        return t;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ByProjectKeyVariantsBulkPost that = (ByProjectKeyVariantsBulkPost) o;

        return new EqualsBuilder().append(projectKey, that.projectKey)
                .append(variantBulkUpdate, that.variantBulkUpdate)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(projectKey).append(variantBulkUpdate).toHashCode();
    }

    @Override
    protected ByProjectKeyVariantsBulkPost copy() {
        return new ByProjectKeyVariantsBulkPost(this);
    }
}
