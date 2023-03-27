
package com.commercetools.api.models.product_type;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Updates the label of a single enum <code>value</code> in an AttributeLocalizedEnumType AttributeDefinition, or AttributeSetType of AttributeLocalizedEnumType AttributeDefinition.</p>
 *  <p>All Products will be updated to the new label in an eventually consistent way.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductTypeChangeLocalizedEnumValueLabelAction productTypeChangeLocalizedEnumValueLabelAction = ProductTypeChangeLocalizedEnumValueLabelAction.builder()
 *             .attributeName("{attributeName}")
 *             .newValue(newValueBuilder -> newValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductTypeChangeLocalizedEnumValueLabelActionImpl.class)
public interface ProductTypeChangeLocalizedEnumValueLabelAction extends ProductTypeUpdateAction {

    /**
     * discriminator value for ProductTypeChangeLocalizedEnumValueLabelAction
     */
    String CHANGE_LOCALIZED_ENUM_VALUE_LABEL = "changeLocalizedEnumValueLabel";

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
    public AttributeLocalizedEnumValue getNewValue();

    /**
     *  <p>Name of the AttributeDefinition to update.</p>
     * @param attributeName value to be set
     */

    public void setAttributeName(final String attributeName);

    /**
     *  <p>New value to set. Must be different from the existing value.</p>
     * @param newValue value to be set
     */

    public void setNewValue(final AttributeLocalizedEnumValue newValue);

    /**
     * factory method
     * @return instance of ProductTypeChangeLocalizedEnumValueLabelAction
     */
    public static ProductTypeChangeLocalizedEnumValueLabelAction of() {
        return new ProductTypeChangeLocalizedEnumValueLabelActionImpl();
    }

    /**
     * factory method to copy an instance of ProductTypeChangeLocalizedEnumValueLabelAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductTypeChangeLocalizedEnumValueLabelAction of(
            final ProductTypeChangeLocalizedEnumValueLabelAction template) {
        ProductTypeChangeLocalizedEnumValueLabelActionImpl instance = new ProductTypeChangeLocalizedEnumValueLabelActionImpl();
        instance.setAttributeName(template.getAttributeName());
        instance.setNewValue(template.getNewValue());
        return instance;
    }

    /**
     * builder factory method for ProductTypeChangeLocalizedEnumValueLabelAction
     * @return builder
     */
    public static ProductTypeChangeLocalizedEnumValueLabelActionBuilder builder() {
        return ProductTypeChangeLocalizedEnumValueLabelActionBuilder.of();
    }

    /**
     * create builder for ProductTypeChangeLocalizedEnumValueLabelAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductTypeChangeLocalizedEnumValueLabelActionBuilder builder(
            final ProductTypeChangeLocalizedEnumValueLabelAction template) {
        return ProductTypeChangeLocalizedEnumValueLabelActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductTypeChangeLocalizedEnumValueLabelAction(
            Function<ProductTypeChangeLocalizedEnumValueLabelAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductTypeChangeLocalizedEnumValueLabelAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductTypeChangeLocalizedEnumValueLabelAction>() {
            @Override
            public String toString() {
                return "TypeReference<ProductTypeChangeLocalizedEnumValueLabelAction>";
            }
        };
    }
}
