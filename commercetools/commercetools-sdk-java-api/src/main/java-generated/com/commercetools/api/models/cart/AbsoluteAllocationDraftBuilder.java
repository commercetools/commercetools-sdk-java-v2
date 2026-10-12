
package com.commercetools.api.models.cart;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * AbsoluteAllocationDraftBuilder
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
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class AbsoluteAllocationDraftBuilder implements Builder<AbsoluteAllocationDraft> {

    private com.commercetools.api.models.common.HighPrecisionMoneyDraft amount;

    /**
     *  <p>Amount of the Order total allocated to the Payment Method.</p>
     * @param builder function to build the amount value
     * @return Builder
     */

    public AbsoluteAllocationDraftBuilder amount(
            Function<com.commercetools.api.models.common.HighPrecisionMoneyDraftBuilder, com.commercetools.api.models.common.HighPrecisionMoneyDraftBuilder> builder) {
        this.amount = builder.apply(com.commercetools.api.models.common.HighPrecisionMoneyDraftBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Amount of the Order total allocated to the Payment Method.</p>
     * @param builder function to build the amount value
     * @return Builder
     */

    public AbsoluteAllocationDraftBuilder withAmount(
            Function<com.commercetools.api.models.common.HighPrecisionMoneyDraftBuilder, com.commercetools.api.models.common.HighPrecisionMoneyDraft> builder) {
        this.amount = builder.apply(com.commercetools.api.models.common.HighPrecisionMoneyDraftBuilder.of());
        return this;
    }

    /**
     *  <p>Amount of the Order total allocated to the Payment Method.</p>
     * @param amount value to be set
     * @return Builder
     */

    public AbsoluteAllocationDraftBuilder amount(
            final com.commercetools.api.models.common.HighPrecisionMoneyDraft amount) {
        this.amount = amount;
        return this;
    }

    /**
     *  <p>Amount of the Order total allocated to the Payment Method.</p>
     * @return amount
     */

    public com.commercetools.api.models.common.HighPrecisionMoneyDraft getAmount() {
        return this.amount;
    }

    /**
     * builds AbsoluteAllocationDraft with checking for non-null required values
     * @return AbsoluteAllocationDraft
     */
    public AbsoluteAllocationDraft build() {
        Objects.requireNonNull(amount, AbsoluteAllocationDraft.class + ": amount is missing");
        return new AbsoluteAllocationDraftImpl(amount);
    }

    /**
     * builds AbsoluteAllocationDraft without checking for non-null required values
     * @return AbsoluteAllocationDraft
     */
    public AbsoluteAllocationDraft buildUnchecked() {
        return new AbsoluteAllocationDraftImpl(amount);
    }

    /**
     * factory method for an instance of AbsoluteAllocationDraftBuilder
     * @return builder
     */
    public static AbsoluteAllocationDraftBuilder of() {
        return new AbsoluteAllocationDraftBuilder();
    }

    /**
     * create builder for AbsoluteAllocationDraft instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static AbsoluteAllocationDraftBuilder of(final AbsoluteAllocationDraft template) {
        AbsoluteAllocationDraftBuilder builder = new AbsoluteAllocationDraftBuilder();
        builder.amount = template.getAmount();
        return builder;
    }

}
