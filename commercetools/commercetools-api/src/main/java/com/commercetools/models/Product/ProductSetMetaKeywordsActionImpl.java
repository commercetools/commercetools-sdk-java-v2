package com.commercetools.models.product;

import com.commercetools.models.common.LocalizedString;
import com.commercetools.models.product.ProductUpdateAction;
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


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ProductSetMetaKeywordsActionImpl implements ProductSetMetaKeywordsAction {

   private java.lang.String action;
   
   private com.commercetools.models.common.LocalizedString metaKeywords;
   
   private java.lang.Boolean staged;

   @JsonCreator
   ProductSetMetaKeywordsActionImpl(@JsonProperty("metaKeywords") final com.commercetools.models.common.LocalizedString metaKeywords, @JsonProperty("staged") final java.lang.Boolean staged) {
      this.metaKeywords = metaKeywords;
      this.staged = staged;
      this.action = "setMetaKeywords";
   }
   public ProductSetMetaKeywordsActionImpl() {
      
   }
   
   
   public java.lang.String getAction(){
      return this.action;
   }
   
   
   public com.commercetools.models.common.LocalizedString getMetaKeywords(){
      return this.metaKeywords;
   }
   
   
   public java.lang.Boolean getStaged(){
      return this.staged;
   }

   public void setMetaKeywords(final com.commercetools.models.common.LocalizedString metaKeywords){
      this.metaKeywords = metaKeywords;
   }
   
   public void setStaged(final java.lang.Boolean staged){
      this.staged = staged;
   }

}