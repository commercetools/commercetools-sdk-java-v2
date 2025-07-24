**Api changes**

<details>
<summary>Added Type(s)</summary>

- added type `RecurringOrderDeletedMessage`
- added type `RecurringOrderDeletedMessagePayload`
- added type `ProductSearchFacetResultStats`
- added type `ProductSearchFacetStatsExpression`
- added type `ProductSearchFacetStatsValue`
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
<summary>Changed Property(s)</summary>

- :warning: changed property `deleteDaysAfterLastModification` of type `CartDraft` from type `number` to `integer`
- :warning: changed property `deleteDaysAfterLastModification` of type `MyCartDraft` from type `number` to `integer`
- :warning: changed property `deleteDaysAfterLastModification` of type `MyShoppingListDraft` from type `number` to `integer`
- :warning: changed property `deleteDaysAfterLastModification` of type `MyShoppingListSetDeleteDaysAfterLastModificationAction` from type `number` to `integer`
- :warning: changed property `deleteDaysAfterLastModification` of type `CartsConfiguration` from type `number` to `integer`
- :warning: changed property `deleteDaysAfterLastModification` of type `ShoppingListsConfiguration` from type `number` to `integer`
- :warning: changed property `deleteDaysAfterLastModification` of type `ShoppingList` from type `number` to `integer`
- :warning: changed property `deleteDaysAfterLastModification` of type `ShoppingListDraft` from type `number` to `integer`
- :warning: changed property `deleteDaysAfterLastModification` of type `ShoppingListSetDeleteDaysAfterLastModificationAction` from type `number` to `integer`
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

