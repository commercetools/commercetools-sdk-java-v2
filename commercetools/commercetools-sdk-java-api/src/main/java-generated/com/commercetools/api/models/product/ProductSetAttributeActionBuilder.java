
package com.commercetools.api.models.product;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductSetAttributeActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductSetAttributeAction productSetAttributeAction = ProductSetAttributeAction.builder()
 *             .name("{name}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductSetAttributeActionBuilder implements Builder<ProductSetAttributeAction> {

    @Nullable
    private Long variantId;

    @Nullable
    private String sku;

    private String name;

    @Nullable
    private java.lang.Object value;

    @Nullable
    private Boolean staged;

    /**
     *  <p>The <code>id</code> of the ProductVariant to update.</p>
     * @param variantId value to be set
     * @return Builder
     */

    public ProductSetAttributeActionBuilder variantId(@Nullable final Long variantId) {
        this.variantId = variantId;
        return this;
    }

    /**
     *  <p>The <code>sku</code> of the ProductVariant to update.</p>
     * @param sku value to be set
     * @return Builder
     */

    public ProductSetAttributeActionBuilder sku(@Nullable final String sku) {
        this.sku = sku;
        return this;
    }

    /**
     *  <p>The name of the Attribute to set.</p>
     * @param name value to be set
     * @return Builder
     */

    public ProductSetAttributeActionBuilder name(final String name) {
        this.name = name;
        return this;
    }

    /**
     *  <p>Value to set for the Attribute. If empty, any existing value will be removed.</p>
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

    public ProductSetAttributeActionBuilder value(@Nullable final java.lang.Object value) {
        this.value = value;
        return this;
    }

    /**
     *  <p>If <code>true</code>, only the staged Attribute is set. If <code>false</code>, both current and staged Attribute is set.</p>
     * @param staged value to be set
     * @return Builder
     */

    public ProductSetAttributeActionBuilder staged(@Nullable final Boolean staged) {
        this.staged = staged;
        return this;
    }

    /**
     *  <p>The <code>id</code> of the ProductVariant to update.</p>
     * @return variantId
     */

    @Nullable
    public Long getVariantId() {
        return this.variantId;
    }

    /**
     *  <p>The <code>sku</code> of the ProductVariant to update.</p>
     * @return sku
     */

    @Nullable
    public String getSku() {
        return this.sku;
    }

    /**
     *  <p>The name of the Attribute to set.</p>
     * @return name
     */

    public String getName() {
        return this.name;
    }

    /**
     *  <p>Value to set for the Attribute. If empty, any existing value will be removed.</p>
     *  <p>The AttributeType determines the format of the Attribute <code>value</code> to be provided:</p>
     *  <ul>
     *   <li>For Enum Type and Localized Enum Type, use the <code>key</code> of the Plain Enum Value or Localized Enum Value objects, or the complete objects as <code>value</code>.</li>
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
     *  <p>If <code>true</code>, only the staged Attribute is set. If <code>false</code>, both current and staged Attribute is set.</p>
     * @return staged
     */

    @Nullable
    public Boolean getStaged() {
        return this.staged;
    }

    /**
     * builds ProductSetAttributeAction with checking for non-null required values
     * @return ProductSetAttributeAction
     */
    public ProductSetAttributeAction build() {
        Objects.requireNonNull(name, ProductSetAttributeAction.class + ": name is missing");
        return new ProductSetAttributeActionImpl(variantId, sku, name, value, staged);
    }

    /**
     * builds ProductSetAttributeAction without checking for non-null required values
     * @return ProductSetAttributeAction
     */
    public ProductSetAttributeAction buildUnchecked() {
        return new ProductSetAttributeActionImpl(variantId, sku, name, value, staged);
    }

    /**
     * factory method for an instance of ProductSetAttributeActionBuilder
     * @return builder
     */
    public static ProductSetAttributeActionBuilder of() {
        return new ProductSetAttributeActionBuilder();
    }

    /**
     * create builder for ProductSetAttributeAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductSetAttributeActionBuilder of(final ProductSetAttributeAction template) {
        ProductSetAttributeActionBuilder builder = new ProductSetAttributeActionBuilder();
        builder.variantId = template.getVariantId();
        builder.sku = template.getSku();
        builder.name = template.getName();
        builder.value = template.getValue();
        builder.staged = template.getStaged();
        return builder;
    }

}
