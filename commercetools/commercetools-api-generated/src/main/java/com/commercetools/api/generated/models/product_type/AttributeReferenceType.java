package com.commercetools.api.generated.models.product_type;

import com.commercetools.api.generated.models.common.ReferenceTypeId;
import com.commercetools.api.generated.models.product_type.AttributeType;
import com.commercetools.api.generated.models.product_type.AttributeReferenceTypeImpl;

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
@JsonDeserialize(as = AttributeReferenceTypeImpl.class)
public interface AttributeReferenceType extends AttributeType {

   
   @NotNull
   @JsonProperty("referenceTypeId")
   public ReferenceTypeId getReferenceTypeId();

   public void setReferenceTypeId(final ReferenceTypeId referenceTypeId);
   
   public static AttributeReferenceTypeImpl of(){
      return new AttributeReferenceTypeImpl();
   }
   

   public static AttributeReferenceTypeImpl of(final AttributeReferenceType template) {
      AttributeReferenceTypeImpl instance = new AttributeReferenceTypeImpl();
      instance.setReferenceTypeId(template.getReferenceTypeId());
      return instance;
   }

}