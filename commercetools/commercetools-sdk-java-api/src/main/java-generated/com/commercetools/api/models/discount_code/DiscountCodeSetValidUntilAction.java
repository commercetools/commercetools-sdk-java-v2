
package com.commercetools.api.models.discount_code;

import java.time.*;
import java.time.ZonedDateTime;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * DiscountCodeSetValidUntilAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     DiscountCodeSetValidUntilAction discountCodeSetValidUntilAction = DiscountCodeSetValidUntilAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("setValidUntil")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = DiscountCodeSetValidUntilActionImpl.class)
public interface DiscountCodeSetValidUntilAction extends DiscountCodeUpdateAction {

    /**
     * discriminator value for DiscountCodeSetValidUntilAction
     */
    String SET_VALID_UNTIL = "setValidUntil";

    /**
     *  <p>Value to set that must be later than <code>validFrom</code>. If empty, any existing value will be removed.</p>
     * @return validUntil
     */

    @JsonProperty("validUntil")
    public ZonedDateTime getValidUntil();

    /**
     *  <p>Value to set that must be later than <code>validFrom</code>. If empty, any existing value will be removed.</p>
     * @param validUntil value to be set
     */

    public void setValidUntil(final ZonedDateTime validUntil);

    /**
     * factory method
     * @return instance of DiscountCodeSetValidUntilAction
     */
    public static DiscountCodeSetValidUntilAction of() {
        return new DiscountCodeSetValidUntilActionImpl();
    }

    /**
     * factory method to create a shallow copy DiscountCodeSetValidUntilAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static DiscountCodeSetValidUntilAction of(final DiscountCodeSetValidUntilAction template) {
        DiscountCodeSetValidUntilActionImpl instance = new DiscountCodeSetValidUntilActionImpl();
        instance.setValidUntil(template.getValidUntil());
        return instance;
    }

    public DiscountCodeSetValidUntilAction copyDeep();

    /**
     * factory method to create a deep copy of DiscountCodeSetValidUntilAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static DiscountCodeSetValidUntilAction deepCopy(@Nullable final DiscountCodeSetValidUntilAction template) {
        if (template == null) {
            return null;
        }
        DiscountCodeSetValidUntilActionImpl instance = new DiscountCodeSetValidUntilActionImpl();
        instance.setValidUntil(template.getValidUntil());
        return instance;
    }

    /**
     * builder factory method for DiscountCodeSetValidUntilAction
     * @return builder
     */
    public static DiscountCodeSetValidUntilActionBuilder builder() {
        return DiscountCodeSetValidUntilActionBuilder.of();
    }

    /**
     * create builder for DiscountCodeSetValidUntilAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static DiscountCodeSetValidUntilActionBuilder builder(final DiscountCodeSetValidUntilAction template) {
        return DiscountCodeSetValidUntilActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withDiscountCodeSetValidUntilAction(Function<DiscountCodeSetValidUntilAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<DiscountCodeSetValidUntilAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<DiscountCodeSetValidUntilAction>() {
            @Override
            public String toString() {
                return "TypeReference<DiscountCodeSetValidUntilAction>";
            }
        };
    }
}
