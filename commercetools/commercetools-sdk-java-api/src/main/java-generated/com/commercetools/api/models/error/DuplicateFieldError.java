
package com.commercetools.api.models.error;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;

import com.commercetools.api.models.common.Reference;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = DuplicateFieldErrorImpl.class)
public interface DuplicateFieldError extends ErrorObject {

    String DUPLICATE_FIELD = "DuplicateField";

    @JsonProperty("field")
    public String getField();

    @JsonProperty("duplicateValue")
    public Object getDuplicateValue();

    @Valid
    @JsonProperty("conflictingResource")
    public Reference getConflictingResource();

    public void setField(final String field);

    public void setDuplicateValue(final Object duplicateValue);

    public void setConflictingResource(final Reference conflictingResource);

    public static DuplicateFieldError of() {
        return new DuplicateFieldErrorImpl();
    }

    public static DuplicateFieldError of(final DuplicateFieldError template) {
        DuplicateFieldErrorImpl instance = new DuplicateFieldErrorImpl();
        instance.setMessage(template.getMessage());
        instance.setField(template.getField());
        instance.setDuplicateValue(template.getDuplicateValue());
        instance.setConflictingResource(template.getConflictingResource());
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
}
