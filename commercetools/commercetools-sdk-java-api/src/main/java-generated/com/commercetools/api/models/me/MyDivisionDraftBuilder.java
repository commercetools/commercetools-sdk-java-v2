
package com.commercetools.api.models.me;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * MyDivisionDraftBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MyDivisionDraft myDivisionDraft = MyDivisionDraft.builder()
 *             .key("{key}")
 *             .name("{name}")
 *             .parentUnit(parentUnitBuilder -> parentUnitBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class MyDivisionDraftBuilder implements Builder<MyDivisionDraft> {

    private String key;

    private String name;

    @Nullable
    private String contactEmail;

    @Nullable
    private com.commercetools.api.models.type.CustomFields custom;

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

    private com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifier parentUnit;

    /**
     *  <p>User-defined unique identifier for the BusinessUnit.</p>
     */

    public MyDivisionDraftBuilder key(final String key) {
        this.key = key;
        return this;
    }

    /**
     *  <p>Name of the Business Unit.</p>
     */

    public MyDivisionDraftBuilder name(final String name) {
        this.name = name;
        return this;
    }

    /**
     *  <p>Email address of the Business Unit.</p>
     */

    public MyDivisionDraftBuilder contactEmail(@Nullable final String contactEmail) {
        this.contactEmail = contactEmail;
        return this;
    }

    /**
     *  <p>Custom Fields for the Business Unit.</p>
     */

    public MyDivisionDraftBuilder custom(
            Function<com.commercetools.api.models.type.CustomFieldsBuilder, com.commercetools.api.models.type.CustomFieldsBuilder> builder) {
        this.custom = builder.apply(com.commercetools.api.models.type.CustomFieldsBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Custom Fields for the Business Unit.</p>
     */

    public MyDivisionDraftBuilder custom(@Nullable final com.commercetools.api.models.type.CustomFields custom) {
        this.custom = custom;
        return this;
    }

    /**
     *  <p>Addresses used by the Business Unit.</p>
     */

    public MyDivisionDraftBuilder addresses(
            @Nullable final com.commercetools.api.models.common.BaseAddress... addresses) {
        this.addresses = new ArrayList<>(Arrays.asList(addresses));
        return this;
    }

    /**
     *  <p>Addresses used by the Business Unit.</p>
     */

    public MyDivisionDraftBuilder addresses(
            @Nullable final java.util.List<com.commercetools.api.models.common.BaseAddress> addresses) {
        this.addresses = addresses;
        return this;
    }

    /**
     *  <p>Addresses used by the Business Unit.</p>
     */

    public MyDivisionDraftBuilder plusAddresses(
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

    public MyDivisionDraftBuilder plusAddresses(
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

    public MyDivisionDraftBuilder withAddresses(
            Function<com.commercetools.api.models.common.BaseAddressBuilder, com.commercetools.api.models.common.BaseAddressBuilder> builder) {
        this.addresses = new ArrayList<>();
        this.addresses.add(builder.apply(com.commercetools.api.models.common.BaseAddressBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Indexes of entries in <code>addresses</code> to set as shipping addresses. The <code>shippingAddressIds</code> of the Customer will be replaced by these addresses.</p>
     */

    public MyDivisionDraftBuilder shippingAddresses(@Nullable final Integer... shippingAddresses) {
        this.shippingAddresses = new ArrayList<>(Arrays.asList(shippingAddresses));
        return this;
    }

    /**
     *  <p>Indexes of entries in <code>addresses</code> to set as shipping addresses. The <code>shippingAddressIds</code> of the Customer will be replaced by these addresses.</p>
     */

    public MyDivisionDraftBuilder shippingAddresses(@Nullable final java.util.List<Integer> shippingAddresses) {
        this.shippingAddresses = shippingAddresses;
        return this;
    }

    /**
     *  <p>Indexes of entries in <code>addresses</code> to set as shipping addresses. The <code>shippingAddressIds</code> of the Customer will be replaced by these addresses.</p>
     */

    public MyDivisionDraftBuilder plusShippingAddresses(@Nullable final Integer... shippingAddresses) {
        if (this.shippingAddresses == null) {
            this.shippingAddresses = new ArrayList<>();
        }
        this.shippingAddresses.addAll(Arrays.asList(shippingAddresses));
        return this;
    }

    /**
     *  <p>Index of the entry in <code>addresses</code> to set as the default shipping address.</p>
     */

    public MyDivisionDraftBuilder defaultShippingAddress(@Nullable final Integer defaultShippingAddress) {
        this.defaultShippingAddress = defaultShippingAddress;
        return this;
    }

    /**
     *  <p>Indexes of entries in <code>addresses</code> to set as billing addresses. The <code>billingAddressIds</code> of the Customer will be replaced by these addresses.</p>
     */

    public MyDivisionDraftBuilder billingAddresses(@Nullable final Integer... billingAddresses) {
        this.billingAddresses = new ArrayList<>(Arrays.asList(billingAddresses));
        return this;
    }

    /**
     *  <p>Indexes of entries in <code>addresses</code> to set as billing addresses. The <code>billingAddressIds</code> of the Customer will be replaced by these addresses.</p>
     */

    public MyDivisionDraftBuilder billingAddresses(@Nullable final java.util.List<Integer> billingAddresses) {
        this.billingAddresses = billingAddresses;
        return this;
    }

    /**
     *  <p>Indexes of entries in <code>addresses</code> to set as billing addresses. The <code>billingAddressIds</code> of the Customer will be replaced by these addresses.</p>
     */

    public MyDivisionDraftBuilder plusBillingAddresses(@Nullable final Integer... billingAddresses) {
        if (this.billingAddresses == null) {
            this.billingAddresses = new ArrayList<>();
        }
        this.billingAddresses.addAll(Arrays.asList(billingAddresses));
        return this;
    }

    /**
     *  <p>Index of the entry in <code>addresses</code> to set as the default billing address.</p>
     */

    public MyDivisionDraftBuilder defaultBillingAddress(@Nullable final Integer defaultBillingAddress) {
        this.defaultBillingAddress = defaultBillingAddress;
        return this;
    }

    /**
     *  <p>The parent unit of this Division. Can be a Company or a Division.</p>
     */

    public MyDivisionDraftBuilder parentUnit(
            Function<com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifierBuilder, com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifierBuilder> builder) {
        this.parentUnit = builder
                .apply(com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifierBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>The parent unit of this Division. Can be a Company or a Division.</p>
     */

    public MyDivisionDraftBuilder parentUnit(
            final com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifier parentUnit) {
        this.parentUnit = parentUnit;
        return this;
    }

    public String getKey() {
        return this.key;
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

    @Nullable
    public java.util.List<com.commercetools.api.models.common.BaseAddress> getAddresses() {
        return this.addresses;
    }

    @Nullable
    public java.util.List<Integer> getShippingAddresses() {
        return this.shippingAddresses;
    }

    @Nullable
    public Integer getDefaultShippingAddress() {
        return this.defaultShippingAddress;
    }

    @Nullable
    public java.util.List<Integer> getBillingAddresses() {
        return this.billingAddresses;
    }

    @Nullable
    public Integer getDefaultBillingAddress() {
        return this.defaultBillingAddress;
    }

    public com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifier getParentUnit() {
        return this.parentUnit;
    }

    public MyDivisionDraft build() {
        Objects.requireNonNull(key, MyDivisionDraft.class + ": key is missing");
        Objects.requireNonNull(name, MyDivisionDraft.class + ": name is missing");
        Objects.requireNonNull(parentUnit, MyDivisionDraft.class + ": parentUnit is missing");
        return new MyDivisionDraftImpl(key, name, contactEmail, custom, addresses, shippingAddresses,
            defaultShippingAddress, billingAddresses, defaultBillingAddress, parentUnit);
    }

    /**
     * builds MyDivisionDraft without checking for non null required values
     */
    public MyDivisionDraft buildUnchecked() {
        return new MyDivisionDraftImpl(key, name, contactEmail, custom, addresses, shippingAddresses,
            defaultShippingAddress, billingAddresses, defaultBillingAddress, parentUnit);
    }

    public static MyDivisionDraftBuilder of() {
        return new MyDivisionDraftBuilder();
    }

    public static MyDivisionDraftBuilder of(final MyDivisionDraft template) {
        MyDivisionDraftBuilder builder = new MyDivisionDraftBuilder();
        builder.key = template.getKey();
        builder.name = template.getName();
        builder.contactEmail = template.getContactEmail();
        builder.custom = template.getCustom();
        builder.addresses = template.getAddresses();
        builder.shippingAddresses = template.getShippingAddresses();
        builder.defaultShippingAddress = template.getDefaultShippingAddress();
        builder.billingAddresses = template.getBillingAddresses();
        builder.defaultBillingAddress = template.getDefaultBillingAddress();
        builder.parentUnit = template.getParentUnit();
        return builder;
    }

}
