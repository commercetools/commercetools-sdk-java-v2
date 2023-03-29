
package com.commercetools.api.models.order_edit;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.cart.ExternalTaxRateDraft;
import com.commercetools.api.models.order.StagedOrderUpdateAction;
import com.commercetools.api.models.shipping_method.ShippingRateDraft;
import com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifier;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * StagedOrderSetCustomShippingMethodAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StagedOrderSetCustomShippingMethodAction stagedOrderSetCustomShippingMethodAction = StagedOrderSetCustomShippingMethodAction.builder()
 *             .shippingMethodName("{shippingMethodName}")
 *             .shippingRate(shippingRateBuilder -> shippingRateBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = StagedOrderSetCustomShippingMethodActionImpl.class)
public interface StagedOrderSetCustomShippingMethodAction extends StagedOrderUpdateAction {

    /**
     * discriminator value for StagedOrderSetCustomShippingMethodAction
     */
    String SET_CUSTOM_SHIPPING_METHOD = "setCustomShippingMethod";

    /**
     *
     * @return shippingMethodName
     */
    @NotNull
    @JsonProperty("shippingMethodName")
    public String getShippingMethodName();

    /**
     *
     * @return shippingRate
     */
    @NotNull
    @Valid
    @JsonProperty("shippingRate")
    public ShippingRateDraft getShippingRate();

    /**
     *  <p>ResourceIdentifier to a TaxCategory.</p>
     * @return taxCategory
     */
    @Valid
    @JsonProperty("taxCategory")
    public TaxCategoryResourceIdentifier getTaxCategory();

    /**
     *  <p>Controls calculation of taxed prices for Line Items, Custom Line Items, and Shipping Methods as explained in Cart tax calculation.</p>
     * @return externalTaxRate
     */
    @Valid
    @JsonProperty("externalTaxRate")
    public ExternalTaxRateDraft getExternalTaxRate();

    /**
     * set shippingMethodName
     * @param shippingMethodName value to be set
     */

    public void setShippingMethodName(final String shippingMethodName);

    /**
     * set shippingRate
     * @param shippingRate value to be set
     */

    public void setShippingRate(final ShippingRateDraft shippingRate);

    /**
     *  <p>ResourceIdentifier to a TaxCategory.</p>
     * @param taxCategory value to be set
     */

    public void setTaxCategory(final TaxCategoryResourceIdentifier taxCategory);

    /**
     *  <p>Controls calculation of taxed prices for Line Items, Custom Line Items, and Shipping Methods as explained in Cart tax calculation.</p>
     * @param externalTaxRate value to be set
     */

    public void setExternalTaxRate(final ExternalTaxRateDraft externalTaxRate);

    /**
     * factory method
     * @return instance of StagedOrderSetCustomShippingMethodAction
     */
    public static StagedOrderSetCustomShippingMethodAction of() {
        return new StagedOrderSetCustomShippingMethodActionImpl();
    }

    /**
     * factory method to create a shallow copy StagedOrderSetCustomShippingMethodAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static StagedOrderSetCustomShippingMethodAction of(final StagedOrderSetCustomShippingMethodAction template) {
        StagedOrderSetCustomShippingMethodActionImpl instance = new StagedOrderSetCustomShippingMethodActionImpl();
        instance.setShippingMethodName(template.getShippingMethodName());
        instance.setShippingRate(template.getShippingRate());
        instance.setTaxCategory(template.getTaxCategory());
        instance.setExternalTaxRate(template.getExternalTaxRate());
        return instance;
    }

    /**
     * factory method to create a deep copy of StagedOrderSetCustomShippingMethodAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static StagedOrderSetCustomShippingMethodAction deepCopy(
            @Nullable final StagedOrderSetCustomShippingMethodAction template) {
        if (template == null) {
            return null;
        }
        StagedOrderSetCustomShippingMethodActionImpl instance = new StagedOrderSetCustomShippingMethodActionImpl();
        instance.setShippingMethodName(template.getShippingMethodName());
        instance.setShippingRate(Optional.ofNullable(template.getShippingRate())
                .map(com.commercetools.api.models.shipping_method.ShippingRateDraft::deepCopy)
                .orElse(null));
        instance.setTaxCategory(Optional.ofNullable(template.getTaxCategory())
                .map(com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifier::deepCopy)
                .orElse(null));
        instance.setExternalTaxRate(Optional.ofNullable(template.getExternalTaxRate())
                .map(com.commercetools.api.models.cart.ExternalTaxRateDraft::deepCopy)
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for StagedOrderSetCustomShippingMethodAction
     * @return builder
     */
    public static StagedOrderSetCustomShippingMethodActionBuilder builder() {
        return StagedOrderSetCustomShippingMethodActionBuilder.of();
    }

    /**
     * create builder for StagedOrderSetCustomShippingMethodAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StagedOrderSetCustomShippingMethodActionBuilder builder(
            final StagedOrderSetCustomShippingMethodAction template) {
        return StagedOrderSetCustomShippingMethodActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withStagedOrderSetCustomShippingMethodAction(
            Function<StagedOrderSetCustomShippingMethodAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<StagedOrderSetCustomShippingMethodAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StagedOrderSetCustomShippingMethodAction>() {
            @Override
            public String toString() {
                return "TypeReference<StagedOrderSetCustomShippingMethodAction>";
            }
        };
    }
}
