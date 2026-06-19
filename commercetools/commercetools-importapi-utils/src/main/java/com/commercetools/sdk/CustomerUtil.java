
package com.commercetools.sdk;

import static java.lang.Integer.parseInt;

import java.util.List;

import com.commercetools.api.models.common.Address;
import com.commercetools.api.models.customer.Customer;
import com.commercetools.api.models.customer_group.CustomerGroupReference;
import com.commercetools.importapi.models.common.CustomerGroupKeyReference;
import com.commercetools.importapi.models.common.StoreKeyReference;
import com.commercetools.importapi.models.customers.AuthenticationMode;
import com.commercetools.importapi.models.customers.CustomerAddress;
import com.commercetools.importapi.models.customers.CustomerImport;

import org.jetbrains.annotations.NotNull;

public class CustomerUtil {
    private final KeyResolverService keyResolverService;
    private final CommonImportUtil util;

    public CustomerUtil() {
        keyResolverService = new ExpandObjResolverService();
        util = new CommonImportUtil(keyResolverService);
    }

    public CustomerUtil(final KeyResolverService resolverService) {
        keyResolverService = resolverService;
        util = new CommonImportUtil(keyResolverService);
    }

    public CustomerImport toCustomerImport(Customer customer) {
        return CustomerImport.builder()
                .key(customer.getKey()) // required field
                .customerNumber(customer.getCustomerNumber())
                .email(customer.getEmail()) // required field
                .password(customer.getPassword())
                .stores(toImportApiStoreKeyReferences(customer.getStores())) // required field
                .firstName(customer.getFirstName())
                .lastName(customer.getLastName())
                .middleName(customer.getMiddleName())
                .title(customer.getTitle())
                .salutation(customer.getSalutation())
                .externalId(customer.getExternalId())
                .dateOfBirth(customer.getDateOfBirth())
                .companyName(customer.getCompanyName())
                .vatId(customer.getVatId())
                .isEmailVerified(customer.getIsEmailVerified())
                .customerGroup(toCustomerGroupKeyReference(customer.getCustomerGroup())) // required field
                .addresses(mapToCustomerAddresses(customer.getAddresses())) // required field
                .defaultBillingAddress(getAddressesId(customer.getDefaultBillingAddress()))
                .billingAddresses(getAddressesIds(customer.getBillingAddresses()))
                .shippingAddresses(getAddressesIds(customer.getShippingAddresses()))
                .defaultShippingAddress(getAddressesId(customer.findDefaultShippingAddress().orElse(null)))
                .locale(customer.getLocale())
                .custom(util.getImportApiCustom(customer.getCustom())) // required field
                .authenticationMode(toImportApiAuthenticationMode(customer.getAuthenticationMode()))
                .build();
    }

    private AuthenticationMode toImportApiAuthenticationMode(
            com.commercetools.api.models.customer.AuthenticationMode authenticationMode) {
        if (authenticationMode instanceof com.commercetools.api.models.customer.AuthenticationMode.AuthenticationModeEnum) {
            return AuthenticationMode.AuthenticationModeEnum.valueOf(authenticationMode.name());
        }
        else
            return null;
    }

    public CustomerGroupKeyReference toCustomerGroupKeyReference(@NotNull CustomerGroupReference customerGroup) {
        return CustomerGroupKeyReference.builder().key(keyResolverService.resolveKey(customerGroup)).build();
    }

    private List<StoreKeyReference> toImportApiStoreKeyReferences(
            @NotNull List<com.commercetools.api.models.store.StoreKeyReference> stores) {
        return stores.stream().map(x -> StoreKeyReference.builder().key(x.getKey()).build()).toList();
    }

    private List<Integer> getAddressesIds(List<Address> shippingAddresses) {
        return shippingAddresses.stream().map(CustomerUtil::getAddressesId).toList();
    }

    private static Integer getAddressesId(Address shippingAddress) {
        if (shippingAddress == null) {
            return null;
        }
        return parseInt(shippingAddress.getId());
    }

    private List<CustomerAddress> mapToCustomerAddresses(List<Address> shippingAddresses) {
        return shippingAddresses.stream().map(this::toCustomerAddress).toList();
    }

    private CustomerAddress toCustomerAddress(Address address) {
        return CustomerAddress.builder()
                .key(address.getKey()) // required field
                .country(address.getCountry()) // required field
                .title(address.getTitle())
                .salutation(address.getSalutation())
                .firstName(address.getFirstName())
                .lastName(address.getLastName())
                .streetName(address.getStreetName())
                .streetNumber(address.getStreetNumber())
                .additionalStreetInfo(address.getAdditionalStreetInfo())
                .postalCode(address.getPostalCode())
                .city(address.getCity())
                .region(address.getRegion())
                .state(address.getState())
                .company(address.getCompany())
                .department(address.getDepartment())
                .building(address.getBuilding())
                .apartment(address.getApartment())
                .pOBox(address.getPOBox())
                .phone(address.getPhone())
                .mobile(address.getMobile())
                .email(address.getEmail())
                .fax(address.getFax())
                .additionalAddressInfo(address.getAdditionalAddressInfo())
                .externalId(address.getExternalId())
                .custom(util.getImportApiCustom(address.getCustom())) // required field
                .build();
    }
}
