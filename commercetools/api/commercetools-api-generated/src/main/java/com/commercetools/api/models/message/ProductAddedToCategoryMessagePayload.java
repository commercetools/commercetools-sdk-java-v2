package com.commercetools.api.models.message;

import com.commercetools.api.models.category.CategoryReference;
import com.commercetools.api.models.message.MessagePayload;
import com.commercetools.api.models.message.ProductAddedToCategoryMessagePayloadImpl;

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
@JsonDeserialize(as = ProductAddedToCategoryMessagePayloadImpl.class)
public interface ProductAddedToCategoryMessagePayload extends MessagePayload {

   
   @NotNull
   @Valid
   @JsonProperty("category")
   public CategoryReference getCategory();
   
   @NotNull
   @JsonProperty("staged")
   public Boolean getStaged();

   public void setCategory(final CategoryReference category);
   
   public void setStaged(final Boolean staged);
   
   public static ProductAddedToCategoryMessagePayloadImpl of(){
      return new ProductAddedToCategoryMessagePayloadImpl();
   }
   

   public static ProductAddedToCategoryMessagePayloadImpl of(final ProductAddedToCategoryMessagePayload template) {
      ProductAddedToCategoryMessagePayloadImpl instance = new ProductAddedToCategoryMessagePayloadImpl();
      instance.setCategory(template.getCategory());
      instance.setStaged(template.getStaged());
      return instance;
   }

}
