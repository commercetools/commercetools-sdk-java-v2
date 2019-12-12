package com.commercetools.api.generated.models.message;

import com.commercetools.api.generated.models.category.CategoryReference;
import com.commercetools.api.generated.models.message.MessagePayload;
import com.commercetools.api.generated.models.message.ProductRemovedFromCategoryMessagePayloadImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.*;
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
@JsonDeserialize(as = ProductRemovedFromCategoryMessagePayloadImpl.class)
public interface ProductRemovedFromCategoryMessagePayload extends MessagePayload {

   
   @NotNull
   @Valid
   @JsonProperty("category")
   public CategoryReference getCategory();
   
   @NotNull
   @JsonProperty("staged")
   public Boolean getStaged();

   public void setCategory(final CategoryReference category);
   
   public void setStaged(final Boolean staged);
   
   public static ProductRemovedFromCategoryMessagePayloadImpl of(){
      return new ProductRemovedFromCategoryMessagePayloadImpl();
   }
   

   public static ProductRemovedFromCategoryMessagePayloadImpl of(final ProductRemovedFromCategoryMessagePayload template) {
      ProductRemovedFromCategoryMessagePayloadImpl instance = new ProductRemovedFromCategoryMessagePayloadImpl();
      instance.setStaged(template.getStaged());
      instance.setCategory(template.getCategory());
      return instance;
   }

}