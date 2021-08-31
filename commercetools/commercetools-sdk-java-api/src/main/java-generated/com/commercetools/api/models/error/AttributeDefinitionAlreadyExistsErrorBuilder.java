
package com.commercetools.api.models.error;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class AttributeDefinitionAlreadyExistsErrorBuilder
        implements Builder<AttributeDefinitionAlreadyExistsError> {

    private String message;

    private String conflictingProductTypeId;

    private String conflictingProductTypeName;

    private String conflictingAttributeName;

    public AttributeDefinitionAlreadyExistsErrorBuilder message(final String message) {
        this.message = message;
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
        Objects.requireNonNull(conflictingProductTypeId,
            AttributeDefinitionAlreadyExistsError.class + ": conflictingProductTypeId is missing");
        Objects.requireNonNull(conflictingProductTypeName,
            AttributeDefinitionAlreadyExistsError.class + ": conflictingProductTypeName is missing");
        Objects.requireNonNull(conflictingAttributeName,
            AttributeDefinitionAlreadyExistsError.class + ": conflictingAttributeName is missing");
        return new AttributeDefinitionAlreadyExistsErrorImpl(message, conflictingProductTypeId,
            conflictingProductTypeName, conflictingAttributeName);
    }

    /**
     * builds AttributeDefinitionAlreadyExistsError without checking for non null required values
     */
    public AttributeDefinitionAlreadyExistsError buildUnchecked() {
        return new AttributeDefinitionAlreadyExistsErrorImpl(message, conflictingProductTypeId,
            conflictingProductTypeName, conflictingAttributeName);
    }

    public static AttributeDefinitionAlreadyExistsErrorBuilder of() {
        return new AttributeDefinitionAlreadyExistsErrorBuilder();
    }

    public static AttributeDefinitionAlreadyExistsErrorBuilder of(
            final AttributeDefinitionAlreadyExistsError template) {
        AttributeDefinitionAlreadyExistsErrorBuilder builder = new AttributeDefinitionAlreadyExistsErrorBuilder();
        builder.message = template.getMessage();
        builder.conflictingProductTypeId = template.getConflictingProductTypeId();
        builder.conflictingProductTypeName = template.getConflictingProductTypeName();
        builder.conflictingAttributeName = template.getConflictingAttributeName();
        return builder;
    }

}
