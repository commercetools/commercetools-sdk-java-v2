
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
 *  <p>Gets the current or staged representation of a Product by its ID in the specified Store. If the Store has defined some languages, countries, distribution, supply Channels, and/or Product Selection, they are used for projections based on locale, price, and inventory.</p>
 *  <p>If ProductSelection is used, it affects the availability of the Product in the specified Store.</p>
 *  <p>If a ProductTailoring exists for the Product with the given <code>id</code> and the given Store, this endpoint returns the ProductProjection with tailored data.</p>
 *  <p>When used with an API Client that has the <code>view_published_products:{projectKey}</code> scope, this endpoint only returns published (current) Product Projections.</p>
 *
 * <hr>
 * <div class=code-example>
 * <pre><code class='java'>{@code
 *   CompletableFuture<ApiHttpResponse<com.commercetools.api.models.product.ProductProjection>> result = apiRoot
 *            .withProjectKey("{projectKey}")
 *            .inStoreKeyWithStoreKeyValue("{storeKey}")
 *            .productProjections()
 *            .withId("{ID}")
 *            .get()
 *            .execute()
 * }</code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyInStoreKeyByStoreKeyProductProjectionsByIDGet extends
        TypeApiMethod<ByProjectKeyInStoreKeyByStoreKeyProductProjectionsByIDGet, com.commercetools.api.models.product.ProductProjection>
        implements
        com.commercetools.api.client.ProjectionselectingtailoringTrait<ByProjectKeyInStoreKeyByStoreKeyProductProjectionsByIDGet>,
        com.commercetools.api.client.PriceselectingTrait<ByProjectKeyInStoreKeyByStoreKeyProductProjectionsByIDGet>,
        com.commercetools.api.client.LocaleprojectingTrait<ByProjectKeyInStoreKeyByStoreKeyProductProjectionsByIDGet>,
        com.commercetools.api.client.ExpandableTrait<ByProjectKeyInStoreKeyByStoreKeyProductProjectionsByIDGet>,
        com.commercetools.api.client.ErrorableTrait<ByProjectKeyInStoreKeyByStoreKeyProductProjectionsByIDGet>,
        com.commercetools.api.client.Deprecatable200Trait<ByProjectKeyInStoreKeyByStoreKeyProductProjectionsByIDGet> {

    @Override
    public TypeReference<com.commercetools.api.models.product.ProductProjection> resultType() {
        return new TypeReference<com.commercetools.api.models.product.ProductProjection>() {
        };
    }

    private String projectKey;
    private String storeKey;
    private String ID;

    public ByProjectKeyInStoreKeyByStoreKeyProductProjectionsByIDGet(final ApiHttpClient apiHttpClient,
            String projectKey, String storeKey, String ID) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.storeKey = storeKey;
        this.ID = ID;
    }

    public ByProjectKeyInStoreKeyByStoreKeyProductProjectionsByIDGet(
            ByProjectKeyInStoreKeyByStoreKeyProductProjectionsByIDGet t) {
        super(t);
        this.projectKey = t.projectKey;
        this.storeKey = t.storeKey;
        this.ID = t.ID;
    }

    @Override
    protected ApiHttpRequest buildHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("%s/in-store/key=%s/product-projections/%s",
            encodePathParam(this.projectKey), encodePathParam(this.storeKey), encodePathParam(this.ID));
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }
        return new ApiHttpRequest(ApiHttpMethod.GET, URI.create(httpRequestPath), getHeaders(), null);
    }

    @Override
    public ApiHttpResponse<com.commercetools.api.models.product.ProductProjection> executeBlocking(
            final ApiHttpClient client, final Duration timeout) {
        return executeBlocking(client, timeout, com.commercetools.api.models.product.ProductProjection.class);
    }

    @Override
    public CompletableFuture<ApiHttpResponse<com.commercetools.api.models.product.ProductProjection>> execute(
            final ApiHttpClient client) {
        return execute(client, com.commercetools.api.models.product.ProductProjection.class);
    }

    public String getProjectKey() {
        return this.projectKey;
    }

    public String getStoreKey() {
        return this.storeKey;
    }

    public String getID() {
        return this.ID;
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

    public List<String> getExpand() {
        return this.getQueryParam("expand");
    }

    public void setProjectKey(final String projectKey) {
        this.projectKey = projectKey;
    }

    public void setStoreKey(final String storeKey) {
        this.storeKey = storeKey;
    }

    public void setID(final String ID) {
        this.ID = ID;
    }

    /**
     * set staged with the specified value
     * @param staged value to be set
     * @param <TValue> value type
     * @return ByProjectKeyInStoreKeyByStoreKeyProductProjectionsByIDGet
     */
    public <TValue> ByProjectKeyInStoreKeyByStoreKeyProductProjectionsByIDGet withStaged(final TValue staged) {
        return copy().withQueryParam("staged", staged);
    }

    /**
     * add additional staged query parameter
     * @param staged value to be added
     * @param <TValue> value type
     * @return ByProjectKeyInStoreKeyByStoreKeyProductProjectionsByIDGet
     */
    public <TValue> ByProjectKeyInStoreKeyByStoreKeyProductProjectionsByIDGet addStaged(final TValue staged) {
        return copy().addQueryParam("staged", staged);
    }

    /**
     * set staged with the specified value
     * @param supplier supplier for the value to be set
     * @return ByProjectKeyInStoreKeyByStoreKeyProductProjectionsByIDGet
     */
    public ByProjectKeyInStoreKeyByStoreKeyProductProjectionsByIDGet withStaged(final Supplier<Boolean> supplier) {
        return copy().withQueryParam("staged", supplier.get());
    }

    /**
     * add additional staged query parameter
     * @param supplier supplier for the value to be added
     * @return ByProjectKeyInStoreKeyByStoreKeyProductProjectionsByIDGet
     */
    public ByProjectKeyInStoreKeyByStoreKeyProductProjectionsByIDGet addStaged(final Supplier<Boolean> supplier) {
        return copy().addQueryParam("staged", supplier.get());
    }

    /**
     * set staged with the specified value
     * @param op builder for the value to be set
     * @return ByProjectKeyInStoreKeyByStoreKeyProductProjectionsByIDGet
     */
    public ByProjectKeyInStoreKeyByStoreKeyProductProjectionsByIDGet withStaged(
            final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("staged", op.apply(new StringBuilder()));
    }

    /**
     * add additional staged query parameter
     * @param op builder for the value to be added
     * @return ByProjectKeyInStoreKeyByStoreKeyProductProjectionsByIDGet
     */
    public ByProjectKeyInStoreKeyByStoreKeyProductProjectionsByIDGet addStaged(
            final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("staged", op.apply(new StringBuilder()));
    }

    /**
     * set staged with the specified values
     * @param staged values to be set
     * @param <TValue> value type
     * @return ByProjectKeyInStoreKeyByStoreKeyProductProjectionsByIDGet
     */
    public <TValue> ByProjectKeyInStoreKeyByStoreKeyProductProjectionsByIDGet withStaged(
            final Collection<TValue> staged) {
        return copy().withoutQueryParam("staged")
                .addQueryParams(
                    staged.stream().map(s -> new ParamEntry<>("staged", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional staged query parameters
     * @param staged values to be added
     * @param <TValue> value type
     * @return ByProjectKeyInStoreKeyByStoreKeyProductProjectionsByIDGet
     */
    public <TValue> ByProjectKeyInStoreKeyByStoreKeyProductProjectionsByIDGet addStaged(
            final Collection<TValue> staged) {
        return copy().addQueryParams(
            staged.stream().map(s -> new ParamEntry<>("staged", s.toString())).collect(Collectors.toList()));
    }

    /**
     * set priceCurrency with the specified value
     * @param priceCurrency value to be set
     * @param <TValue> value type
     * @return ByProjectKeyInStoreKeyByStoreKeyProductProjectionsByIDGet
     */
    public <TValue> ByProjectKeyInStoreKeyByStoreKeyProductProjectionsByIDGet withPriceCurrency(
            final TValue priceCurrency) {
        return copy().withQueryParam("priceCurrency", priceCurrency);
    }

    /**
     * add additional priceCurrency query parameter
     * @param priceCurrency value to be added
     * @param <TValue> value type
     * @return ByProjectKeyInStoreKeyByStoreKeyProductProjectionsByIDGet
     */
    public <TValue> ByProjectKeyInStoreKeyByStoreKeyProductProjectionsByIDGet addPriceCurrency(
            final TValue priceCurrency) {
        return copy().addQueryParam("priceCurrency", priceCurrency);
    }

    /**
     * set priceCurrency with the specified value
     * @param supplier supplier for the value to be set
     * @return ByProjectKeyInStoreKeyByStoreKeyProductProjectionsByIDGet
     */
    public ByProjectKeyInStoreKeyByStoreKeyProductProjectionsByIDGet withPriceCurrency(
            final Supplier<String> supplier) {
        return copy().withQueryParam("priceCurrency", supplier.get());
    }

    /**
     * add additional priceCurrency query parameter
     * @param supplier supplier for the value to be added
     * @return ByProjectKeyInStoreKeyByStoreKeyProductProjectionsByIDGet
     */
    public ByProjectKeyInStoreKeyByStoreKeyProductProjectionsByIDGet addPriceCurrency(final Supplier<String> supplier) {
        return copy().addQueryParam("priceCurrency", supplier.get());
    }

    /**
     * set priceCurrency with the specified value
     * @param op builder for the value to be set
     * @return ByProjectKeyInStoreKeyByStoreKeyProductProjectionsByIDGet
     */
    public ByProjectKeyInStoreKeyByStoreKeyProductProjectionsByIDGet withPriceCurrency(
            final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("priceCurrency", op.apply(new StringBuilder()));
    }

    /**
     * add additional priceCurrency query parameter
     * @param op builder for the value to be added
     * @return ByProjectKeyInStoreKeyByStoreKeyProductProjectionsByIDGet
     */
    public ByProjectKeyInStoreKeyByStoreKeyProductProjectionsByIDGet addPriceCurrency(
            final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("priceCurrency", op.apply(new StringBuilder()));
    }

    /**
     * set priceCurrency with the specified values
     * @param priceCurrency values to be set
     * @param <TValue> value type
     * @return ByProjectKeyInStoreKeyByStoreKeyProductProjectionsByIDGet
     */
    public <TValue> ByProjectKeyInStoreKeyByStoreKeyProductProjectionsByIDGet withPriceCurrency(
            final Collection<TValue> priceCurrency) {
        return copy().withoutQueryParam("priceCurrency")
                .addQueryParams(priceCurrency.stream()
                        .map(s -> new ParamEntry<>("priceCurrency", s.toString()))
                        .collect(Collectors.toList()));
    }

    /**
     * add additional priceCurrency query parameters
     * @param priceCurrency values to be added
     * @param <TValue> value type
     * @return ByProjectKeyInStoreKeyByStoreKeyProductProjectionsByIDGet
     */
    public <TValue> ByProjectKeyInStoreKeyByStoreKeyProductProjectionsByIDGet addPriceCurrency(
            final Collection<TValue> priceCurrency) {
        return copy().addQueryParams(priceCurrency.stream()
                .map(s -> new ParamEntry<>("priceCurrency", s.toString()))
                .collect(Collectors.toList()));
    }

    /**
     * set priceCountry with the specified value
     * @param priceCountry value to be set
     * @param <TValue> value type
     * @return ByProjectKeyInStoreKeyByStoreKeyProductProjectionsByIDGet
     */
    public <TValue> ByProjectKeyInStoreKeyByStoreKeyProductProjectionsByIDGet withPriceCountry(
            final TValue priceCountry) {
        return copy().withQueryParam("priceCountry", priceCountry);
    }

    /**
     * add additional priceCountry query parameter
     * @param priceCountry value to be added
     * @param <TValue> value type
     * @return ByProjectKeyInStoreKeyByStoreKeyProductProjectionsByIDGet
     */
    public <TValue> ByProjectKeyInStoreKeyByStoreKeyProductProjectionsByIDGet addPriceCountry(
            final TValue priceCountry) {
        return copy().addQueryParam("priceCountry", priceCountry);
    }

    /**
     * set priceCountry with the specified value
     * @param supplier supplier for the value to be set
     * @return ByProjectKeyInStoreKeyByStoreKeyProductProjectionsByIDGet
     */
    public ByProjectKeyInStoreKeyByStoreKeyProductProjectionsByIDGet withPriceCountry(final Supplier<String> supplier) {
        return copy().withQueryParam("priceCountry", supplier.get());
    }

    /**
     * add additional priceCountry query parameter
     * @param supplier supplier for the value to be added
     * @return ByProjectKeyInStoreKeyByStoreKeyProductProjectionsByIDGet
     */
    public ByProjectKeyInStoreKeyByStoreKeyProductProjectionsByIDGet addPriceCountry(final Supplier<String> supplier) {
        return copy().addQueryParam("priceCountry", supplier.get());
    }

    /**
     * set priceCountry with the specified value
     * @param op builder for the value to be set
     * @return ByProjectKeyInStoreKeyByStoreKeyProductProjectionsByIDGet
     */
    public ByProjectKeyInStoreKeyByStoreKeyProductProjectionsByIDGet withPriceCountry(
            final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("priceCountry", op.apply(new StringBuilder()));
    }

    /**
     * add additional priceCountry query parameter
     * @param op builder for the value to be added
     * @return ByProjectKeyInStoreKeyByStoreKeyProductProjectionsByIDGet
     */
    public ByProjectKeyInStoreKeyByStoreKeyProductProjectionsByIDGet addPriceCountry(
            final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("priceCountry", op.apply(new StringBuilder()));
    }

    /**
     * set priceCountry with the specified values
     * @param priceCountry values to be set
     * @param <TValue> value type
     * @return ByProjectKeyInStoreKeyByStoreKeyProductProjectionsByIDGet
     */
    public <TValue> ByProjectKeyInStoreKeyByStoreKeyProductProjectionsByIDGet withPriceCountry(
            final Collection<TValue> priceCountry) {
        return copy().withoutQueryParam("priceCountry")
                .addQueryParams(priceCountry.stream()
                        .map(s -> new ParamEntry<>("priceCountry", s.toString()))
                        .collect(Collectors.toList()));
    }

    /**
     * add additional priceCountry query parameters
     * @param priceCountry values to be added
     * @param <TValue> value type
     * @return ByProjectKeyInStoreKeyByStoreKeyProductProjectionsByIDGet
     */
    public <TValue> ByProjectKeyInStoreKeyByStoreKeyProductProjectionsByIDGet addPriceCountry(
            final Collection<TValue> priceCountry) {
        return copy().addQueryParams(priceCountry.stream()
                .map(s -> new ParamEntry<>("priceCountry", s.toString()))
                .collect(Collectors.toList()));
    }

    /**
     * set priceCustomerGroup with the specified value
     * @param priceCustomerGroup value to be set
     * @param <TValue> value type
     * @return ByProjectKeyInStoreKeyByStoreKeyProductProjectionsByIDGet
     */
    public <TValue> ByProjectKeyInStoreKeyByStoreKeyProductProjectionsByIDGet withPriceCustomerGroup(
            final TValue priceCustomerGroup) {
        return copy().withQueryParam("priceCustomerGroup", priceCustomerGroup);
    }

    /**
     * add additional priceCustomerGroup query parameter
     * @param priceCustomerGroup value to be added
     * @param <TValue> value type
     * @return ByProjectKeyInStoreKeyByStoreKeyProductProjectionsByIDGet
     */
    public <TValue> ByProjectKeyInStoreKeyByStoreKeyProductProjectionsByIDGet addPriceCustomerGroup(
            final TValue priceCustomerGroup) {
        return copy().addQueryParam("priceCustomerGroup", priceCustomerGroup);
    }

    /**
     * set priceCustomerGroup with the specified value
     * @param supplier supplier for the value to be set
     * @return ByProjectKeyInStoreKeyByStoreKeyProductProjectionsByIDGet
     */
    public ByProjectKeyInStoreKeyByStoreKeyProductProjectionsByIDGet withPriceCustomerGroup(
            final Supplier<String> supplier) {
        return copy().withQueryParam("priceCustomerGroup", supplier.get());
    }

    /**
     * add additional priceCustomerGroup query parameter
     * @param supplier supplier for the value to be added
     * @return ByProjectKeyInStoreKeyByStoreKeyProductProjectionsByIDGet
     */
    public ByProjectKeyInStoreKeyByStoreKeyProductProjectionsByIDGet addPriceCustomerGroup(
            final Supplier<String> supplier) {
        return copy().addQueryParam("priceCustomerGroup", supplier.get());
    }

    /**
     * set priceCustomerGroup with the specified value
     * @param op builder for the value to be set
     * @return ByProjectKeyInStoreKeyByStoreKeyProductProjectionsByIDGet
     */
    public ByProjectKeyInStoreKeyByStoreKeyProductProjectionsByIDGet withPriceCustomerGroup(
            final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("priceCustomerGroup", op.apply(new StringBuilder()));
    }

    /**
     * add additional priceCustomerGroup query parameter
     * @param op builder for the value to be added
     * @return ByProjectKeyInStoreKeyByStoreKeyProductProjectionsByIDGet
     */
    public ByProjectKeyInStoreKeyByStoreKeyProductProjectionsByIDGet addPriceCustomerGroup(
            final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("priceCustomerGroup", op.apply(new StringBuilder()));
    }

    /**
     * set priceCustomerGroup with the specified values
     * @param priceCustomerGroup values to be set
     * @param <TValue> value type
     * @return ByProjectKeyInStoreKeyByStoreKeyProductProjectionsByIDGet
     */
    public <TValue> ByProjectKeyInStoreKeyByStoreKeyProductProjectionsByIDGet withPriceCustomerGroup(
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
     * @return ByProjectKeyInStoreKeyByStoreKeyProductProjectionsByIDGet
     */
    public <TValue> ByProjectKeyInStoreKeyByStoreKeyProductProjectionsByIDGet addPriceCustomerGroup(
            final Collection<TValue> priceCustomerGroup) {
        return copy().addQueryParams(priceCustomerGroup.stream()
                .map(s -> new ParamEntry<>("priceCustomerGroup", s.toString()))
                .collect(Collectors.toList()));
    }

    /**
     * set priceChannel with the specified value
     * @param priceChannel value to be set
     * @param <TValue> value type
     * @return ByProjectKeyInStoreKeyByStoreKeyProductProjectionsByIDGet
     */
    public <TValue> ByProjectKeyInStoreKeyByStoreKeyProductProjectionsByIDGet withPriceChannel(
            final TValue priceChannel) {
        return copy().withQueryParam("priceChannel", priceChannel);
    }

    /**
     * add additional priceChannel query parameter
     * @param priceChannel value to be added
     * @param <TValue> value type
     * @return ByProjectKeyInStoreKeyByStoreKeyProductProjectionsByIDGet
     */
    public <TValue> ByProjectKeyInStoreKeyByStoreKeyProductProjectionsByIDGet addPriceChannel(
            final TValue priceChannel) {
        return copy().addQueryParam("priceChannel", priceChannel);
    }

    /**
     * set priceChannel with the specified value
     * @param supplier supplier for the value to be set
     * @return ByProjectKeyInStoreKeyByStoreKeyProductProjectionsByIDGet
     */
    public ByProjectKeyInStoreKeyByStoreKeyProductProjectionsByIDGet withPriceChannel(final Supplier<String> supplier) {
        return copy().withQueryParam("priceChannel", supplier.get());
    }

    /**
     * add additional priceChannel query parameter
     * @param supplier supplier for the value to be added
     * @return ByProjectKeyInStoreKeyByStoreKeyProductProjectionsByIDGet
     */
    public ByProjectKeyInStoreKeyByStoreKeyProductProjectionsByIDGet addPriceChannel(final Supplier<String> supplier) {
        return copy().addQueryParam("priceChannel", supplier.get());
    }

    /**
     * set priceChannel with the specified value
     * @param op builder for the value to be set
     * @return ByProjectKeyInStoreKeyByStoreKeyProductProjectionsByIDGet
     */
    public ByProjectKeyInStoreKeyByStoreKeyProductProjectionsByIDGet withPriceChannel(
            final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("priceChannel", op.apply(new StringBuilder()));
    }

    /**
     * add additional priceChannel query parameter
     * @param op builder for the value to be added
     * @return ByProjectKeyInStoreKeyByStoreKeyProductProjectionsByIDGet
     */
    public ByProjectKeyInStoreKeyByStoreKeyProductProjectionsByIDGet addPriceChannel(
            final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("priceChannel", op.apply(new StringBuilder()));
    }

    /**
     * set priceChannel with the specified values
     * @param priceChannel values to be set
     * @param <TValue> value type
     * @return ByProjectKeyInStoreKeyByStoreKeyProductProjectionsByIDGet
     */
    public <TValue> ByProjectKeyInStoreKeyByStoreKeyProductProjectionsByIDGet withPriceChannel(
            final Collection<TValue> priceChannel) {
        return copy().withoutQueryParam("priceChannel")
                .addQueryParams(priceChannel.stream()
                        .map(s -> new ParamEntry<>("priceChannel", s.toString()))
                        .collect(Collectors.toList()));
    }

    /**
     * add additional priceChannel query parameters
     * @param priceChannel values to be added
     * @param <TValue> value type
     * @return ByProjectKeyInStoreKeyByStoreKeyProductProjectionsByIDGet
     */
    public <TValue> ByProjectKeyInStoreKeyByStoreKeyProductProjectionsByIDGet addPriceChannel(
            final Collection<TValue> priceChannel) {
        return copy().addQueryParams(priceChannel.stream()
                .map(s -> new ParamEntry<>("priceChannel", s.toString()))
                .collect(Collectors.toList()));
    }

    /**
     * set localeProjection with the specified value
     * @param localeProjection value to be set
     * @param <TValue> value type
     * @return ByProjectKeyInStoreKeyByStoreKeyProductProjectionsByIDGet
     */
    public <TValue> ByProjectKeyInStoreKeyByStoreKeyProductProjectionsByIDGet withLocaleProjection(
            final TValue localeProjection) {
        return copy().withQueryParam("localeProjection", localeProjection);
    }

    /**
     * add additional localeProjection query parameter
     * @param localeProjection value to be added
     * @param <TValue> value type
     * @return ByProjectKeyInStoreKeyByStoreKeyProductProjectionsByIDGet
     */
    public <TValue> ByProjectKeyInStoreKeyByStoreKeyProductProjectionsByIDGet addLocaleProjection(
            final TValue localeProjection) {
        return copy().addQueryParam("localeProjection", localeProjection);
    }

    /**
     * set localeProjection with the specified value
     * @param supplier supplier for the value to be set
     * @return ByProjectKeyInStoreKeyByStoreKeyProductProjectionsByIDGet
     */
    public ByProjectKeyInStoreKeyByStoreKeyProductProjectionsByIDGet withLocaleProjection(
            final Supplier<String> supplier) {
        return copy().withQueryParam("localeProjection", supplier.get());
    }

    /**
     * add additional localeProjection query parameter
     * @param supplier supplier for the value to be added
     * @return ByProjectKeyInStoreKeyByStoreKeyProductProjectionsByIDGet
     */
    public ByProjectKeyInStoreKeyByStoreKeyProductProjectionsByIDGet addLocaleProjection(
            final Supplier<String> supplier) {
        return copy().addQueryParam("localeProjection", supplier.get());
    }

    /**
     * set localeProjection with the specified value
     * @param op builder for the value to be set
     * @return ByProjectKeyInStoreKeyByStoreKeyProductProjectionsByIDGet
     */
    public ByProjectKeyInStoreKeyByStoreKeyProductProjectionsByIDGet withLocaleProjection(
            final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("localeProjection", op.apply(new StringBuilder()));
    }

    /**
     * add additional localeProjection query parameter
     * @param op builder for the value to be added
     * @return ByProjectKeyInStoreKeyByStoreKeyProductProjectionsByIDGet
     */
    public ByProjectKeyInStoreKeyByStoreKeyProductProjectionsByIDGet addLocaleProjection(
            final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("localeProjection", op.apply(new StringBuilder()));
    }

    /**
     * set localeProjection with the specified values
     * @param localeProjection values to be set
     * @param <TValue> value type
     * @return ByProjectKeyInStoreKeyByStoreKeyProductProjectionsByIDGet
     */
    public <TValue> ByProjectKeyInStoreKeyByStoreKeyProductProjectionsByIDGet withLocaleProjection(
            final Collection<TValue> localeProjection) {
        return copy().withoutQueryParam("localeProjection")
                .addQueryParams(localeProjection.stream()
                        .map(s -> new ParamEntry<>("localeProjection", s.toString()))
                        .collect(Collectors.toList()));
    }

    /**
     * add additional localeProjection query parameters
     * @param localeProjection values to be added
     * @param <TValue> value type
     * @return ByProjectKeyInStoreKeyByStoreKeyProductProjectionsByIDGet
     */
    public <TValue> ByProjectKeyInStoreKeyByStoreKeyProductProjectionsByIDGet addLocaleProjection(
            final Collection<TValue> localeProjection) {
        return copy().addQueryParams(localeProjection.stream()
                .map(s -> new ParamEntry<>("localeProjection", s.toString()))
                .collect(Collectors.toList()));
    }

    /**
     * set expand with the specified value
     * @param expand value to be set
     * @param <TValue> value type
     * @return ByProjectKeyInStoreKeyByStoreKeyProductProjectionsByIDGet
     */
    public <TValue> ByProjectKeyInStoreKeyByStoreKeyProductProjectionsByIDGet withExpand(final TValue expand) {
        return copy().withQueryParam("expand", expand);
    }

    /**
     * add additional expand query parameter
     * @param expand value to be added
     * @param <TValue> value type
     * @return ByProjectKeyInStoreKeyByStoreKeyProductProjectionsByIDGet
     */
    public <TValue> ByProjectKeyInStoreKeyByStoreKeyProductProjectionsByIDGet addExpand(final TValue expand) {
        return copy().addQueryParam("expand", expand);
    }

    /**
     * set expand with the specified value
     * @param supplier supplier for the value to be set
     * @return ByProjectKeyInStoreKeyByStoreKeyProductProjectionsByIDGet
     */
    public ByProjectKeyInStoreKeyByStoreKeyProductProjectionsByIDGet withExpand(final Supplier<String> supplier) {
        return copy().withQueryParam("expand", supplier.get());
    }

    /**
     * add additional expand query parameter
     * @param supplier supplier for the value to be added
     * @return ByProjectKeyInStoreKeyByStoreKeyProductProjectionsByIDGet
     */
    public ByProjectKeyInStoreKeyByStoreKeyProductProjectionsByIDGet addExpand(final Supplier<String> supplier) {
        return copy().addQueryParam("expand", supplier.get());
    }

    /**
     * set expand with the specified value
     * @param op builder for the value to be set
     * @return ByProjectKeyInStoreKeyByStoreKeyProductProjectionsByIDGet
     */
    public ByProjectKeyInStoreKeyByStoreKeyProductProjectionsByIDGet withExpand(
            final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("expand", op.apply(new StringBuilder()));
    }

    /**
     * add additional expand query parameter
     * @param op builder for the value to be added
     * @return ByProjectKeyInStoreKeyByStoreKeyProductProjectionsByIDGet
     */
    public ByProjectKeyInStoreKeyByStoreKeyProductProjectionsByIDGet addExpand(
            final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("expand", op.apply(new StringBuilder()));
    }

    /**
     * set expand with the specified values
     * @param expand values to be set
     * @param <TValue> value type
     * @return ByProjectKeyInStoreKeyByStoreKeyProductProjectionsByIDGet
     */
    public <TValue> ByProjectKeyInStoreKeyByStoreKeyProductProjectionsByIDGet withExpand(
            final Collection<TValue> expand) {
        return copy().withoutQueryParam("expand")
                .addQueryParams(
                    expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional expand query parameters
     * @param expand values to be added
     * @param <TValue> value type
     * @return ByProjectKeyInStoreKeyByStoreKeyProductProjectionsByIDGet
     */
    public <TValue> ByProjectKeyInStoreKeyByStoreKeyProductProjectionsByIDGet addExpand(
            final Collection<TValue> expand) {
        return copy().addQueryParams(
            expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList()));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ByProjectKeyInStoreKeyByStoreKeyProductProjectionsByIDGet that = (ByProjectKeyInStoreKeyByStoreKeyProductProjectionsByIDGet) o;

        return new EqualsBuilder().append(projectKey, that.projectKey)
                .append(storeKey, that.storeKey)
                .append(ID, that.ID)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(projectKey).append(storeKey).append(ID).toHashCode();
    }

    @Override
    protected ByProjectKeyInStoreKeyByStoreKeyProductProjectionsByIDGet copy() {
        return new ByProjectKeyInStoreKeyByStoreKeyProductProjectionsByIDGet(this);
    }
}
