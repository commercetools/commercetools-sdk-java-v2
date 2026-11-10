
package com.commercetools.history.models.change;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetPricesChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetPricesChange setPricesChange = SetPricesChange.builder()
 *             .change("{change}")
 *             .plusPreviousValue(previousValueBuilder -> previousValueBuilder)
 *             .plusNextValue(nextValueBuilder -> nextValueBuilder)
 *             .catalogData("{catalogData}")
 *             .variant("{variant}")
 *             .plusAddedItems(addedItemsBuilder -> addedItemsBuilder)
 *             .plusRemovedItems(removedItemsBuilder -> removedItemsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SetPricesChangeBuilder implements Builder<SetPricesChange> {

    private String change;

    private java.util.List<com.commercetools.history.models.common.Price> previousValue;

    private java.util.List<com.commercetools.history.models.common.Price> nextValue;

    private String catalogData;

    private String variant;

    private java.util.List<com.commercetools.history.models.common.Price> addedItems;

    private java.util.List<com.commercetools.history.models.common.Price> removedItems;

    /**
     * set the value to the change
     * @param change value to be set
     * @return Builder
     */

    public SetPricesChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     * @return Builder
     */

    public SetPricesChangeBuilder previousValue(final com.commercetools.history.models.common.Price... previousValue) {
        this.previousValue = new ArrayList<>(Arrays.asList(previousValue));
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     * @return Builder
     */

    public SetPricesChangeBuilder previousValue(
            final java.util.List<com.commercetools.history.models.common.Price> previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     * @return Builder
     */

    public SetPricesChangeBuilder plusPreviousValue(
            final com.commercetools.history.models.common.Price... previousValue) {
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

    public SetPricesChangeBuilder plusPreviousValue(
            Function<com.commercetools.history.models.common.PriceBuilder, com.commercetools.history.models.common.PriceBuilder> builder) {
        if (this.previousValue == null) {
            this.previousValue = new ArrayList<>();
        }
        this.previousValue.add(builder.apply(com.commercetools.history.models.common.PriceBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param builder function to build the previousValue value
     * @return Builder
     */

    public SetPricesChangeBuilder withPreviousValue(
            Function<com.commercetools.history.models.common.PriceBuilder, com.commercetools.history.models.common.PriceBuilder> builder) {
        this.previousValue = new ArrayList<>();
        this.previousValue.add(builder.apply(com.commercetools.history.models.common.PriceBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param builder function to build the previousValue value
     * @return Builder
     */

    public SetPricesChangeBuilder addPreviousValue(
            Function<com.commercetools.history.models.common.PriceBuilder, com.commercetools.history.models.common.Price> builder) {
        return plusPreviousValue(builder.apply(com.commercetools.history.models.common.PriceBuilder.of()));
    }

    /**
     *  <p>Value before the change.</p>
     * @param builder function to build the previousValue value
     * @return Builder
     */

    public SetPricesChangeBuilder setPreviousValue(
            Function<com.commercetools.history.models.common.PriceBuilder, com.commercetools.history.models.common.Price> builder) {
        return previousValue(builder.apply(com.commercetools.history.models.common.PriceBuilder.of()));
    }

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     * @return Builder
     */

    public SetPricesChangeBuilder nextValue(final com.commercetools.history.models.common.Price... nextValue) {
        this.nextValue = new ArrayList<>(Arrays.asList(nextValue));
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     * @return Builder
     */

    public SetPricesChangeBuilder nextValue(
            final java.util.List<com.commercetools.history.models.common.Price> nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     * @return Builder
     */

    public SetPricesChangeBuilder plusNextValue(final com.commercetools.history.models.common.Price... nextValue) {
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

    public SetPricesChangeBuilder plusNextValue(
            Function<com.commercetools.history.models.common.PriceBuilder, com.commercetools.history.models.common.PriceBuilder> builder) {
        if (this.nextValue == null) {
            this.nextValue = new ArrayList<>();
        }
        this.nextValue.add(builder.apply(com.commercetools.history.models.common.PriceBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param builder function to build the nextValue value
     * @return Builder
     */

    public SetPricesChangeBuilder withNextValue(
            Function<com.commercetools.history.models.common.PriceBuilder, com.commercetools.history.models.common.PriceBuilder> builder) {
        this.nextValue = new ArrayList<>();
        this.nextValue.add(builder.apply(com.commercetools.history.models.common.PriceBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param builder function to build the nextValue value
     * @return Builder
     */

    public SetPricesChangeBuilder addNextValue(
            Function<com.commercetools.history.models.common.PriceBuilder, com.commercetools.history.models.common.Price> builder) {
        return plusNextValue(builder.apply(com.commercetools.history.models.common.PriceBuilder.of()));
    }

    /**
     *  <p>Value after the change.</p>
     * @param builder function to build the nextValue value
     * @return Builder
     */

    public SetPricesChangeBuilder setNextValue(
            Function<com.commercetools.history.models.common.PriceBuilder, com.commercetools.history.models.common.Price> builder) {
        return nextValue(builder.apply(com.commercetools.history.models.common.PriceBuilder.of()));
    }

    /**
     *  <p>Product data that was updated.</p>
     *  <ul>
     *   <li><code>staged</code>, if the staged <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductCatalogData" rel="nofollow">ProductCatalogData</a> was updated.</li>
     *   <li><code>current</code>, if the current <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductCatalogData" rel="nofollow">ProductCatalogData</a> was updated.</li>
     *  </ul>
     * @param catalogData value to be set
     * @return Builder
     */

    public SetPricesChangeBuilder catalogData(final String catalogData) {
        this.catalogData = catalogData;
        return this;
    }

    /**
     *  <p>Identifier of the updated Product Variant.</p>
     *  <p>This field holds the SKU, if defined; otherwise the key; otherwise the ID.</p>
     * @param variant value to be set
     * @return Builder
     */

    public SetPricesChangeBuilder variant(final String variant) {
        this.variant = variant;
        return this;
    }

    /**
     *  <p>Elements added to the array.</p>
     * @param addedItems value to be set
     * @return Builder
     */

    public SetPricesChangeBuilder addedItems(final com.commercetools.history.models.common.Price... addedItems) {
        this.addedItems = new ArrayList<>(Arrays.asList(addedItems));
        return this;
    }

    /**
     *  <p>Elements added to the array.</p>
     * @param addedItems value to be set
     * @return Builder
     */

    public SetPricesChangeBuilder addedItems(
            final java.util.List<com.commercetools.history.models.common.Price> addedItems) {
        this.addedItems = addedItems;
        return this;
    }

    /**
     *  <p>Elements added to the array.</p>
     * @param addedItems value to be set
     * @return Builder
     */

    public SetPricesChangeBuilder plusAddedItems(final com.commercetools.history.models.common.Price... addedItems) {
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

    public SetPricesChangeBuilder plusAddedItems(
            Function<com.commercetools.history.models.common.PriceBuilder, com.commercetools.history.models.common.PriceBuilder> builder) {
        if (this.addedItems == null) {
            this.addedItems = new ArrayList<>();
        }
        this.addedItems.add(builder.apply(com.commercetools.history.models.common.PriceBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Elements added to the array.</p>
     * @param builder function to build the addedItems value
     * @return Builder
     */

    public SetPricesChangeBuilder withAddedItems(
            Function<com.commercetools.history.models.common.PriceBuilder, com.commercetools.history.models.common.PriceBuilder> builder) {
        this.addedItems = new ArrayList<>();
        this.addedItems.add(builder.apply(com.commercetools.history.models.common.PriceBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Elements added to the array.</p>
     * @param builder function to build the addedItems value
     * @return Builder
     */

    public SetPricesChangeBuilder addAddedItems(
            Function<com.commercetools.history.models.common.PriceBuilder, com.commercetools.history.models.common.Price> builder) {
        return plusAddedItems(builder.apply(com.commercetools.history.models.common.PriceBuilder.of()));
    }

    /**
     *  <p>Elements added to the array.</p>
     * @param builder function to build the addedItems value
     * @return Builder
     */

    public SetPricesChangeBuilder setAddedItems(
            Function<com.commercetools.history.models.common.PriceBuilder, com.commercetools.history.models.common.Price> builder) {
        return addedItems(builder.apply(com.commercetools.history.models.common.PriceBuilder.of()));
    }

    /**
     *  <p>Elements removed from the array.</p>
     * @param removedItems value to be set
     * @return Builder
     */

    public SetPricesChangeBuilder removedItems(final com.commercetools.history.models.common.Price... removedItems) {
        this.removedItems = new ArrayList<>(Arrays.asList(removedItems));
        return this;
    }

    /**
     *  <p>Elements removed from the array.</p>
     * @param removedItems value to be set
     * @return Builder
     */

    public SetPricesChangeBuilder removedItems(
            final java.util.List<com.commercetools.history.models.common.Price> removedItems) {
        this.removedItems = removedItems;
        return this;
    }

    /**
     *  <p>Elements removed from the array.</p>
     * @param removedItems value to be set
     * @return Builder
     */

    public SetPricesChangeBuilder plusRemovedItems(
            final com.commercetools.history.models.common.Price... removedItems) {
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

    public SetPricesChangeBuilder plusRemovedItems(
            Function<com.commercetools.history.models.common.PriceBuilder, com.commercetools.history.models.common.PriceBuilder> builder) {
        if (this.removedItems == null) {
            this.removedItems = new ArrayList<>();
        }
        this.removedItems.add(builder.apply(com.commercetools.history.models.common.PriceBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Elements removed from the array.</p>
     * @param builder function to build the removedItems value
     * @return Builder
     */

    public SetPricesChangeBuilder withRemovedItems(
            Function<com.commercetools.history.models.common.PriceBuilder, com.commercetools.history.models.common.PriceBuilder> builder) {
        this.removedItems = new ArrayList<>();
        this.removedItems.add(builder.apply(com.commercetools.history.models.common.PriceBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Elements removed from the array.</p>
     * @param builder function to build the removedItems value
     * @return Builder
     */

    public SetPricesChangeBuilder addRemovedItems(
            Function<com.commercetools.history.models.common.PriceBuilder, com.commercetools.history.models.common.Price> builder) {
        return plusRemovedItems(builder.apply(com.commercetools.history.models.common.PriceBuilder.of()));
    }

    /**
     *  <p>Elements removed from the array.</p>
     * @param builder function to build the removedItems value
     * @return Builder
     */

    public SetPricesChangeBuilder setRemovedItems(
            Function<com.commercetools.history.models.common.PriceBuilder, com.commercetools.history.models.common.Price> builder) {
        return removedItems(builder.apply(com.commercetools.history.models.common.PriceBuilder.of()));
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

    public java.util.List<com.commercetools.history.models.common.Price> getPreviousValue() {
        return this.previousValue;
    }

    /**
     *  <p>Value after the change.</p>
     * @return nextValue
     */

    public java.util.List<com.commercetools.history.models.common.Price> getNextValue() {
        return this.nextValue;
    }

    /**
     *  <p>Product data that was updated.</p>
     *  <ul>
     *   <li><code>staged</code>, if the staged <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductCatalogData" rel="nofollow">ProductCatalogData</a> was updated.</li>
     *   <li><code>current</code>, if the current <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductCatalogData" rel="nofollow">ProductCatalogData</a> was updated.</li>
     *  </ul>
     * @return catalogData
     */

    public String getCatalogData() {
        return this.catalogData;
    }

    /**
     *  <p>Identifier of the updated Product Variant.</p>
     *  <p>This field holds the SKU, if defined; otherwise the key; otherwise the ID.</p>
     * @return variant
     */

    public String getVariant() {
        return this.variant;
    }

    /**
     *  <p>Elements added to the array.</p>
     * @return addedItems
     */

    public java.util.List<com.commercetools.history.models.common.Price> getAddedItems() {
        return this.addedItems;
    }

    /**
     *  <p>Elements removed from the array.</p>
     * @return removedItems
     */

    public java.util.List<com.commercetools.history.models.common.Price> getRemovedItems() {
        return this.removedItems;
    }

    /**
     * builds SetPricesChange with checking for non-null required values
     * @return SetPricesChange
     */
    public SetPricesChange build() {
        Objects.requireNonNull(change, SetPricesChange.class + ": change is missing");
        Objects.requireNonNull(previousValue, SetPricesChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, SetPricesChange.class + ": nextValue is missing");
        Objects.requireNonNull(catalogData, SetPricesChange.class + ": catalogData is missing");
        Objects.requireNonNull(variant, SetPricesChange.class + ": variant is missing");
        Objects.requireNonNull(addedItems, SetPricesChange.class + ": addedItems is missing");
        Objects.requireNonNull(removedItems, SetPricesChange.class + ": removedItems is missing");
        return new SetPricesChangeImpl(change, previousValue, nextValue, catalogData, variant, addedItems,
            removedItems);
    }

    /**
     * builds SetPricesChange without checking for non-null required values
     * @return SetPricesChange
     */
    public SetPricesChange buildUnchecked() {
        return new SetPricesChangeImpl(change, previousValue, nextValue, catalogData, variant, addedItems,
            removedItems);
    }

    /**
     * factory method for an instance of SetPricesChangeBuilder
     * @return builder
     */
    public static SetPricesChangeBuilder of() {
        return new SetPricesChangeBuilder();
    }

    /**
     * create builder for SetPricesChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetPricesChangeBuilder of(final SetPricesChange template) {
        SetPricesChangeBuilder builder = new SetPricesChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        builder.catalogData = template.getCatalogData();
        builder.variant = template.getVariant();
        builder.addedItems = template.getAddedItems();
        builder.removedItems = template.getRemovedItems();
        return builder;
    }

}
