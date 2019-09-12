package com.commercetools.client;
import io.vrap.rmf.base.client.ApiHttpClient;

public class ByProjectKeyProductProjectionsRequestBuilder {
   
   private final ApiHttpClient apiHttpClient;
   private final String projectKey;
   
   
   public ByProjectKeyProductProjectionsRequestBuilder (final ApiHttpClient apiHttpClient,final String projectKey) {
      this.apiHttpClient = apiHttpClient;
      this.projectKey = projectKey;
   }
   
   public ByProjectKeyProductProjectionsGet get() {
      return new ByProjectKeyProductProjectionsGet(apiHttpClient, projectKey);
   }
   
   public ByProjectKeyProductProjectionsSearchRequestBuilder search() {
      return new ByProjectKeyProductProjectionsSearchRequestBuilder(apiHttpClient, projectKey);
   }
   public ByProjectKeyProductProjectionsSuggestRequestBuilder suggest() {
      return new ByProjectKeyProductProjectionsSuggestRequestBuilder(apiHttpClient, projectKey);
   }
   public ByProjectKeyProductProjectionsKeyByKeyRequestBuilder withKey(String key) {
      return new ByProjectKeyProductProjectionsKeyByKeyRequestBuilder(apiHttpClient, projectKey, key);
   }
   public ByProjectKeyProductProjectionsByIDRequestBuilder withId(String ID) {
      return new ByProjectKeyProductProjectionsByIDRequestBuilder(apiHttpClient, projectKey, ID);
   }
}
