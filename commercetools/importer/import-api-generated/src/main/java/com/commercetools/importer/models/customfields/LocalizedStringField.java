package com.commercetools.importer.models.customfields;

import com.commercetools.importer.models.common.LocalizedString;
import com.commercetools.importer.models.customfields.CustomField;
import com.commercetools.importer.models.customfields.LocalizedStringFieldImpl;

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
*  <p>A field with a localized string value.</p>
*/
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = LocalizedStringFieldImpl.class)
public interface LocalizedStringField extends CustomField {

   
   @NotNull
   @Valid
   @JsonProperty("value")
   public LocalizedString getValue();

   public void setValue(final LocalizedString value);
   
   public static LocalizedStringFieldImpl of(){
      return new LocalizedStringFieldImpl();
   }
   

   public static LocalizedStringFieldImpl of(final LocalizedStringField template) {
      LocalizedStringFieldImpl instance = new LocalizedStringFieldImpl();
      instance.setValue(template.getValue());
      return instance;
   }

}