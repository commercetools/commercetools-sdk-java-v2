
package com.commercetools.api.models.cart;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * AbsoluteAllocationBuilder
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
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class AbsoluteAllocationBuilder implements Builder<AbsoluteAllocation> {

    private com.commercetools.api.models.common.HighPrecisionMoney amount;

    /**
     *  <p>Amount of the Order total allocated to the Payment Method.</p>
     * @param builder function to build the amount value
     * @return Builder
     */

    public AbsoluteAllocationBuilder amount(
            Function<com.commercetools.api.models.common.HighPrecisionMoneyBuilder, com.commercetools.api.models.common.HighPrecisionMoneyBuilder> builder) {
        this.amount = builder.apply(com.commercetools.api.models.common.HighPrecisionMoneyBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Amount of the Order total allocated to the Payment Method.</p>
     * @param builder function to build the amount value
     * @return Builder
     */

    public AbsoluteAllocationBuilder withAmount(
            Function<com.commercetools.api.models.common.HighPrecisionMoneyBuilder, com.commercetools.api.models.common.HighPrecisionMoney> builder) {
        this.amount = builder.apply(com.commercetools.api.models.common.HighPrecisionMoneyBuilder.of());
        return this;
    }

    /**
     *  <p>Amount of the Order total allocated to the Payment Method.</p>
     * @param amount value to be set
     * @return Builder
     */

    public AbsoluteAllocationBuilder amount(final com.commercetools.api.models.common.HighPrecisionMoney amount) {
        this.amount = amount;
        return this;
    }

    /**
     *  <p>Amount of the Order total allocated to the Payment Method.</p>
     * @return amount
     */

    public com.commercetools.api.models.common.HighPrecisionMoney getAmount() {
        return this.amount;
    }

    /**
     * builds AbsoluteAllocation with checking for non-null required values
     * @return AbsoluteAllocation
     */
    public AbsoluteAllocation build() {
        Objects.requireNonNull(amount, AbsoluteAllocation.class + ": amount is missing");
        return new AbsoluteAllocationImpl(amount);
    }

    /**
     * builds AbsoluteAllocation without checking for non-null required values
     * @return AbsoluteAllocation
     */
    public AbsoluteAllocation buildUnchecked() {
        return new AbsoluteAllocationImpl(amount);
    }

    /**
     * factory method for an instance of AbsoluteAllocationBuilder
     * @return builder
     */
    public static AbsoluteAllocationBuilder of() {
        return new AbsoluteAllocationBuilder();
    }

    /**
     * create builder for AbsoluteAllocation instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static AbsoluteAllocationBuilder of(final AbsoluteAllocation template) {
        AbsoluteAllocationBuilder builder = new AbsoluteAllocationBuilder();
        builder.amount = template.getAmount();
        return builder;
    }

}
