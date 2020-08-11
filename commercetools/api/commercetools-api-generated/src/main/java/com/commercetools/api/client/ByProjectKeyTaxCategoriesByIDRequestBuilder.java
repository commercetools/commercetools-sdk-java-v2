package com.commercetools.api.client;
import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
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
   
   public ByProjectKeyTaxCategoriesByIDPost post(com.commercetools.api.models.tax_category.TaxCategoryUpdate taxCategoryUpdate) {
      return new ByProjectKeyTaxCategoriesByIDPost(apiHttpClient, projectKey, ID, taxCategoryUpdate);
   }
   
   public ByProjectKeyTaxCategoriesByIDDelete delete() {
      return new ByProjectKeyTaxCategoriesByIDDelete(apiHttpClient, projectKey, ID);
   }
   
}
