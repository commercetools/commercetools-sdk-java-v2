package com.commercetools.models.Product;

import com.commercetools.models.Common.LocalizedString;
import com.commercetools.models.Product.ProductUpdateAction;
import java.lang.Boolean;
import java.lang.String;
import com.commercetools.models.Product.ProductSetMetaKeywordsActionImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = ProductSetMetaKeywordsActionImpl.class)
public interface ProductSetMetaKeywordsAction extends ProductUpdateAction {

   
   @Valid
   @JsonProperty("metaKeywords")
   public LocalizedString getMetaKeywords();
   
   
   @JsonProperty("staged")
   public Boolean getStaged();

   public void setMetaKeywords(final LocalizedString metaKeywords);
   
   public void setStaged(final Boolean staged);
   
   public static ProductSetMetaKeywordsActionImpl of(){
      return new ProductSetMetaKeywordsActionImpl();
   }
   

   public static ProductSetMetaKeywordsActionImpl of(final ProductSetMetaKeywordsAction template) {
      ProductSetMetaKeywordsActionImpl instance = new ProductSetMetaKeywordsActionImpl();
      instance.setMetaKeywords(template.getMetaKeywords());
      instance.setStaged(template.getStaged());
      return instance;
   }

}