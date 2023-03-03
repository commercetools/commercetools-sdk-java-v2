
package com.commercetools.api.models.order_edit;

import java.time.*;
import java.util.*;
import java.util.function.Function;

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

    String SET_SHIPPING_METHOD = "setShippingMethod";

    /**
     *  <p>ResourceIdentifier to a ShippingMethod.</p>
     */
    @Valid
    @JsonProperty("shippingMethod")
    public ShippingMethodResourceIdentifier getShippingMethod();

    /**
     *  <p>Controls calculation of taxed prices for Line Items, Custom Line Items, and Shipping Methods as explained in Cart tax calculation.</p>
     */
    @Valid
    @JsonProperty("externalTaxRate")
    public ExternalTaxRateDraft getExternalTaxRate();

    public void setShippingMethod(final ShippingMethodResourceIdentifier shippingMethod);

    public void setExternalTaxRate(final ExternalTaxRateDraft externalTaxRate);

    public static StagedOrderSetShippingMethodAction of() {
        return new StagedOrderSetShippingMethodActionImpl();
    }

    public static StagedOrderSetShippingMethodAction of(final StagedOrderSetShippingMethodAction template) {
        StagedOrderSetShippingMethodActionImpl instance = new StagedOrderSetShippingMethodActionImpl();
        instance.setShippingMethod(template.getShippingMethod());
        instance.setExternalTaxRate(template.getExternalTaxRate());
        return instance;
    }

    public static StagedOrderSetShippingMethodActionBuilder builder() {
        return StagedOrderSetShippingMethodActionBuilder.of();
    }

    public static StagedOrderSetShippingMethodActionBuilder builder(final StagedOrderSetShippingMethodAction template) {
        return StagedOrderSetShippingMethodActionBuilder.of(template);
    }

    default <T> T withStagedOrderSetShippingMethodAction(Function<StagedOrderSetShippingMethodAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<StagedOrderSetShippingMethodAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StagedOrderSetShippingMethodAction>() {
            @Override
            public String toString() {
                return "TypeReference<StagedOrderSetShippingMethodAction>";
            }
        };
    }
}
