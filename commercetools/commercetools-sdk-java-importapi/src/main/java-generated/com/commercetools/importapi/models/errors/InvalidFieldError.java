package com.commercetools.importapi.models.errors;

import com.commercetools.importapi.models.errors.ErrorObject;
import com.fasterxml.jackson.databind.JsonNode;
import com.commercetools.importapi.models.errors.InvalidFieldErrorImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.function.Function;
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
    
    @JsonIgnore
    public void setAllowedValues(final JsonNode ...allowedValues);
    public void setAllowedValues(final List<JsonNode> allowedValues);

    public static InvalidFieldError of(){
        return new InvalidFieldErrorImpl();
    }
    

    public static InvalidFieldError of(final InvalidFieldError template) {
        InvalidFieldErrorImpl instance = new InvalidFieldErrorImpl();
        instance.setMessage(template.getMessage());
        instance.setField(template.getField());
        instance.setInvalidValue(template.getInvalidValue());
        instance.setAllowedValues(template.getAllowedValues());
        return instance;
    }

    public static InvalidFieldErrorBuilder builder(){
        return InvalidFieldErrorBuilder.of();
    }
    
    public static InvalidFieldErrorBuilder builder(final InvalidFieldError template){
        return InvalidFieldErrorBuilder.of(template);
    }
    

    default <T> T withInvalidFieldError(Function<InvalidFieldError, T> helper) {
        return helper.apply(this);
    }
}
