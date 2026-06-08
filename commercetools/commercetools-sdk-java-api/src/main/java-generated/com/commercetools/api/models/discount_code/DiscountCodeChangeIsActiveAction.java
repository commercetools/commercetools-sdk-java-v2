
package com.commercetools.api.models.discount_code;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 * DiscountCodeChangeIsActiveAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     DiscountCodeChangeIsActiveAction discountCodeChangeIsActiveAction = DiscountCodeChangeIsActiveAction.builder()
 *             .isActive(true)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("changeIsActive")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = DiscountCodeChangeIsActiveActionImpl.class)
public interface DiscountCodeChangeIsActiveAction extends DiscountCodeUpdateAction {

    /**
     * discriminator value for DiscountCodeChangeIsActiveAction
     */
    String CHANGE_IS_ACTIVE = "changeIsActive";

    /**
     *  <p>New value to set. Set to <code>true</code> to activate the DiscountCode for all matching Discounts.</p>
     * @return isActive
     */
    @NotNull
    @JsonProperty("isActive")
    public Boolean getIsActive();

    /**
     *  <p>New value to set. Set to <code>true</code> to activate the DiscountCode for all matching Discounts.</p>
     * @param isActive value to be set
     */

    public void setIsActive(final Boolean isActive);

    /**
     * factory method
     * @return instance of DiscountCodeChangeIsActiveAction
     */
    public static DiscountCodeChangeIsActiveAction of() {
        return new DiscountCodeChangeIsActiveActionImpl();
    }

    /**
     * factory method to create a shallow copy DiscountCodeChangeIsActiveAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static DiscountCodeChangeIsActiveAction of(final DiscountCodeChangeIsActiveAction template) {
        DiscountCodeChangeIsActiveActionImpl instance = new DiscountCodeChangeIsActiveActionImpl();
        instance.setIsActive(template.getIsActive());
        return instance;
    }

    public DiscountCodeChangeIsActiveAction copyDeep();

    /**
     * factory method to create a deep copy of DiscountCodeChangeIsActiveAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static DiscountCodeChangeIsActiveAction deepCopy(@Nullable final DiscountCodeChangeIsActiveAction template) {
        if (template == null) {
            return null;
        }
        DiscountCodeChangeIsActiveActionImpl instance = new DiscountCodeChangeIsActiveActionImpl();
        instance.setIsActive(template.getIsActive());
        return instance;
    }

    /**
     * builder factory method for DiscountCodeChangeIsActiveAction
     * @return builder
     */
    public static DiscountCodeChangeIsActiveActionBuilder builder() {
        return DiscountCodeChangeIsActiveActionBuilder.of();
    }

    /**
     * create builder for DiscountCodeChangeIsActiveAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static DiscountCodeChangeIsActiveActionBuilder builder(final DiscountCodeChangeIsActiveAction template) {
        return DiscountCodeChangeIsActiveActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withDiscountCodeChangeIsActiveAction(Function<DiscountCodeChangeIsActiveAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<DiscountCodeChangeIsActiveAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<DiscountCodeChangeIsActiveAction>() {
            @Override
            public String toString() {
                return "TypeReference<DiscountCodeChangeIsActiveAction>";
            }
        };
    }
}
