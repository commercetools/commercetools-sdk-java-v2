package com.commercetools.api.models.product;

import com.commercetools.api.models.cart.ProductPublishScope;
import com.commercetools.api.models.product.ProductUpdateAction;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ProductPublishActionImpl implements ProductPublishAction {

   private String action;
   
   private com.commercetools.api.models.cart.ProductPublishScope scope;

   @JsonCreator
   ProductPublishActionImpl(@JsonProperty("scope") final com.commercetools.api.models.cart.ProductPublishScope scope) {
      this.scope = scope;
      this.action = "publish";
   }
   public ProductPublishActionImpl() {
      
   }
   
   
   public String getAction(){
      return this.action;
   }
   
   
   public com.commercetools.api.models.cart.ProductPublishScope getScope(){
      return this.scope;
   }

   public void setScope(final com.commercetools.api.models.cart.ProductPublishScope scope){
      this.scope = scope;
   }

}
