
package com.commercetools.history.models.change;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ChangeAmountPlannedChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ChangeAmountPlannedChange changeAmountPlannedChange = ChangeAmountPlannedChange.builder()
 *             .change("{change}")
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ChangeAmountPlannedChangeBuilder implements Builder<ChangeAmountPlannedChange> {

    private String change;

    private com.commercetools.history.models.common.Money previousValue;

    private com.commercetools.history.models.common.Money nextValue;

    /**
     *
     * @param change value to be set
     * @return Builder
     */

    public ChangeAmountPlannedChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     *
     * @param builder function to build the previousValue value
     * @return Builder
     */

    public ChangeAmountPlannedChangeBuilder previousValue(
            Function<com.commercetools.history.models.common.MoneyBuilder, com.commercetools.history.models.common.MoneyBuilder> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.common.MoneyBuilder.of()).build();
        return this;
    }

    /**
     *
     * @param previousValue value to be set
     * @return Builder
     */

    public ChangeAmountPlannedChangeBuilder previousValue(
            final com.commercetools.history.models.common.Money previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     *
     * @param builder function to build the nextValue value
     * @return Builder
     */

    public ChangeAmountPlannedChangeBuilder nextValue(
            Function<com.commercetools.history.models.common.MoneyBuilder, com.commercetools.history.models.common.MoneyBuilder> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.MoneyBuilder.of()).build();
        return this;
    }

    /**
     *
     * @param nextValue value to be set
     * @return Builder
     */

    public ChangeAmountPlannedChangeBuilder nextValue(final com.commercetools.history.models.common.Money nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    public String getChange() {
        return this.change;
    }

    public com.commercetools.history.models.common.Money getPreviousValue() {
        return this.previousValue;
    }

    public com.commercetools.history.models.common.Money getNextValue() {
        return this.nextValue;
    }

    /**
     * builds ChangeAmountPlannedChange with checking for non-null required values
     * @return ChangeAmountPlannedChange
     */
    public ChangeAmountPlannedChange build() {
        Objects.requireNonNull(change, ChangeAmountPlannedChange.class + ": change is missing");
        Objects.requireNonNull(previousValue, ChangeAmountPlannedChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, ChangeAmountPlannedChange.class + ": nextValue is missing");
        return new ChangeAmountPlannedChangeImpl(change, previousValue, nextValue);
    }

    /**
     * builds ChangeAmountPlannedChange without checking for non-null required values
     * @return ChangeAmountPlannedChange
     */
    public ChangeAmountPlannedChange buildUnchecked() {
        return new ChangeAmountPlannedChangeImpl(change, previousValue, nextValue);
    }

    public static ChangeAmountPlannedChangeBuilder of() {
        return new ChangeAmountPlannedChangeBuilder();
    }

    public static ChangeAmountPlannedChangeBuilder of(final ChangeAmountPlannedChange template) {
        ChangeAmountPlannedChangeBuilder builder = new ChangeAmountPlannedChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
