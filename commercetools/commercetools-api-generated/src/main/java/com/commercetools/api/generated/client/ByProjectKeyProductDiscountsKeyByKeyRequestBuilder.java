package com.commercetools.api.generated.client;
import io.vrap.rmf.base.client.ApiHttpClient;
import javax.annotation.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public class ByProjectKeyProductDiscountsKeyByKeyRequestBuilder {
   
   private final ApiHttpClient apiHttpClient;
   private final String projectKey;
   private final String key;
   
   
   public ByProjectKeyProductDiscountsKeyByKeyRequestBuilder (final ApiHttpClient apiHttpClient,final String projectKey,final String key) {
      this.apiHttpClient = apiHttpClient;
      this.projectKey = projectKey;
      this.key = key;
   }
   
   public ByProjectKeyProductDiscountsKeyByKeyGet get() {
      return new ByProjectKeyProductDiscountsKeyByKeyGet(apiHttpClient, projectKey, key);
   }
   
   public ByProjectKeyProductDiscountsKeyByKeyPost post(com.commercetools.api.generated.models.product_discount.ProductDiscountUpdate productDiscountUpdate) {
      return new ByProjectKeyProductDiscountsKeyByKeyPost(apiHttpClient, projectKey, key, productDiscountUpdate);
   }
   
   public ByProjectKeyProductDiscountsKeyByKeyDelete delete() {
      return new ByProjectKeyProductDiscountsKeyByKeyDelete(apiHttpClient, projectKey, key);
   }
   
}
