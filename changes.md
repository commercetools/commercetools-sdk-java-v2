**Api changes**

<details>
<summary>Added Type(s)</summary>

- added type `InventoryEntrySetInventoryLimitsAction`
- added type `RecurringOrderDeletedMessage`
- added type `RecurringOrderExpiresAtSetMessage`
- added type `RecurringOrderDeletedMessagePayload`
- added type `RecurringOrderExpiresAtSetMessagePayload`
- added type `ProductSearchFacetResultStats`
- added type `ProductSearchFacetStatsExpression`
- added type `ProductSearchFacetStatsValue`
- added type `RecurringOrderSetExpiresAtAction`
</details>


<details>
<summary>Removed Type(s)</summary>

- :warning: removed type `RecurringOrderMessagePayload`
</details>


<details>
<summary>Added Method(s)</summary>

- added method `apiRoot.withProjectKey().recurringOrders().withId().delete()`
- added method `apiRoot.withProjectKey().recurringOrders().withKey().delete()`
</details>


<details>
<summary>Added Property(s)</summary>

- added property `minCartQuantity` to type `InventoryEntry`
- added property `maxCartQuantity` to type `InventoryEntry`
- added property `minCartQuantity` to type `InventoryEntryDraft`
- added property `maxCartQuantity` to type `InventoryEntryDraft`
- added property `expiresAt` to type `RecurringOrderDraft`
</details>


<details>
<summary>Added Enum(s)</summary>

- added enum `discount-group` to type `ChangeSubscriptionResourceTypeId`
</details>

**History changes**

<details>
<summary>Added Type(s)</summary>

- added type `TooManyRequestsError`
- added type `GraphQLTooManyRequestsError`
- added type `GraphQLErrorObject`
</details>


<details>
<summary>Changed Property(s)</summary>

- :warning: changed property `extensions` of type `GraphQLError` from type `object` to `GraphQLErrorObject`
</details>

