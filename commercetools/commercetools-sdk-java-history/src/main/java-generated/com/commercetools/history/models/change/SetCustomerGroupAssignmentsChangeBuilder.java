
package com.commercetools.history.models.change;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetCustomerGroupAssignmentsChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetCustomerGroupAssignmentsChange setCustomerGroupAssignmentsChange = SetCustomerGroupAssignmentsChange.builder()
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
public class SetCustomerGroupAssignmentsChangeBuilder implements Builder<SetCustomerGroupAssignmentsChange> {

    private String change;

    private java.util.List<com.commercetools.history.models.common.CustomerGroupAssignment> addedItems;

    private java.util.List<com.commercetools.history.models.common.CustomerGroupAssignment> removedItems;

    private java.util.List<com.commercetools.history.models.common.CustomerGroupAssignment> previousValue;

    private java.util.List<com.commercetools.history.models.common.CustomerGroupAssignment> nextValue;

    /**
     * set the value to the change
     * @param change value to be set
     * @return Builder
     */

    public SetCustomerGroupAssignmentsChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     *  <p>Elements added to the array.</p>
     * @param addedItems value to be set
     * @return Builder
     */

    public SetCustomerGroupAssignmentsChangeBuilder addedItems(
            final com.commercetools.history.models.common.CustomerGroupAssignment... addedItems) {
        this.addedItems = new ArrayList<>(Arrays.asList(addedItems));
        return this;
    }

    /**
     *  <p>Elements added to the array.</p>
     * @param addedItems value to be set
     * @return Builder
     */

    public SetCustomerGroupAssignmentsChangeBuilder addedItems(
            final java.util.List<com.commercetools.history.models.common.CustomerGroupAssignment> addedItems) {
        this.addedItems = addedItems;
        return this;
    }

    /**
     *  <p>Elements added to the array.</p>
     * @param addedItems value to be set
     * @return Builder
     */

