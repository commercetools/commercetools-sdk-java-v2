package com.commercetools.api.client;
import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public class ByProjectKeyCartDiscountsByIDRequestBuilder {
   
   private final ApiHttpClient apiHttpClient;
   private final String projectKey;
   private final String ID;
   
   
   public ByProjectKeyCartDiscountsByIDRequestBuilder (final ApiHttpClient apiHttpClient,final String projectKey,final String ID) {
      this.apiHttpClient = apiHttpClient;
      this.projectKey = projectKey;
      this.ID = ID;
   }
   
   public ByProjectKeyCartDiscountsByIDGet get() {
      return new ByProjectKeyCartDiscountsByIDGet(apiHttpClient, projectKey, ID);
   }
   
   public ByProjectKeyCartDiscountsByIDPost post(com.commercetools.api.models.cart_discount.CartDiscountUpdate cartDiscountUpdate) {
      return new ByProjectKeyCartDiscountsByIDPost(apiHttpClient, projectKey, ID, cartDiscountUpdate);
   }
   
   public ByProjectKeyCartDiscountsByIDDelete delete() {
      return new ByProjectKeyCartDiscountsByIDDelete(apiHttpClient, projectKey, ID);
   }
   
}
