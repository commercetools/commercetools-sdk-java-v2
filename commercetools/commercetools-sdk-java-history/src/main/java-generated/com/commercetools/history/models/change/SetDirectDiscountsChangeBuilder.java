
package com.commercetools.history.models.change;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetDirectDiscountsChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetDirectDiscountsChange setDirectDiscountsChange = SetDirectDiscountsChange.builder()
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
public class SetDirectDiscountsChangeBuilder implements Builder<SetDirectDiscountsChange> {

    private String change;

    private java.util.List<com.commercetools.history.models.common.DirectDiscount> addedItems;

    private java.util.List<com.commercetools.history.models.common.DirectDiscount> removedItems;

    private java.util.List<com.commercetools.history.models.common.DirectDiscount> previousValue;

    private java.util.List<com.commercetools.history.models.common.DirectDiscount> nextValue;

    /**
     * set the value to the change
     * @param change value to be set
     * @return Builder
     */

    public SetDirectDiscountsChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     *  <p>Elements added to the array.</p>
     * @param addedItems value to be set
     * @return Builder
     */

    public SetDirectDiscountsChangeBuilder addedItems(
            final com.commercetools.history.models.common.DirectDiscount... addedItems) {
        this.addedItems = new ArrayList<>(Arrays.asList(addedItems));
        return this;
    }

    /**
     *  <p>Elements added to the array.</p>
     * @param addedItems value to be set
     * @return Builder
     */

    public SetDirectDiscountsChangeBuilder addedItems(
            final java.util.List<com.commercetools.history.models.common.DirectDiscount> addedItems) {
        this.addedItems = addedItems;
        return this;
    }

    /**
     *  <p>Elements added to the array.</p>
     * @param addedItems value to be set
     * @return Builder
     */

