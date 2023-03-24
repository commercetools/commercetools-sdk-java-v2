
package com.commercetools.api.models.product;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * AttributeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     Attribute attribute = Attribute.builder()
 *             .name("{name}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class AttributeBuilder implements Builder<Attribute> {

    private String name;

    private java.lang.Object value;

    /**
     *  <p>Name of the Attribute.</p>
     * @param name value to be set
     * @return Builder
     */

    public AttributeBuilder name(final String name) {
        this.name = name;
        return this;
    }

    /**
     *  <p>The AttributeType determines the format of the Attribute <code>value</code> to be provided:</p>
     *  <ul>
     *   <li>For Enum Type and Localized Enum Type, use the <code>key</code> of the Plain Enum Value or Localized Enum Value objects, or the complete objects as <code>value</code>.</li>
     *   <li>For Localizable Text Type, use the LocalizedString object as <code>value</code>.</li>
     *   <li>For Money Type Attributes, use the Money object as <code>value</code>.</li>
     *   <li>For Set Type Attributes, use the entire <code>set</code> object as <code>value</code>.</li>
     *   <li>For Nested Type Attributes, use the list of values of all Attributes of the nested Product as <code>value</code>.</li>
     *   <li>For Reference Type Attributes, use the Reference object as <code>value</code>.</li>
     *  </ul>
     * @param value value to be set
     * @return Builder
     */

    public AttributeBuilder value(final java.lang.Object value) {
        this.value = value;
        return this;
    }

    public String getName() {
        return this.name;
    }

    public java.lang.Object getValue() {
        return this.value;
    }

    /**
     * builds Attribute with checking for non-null required values
     * @return Attribute
     */
    public Attribute build() {
        Objects.requireNonNull(name, Attribute.class + ": name is missing");
        Objects.requireNonNull(value, Attribute.class + ": value is missing");
        return new AttributeImpl(name, value);
    }

    /**
     * builds Attribute without checking for non-null required values
     * @return Attribute
     */
    public Attribute buildUnchecked() {
        return new AttributeImpl(name, value);
    }

    public static AttributeBuilder of() {
        return new AttributeBuilder();
    }

    public static AttributeBuilder of(final Attribute template) {
        AttributeBuilder builder = new AttributeBuilder();
        builder.name = template.getName();
        builder.value = template.getValue();
        return builder;
    }

}
