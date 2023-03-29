
package com.commercetools.api.models.product_type;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Updates the label of a single enum <code>value</code> in an AttributeEnumType AttributeDefinition, or AttributeSetType of AttributeEnumType AttributeDefinition.</p>
 *  <p>All Products will be updated to the new label in an eventually consistent way.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductTypeChangePlainEnumValueLabelAction productTypeChangePlainEnumValueLabelAction = ProductTypeChangePlainEnumValueLabelAction.builder()
 *             .attributeName("{attributeName}")
 *             .newValue(newValueBuilder -> newValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductTypeChangePlainEnumValueLabelActionImpl.class)
public interface ProductTypeChangePlainEnumValueLabelAction extends ProductTypeUpdateAction {

    /**
     * discriminator value for ProductTypeChangePlainEnumValueLabelAction
     */
    String CHANGE_PLAIN_ENUM_VALUE_LABEL = "changePlainEnumValueLabel";

    /**
     *  <p>Name of the AttributeDefinition to update.</p>
     * @return attributeName
     */
    @NotNull
    @JsonProperty("attributeName")
    public String getAttributeName();

    /**
     *  <p>New value to set. Must be different from the existing value.</p>
     * @return newValue
     */
    @NotNull
    @Valid
    @JsonProperty("newValue")
    public AttributePlainEnumValue getNewValue();

    /**
     *  <p>Name of the AttributeDefinition to update.</p>
     * @param attributeName value to be set
     */

    public void setAttributeName(final String attributeName);

    /**
     *  <p>New value to set. Must be different from the existing value.</p>
     * @param newValue value to be set
     */

    public void setNewValue(final AttributePlainEnumValue newValue);

    /**
     * factory method
     * @return instance of ProductTypeChangePlainEnumValueLabelAction
     */
    public static ProductTypeChangePlainEnumValueLabelAction of() {
        return new ProductTypeChangePlainEnumValueLabelActionImpl();
    }

    /**
     * factory method to create a shallow copy ProductTypeChangePlainEnumValueLabelAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductTypeChangePlainEnumValueLabelAction of(
            final ProductTypeChangePlainEnumValueLabelAction template) {
        ProductTypeChangePlainEnumValueLabelActionImpl instance = new ProductTypeChangePlainEnumValueLabelActionImpl();
        instance.setAttributeName(template.getAttributeName());
        instance.setNewValue(template.getNewValue());
        return instance;
    }

    /**
     * factory method to create a deep copy of ProductTypeChangePlainEnumValueLabelAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProductTypeChangePlainEnumValueLabelAction deepCopy(
            @Nullable final ProductTypeChangePlainEnumValueLabelAction template) {
        if (template == null) {
            return null;
        }
        ProductTypeChangePlainEnumValueLabelActionImpl instance = new ProductTypeChangePlainEnumValueLabelActionImpl();
        instance.setAttributeName(template.getAttributeName());
        instance.setNewValue(Optional.ofNullable(template.getNewValue())
                .map(com.commercetools.api.models.product_type.AttributePlainEnumValue::deepCopy)
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for ProductTypeChangePlainEnumValueLabelAction
     * @return builder
     */
    public static ProductTypeChangePlainEnumValueLabelActionBuilder builder() {
        return ProductTypeChangePlainEnumValueLabelActionBuilder.of();
    }

    /**
     * create builder for ProductTypeChangePlainEnumValueLabelAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductTypeChangePlainEnumValueLabelActionBuilder builder(
            final ProductTypeChangePlainEnumValueLabelAction template) {
        return ProductTypeChangePlainEnumValueLabelActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductTypeChangePlainEnumValueLabelAction(
            Function<ProductTypeChangePlainEnumValueLabelAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductTypeChangePlainEnumValueLabelAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductTypeChangePlainEnumValueLabelAction>() {
            @Override
            public String toString() {
                return "TypeReference<ProductTypeChangePlainEnumValueLabelAction>";
            }
        };
    }
}
