
package com.commercetools.api.models.product_tailoring;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductTailoringAttributeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductTailoringAttribute productTailoringAttribute = ProductTailoringAttribute.builder()
 *             .name("{name}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductTailoringAttributeBuilder implements Builder<ProductTailoringAttribute> {

    private String name;

    private java.lang.Object value;

    /**
     *  <p>Name of the Attribute.</p>
     * @param name value to be set
     * @return Builder
     */

    public ProductTailoringAttributeBuilder name(final String name) {
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
     *   <li>For Reference Type Attributes, use the Reference object as <code>value</code>.</li>
     *  </ul>
     *  <p>Tailoring of Nested Type Attributes is not supported.</p>
     * @param value value to be set
     * @return Builder
     */

    public ProductTailoringAttributeBuilder value(final java.lang.Object value) {
        this.value = value;
        return this;
    }

    /**
     *  <p>Name of the Attribute.</p>
     * @return name
     */

    public String getName() {
        return this.name;
    }

    /**
     *  <p>The AttributeType determines the format of the Attribute <code>value</code> to be provided:</p>
     *  <ul>
     *   <li>For Enum Type and Localized Enum Type, use the <code>key</code> of the Plain Enum Value or Localized Enum Value objects, or the complete objects as <code>value</code>.</li>
     *   <li>For Localizable Text Type, use the LocalizedString object as <code>value</code>.</li>
     *   <li>For Money Type Attributes, use the Money object as <code>value</code>.</li>
     *   <li>For Set Type Attributes, use the entire <code>set</code> object as <code>value</code>.</li>
     *   <li>For Reference Type Attributes, use the Reference object as <code>value</code>.</li>
     *  </ul>
     *  <p>Tailoring of Nested Type Attributes is not supported.</p>
     * @return value
     */

    public java.lang.Object getValue() {
        return this.value;
    }

    /**
     * builds ProductTailoringAttribute with checking for non-null required values
     * @return ProductTailoringAttribute
     */
    public ProductTailoringAttribute build() {
        Objects.requireNonNull(name, ProductTailoringAttribute.class + ": name is missing");
        Objects.requireNonNull(value, ProductTailoringAttribute.class + ": value is missing");
        return new ProductTailoringAttributeImpl(name, value);
    }

    /**
     * builds ProductTailoringAttribute without checking for non-null required values
     * @return ProductTailoringAttribute
     */
    public ProductTailoringAttribute buildUnchecked() {
        return new ProductTailoringAttributeImpl(name, value);
    }

    /**
     * factory method for an instance of ProductTailoringAttributeBuilder
     * @return builder
     */
    public static ProductTailoringAttributeBuilder of() {
        return new ProductTailoringAttributeBuilder();
    }

    /**
     * create builder for ProductTailoringAttribute instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductTailoringAttributeBuilder of(final ProductTailoringAttribute template) {
        ProductTailoringAttributeBuilder builder = new ProductTailoringAttributeBuilder();
        builder.name = template.getName();
        builder.value = template.getValue();
        return builder;
    }

}
