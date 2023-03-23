
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
     * @param addedProductSelections
     * @return Builder
     */

    public StoreProductSelectionsChangedMessagePayloadBuilder addedProductSelections(
            @Nullable final com.commercetools.api.models.store.ProductSelectionSetting... addedProductSelections) {
        this.addedProductSelections = new ArrayList<>(Arrays.asList(addedProductSelections));
        return this;
    }

    /**
     *  <p>ProductSelectionSettings that were added to the Store.</p>
     * @param addedProductSelections
     * @return Builder
     */

    public StoreProductSelectionsChangedMessagePayloadBuilder addedProductSelections(
            @Nullable final java.util.List<com.commercetools.api.models.store.ProductSelectionSetting> addedProductSelections) {
        this.addedProductSelections = addedProductSelections;
        return this;
    }

    /**
     *  <p>ProductSelectionSettings that were added to the Store.</p>
     * @param addedProductSelections
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
     *  <p>ProductSelectionSettings that were removed from the Store.</p>
     * @param removedProductSelections
     * @return Builder
     */

    public StoreProductSelectionsChangedMessagePayloadBuilder removedProductSelections(
            @Nullable final com.commercetools.api.models.store.ProductSelectionSetting... removedProductSelections) {
        this.removedProductSelections = new ArrayList<>(Arrays.asList(removedProductSelections));
        return this;
    }

    /**
     *  <p>ProductSelectionSettings that were removed from the Store.</p>
     * @param removedProductSelections
     * @return Builder
     */

    public StoreProductSelectionsChangedMessagePayloadBuilder removedProductSelections(
            @Nullable final java.util.List<com.commercetools.api.models.store.ProductSelectionSetting> removedProductSelections) {
        this.removedProductSelections = removedProductSelections;
        return this;
    }

    /**
     *  <p>ProductSelectionSettings that were removed from the Store.</p>
     * @param removedProductSelections
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
     *  <p>ProductSelectionSettings that were updated in the Store.</p>
     * @param updatedProductSelections
     * @return Builder
     */

    public StoreProductSelectionsChangedMessagePayloadBuilder updatedProductSelections(
            @Nullable final com.commercetools.api.models.store.ProductSelectionSetting... updatedProductSelections) {
        this.updatedProductSelections = new ArrayList<>(Arrays.asList(updatedProductSelections));
        return this;
    }

    /**
     *  <p>ProductSelectionSettings that were updated in the Store.</p>
     * @param updatedProductSelections
     * @return Builder
     */

    public StoreProductSelectionsChangedMessagePayloadBuilder updatedProductSelections(
            @Nullable final java.util.List<com.commercetools.api.models.store.ProductSelectionSetting> updatedProductSelections) {
        this.updatedProductSelections = updatedProductSelections;
        return this;
    }

    /**
     *  <p>ProductSelectionSettings that were updated in the Store.</p>
     * @param updatedProductSelections
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
     * @return Builder
     */

    public StoreProductSelectionsChangedMessagePayloadBuilder withUpdatedProductSelections(
            Function<com.commercetools.api.models.store.ProductSelectionSettingBuilder, com.commercetools.api.models.store.ProductSelectionSettingBuilder> builder) {
        this.updatedProductSelections = new ArrayList<>();
        this.updatedProductSelections
                .add(builder.apply(com.commercetools.api.models.store.ProductSelectionSettingBuilder.of()).build());
        return this;
    }

    @Nullable
    public java.util.List<com.commercetools.api.models.store.ProductSelectionSetting> getAddedProductSelections() {
        return this.addedProductSelections;
    }

    @Nullable
    public java.util.List<com.commercetools.api.models.store.ProductSelectionSetting> getRemovedProductSelections() {
        return this.removedProductSelections;
    }

    @Nullable
    public java.util.List<com.commercetools.api.models.store.ProductSelectionSetting> getUpdatedProductSelections() {
        return this.updatedProductSelections;
    }

    public StoreProductSelectionsChangedMessagePayload build() {
        return new StoreProductSelectionsChangedMessagePayloadImpl(addedProductSelections, removedProductSelections,
            updatedProductSelections);
    }

    /**
     * builds StoreProductSelectionsChangedMessagePayload without checking for non null required values
     */
    public StoreProductSelectionsChangedMessagePayload buildUnchecked() {
        return new StoreProductSelectionsChangedMessagePayloadImpl(addedProductSelections, removedProductSelections,
            updatedProductSelections);
    }

    public static StoreProductSelectionsChangedMessagePayloadBuilder of() {
        return new StoreProductSelectionsChangedMessagePayloadBuilder();
    }

    public static StoreProductSelectionsChangedMessagePayloadBuilder of(
            final StoreProductSelectionsChangedMessagePayload template) {
        StoreProductSelectionsChangedMessagePayloadBuilder builder = new StoreProductSelectionsChangedMessagePayloadBuilder();
        builder.addedProductSelections = template.getAddedProductSelections();
        builder.removedProductSelections = template.getRemovedProductSelections();
        builder.updatedProductSelections = template.getUpdatedProductSelections();
        return builder;
    }

}
