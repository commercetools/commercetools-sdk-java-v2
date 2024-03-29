
package com.commercetools.history.models.change;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ChangeAssetOrderChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ChangeAssetOrderChange changeAssetOrderChange = ChangeAssetOrderChange.builder()
 *             .change("{change}")
 *             .plusPreviousValue(previousValueBuilder -> previousValueBuilder)
 *             .plusNextValue(nextValueBuilder -> nextValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ChangeAssetOrderChangeBuilder implements Builder<ChangeAssetOrderChange> {

    private String change;

    private java.util.List<com.commercetools.history.models.common.LocalizedString> previousValue;

    private java.util.List<com.commercetools.history.models.common.LocalizedString> nextValue;

    /**
     * set the value to the change
     * @param change value to be set
     * @return Builder
     */

    public ChangeAssetOrderChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     * @return Builder
     */

    public ChangeAssetOrderChangeBuilder previousValue(
            final com.commercetools.history.models.common.LocalizedString... previousValue) {
        this.previousValue = new ArrayList<>(Arrays.asList(previousValue));
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     * @return Builder
     */

    public ChangeAssetOrderChangeBuilder previousValue(
            final java.util.List<com.commercetools.history.models.common.LocalizedString> previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     * @return Builder
     */

    public ChangeAssetOrderChangeBuilder plusPreviousValue(
            final com.commercetools.history.models.common.LocalizedString... previousValue) {
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

    public ChangeAssetOrderChangeBuilder plusPreviousValue(
            Function<com.commercetools.history.models.common.LocalizedStringBuilder, com.commercetools.history.models.common.LocalizedStringBuilder> builder) {
        if (this.previousValue == null) {
            this.previousValue = new ArrayList<>();
        }
        this.previousValue
                .add(builder.apply(com.commercetools.history.models.common.LocalizedStringBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param builder function to build the previousValue value
     * @return Builder
     */

    public ChangeAssetOrderChangeBuilder withPreviousValue(
            Function<com.commercetools.history.models.common.LocalizedStringBuilder, com.commercetools.history.models.common.LocalizedStringBuilder> builder) {
        this.previousValue = new ArrayList<>();
        this.previousValue
                .add(builder.apply(com.commercetools.history.models.common.LocalizedStringBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param builder function to build the previousValue value
     * @return Builder
     */

    public ChangeAssetOrderChangeBuilder addPreviousValue(
            Function<com.commercetools.history.models.common.LocalizedStringBuilder, com.commercetools.history.models.common.LocalizedString> builder) {
        return plusPreviousValue(builder.apply(com.commercetools.history.models.common.LocalizedStringBuilder.of()));
    }

    /**
     *  <p>Value before the change.</p>
     * @param builder function to build the previousValue value
     * @return Builder
     */

    public ChangeAssetOrderChangeBuilder setPreviousValue(
            Function<com.commercetools.history.models.common.LocalizedStringBuilder, com.commercetools.history.models.common.LocalizedString> builder) {
        return previousValue(builder.apply(com.commercetools.history.models.common.LocalizedStringBuilder.of()));
    }

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     * @return Builder
     */

    public ChangeAssetOrderChangeBuilder nextValue(
            final com.commercetools.history.models.common.LocalizedString... nextValue) {
        this.nextValue = new ArrayList<>(Arrays.asList(nextValue));
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     * @return Builder
     */

    public ChangeAssetOrderChangeBuilder nextValue(
            final java.util.List<com.commercetools.history.models.common.LocalizedString> nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     * @return Builder
     */

    public ChangeAssetOrderChangeBuilder plusNextValue(
            final com.commercetools.history.models.common.LocalizedString... nextValue) {
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

    public ChangeAssetOrderChangeBuilder plusNextValue(
            Function<com.commercetools.history.models.common.LocalizedStringBuilder, com.commercetools.history.models.common.LocalizedStringBuilder> builder) {
        if (this.nextValue == null) {
            this.nextValue = new ArrayList<>();
        }
        this.nextValue.add(builder.apply(com.commercetools.history.models.common.LocalizedStringBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param builder function to build the nextValue value
     * @return Builder
     */

    public ChangeAssetOrderChangeBuilder withNextValue(
            Function<com.commercetools.history.models.common.LocalizedStringBuilder, com.commercetools.history.models.common.LocalizedStringBuilder> builder) {
        this.nextValue = new ArrayList<>();
        this.nextValue.add(builder.apply(com.commercetools.history.models.common.LocalizedStringBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param builder function to build the nextValue value
     * @return Builder
     */

    public ChangeAssetOrderChangeBuilder addNextValue(
            Function<com.commercetools.history.models.common.LocalizedStringBuilder, com.commercetools.history.models.common.LocalizedString> builder) {
        return plusNextValue(builder.apply(com.commercetools.history.models.common.LocalizedStringBuilder.of()));
    }

    /**
     *  <p>Value after the change.</p>
     * @param builder function to build the nextValue value
     * @return Builder
     */

    public ChangeAssetOrderChangeBuilder setNextValue(
            Function<com.commercetools.history.models.common.LocalizedStringBuilder, com.commercetools.history.models.common.LocalizedString> builder) {
        return nextValue(builder.apply(com.commercetools.history.models.common.LocalizedStringBuilder.of()));
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

    public java.util.List<com.commercetools.history.models.common.LocalizedString> getPreviousValue() {
        return this.previousValue;
    }

    /**
     *  <p>Value after the change.</p>
     * @return nextValue
     */

    public java.util.List<com.commercetools.history.models.common.LocalizedString> getNextValue() {
        return this.nextValue;
    }

    /**
     * builds ChangeAssetOrderChange with checking for non-null required values
     * @return ChangeAssetOrderChange
     */
    public ChangeAssetOrderChange build() {
        Objects.requireNonNull(change, ChangeAssetOrderChange.class + ": change is missing");
        Objects.requireNonNull(previousValue, ChangeAssetOrderChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, ChangeAssetOrderChange.class + ": nextValue is missing");
        return new ChangeAssetOrderChangeImpl(change, previousValue, nextValue);
    }

    /**
     * builds ChangeAssetOrderChange without checking for non-null required values
     * @return ChangeAssetOrderChange
     */
    public ChangeAssetOrderChange buildUnchecked() {
        return new ChangeAssetOrderChangeImpl(change, previousValue, nextValue);
    }

    /**
     * factory method for an instance of ChangeAssetOrderChangeBuilder
     * @return builder
     */
    public static ChangeAssetOrderChangeBuilder of() {
        return new ChangeAssetOrderChangeBuilder();
    }

    /**
     * create builder for ChangeAssetOrderChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ChangeAssetOrderChangeBuilder of(final ChangeAssetOrderChange template) {
        ChangeAssetOrderChangeBuilder builder = new ChangeAssetOrderChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
