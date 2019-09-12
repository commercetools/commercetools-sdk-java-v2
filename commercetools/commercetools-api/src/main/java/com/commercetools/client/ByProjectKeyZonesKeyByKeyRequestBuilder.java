package com.commercetools.client;
import io.vrap.rmf.base.client.ApiHttpClient;

public class ByProjectKeyZonesKeyByKeyRequestBuilder {
   
   private final ApiHttpClient apiHttpClient;
   private final String projectKey;
   private final String key;
   
   
   public ByProjectKeyZonesKeyByKeyRequestBuilder (final ApiHttpClient apiHttpClient,final String projectKey,final String key) {
      this.apiHttpClient = apiHttpClient;
      this.projectKey = projectKey;
      this.key = key;
   }
   
   public ByProjectKeyZonesKeyByKeyGet get() {
      return new ByProjectKeyZonesKeyByKeyGet(apiHttpClient, projectKey, key);
   }
   
   public ByProjectKeyZonesKeyByKeyPost post(com.commercetools.models.Zone.ZoneUpdate zoneUpdate) {
      return new ByProjectKeyZonesKeyByKeyPost(apiHttpClient, projectKey, key, zoneUpdate);
   }
   
   public ByProjectKeyZonesKeyByKeyDelete delete() {
      return new ByProjectKeyZonesKeyByKeyDelete(apiHttpClient, projectKey, key);
   }
   
}
