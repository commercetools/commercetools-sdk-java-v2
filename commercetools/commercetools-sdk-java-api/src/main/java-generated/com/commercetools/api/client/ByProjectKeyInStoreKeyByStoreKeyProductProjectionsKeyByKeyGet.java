
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
 *  <p>Gets the current or staged representation of a Product by its key from the specified Store.</p>
 *
 * <hr>
 * <div class=code-example>
 * <pre><code class='java'>{@code
 *   CompletableFuture<ApiHttpResponse<com.commercetools.api.models.product.ProductProjection>> result = apiRoot
 *            .withProjectKey("{projectKey}")
 *            .inStoreKeyWithStoreKeyValue("{storeKey}")
 *            .productProjections()
 *            .withKey("{key}")
 *            .get()
 *            .execute()
 * }</code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyInStoreKeyByStoreKeyProductProjectionsKeyByKeyGet extends
        ApiMethod<ByProjectKeyInStoreKeyByStoreKeyProductProjectionsKeyByKeyGet, com.commercetools.api.models.product.ProductProjection>
        implements
        com.commercetools.api.client.PriceselectingTrait<ByProjectKeyInStoreKeyByStoreKeyProductProjectionsKeyByKeyGet>,
        com.commercetools.api.client.LocaleprojectingTrait<ByProjectKeyInStoreKeyByStoreKeyProductProjectionsKeyByKeyGet>,
        com.commercetools.api.client.ExpandableTrait<ByProjectKeyInStoreKeyByStoreKeyProductProjectionsKeyByKeyGet>,
        com.commercetools.api.client.ErrorableTrait<ByProjectKeyInStoreKeyByStoreKeyProductProjectionsKeyByKeyGet>,
        com.commercetools.api.client.Deprecatable200Trait<ByProjectKeyInStoreKeyByStoreKeyProductProjectionsKeyByKeyGet> {

    private String projectKey;
    private String storeKey;
    private String key;

    public ByProjectKeyInStoreKeyByStoreKeyProductProjectionsKeyByKeyGet(final ApiHttpClient apiHttpClient,
            String projectKey, String storeKey, String key) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.storeKey = storeKey;
        this.key = key;
    }

    public ByProjectKeyInStoreKeyByStoreKeyProductProjectionsKeyByKeyGet(
            ByProjectKeyInStoreKeyByStoreKeyProductProjectionsKeyByKeyGet t) {
        super(t);
        this.projectKey = t.projectKey;
        this.storeKey = t.storeKey;
        this.key = t.key;
    }

    @Override
    protected ApiHttpRequest buildHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("/%s/in-store/key=%s/product-projections/key=%s", this.projectKey,
            this.storeKey, this.key);
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

    public String getKey() {
        return this.key;
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

    public void setKey(final String key) {
        this.key = key;
    }

    /**
     * set priceCurrency with the specified value
     */
    public <TValue> ByProjectKeyInStoreKeyByStoreKeyProductProjectionsKeyByKeyGet withPriceCurrency(
            final TValue priceCurrency) {
        return copy().withQueryParam("priceCurrency", priceCurrency);
    }

    /**
     * add additional priceCurrency query parameter
     */
    public <TValue> ByProjectKeyInStoreKeyByStoreKeyProductProjectionsKeyByKeyGet addPriceCurrency(
            final TValue priceCurrency) {
        return copy().addQueryParam("priceCurrency", priceCurrency);
    }

    /**
     * set priceCurrency with the specified value
     */
    public ByProjectKeyInStoreKeyByStoreKeyProductProjectionsKeyByKeyGet withPriceCurrency(
            final Supplier<String> supplier) {
        return copy().withQueryParam("priceCurrency", supplier.get());
    }

    /**
     * add additional priceCurrency query parameter
     */
    public ByProjectKeyInStoreKeyByStoreKeyProductProjectionsKeyByKeyGet addPriceCurrency(
            final Supplier<String> supplier) {
        return copy().addQueryParam("priceCurrency", supplier.get());
    }

    /**
     * set priceCurrency with the specified value
     */
    public ByProjectKeyInStoreKeyByStoreKeyProductProjectionsKeyByKeyGet withPriceCurrency(
            final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("priceCurrency", op.apply(new StringBuilder()));
    }

    /**
     * add additional priceCurrency query parameter
     */
    public ByProjectKeyInStoreKeyByStoreKeyProductProjectionsKeyByKeyGet addPriceCurrency(
            final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("priceCurrency", op.apply(new StringBuilder()));
    }

    /**
     * set priceCurrency with the specified values
     */
    public <TValue> ByProjectKeyInStoreKeyByStoreKeyProductProjectionsKeyByKeyGet withPriceCurrency(
            final List<TValue> priceCurrency) {
        return copy().withoutQueryParam("priceCurrency")
                .addQueryParams(priceCurrency.stream()
                        .map(s -> new ParamEntry<>("priceCurrency", s.toString()))
                        .collect(Collectors.toList()));
    }

    /**
     * add additional priceCurrency query parameters
     */
    public <TValue> ByProjectKeyInStoreKeyByStoreKeyProductProjectionsKeyByKeyGet addPriceCurrency(
            final List<TValue> priceCurrency) {
        return copy().addQueryParams(priceCurrency.stream()
                .map(s -> new ParamEntry<>("priceCurrency", s.toString()))
                .collect(Collectors.toList()));
    }

    /**
     * set priceCountry with the specified value
     */
    public <TValue> ByProjectKeyInStoreKeyByStoreKeyProductProjectionsKeyByKeyGet withPriceCountry(
            final TValue priceCountry) {
        return copy().withQueryParam("priceCountry", priceCountry);
    }

    /**
     * add additional priceCountry query parameter
     */
    public <TValue> ByProjectKeyInStoreKeyByStoreKeyProductProjectionsKeyByKeyGet addPriceCountry(
            final TValue priceCountry) {
        return copy().addQueryParam("priceCountry", priceCountry);
    }

    /**
     * set priceCountry with the specified value
     */
    public ByProjectKeyInStoreKeyByStoreKeyProductProjectionsKeyByKeyGet withPriceCountry(
            final Supplier<String> supplier) {
        return copy().withQueryParam("priceCountry", supplier.get());
    }

    /**
     * add additional priceCountry query parameter
     */
    public ByProjectKeyInStoreKeyByStoreKeyProductProjectionsKeyByKeyGet addPriceCountry(
            final Supplier<String> supplier) {
        return copy().addQueryParam("priceCountry", supplier.get());
    }

    /**
     * set priceCountry with the specified value
     */
    public ByProjectKeyInStoreKeyByStoreKeyProductProjectionsKeyByKeyGet withPriceCountry(
            final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("priceCountry", op.apply(new StringBuilder()));
    }

    /**
     * add additional priceCountry query parameter
     */
    public ByProjectKeyInStoreKeyByStoreKeyProductProjectionsKeyByKeyGet addPriceCountry(
            final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("priceCountry", op.apply(new StringBuilder()));
    }

    /**
     * set priceCountry with the specified values
     */
    public <TValue> ByProjectKeyInStoreKeyByStoreKeyProductProjectionsKeyByKeyGet withPriceCountry(
            final List<TValue> priceCountry) {
        return copy().withoutQueryParam("priceCountry")
                .addQueryParams(priceCountry.stream()
                        .map(s -> new ParamEntry<>("priceCountry", s.toString()))
                        .collect(Collectors.toList()));
    }

    /**
     * add additional priceCountry query parameters
     */
    public <TValue> ByProjectKeyInStoreKeyByStoreKeyProductProjectionsKeyByKeyGet addPriceCountry(
            final List<TValue> priceCountry) {
        return copy().addQueryParams(priceCountry.stream()
                .map(s -> new ParamEntry<>("priceCountry", s.toString()))
                .collect(Collectors.toList()));
    }

    /**
     * set priceCustomerGroup with the specified value
     */
    public <TValue> ByProjectKeyInStoreKeyByStoreKeyProductProjectionsKeyByKeyGet withPriceCustomerGroup(
            final TValue priceCustomerGroup) {
        return copy().withQueryParam("priceCustomerGroup", priceCustomerGroup);
    }

    /**
     * add additional priceCustomerGroup query parameter
     */
    public <TValue> ByProjectKeyInStoreKeyByStoreKeyProductProjectionsKeyByKeyGet addPriceCustomerGroup(
            final TValue priceCustomerGroup) {
        return copy().addQueryParam("priceCustomerGroup", priceCustomerGroup);
    }

    /**
     * set priceCustomerGroup with the specified value
     */
    public ByProjectKeyInStoreKeyByStoreKeyProductProjectionsKeyByKeyGet withPriceCustomerGroup(
            final Supplier<String> supplier) {
        return copy().withQueryParam("priceCustomerGroup", supplier.get());
    }

    /**
     * add additional priceCustomerGroup query parameter
     */
    public ByProjectKeyInStoreKeyByStoreKeyProductProjectionsKeyByKeyGet addPriceCustomerGroup(
            final Supplier<String> supplier) {
        return copy().addQueryParam("priceCustomerGroup", supplier.get());
    }

    /**
     * set priceCustomerGroup with the specified value
     */
    public ByProjectKeyInStoreKeyByStoreKeyProductProjectionsKeyByKeyGet withPriceCustomerGroup(
            final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("priceCustomerGroup", op.apply(new StringBuilder()));
    }

    /**
     * add additional priceCustomerGroup query parameter
     */
    public ByProjectKeyInStoreKeyByStoreKeyProductProjectionsKeyByKeyGet addPriceCustomerGroup(
            final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("priceCustomerGroup", op.apply(new StringBuilder()));
    }

    /**
     * set priceCustomerGroup with the specified values
     */
    public <TValue> ByProjectKeyInStoreKeyByStoreKeyProductProjectionsKeyByKeyGet withPriceCustomerGroup(
            final List<TValue> priceCustomerGroup) {
        return copy().withoutQueryParam("priceCustomerGroup")
                .addQueryParams(priceCustomerGroup.stream()
                        .map(s -> new ParamEntry<>("priceCustomerGroup", s.toString()))
                        .collect(Collectors.toList()));
    }

    /**
     * add additional priceCustomerGroup query parameters
     */
    public <TValue> ByProjectKeyInStoreKeyByStoreKeyProductProjectionsKeyByKeyGet addPriceCustomerGroup(
            final List<TValue> priceCustomerGroup) {
        return copy().addQueryParams(priceCustomerGroup.stream()
                .map(s -> new ParamEntry<>("priceCustomerGroup", s.toString()))
                .collect(Collectors.toList()));
    }

    /**
     * set priceChannel with the specified value
     */
    public <TValue> ByProjectKeyInStoreKeyByStoreKeyProductProjectionsKeyByKeyGet withPriceChannel(
            final TValue priceChannel) {
        return copy().withQueryParam("priceChannel", priceChannel);
    }

    /**
     * add additional priceChannel query parameter
     */
    public <TValue> ByProjectKeyInStoreKeyByStoreKeyProductProjectionsKeyByKeyGet addPriceChannel(
            final TValue priceChannel) {
        return copy().addQueryParam("priceChannel", priceChannel);
    }

    /**
     * set priceChannel with the specified value
     */
    public ByProjectKeyInStoreKeyByStoreKeyProductProjectionsKeyByKeyGet withPriceChannel(
            final Supplier<String> supplier) {
        return copy().withQueryParam("priceChannel", supplier.get());
    }

    /**
     * add additional priceChannel query parameter
     */
    public ByProjectKeyInStoreKeyByStoreKeyProductProjectionsKeyByKeyGet addPriceChannel(
            final Supplier<String> supplier) {
        return copy().addQueryParam("priceChannel", supplier.get());
    }

    /**
     * set priceChannel with the specified value
     */
    public ByProjectKeyInStoreKeyByStoreKeyProductProjectionsKeyByKeyGet withPriceChannel(
            final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("priceChannel", op.apply(new StringBuilder()));
    }

    /**
     * add additional priceChannel query parameter
     */
    public ByProjectKeyInStoreKeyByStoreKeyProductProjectionsKeyByKeyGet addPriceChannel(
            final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("priceChannel", op.apply(new StringBuilder()));
    }

    /**
     * set priceChannel with the specified values
     */
    public <TValue> ByProjectKeyInStoreKeyByStoreKeyProductProjectionsKeyByKeyGet withPriceChannel(
            final List<TValue> priceChannel) {
        return copy().withoutQueryParam("priceChannel")
                .addQueryParams(priceChannel.stream()
                        .map(s -> new ParamEntry<>("priceChannel", s.toString()))
                        .collect(Collectors.toList()));
    }

    /**
     * add additional priceChannel query parameters
     */
    public <TValue> ByProjectKeyInStoreKeyByStoreKeyProductProjectionsKeyByKeyGet addPriceChannel(
            final List<TValue> priceChannel) {
        return copy().addQueryParams(priceChannel.stream()
                .map(s -> new ParamEntry<>("priceChannel", s.toString()))
                .collect(Collectors.toList()));
    }

    /**
     * set localeProjection with the specified value
     */
    public <TValue> ByProjectKeyInStoreKeyByStoreKeyProductProjectionsKeyByKeyGet withLocaleProjection(
            final TValue localeProjection) {
        return copy().withQueryParam("localeProjection", localeProjection);
    }

    /**
     * add additional localeProjection query parameter
     */
    public <TValue> ByProjectKeyInStoreKeyByStoreKeyProductProjectionsKeyByKeyGet addLocaleProjection(
            final TValue localeProjection) {
        return copy().addQueryParam("localeProjection", localeProjection);
    }

    /**
     * set localeProjection with the specified value
     */
    public ByProjectKeyInStoreKeyByStoreKeyProductProjectionsKeyByKeyGet withLocaleProjection(
            final Supplier<String> supplier) {
        return copy().withQueryParam("localeProjection", supplier.get());
    }

    /**
     * add additional localeProjection query parameter
     */
    public ByProjectKeyInStoreKeyByStoreKeyProductProjectionsKeyByKeyGet addLocaleProjection(
            final Supplier<String> supplier) {
        return copy().addQueryParam("localeProjection", supplier.get());
    }

    /**
     * set localeProjection with the specified value
     */
    public ByProjectKeyInStoreKeyByStoreKeyProductProjectionsKeyByKeyGet withLocaleProjection(
            final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("localeProjection", op.apply(new StringBuilder()));
    }

    /**
     * add additional localeProjection query parameter
     */
    public ByProjectKeyInStoreKeyByStoreKeyProductProjectionsKeyByKeyGet addLocaleProjection(
            final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("localeProjection", op.apply(new StringBuilder()));
    }

    /**
     * set localeProjection with the specified values
     */
    public <TValue> ByProjectKeyInStoreKeyByStoreKeyProductProjectionsKeyByKeyGet withLocaleProjection(
            final List<TValue> localeProjection) {
        return copy().withoutQueryParam("localeProjection")
                .addQueryParams(localeProjection.stream()
                        .map(s -> new ParamEntry<>("localeProjection", s.toString()))
                        .collect(Collectors.toList()));
    }

    /**
     * add additional localeProjection query parameters
     */
    public <TValue> ByProjectKeyInStoreKeyByStoreKeyProductProjectionsKeyByKeyGet addLocaleProjection(
            final List<TValue> localeProjection) {
        return copy().addQueryParams(localeProjection.stream()
                .map(s -> new ParamEntry<>("localeProjection", s.toString()))
                .collect(Collectors.toList()));
    }

    /**
     * set expand with the specified value
     */
    public <TValue> ByProjectKeyInStoreKeyByStoreKeyProductProjectionsKeyByKeyGet withExpand(final TValue expand) {
        return copy().withQueryParam("expand", expand);
    }

    /**
     * add additional expand query parameter
     */
    public <TValue> ByProjectKeyInStoreKeyByStoreKeyProductProjectionsKeyByKeyGet addExpand(final TValue expand) {
        return copy().addQueryParam("expand", expand);
    }

    /**
     * set expand with the specified value
     */
    public ByProjectKeyInStoreKeyByStoreKeyProductProjectionsKeyByKeyGet withExpand(final Supplier<String> supplier) {
        return copy().withQueryParam("expand", supplier.get());
    }

    /**
     * add additional expand query parameter
     */
    public ByProjectKeyInStoreKeyByStoreKeyProductProjectionsKeyByKeyGet addExpand(final Supplier<String> supplier) {
        return copy().addQueryParam("expand", supplier.get());
    }

    /**
     * set expand with the specified value
     */
    public ByProjectKeyInStoreKeyByStoreKeyProductProjectionsKeyByKeyGet withExpand(
            final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("expand", op.apply(new StringBuilder()));
    }

    /**
     * add additional expand query parameter
     */
    public ByProjectKeyInStoreKeyByStoreKeyProductProjectionsKeyByKeyGet addExpand(
            final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("expand", op.apply(new StringBuilder()));
    }

    /**
     * set expand with the specified values
     */
    public <TValue> ByProjectKeyInStoreKeyByStoreKeyProductProjectionsKeyByKeyGet withExpand(
            final List<TValue> expand) {
        return copy().withoutQueryParam("expand")
                .addQueryParams(
                    expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional expand query parameters
     */
    public <TValue> ByProjectKeyInStoreKeyByStoreKeyProductProjectionsKeyByKeyGet addExpand(final List<TValue> expand) {
        return copy().addQueryParams(
            expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList()));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ByProjectKeyInStoreKeyByStoreKeyProductProjectionsKeyByKeyGet that = (ByProjectKeyInStoreKeyByStoreKeyProductProjectionsKeyByKeyGet) o;

        return new EqualsBuilder().append(projectKey, that.projectKey)
                .append(storeKey, that.storeKey)
                .append(key, that.key)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(projectKey).append(storeKey).append(key).toHashCode();
    }

    @Override
    protected ByProjectKeyInStoreKeyByStoreKeyProductProjectionsKeyByKeyGet copy() {
        return new ByProjectKeyInStoreKeyByStoreKeyProductProjectionsKeyByKeyGet(this);
    }
}
