package com.commercetools.api.models.product;

import com.commercetools.api.models.category.CategoryResourceIdentifier;
import com.commercetools.api.models.product.ProductUpdateAction;
import com.commercetools.api.models.product.ProductAddToCategoryActionImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
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
@JsonDeserialize(as = ProductAddToCategoryActionImpl.class)
public interface ProductAddToCategoryAction extends ProductUpdateAction {

   
   @NotNull
   @Valid
   @JsonProperty("category")
   public CategoryResourceIdentifier getCategory();
   
   
   @JsonProperty("orderHint")
   public String getOrderHint();
   
   
   @JsonProperty("staged")
   public Boolean getStaged();

   public void setCategory(final CategoryResourceIdentifier category);
   
   public void setOrderHint(final String orderHint);
   
   public void setStaged(final Boolean staged);
   
   public static ProductAddToCategoryActionImpl of(){
      return new ProductAddToCategoryActionImpl();
   }
   

   public static ProductAddToCategoryActionImpl of(final ProductAddToCategoryAction template) {
      ProductAddToCategoryActionImpl instance = new ProductAddToCategoryActionImpl();
      instance.setCategory(template.getCategory());
      instance.setOrderHint(template.getOrderHint());
      instance.setStaged(template.getStaged());
      return instance;
   }

}
