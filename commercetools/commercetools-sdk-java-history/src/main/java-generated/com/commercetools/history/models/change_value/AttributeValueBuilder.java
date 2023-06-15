
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
     *  <p>Name of the Attribute set.</p>
     * @param name value to be set
     * @return Builder
     */

    public AttributeValueBuilder name(final String name) {
        this.name = name;
        return this;
    }

    /**
     *  <p>Value set for the Attribute determined by the AttributeType:</p>
     *  <ul>
     *   <li>For Enum Type and Localized Enum Type, <code>value</code> is the <code>key</code> of the Plain Enum Value or Localized Enum Value objects, or the complete objects.</li>
     *   <li>For Localizable Text Type, <code>value</code> is the LocalizedString object.</li>
     *   <li>For Money Type Attributes, <code>value</code> is the Money object.</li>
     *   <li>For Set Type Attributes, <code>value</code> is the entire <code>set</code> object.</li>
     *   <li>For Nested Type Attributes, <code>value</code> is the list of values of all Attributes of the nested Product.</li>
     *   <li>For Reference Type Attributes, <code>value</code> is the Reference object.</li>
     *  </ul>
     * @param value value to be set
     * @return Builder
     */

    public AttributeValueBuilder value(final java.lang.Object value) {
        this.value = value;
        return this;
    }

    /**
     *  <p>Name of the Attribute set.</p>
     * @return name
     */

    public String getName() {
        return this.name;
    }

    /**
     *  <p>Value set for the Attribute determined by the AttributeType:</p>
     *  <ul>
     *   <li>For Enum Type and Localized Enum Type, <code>value</code> is the <code>key</code> of the Plain Enum Value or Localized Enum Value objects, or the complete objects.</li>
     *   <li>For Localizable Text Type, <code>value</code> is the LocalizedString object.</li>
     *   <li>For Money Type Attributes, <code>value</code> is the Money object.</li>
     *   <li>For Set Type Attributes, <code>value</code> is the entire <code>set</code> object.</li>
     *   <li>For Nested Type Attributes, <code>value</code> is the list of values of all Attributes of the nested Product.</li>
     *   <li>For Reference Type Attributes, <code>value</code> is the Reference object.</li>
     *  </ul>
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
