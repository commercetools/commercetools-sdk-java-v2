
package com.commercetools.api.models.error;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.common.Reference;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = DuplicateFieldWithConflictingResourceErrorImpl.class)
public interface DuplicateFieldWithConflictingResourceError extends ErrorObject {

    String DUPLICATE_FIELD_WITH_CONFLICTING_RESOURCE = "DuplicateFieldWithConflictingResource";

    @NotNull
    @JsonProperty("field")
    public String getField();

    @NotNull
    @JsonProperty("duplicateValue")
    public Object getDuplicateValue();

    @NotNull
    @Valid
    @JsonProperty("conflictingResource")
    public Reference getConflictingResource();

    public void setField(final String field);

    public void setDuplicateValue(final Object duplicateValue);

    public void setConflictingResource(final Reference conflictingResource);

    public static DuplicateFieldWithConflictingResourceError of() {
        return new DuplicateFieldWithConflictingResourceErrorImpl();
    }

    public static DuplicateFieldWithConflictingResourceError of(
            final DuplicateFieldWithConflictingResourceError template) {
        DuplicateFieldWithConflictingResourceErrorImpl instance = new DuplicateFieldWithConflictingResourceErrorImpl();
        instance.setMessage(template.getMessage());

        instance.setField(template.getField());
        instance.setDuplicateValue(template.getDuplicateValue());
        instance.setConflictingResource(template.getConflictingResource());
        return instance;
    }

    public static DuplicateFieldWithConflictingResourceErrorBuilder builder() {
        return DuplicateFieldWithConflictingResourceErrorBuilder.of();
    }

    public static DuplicateFieldWithConflictingResourceErrorBuilder builder(
            final DuplicateFieldWithConflictingResourceError template) {
        return DuplicateFieldWithConflictingResourceErrorBuilder.of(template);
    }

    default <T> T withDuplicateFieldWithConflictingResourceError(
            Function<DuplicateFieldWithConflictingResourceError, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<DuplicateFieldWithConflictingResourceError> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<DuplicateFieldWithConflictingResourceError>() {
            @Override
            public String toString() {
                return "TypeReference<DuplicateFieldWithConflictingResourceError>";
            }
        };
    }
}
