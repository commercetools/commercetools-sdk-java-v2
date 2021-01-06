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
*  <p>Update Category by ID</p>
*/
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public class ByProjectKeyCategoriesByIDPost extends ApiMethod<ByProjectKeyCategoriesByIDPost, com.commercetools.api.models.category.Category> implements com.commercetools.api.client.ConflictingTrait<ByProjectKeyCategoriesByIDPost>, com.commercetools.api.client.ExpandableTrait<ByProjectKeyCategoriesByIDPost>, com.commercetools.api.client.ErrorableTrait<ByProjectKeyCategoriesByIDPost>, com.commercetools.api.client.DeprecatableTrait<ByProjectKeyCategoriesByIDPost> {

    
    private String projectKey;
    private String ID;
    
    private com.commercetools.api.models.category.CategoryUpdate categoryUpdate;

    public ByProjectKeyCategoriesByIDPost(final ApiHttpClient apiHttpClient, String projectKey, String ID, com.commercetools.api.models.category.CategoryUpdate categoryUpdate) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.ID = ID;
        this.categoryUpdate = categoryUpdate;
    }

    public ByProjectKeyCategoriesByIDPost(ByProjectKeyCategoriesByIDPost t) {
        super(t);
        this.projectKey = t.projectKey;
        this.ID = t.ID;
        this.categoryUpdate = t.categoryUpdate;
    }

    @Override
    public ApiHttpRequest createHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("/%s/categories/%s", this.projectKey, this.ID);
        if(!params.isEmpty()){
            httpRequestPath += "?" + String.join("&", params);
        }
        try {
        final byte[] body = apiHttpClient().getSerializerService().toJsonByteArray(categoryUpdate);
        return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(), body);
    } catch(Exception e) {
        e.printStackTrace();
    }
    
        return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(), null);
    }

    @Override
    public ApiHttpResponse<com.commercetools.api.models.category.Category> executeBlocking(Duration timeout){
        return blockingWait(execute(), timeout);
    }

    @Override
    public CompletableFuture<ApiHttpResponse<com.commercetools.api.models.category.Category>> execute(){
        return apiHttpClient().execute(this.createHttpRequest(), com.commercetools.api.models.category.Category.class);
    }

    public String getProjectKey() {return this.projectKey;}
    public String getID() {return this.ID;}

    public List<String> getExpand() {
        return this.getQueryParam("expand");
    }

    public void setProjectKey(final String projectKey) { this.projectKey = projectKey; }
    
    public void setID(final String ID) { this.ID = ID; }

    public ByProjectKeyCategoriesByIDPost withExpand(final String expand){
        return copy().addQueryParam("expand", expand);
    }
    
    @Override
    protected ByProjectKeyCategoriesByIDPost copy()
    {
        return new ByProjectKeyCategoriesByIDPost(this);
    }
}
