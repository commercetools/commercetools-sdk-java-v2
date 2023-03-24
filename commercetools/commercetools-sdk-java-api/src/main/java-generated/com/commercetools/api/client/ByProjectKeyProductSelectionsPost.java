
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
 *   CompletableFuture<ApiHttpResponse<com.commercetools.api.models.product_selection.ProductSelection>> result = apiRoot
 *            .withProjectKey("{projectKey}")
 *            .productSelections()
 *            .post(null)
 *            .execute()
 * }</code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyProductSelectionsPost extends
        BodyApiMethod<ByProjectKeyProductSelectionsPost, com.commercetools.api.models.product_selection.ProductSelection, com.commercetools.api.models.product_selection.ProductSelectionDraft>
        implements com.commercetools.api.client.ExpandableTrait<ByProjectKeyProductSelectionsPost>,
        com.commercetools.api.client.Deprecatable201Trait<ByProjectKeyProductSelectionsPost>,
        com.commercetools.api.client.ErrorableTrait<ByProjectKeyProductSelectionsPost> {

    private String projectKey;

    private com.commercetools.api.models.product_selection.ProductSelectionDraft productSelectionDraft;

    public ByProjectKeyProductSelectionsPost(final ApiHttpClient apiHttpClient, String projectKey,
            com.commercetools.api.models.product_selection.ProductSelectionDraft productSelectionDraft) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.productSelectionDraft = productSelectionDraft;
    }

    public ByProjectKeyProductSelectionsPost(ByProjectKeyProductSelectionsPost t) {
        super(t);
        this.projectKey = t.projectKey;
        this.productSelectionDraft = t.productSelectionDraft;
    }

    @Override
    protected ApiHttpRequest buildHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("%s/product-selections", this.projectKey);
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }
        return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(),
            io.vrap.rmf.base.client.utils.json.JsonUtils
                    .executing(() -> apiHttpClient().getSerializerService().toJsonByteArray(productSelectionDraft)));

    }

    @Override
    public ApiHttpResponse<com.commercetools.api.models.product_selection.ProductSelection> executeBlocking(
            final ApiHttpClient client, final Duration timeout) {
        return executeBlocking(client, timeout, com.commercetools.api.models.product_selection.ProductSelection.class);
    }

    @Override
    public CompletableFuture<ApiHttpResponse<com.commercetools.api.models.product_selection.ProductSelection>> execute(
            final ApiHttpClient client) {
        return execute(client, com.commercetools.api.models.product_selection.ProductSelection.class);
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
     * @return ByProjectKeyProductSelectionsPost
     */
    public <TValue> ByProjectKeyProductSelectionsPost withExpand(final TValue expand) {
        return copy().withQueryParam("expand", expand);
    }

    /**
     * add additional expand query parameter
     * @param expand value to be added
     * @param <TValue> value type
     * @return ByProjectKeyProductSelectionsPost
     */
    public <TValue> ByProjectKeyProductSelectionsPost addExpand(final TValue expand) {
        return copy().addQueryParam("expand", expand);
    }

    /**
     * set expand with the specified value
     * @param supplier supplier for the value to be set
     * @return ByProjectKeyProductSelectionsPost
     */
    public ByProjectKeyProductSelectionsPost withExpand(final Supplier<String> supplier) {
        return copy().withQueryParam("expand", supplier.get());
    }

    /**
     * add additional expand query parameter
     * @param supplier supplier for the value to be added
     * @return ByProjectKeyProductSelectionsPost
     */
    public ByProjectKeyProductSelectionsPost addExpand(final Supplier<String> supplier) {
        return copy().addQueryParam("expand", supplier.get());
    }

    /**
     * set expand with the specified value
     * @param op builder for the value to be set
     * @return ByProjectKeyProductSelectionsPost
     */
    public ByProjectKeyProductSelectionsPost withExpand(final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("expand", op.apply(new StringBuilder()));
    }

    /**
     * add additional expand query parameter
     * @param op builder for the value to be added
     * @return ByProjectKeyProductSelectionsPost
     */
    public ByProjectKeyProductSelectionsPost addExpand(final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("expand", op.apply(new StringBuilder()));
    }

    /**
     * set expand with the specified values
     * @param expand values to be set
     * @param <TValue> value type
     * @return ByProjectKeyProductSelectionsPost
     */
    public <TValue> ByProjectKeyProductSelectionsPost withExpand(final Collection<TValue> expand) {
        return copy().withoutQueryParam("expand")
                .addQueryParams(
                    expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional expand query parameters
     * @param expand values to be added
     * @param <TValue> value type
     * @return ByProjectKeyProductSelectionsPost
     */
    public <TValue> ByProjectKeyProductSelectionsPost addExpand(final Collection<TValue> expand) {
        return copy().addQueryParams(
            expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList()));
    }

    public com.commercetools.api.models.product_selection.ProductSelectionDraft getBody() {
        return productSelectionDraft;
    }

    public ByProjectKeyProductSelectionsPost withBody(
            com.commercetools.api.models.product_selection.ProductSelectionDraft productSelectionDraft) {
        ByProjectKeyProductSelectionsPost t = copy();
        t.productSelectionDraft = productSelectionDraft;
        return t;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ByProjectKeyProductSelectionsPost that = (ByProjectKeyProductSelectionsPost) o;

        return new EqualsBuilder().append(projectKey, that.projectKey)
                .append(productSelectionDraft, that.productSelectionDraft)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(projectKey).append(productSelectionDraft).toHashCode();
    }

    @Override
    protected ByProjectKeyProductSelectionsPost copy() {
        return new ByProjectKeyProductSelectionsPost(this);
    }
}
