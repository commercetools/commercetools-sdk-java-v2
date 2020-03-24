package com.commercetools.api.generated.client;
import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public class ByProjectKeyCustomerGroupsKeyByKeyRequestBuilder {
   
   private final ApiHttpClient apiHttpClient;
   private final String projectKey;
   private final String key;
   
   
   public ByProjectKeyCustomerGroupsKeyByKeyRequestBuilder (final ApiHttpClient apiHttpClient,final String projectKey,final String key) {
      this.apiHttpClient = apiHttpClient;
      this.projectKey = projectKey;
      this.key = key;
   }
   
   public ByProjectKeyCustomerGroupsKeyByKeyGet get() {
      return new ByProjectKeyCustomerGroupsKeyByKeyGet(apiHttpClient, projectKey, key);
   }
   
   public ByProjectKeyCustomerGroupsKeyByKeyPost post(com.commercetools.api.generated.models.customer_group.CustomerGroupUpdate customerGroupUpdate) {
      return new ByProjectKeyCustomerGroupsKeyByKeyPost(apiHttpClient, projectKey, key, customerGroupUpdate);
   }
   
   public ByProjectKeyCustomerGroupsKeyByKeyDelete delete() {
      return new ByProjectKeyCustomerGroupsKeyByKeyDelete(apiHttpClient, projectKey, key);
   }
   
}
