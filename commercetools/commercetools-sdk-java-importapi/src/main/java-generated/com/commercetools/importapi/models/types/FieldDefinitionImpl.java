package com.commercetools.importapi.models.types;

import com.commercetools.importapi.models.common.LocalizedString;
import com.commercetools.importapi.models.types.FieldType;
import com.commercetools.importapi.models.types.TypeTextInputHint;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.ModelBase;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 *  <p>Defines a Custom Field and its meta-information. Maps to <code>Type.FieldDefinition</code>.</p>
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class FieldDefinitionImpl implements FieldDefinition, ModelBase {

    
    private com.commercetools.importapi.models.types.FieldType type;
    
    
    private String name;
    
    
    private com.commercetools.importapi.models.common.LocalizedString label;
    
    
    private Boolean required;
    
    
    private com.commercetools.importapi.models.types.TypeTextInputHint inputHint;

    /**
     * create instance with all properties
     */
    @JsonCreator
    FieldDefinitionImpl(@JsonProperty("type") final com.commercetools.importapi.models.types.FieldType type, @JsonProperty("name") final String name, @JsonProperty("label") final com.commercetools.importapi.models.common.LocalizedString label, @JsonProperty("required") final Boolean required, @JsonProperty("inputHint") final com.commercetools.importapi.models.types.TypeTextInputHint inputHint) {
        this.type = type;
        this.name = name;
        this.label = label;
        this.required = required;
        this.inputHint = inputHint;
    }
    /**
     * create empty instance
     */
    public FieldDefinitionImpl() {
    }

    /**
     *  <p>Data type of the Custom Field to define.</p>
     */
    
    public com.commercetools.importapi.models.types.FieldType getType(){
        return this.type;
    }
    
    /**
     *  <p>Name of the Custom Field to define. Must be unique for a given ResourceTypeId. In case there is a FieldDefinition with the same <code>name</code> in another Type, both FieldDefinitions must have the same <code>type</code>. This value cannot be changed after the Type is imported.</p>
     */
    
    public String getName(){
        return this.name;
    }
    
    /**
     *  <p>A human-readable label for the field.</p>
     */
    
    public com.commercetools.importapi.models.common.LocalizedString getLabel(){
        return this.label;
    }
    
    /**
     *  <p>Defines whether the field is required to have a value. This value cannot be changed after the Type is imported.</p>
     */
    
    public Boolean getRequired(){
        return this.required;
    }
    
    /**
     *  <p>Provides a visual representation type for this field. It is only relevant for string-based field types like CustomFieldStringType and CustomFieldLocalizedStringType.</p>
     */
    
    public com.commercetools.importapi.models.types.TypeTextInputHint getInputHint(){
        return this.inputHint;
    }

    
    public void setType(final com.commercetools.importapi.models.types.FieldType type){
        this.type = type;
    }
    
    
    public void setName(final String name){
        this.name = name;
    }
    
    
    public void setLabel(final com.commercetools.importapi.models.common.LocalizedString label){
        this.label = label;
    }
    
    
    public void setRequired(final Boolean required){
        this.required = required;
    }
    
    
    public void setInputHint(final com.commercetools.importapi.models.types.TypeTextInputHint inputHint){
        this.inputHint = inputHint;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        FieldDefinitionImpl that = (FieldDefinitionImpl) o;
    
        return new EqualsBuilder()
                .append(type, that.type)
                .append(name, that.name)
                .append(label, that.label)
                .append(required, that.required)
                .append(inputHint, that.inputHint)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(type)
            .append(name)
            .append(label)
            .append(required)
            .append(inputHint)
            .toHashCode();
    }

}
