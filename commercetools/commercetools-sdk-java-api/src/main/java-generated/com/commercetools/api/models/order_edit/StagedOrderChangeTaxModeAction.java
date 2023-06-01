package com.commercetools.api.models.order_edit;

import com.commercetools.api.models.cart.TaxMode;
import com.commercetools.api.models.order.StagedOrderUpdateAction;
import com.commercetools.api.models.order_edit.StagedOrderChangeTaxModeActionImpl;

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
 * StagedOrderChangeTaxModeAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StagedOrderChangeTaxModeAction stagedOrderChangeTaxModeAction = StagedOrderChangeTaxModeAction.builder()
 *             .taxMode(TaxMode.PLATFORM)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
@JsonDeserialize(as = StagedOrderChangeTaxModeActionImpl.class)
public interface StagedOrderChangeTaxModeAction extends StagedOrderUpdateAction {

    /**
     * discriminator value for StagedOrderChangeTaxModeAction
     */
    String CHANGE_TAX_MODE = "changeTaxMode";

    /**
     *  <p>Indicates how taxes are set on the Cart.</p>
     * @return taxMode
     */
    @NotNull
    @JsonProperty("taxMode")
    public TaxMode getTaxMode();

    /**
     *  <p>Indicates how taxes are set on the Cart.</p>
     * @param taxMode value to be set
     */
    
    public void setTaxMode(final TaxMode taxMode);
    

    /**
     * factory method
     * @return instance of StagedOrderChangeTaxModeAction
     */
    public static StagedOrderChangeTaxModeAction of(){
        return new StagedOrderChangeTaxModeActionImpl();
    }
    

    /**
     * factory method to create a shallow copy StagedOrderChangeTaxModeAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static StagedOrderChangeTaxModeAction of(final StagedOrderChangeTaxModeAction template) {
        StagedOrderChangeTaxModeActionImpl instance = new StagedOrderChangeTaxModeActionImpl();
        instance.setTaxMode(template.getTaxMode());
        return instance;
    }

    /**
     * factory method to create a deep copy of StagedOrderChangeTaxModeAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static StagedOrderChangeTaxModeAction deepCopy(@Nullable final StagedOrderChangeTaxModeAction template) {
        if (template == null) {
            return null;
        }
        StagedOrderChangeTaxModeActionImpl instance = new StagedOrderChangeTaxModeActionImpl();
        instance.setTaxMode(template.getTaxMode());
        return instance;
    }

    /**
     * builder factory method for StagedOrderChangeTaxModeAction
     * @return builder
     */
    public static StagedOrderChangeTaxModeActionBuilder builder() {
        return StagedOrderChangeTaxModeActionBuilder.of();
    }
    
    /**
     * create builder for StagedOrderChangeTaxModeAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StagedOrderChangeTaxModeActionBuilder builder(final StagedOrderChangeTaxModeAction template) {
        return StagedOrderChangeTaxModeActionBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withStagedOrderChangeTaxModeAction(Function<StagedOrderChangeTaxModeAction, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<StagedOrderChangeTaxModeAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StagedOrderChangeTaxModeAction>() {
            @Override
            public String toString() {
                return "TypeReference<StagedOrderChangeTaxModeAction>";
            }
        };
    }
}
