
package com.commercetools.api.models.product;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductSetAttributeInAllVariantsActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductSetAttributeInAllVariantsAction productSetAttributeInAllVariantsAction = ProductSetAttributeInAllVariantsAction.builder()
 *             .name("{name}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductSetAttributeInAllVariantsActionBuilder implements Builder<ProductSetAttributeInAllVariantsAction> {

    private String name;

    @Nullable
    private java.lang.Object value;

    @Nullable
    private Boolean staged;

    /**
     *  <p>Name of the Attribute to set.</p>
     * @param name value to be set
     * @return Builder
     */

    public ProductSetAttributeInAllVariantsActionBuilder name(final String name) {
        this.name = name;
        return this;
    }

    /**
     *  <p>Value to set for the Attributes. If empty, any existing value will be removed.</p>
     *  <p>The <a href="https://docs.commercetools.com/apis/ctp:api:type:AttributeType" rel="nofollow">AttributeType</a> determines the format of the Attribute <code>value</code> to be provided:</p>
     *  <ul>
     *   <li>For <a href="https://docs.commercetools.com/apis/ctp:api:type:AttributeEnumType" rel="nofollow">Enum Type</a> and <a href="https://docs.commercetools.com/apis/ctp:api:type:AttributeLocalizedEnumType" rel="nofollow">Localized Enum Type</a>, use the <code>key</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:AttributePlainEnumValue" rel="nofollow">Plain Enum Value</a> or <a href="https://docs.commercetools.com/apis/ctp:api:type:AttributeLocalizedEnumValue" rel="nofollow">Localized Enum Value</a> objects, or the complete objects as <code>value</code>.</li>
     *   <li>For <a href="https://docs.commercetools.com/apis/ctp:api:type:AttributeLocalizableTextType" rel="nofollow">Localizable Text Type</a>, use the <a href="https://docs.commercetools.com/apis/ctp:api:type:LocalizedString" rel="nofollow">LocalizedString</a> object as <code>value</code>.</li>
     *   <li>For <a href="https://docs.commercetools.com/apis/ctp:api:type:AttributeMoneyType" rel="nofollow">Money Type</a> Attributes, use the <a href="https://docs.commercetools.com/apis/ctp:api:type:Money" rel="nofollow">Money</a> object as <code>value</code>.</li>
     *   <li>For <a href="https://docs.commercetools.com/apis/ctp:api:type:AttributeSetType" rel="nofollow">Set Type</a> Attributes, use the entire <code>set</code> object as <code>value</code>.</li>
     *   <li>For <a href="https://docs.commercetools.com/apis/ctp:api:type:AttributeNestedType" rel="nofollow">Nested Type</a> Attributes, use the list of values of all Attributes of the nested Product as <code>value</code>.</li>
     *   <li>For <a href="https://docs.commercetools.com/apis/ctp:api:type:AttributeReferenceType" rel="nofollow">Reference Type</a> Attributes, use the <a href="https://docs.commercetools.com/apis/ctp:api:type:Reference" rel="nofollow">Reference</a> object as <code>value</code>.</li>
     *  </ul>
     * @param value value to be set
     * @return Builder
     */

    public ProductSetAttributeInAllVariantsActionBuilder value(@Nullable final java.lang.Object value) {
        this.value = value;
        return this;
    }

    /**
     *  <p>If <code>true</code>, only the staged Attributes are set. If <code>false</code>, both the current and staged Attributes are set.</p>
     * @param staged value to be set
     * @return Builder
     */

    public ProductSetAttributeInAllVariantsActionBuilder staged(@Nullable final Boolean staged) {
        this.staged = staged;
        return this;
    }

    /**
     *  <p>Name of the Attribute to set.</p>
     * @return name
     */

    public String getName() {
        return this.name;
    }

    /**
     *  <p>Value to set for the Attributes. If empty, any existing value will be removed.</p>
     *  <p>The <a href="https://docs.commercetools.com/apis/ctp:api:type:AttributeType" rel="nofollow">AttributeType</a> determines the format of the Attribute <code>value</code> to be provided:</p>
     *  <ul>
     *   <li>For <a href="https://docs.commercetools.com/apis/ctp:api:type:AttributeEnumType" rel="nofollow">Enum Type</a> and <a href="https://docs.commercetools.com/apis/ctp:api:type:AttributeLocalizedEnumType" rel="nofollow">Localized Enum Type</a>, use the <code>key</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:AttributePlainEnumValue" rel="nofollow">Plain Enum Value</a> or <a href="https://docs.commercetools.com/apis/ctp:api:type:AttributeLocalizedEnumValue" rel="nofollow">Localized Enum Value</a> objects, or the complete objects as <code>value</code>.</li>
     *   <li>For <a href="https://docs.commercetools.com/apis/ctp:api:type:AttributeLocalizableTextType" rel="nofollow">Localizable Text Type</a>, use the <a href="https://docs.commercetools.com/apis/ctp:api:type:LocalizedString" rel="nofollow">LocalizedString</a> object as <code>value</code>.</li>
     *   <li>For <a href="https://docs.commercetools.com/apis/ctp:api:type:AttributeMoneyType" rel="nofollow">Money Type</a> Attributes, use the <a href="https://docs.commercetools.com/apis/ctp:api:type:Money" rel="nofollow">Money</a> object as <code>value</code>.</li>
     *   <li>For <a href="https://docs.commercetools.com/apis/ctp:api:type:AttributeSetType" rel="nofollow">Set Type</a> Attributes, use the entire <code>set</code> object as <code>value</code>.</li>
     *   <li>For <a href="https://docs.commercetools.com/apis/ctp:api:type:AttributeNestedType" rel="nofollow">Nested Type</a> Attributes, use the list of values of all Attributes of the nested Product as <code>value</code>.</li>
     *   <li>For <a href="https://docs.commercetools.com/apis/ctp:api:type:AttributeReferenceType" rel="nofollow">Reference Type</a> Attributes, use the <a href="https://docs.commercetools.com/apis/ctp:api:type:Reference" rel="nofollow">Reference</a> object as <code>value</code>.</li>
     *  </ul>
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
     * builds ProductSetAttributeInAllVariantsAction with checking for non-null required values
     * @return ProductSetAttributeInAllVariantsAction
     */
    public ProductSetAttributeInAllVariantsAction build() {
        Objects.requireNonNull(name, ProductSetAttributeInAllVariantsAction.class + ": name is missing");
        return new ProductSetAttributeInAllVariantsActionImpl(name, value, staged);
    }

    /**
     * builds ProductSetAttributeInAllVariantsAction without checking for non-null required values
     * @return ProductSetAttributeInAllVariantsAction
     */
    public ProductSetAttributeInAllVariantsAction buildUnchecked() {
        return new ProductSetAttributeInAllVariantsActionImpl(name, value, staged);
    }

    /**
     * factory method for an instance of ProductSetAttributeInAllVariantsActionBuilder
     * @return builder
     */
    public static ProductSetAttributeInAllVariantsActionBuilder of() {
        return new ProductSetAttributeInAllVariantsActionBuilder();
    }

    /**
     * create builder for ProductSetAttributeInAllVariantsAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductSetAttributeInAllVariantsActionBuilder of(
            final ProductSetAttributeInAllVariantsAction template) {
        ProductSetAttributeInAllVariantsActionBuilder builder = new ProductSetAttributeInAllVariantsActionBuilder();
        builder.name = template.getName();
        builder.value = template.getValue();
        builder.staged = template.getStaged();
        return builder;
    }

}
