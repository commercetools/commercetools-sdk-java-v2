package com.commercetools.client;
import io.vrap.rmf.base.client.ApiHttpClient;

public class ByProjectKeyChannelsByIDRequestBuilder {
   
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
   
   public ByProjectKeyChannelsByIDPost post(com.commercetools.models.channel.ChannelUpdate channelUpdate) {
      return new ByProjectKeyChannelsByIDPost(apiHttpClient, projectKey, ID, channelUpdate);
   }
   
   public ByProjectKeyChannelsByIDDelete delete() {
      return new ByProjectKeyChannelsByIDDelete(apiHttpClient, projectKey, ID);
   }
   
}
