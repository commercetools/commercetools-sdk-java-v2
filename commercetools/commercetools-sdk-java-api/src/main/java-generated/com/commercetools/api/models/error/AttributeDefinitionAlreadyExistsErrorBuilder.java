
package com.commercetools.api.models.error;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * AttributeDefinitionAlreadyExistsErrorBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AttributeDefinitionAlreadyExistsError attributeDefinitionAlreadyExistsError = AttributeDefinitionAlreadyExistsError.builder()
 *             .message("{message}")
 *             .conflictingProductTypeId("{conflictingProductTypeId}")
 *             .conflictingProductTypeName("{conflictingProductTypeName}")
 *             .conflictingAttributeName("{conflictingAttributeName}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class AttributeDefinitionAlreadyExistsErrorBuilder implements Builder<AttributeDefinitionAlreadyExistsError> {

    private String message;

    private Map<String, java.lang.Object> values = new HashMap<>();

    private String conflictingProductTypeId;

    private String conflictingProductTypeName;

    private String conflictingAttributeName;

    /**
     *  <p><code>"An attribute definition with name $attributeName already exists on product type $productTypeName."</code></p>
     */

    public AttributeDefinitionAlreadyExistsErrorBuilder message(final String message) {
        this.message = message;
        return this;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     */

    public AttributeDefinitionAlreadyExistsErrorBuilder values(final Map<String, java.lang.Object> values) {
        this.values = values;
        return this;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     */

    public AttributeDefinitionAlreadyExistsErrorBuilder addValue(final String key, final java.lang.Object value) {
        if (this.values == null) {
            values = new HashMap<>();
        }
        values.put(key, value);
        return this;
    }

    /**
     *  <p>Unique identifier of the Product Type containing the conflicting name.</p>
     */

    public AttributeDefinitionAlreadyExistsErrorBuilder conflictingProductTypeId(
            final String conflictingProductTypeId) {
        this.conflictingProductTypeId = conflictingProductTypeId;
        return this;
    }

    /**
     *  <p>Name of the Product Type containing the conflicting name.</p>
     */

    public AttributeDefinitionAlreadyExistsErrorBuilder conflictingProductTypeName(
            final String conflictingProductTypeName) {
        this.conflictingProductTypeName = conflictingProductTypeName;
        return this;
    }

    /**
     *  <p>Name of the conflicting Attribute.</p>
     */

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
