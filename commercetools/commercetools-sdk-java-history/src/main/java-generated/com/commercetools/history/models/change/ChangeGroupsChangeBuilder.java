
package com.commercetools.history.models.change;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ChangeGroupsChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ChangeGroupsChange changeGroupsChange = ChangeGroupsChange.builder()
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
public class ChangeGroupsChangeBuilder implements Builder<ChangeGroupsChange> {

    private String change;

    private java.util.List<String> previousValue;

    private java.util.List<String> nextValue;

    private java.util.List<String> addedItems;

    private java.util.List<String> removedItems;

    /**
     * set the value to the change
     * @param change value to be set
     * @return Builder
     */

    public ChangeGroupsChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     * @return Builder
     */

    public ChangeGroupsChangeBuilder previousValue(final String... previousValue) {
        this.previousValue = new ArrayList<>(Arrays.asList(previousValue));
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     * @return Builder
     */

    public ChangeGroupsChangeBuilder previousValue(final java.util.List<String> previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     * @return Builder
     */

    public ChangeGroupsChangeBuilder plusPreviousValue(final String... previousValue) {
        if (this.previousValue == null) {
            this.previousValue = new ArrayList<>();
        }
        this.previousValue.addAll(Arrays.asList(previousValue));
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     * @return Builder
     */

    public ChangeGroupsChangeBuilder nextValue(final String... nextValue) {
        this.nextValue = new ArrayList<>(Arrays.asList(nextValue));
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     * @return Builder
     */

    public ChangeGroupsChangeBuilder nextValue(final java.util.List<String> nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     * @return Builder
     */

    public ChangeGroupsChangeBuilder plusNextValue(final String... nextValue) {
        if (this.nextValue == null) {
            this.nextValue = new ArrayList<>();
        }
        this.nextValue.addAll(Arrays.asList(nextValue));
        return this;
    }

    /**
     *  <p>Elements added to the array.</p>
     * @param addedItems value to be set
     * @return Builder
     */

    public ChangeGroupsChangeBuilder addedItems(final String... addedItems) {
        this.addedItems = new ArrayList<>(Arrays.asList(addedItems));
        return this;
    }

    /**
     *  <p>Elements added to the array.</p>
     * @param addedItems value to be set
     * @return Builder
     */

    public ChangeGroupsChangeBuilder addedItems(final java.util.List<String> addedItems) {
        this.addedItems = addedItems;
        return this;
    }

    /**
     *  <p>Elements added to the array.</p>
     * @param addedItems value to be set
     * @return Builder
     */

    public ChangeGroupsChangeBuilder plusAddedItems(final String... addedItems) {
        if (this.addedItems == null) {
            this.addedItems = new ArrayList<>();
        }
        this.addedItems.addAll(Arrays.asList(addedItems));
        return this;
    }

    /**
     *  <p>Elements removed from the array.</p>
     * @param removedItems value to be set
     * @return Builder
     */

    public ChangeGroupsChangeBuilder removedItems(final String... removedItems) {
        this.removedItems = new ArrayList<>(Arrays.asList(removedItems));
        return this;
    }

    /**
     *  <p>Elements removed from the array.</p>
     * @param removedItems value to be set
     * @return Builder
     */

    public ChangeGroupsChangeBuilder removedItems(final java.util.List<String> removedItems) {
        this.removedItems = removedItems;
        return this;
    }

    /**
     *  <p>Elements removed from the array.</p>
     * @param removedItems value to be set
     * @return Builder
     */

    public ChangeGroupsChangeBuilder plusRemovedItems(final String... removedItems) {
        if (this.removedItems == null) {
            this.removedItems = new ArrayList<>();
        }
        this.removedItems.addAll(Arrays.asList(removedItems));
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

    public java.util.List<String> getPreviousValue() {
        return this.previousValue;
    }

    /**
     *  <p>Value after the change.</p>
     * @return nextValue
     */

    public java.util.List<String> getNextValue() {
        return this.nextValue;
    }

    /**
     *  <p>Elements added to the array.</p>
     * @return addedItems
     */

    public java.util.List<String> getAddedItems() {
        return this.addedItems;
    }

    /**
     *  <p>Elements removed from the array.</p>
     * @return removedItems
     */

    public java.util.List<String> getRemovedItems() {
        return this.removedItems;
    }

    /**
     * builds ChangeGroupsChange with checking for non-null required values
     * @return ChangeGroupsChange
     */
    public ChangeGroupsChange build() {
        Objects.requireNonNull(change, ChangeGroupsChange.class + ": change is missing");
        Objects.requireNonNull(previousValue, ChangeGroupsChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, ChangeGroupsChange.class + ": nextValue is missing");
        Objects.requireNonNull(addedItems, ChangeGroupsChange.class + ": addedItems is missing");
        Objects.requireNonNull(removedItems, ChangeGroupsChange.class + ": removedItems is missing");
        return new ChangeGroupsChangeImpl(change, previousValue, nextValue, addedItems, removedItems);
    }

    /**
     * builds ChangeGroupsChange without checking for non-null required values
     * @return ChangeGroupsChange
     */
    public ChangeGroupsChange buildUnchecked() {
        return new ChangeGroupsChangeImpl(change, previousValue, nextValue, addedItems, removedItems);
    }

    /**
     * factory method for an instance of ChangeGroupsChangeBuilder
     * @return builder
     */
    public static ChangeGroupsChangeBuilder of() {
        return new ChangeGroupsChangeBuilder();
    }

    /**
     * create builder for ChangeGroupsChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ChangeGroupsChangeBuilder of(final ChangeGroupsChange template) {
        ChangeGroupsChangeBuilder builder = new ChangeGroupsChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        builder.addedItems = template.getAddedItems();
        builder.removedItems = template.getRemovedItems();
        return builder;
    }

}
