package com.commercetools.models.error;

import com.commercetools.models.common.ReferenceTypeId;
import com.commercetools.models.error.ErrorObject;
import com.commercetools.models.error.ReferenceExistsErrorImpl;

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
@JsonDeserialize(as = ReferenceExistsErrorImpl.class)
public interface ReferenceExistsError extends ErrorObject {

   
   
   @JsonProperty("referencedBy")
   public ReferenceTypeId getReferencedBy();

   public void setReferencedBy(final ReferenceTypeId referencedBy);
   
   public static ReferenceExistsErrorImpl of(){
      return new ReferenceExistsErrorImpl();
   }
   

   public static ReferenceExistsErrorImpl of(final ReferenceExistsError template) {
      ReferenceExistsErrorImpl instance = new ReferenceExistsErrorImpl();
      instance.setMessage(template.getMessage());
      instance.setReferencedBy(template.getReferencedBy());
      return instance;
   }

}