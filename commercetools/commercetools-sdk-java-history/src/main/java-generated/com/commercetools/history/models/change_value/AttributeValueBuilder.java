
package com.commercetools.history.models.change_value;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * AttributeValueBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AttributeValue attributeValue = AttributeValue.builder()
 *             .name("{name}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class AttributeValueBuilder implements Builder<AttributeValue> {

    private String name;

    private java.lang.Object value;

    /**
     * set the value to the name
     * @param name value to be set
     * @return Builder
     */

    public AttributeValueBuilder name(final String name) {
        this.name = name;
        return this;
    }

    /**
     * set the value to the value
     * @param value value to be set
     * @return Builder
     */

    public AttributeValueBuilder value(final java.lang.Object value) {
        this.value = value;
        return this;
    }

    /**
     * value of name}
     * @return name
     */

    public String getName() {
        return this.name;
    }

    /**
     * value of value}
     * @return value
     */

    public java.lang.Object getValue() {
        return this.value;
    }

    /**
     * builds AttributeValue with checking for non-null required values
     * @return AttributeValue
     */
    public AttributeValue build() {
        Objects.requireNonNull(name, AttributeValue.class + ": name is missing");
        Objects.requireNonNull(value, AttributeValue.class + ": value is missing");
        return new AttributeValueImpl(name, value);
    }

    /**
     * builds AttributeValue without checking for non-null required values
     * @return AttributeValue
     */
    public AttributeValue buildUnchecked() {
        return new AttributeValueImpl(name, value);
    }

    /**
     * factory method for an instance of AttributeValueBuilder
     * @return builder
     */
    public static AttributeValueBuilder of() {
        return new AttributeValueBuilder();
    }

    /**
     * create builder for AttributeValue instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static AttributeValueBuilder of(final AttributeValue template) {
        AttributeValueBuilder builder = new AttributeValueBuilder();
        builder.name = template.getName();
        builder.value = template.getValue();
        return builder;
    }

}
