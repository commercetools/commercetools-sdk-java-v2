
package com.commercetools.importapi.models.errors;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
*  <p>A given field is not supported.
*  This error occurs, for example, if the field <code>variants</code>, which is not supported by <a href="/product#productimport">Product Import</a>, is sent to the Product Import endpoint.</p>
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
    *  <p>The set of allowed values for the field, if any.</p>
    */

    @JsonProperty("allowedValues")
    public List<Object> getAllowedValues();

    @JsonProperty("resourceIndex")
    public Long getResourceIndex();

    public void setField(final String field);

    public void setInvalidValue(final Object invalidValue);

    @JsonIgnore
    public void setAllowedValues(final Object... allowedValues);

    public void setAllowedValues(final List<Object> allowedValues);

    public void setResourceIndex(final Long resourceIndex);

    public static InvalidFieldError of() {
        return new InvalidFieldErrorImpl();
    }

    public static InvalidFieldError of(final InvalidFieldError template) {
        InvalidFieldErrorImpl instance = new InvalidFieldErrorImpl();
        instance.setMessage(template.getMessage());
        instance.setField(template.getField());
        instance.setInvalidValue(template.getInvalidValue());
        instance.setAllowedValues(template.getAllowedValues());
        instance.setResourceIndex(template.getResourceIndex());
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

    public static com.fasterxml.jackson.core.type.TypeReference<InvalidFieldError> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<InvalidFieldError>() {
            @Override
            public String toString() {
                return "TypeReference<InvalidFieldError>";
            }
        };
    }
}
