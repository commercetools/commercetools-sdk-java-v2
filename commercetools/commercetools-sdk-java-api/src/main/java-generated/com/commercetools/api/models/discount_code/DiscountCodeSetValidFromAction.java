
package com.commercetools.api.models.discount_code;

import java.time.*;
import java.time.ZonedDateTime;
import java.util.*;
import java.util.function.Function;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * DiscountCodeSetValidFromAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     DiscountCodeSetValidFromAction discountCodeSetValidFromAction = DiscountCodeSetValidFromAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = DiscountCodeSetValidFromActionImpl.class)
public interface DiscountCodeSetValidFromAction extends DiscountCodeUpdateAction {

    /**
     * discriminator value for DiscountCodeSetValidFromAction
     */
    String SET_VALID_FROM = "setValidFrom";

    /**
     *  <p>Value to set that must be earlier than <code>validUntil</code>. If empty, any existing value will be removed.</p>
     * @return validFrom
     */

    @JsonProperty("validFrom")
    public ZonedDateTime getValidFrom();

    /**
     *  <p>Value to set that must be earlier than <code>validUntil</code>. If empty, any existing value will be removed.</p>
     * @param validFrom value to be set
     */

    public void setValidFrom(final ZonedDateTime validFrom);

    /**
     * factory method
     * @return instance of DiscountCodeSetValidFromAction
     */
    public static DiscountCodeSetValidFromAction of() {
        return new DiscountCodeSetValidFromActionImpl();
    }

    /**
     * factory method to copy an instance of DiscountCodeSetValidFromAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static DiscountCodeSetValidFromAction of(final DiscountCodeSetValidFromAction template) {
        DiscountCodeSetValidFromActionImpl instance = new DiscountCodeSetValidFromActionImpl();
        instance.setValidFrom(template.getValidFrom());
        return instance;
    }

    /**
     * builder factory method for DiscountCodeSetValidFromAction
     * @return builder
     */
    public static DiscountCodeSetValidFromActionBuilder builder() {
        return DiscountCodeSetValidFromActionBuilder.of();
    }

    /**
     * create builder for DiscountCodeSetValidFromAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static DiscountCodeSetValidFromActionBuilder builder(final DiscountCodeSetValidFromAction template) {
        return DiscountCodeSetValidFromActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withDiscountCodeSetValidFromAction(Function<DiscountCodeSetValidFromAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<DiscountCodeSetValidFromAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<DiscountCodeSetValidFromAction>() {
            @Override
            public String toString() {
                return "TypeReference<DiscountCodeSetValidFromAction>";
            }
        };
    }
}
