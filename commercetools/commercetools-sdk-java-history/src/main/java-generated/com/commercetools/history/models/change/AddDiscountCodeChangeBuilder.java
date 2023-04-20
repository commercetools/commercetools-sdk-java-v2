
package com.commercetools.history.models.change;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * AddDiscountCodeChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AddDiscountCodeChange addDiscountCodeChange = AddDiscountCodeChange.builder()
 *             .change("{change}")
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class AddDiscountCodeChangeBuilder implements Builder<AddDiscountCodeChange> {

    private String change;

    private com.commercetools.history.models.common.DiscountCodeInfo nextValue;

    /**
     *  <p>Update action for <code>addDiscountCode</code></p>
     * @param change value to be set
     * @return Builder
     */

    public AddDiscountCodeChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     * set the value to the nextValue using the builder function
     * @param builder function to build the nextValue value
     * @return Builder
     */

    public AddDiscountCodeChangeBuilder nextValue(
            Function<com.commercetools.history.models.common.DiscountCodeInfoBuilder, com.commercetools.history.models.common.DiscountCodeInfoBuilder> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.DiscountCodeInfoBuilder.of()).build();
        return this;
    }

    /**
     * set the value to the nextValue using the builder function
     * @param builder function to build the nextValue value
     * @return Builder
     */

    public AddDiscountCodeChangeBuilder withNextValue(
            Function<com.commercetools.history.models.common.DiscountCodeInfoBuilder, com.commercetools.history.models.common.DiscountCodeInfo> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.DiscountCodeInfoBuilder.of());
        return this;
    }

    /**
     * set the value to the nextValue
     * @param nextValue value to be set
     * @return Builder
     */

    public AddDiscountCodeChangeBuilder nextValue(
            final com.commercetools.history.models.common.DiscountCodeInfo nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    /**
     *  <p>Update action for <code>addDiscountCode</code></p>
     * @return change
     */

    public String getChange() {
        return this.change;
    }

    /**
     * value of nextValue}
     * @return nextValue
     */

    public com.commercetools.history.models.common.DiscountCodeInfo getNextValue() {
        return this.nextValue;
    }

    /**
     * builds AddDiscountCodeChange with checking for non-null required values
     * @return AddDiscountCodeChange
     */
    public AddDiscountCodeChange build() {
        Objects.requireNonNull(change, AddDiscountCodeChange.class + ": change is missing");
        Objects.requireNonNull(nextValue, AddDiscountCodeChange.class + ": nextValue is missing");
        return new AddDiscountCodeChangeImpl(change, nextValue);
    }

    /**
     * builds AddDiscountCodeChange without checking for non-null required values
     * @return AddDiscountCodeChange
     */
    public AddDiscountCodeChange buildUnchecked() {
        return new AddDiscountCodeChangeImpl(change, nextValue);
    }

    /**
     * factory method for an instance of AddDiscountCodeChangeBuilder
     * @return builder
     */
    public static AddDiscountCodeChangeBuilder of() {
        return new AddDiscountCodeChangeBuilder();
    }

    /**
     * create builder for AddDiscountCodeChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static AddDiscountCodeChangeBuilder of(final AddDiscountCodeChange template) {
        AddDiscountCodeChangeBuilder builder = new AddDiscountCodeChangeBuilder();
        builder.change = template.getChange();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
