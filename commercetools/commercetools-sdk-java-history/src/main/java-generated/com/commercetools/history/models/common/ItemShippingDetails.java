
package com.commercetools.history.models.common;

import java.time.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 * ItemShippingDetails
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ItemShippingDetails itemShippingDetails = ItemShippingDetails.builder()
 *             .plusTargets(targetsBuilder -> targetsBuilder)
 *             .valid(true)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ItemShippingDetailsImpl.class)
public interface ItemShippingDetails {

    /**
     *
     * @return targets
     */
    @NotNull
    @Valid
    @JsonProperty("targets")
    public List<ItemShippingTarget> getTargets();

    /**
     *  <p>true if the quantity of the (custom) line item is equal to the sum of the sub-quantities in <code>targets</code>, <code>false</code> otherwise. A cart cannot be ordered when the value is <code>false</code>. The error InvalidItemShippingDetails will be triggered.</p>
     * @return valid
     */
    @NotNull
    @JsonProperty("valid")
    public Boolean getValid();

    /**
     * set targets
     * @param targets values to be set
     */

    @JsonIgnore
    public void setTargets(final ItemShippingTarget... targets);

    /**
     * set targets
     * @param targets values to be set
     */

    public void setTargets(final List<ItemShippingTarget> targets);

    /**
     *  <p>true if the quantity of the (custom) line item is equal to the sum of the sub-quantities in <code>targets</code>, <code>false</code> otherwise. A cart cannot be ordered when the value is <code>false</code>. The error InvalidItemShippingDetails will be triggered.</p>
     * @param valid value to be set
     */

    public void setValid(final Boolean valid);

    /**
     * factory method
     * @return instance of ItemShippingDetails
     */
    public static ItemShippingDetails of() {
        return new ItemShippingDetailsImpl();
    }

    /**
     * factory method to create a shallow copy ItemShippingDetails
     * @param template instance to be copied
     * @return copy instance
     */
    public static ItemShippingDetails of(final ItemShippingDetails template) {
        ItemShippingDetailsImpl instance = new ItemShippingDetailsImpl();
        instance.setTargets(template.getTargets());
        instance.setValid(template.getValid());
        return instance;
    }

    /**
     * factory method to create a deep copy of ItemShippingDetails
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ItemShippingDetails deepCopy(@Nullable final ItemShippingDetails template) {
        if (template == null) {
            return null;
        }
        ItemShippingDetailsImpl instance = new ItemShippingDetailsImpl();
        instance.setTargets(Optional.ofNullable(template.getTargets())
                .map(t -> t.stream()
                        .map(com.commercetools.history.models.common.ItemShippingTarget::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        instance.setValid(template.getValid());
        return instance;
    }

    /**
     * builder factory method for ItemShippingDetails
     * @return builder
     */
    public static ItemShippingDetailsBuilder builder() {
        return ItemShippingDetailsBuilder.of();
    }

    /**
     * create builder for ItemShippingDetails instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ItemShippingDetailsBuilder builder(final ItemShippingDetails template) {
        return ItemShippingDetailsBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withItemShippingDetails(Function<ItemShippingDetails, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ItemShippingDetails> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ItemShippingDetails>() {
            @Override
            public String toString() {
                return "TypeReference<ItemShippingDetails>";
            }
        };
    }
}
