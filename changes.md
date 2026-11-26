**Api changes**

<details>
<summary>Added Type(s)</summary>

- added type `AgentMissingCurrencyError`
- added type `AgentShoppingListUnresolvedError`
- added type `GraphQLAgentMissingCurrencyError`
- added type `GraphQLAgentShoppingListUnresolvedError`
</details>


<details>
<summary>Required Property(s)</summary>

- changed property `prompt` of type `AgentResponsesRequest` to be optional
</details>


<details>
<summary>Removed Property(s)</summary>

- :warning: removed property `oldbusinessUnit` from type `OrderBusinessUnitSetMessage`
- :warning: removed property `oldbusinessUnit` from type `OrderBusinessUnitSetMessagePayload`
</details>


<details>
<summary>Added Property(s)</summary>

- added property `shoppingList` to type `AgentResponsesPayload`
- added property `shoppingList` to type `AgentResponsesRequest`
- added property `oldBusinessUnit` to type `OrderBusinessUnitSetMessage`
- added property `oldBusinessUnit` to type `OrderBusinessUnitSetMessagePayload`
</details>


<details>
<summary>Changed Property(s)</summary>

- :warning: changed property `count` of type `ReviewRatingStatistics` from type `integer` to `number`
</details>

**History changes**

<details>
<summary>Added Type(s)</summary>

- added type `Attribution`
- added type `AttributionSource`
</details>


<details>
<summary>Added Enum(s)</summary>

- added enum `Import` to type `Source`
- added enum `Export` to type `Source`
- added enum `IntakeAgent` to type `Source`
- added enum `PromotionsAgent` to type `Source`
- added enum `ManagedCommerceMCP` to type `Source`
- added enum `ProductEnrichmentAgent` to type `Source`
</details>


<details>
<summary>Added Property(s)</summary>

- added property `externalUserId` to type `ModifiedBy`
- added property `attributedTo` to type `ModifiedBy`
</details>

