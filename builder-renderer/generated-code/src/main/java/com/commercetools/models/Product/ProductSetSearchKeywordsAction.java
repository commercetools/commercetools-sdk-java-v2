package com.commercetools.models.Product;

import com.commercetools.models.Product.ProductUpdateAction;
import com.commercetools.models.Product.SearchKeywords;
import java.lang.Boolean;
import java.lang.String;
import com.commercetools.models.Product.ProductSetSearchKeywordsActionImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import json.CommercetoolsJsonUtils;
import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = ProductSetSearchKeywordsActionImpl.class)
public interface ProductSetSearchKeywordsAction extends ProductUpdateAction {

   
   @NotNull
   @Valid
   @JsonProperty("searchKeywords")
   public SearchKeywords getSearchKeywords();
   
   
   @JsonProperty("staged")
   public Boolean getStaged();

   public void setSearchKeywords(final SearchKeywords searchKeywords);
   
   public void setStaged(final Boolean staged);
   
   public static ProductSetSearchKeywordsActionImpl of(){
      return new ProductSetSearchKeywordsActionImpl();
   }
   

   public static ProductSetSearchKeywordsActionImpl of(final ProductSetSearchKeywordsAction template) {
      ProductSetSearchKeywordsActionImpl instance = new ProductSetSearchKeywordsActionImpl();
      instance.setSearchKeywords(template.getSearchKeywords());
      instance.setStaged(template.getStaged());
      return instance;
   }

}