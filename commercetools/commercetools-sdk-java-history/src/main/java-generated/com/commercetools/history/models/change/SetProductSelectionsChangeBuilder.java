
package com.commercetools.history.models.change;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetProductSelectionsChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetProductSelectionsChange setProductSelectionsChange = SetProductSelectionsChange.builder()
 *             .change("{change}")
 *             .plusPreviousValue(previousValueBuilder -> previousValueBuilder)
 *             .plusNextValue(nextValueBuilder -> nextValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SetProductSelectionsChangeBuilder implements Builder<SetProductSelectionsChange> {

    private String change;

    private java.util.List<com.commercetools.history.models.common.ProductSelectionSetting> previousValue;

    private java.util.List<com.commercetools.history.models.common.ProductSelectionSetting> nextValue;

    /**
     * set the value to the change
     * @param change value to be set
     * @return Builder
     */

    public SetProductSelectionsChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     * @return Builder
     */

    public SetProductSelectionsChangeBuilder previousValue(
            final com.commercetools.history.models.common.ProductSelectionSetting... previousValue) {
        this.previousValue = new ArrayList<>(Arrays.asList(previousValue));
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     * @return Builder
     */

    public SetProductSelectionsChangeBuilder previousValue(
            final java.util.List<com.commercetools.history.models.common.ProductSelectionSetting> previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     * @return Builder
     */

    public SetProductSelectionsChangeBuilder plusPreviousValue(
            final com.commercetools.history.models.common.ProductSelectionSetting... previousValue) {
        if (this.previousValue == null) {
            this.previousValue = new ArrayList<>();
        }
        this.previousValue.addAll(Arrays.asList(previousValue));
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param builder function to build the previousValue value
     * @return Builder
     */

    public SetProductSelectionsChangeBuilder plusPreviousValue(
            Function<com.commercetools.history.models.common.ProductSelectionSettingBuilder, com.commercetools.history.models.common.ProductSelectionSettingBuilder> builder) {
        if (this.previousValue == null) {
            this.previousValue = new ArrayList<>();
        }
        this.previousValue.add(
            builder.apply(com.commercetools.history.models.common.ProductSelectionSettingBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param builder function to build the previousValue value
     * @return Builder
     */

    public SetProductSelectionsChangeBuilder withPreviousValue(
            Function<com.commercetools.history.models.common.ProductSelectionSettingBuilder, com.commercetools.history.models.common.ProductSelectionSettingBuilder> builder) {
        this.previousValue = new ArrayList<>();
        this.previousValue.add(
            builder.apply(com.commercetools.history.models.common.ProductSelectionSettingBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param builder function to build the previousValue value
     * @return Builder
     */

    public SetProductSelectionsChangeBuilder addPreviousValue(
            Function<com.commercetools.history.models.common.ProductSelectionSettingBuilder, com.commercetools.history.models.common.ProductSelectionSetting> builder) {
        return plusPreviousValue(
            builder.apply(com.commercetools.history.models.common.ProductSelectionSettingBuilder.of()));
    }

    /**
     *  <p>Value before the change.</p>
     * @param builder function to build the previousValue value
     * @return Builder
     */

    public SetProductSelectionsChangeBuilder setPreviousValue(
            Function<com.commercetools.history.models.common.ProductSelectionSettingBuilder, com.commercetools.history.models.common.ProductSelectionSetting> builder) {
        return previousValue(
            builder.apply(com.commercetools.history.models.common.ProductSelectionSettingBuilder.of()));
    }

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     * @return Builder
     */

    public SetProductSelectionsChangeBuilder nextValue(
            final com.commercetools.history.models.common.ProductSelectionSetting... nextValue) {
        this.nextValue = new ArrayList<>(Arrays.asList(nextValue));
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     * @return Builder
     */

    public SetProductSelectionsChangeBuilder nextValue(
            final java.util.List<com.commercetools.history.models.common.ProductSelectionSetting> nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     * @return Builder
     */

    public SetProductSelectionsChangeBuilder plusNextValue(
            final com.commercetools.history.models.common.ProductSelectionSetting... nextValue) {
        if (this.nextValue == null) {
            this.nextValue = new ArrayList<>();
        }
        this.nextValue.addAll(Arrays.asList(nextValue));
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param builder function to build the nextValue value
     * @return Builder
     */

    public SetProductSelectionsChangeBuilder plusNextValue(
            Function<com.commercetools.history.models.common.ProductSelectionSettingBuilder, com.commercetools.history.models.common.ProductSelectionSettingBuilder> builder) {
        if (this.nextValue == null) {
            this.nextValue = new ArrayList<>();
        }
        this.nextValue.add(
            builder.apply(com.commercetools.history.models.common.ProductSelectionSettingBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param builder function to build the nextValue value
     * @return Builder
     */

    public SetProductSelectionsChangeBuilder withNextValue(
            Function<com.commercetools.history.models.common.ProductSelectionSettingBuilder, com.commercetools.history.models.common.ProductSelectionSettingBuilder> builder) {
        this.nextValue = new ArrayList<>();
        this.nextValue.add(
            builder.apply(com.commercetools.history.models.common.ProductSelectionSettingBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param builder function to build the nextValue value
     * @return Builder
     */

    public SetProductSelectionsChangeBuilder addNextValue(
            Function<com.commercetools.history.models.common.ProductSelectionSettingBuilder, com.commercetools.history.models.common.ProductSelectionSetting> builder) {
        return plusNextValue(
            builder.apply(com.commercetools.history.models.common.ProductSelectionSettingBuilder.of()));
    }

    /**
     *  <p>Value after the change.</p>
     * @param builder function to build the nextValue value
     * @return Builder
     */

    public SetProductSelectionsChangeBuilder setNextValue(
            Function<com.commercetools.history.models.common.ProductSelectionSettingBuilder, com.commercetools.history.models.common.ProductSelectionSetting> builder) {
        return nextValue(builder.apply(com.commercetools.history.models.common.ProductSelectionSettingBuilder.of()));
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

    public java.util.List<com.commercetools.history.models.common.ProductSelectionSetting> getPreviousValue() {
        return this.previousValue;
    }

    /**
     *  <p>Value after the change.</p>
     * @return nextValue
     */

    public java.util.List<com.commercetools.history.models.common.ProductSelectionSetting> getNextValue() {
        return this.nextValue;
    }

    /**
     * builds SetProductSelectionsChange with checking for non-null required values
     * @return SetProductSelectionsChange
     */
    public SetProductSelectionsChange build() {
        Objects.requireNonNull(change, SetProductSelectionsChange.class + ": change is missing");
        Objects.requireNonNull(previousValue, SetProductSelectionsChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, SetProductSelectionsChange.class + ": nextValue is missing");
        return new SetProductSelectionsChangeImpl(change, previousValue, nextValue);
    }

    /**
     * builds SetProductSelectionsChange without checking for non-null required values
     * @return SetProductSelectionsChange
     */
    public SetProductSelectionsChange buildUnchecked() {
        return new SetProductSelectionsChangeImpl(change, previousValue, nextValue);
    }

    /**
     * factory method for an instance of SetProductSelectionsChangeBuilder
     * @return builder
     */
    public static SetProductSelectionsChangeBuilder of() {
        return new SetProductSelectionsChangeBuilder();
    }

    /**
     * create builder for SetProductSelectionsChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetProductSelectionsChangeBuilder of(final SetProductSelectionsChange template) {
        SetProductSelectionsChangeBuilder builder = new SetProductSelectionsChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
