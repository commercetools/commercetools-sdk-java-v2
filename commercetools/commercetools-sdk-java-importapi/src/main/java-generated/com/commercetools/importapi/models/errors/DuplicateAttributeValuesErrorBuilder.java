
package com.commercetools.importapi.models.errors;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * DuplicateAttributeValuesErrorBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     DuplicateAttributeValuesError duplicateAttributeValuesError = DuplicateAttributeValuesError.builder()
 *             .message("{message}")
 *             .plusAttributes(attributesBuilder -> attributesBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class DuplicateAttributeValuesErrorBuilder implements Builder<DuplicateAttributeValuesError> {

    private String message;

    private java.util.List<com.commercetools.importapi.models.productvariants.Attribute> attributes;

    /**
     *
     * @param message value to be set
     * @return Builder
     */

    public DuplicateAttributeValuesErrorBuilder message(final String message) {
        this.message = message;
        return this;
    }

    /**
     *
     * @param attributes value to be set
     * @return Builder
     */

    public DuplicateAttributeValuesErrorBuilder attributes(
            final com.commercetools.importapi.models.productvariants.Attribute... attributes) {
        this.attributes = new ArrayList<>(Arrays.asList(attributes));
        return this;
    }

    /**
     *
     * @param attributes value to be set
     * @return Builder
     */

    public DuplicateAttributeValuesErrorBuilder attributes(
            final java.util.List<com.commercetools.importapi.models.productvariants.Attribute> attributes) {
        this.attributes = attributes;
        return this;
    }

    /**
     *
     * @param attributes value to be set
     * @return Builder
     */

    public DuplicateAttributeValuesErrorBuilder plusAttributes(
            final com.commercetools.importapi.models.productvariants.Attribute... attributes) {
        if (this.attributes == null) {
            this.attributes = new ArrayList<>();
        }
        this.attributes.addAll(Arrays.asList(attributes));
        return this;
    }

    /**
     *
     * @param builder function to build the attributes value
     * @return Builder
     */

    public DuplicateAttributeValuesErrorBuilder plusAttributes(
            Function<com.commercetools.importapi.models.productvariants.AttributeBuilder, Builder<? extends com.commercetools.importapi.models.productvariants.Attribute>> builder) {
        if (this.attributes == null) {
            this.attributes = new ArrayList<>();
        }
        this.attributes
                .add(builder.apply(com.commercetools.importapi.models.productvariants.AttributeBuilder.of()).build());
        return this;
    }

    /**
     *
     * @param builder function to build the attributes value
     * @return Builder
     */

    public DuplicateAttributeValuesErrorBuilder withAttributes(
            Function<com.commercetools.importapi.models.productvariants.AttributeBuilder, Builder<? extends com.commercetools.importapi.models.productvariants.Attribute>> builder) {
        this.attributes = new ArrayList<>();
        this.attributes
                .add(builder.apply(com.commercetools.importapi.models.productvariants.AttributeBuilder.of()).build());
        return this;
    }

    public String getMessage() {
        return this.message;
    }

    public java.util.List<com.commercetools.importapi.models.productvariants.Attribute> getAttributes() {
        return this.attributes;
    }

    /**
     * builds DuplicateAttributeValuesError with checking for non-null required values
     * @return DuplicateAttributeValuesError
     */
    public DuplicateAttributeValuesError build() {
        Objects.requireNonNull(message, DuplicateAttributeValuesError.class + ": message is missing");
        Objects.requireNonNull(attributes, DuplicateAttributeValuesError.class + ": attributes is missing");
        return new DuplicateAttributeValuesErrorImpl(message, attributes);
    }

    /**
     * builds DuplicateAttributeValuesError without checking for non-null required values
     * @return DuplicateAttributeValuesError
     */
    public DuplicateAttributeValuesError buildUnchecked() {
        return new DuplicateAttributeValuesErrorImpl(message, attributes);
    }

    public static DuplicateAttributeValuesErrorBuilder of() {
        return new DuplicateAttributeValuesErrorBuilder();
    }

    public static DuplicateAttributeValuesErrorBuilder of(final DuplicateAttributeValuesError template) {
        DuplicateAttributeValuesErrorBuilder builder = new DuplicateAttributeValuesErrorBuilder();
        builder.message = template.getMessage();
        builder.attributes = template.getAttributes();
        return builder;
    }

}
