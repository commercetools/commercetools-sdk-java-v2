package com.commercetools.api.client;
import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public class ByProjectKeyZonesByIDRequestBuilder {
   
   private final ApiHttpClient apiHttpClient;
   private final String projectKey;
   private final String ID;
   
   
   public ByProjectKeyZonesByIDRequestBuilder (final ApiHttpClient apiHttpClient,final String projectKey,final String ID) {
      this.apiHttpClient = apiHttpClient;
      this.projectKey = projectKey;
      this.ID = ID;
   }
   
   public ByProjectKeyZonesByIDGet get() {
      return new ByProjectKeyZonesByIDGet(apiHttpClient, projectKey, ID);
   }
   
   public ByProjectKeyZonesByIDPost post(com.commercetools.api.models.zone.ZoneUpdate zoneUpdate) {
      return new ByProjectKeyZonesByIDPost(apiHttpClient, projectKey, ID, zoneUpdate);
   }
   
   public ByProjectKeyZonesByIDDelete delete() {
      return new ByProjectKeyZonesByIDDelete(apiHttpClient, projectKey, ID);
   }
   
}
