package com.commercetools.api.models.order_edit;

import com.commercetools.api.models.cart.ExternalTaxRateDraft;
import com.commercetools.api.models.order.StagedOrderUpdateAction;
import com.commercetools.api.models.order_edit.StagedOrderSetCustomLineItemTaxRateActionImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.annotation.Nullable;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.io.IOException;

/**
 * StagedOrderSetCustomLineItemTaxRateAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StagedOrderSetCustomLineItemTaxRateAction stagedOrderSetCustomLineItemTaxRateAction = StagedOrderSetCustomLineItemTaxRateAction.builder()
 *             .customLineItemId("{customLineItemId}")
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
@JsonDeserialize(as = StagedOrderSetCustomLineItemTaxRateActionImpl.class)
public interface StagedOrderSetCustomLineItemTaxRateAction extends StagedOrderUpdateAction {

    /**
     * discriminator value for StagedOrderSetCustomLineItemTaxRateAction
     */
    String SET_CUSTOM_LINE_ITEM_TAX_RATE = "setCustomLineItemTaxRate";

    /**
     *
     * @return customLineItemId
     */
    @NotNull
    @JsonProperty("customLineItemId")
    public String getCustomLineItemId();
    /**
     *  <p>Controls calculation of taxed prices for Line Items, Custom Line Items, and Shipping Methods as explained in Cart tax calculation.</p>
     * @return externalTaxRate
     */
    @Valid
    @JsonProperty("externalTaxRate")
    public ExternalTaxRateDraft getExternalTaxRate();

    /**
     * set customLineItemId
     * @param customLineItemId value to be set
     */
    
    public void setCustomLineItemId(final String customLineItemId);
    
    
    /**
     *  <p>Controls calculation of taxed prices for Line Items, Custom Line Items, and Shipping Methods as explained in Cart tax calculation.</p>
     * @param externalTaxRate value to be set
     */
    
    public void setExternalTaxRate(final ExternalTaxRateDraft externalTaxRate);
    

    /**
     * factory method
     * @return instance of StagedOrderSetCustomLineItemTaxRateAction
     */
    public static StagedOrderSetCustomLineItemTaxRateAction of(){
        return new StagedOrderSetCustomLineItemTaxRateActionImpl();
    }
    

    /**
     * factory method to create a shallow copy StagedOrderSetCustomLineItemTaxRateAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static StagedOrderSetCustomLineItemTaxRateAction of(final StagedOrderSetCustomLineItemTaxRateAction template) {
        StagedOrderSetCustomLineItemTaxRateActionImpl instance = new StagedOrderSetCustomLineItemTaxRateActionImpl();
        instance.setCustomLineItemId(template.getCustomLineItemId());
        instance.setExternalTaxRate(template.getExternalTaxRate());
        return instance;
    }

    /**
     * factory method to create a deep copy of StagedOrderSetCustomLineItemTaxRateAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static StagedOrderSetCustomLineItemTaxRateAction deepCopy(@Nullable final StagedOrderSetCustomLineItemTaxRateAction template) {
        if (template == null) {
            return null;
        }
        StagedOrderSetCustomLineItemTaxRateActionImpl instance = new StagedOrderSetCustomLineItemTaxRateActionImpl();
        instance.setCustomLineItemId(template.getCustomLineItemId());
        instance.setExternalTaxRate(com.commercetools.api.models.cart.ExternalTaxRateDraft.deepCopy(template.getExternalTaxRate()));
        return instance;
    }

    /**
     * builder factory method for StagedOrderSetCustomLineItemTaxRateAction
     * @return builder
     */
    public static StagedOrderSetCustomLineItemTaxRateActionBuilder builder() {
        return StagedOrderSetCustomLineItemTaxRateActionBuilder.of();
    }
    
    /**
     * create builder for StagedOrderSetCustomLineItemTaxRateAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StagedOrderSetCustomLineItemTaxRateActionBuilder builder(final StagedOrderSetCustomLineItemTaxRateAction template) {
        return StagedOrderSetCustomLineItemTaxRateActionBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withStagedOrderSetCustomLineItemTaxRateAction(Function<StagedOrderSetCustomLineItemTaxRateAction, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<StagedOrderSetCustomLineItemTaxRateAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StagedOrderSetCustomLineItemTaxRateAction>() {
            @Override
            public String toString() {
                return "TypeReference<StagedOrderSetCustomLineItemTaxRateAction>";
            }
        };
    }
}
