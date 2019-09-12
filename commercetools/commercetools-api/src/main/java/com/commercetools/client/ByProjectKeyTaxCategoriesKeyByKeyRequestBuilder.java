package com.commercetools.client;
import io.vrap.rmf.base.client.ApiHttpClient;

public class ByProjectKeyTaxCategoriesKeyByKeyRequestBuilder {
   
   private final ApiHttpClient apiHttpClient;
   private final String projectKey;
   private final String key;
   
   
   public ByProjectKeyTaxCategoriesKeyByKeyRequestBuilder (final ApiHttpClient apiHttpClient,final String projectKey,final String key) {
      this.apiHttpClient = apiHttpClient;
      this.projectKey = projectKey;
      this.key = key;
   }
   
   public ByProjectKeyTaxCategoriesKeyByKeyGet get() {
      return new ByProjectKeyTaxCategoriesKeyByKeyGet(apiHttpClient, projectKey, key);
   }
   
   public ByProjectKeyTaxCategoriesKeyByKeyPost post(com.commercetools.models.TaxCategory.TaxCategoryUpdate taxCategoryUpdate) {
      return new ByProjectKeyTaxCategoriesKeyByKeyPost(apiHttpClient, projectKey, key, taxCategoryUpdate);
   }
   
   public ByProjectKeyTaxCategoriesKeyByKeyDelete delete() {
      return new ByProjectKeyTaxCategoriesKeyByKeyDelete(apiHttpClient, projectKey, key);
   }
   
}
