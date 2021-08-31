
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
*  <p>You can use the product projections query endpoint to get the current or staged representations of Products.
*  When used with an API client that has the view_published_products:{projectKey} scope,
*  this endpoint only returns published (current) product projections.</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ByProjectKeyProductProjectionsGet extends
        ApiMethod<ByProjectKeyProductProjectionsGet, com.commercetools.api.models.product.ProductProjectionPagedQueryResponse>
        implements
        com.commercetools.api.models.PagedQueryResourceRequest<ByProjectKeyProductProjectionsGet, com.commercetools.api.models.product.ProductProjectionPagedQueryResponse>,
        com.commercetools.api.client.PriceselectingTrait<ByProjectKeyProductProjectionsGet>,
        com.commercetools.api.client.ExpandableTrait<ByProjectKeyProductProjectionsGet>,
        com.commercetools.api.client.SortableTrait<ByProjectKeyProductProjectionsGet>,
        com.commercetools.api.client.PagingTrait<ByProjectKeyProductProjectionsGet>,
        com.commercetools.api.client.QueryTrait<ByProjectKeyProductProjectionsGet>,
        com.commercetools.api.client.ErrorableTrait<ByProjectKeyProductProjectionsGet>,
        com.commercetools.api.client.Deprecatable200Trait<ByProjectKeyProductProjectionsGet> {

    private String projectKey;

    public ByProjectKeyProductProjectionsGet(final ApiHttpClient apiHttpClient, String projectKey) {
        super(apiHttpClient);
        this.projectKey = projectKey;
    }

    public ByProjectKeyProductProjectionsGet(ByProjectKeyProductProjectionsGet t) {
        super(t);
        this.projectKey = t.projectKey;
    }

    @Override
    public ApiHttpRequest createHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("/%s/product-projections", this.projectKey);
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }

        return new ApiHttpRequest(ApiHttpMethod.GET, URI.create(httpRequestPath), getHeaders(), null);
    }

    @Override
    public ApiHttpResponse<com.commercetools.api.models.product.ProductProjectionPagedQueryResponse> executeBlocking(
            final ApiHttpClient client, Duration timeout) {
        ApiHttpRequest request = this.createHttpRequest();
        return blockingWait(
            client.execute(request, com.commercetools.api.models.product.ProductProjectionPagedQueryResponse.class),
            request, timeout);
    }

    @Override
    public CompletableFuture<ApiHttpResponse<com.commercetools.api.models.product.ProductProjectionPagedQueryResponse>> execute(
            final ApiHttpClient client) {
        return client.execute(this.createHttpRequest(),
            com.commercetools.api.models.product.ProductProjectionPagedQueryResponse.class);
    }

    public String getProjectKey() {
        return this.projectKey;
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

    public List<String> getStoreProjection() {
        return this.getQueryParam("storeProjection");
    }

    public List<String> getExpand() {
        return this.getQueryParam("expand");
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

    public List<String> getWhere() {
        return this.getQueryParam("where");
    }

    public void setProjectKey(final String projectKey) {
        this.projectKey = projectKey;
    }

    /**
     * set staged with the specificied value
     */
    public ByProjectKeyProductProjectionsGet withStaged(final boolean staged) {
        return copy().withQueryParam("staged", staged);
    }

    /**
     * add additional staged query parameter
     */
    public ByProjectKeyProductProjectionsGet addStaged(final boolean staged) {
        return copy().addQueryParam("staged", staged);
    }

    /**
     * set priceCurrency with the specificied value
     */
    public ByProjectKeyProductProjectionsGet withPriceCurrency(final String priceCurrency) {
        return copy().withQueryParam("priceCurrency", priceCurrency);
    }

    /**
     * add additional priceCurrency query parameter
     */
    public ByProjectKeyProductProjectionsGet addPriceCurrency(final String priceCurrency) {
        return copy().addQueryParam("priceCurrency", priceCurrency);
    }

    /**
     * set priceCountry with the specificied value
     */
    public ByProjectKeyProductProjectionsGet withPriceCountry(final String priceCountry) {
        return copy().withQueryParam("priceCountry", priceCountry);
    }

    /**
     * add additional priceCountry query parameter
     */
    public ByProjectKeyProductProjectionsGet addPriceCountry(final String priceCountry) {
        return copy().addQueryParam("priceCountry", priceCountry);
    }

    /**
     * set priceCustomerGroup with the specificied value
     */
    public ByProjectKeyProductProjectionsGet withPriceCustomerGroup(final String priceCustomerGroup) {
        return copy().withQueryParam("priceCustomerGroup", priceCustomerGroup);
    }

    /**
     * add additional priceCustomerGroup query parameter
     */
    public ByProjectKeyProductProjectionsGet addPriceCustomerGroup(final String priceCustomerGroup) {
        return copy().addQueryParam("priceCustomerGroup", priceCustomerGroup);
    }

    /**
     * set priceChannel with the specificied value
     */
    public ByProjectKeyProductProjectionsGet withPriceChannel(final String priceChannel) {
        return copy().withQueryParam("priceChannel", priceChannel);
    }

    /**
     * add additional priceChannel query parameter
     */
    public ByProjectKeyProductProjectionsGet addPriceChannel(final String priceChannel) {
        return copy().addQueryParam("priceChannel", priceChannel);
    }

    /**
     * set localeProjection with the specificied value
     */
    public ByProjectKeyProductProjectionsGet withLocaleProjection(final String localeProjection) {
        return copy().withQueryParam("localeProjection", localeProjection);
    }

    /**
     * add additional localeProjection query parameter
     */
    public ByProjectKeyProductProjectionsGet addLocaleProjection(final String localeProjection) {
        return copy().addQueryParam("localeProjection", localeProjection);
    }

    /**
     * set storeProjection with the specificied value
     */
    public ByProjectKeyProductProjectionsGet withStoreProjection(final String storeProjection) {
        return copy().withQueryParam("storeProjection", storeProjection);
    }

    /**
     * add additional storeProjection query parameter
     */
    public ByProjectKeyProductProjectionsGet addStoreProjection(final String storeProjection) {
        return copy().addQueryParam("storeProjection", storeProjection);
    }

    /**
     * set expand with the specificied value
     */
    public ByProjectKeyProductProjectionsGet withExpand(final String expand) {
        return copy().withQueryParam("expand", expand);
    }

    /**
     * add additional expand query parameter
     */
    public ByProjectKeyProductProjectionsGet addExpand(final String expand) {
        return copy().addQueryParam("expand", expand);
    }

    /**
     * set sort with the specificied value
     */
    public ByProjectKeyProductProjectionsGet withSort(final String sort) {
        return copy().withQueryParam("sort", sort);
    }

    /**
     * add additional sort query parameter
     */
    public ByProjectKeyProductProjectionsGet addSort(final String sort) {
        return copy().addQueryParam("sort", sort);
    }

    /**
     * set limit with the specificied value
     */
    public ByProjectKeyProductProjectionsGet withLimit(final int limit) {
        return copy().withQueryParam("limit", limit);
    }

    /**
     * add additional limit query parameter
     */
    public ByProjectKeyProductProjectionsGet addLimit(final int limit) {
        return copy().addQueryParam("limit", limit);
    }

    /**
     * set offset with the specificied value
     */
    public ByProjectKeyProductProjectionsGet withOffset(final int offset) {
        return copy().withQueryParam("offset", offset);
    }

    /**
     * add additional offset query parameter
     */
    public ByProjectKeyProductProjectionsGet addOffset(final int offset) {
        return copy().addQueryParam("offset", offset);
    }

    /**
     * set withTotal with the specificied value
     */
    public ByProjectKeyProductProjectionsGet withWithTotal(final boolean withTotal) {
        return copy().withQueryParam("withTotal", withTotal);
    }

    /**
     * add additional withTotal query parameter
     */
    public ByProjectKeyProductProjectionsGet addWithTotal(final boolean withTotal) {
        return copy().addQueryParam("withTotal", withTotal);
    }

    /**
     * set where with the specificied value
     */
    public ByProjectKeyProductProjectionsGet withWhere(final String where) {
        return copy().withQueryParam("where", where);
    }

    /**
     * add additional where query parameter
     */
    public ByProjectKeyProductProjectionsGet addWhere(final String where) {
        return copy().addQueryParam("where", where);
    }

    /**
     * set predicateVar with the specificied value
     */
    public ByProjectKeyProductProjectionsGet withPredicateVar(final String varName, final String predicateVar) {
        return copy().withQueryParam(String.format("var.%s", varName), predicateVar);
    }

    /**
     * add additional predicateVar query parameter
     */
    public ByProjectKeyProductProjectionsGet addPredicateVar(final String varName, final String predicateVar) {
        return copy().addQueryParam(String.format("var.%s", varName), predicateVar);
    }

    @Override
    protected ByProjectKeyProductProjectionsGet copy() {
        return new ByProjectKeyProductProjectionsGet(this);
    }
}
