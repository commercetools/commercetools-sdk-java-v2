package com.commercetools.api.models.type;

import com.commercetools.api.models.common.LocalizedString;
import com.commercetools.api.models.type.FieldType;
import com.commercetools.api.models.type.TypeTextInputHint;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class FieldDefinitionImpl implements FieldDefinition {

   private String name;

   private com.commercetools.api.models.type.TypeTextInputHint inputHint;

   private com.commercetools.api.models.common.LocalizedString label;

   private com.commercetools.api.models.type.FieldType type;

   private Boolean required;

   @JsonCreator
   FieldDefinitionImpl(@JsonProperty("name") final String name, @JsonProperty("inputHint") final com.commercetools.api.models.type.TypeTextInputHint inputHint, @JsonProperty("label") final com.commercetools.api.models.common.LocalizedString label, @JsonProperty("type") final com.commercetools.api.models.type.FieldType type, @JsonProperty("required") final Boolean required) {
      this.name = name;
      this.inputHint = inputHint;
      this.label = label;
      this.type = type;
      this.required = required;
   }
   public FieldDefinitionImpl() {

   }

   /**
   *  <p>The name of the field.
   *  The name must be between two and 36 characters long and can contain the ASCII letters A to Z in lowercase or uppercase, digits, underscores (<code>_</code>) and the hyphen-minus (<code>-</code>).
   *  The name must be unique for a given resource type ID.
   *  In case there is a field with the same name in another type it has to have the same FieldType also.</p>
   */
   public String getName(){
      return this.name;
   }

   /**
   *  <p>Provides a visual representation type for this field.
   *  It is only relevant for string-based field types like StringType and LocalizedStringType.</p>
   */
   public com.commercetools.api.models.type.TypeTextInputHint getInputHint(){
      return this.inputHint;
   }

   /**
   *  <p>A human-readable label for the field.</p>
   */
   public com.commercetools.api.models.common.LocalizedString getLabel(){
      return this.label;
   }

   /**
   *  <p>Describes the type of the field.</p>
   */
   public com.commercetools.api.models.type.FieldType getType(){
      return this.type;
   }

   /**
   *  <p>Whether the field is required to have a value.</p>
   */
   public Boolean getRequired(){
      return this.required;
   }

   public void setName(final String name){
      this.name = name;
   }

   public void setInputHint(final com.commercetools.api.models.type.TypeTextInputHint inputHint){
      this.inputHint = inputHint;
   }

   public void setLabel(final com.commercetools.api.models.common.LocalizedString label){
      this.label = label;
   }

   public void setType(final com.commercetools.api.models.type.FieldType type){
      this.type = type;
   }

   public void setRequired(final Boolean required){
      this.required = required;
   }

}
