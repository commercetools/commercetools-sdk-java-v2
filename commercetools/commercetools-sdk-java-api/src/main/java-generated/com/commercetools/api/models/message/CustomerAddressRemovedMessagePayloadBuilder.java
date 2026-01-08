
package com.commercetools.api.models.message;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CustomerAddressRemovedMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomerAddressRemovedMessagePayload customerAddressRemovedMessagePayload = CustomerAddressRemovedMessagePayload.builder()
 *             .address(addressBuilder -> addressBuilder)
 *             .plusAddressRoles(addressRolesBuilder -> addressRolesBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CustomerAddressRemovedMessagePayloadBuilder implements Builder<CustomerAddressRemovedMessagePayload> {

    private com.commercetools.api.models.common.Address address;

    private java.util.List<com.commercetools.api.models.common.AddressRole> addressRoles;

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Address" rel="nofollow">Address</a> that was removed during the <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomerRemoveAddressAction" rel="nofollow">Remove Address</a> update action.</p>
     * @param builder function to build the address value
     * @return Builder
     */

    public CustomerAddressRemovedMessagePayloadBuilder address(
            Function<com.commercetools.api.models.common.AddressBuilder, com.commercetools.api.models.common.AddressBuilder> builder) {
        this.address = builder.apply(com.commercetools.api.models.common.AddressBuilder.of()).build();
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Address" rel="nofollow">Address</a> that was removed during the <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomerRemoveAddressAction" rel="nofollow">Remove Address</a> update action.</p>
     * @param builder function to build the address value
     * @return Builder
     */

    public CustomerAddressRemovedMessagePayloadBuilder withAddress(
            Function<com.commercetools.api.models.common.AddressBuilder, com.commercetools.api.models.common.Address> builder) {
        this.address = builder.apply(com.commercetools.api.models.common.AddressBuilder.of());
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Address" rel="nofollow">Address</a> that was removed during the <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomerRemoveAddressAction" rel="nofollow">Remove Address</a> update action.</p>
     * @param address value to be set
     * @return Builder
     */

    public CustomerAddressRemovedMessagePayloadBuilder address(
            final com.commercetools.api.models.common.Address address) {
        this.address = address;
        return this;
    }

    /**
     *  <p>Indicates if the address was used for shipping or billing purposes.</p>
     * @param addressRoles value to be set
     * @return Builder
     */

    public CustomerAddressRemovedMessagePayloadBuilder addressRoles(
            final com.commercetools.api.models.common.AddressRole... addressRoles) {
        this.addressRoles = new ArrayList<>(Arrays.asList(addressRoles));
        return this;
    }

    /**
     *  <p>Indicates if the address was used for shipping or billing purposes.</p>
     * @param addressRoles value to be set
     * @return Builder
     */

    public CustomerAddressRemovedMessagePayloadBuilder addressRoles(
            final java.util.List<com.commercetools.api.models.common.AddressRole> addressRoles) {
        this.addressRoles = addressRoles;
        return this;
    }

    /**
     *  <p>Indicates if the address was used for shipping or billing purposes.</p>
     * @param addressRoles value to be set
     * @return Builder
     */

    public CustomerAddressRemovedMessagePayloadBuilder plusAddressRoles(
            final com.commercetools.api.models.common.AddressRole... addressRoles) {
        if (this.addressRoles == null) {
            this.addressRoles = new ArrayList<>();
        }
        this.addressRoles.addAll(Arrays.asList(addressRoles));
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Address" rel="nofollow">Address</a> that was removed during the <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomerRemoveAddressAction" rel="nofollow">Remove Address</a> update action.</p>
     * @return address
     */

    public com.commercetools.api.models.common.Address getAddress() {
        return this.address;
    }

    /**
     *  <p>Indicates if the address was used for shipping or billing purposes.</p>
     * @return addressRoles
     */

    public java.util.List<com.commercetools.api.models.common.AddressRole> getAddressRoles() {
        return this.addressRoles;
    }

    /**
     * builds CustomerAddressRemovedMessagePayload with checking for non-null required values
     * @return CustomerAddressRemovedMessagePayload
     */
    public CustomerAddressRemovedMessagePayload build() {
        Objects.requireNonNull(address, CustomerAddressRemovedMessagePayload.class + ": address is missing");
        Objects.requireNonNull(addressRoles, CustomerAddressRemovedMessagePayload.class + ": addressRoles is missing");
        return new CustomerAddressRemovedMessagePayloadImpl(address, addressRoles);
    }

    /**
     * builds CustomerAddressRemovedMessagePayload without checking for non-null required values
     * @return CustomerAddressRemovedMessagePayload
     */
    public CustomerAddressRemovedMessagePayload buildUnchecked() {
        return new CustomerAddressRemovedMessagePayloadImpl(address, addressRoles);
    }

    /**
     * factory method for an instance of CustomerAddressRemovedMessagePayloadBuilder
     * @return builder
     */
    public static CustomerAddressRemovedMessagePayloadBuilder of() {
        return new CustomerAddressRemovedMessagePayloadBuilder();
    }

    /**
     * create builder for CustomerAddressRemovedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CustomerAddressRemovedMessagePayloadBuilder of(final CustomerAddressRemovedMessagePayload template) {
        CustomerAddressRemovedMessagePayloadBuilder builder = new CustomerAddressRemovedMessagePayloadBuilder();
        builder.address = template.getAddress();
        builder.addressRoles = template.getAddressRoles();
        return builder;
    }

}
