
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
 *  <p>Adds, removes, or changes a tailored Attribute in all Product Variants of a Product at the same time. This action is useful for setting tailored values for Attributes with the Constraint <code>SameForAll</code>.</p>
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
