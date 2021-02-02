
package com.commercetools.importapi.models.errors;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
*  <p>A field has an invalid value.</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = InvalidFieldErrorImpl.class)
public interface InvalidFieldError extends ErrorObject {

    String INVALID_FIELD = "InvalidField";

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
    public Object getInvalidValue();

    /**
    *  <p>A fixed set of allowed values for the field, if any.</p>
    */

    @JsonProperty("allowedValues")
    public List<Object> getAllowedValues();

    public void setField(final String field);

    public void setInvalidValue(final Object invalidValue);

    @JsonIgnore
    public void setAllowedValues(final Object... allowedValues);

    public void setAllowedValues(final List<Object> allowedValues);

    public static InvalidFieldError of() {
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

    public static InvalidFieldErrorBuilder builder() {
        return InvalidFieldErrorBuilder.of();
    }

    public static InvalidFieldErrorBuilder builder(final InvalidFieldError template) {
        return InvalidFieldErrorBuilder.of(template);
    }

    default <T> T withInvalidFieldError(Function<InvalidFieldError, T> helper) {
        return helper.apply(this);
    }
}
