
package com.commercetools.api.models.product_tailoring;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 *  <p>Adds, removes, or changes a tailored Attribute in all Product Variants of a Product at the same time. This action is useful for setting tailored values for Attributes with the <a href="https://docs.commercetools.com/apis/ctp:api:type:AttributeConstraintEnum" rel="nofollow">Constraint</a> <code>SameForAll</code>.</p>
 *
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
@io.vrap.rmf.base.client.utils.json.SubType("setAttributeInAllVariants")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductTailoringSetAttributeInAllVariantsActionImpl.class)
public interface ProductTailoringSetAttributeInAllVariantsAction extends ProductTailoringUpdateAction {

    /**
     * discriminator value for ProductTailoringSetAttributeInAllVariantsAction
     */
    String SET_ATTRIBUTE_IN_ALL_VARIANTS = "setAttributeInAllVariants";

    /**
     *  <p>The name of the Attribute to set.</p>
     * @return name
     */
    @NotNull
    @JsonProperty("name")
    public String getName();

    /**
     *  <p>Value to set for the Attributes. If empty, any existing value will be removed.</p>
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

    @JsonProperty("value")
    public Object getValue();

    /**
     *  <p>If <code>true</code>, only the staged Attributes are set. If <code>false</code>, both the current and staged Attributes are set.</p>
     * @return staged
     */

    @JsonProperty("staged")
    public Boolean getStaged();

    /**
     *  <p>The name of the Attribute to set.</p>
     * @param name value to be set
     */

    public void setName(final String name);

    /**
     *  <p>Value to set for the Attributes. If empty, any existing value will be removed.</p>
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
     */

    public void setValue(final Object value);

    /**
     *  <p>If <code>true</code>, only the staged Attributes are set. If <code>false</code>, both the current and staged Attributes are set.</p>
     * @param staged value to be set
     */

    public void setStaged(final Boolean staged);

    /**
     * factory method
     * @return instance of ProductTailoringSetAttributeInAllVariantsAction
     */
    public static ProductTailoringSetAttributeInAllVariantsAction of() {
        return new ProductTailoringSetAttributeInAllVariantsActionImpl();
    }

    /**
     * factory method to create a shallow copy ProductTailoringSetAttributeInAllVariantsAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductTailoringSetAttributeInAllVariantsAction of(
            final ProductTailoringSetAttributeInAllVariantsAction template) {
        ProductTailoringSetAttributeInAllVariantsActionImpl instance = new ProductTailoringSetAttributeInAllVariantsActionImpl();
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        instance.setStaged(template.getStaged());
        return instance;
    }

    public ProductTailoringSetAttributeInAllVariantsAction copyDeep();

    /**
     * factory method to create a deep copy of ProductTailoringSetAttributeInAllVariantsAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProductTailoringSetAttributeInAllVariantsAction deepCopy(
            @Nullable final ProductTailoringSetAttributeInAllVariantsAction template) {
        if (template == null) {
            return null;
        }
        ProductTailoringSetAttributeInAllVariantsActionImpl instance = new ProductTailoringSetAttributeInAllVariantsActionImpl();
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        instance.setStaged(template.getStaged());
        return instance;
    }

    /**
     * builder factory method for ProductTailoringSetAttributeInAllVariantsAction
     * @return builder
     */
    public static ProductTailoringSetAttributeInAllVariantsActionBuilder builder() {
        return ProductTailoringSetAttributeInAllVariantsActionBuilder.of();
    }

    /**
     * create builder for ProductTailoringSetAttributeInAllVariantsAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductTailoringSetAttributeInAllVariantsActionBuilder builder(
            final ProductTailoringSetAttributeInAllVariantsAction template) {
        return ProductTailoringSetAttributeInAllVariantsActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductTailoringSetAttributeInAllVariantsAction(
            Function<ProductTailoringSetAttributeInAllVariantsAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductTailoringSetAttributeInAllVariantsAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductTailoringSetAttributeInAllVariantsAction>() {
            @Override
            public String toString() {
                return "TypeReference<ProductTailoringSetAttributeInAllVariantsAction>";
            }
        };
    }
}
