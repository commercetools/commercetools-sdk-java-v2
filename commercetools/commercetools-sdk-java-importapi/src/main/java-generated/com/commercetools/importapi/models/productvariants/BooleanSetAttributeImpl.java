package com.commercetools.importapi.models.productvariants;

import com.commercetools.importapi.models.productvariants.Attribute;
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


/**
*  <p>This type represents an attribute which value is set of boolean values.</p>
*/
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class BooleanSetAttributeImpl implements BooleanSetAttribute {

    private String name;
    
    private String type;
    
    private java.util.List<Boolean> value;

    @JsonCreator
    BooleanSetAttributeImpl(@JsonProperty("name") final String name, @JsonProperty("value") final java.util.List<Boolean> value) {
        this.name = name;
        this.value = value;
        this.type = "boolean-set";
    }
    public BooleanSetAttributeImpl() {
       
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
    
    
    public java.util.List<Boolean> getValue(){
        return this.value;
    }

    public void setName(final String name){
        this.name = name;
    }
    
    public void setValue(final Boolean ...value){
       this.value = new ArrayList<>(Arrays.asList(value));
    }
    
    public void setValue(final java.util.List<Boolean> value){
       this.value = value;
    }

}