    public SetCustomerGroupAssignmentsChangeBuilder plusAddedItems(
            final com.commercetools.history.models.common.CustomerGroupAssignment... addedItems) {
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

    public SetCustomerGroupAssignmentsChangeBuilder plusAddedItems(
            Function<com.commercetools.history.models.common.CustomerGroupAssignmentBuilder, com.commercetools.history.models.common.CustomerGroupAssignmentBuilder> builder) {
        if (this.addedItems == null) {
            this.addedItems = new ArrayList<>();
        }
        this.addedItems.add(
            builder.apply(com.commercetools.history.models.common.CustomerGroupAssignmentBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Elements added to the array.</p>
     * @param builder function to build the addedItems value
     * @return Builder
     */

    public SetCustomerGroupAssignmentsChangeBuilder withAddedItems(
            Function<com.commercetools.history.models.common.CustomerGroupAssignmentBuilder, com.commercetools.history.models.common.CustomerGroupAssignmentBuilder> builder) {
        this.addedItems = new ArrayList<>();
        this.addedItems.add(
            builder.apply(com.commercetools.history.models.common.CustomerGroupAssignmentBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Elements added to the array.</p>
     * @param builder function to build the addedItems value
     * @return Builder
     */

    public SetCustomerGroupAssignmentsChangeBuilder addAddedItems(
            Function<com.commercetools.history.models.common.CustomerGroupAssignmentBuilder, com.commercetools.history.models.common.CustomerGroupAssignment> builder) {
        return plusAddedItems(
            builder.apply(com.commercetools.history.models.common.CustomerGroupAssignmentBuilder.of()));
    }

    /**
     *  <p>Elements added to the array.</p>
     * @param builder function to build the addedItems value
     * @return Builder
     */

    public SetCustomerGroupAssignmentsChangeBuilder setAddedItems(
            Function<com.commercetools.history.models.common.CustomerGroupAssignmentBuilder, com.commercetools.history.models.common.CustomerGroupAssignment> builder) {
        return addedItems(builder.apply(com.commercetools.history.models.common.CustomerGroupAssignmentBuilder.of()));
    }

    /**
     *  <p>Elements removed from the array.</p>
     * @param removedItems value to be set
     * @return Builder
     */

    public SetCustomerGroupAssignmentsChangeBuilder removedItems(
            final com.commercetools.history.models.common.CustomerGroupAssignment... removedItems) {
        this.removedItems = new ArrayList<>(Arrays.asList(removedItems));
        return this;
    }

    /**
     *  <p>Elements removed from the array.</p>
     * @param removedItems value to be set
     * @return Builder
     */

    public SetCustomerGroupAssignmentsChangeBuilder removedItems(
            final java.util.List<com.commercetools.history.models.common.CustomerGroupAssignment> removedItems) {
        this.removedItems = removedItems;
        return this;
    }

    /**
     *  <p>Elements removed from the array.</p>
     * @param removedItems value to be set
     * @return Builder
     */

    public SetCustomerGroupAssignmentsChangeBuilder plusRemovedItems(
            final com.commercetools.history.models.common.CustomerGroupAssignment... removedItems) {
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

    public SetCustomerGroupAssignmentsChangeBuilder plusRemovedItems(
            Function<com.commercetools.history.models.common.CustomerGroupAssignmentBuilder, com.commercetools.history.models.common.CustomerGroupAssignmentBuilder> builder) {
        if (this.removedItems == null) {
            this.removedItems = new ArrayList<>();
        }
        this.removedItems.add(
            builder.apply(com.commercetools.history.models.common.CustomerGroupAssignmentBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Elements removed from the array.</p>
     * @param builder function to build the removedItems value
     * @return Builder
     */

    public SetCustomerGroupAssignmentsChangeBuilder withRemovedItems(
            Function<com.commercetools.history.models.common.CustomerGroupAssignmentBuilder, com.commercetools.history.models.common.CustomerGroupAssignmentBuilder> builder) {
        this.removedItems = new ArrayList<>();
        this.removedItems.add(
            builder.apply(com.commercetools.history.models.common.CustomerGroupAssignmentBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Elements removed from the array.</p>
     * @param builder function to build the removedItems value
     * @return Builder
     */

    public SetCustomerGroupAssignmentsChangeBuilder addRemovedItems(
            Function<com.commercetools.history.models.common.CustomerGroupAssignmentBuilder, com.commercetools.history.models.common.CustomerGroupAssignment> builder) {
        return plusRemovedItems(
            builder.apply(com.commercetools.history.models.common.CustomerGroupAssignmentBuilder.of()));
    }

    /**
     *  <p>Elements removed from the array.</p>
     * @param builder function to build the removedItems value
     * @return Builder
     */

    public SetCustomerGroupAssignmentsChangeBuilder setRemovedItems(
            Function<com.commercetools.history.models.common.CustomerGroupAssignmentBuilder, com.commercetools.history.models.common.CustomerGroupAssignment> builder) {
        return removedItems(builder.apply(com.commercetools.history.models.common.CustomerGroupAssignmentBuilder.of()));
    }

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     * @return Builder
     */

    public SetCustomerGroupAssignmentsChangeBuilder previousValue(
            final com.commercetools.history.models.common.CustomerGroupAssignment... previousValue) {
        this.previousValue = new ArrayList<>(Arrays.asList(previousValue));
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     * @return Builder
     */

    public SetCustomerGroupAssignmentsChangeBuilder previousValue(
            final java.util.List<com.commercetools.history.models.common.CustomerGroupAssignment> previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     * @return Builder
     */

    public SetCustomerGroupAssignmentsChangeBuilder plusPreviousValue(
            final com.commercetools.history.models.common.CustomerGroupAssignment... previousValue) {
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

    public SetCustomerGroupAssignmentsChangeBuilder plusPreviousValue(
            Function<com.commercetools.history.models.common.CustomerGroupAssignmentBuilder, com.commercetools.history.models.common.CustomerGroupAssignmentBuilder> builder) {
        if (this.previousValue == null) {
            this.previousValue = new ArrayList<>();
        }
        this.previousValue.add(
            builder.apply(com.commercetools.history.models.common.CustomerGroupAssignmentBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param builder function to build the previousValue value
     * @return Builder
     */

    public SetCustomerGroupAssignmentsChangeBuilder withPreviousValue(
            Function<com.commercetools.history.models.common.CustomerGroupAssignmentBuilder, com.commercetools.history.models.common.CustomerGroupAssignmentBuilder> builder) {
        this.previousValue = new ArrayList<>();
        this.previousValue.add(
            builder.apply(com.commercetools.history.models.common.CustomerGroupAssignmentBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param builder function to build the previousValue value
     * @return Builder
     */

    public SetCustomerGroupAssignmentsChangeBuilder addPreviousValue(
            Function<com.commercetools.history.models.common.CustomerGroupAssignmentBuilder, com.commercetools.history.models.common.CustomerGroupAssignment> builder) {
        return plusPreviousValue(
            builder.apply(com.commercetools.history.models.common.CustomerGroupAssignmentBuilder.of()));
    }

    /**
     *  <p>Value before the change.</p>
     * @param builder function to build the previousValue value
     * @return Builder
     */

    public SetCustomerGroupAssignmentsChangeBuilder setPreviousValue(
            Function<com.commercetools.history.models.common.CustomerGroupAssignmentBuilder, com.commercetools.history.models.common.CustomerGroupAssignment> builder) {
        return previousValue(
            builder.apply(com.commercetools.history.models.common.CustomerGroupAssignmentBuilder.of()));
    }

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     * @return Builder
     */

    public SetCustomerGroupAssignmentsChangeBuilder nextValue(
            final com.commercetools.history.models.common.CustomerGroupAssignment... nextValue) {
        this.nextValue = new ArrayList<>(Arrays.asList(nextValue));
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     * @return Builder
     */

    public SetCustomerGroupAssignmentsChangeBuilder nextValue(
            final java.util.List<com.commercetools.history.models.common.CustomerGroupAssignment> nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     * @return Builder
     */

    public SetCustomerGroupAssignmentsChangeBuilder plusNextValue(
            final com.commercetools.history.models.common.CustomerGroupAssignment... nextValue) {
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

    public SetCustomerGroupAssignmentsChangeBuilder plusNextValue(
            Function<com.commercetools.history.models.common.CustomerGroupAssignmentBuilder, com.commercetools.history.models.common.CustomerGroupAssignmentBuilder> builder) {
        if (this.nextValue == null) {
            this.nextValue = new ArrayList<>();
        }
        this.nextValue.add(
            builder.apply(com.commercetools.history.models.common.CustomerGroupAssignmentBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param builder function to build the nextValue value
     * @return Builder
     */

    public SetCustomerGroupAssignmentsChangeBuilder withNextValue(
            Function<com.commercetools.history.models.common.CustomerGroupAssignmentBuilder, com.commercetools.history.models.common.CustomerGroupAssignmentBuilder> builder) {
        this.nextValue = new ArrayList<>();
        this.nextValue.add(
            builder.apply(com.commercetools.history.models.common.CustomerGroupAssignmentBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param builder function to build the nextValue value
     * @return Builder
     */

    public SetCustomerGroupAssignmentsChangeBuilder addNextValue(
            Function<com.commercetools.history.models.common.CustomerGroupAssignmentBuilder, com.commercetools.history.models.common.CustomerGroupAssignment> builder) {
        return plusNextValue(
            builder.apply(com.commercetools.history.models.common.CustomerGroupAssignmentBuilder.of()));
    }

    /**
     *  <p>Value after the change.</p>
     * @param builder function to build the nextValue value
     * @return Builder
     */

    public SetCustomerGroupAssignmentsChangeBuilder setNextValue(
            Function<com.commercetools.history.models.common.CustomerGroupAssignmentBuilder, com.commercetools.history.models.common.CustomerGroupAssignment> builder) {
        return nextValue(builder.apply(com.commercetools.history.models.common.CustomerGroupAssignmentBuilder.of()));
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

    public java.util.List<com.commercetools.history.models.common.CustomerGroupAssignment> getAddedItems() {
        return this.addedItems;
    }

    /**
     *  <p>Elements removed from the array.</p>
     * @return removedItems
     */

    public java.util.List<com.commercetools.history.models.common.CustomerGroupAssignment> getRemovedItems() {
        return this.removedItems;
    }

    /**
     *  <p>Value before the change.</p>
     * @return previousValue
     */

    public java.util.List<com.commercetools.history.models.common.CustomerGroupAssignment> getPreviousValue() {
        return this.previousValue;
    }

    /**
     *  <p>Value after the change.</p>
     * @return nextValue
     */

    public java.util.List<com.commercetools.history.models.common.CustomerGroupAssignment> getNextValue() {
        return this.nextValue;
    }

    /**
     * builds SetCustomerGroupAssignmentsChange with checking for non-null required values
     * @return SetCustomerGroupAssignmentsChange
     */
    public SetCustomerGroupAssignmentsChange build() {
        Objects.requireNonNull(change, SetCustomerGroupAssignmentsChange.class + ": change is missing");
        Objects.requireNonNull(addedItems, SetCustomerGroupAssignmentsChange.class + ": addedItems is missing");
        Objects.requireNonNull(removedItems, SetCustomerGroupAssignmentsChange.class + ": removedItems is missing");
        Objects.requireNonNull(previousValue, SetCustomerGroupAssignmentsChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, SetCustomerGroupAssignmentsChange.class + ": nextValue is missing");
        return new SetCustomerGroupAssignmentsChangeImpl(change, addedItems, removedItems, previousValue, nextValue);
    }

    /**
     * builds SetCustomerGroupAssignmentsChange without checking for non-null required values
     * @return SetCustomerGroupAssignmentsChange
     */
    public SetCustomerGroupAssignmentsChange buildUnchecked() {
        return new SetCustomerGroupAssignmentsChangeImpl(change, addedItems, removedItems, previousValue, nextValue);
    }

    /**
     * factory method for an instance of SetCustomerGroupAssignmentsChangeBuilder
     * @return builder
     */
    public static SetCustomerGroupAssignmentsChangeBuilder of() {
        return new SetCustomerGroupAssignmentsChangeBuilder();
    }

    /**
     * create builder for SetCustomerGroupAssignmentsChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetCustomerGroupAssignmentsChangeBuilder of(final SetCustomerGroupAssignmentsChange template) {
        SetCustomerGroupAssignmentsChangeBuilder builder = new SetCustomerGroupAssignmentsChangeBuilder();
        builder.change = template.getChange();
        builder.addedItems = template.getAddedItems();
        builder.removedItems = template.getRemovedItems();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
