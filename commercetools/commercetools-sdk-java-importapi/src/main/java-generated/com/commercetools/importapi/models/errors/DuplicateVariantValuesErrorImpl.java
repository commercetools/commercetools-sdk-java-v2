package com.commercetools.importapi.models.errors;

import com.commercetools.importapi.models.errors.ErrorObject;
import com.commercetools.importapi.models.errors.VariantValues;
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
 *  <p>The given combination of values of a Product Variant conflicts with an existing one. Every Product Variant must have a distinct combination of SKU, prices, and custom attribute values.</p>
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class DuplicateVariantValuesErrorImpl implements DuplicateVariantValuesError, ModelBase {

    
    private String code;
    
    
    private String message;
    
    
    private com.commercetools.importapi.models.errors.VariantValues variantValues;

    /**
     * create instance with all properties
     */
    @JsonCreator
    DuplicateVariantValuesErrorImpl(@JsonProperty("message") final String message, @JsonProperty("variantValues") final com.commercetools.importapi.models.errors.VariantValues variantValues) {
        this.message = message;
        this.variantValues = variantValues;
        this.code =  DUPLICATE_VARIANT_VALUES;
    }
    /**
     * create empty instance
     */
    public DuplicateVariantValuesErrorImpl() {
        this.code =  DUPLICATE_VARIANT_VALUES;
    }

    /**
     *
     */
    
    public String getCode(){
        return this.code;
    }
    
    /**
     *
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        DuplicateVariantValuesErrorImpl that = (DuplicateVariantValuesErrorImpl) o;
    
        return new EqualsBuilder()
                .append(code, that.code)
                .append(message, that.message)
                .append(variantValues, that.variantValues)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(code)
            .append(message)
            .append(variantValues)
            .toHashCode();
    }

}
