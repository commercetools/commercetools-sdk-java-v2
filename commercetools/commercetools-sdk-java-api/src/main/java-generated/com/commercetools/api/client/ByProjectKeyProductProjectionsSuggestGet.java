
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
 *
 *
 * <hr>
 * <div class=code-example>
 * <pre><code class='java'>{@code
 *   CompletableFuture<ApiHttpResponse<com.commercetools.api.models.product.SuggestionResult>> result = apiRoot
 *            .withProjectKey("{projectKey}")
 *            .productProjections()
 *            .suggest()
 *            .get()
 *            .execute()
 * }</code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyProductProjectionsSuggestGet extends
        TypeApiMethod<ByProjectKeyProductProjectionsSuggestGet, com.commercetools.api.models.product.SuggestionResult>
        implements com.commercetools.api.client.ProjectionselectingTrait<ByProjectKeyProductProjectionsSuggestGet>,
        com.commercetools.api.client.ErrorableTrait<ByProjectKeyProductProjectionsSuggestGet>,
        com.commercetools.api.client.Deprecatable200Trait<ByProjectKeyProductProjectionsSuggestGet> {

    @Override
    public TypeReference<com.commercetools.api.models.product.SuggestionResult> resultType() {
        return new TypeReference<com.commercetools.api.models.product.SuggestionResult>() {
        };
    }

    private String projectKey;

    public ByProjectKeyProductProjectionsSuggestGet(final ApiHttpClient apiHttpClient, String projectKey) {
        super(apiHttpClient);
        this.projectKey = projectKey;
    }

    public ByProjectKeyProductProjectionsSuggestGet(ByProjectKeyProductProjectionsSuggestGet t) {
        super(t);
        this.projectKey = t.projectKey;
    }

    @Override
    protected ApiHttpRequest buildHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("%s/product-projections/suggest", this.projectKey);
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }
        return new ApiHttpRequest(ApiHttpMethod.GET, URI.create(httpRequestPath), getHeaders(), null);
    }

    @Override
    public ApiHttpResponse<com.commercetools.api.models.product.SuggestionResult> executeBlocking(
            final ApiHttpClient client, final Duration timeout) {
        return executeBlocking(client, timeout, com.commercetools.api.models.product.SuggestionResult.class);
    }

    @Override
    public CompletableFuture<ApiHttpResponse<com.commercetools.api.models.product.SuggestionResult>> execute(
            final ApiHttpClient client) {
        return execute(client, com.commercetools.api.models.product.SuggestionResult.class);
    }

    public String getProjectKey() {
        return this.projectKey;
    }

    public List<String> getLimit() {
        return this.getQueryParam("limit");
    }

    public List<String> getFuzzy() {
        return this.getQueryParam("fuzzy");
    }

    public List<String> getStaged() {
        return this.getQueryParam("staged");
    }

    public void setProjectKey(final String projectKey) {
        this.projectKey = projectKey;
    }

    /**
     * set limit with the specified value
     * @param limit value to be set
     * @param <TValue> value type
     * @return ByProjectKeyProductProjectionsSuggestGet
     */
    public <TValue> ByProjectKeyProductProjectionsSuggestGet withLimit(final TValue limit) {
        return copy().withQueryParam("limit", limit);
    }

    /**
     * add additional limit query parameter
     * @param limit value to be added
     * @param <TValue> value type
     * @return ByProjectKeyProductProjectionsSuggestGet
     */
    public <TValue> ByProjectKeyProductProjectionsSuggestGet addLimit(final TValue limit) {
        return copy().addQueryParam("limit", limit);
    }

    /**
     * set limit with the specified value
     * @param supplier supplier for the value to be set
     * @return ByProjectKeyProductProjectionsSuggestGet
     */
    public ByProjectKeyProductProjectionsSuggestGet withLimit(final Supplier<Integer> supplier) {
        return copy().withQueryParam("limit", supplier.get());
    }

    /**
     * add additional limit query parameter
     * @param supplier supplier for the value to be added
     * @return ByProjectKeyProductProjectionsSuggestGet
     */
    public ByProjectKeyProductProjectionsSuggestGet addLimit(final Supplier<Integer> supplier) {
        return copy().addQueryParam("limit", supplier.get());
    }

    /**
     * set limit with the specified value
     * @param op builder for the value to be set
     * @return ByProjectKeyProductProjectionsSuggestGet
     */
    public ByProjectKeyProductProjectionsSuggestGet withLimit(final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("limit", op.apply(new StringBuilder()));
    }

    /**
     * add additional limit query parameter
     * @param op builder for the value to be added
     * @return ByProjectKeyProductProjectionsSuggestGet
     */
    public ByProjectKeyProductProjectionsSuggestGet addLimit(final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("limit", op.apply(new StringBuilder()));
    }

    /**
     * set limit with the specified values
     * @param limit values to be set
     * @param <TValue> value type
     * @return ByProjectKeyProductProjectionsSuggestGet
     */
    public <TValue> ByProjectKeyProductProjectionsSuggestGet withLimit(final Collection<TValue> limit) {
        return copy().withoutQueryParam("limit")
                .addQueryParams(
                    limit.stream().map(s -> new ParamEntry<>("limit", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional limit query parameters
     * @param limit values to be added
     * @param <TValue> value type
     * @return ByProjectKeyProductProjectionsSuggestGet
     */
    public <TValue> ByProjectKeyProductProjectionsSuggestGet addLimit(final Collection<TValue> limit) {
        return copy().addQueryParams(
            limit.stream().map(s -> new ParamEntry<>("limit", s.toString())).collect(Collectors.toList()));
    }

    /**
     * set fuzzy with the specified value
     * @param fuzzy value to be set
     * @param <TValue> value type
     * @return ByProjectKeyProductProjectionsSuggestGet
     */
    public <TValue> ByProjectKeyProductProjectionsSuggestGet withFuzzy(final TValue fuzzy) {
        return copy().withQueryParam("fuzzy", fuzzy);
    }

    /**
     * add additional fuzzy query parameter
     * @param fuzzy value to be added
     * @param <TValue> value type
     * @return ByProjectKeyProductProjectionsSuggestGet
     */
    public <TValue> ByProjectKeyProductProjectionsSuggestGet addFuzzy(final TValue fuzzy) {
        return copy().addQueryParam("fuzzy", fuzzy);
    }

    /**
     * set fuzzy with the specified value
     * @param supplier supplier for the value to be set
     * @return ByProjectKeyProductProjectionsSuggestGet
     */
    public ByProjectKeyProductProjectionsSuggestGet withFuzzy(final Supplier<Boolean> supplier) {
        return copy().withQueryParam("fuzzy", supplier.get());
    }

    /**
     * add additional fuzzy query parameter
     * @param supplier supplier for the value to be added
     * @return ByProjectKeyProductProjectionsSuggestGet
     */
    public ByProjectKeyProductProjectionsSuggestGet addFuzzy(final Supplier<Boolean> supplier) {
        return copy().addQueryParam("fuzzy", supplier.get());
    }

    /**
     * set fuzzy with the specified value
     * @param op builder for the value to be set
     * @return ByProjectKeyProductProjectionsSuggestGet
     */
    public ByProjectKeyProductProjectionsSuggestGet withFuzzy(final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("fuzzy", op.apply(new StringBuilder()));
    }

    /**
     * add additional fuzzy query parameter
     * @param op builder for the value to be added
     * @return ByProjectKeyProductProjectionsSuggestGet
     */
    public ByProjectKeyProductProjectionsSuggestGet addFuzzy(final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("fuzzy", op.apply(new StringBuilder()));
    }

    /**
     * set fuzzy with the specified values
     * @param fuzzy values to be set
     * @param <TValue> value type
     * @return ByProjectKeyProductProjectionsSuggestGet
     */
    public <TValue> ByProjectKeyProductProjectionsSuggestGet withFuzzy(final Collection<TValue> fuzzy) {
        return copy().withoutQueryParam("fuzzy")
                .addQueryParams(
                    fuzzy.stream().map(s -> new ParamEntry<>("fuzzy", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional fuzzy query parameters
     * @param fuzzy values to be added
     * @param <TValue> value type
     * @return ByProjectKeyProductProjectionsSuggestGet
     */
    public <TValue> ByProjectKeyProductProjectionsSuggestGet addFuzzy(final Collection<TValue> fuzzy) {
        return copy().addQueryParams(
            fuzzy.stream().map(s -> new ParamEntry<>("fuzzy", s.toString())).collect(Collectors.toList()));
    }

    /**
     * set staged with the specified value
     * @param staged value to be set
     * @param <TValue> value type
     * @return ByProjectKeyProductProjectionsSuggestGet
     */
    public <TValue> ByProjectKeyProductProjectionsSuggestGet withStaged(final TValue staged) {
        return copy().withQueryParam("staged", staged);
    }

    /**
     * add additional staged query parameter
     * @param staged value to be added
     * @param <TValue> value type
     * @return ByProjectKeyProductProjectionsSuggestGet
     */
    public <TValue> ByProjectKeyProductProjectionsSuggestGet addStaged(final TValue staged) {
        return copy().addQueryParam("staged", staged);
    }

    /**
     * set staged with the specified value
     * @param supplier supplier for the value to be set
     * @return ByProjectKeyProductProjectionsSuggestGet
     */
    public ByProjectKeyProductProjectionsSuggestGet withStaged(final Supplier<Boolean> supplier) {
        return copy().withQueryParam("staged", supplier.get());
    }

    /**
     * add additional staged query parameter
     * @param supplier supplier for the value to be added
     * @return ByProjectKeyProductProjectionsSuggestGet
     */
    public ByProjectKeyProductProjectionsSuggestGet addStaged(final Supplier<Boolean> supplier) {
        return copy().addQueryParam("staged", supplier.get());
    }

    /**
     * set staged with the specified value
     * @param op builder for the value to be set
     * @return ByProjectKeyProductProjectionsSuggestGet
     */
    public ByProjectKeyProductProjectionsSuggestGet withStaged(final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("staged", op.apply(new StringBuilder()));
    }

    /**
     * add additional staged query parameter
     * @param op builder for the value to be added
     * @return ByProjectKeyProductProjectionsSuggestGet
     */
    public ByProjectKeyProductProjectionsSuggestGet addStaged(final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("staged", op.apply(new StringBuilder()));
    }

    /**
     * set staged with the specified values
     * @param staged values to be set
     * @param <TValue> value type
     * @return ByProjectKeyProductProjectionsSuggestGet
     */
    public <TValue> ByProjectKeyProductProjectionsSuggestGet withStaged(final Collection<TValue> staged) {
        return copy().withoutQueryParam("staged")
                .addQueryParams(
                    staged.stream().map(s -> new ParamEntry<>("staged", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional staged query parameters
     * @param staged values to be added
     * @param <TValue> value type
     * @return ByProjectKeyProductProjectionsSuggestGet
     */
    public <TValue> ByProjectKeyProductProjectionsSuggestGet addStaged(final Collection<TValue> staged) {
        return copy().addQueryParams(
            staged.stream().map(s -> new ParamEntry<>("staged", s.toString())).collect(Collectors.toList()));
    }

    /**
     * set searchKeywords with the specificied value
     * @param <TValue> value type
     * @param locale parameter name
     * @param searchKeywords parameter value
     * @return ByProjectKeyProductProjectionsSuggestGet
     */
    public <TValue> ByProjectKeyProductProjectionsSuggestGet withSearchKeywords(final String locale,
            final TValue searchKeywords) {
        return copy().withQueryParam(String.format("searchKeywords.%s", locale), searchKeywords);
    }

    /**
     * add additional searchKeywords query parameter
     * @param <TValue> value type
     * @param locale parameter name
     * @param searchKeywords parameter value
     * @return ByProjectKeyProductProjectionsSuggestGet
     */
    public <TValue> ByProjectKeyProductProjectionsSuggestGet addSearchKeywords(final String locale,
            final TValue searchKeywords) {
        return copy().addQueryParam(String.format("searchKeywords.%s", locale), searchKeywords);
    }

    /**
     * set searchKeywords with the specificied values
     * @param <TValue> value type
     * @param locale parameter name
     * @param searchKeywords parameter values
     * @return ByProjectKeyProductProjectionsSuggestGet
     */
    public <TValue> ByProjectKeyProductProjectionsSuggestGet withSearchKeywords(final String locale,
            final Collection<TValue> searchKeywords) {
        final String placeholderName = String.format("var.%s", locale);
        return copy().withoutQueryParam(placeholderName)
                .addQueryParams(searchKeywords.stream()
                        .map(s -> new ParamEntry<>(placeholderName, s.toString()))
                        .collect(Collectors.toList()));
    }

    /**
     * add additional searchKeywords query parameters
     * @param <TValue> value type
     * @param locale parameter name
     * @param searchKeywords parameter values
     * @return ByProjectKeyProductProjectionsSuggestGet
     */
    public <TValue> ByProjectKeyProductProjectionsSuggestGet addSearchKeywords(final String locale,
            final Collection<TValue> searchKeywords) {
        final String placeholderName = String.format("var.%s", locale);
        return copy().addQueryParams(searchKeywords.stream()
                .map(s -> new ParamEntry<>(placeholderName, s.toString()))
                .collect(Collectors.toList()));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ByProjectKeyProductProjectionsSuggestGet that = (ByProjectKeyProductProjectionsSuggestGet) o;

        return new EqualsBuilder().append(projectKey, that.projectKey).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(projectKey).toHashCode();
    }

    @Override
    protected ByProjectKeyProductProjectionsSuggestGet copy() {
        return new ByProjectKeyProductProjectionsSuggestGet(this);
    }
}
