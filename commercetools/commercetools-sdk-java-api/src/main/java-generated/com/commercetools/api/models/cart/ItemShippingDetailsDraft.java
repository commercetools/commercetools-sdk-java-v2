
package com.commercetools.api.models.cart;

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
 *  <p>For order creation and updates, the sum of the <code>targets</code> must match the quantity of the Line Items or Custom Line Items.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ItemShippingDetailsDraft itemShippingDetailsDraft = ItemShippingDetailsDraft.builder()
 *             .plusTargets(targetsBuilder -> targetsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ItemShippingDetailsDraftImpl.class)
public interface ItemShippingDetailsDraft extends io.vrap.rmf.base.client.Draft<ItemShippingDetailsDraft> {

    /**
     *  <p>Holds information on the quantity of Line Items or Custom Line Items and the address it is shipped.</p>
     *  <p>If multiple shipping addresses are present for a Line Item or Custom Line Item, sub-quantities must be specified.</p>
     * @return targets
     */
    @NotNull
    @Valid
    @JsonProperty("targets")
    public List<ItemShippingTarget> getTargets();

    /**
     *  <p>Holds information on the quantity of Line Items or Custom Line Items and the address it is shipped.</p>
     *  <p>If multiple shipping addresses are present for a Line Item or Custom Line Item, sub-quantities must be specified.</p>
     * @param targets values to be set
     */

    @JsonIgnore
    public void setTargets(final ItemShippingTarget... targets);

    /**
     *  <p>Holds information on the quantity of Line Items or Custom Line Items and the address it is shipped.</p>
     *  <p>If multiple shipping addresses are present for a Line Item or Custom Line Item, sub-quantities must be specified.</p>
     * @param targets values to be set
     */

    public void setTargets(final List<ItemShippingTarget> targets);

    /**
     * factory method
     * @return instance of ItemShippingDetailsDraft
     */
    public static ItemShippingDetailsDraft of() {
        return new ItemShippingDetailsDraftImpl();
    }

    /**
     * factory method to create a shallow copy ItemShippingDetailsDraft
     * @param template instance to be copied
     * @return copy instance
     */
    public static ItemShippingDetailsDraft of(final ItemShippingDetailsDraft template) {
        ItemShippingDetailsDraftImpl instance = new ItemShippingDetailsDraftImpl();
        instance.setTargets(template.getTargets());
        return instance;
    }

    /**
     * factory method to create a deep copy of ItemShippingDetailsDraft
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ItemShippingDetailsDraft deepCopy(@Nullable final ItemShippingDetailsDraft template) {
        if (template == null) {
            return null;
        }
        ItemShippingDetailsDraftImpl instance = new ItemShippingDetailsDraftImpl();
        instance.setTargets(Optional.ofNullable(template.getTargets())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.cart.ItemShippingTarget::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for ItemShippingDetailsDraft
     * @return builder
     */
    public static ItemShippingDetailsDraftBuilder builder() {
        return ItemShippingDetailsDraftBuilder.of();
    }

    /**
     * create builder for ItemShippingDetailsDraft instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ItemShippingDetailsDraftBuilder builder(final ItemShippingDetailsDraft template) {
        return ItemShippingDetailsDraftBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withItemShippingDetailsDraft(Function<ItemShippingDetailsDraft, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ItemShippingDetailsDraft> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ItemShippingDetailsDraft>() {
            @Override
            public String toString() {
                return "TypeReference<ItemShippingDetailsDraft>";
            }
        };
    }
}
