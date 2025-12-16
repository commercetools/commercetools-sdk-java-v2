**Api changes**

<details>
<summary>Added Type(s)</summary>

- added type `BusinessUnitAddCustomerGroupAssignmentAction`
- added type `BusinessUnitRemoveCustomerGroupAssignmentAction`
- added type `BusinessUnitSetCustomerGroupAssignmentsAction`
- added type `AddressRole`
- added type `BusinessUnitCustomerGroupAssignmentAddedMessage`
- added type `BusinessUnitCustomerGroupAssignmentRemovedMessage`
- added type `BusinessUnitCustomerGroupAssignmentsSetMessage`
- added type `CustomerBillingAddressAddedMessage`
- added type `CustomerBillingAddressRemovedMessage`
- added type `CustomerExternalIdSetMessage`
- added type `CustomerShippingAddressAddedMessage`
- added type `CustomerShippingAddressRemovedMessage`
- added type `BusinessUnitCustomerGroupAssignmentAddedMessagePayload`
- added type `BusinessUnitCustomerGroupAssignmentRemovedMessagePayload`
- added type `BusinessUnitCustomerGroupAssignmentsSetMessagePayload`
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

- :warning: changed property `shippingAddressIds` of type `BusinessUnit` to be required
- :warning: changed property `billingAddressIds` of type `BusinessUnit` to be required
- :warning: changed property `shippingAddressIds` of type `Company` to be required
- :warning: changed property `billingAddressIds` of type `Company` to be required
- :warning: changed property `shippingAddressIds` of type `Division` to be required
- :warning: changed property `billingAddressIds` of type `Division` to be required
- :warning: changed property `shippingAddressIds` of type `Customer` to be required
- :warning: changed property `billingAddressIds` of type `Customer` to be required
- :warning: changed property `customerGroupAssignments` of type `Customer` to be required
- :warning: changed property `customerGroupAssignments` of type `CustomerGroupAssignmentsSetMessage` to be required
- :warning: changed property `customerGroupAssignments` of type `CustomerGroupAssignmentsSetMessagePayload` to be required
</details>


<details>
<summary>Added Property(s)</summary>

- added property `customerGroupAssignments` to type `BusinessUnit`
- added property `customerGroupAssignments` to type `BusinessUnitDraft`
- added property `customerGroupAssignments` to type `Company`
- added property `customerGroupAssignments` to type `CompanyDraft`
- added property `customerGroupAssignments` to type `Division`
- added property `customerGroupAssignments` to type `DivisionDraft`
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

**History changes**

<details>
<summary>Added Type(s)</summary>

- added type `DirectDiscount`
- added type `DiscountTypeCombination`
- added type `BestDeal`
- added type `Stacking`
- added type `ShippingMethodLabel`
- added type `ChangeCustomLineItemPriceRoundingModeChange`
- added type `ChangeLineItemPriceRoundingModeChange`
- added type `SetDirectDiscountsChange`
- added type `SetReferencesChange`
- added type `SetShippingInfoDiscountedPriceChange`
- added type `SetShippingMethodTaxCategoryChange`
- added type `SetTaxedShippingPriceChange`
- added type `ShippingMethodAddShippingRateChange`
- added type `ShippingMethodAddZoneChange`
- added type `ShippingMethodChangeActiveChange`
- added type `ShippingMethodChangeIsDefaultChange`
- added type `ShippingMethodChangeNameChange`
- added type `ShippingMethodChangeTaxCategoryChange`
- added type `ShippingMethodRemoveShippingRateChange`
- added type `ShippingMethodRemoveZoneChange`
- added type `ShippingMethodSetCustomFieldChange`
- added type `ShippingMethodSetCustomTypeChange`
- added type `ShippingMethodSetKeyChange`
- added type `ShippingMethodSetLocalizedDescriptionChange`
- added type `ShippingMethodSetLocalizedNameChange`
- added type `ShippingMethodSetPredicateChange`
- added type `ZoneResourceIdentifier`
- added type `ChangeDiscountTypeCombinationChange`
- added type `StandalonePriceChangeActiveChange`
- added type `StandalonePriceChangeValueChange`
- added type `StandalonePriceSetCustomFieldChange`
- added type `StandalonePriceSetCustomTypeChange`
- added type `StandalonePriceSetDiscountedPriceChange`
- added type `StandalonePriceSetKeyChange`
- added type `StandalonePriceSetPriceTiersChange`
- added type `StandalonePriceSetValidFromAndUntilChange`
- added type `StandalonePriceSetValidFromChange`
- added type `StandalonePriceSetValidUntilChange`
- added type `StandalonePriceLabel`
</details>


