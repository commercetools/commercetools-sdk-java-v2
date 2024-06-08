
package com.commercetools.api.models.order_edit;

import java.time.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;

import com.commercetools.api.models.cart.TaxPortionDraft;
import com.commercetools.api.models.common.Money;
import com.commercetools.api.models.order.StagedOrderUpdateAction;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Updates the total tax amount of the Order if it has the <code>ExternalAmount</code> TaxMode.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StagedOrderSetOrderTotalTaxAction stagedOrderSetOrderTotalTaxAction = StagedOrderSetOrderTotalTaxAction.builder()
 *             .externalTotalGross(externalTotalGrossBuilder -> externalTotalGrossBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = StagedOrderSetOrderTotalTaxActionImpl.class)
public interface StagedOrderSetOrderTotalTaxAction extends StagedOrderUpdateAction {

    /**
     * discriminator value for StagedOrderSetOrderTotalTaxAction
     */
    String SET_ORDER_TOTAL_TAX = "setOrderTotalTax";

    /**
     *  <p>Total gross amount of the Order (totalNet + taxes).</p>
     * @return externalTotalGross
     */
    @NotNull
    @Valid
    @JsonProperty("externalTotalGross")
    public Money getExternalTotalGross();

    /**
     *  <p>Value to set.</p>
     * @return externalTaxPortions
     */
    @Valid
    @JsonProperty("externalTaxPortions")
    public List<TaxPortionDraft> getExternalTaxPortions();

    /**
     *  <p>Total gross amount of the Order (totalNet + taxes).</p>
     * @param externalTotalGross value to be set
     */

    public void setExternalTotalGross(final Money externalTotalGross);

    /**
     *  <p>Value to set.</p>
     * @param externalTaxPortions values to be set
     */

    @JsonIgnore
    public void setExternalTaxPortions(final TaxPortionDraft... externalTaxPortions);

    /**
     *  <p>Value to set.</p>
     * @param externalTaxPortions values to be set
     */

    public void setExternalTaxPortions(final List<TaxPortionDraft> externalTaxPortions);

    /**
     * factory method
     * @return instance of StagedOrderSetOrderTotalTaxAction
     */
    public static StagedOrderSetOrderTotalTaxAction of() {
        return new StagedOrderSetOrderTotalTaxActionImpl();
    }

    /**
     * factory method to create a shallow copy StagedOrderSetOrderTotalTaxAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static StagedOrderSetOrderTotalTaxAction of(final StagedOrderSetOrderTotalTaxAction template) {
        StagedOrderSetOrderTotalTaxActionImpl instance = new StagedOrderSetOrderTotalTaxActionImpl();
        instance.setExternalTotalGross(template.getExternalTotalGross());
        instance.setExternalTaxPortions(template.getExternalTaxPortions());
        return instance;
    }

    /**
     * factory method to create a deep copy of StagedOrderSetOrderTotalTaxAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static StagedOrderSetOrderTotalTaxAction deepCopy(
            @Nullable final StagedOrderSetOrderTotalTaxAction template) {
        if (template == null) {
            return null;
        }
        StagedOrderSetOrderTotalTaxActionImpl instance = new StagedOrderSetOrderTotalTaxActionImpl();
        instance.setExternalTotalGross(
            com.commercetools.api.models.common.Money.deepCopy(template.getExternalTotalGross()));
        instance.setExternalTaxPortions(Optional.ofNullable(template.getExternalTaxPortions())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.cart.TaxPortionDraft::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for StagedOrderSetOrderTotalTaxAction
     * @return builder
     */
    public static StagedOrderSetOrderTotalTaxActionBuilder builder() {
        return StagedOrderSetOrderTotalTaxActionBuilder.of();
    }

    /**
     * create builder for StagedOrderSetOrderTotalTaxAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StagedOrderSetOrderTotalTaxActionBuilder builder(final StagedOrderSetOrderTotalTaxAction template) {
        return StagedOrderSetOrderTotalTaxActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withStagedOrderSetOrderTotalTaxAction(Function<StagedOrderSetOrderTotalTaxAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<StagedOrderSetOrderTotalTaxAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StagedOrderSetOrderTotalTaxAction>() {
            @Override
            public String toString() {
                return "TypeReference<StagedOrderSetOrderTotalTaxAction>";
            }
        };
    }
}
