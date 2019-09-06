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
public final class ProductSetMetaTitleActionImpl implements ProductSetMetaTitleAction {

   private java.lang.String action;
   
   private com.commercetools.models.Common.LocalizedString metaTitle;
   
   private java.lang.Boolean staged;

   @JsonCreator
   ProductSetMetaTitleActionImpl(@JsonProperty("metaTitle") final com.commercetools.models.Common.LocalizedString metaTitle, @JsonProperty("staged") final java.lang.Boolean staged) {
      this.metaTitle = metaTitle;
      this.staged = staged;
      this.action = "setMetaTitle";
   }
   public ProductSetMetaTitleActionImpl() {
      
   }
   
   
   public java.lang.String getAction(){
      return this.action;
   }
   
   
   public com.commercetools.models.Common.LocalizedString getMetaTitle(){
      return this.metaTitle;
   }
   
   
   public java.lang.Boolean getStaged(){
      return this.staged;
   }

   public void setMetaTitle(final com.commercetools.models.Common.LocalizedString metaTitle){
      this.metaTitle = metaTitle;
   }
   
   public void setStaged(final java.lang.Boolean staged){
      this.staged = staged;
   }

}