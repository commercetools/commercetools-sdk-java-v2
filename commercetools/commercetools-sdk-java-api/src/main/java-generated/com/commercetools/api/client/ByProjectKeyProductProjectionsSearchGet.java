package com.commercetools.api.client;

import io.vrap.rmf.base.client.utils.Utils;
import io.vrap.rmf.base.client.utils.json.VrapJsonUtils;

import java.io.InputStream;
import java.io.IOException;

import java.net.URI;
import java.nio.file.Files;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.stream.Collectors;
import java.util.concurrent.CompletableFuture;
import io.vrap.rmf.base.client.utils.Generated;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import io.vrap.rmf.base.client.*;


import static io.vrap.rmf.base.client.utils.ClientUtils.blockingWait;

/**
*  <p>Search Product Projection</p>
*/
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public class ByProjectKeyProductProjectionsSearchGet extends ApiMethod<ByProjectKeyProductProjectionsSearchGet, com.commercetools.api.models.product.ProductProjectionPagedSearchResponse> {

    
    private String projectKey;
    

    public ByProjectKeyProductProjectionsSearchGet(final ApiHttpClient apiHttpClient, String projectKey) {
        super(apiHttpClient);
        this.projectKey = projectKey;
    }

    public ByProjectKeyProductProjectionsSearchGet(ByProjectKeyProductProjectionsSearchGet t) {
        super(t);
        this.projectKey = t.projectKey;
    }

    @Override
    public ApiHttpRequest createHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("/%s/product-projections/search", this.projectKey);
        if(!params.isEmpty()){
            httpRequestPath += "?" + String.join("&", params);
        }
        
        return new ApiHttpRequest(ApiHttpMethod.GET, URI.create(httpRequestPath), getHeaders(), null);
    }

    @Override
    public ApiHttpResponse<com.commercetools.api.models.product.ProductProjectionPagedSearchResponse> executeBlocking(){
        return executeBlocking(Duration.ofSeconds(60));
    }
    
    @Override
    public ApiHttpResponse<com.commercetools.api.models.product.ProductProjectionPagedSearchResponse> executeBlocking(Duration timeout){
        return blockingWait(execute(), timeout);
    }

    @Override
    public CompletableFuture<ApiHttpResponse<com.commercetools.api.models.product.ProductProjectionPagedSearchResponse>> execute(){
        return apiHttpClient().execute(this.createHttpRequest(), com.commercetools.api.models.product.ProductProjectionPagedSearchResponse.class);
    }

    public String getProjectKey() {return this.projectKey;}

    public List<String> getFuzzy() {
        return this.getQueryParam("fuzzy");
    }
    
    public List<String> getFuzzyLevel() {
        return this.getQueryParam("fuzzyLevel");
    }
    
    public List<String> getMarkMatchingVariants() {
        return this.getQueryParam("markMatchingVariants");
    }
    
    public List<String> getStaged() {
        return this.getQueryParam("staged");
    }
    
    public List<String> getFilter() {
        return this.getQueryParam("filter");
    }
    
    public List<String> getFilterFacets() {
        return this.getQueryParam("filterFacets");
    }
    
    public List<String> getFilterQuery() {
        return this.getQueryParam("filterQuery");
    }
    
    public List<String> getFacet() {
        return this.getQueryParam("facet");
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

    public void setProjectKey(final String projectKey) { this.projectKey = projectKey; }

    public ByProjectKeyProductProjectionsSearchGet withFuzzy(final Boolean fuzzy){
        return copy().addQueryParam("fuzzy", fuzzy);
    }
    
    public ByProjectKeyProductProjectionsSearchGet withFuzzyLevel(final Double fuzzyLevel){
        return copy().addQueryParam("fuzzyLevel", fuzzyLevel);
    }
    
    public ByProjectKeyProductProjectionsSearchGet withMarkMatchingVariants(final Boolean markMatchingVariants){
        return copy().addQueryParam("markMatchingVariants", markMatchingVariants);
    }
    
    public ByProjectKeyProductProjectionsSearchGet withStaged(final Boolean staged){
        return copy().addQueryParam("staged", staged);
    }
    
    public ByProjectKeyProductProjectionsSearchGet withFilter(final String filter){
        return copy().addQueryParam("filter", filter);
    }
    
    public ByProjectKeyProductProjectionsSearchGet withFilterFacets(final String filterFacets){
        return copy().addQueryParam("filterFacets", filterFacets);
    }
    
    public ByProjectKeyProductProjectionsSearchGet withFilterQuery(final String filterQuery){
        return copy().addQueryParam("filterQuery", filterQuery);
    }
    
    public ByProjectKeyProductProjectionsSearchGet withFacet(final String facet){
        return copy().addQueryParam("facet", facet);
    }
    
    public ByProjectKeyProductProjectionsSearchGet withSort(final String sort){
        return copy().addQueryParam("sort", sort);
    }
    
    public ByProjectKeyProductProjectionsSearchGet withLimit(final Integer limit){
        return copy().addQueryParam("limit", limit);
    }
    
    public ByProjectKeyProductProjectionsSearchGet withOffset(final Integer offset){
        return copy().addQueryParam("offset", offset);
    }
    
    public ByProjectKeyProductProjectionsSearchGet withWithTotal(final Boolean withTotal){
        return copy().addQueryParam("withTotal", withTotal);
    }
    
    public ByProjectKeyProductProjectionsSearchGet withPriceCurrency(final String priceCurrency){
        return copy().addQueryParam("priceCurrency", priceCurrency);
    }
    
    public ByProjectKeyProductProjectionsSearchGet withPriceCountry(final String priceCountry){
        return copy().addQueryParam("priceCountry", priceCountry);
    }
    
    public ByProjectKeyProductProjectionsSearchGet withPriceCustomerGroup(final String priceCustomerGroup){
        return copy().addQueryParam("priceCustomerGroup", priceCustomerGroup);
    }
    
    public ByProjectKeyProductProjectionsSearchGet withPriceChannel(final String priceChannel){
        return copy().addQueryParam("priceChannel", priceChannel);
    }
    
    public ByProjectKeyProductProjectionsSearchGet withLocaleProjection(final String localeProjection){
        return copy().addQueryParam("localeProjection", localeProjection);
    }
    
    public ByProjectKeyProductProjectionsSearchGet withStoreProjection(final String storeProjection){
        return copy().addQueryParam("storeProjection", storeProjection);
    }
    
    public ByProjectKeyProductProjectionsSearchGet withExpand(final String expand){
        return copy().addQueryParam("expand", expand);
    }
    
    @Override
    protected ByProjectKeyProductProjectionsSearchGet copy()
    {
        return new ByProjectKeyProductProjectionsSearchGet(this);
    }
}
