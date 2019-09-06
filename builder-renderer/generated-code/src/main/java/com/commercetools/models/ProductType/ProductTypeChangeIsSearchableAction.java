package com.commercetools.models.ProductType;

import com.commercetools.models.ProductType.ProductTypeUpdateAction;
import java.lang.Boolean;
import java.lang.String;
import com.commercetools.models.ProductType.ProductTypeChangeIsSearchableActionImpl;

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
@JsonDeserialize(as = ProductTypeChangeIsSearchableActionImpl.class)
public interface ProductTypeChangeIsSearchableAction extends ProductTypeUpdateAction {

   
   @NotNull
   @JsonProperty("attributeName")
   public String getAttributeName();
   
   @NotNull
   @JsonProperty("isSearchable")
   public Boolean getIsSearchable();

   public void setAttributeName(final String attributeName);
   
   public void setIsSearchable(final Boolean isSearchable);
   
   public static ProductTypeChangeIsSearchableActionImpl of(){
      return new ProductTypeChangeIsSearchableActionImpl();
   }
   

   public static ProductTypeChangeIsSearchableActionImpl of(final ProductTypeChangeIsSearchableAction template) {
      ProductTypeChangeIsSearchableActionImpl instance = new ProductTypeChangeIsSearchableActionImpl();
      instance.setAttributeName(template.getAttributeName());
      instance.setIsSearchable(template.getIsSearchable());
      return instance;
   }

}