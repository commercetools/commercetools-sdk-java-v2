package com.commercetools.client;
import client.ApiHttpClient;

public class ByProjectKeyTaxCategoriesRequestBuilder {
   
   private final ApiHttpClient apiHttpClient;
   private final String projectKey;
   
   
   public ByProjectKeyTaxCategoriesRequestBuilder (final ApiHttpClient apiHttpClient,final String projectKey) {
      this.apiHttpClient = apiHttpClient;
      this.projectKey = projectKey;
   }
   
   public ByProjectKeyTaxCategoriesGet get() {
      return new ByProjectKeyTaxCategoriesGet(apiHttpClient, projectKey);
   }
   
   public ByProjectKeyTaxCategoriesPost post(com.commercetools.models.TaxCategory.TaxCategoryDraft taxCategoryDraft) {
      return new ByProjectKeyTaxCategoriesPost(apiHttpClient, projectKey, taxCategoryDraft);
   }
   
   public ByProjectKeyTaxCategoriesKeyByKeyRequestBuilder withKey(String key) {
      return new ByProjectKeyTaxCategoriesKeyByKeyRequestBuilder(apiHttpClient, projectKey, key);
   }
   public ByProjectKeyTaxCategoriesByIDRequestBuilder withId(String ID) {
      return new ByProjectKeyTaxCategoriesByIDRequestBuilder(apiHttpClient, projectKey, ID);
   }
}
