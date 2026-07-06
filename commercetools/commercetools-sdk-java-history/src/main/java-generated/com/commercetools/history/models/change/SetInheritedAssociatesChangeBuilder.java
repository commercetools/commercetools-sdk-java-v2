
package com.commercetools.history.models.change;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetInheritedAssociatesChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetInheritedAssociatesChange setInheritedAssociatesChange = SetInheritedAssociatesChange.builder()
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
public class SetInheritedAssociatesChangeBuilder implements Builder<SetInheritedAssociatesChange> {

    private String change;

    private java.util.List<com.commercetools.history.models.common.InheritedAssociate> addedItems;

    private java.util.List<com.commercetools.history.models.common.InheritedAssociate> removedItems;

    private java.util.List<com.commercetools.history.models.common.InheritedAssociate> previousValue;

    private java.util.List<com.commercetools.history.models.common.InheritedAssociate> nextValue;

    /**
     * set the value to the change
     * @param change value to be set
     * @return Builder
     */

    public SetInheritedAssociatesChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     *  <p>Elements added to the array.</p>
     * @param addedItems value to be set
     * @return Builder
     */

    public SetInheritedAssociatesChangeBuilder addedItems(
            final com.commercetools.history.models.common.InheritedAssociate... addedItems) {
        this.addedItems = new ArrayList<>(Arrays.asList(addedItems));
        return this;
    }

    /**
     *  <p>Elements added to the array.</p>
     * @param addedItems value to be set
     * @return Builder
     */

    public SetInheritedAssociatesChangeBuilder addedItems(
            final java.util.List<com.commercetools.history.models.common.InheritedAssociate> addedItems) {
        this.addedItems = addedItems;
        return this;
    }

    /**
     *  <p>Elements added to the array.</p>
     * @param addedItems value to be set
     * @return Builder
     */

