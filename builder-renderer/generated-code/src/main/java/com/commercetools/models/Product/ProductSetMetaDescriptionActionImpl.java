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
public final class ProductSetMetaDescriptionActionImpl implements ProductSetMetaDescriptionAction {

   private java.lang.String action;
   
   private java.lang.Boolean staged;
   
   private com.commercetools.models.Common.LocalizedString metaDescription;

   @JsonCreator
   ProductSetMetaDescriptionActionImpl(@JsonProperty("staged") final java.lang.Boolean staged, @JsonProperty("metaDescription") final com.commercetools.models.Common.LocalizedString metaDescription) {
      this.staged = staged;
      this.metaDescription = metaDescription;
      this.action = "setMetaDescription";
   }
   public ProductSetMetaDescriptionActionImpl() {
      
   }
   
   
   public java.lang.String getAction(){
      return this.action;
   }
   
   
   public java.lang.Boolean getStaged(){
      return this.staged;
   }
   
   
   public com.commercetools.models.Common.LocalizedString getMetaDescription(){
      return this.metaDescription;
   }

   public void setStaged(final java.lang.Boolean staged){
      this.staged = staged;
   }
   
   public void setMetaDescription(final com.commercetools.models.Common.LocalizedString metaDescription){
      this.metaDescription = metaDescription;
   }

}