package com.commercetools.api.generated.models.type;

import com.commercetools.api.generated.models.common.LocalizedString;
import com.commercetools.api.generated.models.type.FieldDefinition;
import com.commercetools.api.generated.models.type.ResourceTypeId;
import com.commercetools.api.generated.models.type.TypeDraft;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.databind.*;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class TypeDraftBuilder {
   
   
   private com.commercetools.api.generated.models.common.LocalizedString name;
   
   @Nullable
   private java.util.List<com.commercetools.api.generated.models.type.FieldDefinition> fieldDefinitions;
   
   @Nullable
   private com.commercetools.api.generated.models.common.LocalizedString description;
   
   
   private String key;
   
   
   private java.util.List<com.commercetools.api.generated.models.type.ResourceTypeId> resourceTypeIds;
   
   public TypeDraftBuilder name( final com.commercetools.api.generated.models.common.LocalizedString name) {
      this.name = name;
      return this;
   }
   
   public TypeDraftBuilder fieldDefinitions(@Nullable final java.util.List<com.commercetools.api.generated.models.type.FieldDefinition> fieldDefinitions) {
      this.fieldDefinitions = fieldDefinitions;
      return this;
   }
   
   public TypeDraftBuilder description(@Nullable final com.commercetools.api.generated.models.common.LocalizedString description) {
      this.description = description;
      return this;
   }
   
   public TypeDraftBuilder key( final String key) {
      this.key = key;
      return this;
   }
   
   public TypeDraftBuilder resourceTypeIds( final java.util.List<com.commercetools.api.generated.models.type.ResourceTypeId> resourceTypeIds) {
      this.resourceTypeIds = resourceTypeIds;
      return this;
   }
   
   
   public com.commercetools.api.generated.models.common.LocalizedString getName(){
      return this.name;
   }
   
   @Nullable
   public java.util.List<com.commercetools.api.generated.models.type.FieldDefinition> getFieldDefinitions(){
      return this.fieldDefinitions;
   }
   
   @Nullable
   public com.commercetools.api.generated.models.common.LocalizedString getDescription(){
      return this.description;
   }
   
   
   public String getKey(){
      return this.key;
   }
   
   
   public java.util.List<com.commercetools.api.generated.models.type.ResourceTypeId> getResourceTypeIds(){
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