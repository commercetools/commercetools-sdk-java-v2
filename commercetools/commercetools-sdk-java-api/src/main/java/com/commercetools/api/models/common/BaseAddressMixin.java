
package com.commercetools.api.models.common;

import java.util.Optional;

public interface BaseAddressMixin {
    public String getKey();

    public String getCountry();

    public String getTitle();

    public String getSalutation();

    public String getFirstName();

    public String getLastName();

    public String getStreetName();

    public String getStreetNumber();

    public String getAdditionalStreetInfo();

    public String getPostalCode();

    public String getCity();

    public String getRegion();

    public String getState();

    public String getCompany();

    public String getDepartment();

    public String getBuilding();

    public String getApartment();

    public String getPOBox();

    public String getPhone();

    public String getMobile();

    public String getEmail();

    public String getFax();

    public String getAdditionalAddressInfo();

    public String getExternalId();

    public default AddressDraft toDraft() {
        if (this instanceof AddressDraft) {
            return (AddressDraft) this;
        }
        return toDraftBuilder().build();
    }

    public default AddressDraftBuilder toDraftBuilder() {
        if (this instanceof AddressDraft) {
            return AddressDraft.builder((AddressDraft) this);
        }
        AddressDraftBuilder builder = AddressDraft.builder()
                .key(this.getKey())
                .country(this.getCountry())
                .title(this.getTitle())
                .salutation(this.getSalutation())
                .firstName(this.getFirstName())
                .lastName(this.getLastName())
                .streetName(this.getStreetName())
                .streetNumber(this.getStreetNumber())
                .additionalStreetInfo(this.getAdditionalStreetInfo())
                .postalCode(this.getPostalCode())
                .city(this.getCity())
                .region(this.getRegion())
                .state(this.getState())
                .company(this.getCompany())
                .department(this.getDepartment())
                .building(this.getBuilding())
                .apartment(this.getApartment())
                .pOBox(this.getPOBox())
                .phone(this.getPhone())
                .mobile(this.getMobile())
                .email(this.getEmail())
                .fax(this.getFax())
                .additionalAddressInfo(this.getAdditionalAddressInfo())
                .externalId(this.getExternalId());
        if (this instanceof Address) {
            builder.custom(Optional.ofNullable(((Address) this).getCustom())
                    .map(com.commercetools.api.models.type.CustomFields::toDraft)
                    .orElse(null));
        }

        return builder;
    }

    public default boolean equalsIgnoreId(final BaseAddress address) {
        return address != null && address.toDraftBuilder()
                .id(null)
                .buildUnchecked()
                .equals(this.toDraftBuilder().id(null).buildUnchecked());
    }
}
