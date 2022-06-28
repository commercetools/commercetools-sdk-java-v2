
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

/**
 *  <p>Retrieves all the ShippingMethods that can ship to the given Location. If the <code>currency</code> parameter is given, then the ShippingMethods must also have a rate defined in the specified currency. Each ShippingMethod contains at least one ShippingRate with the flag <code>isMatching</code> set to <code>true</code>. If the <code>currency</code> parameter is given, exactly one ShippingRate will contain it.</p>
 *
 * <hr>
 * <div class=code-example>
 * <pre><code class='java'>{@code
 *   CompletableFuture<ApiHttpResponse<com.commercetools.api.models.shipping_method.ShippingMethodPagedQueryResponse>> result = apiRoot
 *            .withProjectKey("{projectKey}")
 *            .shippingMethods()
 *            .matchingLocation()
 *            .get()
 *            .withCountry(country)
 *            .execute()
 * }</code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyShippingMethodsMatchingLocationGet extends
        ApiMethod<ByProjectKeyShippingMethodsMatchingLocationGet, com.commercetools.api.models.shipping_method.ShippingMethodPagedQueryResponse>
        implements com.commercetools.api.client.ExpandableTrait<ByProjectKeyShippingMethodsMatchingLocationGet>,
        com.commercetools.api.client.SortableTrait<ByProjectKeyShippingMethodsMatchingLocationGet>,
        com.commercetools.api.client.ErrorableTrait<ByProjectKeyShippingMethodsMatchingLocationGet>,
        com.commercetools.api.client.Deprecatable200Trait<ByProjectKeyShippingMethodsMatchingLocationGet> {

    private String projectKey;

    public ByProjectKeyShippingMethodsMatchingLocationGet(final ApiHttpClient apiHttpClient, String projectKey) {
        super(apiHttpClient);
        this.projectKey = projectKey;
    }

    public ByProjectKeyShippingMethodsMatchingLocationGet(ByProjectKeyShippingMethodsMatchingLocationGet t) {
        super(t);
        this.projectKey = t.projectKey;
    }

    @Override
    protected ApiHttpRequest buildHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("/%s/shipping-methods/matching-location", this.projectKey);
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }
        return new ApiHttpRequest(ApiHttpMethod.GET, URI.create(httpRequestPath), getHeaders(), null);
    }

    @Override
    public ApiHttpResponse<com.commercetools.api.models.shipping_method.ShippingMethodPagedQueryResponse> executeBlocking(
            final ApiHttpClient client, final Duration timeout) {
        return executeBlocking(client, timeout,
            com.commercetools.api.models.shipping_method.ShippingMethodPagedQueryResponse.class);
    }

    @Override
    public CompletableFuture<ApiHttpResponse<com.commercetools.api.models.shipping_method.ShippingMethodPagedQueryResponse>> execute(
            final ApiHttpClient client) {
        return execute(client, com.commercetools.api.models.shipping_method.ShippingMethodPagedQueryResponse.class);
    }

    public String getProjectKey() {
        return this.projectKey;
    }

    public List<String> getCountry() {
        return this.getQueryParam("country");
    }

    public List<String> getState() {
        return this.getQueryParam("state");
    }

    public List<String> getCurrency() {
        return this.getQueryParam("currency");
    }

    public List<String> getExpand() {
        return this.getQueryParam("expand");
    }

    public List<String> getSort() {
        return this.getQueryParam("sort");
    }

    public void setProjectKey(final String projectKey) {
        this.projectKey = projectKey;
    }

    /**
     * set country with the specified value
     */
    public <TValue> ByProjectKeyShippingMethodsMatchingLocationGet withCountry(final TValue country) {
        return copy().withQueryParam("country", country);
    }

    /**
     * add additional country query parameter
     */
    public <TValue> ByProjectKeyShippingMethodsMatchingLocationGet addCountry(final TValue country) {
        return copy().addQueryParam("country", country);
    }

    /**
     * set country with the specified value
     */
    public ByProjectKeyShippingMethodsMatchingLocationGet withCountry(final Supplier<String> supplier) {
        return copy().withQueryParam("country", supplier.get());
    }

    /**
     * add additional country query parameter
     */
    public ByProjectKeyShippingMethodsMatchingLocationGet addCountry(final Supplier<String> supplier) {
        return copy().addQueryParam("country", supplier.get());
    }

    /**
     * set country with the specified value
     */
    public ByProjectKeyShippingMethodsMatchingLocationGet withCountry(final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("country", op.apply(new StringBuilder()));
    }

    /**
     * add additional country query parameter
     */
    public ByProjectKeyShippingMethodsMatchingLocationGet addCountry(final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("country", op.apply(new StringBuilder()));
    }

    /**
     * set country with the specified values
     */
    public <TValue> ByProjectKeyShippingMethodsMatchingLocationGet withCountry(final List<TValue> country) {
        return copy().withoutQueryParam("country")
                .addQueryParams(
                    country.stream().map(s -> new ParamEntry<>("country", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional country query parameters
     */
    public <TValue> ByProjectKeyShippingMethodsMatchingLocationGet addCountry(final List<TValue> country) {
        return copy().addQueryParams(
            country.stream().map(s -> new ParamEntry<>("country", s.toString())).collect(Collectors.toList()));
    }

    /**
     * set state with the specified value
     */
    public <TValue> ByProjectKeyShippingMethodsMatchingLocationGet withState(final TValue state) {
        return copy().withQueryParam("state", state);
    }

    /**
     * add additional state query parameter
     */
    public <TValue> ByProjectKeyShippingMethodsMatchingLocationGet addState(final TValue state) {
        return copy().addQueryParam("state", state);
    }

    /**
     * set state with the specified value
     */
    public ByProjectKeyShippingMethodsMatchingLocationGet withState(final Supplier<String> supplier) {
        return copy().withQueryParam("state", supplier.get());
    }

    /**
     * add additional state query parameter
     */
    public ByProjectKeyShippingMethodsMatchingLocationGet addState(final Supplier<String> supplier) {
        return copy().addQueryParam("state", supplier.get());
    }

    /**
     * set state with the specified value
     */
    public ByProjectKeyShippingMethodsMatchingLocationGet withState(final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("state", op.apply(new StringBuilder()));
    }

    /**
     * add additional state query parameter
     */
    public ByProjectKeyShippingMethodsMatchingLocationGet addState(final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("state", op.apply(new StringBuilder()));
    }

    /**
     * set state with the specified values
     */
    public <TValue> ByProjectKeyShippingMethodsMatchingLocationGet withState(final List<TValue> state) {
        return copy().withoutQueryParam("state")
                .addQueryParams(
                    state.stream().map(s -> new ParamEntry<>("state", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional state query parameters
     */
    public <TValue> ByProjectKeyShippingMethodsMatchingLocationGet addState(final List<TValue> state) {
        return copy().addQueryParams(
            state.stream().map(s -> new ParamEntry<>("state", s.toString())).collect(Collectors.toList()));
    }

    /**
     * set currency with the specified value
     */
    public <TValue> ByProjectKeyShippingMethodsMatchingLocationGet withCurrency(final TValue currency) {
        return copy().withQueryParam("currency", currency);
    }

    /**
     * add additional currency query parameter
     */
    public <TValue> ByProjectKeyShippingMethodsMatchingLocationGet addCurrency(final TValue currency) {
        return copy().addQueryParam("currency", currency);
    }

    /**
     * set currency with the specified value
     */
    public ByProjectKeyShippingMethodsMatchingLocationGet withCurrency(final Supplier<String> supplier) {
        return copy().withQueryParam("currency", supplier.get());
    }

    /**
     * add additional currency query parameter
     */
    public ByProjectKeyShippingMethodsMatchingLocationGet addCurrency(final Supplier<String> supplier) {
        return copy().addQueryParam("currency", supplier.get());
    }

    /**
     * set currency with the specified value
     */
    public ByProjectKeyShippingMethodsMatchingLocationGet withCurrency(
            final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("currency", op.apply(new StringBuilder()));
    }

    /**
     * add additional currency query parameter
     */
    public ByProjectKeyShippingMethodsMatchingLocationGet addCurrency(final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("currency", op.apply(new StringBuilder()));
    }

    /**
     * set currency with the specified values
     */
    public <TValue> ByProjectKeyShippingMethodsMatchingLocationGet withCurrency(final List<TValue> currency) {
        return copy().withoutQueryParam("currency")
                .addQueryParams(currency.stream()
                        .map(s -> new ParamEntry<>("currency", s.toString()))
                        .collect(Collectors.toList()));
    }

    /**
     * add additional currency query parameters
     */
    public <TValue> ByProjectKeyShippingMethodsMatchingLocationGet addCurrency(final List<TValue> currency) {
        return copy().addQueryParams(
            currency.stream().map(s -> new ParamEntry<>("currency", s.toString())).collect(Collectors.toList()));
    }

    /**
     * set expand with the specified value
     */
    public <TValue> ByProjectKeyShippingMethodsMatchingLocationGet withExpand(final TValue expand) {
        return copy().withQueryParam("expand", expand);
    }

    /**
     * add additional expand query parameter
     */
    public <TValue> ByProjectKeyShippingMethodsMatchingLocationGet addExpand(final TValue expand) {
        return copy().addQueryParam("expand", expand);
    }

    /**
     * set expand with the specified value
     */
    public ByProjectKeyShippingMethodsMatchingLocationGet withExpand(final Supplier<String> supplier) {
        return copy().withQueryParam("expand", supplier.get());
    }

    /**
     * add additional expand query parameter
     */
    public ByProjectKeyShippingMethodsMatchingLocationGet addExpand(final Supplier<String> supplier) {
        return copy().addQueryParam("expand", supplier.get());
    }

    /**
     * set expand with the specified value
     */
    public ByProjectKeyShippingMethodsMatchingLocationGet withExpand(final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("expand", op.apply(new StringBuilder()));
    }

    /**
     * add additional expand query parameter
     */
    public ByProjectKeyShippingMethodsMatchingLocationGet addExpand(final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("expand", op.apply(new StringBuilder()));
    }

    /**
     * set expand with the specified values
     */
    public <TValue> ByProjectKeyShippingMethodsMatchingLocationGet withExpand(final List<TValue> expand) {
        return copy().withoutQueryParam("expand")
                .addQueryParams(
                    expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional expand query parameters
     */
    public <TValue> ByProjectKeyShippingMethodsMatchingLocationGet addExpand(final List<TValue> expand) {
        return copy().addQueryParams(
            expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList()));
    }

    /**
     * set sort with the specified value
     */
    public <TValue> ByProjectKeyShippingMethodsMatchingLocationGet withSort(final TValue sort) {
        return copy().withQueryParam("sort", sort);
    }

    /**
     * add additional sort query parameter
     */
    public <TValue> ByProjectKeyShippingMethodsMatchingLocationGet addSort(final TValue sort) {
        return copy().addQueryParam("sort", sort);
    }

    /**
     * set sort with the specified value
     */
    public ByProjectKeyShippingMethodsMatchingLocationGet withSort(final Supplier<String> supplier) {
        return copy().withQueryParam("sort", supplier.get());
    }

    /**
     * add additional sort query parameter
     */
    public ByProjectKeyShippingMethodsMatchingLocationGet addSort(final Supplier<String> supplier) {
        return copy().addQueryParam("sort", supplier.get());
    }

    /**
     * set sort with the specified value
     */
    public ByProjectKeyShippingMethodsMatchingLocationGet withSort(final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("sort", op.apply(new StringBuilder()));
    }

    /**
     * add additional sort query parameter
     */
    public ByProjectKeyShippingMethodsMatchingLocationGet addSort(final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("sort", op.apply(new StringBuilder()));
    }

    /**
     * set sort with the specified values
     */
    public <TValue> ByProjectKeyShippingMethodsMatchingLocationGet withSort(final List<TValue> sort) {
        return copy().withoutQueryParam("sort")
                .addQueryParams(
                    sort.stream().map(s -> new ParamEntry<>("sort", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional sort query parameters
     */
    public <TValue> ByProjectKeyShippingMethodsMatchingLocationGet addSort(final List<TValue> sort) {
        return copy().addQueryParams(
            sort.stream().map(s -> new ParamEntry<>("sort", s.toString())).collect(Collectors.toList()));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ByProjectKeyShippingMethodsMatchingLocationGet that = (ByProjectKeyShippingMethodsMatchingLocationGet) o;

        return new EqualsBuilder().append(projectKey, that.projectKey).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(projectKey).toHashCode();
    }

    @Override
    protected ByProjectKeyShippingMethodsMatchingLocationGet copy() {
        return new ByProjectKeyShippingMethodsMatchingLocationGet(this);
    }
}
