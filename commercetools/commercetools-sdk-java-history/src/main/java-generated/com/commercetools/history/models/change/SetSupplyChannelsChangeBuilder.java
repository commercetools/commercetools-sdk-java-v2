
package com.commercetools.history.models.change;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetSupplyChannelsChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetSupplyChannelsChange setSupplyChannelsChange = SetSupplyChannelsChange.builder()
 *             .change("{change}")
 *             .plusPreviousValue(previousValueBuilder -> previousValueBuilder)
 *             .plusNextValue(nextValueBuilder -> nextValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SetSupplyChannelsChangeBuilder implements Builder<SetSupplyChannelsChange> {

    private String change;

    private java.util.List<com.commercetools.history.models.common.Reference> previousValue;

    private java.util.List<com.commercetools.history.models.common.Reference> nextValue;

    /**
     *  <p>Shape of the action for <code>setSupplyChannels</code></p>
     * @param change value to be set
     * @return Builder
     */

    public SetSupplyChannelsChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     * set values to the previousValue
     * @param previousValue value to be set
     * @return Builder
     */

    public SetSupplyChannelsChangeBuilder previousValue(
            final com.commercetools.history.models.common.Reference... previousValue) {
        this.previousValue = new ArrayList<>(Arrays.asList(previousValue));
        return this;
    }

    /**
     * set value to the previousValue
     * @param previousValue value to be set
     * @return Builder
     */

    public SetSupplyChannelsChangeBuilder previousValue(
            final java.util.List<com.commercetools.history.models.common.Reference> previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     * add values to the previousValue
     * @param previousValue value to be set
     * @return Builder
     */

    public SetSupplyChannelsChangeBuilder plusPreviousValue(
            final com.commercetools.history.models.common.Reference... previousValue) {
        if (this.previousValue == null) {
            this.previousValue = new ArrayList<>();
        }
        this.previousValue.addAll(Arrays.asList(previousValue));
        return this;
    }

    /**
     * add the value to the previousValue using the builder function
     * @param builder function to build the previousValue value
     * @return Builder
     */

    public SetSupplyChannelsChangeBuilder plusPreviousValue(
            Function<com.commercetools.history.models.common.ReferenceBuilder, com.commercetools.history.models.common.ReferenceBuilder> builder) {
        if (this.previousValue == null) {
            this.previousValue = new ArrayList<>();
        }
        this.previousValue.add(builder.apply(com.commercetools.history.models.common.ReferenceBuilder.of()).build());
        return this;
    }

    /**
     * set the value to the previousValue using the builder function
     * @param builder function to build the previousValue value
     * @return Builder
     */

    public SetSupplyChannelsChangeBuilder withPreviousValue(
            Function<com.commercetools.history.models.common.ReferenceBuilder, com.commercetools.history.models.common.ReferenceBuilder> builder) {
        this.previousValue = new ArrayList<>();
        this.previousValue.add(builder.apply(com.commercetools.history.models.common.ReferenceBuilder.of()).build());
        return this;
    }

    /**
     * set values to the nextValue
     * @param nextValue value to be set
     * @return Builder
     */

    public SetSupplyChannelsChangeBuilder nextValue(
            final com.commercetools.history.models.common.Reference... nextValue) {
        this.nextValue = new ArrayList<>(Arrays.asList(nextValue));
        return this;
    }

    /**
     * set value to the nextValue
     * @param nextValue value to be set
     * @return Builder
     */

    public SetSupplyChannelsChangeBuilder nextValue(
            final java.util.List<com.commercetools.history.models.common.Reference> nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    /**
     * add values to the nextValue
     * @param nextValue value to be set
     * @return Builder
     */

    public SetSupplyChannelsChangeBuilder plusNextValue(
            final com.commercetools.history.models.common.Reference... nextValue) {
        if (this.nextValue == null) {
            this.nextValue = new ArrayList<>();
        }
        this.nextValue.addAll(Arrays.asList(nextValue));
        return this;
    }

    /**
     * add the value to the nextValue using the builder function
     * @param builder function to build the nextValue value
     * @return Builder
     */

    public SetSupplyChannelsChangeBuilder plusNextValue(
            Function<com.commercetools.history.models.common.ReferenceBuilder, com.commercetools.history.models.common.ReferenceBuilder> builder) {
        if (this.nextValue == null) {
            this.nextValue = new ArrayList<>();
        }
        this.nextValue.add(builder.apply(com.commercetools.history.models.common.ReferenceBuilder.of()).build());
        return this;
    }

    /**
     * set the value to the nextValue using the builder function
     * @param builder function to build the nextValue value
     * @return Builder
     */

    public SetSupplyChannelsChangeBuilder withNextValue(
            Function<com.commercetools.history.models.common.ReferenceBuilder, com.commercetools.history.models.common.ReferenceBuilder> builder) {
        this.nextValue = new ArrayList<>();
        this.nextValue.add(builder.apply(com.commercetools.history.models.common.ReferenceBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Shape of the action for <code>setSupplyChannels</code></p>
     * @return change
     */

    public String getChange() {
        return this.change;
    }

    /**
     * value of previousValue}
     * @return previousValue
     */

    public java.util.List<com.commercetools.history.models.common.Reference> getPreviousValue() {
        return this.previousValue;
    }

    /**
     * value of nextValue}
     * @return nextValue
     */

    public java.util.List<com.commercetools.history.models.common.Reference> getNextValue() {
        return this.nextValue;
    }

    /**
     * builds SetSupplyChannelsChange with checking for non-null required values
     * @return SetSupplyChannelsChange
     */
    public SetSupplyChannelsChange build() {
        Objects.requireNonNull(change, SetSupplyChannelsChange.class + ": change is missing");
        Objects.requireNonNull(previousValue, SetSupplyChannelsChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, SetSupplyChannelsChange.class + ": nextValue is missing");
        return new SetSupplyChannelsChangeImpl(change, previousValue, nextValue);
    }

    /**
     * builds SetSupplyChannelsChange without checking for non-null required values
     * @return SetSupplyChannelsChange
     */
    public SetSupplyChannelsChange buildUnchecked() {
        return new SetSupplyChannelsChangeImpl(change, previousValue, nextValue);
    }

    /**
     * factory method for an instance of SetSupplyChannelsChangeBuilder
     * @return builder
     */
    public static SetSupplyChannelsChangeBuilder of() {
        return new SetSupplyChannelsChangeBuilder();
    }

    /**
     * create builder for SetSupplyChannelsChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetSupplyChannelsChangeBuilder of(final SetSupplyChannelsChange template) {
        SetSupplyChannelsChangeBuilder builder = new SetSupplyChannelsChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
