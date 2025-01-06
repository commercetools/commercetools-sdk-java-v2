
package com.commercetools.api.models.product_tailoring;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductTailoringSetAttributeInAllVariantsActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductTailoringSetAttributeInAllVariantsAction productTailoringSetAttributeInAllVariantsAction = ProductTailoringSetAttributeInAllVariantsAction.builder()
 *             .name("{name}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductTailoringSetAttributeInAllVariantsActionBuilder
        implements Builder<ProductTailoringSetAttributeInAllVariantsAction> {

    private String name;

    @Nullable
    private java.lang.Object value;

    @Nullable
    private Boolean staged;

    /**
     *  <p>The name of the Attribute to set.</p>
     * @param name value to be set
     * @return Builder
     */

    public ProductTailoringSetAttributeInAllVariantsActionBuilder name(final String name) {
        this.name = name;
        return this;
    }

    /**
     *  <p>Value to set for the Attributes. If empty, any existing value will be removed.</p>
     *  <p>The AttributeType determines the format of the Attribute <code>value</code> to be provided:</p>
     *  <ul>
     *   <li>For Enum Type and Localized Enum Type, use the <code>key</code> of the Plain Enum Value or Localized Enum Value objects, or the complete objects as <code>value</code>.</li>
     *   <li>For Localizable Text Type, use the LocalizedString object as <code>value</code>.</li>
     *   <li>For Money Type Attributes, use the Money object as <code>value</code>.</li>
     *   <li>For Set Type Attributes, use the entire <code>set</code> object as <code>value</code>.</li>
     *   <li>For Reference Type Attributes, use the Reference object as <code>value</code>.</li>
     *  </ul>
     *  <p>Tailoring of Nested Type Attributes is <strong>not supported</strong>.</p>
     * @param value value to be set
     * @return Builder
     */

    public ProductTailoringSetAttributeInAllVariantsActionBuilder value(@Nullable final java.lang.Object value) {
        this.value = value;
        return this;
    }

    /**
     *  <p>If <code>true</code>, only the staged Attributes are set. If <code>false</code>, both the current and staged Attributes are set.</p>
     * @param staged value to be set
     * @return Builder
     */

    public ProductTailoringSetAttributeInAllVariantsActionBuilder staged(@Nullable final Boolean staged) {
        this.staged = staged;
        return this;
    }

    /**
     *  <p>The name of the Attribute to set.</p>
     * @return name
     */

    public String getName() {
        return this.name;
    }

    /**
     *  <p>Value to set for the Attributes. If empty, any existing value will be removed.</p>
     *  <p>The AttributeType determines the format of the Attribute <code>value</code> to be provided:</p>
     *  <ul>
     *   <li>For Enum Type and Localized Enum Type, use the <code>key</code> of the Plain Enum Value or Localized Enum Value objects, or the complete objects as <code>value</code>.</li>
     *   <li>For Localizable Text Type, use the LocalizedString object as <code>value</code>.</li>
     *   <li>For Money Type Attributes, use the Money object as <code>value</code>.</li>
     *   <li>For Set Type Attributes, use the entire <code>set</code> object as <code>value</code>.</li>
     *   <li>For Reference Type Attributes, use the Reference object as <code>value</code>.</li>
     *  </ul>
     *  <p>Tailoring of Nested Type Attributes is <strong>not supported</strong>.</p>
     * @return value
     */

    @Nullable
    public java.lang.Object getValue() {
        return this.value;
    }

    /**
     *  <p>If <code>true</code>, only the staged Attributes are set. If <code>false</code>, both the current and staged Attributes are set.</p>
     * @return staged
     */

    @Nullable
    public Boolean getStaged() {
        return this.staged;
    }

    /**
     * builds ProductTailoringSetAttributeInAllVariantsAction with checking for non-null required values
     * @return ProductTailoringSetAttributeInAllVariantsAction
     */
    public ProductTailoringSetAttributeInAllVariantsAction build() {
        Objects.requireNonNull(name, ProductTailoringSetAttributeInAllVariantsAction.class + ": name is missing");
        return new ProductTailoringSetAttributeInAllVariantsActionImpl(name, value, staged);
    }

    /**
     * builds ProductTailoringSetAttributeInAllVariantsAction without checking for non-null required values
     * @return ProductTailoringSetAttributeInAllVariantsAction
     */
    public ProductTailoringSetAttributeInAllVariantsAction buildUnchecked() {
        return new ProductTailoringSetAttributeInAllVariantsActionImpl(name, value, staged);
    }

    /**
     * factory method for an instance of ProductTailoringSetAttributeInAllVariantsActionBuilder
     * @return builder
     */
    public static ProductTailoringSetAttributeInAllVariantsActionBuilder of() {
        return new ProductTailoringSetAttributeInAllVariantsActionBuilder();
    }

    /**
     * create builder for ProductTailoringSetAttributeInAllVariantsAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductTailoringSetAttributeInAllVariantsActionBuilder of(
            final ProductTailoringSetAttributeInAllVariantsAction template) {
        ProductTailoringSetAttributeInAllVariantsActionBuilder builder = new ProductTailoringSetAttributeInAllVariantsActionBuilder();
        builder.name = template.getName();
        builder.value = template.getValue();
        builder.staged = template.getStaged();
        return builder;
    }

}
