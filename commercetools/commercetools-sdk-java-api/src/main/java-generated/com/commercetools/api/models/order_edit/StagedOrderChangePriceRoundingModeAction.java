
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
 *  <p>Changing the price rounding mode leads to recalculation of taxes.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StagedOrderChangePriceRoundingModeAction stagedOrderChangePriceRoundingModeAction = StagedOrderChangePriceRoundingModeAction.builder()
 *             .priceRoundingMode(RoundingMode.HALF_EVEN)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("changePriceRoundingMode")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = StagedOrderChangePriceRoundingModeActionImpl.class)
public interface StagedOrderChangePriceRoundingModeAction extends StagedOrderUpdateAction {

    /**
     * discriminator value for StagedOrderChangePriceRoundingModeAction
     */
    String CHANGE_PRICE_ROUNDING_MODE = "changePriceRoundingMode";

    /**
     *  <p>New value to set.</p>
     * @return priceRoundingMode
     */
    @NotNull
    @JsonProperty("priceRoundingMode")
    public RoundingMode getPriceRoundingMode();

    /**
     *  <p>New value to set.</p>
     * @param priceRoundingMode value to be set
     */

    public void setPriceRoundingMode(final RoundingMode priceRoundingMode);

    /**
     * factory method
     * @return instance of StagedOrderChangePriceRoundingModeAction
     */
    public static StagedOrderChangePriceRoundingModeAction of() {
        return new StagedOrderChangePriceRoundingModeActionImpl();
    }

    /**
     * factory method to create a shallow copy StagedOrderChangePriceRoundingModeAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static StagedOrderChangePriceRoundingModeAction of(final StagedOrderChangePriceRoundingModeAction template) {
        StagedOrderChangePriceRoundingModeActionImpl instance = new StagedOrderChangePriceRoundingModeActionImpl();
        instance.setPriceRoundingMode(template.getPriceRoundingMode());
        return instance;
    }

    public StagedOrderChangePriceRoundingModeAction copyDeep();

    /**
     * factory method to create a deep copy of StagedOrderChangePriceRoundingModeAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static StagedOrderChangePriceRoundingModeAction deepCopy(
            @Nullable final StagedOrderChangePriceRoundingModeAction template) {
        if (template == null) {
            return null;
        }
        StagedOrderChangePriceRoundingModeActionImpl instance = new StagedOrderChangePriceRoundingModeActionImpl();
        instance.setPriceRoundingMode(template.getPriceRoundingMode());
        return instance;
    }

    /**
     * builder factory method for StagedOrderChangePriceRoundingModeAction
     * @return builder
     */
    public static StagedOrderChangePriceRoundingModeActionBuilder builder() {
        return StagedOrderChangePriceRoundingModeActionBuilder.of();
    }

    /**
     * create builder for StagedOrderChangePriceRoundingModeAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StagedOrderChangePriceRoundingModeActionBuilder builder(
            final StagedOrderChangePriceRoundingModeAction template) {
        return StagedOrderChangePriceRoundingModeActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withStagedOrderChangePriceRoundingModeAction(
            Function<StagedOrderChangePriceRoundingModeAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<StagedOrderChangePriceRoundingModeAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StagedOrderChangePriceRoundingModeAction>() {
            @Override
            public String toString() {
                return "TypeReference<StagedOrderChangePriceRoundingModeAction>";
            }
        };
    }
}
