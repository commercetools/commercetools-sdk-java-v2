
package com.commercetools.importapi.models.errors;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
*  <p>The given value already exists for a field that is checked for unique values.</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = DuplicateFieldErrorImpl.class)
public interface DuplicateFieldError extends ErrorObject {

    String DUPLICATE_FIELD = "DuplicateField";

    /**
    *  <p>The name of the field.</p>
    */

    @JsonProperty("field")
    public String getField();

    /**
    *  <p>The offending duplicate value.</p>
    */

    @JsonProperty("duplicateValue")
    public Object getDuplicateValue();

    public void setField(final String field);

    public void setDuplicateValue(final Object duplicateValue);

    public static DuplicateFieldError of() {
        return new DuplicateFieldErrorImpl();
    }

    public static DuplicateFieldError of(final DuplicateFieldError template) {
        DuplicateFieldErrorImpl instance = new DuplicateFieldErrorImpl();
        instance.setMessage(template.getMessage());
        instance.setField(template.getField());
        instance.setDuplicateValue(template.getDuplicateValue());
        return instance;
    }

    public static DuplicateFieldErrorBuilder builder() {
        return DuplicateFieldErrorBuilder.of();
    }

    public static DuplicateFieldErrorBuilder builder(final DuplicateFieldError template) {
        return DuplicateFieldErrorBuilder.of(template);
    }

    default <T> T withDuplicateFieldError(Function<DuplicateFieldError, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<DuplicateFieldError> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<DuplicateFieldError>() {
            @Override
            public String toString() {
                return "TypeReference<DuplicateFieldError>";
            }
        };
    }
}
