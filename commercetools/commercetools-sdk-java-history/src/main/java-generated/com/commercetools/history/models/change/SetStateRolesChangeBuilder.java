
package com.commercetools.history.models.change;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetStateRolesChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetStateRolesChange setStateRolesChange = SetStateRolesChange.builder()
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
public class SetStateRolesChangeBuilder implements Builder<SetStateRolesChange> {

    private String change;

    private java.util.List<com.commercetools.history.models.common.StateRoleEnum> previousValue;

    private java.util.List<com.commercetools.history.models.common.StateRoleEnum> nextValue;

    private java.util.List<com.commercetools.history.models.common.StateRoleEnum> addedItems;

    private java.util.List<com.commercetools.history.models.common.StateRoleEnum> removedItems;

    /**
     * set the value to the change
     * @param change value to be set
     * @return Builder
     */

    public SetStateRolesChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     * @return Builder
     */

    public SetStateRolesChangeBuilder previousValue(
            final com.commercetools.history.models.common.StateRoleEnum... previousValue) {
        this.previousValue = new ArrayList<>(Arrays.asList(previousValue));
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     * @return Builder
     */

    public SetStateRolesChangeBuilder previousValue(
            final java.util.List<com.commercetools.history.models.common.StateRoleEnum> previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     * @return Builder
     */

    public SetStateRolesChangeBuilder plusPreviousValue(
            final com.commercetools.history.models.common.StateRoleEnum... previousValue) {
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

    public SetStateRolesChangeBuilder nextValue(
            final com.commercetools.history.models.common.StateRoleEnum... nextValue) {
        this.nextValue = new ArrayList<>(Arrays.asList(nextValue));
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     * @return Builder
     */

    public SetStateRolesChangeBuilder nextValue(
            final java.util.List<com.commercetools.history.models.common.StateRoleEnum> nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     * @return Builder
     */

    public SetStateRolesChangeBuilder plusNextValue(
            final com.commercetools.history.models.common.StateRoleEnum... nextValue) {
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

    public SetStateRolesChangeBuilder addedItems(
            final com.commercetools.history.models.common.StateRoleEnum... addedItems) {
        this.addedItems = new ArrayList<>(Arrays.asList(addedItems));
        return this;
    }

    /**
     *  <p>Elements added to the array.</p>
     * @param addedItems value to be set
     * @return Builder
     */

    public SetStateRolesChangeBuilder addedItems(
            final java.util.List<com.commercetools.history.models.common.StateRoleEnum> addedItems) {
        this.addedItems = addedItems;
        return this;
    }

    /**
     *  <p>Elements added to the array.</p>
     * @param addedItems value to be set
     * @return Builder
     */

    public SetStateRolesChangeBuilder plusAddedItems(
            final com.commercetools.history.models.common.StateRoleEnum... addedItems) {
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

    public SetStateRolesChangeBuilder removedItems(
            final com.commercetools.history.models.common.StateRoleEnum... removedItems) {
        this.removedItems = new ArrayList<>(Arrays.asList(removedItems));
        return this;
    }

    /**
     *  <p>Elements removed from the array.</p>
     * @param removedItems value to be set
     * @return Builder
     */

    public SetStateRolesChangeBuilder removedItems(
            final java.util.List<com.commercetools.history.models.common.StateRoleEnum> removedItems) {
        this.removedItems = removedItems;
        return this;
    }

    /**
     *  <p>Elements removed from the array.</p>
     * @param removedItems value to be set
     * @return Builder
     */

    public SetStateRolesChangeBuilder plusRemovedItems(
            final com.commercetools.history.models.common.StateRoleEnum... removedItems) {
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

    public java.util.List<com.commercetools.history.models.common.StateRoleEnum> getPreviousValue() {
        return this.previousValue;
    }

    /**
     *  <p>Value after the change.</p>
     * @return nextValue
     */

    public java.util.List<com.commercetools.history.models.common.StateRoleEnum> getNextValue() {
        return this.nextValue;
    }

    /**
     *  <p>Elements added to the array.</p>
     * @return addedItems
     */

    public java.util.List<com.commercetools.history.models.common.StateRoleEnum> getAddedItems() {
        return this.addedItems;
    }

    /**
     *  <p>Elements removed from the array.</p>
     * @return removedItems
     */

    public java.util.List<com.commercetools.history.models.common.StateRoleEnum> getRemovedItems() {
        return this.removedItems;
    }

    /**
     * builds SetStateRolesChange with checking for non-null required values
     * @return SetStateRolesChange
     */
    public SetStateRolesChange build() {
        Objects.requireNonNull(change, SetStateRolesChange.class + ": change is missing");
        Objects.requireNonNull(previousValue, SetStateRolesChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, SetStateRolesChange.class + ": nextValue is missing");
        Objects.requireNonNull(addedItems, SetStateRolesChange.class + ": addedItems is missing");
        Objects.requireNonNull(removedItems, SetStateRolesChange.class + ": removedItems is missing");
        return new SetStateRolesChangeImpl(change, previousValue, nextValue, addedItems, removedItems);
    }

    /**
     * builds SetStateRolesChange without checking for non-null required values
     * @return SetStateRolesChange
     */
    public SetStateRolesChange buildUnchecked() {
        return new SetStateRolesChangeImpl(change, previousValue, nextValue, addedItems, removedItems);
    }

    /**
     * factory method for an instance of SetStateRolesChangeBuilder
     * @return builder
     */
    public static SetStateRolesChangeBuilder of() {
        return new SetStateRolesChangeBuilder();
    }

    /**
     * create builder for SetStateRolesChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetStateRolesChangeBuilder of(final SetStateRolesChange template) {
        SetStateRolesChangeBuilder builder = new SetStateRolesChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        builder.addedItems = template.getAddedItems();
        builder.removedItems = template.getRemovedItems();
        return builder;
    }

}
