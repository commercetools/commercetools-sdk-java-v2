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
*  <p>Update Order by orderNumber</p>
*/
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public class ByProjectKeyOrdersOrderNumberByOrderNumberPost extends ApiMethod<ByProjectKeyOrdersOrderNumberByOrderNumberPost, com.commercetools.api.models.order.Order> implements com.commercetools.api.client.ConflictingTrait<ByProjectKeyOrdersOrderNumberByOrderNumberPost>, com.commercetools.api.client.ExpandableTrait<ByProjectKeyOrdersOrderNumberByOrderNumberPost>, com.commercetools.api.client.ErrorableTrait<ByProjectKeyOrdersOrderNumberByOrderNumberPost>, com.commercetools.api.client.DeprecatableTrait<ByProjectKeyOrdersOrderNumberByOrderNumberPost> {

    
    private String projectKey;
    private String orderNumber;
    
    private com.commercetools.api.models.common.Update update;

    public ByProjectKeyOrdersOrderNumberByOrderNumberPost(final ApiHttpClient apiHttpClient, String projectKey, String orderNumber, com.commercetools.api.models.common.Update update) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.orderNumber = orderNumber;
        this.update = update;
    }

    public ByProjectKeyOrdersOrderNumberByOrderNumberPost(ByProjectKeyOrdersOrderNumberByOrderNumberPost t) {
        super(t);
        this.projectKey = t.projectKey;
        this.orderNumber = t.orderNumber;
        this.update = t.update;
    }

    @Override
    public ApiHttpRequest createHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("/%s/orders/order-number=%s", this.projectKey, this.orderNumber);
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
    public ApiHttpResponse<com.commercetools.api.models.order.Order> executeBlocking(Duration timeout){
        return blockingWait(execute(), timeout);
    }

    @Override
    public CompletableFuture<ApiHttpResponse<com.commercetools.api.models.order.Order>> execute(){
        return apiHttpClient().execute(this.createHttpRequest(), com.commercetools.api.models.order.Order.class);
    }

    public String getProjectKey() {return this.projectKey;}
    public String getOrderNumber() {return this.orderNumber;}

    public List<String> getExpand() {
        return this.getQueryParam("expand");
    }

    public void setProjectKey(final String projectKey) { this.projectKey = projectKey; }
    
    public void setOrderNumber(final String orderNumber) { this.orderNumber = orderNumber; }

    public ByProjectKeyOrdersOrderNumberByOrderNumberPost withExpand(final String expand){
        return copy().withQueryParam("expand", expand);
    }
    
    public ByProjectKeyOrdersOrderNumberByOrderNumberPost addExpand(final String expand){
        return copy().addQueryParam("expand", expand);
    }

    

    @Override
    protected ByProjectKeyOrdersOrderNumberByOrderNumberPost copy()
    {
        return new ByProjectKeyOrdersOrderNumberByOrderNumberPost(this);
    }
}
