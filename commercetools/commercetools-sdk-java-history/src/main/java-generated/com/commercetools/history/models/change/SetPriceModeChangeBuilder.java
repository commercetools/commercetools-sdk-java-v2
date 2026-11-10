
package com.commercetools.history.models.change;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetPriceModeChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetPriceModeChange setPriceModeChange = SetPriceModeChange.builder()
 *             .change("{change}")
 *             .previousValue(ProductPriceModeEnum.EMBEDDED)
 *             .nextValue(ProductPriceModeEnum.EMBEDDED)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SetPriceModeChangeBuilder implements Builder<SetPriceModeChange> {

    private String change;

    private com.commercetools.history.models.common.ProductPriceModeEnum previousValue;

    private com.commercetools.history.models.common.ProductPriceModeEnum nextValue;

    /**
     * set the value to the change
     * @param change value to be set
     * @return Builder
     */

    public SetPriceModeChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     * @return Builder
     */

    public SetPriceModeChangeBuilder previousValue(
            final com.commercetools.history.models.common.ProductPriceModeEnum previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     * @return Builder
     */

    public SetPriceModeChangeBuilder nextValue(
            final com.commercetools.history.models.common.ProductPriceModeEnum nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    /**
     * value of change}
     * @return change
     */

    public String getChange() {
        return this.change;
    }

    /**
     *  <p>Value before the change.</p>
     * @return previousValue
     */

    public com.commercetools.history.models.common.ProductPriceModeEnum getPreviousValue() {
        return this.previousValue;
    }

    /**
     *  <p>Value after the change.</p>
     * @return nextValue
     */

    public com.commercetools.history.models.common.ProductPriceModeEnum getNextValue() {
        return this.nextValue;
    }

    /**
     * builds SetPriceModeChange with checking for non-null required values
     * @return SetPriceModeChange
     */
    public SetPriceModeChange build() {
        Objects.requireNonNull(change, SetPriceModeChange.class + ": change is missing");
        Objects.requireNonNull(previousValue, SetPriceModeChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, SetPriceModeChange.class + ": nextValue is missing");
        return new SetPriceModeChangeImpl(change, previousValue, nextValue);
    }

    /**
     * builds SetPriceModeChange without checking for non-null required values
     * @return SetPriceModeChange
     */
    public SetPriceModeChange buildUnchecked() {
        return new SetPriceModeChangeImpl(change, previousValue, nextValue);
    }

    /**
     * factory method for an instance of SetPriceModeChangeBuilder
     * @return builder
     */
    public static SetPriceModeChangeBuilder of() {
        return new SetPriceModeChangeBuilder();
    }

    /**
     * create builder for SetPriceModeChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetPriceModeChangeBuilder of(final SetPriceModeChange template) {
        SetPriceModeChangeBuilder builder = new SetPriceModeChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
