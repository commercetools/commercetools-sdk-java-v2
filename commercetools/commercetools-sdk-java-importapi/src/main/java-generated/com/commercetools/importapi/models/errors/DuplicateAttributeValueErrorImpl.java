package com.commercetools.importapi.models.errors;

import com.commercetools.importapi.models.errors.ErrorObject;
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
*  <p>The Unique AttributeConstraint was violated.</p>
*/
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class DuplicateAttributeValueErrorImpl implements DuplicateAttributeValueError {

    private String code;
    
    private String message;
    
    private com.commercetools.importapi.models.productvariants.Attribute attribute;

    @JsonCreator
    DuplicateAttributeValueErrorImpl(@JsonProperty("message") final String message, @JsonProperty("attribute") final com.commercetools.importapi.models.productvariants.Attribute attribute) {
        this.message = message;
        this.attribute = attribute;
        this.code = "DuplicateAttributeValue";
    }
    public DuplicateAttributeValueErrorImpl() {
        this.code = "DuplicateAttributeValue";
    }

    
    public String getCode(){
        return this.code;
    }
    
    /**
    *  <p>The error's description.</p>
    */
    public String getMessage(){
        return this.message;
    }
    
    /**
    *  <p>The conflicting attribute.</p>
    */
    public com.commercetools.importapi.models.productvariants.Attribute getAttribute(){
        return this.attribute;
    }

    public void setMessage(final String message){
        this.message = message;
    }
    
    public void setAttribute(final com.commercetools.importapi.models.productvariants.Attribute attribute){
        this.attribute = attribute;
    }

}
