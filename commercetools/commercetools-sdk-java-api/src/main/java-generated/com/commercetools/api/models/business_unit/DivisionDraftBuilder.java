
package com.commercetools.api.models.business_unit;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * DivisionDraftBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     DivisionDraft divisionDraft = DivisionDraft.builder()
 *             .key("{key}")
 *             .name("{name}")
 *             .parentUnit(parentUnitBuilder -> parentUnitBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class DivisionDraftBuilder implements Builder<DivisionDraft> {

    private String key;

    @Nullable
    private com.commercetools.api.models.business_unit.BusinessUnitStatus status;

    @Nullable
    private java.util.List<com.commercetools.api.models.store.StoreResourceIdentifier> stores;

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
    private Integer defaultShippingAddress;

    @Nullable
    private java.util.List<Integer> billingAddresses;

    @Nullable
    private Integer defaultBillingAddress;

    @Nullable
    private com.commercetools.api.models.type.CustomFieldsDraft custom;

    private com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifier parentUnit;

    /**
     *  <p>User-defined unique identifier for the Business Unit.</p>
     * @param key value to be set
     * @return Builder
     */

    public DivisionDraftBuilder key(final String key) {
        this.key = key;
        return this;
    }

    /**
     *  <p>Indicates whether the Business Unit can be edited and used in Orders.</p>
     * @param status value to be set
     * @return Builder
     */

    public DivisionDraftBuilder status(
            @Nullable final com.commercetools.api.models.business_unit.BusinessUnitStatus status) {
        this.status = status;
        return this;
    }

    /**
     *  <p>Sets the Stores the Business Unit is associated with. Can only be set when <code>storeMode</code> is <code>Explicit</code>. Defaults to empty for Companies and not set for Divisions.</p>
     *  <p>If the Business Unit has Stores defined, then all of its Carts, Orders, Quotes, or Quote Requests must belong to one of the Business Unit's Stores.</p>
     *  <p>If the Business Unit has no Stores, then all of its Carts, Orders, Quotes, or Quote Requests must not belong to any Store.</p>
     * @param stores value to be set
     * @return Builder
     */

    public DivisionDraftBuilder stores(
            @Nullable final com.commercetools.api.models.store.StoreResourceIdentifier... stores) {
        this.stores = new ArrayList<>(Arrays.asList(stores));
        return this;
    }

    /**
     *  <p>Sets the Stores the Business Unit is associated with. Can only be set when <code>storeMode</code> is <code>Explicit</code>. Defaults to empty for Companies and not set for Divisions.</p>
     *  <p>If the Business Unit has Stores defined, then all of its Carts, Orders, Quotes, or Quote Requests must belong to one of the Business Unit's Stores.</p>
     *  <p>If the Business Unit has no Stores, then all of its Carts, Orders, Quotes, or Quote Requests must not belong to any Store.</p>
     * @param stores value to be set
     * @return Builder
     */

    public DivisionDraftBuilder stores(
            @Nullable final java.util.List<com.commercetools.api.models.store.StoreResourceIdentifier> stores) {
        this.stores = stores;
        return this;
    }

    /**
     *  <p>Sets the Stores the Business Unit is associated with. Can only be set when <code>storeMode</code> is <code>Explicit</code>. Defaults to empty for Companies and not set for Divisions.</p>
     *  <p>If the Business Unit has Stores defined, then all of its Carts, Orders, Quotes, or Quote Requests must belong to one of the Business Unit's Stores.</p>
     *  <p>If the Business Unit has no Stores, then all of its Carts, Orders, Quotes, or Quote Requests must not belong to any Store.</p>
     * @param stores value to be set
     * @return Builder
     */

    public DivisionDraftBuilder plusStores(
            @Nullable final com.commercetools.api.models.store.StoreResourceIdentifier... stores) {
        if (this.stores == null) {
            this.stores = new ArrayList<>();
        }
        this.stores.addAll(Arrays.asList(stores));
        return this;
    }

    /**
     *  <p>Sets the Stores the Business Unit is associated with. Can only be set when <code>storeMode</code> is <code>Explicit</code>. Defaults to empty for Companies and not set for Divisions.</p>
     *  <p>If the Business Unit has Stores defined, then all of its Carts, Orders, Quotes, or Quote Requests must belong to one of the Business Unit's Stores.</p>
     *  <p>If the Business Unit has no Stores, then all of its Carts, Orders, Quotes, or Quote Requests must not belong to any Store.</p>
     * @param builder function to build the stores value
     * @return Builder
     */

    public DivisionDraftBuilder plusStores(
            Function<com.commercetools.api.models.store.StoreResourceIdentifierBuilder, com.commercetools.api.models.store.StoreResourceIdentifierBuilder> builder) {
        if (this.stores == null) {
            this.stores = new ArrayList<>();
        }
        this.stores.add(builder.apply(com.commercetools.api.models.store.StoreResourceIdentifierBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Sets the Stores the Business Unit is associated with. Can only be set when <code>storeMode</code> is <code>Explicit</code>. Defaults to empty for Companies and not set for Divisions.</p>
     *  <p>If the Business Unit has Stores defined, then all of its Carts, Orders, Quotes, or Quote Requests must belong to one of the Business Unit's Stores.</p>
     *  <p>If the Business Unit has no Stores, then all of its Carts, Orders, Quotes, or Quote Requests must not belong to any Store.</p>
     * @param builder function to build the stores value
     * @return Builder
     */

    public DivisionDraftBuilder withStores(
            Function<com.commercetools.api.models.store.StoreResourceIdentifierBuilder, com.commercetools.api.models.store.StoreResourceIdentifierBuilder> builder) {
        this.stores = new ArrayList<>();
        this.stores.add(builder.apply(com.commercetools.api.models.store.StoreResourceIdentifierBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Sets the Stores the Business Unit is associated with. Can only be set when <code>storeMode</code> is <code>Explicit</code>. Defaults to empty for Companies and not set for Divisions.</p>
     *  <p>If the Business Unit has Stores defined, then all of its Carts, Orders, Quotes, or Quote Requests must belong to one of the Business Unit's Stores.</p>
     *  <p>If the Business Unit has no Stores, then all of its Carts, Orders, Quotes, or Quote Requests must not belong to any Store.</p>
     * @param builder function to build the stores value
     * @return Builder
     */

    public DivisionDraftBuilder addStores(
            Function<com.commercetools.api.models.store.StoreResourceIdentifierBuilder, com.commercetools.api.models.store.StoreResourceIdentifier> builder) {
        return plusStores(builder.apply(com.commercetools.api.models.store.StoreResourceIdentifierBuilder.of()));
    }

    /**
     *  <p>Sets the Stores the Business Unit is associated with. Can only be set when <code>storeMode</code> is <code>Explicit</code>. Defaults to empty for Companies and not set for Divisions.</p>
     *  <p>If the Business Unit has Stores defined, then all of its Carts, Orders, Quotes, or Quote Requests must belong to one of the Business Unit's Stores.</p>
     *  <p>If the Business Unit has no Stores, then all of its Carts, Orders, Quotes, or Quote Requests must not belong to any Store.</p>
     * @param builder function to build the stores value
     * @return Builder
     */

    public DivisionDraftBuilder setStores(
            Function<com.commercetools.api.models.store.StoreResourceIdentifierBuilder, com.commercetools.api.models.store.StoreResourceIdentifier> builder) {
        return stores(builder.apply(com.commercetools.api.models.store.StoreResourceIdentifierBuilder.of()));
    }

    /**
     *  <p>If not set, the Division inherits the Stores from its <code>parentUnit</code>. Set this to <code>Explicit</code> if you want to set the Stores explicitly in the <code>stores</code> field instead.</p>
     * @param storeMode value to be set
     * @return Builder
     */

    public DivisionDraftBuilder storeMode(
            @Nullable final com.commercetools.api.models.business_unit.BusinessUnitStoreMode storeMode) {
        this.storeMode = storeMode;
        return this;
    }

    /**
     *  <p>Name of the Business Unit.</p>
     * @param name value to be set
     * @return Builder
     */

    public DivisionDraftBuilder name(final String name) {
        this.name = name;
        return this;
    }

    /**
     *  <p>Email address of the Business Unit.</p>
     * @param contactEmail value to be set
     * @return Builder
     */

    public DivisionDraftBuilder contactEmail(@Nullable final String contactEmail) {
        this.contactEmail = contactEmail;
        return this;
    }

    /**
     *  <p>List of members that are part of the Business Unit in specific roles.</p>
     * @param associates value to be set
     * @return Builder
     */

    public DivisionDraftBuilder associates(
            @Nullable final com.commercetools.api.models.business_unit.AssociateDraft... associates) {
        this.associates = new ArrayList<>(Arrays.asList(associates));
        return this;
    }

    /**
     *  <p>List of members that are part of the Business Unit in specific roles.</p>
     * @param associates value to be set
     * @return Builder
     */

    public DivisionDraftBuilder associates(
            @Nullable final java.util.List<com.commercetools.api.models.business_unit.AssociateDraft> associates) {
        this.associates = associates;
        return this;
    }

    /**
     *  <p>List of members that are part of the Business Unit in specific roles.</p>
     * @param associates value to be set
     * @return Builder
     */

    public DivisionDraftBuilder plusAssociates(
            @Nullable final com.commercetools.api.models.business_unit.AssociateDraft... associates) {
        if (this.associates == null) {
            this.associates = new ArrayList<>();
        }
        this.associates.addAll(Arrays.asList(associates));
        return this;
    }

    /**
     *  <p>List of members that are part of the Business Unit in specific roles.</p>
     * @param builder function to build the associates value
     * @return Builder
     */

    public DivisionDraftBuilder plusAssociates(
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
     * @param builder function to build the associates value
     * @return Builder
     */

    public DivisionDraftBuilder withAssociates(
            Function<com.commercetools.api.models.business_unit.AssociateDraftBuilder, com.commercetools.api.models.business_unit.AssociateDraftBuilder> builder) {
        this.associates = new ArrayList<>();
        this.associates
                .add(builder.apply(com.commercetools.api.models.business_unit.AssociateDraftBuilder.of()).build());
        return this;
    }

    /**
     *  <p>List of members that are part of the Business Unit in specific roles.</p>
     * @param builder function to build the associates value
     * @return Builder
     */

    public DivisionDraftBuilder addAssociates(
            Function<com.commercetools.api.models.business_unit.AssociateDraftBuilder, com.commercetools.api.models.business_unit.AssociateDraft> builder) {
        return plusAssociates(builder.apply(com.commercetools.api.models.business_unit.AssociateDraftBuilder.of()));
    }

    /**
     *  <p>List of members that are part of the Business Unit in specific roles.</p>
     * @param builder function to build the associates value
     * @return Builder
     */

    public DivisionDraftBuilder setAssociates(
            Function<com.commercetools.api.models.business_unit.AssociateDraftBuilder, com.commercetools.api.models.business_unit.AssociateDraft> builder) {
        return associates(builder.apply(com.commercetools.api.models.business_unit.AssociateDraftBuilder.of()));
    }

    /**
     *  <p>Addresses used by the Business Unit.</p>
     * @param addresses value to be set
     * @return Builder
     */

    public DivisionDraftBuilder addresses(
            @Nullable final com.commercetools.api.models.common.BaseAddress... addresses) {
        this.addresses = new ArrayList<>(Arrays.asList(addresses));
        return this;
    }

    /**
     *  <p>Addresses used by the Business Unit.</p>
     * @param addresses value to be set
     * @return Builder
     */

    public DivisionDraftBuilder addresses(
            @Nullable final java.util.List<com.commercetools.api.models.common.BaseAddress> addresses) {
        this.addresses = addresses;
        return this;
    }

    /**
     *  <p>Addresses used by the Business Unit.</p>
     * @param addresses value to be set
     * @return Builder
     */

    public DivisionDraftBuilder plusAddresses(
            @Nullable final com.commercetools.api.models.common.BaseAddress... addresses) {
        if (this.addresses == null) {
            this.addresses = new ArrayList<>();
        }
        this.addresses.addAll(Arrays.asList(addresses));
        return this;
    }

    /**
     *  <p>Addresses used by the Business Unit.</p>
     * @param builder function to build the addresses value
     * @return Builder
     */

    public DivisionDraftBuilder plusAddresses(
            Function<com.commercetools.api.models.common.BaseAddressBuilder, com.commercetools.api.models.common.BaseAddressBuilder> builder) {
        if (this.addresses == null) {
            this.addresses = new ArrayList<>();
        }
        this.addresses.add(builder.apply(com.commercetools.api.models.common.BaseAddressBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Addresses used by the Business Unit.</p>
     * @param builder function to build the addresses value
     * @return Builder
     */

    public DivisionDraftBuilder withAddresses(
            Function<com.commercetools.api.models.common.BaseAddressBuilder, com.commercetools.api.models.common.BaseAddressBuilder> builder) {
        this.addresses = new ArrayList<>();
        this.addresses.add(builder.apply(com.commercetools.api.models.common.BaseAddressBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Addresses used by the Business Unit.</p>
     * @param builder function to build the addresses value
     * @return Builder
     */

    public DivisionDraftBuilder addAddresses(
            Function<com.commercetools.api.models.common.BaseAddressBuilder, com.commercetools.api.models.common.BaseAddress> builder) {
        return plusAddresses(builder.apply(com.commercetools.api.models.common.BaseAddressBuilder.of()));
    }

    /**
     *  <p>Addresses used by the Business Unit.</p>
     * @param builder function to build the addresses value
     * @return Builder
     */

    public DivisionDraftBuilder setAddresses(
            Function<com.commercetools.api.models.common.BaseAddressBuilder, com.commercetools.api.models.common.BaseAddress> builder) {
        return addresses(builder.apply(com.commercetools.api.models.common.BaseAddressBuilder.of()));
    }

    /**
     *  <p>Indexes of entries in <code>addresses</code> to set as shipping addresses. The <code>shippingAddressIds</code> of the Customer will be replaced by these addresses.</p>
     * @param shippingAddresses value to be set
     * @return Builder
     */

    public DivisionDraftBuilder shippingAddresses(@Nullable final Integer... shippingAddresses) {
        this.shippingAddresses = new ArrayList<>(Arrays.asList(shippingAddresses));
        return this;
    }

    /**
     *  <p>Indexes of entries in <code>addresses</code> to set as shipping addresses. The <code>shippingAddressIds</code> of the Customer will be replaced by these addresses.</p>
     * @param shippingAddresses value to be set
     * @return Builder
     */

    public DivisionDraftBuilder shippingAddresses(@Nullable final java.util.List<Integer> shippingAddresses) {
        this.shippingAddresses = shippingAddresses;
        return this;
    }

    /**
     *  <p>Indexes of entries in <code>addresses</code> to set as shipping addresses. The <code>shippingAddressIds</code> of the Customer will be replaced by these addresses.</p>
     * @param shippingAddresses value to be set
     * @return Builder
     */

    public DivisionDraftBuilder plusShippingAddresses(@Nullable final Integer... shippingAddresses) {
        if (this.shippingAddresses == null) {
            this.shippingAddresses = new ArrayList<>();
        }
        this.shippingAddresses.addAll(Arrays.asList(shippingAddresses));
        return this;
    }

    /**
     *  <p>Index of the entry in <code>addresses</code> to set as the default shipping address.</p>
     * @param defaultShippingAddress value to be set
     * @return Builder
     */

    public DivisionDraftBuilder defaultShippingAddress(@Nullable final Integer defaultShippingAddress) {
        this.defaultShippingAddress = defaultShippingAddress;
        return this;
    }

    /**
     *  <p>Indexes of entries in <code>addresses</code> to set as billing addresses. The <code>billingAddressIds</code> of the Customer will be replaced by these addresses.</p>
     * @param billingAddresses value to be set
     * @return Builder
     */

    public DivisionDraftBuilder billingAddresses(@Nullable final Integer... billingAddresses) {
        this.billingAddresses = new ArrayList<>(Arrays.asList(billingAddresses));
        return this;
    }

    /**
     *  <p>Indexes of entries in <code>addresses</code> to set as billing addresses. The <code>billingAddressIds</code> of the Customer will be replaced by these addresses.</p>
     * @param billingAddresses value to be set
     * @return Builder
     */

    public DivisionDraftBuilder billingAddresses(@Nullable final java.util.List<Integer> billingAddresses) {
        this.billingAddresses = billingAddresses;
        return this;
    }

    /**
     *  <p>Indexes of entries in <code>addresses</code> to set as billing addresses. The <code>billingAddressIds</code> of the Customer will be replaced by these addresses.</p>
     * @param billingAddresses value to be set
     * @return Builder
     */

    public DivisionDraftBuilder plusBillingAddresses(@Nullable final Integer... billingAddresses) {
        if (this.billingAddresses == null) {
            this.billingAddresses = new ArrayList<>();
        }
        this.billingAddresses.addAll(Arrays.asList(billingAddresses));
        return this;
    }

    /**
     *  <p>Index of the entry in <code>addresses</code> to set as the default billing address.</p>
     * @param defaultBillingAddress value to be set
     * @return Builder
     */

    public DivisionDraftBuilder defaultBillingAddress(@Nullable final Integer defaultBillingAddress) {
        this.defaultBillingAddress = defaultBillingAddress;
        return this;
    }

    /**
     *  <p>Custom Fields for the Business Unit.</p>
     * @param builder function to build the custom value
     * @return Builder
     */

    public DivisionDraftBuilder custom(
            Function<com.commercetools.api.models.type.CustomFieldsDraftBuilder, com.commercetools.api.models.type.CustomFieldsDraftBuilder> builder) {
        this.custom = builder.apply(com.commercetools.api.models.type.CustomFieldsDraftBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Custom Fields for the Business Unit.</p>
     * @param builder function to build the custom value
     * @return Builder
     */

    public DivisionDraftBuilder withCustom(
            Function<com.commercetools.api.models.type.CustomFieldsDraftBuilder, com.commercetools.api.models.type.CustomFieldsDraft> builder) {
        this.custom = builder.apply(com.commercetools.api.models.type.CustomFieldsDraftBuilder.of());
        return this;
    }

    /**
     *  <p>Custom Fields for the Business Unit.</p>
     * @param custom value to be set
     * @return Builder
     */

    public DivisionDraftBuilder custom(@Nullable final com.commercetools.api.models.type.CustomFieldsDraft custom) {
        this.custom = custom;
        return this;
    }

    /**
     *  <p>The parent unit of this Division. Can be a Company or a Division.</p>
     * @param builder function to build the parentUnit value
     * @return Builder
     */

    public DivisionDraftBuilder parentUnit(
            Function<com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifierBuilder, com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifierBuilder> builder) {
        this.parentUnit = builder
                .apply(com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifierBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>The parent unit of this Division. Can be a Company or a Division.</p>
     * @param builder function to build the parentUnit value
     * @return Builder
     */

    public DivisionDraftBuilder withParentUnit(
            Function<com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifierBuilder, com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifier> builder) {
        this.parentUnit = builder
                .apply(com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifierBuilder.of());
        return this;
    }

    /**
     *  <p>The parent unit of this Division. Can be a Company or a Division.</p>
     * @param parentUnit value to be set
     * @return Builder
     */

    public DivisionDraftBuilder parentUnit(
            final com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifier parentUnit) {
        this.parentUnit = parentUnit;
        return this;
    }

    /**
     *  <p>User-defined unique identifier for the Business Unit.</p>
     * @return key
     */

    public String getKey() {
        return this.key;
    }

    /**
     *  <p>Indicates whether the Business Unit can be edited and used in Orders.</p>
     * @return status
     */

    @Nullable
    public com.commercetools.api.models.business_unit.BusinessUnitStatus getStatus() {
        return this.status;
    }

    /**
     *  <p>Sets the Stores the Business Unit is associated with. Can only be set when <code>storeMode</code> is <code>Explicit</code>. Defaults to empty for Companies and not set for Divisions.</p>
     *  <p>If the Business Unit has Stores defined, then all of its Carts, Orders, Quotes, or Quote Requests must belong to one of the Business Unit's Stores.</p>
     *  <p>If the Business Unit has no Stores, then all of its Carts, Orders, Quotes, or Quote Requests must not belong to any Store.</p>
     * @return stores
     */

    @Nullable
    public java.util.List<com.commercetools.api.models.store.StoreResourceIdentifier> getStores() {
        return this.stores;
    }

    /**
     *  <p>If not set, the Division inherits the Stores from its <code>parentUnit</code>. Set this to <code>Explicit</code> if you want to set the Stores explicitly in the <code>stores</code> field instead.</p>
     * @return storeMode
     */

    @Nullable
    public com.commercetools.api.models.business_unit.BusinessUnitStoreMode getStoreMode() {
        return this.storeMode;
    }

    /**
     *  <p>Name of the Business Unit.</p>
     * @return name
     */

    public String getName() {
        return this.name;
    }

    /**
     *  <p>Email address of the Business Unit.</p>
     * @return contactEmail
     */

    @Nullable
    public String getContactEmail() {
        return this.contactEmail;
    }

    /**
     *  <p>List of members that are part of the Business Unit in specific roles.</p>
     * @return associates
     */

    @Nullable
    public java.util.List<com.commercetools.api.models.business_unit.AssociateDraft> getAssociates() {
        return this.associates;
    }

    /**
     *  <p>Addresses used by the Business Unit.</p>
     * @return addresses
     */

    @Nullable
    public java.util.List<com.commercetools.api.models.common.BaseAddress> getAddresses() {
        return this.addresses;
    }

    /**
     *  <p>Indexes of entries in <code>addresses</code> to set as shipping addresses. The <code>shippingAddressIds</code> of the Customer will be replaced by these addresses.</p>
     * @return shippingAddresses
     */

    @Nullable
    public java.util.List<Integer> getShippingAddresses() {
        return this.shippingAddresses;
    }

    /**
     *  <p>Index of the entry in <code>addresses</code> to set as the default shipping address.</p>
     * @return defaultShippingAddress
     */

    @Nullable
    public Integer getDefaultShippingAddress() {
        return this.defaultShippingAddress;
    }

    /**
     *  <p>Indexes of entries in <code>addresses</code> to set as billing addresses. The <code>billingAddressIds</code> of the Customer will be replaced by these addresses.</p>
     * @return billingAddresses
     */

    @Nullable
    public java.util.List<Integer> getBillingAddresses() {
        return this.billingAddresses;
    }

    /**
     *  <p>Index of the entry in <code>addresses</code> to set as the default billing address.</p>
     * @return defaultBillingAddress
     */

    @Nullable
    public Integer getDefaultBillingAddress() {
        return this.defaultBillingAddress;
    }

    /**
     *  <p>Custom Fields for the Business Unit.</p>
     * @return custom
     */

    @Nullable
    public com.commercetools.api.models.type.CustomFieldsDraft getCustom() {
        return this.custom;
    }

    /**
     *  <p>The parent unit of this Division. Can be a Company or a Division.</p>
     * @return parentUnit
     */

    public com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifier getParentUnit() {
        return this.parentUnit;
    }

    /**
     * builds DivisionDraft with checking for non-null required values
     * @return DivisionDraft
     */
    public DivisionDraft build() {
        Objects.requireNonNull(key, DivisionDraft.class + ": key is missing");
        Objects.requireNonNull(name, DivisionDraft.class + ": name is missing");
        Objects.requireNonNull(parentUnit, DivisionDraft.class + ": parentUnit is missing");
        return new DivisionDraftImpl(key, status, stores, storeMode, name, contactEmail, associates, addresses,
            shippingAddresses, defaultShippingAddress, billingAddresses, defaultBillingAddress, custom, parentUnit);
    }

    /**
     * builds DivisionDraft without checking for non-null required values
     * @return DivisionDraft
     */
    public DivisionDraft buildUnchecked() {
        return new DivisionDraftImpl(key, status, stores, storeMode, name, contactEmail, associates, addresses,
            shippingAddresses, defaultShippingAddress, billingAddresses, defaultBillingAddress, custom, parentUnit);
    }

    /**
     * factory method for an instance of DivisionDraftBuilder
     * @return builder
     */
    public static DivisionDraftBuilder of() {
        return new DivisionDraftBuilder();
    }

    /**
     * create builder for DivisionDraft instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static DivisionDraftBuilder of(final DivisionDraft template) {
        DivisionDraftBuilder builder = new DivisionDraftBuilder();
        builder.key = template.getKey();
        builder.status = template.getStatus();
        builder.stores = template.getStores();
        builder.storeMode = template.getStoreMode();
        builder.name = template.getName();
        builder.contactEmail = template.getContactEmail();
        builder.associates = template.getAssociates();
        builder.addresses = template.getAddresses();
        builder.shippingAddresses = template.getShippingAddresses();
        builder.defaultShippingAddress = template.getDefaultShippingAddress();
        builder.billingAddresses = template.getBillingAddresses();
        builder.defaultBillingAddress = template.getDefaultBillingAddress();
        builder.custom = template.getCustom();
        builder.parentUnit = template.getParentUnit();
        return builder;
    }

}
