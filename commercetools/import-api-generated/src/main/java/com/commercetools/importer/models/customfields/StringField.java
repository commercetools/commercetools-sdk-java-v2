package com.commercetools.importer.models.customfields;

import com.commercetools.importer.models.customfields.CustomField;
import com.commercetools.importer.models.customfields.StringFieldImpl;

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
*  <p>A field with a string value.</p>
*/
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = StringFieldImpl.class)
public interface StringField extends CustomField {

   
   @NotNull
   @JsonProperty("value")
   public String getValue();

   public void setValue(final String value);
   
   public static StringFieldImpl of(){
      return new StringFieldImpl();
   }
   

   public static StringFieldImpl of(final StringField template) {
      StringFieldImpl instance = new StringFieldImpl();
      instance.setValue(template.getValue());
      return instance;
   }

}