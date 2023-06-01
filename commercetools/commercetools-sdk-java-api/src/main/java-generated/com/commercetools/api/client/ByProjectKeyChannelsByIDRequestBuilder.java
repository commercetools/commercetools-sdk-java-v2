package com.commercetools.api.client;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.UnaryOperator;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.ApiMethod;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class ByProjectKeyChannelsByIDRequestBuilder  {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;
    private final String ID;
    

    public ByProjectKeyChannelsByIDRequestBuilder (final ApiHttpClient apiHttpClient,final String projectKey,final String ID) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
        this.ID = ID;
    }

    public ByProjectKeyChannelsByIDGet get() {
        return new ByProjectKeyChannelsByIDGet(apiHttpClient, projectKey, ID);
    }
    
    
    
    public ByProjectKeyChannelsByIDPost post(com.commercetools.api.models.channel.ChannelUpdate channelUpdate) {
        return new ByProjectKeyChannelsByIDPost(apiHttpClient, projectKey, ID, channelUpdate);
    }
    
    
    public ByProjectKeyChannelsByIDPostString post(final String channelUpdate) {
        return new ByProjectKeyChannelsByIDPostString(apiHttpClient, projectKey, ID, channelUpdate);
    }
    public ByProjectKeyChannelsByIDPost post(UnaryOperator<com.commercetools.api.models.channel.ChannelUpdateBuilder> op) {
        return post(op.apply(com.commercetools.api.models.channel.ChannelUpdateBuilder.of()).build());
    }
    
    public ByProjectKeyChannelsByIDDelete delete() {
        return new ByProjectKeyChannelsByIDDelete(apiHttpClient, projectKey, ID);
    }
    public <TValue> ByProjectKeyChannelsByIDDelete delete(TValue version) {
        return delete().withVersion(version);
    }
    

    
}
