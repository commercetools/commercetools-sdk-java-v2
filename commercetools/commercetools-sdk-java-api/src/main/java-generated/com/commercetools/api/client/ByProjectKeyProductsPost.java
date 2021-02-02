
package com.commercetools.api.client;

import static io.vrap.rmf.base.client.utils.ClientUtils.blockingWait;

import java.net.URI;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;

import io.vrap.rmf.base.client.*;
import io.vrap.rmf.base.client.utils.Generated;

/**
*  <p>To create a new product, send a representation that is going to become the initial staged representation
*  of the new product in the master catalog. If price selection query parameters are provided,
*  the selected prices will be added to the response.</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ByProjectKeyProductsPost
        extends ApiMethod<ByProjectKeyProductsPost, com.commercetools.api.models.product.Product>
        implements com.commercetools.api.client.PriceselectingTrait<ByProjectKeyProductsPost>,
        com.commercetools.api.client.ExpandableTrait<ByProjectKeyProductsPost>,
        com.commercetools.api.client.ErrorableTrait<ByProjectKeyProductsPost>,
        com.commercetools.api.client.DeprecatableTrait<ByProjectKeyProductsPost> {

    private String projectKey;

    private com.commercetools.api.models.product.ProductDraft productDraft;

    public ByProjectKeyProductsPost(final ApiHttpClient apiHttpClient, String projectKey,
            com.commercetools.api.models.product.ProductDraft productDraft) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.productDraft = productDraft;
    }

    public ByProjectKeyProductsPost(ByProjectKeyProductsPost t) {
        super(t);
        this.projectKey = t.projectKey;
        this.productDraft = t.productDraft;
    }

    @Override
    public ApiHttpRequest createHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("/%s/products", this.projectKey);
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }
        try {
            final byte[] body = apiHttpClient().getSerializerService().toJsonByteArray(productDraft);
            return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(), body);
        }
        catch (Exception e) {
            e.printStackTrace();
        }

        return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(), null);
    }

    @Override
    public ApiHttpResponse<com.commercetools.api.models.product.Product> executeBlocking(Duration timeout) {
        return blockingWait(execute(), timeout);
    }

    @Override
    public CompletableFuture<ApiHttpResponse<com.commercetools.api.models.product.Product>> execute() {
        return apiHttpClient().execute(this.createHttpRequest(), com.commercetools.api.models.product.Product.class);
    }

    public String getProjectKey() {
        return this.projectKey;
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

    public ByProjectKeyProductsPost withPriceCurrency(final String priceCurrency) {
        return copy().withQueryParam("priceCurrency", priceCurrency);
    }

    public ByProjectKeyProductsPost addPriceCurrency(final String priceCurrency) {
        return copy().addQueryParam("priceCurrency", priceCurrency);
    }

    public ByProjectKeyProductsPost withPriceCountry(final String priceCountry) {
        return copy().withQueryParam("priceCountry", priceCountry);
    }

    public ByProjectKeyProductsPost addPriceCountry(final String priceCountry) {
        return copy().addQueryParam("priceCountry", priceCountry);
    }

    public ByProjectKeyProductsPost withPriceCustomerGroup(final String priceCustomerGroup) {
        return copy().withQueryParam("priceCustomerGroup", priceCustomerGroup);
    }

    public ByProjectKeyProductsPost addPriceCustomerGroup(final String priceCustomerGroup) {
        return copy().addQueryParam("priceCustomerGroup", priceCustomerGroup);
    }

    public ByProjectKeyProductsPost withPriceChannel(final String priceChannel) {
        return copy().withQueryParam("priceChannel", priceChannel);
    }

    public ByProjectKeyProductsPost addPriceChannel(final String priceChannel) {
        return copy().addQueryParam("priceChannel", priceChannel);
    }

    public ByProjectKeyProductsPost withLocaleProjection(final String localeProjection) {
        return copy().withQueryParam("localeProjection", localeProjection);
    }

    public ByProjectKeyProductsPost addLocaleProjection(final String localeProjection) {
        return copy().addQueryParam("localeProjection", localeProjection);
    }

    public ByProjectKeyProductsPost withStoreProjection(final String storeProjection) {
        return copy().withQueryParam("storeProjection", storeProjection);
    }

    public ByProjectKeyProductsPost addStoreProjection(final String storeProjection) {
        return copy().addQueryParam("storeProjection", storeProjection);
    }

    public ByProjectKeyProductsPost withExpand(final String expand) {
        return copy().withQueryParam("expand", expand);
    }

    public ByProjectKeyProductsPost addExpand(final String expand) {
        return copy().addQueryParam("expand", expand);
    }

    @Override
    protected ByProjectKeyProductsPost copy() {
        return new ByProjectKeyProductsPost(this);
    }
}
