package com.commercetools.client;
import io.vrap.rmf.base.client.ApiHttpClient;

public class ByProjectKeyCustomerGroupsRequestBuilder {
   
   private final ApiHttpClient apiHttpClient;
   private final String projectKey;
   
   
   public ByProjectKeyCustomerGroupsRequestBuilder (final ApiHttpClient apiHttpClient,final String projectKey) {
      this.apiHttpClient = apiHttpClient;
      this.projectKey = projectKey;
   }
   
   public ByProjectKeyCustomerGroupsGet get() {
      return new ByProjectKeyCustomerGroupsGet(apiHttpClient, projectKey);
   }
   
   public ByProjectKeyCustomerGroupsPost post(com.commercetools.models.CustomerGroup.CustomerGroupDraft customerGroupDraft) {
      return new ByProjectKeyCustomerGroupsPost(apiHttpClient, projectKey, customerGroupDraft);
   }
   
   public ByProjectKeyCustomerGroupsKeyByKeyRequestBuilder withKey(String key) {
      return new ByProjectKeyCustomerGroupsKeyByKeyRequestBuilder(apiHttpClient, projectKey, key);
   }
   public ByProjectKeyCustomerGroupsByIDRequestBuilder withId(String ID) {
      return new ByProjectKeyCustomerGroupsByIDRequestBuilder(apiHttpClient, projectKey, ID);
   }
}
