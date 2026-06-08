
package com.commercetools.api.models.discount_group;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.common.LocalizedString;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;

/**
 * DiscountGroupSetDescriptionAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     DiscountGroupSetDescriptionAction discountGroupSetDescriptionAction = DiscountGroupSetDescriptionAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("setDescription")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = DiscountGroupSetDescriptionActionImpl.class)
public interface DiscountGroupSetDescriptionAction extends DiscountGroupUpdateAction {

    /**
     * discriminator value for DiscountGroupSetDescriptionAction
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
     * @return instance of DiscountGroupSetDescriptionAction
     */
    public static DiscountGroupSetDescriptionAction of() {
        return new DiscountGroupSetDescriptionActionImpl();
    }

    /**
     * factory method to create a shallow copy DiscountGroupSetDescriptionAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static DiscountGroupSetDescriptionAction of(final DiscountGroupSetDescriptionAction template) {
        DiscountGroupSetDescriptionActionImpl instance = new DiscountGroupSetDescriptionActionImpl();
        instance.setDescription(template.getDescription());
        return instance;
    }

    public DiscountGroupSetDescriptionAction copyDeep();

    /**
     * factory method to create a deep copy of DiscountGroupSetDescriptionAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static DiscountGroupSetDescriptionAction deepCopy(
            @Nullable final DiscountGroupSetDescriptionAction template) {
        if (template == null) {
            return null;
        }
        DiscountGroupSetDescriptionActionImpl instance = new DiscountGroupSetDescriptionActionImpl();
        instance.setDescription(
            com.commercetools.api.models.common.LocalizedString.deepCopy(template.getDescription()));
        return instance;
    }

    /**
     * builder factory method for DiscountGroupSetDescriptionAction
     * @return builder
     */
    public static DiscountGroupSetDescriptionActionBuilder builder() {
        return DiscountGroupSetDescriptionActionBuilder.of();
    }

    /**
     * create builder for DiscountGroupSetDescriptionAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static DiscountGroupSetDescriptionActionBuilder builder(final DiscountGroupSetDescriptionAction template) {
        return DiscountGroupSetDescriptionActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withDiscountGroupSetDescriptionAction(Function<DiscountGroupSetDescriptionAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<DiscountGroupSetDescriptionAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<DiscountGroupSetDescriptionAction>() {
            @Override
            public String toString() {
                return "TypeReference<DiscountGroupSetDescriptionAction>";
            }
        };
    }
}
