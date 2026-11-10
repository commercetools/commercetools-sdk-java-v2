
package com.commercetools.history.models.change;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetInheritedStoresChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetInheritedStoresChange setInheritedStoresChange = SetInheritedStoresChange.builder()
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
public class SetInheritedStoresChangeBuilder implements Builder<SetInheritedStoresChange> {

    private String change;

    private java.util.List<com.commercetools.history.models.common.KeyReference> addedItems;

    private java.util.List<com.commercetools.history.models.common.KeyReference> removedItems;

    private java.util.List<com.commercetools.history.models.common.KeyReference> previousValue;

    private java.util.List<com.commercetools.history.models.common.KeyReference> nextValue;

    /**
     * set the value to the change
     * @param change value to be set
     * @return Builder
     */

    public SetInheritedStoresChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     *  <p>Elements added to the array.</p>
     * @param addedItems value to be set
     * @return Builder
     */

    public SetInheritedStoresChangeBuilder addedItems(
            final com.commercetools.history.models.common.KeyReference... addedItems) {
        this.addedItems = new ArrayList<>(Arrays.asList(addedItems));
        return this;
    }

    /**
     *  <p>Elements added to the array.</p>
     * @param addedItems value to be set
     * @return Builder
     */

    public SetInheritedStoresChangeBuilder addedItems(
            final java.util.List<com.commercetools.history.models.common.KeyReference> addedItems) {
        this.addedItems = addedItems;
        return this;
    }

    /**
     *  <p>Elements added to the array.</p>
     * @param addedItems value to be set
     * @return Builder
     */

