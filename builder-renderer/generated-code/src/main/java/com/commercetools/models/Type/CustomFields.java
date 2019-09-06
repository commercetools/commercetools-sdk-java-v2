package com.commercetools.models.Type;

import com.commercetools.models.Type.FieldContainer;
import com.commercetools.models.Type.TypeReference;
import com.commercetools.models.Type.CustomFieldsImpl;

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
@JsonDeserialize(as = CustomFieldsImpl.class)
public interface CustomFields  {

   
   @NotNull
   @Valid
   @JsonProperty("type")
   public TypeReference getType();
   
   @NotNull
   @Valid
   @JsonProperty("fields")
   public FieldContainer getFields();

   public void setType(final TypeReference type);
   
   public void setFields(final FieldContainer fields);
   
   public static CustomFieldsImpl of(){
      return new CustomFieldsImpl();
   }
   

   public static CustomFieldsImpl of(final CustomFields template) {
      CustomFieldsImpl instance = new CustomFieldsImpl();
      instance.setFields(template.getFields());
      instance.setType(template.getType());
      return instance;
   }

}