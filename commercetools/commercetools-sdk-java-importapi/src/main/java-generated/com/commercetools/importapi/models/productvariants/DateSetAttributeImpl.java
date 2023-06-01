package com.commercetools.importapi.models.productvariants;

import com.commercetools.importapi.models.productvariants.Attribute;
import java.time.LocalDate;
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
 *  <p>This type represents an attribute whose value is a set of dates.</p>
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class DateSetAttributeImpl implements DateSetAttribute, ModelBase {

    
    private String name;
    
    
    private String type;
    
    
    private java.util.List<java.time.LocalDate> value;

    /**
     * create instance with all properties
     */
    @JsonCreator
    DateSetAttributeImpl(@JsonProperty("name") final String name, @JsonProperty("value") final java.util.List<java.time.LocalDate> value) {
        this.name = name;
        this.value = value;
        this.type =  DATE_SET;
    }
    /**
     * create empty instance
     */
    public DateSetAttributeImpl() {
        this.type =  DATE_SET;
    }

    /**
     *  <p>The name of this attribute must match a name of the product types attribute definitions. The name is required if this type is used in a product variant and must not be set when used in a product variant patch.</p>
     */
    
    public String getName(){
        return this.name;
    }
    
    /**
     *
     */
    
    public String getType(){
        return this.type;
    }
    
    /**
     *
     */
    
    public java.util.List<java.time.LocalDate> getValue(){
        return this.value;
    }

    
    public void setName(final String name){
        this.name = name;
    }
    
    
    public void setValue(final java.time.LocalDate ...value){
       this.value = new ArrayList<>(Arrays.asList(value));
    }
    
    
    public void setValue(final java.util.List<java.time.LocalDate> value){
       this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        DateSetAttributeImpl that = (DateSetAttributeImpl) o;
    
        return new EqualsBuilder()
                .append(name, that.name)
                .append(type, that.type)
                .append(value, that.value)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(name)
            .append(type)
            .append(value)
            .toHashCode();
    }

}
