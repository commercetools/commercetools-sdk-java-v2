
package com.commercetools.api.models.business_unit;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CompanyBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     Company company = Company.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .key("{key}")
 *             .status(BusinessUnitStatus.ACTIVE)
 *             .storeMode(BusinessUnitStoreMode.EXPLICIT)
 *             .name("{name}")
 *             .plusAddresses(addressesBuilder -> addressesBuilder)
 *             .plusAssociates(associatesBuilder -> associatesBuilder)
 *             .topLevelUnit(topLevelUnitBuilder -> topLevelUnitBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CompanyBuilder implements Builder<Company> {

    private String id;

    private Long version;

    private java.time.ZonedDateTime createdAt;

    private java.time.ZonedDateTime lastModifiedAt;

    @Nullable
    private com.commercetools.api.models.common.LastModifiedBy lastModifiedBy;

    @Nullable
    private com.commercetools.api.models.common.CreatedBy createdBy;

    private String key;

    private com.commercetools.api.models.business_unit.BusinessUnitStatus status;

    @Nullable
    private java.util.List<com.commercetools.api.models.store.StoreKeyReference> stores;

    private com.commercetools.api.models.business_unit.BusinessUnitStoreMode storeMode;

    private String name;

    @Nullable
    private String contactEmail;

    @Nullable
    private com.commercetools.api.models.type.CustomFields custom;

    private java.util.List<com.commercetools.api.models.common.Address> addresses;

    @Nullable
    private java.util.List<String> shippingAddressIds;

    @Nullable
    private String defaultShipingAddressId;

    @Nullable
    private java.util.List<String> billingAddressIds;

    @Nullable
    private String defaultBillingAddressId;

    private java.util.List<com.commercetools.api.models.business_unit.Associate> associates;

    @Nullable
    private com.commercetools.api.models.business_unit.BusinessUnitKeyReference parentUnit;

    private com.commercetools.api.models.business_unit.BusinessUnitKeyReference topLevelUnit;

    /**
     *  <p>Unique identifier of the Business Unit.</p>
     */

    public CompanyBuilder id(final String id) {
        this.id = id;
        return this;
    }

    /**
     *  <p>Current version of the Business Unit.</p>
     */

    public CompanyBuilder version(final Long version) {
        this.version = version;
        return this;
    }

    /**
     *  <p>Date and time (UTC) the Business Unit was initially created.</p>
     */

    public CompanyBuilder createdAt(final java.time.ZonedDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     *  <p>Date and time (UTC) the Business Unit was last updated.</p>
     */

    public CompanyBuilder lastModifiedAt(final java.time.ZonedDateTime lastModifiedAt) {
        this.lastModifiedAt = lastModifiedAt;
        return this;
    }

    /**
     *  <p>Present on resources updated after 1 February 2019 except for events not tracked.</p>
     */

    public CompanyBuilder lastModifiedBy(
            Function<com.commercetools.api.models.common.LastModifiedByBuilder, com.commercetools.api.models.common.LastModifiedByBuilder> builder) {
        this.lastModifiedBy = builder.apply(com.commercetools.api.models.common.LastModifiedByBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Present on resources updated after 1 February 2019 except for events not tracked.</p>
     */

    public CompanyBuilder lastModifiedBy(
            @Nullable final com.commercetools.api.models.common.LastModifiedBy lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
        return this;
    }

    /**
     *  <p>Present on resources created after 1 February 2019 except for events not tracked.</p>
     */

    public CompanyBuilder createdBy(
            Function<com.commercetools.api.models.common.CreatedByBuilder, com.commercetools.api.models.common.CreatedByBuilder> builder) {
        this.createdBy = builder.apply(com.commercetools.api.models.common.CreatedByBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Present on resources created after 1 February 2019 except for events not tracked.</p>
     */

    public CompanyBuilder createdBy(@Nullable final com.commercetools.api.models.common.CreatedBy createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    /**
     *  <p>User-defined unique identifier of the Business Unit.</p>
     */

    public CompanyBuilder key(final String key) {
        this.key = key;
        return this;
    }

    /**
     *  <p>Indicates whether the Business Unit can be edited and used in Orders.</p>
     */

    public CompanyBuilder status(final com.commercetools.api.models.business_unit.BusinessUnitStatus status) {
        this.status = status;
        return this;
    }

    /**
     *  <p>References to Stores the Business Unit is associated with. If empty, the Business Unit can only create Carts, Orders, or Quotes that have no <code>store</code> value. If not empty, the Business Unit can only be linked to Carts and Orders of a referenced Store. Only present when <code>storeMode</code> is <code>Explicit</code>.</p>
     */

    public CompanyBuilder stores(@Nullable final com.commercetools.api.models.store.StoreKeyReference... stores) {
        this.stores = new ArrayList<>(Arrays.asList(stores));
        return this;
    }

    /**
     *  <p>References to Stores the Business Unit is associated with. If empty, the Business Unit can only create Carts, Orders, or Quotes that have no <code>store</code> value. If not empty, the Business Unit can only be linked to Carts and Orders of a referenced Store. Only present when <code>storeMode</code> is <code>Explicit</code>.</p>
     */

    public CompanyBuilder stores(
            @Nullable final java.util.List<com.commercetools.api.models.store.StoreKeyReference> stores) {
        this.stores = stores;
        return this;
    }

    /**
     *  <p>References to Stores the Business Unit is associated with. If empty, the Business Unit can only create Carts, Orders, or Quotes that have no <code>store</code> value. If not empty, the Business Unit can only be linked to Carts and Orders of a referenced Store. Only present when <code>storeMode</code> is <code>Explicit</code>.</p>
     */

    public CompanyBuilder plusStores(@Nullable final com.commercetools.api.models.store.StoreKeyReference... stores) {
        if (this.stores == null) {
            this.stores = new ArrayList<>();
        }
        this.stores.addAll(Arrays.asList(stores));
        return this;
    }

    /**
     *  <p>References to Stores the Business Unit is associated with. If empty, the Business Unit can only create Carts, Orders, or Quotes that have no <code>store</code> value. If not empty, the Business Unit can only be linked to Carts and Orders of a referenced Store. Only present when <code>storeMode</code> is <code>Explicit</code>.</p>
     */

    public CompanyBuilder plusStores(
            Function<com.commercetools.api.models.store.StoreKeyReferenceBuilder, com.commercetools.api.models.store.StoreKeyReferenceBuilder> builder) {
        if (this.stores == null) {
            this.stores = new ArrayList<>();
        }
        this.stores.add(builder.apply(com.commercetools.api.models.store.StoreKeyReferenceBuilder.of()).build());
        return this;
    }

    /**
     *  <p>References to Stores the Business Unit is associated with. If empty, the Business Unit can only create Carts, Orders, or Quotes that have no <code>store</code> value. If not empty, the Business Unit can only be linked to Carts and Orders of a referenced Store. Only present when <code>storeMode</code> is <code>Explicit</code>.</p>
     */

    public CompanyBuilder withStores(
            Function<com.commercetools.api.models.store.StoreKeyReferenceBuilder, com.commercetools.api.models.store.StoreKeyReferenceBuilder> builder) {
        this.stores = new ArrayList<>();
        this.stores.add(builder.apply(com.commercetools.api.models.store.StoreKeyReferenceBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Is always <code>Explicit</code> since a Company does not have a parent Business Unit the Stores can be inherited from.</p>
     */

    public CompanyBuilder storeMode(final com.commercetools.api.models.business_unit.BusinessUnitStoreMode storeMode) {
        this.storeMode = storeMode;
        return this;
    }

    /**
     *  <p>Name of the Business Unit.</p>
     */

    public CompanyBuilder name(final String name) {
        this.name = name;
        return this;
    }

    /**
     *  <p>Email address of the Business Unit.</p>
     */

    public CompanyBuilder contactEmail(@Nullable final String contactEmail) {
        this.contactEmail = contactEmail;
        return this;
    }

    /**
     *  <p>Custom Fields for the Business Unit.</p>
     */

    public CompanyBuilder custom(
            Function<com.commercetools.api.models.type.CustomFieldsBuilder, com.commercetools.api.models.type.CustomFieldsBuilder> builder) {
        this.custom = builder.apply(com.commercetools.api.models.type.CustomFieldsBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Custom Fields for the Business Unit.</p>
     */

    public CompanyBuilder custom(@Nullable final com.commercetools.api.models.type.CustomFields custom) {
        this.custom = custom;
        return this;
    }

    /**
     *  <p>Addresses used by the Business Unit.</p>
     */

    public CompanyBuilder addresses(final com.commercetools.api.models.common.Address... addresses) {
        this.addresses = new ArrayList<>(Arrays.asList(addresses));
        return this;
    }

    /**
     *  <p>Addresses used by the Business Unit.</p>
     */

    public CompanyBuilder addresses(final java.util.List<com.commercetools.api.models.common.Address> addresses) {
        this.addresses = addresses;
        return this;
    }

    /**
     *  <p>Addresses used by the Business Unit.</p>
     */

    public CompanyBuilder plusAddresses(final com.commercetools.api.models.common.Address... addresses) {
        if (this.addresses == null) {
            this.addresses = new ArrayList<>();
        }
        this.addresses.addAll(Arrays.asList(addresses));
        return this;
    }

    /**
     *  <p>Addresses used by the Business Unit.</p>
     */

    public CompanyBuilder plusAddresses(
            Function<com.commercetools.api.models.common.AddressBuilder, com.commercetools.api.models.common.AddressBuilder> builder) {
        if (this.addresses == null) {
            this.addresses = new ArrayList<>();
        }
        this.addresses.add(builder.apply(com.commercetools.api.models.common.AddressBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Addresses used by the Business Unit.</p>
     */

    public CompanyBuilder withAddresses(
            Function<com.commercetools.api.models.common.AddressBuilder, com.commercetools.api.models.common.AddressBuilder> builder) {
        this.addresses = new ArrayList<>();
        this.addresses.add(builder.apply(com.commercetools.api.models.common.AddressBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Unique identifiers of addresses used as shipping addresses.</p>
     */

    public CompanyBuilder shippingAddressIds(@Nullable final String... shippingAddressIds) {
        this.shippingAddressIds = new ArrayList<>(Arrays.asList(shippingAddressIds));
        return this;
    }

    /**
     *  <p>Unique identifiers of addresses used as shipping addresses.</p>
     */

    public CompanyBuilder shippingAddressIds(@Nullable final java.util.List<String> shippingAddressIds) {
        this.shippingAddressIds = shippingAddressIds;
        return this;
    }

    /**
     *  <p>Unique identifiers of addresses used as shipping addresses.</p>
     */

    public CompanyBuilder plusShippingAddressIds(@Nullable final String... shippingAddressIds) {
        if (this.shippingAddressIds == null) {
            this.shippingAddressIds = new ArrayList<>();
        }
        this.shippingAddressIds.addAll(Arrays.asList(shippingAddressIds));
        return this;
    }

    /**
     *  <p>Unique identifier of the address used as the default shipping address.</p>
     */

    public CompanyBuilder defaultShipingAddressId(@Nullable final String defaultShipingAddressId) {
        this.defaultShipingAddressId = defaultShipingAddressId;
        return this;
    }

    /**
     *  <p>Unique identifiers of addresses used as billing addresses.</p>
     */

    public CompanyBuilder billingAddressIds(@Nullable final String... billingAddressIds) {
        this.billingAddressIds = new ArrayList<>(Arrays.asList(billingAddressIds));
        return this;
    }

    /**
     *  <p>Unique identifiers of addresses used as billing addresses.</p>
     */

    public CompanyBuilder billingAddressIds(@Nullable final java.util.List<String> billingAddressIds) {
        this.billingAddressIds = billingAddressIds;
        return this;
    }

    /**
     *  <p>Unique identifiers of addresses used as billing addresses.</p>
     */

    public CompanyBuilder plusBillingAddressIds(@Nullable final String... billingAddressIds) {
        if (this.billingAddressIds == null) {
            this.billingAddressIds = new ArrayList<>();
        }
        this.billingAddressIds.addAll(Arrays.asList(billingAddressIds));
        return this;
    }

    /**
     *  <p>Unique identifier of the address used as the default billing address.</p>
     */

    public CompanyBuilder defaultBillingAddressId(@Nullable final String defaultBillingAddressId) {
        this.defaultBillingAddressId = defaultBillingAddressId;
        return this;
    }

    /**
     *  <p>Members that are part of the Business Unit in specific roles.</p>
     */

    public CompanyBuilder associates(final com.commercetools.api.models.business_unit.Associate... associates) {
        this.associates = new ArrayList<>(Arrays.asList(associates));
        return this;
    }

    /**
     *  <p>Members that are part of the Business Unit in specific roles.</p>
     */

    public CompanyBuilder associates(
            final java.util.List<com.commercetools.api.models.business_unit.Associate> associates) {
        this.associates = associates;
        return this;
    }

    /**
     *  <p>Members that are part of the Business Unit in specific roles.</p>
     */

    public CompanyBuilder plusAssociates(final com.commercetools.api.models.business_unit.Associate... associates) {
        if (this.associates == null) {
            this.associates = new ArrayList<>();
        }
        this.associates.addAll(Arrays.asList(associates));
        return this;
    }

    /**
     *  <p>Members that are part of the Business Unit in specific roles.</p>
     */

    public CompanyBuilder plusAssociates(
            Function<com.commercetools.api.models.business_unit.AssociateBuilder, com.commercetools.api.models.business_unit.AssociateBuilder> builder) {
        if (this.associates == null) {
            this.associates = new ArrayList<>();
        }
        this.associates.add(builder.apply(com.commercetools.api.models.business_unit.AssociateBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Members that are part of the Business Unit in specific roles.</p>
     */

    public CompanyBuilder withAssociates(
            Function<com.commercetools.api.models.business_unit.AssociateBuilder, com.commercetools.api.models.business_unit.AssociateBuilder> builder) {
        this.associates = new ArrayList<>();
        this.associates.add(builder.apply(com.commercetools.api.models.business_unit.AssociateBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Parent unit of the Business Unit. Only present when the <code>unitType</code> is <code>Division</code>.</p>
     */

    public CompanyBuilder parentUnit(
            Function<com.commercetools.api.models.business_unit.BusinessUnitKeyReferenceBuilder, com.commercetools.api.models.business_unit.BusinessUnitKeyReferenceBuilder> builder) {
        this.parentUnit = builder.apply(com.commercetools.api.models.business_unit.BusinessUnitKeyReferenceBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Parent unit of the Business Unit. Only present when the <code>unitType</code> is <code>Division</code>.</p>
     */

    public CompanyBuilder parentUnit(
            @Nullable final com.commercetools.api.models.business_unit.BusinessUnitKeyReference parentUnit) {
        this.parentUnit = parentUnit;
        return this;
    }

    /**
     *  <p>Top-level unit of the Business Unit. The top-level unit is of <code>unitType</code> <code>Company</code>.</p>
     */

    public CompanyBuilder topLevelUnit(
            Function<com.commercetools.api.models.business_unit.BusinessUnitKeyReferenceBuilder, com.commercetools.api.models.business_unit.BusinessUnitKeyReferenceBuilder> builder) {
        this.topLevelUnit = builder
                .apply(com.commercetools.api.models.business_unit.BusinessUnitKeyReferenceBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Top-level unit of the Business Unit. The top-level unit is of <code>unitType</code> <code>Company</code>.</p>
     */

    public CompanyBuilder topLevelUnit(
            final com.commercetools.api.models.business_unit.BusinessUnitKeyReference topLevelUnit) {
        this.topLevelUnit = topLevelUnit;
        return this;
    }

    public String getId() {
        return this.id;
    }

    public Long getVersion() {
        return this.version;
    }

    public java.time.ZonedDateTime getCreatedAt() {
        return this.createdAt;
    }

    public java.time.ZonedDateTime getLastModifiedAt() {
        return this.lastModifiedAt;
    }

    @Nullable
    public com.commercetools.api.models.common.LastModifiedBy getLastModifiedBy() {
        return this.lastModifiedBy;
    }

    @Nullable
    public com.commercetools.api.models.common.CreatedBy getCreatedBy() {
        return this.createdBy;
    }

    public String getKey() {
        return this.key;
    }

    public com.commercetools.api.models.business_unit.BusinessUnitStatus getStatus() {
        return this.status;
    }

    @Nullable
    public java.util.List<com.commercetools.api.models.store.StoreKeyReference> getStores() {
        return this.stores;
    }

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
    public com.commercetools.api.models.type.CustomFields getCustom() {
        return this.custom;
    }

    public java.util.List<com.commercetools.api.models.common.Address> getAddresses() {
        return this.addresses;
    }

    @Nullable
    public java.util.List<String> getShippingAddressIds() {
        return this.shippingAddressIds;
    }

    @Nullable
    public String getDefaultShipingAddressId() {
        return this.defaultShipingAddressId;
    }

    @Nullable
    public java.util.List<String> getBillingAddressIds() {
        return this.billingAddressIds;
    }

    @Nullable
    public String getDefaultBillingAddressId() {
        return this.defaultBillingAddressId;
    }

    public java.util.List<com.commercetools.api.models.business_unit.Associate> getAssociates() {
        return this.associates;
    }

    @Nullable
    public com.commercetools.api.models.business_unit.BusinessUnitKeyReference getParentUnit() {
        return this.parentUnit;
    }

    public com.commercetools.api.models.business_unit.BusinessUnitKeyReference getTopLevelUnit() {
        return this.topLevelUnit;
    }

    public Company build() {
        Objects.requireNonNull(id, Company.class + ": id is missing");
        Objects.requireNonNull(version, Company.class + ": version is missing");
        Objects.requireNonNull(createdAt, Company.class + ": createdAt is missing");
        Objects.requireNonNull(lastModifiedAt, Company.class + ": lastModifiedAt is missing");
        Objects.requireNonNull(key, Company.class + ": key is missing");
        Objects.requireNonNull(status, Company.class + ": status is missing");
        Objects.requireNonNull(storeMode, Company.class + ": storeMode is missing");
        Objects.requireNonNull(name, Company.class + ": name is missing");
        Objects.requireNonNull(addresses, Company.class + ": addresses is missing");
        Objects.requireNonNull(associates, Company.class + ": associates is missing");
        Objects.requireNonNull(topLevelUnit, Company.class + ": topLevelUnit is missing");
        return new CompanyImpl(id, version, createdAt, lastModifiedAt, lastModifiedBy, createdBy, key, status, stores,
            storeMode, name, contactEmail, custom, addresses, shippingAddressIds, defaultShipingAddressId,
            billingAddressIds, defaultBillingAddressId, associates, parentUnit, topLevelUnit);
    }

    /**
     * builds Company without checking for non null required values
     */
    public Company buildUnchecked() {
        return new CompanyImpl(id, version, createdAt, lastModifiedAt, lastModifiedBy, createdBy, key, status, stores,
            storeMode, name, contactEmail, custom, addresses, shippingAddressIds, defaultShipingAddressId,
            billingAddressIds, defaultBillingAddressId, associates, parentUnit, topLevelUnit);
    }

    public static CompanyBuilder of() {
        return new CompanyBuilder();
    }

    public static CompanyBuilder of(final Company template) {
        CompanyBuilder builder = new CompanyBuilder();
        builder.id = template.getId();
        builder.version = template.getVersion();
        builder.createdAt = template.getCreatedAt();
        builder.lastModifiedAt = template.getLastModifiedAt();
        builder.lastModifiedBy = template.getLastModifiedBy();
        builder.createdBy = template.getCreatedBy();
        builder.key = template.getKey();
        builder.status = template.getStatus();
        builder.stores = template.getStores();
        builder.storeMode = template.getStoreMode();
        builder.name = template.getName();
        builder.contactEmail = template.getContactEmail();
        builder.custom = template.getCustom();
        builder.addresses = template.getAddresses();
        builder.shippingAddressIds = template.getShippingAddressIds();
        builder.defaultShipingAddressId = template.getDefaultShipingAddressId();
        builder.billingAddressIds = template.getBillingAddressIds();
        builder.defaultBillingAddressId = template.getDefaultBillingAddressId();
        builder.associates = template.getAssociates();
        builder.parentUnit = template.getParentUnit();
        builder.topLevelUnit = template.getTopLevelUnit();
        return builder;
    }

}
