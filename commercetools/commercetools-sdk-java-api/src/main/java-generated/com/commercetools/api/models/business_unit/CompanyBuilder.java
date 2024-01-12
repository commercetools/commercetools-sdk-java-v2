
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
 *             .associateMode(BusinessUnitAssociateMode.EXPLICIT)
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
    private String defaultShippingAddressId;

    @Nullable
    private java.util.List<String> billingAddressIds;

    @Nullable
    private String defaultBillingAddressId;

    private com.commercetools.api.models.business_unit.BusinessUnitAssociateMode associateMode;

    private java.util.List<com.commercetools.api.models.business_unit.Associate> associates;

    @Nullable
    private java.util.List<com.commercetools.api.models.business_unit.InheritedAssociate> inheritedAssociates;

    @Nullable
    private com.commercetools.api.models.business_unit.BusinessUnitKeyReference parentUnit;

    private com.commercetools.api.models.business_unit.BusinessUnitKeyReference topLevelUnit;

    /**
     *  <p>Unique identifier of the Business Unit.</p>
     * @param id value to be set
     * @return Builder
     */

    public CompanyBuilder id(final String id) {
        this.id = id;
        return this;
    }

    /**
     *  <p>Current version of the Business Unit.</p>
     * @param version value to be set
     * @return Builder
     */

    public CompanyBuilder version(final Long version) {
        this.version = version;
        return this;
    }

    /**
     *  <p>Date and time (UTC) the Business Unit was initially created.</p>
     * @param createdAt value to be set
     * @return Builder
     */

    public CompanyBuilder createdAt(final java.time.ZonedDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     *  <p>Date and time (UTC) the Business Unit was last updated.</p>
     * @param lastModifiedAt value to be set
     * @return Builder
     */

    public CompanyBuilder lastModifiedAt(final java.time.ZonedDateTime lastModifiedAt) {
        this.lastModifiedAt = lastModifiedAt;
        return this;
    }

    /**
     *  <p>Present on resources updated after 1 February 2019 except for events not tracked.</p>
     * @param builder function to build the lastModifiedBy value
     * @return Builder
     */

    public CompanyBuilder lastModifiedBy(
            Function<com.commercetools.api.models.common.LastModifiedByBuilder, com.commercetools.api.models.common.LastModifiedByBuilder> builder) {
        this.lastModifiedBy = builder.apply(com.commercetools.api.models.common.LastModifiedByBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Present on resources updated after 1 February 2019 except for events not tracked.</p>
     * @param builder function to build the lastModifiedBy value
     * @return Builder
     */

    public CompanyBuilder withLastModifiedBy(
            Function<com.commercetools.api.models.common.LastModifiedByBuilder, com.commercetools.api.models.common.LastModifiedBy> builder) {
        this.lastModifiedBy = builder.apply(com.commercetools.api.models.common.LastModifiedByBuilder.of());
        return this;
    }

    /**
     *  <p>Present on resources updated after 1 February 2019 except for events not tracked.</p>
     * @param lastModifiedBy value to be set
     * @return Builder
     */

    public CompanyBuilder lastModifiedBy(
            @Nullable final com.commercetools.api.models.common.LastModifiedBy lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
        return this;
    }

    /**
     *  <p>Present on resources created after 1 February 2019 except for events not tracked.</p>
     * @param builder function to build the createdBy value
     * @return Builder
     */

    public CompanyBuilder createdBy(
            Function<com.commercetools.api.models.common.CreatedByBuilder, com.commercetools.api.models.common.CreatedByBuilder> builder) {
        this.createdBy = builder.apply(com.commercetools.api.models.common.CreatedByBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Present on resources created after 1 February 2019 except for events not tracked.</p>
     * @param builder function to build the createdBy value
     * @return Builder
     */

    public CompanyBuilder withCreatedBy(
            Function<com.commercetools.api.models.common.CreatedByBuilder, com.commercetools.api.models.common.CreatedBy> builder) {
        this.createdBy = builder.apply(com.commercetools.api.models.common.CreatedByBuilder.of());
        return this;
    }

    /**
     *  <p>Present on resources created after 1 February 2019 except for events not tracked.</p>
     * @param createdBy value to be set
     * @return Builder
     */

    public CompanyBuilder createdBy(@Nullable final com.commercetools.api.models.common.CreatedBy createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    /**
     *  <p>User-defined unique identifier of the Business Unit.</p>
     * @param key value to be set
     * @return Builder
     */

    public CompanyBuilder key(final String key) {
        this.key = key;
        return this;
    }

    /**
     *  <p>Indicates whether the Business Unit can be edited and used in Orders.</p>
     * @param status value to be set
     * @return Builder
     */

    public CompanyBuilder status(final com.commercetools.api.models.business_unit.BusinessUnitStatus status) {
        this.status = status;
        return this;
    }

    /**
     *  <p>References to Stores the Business Unit is associated with. Only present when <code>storeMode</code> is <code>Explicit</code>.</p>
     *  <p>If the Business Unit has Stores defined, then all of its Carts, Orders, Quotes, or Quote Requests must belong to one of the Business Unit's Stores.</p>
     *  <p>If the Business Unit has no Stores, then all of its Carts, Orders, Quotes, or Quote Requests must not belong to any Store.</p>
     * @param stores value to be set
     * @return Builder
     */

    public CompanyBuilder stores(@Nullable final com.commercetools.api.models.store.StoreKeyReference... stores) {
        this.stores = new ArrayList<>(Arrays.asList(stores));
        return this;
    }

    /**
     *  <p>References to Stores the Business Unit is associated with. Only present when <code>storeMode</code> is <code>Explicit</code>.</p>
     *  <p>If the Business Unit has Stores defined, then all of its Carts, Orders, Quotes, or Quote Requests must belong to one of the Business Unit's Stores.</p>
     *  <p>If the Business Unit has no Stores, then all of its Carts, Orders, Quotes, or Quote Requests must not belong to any Store.</p>
     * @param stores value to be set
     * @return Builder
     */

    public CompanyBuilder stores(
            @Nullable final java.util.List<com.commercetools.api.models.store.StoreKeyReference> stores) {
        this.stores = stores;
        return this;
    }

    /**
     *  <p>References to Stores the Business Unit is associated with. Only present when <code>storeMode</code> is <code>Explicit</code>.</p>
     *  <p>If the Business Unit has Stores defined, then all of its Carts, Orders, Quotes, or Quote Requests must belong to one of the Business Unit's Stores.</p>
     *  <p>If the Business Unit has no Stores, then all of its Carts, Orders, Quotes, or Quote Requests must not belong to any Store.</p>
     * @param stores value to be set
     * @return Builder
     */

    public CompanyBuilder plusStores(@Nullable final com.commercetools.api.models.store.StoreKeyReference... stores) {
        if (this.stores == null) {
            this.stores = new ArrayList<>();
        }
        this.stores.addAll(Arrays.asList(stores));
        return this;
    }

    /**
     *  <p>References to Stores the Business Unit is associated with. Only present when <code>storeMode</code> is <code>Explicit</code>.</p>
     *  <p>If the Business Unit has Stores defined, then all of its Carts, Orders, Quotes, or Quote Requests must belong to one of the Business Unit's Stores.</p>
     *  <p>If the Business Unit has no Stores, then all of its Carts, Orders, Quotes, or Quote Requests must not belong to any Store.</p>
     * @param builder function to build the stores value
     * @return Builder
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
     *  <p>References to Stores the Business Unit is associated with. Only present when <code>storeMode</code> is <code>Explicit</code>.</p>
     *  <p>If the Business Unit has Stores defined, then all of its Carts, Orders, Quotes, or Quote Requests must belong to one of the Business Unit's Stores.</p>
     *  <p>If the Business Unit has no Stores, then all of its Carts, Orders, Quotes, or Quote Requests must not belong to any Store.</p>
     * @param builder function to build the stores value
     * @return Builder
     */

    public CompanyBuilder withStores(
            Function<com.commercetools.api.models.store.StoreKeyReferenceBuilder, com.commercetools.api.models.store.StoreKeyReferenceBuilder> builder) {
        this.stores = new ArrayList<>();
        this.stores.add(builder.apply(com.commercetools.api.models.store.StoreKeyReferenceBuilder.of()).build());
        return this;
    }

    /**
     *  <p>References to Stores the Business Unit is associated with. Only present when <code>storeMode</code> is <code>Explicit</code>.</p>
     *  <p>If the Business Unit has Stores defined, then all of its Carts, Orders, Quotes, or Quote Requests must belong to one of the Business Unit's Stores.</p>
     *  <p>If the Business Unit has no Stores, then all of its Carts, Orders, Quotes, or Quote Requests must not belong to any Store.</p>
     * @param builder function to build the stores value
     * @return Builder
     */

    public CompanyBuilder addStores(
            Function<com.commercetools.api.models.store.StoreKeyReferenceBuilder, com.commercetools.api.models.store.StoreKeyReference> builder) {
        return plusStores(builder.apply(com.commercetools.api.models.store.StoreKeyReferenceBuilder.of()));
    }

    /**
     *  <p>References to Stores the Business Unit is associated with. Only present when <code>storeMode</code> is <code>Explicit</code>.</p>
     *  <p>If the Business Unit has Stores defined, then all of its Carts, Orders, Quotes, or Quote Requests must belong to one of the Business Unit's Stores.</p>
     *  <p>If the Business Unit has no Stores, then all of its Carts, Orders, Quotes, or Quote Requests must not belong to any Store.</p>
     * @param builder function to build the stores value
     * @return Builder
     */

    public CompanyBuilder setStores(
            Function<com.commercetools.api.models.store.StoreKeyReferenceBuilder, com.commercetools.api.models.store.StoreKeyReference> builder) {
        return stores(builder.apply(com.commercetools.api.models.store.StoreKeyReferenceBuilder.of()));
    }

    /**
     *  <p>Is always <code>Explicit</code> since a Company cannot have a parent Business Unit that Stores can be inherited from.</p>
     * @param storeMode value to be set
     * @return Builder
     */

    public CompanyBuilder storeMode(final com.commercetools.api.models.business_unit.BusinessUnitStoreMode storeMode) {
        this.storeMode = storeMode;
        return this;
    }

    /**
     *  <p>Name of the Business Unit.</p>
     * @param name value to be set
     * @return Builder
     */

    public CompanyBuilder name(final String name) {
        this.name = name;
        return this;
    }

    /**
     *  <p>Email address of the Business Unit.</p>
     * @param contactEmail value to be set
     * @return Builder
     */

    public CompanyBuilder contactEmail(@Nullable final String contactEmail) {
        this.contactEmail = contactEmail;
        return this;
    }

    /**
     *  <p>Custom Fields for the Business Unit.</p>
     * @param builder function to build the custom value
     * @return Builder
     */

    public CompanyBuilder custom(
            Function<com.commercetools.api.models.type.CustomFieldsBuilder, com.commercetools.api.models.type.CustomFieldsBuilder> builder) {
        this.custom = builder.apply(com.commercetools.api.models.type.CustomFieldsBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Custom Fields for the Business Unit.</p>
     * @param builder function to build the custom value
     * @return Builder
     */

    public CompanyBuilder withCustom(
            Function<com.commercetools.api.models.type.CustomFieldsBuilder, com.commercetools.api.models.type.CustomFields> builder) {
        this.custom = builder.apply(com.commercetools.api.models.type.CustomFieldsBuilder.of());
        return this;
    }

    /**
     *  <p>Custom Fields for the Business Unit.</p>
     * @param custom value to be set
     * @return Builder
     */

    public CompanyBuilder custom(@Nullable final com.commercetools.api.models.type.CustomFields custom) {
        this.custom = custom;
        return this;
    }

    /**
     *  <p>Addresses used by the Business Unit.</p>
     * @param addresses value to be set
     * @return Builder
     */

    public CompanyBuilder addresses(final com.commercetools.api.models.common.Address... addresses) {
        this.addresses = new ArrayList<>(Arrays.asList(addresses));
        return this;
    }

    /**
     *  <p>Addresses used by the Business Unit.</p>
     * @param addresses value to be set
     * @return Builder
     */

    public CompanyBuilder addresses(final java.util.List<com.commercetools.api.models.common.Address> addresses) {
        this.addresses = addresses;
        return this;
    }

    /**
     *  <p>Addresses used by the Business Unit.</p>
     * @param addresses value to be set
     * @return Builder
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
     * @param builder function to build the addresses value
     * @return Builder
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
     * @param builder function to build the addresses value
     * @return Builder
     */

    public CompanyBuilder withAddresses(
            Function<com.commercetools.api.models.common.AddressBuilder, com.commercetools.api.models.common.AddressBuilder> builder) {
        this.addresses = new ArrayList<>();
        this.addresses.add(builder.apply(com.commercetools.api.models.common.AddressBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Addresses used by the Business Unit.</p>
     * @param builder function to build the addresses value
     * @return Builder
     */

    public CompanyBuilder addAddresses(
            Function<com.commercetools.api.models.common.AddressBuilder, com.commercetools.api.models.common.Address> builder) {
        return plusAddresses(builder.apply(com.commercetools.api.models.common.AddressBuilder.of()));
    }

    /**
     *  <p>Addresses used by the Business Unit.</p>
     * @param builder function to build the addresses value
     * @return Builder
     */

    public CompanyBuilder setAddresses(
            Function<com.commercetools.api.models.common.AddressBuilder, com.commercetools.api.models.common.Address> builder) {
        return addresses(builder.apply(com.commercetools.api.models.common.AddressBuilder.of()));
    }

    /**
     *  <p>Unique identifiers of addresses used as shipping addresses.</p>
     * @param shippingAddressIds value to be set
     * @return Builder
     */

    public CompanyBuilder shippingAddressIds(@Nullable final String... shippingAddressIds) {
        this.shippingAddressIds = new ArrayList<>(Arrays.asList(shippingAddressIds));
        return this;
    }

    /**
     *  <p>Unique identifiers of addresses used as shipping addresses.</p>
     * @param shippingAddressIds value to be set
     * @return Builder
     */

    public CompanyBuilder shippingAddressIds(@Nullable final java.util.List<String> shippingAddressIds) {
        this.shippingAddressIds = shippingAddressIds;
        return this;
    }

    /**
     *  <p>Unique identifiers of addresses used as shipping addresses.</p>
     * @param shippingAddressIds value to be set
     * @return Builder
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
     * @param defaultShippingAddressId value to be set
     * @return Builder
     */

    public CompanyBuilder defaultShippingAddressId(@Nullable final String defaultShippingAddressId) {
        this.defaultShippingAddressId = defaultShippingAddressId;
        return this;
    }

    /**
     *  <p>Unique identifiers of addresses used as billing addresses.</p>
     * @param billingAddressIds value to be set
     * @return Builder
     */

    public CompanyBuilder billingAddressIds(@Nullable final String... billingAddressIds) {
        this.billingAddressIds = new ArrayList<>(Arrays.asList(billingAddressIds));
        return this;
    }

    /**
     *  <p>Unique identifiers of addresses used as billing addresses.</p>
     * @param billingAddressIds value to be set
     * @return Builder
     */

    public CompanyBuilder billingAddressIds(@Nullable final java.util.List<String> billingAddressIds) {
        this.billingAddressIds = billingAddressIds;
        return this;
    }

    /**
     *  <p>Unique identifiers of addresses used as billing addresses.</p>
     * @param billingAddressIds value to be set
     * @return Builder
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
     * @param defaultBillingAddressId value to be set
     * @return Builder
     */

    public CompanyBuilder defaultBillingAddressId(@Nullable final String defaultBillingAddressId) {
        this.defaultBillingAddressId = defaultBillingAddressId;
        return this;
    }

    /**
     *  <p>Is always <code>Explicit</code> since a Company cannot have a parent Business Unit that Associates can be inherited from.</p>
     * @param associateMode value to be set
     * @return Builder
     */

    public CompanyBuilder associateMode(
            final com.commercetools.api.models.business_unit.BusinessUnitAssociateMode associateMode) {
        this.associateMode = associateMode;
        return this;
    }

    /**
     *  <p>Associates that are part of the Business Unit in specific roles.</p>
     * @param associates value to be set
     * @return Builder
     */

    public CompanyBuilder associates(final com.commercetools.api.models.business_unit.Associate... associates) {
        this.associates = new ArrayList<>(Arrays.asList(associates));
        return this;
    }

    /**
     *  <p>Associates that are part of the Business Unit in specific roles.</p>
     * @param associates value to be set
     * @return Builder
     */

    public CompanyBuilder associates(
            final java.util.List<com.commercetools.api.models.business_unit.Associate> associates) {
        this.associates = associates;
        return this;
    }

    /**
     *  <p>Associates that are part of the Business Unit in specific roles.</p>
     * @param associates value to be set
     * @return Builder
     */

    public CompanyBuilder plusAssociates(final com.commercetools.api.models.business_unit.Associate... associates) {
        if (this.associates == null) {
            this.associates = new ArrayList<>();
        }
        this.associates.addAll(Arrays.asList(associates));
        return this;
    }

    /**
     *  <p>Associates that are part of the Business Unit in specific roles.</p>
     * @param builder function to build the associates value
     * @return Builder
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
     *  <p>Associates that are part of the Business Unit in specific roles.</p>
     * @param builder function to build the associates value
     * @return Builder
     */

    public CompanyBuilder withAssociates(
            Function<com.commercetools.api.models.business_unit.AssociateBuilder, com.commercetools.api.models.business_unit.AssociateBuilder> builder) {
        this.associates = new ArrayList<>();
        this.associates.add(builder.apply(com.commercetools.api.models.business_unit.AssociateBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Associates that are part of the Business Unit in specific roles.</p>
     * @param builder function to build the associates value
     * @return Builder
     */

    public CompanyBuilder addAssociates(
            Function<com.commercetools.api.models.business_unit.AssociateBuilder, com.commercetools.api.models.business_unit.Associate> builder) {
        return plusAssociates(builder.apply(com.commercetools.api.models.business_unit.AssociateBuilder.of()));
    }

    /**
     *  <p>Associates that are part of the Business Unit in specific roles.</p>
     * @param builder function to build the associates value
     * @return Builder
     */

    public CompanyBuilder setAssociates(
            Function<com.commercetools.api.models.business_unit.AssociateBuilder, com.commercetools.api.models.business_unit.Associate> builder) {
        return associates(builder.apply(com.commercetools.api.models.business_unit.AssociateBuilder.of()));
    }

    /**
     *  <p>Associates that are inherited from a parent Business Unit. This value of this field is eventually consistent and is only present when the <code>associateMode</code> is set to <code>ExplicitAndFromParent</code>.</p>
     * @param inheritedAssociates value to be set
     * @return Builder
     */

    public CompanyBuilder inheritedAssociates(
            @Nullable final com.commercetools.api.models.business_unit.InheritedAssociate... inheritedAssociates) {
        this.inheritedAssociates = new ArrayList<>(Arrays.asList(inheritedAssociates));
        return this;
    }

    /**
     *  <p>Associates that are inherited from a parent Business Unit. This value of this field is eventually consistent and is only present when the <code>associateMode</code> is set to <code>ExplicitAndFromParent</code>.</p>
     * @param inheritedAssociates value to be set
     * @return Builder
     */

    public CompanyBuilder inheritedAssociates(
            @Nullable final java.util.List<com.commercetools.api.models.business_unit.InheritedAssociate> inheritedAssociates) {
        this.inheritedAssociates = inheritedAssociates;
        return this;
    }

    /**
     *  <p>Associates that are inherited from a parent Business Unit. This value of this field is eventually consistent and is only present when the <code>associateMode</code> is set to <code>ExplicitAndFromParent</code>.</p>
     * @param inheritedAssociates value to be set
     * @return Builder
     */

    public CompanyBuilder plusInheritedAssociates(
            @Nullable final com.commercetools.api.models.business_unit.InheritedAssociate... inheritedAssociates) {
        if (this.inheritedAssociates == null) {
            this.inheritedAssociates = new ArrayList<>();
        }
        this.inheritedAssociates.addAll(Arrays.asList(inheritedAssociates));
        return this;
    }

    /**
     *  <p>Associates that are inherited from a parent Business Unit. This value of this field is eventually consistent and is only present when the <code>associateMode</code> is set to <code>ExplicitAndFromParent</code>.</p>
     * @param builder function to build the inheritedAssociates value
     * @return Builder
     */

    public CompanyBuilder plusInheritedAssociates(
            Function<com.commercetools.api.models.business_unit.InheritedAssociateBuilder, com.commercetools.api.models.business_unit.InheritedAssociateBuilder> builder) {
        if (this.inheritedAssociates == null) {
            this.inheritedAssociates = new ArrayList<>();
        }
        this.inheritedAssociates
                .add(builder.apply(com.commercetools.api.models.business_unit.InheritedAssociateBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Associates that are inherited from a parent Business Unit. This value of this field is eventually consistent and is only present when the <code>associateMode</code> is set to <code>ExplicitAndFromParent</code>.</p>
     * @param builder function to build the inheritedAssociates value
     * @return Builder
     */

    public CompanyBuilder withInheritedAssociates(
            Function<com.commercetools.api.models.business_unit.InheritedAssociateBuilder, com.commercetools.api.models.business_unit.InheritedAssociateBuilder> builder) {
        this.inheritedAssociates = new ArrayList<>();
        this.inheritedAssociates
                .add(builder.apply(com.commercetools.api.models.business_unit.InheritedAssociateBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Associates that are inherited from a parent Business Unit. This value of this field is eventually consistent and is only present when the <code>associateMode</code> is set to <code>ExplicitAndFromParent</code>.</p>
     * @param builder function to build the inheritedAssociates value
     * @return Builder
     */

    public CompanyBuilder addInheritedAssociates(
            Function<com.commercetools.api.models.business_unit.InheritedAssociateBuilder, com.commercetools.api.models.business_unit.InheritedAssociate> builder) {
        return plusInheritedAssociates(
            builder.apply(com.commercetools.api.models.business_unit.InheritedAssociateBuilder.of()));
    }

    /**
     *  <p>Associates that are inherited from a parent Business Unit. This value of this field is eventually consistent and is only present when the <code>associateMode</code> is set to <code>ExplicitAndFromParent</code>.</p>
     * @param builder function to build the inheritedAssociates value
     * @return Builder
     */

    public CompanyBuilder setInheritedAssociates(
            Function<com.commercetools.api.models.business_unit.InheritedAssociateBuilder, com.commercetools.api.models.business_unit.InheritedAssociate> builder) {
        return inheritedAssociates(
            builder.apply(com.commercetools.api.models.business_unit.InheritedAssociateBuilder.of()));
    }

    /**
     *  <p>Parent unit of the Business Unit. Only present when the <code>unitType</code> is <code>Division</code>.</p>
     * @param builder function to build the parentUnit value
     * @return Builder
     */

    public CompanyBuilder parentUnit(
            Function<com.commercetools.api.models.business_unit.BusinessUnitKeyReferenceBuilder, com.commercetools.api.models.business_unit.BusinessUnitKeyReferenceBuilder> builder) {
        this.parentUnit = builder.apply(com.commercetools.api.models.business_unit.BusinessUnitKeyReferenceBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Parent unit of the Business Unit. Only present when the <code>unitType</code> is <code>Division</code>.</p>
     * @param builder function to build the parentUnit value
     * @return Builder
     */

    public CompanyBuilder withParentUnit(
            Function<com.commercetools.api.models.business_unit.BusinessUnitKeyReferenceBuilder, com.commercetools.api.models.business_unit.BusinessUnitKeyReference> builder) {
        this.parentUnit = builder
                .apply(com.commercetools.api.models.business_unit.BusinessUnitKeyReferenceBuilder.of());
        return this;
    }

    /**
     *  <p>Parent unit of the Business Unit. Only present when the <code>unitType</code> is <code>Division</code>.</p>
     * @param parentUnit value to be set
     * @return Builder
     */

    public CompanyBuilder parentUnit(
            @Nullable final com.commercetools.api.models.business_unit.BusinessUnitKeyReference parentUnit) {
        this.parentUnit = parentUnit;
        return this;
    }

    /**
     *  <p>Top-level unit of the Business Unit. The top-level unit is of <code>unitType</code> <code>Company</code>.</p>
     * @param builder function to build the topLevelUnit value
     * @return Builder
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
     * @param builder function to build the topLevelUnit value
     * @return Builder
     */

    public CompanyBuilder withTopLevelUnit(
            Function<com.commercetools.api.models.business_unit.BusinessUnitKeyReferenceBuilder, com.commercetools.api.models.business_unit.BusinessUnitKeyReference> builder) {
        this.topLevelUnit = builder
                .apply(com.commercetools.api.models.business_unit.BusinessUnitKeyReferenceBuilder.of());
        return this;
    }

    /**
     *  <p>Top-level unit of the Business Unit. The top-level unit is of <code>unitType</code> <code>Company</code>.</p>
     * @param topLevelUnit value to be set
     * @return Builder
     */

    public CompanyBuilder topLevelUnit(
            final com.commercetools.api.models.business_unit.BusinessUnitKeyReference topLevelUnit) {
        this.topLevelUnit = topLevelUnit;
        return this;
    }

    /**
     *  <p>Unique identifier of the Business Unit.</p>
     * @return id
     */

    public String getId() {
        return this.id;
    }

    /**
     *  <p>Current version of the Business Unit.</p>
     * @return version
     */

    public Long getVersion() {
        return this.version;
    }

    /**
     *  <p>Date and time (UTC) the Business Unit was initially created.</p>
     * @return createdAt
     */

    public java.time.ZonedDateTime getCreatedAt() {
        return this.createdAt;
    }

    /**
     *  <p>Date and time (UTC) the Business Unit was last updated.</p>
     * @return lastModifiedAt
     */

    public java.time.ZonedDateTime getLastModifiedAt() {
        return this.lastModifiedAt;
    }

    /**
     *  <p>Present on resources updated after 1 February 2019 except for events not tracked.</p>
     * @return lastModifiedBy
     */

    @Nullable
    public com.commercetools.api.models.common.LastModifiedBy getLastModifiedBy() {
        return this.lastModifiedBy;
    }

    /**
     *  <p>Present on resources created after 1 February 2019 except for events not tracked.</p>
     * @return createdBy
     */

    @Nullable
    public com.commercetools.api.models.common.CreatedBy getCreatedBy() {
        return this.createdBy;
    }

    /**
     *  <p>User-defined unique identifier of the Business Unit.</p>
     * @return key
     */

    public String getKey() {
        return this.key;
    }

    /**
     *  <p>Indicates whether the Business Unit can be edited and used in Orders.</p>
     * @return status
     */

    public com.commercetools.api.models.business_unit.BusinessUnitStatus getStatus() {
        return this.status;
    }

    /**
     *  <p>References to Stores the Business Unit is associated with. Only present when <code>storeMode</code> is <code>Explicit</code>.</p>
     *  <p>If the Business Unit has Stores defined, then all of its Carts, Orders, Quotes, or Quote Requests must belong to one of the Business Unit's Stores.</p>
     *  <p>If the Business Unit has no Stores, then all of its Carts, Orders, Quotes, or Quote Requests must not belong to any Store.</p>
     * @return stores
     */

    @Nullable
    public java.util.List<com.commercetools.api.models.store.StoreKeyReference> getStores() {
        return this.stores;
    }

    /**
     *  <p>Is always <code>Explicit</code> since a Company cannot have a parent Business Unit that Stores can be inherited from.</p>
     * @return storeMode
     */

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
     *  <p>Custom Fields for the Business Unit.</p>
     * @return custom
     */

    @Nullable
    public com.commercetools.api.models.type.CustomFields getCustom() {
        return this.custom;
    }

    /**
     *  <p>Addresses used by the Business Unit.</p>
     * @return addresses
     */

    public java.util.List<com.commercetools.api.models.common.Address> getAddresses() {
        return this.addresses;
    }

    /**
     *  <p>Unique identifiers of addresses used as shipping addresses.</p>
     * @return shippingAddressIds
     */

    @Nullable
    public java.util.List<String> getShippingAddressIds() {
        return this.shippingAddressIds;
    }

    /**
     *  <p>Unique identifier of the address used as the default shipping address.</p>
     * @return defaultShippingAddressId
     */

    @Nullable
    public String getDefaultShippingAddressId() {
        return this.defaultShippingAddressId;
    }

    /**
     *  <p>Unique identifiers of addresses used as billing addresses.</p>
     * @return billingAddressIds
     */

    @Nullable
    public java.util.List<String> getBillingAddressIds() {
        return this.billingAddressIds;
    }

    /**
     *  <p>Unique identifier of the address used as the default billing address.</p>
     * @return defaultBillingAddressId
     */

    @Nullable
    public String getDefaultBillingAddressId() {
        return this.defaultBillingAddressId;
    }

    /**
     *  <p>Is always <code>Explicit</code> since a Company cannot have a parent Business Unit that Associates can be inherited from.</p>
     * @return associateMode
     */

    public com.commercetools.api.models.business_unit.BusinessUnitAssociateMode getAssociateMode() {
        return this.associateMode;
    }

    /**
     *  <p>Associates that are part of the Business Unit in specific roles.</p>
     * @return associates
     */

    public java.util.List<com.commercetools.api.models.business_unit.Associate> getAssociates() {
        return this.associates;
    }

    /**
     *  <p>Associates that are inherited from a parent Business Unit. This value of this field is eventually consistent and is only present when the <code>associateMode</code> is set to <code>ExplicitAndFromParent</code>.</p>
     * @return inheritedAssociates
     */

    @Nullable
    public java.util.List<com.commercetools.api.models.business_unit.InheritedAssociate> getInheritedAssociates() {
        return this.inheritedAssociates;
    }

    /**
     *  <p>Parent unit of the Business Unit. Only present when the <code>unitType</code> is <code>Division</code>.</p>
     * @return parentUnit
     */

    @Nullable
    public com.commercetools.api.models.business_unit.BusinessUnitKeyReference getParentUnit() {
        return this.parentUnit;
    }

    /**
     *  <p>Top-level unit of the Business Unit. The top-level unit is of <code>unitType</code> <code>Company</code>.</p>
     * @return topLevelUnit
     */

    public com.commercetools.api.models.business_unit.BusinessUnitKeyReference getTopLevelUnit() {
        return this.topLevelUnit;
    }

    /**
     * builds Company with checking for non-null required values
     * @return Company
     */
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
        Objects.requireNonNull(associateMode, Company.class + ": associateMode is missing");
        Objects.requireNonNull(associates, Company.class + ": associates is missing");
        Objects.requireNonNull(topLevelUnit, Company.class + ": topLevelUnit is missing");
        return new CompanyImpl(id, version, createdAt, lastModifiedAt, lastModifiedBy, createdBy, key, status, stores,
            storeMode, name, contactEmail, custom, addresses, shippingAddressIds, defaultShippingAddressId,
            billingAddressIds, defaultBillingAddressId, associateMode, associates, inheritedAssociates, parentUnit,
            topLevelUnit);
    }

    /**
     * builds Company without checking for non-null required values
     * @return Company
     */
    public Company buildUnchecked() {
        return new CompanyImpl(id, version, createdAt, lastModifiedAt, lastModifiedBy, createdBy, key, status, stores,
            storeMode, name, contactEmail, custom, addresses, shippingAddressIds, defaultShippingAddressId,
            billingAddressIds, defaultBillingAddressId, associateMode, associates, inheritedAssociates, parentUnit,
            topLevelUnit);
    }

    /**
     * factory method for an instance of CompanyBuilder
     * @return builder
     */
    public static CompanyBuilder of() {
        return new CompanyBuilder();
    }

    /**
     * create builder for Company instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
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
        builder.defaultShippingAddressId = template.getDefaultShippingAddressId();
        builder.billingAddressIds = template.getBillingAddressIds();
        builder.defaultBillingAddressId = template.getDefaultBillingAddressId();
        builder.associateMode = template.getAssociateMode();
        builder.associates = template.getAssociates();
        builder.inheritedAssociates = template.getInheritedAssociates();
        builder.parentUnit = template.getParentUnit();
        builder.topLevelUnit = template.getTopLevelUnit();
        return builder;
    }

}
