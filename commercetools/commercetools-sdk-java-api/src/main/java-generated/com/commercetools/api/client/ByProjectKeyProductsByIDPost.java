
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
public class ByProjectKeyProductsByIDPost extends
        BodyApiMethod<ByProjectKeyProductsByIDPost, com.commercetools.api.models.product.Product, com.commercetools.api.models.product.ProductUpdate>
        implements com.commercetools.api.client.PriceselectingTrait<ByProjectKeyProductsByIDPost>,
        com.commercetools.api.client.ConflictingTrait<ByProjectKeyProductsByIDPost>,
        com.commercetools.api.client.ExpandableTrait<ByProjectKeyProductsByIDPost>,
        com.commercetools.api.client.Deprecatable200Trait<ByProjectKeyProductsByIDPost>,
        com.commercetools.api.client.ErrorableTrait<ByProjectKeyProductsByIDPost> {

    private String projectKey;
    private String ID;

    private com.commercetools.api.models.product.ProductUpdate productUpdate;

    public ByProjectKeyProductsByIDPost(final ApiHttpClient apiHttpClient, String projectKey, String ID,
            com.commercetools.api.models.product.ProductUpdate productUpdate) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.ID = ID;
        this.productUpdate = productUpdate;
    }

    public ByProjectKeyProductsByIDPost(ByProjectKeyProductsByIDPost t) {
        super(t);
        this.projectKey = t.projectKey;
        this.ID = t.ID;
        this.productUpdate = t.productUpdate;
    }

    @Override
    protected ApiHttpRequest buildHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("/%s/products/%s", this.projectKey, this.ID);
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }
        return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(),
            io.vrap.rmf.base.client.utils.json.JsonUtils
                    .executing(() -> apiHttpClient().getSerializerService().toJsonByteArray(productUpdate)));

    }

    @Override
    public ApiHttpResponse<com.commercetools.api.models.product.Product> executeBlocking(final ApiHttpClient client,
            final Duration timeout) {
        return executeBlocking(client, timeout, com.commercetools.api.models.product.Product.class);
    }

    @Override
    public CompletableFuture<ApiHttpResponse<com.commercetools.api.models.product.Product>> execute(
            final ApiHttpClient client) {
        return execute(client, com.commercetools.api.models.product.Product.class);
    }

    public String getProjectKey() {
        return this.projectKey;
    }

    public String getID() {
        return this.ID;
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

    public List<String> getStoreProjection() {
        return this.getQueryParam("storeProjection");
    }

    public List<String> getExpand() {
        return this.getQueryParam("expand");
    }

    public void setProjectKey(final String projectKey) {
        this.projectKey = projectKey;
    }

    public void setID(final String ID) {
        this.ID = ID;
    }

    /**
     * set priceCurrency with the specified value
     */
    public <TValue> ByProjectKeyProductsByIDPost withPriceCurrency(final TValue priceCurrency) {
        return copy().withQueryParam("priceCurrency", priceCurrency);
    }

    /**
     * add additional priceCurrency query parameter
     */
    public <TValue> ByProjectKeyProductsByIDPost addPriceCurrency(final TValue priceCurrency) {
        return copy().addQueryParam("priceCurrency", priceCurrency);
    }

    /**
     * set priceCurrency with the specified value
     */
    public ByProjectKeyProductsByIDPost withPriceCurrency(final Supplier<String> supplier) {
        return copy().withQueryParam("priceCurrency", supplier.get());
    }

    /**
     * add additional priceCurrency query parameter
     */
    public ByProjectKeyProductsByIDPost addPriceCurrency(final Supplier<String> supplier) {
        return copy().addQueryParam("priceCurrency", supplier.get());
    }

    /**
     * set priceCurrency with the specified value
     */
    public ByProjectKeyProductsByIDPost withPriceCurrency(final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("priceCurrency", op.apply(new StringBuilder()));
    }

    /**
     * add additional priceCurrency query parameter
     */
    public ByProjectKeyProductsByIDPost addPriceCurrency(final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("priceCurrency", op.apply(new StringBuilder()));
    }

    /**
     * set priceCurrency with the specified values
     */
    public <TValue> ByProjectKeyProductsByIDPost withPriceCurrency(final List<TValue> priceCurrency) {
        return copy().withoutQueryParam("priceCurrency")
                .addQueryParams(priceCurrency.stream()
                        .map(s -> new ParamEntry<>("priceCurrency", s.toString()))
                        .collect(Collectors.toList()));
    }

    /**
     * add additional priceCurrency query parameters
     */
    public <TValue> ByProjectKeyProductsByIDPost addPriceCurrency(final List<TValue> priceCurrency) {
        return copy().addQueryParams(priceCurrency.stream()
                .map(s -> new ParamEntry<>("priceCurrency", s.toString()))
                .collect(Collectors.toList()));
    }

    /**
     * set priceCountry with the specified value
     */
    public <TValue> ByProjectKeyProductsByIDPost withPriceCountry(final TValue priceCountry) {
        return copy().withQueryParam("priceCountry", priceCountry);
    }

    /**
     * add additional priceCountry query parameter
     */
    public <TValue> ByProjectKeyProductsByIDPost addPriceCountry(final TValue priceCountry) {
        return copy().addQueryParam("priceCountry", priceCountry);
    }

    /**
     * set priceCountry with the specified value
     */
    public ByProjectKeyProductsByIDPost withPriceCountry(final Supplier<String> supplier) {
        return copy().withQueryParam("priceCountry", supplier.get());
    }

    /**
     * add additional priceCountry query parameter
     */
    public ByProjectKeyProductsByIDPost addPriceCountry(final Supplier<String> supplier) {
        return copy().addQueryParam("priceCountry", supplier.get());
    }

    /**
     * set priceCountry with the specified value
     */
    public ByProjectKeyProductsByIDPost withPriceCountry(final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("priceCountry", op.apply(new StringBuilder()));
    }

    /**
     * add additional priceCountry query parameter
     */
    public ByProjectKeyProductsByIDPost addPriceCountry(final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("priceCountry", op.apply(new StringBuilder()));
    }

    /**
     * set priceCountry with the specified values
     */
    public <TValue> ByProjectKeyProductsByIDPost withPriceCountry(final List<TValue> priceCountry) {
        return copy().withoutQueryParam("priceCountry")
                .addQueryParams(priceCountry.stream()
                        .map(s -> new ParamEntry<>("priceCountry", s.toString()))
                        .collect(Collectors.toList()));
    }

    /**
     * add additional priceCountry query parameters
     */
    public <TValue> ByProjectKeyProductsByIDPost addPriceCountry(final List<TValue> priceCountry) {
        return copy().addQueryParams(priceCountry.stream()
                .map(s -> new ParamEntry<>("priceCountry", s.toString()))
                .collect(Collectors.toList()));
    }

    /**
     * set priceCustomerGroup with the specified value
     */
    public <TValue> ByProjectKeyProductsByIDPost withPriceCustomerGroup(final TValue priceCustomerGroup) {
        return copy().withQueryParam("priceCustomerGroup", priceCustomerGroup);
    }

    /**
     * add additional priceCustomerGroup query parameter
     */
    public <TValue> ByProjectKeyProductsByIDPost addPriceCustomerGroup(final TValue priceCustomerGroup) {
        return copy().addQueryParam("priceCustomerGroup", priceCustomerGroup);
    }

    /**
     * set priceCustomerGroup with the specified value
     */
    public ByProjectKeyProductsByIDPost withPriceCustomerGroup(final Supplier<String> supplier) {
        return copy().withQueryParam("priceCustomerGroup", supplier.get());
    }

    /**
     * add additional priceCustomerGroup query parameter
     */
    public ByProjectKeyProductsByIDPost addPriceCustomerGroup(final Supplier<String> supplier) {
        return copy().addQueryParam("priceCustomerGroup", supplier.get());
    }

    /**
     * set priceCustomerGroup with the specified value
     */
    public ByProjectKeyProductsByIDPost withPriceCustomerGroup(final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("priceCustomerGroup", op.apply(new StringBuilder()));
    }

    /**
     * add additional priceCustomerGroup query parameter
     */
    public ByProjectKeyProductsByIDPost addPriceCustomerGroup(final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("priceCustomerGroup", op.apply(new StringBuilder()));
    }

    /**
     * set priceCustomerGroup with the specified values
     */
    public <TValue> ByProjectKeyProductsByIDPost withPriceCustomerGroup(final List<TValue> priceCustomerGroup) {
        return copy().withoutQueryParam("priceCustomerGroup")
                .addQueryParams(priceCustomerGroup.stream()
                        .map(s -> new ParamEntry<>("priceCustomerGroup", s.toString()))
                        .collect(Collectors.toList()));
    }

    /**
     * add additional priceCustomerGroup query parameters
     */
    public <TValue> ByProjectKeyProductsByIDPost addPriceCustomerGroup(final List<TValue> priceCustomerGroup) {
        return copy().addQueryParams(priceCustomerGroup.stream()
                .map(s -> new ParamEntry<>("priceCustomerGroup", s.toString()))
                .collect(Collectors.toList()));
    }

    /**
     * set priceChannel with the specified value
     */
    public <TValue> ByProjectKeyProductsByIDPost withPriceChannel(final TValue priceChannel) {
        return copy().withQueryParam("priceChannel", priceChannel);
    }

    /**
     * add additional priceChannel query parameter
     */
    public <TValue> ByProjectKeyProductsByIDPost addPriceChannel(final TValue priceChannel) {
        return copy().addQueryParam("priceChannel", priceChannel);
    }

    /**
     * set priceChannel with the specified value
     */
    public ByProjectKeyProductsByIDPost withPriceChannel(final Supplier<String> supplier) {
        return copy().withQueryParam("priceChannel", supplier.get());
    }

    /**
     * add additional priceChannel query parameter
     */
    public ByProjectKeyProductsByIDPost addPriceChannel(final Supplier<String> supplier) {
        return copy().addQueryParam("priceChannel", supplier.get());
    }

    /**
     * set priceChannel with the specified value
     */
    public ByProjectKeyProductsByIDPost withPriceChannel(final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("priceChannel", op.apply(new StringBuilder()));
    }

    /**
     * add additional priceChannel query parameter
     */
    public ByProjectKeyProductsByIDPost addPriceChannel(final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("priceChannel", op.apply(new StringBuilder()));
    }

    /**
     * set priceChannel with the specified values
     */
    public <TValue> ByProjectKeyProductsByIDPost withPriceChannel(final List<TValue> priceChannel) {
        return copy().withoutQueryParam("priceChannel")
                .addQueryParams(priceChannel.stream()
                        .map(s -> new ParamEntry<>("priceChannel", s.toString()))
                        .collect(Collectors.toList()));
    }

    /**
     * add additional priceChannel query parameters
     */
    public <TValue> ByProjectKeyProductsByIDPost addPriceChannel(final List<TValue> priceChannel) {
        return copy().addQueryParams(priceChannel.stream()
                .map(s -> new ParamEntry<>("priceChannel", s.toString()))
                .collect(Collectors.toList()));
    }

    /**
     * set localeProjection with the specified value
     */
    public <TValue> ByProjectKeyProductsByIDPost withLocaleProjection(final TValue localeProjection) {
        return copy().withQueryParam("localeProjection", localeProjection);
    }

    /**
     * add additional localeProjection query parameter
     */
    public <TValue> ByProjectKeyProductsByIDPost addLocaleProjection(final TValue localeProjection) {
        return copy().addQueryParam("localeProjection", localeProjection);
    }

    /**
     * set localeProjection with the specified value
     */
    public ByProjectKeyProductsByIDPost withLocaleProjection(final Supplier<String> supplier) {
        return copy().withQueryParam("localeProjection", supplier.get());
    }

    /**
     * add additional localeProjection query parameter
     */
    public ByProjectKeyProductsByIDPost addLocaleProjection(final Supplier<String> supplier) {
        return copy().addQueryParam("localeProjection", supplier.get());
    }

    /**
     * set localeProjection with the specified value
     */
    public ByProjectKeyProductsByIDPost withLocaleProjection(final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("localeProjection", op.apply(new StringBuilder()));
    }

    /**
     * add additional localeProjection query parameter
     */
    public ByProjectKeyProductsByIDPost addLocaleProjection(final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("localeProjection", op.apply(new StringBuilder()));
    }

    /**
     * set localeProjection with the specified values
     */
    public <TValue> ByProjectKeyProductsByIDPost withLocaleProjection(final List<TValue> localeProjection) {
        return copy().withoutQueryParam("localeProjection")
                .addQueryParams(localeProjection.stream()
                        .map(s -> new ParamEntry<>("localeProjection", s.toString()))
                        .collect(Collectors.toList()));
    }

    /**
     * add additional localeProjection query parameters
     */
    public <TValue> ByProjectKeyProductsByIDPost addLocaleProjection(final List<TValue> localeProjection) {
        return copy().addQueryParams(localeProjection.stream()
                .map(s -> new ParamEntry<>("localeProjection", s.toString()))
                .collect(Collectors.toList()));
    }

    /**
     * set storeProjection with the specified value
     */
    public <TValue> ByProjectKeyProductsByIDPost withStoreProjection(final TValue storeProjection) {
        return copy().withQueryParam("storeProjection", storeProjection);
    }

    /**
     * add additional storeProjection query parameter
     */
    public <TValue> ByProjectKeyProductsByIDPost addStoreProjection(final TValue storeProjection) {
        return copy().addQueryParam("storeProjection", storeProjection);
    }

    /**
     * set storeProjection with the specified value
     */
    public ByProjectKeyProductsByIDPost withStoreProjection(final Supplier<String> supplier) {
        return copy().withQueryParam("storeProjection", supplier.get());
    }

    /**
     * add additional storeProjection query parameter
     */
    public ByProjectKeyProductsByIDPost addStoreProjection(final Supplier<String> supplier) {
        return copy().addQueryParam("storeProjection", supplier.get());
    }

    /**
     * set storeProjection with the specified value
     */
    public ByProjectKeyProductsByIDPost withStoreProjection(final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("storeProjection", op.apply(new StringBuilder()));
    }

    /**
     * add additional storeProjection query parameter
     */
    public ByProjectKeyProductsByIDPost addStoreProjection(final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("storeProjection", op.apply(new StringBuilder()));
    }

    /**
     * set storeProjection with the specified values
     */
    public <TValue> ByProjectKeyProductsByIDPost withStoreProjection(final List<TValue> storeProjection) {
        return copy().withoutQueryParam("storeProjection")
                .addQueryParams(storeProjection.stream()
                        .map(s -> new ParamEntry<>("storeProjection", s.toString()))
                        .collect(Collectors.toList()));
    }

    /**
     * add additional storeProjection query parameters
     */
    public <TValue> ByProjectKeyProductsByIDPost addStoreProjection(final List<TValue> storeProjection) {
        return copy().addQueryParams(storeProjection.stream()
                .map(s -> new ParamEntry<>("storeProjection", s.toString()))
                .collect(Collectors.toList()));
    }

    /**
     * set expand with the specified value
     */
    public <TValue> ByProjectKeyProductsByIDPost withExpand(final TValue expand) {
        return copy().withQueryParam("expand", expand);
    }

    /**
     * add additional expand query parameter
     */
    public <TValue> ByProjectKeyProductsByIDPost addExpand(final TValue expand) {
        return copy().addQueryParam("expand", expand);
    }

    /**
     * set expand with the specified value
     */
    public ByProjectKeyProductsByIDPost withExpand(final Supplier<String> supplier) {
        return copy().withQueryParam("expand", supplier.get());
    }

    /**
     * add additional expand query parameter
     */
    public ByProjectKeyProductsByIDPost addExpand(final Supplier<String> supplier) {
        return copy().addQueryParam("expand", supplier.get());
    }

    /**
     * set expand with the specified value
     */
    public ByProjectKeyProductsByIDPost withExpand(final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("expand", op.apply(new StringBuilder()));
    }

    /**
     * add additional expand query parameter
     */
    public ByProjectKeyProductsByIDPost addExpand(final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("expand", op.apply(new StringBuilder()));
    }

    /**
     * set expand with the specified values
     */
    public <TValue> ByProjectKeyProductsByIDPost withExpand(final List<TValue> expand) {
        return copy().withoutQueryParam("expand")
                .addQueryParams(
                    expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional expand query parameters
     */
    public <TValue> ByProjectKeyProductsByIDPost addExpand(final List<TValue> expand) {
        return copy().addQueryParams(
            expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList()));
    }

    public com.commercetools.api.models.product.ProductUpdate getBody() {
        return productUpdate;
    }

    public ByProjectKeyProductsByIDPost withBody(com.commercetools.api.models.product.ProductUpdate productUpdate) {
        ByProjectKeyProductsByIDPost t = copy();
        t.productUpdate = productUpdate;
        return t;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ByProjectKeyProductsByIDPost that = (ByProjectKeyProductsByIDPost) o;

        return new EqualsBuilder().append(projectKey, that.projectKey)
                .append(ID, that.ID)
                .append(productUpdate, that.productUpdate)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(projectKey).append(ID).append(productUpdate).toHashCode();
    }

    @Override
    protected ByProjectKeyProductsByIDPost copy() {
        return new ByProjectKeyProductsByIDPost(this);
    }
}
