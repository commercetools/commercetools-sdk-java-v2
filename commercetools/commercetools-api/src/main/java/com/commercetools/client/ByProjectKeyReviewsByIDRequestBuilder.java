package com.commercetools.client;
import io.vrap.rmf.base.client.ApiHttpClient;

public class ByProjectKeyReviewsByIDRequestBuilder {
   
   private final ApiHttpClient apiHttpClient;
   private final String projectKey;
   private final String ID;
   
   
   public ByProjectKeyReviewsByIDRequestBuilder (final ApiHttpClient apiHttpClient,final String projectKey,final String ID) {
      this.apiHttpClient = apiHttpClient;
      this.projectKey = projectKey;
      this.ID = ID;
   }
   
   public ByProjectKeyReviewsByIDGet get() {
      return new ByProjectKeyReviewsByIDGet(apiHttpClient, projectKey, ID);
   }
   
   public ByProjectKeyReviewsByIDPost post(com.commercetools.models.Review.ReviewUpdate reviewUpdate) {
      return new ByProjectKeyReviewsByIDPost(apiHttpClient, projectKey, ID, reviewUpdate);
   }
   
   public ByProjectKeyReviewsByIDDelete delete() {
      return new ByProjectKeyReviewsByIDDelete(apiHttpClient, projectKey, ID);
   }
   
}
