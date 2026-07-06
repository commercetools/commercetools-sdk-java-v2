
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
     *  <p>The <a href="https://docs.commercetools.com/apis/ctp:api:type:AttributeType" rel="nofollow">AttributeType</a> determines the format of the Attribute <code>value</code> to be provided:</p>
     *  <ul>
     *   <li>For <a href="https://docs.commercetools.com/apis/ctp:api:type:AttributeEnumType" rel="nofollow">Enum Type</a> and <a href="https://docs.commercetools.com/apis/ctp:api:type:AttributeLocalizedEnumType" rel="nofollow">Localized Enum Type</a>, use the <code>key</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:AttributePlainEnumValue" rel="nofollow">Plain Enum Value</a> or <a href="https://docs.commercetools.com/apis/ctp:api:type:AttributeLocalizedEnumValue" rel="nofollow">Localized Enum Value</a> objects, or the complete objects as <code>value</code>.</li>
     *   <li>For <a href="https://docs.commercetools.com/apis/ctp:api:type:AttributeLocalizableTextType" rel="nofollow">Localizable Text Type</a>, use the <a href="https://docs.commercetools.com/apis/ctp:api:type:LocalizedString" rel="nofollow">LocalizedString</a> object as <code>value</code>.</li>
     *   <li>For <a href="https://docs.commercetools.com/apis/ctp:api:type:AttributeMoneyType" rel="nofollow">Money Type</a> Attributes, use the <a href="https://docs.commercetools.com/apis/ctp:api:type:Money" rel="nofollow">Money</a> object as <code>value</code>.</li>
     *   <li>For <a href="https://docs.commercetools.com/apis/ctp:api:type:AttributeSetType" rel="nofollow">Set Type</a> Attributes, use the entire <code>set</code> object as <code>value</code>.</li>
     *   <li>For <a href="https://docs.commercetools.com/apis/ctp:api:type:AttributeReferenceType" rel="nofollow">Reference Type</a> Attributes, use the <a href="https://docs.commercetools.com/apis/ctp:api:type:Reference" rel="nofollow">Reference</a> object as <code>value</code>.</li>
     *  </ul>
     *  <p>Tailoring of <a href="https://docs.commercetools.com/apis/ctp:api:type:AttributeNestedType" rel="nofollow">Nested Type</a> Attributes is not supported.</p>
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
     *  <p>The <a href="https://docs.commercetools.com/apis/ctp:api:type:AttributeType" rel="nofollow">AttributeType</a> determines the format of the Attribute <code>value</code> to be provided:</p>
     *  <ul>
     *   <li>For <a href="https://docs.commercetools.com/apis/ctp:api:type:AttributeEnumType" rel="nofollow">Enum Type</a> and <a href="https://docs.commercetools.com/apis/ctp:api:type:AttributeLocalizedEnumType" rel="nofollow">Localized Enum Type</a>, use the <code>key</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:AttributePlainEnumValue" rel="nofollow">Plain Enum Value</a> or <a href="https://docs.commercetools.com/apis/ctp:api:type:AttributeLocalizedEnumValue" rel="nofollow">Localized Enum Value</a> objects, or the complete objects as <code>value</code>.</li>
     *   <li>For <a href="https://docs.commercetools.com/apis/ctp:api:type:AttributeLocalizableTextType" rel="nofollow">Localizable Text Type</a>, use the <a href="https://docs.commercetools.com/apis/ctp:api:type:LocalizedString" rel="nofollow">LocalizedString</a> object as <code>value</code>.</li>
     *   <li>For <a href="https://docs.commercetools.com/apis/ctp:api:type:AttributeMoneyType" rel="nofollow">Money Type</a> Attributes, use the <a href="https://docs.commercetools.com/apis/ctp:api:type:Money" rel="nofollow">Money</a> object as <code>value</code>.</li>
     *   <li>For <a href="https://docs.commercetools.com/apis/ctp:api:type:AttributeSetType" rel="nofollow">Set Type</a> Attributes, use the entire <code>set</code> object as <code>value</code>.</li>
     *   <li>For <a href="https://docs.commercetools.com/apis/ctp:api:type:AttributeReferenceType" rel="nofollow">Reference Type</a> Attributes, use the <a href="https://docs.commercetools.com/apis/ctp:api:type:Reference" rel="nofollow">Reference</a> object as <code>value</code>.</li>
     *  </ul>
     *  <p>Tailoring of <a href="https://docs.commercetools.com/apis/ctp:api:type:AttributeNestedType" rel="nofollow">Nested Type</a> Attributes is not supported.</p>
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
