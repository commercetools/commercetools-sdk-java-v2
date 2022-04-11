
package com.commercetools.api.models.error;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class DuplicateFieldErrorBuilder implements Builder<DuplicateFieldError> {

    private String message;

    private Map<String, java.lang.Object> values = new HashMap<>();

    @Nullable
    private String field;

    @Nullable
    private java.lang.Object duplicateValue;

    @Nullable
    private com.commercetools.api.models.common.Reference conflictingResource;

    public DuplicateFieldErrorBuilder message(final String message) {
        this.message = message;
        return this;
    }

    public DuplicateFieldErrorBuilder values(final Map<String, java.lang.Object> values) {
        this.values = values;
        return this;
    }

    public DuplicateFieldErrorBuilder addValue(final String key, final java.lang.Object value) {
        if (this.values == null) {
            values = new HashMap<>();
        }
        values.put(key, value);
        return this;
    }

    public DuplicateFieldErrorBuilder field(@Nullable final String field) {
        this.field = field;
        return this;
    }

    public DuplicateFieldErrorBuilder duplicateValue(@Nullable final java.lang.Object duplicateValue) {
        this.duplicateValue = duplicateValue;
        return this;
    }

    public DuplicateFieldErrorBuilder conflictingResource(
            @Nullable final com.commercetools.api.models.common.Reference conflictingResource) {
        this.conflictingResource = conflictingResource;
        return this;
    }

    public DuplicateFieldErrorBuilder conflictingResource(
            Function<com.commercetools.api.models.common.ReferenceBuilder, Builder<? extends com.commercetools.api.models.common.Reference>> builder) {
        this.conflictingResource = builder.apply(com.commercetools.api.models.common.ReferenceBuilder.of()).build();
        return this;
    }

    public String getMessage() {
        return this.message;
    }

    public Map<String, java.lang.Object> getValues() {
        return this.values;
    }

    @Nullable
    public String getField() {
        return this.field;
    }

    @Nullable
    public java.lang.Object getDuplicateValue() {
        return this.duplicateValue;
    }

    @Nullable
    public com.commercetools.api.models.common.Reference getConflictingResource() {
        return this.conflictingResource;
    }

    public DuplicateFieldError build() {
        Objects.requireNonNull(message, DuplicateFieldError.class + ": message is missing");
        Objects.requireNonNull(values, DuplicateFieldError.class + ": values are missing");
        return new DuplicateFieldErrorImpl(message, values, field, duplicateValue, conflictingResource);
    }

    /**
     * builds DuplicateFieldError without checking for non null required values
     */
    public DuplicateFieldError buildUnchecked() {
        return new DuplicateFieldErrorImpl(message, values, field, duplicateValue, conflictingResource);
    }

    public static DuplicateFieldErrorBuilder of() {
        return new DuplicateFieldErrorBuilder();
    }

    public static DuplicateFieldErrorBuilder of(final DuplicateFieldError template) {
        DuplicateFieldErrorBuilder builder = new DuplicateFieldErrorBuilder();
        builder.message = template.getMessage();
        builder.values = template.values();
        builder.field = template.getField();
        builder.duplicateValue = template.getDuplicateValue();
        builder.conflictingResource = template.getConflictingResource();
        return builder;
    }

}
