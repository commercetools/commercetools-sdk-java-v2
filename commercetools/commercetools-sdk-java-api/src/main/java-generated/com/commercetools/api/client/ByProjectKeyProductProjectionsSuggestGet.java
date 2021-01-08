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

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public class ByProjectKeyProductProjectionsSuggestGet extends ApiMethod<ByProjectKeyProductProjectionsSuggestGet, com.fasterxml.jackson.databind.JsonNode> implements com.commercetools.api.client.SortableTrait<ByProjectKeyProductProjectionsSuggestGet>, com.commercetools.api.client.PagingTrait<ByProjectKeyProductProjectionsSuggestGet>, com.commercetools.api.client.ErrorableTrait<ByProjectKeyProductProjectionsSuggestGet>, com.commercetools.api.client.DeprecatableTrait<ByProjectKeyProductProjectionsSuggestGet> {

    
    private String projectKey;
    

    public ByProjectKeyProductProjectionsSuggestGet(final ApiHttpClient apiHttpClient, String projectKey) {
        super(apiHttpClient);
        this.projectKey = projectKey;
    }

    public ByProjectKeyProductProjectionsSuggestGet(ByProjectKeyProductProjectionsSuggestGet t) {
        super(t);
        this.projectKey = t.projectKey;
    }

    @Override
    public ApiHttpRequest createHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("/%s/product-projections/suggest", this.projectKey);
        if(!params.isEmpty()){
            httpRequestPath += "?" + String.join("&", params);
        }
        
        return new ApiHttpRequest(ApiHttpMethod.GET, URI.create(httpRequestPath), getHeaders(), null);
    }

    @Override
    public ApiHttpResponse<com.fasterxml.jackson.databind.JsonNode> executeBlocking(Duration timeout){
        return blockingWait(execute(), timeout);
    }

    @Override
    public CompletableFuture<ApiHttpResponse<com.fasterxml.jackson.databind.JsonNode>> execute(){
        return apiHttpClient().execute(this.createHttpRequest(), com.fasterxml.jackson.databind.JsonNode.class);
    }

    public String getProjectKey() {return this.projectKey;}

    public List<String> getFuzzy() {
        return this.getQueryParam("fuzzy");
    }
    
    public List<String> getStaged() {
        return this.getQueryParam("staged");
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

    public void setProjectKey(final String projectKey) { this.projectKey = projectKey; }

    public ByProjectKeyProductProjectionsSuggestGet withFuzzy(final Boolean fuzzy){
        return copy().addQueryParam("fuzzy", fuzzy);
    }
    
    public ByProjectKeyProductProjectionsSuggestGet withStaged(final Boolean staged){
        return copy().addQueryParam("staged", staged);
    }
    
    public ByProjectKeyProductProjectionsSuggestGet withSort(final String sort){
        return copy().addQueryParam("sort", sort);
    }
    
    public ByProjectKeyProductProjectionsSuggestGet withLimit(final Integer limit){
        return copy().addQueryParam("limit", limit);
    }
    
    public ByProjectKeyProductProjectionsSuggestGet withOffset(final Integer offset){
        return copy().addQueryParam("offset", offset);
    }
    
    public ByProjectKeyProductProjectionsSuggestGet withWithTotal(final Boolean withTotal){
        return copy().addQueryParam("withTotal", withTotal);
    }

    public ByProjectKeyProductProjectionsSuggestGet withSearchKeywords(final String locale, final String searchKeywords){
        return copy().addQueryParam(String.format("searchKeywords.%s", locale), searchKeywords);
    }
    
    @Override
    protected ByProjectKeyProductProjectionsSuggestGet copy()
    {
        return new ByProjectKeyProductProjectionsSuggestGet(this);
    }
}
