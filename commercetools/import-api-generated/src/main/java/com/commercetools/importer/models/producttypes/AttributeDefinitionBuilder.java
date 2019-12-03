package com.commercetools.importer.models.producttypes;

import com.commercetools.importer.models.common.LocalizedString;
import com.commercetools.importer.models.producttypes.AttributeConstraintEnum;
import com.commercetools.importer.models.producttypes.AttributeType;
import com.commercetools.importer.models.producttypes.TextInputHint;
import com.commercetools.importer.models.producttypes.AttributeDefinition;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class AttributeDefinitionBuilder {
   
   
   private Boolean isRequired;
   
   @Nullable
   private com.commercetools.importer.models.producttypes.AttributeConstraintEnum attributeConstraint;
   
   
   private String name;
   
   @Nullable
   private com.commercetools.importer.models.producttypes.TextInputHint inputHint;
   
   @Nullable
   private Boolean isSearchable;
   
   
   private com.commercetools.importer.models.common.LocalizedString label;
   
   
   private com.commercetools.importer.models.producttypes.AttributeType type;
   
   @Nullable
   private com.commercetools.importer.models.common.LocalizedString inputTip;
   
   public AttributeDefinitionBuilder isRequired( final Boolean isRequired) {
      this.isRequired = isRequired;
      return this;
   }
   
   public AttributeDefinitionBuilder attributeConstraint(@Nullable final com.commercetools.importer.models.producttypes.AttributeConstraintEnum attributeConstraint) {
      this.attributeConstraint = attributeConstraint;
      return this;
   }
   
   public AttributeDefinitionBuilder name( final String name) {
      this.name = name;
      return this;
   }
   
   public AttributeDefinitionBuilder inputHint(@Nullable final com.commercetools.importer.models.producttypes.TextInputHint inputHint) {
      this.inputHint = inputHint;
      return this;
   }
   
   public AttributeDefinitionBuilder isSearchable(@Nullable final Boolean isSearchable) {
      this.isSearchable = isSearchable;
      return this;
   }
   
   public AttributeDefinitionBuilder label( final com.commercetools.importer.models.common.LocalizedString label) {
      this.label = label;
      return this;
   }
   
   public AttributeDefinitionBuilder type( final com.commercetools.importer.models.producttypes.AttributeType type) {
      this.type = type;
      return this;
   }
   
   public AttributeDefinitionBuilder inputTip(@Nullable final com.commercetools.importer.models.common.LocalizedString inputTip) {
      this.inputTip = inputTip;
      return this;
   }
   
   
   public Boolean getIsRequired(){
      return this.isRequired;
   }
   
   @Nullable
   public com.commercetools.importer.models.producttypes.AttributeConstraintEnum getAttributeConstraint(){
      return this.attributeConstraint;
   }
   
   
   public String getName(){
      return this.name;
   }
   
   @Nullable
   public com.commercetools.importer.models.producttypes.TextInputHint getInputHint(){
      return this.inputHint;
   }
   
   @Nullable
   public Boolean getIsSearchable(){
      return this.isSearchable;
   }
   
   
   public com.commercetools.importer.models.common.LocalizedString getLabel(){
      return this.label;
   }
   
   
   public com.commercetools.importer.models.producttypes.AttributeType getType(){
      return this.type;
   }
   
   @Nullable
   public com.commercetools.importer.models.common.LocalizedString getInputTip(){
      return this.inputTip;
   }

   public AttributeDefinition build() {
       return new AttributeDefinitionImpl(isRequired, attributeConstraint, name, inputHint, isSearchable, label, type, inputTip);
   }
   
   public static AttributeDefinitionBuilder of() {
      return new AttributeDefinitionBuilder();
   }
   
   public static AttributeDefinitionBuilder of(final AttributeDefinition template) {
      AttributeDefinitionBuilder builder = new AttributeDefinitionBuilder();
      builder.isRequired = template.getIsRequired();
      builder.attributeConstraint = template.getAttributeConstraint();
      builder.name = template.getName();
      builder.inputHint = template.getInputHint();
      builder.isSearchable = template.getIsSearchable();
      builder.label = template.getLabel();
      builder.type = template.getType();
      builder.inputTip = template.getInputTip();
      return builder;
   }
   
}