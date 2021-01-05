package com.commercetools.api.models.error;

import com.commercetools.api.models.error.ErrorObject;
import com.fasterxml.jackson.databind.JsonNode;
import com.commercetools.api.models.error.InvalidFieldErrorImpl;

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

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = InvalidFieldErrorImpl.class)
public interface InvalidFieldError extends ErrorObject {

    
    @NotNull
    @JsonProperty("field")
    public String getField();
    
    @NotNull
    @JsonProperty("invalidValue")
    public JsonNode getInvalidValue();
    
    
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
