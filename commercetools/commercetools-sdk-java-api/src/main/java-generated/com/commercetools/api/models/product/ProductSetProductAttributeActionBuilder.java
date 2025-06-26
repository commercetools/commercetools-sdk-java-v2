
package com.commercetools.api.models.product;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductSetProductAttributeActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductSetProductAttributeAction productSetProductAttributeAction = ProductSetProductAttributeAction.builder()
 *             .name("{name}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductSetProductAttributeActionBuilder implements Builder<ProductSetProductAttributeAction> {

    private String name;

    @Nullable
    private java.lang.Object value;

    @Nullable
    private Boolean staged;

    /**
     *  <p>Name of the Product Attribute to set.</p>
     * @param name value to be set
     * @return Builder
     */

    public ProductSetProductAttributeActionBuilder name(final String name) {
        this.name = name;
        return this;
    }

    /**
     *  <p>Value to set for the Attribute. If empty, any existing value will be removed.</p>
     *  <p>The AttributeType determines the format of the Attribute <code>value</code> to be provided:</p>
     *  <ul>
     *   <li>For Enum Type and Localized Enum Type, use the <code>key</code> of the Plain Enum Value or Localized Enum Value object or the complete object as <code>value</code>.</li>
     *   <li>For Localizable Text Type, use the LocalizedString object as <code>value</code>.</li>
     *   <li>For Money Type Attributes, use the Money object as <code>value</code>.</li>
     *   <li>For Set Type Attributes, use the entire <code>set</code> object as <code>value</code>.</li>
     *   <li>For Nested Type Attributes, use the list of values of all Attributes of the nested Product as <code>value</code>.</li>
     *   <li>For Reference Type Attributes, use the Reference object as <code>value</code>.</li>
     *  </ul>
     * @param value value to be set
     * @return Builder
     */

    public ProductSetProductAttributeActionBuilder value(@Nullable final java.lang.Object value) {
        this.value = value;
        return this;
    }

    /**
     *  <p>If <code>true</code>, only the staged Attribute is set. If <code>false</code>, both the current and staged Attributes are set.</p>
     * @param staged value to be set
     * @return Builder
     */

    public ProductSetProductAttributeActionBuilder staged(@Nullable final Boolean staged) {
        this.staged = staged;
        return this;
    }

    /**
     *  <p>Name of the Product Attribute to set.</p>
     * @return name
     */

    public String getName() {
        return this.name;
    }

    /**
     *  <p>Value to set for the Attribute. If empty, any existing value will be removed.</p>
     *  <p>The AttributeType determines the format of the Attribute <code>value</code> to be provided:</p>
     *  <ul>
     *   <li>For Enum Type and Localized Enum Type, use the <code>key</code> of the Plain Enum Value or Localized Enum Value object or the complete object as <code>value</code>.</li>
     *   <li>For Localizable Text Type, use the LocalizedString object as <code>value</code>.</li>
     *   <li>For Money Type Attributes, use the Money object as <code>value</code>.</li>
     *   <li>For Set Type Attributes, use the entire <code>set</code> object as <code>value</code>.</li>
     *   <li>For Nested Type Attributes, use the list of values of all Attributes of the nested Product as <code>value</code>.</li>
     *   <li>For Reference Type Attributes, use the Reference object as <code>value</code>.</li>
     *  </ul>
     * @return value
     */

    @Nullable
    public java.lang.Object getValue() {
        return this.value;
    }

    /**
     *  <p>If <code>true</code>, only the staged Attribute is set. If <code>false</code>, both the current and staged Attributes are set.</p>
     * @return staged
     */

    @Nullable
    public Boolean getStaged() {
        return this.staged;
    }

    /**
     * builds ProductSetProductAttributeAction with checking for non-null required values
     * @return ProductSetProductAttributeAction
     */
    public ProductSetProductAttributeAction build() {
        Objects.requireNonNull(name, ProductSetProductAttributeAction.class + ": name is missing");
        return new ProductSetProductAttributeActionImpl(name, value, staged);
    }

    /**
     * builds ProductSetProductAttributeAction without checking for non-null required values
     * @return ProductSetProductAttributeAction
     */
    public ProductSetProductAttributeAction buildUnchecked() {
        return new ProductSetProductAttributeActionImpl(name, value, staged);
    }

    /**
     * factory method for an instance of ProductSetProductAttributeActionBuilder
     * @return builder
     */
    public static ProductSetProductAttributeActionBuilder of() {
        return new ProductSetProductAttributeActionBuilder();
    }

    /**
     * create builder for ProductSetProductAttributeAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductSetProductAttributeActionBuilder of(final ProductSetProductAttributeAction template) {
        ProductSetProductAttributeActionBuilder builder = new ProductSetProductAttributeActionBuilder();
        builder.name = template.getName();
        builder.value = template.getValue();
        builder.staged = template.getStaged();
        return builder;
    }

}
