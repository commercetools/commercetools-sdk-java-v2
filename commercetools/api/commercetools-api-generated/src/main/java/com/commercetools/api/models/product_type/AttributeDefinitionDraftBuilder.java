package com.commercetools.api.models.product_type;

import com.commercetools.api.models.common.LocalizedString;
import com.commercetools.api.models.product_type.AttributeConstraintEnum;
import com.commercetools.api.models.product_type.AttributeType;
import com.commercetools.api.models.product_type.TextInputHint;
import com.commercetools.api.models.product_type.AttributeDefinitionDraft;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class AttributeDefinitionDraftBuilder {


   private Boolean isRequired;

   @Nullable
   private com.commercetools.api.models.product_type.AttributeConstraintEnum attributeConstraint;


   private String name;

   @Nullable
   private com.commercetools.api.models.product_type.TextInputHint inputHint;

   @Nullable
   private Boolean isSearchable;


   private com.commercetools.api.models.common.LocalizedString label;


   private com.commercetools.api.models.product_type.AttributeType type;

   @Nullable
   private com.commercetools.api.models.common.LocalizedString inputTip;

   public AttributeDefinitionDraftBuilder isRequired( final Boolean isRequired) {
      this.isRequired = isRequired;
      return this;
   }

   public AttributeDefinitionDraftBuilder attributeConstraint(@Nullable final com.commercetools.api.models.product_type.AttributeConstraintEnum attributeConstraint) {
      this.attributeConstraint = attributeConstraint;
      return this;
   }

   public AttributeDefinitionDraftBuilder name( final String name) {
      this.name = name;
      return this;
   }

   public AttributeDefinitionDraftBuilder inputHint(@Nullable final com.commercetools.api.models.product_type.TextInputHint inputHint) {
      this.inputHint = inputHint;
      return this;
   }

   public AttributeDefinitionDraftBuilder isSearchable(@Nullable final Boolean isSearchable) {
      this.isSearchable = isSearchable;
      return this;
   }

   public AttributeDefinitionDraftBuilder label( final com.commercetools.api.models.common.LocalizedString label) {
      this.label = label;
      return this;
   }

   public AttributeDefinitionDraftBuilder type( final com.commercetools.api.models.product_type.AttributeType type) {
      this.type = type;
      return this;
   }

   public AttributeDefinitionDraftBuilder inputTip(@Nullable final com.commercetools.api.models.common.LocalizedString inputTip) {
      this.inputTip = inputTip;
      return this;
   }


   public Boolean getIsRequired(){
      return this.isRequired;
   }

   @Nullable
   public com.commercetools.api.models.product_type.AttributeConstraintEnum getAttributeConstraint(){
      return this.attributeConstraint;
   }


   public String getName(){
      return this.name;
   }

   @Nullable
   public com.commercetools.api.models.product_type.TextInputHint getInputHint(){
      return this.inputHint;
   }

   @Nullable
   public Boolean getIsSearchable(){
      return this.isSearchable;
   }


   public com.commercetools.api.models.common.LocalizedString getLabel(){
      return this.label;
   }


   public com.commercetools.api.models.product_type.AttributeType getType(){
      return this.type;
   }

   @Nullable
   public com.commercetools.api.models.common.LocalizedString getInputTip(){
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
