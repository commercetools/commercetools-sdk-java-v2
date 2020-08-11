package com.commercetools.importer.models.productvariants;

import com.commercetools.importer.models.common.KeyReference;
import com.commercetools.importer.models.productvariants.Attribute;
import com.commercetools.importer.models.productvariants.ReferenceAttributeImpl;

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
*  <p>This type represents an attribute which value is a key reference.</p>
*/
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = ReferenceAttributeImpl.class)
public interface ReferenceAttribute extends Attribute {

   /**
   *  <p>References a resource by its key.</p>
   */
   @NotNull
   @Valid
   @JsonProperty("value")
   public KeyReference getValue();

   public void setValue(final KeyReference value);
   
   public static ReferenceAttributeImpl of(){
      return new ReferenceAttributeImpl();
   }
   

   public static ReferenceAttributeImpl of(final ReferenceAttribute template) {
      ReferenceAttributeImpl instance = new ReferenceAttributeImpl();
      instance.setName(template.getName());
      instance.setValue(template.getValue());
      return instance;
   }

}