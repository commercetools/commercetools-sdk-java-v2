package com.commercetools.models.product;

import com.commercetools.models.product.ProductUpdateAction;
import java.lang.Boolean;
import java.lang.String;
import com.commercetools.models.product.ProductSetCategoryOrderHintActionImpl;

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
@JsonDeserialize(as = ProductSetCategoryOrderHintActionImpl.class)
public interface ProductSetCategoryOrderHintAction extends ProductUpdateAction {

   
   @NotNull
   @JsonProperty("categoryId")
   public String getCategoryId();
   
   
   @JsonProperty("orderHint")
   public String getOrderHint();
   
   
   @JsonProperty("staged")
   public Boolean getStaged();

   public void setCategoryId(final String categoryId);
   
   public void setOrderHint(final String orderHint);
   
   public void setStaged(final Boolean staged);
   
   public static ProductSetCategoryOrderHintActionImpl of(){
      return new ProductSetCategoryOrderHintActionImpl();
   }
   

   public static ProductSetCategoryOrderHintActionImpl of(final ProductSetCategoryOrderHintAction template) {
      ProductSetCategoryOrderHintActionImpl instance = new ProductSetCategoryOrderHintActionImpl();
      instance.setOrderHint(template.getOrderHint());
      instance.setStaged(template.getStaged());
      instance.setCategoryId(template.getCategoryId());
      return instance;
   }

}