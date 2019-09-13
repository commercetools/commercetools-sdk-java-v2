package com.commercetools.models.tax_category;

import com.commercetools.models.tax_category.TaxCategoryUpdateAction;
import java.lang.Long;
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
public final class TaxCategoryUpdateImpl implements TaxCategoryUpdate {

   private java.util.List<com.commercetools.models.tax_category.TaxCategoryUpdateAction> actions;
   
   private java.lang.Long version;

   @JsonCreator
   TaxCategoryUpdateImpl(@JsonProperty("actions") final java.util.List<com.commercetools.models.tax_category.TaxCategoryUpdateAction> actions, @JsonProperty("version") final java.lang.Long version) {
      this.actions = actions;
      this.version = version;
   }
   public TaxCategoryUpdateImpl() {
      
   }
   
   
   public java.util.List<com.commercetools.models.tax_category.TaxCategoryUpdateAction> getActions(){
      return this.actions;
   }
   
   
   public java.lang.Long getVersion(){
      return this.version;
   }

   public void setActions(final java.util.List<com.commercetools.models.tax_category.TaxCategoryUpdateAction> actions){
      this.actions = actions;
   }
   
   public void setVersion(final java.lang.Long version){
      this.version = version;
   }

}