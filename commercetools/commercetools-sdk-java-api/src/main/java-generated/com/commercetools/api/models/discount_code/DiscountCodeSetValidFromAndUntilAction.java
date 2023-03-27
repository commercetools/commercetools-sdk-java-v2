
package com.commercetools.api.models.discount_code;

import java.time.*;
import java.time.ZonedDateTime;
import java.util.*;
import java.util.function.Function;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * DiscountCodeSetValidFromAndUntilAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     DiscountCodeSetValidFromAndUntilAction discountCodeSetValidFromAndUntilAction = DiscountCodeSetValidFromAndUntilAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = DiscountCodeSetValidFromAndUntilActionImpl.class)
public interface DiscountCodeSetValidFromAndUntilAction extends DiscountCodeUpdateAction {

    /**
     * discriminator value for DiscountCodeSetValidFromAndUntilAction
     */
    String SET_VALID_FROM_AND_UNTIL = "setValidFromAndUntil";

    /**
     *  <p>Value to set that must be earlier than <code>validUntil</code>. If empty, any existing value will be removed.</p>
     * @return validFrom
     */

    @JsonProperty("validFrom")
    public ZonedDateTime getValidFrom();

    /**
     *  <p>Value to set that must be later than <code>validFrom</code>. If empty, any existing value will be removed.</p>
     * @return validUntil
     */

    @JsonProperty("validUntil")
    public ZonedDateTime getValidUntil();

    /**
     *  <p>Value to set that must be earlier than <code>validUntil</code>. If empty, any existing value will be removed.</p>
     * @param validFrom value to be set
     */

    public void setValidFrom(final ZonedDateTime validFrom);

    /**
     *  <p>Value to set that must be later than <code>validFrom</code>. If empty, any existing value will be removed.</p>
     * @param validUntil value to be set
     */

    public void setValidUntil(final ZonedDateTime validUntil);

    /**
     * factory method
     * @return instance of DiscountCodeSetValidFromAndUntilAction
     */
    public static DiscountCodeSetValidFromAndUntilAction of() {
        return new DiscountCodeSetValidFromAndUntilActionImpl();
    }

    /**
     * factory method to copy an instance of DiscountCodeSetValidFromAndUntilAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static DiscountCodeSetValidFromAndUntilAction of(final DiscountCodeSetValidFromAndUntilAction template) {
        DiscountCodeSetValidFromAndUntilActionImpl instance = new DiscountCodeSetValidFromAndUntilActionImpl();
        instance.setValidFrom(template.getValidFrom());
        instance.setValidUntil(template.getValidUntil());
        return instance;
    }

    /**
     * builder factory method for DiscountCodeSetValidFromAndUntilAction
     * @return builder
     */
    public static DiscountCodeSetValidFromAndUntilActionBuilder builder() {
        return DiscountCodeSetValidFromAndUntilActionBuilder.of();
    }

    /**
     * create builder for DiscountCodeSetValidFromAndUntilAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static DiscountCodeSetValidFromAndUntilActionBuilder builder(
            final DiscountCodeSetValidFromAndUntilAction template) {
        return DiscountCodeSetValidFromAndUntilActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withDiscountCodeSetValidFromAndUntilAction(
            Function<DiscountCodeSetValidFromAndUntilAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<DiscountCodeSetValidFromAndUntilAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<DiscountCodeSetValidFromAndUntilAction>() {
            @Override
            public String toString() {
                return "TypeReference<DiscountCodeSetValidFromAndUntilAction>";
            }
        };
    }
}
