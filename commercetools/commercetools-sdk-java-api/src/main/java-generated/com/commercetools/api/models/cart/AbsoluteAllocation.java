
package com.commercetools.api.models.cart;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.common.HighPrecisionMoney;
import com.fasterxml.jackson.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import tools.jackson.databind.annotation.*;

/**
 *  <p>Allocates a fixed amount of the Order total to a Payment Method.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AbsoluteAllocation absoluteAllocation = AbsoluteAllocation.builder()
 *             .amount(amountBuilder -> amountBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("Absolute")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = AbsoluteAllocationImpl.class)
public interface AbsoluteAllocation extends Allocation {

    /**
     * discriminator value for AbsoluteAllocation
     */
    String ABSOLUTE = "Absolute";

    /**
     *  <p>Amount of the Order total allocated to the Payment Method.</p>
     * @return amount
     */
    @NotNull
    @Valid
    @JsonProperty("amount")
    public HighPrecisionMoney getAmount();

    /**
     *  <p>Amount of the Order total allocated to the Payment Method.</p>
     * @param amount value to be set
     */

    public void setAmount(final HighPrecisionMoney amount);

    /**
     * factory method
     * @return instance of AbsoluteAllocation
     */
    public static AbsoluteAllocation of() {
        return new AbsoluteAllocationImpl();
    }

    /**
     * factory method to create a shallow copy AbsoluteAllocation
     * @param template instance to be copied
     * @return copy instance
     */
    public static AbsoluteAllocation of(final AbsoluteAllocation template) {
        AbsoluteAllocationImpl instance = new AbsoluteAllocationImpl();
        instance.setAmount(template.getAmount());
        return instance;
    }

    public AbsoluteAllocation copyDeep();

    /**
     * factory method to create a deep copy of AbsoluteAllocation
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static AbsoluteAllocation deepCopy(@Nullable final AbsoluteAllocation template) {
        if (template == null) {
            return null;
        }
        AbsoluteAllocationImpl instance = new AbsoluteAllocationImpl();
        instance.setAmount(com.commercetools.api.models.common.HighPrecisionMoney.deepCopy(template.getAmount()));
        return instance;
    }

    /**
     * builder factory method for AbsoluteAllocation
     * @return builder
     */
    public static AbsoluteAllocationBuilder builder() {
        return AbsoluteAllocationBuilder.of();
    }

    /**
     * create builder for AbsoluteAllocation instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static AbsoluteAllocationBuilder builder(final AbsoluteAllocation template) {
        return AbsoluteAllocationBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withAbsoluteAllocation(Function<AbsoluteAllocation, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static tools.jackson.core.type.TypeReference<AbsoluteAllocation> typeReference() {
        return new tools.jackson.core.type.TypeReference<AbsoluteAllocation>() {
            @Override
            public String toString() {
                return "TypeReference<AbsoluteAllocation>";
            }
        };
    }
}
