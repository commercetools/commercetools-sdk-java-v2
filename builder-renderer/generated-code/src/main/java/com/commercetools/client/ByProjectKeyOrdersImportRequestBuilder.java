package com.commercetools.client;
import client.ApiHttpClient;

public class ByProjectKeyOrdersImportRequestBuilder {
   
   private final ApiHttpClient apiHttpClient;
   private final String projectKey;
   
   
   public ByProjectKeyOrdersImportRequestBuilder (final ApiHttpClient apiHttpClient,final String projectKey) {
      this.apiHttpClient = apiHttpClient;
      this.projectKey = projectKey;
   }
   
   public ByProjectKeyOrdersImportPost post(com.commercetools.models.Order.OrderImportDraft orderImportDraft) {
      return new ByProjectKeyOrdersImportPost(apiHttpClient, projectKey, orderImportDraft);
   }
   
}
