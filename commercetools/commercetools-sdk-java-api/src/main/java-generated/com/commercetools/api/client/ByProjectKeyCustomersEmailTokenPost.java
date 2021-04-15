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
*  <p>Create a Token for verifying the Customer's Email</p>
*/
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public class ByProjectKeyCustomersEmailTokenPost extends ApiMethod<ByProjectKeyCustomersEmailTokenPost, com.commercetools.api.models.customer.CustomerToken> implements com.commercetools.api.client.ErrorableTrait<ByProjectKeyCustomersEmailTokenPost>, com.commercetools.api.client.DeprecatableTrait<ByProjectKeyCustomersEmailTokenPost> {

    
    private String projectKey;
    
    private com.commercetools.api.models.customer.CustomerCreateEmailToken customerCreateEmailToken;

    public ByProjectKeyCustomersEmailTokenPost(final ApiHttpClient apiHttpClient, String projectKey, com.commercetools.api.models.customer.CustomerCreateEmailToken customerCreateEmailToken) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.customerCreateEmailToken = customerCreateEmailToken;
    }

    public ByProjectKeyCustomersEmailTokenPost(ByProjectKeyCustomersEmailTokenPost t) {
        super(t);
        this.projectKey = t.projectKey;
        this.customerCreateEmailToken = t.customerCreateEmailToken;
    }

    @Override
    public ApiHttpRequest createHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("/%s/customers/email-token", this.projectKey);
        if(!params.isEmpty()){
            httpRequestPath += "?" + String.join("&", params);
        }
        try {
        final byte[] body = apiHttpClient().getSerializerService().toJsonByteArray(customerCreateEmailToken);
        return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(), body);
    } catch(Exception e) {
        e.printStackTrace();
    }
    
        return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(), null);
    }

    @Override
    public ApiHttpResponse<com.commercetools.api.models.customer.CustomerToken> executeBlocking(final ApiHttpClient client, Duration timeout){
        return blockingWait(execute(client), timeout);
    }

    @Override
    public CompletableFuture<ApiHttpResponse<com.commercetools.api.models.customer.CustomerToken>> execute(final ApiHttpClient client){
        return client.execute(this.createHttpRequest(), com.commercetools.api.models.customer.CustomerToken.class);
    }

    public String getProjectKey() {return this.projectKey;}


    public void setProjectKey(final String projectKey) { this.projectKey = projectKey; }


    

    @Override
    protected ByProjectKeyCustomersEmailTokenPost copy()
    {
        return new ByProjectKeyCustomersEmailTokenPost(this);
    }
}
