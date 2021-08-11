
package com.commercetools.api.models.error;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class AttributeDefinitionTypeConflictErrorBuilder
        implements Builder<AttributeDefinitionTypeConflictError> {

    private String message;

    private String conflictingProductTypeId;

    private String conflictingProductTypeName;

    private String conflictingAttributeName;

    public AttributeDefinitionTypeConflictErrorBuilder message(final String message) {
        this.message = message;
        return this;
    }

    public AttributeDefinitionTypeConflictErrorBuilder conflictingProductTypeId(final String conflictingProductTypeId) {
        this.conflictingProductTypeId = conflictingProductTypeId;
        return this;
    }

    public AttributeDefinitionTypeConflictErrorBuilder conflictingProductTypeName(
            final String conflictingProductTypeName) {
        this.conflictingProductTypeName = conflictingProductTypeName;
        return this;
    }

    public AttributeDefinitionTypeConflictErrorBuilder conflictingAttributeName(final String conflictingAttributeName) {
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

    public AttributeDefinitionTypeConflictError build() {
        Objects.requireNonNull(message, AttributeDefinitionTypeConflictError.class + ": message is missing");
        Objects.requireNonNull(conflictingProductTypeId,
            AttributeDefinitionTypeConflictError.class + ": conflictingProductTypeId is missing");
        Objects.requireNonNull(conflictingProductTypeName,
            AttributeDefinitionTypeConflictError.class + ": conflictingProductTypeName is missing");
        Objects.requireNonNull(conflictingAttributeName,
            AttributeDefinitionTypeConflictError.class + ": conflictingAttributeName is missing");
        return new AttributeDefinitionTypeConflictErrorImpl(message, conflictingProductTypeId,
            conflictingProductTypeName, conflictingAttributeName);
    }

    /**
     * builds AttributeDefinitionTypeConflictError without checking for non null required values
     */
    public AttributeDefinitionTypeConflictError buildUnchecked() {
        return new AttributeDefinitionTypeConflictErrorImpl(message, conflictingProductTypeId,
            conflictingProductTypeName, conflictingAttributeName);
    }

    public static AttributeDefinitionTypeConflictErrorBuilder of() {
        return new AttributeDefinitionTypeConflictErrorBuilder();
    }

    public static AttributeDefinitionTypeConflictErrorBuilder of(final AttributeDefinitionTypeConflictError template) {
        AttributeDefinitionTypeConflictErrorBuilder builder = new AttributeDefinitionTypeConflictErrorBuilder();
        builder.message = template.getMessage();
        builder.conflictingProductTypeId = template.getConflictingProductTypeId();
        builder.conflictingProductTypeName = template.getConflictingProductTypeName();
        builder.conflictingAttributeName = template.getConflictingAttributeName();
        return builder;
    }

}
