package com.commercetools.models.error;

import com.commercetools.models.error.ErrorObject;
import com.commercetools.models.product.Attribute;
import com.commercetools.models.error.DuplicateAttributeValueErrorImpl;

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
@JsonDeserialize(as = DuplicateAttributeValueErrorImpl.class)
public interface DuplicateAttributeValueError extends ErrorObject {

   
   @NotNull
   @Valid
   @JsonProperty("attribute")
   public Attribute getAttribute();

   public void setAttribute(final Attribute attribute);
   
   public static DuplicateAttributeValueErrorImpl of(){
      return new DuplicateAttributeValueErrorImpl();
   }
   

   public static DuplicateAttributeValueErrorImpl of(final DuplicateAttributeValueError template) {
      DuplicateAttributeValueErrorImpl instance = new DuplicateAttributeValueErrorImpl();
      instance.setMessage(template.getMessage());
      instance.setAttribute(template.getAttribute());
      return instance;
   }

}