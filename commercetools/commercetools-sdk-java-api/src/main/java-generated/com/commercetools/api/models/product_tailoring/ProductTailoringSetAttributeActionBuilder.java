
package com.commercetools.api.models.product_tailoring;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductTailoringSetAttributeActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductTailoringSetAttributeAction productTailoringSetAttributeAction = ProductTailoringSetAttributeAction.builder()
 *             .name("{name}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductTailoringSetAttributeActionBuilder implements Builder<ProductTailoringSetAttributeAction> {

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
     *  <p>The <code>id</code> of the ProductVariant to update. Required if <code>sku</code> is absent.</p>
     * @param variantId value to be set
     * @return Builder
     */

    public ProductTailoringSetAttributeActionBuilder variantId(@Nullable final Long variantId) {
        this.variantId = variantId;
        return this;
    }

    /**
     *  <p>The <code>sku</code> of the ProductVariant to update. Required if <code>variantId</code> is absent.</p>
     * @param sku value to be set
     * @return Builder
     */

    public ProductTailoringSetAttributeActionBuilder sku(@Nullable final String sku) {
        this.sku = sku;
        return this;
    }

    /**
     *  <p>The name of the Attribute to set.</p>
     * @param name value to be set
     * @return Builder
     */

    public ProductTailoringSetAttributeActionBuilder name(final String name) {
        this.name = name;
        return this;
    }

    /**
     *  <p>Value to set for the Attribute. If empty, any existing value will be removed.</p>
     *  <p>The <a href="https://docs.commercetools.com/apis/ctp:api:type:AttributeType" rel="nofollow">AttributeType</a> determines the format of the Attribute <code>value</code> to be provided:</p>
     *  <ul>
     *   <li>For <a href="https://docs.commercetools.com/apis/ctp:api:type:AttributeEnumType" rel="nofollow">Enum Type</a> and <a href="https://docs.commercetools.com/apis/ctp:api:type:AttributeLocalizedEnumType" rel="nofollow">Localized Enum Type</a>, use the <code>key</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:AttributePlainEnumValue" rel="nofollow">Plain Enum Value</a> or <a href="https://docs.commercetools.com/apis/ctp:api:type:AttributeLocalizedEnumValue" rel="nofollow">Localized Enum Value</a> objects, or the complete objects as <code>value</code>.</li>
     *   <li>For <a href="https://docs.commercetools.com/apis/ctp:api:type:AttributeLocalizableTextType" rel="nofollow">Localizable Text Type</a>, use the <a href="https://docs.commercetools.com/apis/ctp:api:type:LocalizedString" rel="nofollow">LocalizedString</a> object as <code>value</code>.</li>
     *   <li>For <a href="https://docs.commercetools.com/apis/ctp:api:type:AttributeMoneyType" rel="nofollow">Money Type</a> Attributes, use the <a href="https://docs.commercetools.com/apis/ctp:api:type:Money" rel="nofollow">Money</a> object as <code>value</code>.</li>
     *   <li>For <a href="https://docs.commercetools.com/apis/ctp:api:type:AttributeSetType" rel="nofollow">Set Type</a> Attributes, use the entire <code>set</code> object as <code>value</code>.</li>
     *   <li>For <a href="https://docs.commercetools.com/apis/ctp:api:type:AttributeReferenceType" rel="nofollow">Reference Type</a> Attributes, use the <a href="https://docs.commercetools.com/apis/ctp:api:type:Reference" rel="nofollow">Reference</a> object as <code>value</code>.</li>
     *  </ul>
     *  <p>Tailoring of <a href="https://docs.commercetools.com/apis/ctp:api:type:AttributeNestedType" rel="nofollow">Nested Type</a> Attributes is <strong>not supported</strong>.</p>
     * @param value value to be set
     * @return Builder
     */

    public ProductTailoringSetAttributeActionBuilder value(@Nullable final java.lang.Object value) {
        this.value = value;
        return this;
    }

    /**
     *  <p>If <code>true</code>, only the staged Attribute is set. If <code>false</code>, both current and staged Attribute is set.</p>
     * @param staged value to be set
     * @return Builder
     */

    public ProductTailoringSetAttributeActionBuilder staged(@Nullable final Boolean staged) {
        this.staged = staged;
        return this;
    }

    /**
     *  <p>The <code>id</code> of the ProductVariant to update. Required if <code>sku</code> is absent.</p>
     * @return variantId
     */

    @Nullable
    public Long getVariantId() {
        return this.variantId;
    }

    /**
     *  <p>The <code>sku</code> of the ProductVariant to update. Required if <code>variantId</code> is absent.</p>
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
     *  <p>The <a href="https://docs.commercetools.com/apis/ctp:api:type:AttributeType" rel="nofollow">AttributeType</a> determines the format of the Attribute <code>value</code> to be provided:</p>
     *  <ul>
     *   <li>For <a href="https://docs.commercetools.com/apis/ctp:api:type:AttributeEnumType" rel="nofollow">Enum Type</a> and <a href="https://docs.commercetools.com/apis/ctp:api:type:AttributeLocalizedEnumType" rel="nofollow">Localized Enum Type</a>, use the <code>key</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:AttributePlainEnumValue" rel="nofollow">Plain Enum Value</a> or <a href="https://docs.commercetools.com/apis/ctp:api:type:AttributeLocalizedEnumValue" rel="nofollow">Localized Enum Value</a> objects, or the complete objects as <code>value</code>.</li>
     *   <li>For <a href="https://docs.commercetools.com/apis/ctp:api:type:AttributeLocalizableTextType" rel="nofollow">Localizable Text Type</a>, use the <a href="https://docs.commercetools.com/apis/ctp:api:type:LocalizedString" rel="nofollow">LocalizedString</a> object as <code>value</code>.</li>
     *   <li>For <a href="https://docs.commercetools.com/apis/ctp:api:type:AttributeMoneyType" rel="nofollow">Money Type</a> Attributes, use the <a href="https://docs.commercetools.com/apis/ctp:api:type:Money" rel="nofollow">Money</a> object as <code>value</code>.</li>
     *   <li>For <a href="https://docs.commercetools.com/apis/ctp:api:type:AttributeSetType" rel="nofollow">Set Type</a> Attributes, use the entire <code>set</code> object as <code>value</code>.</li>
     *   <li>For <a href="https://docs.commercetools.com/apis/ctp:api:type:AttributeReferenceType" rel="nofollow">Reference Type</a> Attributes, use the <a href="https://docs.commercetools.com/apis/ctp:api:type:Reference" rel="nofollow">Reference</a> object as <code>value</code>.</li>
     *  </ul>
     *  <p>Tailoring of <a href="https://docs.commercetools.com/apis/ctp:api:type:AttributeNestedType" rel="nofollow">Nested Type</a> Attributes is <strong>not supported</strong>.</p>
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
     * builds ProductTailoringSetAttributeAction with checking for non-null required values
     * @return ProductTailoringSetAttributeAction
     */
    public ProductTailoringSetAttributeAction build() {
        Objects.requireNonNull(name, ProductTailoringSetAttributeAction.class + ": name is missing");
        return new ProductTailoringSetAttributeActionImpl(variantId, sku, name, value, staged);
    }

    /**
     * builds ProductTailoringSetAttributeAction without checking for non-null required values
     * @return ProductTailoringSetAttributeAction
     */
    public ProductTailoringSetAttributeAction buildUnchecked() {
        return new ProductTailoringSetAttributeActionImpl(variantId, sku, name, value, staged);
    }

    /**
     * factory method for an instance of ProductTailoringSetAttributeActionBuilder
     * @return builder
     */
    public static ProductTailoringSetAttributeActionBuilder of() {
        return new ProductTailoringSetAttributeActionBuilder();
    }

    /**
     * create builder for ProductTailoringSetAttributeAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductTailoringSetAttributeActionBuilder of(final ProductTailoringSetAttributeAction template) {
        ProductTailoringSetAttributeActionBuilder builder = new ProductTailoringSetAttributeActionBuilder();
        builder.variantId = template.getVariantId();
        builder.sku = template.getSku();
        builder.name = template.getName();
        builder.value = template.getValue();
        builder.staged = template.getStaged();
        return builder;
    }

}
