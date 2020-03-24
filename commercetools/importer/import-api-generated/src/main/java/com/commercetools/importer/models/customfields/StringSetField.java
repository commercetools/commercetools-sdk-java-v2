package com.commercetools.importer.models.customfields;

import com.commercetools.importer.models.customfields.CustomField;
import com.commercetools.importer.models.customfields.StringSetFieldImpl;

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
*  <p>A field with a string set value.</p>
*/
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = StringSetFieldImpl.class)
public interface StringSetField extends CustomField {

   
   @NotNull
   @JsonProperty("value")
   public List<String> getValue();

   public void setValue(final List<String> value);
   
   public static StringSetFieldImpl of(){
      return new StringSetFieldImpl();
   }
   

   public static StringSetFieldImpl of(final StringSetField template) {
      StringSetFieldImpl instance = new StringSetFieldImpl();
      instance.setValue(template.getValue());
      return instance;
   }

}