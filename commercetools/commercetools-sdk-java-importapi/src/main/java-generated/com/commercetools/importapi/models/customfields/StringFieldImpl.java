package com.commercetools.importapi.models.customfields;

import com.commercetools.importapi.models.customfields.CustomField;
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
 *  <p>A field with a string value.</p>
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class StringFieldImpl implements StringField, ModelBase {

    
    private String type;
    
    
    private String value;

    /**
     * create instance with all properties
     */
    @JsonCreator
    StringFieldImpl(@JsonProperty("value") final String value) {
        this.value = value;
        this.type =  STRING;
    }
    /**
     * create empty instance
     */
    public StringFieldImpl() {
        this.type =  STRING;
    }

    /**
     *  <p>The type of this field.</p>
     */
    
    public String getType(){
        return this.type;
    }
    
    /**
     *
     */
    
    public String getValue(){
        return this.value;
    }

    
    public void setValue(final String value){
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        StringFieldImpl that = (StringFieldImpl) o;
    
        return new EqualsBuilder()
                .append(type, that.type)
                .append(value, that.value)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(type)
            .append(value)
            .toHashCode();
    }

}
