
package com.commercetools.history.models.change;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetOrderTotalPriceChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetOrderTotalPriceChange setOrderTotalPriceChange = SetOrderTotalPriceChange.builder()
 *             .change("{change}")
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SetOrderTotalPriceChangeBuilder implements Builder<SetOrderTotalPriceChange> {

    private String change;

    private com.commercetools.history.models.common.Money nextValue;

    private com.commercetools.history.models.common.Money previousValue;

    /**
     <*  <p>Update action for <code>setOrderTotalPrice</code></p>>
     */

    public SetOrderTotalPriceChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     <>
     */

    public SetOrderTotalPriceChangeBuilder nextValue(
            Function<com.commercetools.history.models.common.MoneyBuilder, com.commercetools.history.models.common.MoneyBuilder> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.MoneyBuilder.of()).build();
        return this;
    }

    /**
     <>
     */

    public SetOrderTotalPriceChangeBuilder nextValue(final com.commercetools.history.models.common.Money nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    /**
     <>
     */

    public SetOrderTotalPriceChangeBuilder previousValue(
            Function<com.commercetools.history.models.common.MoneyBuilder, com.commercetools.history.models.common.MoneyBuilder> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.common.MoneyBuilder.of()).build();
        return this;
    }

    /**
     <>
     */

    public SetOrderTotalPriceChangeBuilder previousValue(
            final com.commercetools.history.models.common.Money previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    public String getChange() {
        return this.change;
    }

    public com.commercetools.history.models.common.Money getNextValue() {
        return this.nextValue;
    }

    public com.commercetools.history.models.common.Money getPreviousValue() {
        return this.previousValue;
    }

    public SetOrderTotalPriceChange build() {
        Objects.requireNonNull(change, SetOrderTotalPriceChange.class + ": change is missing");
        Objects.requireNonNull(nextValue, SetOrderTotalPriceChange.class + ": nextValue is missing");
        Objects.requireNonNull(previousValue, SetOrderTotalPriceChange.class + ": previousValue is missing");
        return new SetOrderTotalPriceChangeImpl(change, nextValue, previousValue);
    }

    /**
     * builds SetOrderTotalPriceChange without checking for non null required values
     */
    public SetOrderTotalPriceChange buildUnchecked() {
        return new SetOrderTotalPriceChangeImpl(change, nextValue, previousValue);
    }

    public static SetOrderTotalPriceChangeBuilder of() {
        return new SetOrderTotalPriceChangeBuilder();
    }

    public static SetOrderTotalPriceChangeBuilder of(final SetOrderTotalPriceChange template) {
        SetOrderTotalPriceChangeBuilder builder = new SetOrderTotalPriceChangeBuilder();
        builder.change = template.getChange();
        builder.nextValue = template.getNextValue();
        builder.previousValue = template.getPreviousValue();
        return builder;
    }

}
