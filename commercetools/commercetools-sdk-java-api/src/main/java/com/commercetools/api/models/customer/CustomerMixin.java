
package com.commercetools.api.models.customer;

import static java.util.stream.Collectors.toList;

import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

import javax.annotation.Nullable;

import com.commercetools.api.models.Referencable;
import com.commercetools.api.models.ResourceIdentifiable;
import com.commercetools.api.models.common.Address;

public interface CustomerMixin extends Referencable<Customer>, ResourceIdentifiable<Customer> {
    @Override
    public default CustomerResourceIdentifier toResourceIdentifier() {
        return CustomerResourceIdentifier.builder().id(getId()).build();
    }

    @Override
    public default CustomerReference toReference() {
        return CustomerReference.builder().id(getId()).build();
    }

    public List<String> getShippingAddressIds();

    public List<String> getBillingAddressIds();

    public String getDefaultShippingAddressId();

    public List<Address> getAddresses();

    default List<Address> getShippingAddresses() {
        final Set<String> ids = new HashSet<>(getShippingAddressIds());
        return getAddresses().stream().filter(id -> ids.contains(id.getId())).collect(toList());
    }

    default List<Address> getBillingAddresses() {
        final Set<String> ids = new HashSet<>(getBillingAddressIds());
        return getAddresses().stream().filter(id -> ids.contains(id.getId())).collect(toList());
    }

    default Optional<Address> findDefaultShippingAddress() {
        return getAddresses().stream()
                .filter(address -> address.getId() != null && address.getId().equals(getDefaultShippingAddressId()))
                .findFirst();
    }

    @Nullable
    default Address getDefaultShippingAddress() {
        return findDefaultShippingAddress().orElse(null);
    }

    /**
     * ID of an address in {@link #getAddresses()} which contains the standard billing address.
     *
     * <p>Access to the default billing address is also possible with {@link #getDefaultBillingAddress()}.</p>
     *
     * @see CustomerSetDefaultBillingAddressAction
     *
     * @return ID or null
     */
    @Nullable
    String getDefaultBillingAddressId();

    @Nullable
    default Address getDefaultBillingAddress() {
        return findDefaultBillingAddress().orElse(null);
    }

    default Optional<Address> findDefaultBillingAddress() {
        final String defaultBillingAddressId = getDefaultBillingAddressId();

        return getAddresses().stream()
                .filter(address -> defaultBillingAddressId != null && address.getId() != null
                        && address.getId().equals(defaultBillingAddressId))
                .findFirst();
    }

    /**
     * Find the address in {@link #getAddresses()} by the address id
     * @param addressId the Id string of the address to find
     * @return Address or null
     */
    @Nullable
    default Address getAddressById(final String addressId) {
        return findAddressById(addressId).orElse(null);
    }

    default Optional<Address> findAddressById(final String addressId) {
        return getAddresses().stream().filter(address -> address.getId().equals(addressId)).findFirst();
    }
}
