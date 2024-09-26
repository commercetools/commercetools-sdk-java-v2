
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
 *  <p>The same rules for <code>name</code> and <code>value</code> apply as for Attribute in Product Variants.</p>
 *
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
@JsonDeserialize(as = ProductTailoringAttributeImpl.class)
public interface ProductTailoringAttribute {

    /**
     *  <p>Name of the Attribute.</p>
     * @return name
     */
    @NotNull
    @JsonProperty("name")
    public String getName();

    /**
     *  <p>The AttributeType determines the format of the Attribute <code>value</code> to be provided:</p>
     *  <ul>
     *   <li>For Enum Type and Localized Enum Type, use the <code>key</code> of the Plain Enum Value or Localized Enum Value objects, or the complete objects as <code>value</code>.</li>
     *   <li>For Localizable Text Type, use the LocalizedString object as <code>value</code>.</li>
     *   <li>For Money Type Attributes, use the Money object as <code>value</code>.</li>
     *   <li>For Set Type Attributes, use the entire <code>set</code> object as <code>value</code>.</li>
     *   <li>For Reference Type Attributes, use the Reference object as <code>value</code>.</li>
     *  </ul>
     *  <p>Tailoring of Nested Type Attributes is not supported.</p>
     * @return value
     */
    @NotNull
    @JsonProperty("value")
    public Object getValue();

    /**
     *  <p>Name of the Attribute.</p>
     * @param name value to be set
     */

    public void setName(final String name);

    /**
     *  <p>The AttributeType determines the format of the Attribute <code>value</code> to be provided:</p>
     *  <ul>
     *   <li>For Enum Type and Localized Enum Type, use the <code>key</code> of the Plain Enum Value or Localized Enum Value objects, or the complete objects as <code>value</code>.</li>
     *   <li>For Localizable Text Type, use the LocalizedString object as <code>value</code>.</li>
     *   <li>For Money Type Attributes, use the Money object as <code>value</code>.</li>
     *   <li>For Set Type Attributes, use the entire <code>set</code> object as <code>value</code>.</li>
     *   <li>For Reference Type Attributes, use the Reference object as <code>value</code>.</li>
     *  </ul>
     *  <p>Tailoring of Nested Type Attributes is not supported.</p>
     * @param value value to be set
     */

    public void setValue(final Object value);

    /**
     * factory method
     * @return instance of ProductTailoringAttribute
     */
    public static ProductTailoringAttribute of() {
        return new ProductTailoringAttributeImpl();
    }

    /**
     * factory method to create a shallow copy ProductTailoringAttribute
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductTailoringAttribute of(final ProductTailoringAttribute template) {
        ProductTailoringAttributeImpl instance = new ProductTailoringAttributeImpl();
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

    /**
     * factory method to create a deep copy of ProductTailoringAttribute
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProductTailoringAttribute deepCopy(@Nullable final ProductTailoringAttribute template) {
        if (template == null) {
            return null;
        }
        ProductTailoringAttributeImpl instance = new ProductTailoringAttributeImpl();
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

    /**
     * builder factory method for ProductTailoringAttribute
     * @return builder
     */
    public static ProductTailoringAttributeBuilder builder() {
        return ProductTailoringAttributeBuilder.of();
    }

    /**
     * create builder for ProductTailoringAttribute instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductTailoringAttributeBuilder builder(final ProductTailoringAttribute template) {
        return ProductTailoringAttributeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductTailoringAttribute(Function<ProductTailoringAttribute, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductTailoringAttribute> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductTailoringAttribute>() {
            @Override
            public String toString() {
                return "TypeReference<ProductTailoringAttribute>";
            }
        };
    }
}
