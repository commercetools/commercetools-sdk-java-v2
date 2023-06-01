package com.commercetools.history.models.change_value;

import com.commercetools.history.models.common.LocalizedString;
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
 *  <p>Shape of the value for action <code>changeFieldDefinitionOrder</code></p>
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class FieldDefinitionOrderValueImpl implements FieldDefinitionOrderValue, ModelBase {

    
    private String name;
    
    
    private com.commercetools.history.models.common.LocalizedString label;

    /**
     * create instance with all properties
     */
    @JsonCreator
    FieldDefinitionOrderValueImpl(@JsonProperty("name") final String name, @JsonProperty("label") final com.commercetools.history.models.common.LocalizedString label) {
        this.name = name;
        this.label = label;
    }
    /**
     * create empty instance
     */
    public FieldDefinitionOrderValueImpl() {
    }

    /**
     *
     */
    
    public String getName(){
        return this.name;
    }
    
    /**
     *
     */
    
    public com.commercetools.history.models.common.LocalizedString getLabel(){
        return this.label;
    }

    
    public void setName(final String name){
        this.name = name;
    }
    
    
    public void setLabel(final com.commercetools.history.models.common.LocalizedString label){
        this.label = label;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        FieldDefinitionOrderValueImpl that = (FieldDefinitionOrderValueImpl) o;
    
        return new EqualsBuilder()
                .append(name, that.name)
                .append(label, that.label)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(name)
            .append(label)
            .toHashCode();
    }

}
