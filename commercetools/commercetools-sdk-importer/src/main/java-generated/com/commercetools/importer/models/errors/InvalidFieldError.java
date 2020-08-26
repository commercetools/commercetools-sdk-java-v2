package com.commercetools.importer.models.errors;

import com.commercetools.importer.models.errors.ErrorObject;
import com.fasterxml.jackson.databind.JsonNode;
import com.commercetools.importer.models.errors.InvalidFieldErrorImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import java.io.IOException;

/**
*  <p>A field has an invalid value.</p>
*/
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = InvalidFieldErrorImpl.class)
public interface InvalidFieldError extends ErrorObject {

    /**
    *  <p>The name of the field.</p>
    */
    @NotNull
    @JsonProperty("field")
    public String getField();
    /**
    *  <p>The invalid value.</p>
    */
    @NotNull
    @JsonProperty("invalidValue")
    public JsonNode getInvalidValue();
    /**
    *  <p>A fixed set of allowed values for the field, if any.</p>
    */
    
    @JsonProperty("allowedValues")
    public List<JsonNode> getAllowedValues();

    public void setField(final String field);
    
    public void setInvalidValue(final JsonNode invalidValue);
    
    public void setAllowedValues(final List<JsonNode> allowedValues);

    public static InvalidFieldErrorImpl of(){
        return new InvalidFieldErrorImpl();
    }
    

    public static InvalidFieldErrorImpl of(final InvalidFieldError template) {
        InvalidFieldErrorImpl instance = new InvalidFieldErrorImpl();
        instance.setMessage(template.getMessage());
        instance.setField(template.getField());
        instance.setInvalidValue(template.getInvalidValue());
        instance.setAllowedValues(template.getAllowedValues());
        return instance;
    }

}
