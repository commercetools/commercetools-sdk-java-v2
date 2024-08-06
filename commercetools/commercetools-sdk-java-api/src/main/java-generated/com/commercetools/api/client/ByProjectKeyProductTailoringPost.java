
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
 *  <p>Generates the ProductTailoringCreated Message.</p>
 *
 * <hr>
 * <div class=code-example>
 * <pre><code class='java'>{@code
 *   CompletableFuture<ApiHttpResponse<com.commercetools.api.models.product_tailoring.ProductTailoring>> result = apiRoot
 *            .withProjectKey("{projectKey}")
 *            .productTailoring()
 *            .post(null)
 *            .execute()
 * }</code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyProductTailoringPost extends
        TypeBodyApiMethod<ByProjectKeyProductTailoringPost, com.commercetools.api.models.product_tailoring.ProductTailoring, com.commercetools.api.models.product_tailoring.ProductTailoringDraft>
        implements com.commercetools.api.client.ExpandableTrait<ByProjectKeyProductTailoringPost>,
        com.commercetools.api.client.Deprecatable201Trait<ByProjectKeyProductTailoringPost>,
        com.commercetools.api.client.ErrorableTrait<ByProjectKeyProductTailoringPost> {

    @Override
    public TypeReference<com.commercetools.api.models.product_tailoring.ProductTailoring> resultType() {
        return new TypeReference<com.commercetools.api.models.product_tailoring.ProductTailoring>() {
        };
    }

    private String projectKey;

    private com.commercetools.api.models.product_tailoring.ProductTailoringDraft productTailoringDraft;

    public ByProjectKeyProductTailoringPost(final ApiHttpClient apiHttpClient, String projectKey,
            com.commercetools.api.models.product_tailoring.ProductTailoringDraft productTailoringDraft) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.productTailoringDraft = productTailoringDraft;
    }

    public ByProjectKeyProductTailoringPost(ByProjectKeyProductTailoringPost t) {
        super(t);
        this.projectKey = t.projectKey;
        this.productTailoringDraft = t.productTailoringDraft;
    }

    @Override
    protected ApiHttpRequest buildHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("%s/product-tailoring", encodePathParam(this.projectKey));
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }
        return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(),
            io.vrap.rmf.base.client.utils.json.JsonUtils
                    .executing(() -> apiHttpClient().getSerializerService().toJsonByteArray(productTailoringDraft)));

    }

    @Override
    public ApiHttpResponse<com.commercetools.api.models.product_tailoring.ProductTailoring> executeBlocking(
            final ApiHttpClient client, final Duration timeout) {
        return executeBlocking(client, timeout, com.commercetools.api.models.product_tailoring.ProductTailoring.class);
    }

    @Override
    public CompletableFuture<ApiHttpResponse<com.commercetools.api.models.product_tailoring.ProductTailoring>> execute(
            final ApiHttpClient client) {
        return execute(client, com.commercetools.api.models.product_tailoring.ProductTailoring.class);
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
     * @return ByProjectKeyProductTailoringPost
     */
    public <TValue> ByProjectKeyProductTailoringPost withExpand(final TValue expand) {
        return copy().withQueryParam("expand", expand);
    }

    /**
     * add additional expand query parameter
     * @param expand value to be added
     * @param <TValue> value type
     * @return ByProjectKeyProductTailoringPost
     */
    public <TValue> ByProjectKeyProductTailoringPost addExpand(final TValue expand) {
        return copy().addQueryParam("expand", expand);
    }

    /**
     * set expand with the specified value
     * @param supplier supplier for the value to be set
     * @return ByProjectKeyProductTailoringPost
     */
    public ByProjectKeyProductTailoringPost withExpand(final Supplier<String> supplier) {
        return copy().withQueryParam("expand", supplier.get());
    }

    /**
     * add additional expand query parameter
     * @param supplier supplier for the value to be added
     * @return ByProjectKeyProductTailoringPost
     */
    public ByProjectKeyProductTailoringPost addExpand(final Supplier<String> supplier) {
        return copy().addQueryParam("expand", supplier.get());
    }

    /**
     * set expand with the specified value
     * @param op builder for the value to be set
     * @return ByProjectKeyProductTailoringPost
     */
    public ByProjectKeyProductTailoringPost withExpand(final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("expand", op.apply(new StringBuilder()));
    }

    /**
     * add additional expand query parameter
     * @param op builder for the value to be added
     * @return ByProjectKeyProductTailoringPost
     */
    public ByProjectKeyProductTailoringPost addExpand(final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("expand", op.apply(new StringBuilder()));
    }

    /**
     * set expand with the specified values
     * @param expand values to be set
     * @param <TValue> value type
     * @return ByProjectKeyProductTailoringPost
     */
    public <TValue> ByProjectKeyProductTailoringPost withExpand(final Collection<TValue> expand) {
        return copy().withoutQueryParam("expand")
                .addQueryParams(
                    expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional expand query parameters
     * @param expand values to be added
     * @param <TValue> value type
     * @return ByProjectKeyProductTailoringPost
     */
    public <TValue> ByProjectKeyProductTailoringPost addExpand(final Collection<TValue> expand) {
        return copy().addQueryParams(
            expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList()));
    }

    public com.commercetools.api.models.product_tailoring.ProductTailoringDraft getBody() {
        return productTailoringDraft;
    }

    public ByProjectKeyProductTailoringPost withBody(
            com.commercetools.api.models.product_tailoring.ProductTailoringDraft productTailoringDraft) {
        ByProjectKeyProductTailoringPost t = copy();
        t.productTailoringDraft = productTailoringDraft;
        return t;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ByProjectKeyProductTailoringPost that = (ByProjectKeyProductTailoringPost) o;

        return new EqualsBuilder().append(projectKey, that.projectKey)
                .append(productTailoringDraft, that.productTailoringDraft)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(projectKey).append(productTailoringDraft).toHashCode();
    }

    @Override
    protected ByProjectKeyProductTailoringPost copy() {
        return new ByProjectKeyProductTailoringPost(this);
    }
}
