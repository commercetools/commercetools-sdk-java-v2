
package com.commercetools.api.models.order_edit;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.cart.RoundingMode;
import com.commercetools.api.models.order.StagedOrderUpdateAction;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 *  <p>Changing the tax rounding mode leads to recalculation of taxes.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StagedOrderChangeTaxRoundingModeAction stagedOrderChangeTaxRoundingModeAction = StagedOrderChangeTaxRoundingModeAction.builder()
 *             .taxRoundingMode(RoundingMode.HALF_EVEN)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = StagedOrderChangeTaxRoundingModeActionImpl.class)
public interface StagedOrderChangeTaxRoundingModeAction extends StagedOrderUpdateAction {

    /**
     * discriminator value for StagedOrderChangeTaxRoundingModeAction
     */
    String CHANGE_TAX_ROUNDING_MODE = "changeTaxRoundingMode";

    /**
     *  <p>New value to set.</p>
     * @return taxRoundingMode
     */
    @NotNull
    @JsonProperty("taxRoundingMode")
    public RoundingMode getTaxRoundingMode();

    /**
     *  <p>New value to set.</p>
     * @param taxRoundingMode value to be set
     */

    public void setTaxRoundingMode(final RoundingMode taxRoundingMode);

    /**
     * factory method
     * @return instance of StagedOrderChangeTaxRoundingModeAction
     */
    public static StagedOrderChangeTaxRoundingModeAction of() {
        return new StagedOrderChangeTaxRoundingModeActionImpl();
    }

    /**
     * factory method to create a shallow copy StagedOrderChangeTaxRoundingModeAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static StagedOrderChangeTaxRoundingModeAction of(final StagedOrderChangeTaxRoundingModeAction template) {
        StagedOrderChangeTaxRoundingModeActionImpl instance = new StagedOrderChangeTaxRoundingModeActionImpl();
        instance.setTaxRoundingMode(template.getTaxRoundingMode());
        return instance;
    }

    /**
     * factory method to create a deep copy of StagedOrderChangeTaxRoundingModeAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static StagedOrderChangeTaxRoundingModeAction deepCopy(
            @Nullable final StagedOrderChangeTaxRoundingModeAction template) {
        if (template == null) {
            return null;
        }
        StagedOrderChangeTaxRoundingModeActionImpl instance = new StagedOrderChangeTaxRoundingModeActionImpl();
        instance.setTaxRoundingMode(template.getTaxRoundingMode());
        return instance;
    }

    /**
     * builder factory method for StagedOrderChangeTaxRoundingModeAction
     * @return builder
     */
    public static StagedOrderChangeTaxRoundingModeActionBuilder builder() {
        return StagedOrderChangeTaxRoundingModeActionBuilder.of();
    }

    /**
     * create builder for StagedOrderChangeTaxRoundingModeAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StagedOrderChangeTaxRoundingModeActionBuilder builder(
            final StagedOrderChangeTaxRoundingModeAction template) {
        return StagedOrderChangeTaxRoundingModeActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withStagedOrderChangeTaxRoundingModeAction(
            Function<StagedOrderChangeTaxRoundingModeAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<StagedOrderChangeTaxRoundingModeAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StagedOrderChangeTaxRoundingModeAction>() {
            @Override
            public String toString() {
                return "TypeReference<StagedOrderChangeTaxRoundingModeAction>";
            }
        };
    }
}
