package com.commercetools.models.Type;

import com.commercetools.models.Common.LocalizedString;
import com.commercetools.models.Common.LoggedResource;
import com.commercetools.models.Type.FieldDefinition;
import com.commercetools.models.Type.ResourceTypeId;
import java.lang.String;
import com.commercetools.models.Type.TypeImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import json.CommercetoolsJsonUtils;
import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = TypeImpl.class)
public interface Type extends LoggedResource {

   
   @NotNull
   @JsonProperty("key")
   public String getKey();
   
   @NotNull
   @Valid
   @JsonProperty("name")
   public LocalizedString getName();
   
   @Valid
   @JsonProperty("description")
   public LocalizedString getDescription();
   
   @NotNull
   @JsonProperty("resourceTypeIds")
   public List<ResourceTypeId> getResourceTypeIds();
   
   @NotNull
   @Valid
   @JsonProperty("fieldDefinitions")
   public List<FieldDefinition> getFieldDefinitions();

   public void setKey(final String key);
   
   public void setName(final LocalizedString name);
   
   public void setDescription(final LocalizedString description);
   
   public void setResourceTypeIds(final List<ResourceTypeId> resourceTypeIds);
   
   public void setFieldDefinitions(final List<FieldDefinition> fieldDefinitions);
   
   public static TypeImpl of(){
      return new TypeImpl();
   }
   

   public static TypeImpl of(final Type template) {
      TypeImpl instance = new TypeImpl();
      instance.setCreatedAt(template.getCreatedAt());
      instance.setLastModifiedAt(template.getLastModifiedAt());
      instance.setId(template.getId());
      instance.setVersion(template.getVersion());
      instance.setCreatedBy(template.getCreatedBy());
      instance.setLastModifiedBy(template.getLastModifiedBy());
      instance.setName(template.getName());
      instance.setFieldDefinitions(template.getFieldDefinitions());
      instance.setDescription(template.getDescription());
      instance.setKey(template.getKey());
      instance.setResourceTypeIds(template.getResourceTypeIds());
      return instance;
   }

}