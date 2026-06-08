
package com.commercetools.api.models.product_type;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Adds a localizable enum to the values of <a href="https://docs.commercetools.com/apis/ctp:api:type:AttributeLocalizedEnumType" rel="nofollow">AttributeLocalizedEnumType</a>. It can update an AttributeLocalizedEnumType AttributeDefinition or an <a href="https://docs.commercetools.com/apis/ctp:api:type:AttributeSetType" rel="nofollow">AttributeSetType</a> of AttributeLocalizedEnumType AttributeDefinition.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductTypeAddLocalizedEnumValueAction productTypeAddLocalizedEnumValueAction = ProductTypeAddLocalizedEnumValueAction.builder()
 *             .attributeName("{attributeName}")
 *             .value(valueBuilder -> valueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("addLocalizedEnumValue")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductTypeAddLocalizedEnumValueActionImpl.class)
public interface ProductTypeAddLocalizedEnumValueAction extends ProductTypeUpdateAction {

    /**
     * discriminator value for ProductTypeAddLocalizedEnumValueAction
     */
    String ADD_LOCALIZED_ENUM_VALUE = "addLocalizedEnumValue";

    /**
     *  <p>Name of the AttributeDefinition to update.</p>
     * @return attributeName
     */
    @NotNull
    @JsonProperty("attributeName")
    public String getAttributeName();

    /**
     *  <p>Value to append to the array.</p>
     * @return value
     */
    @NotNull
    @Valid
    @JsonProperty("value")
    public AttributeLocalizedEnumValue getValue();

    /**
     *  <p>Name of the AttributeDefinition to update.</p>
     * @param attributeName value to be set
     */

    public void setAttributeName(final String attributeName);

    /**
     *  <p>Value to append to the array.</p>
     * @param value value to be set
     */

    public void setValue(final AttributeLocalizedEnumValue value);

    /**
     * factory method
     * @return instance of ProductTypeAddLocalizedEnumValueAction
     */
    public static ProductTypeAddLocalizedEnumValueAction of() {
        return new ProductTypeAddLocalizedEnumValueActionImpl();
    }

    /**
     * factory method to create a shallow copy ProductTypeAddLocalizedEnumValueAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductTypeAddLocalizedEnumValueAction of(final ProductTypeAddLocalizedEnumValueAction template) {
        ProductTypeAddLocalizedEnumValueActionImpl instance = new ProductTypeAddLocalizedEnumValueActionImpl();
        instance.setAttributeName(template.getAttributeName());
        instance.setValue(template.getValue());
        return instance;
    }

    public ProductTypeAddLocalizedEnumValueAction copyDeep();

    /**
     * factory method to create a deep copy of ProductTypeAddLocalizedEnumValueAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProductTypeAddLocalizedEnumValueAction deepCopy(
            @Nullable final ProductTypeAddLocalizedEnumValueAction template) {
        if (template == null) {
            return null;
        }
        ProductTypeAddLocalizedEnumValueActionImpl instance = new ProductTypeAddLocalizedEnumValueActionImpl();
        instance.setAttributeName(template.getAttributeName());
        instance.setValue(
            com.commercetools.api.models.product_type.AttributeLocalizedEnumValue.deepCopy(template.getValue()));
        return instance;
    }

    /**
     * builder factory method for ProductTypeAddLocalizedEnumValueAction
     * @return builder
     */
    public static ProductTypeAddLocalizedEnumValueActionBuilder builder() {
        return ProductTypeAddLocalizedEnumValueActionBuilder.of();
    }

    /**
     * create builder for ProductTypeAddLocalizedEnumValueAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductTypeAddLocalizedEnumValueActionBuilder builder(
            final ProductTypeAddLocalizedEnumValueAction template) {
        return ProductTypeAddLocalizedEnumValueActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductTypeAddLocalizedEnumValueAction(
            Function<ProductTypeAddLocalizedEnumValueAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductTypeAddLocalizedEnumValueAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductTypeAddLocalizedEnumValueAction>() {
            @Override
            public String toString() {
                return "TypeReference<ProductTypeAddLocalizedEnumValueAction>";
            }
        };
    }
}
