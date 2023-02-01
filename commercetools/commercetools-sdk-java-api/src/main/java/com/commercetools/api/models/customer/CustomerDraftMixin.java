
package com.commercetools.api.models.customer;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;

import com.commercetools.api.models.common.BaseAddress;
import com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifier;
import com.commercetools.api.models.store.StoreResourceIdentifier;

public interface CustomerDraftMixin {
    public static CustomerDraftBuilder builder(Customer customer) {
        List<BaseAddress> addresses = new ArrayList<>(customer.getAddresses());
        Map<String, Integer> addressIds = java.util.stream.IntStream.range(0, addresses.size())
                .boxed()
                .collect(
                    java.util.stream.Collectors.toMap(integer -> addresses.get(integer).getId(), Function.identity()));
        return CustomerDraft.builder()
                .key(customer.getKey())
                .customerNumber(customer.getCustomerNumber())
                .externalId(customer.getExternalId())
                .email(customer.getEmail())
                .firstName(customer.getFirstName())
                .lastName(customer.getLastName())
                .middleName(customer.getMiddleName())
                .title(customer.getTitle())
                .dateOfBirth(customer.getDateOfBirth())
                .companyName(customer.getCompanyName())
                .vatId(customer.getVatId())
                .addresses(addresses.size() > 0 ? addresses : null)
                .defaultBillingAddress(customer.getDefaultBillingAddressId() != null
                        ? addressIds.get(customer.getDefaultBillingAddressId())
                        : null)
                .defaultShippingAddress(customer.getDefaultShippingAddressId() != null
                        ? addressIds.get(customer.getDefaultShippingAddressId())
                        : null)
                .billingAddresses(customer.getBillingAddressIds().size() > 0 ? addressIds.entrySet()
                        .stream()
                        .filter(entry -> customer.getBillingAddressIds().contains(entry.getKey()))
                        .map(Map.Entry::getValue)
                        .collect(java.util.stream.Collectors.toList()) : null)
                .shippingAddresses(customer.getShippingAddressIds().size() > 0 ? addressIds.entrySet()
                        .stream()
                        .filter(entry -> customer.getShippingAddressIds().contains(entry.getKey()))
                        .map(Map.Entry::getValue)
                        .collect(java.util.stream.Collectors.toList()) : null)
                .isEmailVerified(customer.getIsEmailVerified())
                .customerGroup(Optional.ofNullable(customer.getCustomerGroup())
                        .map(reference -> CustomerGroupResourceIdentifier.builder().id(reference.getId()).build())
                        .orElse(null))
                .locale(customer.getLocale())
                .salutation(customer.getSalutation())
                .stores(Optional.ofNullable(customer.getStores())
                        .map(stores -> stores.stream()
                                .map(store -> StoreResourceIdentifier.builder().key(store.getKey()).build())
                                .collect(java.util.stream.Collectors.toList()))
                        .orElse(null))
                .authenticationMode(customer.getAuthenticationMode())
                .custom(Optional.ofNullable(customer.getCustom())
                        .map(com.commercetools.api.models.type.CustomFields::toDraft)
                        .orElse(null));
    }
}
