**Api changes**

<details>
<summary>Added Type(s)</summary>

- added type `AddressRole`
- added type `CustomerBillingAddressAddedMessage`
- added type `CustomerBillingAddressRemovedMessage`
- added type `CustomerExternalIdSetMessage`
- added type `CustomerShippingAddressAddedMessage`
- added type `CustomerShippingAddressRemovedMessage`
- added type `CustomerBillingAddressAddedMessagePayload`
- added type `CustomerBillingAddressRemovedMessagePayload`
- added type `CustomerExternalIdSetMessagePayload`
- added type `CustomerShippingAddressAddedMessagePayload`
- added type `CustomerShippingAddressRemovedMessagePayload`
</details>


<details>
<summary>MarkDeprecated Type(s)</summary>

- marked type `ProductSearchProjectionParams` as deprecated
</details>


<details>
<summary>MarkDeprecated Property(s)</summary>

- marked property `ProductSearchRequest::productProjectionParameters` as deprecated
- marked property `ProductSearchResult::productProjection` as deprecated
</details>


<details>
<summary>Required Property(s)</summary>

- :warning: changed property `customerGroupAssignments` of type `CustomerGroupAssignmentsSetMessage` to be required
- :warning: changed property `customerGroupAssignments` of type `CustomerGroupAssignmentsSetMessagePayload` to be required
</details>


<details>
<summary>Added Property(s)</summary>

- added property `addressRoles` to type `BusinessUnitAddressChangedMessage`
- added property `addressRoles` to type `BusinessUnitAddressRemovedMessage`
- added property `addressRoles` to type `CustomerAddressChangedMessage`
- added property `addressRoles` to type `CustomerAddressRemovedMessage`
- added property `email` to type `CustomerDeletedMessage`
- added property `oldEmail` to type `CustomerEmailChangedMessage`
- added property `oldCustomerGroupAssignments` to type `CustomerGroupAssignmentsSetMessage`
- added property `addressRoles` to type `BusinessUnitAddressChangedMessagePayload`
- added property `addressRoles` to type `BusinessUnitAddressRemovedMessagePayload`
- added property `addressRoles` to type `CustomerAddressChangedMessagePayload`
- added property `addressRoles` to type `CustomerAddressRemovedMessagePayload`
- added property `email` to type `CustomerDeletedMessagePayload`
- added property `oldEmail` to type `CustomerEmailChangedMessagePayload`
- added property `oldCustomerGroupAssignments` to type `CustomerGroupAssignmentsSetMessagePayload`
</details>

