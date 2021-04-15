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
*  <p>Delete Order by orderNumber</p>
*/
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public class ByProjectKeyOrdersOrderNumberByOrderNumberDelete extends ApiMethod<ByProjectKeyOrdersOrderNumberByOrderNumberDelete, com.commercetools.api.models.order.Order> implements com.commercetools.api.client.DataerasureTrait<ByProjectKeyOrdersOrderNumberByOrderNumberDelete>, com.commercetools.api.client.VersionedTrait<ByProjectKeyOrdersOrderNumberByOrderNumberDelete>, com.commercetools.api.client.ConflictingTrait<ByProjectKeyOrdersOrderNumberByOrderNumberDelete>, com.commercetools.api.client.ExpandableTrait<ByProjectKeyOrdersOrderNumberByOrderNumberDelete>, com.commercetools.api.client.ErrorableTrait<ByProjectKeyOrdersOrderNumberByOrderNumberDelete>, com.commercetools.api.client.DeprecatableTrait<ByProjectKeyOrdersOrderNumberByOrderNumberDelete> {

    
    private String projectKey;
    private String orderNumber;
    

    public ByProjectKeyOrdersOrderNumberByOrderNumberDelete(final ApiHttpClient apiHttpClient, String projectKey, String orderNumber) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.orderNumber = orderNumber;
    }

    public ByProjectKeyOrdersOrderNumberByOrderNumberDelete(ByProjectKeyOrdersOrderNumberByOrderNumberDelete t) {
        super(t);
        this.projectKey = t.projectKey;
        this.orderNumber = t.orderNumber;
    }

    @Override
    public ApiHttpRequest createHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("/%s/orders/order-number=%s", this.projectKey, this.orderNumber);
        if(!params.isEmpty()){
            httpRequestPath += "?" + String.join("&", params);
        }
        
        return new ApiHttpRequest(ApiHttpMethod.DELETE, URI.create(httpRequestPath), getHeaders(), null);
    }

    @Override
    public ApiHttpResponse<com.commercetools.api.models.order.Order> executeBlocking(final ApiHttpClient client, Duration timeout){
        return blockingWait(execute(client), timeout);
    }

    @Override
    public CompletableFuture<ApiHttpResponse<com.commercetools.api.models.order.Order>> execute(final ApiHttpClient client){
        return client.execute(this.createHttpRequest(), com.commercetools.api.models.order.Order.class);
    }

    public String getProjectKey() {return this.projectKey;}
    public String getOrderNumber() {return this.orderNumber;}

    public List<String> getDataErasure() {
        return this.getQueryParam("dataErasure");
    }
    
    public List<String> getVersion() {
        return this.getQueryParam("version");
    }
    
    public List<String> getExpand() {
        return this.getQueryParam("expand");
    }

    public void setProjectKey(final String projectKey) { this.projectKey = projectKey; }
    
    public void setOrderNumber(final String orderNumber) { this.orderNumber = orderNumber; }

    public ByProjectKeyOrdersOrderNumberByOrderNumberDelete withDataErasure(final boolean dataErasure){
        return copy().withQueryParam("dataErasure", dataErasure);
    }
    
    public ByProjectKeyOrdersOrderNumberByOrderNumberDelete addDataErasure(final boolean dataErasure){
        return copy().addQueryParam("dataErasure", dataErasure);
    }
    
    public ByProjectKeyOrdersOrderNumberByOrderNumberDelete withVersion(final long version){
        return copy().withQueryParam("version", version);
    }
    
    public ByProjectKeyOrdersOrderNumberByOrderNumberDelete addVersion(final long version){
        return copy().addQueryParam("version", version);
    }
    
    public ByProjectKeyOrdersOrderNumberByOrderNumberDelete withExpand(final String expand){
        return copy().withQueryParam("expand", expand);
    }
    
    public ByProjectKeyOrdersOrderNumberByOrderNumberDelete addExpand(final String expand){
        return copy().addQueryParam("expand", expand);
    }

    

    @Override
    protected ByProjectKeyOrdersOrderNumberByOrderNumberDelete copy()
    {
        return new ByProjectKeyOrdersOrderNumberByOrderNumberDelete(this);
    }
}
