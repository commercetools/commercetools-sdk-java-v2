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

