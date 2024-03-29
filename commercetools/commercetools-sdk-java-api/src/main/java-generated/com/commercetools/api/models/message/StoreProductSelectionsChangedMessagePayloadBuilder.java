
package com.commercetools.api.models.message;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * StoreProductSelectionsChangedMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StoreProductSelectionsChangedMessagePayload storeProductSelectionsChangedMessagePayload = StoreProductSelectionsChangedMessagePayload.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StoreProductSelectionsChangedMessagePayloadBuilder
        implements Builder<StoreProductSelectionsChangedMessagePayload> {

    @Nullable
    private java.util.List<com.commercetools.api.models.store.ProductSelectionSetting> addedProductSelections;

    @Nullable
    private java.util.List<com.commercetools.api.models.store.ProductSelectionSetting> removedProductSelections;

    @Nullable
    private java.util.List<com.commercetools.api.models.store.ProductSelectionSetting> updatedProductSelections;

    /**
     *  <p>ProductSelectionSettings that were added to the Store.</p>
     * @param addedProductSelections value to be set
     * @return Builder
     */

    public StoreProductSelectionsChangedMessagePayloadBuilder addedProductSelections(
            @Nullable final com.commercetools.api.models.store.ProductSelectionSetting... addedProductSelections) {
        this.addedProductSelections = new ArrayList<>(Arrays.asList(addedProductSelections));
        return this;
    }

    /**
     *  <p>ProductSelectionSettings that were added to the Store.</p>
     * @param addedProductSelections value to be set
     * @return Builder
     */

    public StoreProductSelectionsChangedMessagePayloadBuilder addedProductSelections(
            @Nullable final java.util.List<com.commercetools.api.models.store.ProductSelectionSetting> addedProductSelections) {
        this.addedProductSelections = addedProductSelections;
        return this;
    }

    /**
     *  <p>ProductSelectionSettings that were added to the Store.</p>
     * @param addedProductSelections value to be set
     * @return Builder
     */

    public StoreProductSelectionsChangedMessagePayloadBuilder plusAddedProductSelections(
            @Nullable final com.commercetools.api.models.store.ProductSelectionSetting... addedProductSelections) {
        if (this.addedProductSelections == null) {
            this.addedProductSelections = new ArrayList<>();
        }
        this.addedProductSelections.addAll(Arrays.asList(addedProductSelections));
        return this;
    }

    /**
     *  <p>ProductSelectionSettings that were added to the Store.</p>
     * @param builder function to build the addedProductSelections value
     * @return Builder
     */

    public StoreProductSelectionsChangedMessagePayloadBuilder plusAddedProductSelections(
            Function<com.commercetools.api.models.store.ProductSelectionSettingBuilder, com.commercetools.api.models.store.ProductSelectionSettingBuilder> builder) {
        if (this.addedProductSelections == null) {
            this.addedProductSelections = new ArrayList<>();
        }
        this.addedProductSelections
                .add(builder.apply(com.commercetools.api.models.store.ProductSelectionSettingBuilder.of()).build());
        return this;
    }

    /**
     *  <p>ProductSelectionSettings that were added to the Store.</p>
     * @param builder function to build the addedProductSelections value
     * @return Builder
     */

    public StoreProductSelectionsChangedMessagePayloadBuilder withAddedProductSelections(
            Function<com.commercetools.api.models.store.ProductSelectionSettingBuilder, com.commercetools.api.models.store.ProductSelectionSettingBuilder> builder) {
        this.addedProductSelections = new ArrayList<>();
        this.addedProductSelections
                .add(builder.apply(com.commercetools.api.models.store.ProductSelectionSettingBuilder.of()).build());
        return this;
    }

    /**
     *  <p>ProductSelectionSettings that were added to the Store.</p>
     * @param builder function to build the addedProductSelections value
     * @return Builder
     */

    public StoreProductSelectionsChangedMessagePayloadBuilder addAddedProductSelections(
            Function<com.commercetools.api.models.store.ProductSelectionSettingBuilder, com.commercetools.api.models.store.ProductSelectionSetting> builder) {
        return plusAddedProductSelections(
            builder.apply(com.commercetools.api.models.store.ProductSelectionSettingBuilder.of()));
    }

    /**
     *  <p>ProductSelectionSettings that were added to the Store.</p>
     * @param builder function to build the addedProductSelections value
     * @return Builder
     */

    public StoreProductSelectionsChangedMessagePayloadBuilder setAddedProductSelections(
            Function<com.commercetools.api.models.store.ProductSelectionSettingBuilder, com.commercetools.api.models.store.ProductSelectionSetting> builder) {
        return addedProductSelections(
            builder.apply(com.commercetools.api.models.store.ProductSelectionSettingBuilder.of()));
    }

    /**
     *  <p>ProductSelectionSettings that were removed from the Store.</p>
     * @param removedProductSelections value to be set
     * @return Builder
     */

    public StoreProductSelectionsChangedMessagePayloadBuilder removedProductSelections(
            @Nullable final com.commercetools.api.models.store.ProductSelectionSetting... removedProductSelections) {
        this.removedProductSelections = new ArrayList<>(Arrays.asList(removedProductSelections));
        return this;
    }

    /**
     *  <p>ProductSelectionSettings that were removed from the Store.</p>
     * @param removedProductSelections value to be set
     * @return Builder
     */

    public StoreProductSelectionsChangedMessagePayloadBuilder removedProductSelections(
            @Nullable final java.util.List<com.commercetools.api.models.store.ProductSelectionSetting> removedProductSelections) {
        this.removedProductSelections = removedProductSelections;
        return this;
    }

    /**
     *  <p>ProductSelectionSettings that were removed from the Store.</p>
     * @param removedProductSelections value to be set
     * @return Builder
     */

    public StoreProductSelectionsChangedMessagePayloadBuilder plusRemovedProductSelections(
            @Nullable final com.commercetools.api.models.store.ProductSelectionSetting... removedProductSelections) {
        if (this.removedProductSelections == null) {
            this.removedProductSelections = new ArrayList<>();
        }
        this.removedProductSelections.addAll(Arrays.asList(removedProductSelections));
        return this;
    }

    /**
     *  <p>ProductSelectionSettings that were removed from the Store.</p>
     * @param builder function to build the removedProductSelections value
     * @return Builder
     */

    public StoreProductSelectionsChangedMessagePayloadBuilder plusRemovedProductSelections(
            Function<com.commercetools.api.models.store.ProductSelectionSettingBuilder, com.commercetools.api.models.store.ProductSelectionSettingBuilder> builder) {
        if (this.removedProductSelections == null) {
            this.removedProductSelections = new ArrayList<>();
        }
        this.removedProductSelections
                .add(builder.apply(com.commercetools.api.models.store.ProductSelectionSettingBuilder.of()).build());
        return this;
    }

    /**
     *  <p>ProductSelectionSettings that were removed from the Store.</p>
     * @param builder function to build the removedProductSelections value
     * @return Builder
     */

    public StoreProductSelectionsChangedMessagePayloadBuilder withRemovedProductSelections(
            Function<com.commercetools.api.models.store.ProductSelectionSettingBuilder, com.commercetools.api.models.store.ProductSelectionSettingBuilder> builder) {
        this.removedProductSelections = new ArrayList<>();
        this.removedProductSelections
                .add(builder.apply(com.commercetools.api.models.store.ProductSelectionSettingBuilder.of()).build());
        return this;
    }

    /**
     *  <p>ProductSelectionSettings that were removed from the Store.</p>
     * @param builder function to build the removedProductSelections value
     * @return Builder
     */

    public StoreProductSelectionsChangedMessagePayloadBuilder addRemovedProductSelections(
            Function<com.commercetools.api.models.store.ProductSelectionSettingBuilder, com.commercetools.api.models.store.ProductSelectionSetting> builder) {
        return plusRemovedProductSelections(
            builder.apply(com.commercetools.api.models.store.ProductSelectionSettingBuilder.of()));
    }

    /**
     *  <p>ProductSelectionSettings that were removed from the Store.</p>
     * @param builder function to build the removedProductSelections value
     * @return Builder
     */

    public StoreProductSelectionsChangedMessagePayloadBuilder setRemovedProductSelections(
            Function<com.commercetools.api.models.store.ProductSelectionSettingBuilder, com.commercetools.api.models.store.ProductSelectionSetting> builder) {
        return removedProductSelections(
            builder.apply(com.commercetools.api.models.store.ProductSelectionSettingBuilder.of()));
    }

    /**
     *  <p>ProductSelectionSettings that were updated in the Store.</p>
     * @param updatedProductSelections value to be set
     * @return Builder
     */

    public StoreProductSelectionsChangedMessagePayloadBuilder updatedProductSelections(
            @Nullable final com.commercetools.api.models.store.ProductSelectionSetting... updatedProductSelections) {
        this.updatedProductSelections = new ArrayList<>(Arrays.asList(updatedProductSelections));
        return this;
    }

    /**
     *  <p>ProductSelectionSettings that were updated in the Store.</p>
     * @param updatedProductSelections value to be set
     * @return Builder
     */

    public StoreProductSelectionsChangedMessagePayloadBuilder updatedProductSelections(
            @Nullable final java.util.List<com.commercetools.api.models.store.ProductSelectionSetting> updatedProductSelections) {
        this.updatedProductSelections = updatedProductSelections;
        return this;
    }

    /**
     *  <p>ProductSelectionSettings that were updated in the Store.</p>
     * @param updatedProductSelections value to be set
     * @return Builder
     */

    public StoreProductSelectionsChangedMessagePayloadBuilder plusUpdatedProductSelections(
            @Nullable final com.commercetools.api.models.store.ProductSelectionSetting... updatedProductSelections) {
        if (this.updatedProductSelections == null) {
            this.updatedProductSelections = new ArrayList<>();
        }
        this.updatedProductSelections.addAll(Arrays.asList(updatedProductSelections));
        return this;
    }

    /**
     *  <p>ProductSelectionSettings that were updated in the Store.</p>
     * @param builder function to build the updatedProductSelections value
     * @return Builder
     */

    public StoreProductSelectionsChangedMessagePayloadBuilder plusUpdatedProductSelections(
            Function<com.commercetools.api.models.store.ProductSelectionSettingBuilder, com.commercetools.api.models.store.ProductSelectionSettingBuilder> builder) {
        if (this.updatedProductSelections == null) {
            this.updatedProductSelections = new ArrayList<>();
        }
        this.updatedProductSelections
                .add(builder.apply(com.commercetools.api.models.store.ProductSelectionSettingBuilder.of()).build());
        return this;
    }

    /**
     *  <p>ProductSelectionSettings that were updated in the Store.</p>
     * @param builder function to build the updatedProductSelections value
     * @return Builder
     */

    public StoreProductSelectionsChangedMessagePayloadBuilder withUpdatedProductSelections(
            Function<com.commercetools.api.models.store.ProductSelectionSettingBuilder, com.commercetools.api.models.store.ProductSelectionSettingBuilder> builder) {
        this.updatedProductSelections = new ArrayList<>();
        this.updatedProductSelections
                .add(builder.apply(com.commercetools.api.models.store.ProductSelectionSettingBuilder.of()).build());
        return this;
    }

    /**
     *  <p>ProductSelectionSettings that were updated in the Store.</p>
     * @param builder function to build the updatedProductSelections value
     * @return Builder
     */

    public StoreProductSelectionsChangedMessagePayloadBuilder addUpdatedProductSelections(
            Function<com.commercetools.api.models.store.ProductSelectionSettingBuilder, com.commercetools.api.models.store.ProductSelectionSetting> builder) {
        return plusUpdatedProductSelections(
            builder.apply(com.commercetools.api.models.store.ProductSelectionSettingBuilder.of()));
    }

    /**
     *  <p>ProductSelectionSettings that were updated in the Store.</p>
     * @param builder function to build the updatedProductSelections value
     * @return Builder
     */

    public StoreProductSelectionsChangedMessagePayloadBuilder setUpdatedProductSelections(
            Function<com.commercetools.api.models.store.ProductSelectionSettingBuilder, com.commercetools.api.models.store.ProductSelectionSetting> builder) {
        return updatedProductSelections(
            builder.apply(com.commercetools.api.models.store.ProductSelectionSettingBuilder.of()));
    }

    /**
     *  <p>ProductSelectionSettings that were added to the Store.</p>
     * @return addedProductSelections
     */

    @Nullable
    public java.util.List<com.commercetools.api.models.store.ProductSelectionSetting> getAddedProductSelections() {
        return this.addedProductSelections;
    }

    /**
     *  <p>ProductSelectionSettings that were removed from the Store.</p>
     * @return removedProductSelections
     */

    @Nullable
    public java.util.List<com.commercetools.api.models.store.ProductSelectionSetting> getRemovedProductSelections() {
        return this.removedProductSelections;
    }

    /**
     *  <p>ProductSelectionSettings that were updated in the Store.</p>
     * @return updatedProductSelections
     */

    @Nullable
    public java.util.List<com.commercetools.api.models.store.ProductSelectionSetting> getUpdatedProductSelections() {
        return this.updatedProductSelections;
    }

    /**
     * builds StoreProductSelectionsChangedMessagePayload with checking for non-null required values
     * @return StoreProductSelectionsChangedMessagePayload
     */
    public StoreProductSelectionsChangedMessagePayload build() {
        return new StoreProductSelectionsChangedMessagePayloadImpl(addedProductSelections, removedProductSelections,
            updatedProductSelections);
    }

    /**
     * builds StoreProductSelectionsChangedMessagePayload without checking for non-null required values
     * @return StoreProductSelectionsChangedMessagePayload
     */
    public StoreProductSelectionsChangedMessagePayload buildUnchecked() {
        return new StoreProductSelectionsChangedMessagePayloadImpl(addedProductSelections, removedProductSelections,
            updatedProductSelections);
    }

    /**
     * factory method for an instance of StoreProductSelectionsChangedMessagePayloadBuilder
     * @return builder
     */
    public static StoreProductSelectionsChangedMessagePayloadBuilder of() {
        return new StoreProductSelectionsChangedMessagePayloadBuilder();
    }

    /**
     * create builder for StoreProductSelectionsChangedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StoreProductSelectionsChangedMessagePayloadBuilder of(
            final StoreProductSelectionsChangedMessagePayload template) {
        StoreProductSelectionsChangedMessagePayloadBuilder builder = new StoreProductSelectionsChangedMessagePayloadBuilder();
        builder.addedProductSelections = template.getAddedProductSelections();
        builder.removedProductSelections = template.getRemovedProductSelections();
        builder.updatedProductSelections = template.getUpdatedProductSelections();
        return builder;
    }

}
