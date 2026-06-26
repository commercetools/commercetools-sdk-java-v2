
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
 *  <p>Checks if a Variant Projection exists for the provided query predicate. Returns a <code>200</code> status if any Variant Projections match, or a <code>404</code> status otherwise.</p>
 *
 * <hr>
 * <div class=code-example>
 * <pre><code class='java'>{@code
 *   CompletableFuture<ApiHttpResponse<tools.jackson.databind.JsonNode>> result = apiRoot
 *            .withProjectKey("{projectKey}")
 *            .variantProjections()
 *            .head()
 *            .execute()
 * }</code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyVariantProjectionsHead
        extends TypeApiMethod<ByProjectKeyVariantProjectionsHead, tools.jackson.databind.JsonNode>
        implements com.commercetools.api.client.ProjectionselectingvariantTrait<ByProjectKeyVariantProjectionsHead>,
        com.commercetools.api.client.ProjectionvalidatingTrait<ByProjectKeyVariantProjectionsHead>,
        com.commercetools.api.client.ErrorableTrait<ByProjectKeyVariantProjectionsHead>,
        com.commercetools.api.client.Deprecatable200Trait<ByProjectKeyVariantProjectionsHead> {

    @Override
    public TypeReference<tools.jackson.databind.JsonNode> resultType() {
        return new TypeReference<tools.jackson.databind.JsonNode>() {
        };
    }

    private String projectKey;

    public ByProjectKeyVariantProjectionsHead(final ApiHttpClient apiHttpClient, String projectKey) {
        super(apiHttpClient);
        this.projectKey = projectKey;
    }

    public ByProjectKeyVariantProjectionsHead(ByProjectKeyVariantProjectionsHead t) {
        super(t);
        this.projectKey = t.projectKey;
    }

    @Override
    protected ApiHttpRequest buildHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("%s/variant-projections", encodePathParam(this.projectKey));
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }
        return new ApiHttpRequest(ApiHttpMethod.HEAD, URI.create(httpRequestPath), getHeaders(), null);
    }

    @Override
    public ApiHttpResponse<tools.jackson.databind.JsonNode> executeBlocking(final ApiHttpClient client,
            final Duration timeout) {
        return executeBlocking(client, timeout, tools.jackson.databind.JsonNode.class);
    }

    @Override
    public CompletableFuture<ApiHttpResponse<tools.jackson.databind.JsonNode>> execute(final ApiHttpClient client) {
        return execute(client, tools.jackson.databind.JsonNode.class);
    }

    public String getProjectKey() {
        return this.projectKey;
    }

    public List<String> getWhere() {
        return this.getQueryParam("where");
    }

    public List<String> getStaged() {
        return this.getQueryParam("staged");
    }

    public List<String> getPriceCurrency() {
        return this.getQueryParam("priceCurrency");
    }

    public List<String> getPriceCountry() {
        return this.getQueryParam("priceCountry");
    }

    public List<String> getPriceCustomerGroup() {
        return this.getQueryParam("priceCustomerGroup");
    }

    public List<String> getPriceChannel() {
        return this.getQueryParam("priceChannel");
    }

    public List<String> getLocaleProjection() {
        return this.getQueryParam("localeProjection");
    }

    public List<String> getFilterAttributes() {
        return this.getQueryParam("filter[attributes]");
    }

    public void setProjectKey(final String projectKey) {
        this.projectKey = projectKey;
    }

    /**
     * set where with the specified value
     * @param where value to be set
     * @param <TValue> value type
     * @return ByProjectKeyVariantProjectionsHead
     */
    public <TValue> ByProjectKeyVariantProjectionsHead withWhere(final TValue where) {
        return copy().withQueryParam("where", where);
    }

    /**
     * add additional where query parameter
     * @param where value to be added
     * @param <TValue> value type
     * @return ByProjectKeyVariantProjectionsHead
     */
    public <TValue> ByProjectKeyVariantProjectionsHead addWhere(final TValue where) {
        return copy().addQueryParam("where", where);
    }

    /**
     * set where with the specified value
     * @param supplier supplier for the value to be set
     * @return ByProjectKeyVariantProjectionsHead
     */
    public ByProjectKeyVariantProjectionsHead withWhere(final Supplier<String> supplier) {
        return copy().withQueryParam("where", supplier.get());
    }

    /**
     * add additional where query parameter
     * @param supplier supplier for the value to be added
     * @return ByProjectKeyVariantProjectionsHead
     */
    public ByProjectKeyVariantProjectionsHead addWhere(final Supplier<String> supplier) {
        return copy().addQueryParam("where", supplier.get());
    }

    /**
     * set where with the specified value
     * @param op builder for the value to be set
     * @return ByProjectKeyVariantProjectionsHead
     */
    public ByProjectKeyVariantProjectionsHead withWhere(final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("where", op.apply(new StringBuilder()));
    }

    /**
     * add additional where query parameter
     * @param op builder for the value to be added
     * @return ByProjectKeyVariantProjectionsHead
     */
    public ByProjectKeyVariantProjectionsHead addWhere(final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("where", op.apply(new StringBuilder()));
    }

    /**
     * set where with the specified values
     * @param where values to be set
     * @param <TValue> value type
     * @return ByProjectKeyVariantProjectionsHead
     */
    public <TValue> ByProjectKeyVariantProjectionsHead withWhere(final Collection<TValue> where) {
        return copy().withoutQueryParam("where")
                .addQueryParams(
                    where.stream().map(s -> new ParamEntry<>("where", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional where query parameters
     * @param where values to be added
     * @param <TValue> value type
     * @return ByProjectKeyVariantProjectionsHead
     */
    public <TValue> ByProjectKeyVariantProjectionsHead addWhere(final Collection<TValue> where) {
        return copy().addQueryParams(
            where.stream().map(s -> new ParamEntry<>("where", s.toString())).collect(Collectors.toList()));
    }

    /**
     * set staged with the specified value
     * @param staged value to be set
     * @param <TValue> value type
     * @return ByProjectKeyVariantProjectionsHead
     */
    public <TValue> ByProjectKeyVariantProjectionsHead withStaged(final TValue staged) {
        return copy().withQueryParam("staged", staged);
    }

    /**
     * add additional staged query parameter
     * @param staged value to be added
     * @param <TValue> value type
     * @return ByProjectKeyVariantProjectionsHead
     */
    public <TValue> ByProjectKeyVariantProjectionsHead addStaged(final TValue staged) {
        return copy().addQueryParam("staged", staged);
    }

    /**
     * set staged with the specified value
     * @param supplier supplier for the value to be set
     * @return ByProjectKeyVariantProjectionsHead
     */
    public ByProjectKeyVariantProjectionsHead withStaged(final Supplier<Boolean> supplier) {
        return copy().withQueryParam("staged", supplier.get());
    }

    /**
     * add additional staged query parameter
     * @param supplier supplier for the value to be added
     * @return ByProjectKeyVariantProjectionsHead
     */
    public ByProjectKeyVariantProjectionsHead addStaged(final Supplier<Boolean> supplier) {
        return copy().addQueryParam("staged", supplier.get());
    }

    /**
     * set staged with the specified value
     * @param op builder for the value to be set
     * @return ByProjectKeyVariantProjectionsHead
     */
    public ByProjectKeyVariantProjectionsHead withStaged(final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("staged", op.apply(new StringBuilder()));
    }

    /**
     * add additional staged query parameter
     * @param op builder for the value to be added
     * @return ByProjectKeyVariantProjectionsHead
     */
    public ByProjectKeyVariantProjectionsHead addStaged(final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("staged", op.apply(new StringBuilder()));
    }

    /**
     * set staged with the specified values
     * @param staged values to be set
     * @param <TValue> value type
     * @return ByProjectKeyVariantProjectionsHead
     */
    public <TValue> ByProjectKeyVariantProjectionsHead withStaged(final Collection<TValue> staged) {
        return copy().withoutQueryParam("staged")
                .addQueryParams(
                    staged.stream().map(s -> new ParamEntry<>("staged", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional staged query parameters
     * @param staged values to be added
     * @param <TValue> value type
     * @return ByProjectKeyVariantProjectionsHead
     */
    public <TValue> ByProjectKeyVariantProjectionsHead addStaged(final Collection<TValue> staged) {
        return copy().addQueryParams(
            staged.stream().map(s -> new ParamEntry<>("staged", s.toString())).collect(Collectors.toList()));
    }

    /**
     * set priceCurrency with the specified value
     * @param priceCurrency value to be set
     * @param <TValue> value type
     * @return ByProjectKeyVariantProjectionsHead
     */
    public <TValue> ByProjectKeyVariantProjectionsHead withPriceCurrency(final TValue priceCurrency) {
        return copy().withQueryParam("priceCurrency", priceCurrency);
    }

    /**
     * add additional priceCurrency query parameter
     * @param priceCurrency value to be added
     * @param <TValue> value type
     * @return ByProjectKeyVariantProjectionsHead
     */
    public <TValue> ByProjectKeyVariantProjectionsHead addPriceCurrency(final TValue priceCurrency) {
        return copy().addQueryParam("priceCurrency", priceCurrency);
    }

    /**
     * set priceCurrency with the specified value
     * @param supplier supplier for the value to be set
     * @return ByProjectKeyVariantProjectionsHead
     */
    public ByProjectKeyVariantProjectionsHead withPriceCurrency(final Supplier<String> supplier) {
        return copy().withQueryParam("priceCurrency", supplier.get());
    }

    /**
     * add additional priceCurrency query parameter
     * @param supplier supplier for the value to be added
     * @return ByProjectKeyVariantProjectionsHead
     */
    public ByProjectKeyVariantProjectionsHead addPriceCurrency(final Supplier<String> supplier) {
        return copy().addQueryParam("priceCurrency", supplier.get());
    }

    /**
     * set priceCurrency with the specified value
     * @param op builder for the value to be set
     * @return ByProjectKeyVariantProjectionsHead
     */
    public ByProjectKeyVariantProjectionsHead withPriceCurrency(final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("priceCurrency", op.apply(new StringBuilder()));
    }

    /**
     * add additional priceCurrency query parameter
     * @param op builder for the value to be added
     * @return ByProjectKeyVariantProjectionsHead
     */
    public ByProjectKeyVariantProjectionsHead addPriceCurrency(final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("priceCurrency", op.apply(new StringBuilder()));
    }

    /**
     * set priceCurrency with the specified values
     * @param priceCurrency values to be set
     * @param <TValue> value type
     * @return ByProjectKeyVariantProjectionsHead
     */
    public <TValue> ByProjectKeyVariantProjectionsHead withPriceCurrency(final Collection<TValue> priceCurrency) {
        return copy().withoutQueryParam("priceCurrency")
                .addQueryParams(priceCurrency.stream()
                        .map(s -> new ParamEntry<>("priceCurrency", s.toString()))
                        .collect(Collectors.toList()));
    }

    /**
     * add additional priceCurrency query parameters
     * @param priceCurrency values to be added
     * @param <TValue> value type
     * @return ByProjectKeyVariantProjectionsHead
     */
    public <TValue> ByProjectKeyVariantProjectionsHead addPriceCurrency(final Collection<TValue> priceCurrency) {
        return copy().addQueryParams(priceCurrency.stream()
                .map(s -> new ParamEntry<>("priceCurrency", s.toString()))
                .collect(Collectors.toList()));
    }

    /**
     * set priceCountry with the specified value
     * @param priceCountry value to be set
     * @param <TValue> value type
     * @return ByProjectKeyVariantProjectionsHead
     */
    public <TValue> ByProjectKeyVariantProjectionsHead withPriceCountry(final TValue priceCountry) {
        return copy().withQueryParam("priceCountry", priceCountry);
    }

    /**
     * add additional priceCountry query parameter
     * @param priceCountry value to be added
     * @param <TValue> value type
     * @return ByProjectKeyVariantProjectionsHead
     */
    public <TValue> ByProjectKeyVariantProjectionsHead addPriceCountry(final TValue priceCountry) {
        return copy().addQueryParam("priceCountry", priceCountry);
    }

    /**
     * set priceCountry with the specified value
     * @param supplier supplier for the value to be set
     * @return ByProjectKeyVariantProjectionsHead
     */
    public ByProjectKeyVariantProjectionsHead withPriceCountry(final Supplier<String> supplier) {
        return copy().withQueryParam("priceCountry", supplier.get());
    }

    /**
     * add additional priceCountry query parameter
     * @param supplier supplier for the value to be added
     * @return ByProjectKeyVariantProjectionsHead
     */
    public ByProjectKeyVariantProjectionsHead addPriceCountry(final Supplier<String> supplier) {
        return copy().addQueryParam("priceCountry", supplier.get());
    }

    /**
     * set priceCountry with the specified value
     * @param op builder for the value to be set
     * @return ByProjectKeyVariantProjectionsHead
     */
    public ByProjectKeyVariantProjectionsHead withPriceCountry(final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("priceCountry", op.apply(new StringBuilder()));
    }

    /**
     * add additional priceCountry query parameter
     * @param op builder for the value to be added
     * @return ByProjectKeyVariantProjectionsHead
     */
    public ByProjectKeyVariantProjectionsHead addPriceCountry(final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("priceCountry", op.apply(new StringBuilder()));
    }

    /**
     * set priceCountry with the specified values
     * @param priceCountry values to be set
     * @param <TValue> value type
     * @return ByProjectKeyVariantProjectionsHead
     */
    public <TValue> ByProjectKeyVariantProjectionsHead withPriceCountry(final Collection<TValue> priceCountry) {
        return copy().withoutQueryParam("priceCountry")
                .addQueryParams(priceCountry.stream()
                        .map(s -> new ParamEntry<>("priceCountry", s.toString()))
                        .collect(Collectors.toList()));
    }

    /**
     * add additional priceCountry query parameters
     * @param priceCountry values to be added
     * @param <TValue> value type
     * @return ByProjectKeyVariantProjectionsHead
     */
    public <TValue> ByProjectKeyVariantProjectionsHead addPriceCountry(final Collection<TValue> priceCountry) {
        return copy().addQueryParams(priceCountry.stream()
                .map(s -> new ParamEntry<>("priceCountry", s.toString()))
                .collect(Collectors.toList()));
    }

    /**
     * set priceCustomerGroup with the specified value
     * @param priceCustomerGroup value to be set
     * @param <TValue> value type
     * @return ByProjectKeyVariantProjectionsHead
     */
    public <TValue> ByProjectKeyVariantProjectionsHead withPriceCustomerGroup(final TValue priceCustomerGroup) {
        return copy().withQueryParam("priceCustomerGroup", priceCustomerGroup);
    }

    /**
     * add additional priceCustomerGroup query parameter
     * @param priceCustomerGroup value to be added
     * @param <TValue> value type
     * @return ByProjectKeyVariantProjectionsHead
     */
    public <TValue> ByProjectKeyVariantProjectionsHead addPriceCustomerGroup(final TValue priceCustomerGroup) {
        return copy().addQueryParam("priceCustomerGroup", priceCustomerGroup);
    }

    /**
     * set priceCustomerGroup with the specified value
     * @param supplier supplier for the value to be set
     * @return ByProjectKeyVariantProjectionsHead
     */
    public ByProjectKeyVariantProjectionsHead withPriceCustomerGroup(final Supplier<String> supplier) {
        return copy().withQueryParam("priceCustomerGroup", supplier.get());
    }

    /**
     * add additional priceCustomerGroup query parameter
     * @param supplier supplier for the value to be added
     * @return ByProjectKeyVariantProjectionsHead
     */
    public ByProjectKeyVariantProjectionsHead addPriceCustomerGroup(final Supplier<String> supplier) {
        return copy().addQueryParam("priceCustomerGroup", supplier.get());
    }

    /**
     * set priceCustomerGroup with the specified value
     * @param op builder for the value to be set
     * @return ByProjectKeyVariantProjectionsHead
     */
    public ByProjectKeyVariantProjectionsHead withPriceCustomerGroup(final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("priceCustomerGroup", op.apply(new StringBuilder()));
    }

    /**
     * add additional priceCustomerGroup query parameter
     * @param op builder for the value to be added
     * @return ByProjectKeyVariantProjectionsHead
     */
    public ByProjectKeyVariantProjectionsHead addPriceCustomerGroup(final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("priceCustomerGroup", op.apply(new StringBuilder()));
    }

    /**
     * set priceCustomerGroup with the specified values
     * @param priceCustomerGroup values to be set
     * @param <TValue> value type
     * @return ByProjectKeyVariantProjectionsHead
     */
    public <TValue> ByProjectKeyVariantProjectionsHead withPriceCustomerGroup(
            final Collection<TValue> priceCustomerGroup) {
        return copy().withoutQueryParam("priceCustomerGroup")
                .addQueryParams(priceCustomerGroup.stream()
                        .map(s -> new ParamEntry<>("priceCustomerGroup", s.toString()))
                        .collect(Collectors.toList()));
    }

    /**
     * add additional priceCustomerGroup query parameters
     * @param priceCustomerGroup values to be added
     * @param <TValue> value type
     * @return ByProjectKeyVariantProjectionsHead
     */
    public <TValue> ByProjectKeyVariantProjectionsHead addPriceCustomerGroup(
            final Collection<TValue> priceCustomerGroup) {
        return copy().addQueryParams(priceCustomerGroup.stream()
                .map(s -> new ParamEntry<>("priceCustomerGroup", s.toString()))
                .collect(Collectors.toList()));
    }

    /**
     * set priceChannel with the specified value
     * @param priceChannel value to be set
     * @param <TValue> value type
     * @return ByProjectKeyVariantProjectionsHead
     */
    public <TValue> ByProjectKeyVariantProjectionsHead withPriceChannel(final TValue priceChannel) {
        return copy().withQueryParam("priceChannel", priceChannel);
    }

    /**
     * add additional priceChannel query parameter
     * @param priceChannel value to be added
     * @param <TValue> value type
     * @return ByProjectKeyVariantProjectionsHead
     */
    public <TValue> ByProjectKeyVariantProjectionsHead addPriceChannel(final TValue priceChannel) {
        return copy().addQueryParam("priceChannel", priceChannel);
    }

    /**
     * set priceChannel with the specified value
     * @param supplier supplier for the value to be set
     * @return ByProjectKeyVariantProjectionsHead
     */
    public ByProjectKeyVariantProjectionsHead withPriceChannel(final Supplier<String> supplier) {
        return copy().withQueryParam("priceChannel", supplier.get());
    }

    /**
     * add additional priceChannel query parameter
     * @param supplier supplier for the value to be added
     * @return ByProjectKeyVariantProjectionsHead
     */
    public ByProjectKeyVariantProjectionsHead addPriceChannel(final Supplier<String> supplier) {
        return copy().addQueryParam("priceChannel", supplier.get());
    }

    /**
     * set priceChannel with the specified value
     * @param op builder for the value to be set
     * @return ByProjectKeyVariantProjectionsHead
     */
    public ByProjectKeyVariantProjectionsHead withPriceChannel(final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("priceChannel", op.apply(new StringBuilder()));
    }

    /**
     * add additional priceChannel query parameter
     * @param op builder for the value to be added
     * @return ByProjectKeyVariantProjectionsHead
     */
    public ByProjectKeyVariantProjectionsHead addPriceChannel(final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("priceChannel", op.apply(new StringBuilder()));
    }

    /**
     * set priceChannel with the specified values
     * @param priceChannel values to be set
     * @param <TValue> value type
     * @return ByProjectKeyVariantProjectionsHead
     */
    public <TValue> ByProjectKeyVariantProjectionsHead withPriceChannel(final Collection<TValue> priceChannel) {
        return copy().withoutQueryParam("priceChannel")
                .addQueryParams(priceChannel.stream()
                        .map(s -> new ParamEntry<>("priceChannel", s.toString()))
                        .collect(Collectors.toList()));
    }

    /**
     * add additional priceChannel query parameters
     * @param priceChannel values to be added
     * @param <TValue> value type
     * @return ByProjectKeyVariantProjectionsHead
     */
    public <TValue> ByProjectKeyVariantProjectionsHead addPriceChannel(final Collection<TValue> priceChannel) {
        return copy().addQueryParams(priceChannel.stream()
                .map(s -> new ParamEntry<>("priceChannel", s.toString()))
                .collect(Collectors.toList()));
    }

    /**
     * set localeProjection with the specified value
     * @param localeProjection value to be set
     * @param <TValue> value type
     * @return ByProjectKeyVariantProjectionsHead
     */
    public <TValue> ByProjectKeyVariantProjectionsHead withLocaleProjection(final TValue localeProjection) {
        return copy().withQueryParam("localeProjection", localeProjection);
    }

    /**
     * add additional localeProjection query parameter
     * @param localeProjection value to be added
     * @param <TValue> value type
     * @return ByProjectKeyVariantProjectionsHead
     */
    public <TValue> ByProjectKeyVariantProjectionsHead addLocaleProjection(final TValue localeProjection) {
        return copy().addQueryParam("localeProjection", localeProjection);
    }

    /**
     * set localeProjection with the specified value
     * @param supplier supplier for the value to be set
     * @return ByProjectKeyVariantProjectionsHead
     */
    public ByProjectKeyVariantProjectionsHead withLocaleProjection(final Supplier<String> supplier) {
        return copy().withQueryParam("localeProjection", supplier.get());
    }

    /**
     * add additional localeProjection query parameter
     * @param supplier supplier for the value to be added
     * @return ByProjectKeyVariantProjectionsHead
     */
    public ByProjectKeyVariantProjectionsHead addLocaleProjection(final Supplier<String> supplier) {
        return copy().addQueryParam("localeProjection", supplier.get());
    }

    /**
     * set localeProjection with the specified value
     * @param op builder for the value to be set
     * @return ByProjectKeyVariantProjectionsHead
     */
    public ByProjectKeyVariantProjectionsHead withLocaleProjection(final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("localeProjection", op.apply(new StringBuilder()));
    }

    /**
     * add additional localeProjection query parameter
     * @param op builder for the value to be added
     * @return ByProjectKeyVariantProjectionsHead
     */
    public ByProjectKeyVariantProjectionsHead addLocaleProjection(final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("localeProjection", op.apply(new StringBuilder()));
    }

    /**
     * set localeProjection with the specified values
     * @param localeProjection values to be set
     * @param <TValue> value type
     * @return ByProjectKeyVariantProjectionsHead
     */
    public <TValue> ByProjectKeyVariantProjectionsHead withLocaleProjection(final Collection<TValue> localeProjection) {
        return copy().withoutQueryParam("localeProjection")
                .addQueryParams(localeProjection.stream()
                        .map(s -> new ParamEntry<>("localeProjection", s.toString()))
                        .collect(Collectors.toList()));
    }

    /**
     * add additional localeProjection query parameters
     * @param localeProjection values to be added
     * @param <TValue> value type
     * @return ByProjectKeyVariantProjectionsHead
     */
    public <TValue> ByProjectKeyVariantProjectionsHead addLocaleProjection(final Collection<TValue> localeProjection) {
        return copy().addQueryParams(localeProjection.stream()
                .map(s -> new ParamEntry<>("localeProjection", s.toString()))
                .collect(Collectors.toList()));
    }

    /**
     * set filterAttributes with the specified value
     * @param filterAttributes value to be set
     * @param <TValue> value type
     * @return ByProjectKeyVariantProjectionsHead
     */
    public <TValue> ByProjectKeyVariantProjectionsHead withFilterAttributes(final TValue filterAttributes) {
        return copy().withQueryParam("filter[attributes]", filterAttributes);
    }

    /**
     * add additional filterAttributes query parameter
     * @param filterAttributes value to be added
     * @param <TValue> value type
     * @return ByProjectKeyVariantProjectionsHead
     */
    public <TValue> ByProjectKeyVariantProjectionsHead addFilterAttributes(final TValue filterAttributes) {
        return copy().addQueryParam("filter[attributes]", filterAttributes);
    }

    /**
     * set filterAttributes with the specified value
     * @param supplier supplier for the value to be set
     * @return ByProjectKeyVariantProjectionsHead
     */
    public ByProjectKeyVariantProjectionsHead withFilterAttributes(final Supplier<String> supplier) {
        return copy().withQueryParam("filter[attributes]", supplier.get());
    }

    /**
     * add additional filterAttributes query parameter
     * @param supplier supplier for the value to be added
     * @return ByProjectKeyVariantProjectionsHead
     */
    public ByProjectKeyVariantProjectionsHead addFilterAttributes(final Supplier<String> supplier) {
        return copy().addQueryParam("filter[attributes]", supplier.get());
    }

    /**
     * set filterAttributes with the specified value
     * @param op builder for the value to be set
     * @return ByProjectKeyVariantProjectionsHead
     */
    public ByProjectKeyVariantProjectionsHead withFilterAttributes(final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("filter[attributes]", op.apply(new StringBuilder()));
    }

    /**
     * add additional filterAttributes query parameter
     * @param op builder for the value to be added
     * @return ByProjectKeyVariantProjectionsHead
     */
    public ByProjectKeyVariantProjectionsHead addFilterAttributes(final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("filter[attributes]", op.apply(new StringBuilder()));
    }

    /**
     * set filterAttributes with the specified values
     * @param filterAttributes values to be set
     * @param <TValue> value type
     * @return ByProjectKeyVariantProjectionsHead
     */
    public <TValue> ByProjectKeyVariantProjectionsHead withFilterAttributes(final Collection<TValue> filterAttributes) {
        return copy().withoutQueryParam("filter[attributes]")
                .addQueryParams(filterAttributes.stream()
                        .map(s -> new ParamEntry<>("filter[attributes]", s.toString()))
                        .collect(Collectors.toList()));
    }

    /**
     * add additional filterAttributes query parameters
     * @param filterAttributes values to be added
     * @param <TValue> value type
     * @return ByProjectKeyVariantProjectionsHead
     */
    public <TValue> ByProjectKeyVariantProjectionsHead addFilterAttributes(final Collection<TValue> filterAttributes) {
        return copy().addQueryParams(filterAttributes.stream()
                .map(s -> new ParamEntry<>("filter[attributes]", s.toString()))
                .collect(Collectors.toList()));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ByProjectKeyVariantProjectionsHead that = (ByProjectKeyVariantProjectionsHead) o;

        return new EqualsBuilder().append(projectKey, that.projectKey).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(projectKey).toHashCode();
    }

    @Override
    protected ByProjectKeyVariantProjectionsHead copy() {
        return new ByProjectKeyVariantProjectionsHead(this);
    }
}
