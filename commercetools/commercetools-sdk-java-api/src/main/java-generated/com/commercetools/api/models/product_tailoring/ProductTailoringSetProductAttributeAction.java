
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
 * ProductTailoringSetProductAttributeAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductTailoringSetProductAttributeAction productTailoringSetProductAttributeAction = ProductTailoringSetProductAttributeAction.builder()
 *             .name("{name}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("setProductAttribute")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductTailoringSetProductAttributeActionImpl.class)
public interface ProductTailoringSetProductAttributeAction extends ProductTailoringUpdateAction {

    /**
     * discriminator value for ProductTailoringSetProductAttributeAction
     */
    String SET_PRODUCT_ATTRIBUTE = "setProductAttribute";

    /**
     *  <p>Name of the Attribute to set.</p>
     * @return name
     */
    @NotNull
    @JsonProperty("name")
    public String getName();

    /**
     *  <p>Value to set for the Attribute. If empty, then any existing value will be removed.</p>
     *  <p>AttributeType determines the format of the Attribute <code>value</code> to be provided:</p>
     *  <ul>
     *   <li>For Enum Type and Localized Enum Type, use either the <code>key</code> of the Plain Enum Value or Localized Enum Value object or the complete object as <code>value</code>.</li>
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
     *  <p>If <code>true</code>, then only the staged Attribute is set. If <code>false</code>, then both the current and staged Attributes are set.</p>
     * @return staged
     */

    @JsonProperty("staged")
    public Boolean getStaged();

    /**
     *  <p>Name of the Attribute to set.</p>
     * @param name value to be set
     */

    public void setName(final String name);

    /**
     *  <p>Value to set for the Attribute. If empty, then any existing value will be removed.</p>
     *  <p>AttributeType determines the format of the Attribute <code>value</code> to be provided:</p>
     *  <ul>
     *   <li>For Enum Type and Localized Enum Type, use either the <code>key</code> of the Plain Enum Value or Localized Enum Value object or the complete object as <code>value</code>.</li>
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
     *  <p>If <code>true</code>, then only the staged Attribute is set. If <code>false</code>, then both the current and staged Attributes are set.</p>
     * @param staged value to be set
     */

    public void setStaged(final Boolean staged);

    /**
     * factory method
     * @return instance of ProductTailoringSetProductAttributeAction
     */
    public static ProductTailoringSetProductAttributeAction of() {
        return new ProductTailoringSetProductAttributeActionImpl();
    }

    /**
     * factory method to create a shallow copy ProductTailoringSetProductAttributeAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductTailoringSetProductAttributeAction of(
            final ProductTailoringSetProductAttributeAction template) {
        ProductTailoringSetProductAttributeActionImpl instance = new ProductTailoringSetProductAttributeActionImpl();
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        instance.setStaged(template.getStaged());
        return instance;
    }

    public ProductTailoringSetProductAttributeAction copyDeep();

    /**
     * factory method to create a deep copy of ProductTailoringSetProductAttributeAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProductTailoringSetProductAttributeAction deepCopy(
            @Nullable final ProductTailoringSetProductAttributeAction template) {
        if (template == null) {
            return null;
        }
        ProductTailoringSetProductAttributeActionImpl instance = new ProductTailoringSetProductAttributeActionImpl();
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        instance.setStaged(template.getStaged());
        return instance;
    }

    /**
     * builder factory method for ProductTailoringSetProductAttributeAction
     * @return builder
     */
    public static ProductTailoringSetProductAttributeActionBuilder builder() {
        return ProductTailoringSetProductAttributeActionBuilder.of();
    }

    /**
     * create builder for ProductTailoringSetProductAttributeAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductTailoringSetProductAttributeActionBuilder builder(
            final ProductTailoringSetProductAttributeAction template) {
        return ProductTailoringSetProductAttributeActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductTailoringSetProductAttributeAction(
            Function<ProductTailoringSetProductAttributeAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductTailoringSetProductAttributeAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductTailoringSetProductAttributeAction>() {
            @Override
            public String toString() {
                return "TypeReference<ProductTailoringSetProductAttributeAction>";
            }
        };
    }
}
