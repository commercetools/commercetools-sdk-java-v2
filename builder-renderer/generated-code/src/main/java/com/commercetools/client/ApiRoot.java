package com.commercetools.client;

import client.ApiHttpClient;
import client.Middleware;

import java.util.List;
import java.util.Arrays;

public class ApiRoot {
   
   private final ApiHttpClient apiHttpClient;
      
   private ApiRoot(final Middleware... middlewares) {
      this.apiHttpClient = new ApiHttpClient(Arrays.asList(middlewares));
   }
      
   public static ApiRoot formMiddlewares(final Middleware... middlewares) {
       return new ApiRoot(middlewares);
   }
           
   public ByProjectKeyRequestBuilder withProjectKey(String projectKey) {
      return new ByProjectKeyRequestBuilder(this.apiHttpClient, projectKey);
   }
   
}