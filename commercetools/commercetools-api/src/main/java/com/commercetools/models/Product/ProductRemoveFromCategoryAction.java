package com.commercetools.models.product;

import com.commercetools.models.category.CategoryResourceIdentifier;
import com.commercetools.models.product.ProductUpdateAction;
import com.commercetools.models.product.ProductRemoveFromCategoryActionImpl;

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
@JsonDeserialize(as = ProductRemoveFromCategoryActionImpl.class)
public interface ProductRemoveFromCategoryAction extends ProductUpdateAction {

   
   @NotNull
   @Valid
   @JsonProperty("category")
   public CategoryResourceIdentifier getCategory();
   
   
   @JsonProperty("staged")
   public Boolean getStaged();

   public void setCategory(final CategoryResourceIdentifier category);
   
   public void setStaged(final Boolean staged);
   
   public static ProductRemoveFromCategoryActionImpl of(){
      return new ProductRemoveFromCategoryActionImpl();
   }
   

   public static ProductRemoveFromCategoryActionImpl of(final ProductRemoveFromCategoryAction template) {
      ProductRemoveFromCategoryActionImpl instance = new ProductRemoveFromCategoryActionImpl();
      instance.setStaged(template.getStaged());
      instance.setCategory(template.getCategory());
      return instance;
   }

}