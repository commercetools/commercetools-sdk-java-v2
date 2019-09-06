package com.commercetools.client;
import client.ApiHttpClient;

public class ByProjectKeyCustomersByIDRequestBuilder {
   
   private final ApiHttpClient apiHttpClient;
   private final String projectKey;
   private final String ID;
   
   
   public ByProjectKeyCustomersByIDRequestBuilder (final ApiHttpClient apiHttpClient,final String projectKey,final String ID) {
      this.apiHttpClient = apiHttpClient;
      this.projectKey = projectKey;
      this.ID = ID;
   }
   
   public ByProjectKeyCustomersByIDGet get() {
      return new ByProjectKeyCustomersByIDGet(apiHttpClient, projectKey, ID);
   }
   
   public ByProjectKeyCustomersByIDPost post(com.commercetools.models.Customer.CustomerUpdate customerUpdate) {
      return new ByProjectKeyCustomersByIDPost(apiHttpClient, projectKey, ID, customerUpdate);
   }
   
   public ByProjectKeyCustomersByIDDelete delete() {
      return new ByProjectKeyCustomersByIDDelete(apiHttpClient, projectKey, ID);
   }
   
}
