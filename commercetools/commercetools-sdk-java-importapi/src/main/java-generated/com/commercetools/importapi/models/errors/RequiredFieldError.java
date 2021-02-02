
package com.commercetools.importapi.models.errors;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
*  <p>A required field is missing a value.</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = RequiredFieldErrorImpl.class)
public interface RequiredFieldError extends ErrorObject {

    String REQUIRED_FIELD = "RequiredField";

    /**
    *  <p>The name of the field.</p>
    */
    @NotNull
    @JsonProperty("field")
    public String getField();

    public void setField(final String field);

    public static RequiredFieldError of() {
        return new RequiredFieldErrorImpl();
    }

    public static RequiredFieldError of(final RequiredFieldError template) {
        RequiredFieldErrorImpl instance = new RequiredFieldErrorImpl();
        instance.setMessage(template.getMessage());
        instance.setField(template.getField());
        return instance;
    }

    public static RequiredFieldErrorBuilder builder() {
        return RequiredFieldErrorBuilder.of();
    }

    public static RequiredFieldErrorBuilder builder(final RequiredFieldError template) {
        return RequiredFieldErrorBuilder.of(template);
    }

    default <T> T withRequiredFieldError(Function<RequiredFieldError, T> helper) {
        return helper.apply(this);
    }
}
