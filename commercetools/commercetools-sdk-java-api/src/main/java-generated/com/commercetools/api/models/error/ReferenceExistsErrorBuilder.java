
package com.commercetools.api.models.error;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ReferenceExistsErrorBuilder implements Builder<ReferenceExistsError> {

    private String message;

    private Map<String, java.lang.Object> values = new HashMap<>();

    @Nullable
    private com.commercetools.api.models.common.ReferenceTypeId referencedBy;

    public ReferenceExistsErrorBuilder message(final String message) {
        this.message = message;
        return this;
    }

    public ReferenceExistsErrorBuilder values(final Map<String, java.lang.Object> values) {
        this.values = values;
        return this;
    }

    public ReferenceExistsErrorBuilder addValue(final String key, final java.lang.Object value) {
        if (this.values == null) {
            values = new HashMap<>();
        }
        values.put(key, value);
        return this;
    }

    public ReferenceExistsErrorBuilder referencedBy(
            @Nullable final com.commercetools.api.models.common.ReferenceTypeId referencedBy) {
        this.referencedBy = referencedBy;
        return this;
    }

    public String getMessage() {
        return this.message;
    }

    public Map<String, java.lang.Object> getValues() {
        return this.values;
    }

    @Nullable
    public com.commercetools.api.models.common.ReferenceTypeId getReferencedBy() {
        return this.referencedBy;
    }

    public ReferenceExistsError build() {
        Objects.requireNonNull(message, ReferenceExistsError.class + ": message is missing");
        Objects.requireNonNull(values, ReferenceExistsError.class + ": values are missing");
        return new ReferenceExistsErrorImpl(message, values, referencedBy);
    }

    /**
     * builds ReferenceExistsError without checking for non null required values
     */
    public ReferenceExistsError buildUnchecked() {
        return new ReferenceExistsErrorImpl(message, values, referencedBy);
    }

    public static ReferenceExistsErrorBuilder of() {
        return new ReferenceExistsErrorBuilder();
    }

    public static ReferenceExistsErrorBuilder of(final ReferenceExistsError template) {
        ReferenceExistsErrorBuilder builder = new ReferenceExistsErrorBuilder();
        builder.message = template.getMessage();
        builder.values = template.values();
        builder.referencedBy = template.getReferencedBy();
        return builder;
    }

}
