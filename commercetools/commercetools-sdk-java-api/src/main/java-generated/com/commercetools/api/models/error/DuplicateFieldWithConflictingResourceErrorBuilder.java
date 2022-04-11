
package com.commercetools.api.models.error;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class DuplicateFieldWithConflictingResourceErrorBuilder
        implements Builder<DuplicateFieldWithConflictingResourceError> {

    private String message;

    private Map<String, java.lang.Object> values = new HashMap<>();

    private String field;

    private java.lang.Object duplicateValue;

    private com.commercetools.api.models.common.Reference conflictingResource;

    public DuplicateFieldWithConflictingResourceErrorBuilder message(final String message) {
        this.message = message;
        return this;
    }

    public DuplicateFieldWithConflictingResourceErrorBuilder values(final Map<String, java.lang.Object> values) {
        this.values = values;
        return this;
    }

    public DuplicateFieldWithConflictingResourceErrorBuilder addValue(final String key, final java.lang.Object value) {
        if (this.values == null) {
            values = new HashMap<>();
        }
        values.put(key, value);
        return this;
    }

    public DuplicateFieldWithConflictingResourceErrorBuilder field(final String field) {
        this.field = field;
        return this;
    }

    public DuplicateFieldWithConflictingResourceErrorBuilder duplicateValue(final java.lang.Object duplicateValue) {
        this.duplicateValue = duplicateValue;
        return this;
    }

    public DuplicateFieldWithConflictingResourceErrorBuilder conflictingResource(
            final com.commercetools.api.models.common.Reference conflictingResource) {
        this.conflictingResource = conflictingResource;
        return this;
    }

    public DuplicateFieldWithConflictingResourceErrorBuilder conflictingResource(
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

    public String getField() {
        return this.field;
    }

    public java.lang.Object getDuplicateValue() {
        return this.duplicateValue;
    }

    public com.commercetools.api.models.common.Reference getConflictingResource() {
        return this.conflictingResource;
    }

    public DuplicateFieldWithConflictingResourceError build() {
        Objects.requireNonNull(message, DuplicateFieldWithConflictingResourceError.class + ": message is missing");
        Objects.requireNonNull(values, DuplicateFieldWithConflictingResourceError.class + ": values are missing");
        Objects.requireNonNull(field, DuplicateFieldWithConflictingResourceError.class + ": field is missing");
        Objects.requireNonNull(duplicateValue,
            DuplicateFieldWithConflictingResourceError.class + ": duplicateValue is missing");
        Objects.requireNonNull(conflictingResource,
            DuplicateFieldWithConflictingResourceError.class + ": conflictingResource is missing");
        return new DuplicateFieldWithConflictingResourceErrorImpl(message, values, field, duplicateValue,
            conflictingResource);
    }

    /**
     * builds DuplicateFieldWithConflictingResourceError without checking for non null required values
     */
    public DuplicateFieldWithConflictingResourceError buildUnchecked() {
        return new DuplicateFieldWithConflictingResourceErrorImpl(message, values, field, duplicateValue,
            conflictingResource);
    }

    public static DuplicateFieldWithConflictingResourceErrorBuilder of() {
        return new DuplicateFieldWithConflictingResourceErrorBuilder();
    }

    public static DuplicateFieldWithConflictingResourceErrorBuilder of(
            final DuplicateFieldWithConflictingResourceError template) {
        DuplicateFieldWithConflictingResourceErrorBuilder builder = new DuplicateFieldWithConflictingResourceErrorBuilder();
        builder.message = template.getMessage();
        builder.values = template.values();
        builder.field = template.getField();
        builder.duplicateValue = template.getDuplicateValue();
        builder.conflictingResource = template.getConflictingResource();
        return builder;
    }

}
