
package com.commercetools.history.models.change;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetAncestorsChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetAncestorsChange setAncestorsChange = SetAncestorsChange.builder()
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
public class SetAncestorsChangeBuilder implements Builder<SetAncestorsChange> {

    private String change;

    private java.util.List<com.commercetools.history.models.common.Reference> addedItems;

    private java.util.List<com.commercetools.history.models.common.Reference> removedItems;

    private java.util.List<com.commercetools.history.models.common.Reference> previousValue;

    private java.util.List<com.commercetools.history.models.common.Reference> nextValue;

    /**
     * set the value to the change
     * @param change value to be set
     * @return Builder
     */

    public SetAncestorsChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     *  <p>Elements added to the array.</p>
     * @param addedItems value to be set
     * @return Builder
     */

    public SetAncestorsChangeBuilder addedItems(final com.commercetools.history.models.common.Reference... addedItems) {
        this.addedItems = new ArrayList<>(Arrays.asList(addedItems));
        return this;
    }

    /**
     *  <p>Elements added to the array.</p>
     * @param addedItems value to be set
     * @return Builder
     */

    public SetAncestorsChangeBuilder addedItems(
            final java.util.List<com.commercetools.history.models.common.Reference> addedItems) {
        this.addedItems = addedItems;
        return this;
    }

    /**
     *  <p>Elements added to the array.</p>
     * @param addedItems value to be set
     * @return Builder
     */

