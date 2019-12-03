package com.commercetools.importer.models.productvariants;

import com.commercetools.importer.models.productvariants.Attribute;
import com.commercetools.importer.models.productvariants.BooleanAttributeImpl;

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
*  <p>This type represents an attribute which value is either &quot;true&quot; or &quot;false&quot;.</p>
*/
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = BooleanAttributeImpl.class)
public interface BooleanAttribute extends Attribute {

   
   @NotNull
   @JsonProperty("value")
   public Boolean getValue();

   public void setValue(final Boolean value);
   
   public static BooleanAttributeImpl of(){
      return new BooleanAttributeImpl();
   }
   

   public static BooleanAttributeImpl of(final BooleanAttribute template) {
      BooleanAttributeImpl instance = new BooleanAttributeImpl();
      instance.setName(template.getName());
      instance.setValue(template.getValue());
      return instance;
   }

}