    public SetInheritedAssociatesChangeBuilder plusAddedItems(
            final com.commercetools.history.models.common.InheritedAssociate... addedItems) {
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

    public SetInheritedAssociatesChangeBuilder plusAddedItems(
            Function<com.commercetools.history.models.common.InheritedAssociateBuilder, com.commercetools.history.models.common.InheritedAssociateBuilder> builder) {
        if (this.addedItems == null) {
            this.addedItems = new ArrayList<>();
        }
        this.addedItems
                .add(builder.apply(com.commercetools.history.models.common.InheritedAssociateBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Elements added to the array.</p>
     * @param builder function to build the addedItems value
     * @return Builder
     */

    public SetInheritedAssociatesChangeBuilder withAddedItems(
            Function<com.commercetools.history.models.common.InheritedAssociateBuilder, com.commercetools.history.models.common.InheritedAssociateBuilder> builder) {
        this.addedItems = new ArrayList<>();
        this.addedItems
                .add(builder.apply(com.commercetools.history.models.common.InheritedAssociateBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Elements added to the array.</p>
     * @param builder function to build the addedItems value
     * @return Builder
     */

    public SetInheritedAssociatesChangeBuilder addAddedItems(
            Function<com.commercetools.history.models.common.InheritedAssociateBuilder, com.commercetools.history.models.common.InheritedAssociate> builder) {
        return plusAddedItems(builder.apply(com.commercetools.history.models.common.InheritedAssociateBuilder.of()));
    }

    /**
     *  <p>Elements added to the array.</p>
     * @param builder function to build the addedItems value
     * @return Builder
     */

    public SetInheritedAssociatesChangeBuilder setAddedItems(
            Function<com.commercetools.history.models.common.InheritedAssociateBuilder, com.commercetools.history.models.common.InheritedAssociate> builder) {
        return addedItems(builder.apply(com.commercetools.history.models.common.InheritedAssociateBuilder.of()));
    }

    /**
     *  <p>Elements removed from the array.</p>
     * @param removedItems value to be set
     * @return Builder
     */

    public SetInheritedAssociatesChangeBuilder removedItems(
            final com.commercetools.history.models.common.InheritedAssociate... removedItems) {
        this.removedItems = new ArrayList<>(Arrays.asList(removedItems));
        return this;
    }

    /**
     *  <p>Elements removed from the array.</p>
     * @param removedItems value to be set
     * @return Builder
     */

    public SetInheritedAssociatesChangeBuilder removedItems(
            final java.util.List<com.commercetools.history.models.common.InheritedAssociate> removedItems) {
        this.removedItems = removedItems;
        return this;
    }

    /**
     *  <p>Elements removed from the array.</p>
     * @param removedItems value to be set
     * @return Builder
     */

    public SetInheritedAssociatesChangeBuilder plusRemovedItems(
            final com.commercetools.history.models.common.InheritedAssociate... removedItems) {
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

    public SetInheritedAssociatesChangeBuilder plusRemovedItems(
            Function<com.commercetools.history.models.common.InheritedAssociateBuilder, com.commercetools.history.models.common.InheritedAssociateBuilder> builder) {
        if (this.removedItems == null) {
            this.removedItems = new ArrayList<>();
        }
        this.removedItems
                .add(builder.apply(com.commercetools.history.models.common.InheritedAssociateBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Elements removed from the array.</p>
     * @param builder function to build the removedItems value
     * @return Builder
     */

    public SetInheritedAssociatesChangeBuilder withRemovedItems(
            Function<com.commercetools.history.models.common.InheritedAssociateBuilder, com.commercetools.history.models.common.InheritedAssociateBuilder> builder) {
        this.removedItems = new ArrayList<>();
        this.removedItems
                .add(builder.apply(com.commercetools.history.models.common.InheritedAssociateBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Elements removed from the array.</p>
     * @param builder function to build the removedItems value
     * @return Builder
     */

    public SetInheritedAssociatesChangeBuilder addRemovedItems(
            Function<com.commercetools.history.models.common.InheritedAssociateBuilder, com.commercetools.history.models.common.InheritedAssociate> builder) {
        return plusRemovedItems(builder.apply(com.commercetools.history.models.common.InheritedAssociateBuilder.of()));
    }

    /**
     *  <p>Elements removed from the array.</p>
     * @param builder function to build the removedItems value
     * @return Builder
     */

    public SetInheritedAssociatesChangeBuilder setRemovedItems(
            Function<com.commercetools.history.models.common.InheritedAssociateBuilder, com.commercetools.history.models.common.InheritedAssociate> builder) {
        return removedItems(builder.apply(com.commercetools.history.models.common.InheritedAssociateBuilder.of()));
    }

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     * @return Builder
     */

    public SetInheritedAssociatesChangeBuilder previousValue(
            final com.commercetools.history.models.common.InheritedAssociate... previousValue) {
        this.previousValue = new ArrayList<>(Arrays.asList(previousValue));
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     * @return Builder
     */

    public SetInheritedAssociatesChangeBuilder previousValue(
            final java.util.List<com.commercetools.history.models.common.InheritedAssociate> previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     * @return Builder
     */

    public SetInheritedAssociatesChangeBuilder plusPreviousValue(
            final com.commercetools.history.models.common.InheritedAssociate... previousValue) {
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

    public SetInheritedAssociatesChangeBuilder plusPreviousValue(
            Function<com.commercetools.history.models.common.InheritedAssociateBuilder, com.commercetools.history.models.common.InheritedAssociateBuilder> builder) {
        if (this.previousValue == null) {
            this.previousValue = new ArrayList<>();
        }
        this.previousValue
                .add(builder.apply(com.commercetools.history.models.common.InheritedAssociateBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param builder function to build the previousValue value
     * @return Builder
     */

    public SetInheritedAssociatesChangeBuilder withPreviousValue(
            Function<com.commercetools.history.models.common.InheritedAssociateBuilder, com.commercetools.history.models.common.InheritedAssociateBuilder> builder) {
        this.previousValue = new ArrayList<>();
        this.previousValue
                .add(builder.apply(com.commercetools.history.models.common.InheritedAssociateBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param builder function to build the previousValue value
     * @return Builder
     */

    public SetInheritedAssociatesChangeBuilder addPreviousValue(
            Function<com.commercetools.history.models.common.InheritedAssociateBuilder, com.commercetools.history.models.common.InheritedAssociate> builder) {
        return plusPreviousValue(builder.apply(com.commercetools.history.models.common.InheritedAssociateBuilder.of()));
    }

    /**
     *  <p>Value before the change.</p>
     * @param builder function to build the previousValue value
     * @return Builder
     */

    public SetInheritedAssociatesChangeBuilder setPreviousValue(
            Function<com.commercetools.history.models.common.InheritedAssociateBuilder, com.commercetools.history.models.common.InheritedAssociate> builder) {
        return previousValue(builder.apply(com.commercetools.history.models.common.InheritedAssociateBuilder.of()));
    }

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     * @return Builder
     */

    public SetInheritedAssociatesChangeBuilder nextValue(
            final com.commercetools.history.models.common.InheritedAssociate... nextValue) {
        this.nextValue = new ArrayList<>(Arrays.asList(nextValue));
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     * @return Builder
     */

    public SetInheritedAssociatesChangeBuilder nextValue(
            final java.util.List<com.commercetools.history.models.common.InheritedAssociate> nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     * @return Builder
     */

    public SetInheritedAssociatesChangeBuilder plusNextValue(
            final com.commercetools.history.models.common.InheritedAssociate... nextValue) {
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

    public SetInheritedAssociatesChangeBuilder plusNextValue(
            Function<com.commercetools.history.models.common.InheritedAssociateBuilder, com.commercetools.history.models.common.InheritedAssociateBuilder> builder) {
        if (this.nextValue == null) {
            this.nextValue = new ArrayList<>();
        }
        this.nextValue
                .add(builder.apply(com.commercetools.history.models.common.InheritedAssociateBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param builder function to build the nextValue value
     * @return Builder
     */

    public SetInheritedAssociatesChangeBuilder withNextValue(
            Function<com.commercetools.history.models.common.InheritedAssociateBuilder, com.commercetools.history.models.common.InheritedAssociateBuilder> builder) {
        this.nextValue = new ArrayList<>();
        this.nextValue
                .add(builder.apply(com.commercetools.history.models.common.InheritedAssociateBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param builder function to build the nextValue value
     * @return Builder
     */

    public SetInheritedAssociatesChangeBuilder addNextValue(
            Function<com.commercetools.history.models.common.InheritedAssociateBuilder, com.commercetools.history.models.common.InheritedAssociate> builder) {
        return plusNextValue(builder.apply(com.commercetools.history.models.common.InheritedAssociateBuilder.of()));
    }

    /**
     *  <p>Value after the change.</p>
     * @param builder function to build the nextValue value
     * @return Builder
     */

    public SetInheritedAssociatesChangeBuilder setNextValue(
            Function<com.commercetools.history.models.common.InheritedAssociateBuilder, com.commercetools.history.models.common.InheritedAssociate> builder) {
        return nextValue(builder.apply(com.commercetools.history.models.common.InheritedAssociateBuilder.of()));
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

    public java.util.List<com.commercetools.history.models.common.InheritedAssociate> getAddedItems() {
        return this.addedItems;
    }

    /**
     *  <p>Elements removed from the array.</p>
     * @return removedItems
     */

    public java.util.List<com.commercetools.history.models.common.InheritedAssociate> getRemovedItems() {
        return this.removedItems;
    }

    /**
     *  <p>Value before the change.</p>
     * @return previousValue
     */

    public java.util.List<com.commercetools.history.models.common.InheritedAssociate> getPreviousValue() {
        return this.previousValue;
    }

    /**
     *  <p>Value after the change.</p>
     * @return nextValue
     */

    public java.util.List<com.commercetools.history.models.common.InheritedAssociate> getNextValue() {
        return this.nextValue;
    }

    /**
     * builds SetInheritedAssociatesChange with checking for non-null required values
     * @return SetInheritedAssociatesChange
     */
    public SetInheritedAssociatesChange build() {
        Objects.requireNonNull(change, SetInheritedAssociatesChange.class + ": change is missing");
        Objects.requireNonNull(addedItems, SetInheritedAssociatesChange.class + ": addedItems is missing");
        Objects.requireNonNull(removedItems, SetInheritedAssociatesChange.class + ": removedItems is missing");
        Objects.requireNonNull(previousValue, SetInheritedAssociatesChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, SetInheritedAssociatesChange.class + ": nextValue is missing");
        return new SetInheritedAssociatesChangeImpl(change, addedItems, removedItems, previousValue, nextValue);
    }

    /**
     * builds SetInheritedAssociatesChange without checking for non-null required values
     * @return SetInheritedAssociatesChange
     */
    public SetInheritedAssociatesChange buildUnchecked() {
        return new SetInheritedAssociatesChangeImpl(change, addedItems, removedItems, previousValue, nextValue);
    }

    /**
     * factory method for an instance of SetInheritedAssociatesChangeBuilder
     * @return builder
     */
    public static SetInheritedAssociatesChangeBuilder of() {
        return new SetInheritedAssociatesChangeBuilder();
    }

    /**
     * create builder for SetInheritedAssociatesChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetInheritedAssociatesChangeBuilder of(final SetInheritedAssociatesChange template) {
        SetInheritedAssociatesChangeBuilder builder = new SetInheritedAssociatesChangeBuilder();
        builder.change = template.getChange();
        builder.addedItems = template.getAddedItems();
        builder.removedItems = template.getRemovedItems();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
