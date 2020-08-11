package com.commercetools.api.models.product;

import com.commercetools.api.models.product.ProductUpdateAction;
import com.commercetools.api.models.product.SearchKeywords;
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
public final class ProductSetSearchKeywordsActionImpl implements ProductSetSearchKeywordsAction {

   private String action;

   private com.commercetools.api.models.product.SearchKeywords searchKeywords;

   private Boolean staged;

   @JsonCreator
   ProductSetSearchKeywordsActionImpl(@JsonProperty("searchKeywords") final com.commercetools.api.models.product.SearchKeywords searchKeywords, @JsonProperty("staged") final Boolean staged) {
      this.searchKeywords = searchKeywords;
      this.staged = staged;
      this.action = "setSearchKeywords";
   }
   public ProductSetSearchKeywordsActionImpl() {

   }


   public String getAction(){
      return this.action;
   }


   public com.commercetools.api.models.product.SearchKeywords getSearchKeywords(){
      return this.searchKeywords;
   }


   public Boolean getStaged(){
      return this.staged;
   }

   public void setSearchKeywords(final com.commercetools.api.models.product.SearchKeywords searchKeywords){
      this.searchKeywords = searchKeywords;
   }

   public void setStaged(final Boolean staged){
      this.staged = staged;
   }

}
