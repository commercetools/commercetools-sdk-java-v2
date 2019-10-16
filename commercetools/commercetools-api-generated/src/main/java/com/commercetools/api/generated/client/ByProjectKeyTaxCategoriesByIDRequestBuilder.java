package com.commercetools.api.generated.client;
import io.vrap.rmf.base.client.ApiHttpClient;

public class ByProjectKeyTaxCategoriesByIDRequestBuilder {
   
   private final ApiHttpClient apiHttpClient;
   private final String projectKey;
   private final String ID;
   
   
   public ByProjectKeyTaxCategoriesByIDRequestBuilder (final ApiHttpClient apiHttpClient,final String projectKey,final String ID) {
      this.apiHttpClient = apiHttpClient;
      this.projectKey = projectKey;
      this.ID = ID;
   }
   
   public ByProjectKeyTaxCategoriesByIDGet get() {
      return new ByProjectKeyTaxCategoriesByIDGet(apiHttpClient, projectKey, ID);
   }
   
   public ByProjectKeyTaxCategoriesByIDPost post(com.commercetools.api.generated.models.tax_category.TaxCategoryUpdate taxCategoryUpdate) {
      return new ByProjectKeyTaxCategoriesByIDPost(apiHttpClient, projectKey, ID, taxCategoryUpdate);
   }
   
   public ByProjectKeyTaxCategoriesByIDDelete delete() {
      return new ByProjectKeyTaxCategoriesByIDDelete(apiHttpClient, projectKey, ID);
   }
   
}
