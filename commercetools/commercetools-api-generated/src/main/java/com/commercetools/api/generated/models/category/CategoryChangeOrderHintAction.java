package com.commercetools.api.generated.models.category;

import com.commercetools.api.generated.models.category.CategoryUpdateAction;
import com.commercetools.api.generated.models.category.CategoryChangeOrderHintActionImpl;

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
@JsonDeserialize(as = CategoryChangeOrderHintActionImpl.class)
public interface CategoryChangeOrderHintAction extends CategoryUpdateAction {

   
   @NotNull
   @JsonProperty("orderHint")
   public String getOrderHint();

   public void setOrderHint(final String orderHint);
   
   public static CategoryChangeOrderHintActionImpl of(){
      return new CategoryChangeOrderHintActionImpl();
   }
   

   public static CategoryChangeOrderHintActionImpl of(final CategoryChangeOrderHintAction template) {
      CategoryChangeOrderHintActionImpl instance = new CategoryChangeOrderHintActionImpl();
      instance.setOrderHint(template.getOrderHint());
      return instance;
   }

}