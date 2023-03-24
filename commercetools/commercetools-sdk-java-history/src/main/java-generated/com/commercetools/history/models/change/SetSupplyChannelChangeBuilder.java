
package com.commercetools.history.models.change;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetSupplyChannelChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetSupplyChannelChange setSupplyChannelChange = SetSupplyChannelChange.builder()
 *             .change("{change}")
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SetSupplyChannelChangeBuilder implements Builder<SetSupplyChannelChange> {

    private String change;

    private com.commercetools.history.models.common.Reference previousValue;

    private com.commercetools.history.models.common.Reference nextValue;

    /**
     *  <p>Shape of the action for <code>setSupplyChannel</code></p>
     * @param change value to be set
     * @return Builder
     */

    public SetSupplyChannelChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     *
     * @param builder function to build the previousValue value
     * @return Builder
     */

    public SetSupplyChannelChangeBuilder previousValue(
            Function<com.commercetools.history.models.common.ReferenceBuilder, com.commercetools.history.models.common.ReferenceBuilder> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.common.ReferenceBuilder.of()).build();
        return this;
    }

    /**
     *
     * @param previousValue value to be set
     * @return Builder
     */

    public SetSupplyChannelChangeBuilder previousValue(
            final com.commercetools.history.models.common.Reference previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     *
     * @param builder function to build the nextValue value
     * @return Builder
     */

    public SetSupplyChannelChangeBuilder nextValue(
            Function<com.commercetools.history.models.common.ReferenceBuilder, com.commercetools.history.models.common.ReferenceBuilder> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.ReferenceBuilder.of()).build();
        return this;
    }

    /**
     *
     * @param nextValue value to be set
     * @return Builder
     */

    public SetSupplyChannelChangeBuilder nextValue(final com.commercetools.history.models.common.Reference nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    public String getChange() {
        return this.change;
    }

    public com.commercetools.history.models.common.Reference getPreviousValue() {
        return this.previousValue;
    }

    public com.commercetools.history.models.common.Reference getNextValue() {
        return this.nextValue;
    }

    /**
     * builds SetSupplyChannelChange with checking for non-null required values
     * @return SetSupplyChannelChange
     */
    public SetSupplyChannelChange build() {
        Objects.requireNonNull(change, SetSupplyChannelChange.class + ": change is missing");
        Objects.requireNonNull(previousValue, SetSupplyChannelChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, SetSupplyChannelChange.class + ": nextValue is missing");
        return new SetSupplyChannelChangeImpl(change, previousValue, nextValue);
    }

    /**
     * builds SetSupplyChannelChange without checking for non-null required values
     * @return SetSupplyChannelChange
     */
    public SetSupplyChannelChange buildUnchecked() {
        return new SetSupplyChannelChangeImpl(change, previousValue, nextValue);
    }

    public static SetSupplyChannelChangeBuilder of() {
        return new SetSupplyChannelChangeBuilder();
    }

    public static SetSupplyChannelChangeBuilder of(final SetSupplyChannelChange template) {
        SetSupplyChannelChangeBuilder builder = new SetSupplyChannelChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
