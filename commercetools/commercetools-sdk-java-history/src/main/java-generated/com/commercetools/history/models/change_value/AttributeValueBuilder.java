
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
     *  <p>Value set for the Attribute determined by the <a href="https://docs.commercetools.com/apis/ctp:api:type:AttributeType" rel="nofollow">AttributeType</a>:</p>
     *  <ul>
     *   <li>For <a href="https://docs.commercetools.com/apis/ctp:api:type:AttributeEnumType" rel="nofollow">Enum Type</a> and <a href="https://docs.commercetools.com/apis/ctp:api:type:AttributeLocalizedEnumType" rel="nofollow">Localized Enum Type</a>, <code>value</code> is the <code>key</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:AttributePlainEnumValue" rel="nofollow">Plain Enum Value</a> or <a href="https://docs.commercetools.com/apis/ctp:api:type:AttributeLocalizedEnumValue" rel="nofollow">Localized Enum Value</a> objects, or the complete objects.</li>
     *   <li>For <a href="https://docs.commercetools.com/apis/ctp:api:type:AttributeLocalizableTextType" rel="nofollow">Localizable Text Type</a>, <code>value</code> is the <a href="https://docs.commercetools.com/apis/ctp:api:type:LocalizedString" rel="nofollow">LocalizedString</a> object.</li>
     *   <li>For <a href="https://docs.commercetools.com/apis/ctp:api:type:AttributeMoneyType" rel="nofollow">Money Type</a> Attributes, <code>value</code> is the <a href="https://docs.commercetools.com/apis/ctp:api:type:Money" rel="nofollow">Money</a> object.</li>
     *   <li>For <a href="https://docs.commercetools.com/apis/ctp:api:type:AttributeSetType" rel="nofollow">Set Type</a> Attributes, <code>value</code> is the entire <code>set</code> object.</li>
     *   <li>For <a href="https://docs.commercetools.com/apis/ctp:api:type:AttributeNestedType" rel="nofollow">Nested Type</a> Attributes, <code>value</code> is the list of values of all Attributes of the nested Product.</li>
     *   <li>For <a href="https://docs.commercetools.com/apis/ctp:api:type:AttributeReferenceType" rel="nofollow">Reference Type</a> Attributes, <code>value</code> is the <a href="https://docs.commercetools.com/apis/ctp:api:type:Reference" rel="nofollow">Reference</a> object.</li>
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
     *  <p>Value set for the Attribute determined by the <a href="https://docs.commercetools.com/apis/ctp:api:type:AttributeType" rel="nofollow">AttributeType</a>:</p>
     *  <ul>
     *   <li>For <a href="https://docs.commercetools.com/apis/ctp:api:type:AttributeEnumType" rel="nofollow">Enum Type</a> and <a href="https://docs.commercetools.com/apis/ctp:api:type:AttributeLocalizedEnumType" rel="nofollow">Localized Enum Type</a>, <code>value</code> is the <code>key</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:AttributePlainEnumValue" rel="nofollow">Plain Enum Value</a> or <a href="https://docs.commercetools.com/apis/ctp:api:type:AttributeLocalizedEnumValue" rel="nofollow">Localized Enum Value</a> objects, or the complete objects.</li>
     *   <li>For <a href="https://docs.commercetools.com/apis/ctp:api:type:AttributeLocalizableTextType" rel="nofollow">Localizable Text Type</a>, <code>value</code> is the <a href="https://docs.commercetools.com/apis/ctp:api:type:LocalizedString" rel="nofollow">LocalizedString</a> object.</li>
     *   <li>For <a href="https://docs.commercetools.com/apis/ctp:api:type:AttributeMoneyType" rel="nofollow">Money Type</a> Attributes, <code>value</code> is the <a href="https://docs.commercetools.com/apis/ctp:api:type:Money" rel="nofollow">Money</a> object.</li>
     *   <li>For <a href="https://docs.commercetools.com/apis/ctp:api:type:AttributeSetType" rel="nofollow">Set Type</a> Attributes, <code>value</code> is the entire <code>set</code> object.</li>
     *   <li>For <a href="https://docs.commercetools.com/apis/ctp:api:type:AttributeNestedType" rel="nofollow">Nested Type</a> Attributes, <code>value</code> is the list of values of all Attributes of the nested Product.</li>
     *   <li>For <a href="https://docs.commercetools.com/apis/ctp:api:type:AttributeReferenceType" rel="nofollow">Reference Type</a> Attributes, <code>value</code> is the <a href="https://docs.commercetools.com/apis/ctp:api:type:Reference" rel="nofollow">Reference</a> object.</li>
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
