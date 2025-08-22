
package com.commercetools.importapi.models.business_units;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CompanyBusinessUnitImportBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CompanyBusinessUnitImport companyBusinessUnitImport = CompanyBusinessUnitImport.builder()
 *             .key("{key}")
 *             .name("{name}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CompanyBusinessUnitImportBuilder implements Builder<CompanyBusinessUnitImport> {

    private String key;

    private String name;

    @Nullable
    private com.commercetools.importapi.models.business_units.BusinessUnitStatus status;

    @Nullable
    private String contactEmail;

    @Nullable
    private java.util.List<com.commercetools.importapi.models.business_units.AssociateDraft> associates;

    @Nullable
    private java.util.List<com.commercetools.importapi.models.common.Address> addresses;

    @Nullable
    private java.util.List<Integer> shippingAddresses;

    @Nullable
    private Integer defaultShippingAddress;

    @Nullable
    private java.util.List<Integer> billingAddresses;

    @Nullable
    private Integer defaultBillingAddress;

    @Nullable
    private java.util.List<com.commercetools.importapi.models.common.StoreKeyReference> stores;

    @Nullable
    private com.commercetools.importapi.models.customfields.Custom custom;

    @Nullable
    private com.commercetools.importapi.models.business_units.BusinessUnitStoreMode storeMode;

    /**
     *  <p>User-defined unique identifier. If a BusinessUnit with this <code>key</code> exists, it is updated with the imported data.</p>
     * @param key value to be set
     * @return Builder
     */

    public CompanyBusinessUnitImportBuilder key(final String key) {
        this.key = key;
        return this;
    }

    /**
     *  <p>The name of the Business Unit.</p>
     * @param name value to be set
     * @return Builder
     */

    public CompanyBusinessUnitImportBuilder name(final String name) {
        this.name = name;
        return this;
    }

    /**
     *  <p>The status of the Business Unit.</p>
     * @param status value to be set
     * @return Builder
     */

    public CompanyBusinessUnitImportBuilder status(
            @Nullable final com.commercetools.importapi.models.business_units.BusinessUnitStatus status) {
        this.status = status;
        return this;
    }

    /**
     *  <p>The contact email address for the Business Unit.</p>
     * @param contactEmail value to be set
     * @return Builder
     */

    public CompanyBusinessUnitImportBuilder contactEmail(@Nullable final String contactEmail) {
        this.contactEmail = contactEmail;
        return this;
    }

    /**
     *  <p>List of Associates to be assigned to the Business Unit.</p>
     * @param associates value to be set
     * @return Builder
     */

    public CompanyBusinessUnitImportBuilder associates(
            @Nullable final com.commercetools.importapi.models.business_units.AssociateDraft... associates) {
        this.associates = new ArrayList<>(Arrays.asList(associates));
        return this;
    }

    /**
     *  <p>List of Associates to be assigned to the Business Unit.</p>
     * @param associates value to be set
     * @return Builder
     */

    public CompanyBusinessUnitImportBuilder associates(
            @Nullable final java.util.List<com.commercetools.importapi.models.business_units.AssociateDraft> associates) {
        this.associates = associates;
        return this;
    }

    /**
     *  <p>List of Associates to be assigned to the Business Unit.</p>
     * @param associates value to be set
     * @return Builder
     */

    public CompanyBusinessUnitImportBuilder plusAssociates(
            @Nullable final com.commercetools.importapi.models.business_units.AssociateDraft... associates) {
        if (this.associates == null) {
            this.associates = new ArrayList<>();
        }
        this.associates.addAll(Arrays.asList(associates));
        return this;
    }

    /**
     *  <p>List of Associates to be assigned to the Business Unit.</p>
     * @param builder function to build the associates value
     * @return Builder
     */

    public CompanyBusinessUnitImportBuilder plusAssociates(
            Function<com.commercetools.importapi.models.business_units.AssociateDraftBuilder, com.commercetools.importapi.models.business_units.AssociateDraftBuilder> builder) {
        if (this.associates == null) {
            this.associates = new ArrayList<>();
        }
        this.associates.add(
            builder.apply(com.commercetools.importapi.models.business_units.AssociateDraftBuilder.of()).build());
        return this;
    }

    /**
     *  <p>List of Associates to be assigned to the Business Unit.</p>
     * @param builder function to build the associates value
     * @return Builder
     */

    public CompanyBusinessUnitImportBuilder withAssociates(
            Function<com.commercetools.importapi.models.business_units.AssociateDraftBuilder, com.commercetools.importapi.models.business_units.AssociateDraftBuilder> builder) {
        this.associates = new ArrayList<>();
        this.associates.add(
            builder.apply(com.commercetools.importapi.models.business_units.AssociateDraftBuilder.of()).build());
        return this;
    }

    /**
     *  <p>List of Associates to be assigned to the Business Unit.</p>
     * @param builder function to build the associates value
     * @return Builder
     */

    public CompanyBusinessUnitImportBuilder addAssociates(
            Function<com.commercetools.importapi.models.business_units.AssociateDraftBuilder, com.commercetools.importapi.models.business_units.AssociateDraft> builder) {
        return plusAssociates(
            builder.apply(com.commercetools.importapi.models.business_units.AssociateDraftBuilder.of()));
    }

    /**
     *  <p>List of Associates to be assigned to the Business Unit.</p>
     * @param builder function to build the associates value
     * @return Builder
     */

    public CompanyBusinessUnitImportBuilder setAssociates(
            Function<com.commercetools.importapi.models.business_units.AssociateDraftBuilder, com.commercetools.importapi.models.business_units.AssociateDraft> builder) {
        return associates(builder.apply(com.commercetools.importapi.models.business_units.AssociateDraftBuilder.of()));
    }

    /**
     *  <p>The addresses for the Business Unit.</p>
     * @param addresses value to be set
     * @return Builder
     */

    public CompanyBusinessUnitImportBuilder addresses(
            @Nullable final com.commercetools.importapi.models.common.Address... addresses) {
        this.addresses = new ArrayList<>(Arrays.asList(addresses));
        return this;
    }

    /**
     *  <p>The addresses for the Business Unit.</p>
     * @param addresses value to be set
     * @return Builder
     */

    public CompanyBusinessUnitImportBuilder addresses(
            @Nullable final java.util.List<com.commercetools.importapi.models.common.Address> addresses) {
        this.addresses = addresses;
        return this;
    }

    /**
     *  <p>The addresses for the Business Unit.</p>
     * @param addresses value to be set
     * @return Builder
     */

    public CompanyBusinessUnitImportBuilder plusAddresses(
            @Nullable final com.commercetools.importapi.models.common.Address... addresses) {
        if (this.addresses == null) {
            this.addresses = new ArrayList<>();
        }
        this.addresses.addAll(Arrays.asList(addresses));
        return this;
    }

    /**
     *  <p>The addresses for the Business Unit.</p>
     * @param builder function to build the addresses value
     * @return Builder
     */

    public CompanyBusinessUnitImportBuilder plusAddresses(
            Function<com.commercetools.importapi.models.common.AddressBuilder, com.commercetools.importapi.models.common.AddressBuilder> builder) {
        if (this.addresses == null) {
            this.addresses = new ArrayList<>();
        }
        this.addresses.add(builder.apply(com.commercetools.importapi.models.common.AddressBuilder.of()).build());
        return this;
    }

    /**
     *  <p>The addresses for the Business Unit.</p>
     * @param builder function to build the addresses value
     * @return Builder
     */

    public CompanyBusinessUnitImportBuilder withAddresses(
            Function<com.commercetools.importapi.models.common.AddressBuilder, com.commercetools.importapi.models.common.AddressBuilder> builder) {
        this.addresses = new ArrayList<>();
        this.addresses.add(builder.apply(com.commercetools.importapi.models.common.AddressBuilder.of()).build());
        return this;
    }

    /**
     *  <p>The addresses for the Business Unit.</p>
     * @param builder function to build the addresses value
     * @return Builder
     */

    public CompanyBusinessUnitImportBuilder addAddresses(
            Function<com.commercetools.importapi.models.common.AddressBuilder, com.commercetools.importapi.models.common.Address> builder) {
        return plusAddresses(builder.apply(com.commercetools.importapi.models.common.AddressBuilder.of()));
    }

    /**
     *  <p>The addresses for the Business Unit.</p>
     * @param builder function to build the addresses value
     * @return Builder
     */

    public CompanyBusinessUnitImportBuilder setAddresses(
            Function<com.commercetools.importapi.models.common.AddressBuilder, com.commercetools.importapi.models.common.Address> builder) {
        return addresses(builder.apply(com.commercetools.importapi.models.common.AddressBuilder.of()));
    }

    /**
     *  <p>The indices of the shipping addresses in the <code>addresses</code> array.</p>
     * @param shippingAddresses value to be set
     * @return Builder
     */

    public CompanyBusinessUnitImportBuilder shippingAddresses(@Nullable final Integer... shippingAddresses) {
        this.shippingAddresses = new ArrayList<>(Arrays.asList(shippingAddresses));
        return this;
    }

    /**
     *  <p>The indices of the shipping addresses in the <code>addresses</code> array.</p>
     * @param shippingAddresses value to be set
     * @return Builder
     */

    public CompanyBusinessUnitImportBuilder shippingAddresses(
            @Nullable final java.util.List<Integer> shippingAddresses) {
        this.shippingAddresses = shippingAddresses;
        return this;
    }

    /**
     *  <p>The indices of the shipping addresses in the <code>addresses</code> array.</p>
     * @param shippingAddresses value to be set
     * @return Builder
     */

    public CompanyBusinessUnitImportBuilder plusShippingAddresses(@Nullable final Integer... shippingAddresses) {
        if (this.shippingAddresses == null) {
            this.shippingAddresses = new ArrayList<>();
        }
        this.shippingAddresses.addAll(Arrays.asList(shippingAddresses));
        return this;
    }

    /**
     *  <p>The index of the default shipping address in the <code>addresses</code> array.</p>
     * @param defaultShippingAddress value to be set
     * @return Builder
     */

    public CompanyBusinessUnitImportBuilder defaultShippingAddress(@Nullable final Integer defaultShippingAddress) {
        this.defaultShippingAddress = defaultShippingAddress;
        return this;
    }

    /**
     *  <p>The indices of the billing addresses in the <code>addresses</code> array.</p>
     * @param billingAddresses value to be set
     * @return Builder
     */

    public CompanyBusinessUnitImportBuilder billingAddresses(@Nullable final Integer... billingAddresses) {
        this.billingAddresses = new ArrayList<>(Arrays.asList(billingAddresses));
        return this;
    }

    /**
     *  <p>The indices of the billing addresses in the <code>addresses</code> array.</p>
     * @param billingAddresses value to be set
     * @return Builder
     */

    public CompanyBusinessUnitImportBuilder billingAddresses(@Nullable final java.util.List<Integer> billingAddresses) {
        this.billingAddresses = billingAddresses;
        return this;
    }

    /**
     *  <p>The indices of the billing addresses in the <code>addresses</code> array.</p>
     * @param billingAddresses value to be set
     * @return Builder
     */

    public CompanyBusinessUnitImportBuilder plusBillingAddresses(@Nullable final Integer... billingAddresses) {
        if (this.billingAddresses == null) {
            this.billingAddresses = new ArrayList<>();
        }
        this.billingAddresses.addAll(Arrays.asList(billingAddresses));
        return this;
    }

    /**
     *  <p>The index of the default billing address in the <code>addresses</code> array.</p>
     * @param defaultBillingAddress value to be set
     * @return Builder
     */

    public CompanyBusinessUnitImportBuilder defaultBillingAddress(@Nullable final Integer defaultBillingAddress) {
        this.defaultBillingAddress = defaultBillingAddress;
        return this;
    }

    /**
     *  <p>The Stores of the Business Unit.</p>
     * @param stores value to be set
     * @return Builder
     */

    public CompanyBusinessUnitImportBuilder stores(
            @Nullable final com.commercetools.importapi.models.common.StoreKeyReference... stores) {
        this.stores = new ArrayList<>(Arrays.asList(stores));
        return this;
    }

    /**
     *  <p>The Stores of the Business Unit.</p>
     * @param stores value to be set
     * @return Builder
     */

    public CompanyBusinessUnitImportBuilder stores(
            @Nullable final java.util.List<com.commercetools.importapi.models.common.StoreKeyReference> stores) {
        this.stores = stores;
        return this;
    }

    /**
     *  <p>The Stores of the Business Unit.</p>
     * @param stores value to be set
     * @return Builder
     */

    public CompanyBusinessUnitImportBuilder plusStores(
            @Nullable final com.commercetools.importapi.models.common.StoreKeyReference... stores) {
        if (this.stores == null) {
            this.stores = new ArrayList<>();
        }
        this.stores.addAll(Arrays.asList(stores));
        return this;
    }

    /**
     *  <p>The Stores of the Business Unit.</p>
     * @param builder function to build the stores value
     * @return Builder
     */

    public CompanyBusinessUnitImportBuilder plusStores(
            Function<com.commercetools.importapi.models.common.StoreKeyReferenceBuilder, com.commercetools.importapi.models.common.StoreKeyReferenceBuilder> builder) {
        if (this.stores == null) {
            this.stores = new ArrayList<>();
        }
        this.stores.add(builder.apply(com.commercetools.importapi.models.common.StoreKeyReferenceBuilder.of()).build());
        return this;
    }

    /**
     *  <p>The Stores of the Business Unit.</p>
     * @param builder function to build the stores value
     * @return Builder
     */

    public CompanyBusinessUnitImportBuilder withStores(
            Function<com.commercetools.importapi.models.common.StoreKeyReferenceBuilder, com.commercetools.importapi.models.common.StoreKeyReferenceBuilder> builder) {
        this.stores = new ArrayList<>();
        this.stores.add(builder.apply(com.commercetools.importapi.models.common.StoreKeyReferenceBuilder.of()).build());
        return this;
    }

    /**
     *  <p>The Stores of the Business Unit.</p>
     * @param builder function to build the stores value
     * @return Builder
     */

    public CompanyBusinessUnitImportBuilder addStores(
            Function<com.commercetools.importapi.models.common.StoreKeyReferenceBuilder, com.commercetools.importapi.models.common.StoreKeyReference> builder) {
        return plusStores(builder.apply(com.commercetools.importapi.models.common.StoreKeyReferenceBuilder.of()));
    }

    /**
     *  <p>The Stores of the Business Unit.</p>
     * @param builder function to build the stores value
     * @return Builder
     */

    public CompanyBusinessUnitImportBuilder setStores(
            Function<com.commercetools.importapi.models.common.StoreKeyReferenceBuilder, com.commercetools.importapi.models.common.StoreKeyReference> builder) {
        return stores(builder.apply(com.commercetools.importapi.models.common.StoreKeyReferenceBuilder.of()));
    }

    /**
     *  <p>Custom fields for the Business Unit.</p>
     * @param builder function to build the custom value
     * @return Builder
     */

    public CompanyBusinessUnitImportBuilder custom(
            Function<com.commercetools.importapi.models.customfields.CustomBuilder, com.commercetools.importapi.models.customfields.CustomBuilder> builder) {
        this.custom = builder.apply(com.commercetools.importapi.models.customfields.CustomBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Custom fields for the Business Unit.</p>
     * @param builder function to build the custom value
     * @return Builder
     */

    public CompanyBusinessUnitImportBuilder withCustom(
            Function<com.commercetools.importapi.models.customfields.CustomBuilder, com.commercetools.importapi.models.customfields.Custom> builder) {
        this.custom = builder.apply(com.commercetools.importapi.models.customfields.CustomBuilder.of());
        return this;
    }

    /**
     *  <p>Custom fields for the Business Unit.</p>
     * @param custom value to be set
     * @return Builder
     */

    public CompanyBusinessUnitImportBuilder custom(
            @Nullable final com.commercetools.importapi.models.customfields.Custom custom) {
        this.custom = custom;
        return this;
    }

    /**
     * set the value to the storeMode
     * @param storeMode value to be set
     * @return Builder
     */

    public CompanyBusinessUnitImportBuilder storeMode(
            @Nullable final com.commercetools.importapi.models.business_units.BusinessUnitStoreMode storeMode) {
        this.storeMode = storeMode;
        return this;
    }

    /**
     *  <p>User-defined unique identifier. If a BusinessUnit with this <code>key</code> exists, it is updated with the imported data.</p>
     * @return key
     */

    public String getKey() {
        return this.key;
    }

    /**
     *  <p>The name of the Business Unit.</p>
     * @return name
     */

    public String getName() {
        return this.name;
    }

    /**
     *  <p>The status of the Business Unit.</p>
     * @return status
     */

    @Nullable
    public com.commercetools.importapi.models.business_units.BusinessUnitStatus getStatus() {
        return this.status;
    }

    /**
     *  <p>The contact email address for the Business Unit.</p>
     * @return contactEmail
     */

    @Nullable
    public String getContactEmail() {
        return this.contactEmail;
    }

    /**
     *  <p>List of Associates to be assigned to the Business Unit.</p>
     * @return associates
     */

    @Nullable
    public java.util.List<com.commercetools.importapi.models.business_units.AssociateDraft> getAssociates() {
        return this.associates;
    }

    /**
     *  <p>The addresses for the Business Unit.</p>
     * @return addresses
     */

    @Nullable
    public java.util.List<com.commercetools.importapi.models.common.Address> getAddresses() {
        return this.addresses;
    }

    /**
     *  <p>The indices of the shipping addresses in the <code>addresses</code> array.</p>
     * @return shippingAddresses
     */

    @Nullable
    public java.util.List<Integer> getShippingAddresses() {
        return this.shippingAddresses;
    }

    /**
     *  <p>The index of the default shipping address in the <code>addresses</code> array.</p>
     * @return defaultShippingAddress
     */

    @Nullable
    public Integer getDefaultShippingAddress() {
        return this.defaultShippingAddress;
    }

    /**
     *  <p>The indices of the billing addresses in the <code>addresses</code> array.</p>
     * @return billingAddresses
     */

    @Nullable
    public java.util.List<Integer> getBillingAddresses() {
        return this.billingAddresses;
    }

    /**
     *  <p>The index of the default billing address in the <code>addresses</code> array.</p>
     * @return defaultBillingAddress
     */

    @Nullable
    public Integer getDefaultBillingAddress() {
        return this.defaultBillingAddress;
    }

    /**
     *  <p>The Stores of the Business Unit.</p>
     * @return stores
     */

    @Nullable
    public java.util.List<com.commercetools.importapi.models.common.StoreKeyReference> getStores() {
        return this.stores;
    }

    /**
     *  <p>Custom fields for the Business Unit.</p>
     * @return custom
     */

    @Nullable
    public com.commercetools.importapi.models.customfields.Custom getCustom() {
        return this.custom;
    }

    /**
     * value of storeMode}
     * @return storeMode
     */

    @Nullable
    public com.commercetools.importapi.models.business_units.BusinessUnitStoreMode getStoreMode() {
        return this.storeMode;
    }

    /**
     * builds CompanyBusinessUnitImport with checking for non-null required values
     * @return CompanyBusinessUnitImport
     */
    public CompanyBusinessUnitImport build() {
        Objects.requireNonNull(key, CompanyBusinessUnitImport.class + ": key is missing");
        Objects.requireNonNull(name, CompanyBusinessUnitImport.class + ": name is missing");
        return new CompanyBusinessUnitImportImpl(key, name, status, contactEmail, associates, addresses,
            shippingAddresses, defaultShippingAddress, billingAddresses, defaultBillingAddress, stores, custom,
            storeMode);
    }

    /**
     * builds CompanyBusinessUnitImport without checking for non-null required values
     * @return CompanyBusinessUnitImport
     */
    public CompanyBusinessUnitImport buildUnchecked() {
        return new CompanyBusinessUnitImportImpl(key, name, status, contactEmail, associates, addresses,
            shippingAddresses, defaultShippingAddress, billingAddresses, defaultBillingAddress, stores, custom,
            storeMode);
    }

    /**
     * factory method for an instance of CompanyBusinessUnitImportBuilder
     * @return builder
     */
    public static CompanyBusinessUnitImportBuilder of() {
        return new CompanyBusinessUnitImportBuilder();
    }

    /**
     * create builder for CompanyBusinessUnitImport instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CompanyBusinessUnitImportBuilder of(final CompanyBusinessUnitImport template) {
        CompanyBusinessUnitImportBuilder builder = new CompanyBusinessUnitImportBuilder();
        builder.key = template.getKey();
        builder.name = template.getName();
        builder.status = template.getStatus();
        builder.contactEmail = template.getContactEmail();
        builder.associates = template.getAssociates();
        builder.addresses = template.getAddresses();
        builder.shippingAddresses = template.getShippingAddresses();
        builder.defaultShippingAddress = template.getDefaultShippingAddress();
        builder.billingAddresses = template.getBillingAddresses();
        builder.defaultBillingAddress = template.getDefaultBillingAddress();
        builder.stores = template.getStores();
        builder.custom = template.getCustom();
        builder.storeMode = template.getStoreMode();
        return builder;
    }

}
