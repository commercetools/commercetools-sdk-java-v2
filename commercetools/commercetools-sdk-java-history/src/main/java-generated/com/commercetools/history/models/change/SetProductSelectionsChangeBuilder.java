
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
 *             .plusAddedItems(addedItemsBuilder -> addedItemsBuilder)
 *             .plusRemovedItems(removedItemsBuilder -> removedItemsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SetProductSelectionsChangeBuilder implements Builder<SetProductSelectionsChange> {

    private String change;

    private java.util.List<com.commercetools.history.models.common.ProductSelectionSetting> previousValue;

    private java.util.List<com.commercetools.history.models.common.ProductSelectionSetting> nextValue;

    private java.util.List<com.commercetools.history.models.common.ProductSelectionSetting> addedItems;

    private java.util.List<com.commercetools.history.models.common.ProductSelectionSetting> removedItems;

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
     *  <p>Elements added to the array.</p>
     * @param addedItems value to be set
     * @return Builder
     */

    public SetProductSelectionsChangeBuilder addedItems(
            final com.commercetools.history.models.common.ProductSelectionSetting... addedItems) {
        this.addedItems = new ArrayList<>(Arrays.asList(addedItems));
        return this;
    }

    /**
     *  <p>Elements added to the array.</p>
     * @param addedItems value to be set
     * @return Builder
     */

    public SetProductSelectionsChangeBuilder addedItems(
            final java.util.List<com.commercetools.history.models.common.ProductSelectionSetting> addedItems) {
        this.addedItems = addedItems;
        return this;
    }

    /**
     *  <p>Elements added to the array.</p>
     * @param addedItems value to be set
     * @return Builder
     */

    public SetProductSelectionsChangeBuilder plusAddedItems(
            final com.commercetools.history.models.common.ProductSelectionSetting... addedItems) {
        if (this.addedItems == null) {
            this.addedItems = new ArrayList<>();
        }
        this.addedItems.addAll(Arrays.asList(addedItems));
        return this;
    }

    /**
     *  <p>Elements added to the array.</p>
     * @param builder function to build the addedItems value
     * @return Builder
     */

    public SetProductSelectionsChangeBuilder plusAddedItems(
            Function<com.commercetools.history.models.common.ProductSelectionSettingBuilder, com.commercetools.history.models.common.ProductSelectionSettingBuilder> builder) {
        if (this.addedItems == null) {
            this.addedItems = new ArrayList<>();
        }
        this.addedItems.add(
            builder.apply(com.commercetools.history.models.common.ProductSelectionSettingBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Elements added to the array.</p>
     * @param builder function to build the addedItems value
     * @return Builder
     */

    public SetProductSelectionsChangeBuilder withAddedItems(
            Function<com.commercetools.history.models.common.ProductSelectionSettingBuilder, com.commercetools.history.models.common.ProductSelectionSettingBuilder> builder) {
        this.addedItems = new ArrayList<>();
        this.addedItems.add(
            builder.apply(com.commercetools.history.models.common.ProductSelectionSettingBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Elements added to the array.</p>
     * @param builder function to build the addedItems value
     * @return Builder
     */

    public SetProductSelectionsChangeBuilder addAddedItems(
            Function<com.commercetools.history.models.common.ProductSelectionSettingBuilder, com.commercetools.history.models.common.ProductSelectionSetting> builder) {
        return plusAddedItems(
            builder.apply(com.commercetools.history.models.common.ProductSelectionSettingBuilder.of()));
    }

    /**
     *  <p>Elements added to the array.</p>
     * @param builder function to build the addedItems value
     * @return Builder
     */

    public SetProductSelectionsChangeBuilder setAddedItems(
            Function<com.commercetools.history.models.common.ProductSelectionSettingBuilder, com.commercetools.history.models.common.ProductSelectionSetting> builder) {
        return addedItems(builder.apply(com.commercetools.history.models.common.ProductSelectionSettingBuilder.of()));
    }

    /**
     *  <p>Elements removed from the array.</p>
     * @param removedItems value to be set
     * @return Builder
     */

    public SetProductSelectionsChangeBuilder removedItems(
            final com.commercetools.history.models.common.ProductSelectionSetting... removedItems) {
        this.removedItems = new ArrayList<>(Arrays.asList(removedItems));
        return this;
    }

    /**
     *  <p>Elements removed from the array.</p>
     * @param removedItems value to be set
     * @return Builder
     */

    public SetProductSelectionsChangeBuilder removedItems(
            final java.util.List<com.commercetools.history.models.common.ProductSelectionSetting> removedItems) {
        this.removedItems = removedItems;
        return this;
    }

    /**
     *  <p>Elements removed from the array.</p>
     * @param removedItems value to be set
     * @return Builder
     */

    public SetProductSelectionsChangeBuilder plusRemovedItems(
            final com.commercetools.history.models.common.ProductSelectionSetting... removedItems) {
        if (this.removedItems == null) {
            this.removedItems = new ArrayList<>();
        }
        this.removedItems.addAll(Arrays.asList(removedItems));
        return this;
    }

    /**
     *  <p>Elements removed from the array.</p>
     * @param builder function to build the removedItems value
     * @return Builder
     */

    public SetProductSelectionsChangeBuilder plusRemovedItems(
            Function<com.commercetools.history.models.common.ProductSelectionSettingBuilder, com.commercetools.history.models.common.ProductSelectionSettingBuilder> builder) {
        if (this.removedItems == null) {
            this.removedItems = new ArrayList<>();
        }
        this.removedItems.add(
            builder.apply(com.commercetools.history.models.common.ProductSelectionSettingBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Elements removed from the array.</p>
     * @param builder function to build the removedItems value
     * @return Builder
     */

    public SetProductSelectionsChangeBuilder withRemovedItems(
            Function<com.commercetools.history.models.common.ProductSelectionSettingBuilder, com.commercetools.history.models.common.ProductSelectionSettingBuilder> builder) {
        this.removedItems = new ArrayList<>();
        this.removedItems.add(
            builder.apply(com.commercetools.history.models.common.ProductSelectionSettingBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Elements removed from the array.</p>
     * @param builder function to build the removedItems value
     * @return Builder
     */

    public SetProductSelectionsChangeBuilder addRemovedItems(
            Function<com.commercetools.history.models.common.ProductSelectionSettingBuilder, com.commercetools.history.models.common.ProductSelectionSetting> builder) {
        return plusRemovedItems(
            builder.apply(com.commercetools.history.models.common.ProductSelectionSettingBuilder.of()));
    }

    /**
     *  <p>Elements removed from the array.</p>
     * @param builder function to build the removedItems value
     * @return Builder
     */

    public SetProductSelectionsChangeBuilder setRemovedItems(
            Function<com.commercetools.history.models.common.ProductSelectionSettingBuilder, com.commercetools.history.models.common.ProductSelectionSetting> builder) {
        return removedItems(builder.apply(com.commercetools.history.models.common.ProductSelectionSettingBuilder.of()));
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
     *  <p>Elements added to the array.</p>
     * @return addedItems
     */

    public java.util.List<com.commercetools.history.models.common.ProductSelectionSetting> getAddedItems() {
        return this.addedItems;
    }

    /**
     *  <p>Elements removed from the array.</p>
     * @return removedItems
     */

    public java.util.List<com.commercetools.history.models.common.ProductSelectionSetting> getRemovedItems() {
        return this.removedItems;
    }

    /**
     * builds SetProductSelectionsChange with checking for non-null required values
     * @return SetProductSelectionsChange
     */
    public SetProductSelectionsChange build() {
        Objects.requireNonNull(change, SetProductSelectionsChange.class + ": change is missing");
        Objects.requireNonNull(previousValue, SetProductSelectionsChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, SetProductSelectionsChange.class + ": nextValue is missing");
        Objects.requireNonNull(addedItems, SetProductSelectionsChange.class + ": addedItems is missing");
        Objects.requireNonNull(removedItems, SetProductSelectionsChange.class + ": removedItems is missing");
        return new SetProductSelectionsChangeImpl(change, previousValue, nextValue, addedItems, removedItems);
    }

    /**
     * builds SetProductSelectionsChange without checking for non-null required values
     * @return SetProductSelectionsChange
     */
    public SetProductSelectionsChange buildUnchecked() {
        return new SetProductSelectionsChangeImpl(change, previousValue, nextValue, addedItems, removedItems);
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
        builder.addedItems = template.getAddedItems();
        builder.removedItems = template.getRemovedItems();
        return builder;
    }

}
