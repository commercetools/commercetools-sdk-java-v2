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
*  <p>Updates a customer in the store specified by {storeKey}. The {storeKey} path parameter maps to a Store's key.
*  If the customer exists in the commercetools project but the stores field references a different store,
*  this method returns a ResourceNotFound error.</p>
*/
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public class ByProjectKeyInStoreKeyByStoreKeyCustomersByIDPost extends ApiMethod<ByProjectKeyInStoreKeyByStoreKeyCustomersByIDPost, com.commercetools.api.models.customer.Customer> implements com.commercetools.api.client.ConflictingTrait<ByProjectKeyInStoreKeyByStoreKeyCustomersByIDPost>, com.commercetools.api.client.ExpandableTrait<ByProjectKeyInStoreKeyByStoreKeyCustomersByIDPost>, com.commercetools.api.client.ErrorableTrait<ByProjectKeyInStoreKeyByStoreKeyCustomersByIDPost>, com.commercetools.api.client.DeprecatableTrait<ByProjectKeyInStoreKeyByStoreKeyCustomersByIDPost> {

    
    private String projectKey;
    private String storeKey;
    private String ID;
    
    private com.commercetools.api.models.common.Update update;

    public ByProjectKeyInStoreKeyByStoreKeyCustomersByIDPost(final ApiHttpClient apiHttpClient, String projectKey, String storeKey, String ID, com.commercetools.api.models.common.Update update) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.storeKey = storeKey;
        this.ID = ID;
        this.update = update;
    }

    public ByProjectKeyInStoreKeyByStoreKeyCustomersByIDPost(ByProjectKeyInStoreKeyByStoreKeyCustomersByIDPost t) {
        super(t);
        this.projectKey = t.projectKey;
        this.storeKey = t.storeKey;
        this.ID = t.ID;
        this.update = t.update;
    }

    @Override
    public ApiHttpRequest createHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("/%s/in-store/key=%s/customers/%s", this.projectKey, this.storeKey, this.ID);
        if(!params.isEmpty()){
            httpRequestPath += "?" + String.join("&", params);
        }
        try {
        final byte[] body = apiHttpClient().getSerializerService().toJsonByteArray(update);
        return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(), body);
    } catch(Exception e) {
        e.printStackTrace();
    }
    
        return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(), null);
    }

    @Override
    public ApiHttpResponse<com.commercetools.api.models.customer.Customer> executeBlocking(Duration timeout){
        return blockingWait(execute(), timeout);
    }

    @Override
    public CompletableFuture<ApiHttpResponse<com.commercetools.api.models.customer.Customer>> execute(){
        return apiHttpClient().execute(this.createHttpRequest(), com.commercetools.api.models.customer.Customer.class);
    }

    public String getProjectKey() {return this.projectKey;}
    public String getStoreKey() {return this.storeKey;}
    public String getID() {return this.ID;}

    public List<String> getExpand() {
        return this.getQueryParam("expand");
    }

    public void setProjectKey(final String projectKey) { this.projectKey = projectKey; }
    
    public void setStoreKey(final String storeKey) { this.storeKey = storeKey; }
    
    public void setID(final String ID) { this.ID = ID; }

    public ByProjectKeyInStoreKeyByStoreKeyCustomersByIDPost withExpand(final String expand){
        return copy().withQueryParam("expand", expand);
    }
    
    public ByProjectKeyInStoreKeyByStoreKeyCustomersByIDPost addExpand(final String expand){
        return copy().addQueryParam("expand", expand);
    }

    
    @Override
    protected ByProjectKeyInStoreKeyByStoreKeyCustomersByIDPost copy()
    {
        return new ByProjectKeyInStoreKeyByStoreKeyCustomersByIDPost(this);
    }
}
