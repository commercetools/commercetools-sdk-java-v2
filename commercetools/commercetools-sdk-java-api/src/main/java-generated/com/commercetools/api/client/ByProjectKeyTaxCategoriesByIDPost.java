package com.commercetools.api.client;

import io.vrap.rmf.base.client.utils.Utils;

import java.io.InputStream;
import java.io.IOException;

import java.net.URI;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.stream.Collectors;
import java.util.concurrent.CompletableFuture;
import io.vrap.rmf.base.client.utils.Generated;

import javax.annotation.Nullable;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import io.vrap.rmf.base.client.*;


import static io.vrap.rmf.base.client.utils.ClientUtils.blockingWait;

/**
*  <p>Update TaxCategory by ID</p>
*/
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public class ByProjectKeyTaxCategoriesByIDPost extends ApiMethod<ByProjectKeyTaxCategoriesByIDPost, com.commercetools.api.models.tax_category.TaxCategory> implements com.commercetools.api.client.ConflictingTrait<ByProjectKeyTaxCategoriesByIDPost>, com.commercetools.api.client.ExpandableTrait<ByProjectKeyTaxCategoriesByIDPost>, com.commercetools.api.client.ErrorableTrait<ByProjectKeyTaxCategoriesByIDPost>, com.commercetools.api.client.DeprecatableTrait<ByProjectKeyTaxCategoriesByIDPost> {

    
    private String projectKey;
    private String ID;
    
    private com.commercetools.api.models.tax_category.TaxCategoryUpdate taxCategoryUpdate;

    public ByProjectKeyTaxCategoriesByIDPost(final ApiHttpClient apiHttpClient, String projectKey, String ID, com.commercetools.api.models.tax_category.TaxCategoryUpdate taxCategoryUpdate) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.ID = ID;
        this.taxCategoryUpdate = taxCategoryUpdate;
    }

    public ByProjectKeyTaxCategoriesByIDPost(ByProjectKeyTaxCategoriesByIDPost t) {
        super(t);
        this.projectKey = t.projectKey;
        this.ID = t.ID;
        this.taxCategoryUpdate = t.taxCategoryUpdate;
    }

    @Override
    public ApiHttpRequest createHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("/%s/tax-categories/%s", this.projectKey, this.ID);
        if(!params.isEmpty()){
            httpRequestPath += "?" + String.join("&", params);
        }
        try {
        final byte[] body = apiHttpClient().getSerializerService().toJsonByteArray(taxCategoryUpdate);
        return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(), body);
    } catch(Exception e) {
        e.printStackTrace();
    }
    
        return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(), null);
    }

    @Override
    public ApiHttpResponse<com.commercetools.api.models.tax_category.TaxCategory> executeBlocking(final ApiHttpClient client, Duration timeout){
        return blockingWait(execute(client), timeout);
    }

    @Override
    public CompletableFuture<ApiHttpResponse<com.commercetools.api.models.tax_category.TaxCategory>> execute(final ApiHttpClient client){
        return client.execute(this.createHttpRequest(), com.commercetools.api.models.tax_category.TaxCategory.class);
    }

    public String getProjectKey() {return this.projectKey;}
    public String getID() {return this.ID;}

    public List<String> getExpand() {
        return this.getQueryParam("expand");
    }

    public void setProjectKey(final String projectKey) { this.projectKey = projectKey; }
    
    public void setID(final String ID) { this.ID = ID; }

    public ByProjectKeyTaxCategoriesByIDPost withExpand(final String expand){
        return copy().withQueryParam("expand", expand);
    }
    
    public ByProjectKeyTaxCategoriesByIDPost addExpand(final String expand){
        return copy().addQueryParam("expand", expand);
    }

    

    @Override
    protected ByProjectKeyTaxCategoriesByIDPost copy()
    {
        return new ByProjectKeyTaxCategoriesByIDPost(this);
    }
}
