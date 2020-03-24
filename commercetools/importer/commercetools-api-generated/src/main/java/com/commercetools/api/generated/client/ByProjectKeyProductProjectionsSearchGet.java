package com.commercetools.api.generated.client;

import io.vrap.rmf.base.client.utils.Utils;
import io.vrap.rmf.base.client.utils.json.VrapJsonUtils;

import java.io.InputStream;
import java.io.IOException;

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


/**
*  <p>Search Product Projection</p>
*/
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public class ByProjectKeyProductProjectionsSearchGet {
   
   
   private ApiHttpHeaders headers = new ApiHttpHeaders();
   private Map<String, String> additionalQueryParams = new HashMap<>();
   private final ApiHttpClient apiHttpClient; 
   private List<Boolean> fuzzy = new ArrayList<>();
   private List<Integer> fuzzyLevel = new ArrayList<>();
   private List<Boolean> staged = new ArrayList<>();
   private List<String> filter = new ArrayList<>();
   private List<String> filterFacets = new ArrayList<>();
   private List<String> filterQuery = new ArrayList<>();
   private List<String> facet = new ArrayList<>();
   private List<String> sort = new ArrayList<>();
   private List<Integer> limit = new ArrayList<>();
   private List<Integer> offset = new ArrayList<>();
   private List<Boolean> withTotal = new ArrayList<>();
   private List<String> priceCurrency = new ArrayList<>();
   private List<String> priceCountry = new ArrayList<>();
   private List<String> priceCustomerGroup = new ArrayList<>();
   private List<String> priceChannel = new ArrayList<>();
   private List<String> expand = new ArrayList<>();
   private String projectKey;
   
   
   public ByProjectKeyProductProjectionsSearchGet(final ApiHttpClient apiHttpClient, String projectKey){
      this.apiHttpClient = apiHttpClient;
      this.projectKey = projectKey;
   }
   
   public ApiHttpRequest createHttpRequest() {
      ApiHttpRequest httpRequest = new ApiHttpRequest();
      List<String> params = new ArrayList<>();
      params.add(this.fuzzy.stream().map(s -> "fuzzy=" + s).collect(Collectors.joining("&")));
      params.add(this.fuzzyLevel.stream().map(s -> "fuzzyLevel=" + s).collect(Collectors.joining("&")));
      params.add(this.staged.stream().map(s -> "staged=" + s).collect(Collectors.joining("&")));
      params.add(this.filter.stream().map(s -> "filter=" + urlEncode(s)).collect(Collectors.joining("&")));
      params.add(this.filterFacets.stream().map(s -> "filter.facets=" + urlEncode(s)).collect(Collectors.joining("&")));
      params.add(this.filterQuery.stream().map(s -> "filter.query=" + urlEncode(s)).collect(Collectors.joining("&")));
      params.add(this.facet.stream().map(s -> "facet=" + urlEncode(s)).collect(Collectors.joining("&")));
      params.add(this.sort.stream().map(s -> "sort=" + urlEncode(s)).collect(Collectors.joining("&")));
      params.add(this.limit.stream().map(s -> "limit=" + s).collect(Collectors.joining("&")));
      params.add(this.offset.stream().map(s -> "offset=" + s).collect(Collectors.joining("&")));
      params.add(this.withTotal.stream().map(s -> "withTotal=" + s).collect(Collectors.joining("&")));
      params.add(this.priceCurrency.stream().map(s -> "priceCurrency=" + urlEncode(s)).collect(Collectors.joining("&")));
      params.add(this.priceCountry.stream().map(s -> "priceCountry=" + urlEncode(s)).collect(Collectors.joining("&")));
      params.add(this.priceCustomerGroup.stream().map(s -> "priceCustomerGroup=" + urlEncode(s)).collect(Collectors.joining("&")));
      params.add(this.priceChannel.stream().map(s -> "priceChannel=" + urlEncode(s)).collect(Collectors.joining("&")));
      params.add(this.expand.stream().map(s -> "expand=" + urlEncode(s)).collect(Collectors.joining("&")));
      params.add(additionalQueryParams.entrySet().stream().map(entry -> entry.getKey() + "=" + entry.getValue()).collect(Collectors.joining("&")));
      params.removeIf(String::isEmpty);
      String httpRequestPath = String.format("/%s/product-projections/search", this.projectKey);
      if(!params.isEmpty()){
         httpRequestPath += "?" + String.join("&", params);
      }
      httpRequest.setRelativeUrl(httpRequestPath); 
      httpRequest.setMethod(ApiHttpMethod.GET);
      httpRequest.setHeaders(headers);
      
      return httpRequest;
   }
   
   public ApiHttpResponse<com.commercetools.api.generated.models.product.ProductProjectionPagedSearchResponse> executeBlocking(){
      try {
          return execute().get();
      } catch (Exception e) {
          throw new RuntimeException(e);
      }
   }
   
   public CompletableFuture<ApiHttpResponse<com.commercetools.api.generated.models.product.ProductProjectionPagedSearchResponse>> execute(){
      return apiHttpClient.execute(this.createHttpRequest())
              .thenApply(response -> {
                  if(response.getStatusCode() >= 400){
                      throw new ApiHttpException(response.getStatusCode(), new String(response.getBody()), response.getHeaders());
                  }
                  return Utils.convertResponse(response,com.commercetools.api.generated.models.product.ProductProjectionPagedSearchResponse.class);
              });
   }
   
   public String getProjectKey() {return this.projectKey;}
   
   public List<Boolean> getFuzzy() {
      return this.fuzzy;
   }
   
   public List<Integer> getFuzzyLevel() {
      return this.fuzzyLevel;
   }
   
   public List<Boolean> getStaged() {
      return this.staged;
   }
   
   public List<String> getFilter() {
      return this.filter;
   }
   
   public List<String> getFilterFacets() {
      return this.filterFacets;
   }
   
   public List<String> getFilterQuery() {
      return this.filterQuery;
   }
   
   public List<String> getFacet() {
      return this.facet;
   }
   
   public List<String> getSort() {
      return this.sort;
   }
   
   public List<Integer> getLimit() {
      return this.limit;
   }
   
   public List<Integer> getOffset() {
      return this.offset;
   }
   
   public List<Boolean> getWithTotal() {
      return this.withTotal;
   }
   
   public List<String> getPriceCurrency() {
      return this.priceCurrency;
   }
   
   public List<String> getPriceCountry() {
      return this.priceCountry;
   }
   
   public List<String> getPriceCustomerGroup() {
      return this.priceCustomerGroup;
   }
   
   public List<String> getPriceChannel() {
      return this.priceChannel;
   }
   
   public List<String> getExpand() {
      return this.expand;
   }
   
   public void setProjectKey(final String projectKey) {this.projectKey = projectKey;}
   
   public ByProjectKeyProductProjectionsSearchGet addFuzzy(final Boolean fuzzy){
      this.fuzzy.add(fuzzy);
      return this;
   }
   
   public ByProjectKeyProductProjectionsSearchGet withFuzzy(final List<Boolean> fuzzy){
      this.fuzzy = fuzzy;
      return this;
   }
   
   public ByProjectKeyProductProjectionsSearchGet addFuzzyLevel(final Integer fuzzyLevel){
      this.fuzzyLevel.add(fuzzyLevel);
      return this;
   }
   
   public ByProjectKeyProductProjectionsSearchGet withFuzzyLevel(final List<Integer> fuzzyLevel){
      this.fuzzyLevel = fuzzyLevel;
      return this;
   }
   
   public ByProjectKeyProductProjectionsSearchGet addStaged(final Boolean staged){
      this.staged.add(staged);
      return this;
   }
   
   public ByProjectKeyProductProjectionsSearchGet withStaged(final List<Boolean> staged){
      this.staged = staged;
      return this;
   }
   
   public ByProjectKeyProductProjectionsSearchGet addFilter(final String filter){
      this.filter.add(filter);
      return this;
   }
   
   public ByProjectKeyProductProjectionsSearchGet withFilter(final List<String> filter){
      this.filter = filter;
      return this;
   }
   
   public ByProjectKeyProductProjectionsSearchGet addFilterFacets(final String filterFacets){
      this.filterFacets.add(filterFacets);
      return this;
   }
   
   public ByProjectKeyProductProjectionsSearchGet withFilterFacets(final List<String> filterFacets){
      this.filterFacets = filterFacets;
      return this;
   }
   
   public ByProjectKeyProductProjectionsSearchGet addFilterQuery(final String filterQuery){
      this.filterQuery.add(filterQuery);
      return this;
   }
   
   public ByProjectKeyProductProjectionsSearchGet withFilterQuery(final List<String> filterQuery){
      this.filterQuery = filterQuery;
      return this;
   }
   
   public ByProjectKeyProductProjectionsSearchGet addFacet(final String facet){
      this.facet.add(facet);
      return this;
   }
   
   public ByProjectKeyProductProjectionsSearchGet withFacet(final List<String> facet){
      this.facet = facet;
      return this;
   }
   
   public ByProjectKeyProductProjectionsSearchGet addSort(final String sort){
      this.sort.add(sort);
      return this;
   }
   
   public ByProjectKeyProductProjectionsSearchGet withSort(final List<String> sort){
      this.sort = sort;
      return this;
   }
   
   public ByProjectKeyProductProjectionsSearchGet addLimit(final Integer limit){
      this.limit.add(limit);
      return this;
   }
   
   public ByProjectKeyProductProjectionsSearchGet withLimit(final List<Integer> limit){
      this.limit = limit;
      return this;
   }
   
   public ByProjectKeyProductProjectionsSearchGet addOffset(final Integer offset){
      this.offset.add(offset);
      return this;
   }
   
   public ByProjectKeyProductProjectionsSearchGet withOffset(final List<Integer> offset){
      this.offset = offset;
      return this;
   }
   
   public ByProjectKeyProductProjectionsSearchGet addWithTotal(final Boolean withTotal){
      this.withTotal.add(withTotal);
      return this;
   }
   
   public ByProjectKeyProductProjectionsSearchGet withWithTotal(final List<Boolean> withTotal){
      this.withTotal = withTotal;
      return this;
   }
   
   public ByProjectKeyProductProjectionsSearchGet addPriceCurrency(final String priceCurrency){
      this.priceCurrency.add(priceCurrency);
      return this;
   }
   
   public ByProjectKeyProductProjectionsSearchGet withPriceCurrency(final List<String> priceCurrency){
      this.priceCurrency = priceCurrency;
      return this;
   }
   
   public ByProjectKeyProductProjectionsSearchGet addPriceCountry(final String priceCountry){
      this.priceCountry.add(priceCountry);
      return this;
   }
   
   public ByProjectKeyProductProjectionsSearchGet withPriceCountry(final List<String> priceCountry){
      this.priceCountry = priceCountry;
      return this;
   }
   
   public ByProjectKeyProductProjectionsSearchGet addPriceCustomerGroup(final String priceCustomerGroup){
      this.priceCustomerGroup.add(priceCustomerGroup);
      return this;
   }
   
   public ByProjectKeyProductProjectionsSearchGet withPriceCustomerGroup(final List<String> priceCustomerGroup){
      this.priceCustomerGroup = priceCustomerGroup;
      return this;
   }
   
   public ByProjectKeyProductProjectionsSearchGet addPriceChannel(final String priceChannel){
      this.priceChannel.add(priceChannel);
      return this;
   }
   
   public ByProjectKeyProductProjectionsSearchGet withPriceChannel(final List<String> priceChannel){
      this.priceChannel = priceChannel;
      return this;
   }
   
   public ByProjectKeyProductProjectionsSearchGet addExpand(final String expand){
      this.expand.add(expand);
      return this;
   }
   
   public ByProjectKeyProductProjectionsSearchGet withExpand(final List<String> expand){
      this.expand = expand;
      return this;
   }
   
   public ByProjectKeyProductProjectionsSearchGet addHeader(final String key, final String value) {
      this.headers.addHeader(key, value);
      return this;
   }
   
   public ByProjectKeyProductProjectionsSearchGet withHeaders(final ApiHttpHeaders headers) {
      this.headers = headers;
      return this;
   }
   
   public String getHeaderValue(final String key) {
      return this.headers.getHeaderValue(key);
   }
   
   public ApiHttpHeaders getHeaders() {
      return this.headers;
   }
   
   public ByProjectKeyProductProjectionsSearchGet addAdditionalQueryParam(final String additionalQueryParamKey, final String additionalQueryParamValue) {
      this.additionalQueryParams.put(additionalQueryParamKey, additionalQueryParamValue);
      return this;
   }
   
   public ByProjectKeyProductProjectionsSearchGet setAdditionalQueryParams(final Map<String, String> additionalQueryParams) {
      this.additionalQueryParams = additionalQueryParams;
      return this;
   }
   
   public Map<String, String> getAdditionalQueryParams() {
      return this.additionalQueryParams;
   }
   
   private String urlEncode(final String s){
      try{
           return URLEncoder.encode(s, "UTF-8");
       }catch (UnsupportedEncodingException e) {
           //this will never happen
           return null;
       }
   }

}