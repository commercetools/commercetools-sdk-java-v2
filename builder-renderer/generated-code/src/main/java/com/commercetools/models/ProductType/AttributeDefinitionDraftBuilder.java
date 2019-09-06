package com.commercetools.models.ProductType;

import com.commercetools.models.Common.LocalizedString;
import com.commercetools.models.ProductType.AttributeConstraintEnum;
import com.commercetools.models.ProductType.AttributeType;
import com.commercetools.models.ProductType.TextInputHint;
import java.lang.Boolean;
import java.lang.String;
import com.commercetools.models.ProductType.AttributeDefinitionDraft;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class AttributeDefinitionDraftBuilder {
   
   
   private java.lang.Boolean isRequired;
   
   @Nullable
   private com.commercetools.models.ProductType.AttributeConstraintEnum attributeConstraint;
   
   
   private java.lang.String name;
   
   @Nullable
   private com.commercetools.models.ProductType.TextInputHint inputHint;
   
   @Nullable
   private java.lang.Boolean isSearchable;
   
   
   private com.commercetools.models.Common.LocalizedString label;
   
   
   private com.commercetools.models.ProductType.AttributeType type;
   
   @Nullable
   private com.commercetools.models.Common.LocalizedString inputTip;
   
   public AttributeDefinitionDraftBuilder isRequired( final java.lang.Boolean isRequired) {
      this.isRequired = isRequired;
      return this;
   }
   
   public AttributeDefinitionDraftBuilder attributeConstraint(@Nullable final com.commercetools.models.ProductType.AttributeConstraintEnum attributeConstraint) {
      this.attributeConstraint = attributeConstraint;
      return this;
   }
   
   public AttributeDefinitionDraftBuilder name( final java.lang.String name) {
      this.name = name;
      return this;
   }
   
   public AttributeDefinitionDraftBuilder inputHint(@Nullable final com.commercetools.models.ProductType.TextInputHint inputHint) {
      this.inputHint = inputHint;
      return this;
   }
   
   public AttributeDefinitionDraftBuilder isSearchable(@Nullable final java.lang.Boolean isSearchable) {
      this.isSearchable = isSearchable;
      return this;
   }
   
   public AttributeDefinitionDraftBuilder label( final com.commercetools.models.Common.LocalizedString label) {
      this.label = label;
      return this;
   }
   
   public AttributeDefinitionDraftBuilder type( final com.commercetools.models.ProductType.AttributeType type) {
      this.type = type;
      return this;
   }
   
   public AttributeDefinitionDraftBuilder inputTip(@Nullable final com.commercetools.models.Common.LocalizedString inputTip) {
      this.inputTip = inputTip;
      return this;
   }
   
   
   public java.lang.Boolean getIsRequired(){
      return this.isRequired;
   }
   
   @Nullable
   public com.commercetools.models.ProductType.AttributeConstraintEnum getAttributeConstraint(){
      return this.attributeConstraint;
   }
   
   
   public java.lang.String getName(){
      return this.name;
   }
   
   @Nullable
   public com.commercetools.models.ProductType.TextInputHint getInputHint(){
      return this.inputHint;
   }
   
   @Nullable
   public java.lang.Boolean getIsSearchable(){
      return this.isSearchable;
   }
   
   
   public com.commercetools.models.Common.LocalizedString getLabel(){
      return this.label;
   }
   
   
   public com.commercetools.models.ProductType.AttributeType getType(){
      return this.type;
   }
   
   @Nullable
   public com.commercetools.models.Common.LocalizedString getInputTip(){
      return this.inputTip;
   }

   public AttributeDefinitionDraft build() {
       return new AttributeDefinitionDraftImpl(isRequired, attributeConstraint, name, inputHint, isSearchable, label, type, inputTip);
   }
   
   public static AttributeDefinitionDraftBuilder of() {
      return new AttributeDefinitionDraftBuilder();
   }
   
   public static AttributeDefinitionDraftBuilder of(final AttributeDefinitionDraft template) {
      AttributeDefinitionDraftBuilder builder = new AttributeDefinitionDraftBuilder();
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