**Api changes**

<details>
<summary>Added Type(s)</summary>

- added type `DiscountedLineItemPortionDraft`
</details>


<details>
<summary>Required Property(s)</summary>

- :warning: changed property `isOnStock` of type `ProductVariantAvailability` to be required
- changed property `priceMode` of type `CustomLineItemDraft` to be optional
- changed property `oldShipmentState` of type `OrderShipmentStateChangedMessage` to be optional
- changed property `oldOrderState` of type `OrderStateChangedMessage` to be optional
- changed property `oldShipmentState` of type `OrderShipmentStateChangedMessagePayload` to be optional
- changed property `oldOrderState` of type `OrderStateChangedMessagePayload` to be optional
</details>


<details>
<summary>Changed Property(s)</summary>

- :warning: changed property `includedDiscounts` of type `DiscountedLineItemPriceDraft` from type `DiscountedLineItemPortion[]` to `DiscountedLineItemPortionDraft[]`
</details>


<details>
<summary>Added Property(s)</summary>

- added property `totalTax` to type `TaxedPriceDraft`
- added property `id` to type `ProductVariantAvailability`
- added property `version` to type `ProductVariantAvailability`
</details>

