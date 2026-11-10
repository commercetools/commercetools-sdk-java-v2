
package com.commercetools.importapi.models.errors;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * DuplicateAttributeValueErrorBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     DuplicateAttributeValueError duplicateAttributeValueError = DuplicateAttributeValueError.builder()
 *             .message("{message}")
 *             .attribute(attributeBuilder -> attributeBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class DuplicateAttributeValueErrorBuilder implements Builder<DuplicateAttributeValueError> {

    private String message;

    private com.commercetools.importapi.models.productvariants.Attribute attribute;

    /**
     *  <p>A plain language description of the cause of an error.</p>
     * @param message value to be set
     * @return Builder
     */

    public DuplicateAttributeValueErrorBuilder message(final String message) {
        this.message = message;
        return this;
    }

    /**
     *  <p>The attribute in conflict.</p>
     * @param attribute value to be set
     * @return Builder
     */

    public DuplicateAttributeValueErrorBuilder attribute(
            final com.commercetools.importapi.models.productvariants.Attribute attribute) {
        this.attribute = attribute;
        return this;
    }

    /**
     *  <p>The attribute in conflict.</p>
     * @param builder function to build the attribute value
     * @return Builder
     */

    public DuplicateAttributeValueErrorBuilder attribute(
            Function<com.commercetools.importapi.models.productvariants.AttributeBuilder, Builder<? extends com.commercetools.importapi.models.productvariants.Attribute>> builder) {
        this.attribute = builder.apply(com.commercetools.importapi.models.productvariants.AttributeBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>A plain language description of the cause of an error.</p>
     * @return message
     */

    public String getMessage() {
        return this.message;
    }

    /**
     *  <p>The attribute in conflict.</p>
     * @return attribute
     */

    public com.commercetools.importapi.models.productvariants.Attribute getAttribute() {
        return this.attribute;
    }

    /**
     * builds DuplicateAttributeValueError with checking for non-null required values
     * @return DuplicateAttributeValueError
     */
    public DuplicateAttributeValueError build() {
        Objects.requireNonNull(message, DuplicateAttributeValueError.class + ": message is missing");
        Objects.requireNonNull(attribute, DuplicateAttributeValueError.class + ": attribute is missing");
        return new DuplicateAttributeValueErrorImpl(message, attribute);
    }

    /**
     * builds DuplicateAttributeValueError without checking for non-null required values
     * @return DuplicateAttributeValueError
     */
    public DuplicateAttributeValueError buildUnchecked() {
        return new DuplicateAttributeValueErrorImpl(message, attribute);
    }

    /**
     * factory method for an instance of DuplicateAttributeValueErrorBuilder
     * @return builder
     */
    public static DuplicateAttributeValueErrorBuilder of() {
        return new DuplicateAttributeValueErrorBuilder();
    }

    /**
     * create builder for DuplicateAttributeValueError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static DuplicateAttributeValueErrorBuilder of(final DuplicateAttributeValueError template) {
        DuplicateAttributeValueErrorBuilder builder = new DuplicateAttributeValueErrorBuilder();
        builder.message = template.getMessage();
        builder.attribute = template.getAttribute();
        return builder;
    }

}
