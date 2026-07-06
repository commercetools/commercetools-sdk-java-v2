
package com.commercetools.history.models.change;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetAssociatesChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetAssociatesChange setAssociatesChange = SetAssociatesChange.builder()
 *             .change("{change}")
 *             .plusAddedItems(addedItemsBuilder -> addedItemsBuilder)
 *             .plusRemovedItems(removedItemsBuilder -> removedItemsBuilder)
 *             .plusPreviousValue(previousValueBuilder -> previousValueBuilder)
 *             .plusNextValue(nextValueBuilder -> nextValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SetAssociatesChangeBuilder implements Builder<SetAssociatesChange> {

    private String change;

    private java.util.List<com.commercetools.history.models.common.Associate> addedItems;

    private java.util.List<com.commercetools.history.models.common.Associate> removedItems;

    private java.util.List<com.commercetools.history.models.common.Associate> previousValue;

    private java.util.List<com.commercetools.history.models.common.Associate> nextValue;

    /**
     * set the value to the change
     * @param change value to be set
     * @return Builder
     */

    public SetAssociatesChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     *  <p>Elements added to the array.</p>
     * @param addedItems value to be set
     * @return Builder
     */

    public SetAssociatesChangeBuilder addedItems(
            final com.commercetools.history.models.common.Associate... addedItems) {
        this.addedItems = new ArrayList<>(Arrays.asList(addedItems));
        return this;
    }

    /**
     *  <p>Elements added to the array.</p>
     * @param addedItems value to be set
     * @return Builder
     */

    public SetAssociatesChangeBuilder addedItems(
            final java.util.List<com.commercetools.history.models.common.Associate> addedItems) {
        this.addedItems = addedItems;
        return this;
    }

    /**
     *  <p>Elements added to the array.</p>
     * @param addedItems value to be set
     * @return Builder
     */

    public SetAssociatesChangeBuilder plusAddedItems(
            final com.commercetools.history.models.common.Associate... addedItems) {
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

    public SetAssociatesChangeBuilder plusAddedItems(
            Function<com.commercetools.history.models.common.AssociateBuilder, com.commercetools.history.models.common.AssociateBuilder> builder) {
        if (this.addedItems == null) {
            this.addedItems = new ArrayList<>();
        }
        this.addedItems.add(builder.apply(com.commercetools.history.models.common.AssociateBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Elements added to the array.</p>
     * @param builder function to build the addedItems value
     * @return Builder
     */

    public SetAssociatesChangeBuilder withAddedItems(
            Function<com.commercetools.history.models.common.AssociateBuilder, com.commercetools.history.models.common.AssociateBuilder> builder) {
        this.addedItems = new ArrayList<>();
        this.addedItems.add(builder.apply(com.commercetools.history.models.common.AssociateBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Elements added to the array.</p>
     * @param builder function to build the addedItems value
     * @return Builder
     */

    public SetAssociatesChangeBuilder addAddedItems(
            Function<com.commercetools.history.models.common.AssociateBuilder, com.commercetools.history.models.common.Associate> builder) {
        return plusAddedItems(builder.apply(com.commercetools.history.models.common.AssociateBuilder.of()));
    }

    /**
     *  <p>Elements added to the array.</p>
     * @param builder function to build the addedItems value
     * @return Builder
     */

    public SetAssociatesChangeBuilder setAddedItems(
            Function<com.commercetools.history.models.common.AssociateBuilder, com.commercetools.history.models.common.Associate> builder) {
        return addedItems(builder.apply(com.commercetools.history.models.common.AssociateBuilder.of()));
    }

    /**
     *  <p>Elements removed from the array.</p>
     * @param removedItems value to be set
     * @return Builder
     */

    public SetAssociatesChangeBuilder removedItems(
            final com.commercetools.history.models.common.Associate... removedItems) {
        this.removedItems = new ArrayList<>(Arrays.asList(removedItems));
        return this;
    }

    /**
     *  <p>Elements removed from the array.</p>
     * @param removedItems value to be set
     * @return Builder
     */

    public SetAssociatesChangeBuilder removedItems(
            final java.util.List<com.commercetools.history.models.common.Associate> removedItems) {
        this.removedItems = removedItems;
        return this;
    }

    /**
     *  <p>Elements removed from the array.</p>
     * @param removedItems value to be set
     * @return Builder
     */

    public SetAssociatesChangeBuilder plusRemovedItems(
            final com.commercetools.history.models.common.Associate... removedItems) {
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

    public SetAssociatesChangeBuilder plusRemovedItems(
            Function<com.commercetools.history.models.common.AssociateBuilder, com.commercetools.history.models.common.AssociateBuilder> builder) {
        if (this.removedItems == null) {
            this.removedItems = new ArrayList<>();
        }
        this.removedItems.add(builder.apply(com.commercetools.history.models.common.AssociateBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Elements removed from the array.</p>
     * @param builder function to build the removedItems value
     * @return Builder
     */

    public SetAssociatesChangeBuilder withRemovedItems(
            Function<com.commercetools.history.models.common.AssociateBuilder, com.commercetools.history.models.common.AssociateBuilder> builder) {
        this.removedItems = new ArrayList<>();
        this.removedItems.add(builder.apply(com.commercetools.history.models.common.AssociateBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Elements removed from the array.</p>
     * @param builder function to build the removedItems value
     * @return Builder
     */

    public SetAssociatesChangeBuilder addRemovedItems(
            Function<com.commercetools.history.models.common.AssociateBuilder, com.commercetools.history.models.common.Associate> builder) {
        return plusRemovedItems(builder.apply(com.commercetools.history.models.common.AssociateBuilder.of()));
    }

    /**
     *  <p>Elements removed from the array.</p>
     * @param builder function to build the removedItems value
     * @return Builder
     */

    public SetAssociatesChangeBuilder setRemovedItems(
            Function<com.commercetools.history.models.common.AssociateBuilder, com.commercetools.history.models.common.Associate> builder) {
        return removedItems(builder.apply(com.commercetools.history.models.common.AssociateBuilder.of()));
    }

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     * @return Builder
     */

    public SetAssociatesChangeBuilder previousValue(
            final com.commercetools.history.models.common.Associate... previousValue) {
        this.previousValue = new ArrayList<>(Arrays.asList(previousValue));
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     * @return Builder
     */

    public SetAssociatesChangeBuilder previousValue(
            final java.util.List<com.commercetools.history.models.common.Associate> previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     * @return Builder
     */

    public SetAssociatesChangeBuilder plusPreviousValue(
            final com.commercetools.history.models.common.Associate... previousValue) {
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

    public SetAssociatesChangeBuilder plusPreviousValue(
            Function<com.commercetools.history.models.common.AssociateBuilder, com.commercetools.history.models.common.AssociateBuilder> builder) {
        if (this.previousValue == null) {
            this.previousValue = new ArrayList<>();
        }
        this.previousValue.add(builder.apply(com.commercetools.history.models.common.AssociateBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param builder function to build the previousValue value
     * @return Builder
     */

    public SetAssociatesChangeBuilder withPreviousValue(
            Function<com.commercetools.history.models.common.AssociateBuilder, com.commercetools.history.models.common.AssociateBuilder> builder) {
        this.previousValue = new ArrayList<>();
        this.previousValue.add(builder.apply(com.commercetools.history.models.common.AssociateBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param builder function to build the previousValue value
     * @return Builder
     */

    public SetAssociatesChangeBuilder addPreviousValue(
            Function<com.commercetools.history.models.common.AssociateBuilder, com.commercetools.history.models.common.Associate> builder) {
        return plusPreviousValue(builder.apply(com.commercetools.history.models.common.AssociateBuilder.of()));
    }

    /**
     *  <p>Value before the change.</p>
     * @param builder function to build the previousValue value
     * @return Builder
     */

    public SetAssociatesChangeBuilder setPreviousValue(
            Function<com.commercetools.history.models.common.AssociateBuilder, com.commercetools.history.models.common.Associate> builder) {
        return previousValue(builder.apply(com.commercetools.history.models.common.AssociateBuilder.of()));
    }

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     * @return Builder
     */

    public SetAssociatesChangeBuilder nextValue(final com.commercetools.history.models.common.Associate... nextValue) {
        this.nextValue = new ArrayList<>(Arrays.asList(nextValue));
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     * @return Builder
     */

    public SetAssociatesChangeBuilder nextValue(
            final java.util.List<com.commercetools.history.models.common.Associate> nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     * @return Builder
     */

    public SetAssociatesChangeBuilder plusNextValue(
            final com.commercetools.history.models.common.Associate... nextValue) {
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

    public SetAssociatesChangeBuilder plusNextValue(
            Function<com.commercetools.history.models.common.AssociateBuilder, com.commercetools.history.models.common.AssociateBuilder> builder) {
        if (this.nextValue == null) {
            this.nextValue = new ArrayList<>();
        }
        this.nextValue.add(builder.apply(com.commercetools.history.models.common.AssociateBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param builder function to build the nextValue value
     * @return Builder
     */

    public SetAssociatesChangeBuilder withNextValue(
            Function<com.commercetools.history.models.common.AssociateBuilder, com.commercetools.history.models.common.AssociateBuilder> builder) {
        this.nextValue = new ArrayList<>();
        this.nextValue.add(builder.apply(com.commercetools.history.models.common.AssociateBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param builder function to build the nextValue value
     * @return Builder
     */

    public SetAssociatesChangeBuilder addNextValue(
            Function<com.commercetools.history.models.common.AssociateBuilder, com.commercetools.history.models.common.Associate> builder) {
        return plusNextValue(builder.apply(com.commercetools.history.models.common.AssociateBuilder.of()));
    }

    /**
     *  <p>Value after the change.</p>
     * @param builder function to build the nextValue value
     * @return Builder
     */

    public SetAssociatesChangeBuilder setNextValue(
            Function<com.commercetools.history.models.common.AssociateBuilder, com.commercetools.history.models.common.Associate> builder) {
        return nextValue(builder.apply(com.commercetools.history.models.common.AssociateBuilder.of()));
    }

    /**
     * value of change}
     * @return change
     */

    public String getChange() {
        return this.change;
    }

    /**
     *  <p>Elements added to the array.</p>
     * @return addedItems
     */

    public java.util.List<com.commercetools.history.models.common.Associate> getAddedItems() {
        return this.addedItems;
    }

    /**
     *  <p>Elements removed from the array.</p>
     * @return removedItems
     */

    public java.util.List<com.commercetools.history.models.common.Associate> getRemovedItems() {
        return this.removedItems;
    }

    /**
     *  <p>Value before the change.</p>
     * @return previousValue
     */

    public java.util.List<com.commercetools.history.models.common.Associate> getPreviousValue() {
        return this.previousValue;
    }

    /**
     *  <p>Value after the change.</p>
     * @return nextValue
     */

    public java.util.List<com.commercetools.history.models.common.Associate> getNextValue() {
        return this.nextValue;
    }

    /**
     * builds SetAssociatesChange with checking for non-null required values
     * @return SetAssociatesChange
     */
    public SetAssociatesChange build() {
        Objects.requireNonNull(change, SetAssociatesChange.class + ": change is missing");
        Objects.requireNonNull(addedItems, SetAssociatesChange.class + ": addedItems is missing");
        Objects.requireNonNull(removedItems, SetAssociatesChange.class + ": removedItems is missing");
        Objects.requireNonNull(previousValue, SetAssociatesChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, SetAssociatesChange.class + ": nextValue is missing");
        return new SetAssociatesChangeImpl(change, addedItems, removedItems, previousValue, nextValue);
    }

    /**
     * builds SetAssociatesChange without checking for non-null required values
     * @return SetAssociatesChange
     */
    public SetAssociatesChange buildUnchecked() {
        return new SetAssociatesChangeImpl(change, addedItems, removedItems, previousValue, nextValue);
    }

    /**
     * factory method for an instance of SetAssociatesChangeBuilder
     * @return builder
     */
    public static SetAssociatesChangeBuilder of() {
        return new SetAssociatesChangeBuilder();
    }

    /**
     * create builder for SetAssociatesChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetAssociatesChangeBuilder of(final SetAssociatesChange template) {
        SetAssociatesChangeBuilder builder = new SetAssociatesChangeBuilder();
        builder.change = template.getChange();
        builder.addedItems = template.getAddedItems();
        builder.removedItems = template.getRemovedItems();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
