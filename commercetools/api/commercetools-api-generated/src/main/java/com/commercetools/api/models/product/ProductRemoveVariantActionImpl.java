package com.commercetools.api.models.product;

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
public final class ProductRemoveVariantActionImpl implements ProductRemoveVariantAction {

   private String action;

   private Boolean staged;

   private Long id;

   private String sku;

   @JsonCreator
   ProductRemoveVariantActionImpl(@JsonProperty("staged") final Boolean staged, @JsonProperty("id") final Long id, @JsonProperty("sku") final String sku) {
      this.staged = staged;
      this.id = id;
      this.sku = sku;
      this.action = "removeVariant";
   }
   public ProductRemoveVariantActionImpl() {

   }


   public String getAction(){
      return this.action;
   }


   public Boolean getStaged(){
      return this.staged;
   }


   public Long getId(){
      return this.id;
   }


   public String getSku(){
      return this.sku;
   }

   public void setStaged(final Boolean staged){
      this.staged = staged;
   }

   public void setId(final Long id){
      this.id = id;
   }

   public void setSku(final String sku){
      this.sku = sku;
   }

}
