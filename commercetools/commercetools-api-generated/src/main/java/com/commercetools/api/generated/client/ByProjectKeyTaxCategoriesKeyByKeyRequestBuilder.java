package com.commercetools.api.generated.client;
import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
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
   
   public ByProjectKeyTaxCategoriesKeyByKeyPost post(com.commercetools.api.generated.models.tax_category.TaxCategoryUpdate taxCategoryUpdate) {
      return new ByProjectKeyTaxCategoriesKeyByKeyPost(apiHttpClient, projectKey, key, taxCategoryUpdate);
   }
   
   public ByProjectKeyTaxCategoriesKeyByKeyDelete delete() {
      return new ByProjectKeyTaxCategoriesKeyByKeyDelete(apiHttpClient, projectKey, key);
   }
   
}
