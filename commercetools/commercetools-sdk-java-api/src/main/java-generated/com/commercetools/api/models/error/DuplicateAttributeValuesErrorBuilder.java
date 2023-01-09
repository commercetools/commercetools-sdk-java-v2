
package com.commercetools.api.models.error;

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

    private Map<String, java.lang.Object> values = new HashMap<>();

    private java.util.List<com.commercetools.api.models.product.Attribute> attributes;

    /**
     *  <p><code>"The set of attributes must be unique across all variants."</code></p>
     */

    public DuplicateAttributeValuesErrorBuilder message(final String message) {
        this.message = message;
        return this;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     */

    public DuplicateAttributeValuesErrorBuilder values(final Map<String, java.lang.Object> values) {
        this.values = values;
        return this;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     */

    public DuplicateAttributeValuesErrorBuilder addValue(final String key, final java.lang.Object value) {
        if (this.values == null) {
            values = new HashMap<>();
        }
        values.put(key, value);
        return this;
    }

    /**
     *  <p>Conflicting Attributes.</p>
     */

    public DuplicateAttributeValuesErrorBuilder attributes(
            final com.commercetools.api.models.product.Attribute... attributes) {
        this.attributes = new ArrayList<>(Arrays.asList(attributes));
        return this;
    }

    /**
     *  <p>Conflicting Attributes.</p>
     */

    public DuplicateAttributeValuesErrorBuilder attributes(
            final java.util.List<com.commercetools.api.models.product.Attribute> attributes) {
        this.attributes = attributes;
        return this;
    }

    /**
     *  <p>Conflicting Attributes.</p>
     */

    public DuplicateAttributeValuesErrorBuilder plusAttributes(
            final com.commercetools.api.models.product.Attribute... attributes) {
        if (this.attributes == null) {
            this.attributes = new ArrayList<>();
        }
        this.attributes.addAll(Arrays.asList(attributes));
        return this;
    }

    /**
     *  <p>Conflicting Attributes.</p>
     */

    public DuplicateAttributeValuesErrorBuilder plusAttributes(
            Function<com.commercetools.api.models.product.AttributeBuilder, com.commercetools.api.models.product.AttributeBuilder> builder) {
        if (this.attributes == null) {
            this.attributes = new ArrayList<>();
        }
        this.attributes.add(builder.apply(com.commercetools.api.models.product.AttributeBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Conflicting Attributes.</p>
     */

    public DuplicateAttributeValuesErrorBuilder withAttributes(
            Function<com.commercetools.api.models.product.AttributeBuilder, com.commercetools.api.models.product.AttributeBuilder> builder) {
        this.attributes = new ArrayList<>();
        this.attributes.add(builder.apply(com.commercetools.api.models.product.AttributeBuilder.of()).build());
        return this;
    }

    public String getMessage() {
        return this.message;
    }

    public Map<String, java.lang.Object> getValues() {
        return this.values;
    }

    public java.util.List<com.commercetools.api.models.product.Attribute> getAttributes() {
        return this.attributes;
    }

    public DuplicateAttributeValuesError build() {
        Objects.requireNonNull(message, DuplicateAttributeValuesError.class + ": message is missing");
        Objects.requireNonNull(attributes, DuplicateAttributeValuesError.class + ": attributes is missing");
        return new DuplicateAttributeValuesErrorImpl(message, values, attributes);
    }

    /**
     * builds DuplicateAttributeValuesError without checking for non null required values
     */
    public DuplicateAttributeValuesError buildUnchecked() {
        return new DuplicateAttributeValuesErrorImpl(message, values, attributes);
    }

    public static DuplicateAttributeValuesErrorBuilder of() {
        return new DuplicateAttributeValuesErrorBuilder();
    }

    public static DuplicateAttributeValuesErrorBuilder of(final DuplicateAttributeValuesError template) {
        DuplicateAttributeValuesErrorBuilder builder = new DuplicateAttributeValuesErrorBuilder();
        builder.message = template.getMessage();
        builder.values = template.values();
        builder.attributes = template.getAttributes();
        return builder;
    }

}
