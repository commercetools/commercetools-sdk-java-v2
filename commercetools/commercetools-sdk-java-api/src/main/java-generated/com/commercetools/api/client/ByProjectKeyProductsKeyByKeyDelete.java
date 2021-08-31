
package com.commercetools.api.client;

import static io.vrap.rmf.base.client.utils.ClientUtils.blockingWait;

import java.net.URI;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;

import io.vrap.rmf.base.client.*;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ByProjectKeyProductsKeyByKeyDelete
        extends ApiMethod<ByProjectKeyProductsKeyByKeyDelete, com.commercetools.api.models.product.Product>
        implements com.commercetools.api.client.PriceselectingTrait<ByProjectKeyProductsKeyByKeyDelete>,
        com.commercetools.api.client.VersionedTrait<ByProjectKeyProductsKeyByKeyDelete>,
        com.commercetools.api.client.ConflictingTrait<ByProjectKeyProductsKeyByKeyDelete>,
        com.commercetools.api.client.ExpandableTrait<ByProjectKeyProductsKeyByKeyDelete>,
        com.commercetools.api.client.ErrorableTrait<ByProjectKeyProductsKeyByKeyDelete>,
        com.commercetools.api.client.Deprecatable200Trait<ByProjectKeyProductsKeyByKeyDelete> {

    private String projectKey;
    private String key;

    public ByProjectKeyProductsKeyByKeyDelete(final ApiHttpClient apiHttpClient, String projectKey, String key) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.key = key;
    }

    public ByProjectKeyProductsKeyByKeyDelete(ByProjectKeyProductsKeyByKeyDelete t) {
        super(t);
        this.projectKey = t.projectKey;
        this.key = t.key;
    }

    @Override
    public ApiHttpRequest createHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("/%s/products/key=%s", this.projectKey, this.key);
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }

        return new ApiHttpRequest(ApiHttpMethod.DELETE, URI.create(httpRequestPath), getHeaders(), null);
    }

    @Override
    public ApiHttpResponse<com.commercetools.api.models.product.Product> executeBlocking(final ApiHttpClient client,
            Duration timeout) {
        ApiHttpRequest request = this.createHttpRequest();
        return blockingWait(client.execute(request, com.commercetools.api.models.product.Product.class), request,
            timeout);
    }

    @Override
    public CompletableFuture<ApiHttpResponse<com.commercetools.api.models.product.Product>> execute(
            final ApiHttpClient client) {
        return client.execute(this.createHttpRequest(), com.commercetools.api.models.product.Product.class);
    }

    public String getProjectKey() {
        return this.projectKey;
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

    public List<String> getStoreProjection() {
        return this.getQueryParam("storeProjection");
    }

    public List<String> getVersion() {
        return this.getQueryParam("version");
    }

    public List<String> getExpand() {
        return this.getQueryParam("expand");
    }

    public void setProjectKey(final String projectKey) {
        this.projectKey = projectKey;
    }

    public void setKey(final String key) {
        this.key = key;
    }

    /**
     * set priceCurrency with the specificied value
     */
    public ByProjectKeyProductsKeyByKeyDelete withPriceCurrency(final String priceCurrency) {
        return copy().withQueryParam("priceCurrency", priceCurrency);
    }

    /**
     * add additional priceCurrency query parameter
     */
    public ByProjectKeyProductsKeyByKeyDelete addPriceCurrency(final String priceCurrency) {
        return copy().addQueryParam("priceCurrency", priceCurrency);
    }

    /**
     * set priceCountry with the specificied value
     */
    public ByProjectKeyProductsKeyByKeyDelete withPriceCountry(final String priceCountry) {
        return copy().withQueryParam("priceCountry", priceCountry);
    }

    /**
     * add additional priceCountry query parameter
     */
    public ByProjectKeyProductsKeyByKeyDelete addPriceCountry(final String priceCountry) {
        return copy().addQueryParam("priceCountry", priceCountry);
    }

    /**
     * set priceCustomerGroup with the specificied value
     */
    public ByProjectKeyProductsKeyByKeyDelete withPriceCustomerGroup(final String priceCustomerGroup) {
        return copy().withQueryParam("priceCustomerGroup", priceCustomerGroup);
    }

    /**
     * add additional priceCustomerGroup query parameter
     */
    public ByProjectKeyProductsKeyByKeyDelete addPriceCustomerGroup(final String priceCustomerGroup) {
        return copy().addQueryParam("priceCustomerGroup", priceCustomerGroup);
    }

    /**
     * set priceChannel with the specificied value
     */
    public ByProjectKeyProductsKeyByKeyDelete withPriceChannel(final String priceChannel) {
        return copy().withQueryParam("priceChannel", priceChannel);
    }

    /**
     * add additional priceChannel query parameter
     */
    public ByProjectKeyProductsKeyByKeyDelete addPriceChannel(final String priceChannel) {
        return copy().addQueryParam("priceChannel", priceChannel);
    }

    /**
     * set localeProjection with the specificied value
     */
    public ByProjectKeyProductsKeyByKeyDelete withLocaleProjection(final String localeProjection) {
        return copy().withQueryParam("localeProjection", localeProjection);
    }

    /**
     * add additional localeProjection query parameter
     */
    public ByProjectKeyProductsKeyByKeyDelete addLocaleProjection(final String localeProjection) {
        return copy().addQueryParam("localeProjection", localeProjection);
    }

    /**
     * set storeProjection with the specificied value
     */
    public ByProjectKeyProductsKeyByKeyDelete withStoreProjection(final String storeProjection) {
        return copy().withQueryParam("storeProjection", storeProjection);
    }

    /**
     * add additional storeProjection query parameter
     */
    public ByProjectKeyProductsKeyByKeyDelete addStoreProjection(final String storeProjection) {
        return copy().addQueryParam("storeProjection", storeProjection);
    }

    /**
     * set version with the specificied value
     */
    public ByProjectKeyProductsKeyByKeyDelete withVersion(final long version) {
        return copy().withQueryParam("version", version);
    }

    /**
     * add additional version query parameter
     */
    public ByProjectKeyProductsKeyByKeyDelete addVersion(final long version) {
        return copy().addQueryParam("version", version);
    }

    /**
     * set expand with the specificied value
     */
    public ByProjectKeyProductsKeyByKeyDelete withExpand(final String expand) {
        return copy().withQueryParam("expand", expand);
    }

    /**
     * add additional expand query parameter
     */
    public ByProjectKeyProductsKeyByKeyDelete addExpand(final String expand) {
        return copy().addQueryParam("expand", expand);
    }

    @Override
    protected ByProjectKeyProductsKeyByKeyDelete copy() {
        return new ByProjectKeyProductsKeyByKeyDelete(this);
    }
}
