
package com.commercetools.api.models.order_edit;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.Valid;

import com.commercetools.api.models.cart.ExternalTaxRateDraft;
import com.commercetools.api.models.order.StagedOrderUpdateAction;
import com.commercetools.api.models.shipping_method.ShippingMethodResourceIdentifier;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * StagedOrderSetShippingMethodAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StagedOrderSetShippingMethodAction stagedOrderSetShippingMethodAction = StagedOrderSetShippingMethodAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = StagedOrderSetShippingMethodActionImpl.class)
public interface StagedOrderSetShippingMethodAction extends StagedOrderUpdateAction {

    /**
     * discriminator value for StagedOrderSetShippingMethodAction
     */
    String SET_SHIPPING_METHOD = "setShippingMethod";

    /**
     *  <p>ResourceIdentifier to a ShippingMethod.</p>
     * @return shippingMethod
     */
    @Valid
    @JsonProperty("shippingMethod")
    public ShippingMethodResourceIdentifier getShippingMethod();

    /**
     *  <p>Controls calculation of taxed prices for Line Items, Custom Line Items, and Shipping Methods as explained in Cart tax calculation.</p>
     * @return externalTaxRate
     */
    @Valid
    @JsonProperty("externalTaxRate")
    public ExternalTaxRateDraft getExternalTaxRate();

    /**
     *  <p>ResourceIdentifier to a ShippingMethod.</p>
     * @param shippingMethod value to be set
     */

    public void setShippingMethod(final ShippingMethodResourceIdentifier shippingMethod);

    /**
     *  <p>Controls calculation of taxed prices for Line Items, Custom Line Items, and Shipping Methods as explained in Cart tax calculation.</p>
     * @param externalTaxRate value to be set
     */

    public void setExternalTaxRate(final ExternalTaxRateDraft externalTaxRate);

    /**
     * factory method
     * @return instance of StagedOrderSetShippingMethodAction
     */
    public static StagedOrderSetShippingMethodAction of() {
        return new StagedOrderSetShippingMethodActionImpl();
    }

    /**
     * factory method to create a shallow copy StagedOrderSetShippingMethodAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static StagedOrderSetShippingMethodAction of(final StagedOrderSetShippingMethodAction template) {
        StagedOrderSetShippingMethodActionImpl instance = new StagedOrderSetShippingMethodActionImpl();
        instance.setShippingMethod(template.getShippingMethod());
        instance.setExternalTaxRate(template.getExternalTaxRate());
        return instance;
    }

    /**
     * factory method to create a deep copy of StagedOrderSetShippingMethodAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static StagedOrderSetShippingMethodAction deepCopy(
            @Nullable final StagedOrderSetShippingMethodAction template) {
        if (template == null) {
            return null;
        }
        StagedOrderSetShippingMethodActionImpl instance = new StagedOrderSetShippingMethodActionImpl();
        instance.setShippingMethod(Optional.ofNullable(template.getShippingMethod())
                .map(com.commercetools.api.models.shipping_method.ShippingMethodResourceIdentifier::deepCopy)
                .orElse(null));
        instance.setExternalTaxRate(Optional.ofNullable(template.getExternalTaxRate())
                .map(com.commercetools.api.models.cart.ExternalTaxRateDraft::deepCopy)
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for StagedOrderSetShippingMethodAction
     * @return builder
     */
    public static StagedOrderSetShippingMethodActionBuilder builder() {
        return StagedOrderSetShippingMethodActionBuilder.of();
    }

    /**
     * create builder for StagedOrderSetShippingMethodAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StagedOrderSetShippingMethodActionBuilder builder(final StagedOrderSetShippingMethodAction template) {
        return StagedOrderSetShippingMethodActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withStagedOrderSetShippingMethodAction(Function<StagedOrderSetShippingMethodAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<StagedOrderSetShippingMethodAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StagedOrderSetShippingMethodAction>() {
            @Override
            public String toString() {
                return "TypeReference<StagedOrderSetShippingMethodAction>";
            }
        };
    }
}
