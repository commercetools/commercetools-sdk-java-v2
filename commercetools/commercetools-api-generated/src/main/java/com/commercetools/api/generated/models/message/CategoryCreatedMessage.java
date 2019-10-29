package com.commercetools.api.generated.models.message;

import com.commercetools.api.generated.models.category.Category;
import com.commercetools.api.generated.models.message.Message;
import com.commercetools.api.generated.models.message.CategoryCreatedMessageImpl;

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
@JsonDeserialize(as = CategoryCreatedMessageImpl.class)
public interface CategoryCreatedMessage extends Message {

   /**
   	<p>Categories allow to organize products into hierarchical structures. They enable creating multiple classifications of products for shop navigation and other purposes.</p>
   */
   @NotNull
   @Valid
   @JsonProperty("category")
   public Category getCategory();

   public void setCategory(final Category category);
   
   public static CategoryCreatedMessageImpl of(){
      return new CategoryCreatedMessageImpl();
   }
   

   public static CategoryCreatedMessageImpl of(final CategoryCreatedMessage template) {
      CategoryCreatedMessageImpl instance = new CategoryCreatedMessageImpl();
      instance.setCreatedAt(template.getCreatedAt());
      instance.setLastModifiedAt(template.getLastModifiedAt());
      instance.setId(template.getId());
      instance.setVersion(template.getVersion());
      instance.setCreatedBy(template.getCreatedBy());
      instance.setLastModifiedBy(template.getLastModifiedBy());
      instance.setSequenceNumber(template.getSequenceNumber());
      instance.setResource(template.getResource());
      instance.setResourceUserProvidedIdentifiers(template.getResourceUserProvidedIdentifiers());
      instance.setResourceVersion(template.getResourceVersion());
      instance.setCategory(template.getCategory());
      return instance;
   }

}