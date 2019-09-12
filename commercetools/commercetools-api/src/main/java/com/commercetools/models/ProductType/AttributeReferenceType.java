package com.commercetools.models.ProductType;

import com.commercetools.models.Common.ReferenceTypeId;
import com.commercetools.models.ProductType.AttributeType;
import java.lang.String;
import com.commercetools.models.ProductType.AttributeReferenceTypeImpl;

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