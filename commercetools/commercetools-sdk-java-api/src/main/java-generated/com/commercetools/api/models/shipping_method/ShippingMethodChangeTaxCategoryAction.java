
package com.commercetools.api.models.shipping_method;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifier;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 * ShippingMethodChangeTaxCategoryAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ShippingMethodChangeTaxCategoryAction shippingMethodChangeTaxCategoryAction = ShippingMethodChangeTaxCategoryAction.builder()
 *             .taxCategory(taxCategoryBuilder -> taxCategoryBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ShippingMethodChangeTaxCategoryActionImpl.class)
public interface ShippingMethodChangeTaxCategoryAction extends ShippingMethodUpdateAction {

    /**
     * discriminator value for ShippingMethodChangeTaxCategoryAction
     */
    String CHANGE_TAX_CATEGORY = "changeTaxCategory";

    /**
     *  <p>Value to set.</p>
     * @return taxCategory
     */
    @NotNull
    @Valid
    @JsonProperty("taxCategory")
    public TaxCategoryResourceIdentifier getTaxCategory();

    /**
     *  <p>Value to set.</p>
     * @param taxCategory value to be set
     */

    public void setTaxCategory(final TaxCategoryResourceIdentifier taxCategory);

    /**
     * factory method
     * @return instance of ShippingMethodChangeTaxCategoryAction
     */
    public static ShippingMethodChangeTaxCategoryAction of() {
        return new ShippingMethodChangeTaxCategoryActionImpl();
    }

    /**
     * factory method to create a shallow copy ShippingMethodChangeTaxCategoryAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static ShippingMethodChangeTaxCategoryAction of(final ShippingMethodChangeTaxCategoryAction template) {
        ShippingMethodChangeTaxCategoryActionImpl instance = new ShippingMethodChangeTaxCategoryActionImpl();
        instance.setTaxCategory(template.getTaxCategory());
        return instance;
    }

    /**
     * factory method to create a deep copy of ShippingMethodChangeTaxCategoryAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ShippingMethodChangeTaxCategoryAction deepCopy(
            @Nullable final ShippingMethodChangeTaxCategoryAction template) {
        if (template == null) {
            return null;
        }
        ShippingMethodChangeTaxCategoryActionImpl instance = new ShippingMethodChangeTaxCategoryActionImpl();
        instance.setTaxCategory(com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifier
                .deepCopy(template.getTaxCategory()));
        return instance;
    }

    /**
     * builder factory method for ShippingMethodChangeTaxCategoryAction
     * @return builder
     */
    public static ShippingMethodChangeTaxCategoryActionBuilder builder() {
        return ShippingMethodChangeTaxCategoryActionBuilder.of();
    }

    /**
     * create builder for ShippingMethodChangeTaxCategoryAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ShippingMethodChangeTaxCategoryActionBuilder builder(
            final ShippingMethodChangeTaxCategoryAction template) {
        return ShippingMethodChangeTaxCategoryActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withShippingMethodChangeTaxCategoryAction(Function<ShippingMethodChangeTaxCategoryAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ShippingMethodChangeTaxCategoryAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ShippingMethodChangeTaxCategoryAction>() {
            @Override
            public String toString() {
                return "TypeReference<ShippingMethodChangeTaxCategoryAction>";
            }
        };
    }
}
