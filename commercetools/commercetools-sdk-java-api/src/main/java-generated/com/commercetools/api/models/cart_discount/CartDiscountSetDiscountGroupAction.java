
package com.commercetools.api.models.cart_discount;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.discount_group.DiscountGroupResourceIdentifier;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;

/**
 * CartDiscountSetDiscountGroupAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartDiscountSetDiscountGroupAction cartDiscountSetDiscountGroupAction = CartDiscountSetDiscountGroupAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("setDiscountGroup")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CartDiscountSetDiscountGroupActionImpl.class)
public interface CartDiscountSetDiscountGroupAction extends CartDiscountUpdateAction {

    /**
     * discriminator value for CartDiscountSetDiscountGroupAction
     */
    String SET_DISCOUNT_GROUP = "setDiscountGroup";

    /**
     *  <p>Reference to a DiscountGroup that the Cart Discount must belong to. If empty, any existing value will be removed.</p>
     * @return discountGroup
     */
    @Valid
    @JsonProperty("discountGroup")
    public DiscountGroupResourceIdentifier getDiscountGroup();

    /**
     *  <p>New value to set (between <code>0</code> and <code>1</code>) that determines the order in which the CartDiscounts are applied; a CartDiscount with a higher value is prioritized.</p>
     *  <p>Required if <code>discountGroup</code> is absent. If <code>discountGroup</code> is set, the CartDiscount will use the sort order of the DiscountGroup.</p>
     * @return sortOrder
     */

    @JsonProperty("sortOrder")
    public String getSortOrder();

    /**
     *  <p>Reference to a DiscountGroup that the Cart Discount must belong to. If empty, any existing value will be removed.</p>
     * @param discountGroup value to be set
     */

    public void setDiscountGroup(final DiscountGroupResourceIdentifier discountGroup);

    /**
     *  <p>New value to set (between <code>0</code> and <code>1</code>) that determines the order in which the CartDiscounts are applied; a CartDiscount with a higher value is prioritized.</p>
     *  <p>Required if <code>discountGroup</code> is absent. If <code>discountGroup</code> is set, the CartDiscount will use the sort order of the DiscountGroup.</p>
     * @param sortOrder value to be set
     */

    public void setSortOrder(final String sortOrder);

    /**
     * factory method
     * @return instance of CartDiscountSetDiscountGroupAction
     */
    public static CartDiscountSetDiscountGroupAction of() {
        return new CartDiscountSetDiscountGroupActionImpl();
    }

    /**
     * factory method to create a shallow copy CartDiscountSetDiscountGroupAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static CartDiscountSetDiscountGroupAction of(final CartDiscountSetDiscountGroupAction template) {
        CartDiscountSetDiscountGroupActionImpl instance = new CartDiscountSetDiscountGroupActionImpl();
        instance.setDiscountGroup(template.getDiscountGroup());
        instance.setSortOrder(template.getSortOrder());
        return instance;
    }

    public CartDiscountSetDiscountGroupAction copyDeep();

    /**
     * factory method to create a deep copy of CartDiscountSetDiscountGroupAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CartDiscountSetDiscountGroupAction deepCopy(
            @Nullable final CartDiscountSetDiscountGroupAction template) {
        if (template == null) {
            return null;
        }
        CartDiscountSetDiscountGroupActionImpl instance = new CartDiscountSetDiscountGroupActionImpl();
        instance.setDiscountGroup(com.commercetools.api.models.discount_group.DiscountGroupResourceIdentifier
                .deepCopy(template.getDiscountGroup()));
        instance.setSortOrder(template.getSortOrder());
        return instance;
    }

    /**
     * builder factory method for CartDiscountSetDiscountGroupAction
     * @return builder
     */
    public static CartDiscountSetDiscountGroupActionBuilder builder() {
        return CartDiscountSetDiscountGroupActionBuilder.of();
    }

    /**
     * create builder for CartDiscountSetDiscountGroupAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CartDiscountSetDiscountGroupActionBuilder builder(final CartDiscountSetDiscountGroupAction template) {
        return CartDiscountSetDiscountGroupActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCartDiscountSetDiscountGroupAction(Function<CartDiscountSetDiscountGroupAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CartDiscountSetDiscountGroupAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CartDiscountSetDiscountGroupAction>() {
            @Override
            public String toString() {
                return "TypeReference<CartDiscountSetDiscountGroupAction>";
            }
        };
    }
}
