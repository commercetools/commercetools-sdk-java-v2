
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
 *            .post("")
 *            .execute()
 * }</code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyProductSelectionsPostString extends
        StringBodyApiMethod<ByProjectKeyProductSelectionsPostString, com.commercetools.api.models.product_selection.ProductSelection>
        implements com.commercetools.api.client.ExpandableTrait<ByProjectKeyProductSelectionsPostString>,
        com.commercetools.api.client.Deprecatable201Trait<ByProjectKeyProductSelectionsPostString>,
        com.commercetools.api.client.ErrorableTrait<ByProjectKeyProductSelectionsPostString> {

    private String projectKey;

    private String productSelectionDraft;

    public ByProjectKeyProductSelectionsPostString(final ApiHttpClient apiHttpClient, String projectKey,
            String productSelectionDraft) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.productSelectionDraft = productSelectionDraft;
    }

    public ByProjectKeyProductSelectionsPostString(ByProjectKeyProductSelectionsPostString t) {
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
            productSelectionDraft.getBytes(StandardCharsets.UTF_8));

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
     * @param <TValue> value type
     * @param expand value to be set
     * @return ByProjectKeyProductSelectionsPostString
     */
    public <TValue> ByProjectKeyProductSelectionsPostString withExpand(final TValue expand) {
        return copy().withQueryParam("expand", expand);
    }

    /**
     * add additional expand query parameter
     * @param <TValue> value type
     * @param expand value to be added
     * @return ByProjectKeyProductSelectionsPostString
     */
    public <TValue> ByProjectKeyProductSelectionsPostString addExpand(final TValue expand) {
        return copy().addQueryParam("expand", expand);
    }

    /**
     * set expand with the specified value
     * @param supplier supplier for the value to be set
     * @return ByProjectKeyProductSelectionsPostString
     */
    public ByProjectKeyProductSelectionsPostString withExpand(final Supplier<String> supplier) {
        return copy().withQueryParam("expand", supplier.get());
    }

    /**
     * add additional expand query parameter
     * @param supplier supplier for the value to be added
     * @return ByProjectKeyProductSelectionsPostString
     */
    public ByProjectKeyProductSelectionsPostString addExpand(final Supplier<String> supplier) {
        return copy().addQueryParam("expand", supplier.get());
    }

    /**
     * set expand with the specified value
     * @param op builder for the value to be set
     * @return ByProjectKeyProductSelectionsPostString
     */
    public ByProjectKeyProductSelectionsPostString withExpand(final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("expand", op.apply(new StringBuilder()));
    }

    /**
     * add additional expand query parameter
     * @param op builder for the value to be added
     * @return ByProjectKeyProductSelectionsPostString
     */
    public ByProjectKeyProductSelectionsPostString addExpand(final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("expand", op.apply(new StringBuilder()));
    }

    /**
     * set expand with the specified values
     * @param <TValue> value type
     * @param expand values to be set
     * @return ByProjectKeyProductSelectionsPostString
     */
    public <TValue> ByProjectKeyProductSelectionsPostString withExpand(final Collection<TValue> expand) {
        return copy().withoutQueryParam("expand")
                .addQueryParams(
                    expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional expand query parameters
     * @param <TValue> value type
     * @param expand values to be added
     * @return ByProjectKeyProductSelectionsPostString
     */
    public <TValue> ByProjectKeyProductSelectionsPostString addExpand(final Collection<TValue> expand) {
        return copy().addQueryParams(
            expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList()));
    }

    public String getBody() {
        return productSelectionDraft;
    }

    public ByProjectKeyProductSelectionsPostString withBody(String productSelectionDraft) {
        ByProjectKeyProductSelectionsPostString t = copy();
        t.productSelectionDraft = productSelectionDraft;
        return t;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ByProjectKeyProductSelectionsPostString that = (ByProjectKeyProductSelectionsPostString) o;

        return new EqualsBuilder().append(projectKey, that.projectKey)
                .append(productSelectionDraft, that.productSelectionDraft)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(projectKey).append(productSelectionDraft).toHashCode();
    }

    @Override
    protected ByProjectKeyProductSelectionsPostString copy() {
        return new ByProjectKeyProductSelectionsPostString(this);
    }
}
