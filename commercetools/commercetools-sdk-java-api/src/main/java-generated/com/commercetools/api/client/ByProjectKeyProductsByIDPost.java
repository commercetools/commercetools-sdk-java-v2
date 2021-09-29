
package com.commercetools.api.client;

import static io.vrap.rmf.base.client.utils.ClientUtils.blockingWait;

import java.net.URI;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;

import io.vrap.rmf.base.client.*;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ByProjectKeyProductsByIDPost
        extends ApiMethod<ByProjectKeyProductsByIDPost, com.commercetools.api.models.product.Product>
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
    public ApiHttpRequest createHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("/%s/products/%s", this.projectKey, this.ID);
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }
        try {
            final byte[] body = apiHttpClient().getSerializerService().toJsonByteArray(productUpdate);
            return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(), body);
        }
        catch (Exception e) {
            e.printStackTrace();
        }

        return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(), null);
    }

    @Override
    public ApiHttpResponse<com.commercetools.api.models.product.Product> executeBlocking(final ApiHttpClient client,
            Duration timeout) {
        ApiHttpRequest request = this.createHttpRequest();
        return blockingWait(
            client.execute(request, com.commercetools.api.models.product.Product.class).toCompletableFuture(), request,
            timeout);
    }

    @Override
    public CompletableFuture<ApiHttpResponse<com.commercetools.api.models.product.Product>> execute(
            final ApiHttpClient client) {
        return client.execute(this.createHttpRequest(), com.commercetools.api.models.product.Product.class)
                .toCompletableFuture();
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
     * set priceCurrency with the specificied value
     */
    public ByProjectKeyProductsByIDPost withPriceCurrency(final String priceCurrency) {
        return copy().withQueryParam("priceCurrency", priceCurrency);
    }

    /**
     * add additional priceCurrency query parameter
     */
    public ByProjectKeyProductsByIDPost addPriceCurrency(final String priceCurrency) {
        return copy().addQueryParam("priceCurrency", priceCurrency);
    }

    /**
     * set priceCurrency with the specificied values
     */
    public ByProjectKeyProductsByIDPost withPriceCurrency(final List<String> priceCurrency) {
        return copy().withoutQueryParam("priceCurrency")
                .addQueryParams(priceCurrency.stream()
                        .map(s -> new ParamEntry<>("priceCurrency", s.toString()))
                        .collect(Collectors.toList()));
    }

    /**
     * add additional priceCurrency query parameters
     */
    public ByProjectKeyProductsByIDPost addPriceCurrency(final List<String> priceCurrency) {
        return copy().addQueryParams(priceCurrency.stream()
                .map(s -> new ParamEntry<>("priceCurrency", s.toString()))
                .collect(Collectors.toList()));
    }

    /**
     * set priceCountry with the specificied value
     */
    public ByProjectKeyProductsByIDPost withPriceCountry(final String priceCountry) {
        return copy().withQueryParam("priceCountry", priceCountry);
    }

    /**
     * add additional priceCountry query parameter
     */
    public ByProjectKeyProductsByIDPost addPriceCountry(final String priceCountry) {
        return copy().addQueryParam("priceCountry", priceCountry);
    }

    /**
     * set priceCountry with the specificied values
     */
    public ByProjectKeyProductsByIDPost withPriceCountry(final List<String> priceCountry) {
        return copy().withoutQueryParam("priceCountry")
                .addQueryParams(priceCountry.stream()
                        .map(s -> new ParamEntry<>("priceCountry", s.toString()))
                        .collect(Collectors.toList()));
    }

    /**
     * add additional priceCountry query parameters
     */
    public ByProjectKeyProductsByIDPost addPriceCountry(final List<String> priceCountry) {
        return copy().addQueryParams(priceCountry.stream()
                .map(s -> new ParamEntry<>("priceCountry", s.toString()))
                .collect(Collectors.toList()));
    }

    /**
     * set priceCustomerGroup with the specificied value
     */
    public ByProjectKeyProductsByIDPost withPriceCustomerGroup(final String priceCustomerGroup) {
        return copy().withQueryParam("priceCustomerGroup", priceCustomerGroup);
    }

    /**
     * add additional priceCustomerGroup query parameter
     */
    public ByProjectKeyProductsByIDPost addPriceCustomerGroup(final String priceCustomerGroup) {
        return copy().addQueryParam("priceCustomerGroup", priceCustomerGroup);
    }

    /**
     * set priceCustomerGroup with the specificied values
     */
    public ByProjectKeyProductsByIDPost withPriceCustomerGroup(final List<String> priceCustomerGroup) {
        return copy().withoutQueryParam("priceCustomerGroup")
                .addQueryParams(priceCustomerGroup.stream()
                        .map(s -> new ParamEntry<>("priceCustomerGroup", s.toString()))
                        .collect(Collectors.toList()));
    }

    /**
     * add additional priceCustomerGroup query parameters
     */
    public ByProjectKeyProductsByIDPost addPriceCustomerGroup(final List<String> priceCustomerGroup) {
        return copy().addQueryParams(priceCustomerGroup.stream()
                .map(s -> new ParamEntry<>("priceCustomerGroup", s.toString()))
                .collect(Collectors.toList()));
    }

    /**
     * set priceChannel with the specificied value
     */
    public ByProjectKeyProductsByIDPost withPriceChannel(final String priceChannel) {
        return copy().withQueryParam("priceChannel", priceChannel);
    }

    /**
     * add additional priceChannel query parameter
     */
    public ByProjectKeyProductsByIDPost addPriceChannel(final String priceChannel) {
        return copy().addQueryParam("priceChannel", priceChannel);
    }

    /**
     * set priceChannel with the specificied values
     */
    public ByProjectKeyProductsByIDPost withPriceChannel(final List<String> priceChannel) {
        return copy().withoutQueryParam("priceChannel")
                .addQueryParams(priceChannel.stream()
                        .map(s -> new ParamEntry<>("priceChannel", s.toString()))
                        .collect(Collectors.toList()));
    }

    /**
     * add additional priceChannel query parameters
     */
    public ByProjectKeyProductsByIDPost addPriceChannel(final List<String> priceChannel) {
        return copy().addQueryParams(priceChannel.stream()
                .map(s -> new ParamEntry<>("priceChannel", s.toString()))
                .collect(Collectors.toList()));
    }

    /**
     * set localeProjection with the specificied value
     */
    public ByProjectKeyProductsByIDPost withLocaleProjection(final String localeProjection) {
        return copy().withQueryParam("localeProjection", localeProjection);
    }

    /**
     * add additional localeProjection query parameter
     */
    public ByProjectKeyProductsByIDPost addLocaleProjection(final String localeProjection) {
        return copy().addQueryParam("localeProjection", localeProjection);
    }

    /**
     * set localeProjection with the specificied values
     */
    public ByProjectKeyProductsByIDPost withLocaleProjection(final List<String> localeProjection) {
        return copy().withoutQueryParam("localeProjection")
                .addQueryParams(localeProjection.stream()
                        .map(s -> new ParamEntry<>("localeProjection", s.toString()))
                        .collect(Collectors.toList()));
    }

    /**
     * add additional localeProjection query parameters
     */
    public ByProjectKeyProductsByIDPost addLocaleProjection(final List<String> localeProjection) {
        return copy().addQueryParams(localeProjection.stream()
                .map(s -> new ParamEntry<>("localeProjection", s.toString()))
                .collect(Collectors.toList()));
    }

    /**
     * set storeProjection with the specificied value
     */
    public ByProjectKeyProductsByIDPost withStoreProjection(final String storeProjection) {
        return copy().withQueryParam("storeProjection", storeProjection);
    }

    /**
     * add additional storeProjection query parameter
     */
    public ByProjectKeyProductsByIDPost addStoreProjection(final String storeProjection) {
        return copy().addQueryParam("storeProjection", storeProjection);
    }

    /**
     * set storeProjection with the specificied values
     */
    public ByProjectKeyProductsByIDPost withStoreProjection(final List<String> storeProjection) {
        return copy().withoutQueryParam("storeProjection")
                .addQueryParams(storeProjection.stream()
                        .map(s -> new ParamEntry<>("storeProjection", s.toString()))
                        .collect(Collectors.toList()));
    }

    /**
     * add additional storeProjection query parameters
     */
    public ByProjectKeyProductsByIDPost addStoreProjection(final List<String> storeProjection) {
        return copy().addQueryParams(storeProjection.stream()
                .map(s -> new ParamEntry<>("storeProjection", s.toString()))
                .collect(Collectors.toList()));
    }

    /**
     * set expand with the specificied value
     */
    public ByProjectKeyProductsByIDPost withExpand(final String expand) {
        return copy().withQueryParam("expand", expand);
    }

    /**
     * add additional expand query parameter
     */
    public ByProjectKeyProductsByIDPost addExpand(final String expand) {
        return copy().addQueryParam("expand", expand);
    }

    /**
     * set expand with the specificied values
     */
    public ByProjectKeyProductsByIDPost withExpand(final List<String> expand) {
        return copy().withoutQueryParam("expand")
                .addQueryParams(
                    expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional expand query parameters
     */
    public ByProjectKeyProductsByIDPost addExpand(final List<String> expand) {
        return copy().addQueryParams(
            expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList()));
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
