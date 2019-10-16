package com.commercetools.api.generated.models.type;

import com.commercetools.api.generated.models.common.ReferenceTypeId;
import com.commercetools.api.generated.models.type.FieldType;
import com.commercetools.api.generated.models.type.CustomFieldReferenceTypeImpl;

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
@JsonDeserialize(as = CustomFieldReferenceTypeImpl.class)
public interface CustomFieldReferenceType extends FieldType {

   
   @NotNull
   @JsonProperty("referenceTypeId")
   public ReferenceTypeId getReferenceTypeId();

   public void setReferenceTypeId(final ReferenceTypeId referenceTypeId);
   
   public static CustomFieldReferenceTypeImpl of(){
      return new CustomFieldReferenceTypeImpl();
   }
   

   public static CustomFieldReferenceTypeImpl of(final CustomFieldReferenceType template) {
      CustomFieldReferenceTypeImpl instance = new CustomFieldReferenceTypeImpl();
      instance.setReferenceTypeId(template.getReferenceTypeId());
      return instance;
   }

}