package com.commercetools.api.client;

import io.vrap.rmf.base.client.utils.Utils;
import io.vrap.rmf.base.client.utils.json.VrapJsonUtils;

import java.io.InputStream;
import java.io.IOException;

import java.nio.file.Files;

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
*  <p>Uploads a binary image file to a given product variant. The supported image formats are JPEG, PNG and GIF.</p>
*/
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public class ByProjectKeyProductsByIDImagesPost extends ApiMethod<ByProjectKeyProductsByIDImagesPost> {

    
    private String projectKey;
    private String ID;
    
    private java.io.File file;

    public ByProjectKeyProductsByIDImagesPost(final ApiHttpClient apiHttpClient, String projectKey, String ID, java.io.File file) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.ID = ID;
        this.file = file;
    }

    public ByProjectKeyProductsByIDImagesPost(ByProjectKeyProductsByIDImagesPost t) {
        super(t);
        this.projectKey = t.projectKey;
        this.ID = t.ID;
        this.file = t.file;
    }

    public ApiHttpRequest createHttpRequest() {
        ApiHttpRequest httpRequest = new ApiHttpRequest();
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("/%s/products/%s/images", this.projectKey, this.ID);
        if(!params.isEmpty()){
            httpRequestPath += "?" + String.join("&", params);
        }
        httpRequest.setUri(httpRequestPath); 
        httpRequest.setMethod(ApiHttpMethod.POST);
        httpRequest.setHeaders(getHeaders());
        try{httpRequest.setBody(Files.readAllBytes(file.toPath()));}catch(Exception e){e.printStackTrace();}
        return httpRequest;
    }

    public ApiHttpResponse<com.commercetools.api.models.product.Product> executeBlocking(){
        try {
            return execute().get();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public CompletableFuture<ApiHttpResponse<com.commercetools.api.models.product.Product>> execute(){
        return apiHttpClient().execute(this.createHttpRequest())
                .thenApply(response -> {
                    if(response.getStatusCode() >= 400){
                        throw new ApiHttpException(response.getStatusCode(), new String(response.getBody()), response.getHeaders());
                    }
                    return Utils.convertResponse(response,com.commercetools.api.models.product.Product.class);
                });
    }

    public String getProjectKey() {return this.projectKey;}
    public String getID() {return this.ID;}

    public List<String> getFilename() {
        return this.getQueryParam("filename");
    }
    
    public List<String> getVariant() {
        return this.getQueryParam("variant");
    }
    
    public List<String> getSku() {
        return this.getQueryParam("sku");
    }
    
    public List<String> getStaged() {
        return this.getQueryParam("staged");
    }

    public void setProjectKey(final String projectKey) { this.projectKey = projectKey; }
    
    public void setID(final String ID) { this.ID = ID; }

    public ByProjectKeyProductsByIDImagesPost withFilename(final String filename){
        return new ByProjectKeyProductsByIDImagesPost(this).addQueryParam("filename", filename);
    }
    
    public ByProjectKeyProductsByIDImagesPost withVariant(final Double variant){
        return new ByProjectKeyProductsByIDImagesPost(this).addQueryParam("variant", variant);
    }
    
    public ByProjectKeyProductsByIDImagesPost withSku(final String sku){
        return new ByProjectKeyProductsByIDImagesPost(this).addQueryParam("sku", sku);
    }
    
    public ByProjectKeyProductsByIDImagesPost withStaged(final Boolean staged){
        return new ByProjectKeyProductsByIDImagesPost(this).addQueryParam("staged", staged);
    }
}
