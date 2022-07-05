
package com.commercetools.api.models.order;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * DeliveryDraftBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     DeliveryDraft deliveryDraft = DeliveryDraft.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class DeliveryDraftBuilder implements Builder<DeliveryDraft> {

    @Nullable
    private java.util.List<com.commercetools.api.models.order.DeliveryItem> items;

    @Nullable
    private java.util.List<com.commercetools.api.models.order.ParcelDraft> parcels;

    @Nullable
    private com.commercetools.api.models.common.AddressDraft address;

    @Nullable
    private com.commercetools.api.models.type.CustomFieldsDraft custom;

    /**
     *  <p>Items which are shipped in this delivery regardless their distribution over several parcels. Can also be specified individually for each Parcel.</p>
     */

    public DeliveryDraftBuilder items(@Nullable final com.commercetools.api.models.order.DeliveryItem... items) {
        this.items = new ArrayList<>(Arrays.asList(items));
        return this;
    }

    /**
     *  <p>Items which are shipped in this delivery regardless their distribution over several parcels. Can also be specified individually for each Parcel.</p>
     */

    public DeliveryDraftBuilder items(
            @Nullable final java.util.List<com.commercetools.api.models.order.DeliveryItem> items) {
        this.items = items;
        return this;
    }

    /**
     *  <p>Items which are shipped in this delivery regardless their distribution over several parcels. Can also be specified individually for each Parcel.</p>
     */

    public DeliveryDraftBuilder plusItems(@Nullable final com.commercetools.api.models.order.DeliveryItem... items) {
        if (this.items == null) {
            this.items = new ArrayList<>();
        }
        this.items.addAll(Arrays.asList(items));
        return this;
    }

    /**
     *  <p>Items which are shipped in this delivery regardless their distribution over several parcels. Can also be specified individually for each Parcel.</p>
     */

    public DeliveryDraftBuilder plusItems(
            Function<com.commercetools.api.models.order.DeliveryItemBuilder, com.commercetools.api.models.order.DeliveryItemBuilder> builder) {
        if (this.items == null) {
            this.items = new ArrayList<>();
        }
        this.items.add(builder.apply(com.commercetools.api.models.order.DeliveryItemBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Items which are shipped in this delivery regardless their distribution over several parcels. Can also be specified individually for each Parcel.</p>
     */

    public DeliveryDraftBuilder withItems(
            Function<com.commercetools.api.models.order.DeliveryItemBuilder, com.commercetools.api.models.order.DeliveryItemBuilder> builder) {
        this.items = new ArrayList<>();
        this.items.add(builder.apply(com.commercetools.api.models.order.DeliveryItemBuilder.of()).build());
        return this;
    }

    /**
     *
     */

    public DeliveryDraftBuilder parcels(@Nullable final com.commercetools.api.models.order.ParcelDraft... parcels) {
        this.parcels = new ArrayList<>(Arrays.asList(parcels));
        return this;
    }

    /**
     *
     */

    public DeliveryDraftBuilder parcels(
            @Nullable final java.util.List<com.commercetools.api.models.order.ParcelDraft> parcels) {
        this.parcels = parcels;
        return this;
    }

    /**
     *
     */

    public DeliveryDraftBuilder plusParcels(@Nullable final com.commercetools.api.models.order.ParcelDraft... parcels) {
        if (this.parcels == null) {
            this.parcels = new ArrayList<>();
        }
        this.parcels.addAll(Arrays.asList(parcels));
        return this;
    }

    /**
     *
     */

    public DeliveryDraftBuilder plusParcels(
            Function<com.commercetools.api.models.order.ParcelDraftBuilder, com.commercetools.api.models.order.ParcelDraftBuilder> builder) {
        if (this.parcels == null) {
            this.parcels = new ArrayList<>();
        }
        this.parcels.add(builder.apply(com.commercetools.api.models.order.ParcelDraftBuilder.of()).build());
        return this;
    }

    /**
     *
     */

    public DeliveryDraftBuilder withParcels(
            Function<com.commercetools.api.models.order.ParcelDraftBuilder, com.commercetools.api.models.order.ParcelDraftBuilder> builder) {
        this.parcels = new ArrayList<>();
        this.parcels.add(builder.apply(com.commercetools.api.models.order.ParcelDraftBuilder.of()).build());
        return this;
    }

    /**
     *
     */

    public DeliveryDraftBuilder address(
            Function<com.commercetools.api.models.common.AddressDraftBuilder, com.commercetools.api.models.common.AddressDraftBuilder> builder) {
        this.address = builder.apply(com.commercetools.api.models.common.AddressDraftBuilder.of()).build();
        return this;
    }

    /**
     *
     */

    public DeliveryDraftBuilder address(@Nullable final com.commercetools.api.models.common.AddressDraft address) {
        this.address = address;
        return this;
    }

    /**
     *  <p>Custom Fields for the Transaction.</p>
     */

    public DeliveryDraftBuilder custom(
            Function<com.commercetools.api.models.type.CustomFieldsDraftBuilder, com.commercetools.api.models.type.CustomFieldsDraftBuilder> builder) {
        this.custom = builder.apply(com.commercetools.api.models.type.CustomFieldsDraftBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Custom Fields for the Transaction.</p>
     */

    public DeliveryDraftBuilder custom(@Nullable final com.commercetools.api.models.type.CustomFieldsDraft custom) {
        this.custom = custom;
        return this;
    }

    @Nullable
    public java.util.List<com.commercetools.api.models.order.DeliveryItem> getItems() {
        return this.items;
    }

    @Nullable
    public java.util.List<com.commercetools.api.models.order.ParcelDraft> getParcels() {
        return this.parcels;
    }

    @Nullable
    public com.commercetools.api.models.common.AddressDraft getAddress() {
        return this.address;
    }

    @Nullable
    public com.commercetools.api.models.type.CustomFieldsDraft getCustom() {
        return this.custom;
    }

    public DeliveryDraft build() {
        return new DeliveryDraftImpl(items, parcels, address, custom);
    }

    /**
     * builds DeliveryDraft without checking for non null required values
     */
    public DeliveryDraft buildUnchecked() {
        return new DeliveryDraftImpl(items, parcels, address, custom);
    }

    public static DeliveryDraftBuilder of() {
        return new DeliveryDraftBuilder();
    }

    public static DeliveryDraftBuilder of(final DeliveryDraft template) {
        DeliveryDraftBuilder builder = new DeliveryDraftBuilder();
        builder.items = template.getItems();
        builder.parcels = template.getParcels();
        builder.address = template.getAddress();
        builder.custom = template.getCustom();
        return builder;
    }

}
