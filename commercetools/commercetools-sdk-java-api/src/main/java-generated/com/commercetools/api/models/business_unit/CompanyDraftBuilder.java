
package com.commercetools.api.models.business_unit;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CompanyDraftBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CompanyDraft companyDraft = CompanyDraft.builder()
 *             .key("{key}")
 *             .name("{name}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CompanyDraftBuilder implements Builder<CompanyDraft> {

    private String key;

    @Nullable
    private com.commercetools.api.models.business_unit.BusinessUnitStatus status;

    @Nullable
    private java.util.List<com.commercetools.api.models.store.StoreKeyReference> stores;

    @Nullable
    private com.commercetools.api.models.business_unit.BusinessUnitStoreMode storeMode;

    private String name;

    @Nullable
    private String contactEmail;

    @Nullable
    private java.util.List<com.commercetools.api.models.business_unit.AssociateDraft> associates;

    @Nullable
    private java.util.List<com.commercetools.api.models.common.BaseAddress> addresses;

    @Nullable
    private java.util.List<Integer> shippingAddresses;

    @Nullable
    private Integer defaultShipingAddress;

    @Nullable
    private java.util.List<Integer> billingAddresses;

    @Nullable
    private Integer defaultBillingAddress;

    @Nullable
    private com.commercetools.api.models.type.CustomFieldsDraft custom;

    /**
     *  <p>User-defined unique identifier for the Business Unit.</p>
     */

    public CompanyDraftBuilder key(final String key) {
        this.key = key;
        return this;
    }

    /**
     *  <p>Indicates whether the Business Unit can be edited and used in Orders.</p>
     */

    public CompanyDraftBuilder status(
            @Nullable final com.commercetools.api.models.business_unit.BusinessUnitStatus status) {
        this.status = status;
        return this;
    }

    /**
     *  <p>References to Stores the Business Unit is associated with. Can only be set when <code>storeMode</code> is <code>Explicit</code>. If not empty, the Business Unit can only be linked to Carts and Orders of a referenced Store. If empty, the Business Unit can only create Carts, Orders, or Quotes that have no <code>store</code> value. Defaults to empty for Companies and not set for Divisions.</p>
     */

    public CompanyDraftBuilder stores(@Nullable final com.commercetools.api.models.store.StoreKeyReference... stores) {
        this.stores = new ArrayList<>(Arrays.asList(stores));
        return this;
    }

    /**
     *  <p>References to Stores the Business Unit is associated with. Can only be set when <code>storeMode</code> is <code>Explicit</code>. If not empty, the Business Unit can only be linked to Carts and Orders of a referenced Store. If empty, the Business Unit can only create Carts, Orders, or Quotes that have no <code>store</code> value. Defaults to empty for Companies and not set for Divisions.</p>
     */

    public CompanyDraftBuilder stores(
            @Nullable final java.util.List<com.commercetools.api.models.store.StoreKeyReference> stores) {
        this.stores = stores;
        return this;
    }

    /**
     *  <p>References to Stores the Business Unit is associated with. Can only be set when <code>storeMode</code> is <code>Explicit</code>. If not empty, the Business Unit can only be linked to Carts and Orders of a referenced Store. If empty, the Business Unit can only create Carts, Orders, or Quotes that have no <code>store</code> value. Defaults to empty for Companies and not set for Divisions.</p>
     */

    public CompanyDraftBuilder plusStores(
            @Nullable final com.commercetools.api.models.store.StoreKeyReference... stores) {
        if (this.stores == null) {
            this.stores = new ArrayList<>();
        }
        this.stores.addAll(Arrays.asList(stores));
        return this;
    }

    /**
     *  <p>References to Stores the Business Unit is associated with. Can only be set when <code>storeMode</code> is <code>Explicit</code>. If not empty, the Business Unit can only be linked to Carts and Orders of a referenced Store. If empty, the Business Unit can only create Carts, Orders, or Quotes that have no <code>store</code> value. Defaults to empty for Companies and not set for Divisions.</p>
     */

    public CompanyDraftBuilder plusStores(
            Function<com.commercetools.api.models.store.StoreKeyReferenceBuilder, com.commercetools.api.models.store.StoreKeyReferenceBuilder> builder) {
        if (this.stores == null) {
            this.stores = new ArrayList<>();
        }
        this.stores.add(builder.apply(com.commercetools.api.models.store.StoreKeyReferenceBuilder.of()).build());
        return this;
    }

    /**
     *  <p>References to Stores the Business Unit is associated with. Can only be set when <code>storeMode</code> is <code>Explicit</code>. If not empty, the Business Unit can only be linked to Carts and Orders of a referenced Store. If empty, the Business Unit can only create Carts, Orders, or Quotes that have no <code>store</code> value. Defaults to empty for Companies and not set for Divisions.</p>
     */

    public CompanyDraftBuilder withStores(
            Function<com.commercetools.api.models.store.StoreKeyReferenceBuilder, com.commercetools.api.models.store.StoreKeyReferenceBuilder> builder) {
        this.stores = new ArrayList<>();
        this.stores.add(builder.apply(com.commercetools.api.models.store.StoreKeyReferenceBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Defines whether the Stores of the Business Unit are set on the Business Unit or are inherited from a parent. Defaults to <code>Explicit</code> for Companies and to <code>FromParent</code> for Divisions.</p>
     */

    public CompanyDraftBuilder storeMode(
            @Nullable final com.commercetools.api.models.business_unit.BusinessUnitStoreMode storeMode) {
        this.storeMode = storeMode;
        return this;
    }

    /**
     *  <p>Name of the Business Unit.</p>
     */

    public CompanyDraftBuilder name(final String name) {
        this.name = name;
        return this;
    }

    /**
     *  <p>Email address of the Business Unit.</p>
     */

    public CompanyDraftBuilder contactEmail(@Nullable final String contactEmail) {
        this.contactEmail = contactEmail;
        return this;
    }

    /**
     *  <p>List of members that are part of the Business Unit in specific roles.</p>
     */

    public CompanyDraftBuilder associates(
            @Nullable final com.commercetools.api.models.business_unit.AssociateDraft... associates) {
        this.associates = new ArrayList<>(Arrays.asList(associates));
        return this;
    }

    /**
     *  <p>List of members that are part of the Business Unit in specific roles.</p>
     */

    public CompanyDraftBuilder associates(
            @Nullable final java.util.List<com.commercetools.api.models.business_unit.AssociateDraft> associates) {
        this.associates = associates;
        return this;
    }

    /**
     *  <p>List of members that are part of the Business Unit in specific roles.</p>
     */

    public CompanyDraftBuilder plusAssociates(
            @Nullable final com.commercetools.api.models.business_unit.AssociateDraft... associates) {
        if (this.associates == null) {
            this.associates = new ArrayList<>();
        }
        this.associates.addAll(Arrays.asList(associates));
        return this;
    }

    /**
     *  <p>List of members that are part of the Business Unit in specific roles.</p>
     */

    public CompanyDraftBuilder plusAssociates(
            Function<com.commercetools.api.models.business_unit.AssociateDraftBuilder, com.commercetools.api.models.business_unit.AssociateDraftBuilder> builder) {
        if (this.associates == null) {
            this.associates = new ArrayList<>();
        }
        this.associates
                .add(builder.apply(com.commercetools.api.models.business_unit.AssociateDraftBuilder.of()).build());
        return this;
    }

    /**
     *  <p>List of members that are part of the Business Unit in specific roles.</p>
     */

    public CompanyDraftBuilder withAssociates(
            Function<com.commercetools.api.models.business_unit.AssociateDraftBuilder, com.commercetools.api.models.business_unit.AssociateDraftBuilder> builder) {
        this.associates = new ArrayList<>();
        this.associates
                .add(builder.apply(com.commercetools.api.models.business_unit.AssociateDraftBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Addresses used by the Business Unit.</p>
     */

    public CompanyDraftBuilder addresses(@Nullable final com.commercetools.api.models.common.BaseAddress... addresses) {
        this.addresses = new ArrayList<>(Arrays.asList(addresses));
        return this;
    }

    /**
     *  <p>Addresses used by the Business Unit.</p>
     */

    public CompanyDraftBuilder addresses(
            @Nullable final java.util.List<com.commercetools.api.models.common.BaseAddress> addresses) {
        this.addresses = addresses;
        return this;
    }

    /**
     *  <p>Addresses used by the Business Unit.</p>
     */

    public CompanyDraftBuilder plusAddresses(
            @Nullable final com.commercetools.api.models.common.BaseAddress... addresses) {
        if (this.addresses == null) {
            this.addresses = new ArrayList<>();
        }
        this.addresses.addAll(Arrays.asList(addresses));
        return this;
    }

    /**
     *  <p>Addresses used by the Business Unit.</p>
     */

    public CompanyDraftBuilder plusAddresses(
            Function<com.commercetools.api.models.common.BaseAddressBuilder, com.commercetools.api.models.common.BaseAddressBuilder> builder) {
        if (this.addresses == null) {
            this.addresses = new ArrayList<>();
        }
        this.addresses.add(builder.apply(com.commercetools.api.models.common.BaseAddressBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Addresses used by the Business Unit.</p>
     */

    public CompanyDraftBuilder withAddresses(
            Function<com.commercetools.api.models.common.BaseAddressBuilder, com.commercetools.api.models.common.BaseAddressBuilder> builder) {
        this.addresses = new ArrayList<>();
        this.addresses.add(builder.apply(com.commercetools.api.models.common.BaseAddressBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Indexes of entries in <code>addresses</code> to set as shipping addresses. The <code>shippingAddressIds</code> of the Customer will be replaced by these addresses.</p>
     */

    public CompanyDraftBuilder shippingAddresses(@Nullable final Integer... shippingAddresses) {
        this.shippingAddresses = new ArrayList<>(Arrays.asList(shippingAddresses));
        return this;
    }

    /**
     *  <p>Indexes of entries in <code>addresses</code> to set as shipping addresses. The <code>shippingAddressIds</code> of the Customer will be replaced by these addresses.</p>
     */

    public CompanyDraftBuilder shippingAddresses(@Nullable final java.util.List<Integer> shippingAddresses) {
        this.shippingAddresses = shippingAddresses;
        return this;
    }

    /**
     *  <p>Indexes of entries in <code>addresses</code> to set as shipping addresses. The <code>shippingAddressIds</code> of the Customer will be replaced by these addresses.</p>
     */

    public CompanyDraftBuilder plusShippingAddresses(@Nullable final Integer... shippingAddresses) {
        if (this.shippingAddresses == null) {
            this.shippingAddresses = new ArrayList<>();
        }
        this.shippingAddresses.addAll(Arrays.asList(shippingAddresses));
        return this;
    }

    /**
     *  <p>Index of the entry in <code>addresses</code> to set as the default shipping address.</p>
     */

    public CompanyDraftBuilder defaultShipingAddress(@Nullable final Integer defaultShipingAddress) {
        this.defaultShipingAddress = defaultShipingAddress;
        return this;
    }

    /**
     *  <p>Indexes of entries in <code>addresses</code> to set as billing addresses. The <code>billingAddressIds</code> of the Customer will be replaced by these addresses.</p>
     */

    public CompanyDraftBuilder billingAddresses(@Nullable final Integer... billingAddresses) {
        this.billingAddresses = new ArrayList<>(Arrays.asList(billingAddresses));
        return this;
    }

    /**
     *  <p>Indexes of entries in <code>addresses</code> to set as billing addresses. The <code>billingAddressIds</code> of the Customer will be replaced by these addresses.</p>
     */

    public CompanyDraftBuilder billingAddresses(@Nullable final java.util.List<Integer> billingAddresses) {
        this.billingAddresses = billingAddresses;
        return this;
    }

    /**
     *  <p>Indexes of entries in <code>addresses</code> to set as billing addresses. The <code>billingAddressIds</code> of the Customer will be replaced by these addresses.</p>
     */

    public CompanyDraftBuilder plusBillingAddresses(@Nullable final Integer... billingAddresses) {
        if (this.billingAddresses == null) {
            this.billingAddresses = new ArrayList<>();
        }
        this.billingAddresses.addAll(Arrays.asList(billingAddresses));
        return this;
    }

    /**
     *  <p>Index of the entry in <code>addresses</code> to set as the default billing address.</p>
     */

    public CompanyDraftBuilder defaultBillingAddress(@Nullable final Integer defaultBillingAddress) {
        this.defaultBillingAddress = defaultBillingAddress;
        return this;
    }

    /**
     *  <p>Custom Fields for the Business Unit.</p>
     */

    public CompanyDraftBuilder custom(
            Function<com.commercetools.api.models.type.CustomFieldsDraftBuilder, com.commercetools.api.models.type.CustomFieldsDraftBuilder> builder) {
        this.custom = builder.apply(com.commercetools.api.models.type.CustomFieldsDraftBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Custom Fields for the Business Unit.</p>
     */

    public CompanyDraftBuilder custom(@Nullable final com.commercetools.api.models.type.CustomFieldsDraft custom) {
        this.custom = custom;
        return this;
    }

    public String getKey() {
        return this.key;
    }

    @Nullable
    public com.commercetools.api.models.business_unit.BusinessUnitStatus getStatus() {
        return this.status;
    }

    @Nullable
    public java.util.List<com.commercetools.api.models.store.StoreKeyReference> getStores() {
        return this.stores;
    }

    @Nullable
    public com.commercetools.api.models.business_unit.BusinessUnitStoreMode getStoreMode() {
        return this.storeMode;
    }

    public String getName() {
        return this.name;
    }

    @Nullable
    public String getContactEmail() {
        return this.contactEmail;
    }

    @Nullable
    public java.util.List<com.commercetools.api.models.business_unit.AssociateDraft> getAssociates() {
        return this.associates;
    }

    @Nullable
    public java.util.List<com.commercetools.api.models.common.BaseAddress> getAddresses() {
        return this.addresses;
    }

    @Nullable
    public java.util.List<Integer> getShippingAddresses() {
        return this.shippingAddresses;
    }

    @Nullable
    public Integer getDefaultShipingAddress() {
        return this.defaultShipingAddress;
    }

    @Nullable
    public java.util.List<Integer> getBillingAddresses() {
        return this.billingAddresses;
    }

    @Nullable
    public Integer getDefaultBillingAddress() {
        return this.defaultBillingAddress;
    }

    @Nullable
    public com.commercetools.api.models.type.CustomFieldsDraft getCustom() {
        return this.custom;
    }

    public CompanyDraft build() {
        Objects.requireNonNull(key, CompanyDraft.class + ": key is missing");
        Objects.requireNonNull(name, CompanyDraft.class + ": name is missing");
        return new CompanyDraftImpl(key, status, stores, storeMode, name, contactEmail, associates, addresses,
            shippingAddresses, defaultShipingAddress, billingAddresses, defaultBillingAddress, custom);
    }

    /**
     * builds CompanyDraft without checking for non null required values
     */
    public CompanyDraft buildUnchecked() {
        return new CompanyDraftImpl(key, status, stores, storeMode, name, contactEmail, associates, addresses,
            shippingAddresses, defaultShipingAddress, billingAddresses, defaultBillingAddress, custom);
    }

    public static CompanyDraftBuilder of() {
        return new CompanyDraftBuilder();
    }

    public static CompanyDraftBuilder of(final CompanyDraft template) {
        CompanyDraftBuilder builder = new CompanyDraftBuilder();
        builder.key = template.getKey();
        builder.status = template.getStatus();
        builder.stores = template.getStores();
        builder.storeMode = template.getStoreMode();
        builder.name = template.getName();
        builder.contactEmail = template.getContactEmail();
        builder.associates = template.getAssociates();
        builder.addresses = template.getAddresses();
        builder.shippingAddresses = template.getShippingAddresses();
        builder.defaultShipingAddress = template.getDefaultShipingAddress();
        builder.billingAddresses = template.getBillingAddresses();
        builder.defaultBillingAddress = template.getDefaultBillingAddress();
        builder.custom = template.getCustom();
        return builder;
    }

}
