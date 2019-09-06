package com.commercetools.models.Type;

import com.commercetools.models.Common.ReferenceTypeId;
import com.commercetools.models.Type.FieldType;
import java.lang.String;
import com.commercetools.models.Type.CustomFieldReferenceTypeImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import json.CommercetoolsJsonUtils;
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