
package com.commercetools.api.models.order_edit;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.order.StagedOrderUpdateAction;
import com.fasterxml.jackson.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import tools.jackson.databind.annotation.*;

/**
 *  <p>Determines whether the <a href="https://docs.commercetools.com/apis/ctp:api:type:DirectDiscount" rel="nofollow">Direct Discounts</a> on the Order replace the <a href="https://docs.commercetools.com/apis/ctp:api:type:CartDiscount" rel="nofollow">Cart Discounts</a> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Project" rel="nofollow">Project</a>, or apply alongside them.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StagedOrderSetDirectDiscountsIgnoreCartDiscountsAction stagedOrderSetDirectDiscountsIgnoreCartDiscountsAction = StagedOrderSetDirectDiscountsIgnoreCartDiscountsAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("setDirectDiscountsIgnoreCartDiscounts")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = StagedOrderSetDirectDiscountsIgnoreCartDiscountsActionImpl.class)
public interface StagedOrderSetDirectDiscountsIgnoreCartDiscountsAction extends StagedOrderUpdateAction {

    /**
     * discriminator value for StagedOrderSetDirectDiscountsIgnoreCartDiscountsAction
     */
    String SET_DIRECT_DISCOUNTS_IGNORE_CART_DISCOUNTS = "setDirectDiscountsIgnoreCartDiscounts";

    /**
     *  <ul>
     *   <li>If <code>true</code>, only <a href="https://docs.commercetools.com/apis/ctp:api:type:DirectDiscount" rel="nofollow">Direct Discounts</a> apply to the Order. Matching <a href="https://docs.commercetools.com/apis/ctp:api:type:CartDiscount" rel="nofollow">Cart Discounts</a> are ignored, and Discount Codes cannot be added.</li>
     *  </ul>
     *  <p>The value can be set to <code>true</code> only if the Order does not have both <code>discountCodes</code> and <code>directDiscounts</code>.</p>
     *  <ul>
     *   <li>If <code>false</code>, Cart Discounts, Discount Codes, and Direct Discounts apply to the Order.</li>
     *  </ul>
     * @return directDiscountsIgnoreCartDiscounts
     */

    @JsonProperty("directDiscountsIgnoreCartDiscounts")
    public Boolean getDirectDiscountsIgnoreCartDiscounts();

    /**
     *  <ul>
     *   <li>If <code>true</code>, only <a href="https://docs.commercetools.com/apis/ctp:api:type:DirectDiscount" rel="nofollow">Direct Discounts</a> apply to the Order. Matching <a href="https://docs.commercetools.com/apis/ctp:api:type:CartDiscount" rel="nofollow">Cart Discounts</a> are ignored, and Discount Codes cannot be added.</li>
     *  </ul>
     *  <p>The value can be set to <code>true</code> only if the Order does not have both <code>discountCodes</code> and <code>directDiscounts</code>.</p>
     *  <ul>
     *   <li>If <code>false</code>, Cart Discounts, Discount Codes, and Direct Discounts apply to the Order.</li>
     *  </ul>
     * @param directDiscountsIgnoreCartDiscounts value to be set
     */

    public void setDirectDiscountsIgnoreCartDiscounts(final Boolean directDiscountsIgnoreCartDiscounts);

    /**
     * factory method
     * @return instance of StagedOrderSetDirectDiscountsIgnoreCartDiscountsAction
     */
    public static StagedOrderSetDirectDiscountsIgnoreCartDiscountsAction of() {
        return new StagedOrderSetDirectDiscountsIgnoreCartDiscountsActionImpl();
    }

    /**
     * factory method to create a shallow copy StagedOrderSetDirectDiscountsIgnoreCartDiscountsAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static StagedOrderSetDirectDiscountsIgnoreCartDiscountsAction of(
            final StagedOrderSetDirectDiscountsIgnoreCartDiscountsAction template) {
        StagedOrderSetDirectDiscountsIgnoreCartDiscountsActionImpl instance = new StagedOrderSetDirectDiscountsIgnoreCartDiscountsActionImpl();
        instance.setDirectDiscountsIgnoreCartDiscounts(template.getDirectDiscountsIgnoreCartDiscounts());
        return instance;
    }

    public StagedOrderSetDirectDiscountsIgnoreCartDiscountsAction copyDeep();

    /**
     * factory method to create a deep copy of StagedOrderSetDirectDiscountsIgnoreCartDiscountsAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static StagedOrderSetDirectDiscountsIgnoreCartDiscountsAction deepCopy(
            @Nullable final StagedOrderSetDirectDiscountsIgnoreCartDiscountsAction template) {
        if (template == null) {
            return null;
        }
        StagedOrderSetDirectDiscountsIgnoreCartDiscountsActionImpl instance = new StagedOrderSetDirectDiscountsIgnoreCartDiscountsActionImpl();
        instance.setDirectDiscountsIgnoreCartDiscounts(template.getDirectDiscountsIgnoreCartDiscounts());
        return instance;
    }

    /**
     * builder factory method for StagedOrderSetDirectDiscountsIgnoreCartDiscountsAction
     * @return builder
     */
    public static StagedOrderSetDirectDiscountsIgnoreCartDiscountsActionBuilder builder() {
        return StagedOrderSetDirectDiscountsIgnoreCartDiscountsActionBuilder.of();
    }

    /**
     * create builder for StagedOrderSetDirectDiscountsIgnoreCartDiscountsAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StagedOrderSetDirectDiscountsIgnoreCartDiscountsActionBuilder builder(
            final StagedOrderSetDirectDiscountsIgnoreCartDiscountsAction template) {
        return StagedOrderSetDirectDiscountsIgnoreCartDiscountsActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withStagedOrderSetDirectDiscountsIgnoreCartDiscountsAction(
            Function<StagedOrderSetDirectDiscountsIgnoreCartDiscountsAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static tools.jackson.core.type.TypeReference<StagedOrderSetDirectDiscountsIgnoreCartDiscountsAction> typeReference() {
        return new tools.jackson.core.type.TypeReference<StagedOrderSetDirectDiscountsIgnoreCartDiscountsAction>() {
            @Override
            public String toString() {
                return "TypeReference<StagedOrderSetDirectDiscountsIgnoreCartDiscountsAction>";
            }
        };
    }
}
