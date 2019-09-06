package com.commercetools.models.Type;

import com.commercetools.models.Common.LocalizedString;
import com.commercetools.models.Type.FieldDefinition;
import com.commercetools.models.Type.ResourceTypeId;
import java.lang.String;
import com.commercetools.models.Type.TypeDraft;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class TypeDraftBuilder {
   
   
   private com.commercetools.models.Common.LocalizedString name;
   
   @Nullable
   private java.util.List<com.commercetools.models.Type.FieldDefinition> fieldDefinitions;
   
   @Nullable
   private com.commercetools.models.Common.LocalizedString description;
   
   
   private java.lang.String key;
   
   
   private java.util.List<com.commercetools.models.Type.ResourceTypeId> resourceTypeIds;
   
   public TypeDraftBuilder name( final com.commercetools.models.Common.LocalizedString name) {
      this.name = name;
      return this;
   }
   
   public TypeDraftBuilder fieldDefinitions(@Nullable final java.util.List<com.commercetools.models.Type.FieldDefinition> fieldDefinitions) {
      this.fieldDefinitions = fieldDefinitions;
      return this;
   }
   
   public TypeDraftBuilder description(@Nullable final com.commercetools.models.Common.LocalizedString description) {
      this.description = description;
      return this;
   }
   
   public TypeDraftBuilder key( final java.lang.String key) {
      this.key = key;
      return this;
   }
   
   public TypeDraftBuilder resourceTypeIds( final java.util.List<com.commercetools.models.Type.ResourceTypeId> resourceTypeIds) {
      this.resourceTypeIds = resourceTypeIds;
      return this;
   }
   
   
   public com.commercetools.models.Common.LocalizedString getName(){
      return this.name;
   }
   
   @Nullable
   public java.util.List<com.commercetools.models.Type.FieldDefinition> getFieldDefinitions(){
      return this.fieldDefinitions;
   }
   
   @Nullable
   public com.commercetools.models.Common.LocalizedString getDescription(){
      return this.description;
   }
   
   
   public java.lang.String getKey(){
      return this.key;
   }
   
   
   public java.util.List<com.commercetools.models.Type.ResourceTypeId> getResourceTypeIds(){
      return this.resourceTypeIds;
   }

   public TypeDraft build() {
       return new TypeDraftImpl(name, fieldDefinitions, description, key, resourceTypeIds);
   }
   
   public static TypeDraftBuilder of() {
      return new TypeDraftBuilder();
   }
   
   public static TypeDraftBuilder of(final TypeDraft template) {
      TypeDraftBuilder builder = new TypeDraftBuilder();
      builder.name = template.getName();
      builder.fieldDefinitions = template.getFieldDefinitions();
      builder.description = template.getDescription();
      builder.key = template.getKey();
      builder.resourceTypeIds = template.getResourceTypeIds();
      return builder;
   }
   
}