package com.commercetools.api.generated.models.product_type;

import com.commercetools.api.generated.models.common.LocalizedString;
import com.commercetools.api.generated.models.product_type.AttributeConstraintEnum;
import com.commercetools.api.generated.models.product_type.AttributeType;
import com.commercetools.api.generated.models.product_type.TextInputHint;
import com.commercetools.api.generated.models.product_type.AttributeDefinition;
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
   
   
   private com.commercetools.api.generated.models.product_type.AttributeConstraintEnum attributeConstraint;
   
   
   private String name;
   
   
   private com.commercetools.api.generated.models.product_type.TextInputHint inputHint;
   
   
   private Boolean isSearchable;
   
   
   private com.commercetools.api.generated.models.common.LocalizedString label;
   
   
   private com.commercetools.api.generated.models.product_type.AttributeType type;
   
   @Nullable
   private com.commercetools.api.generated.models.common.LocalizedString inputTip;
   
   public AttributeDefinitionBuilder isRequired( final Boolean isRequired) {
      this.isRequired = isRequired;
      return this;
   }
   
   public AttributeDefinitionBuilder attributeConstraint( final com.commercetools.api.generated.models.product_type.AttributeConstraintEnum attributeConstraint) {
      this.attributeConstraint = attributeConstraint;
      return this;
   }
   
   public AttributeDefinitionBuilder name( final String name) {
      this.name = name;
      return this;
   }
   
   public AttributeDefinitionBuilder inputHint( final com.commercetools.api.generated.models.product_type.TextInputHint inputHint) {
      this.inputHint = inputHint;
      return this;
   }
   
   public AttributeDefinitionBuilder isSearchable( final Boolean isSearchable) {
      this.isSearchable = isSearchable;
      return this;
   }
   
   public AttributeDefinitionBuilder label( final com.commercetools.api.generated.models.common.LocalizedString label) {
      this.label = label;
      return this;
   }
   
   public AttributeDefinitionBuilder type( final com.commercetools.api.generated.models.product_type.AttributeType type) {
      this.type = type;
      return this;
   }
   
   public AttributeDefinitionBuilder inputTip(@Nullable final com.commercetools.api.generated.models.common.LocalizedString inputTip) {
      this.inputTip = inputTip;
      return this;
   }
   
   
   public Boolean getIsRequired(){
      return this.isRequired;
   }
   
   
   public com.commercetools.api.generated.models.product_type.AttributeConstraintEnum getAttributeConstraint(){
      return this.attributeConstraint;
   }
   
   
   public String getName(){
      return this.name;
   }
   
   
   public com.commercetools.api.generated.models.product_type.TextInputHint getInputHint(){
      return this.inputHint;
   }
   
   
   public Boolean getIsSearchable(){
      return this.isSearchable;
   }
   
   
   public com.commercetools.api.generated.models.common.LocalizedString getLabel(){
      return this.label;
   }
   
   
   public com.commercetools.api.generated.models.product_type.AttributeType getType(){
      return this.type;
   }
   
   @Nullable
   public com.commercetools.api.generated.models.common.LocalizedString getInputTip(){
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