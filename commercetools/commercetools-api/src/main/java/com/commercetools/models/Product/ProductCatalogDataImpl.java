package com.commercetools.models.product;

import com.commercetools.models.product.ProductData;
import java.lang.Boolean;
import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ProductCatalogDataImpl implements ProductCatalogData {

   private com.commercetools.models.product.ProductData current;
   
   private com.commercetools.models.product.ProductData staged;
   
   private java.lang.Boolean published;
   
   private java.lang.Boolean hasStagedChanges;

   @JsonCreator
   ProductCatalogDataImpl(@JsonProperty("current") final com.commercetools.models.product.ProductData current, @JsonProperty("staged") final com.commercetools.models.product.ProductData staged, @JsonProperty("published") final java.lang.Boolean published, @JsonProperty("hasStagedChanges") final java.lang.Boolean hasStagedChanges) {
      this.current = current;
      this.staged = staged;
      this.published = published;
      this.hasStagedChanges = hasStagedChanges;
   }
   public ProductCatalogDataImpl() {
      
   }
   
   
   public com.commercetools.models.product.ProductData getCurrent(){
      return this.current;
   }
   
   
   public com.commercetools.models.product.ProductData getStaged(){
      return this.staged;
   }
   
   
   public java.lang.Boolean getPublished(){
      return this.published;
   }
   
   
   public java.lang.Boolean getHasStagedChanges(){
      return this.hasStagedChanges;
   }

   public void setCurrent(final com.commercetools.models.product.ProductData current){
      this.current = current;
   }
   
   public void setStaged(final com.commercetools.models.product.ProductData staged){
      this.staged = staged;
   }
   
   public void setPublished(final java.lang.Boolean published){
      this.published = published;
   }
   
   public void setHasStagedChanges(final java.lang.Boolean hasStagedChanges){
      this.hasStagedChanges = hasStagedChanges;
   }

}