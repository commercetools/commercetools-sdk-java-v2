
package com.commercetools.api.models.discount_code;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.Valid;

import com.commercetools.api.models.common.LocalizedString;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * DiscountCodeSetDescriptionAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     DiscountCodeSetDescriptionAction discountCodeSetDescriptionAction = DiscountCodeSetDescriptionAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = DiscountCodeSetDescriptionActionImpl.class)
public interface DiscountCodeSetDescriptionAction extends DiscountCodeUpdateAction {

    /**
     * discriminator value for DiscountCodeSetDescriptionAction
     */
    String SET_DESCRIPTION = "setDescription";

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @return description
     */
    @Valid
    @JsonProperty("description")
    public LocalizedString getDescription();

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @param description value to be set
     */

    public void setDescription(final LocalizedString description);

    /**
     * factory method
     * @return instance of DiscountCodeSetDescriptionAction
     */
    public static DiscountCodeSetDescriptionAction of() {
        return new DiscountCodeSetDescriptionActionImpl();
    }

    /**
     * factory method to create a shallow copy DiscountCodeSetDescriptionAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static DiscountCodeSetDescriptionAction of(final DiscountCodeSetDescriptionAction template) {
        DiscountCodeSetDescriptionActionImpl instance = new DiscountCodeSetDescriptionActionImpl();
        instance.setDescription(template.getDescription());
        return instance;
    }

    /**
     * factory method to create a deep copy of DiscountCodeSetDescriptionAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static DiscountCodeSetDescriptionAction deepCopy(@Nullable final DiscountCodeSetDescriptionAction template) {
        if (template == null) {
            return null;
        }
        DiscountCodeSetDescriptionActionImpl instance = new DiscountCodeSetDescriptionActionImpl();
        instance.setDescription(Optional.ofNullable(template.getDescription())
                .map(com.commercetools.api.models.common.LocalizedString::deepCopy)
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for DiscountCodeSetDescriptionAction
     * @return builder
     */
    public static DiscountCodeSetDescriptionActionBuilder builder() {
        return DiscountCodeSetDescriptionActionBuilder.of();
    }

    /**
     * create builder for DiscountCodeSetDescriptionAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static DiscountCodeSetDescriptionActionBuilder builder(final DiscountCodeSetDescriptionAction template) {
        return DiscountCodeSetDescriptionActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withDiscountCodeSetDescriptionAction(Function<DiscountCodeSetDescriptionAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<DiscountCodeSetDescriptionAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<DiscountCodeSetDescriptionAction>() {
            @Override
            public String toString() {
                return "TypeReference<DiscountCodeSetDescriptionAction>";
            }
        };
    }
}
