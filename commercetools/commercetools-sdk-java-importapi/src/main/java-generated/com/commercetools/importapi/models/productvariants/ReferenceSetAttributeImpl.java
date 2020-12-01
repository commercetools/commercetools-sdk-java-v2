package com.commercetools.importapi.models.productvariants;

import com.commercetools.importapi.models.common.KeyReference;
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
*  <p>This type represents an attribute which value is a set of references.</p>
*/
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ReferenceSetAttributeImpl implements ReferenceSetAttribute {

    private String name;
    
    private String type;
    
    private java.util.List<com.commercetools.importapi.models.common.KeyReference> value;

    @JsonCreator
    ReferenceSetAttributeImpl(@JsonProperty("name") final String name, @JsonProperty("value") final java.util.List<com.commercetools.importapi.models.common.KeyReference> value) {
        this.name = name;
        this.value = value;
        this.type = "reference-set";
    }
    public ReferenceSetAttributeImpl() {
        this.type = "reference-set";
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
    
    
    public java.util.List<com.commercetools.importapi.models.common.KeyReference> getValue(){
        return this.value;
    }

    public void setName(final String name){
        this.name = name;
    }
    
    public void setValue(final com.commercetools.importapi.models.common.KeyReference ...value){
       this.value = new ArrayList<>(Arrays.asList(value));
    }
    
    public void setValue(final java.util.List<com.commercetools.importapi.models.common.KeyReference> value){
       this.value = value;
    }

}
