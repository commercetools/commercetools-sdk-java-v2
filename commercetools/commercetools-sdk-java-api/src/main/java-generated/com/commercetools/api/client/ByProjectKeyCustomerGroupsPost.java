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
*  <p>Create CustomerGroup</p>
*/
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public class ByProjectKeyCustomerGroupsPost extends ApiMethod<ByProjectKeyCustomerGroupsPost, com.commercetools.api.models.customer_group.CustomerGroup> implements com.commercetools.api.client.ExpandableTrait<ByProjectKeyCustomerGroupsPost>, com.commercetools.api.client.ErrorableTrait<ByProjectKeyCustomerGroupsPost>, com.commercetools.api.client.DeprecatableTrait<ByProjectKeyCustomerGroupsPost> {

    
    private String projectKey;
    
    private com.commercetools.api.models.customer_group.CustomerGroupDraft customerGroupDraft;

    public ByProjectKeyCustomerGroupsPost(final ApiHttpClient apiHttpClient, String projectKey, com.commercetools.api.models.customer_group.CustomerGroupDraft customerGroupDraft) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.customerGroupDraft = customerGroupDraft;
    }

    public ByProjectKeyCustomerGroupsPost(ByProjectKeyCustomerGroupsPost t) {
        super(t);
        this.projectKey = t.projectKey;
        this.customerGroupDraft = t.customerGroupDraft;
    }

    @Override
    public ApiHttpRequest createHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("/%s/customer-groups", this.projectKey);
        if(!params.isEmpty()){
            httpRequestPath += "?" + String.join("&", params);
        }
        try {
        final byte[] body = apiHttpClient().getSerializerService().toJsonByteArray(customerGroupDraft);
        return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(), body);
    } catch(Exception e) {
        e.printStackTrace();
    }
    
        return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(), null);
    }

    @Override
    public ApiHttpResponse<com.commercetools.api.models.customer_group.CustomerGroup> executeBlocking(final ApiHttpClient client, Duration timeout){
        return blockingWait(execute(client), timeout);
    }

    @Override
    public CompletableFuture<ApiHttpResponse<com.commercetools.api.models.customer_group.CustomerGroup>> execute(final ApiHttpClient client){
        return client.execute(this.createHttpRequest(), com.commercetools.api.models.customer_group.CustomerGroup.class);
    }

    public String getProjectKey() {return this.projectKey;}

    public List<String> getExpand() {
        return this.getQueryParam("expand");
    }

    public void setProjectKey(final String projectKey) { this.projectKey = projectKey; }

    public ByProjectKeyCustomerGroupsPost withExpand(final String expand){
        return copy().withQueryParam("expand", expand);
    }
    
    public ByProjectKeyCustomerGroupsPost addExpand(final String expand){
        return copy().addQueryParam("expand", expand);
    }

    

    @Override
    protected ByProjectKeyCustomerGroupsPost copy()
    {
        return new ByProjectKeyCustomerGroupsPost(this);
    }
}
