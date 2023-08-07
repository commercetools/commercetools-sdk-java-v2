
package com.commercetools.api.models.order_edit;

import java.time.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.cart.DirectDiscountDraft;
import com.commercetools.api.models.order.StagedOrderUpdateAction;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Adds a DirectDiscount, but only if no DiscountCode has been added to the Order. Either a Discount Code or a Direct Discount can exist on a Order at the same time.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StagedOrderSetDirectDiscountsAction stagedOrderSetDirectDiscountsAction = StagedOrderSetDirectDiscountsAction.builder()
 *             .plusDiscounts(discountsBuilder -> discountsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = StagedOrderSetDirectDiscountsActionImpl.class)
public interface StagedOrderSetDirectDiscountsAction extends StagedOrderUpdateAction {

    /**
     * discriminator value for StagedOrderSetDirectDiscountsAction
     */
    String SET_DIRECT_DISCOUNTS = "setDirectDiscounts";

    /**
     *  <ul>
     *   <li>If set, all existing Direct Discounts are replaced. The discounts apply in the order they are added to the list.</li>
     *   <li>If empty, all existing Direct Discounts are removed and all affected prices on the Order are recalculated.</li>
     *  </ul>
     * @return discounts
     */
    @NotNull
    @Valid
    @JsonProperty("discounts")
    public List<DirectDiscountDraft> getDiscounts();

    /**
     *  <ul>
     *   <li>If set, all existing Direct Discounts are replaced. The discounts apply in the order they are added to the list.</li>
     *   <li>If empty, all existing Direct Discounts are removed and all affected prices on the Order are recalculated.</li>
     *  </ul>
     * @param discounts values to be set
     */

    @JsonIgnore
    public void setDiscounts(final DirectDiscountDraft... discounts);

    /**
     *  <ul>
     *   <li>If set, all existing Direct Discounts are replaced. The discounts apply in the order they are added to the list.</li>
     *   <li>If empty, all existing Direct Discounts are removed and all affected prices on the Order are recalculated.</li>
     *  </ul>
     * @param discounts values to be set
     */

    public void setDiscounts(final List<DirectDiscountDraft> discounts);

    /**
     * factory method
     * @return instance of StagedOrderSetDirectDiscountsAction
     */
    public static StagedOrderSetDirectDiscountsAction of() {
        return new StagedOrderSetDirectDiscountsActionImpl();
    }

    /**
     * factory method to create a shallow copy StagedOrderSetDirectDiscountsAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static StagedOrderSetDirectDiscountsAction of(final StagedOrderSetDirectDiscountsAction template) {
        StagedOrderSetDirectDiscountsActionImpl instance = new StagedOrderSetDirectDiscountsActionImpl();
        instance.setDiscounts(template.getDiscounts());
        return instance;
    }

    /**
     * factory method to create a deep copy of StagedOrderSetDirectDiscountsAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static StagedOrderSetDirectDiscountsAction deepCopy(
            @Nullable final StagedOrderSetDirectDiscountsAction template) {
        if (template == null) {
            return null;
        }
        StagedOrderSetDirectDiscountsActionImpl instance = new StagedOrderSetDirectDiscountsActionImpl();
        instance.setDiscounts(Optional.ofNullable(template.getDiscounts())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.cart.DirectDiscountDraft::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for StagedOrderSetDirectDiscountsAction
     * @return builder
     */
    public static StagedOrderSetDirectDiscountsActionBuilder builder() {
        return StagedOrderSetDirectDiscountsActionBuilder.of();
    }

    /**
     * create builder for StagedOrderSetDirectDiscountsAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StagedOrderSetDirectDiscountsActionBuilder builder(
            final StagedOrderSetDirectDiscountsAction template) {
        return StagedOrderSetDirectDiscountsActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withStagedOrderSetDirectDiscountsAction(Function<StagedOrderSetDirectDiscountsAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<StagedOrderSetDirectDiscountsAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StagedOrderSetDirectDiscountsAction>() {
            @Override
            public String toString() {
                return "TypeReference<StagedOrderSetDirectDiscountsAction>";
            }
        };
    }
}
