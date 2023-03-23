
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
     * @param change
     * @return Builder
     */

    public AddDiscountCodeChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     *
     * @return Builder
     */

    public AddDiscountCodeChangeBuilder nextValue(
            Function<com.commercetools.history.models.common.DiscountCodeInfoBuilder, com.commercetools.history.models.common.DiscountCodeInfoBuilder> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.DiscountCodeInfoBuilder.of()).build();
        return this;
    }

    /**
     *
     * @param nextValue
     * @return Builder
     */

    public AddDiscountCodeChangeBuilder nextValue(
            final com.commercetools.history.models.common.DiscountCodeInfo nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    public String getChange() {
        return this.change;
    }

    public com.commercetools.history.models.common.DiscountCodeInfo getNextValue() {
        return this.nextValue;
    }

    public AddDiscountCodeChange build() {
        Objects.requireNonNull(change, AddDiscountCodeChange.class + ": change is missing");
        Objects.requireNonNull(nextValue, AddDiscountCodeChange.class + ": nextValue is missing");
        return new AddDiscountCodeChangeImpl(change, nextValue);
    }

    /**
     * builds AddDiscountCodeChange without checking for non null required values
     */
    public AddDiscountCodeChange buildUnchecked() {
        return new AddDiscountCodeChangeImpl(change, nextValue);
    }

    public static AddDiscountCodeChangeBuilder of() {
        return new AddDiscountCodeChangeBuilder();
    }

    public static AddDiscountCodeChangeBuilder of(final AddDiscountCodeChange template) {
        AddDiscountCodeChangeBuilder builder = new AddDiscountCodeChangeBuilder();
        builder.change = template.getChange();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
