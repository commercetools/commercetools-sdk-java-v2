package com.commercetools.api.models.type;

import com.commercetools.api.models.common.LocalizedString;
import com.commercetools.api.models.type.FieldType;
import com.commercetools.api.models.type.TypeTextInputHint;
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
 *  <p>Defines a Custom Field and its meta-information. This FieldDefinition is similar to an AttributeDefinition of Product Types.</p>
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class FieldDefinitionImpl implements FieldDefinition, ModelBase {

    
    private com.commercetools.api.models.type.FieldType type;
    
    
    private String name;
    
    
    private com.commercetools.api.models.common.LocalizedString label;
    
    
    private Boolean required;
    
    
    private com.commercetools.api.models.type.TypeTextInputHint inputHint;

    /**
     * create instance with all properties
     */
    @JsonCreator
    FieldDefinitionImpl(@JsonProperty("type") final com.commercetools.api.models.type.FieldType type, @JsonProperty("name") final String name, @JsonProperty("label") final com.commercetools.api.models.common.LocalizedString label, @JsonProperty("required") final Boolean required, @JsonProperty("inputHint") final com.commercetools.api.models.type.TypeTextInputHint inputHint) {
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
    
    public com.commercetools.api.models.type.FieldType getType(){
        return this.type;
    }
    
    /**
     *  <p>Name of the Custom Field to define. Must be unique for a given ResourceTypeId. In case there is a FieldDefinition with the same <code>name</code> in another Type, both FieldDefinitions must have the same <code>type</code>.</p>
     */
    
    public String getName(){
        return this.name;
    }
    
    /**
     *  <p>A human-readable label for the field.</p>
     */
    
    public com.commercetools.api.models.common.LocalizedString getLabel(){
        return this.label;
    }
    
    /**
     *  <p>Defines whether the field is required to have a value.</p>
     */
    
    public Boolean getRequired(){
        return this.required;
    }
    
    /**
     *  <p>Defines the visual representation of the field in user interfaces like the Merchant Center. It is only relevant for string-based FieldTypes like CustomFieldStringType and CustomFieldLocalizedStringType.</p>
     */
    
    public com.commercetools.api.models.type.TypeTextInputHint getInputHint(){
        return this.inputHint;
    }

    
    public void setType(final com.commercetools.api.models.type.FieldType type){
        this.type = type;
    }
    
    
    public void setName(final String name){
        this.name = name;
    }
    
    
    public void setLabel(final com.commercetools.api.models.common.LocalizedString label){
        this.label = label;
    }
    
    
    public void setRequired(final Boolean required){
        this.required = required;
    }
    
    
    public void setInputHint(final com.commercetools.api.models.type.TypeTextInputHint inputHint){
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
