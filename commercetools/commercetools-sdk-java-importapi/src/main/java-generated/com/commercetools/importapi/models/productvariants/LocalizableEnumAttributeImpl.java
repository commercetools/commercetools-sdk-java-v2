package com.commercetools.importapi.models.productvariants;

import com.commercetools.importapi.models.productvariants.Attribute;
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
 *  <p>This type represents an attribute whose value is a localized enum. The attribute value refers to the key of the enum value.</p>
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class LocalizableEnumAttributeImpl implements LocalizableEnumAttribute, ModelBase {

    
    private String name;
    
    
    private String type;
    
    
    private String value;

    /**
     * create instance with all properties
     */
    @JsonCreator
    LocalizableEnumAttributeImpl(@JsonProperty("name") final String name, @JsonProperty("value") final String value) {
        this.name = name;
        this.value = value;
        this.type =  LENUM;
    }
    /**
     * create empty instance
     */
    public LocalizableEnumAttributeImpl() {
        this.type =  LENUM;
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
    
    public String getValue(){
        return this.value;
    }

    
    public void setName(final String name){
        this.name = name;
    }
    
    
    public void setValue(final String value){
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        LocalizableEnumAttributeImpl that = (LocalizableEnumAttributeImpl) o;
    
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
