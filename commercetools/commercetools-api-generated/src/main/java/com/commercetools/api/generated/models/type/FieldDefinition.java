package com.commercetools.api.generated.models.type;

import com.commercetools.api.generated.models.common.LocalizedString;
import com.commercetools.api.generated.models.type.FieldType;
import com.commercetools.api.generated.models.type.TypeTextInputHint;
import com.commercetools.api.generated.models.type.FieldDefinitionImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
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
@JsonDeserialize(as = FieldDefinitionImpl.class)
public interface FieldDefinition  {

   /**
   *  <p>Describes the type of the field.</p>
   */
   @NotNull
   @Valid
   @JsonProperty("type")
   public FieldType getType();
   /**
   *  <p>The name of the field.
   *  The name must be between two and 36 characters long and can contain the ASCII letters A to Z in lowercase or uppercase, digits, underscores (<code>_</code>) and the hyphen-minus (<code>-</code>).
   *  The name must be unique for a given resource type ID.
   *  In case there is a field with the same name in another type it has to have the same FieldType also.</p>
   */
   @NotNull
   @JsonProperty("name")
   public String getName();
   /**
   *  <p>A human-readable label for the field.</p>
   */
   @NotNull
   @Valid
   @JsonProperty("label")
   public LocalizedString getLabel();
   /**
   *  <p>Whether the field is required to have a value.</p>
   */
   @NotNull
   @JsonProperty("required")
   public Boolean getRequired();
   /**
   *  <p>Provides a visual representation type for this field.
   *  It is only relevant for string-based field types like StringType and LocalizedStringType.</p>
   */
   
   @JsonProperty("inputHint")
   public TypeTextInputHint getInputHint();

   public void setType(final FieldType type);
   
   public void setName(final String name);
   
   public void setLabel(final LocalizedString label);
   
   public void setRequired(final Boolean required);
   
   public void setInputHint(final TypeTextInputHint inputHint);
   
   public static FieldDefinitionImpl of(){
      return new FieldDefinitionImpl();
   }
   

   public static FieldDefinitionImpl of(final FieldDefinition template) {
      FieldDefinitionImpl instance = new FieldDefinitionImpl();
      instance.setName(template.getName());
      instance.setInputHint(template.getInputHint());
      instance.setLabel(template.getLabel());
      instance.setType(template.getType());
      instance.setRequired(template.getRequired());
      return instance;
   }

}