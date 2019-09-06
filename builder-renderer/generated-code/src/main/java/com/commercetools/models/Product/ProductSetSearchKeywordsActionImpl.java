package com.commercetools.models.Product;

import com.commercetools.models.Product.ProductUpdateAction;
import com.commercetools.models.Product.SearchKeywords;
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
public final class ProductSetSearchKeywordsActionImpl implements ProductSetSearchKeywordsAction {

   private java.lang.String action;
   
   private com.commercetools.models.Product.SearchKeywords searchKeywords;
   
   private java.lang.Boolean staged;

   @JsonCreator
   ProductSetSearchKeywordsActionImpl(@JsonProperty("searchKeywords") final com.commercetools.models.Product.SearchKeywords searchKeywords, @JsonProperty("staged") final java.lang.Boolean staged) {
      this.searchKeywords = searchKeywords;
      this.staged = staged;
      this.action = "setSearchKeywords";
   }
   public ProductSetSearchKeywordsActionImpl() {
      
   }
   
   
   public java.lang.String getAction(){
      return this.action;
   }
   
   
   public com.commercetools.models.Product.SearchKeywords getSearchKeywords(){
      return this.searchKeywords;
   }
   
   
   public java.lang.Boolean getStaged(){
      return this.staged;
   }

   public void setSearchKeywords(final com.commercetools.models.Product.SearchKeywords searchKeywords){
      this.searchKeywords = searchKeywords;
   }
   
   public void setStaged(final java.lang.Boolean staged){
      this.staged = staged;
   }

}