    public SetAncestorsChangeBuilder plusAddedItems(
            final com.commercetools.history.models.common.Reference... addedItems) {
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

    public SetAncestorsChangeBuilder plusAddedItems(
            Function<com.commercetools.history.models.common.ReferenceBuilder, Builder<? extends com.commercetools.history.models.common.Reference>> builder) {
        if (this.addedItems == null) {
            this.addedItems = new ArrayList<>();
        }
        this.addedItems.add(builder.apply(com.commercetools.history.models.common.ReferenceBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Elements added to the array.</p>
     * @param builder function to build the addedItems value
     * @return Builder
     */

    public SetAncestorsChangeBuilder withAddedItems(
            Function<com.commercetools.history.models.common.ReferenceBuilder, Builder<? extends com.commercetools.history.models.common.Reference>> builder) {
        this.addedItems = new ArrayList<>();
        this.addedItems.add(builder.apply(com.commercetools.history.models.common.ReferenceBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Elements removed from the array.</p>
     * @param removedItems value to be set
     * @return Builder
     */

    public SetAncestorsChangeBuilder removedItems(
            final com.commercetools.history.models.common.Reference... removedItems) {
        this.removedItems = new ArrayList<>(Arrays.asList(removedItems));
        return this;
    }

    /**
     *  <p>Elements removed from the array.</p>
     * @param removedItems value to be set
     * @return Builder
     */

    public SetAncestorsChangeBuilder removedItems(
            final java.util.List<com.commercetools.history.models.common.Reference> removedItems) {
        this.removedItems = removedItems;
        return this;
    }

    /**
     *  <p>Elements removed from the array.</p>
     * @param removedItems value to be set
     * @return Builder
     */

    public SetAncestorsChangeBuilder plusRemovedItems(
            final com.commercetools.history.models.common.Reference... removedItems) {
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

    public SetAncestorsChangeBuilder plusRemovedItems(
            Function<com.commercetools.history.models.common.ReferenceBuilder, Builder<? extends com.commercetools.history.models.common.Reference>> builder) {
        if (this.removedItems == null) {
            this.removedItems = new ArrayList<>();
        }
        this.removedItems.add(builder.apply(com.commercetools.history.models.common.ReferenceBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Elements removed from the array.</p>
     * @param builder function to build the removedItems value
     * @return Builder
     */

    public SetAncestorsChangeBuilder withRemovedItems(
            Function<com.commercetools.history.models.common.ReferenceBuilder, Builder<? extends com.commercetools.history.models.common.Reference>> builder) {
        this.removedItems = new ArrayList<>();
        this.removedItems.add(builder.apply(com.commercetools.history.models.common.ReferenceBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     * @return Builder
     */

    public SetAncestorsChangeBuilder previousValue(
            final com.commercetools.history.models.common.Reference... previousValue) {
        this.previousValue = new ArrayList<>(Arrays.asList(previousValue));
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     * @return Builder
     */

    public SetAncestorsChangeBuilder previousValue(
            final java.util.List<com.commercetools.history.models.common.Reference> previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     * @return Builder
     */

    public SetAncestorsChangeBuilder plusPreviousValue(
            final com.commercetools.history.models.common.Reference... previousValue) {
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

    public SetAncestorsChangeBuilder plusPreviousValue(
            Function<com.commercetools.history.models.common.ReferenceBuilder, Builder<? extends com.commercetools.history.models.common.Reference>> builder) {
        if (this.previousValue == null) {
            this.previousValue = new ArrayList<>();
        }
        this.previousValue.add(builder.apply(com.commercetools.history.models.common.ReferenceBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param builder function to build the previousValue value
     * @return Builder
     */

    public SetAncestorsChangeBuilder withPreviousValue(
            Function<com.commercetools.history.models.common.ReferenceBuilder, Builder<? extends com.commercetools.history.models.common.Reference>> builder) {
        this.previousValue = new ArrayList<>();
        this.previousValue.add(builder.apply(com.commercetools.history.models.common.ReferenceBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     * @return Builder
     */

    public SetAncestorsChangeBuilder nextValue(final com.commercetools.history.models.common.Reference... nextValue) {
        this.nextValue = new ArrayList<>(Arrays.asList(nextValue));
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     * @return Builder
     */

    public SetAncestorsChangeBuilder nextValue(
            final java.util.List<com.commercetools.history.models.common.Reference> nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     * @return Builder
     */

    public SetAncestorsChangeBuilder plusNextValue(
            final com.commercetools.history.models.common.Reference... nextValue) {
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

    public SetAncestorsChangeBuilder plusNextValue(
            Function<com.commercetools.history.models.common.ReferenceBuilder, Builder<? extends com.commercetools.history.models.common.Reference>> builder) {
        if (this.nextValue == null) {
            this.nextValue = new ArrayList<>();
        }
        this.nextValue.add(builder.apply(com.commercetools.history.models.common.ReferenceBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param builder function to build the nextValue value
     * @return Builder
     */

    public SetAncestorsChangeBuilder withNextValue(
            Function<com.commercetools.history.models.common.ReferenceBuilder, Builder<? extends com.commercetools.history.models.common.Reference>> builder) {
        this.nextValue = new ArrayList<>();
        this.nextValue.add(builder.apply(com.commercetools.history.models.common.ReferenceBuilder.of()).build());
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

    public java.util.List<com.commercetools.history.models.common.Reference> getAddedItems() {
        return this.addedItems;
    }

    /**
     *  <p>Elements removed from the array.</p>
     * @return removedItems
     */

    public java.util.List<com.commercetools.history.models.common.Reference> getRemovedItems() {
        return this.removedItems;
    }

    /**
     *  <p>Value before the change.</p>
     * @return previousValue
     */

    public java.util.List<com.commercetools.history.models.common.Reference> getPreviousValue() {
        return this.previousValue;
    }

    /**
     *  <p>Value after the change.</p>
     * @return nextValue
     */

    public java.util.List<com.commercetools.history.models.common.Reference> getNextValue() {
        return this.nextValue;
    }

    /**
     * builds SetAncestorsChange with checking for non-null required values
     * @return SetAncestorsChange
     */
    public SetAncestorsChange build() {
        Objects.requireNonNull(change, SetAncestorsChange.class + ": change is missing");
        Objects.requireNonNull(addedItems, SetAncestorsChange.class + ": addedItems is missing");
        Objects.requireNonNull(removedItems, SetAncestorsChange.class + ": removedItems is missing");
        Objects.requireNonNull(previousValue, SetAncestorsChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, SetAncestorsChange.class + ": nextValue is missing");
        return new SetAncestorsChangeImpl(change, addedItems, removedItems, previousValue, nextValue);
    }

    /**
     * builds SetAncestorsChange without checking for non-null required values
     * @return SetAncestorsChange
     */
    public SetAncestorsChange buildUnchecked() {
        return new SetAncestorsChangeImpl(change, addedItems, removedItems, previousValue, nextValue);
    }

    /**
     * factory method for an instance of SetAncestorsChangeBuilder
     * @return builder
     */
    public static SetAncestorsChangeBuilder of() {
        return new SetAncestorsChangeBuilder();
    }

    /**
     * create builder for SetAncestorsChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetAncestorsChangeBuilder of(final SetAncestorsChange template) {
        SetAncestorsChangeBuilder builder = new SetAncestorsChangeBuilder();
        builder.change = template.getChange();
        builder.addedItems = template.getAddedItems();
        builder.removedItems = template.getRemovedItems();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
