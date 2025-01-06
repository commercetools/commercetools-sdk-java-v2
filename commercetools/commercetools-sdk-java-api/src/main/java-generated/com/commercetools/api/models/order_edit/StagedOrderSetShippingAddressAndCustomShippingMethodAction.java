
package com.commercetools.api.models.order_edit;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.cart.ExternalTaxRateDraft;
import com.commercetools.api.models.common.BaseAddress;
import com.commercetools.api.models.order.StagedOrderUpdateAction;
import com.commercetools.api.models.shipping_method.ShippingRateDraft;
import com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifier;
import com.commercetools.api.models.type.CustomFieldsDraft;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Sets the shipping address and a custom Shipping Method together to prevent an inconsistent state.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StagedOrderSetShippingAddressAndCustomShippingMethodAction stagedOrderSetShippingAddressAndCustomShippingMethodAction = StagedOrderSetShippingAddressAndCustomShippingMethodAction.builder()
 *             .address(addressBuilder -> addressBuilder)
 *             .shippingMethodName("{shippingMethodName}")
 *             .shippingRate(shippingRateBuilder -> shippingRateBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = StagedOrderSetShippingAddressAndCustomShippingMethodActionImpl.class)
public interface StagedOrderSetShippingAddressAndCustomShippingMethodAction extends StagedOrderUpdateAction {

    /**
     * discriminator value for StagedOrderSetShippingAddressAndCustomShippingMethodAction
     */
    String SET_SHIPPING_ADDRESS_AND_CUSTOM_SHIPPING_METHOD = "setShippingAddressAndCustomShippingMethod";

    /**
     *  <p>Value to set for <code>shippingAddress</code>.</p>
     * @return address
     */
    @NotNull
    @Valid
    @JsonProperty("address")
    public BaseAddress getAddress();

    /**
     *  <p>Value to set.</p>
     * @return shippingMethodName
     */
    @NotNull
    @JsonProperty("shippingMethodName")
    public String getShippingMethodName();

    /**
     *  <p>Value to set.</p>
     * @return shippingRate
     */
    @NotNull
    @Valid
    @JsonProperty("shippingRate")
    public ShippingRateDraft getShippingRate();

    /**
     *  <p>Used to select a Tax Rate when the Order has the <code>Platform</code> TaxMode.</p>
     * @return taxCategory
     */
    @Valid
    @JsonProperty("taxCategory")
    public TaxCategoryResourceIdentifier getTaxCategory();

    /**
     *  <p>An external Tax Rate can be set if the Cart has the <code>External</code> TaxMode.</p>
     * @return externalTaxRate
     */
    @Valid
    @JsonProperty("externalTaxRate")
    public ExternalTaxRateDraft getExternalTaxRate();

    /**
     *  <p>Custom Fields for the custom Shipping Method.</p>
     * @return custom
     */
    @Valid
    @JsonProperty("custom")
    public CustomFieldsDraft getCustom();

    /**
     *  <p>Value to set for <code>shippingAddress</code>.</p>
     * @param address value to be set
     */

    public void setAddress(final BaseAddress address);

    /**
     *  <p>Value to set.</p>
     * @param shippingMethodName value to be set
     */

    public void setShippingMethodName(final String shippingMethodName);

    /**
     *  <p>Value to set.</p>
     * @param shippingRate value to be set
     */

    public void setShippingRate(final ShippingRateDraft shippingRate);

    /**
     *  <p>Used to select a Tax Rate when the Order has the <code>Platform</code> TaxMode.</p>
     * @param taxCategory value to be set
     */

    public void setTaxCategory(final TaxCategoryResourceIdentifier taxCategory);

    /**
     *  <p>An external Tax Rate can be set if the Cart has the <code>External</code> TaxMode.</p>
     * @param externalTaxRate value to be set
     */

    public void setExternalTaxRate(final ExternalTaxRateDraft externalTaxRate);

    /**
     *  <p>Custom Fields for the custom Shipping Method.</p>
     * @param custom value to be set
     */

    public void setCustom(final CustomFieldsDraft custom);

    /**
     * factory method
     * @return instance of StagedOrderSetShippingAddressAndCustomShippingMethodAction
     */
    public static StagedOrderSetShippingAddressAndCustomShippingMethodAction of() {
        return new StagedOrderSetShippingAddressAndCustomShippingMethodActionImpl();
    }

    /**
     * factory method to create a shallow copy StagedOrderSetShippingAddressAndCustomShippingMethodAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static StagedOrderSetShippingAddressAndCustomShippingMethodAction of(
            final StagedOrderSetShippingAddressAndCustomShippingMethodAction template) {
        StagedOrderSetShippingAddressAndCustomShippingMethodActionImpl instance = new StagedOrderSetShippingAddressAndCustomShippingMethodActionImpl();
        instance.setAddress(template.getAddress());
        instance.setShippingMethodName(template.getShippingMethodName());
        instance.setShippingRate(template.getShippingRate());
        instance.setTaxCategory(template.getTaxCategory());
        instance.setExternalTaxRate(template.getExternalTaxRate());
        instance.setCustom(template.getCustom());
        return instance;
    }

    /**
     * factory method to create a deep copy of StagedOrderSetShippingAddressAndCustomShippingMethodAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static StagedOrderSetShippingAddressAndCustomShippingMethodAction deepCopy(
            @Nullable final StagedOrderSetShippingAddressAndCustomShippingMethodAction template) {
        if (template == null) {
            return null;
        }
        StagedOrderSetShippingAddressAndCustomShippingMethodActionImpl instance = new StagedOrderSetShippingAddressAndCustomShippingMethodActionImpl();
        instance.setAddress(com.commercetools.api.models.common.BaseAddress.deepCopy(template.getAddress()));
        instance.setShippingMethodName(template.getShippingMethodName());
        instance.setShippingRate(
            com.commercetools.api.models.shipping_method.ShippingRateDraft.deepCopy(template.getShippingRate()));
        instance.setTaxCategory(com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifier
                .deepCopy(template.getTaxCategory()));
        instance.setExternalTaxRate(
            com.commercetools.api.models.cart.ExternalTaxRateDraft.deepCopy(template.getExternalTaxRate()));
        instance.setCustom(com.commercetools.api.models.type.CustomFieldsDraft.deepCopy(template.getCustom()));
        return instance;
    }

    /**
     * builder factory method for StagedOrderSetShippingAddressAndCustomShippingMethodAction
     * @return builder
     */
    public static StagedOrderSetShippingAddressAndCustomShippingMethodActionBuilder builder() {
        return StagedOrderSetShippingAddressAndCustomShippingMethodActionBuilder.of();
    }

    /**
     * create builder for StagedOrderSetShippingAddressAndCustomShippingMethodAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StagedOrderSetShippingAddressAndCustomShippingMethodActionBuilder builder(
            final StagedOrderSetShippingAddressAndCustomShippingMethodAction template) {
        return StagedOrderSetShippingAddressAndCustomShippingMethodActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withStagedOrderSetShippingAddressAndCustomShippingMethodAction(
            Function<StagedOrderSetShippingAddressAndCustomShippingMethodAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<StagedOrderSetShippingAddressAndCustomShippingMethodAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StagedOrderSetShippingAddressAndCustomShippingMethodAction>() {
            @Override
            public String toString() {
                return "TypeReference<StagedOrderSetShippingAddressAndCustomShippingMethodAction>";
            }
        };
    }
}
