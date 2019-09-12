package com.commercetools.models.Error;

import com.commercetools.models.Error.ErrorObject;
import com.commercetools.models.Product.Attribute;
import java.lang.String;
import com.commercetools.models.Error.DuplicateAttributeValuesErrorImpl;

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
@JsonDeserialize(as = DuplicateAttributeValuesErrorImpl.class)
public interface DuplicateAttributeValuesError extends ErrorObject {

   
   @NotNull
   @Valid
   @JsonProperty("attributes")
   public List<Attribute> getAttributes();

   public void setAttributes(final List<Attribute> attributes);
   
   public static DuplicateAttributeValuesErrorImpl of(){
      return new DuplicateAttributeValuesErrorImpl();
   }
   

   public static DuplicateAttributeValuesErrorImpl of(final DuplicateAttributeValuesError template) {
      DuplicateAttributeValuesErrorImpl instance = new DuplicateAttributeValuesErrorImpl();
      instance.setMessage(template.getMessage());
      instance.setAttributes(template.getAttributes());
      return instance;
   }

}