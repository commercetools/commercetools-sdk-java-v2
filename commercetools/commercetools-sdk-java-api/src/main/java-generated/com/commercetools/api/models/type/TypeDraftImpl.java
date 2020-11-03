package com.commercetools.api.models.type;

import com.commercetools.api.models.common.LocalizedString;
import com.commercetools.api.models.type.FieldDefinition;
import com.commercetools.api.models.type.ResourceTypeId;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class TypeDraftImpl implements TypeDraft {

    private String key;
    
    private com.commercetools.api.models.common.LocalizedString name;
    
    private com.commercetools.api.models.common.LocalizedString description;
    
    private java.util.List<com.commercetools.api.models.type.ResourceTypeId> resourceTypeIds;
    
    private java.util.List<com.commercetools.api.models.type.FieldDefinition> fieldDefinitions;

    @JsonCreator
    TypeDraftImpl(@JsonProperty("key") final String key, @JsonProperty("name") final com.commercetools.api.models.common.LocalizedString name, @JsonProperty("description") final com.commercetools.api.models.common.LocalizedString description, @JsonProperty("resourceTypeIds") final java.util.List<com.commercetools.api.models.type.ResourceTypeId> resourceTypeIds, @JsonProperty("fieldDefinitions") final java.util.List<com.commercetools.api.models.type.FieldDefinition> fieldDefinitions) {
        this.key = key;
        this.name = name;
        this.description = description;
        this.resourceTypeIds = resourceTypeIds;
        this.fieldDefinitions = fieldDefinitions;
    }
    public TypeDraftImpl() {
       
    }

    
    public String getKey(){
        return this.key;
    }
    
    
    public com.commercetools.api.models.common.LocalizedString getName(){
        return this.name;
    }
    
    
    public com.commercetools.api.models.common.LocalizedString getDescription(){
        return this.description;
    }
    
    /**
    *  <p>The IDs of the resources that can be customized with this type.</p>
    */
    public java.util.List<com.commercetools.api.models.type.ResourceTypeId> getResourceTypeIds(){
        return this.resourceTypeIds;
    }
    
    
    public java.util.List<com.commercetools.api.models.type.FieldDefinition> getFieldDefinitions(){
        return this.fieldDefinitions;
    }

    public void setKey(final String key){
        this.key = key;
    }
    
    public void setName(final com.commercetools.api.models.common.LocalizedString name){
        this.name = name;
    }
    
    public void setDescription(final com.commercetools.api.models.common.LocalizedString description){
        this.description = description;
    }
    
    public void setResourceTypeIds(final com.commercetools.api.models.type.ResourceTypeId ...resourceTypeIds){
       this.resourceTypeIds = new ArrayList<>(Arrays.asList(resourceTypeIds));
    }
    
    public void setResourceTypeIds(final java.util.List<com.commercetools.api.models.type.ResourceTypeId> resourceTypeIds){
       this.resourceTypeIds = resourceTypeIds;
    }
    
    public void setFieldDefinitions(final com.commercetools.api.models.type.FieldDefinition ...fieldDefinitions){
       this.fieldDefinitions = new ArrayList<>(Arrays.asList(fieldDefinitions));
    }
    
    public void setFieldDefinitions(final java.util.List<com.commercetools.api.models.type.FieldDefinition> fieldDefinitions){
       this.fieldDefinitions = fieldDefinitions;
    }

}
