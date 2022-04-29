
package com.commercetools.api.client;

import java.net.URI;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;

import io.vrap.rmf.base.client.*;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ByProjectKeyProductProjectionsSuggestGet extends
        ApiMethod<ByProjectKeyProductProjectionsSuggestGet, com.commercetools.api.models.product.SuggestionResult>
        implements com.commercetools.api.client.SortableTrait<ByProjectKeyProductProjectionsSuggestGet>,
        com.commercetools.api.client.PagingTrait<ByProjectKeyProductProjectionsSuggestGet>,
        com.commercetools.api.client.ErrorableTrait<ByProjectKeyProductProjectionsSuggestGet>,
        com.commercetools.api.client.Deprecatable200Trait<ByProjectKeyProductProjectionsSuggestGet> {

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
        String httpRequestPath = String.format("/%s/product-projections/suggest", this.projectKey);
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

    public List<String> getFuzzy() {
        return this.getQueryParam("fuzzy");
    }

    public List<String> getStaged() {
        return this.getQueryParam("staged");
    }

    public List<String> getSort() {
        return this.getQueryParam("sort");
    }

    public List<String> getLimit() {
        return this.getQueryParam("limit");
    }

    public List<String> getOffset() {
        return this.getQueryParam("offset");
    }

    public List<String> getWithTotal() {
        return this.getQueryParam("withTotal");
    }

    public void setProjectKey(final String projectKey) {
        this.projectKey = projectKey;
    }

    /**
     * set fuzzy with the specified value
     */
    public <TValue> ByProjectKeyProductProjectionsSuggestGet withFuzzy(final TValue fuzzy) {
        return copy().withQueryParam("fuzzy", fuzzy);
    }

    /**
     * add additional fuzzy query parameter
     */
    public <TValue> ByProjectKeyProductProjectionsSuggestGet addFuzzy(final TValue fuzzy) {
        return copy().addQueryParam("fuzzy", fuzzy);
    }

    /**
     * set fuzzy with the specified value
     */
    public ByProjectKeyProductProjectionsSuggestGet withFuzzy(final Supplier<Boolean> supplier) {
        return copy().withQueryParam("fuzzy", supplier.get());
    }

    /**
     * add additional fuzzy query parameter
     */
    public ByProjectKeyProductProjectionsSuggestGet addFuzzy(final Supplier<Boolean> supplier) {
        return copy().addQueryParam("fuzzy", supplier.get());
    }

    /**
     * set fuzzy with the specified value
     */
    public ByProjectKeyProductProjectionsSuggestGet withFuzzy(final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("fuzzy", op.apply(new StringBuilder()));
    }

    /**
     * add additional fuzzy query parameter
     */
    public ByProjectKeyProductProjectionsSuggestGet addFuzzy(final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("fuzzy", op.apply(new StringBuilder()));
    }

    /**
     * set fuzzy with the specified values
     */
    public <TValue> ByProjectKeyProductProjectionsSuggestGet withFuzzy(final List<TValue> fuzzy) {
        return copy().withoutQueryParam("fuzzy")
                .addQueryParams(
                    fuzzy.stream().map(s -> new ParamEntry<>("fuzzy", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional fuzzy query parameters
     */
    public <TValue> ByProjectKeyProductProjectionsSuggestGet addFuzzy(final List<TValue> fuzzy) {
        return copy().addQueryParams(
            fuzzy.stream().map(s -> new ParamEntry<>("fuzzy", s.toString())).collect(Collectors.toList()));
    }

    /**
     * set staged with the specified value
     */
    public <TValue> ByProjectKeyProductProjectionsSuggestGet withStaged(final TValue staged) {
        return copy().withQueryParam("staged", staged);
    }

    /**
     * add additional staged query parameter
     */
    public <TValue> ByProjectKeyProductProjectionsSuggestGet addStaged(final TValue staged) {
        return copy().addQueryParam("staged", staged);
    }

    /**
     * set staged with the specified value
     */
    public ByProjectKeyProductProjectionsSuggestGet withStaged(final Supplier<Boolean> supplier) {
        return copy().withQueryParam("staged", supplier.get());
    }

    /**
     * add additional staged query parameter
     */
    public ByProjectKeyProductProjectionsSuggestGet addStaged(final Supplier<Boolean> supplier) {
        return copy().addQueryParam("staged", supplier.get());
    }

    /**
     * set staged with the specified value
     */
    public ByProjectKeyProductProjectionsSuggestGet withStaged(final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("staged", op.apply(new StringBuilder()));
    }

    /**
     * add additional staged query parameter
     */
    public ByProjectKeyProductProjectionsSuggestGet addStaged(final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("staged", op.apply(new StringBuilder()));
    }

    /**
     * set staged with the specified values
     */
    public <TValue> ByProjectKeyProductProjectionsSuggestGet withStaged(final List<TValue> staged) {
        return copy().withoutQueryParam("staged")
                .addQueryParams(
                    staged.stream().map(s -> new ParamEntry<>("staged", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional staged query parameters
     */
    public <TValue> ByProjectKeyProductProjectionsSuggestGet addStaged(final List<TValue> staged) {
        return copy().addQueryParams(
            staged.stream().map(s -> new ParamEntry<>("staged", s.toString())).collect(Collectors.toList()));
    }

    /**
     * set sort with the specified value
     */
    public <TValue> ByProjectKeyProductProjectionsSuggestGet withSort(final TValue sort) {
        return copy().withQueryParam("sort", sort);
    }

    /**
     * add additional sort query parameter
     */
    public <TValue> ByProjectKeyProductProjectionsSuggestGet addSort(final TValue sort) {
        return copy().addQueryParam("sort", sort);
    }

    /**
     * set sort with the specified value
     */
    public ByProjectKeyProductProjectionsSuggestGet withSort(final Supplier<String> supplier) {
        return copy().withQueryParam("sort", supplier.get());
    }

    /**
     * add additional sort query parameter
     */
    public ByProjectKeyProductProjectionsSuggestGet addSort(final Supplier<String> supplier) {
        return copy().addQueryParam("sort", supplier.get());
    }

    /**
     * set sort with the specified value
     */
    public ByProjectKeyProductProjectionsSuggestGet withSort(final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("sort", op.apply(new StringBuilder()));
    }

    /**
     * add additional sort query parameter
     */
    public ByProjectKeyProductProjectionsSuggestGet addSort(final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("sort", op.apply(new StringBuilder()));
    }

    /**
     * set sort with the specified values
     */
    public <TValue> ByProjectKeyProductProjectionsSuggestGet withSort(final List<TValue> sort) {
        return copy().withoutQueryParam("sort")
                .addQueryParams(
                    sort.stream().map(s -> new ParamEntry<>("sort", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional sort query parameters
     */
    public <TValue> ByProjectKeyProductProjectionsSuggestGet addSort(final List<TValue> sort) {
        return copy().addQueryParams(
            sort.stream().map(s -> new ParamEntry<>("sort", s.toString())).collect(Collectors.toList()));
    }

    /**
     * set limit with the specified value
     */
    public <TValue> ByProjectKeyProductProjectionsSuggestGet withLimit(final TValue limit) {
        return copy().withQueryParam("limit", limit);
    }

    /**
     * add additional limit query parameter
     */
    public <TValue> ByProjectKeyProductProjectionsSuggestGet addLimit(final TValue limit) {
        return copy().addQueryParam("limit", limit);
    }

    /**
     * set limit with the specified value
     */
    public ByProjectKeyProductProjectionsSuggestGet withLimit(final Supplier<Integer> supplier) {
        return copy().withQueryParam("limit", supplier.get());
    }

    /**
     * add additional limit query parameter
     */
    public ByProjectKeyProductProjectionsSuggestGet addLimit(final Supplier<Integer> supplier) {
        return copy().addQueryParam("limit", supplier.get());
    }

    /**
     * set limit with the specified value
     */
    public ByProjectKeyProductProjectionsSuggestGet withLimit(final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("limit", op.apply(new StringBuilder()));
    }

    /**
     * add additional limit query parameter
     */
    public ByProjectKeyProductProjectionsSuggestGet addLimit(final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("limit", op.apply(new StringBuilder()));
    }

    /**
     * set limit with the specified values
     */
    public <TValue> ByProjectKeyProductProjectionsSuggestGet withLimit(final List<TValue> limit) {
        return copy().withoutQueryParam("limit")
                .addQueryParams(
                    limit.stream().map(s -> new ParamEntry<>("limit", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional limit query parameters
     */
    public <TValue> ByProjectKeyProductProjectionsSuggestGet addLimit(final List<TValue> limit) {
        return copy().addQueryParams(
            limit.stream().map(s -> new ParamEntry<>("limit", s.toString())).collect(Collectors.toList()));
    }

    /**
     * set offset with the specified value
     */
    public <TValue> ByProjectKeyProductProjectionsSuggestGet withOffset(final TValue offset) {
        return copy().withQueryParam("offset", offset);
    }

    /**
     * add additional offset query parameter
     */
    public <TValue> ByProjectKeyProductProjectionsSuggestGet addOffset(final TValue offset) {
        return copy().addQueryParam("offset", offset);
    }

    /**
     * set offset with the specified value
     */
    public ByProjectKeyProductProjectionsSuggestGet withOffset(final Supplier<Integer> supplier) {
        return copy().withQueryParam("offset", supplier.get());
    }

    /**
     * add additional offset query parameter
     */
    public ByProjectKeyProductProjectionsSuggestGet addOffset(final Supplier<Integer> supplier) {
        return copy().addQueryParam("offset", supplier.get());
    }

    /**
     * set offset with the specified value
     */
    public ByProjectKeyProductProjectionsSuggestGet withOffset(final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("offset", op.apply(new StringBuilder()));
    }

    /**
     * add additional offset query parameter
     */
    public ByProjectKeyProductProjectionsSuggestGet addOffset(final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("offset", op.apply(new StringBuilder()));
    }

    /**
     * set offset with the specified values
     */
    public <TValue> ByProjectKeyProductProjectionsSuggestGet withOffset(final List<TValue> offset) {
        return copy().withoutQueryParam("offset")
                .addQueryParams(
                    offset.stream().map(s -> new ParamEntry<>("offset", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional offset query parameters
     */
    public <TValue> ByProjectKeyProductProjectionsSuggestGet addOffset(final List<TValue> offset) {
        return copy().addQueryParams(
            offset.stream().map(s -> new ParamEntry<>("offset", s.toString())).collect(Collectors.toList()));
    }

    /**
     * set withTotal with the specified value
     */
    public <TValue> ByProjectKeyProductProjectionsSuggestGet withWithTotal(final TValue withTotal) {
        return copy().withQueryParam("withTotal", withTotal);
    }

    /**
     * add additional withTotal query parameter
     */
    public <TValue> ByProjectKeyProductProjectionsSuggestGet addWithTotal(final TValue withTotal) {
        return copy().addQueryParam("withTotal", withTotal);
    }

    /**
     * set withTotal with the specified value
     */
    public ByProjectKeyProductProjectionsSuggestGet withWithTotal(final Supplier<Boolean> supplier) {
        return copy().withQueryParam("withTotal", supplier.get());
    }

    /**
     * add additional withTotal query parameter
     */
    public ByProjectKeyProductProjectionsSuggestGet addWithTotal(final Supplier<Boolean> supplier) {
        return copy().addQueryParam("withTotal", supplier.get());
    }

    /**
     * set withTotal with the specified value
     */
    public ByProjectKeyProductProjectionsSuggestGet withWithTotal(final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("withTotal", op.apply(new StringBuilder()));
    }

    /**
     * add additional withTotal query parameter
     */
    public ByProjectKeyProductProjectionsSuggestGet addWithTotal(final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("withTotal", op.apply(new StringBuilder()));
    }

    /**
     * set withTotal with the specified values
     */
    public <TValue> ByProjectKeyProductProjectionsSuggestGet withWithTotal(final List<TValue> withTotal) {
        return copy().withoutQueryParam("withTotal")
                .addQueryParams(withTotal.stream()
                        .map(s -> new ParamEntry<>("withTotal", s.toString()))
                        .collect(Collectors.toList()));
    }

    /**
     * add additional withTotal query parameters
     */
    public <TValue> ByProjectKeyProductProjectionsSuggestGet addWithTotal(final List<TValue> withTotal) {
        return copy().addQueryParams(
            withTotal.stream().map(s -> new ParamEntry<>("withTotal", s.toString())).collect(Collectors.toList()));
    }

    /**
     * set searchKeywords with the specificied value
     */
    public <TValue> ByProjectKeyProductProjectionsSuggestGet withSearchKeywords(final String locale,
            final TValue searchKeywords) {
        return copy().withQueryParam(String.format("searchKeywords.%s", locale), searchKeywords);
    }

    /**
     * add additional searchKeywords query parameter
     */
    public <TValue> ByProjectKeyProductProjectionsSuggestGet addSearchKeywords(final String locale,
            final TValue searchKeywords) {
        return copy().addQueryParam(String.format("searchKeywords.%s", locale), searchKeywords);
    }

    /**
     * set searchKeywords with the specificied values
     */
    public <TValue> ByProjectKeyProductProjectionsSuggestGet withSearchKeywords(final String locale,
            final List<TValue> searchKeywords) {
        final String placeholderName = String.format("var.%s", locale);
        return copy().withoutQueryParam(placeholderName)
                .addQueryParams(searchKeywords.stream()
                        .map(s -> new ParamEntry<>(placeholderName, s.toString()))
                        .collect(Collectors.toList()));
    }

    /**
     * add additional searchKeywords query parameters
     */
    public <TValue> ByProjectKeyProductProjectionsSuggestGet addSearchKeywords(final String locale,
            final List<TValue> searchKeywords) {
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
