package com.commercetools.importer.models.customfields;

import com.commercetools.importer.models.common.TypeKeyReference;
import com.commercetools.importer.models.customfields.FieldContainer;
import com.commercetools.importer.models.customfields.CustomImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import java.io.IOException;

/**
*  <p>The representation to be sent to the server when creating a resource with custom fields.</p>
*/
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = CustomImpl.class)
public interface Custom  {

   /**
   *  <p>The type that provides the field definitions for this object.</p>
   */
   @NotNull
   @Valid
   @JsonProperty("type")
   public TypeKeyReference getType();
   /**
   *  <p>The custom fields of this object.</p>
   */
   @Valid
   @JsonProperty("fields")
   public FieldContainer getFields();

   public void setType(final TypeKeyReference type);
   
   public void setFields(final FieldContainer fields);
   
   public static CustomImpl of(){
      return new CustomImpl();
   }
   

   public static CustomImpl of(final Custom template) {
      CustomImpl instance = new CustomImpl();
      instance.setType(template.getType());
      instance.setFields(template.getFields());
      return instance;
   }

}