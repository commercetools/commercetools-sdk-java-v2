package com.commercetools.importapi.models.errors;

import com.commercetools.importapi.models.errors.ErrorObject;
import com.fasterxml.jackson.databind.JsonNode;
import com.commercetools.importapi.models.errors.DuplicateFieldErrorImpl;

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
*  <p>A value for a field conflicts with an existing duplicate value.</p>
*/
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = DuplicateFieldErrorImpl.class)
public interface DuplicateFieldError extends ErrorObject {

    /**
    *  <p>The name of the field.</p>
    */
    
    @JsonProperty("field")
    public String getField();
    /**
    *  <p>The offending duplicate value.</p>
    */
    
    @JsonProperty("duplicateValue")
    public JsonNode getDuplicateValue();

    public void setField(final String field);
    
    public void setDuplicateValue(final JsonNode duplicateValue);

    public static DuplicateFieldErrorImpl of(){
        return new DuplicateFieldErrorImpl();
    }
    

    public static DuplicateFieldErrorImpl of(final DuplicateFieldError template) {
        DuplicateFieldErrorImpl instance = new DuplicateFieldErrorImpl();
        instance.setMessage(template.getMessage());
        instance.setField(template.getField());
        instance.setDuplicateValue(template.getDuplicateValue());
        return instance;
    }

    default <T> T withDuplicateFieldError(Function<DuplicateFieldError, T> helper) {
        return helper.apply(this);
    }
}