    public SetInheritedStoresChangeBuilder plusAddedItems(
            final com.commercetools.history.models.common.KeyReference... addedItems) {
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

    public SetInheritedStoresChangeBuilder plusAddedItems(
            Function<com.commercetools.history.models.common.KeyReferenceBuilder, Builder<? extends com.commercetools.history.models.common.KeyReference>> builder) {
        if (this.addedItems == null) {
            this.addedItems = new ArrayList<>();
        }
        this.addedItems.add(builder.apply(com.commercetools.history.models.common.KeyReferenceBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Elements added to the array.</p>
     * @param builder function to build the addedItems value
     * @return Builder
     */

    public SetInheritedStoresChangeBuilder withAddedItems(
            Function<com.commercetools.history.models.common.KeyReferenceBuilder, Builder<? extends com.commercetools.history.models.common.KeyReference>> builder) {
        this.addedItems = new ArrayList<>();
        this.addedItems.add(builder.apply(com.commercetools.history.models.common.KeyReferenceBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Elements removed from the array.</p>
     * @param removedItems value to be set
     * @return Builder
     */

    public SetInheritedStoresChangeBuilder removedItems(
            final com.commercetools.history.models.common.KeyReference... removedItems) {
        this.removedItems = new ArrayList<>(Arrays.asList(removedItems));
        return this;
    }

    /**
     *  <p>Elements removed from the array.</p>
     * @param removedItems value to be set
     * @return Builder
     */

    public SetInheritedStoresChangeBuilder removedItems(
            final java.util.List<com.commercetools.history.models.common.KeyReference> removedItems) {
        this.removedItems = removedItems;
        return this;
    }

    /**
     *  <p>Elements removed from the array.</p>
     * @param removedItems value to be set
     * @return Builder
     */

    public SetInheritedStoresChangeBuilder plusRemovedItems(
            final com.commercetools.history.models.common.KeyReference... removedItems) {
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

    public SetInheritedStoresChangeBuilder plusRemovedItems(
            Function<com.commercetools.history.models.common.KeyReferenceBuilder, Builder<? extends com.commercetools.history.models.common.KeyReference>> builder) {
        if (this.removedItems == null) {
            this.removedItems = new ArrayList<>();
        }
        this.removedItems.add(builder.apply(com.commercetools.history.models.common.KeyReferenceBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Elements removed from the array.</p>
     * @param builder function to build the removedItems value
     * @return Builder
     */

    public SetInheritedStoresChangeBuilder withRemovedItems(
            Function<com.commercetools.history.models.common.KeyReferenceBuilder, Builder<? extends com.commercetools.history.models.common.KeyReference>> builder) {
        this.removedItems = new ArrayList<>();
        this.removedItems.add(builder.apply(com.commercetools.history.models.common.KeyReferenceBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     * @return Builder
     */

    public SetInheritedStoresChangeBuilder previousValue(
            final com.commercetools.history.models.common.KeyReference... previousValue) {
        this.previousValue = new ArrayList<>(Arrays.asList(previousValue));
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     * @return Builder
     */

    public SetInheritedStoresChangeBuilder previousValue(
            final java.util.List<com.commercetools.history.models.common.KeyReference> previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     * @return Builder
     */

    public SetInheritedStoresChangeBuilder plusPreviousValue(
            final com.commercetools.history.models.common.KeyReference... previousValue) {
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

    public SetInheritedStoresChangeBuilder plusPreviousValue(
            Function<com.commercetools.history.models.common.KeyReferenceBuilder, Builder<? extends com.commercetools.history.models.common.KeyReference>> builder) {
        if (this.previousValue == null) {
            this.previousValue = new ArrayList<>();
        }
        this.previousValue.add(builder.apply(com.commercetools.history.models.common.KeyReferenceBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param builder function to build the previousValue value
     * @return Builder
     */

    public SetInheritedStoresChangeBuilder withPreviousValue(
            Function<com.commercetools.history.models.common.KeyReferenceBuilder, Builder<? extends com.commercetools.history.models.common.KeyReference>> builder) {
        this.previousValue = new ArrayList<>();
        this.previousValue.add(builder.apply(com.commercetools.history.models.common.KeyReferenceBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     * @return Builder
     */

    public SetInheritedStoresChangeBuilder nextValue(
            final com.commercetools.history.models.common.KeyReference... nextValue) {
        this.nextValue = new ArrayList<>(Arrays.asList(nextValue));
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     * @return Builder
     */

    public SetInheritedStoresChangeBuilder nextValue(
            final java.util.List<com.commercetools.history.models.common.KeyReference> nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     * @return Builder
     */

    public SetInheritedStoresChangeBuilder plusNextValue(
            final com.commercetools.history.models.common.KeyReference... nextValue) {
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

    public SetInheritedStoresChangeBuilder plusNextValue(
            Function<com.commercetools.history.models.common.KeyReferenceBuilder, Builder<? extends com.commercetools.history.models.common.KeyReference>> builder) {
        if (this.nextValue == null) {
            this.nextValue = new ArrayList<>();
        }
        this.nextValue.add(builder.apply(com.commercetools.history.models.common.KeyReferenceBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param builder function to build the nextValue value
     * @return Builder
     */

    public SetInheritedStoresChangeBuilder withNextValue(
            Function<com.commercetools.history.models.common.KeyReferenceBuilder, Builder<? extends com.commercetools.history.models.common.KeyReference>> builder) {
        this.nextValue = new ArrayList<>();
        this.nextValue.add(builder.apply(com.commercetools.history.models.common.KeyReferenceBuilder.of()).build());
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
     *  <p>Elements added to the array.</p>
     * @return addedItems
     */

    public java.util.List<com.commercetools.history.models.common.KeyReference> getAddedItems() {
        return this.addedItems;
    }

    /**
     *  <p>Elements removed from the array.</p>
     * @return removedItems
     */

    public java.util.List<com.commercetools.history.models.common.KeyReference> getRemovedItems() {
        return this.removedItems;
    }

    /**
     *  <p>Value before the change.</p>
     * @return previousValue
     */

    public java.util.List<com.commercetools.history.models.common.KeyReference> getPreviousValue() {
        return this.previousValue;
    }

    /**
     *  <p>Value after the change.</p>
     * @return nextValue
     */

    public java.util.List<com.commercetools.history.models.common.KeyReference> getNextValue() {
        return this.nextValue;
    }

    /**
     * builds SetInheritedStoresChange with checking for non-null required values
     * @return SetInheritedStoresChange
     */
    public SetInheritedStoresChange build() {
        Objects.requireNonNull(change, SetInheritedStoresChange.class + ": change is missing");
        Objects.requireNonNull(addedItems, SetInheritedStoresChange.class + ": addedItems is missing");
        Objects.requireNonNull(removedItems, SetInheritedStoresChange.class + ": removedItems is missing");
        Objects.requireNonNull(previousValue, SetInheritedStoresChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, SetInheritedStoresChange.class + ": nextValue is missing");
        return new SetInheritedStoresChangeImpl(change, addedItems, removedItems, previousValue, nextValue);
    }

    /**
     * builds SetInheritedStoresChange without checking for non-null required values
     * @return SetInheritedStoresChange
     */
    public SetInheritedStoresChange buildUnchecked() {
        return new SetInheritedStoresChangeImpl(change, addedItems, removedItems, previousValue, nextValue);
    }

    /**
     * factory method for an instance of SetInheritedStoresChangeBuilder
     * @return builder
     */
    public static SetInheritedStoresChangeBuilder of() {
        return new SetInheritedStoresChangeBuilder();
    }

    /**
     * create builder for SetInheritedStoresChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetInheritedStoresChangeBuilder of(final SetInheritedStoresChange template) {
        SetInheritedStoresChangeBuilder builder = new SetInheritedStoresChangeBuilder();
        builder.change = template.getChange();
        builder.addedItems = template.getAddedItems();
        builder.removedItems = template.getRemovedItems();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
