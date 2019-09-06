package com.commercetools.models.Product;

import com.commercetools.models.Common.LocalizedString;
import com.commercetools.models.Product.ProductUpdateAction;
import java.lang.Boolean;
import java.lang.String;
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

import json.CommercetoolsJsonUtils;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ProductChangeSlugActionImpl implements ProductChangeSlugAction {

   private java.lang.String action;
   
   private java.lang.Boolean staged;
   
   private com.commercetools.models.Common.LocalizedString slug;

   @JsonCreator
   ProductChangeSlugActionImpl(@JsonProperty("staged") final java.lang.Boolean staged, @JsonProperty("slug") final com.commercetools.models.Common.LocalizedString slug) {
      this.staged = staged;
      this.slug = slug;
      this.action = "changeSlug";
   }
   public ProductChangeSlugActionImpl() {
      
   }
   
   
   public java.lang.String getAction(){
      return this.action;
   }
   
   
   public java.lang.Boolean getStaged(){
      return this.staged;
   }
   
   
   public com.commercetools.models.Common.LocalizedString getSlug(){
      return this.slug;
   }

   public void setStaged(final java.lang.Boolean staged){
      this.staged = staged;
   }
   
   public void setSlug(final com.commercetools.models.Common.LocalizedString slug){
      this.slug = slug;
   }

}