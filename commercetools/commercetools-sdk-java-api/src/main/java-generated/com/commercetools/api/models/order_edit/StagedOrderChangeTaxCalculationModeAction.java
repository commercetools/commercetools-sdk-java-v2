package com.commercetools.api.models.order_edit;

import com.commercetools.api.models.cart.TaxCalculationMode;
import com.commercetools.api.models.order.StagedOrderUpdateAction;
import com.commercetools.api.models.order_edit.StagedOrderChangeTaxCalculationModeActionImpl;

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
 * StagedOrderChangeTaxCalculationModeAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StagedOrderChangeTaxCalculationModeAction stagedOrderChangeTaxCalculationModeAction = StagedOrderChangeTaxCalculationModeAction.builder()
 *             .taxCalculationMode(TaxCalculationMode.LINE_ITEM_LEVEL)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
@JsonDeserialize(as = StagedOrderChangeTaxCalculationModeActionImpl.class)
public interface StagedOrderChangeTaxCalculationModeAction extends StagedOrderUpdateAction {

    /**
     * discriminator value for StagedOrderChangeTaxCalculationModeAction
     */
    String CHANGE_TAX_CALCULATION_MODE = "changeTaxCalculationMode";

    /**
     *  <p>Determines in which Tax calculation mode taxed prices are calculated.</p>
     * @return taxCalculationMode
     */
    @NotNull
    @JsonProperty("taxCalculationMode")
    public TaxCalculationMode getTaxCalculationMode();

    /**
     *  <p>Determines in which Tax calculation mode taxed prices are calculated.</p>
     * @param taxCalculationMode value to be set
     */
    
    public void setTaxCalculationMode(final TaxCalculationMode taxCalculationMode);
    

    /**
     * factory method
     * @return instance of StagedOrderChangeTaxCalculationModeAction
     */
    public static StagedOrderChangeTaxCalculationModeAction of(){
        return new StagedOrderChangeTaxCalculationModeActionImpl();
    }
    

    /**
     * factory method to create a shallow copy StagedOrderChangeTaxCalculationModeAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static StagedOrderChangeTaxCalculationModeAction of(final StagedOrderChangeTaxCalculationModeAction template) {
        StagedOrderChangeTaxCalculationModeActionImpl instance = new StagedOrderChangeTaxCalculationModeActionImpl();
        instance.setTaxCalculationMode(template.getTaxCalculationMode());
        return instance;
    }

    /**
     * factory method to create a deep copy of StagedOrderChangeTaxCalculationModeAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static StagedOrderChangeTaxCalculationModeAction deepCopy(@Nullable final StagedOrderChangeTaxCalculationModeAction template) {
        if (template == null) {
            return null;
        }
        StagedOrderChangeTaxCalculationModeActionImpl instance = new StagedOrderChangeTaxCalculationModeActionImpl();
        instance.setTaxCalculationMode(template.getTaxCalculationMode());
        return instance;
    }

    /**
     * builder factory method for StagedOrderChangeTaxCalculationModeAction
     * @return builder
     */
    public static StagedOrderChangeTaxCalculationModeActionBuilder builder() {
        return StagedOrderChangeTaxCalculationModeActionBuilder.of();
    }
    
    /**
     * create builder for StagedOrderChangeTaxCalculationModeAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StagedOrderChangeTaxCalculationModeActionBuilder builder(final StagedOrderChangeTaxCalculationModeAction template) {
        return StagedOrderChangeTaxCalculationModeActionBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withStagedOrderChangeTaxCalculationModeAction(Function<StagedOrderChangeTaxCalculationModeAction, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<StagedOrderChangeTaxCalculationModeAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StagedOrderChangeTaxCalculationModeAction>() {
            @Override
            public String toString() {
                return "TypeReference<StagedOrderChangeTaxCalculationModeAction>";
            }
        };
    }
}
