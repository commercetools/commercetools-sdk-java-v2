package com.commercetools.importapi.models.productvariants;

import com.commercetools.importapi.models.productvariants.Attribute;
import java.time.LocalDate;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
*  <p>This type represents an attribute which value is a set of dates.</p>
*/
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class DateSetAttributeImpl implements DateSetAttribute {

    private String name;
    
    private String type;
    
    private java.util.List<java.time.LocalDate> value;

    @JsonCreator
    DateSetAttributeImpl(@JsonProperty("name") final String name, @JsonProperty("value") final java.util.List<java.time.LocalDate> value) {
        this.name = name;
        this.value = value;
        this.type = "date-set";
    }
    public DateSetAttributeImpl() {
       
    }

    /**
    *  <p>The name of this attribute must match a name of the product types attribute definitions.
    *  The name is required if this type is used in a product variant and must not be set when
    *  used in a product variant patch.</p>
    */
    public String getName(){
        return this.name;
    }
    
    
    public String getType(){
        return this.type;
    }
    
    
    public java.util.List<java.time.LocalDate> getValue(){
        return this.value;
    }

    public void setName(final String name){
        this.name = name;
    }
    
    public void setValue(final java.util.List<java.time.LocalDate> value){
        this.value = value;
    }

}
