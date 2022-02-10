
package com.commercetools.api.models.error;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class AttributeDefinitionAlreadyExistsErrorBuilder implements Builder<AttributeDefinitionAlreadyExistsError> {

    private String message;

    private Map<String, java.lang.Object> values = new HashMap<>();

    private String conflictingProductTypeId;

    private String conflictingProductTypeName;

    private String conflictingAttributeName;

    public AttributeDefinitionAlreadyExistsErrorBuilder message(final String message) {
        this.message = message;
        return this;
    }

    public AttributeDefinitionAlreadyExistsErrorBuilder values(final Map<String, java.lang.Object> values) {
        this.values = values;
        return this;
    }

    public AttributeDefinitionAlreadyExistsErrorBuilder addValue(final String key, final java.lang.Object value) {
        if (this.values == null) {
            values = new HashMap<>();
        }
        values.put(key, value);
        return this;
    }

    public AttributeDefinitionAlreadyExistsErrorBuilder conflictingProductTypeId(
            final String conflictingProductTypeId) {
        this.conflictingProductTypeId = conflictingProductTypeId;
        return this;
    }

    public AttributeDefinitionAlreadyExistsErrorBuilder conflictingProductTypeName(
            final String conflictingProductTypeName) {
        this.conflictingProductTypeName = conflictingProductTypeName;
        return this;
    }

    public AttributeDefinitionAlreadyExistsErrorBuilder conflictingAttributeName(
            final String conflictingAttributeName) {
        this.conflictingAttributeName = conflictingAttributeName;
        return this;
    }

    public String getMessage() {
        return this.message;
    }

    public Map<String, java.lang.Object> getValues() {
        return this.values;
    }

    public String getConflictingProductTypeId() {
        return this.conflictingProductTypeId;
    }

    public String getConflictingProductTypeName() {
        return this.conflictingProductTypeName;
    }

    public String getConflictingAttributeName() {
        return this.conflictingAttributeName;
    }

    public AttributeDefinitionAlreadyExistsError build() {
        Objects.requireNonNull(message, AttributeDefinitionAlreadyExistsError.class + ": message is missing");
        Objects.requireNonNull(values, AttributeDefinitionAlreadyExistsError.class + ": values are missing");
        Objects.requireNonNull(conflictingProductTypeId,
            AttributeDefinitionAlreadyExistsError.class + ": conflictingProductTypeId is missing");
        Objects.requireNonNull(conflictingProductTypeName,
            AttributeDefinitionAlreadyExistsError.class + ": conflictingProductTypeName is missing");
        Objects.requireNonNull(conflictingAttributeName,
            AttributeDefinitionAlreadyExistsError.class + ": conflictingAttributeName is missing");
        return new AttributeDefinitionAlreadyExistsErrorImpl(message, values, conflictingProductTypeId,
            conflictingProductTypeName, conflictingAttributeName);
    }

    /**
     * builds AttributeDefinitionAlreadyExistsError without checking for non null required values
     */
    public AttributeDefinitionAlreadyExistsError buildUnchecked() {
        return new AttributeDefinitionAlreadyExistsErrorImpl(message, values, conflictingProductTypeId,
            conflictingProductTypeName, conflictingAttributeName);
    }

    public static AttributeDefinitionAlreadyExistsErrorBuilder of() {
        return new AttributeDefinitionAlreadyExistsErrorBuilder();
    }

    public static AttributeDefinitionAlreadyExistsErrorBuilder of(
            final AttributeDefinitionAlreadyExistsError template) {
        AttributeDefinitionAlreadyExistsErrorBuilder builder = new AttributeDefinitionAlreadyExistsErrorBuilder();
        builder.message = template.getMessage();
        builder.values = template.values();
        builder.conflictingProductTypeId = template.getConflictingProductTypeId();
        builder.conflictingProductTypeName = template.getConflictingProductTypeName();
        builder.conflictingAttributeName = template.getConflictingAttributeName();
        return builder;
    }

}
