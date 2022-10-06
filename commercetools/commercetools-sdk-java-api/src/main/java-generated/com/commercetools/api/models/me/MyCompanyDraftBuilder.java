
package com.commercetools.api.models.me;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * MyCompanyDraftBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MyCompanyDraft myCompanyDraft = MyCompanyDraft.builder()
 *             .key("{key}")
 *             .name("{name}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class MyCompanyDraftBuilder implements Builder<MyCompanyDraft> {

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
    private Integer defaultShipingAddress;

    @Nullable
    private java.util.List<Integer> billingAddresses;

    @Nullable
    private Integer defaultBillingAddress;

    /**
     *  <p>User-defined unique identifier for the BusinessUnit.</p>
     */

    public MyCompanyDraftBuilder key(final String key) {
        this.key = key;
        return this;
    }

    /**
     *  <p>Name of the Business Unit.</p>
     */

    public MyCompanyDraftBuilder name(final String name) {
        this.name = name;
        return this;
    }

    /**
     *  <p>Email address of the Business Unit.</p>
     */

    public MyCompanyDraftBuilder contactEmail(@Nullable final String contactEmail) {
        this.contactEmail = contactEmail;
        return this;
    }

    /**
     *  <p>Custom Fields for the Business Unit.</p>
     */

    public MyCompanyDraftBuilder custom(
            Function<com.commercetools.api.models.type.CustomFieldsBuilder, com.commercetools.api.models.type.CustomFieldsBuilder> builder) {
        this.custom = builder.apply(com.commercetools.api.models.type.CustomFieldsBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Custom Fields for the Business Unit.</p>
     */

    public MyCompanyDraftBuilder custom(@Nullable final com.commercetools.api.models.type.CustomFields custom) {
        this.custom = custom;
        return this;
    }

    /**
     *  <p>Addresses used by the Business Unit.</p>
     */

    public MyCompanyDraftBuilder addresses(
            @Nullable final com.commercetools.api.models.common.BaseAddress... addresses) {
        this.addresses = new ArrayList<>(Arrays.asList(addresses));
        return this;
    }

    /**
     *  <p>Addresses used by the Business Unit.</p>
     */

    public MyCompanyDraftBuilder addresses(
            @Nullable final java.util.List<com.commercetools.api.models.common.BaseAddress> addresses) {
        this.addresses = addresses;
        return this;
    }

    /**
     *  <p>Addresses used by the Business Unit.</p>
     */

    public MyCompanyDraftBuilder plusAddresses(
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

    public MyCompanyDraftBuilder plusAddresses(
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

    public MyCompanyDraftBuilder withAddresses(
            Function<com.commercetools.api.models.common.BaseAddressBuilder, com.commercetools.api.models.common.BaseAddressBuilder> builder) {
        this.addresses = new ArrayList<>();
        this.addresses.add(builder.apply(com.commercetools.api.models.common.BaseAddressBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Indexes of entries in <code>addresses</code> to set as shipping addresses. The <code>shippingAddressIds</code> of the Customer will be replaced by these addresses.</p>
     */

    public MyCompanyDraftBuilder shippingAddresses(@Nullable final Integer... shippingAddresses) {
        this.shippingAddresses = new ArrayList<>(Arrays.asList(shippingAddresses));
        return this;
    }

    /**
     *  <p>Indexes of entries in <code>addresses</code> to set as shipping addresses. The <code>shippingAddressIds</code> of the Customer will be replaced by these addresses.</p>
     */

    public MyCompanyDraftBuilder shippingAddresses(@Nullable final java.util.List<Integer> shippingAddresses) {
        this.shippingAddresses = shippingAddresses;
        return this;
    }

    /**
     *  <p>Indexes of entries in <code>addresses</code> to set as shipping addresses. The <code>shippingAddressIds</code> of the Customer will be replaced by these addresses.</p>
     */

    public MyCompanyDraftBuilder plusShippingAddresses(@Nullable final Integer... shippingAddresses) {
        if (this.shippingAddresses == null) {
            this.shippingAddresses = new ArrayList<>();
        }
        this.shippingAddresses.addAll(Arrays.asList(shippingAddresses));
        return this;
    }

    /**
     *  <p>Index of the entry in <code>addresses</code> to set as the default shipping address.</p>
     */

    public MyCompanyDraftBuilder defaultShipingAddress(@Nullable final Integer defaultShipingAddress) {
        this.defaultShipingAddress = defaultShipingAddress;
        return this;
    }

    /**
     *  <p>Indexes of entries in <code>addresses</code> to set as billing addresses. The <code>billingAddressIds</code> of the Customer will be replaced by these addresses.</p>
     */

    public MyCompanyDraftBuilder billingAddresses(@Nullable final Integer... billingAddresses) {
        this.billingAddresses = new ArrayList<>(Arrays.asList(billingAddresses));
        return this;
    }

    /**
     *  <p>Indexes of entries in <code>addresses</code> to set as billing addresses. The <code>billingAddressIds</code> of the Customer will be replaced by these addresses.</p>
     */

    public MyCompanyDraftBuilder billingAddresses(@Nullable final java.util.List<Integer> billingAddresses) {
        this.billingAddresses = billingAddresses;
        return this;
    }

    /**
     *  <p>Indexes of entries in <code>addresses</code> to set as billing addresses. The <code>billingAddressIds</code> of the Customer will be replaced by these addresses.</p>
     */

    public MyCompanyDraftBuilder plusBillingAddresses(@Nullable final Integer... billingAddresses) {
        if (this.billingAddresses == null) {
            this.billingAddresses = new ArrayList<>();
        }
        this.billingAddresses.addAll(Arrays.asList(billingAddresses));
        return this;
    }

    /**
     *  <p>Index of the entry in <code>addresses</code> to set as the default billing address.</p>
     */

    public MyCompanyDraftBuilder defaultBillingAddress(@Nullable final Integer defaultBillingAddress) {
        this.defaultBillingAddress = defaultBillingAddress;
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

    public MyCompanyDraft build() {
        Objects.requireNonNull(key, MyCompanyDraft.class + ": key is missing");
        Objects.requireNonNull(name, MyCompanyDraft.class + ": name is missing");
        return new MyCompanyDraftImpl(key, name, contactEmail, custom, addresses, shippingAddresses,
            defaultShipingAddress, billingAddresses, defaultBillingAddress);
    }

    /**
     * builds MyCompanyDraft without checking for non null required values
     */
    public MyCompanyDraft buildUnchecked() {
        return new MyCompanyDraftImpl(key, name, contactEmail, custom, addresses, shippingAddresses,
            defaultShipingAddress, billingAddresses, defaultBillingAddress);
    }

    public static MyCompanyDraftBuilder of() {
        return new MyCompanyDraftBuilder();
    }

    public static MyCompanyDraftBuilder of(final MyCompanyDraft template) {
        MyCompanyDraftBuilder builder = new MyCompanyDraftBuilder();
        builder.key = template.getKey();
        builder.name = template.getName();
        builder.contactEmail = template.getContactEmail();
        builder.custom = template.getCustom();
        builder.addresses = template.getAddresses();
        builder.shippingAddresses = template.getShippingAddresses();
        builder.defaultShipingAddress = template.getDefaultShipingAddress();
        builder.billingAddresses = template.getBillingAddresses();
        builder.defaultBillingAddress = template.getDefaultBillingAddress();
        return builder;
    }

}
