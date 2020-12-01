package com.commercetools.importapi.models.errors;

import com.commercetools.importapi.models.errors.ErrorObject;
import com.commercetools.importapi.models.errors.VariantValues;
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
*  <p>A given combination of variant values conflicts with an existing one.
*  Every product variant must have a distinct combination of SKU, prices, and custom attribute values.</p>
*/
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class DuplicateVariantValuesErrorImpl implements DuplicateVariantValuesError {

    private String code;
    
    private String message;
    
    private com.commercetools.importapi.models.errors.VariantValues variantValues;

    @JsonCreator
    DuplicateVariantValuesErrorImpl(@JsonProperty("message") final String message, @JsonProperty("variantValues") final com.commercetools.importapi.models.errors.VariantValues variantValues) {
        this.message = message;
        this.variantValues = variantValues;
        this.code = "DuplicateVariantValues";
    }
    public DuplicateVariantValuesErrorImpl() {
        this.code = "DuplicateVariantValues";
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
    *  <p>The offending variant values.</p>
    */
    public com.commercetools.importapi.models.errors.VariantValues getVariantValues(){
        return this.variantValues;
    }

    public void setMessage(final String message){
        this.message = message;
    }
    
    public void setVariantValues(final com.commercetools.importapi.models.errors.VariantValues variantValues){
        this.variantValues = variantValues;
    }

}
