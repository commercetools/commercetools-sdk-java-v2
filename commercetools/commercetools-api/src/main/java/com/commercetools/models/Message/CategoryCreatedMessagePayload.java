package com.commercetools.models.Message;

import com.commercetools.models.Category.Category;
import com.commercetools.models.Message.MessagePayload;
import java.lang.String;
import com.commercetools.models.Message.CategoryCreatedMessagePayloadImpl;

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
@JsonDeserialize(as = CategoryCreatedMessagePayloadImpl.class)
public interface CategoryCreatedMessagePayload extends MessagePayload {

   
   @NotNull
   @Valid
   @JsonProperty("category")
   public Category getCategory();

   public void setCategory(final Category category);
   
   public static CategoryCreatedMessagePayloadImpl of(){
      return new CategoryCreatedMessagePayloadImpl();
   }
   

   public static CategoryCreatedMessagePayloadImpl of(final CategoryCreatedMessagePayload template) {
      CategoryCreatedMessagePayloadImpl instance = new CategoryCreatedMessagePayloadImpl();
      instance.setCategory(template.getCategory());
      return instance;
   }

}