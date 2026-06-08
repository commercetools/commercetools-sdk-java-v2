
package com.commercetools.api.models.order_edit;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.cart.ExternalTaxRateDraft;
import com.commercetools.api.models.common.BaseAddress;
import com.commercetools.api.models.order.StagedOrderUpdateAction;
import com.commercetools.api.models.shipping_method.ShippingMethodResourceIdentifier;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Sets the shipping address and Shipping Method together to prevent an inconsistent state.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StagedOrderSetShippingAddressAndShippingMethodAction stagedOrderSetShippingAddressAndShippingMethodAction = StagedOrderSetShippingAddressAndShippingMethodAction.builder()
 *             .address(addressBuilder -> addressBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("setShippingAddressAndShippingMethod")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = StagedOrderSetShippingAddressAndShippingMethodActionImpl.class)
public interface StagedOrderSetShippingAddressAndShippingMethodAction extends StagedOrderUpdateAction {

    /**
     * discriminator value for StagedOrderSetShippingAddressAndShippingMethodAction
     */
    String SET_SHIPPING_ADDRESS_AND_SHIPPING_METHOD = "setShippingAddressAndShippingMethod";

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
     * @return shippingMethod
     */
    @Valid
    @JsonProperty("shippingMethod")
    public ShippingMethodResourceIdentifier getShippingMethod();

    /**
     *  <p>An external Tax Rate can be set if the Cart has the <code>External</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:TaxMode" rel="nofollow">TaxMode</a>.</p>
     * @return externalTaxRate
     */
    @Valid
    @JsonProperty("externalTaxRate")
    public ExternalTaxRateDraft getExternalTaxRate();

    /**
     *  <p>Value to set for <code>shippingAddress</code>.</p>
     * @param address value to be set
     */

    public void setAddress(final BaseAddress address);

    /**
     *  <p>Value to set.</p>
     * @param shippingMethod value to be set
     */

    public void setShippingMethod(final ShippingMethodResourceIdentifier shippingMethod);

    /**
     *  <p>An external Tax Rate can be set if the Cart has the <code>External</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:TaxMode" rel="nofollow">TaxMode</a>.</p>
     * @param externalTaxRate value to be set
     */

    public void setExternalTaxRate(final ExternalTaxRateDraft externalTaxRate);

    /**
     * factory method
     * @return instance of StagedOrderSetShippingAddressAndShippingMethodAction
     */
    public static StagedOrderSetShippingAddressAndShippingMethodAction of() {
        return new StagedOrderSetShippingAddressAndShippingMethodActionImpl();
    }

    /**
     * factory method to create a shallow copy StagedOrderSetShippingAddressAndShippingMethodAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static StagedOrderSetShippingAddressAndShippingMethodAction of(
            final StagedOrderSetShippingAddressAndShippingMethodAction template) {
        StagedOrderSetShippingAddressAndShippingMethodActionImpl instance = new StagedOrderSetShippingAddressAndShippingMethodActionImpl();
        instance.setAddress(template.getAddress());
        instance.setShippingMethod(template.getShippingMethod());
        instance.setExternalTaxRate(template.getExternalTaxRate());
        return instance;
    }

    public StagedOrderSetShippingAddressAndShippingMethodAction copyDeep();

    /**
     * factory method to create a deep copy of StagedOrderSetShippingAddressAndShippingMethodAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static StagedOrderSetShippingAddressAndShippingMethodAction deepCopy(
            @Nullable final StagedOrderSetShippingAddressAndShippingMethodAction template) {
        if (template == null) {
            return null;
        }
        StagedOrderSetShippingAddressAndShippingMethodActionImpl instance = new StagedOrderSetShippingAddressAndShippingMethodActionImpl();
        instance.setAddress(com.commercetools.api.models.common.BaseAddress.deepCopy(template.getAddress()));
        instance.setShippingMethod(com.commercetools.api.models.shipping_method.ShippingMethodResourceIdentifier
                .deepCopy(template.getShippingMethod()));
        instance.setExternalTaxRate(
            com.commercetools.api.models.cart.ExternalTaxRateDraft.deepCopy(template.getExternalTaxRate()));
        return instance;
    }

    /**
     * builder factory method for StagedOrderSetShippingAddressAndShippingMethodAction
     * @return builder
     */
    public static StagedOrderSetShippingAddressAndShippingMethodActionBuilder builder() {
        return StagedOrderSetShippingAddressAndShippingMethodActionBuilder.of();
    }

    /**
     * create builder for StagedOrderSetShippingAddressAndShippingMethodAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StagedOrderSetShippingAddressAndShippingMethodActionBuilder builder(
            final StagedOrderSetShippingAddressAndShippingMethodAction template) {
        return StagedOrderSetShippingAddressAndShippingMethodActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withStagedOrderSetShippingAddressAndShippingMethodAction(
            Function<StagedOrderSetShippingAddressAndShippingMethodAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<StagedOrderSetShippingAddressAndShippingMethodAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StagedOrderSetShippingAddressAndShippingMethodAction>() {
            @Override
            public String toString() {
                return "TypeReference<StagedOrderSetShippingAddressAndShippingMethodAction>";
            }
        };
    }
}
