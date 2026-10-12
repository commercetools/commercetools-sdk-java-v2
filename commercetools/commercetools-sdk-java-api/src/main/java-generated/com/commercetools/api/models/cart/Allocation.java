
package com.commercetools.api.models.cart;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;
import tools.jackson.databind.annotation.*;

/**
 *  <p>Share of the Order total that a <a href="https://docs.commercetools.com/apis/ctp:api:type:RecurringPaymentAllocation" rel="nofollow">RecurringPaymentAllocation</a> covers.</p>
 *
 * <hr>
 * Example to create a subtype instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     Allocation allocation = Allocation.absoluteBuilder()
 *             amount(amountBuilder -> amountBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "type", defaultImpl = AllocationImpl.class, visible = true)
@JsonDeserialize(as = AllocationImpl.class)
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface Allocation {

    /**
     *  <p>Type of the Allocation.</p>
     * @return type
     */
    @NotNull
    @JsonProperty("type")
    public String getType();

    public Allocation copyDeep();

    /**
     * factory method to create a deep copy of Allocation
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static Allocation deepCopy(@Nullable final Allocation template) {
        if (template == null) {
            return null;
        }

        if (!(template instanceof AllocationImpl)) {
            return template.copyDeep();
        }
        AllocationImpl instance = new AllocationImpl();
        return instance;
    }

    /**
     * builder for absolute subtype
     * @return builder
     */
    public static com.commercetools.api.models.cart.AbsoluteAllocationBuilder absoluteBuilder() {
        return com.commercetools.api.models.cart.AbsoluteAllocationBuilder.of();
    }

    /**
     * builder for relative subtype
     * @return builder
     */
    public static com.commercetools.api.models.cart.RelativeAllocationBuilder relativeBuilder() {
        return com.commercetools.api.models.cart.RelativeAllocationBuilder.of();
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withAllocation(Function<Allocation, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static tools.jackson.core.type.TypeReference<Allocation> typeReference() {
        return new tools.jackson.core.type.TypeReference<Allocation>() {
            @Override
            public String toString() {
                return "TypeReference<Allocation>";
            }
        };
    }
}
