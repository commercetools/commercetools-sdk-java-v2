package com.commercetools.importapi.models.errors;

import com.commercetools.importapi.models.errors.ErrorObject;
import com.commercetools.importapi.models.errors.RequiredFieldErrorImpl;

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
*  <p>A required field is missing a value.</p>
*/
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = RequiredFieldErrorImpl.class)
public interface RequiredFieldError extends ErrorObject {

    /**
    *  <p>The name of the field.</p>
    */
    @NotNull
    @JsonProperty("field")
    public String getField();

    public void setField(final String field);

    public static RequiredFieldErrorImpl of(){
        return new RequiredFieldErrorImpl();
    }
    

    public static RequiredFieldErrorImpl of(final RequiredFieldError template) {
        RequiredFieldErrorImpl instance = new RequiredFieldErrorImpl();
        instance.setMessage(template.getMessage());
        instance.setField(template.getField());
        return instance;
    }

    default <T> T withRequiredFieldError(Function<RequiredFieldError, T> helper) {
        return helper.apply(this);
    }
}
