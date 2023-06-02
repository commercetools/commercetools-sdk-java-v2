
package com.commercetools.api.models.me;

import java.time.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.cart.DirectDiscountDraft;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Adds a DirectDiscount, but only if no DiscountCode has been added to the Cart. Either a Discount Code or a Direct Discount can exist on a Cart at the same time.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MyCartSetDirectDiscountsAction myCartSetDirectDiscountsAction = MyCartSetDirectDiscountsAction.builder()
 *             .plusDiscounts(discountsBuilder -> discountsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = MyCartSetDirectDiscountsActionImpl.class)
public interface MyCartSetDirectDiscountsAction extends MyCartUpdateAction {

    /**
     * discriminator value for MyCartSetDirectDiscountsAction
     */
    String SET_DIRECT_DISCOUNTS = "setDirectDiscounts";

    /**
     *  <ul>
     *   <li>If set, all existing Direct Discounts are replaced. The discounts apply in the order they are added to the list.</li>
     *   <li>If empty, all existing Direct Discounts are removed and all affected prices on the Cart or Order are recalculated.</li>
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
     *   <li>If empty, all existing Direct Discounts are removed and all affected prices on the Cart or Order are recalculated.</li>
     *  </ul>
     * @param discounts values to be set
     */

    @JsonIgnore
    public void setDiscounts(final DirectDiscountDraft... discounts);

    /**
     *  <ul>
     *   <li>If set, all existing Direct Discounts are replaced. The discounts apply in the order they are added to the list.</li>
     *   <li>If empty, all existing Direct Discounts are removed and all affected prices on the Cart or Order are recalculated.</li>
     *  </ul>
     * @param discounts values to be set
     */

    public void setDiscounts(final List<DirectDiscountDraft> discounts);

    /**
     * factory method
     * @return instance of MyCartSetDirectDiscountsAction
     */
    public static MyCartSetDirectDiscountsAction of() {
        return new MyCartSetDirectDiscountsActionImpl();
    }

    /**
     * factory method to create a shallow copy MyCartSetDirectDiscountsAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static MyCartSetDirectDiscountsAction of(final MyCartSetDirectDiscountsAction template) {
        MyCartSetDirectDiscountsActionImpl instance = new MyCartSetDirectDiscountsActionImpl();
        instance.setDiscounts(template.getDiscounts());
        return instance;
    }

    /**
     * factory method to create a deep copy of MyCartSetDirectDiscountsAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static MyCartSetDirectDiscountsAction deepCopy(@Nullable final MyCartSetDirectDiscountsAction template) {
        if (template == null) {
            return null;
        }
        MyCartSetDirectDiscountsActionImpl instance = new MyCartSetDirectDiscountsActionImpl();
        instance.setDiscounts(Optional.ofNullable(template.getDiscounts())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.cart.DirectDiscountDraft::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for MyCartSetDirectDiscountsAction
     * @return builder
     */
    public static MyCartSetDirectDiscountsActionBuilder builder() {
        return MyCartSetDirectDiscountsActionBuilder.of();
    }

    /**
     * create builder for MyCartSetDirectDiscountsAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static MyCartSetDirectDiscountsActionBuilder builder(final MyCartSetDirectDiscountsAction template) {
        return MyCartSetDirectDiscountsActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withMyCartSetDirectDiscountsAction(Function<MyCartSetDirectDiscountsAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<MyCartSetDirectDiscountsAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<MyCartSetDirectDiscountsAction>() {
            @Override
            public String toString() {
                return "TypeReference<MyCartSetDirectDiscountsAction>";
            }
        };
    }
}
