
package com.commercetools.api.models.discount_group;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 *  <p>This action generates the <a href="https://docs.commercetools.com/apis/ctp:api:type:DiscountGroupIsActiveSetMessage" rel="nofollow">DiscountGroupIsActiveSet</a> Message.</p>
 *  <p>If the <span>limit</span> for active Discount Groups has been reached, a <a href="https://docs.commercetools.com/apis/ctp:api:type:MaxDiscountGroupsReachedError" rel="nofollow">MaxDiscountGroupsReached</a> error is returned.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     DiscountGroupSetIsActiveAction discountGroupSetIsActiveAction = DiscountGroupSetIsActiveAction.builder()
 *             .isActive(true)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("setIsActive")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = DiscountGroupSetIsActiveActionImpl.class)
public interface DiscountGroupSetIsActiveAction extends DiscountGroupUpdateAction {

    /**
     * discriminator value for DiscountGroupSetIsActiveAction
     */
    String SET_IS_ACTIVE = "setIsActive";

    /**
     *  <p>New value to set.</p>
     *  <p>A DiscountGroup must be active for its CartDiscounts to be considered during discount application.</p>
     * @return isActive
     */
    @NotNull
    @JsonProperty("isActive")
    public Boolean getIsActive();

    /**
     *  <p>New value to set.</p>
     *  <p>A DiscountGroup must be active for its CartDiscounts to be considered during discount application.</p>
     * @param isActive value to be set
     */

    public void setIsActive(final Boolean isActive);

    /**
     * factory method
     * @return instance of DiscountGroupSetIsActiveAction
     */
    public static DiscountGroupSetIsActiveAction of() {
        return new DiscountGroupSetIsActiveActionImpl();
    }

    /**
     * factory method to create a shallow copy DiscountGroupSetIsActiveAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static DiscountGroupSetIsActiveAction of(final DiscountGroupSetIsActiveAction template) {
        DiscountGroupSetIsActiveActionImpl instance = new DiscountGroupSetIsActiveActionImpl();
        instance.setIsActive(template.getIsActive());
        return instance;
    }

    public DiscountGroupSetIsActiveAction copyDeep();

    /**
     * factory method to create a deep copy of DiscountGroupSetIsActiveAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static DiscountGroupSetIsActiveAction deepCopy(@Nullable final DiscountGroupSetIsActiveAction template) {
        if (template == null) {
            return null;
        }
        DiscountGroupSetIsActiveActionImpl instance = new DiscountGroupSetIsActiveActionImpl();
        instance.setIsActive(template.getIsActive());
        return instance;
    }

    /**
     * builder factory method for DiscountGroupSetIsActiveAction
     * @return builder
     */
    public static DiscountGroupSetIsActiveActionBuilder builder() {
        return DiscountGroupSetIsActiveActionBuilder.of();
    }

    /**
     * create builder for DiscountGroupSetIsActiveAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static DiscountGroupSetIsActiveActionBuilder builder(final DiscountGroupSetIsActiveAction template) {
        return DiscountGroupSetIsActiveActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withDiscountGroupSetIsActiveAction(Function<DiscountGroupSetIsActiveAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<DiscountGroupSetIsActiveAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<DiscountGroupSetIsActiveAction>() {
            @Override
            public String toString() {
                return "TypeReference<DiscountGroupSetIsActiveAction>";
            }
        };
    }
}