<details>
<summary>Added Enum(s)</summary>

- added enum `shipping-method` to type `ChangeHistoryResourceType`
- added enum `standalone-price` to type `ChangeHistoryResourceType`
- added enum `addShipping` to type `UpdateType`
- added enum `addShippingRate` to type `UpdateType`
- added enum `addZone` to type `UpdateType`
- added enum `changeActive` to type `UpdateType`
- added enum `changeApprovalRuleMode` to type `UpdateType`
- added enum `changeCustomLineItemPriceRoundingMode` to type `UpdateType`
- added enum `changeCustomer` to type `UpdateType`
- added enum `changeDiscountTypeCombination` to type `UpdateType`
- added enum `changeIncludedInStatistics` to type `UpdateType`
- added enum `changeIsDefault` to type `UpdateType`
- added enum `changeLastVariantId` to type `UpdateType`
- added enum `changeLineItemPriceRoundingMode` to type `UpdateType`
- added enum `changeLineItemPublished` to type `UpdateType`
- added enum `changePriceRoundingMode` to type `UpdateType`
- added enum `changeTaxCategory` to type `UpdateType`
- added enum `changeTopLevelUnit` to type `UpdateType`
- added enum `excludeProduct` to type `UpdateType`
- added enum `removeShipping` to type `UpdateType`
- added enum `removeShippingRate` to type `UpdateType`
- added enum `removeZone` to type `UpdateType`
- added enum `replaceTaxRate` to type `UpdateType`
- added enum `revertStagedChanges` to type `UpdateType`
- added enum `revertStagedVariantChanges` to type `UpdateType`
- added enum `setAncestors` to type `UpdateType`
- added enum `setAssociates` to type `UpdateType`
- added enum `setBillingAddressCustomField` to type `UpdateType`
- added enum `setBillingAddressCustomType` to type `UpdateType`
- added enum `setBusinessUnit` to type `UpdateType`
- added enum `setCustomLineItemDiscountedPrice` to type `UpdateType`
- added enum `setCustomLineItemDiscountedPricePerQuantity` to type `UpdateType`
- added enum `setCustomerGroupAssignments` to type `UpdateType`
- added enum `setDeliveryAddressCustomField` to type `UpdateType`
- added enum `setDeliveryAddressCustomType` to type `UpdateType`
- added enum `setDeliveryCustomField` to type `UpdateType`
- added enum `setDeliveryCustomType` to type `UpdateType`
- added enum `setDirectDiscounts` to type `UpdateType`
- added enum `setDiscountOnTotalPrice` to type `UpdateType`
- added enum `setInheritedAssociates` to type `UpdateType`
- added enum `setInheritedStores` to type `UpdateType`
- added enum `setItemShippingAddressCustomField` to type `UpdateType`
- added enum `setItemShippingAddressCustomType` to type `UpdateType`
- added enum `setLocalizedDescription` to type `UpdateType`
- added enum `setLocalizedName` to type `UpdateType`
- added enum `setMaxCartQuantity` to type `UpdateType`
- added enum `setMinCartQuantity` to type `UpdateType`
- added enum `setParcelCustomField` to type `UpdateType`
- added enum `setParcelCustomType` to type `UpdateType`
- added enum `setPredicate` to type `UpdateType`
- added enum `setPriceKey` to type `UpdateType`
- added enum `setPriceMode` to type `UpdateType`
- added enum `setPriceTiers` to type `UpdateType`
- added enum `setProductAttribute` to type `UpdateType`
- added enum `setReferences` to type `UpdateType`
- added enum `setReturnInfo` to type `UpdateType`
- added enum `setReturnItemCustomField` to type `UpdateType`
- added enum `setReturnItemCustomType` to type `UpdateType`
- added enum `setShippingAddressCustomField` to type `UpdateType`
- added enum `setShippingAddressCustomType` to type `UpdateType`
- added enum `setShippingCustomField` to type `UpdateType`
- added enum `setShippingCustomType` to type `UpdateType`
- added enum `setShippingInfoDiscountedPrice` to type `UpdateType`
- added enum `setShippingMethodTaxCategory` to type `UpdateType`
- added enum `setTaxedShippingPrice` to type `UpdateType`
- added enum `setTransactionCustomField` to type `UpdateType`
- added enum `setTransactionCustomType` to type `UpdateType`
- added enum `setUnitType` to type `UpdateType`
- added enum `setVariantExclusion` to type `UpdateType`
</details>