    public SetDirectDiscountsChangeBuilder plusAddedItems(
            final com.commercetools.history.models.common.DirectDiscount... addedItems) {
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

    public SetDirectDiscountsChangeBuilder plusAddedItems(
            Function<com.commercetools.history.models.common.DirectDiscountBuilder, com.commercetools.history.models.common.DirectDiscountBuilder> builder) {
        if (this.addedItems == null) {
            this.addedItems = new ArrayList<>();
        }
        this.addedItems.add(builder.apply(com.commercetools.history.models.common.DirectDiscountBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Elements added to the array.</p>
     * @param builder function to build the addedItems value
     * @return Builder
     */

    public SetDirectDiscountsChangeBuilder withAddedItems(
            Function<com.commercetools.history.models.common.DirectDiscountBuilder, com.commercetools.history.models.common.DirectDiscountBuilder> builder) {
        this.addedItems = new ArrayList<>();
        this.addedItems.add(builder.apply(com.commercetools.history.models.common.DirectDiscountBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Elements added to the array.</p>
     * @param builder function to build the addedItems value
     * @return Builder
     */

    public SetDirectDiscountsChangeBuilder addAddedItems(
            Function<com.commercetools.history.models.common.DirectDiscountBuilder, com.commercetools.history.models.common.DirectDiscount> builder) {
        return plusAddedItems(builder.apply(com.commercetools.history.models.common.DirectDiscountBuilder.of()));
    }

    /**
     *  <p>Elements added to the array.</p>
     * @param builder function to build the addedItems value
     * @return Builder
     */

    public SetDirectDiscountsChangeBuilder setAddedItems(
            Function<com.commercetools.history.models.common.DirectDiscountBuilder, com.commercetools.history.models.common.DirectDiscount> builder) {
        return addedItems(builder.apply(com.commercetools.history.models.common.DirectDiscountBuilder.of()));
    }

    /**
     *  <p>Elements removed from the array.</p>
     * @param removedItems value to be set
     * @return Builder
     */

    public SetDirectDiscountsChangeBuilder removedItems(
            final com.commercetools.history.models.common.DirectDiscount... removedItems) {
        this.removedItems = new ArrayList<>(Arrays.asList(removedItems));
        return this;
    }

    /**
     *  <p>Elements removed from the array.</p>
     * @param removedItems value to be set
     * @return Builder
     */

    public SetDirectDiscountsChangeBuilder removedItems(
            final java.util.List<com.commercetools.history.models.common.DirectDiscount> removedItems) {
        this.removedItems = removedItems;
        return this;
    }

    /**
     *  <p>Elements removed from the array.</p>
     * @param removedItems value to be set
     * @return Builder
     */

    public SetDirectDiscountsChangeBuilder plusRemovedItems(
            final com.commercetools.history.models.common.DirectDiscount... removedItems) {
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

    public SetDirectDiscountsChangeBuilder plusRemovedItems(
            Function<com.commercetools.history.models.common.DirectDiscountBuilder, com.commercetools.history.models.common.DirectDiscountBuilder> builder) {
        if (this.removedItems == null) {
            this.removedItems = new ArrayList<>();
        }
        this.removedItems
                .add(builder.apply(com.commercetools.history.models.common.DirectDiscountBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Elements removed from the array.</p>
     * @param builder function to build the removedItems value
     * @return Builder
     */

    public SetDirectDiscountsChangeBuilder withRemovedItems(
            Function<com.commercetools.history.models.common.DirectDiscountBuilder, com.commercetools.history.models.common.DirectDiscountBuilder> builder) {
        this.removedItems = new ArrayList<>();
        this.removedItems
                .add(builder.apply(com.commercetools.history.models.common.DirectDiscountBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Elements removed from the array.</p>
     * @param builder function to build the removedItems value
     * @return Builder
     */

    public SetDirectDiscountsChangeBuilder addRemovedItems(
            Function<com.commercetools.history.models.common.DirectDiscountBuilder, com.commercetools.history.models.common.DirectDiscount> builder) {
        return plusRemovedItems(builder.apply(com.commercetools.history.models.common.DirectDiscountBuilder.of()));
    }

    /**
     *  <p>Elements removed from the array.</p>
     * @param builder function to build the removedItems value
     * @return Builder
     */

    public SetDirectDiscountsChangeBuilder setRemovedItems(
            Function<com.commercetools.history.models.common.DirectDiscountBuilder, com.commercetools.history.models.common.DirectDiscount> builder) {
        return removedItems(builder.apply(com.commercetools.history.models.common.DirectDiscountBuilder.of()));
    }

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     * @return Builder
     */

    public SetDirectDiscountsChangeBuilder previousValue(
            final com.commercetools.history.models.common.DirectDiscount... previousValue) {
        this.previousValue = new ArrayList<>(Arrays.asList(previousValue));
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     * @return Builder
     */

    public SetDirectDiscountsChangeBuilder previousValue(
            final java.util.List<com.commercetools.history.models.common.DirectDiscount> previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     * @return Builder
     */

    public SetDirectDiscountsChangeBuilder plusPreviousValue(
            final com.commercetools.history.models.common.DirectDiscount... previousValue) {
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

    public SetDirectDiscountsChangeBuilder plusPreviousValue(
            Function<com.commercetools.history.models.common.DirectDiscountBuilder, com.commercetools.history.models.common.DirectDiscountBuilder> builder) {
        if (this.previousValue == null) {
            this.previousValue = new ArrayList<>();
        }
        this.previousValue
                .add(builder.apply(com.commercetools.history.models.common.DirectDiscountBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param builder function to build the previousValue value
     * @return Builder
     */

    public SetDirectDiscountsChangeBuilder withPreviousValue(
            Function<com.commercetools.history.models.common.DirectDiscountBuilder, com.commercetools.history.models.common.DirectDiscountBuilder> builder) {
        this.previousValue = new ArrayList<>();
        this.previousValue
                .add(builder.apply(com.commercetools.history.models.common.DirectDiscountBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param builder function to build the previousValue value
     * @return Builder
     */

    public SetDirectDiscountsChangeBuilder addPreviousValue(
            Function<com.commercetools.history.models.common.DirectDiscountBuilder, com.commercetools.history.models.common.DirectDiscount> builder) {
        return plusPreviousValue(builder.apply(com.commercetools.history.models.common.DirectDiscountBuilder.of()));
    }

    /**
     *  <p>Value before the change.</p>
     * @param builder function to build the previousValue value
     * @return Builder
     */

    public SetDirectDiscountsChangeBuilder setPreviousValue(
            Function<com.commercetools.history.models.common.DirectDiscountBuilder, com.commercetools.history.models.common.DirectDiscount> builder) {
        return previousValue(builder.apply(com.commercetools.history.models.common.DirectDiscountBuilder.of()));
    }

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     * @return Builder
     */

    public SetDirectDiscountsChangeBuilder nextValue(
            final com.commercetools.history.models.common.DirectDiscount... nextValue) {
        this.nextValue = new ArrayList<>(Arrays.asList(nextValue));
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     * @return Builder
     */

    public SetDirectDiscountsChangeBuilder nextValue(
            final java.util.List<com.commercetools.history.models.common.DirectDiscount> nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     * @return Builder
     */

    public SetDirectDiscountsChangeBuilder plusNextValue(
            final com.commercetools.history.models.common.DirectDiscount... nextValue) {
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

    public SetDirectDiscountsChangeBuilder plusNextValue(
            Function<com.commercetools.history.models.common.DirectDiscountBuilder, com.commercetools.history.models.common.DirectDiscountBuilder> builder) {
        if (this.nextValue == null) {
            this.nextValue = new ArrayList<>();
        }
        this.nextValue.add(builder.apply(com.commercetools.history.models.common.DirectDiscountBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param builder function to build the nextValue value
     * @return Builder
     */

    public SetDirectDiscountsChangeBuilder withNextValue(
            Function<com.commercetools.history.models.common.DirectDiscountBuilder, com.commercetools.history.models.common.DirectDiscountBuilder> builder) {
        this.nextValue = new ArrayList<>();
        this.nextValue.add(builder.apply(com.commercetools.history.models.common.DirectDiscountBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param builder function to build the nextValue value
     * @return Builder
     */

    public SetDirectDiscountsChangeBuilder addNextValue(
            Function<com.commercetools.history.models.common.DirectDiscountBuilder, com.commercetools.history.models.common.DirectDiscount> builder) {
        return plusNextValue(builder.apply(com.commercetools.history.models.common.DirectDiscountBuilder.of()));
    }

    /**
     *  <p>Value after the change.</p>
     * @param builder function to build the nextValue value
     * @return Builder
     */

    public SetDirectDiscountsChangeBuilder setNextValue(
            Function<com.commercetools.history.models.common.DirectDiscountBuilder, com.commercetools.history.models.common.DirectDiscount> builder) {
        return nextValue(builder.apply(com.commercetools.history.models.common.DirectDiscountBuilder.of()));
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

    public java.util.List<com.commercetools.history.models.common.DirectDiscount> getAddedItems() {
        return this.addedItems;
    }

    /**
     *  <p>Elements removed from the array.</p>
     * @return removedItems
     */

    public java.util.List<com.commercetools.history.models.common.DirectDiscount> getRemovedItems() {
        return this.removedItems;
    }

    /**
     *  <p>Value before the change.</p>
     * @return previousValue
     */

    public java.util.List<com.commercetools.history.models.common.DirectDiscount> getPreviousValue() {
        return this.previousValue;
    }

    /**
     *  <p>Value after the change.</p>
     * @return nextValue
     */

    public java.util.List<com.commercetools.history.models.common.DirectDiscount> getNextValue() {
        return this.nextValue;
    }

    /**
     * builds SetDirectDiscountsChange with checking for non-null required values
     * @return SetDirectDiscountsChange
     */
    public SetDirectDiscountsChange build() {
        Objects.requireNonNull(change, SetDirectDiscountsChange.class + ": change is missing");
        Objects.requireNonNull(addedItems, SetDirectDiscountsChange.class + ": addedItems is missing");
        Objects.requireNonNull(removedItems, SetDirectDiscountsChange.class + ": removedItems is missing");
        Objects.requireNonNull(previousValue, SetDirectDiscountsChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, SetDirectDiscountsChange.class + ": nextValue is missing");
        return new SetDirectDiscountsChangeImpl(change, addedItems, removedItems, previousValue, nextValue);
    }

    /**
     * builds SetDirectDiscountsChange without checking for non-null required values
     * @return SetDirectDiscountsChange
     */
    public SetDirectDiscountsChange buildUnchecked() {
        return new SetDirectDiscountsChangeImpl(change, addedItems, removedItems, previousValue, nextValue);
    }

    /**
     * factory method for an instance of SetDirectDiscountsChangeBuilder
     * @return builder
     */
    public static SetDirectDiscountsChangeBuilder of() {
        return new SetDirectDiscountsChangeBuilder();
    }

    /**
     * create builder for SetDirectDiscountsChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetDirectDiscountsChangeBuilder of(final SetDirectDiscountsChange template) {
        SetDirectDiscountsChangeBuilder builder = new SetDirectDiscountsChangeBuilder();
        builder.change = template.getChange();
        builder.addedItems = template.getAddedItems();
        builder.removedItems = template.getRemovedItems();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
