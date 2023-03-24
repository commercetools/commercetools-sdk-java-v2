
package com.commercetools.history.models.change;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetShippingInfoTaxedPriceChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetShippingInfoTaxedPriceChange setShippingInfoTaxedPriceChange = SetShippingInfoTaxedPriceChange.builder()
 *             .change("{change}")
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SetShippingInfoTaxedPriceChangeBuilder implements Builder<SetShippingInfoTaxedPriceChange> {

    private String change;

    private com.commercetools.history.models.common.TaxedPrice nextValue;

    private com.commercetools.history.models.common.TaxedPrice previousValue;

    /**
     *  <p>Update action for <code>setShippingInfoTaxedPrice</code></p>
     * @param change value to be set
     * @return Builder
     */

    public SetShippingInfoTaxedPriceChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     *
     * @param builder function to build the nextValue value
     * @return Builder
     */

    public SetShippingInfoTaxedPriceChangeBuilder nextValue(
            Function<com.commercetools.history.models.common.TaxedPriceBuilder, com.commercetools.history.models.common.TaxedPriceBuilder> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.TaxedPriceBuilder.of()).build();
        return this;
    }

    /**
     *
     * @param nextValue value to be set
     * @return Builder
     */

    public SetShippingInfoTaxedPriceChangeBuilder nextValue(
            final com.commercetools.history.models.common.TaxedPrice nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    /**
     *
     * @param builder function to build the previousValue value
     * @return Builder
     */

    public SetShippingInfoTaxedPriceChangeBuilder previousValue(
            Function<com.commercetools.history.models.common.TaxedPriceBuilder, com.commercetools.history.models.common.TaxedPriceBuilder> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.common.TaxedPriceBuilder.of()).build();
        return this;
    }

    /**
     *
     * @param previousValue value to be set
     * @return Builder
     */

    public SetShippingInfoTaxedPriceChangeBuilder previousValue(
            final com.commercetools.history.models.common.TaxedPrice previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    public String getChange() {
        return this.change;
    }

    public com.commercetools.history.models.common.TaxedPrice getNextValue() {
        return this.nextValue;
    }

    public com.commercetools.history.models.common.TaxedPrice getPreviousValue() {
        return this.previousValue;
    }

    /**
     * builds SetShippingInfoTaxedPriceChange with checking for non-null required values
     * @return SetShippingInfoTaxedPriceChange
     */
    public SetShippingInfoTaxedPriceChange build() {
        Objects.requireNonNull(change, SetShippingInfoTaxedPriceChange.class + ": change is missing");
        Objects.requireNonNull(nextValue, SetShippingInfoTaxedPriceChange.class + ": nextValue is missing");
        Objects.requireNonNull(previousValue, SetShippingInfoTaxedPriceChange.class + ": previousValue is missing");
        return new SetShippingInfoTaxedPriceChangeImpl(change, nextValue, previousValue);
    }

    /**
     * builds SetShippingInfoTaxedPriceChange without checking for non-null required values
     * @return SetShippingInfoTaxedPriceChange
     */
    public SetShippingInfoTaxedPriceChange buildUnchecked() {
        return new SetShippingInfoTaxedPriceChangeImpl(change, nextValue, previousValue);
    }

    public static SetShippingInfoTaxedPriceChangeBuilder of() {
        return new SetShippingInfoTaxedPriceChangeBuilder();
    }

    public static SetShippingInfoTaxedPriceChangeBuilder of(final SetShippingInfoTaxedPriceChange template) {
        SetShippingInfoTaxedPriceChangeBuilder builder = new SetShippingInfoTaxedPriceChangeBuilder();
        builder.change = template.getChange();
        builder.nextValue = template.getNextValue();
        builder.previousValue = template.getPreviousValue();
        return builder;
    }

}
