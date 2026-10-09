
package com.commercetools.api.models.cart;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.common.HighPrecisionMoneyDraft;
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
 *     AbsoluteAllocationDraft absoluteAllocationDraft = AbsoluteAllocationDraft.builder()
 *             .amount(amountBuilder -> amountBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("Absolute")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = AbsoluteAllocationDraftImpl.class)
public interface AbsoluteAllocationDraft
        extends AllocationDraft, io.vrap.rmf.base.client.Draft<AbsoluteAllocationDraft> {

    /**
     * discriminator value for AbsoluteAllocationDraft
     */
    String ABSOLUTE = "Absolute";

    /**
     *  <p>Amount of the Order total allocated to the Payment Method.</p>
     * @return amount
     */
    @NotNull
    @Valid
    @JsonProperty("amount")
    public HighPrecisionMoneyDraft getAmount();

    /**
     *  <p>Amount of the Order total allocated to the Payment Method.</p>
     * @param amount value to be set
     */

    public void setAmount(final HighPrecisionMoneyDraft amount);

    /**
     * factory method
     * @return instance of AbsoluteAllocationDraft
     */
    public static AbsoluteAllocationDraft of() {
        return new AbsoluteAllocationDraftImpl();
    }

    /**
     * factory method to create a shallow copy AbsoluteAllocationDraft
     * @param template instance to be copied
     * @return copy instance
     */
    public static AbsoluteAllocationDraft of(final AbsoluteAllocationDraft template) {
        AbsoluteAllocationDraftImpl instance = new AbsoluteAllocationDraftImpl();
        instance.setAmount(template.getAmount());
        return instance;
    }

    public AbsoluteAllocationDraft copyDeep();

    /**
     * factory method to create a deep copy of AbsoluteAllocationDraft
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static AbsoluteAllocationDraft deepCopy(@Nullable final AbsoluteAllocationDraft template) {
        if (template == null) {
            return null;
        }
        AbsoluteAllocationDraftImpl instance = new AbsoluteAllocationDraftImpl();
        instance.setAmount(com.commercetools.api.models.common.HighPrecisionMoneyDraft.deepCopy(template.getAmount()));
        return instance;
    }

    /**
     * builder factory method for AbsoluteAllocationDraft
     * @return builder
     */
    public static AbsoluteAllocationDraftBuilder builder() {
        return AbsoluteAllocationDraftBuilder.of();
    }

    /**
     * create builder for AbsoluteAllocationDraft instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static AbsoluteAllocationDraftBuilder builder(final AbsoluteAllocationDraft template) {
        return AbsoluteAllocationDraftBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withAbsoluteAllocationDraft(Function<AbsoluteAllocationDraft, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static tools.jackson.core.type.TypeReference<AbsoluteAllocationDraft> typeReference() {
        return new tools.jackson.core.type.TypeReference<AbsoluteAllocationDraft>() {
            @Override
            public String toString() {
                return "TypeReference<AbsoluteAllocationDraft>";
            }
        };
    }
}
