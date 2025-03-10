**Api changes**

<details>
<summary>Added Type(s)</summary>

- added type `BusinessUnitAssociateResponse`
- added type `BestDeal`
- added type `DiscountTypeCombination`
- added type `Stacking`
- added type `OrderBusinessUnitSetMessage`
- added type `OrderBusinessUnitSetMessagePayload`
- added type `StagedOrderSetBusinessUnitAction`
- added type `OrderSetBusinessUnitAction`
</details>


<details>
<summary>Added Resource(s)</summary>

- added resource `/{projectKey}/business-units/key={key}/associates/{associateId}`
- added resource `/{projectKey}/business-units/{businessUnitId}/associates/{associateId}`
- added resource `/{projectKey}/in-store/key={storeKey}/business-units/key={key}/associates/{associateId}`
- added resource `/{projectKey}/in-store/key={storeKey}/business-units/{businessUnitId}/associates/{associateId}`
</details>


<details>
<summary>Added Method(s)</summary>

- added method `apiRoot.withProjectKey().businessUnits().keyWithKeyValueAssociatesWithAssociateIdValue().get()`
- added method `apiRoot.withProjectKey().businessUnits().withBusinessUnitIdValueAssociatesWithAssociateIdValue().get()`
- added method `apiRoot.withProjectKey().inStoreKeyWithStoreKeyValue().businessUnits().keyWithKeyValueAssociatesWithAssociateIdValue().get()`
- added method `apiRoot.withProjectKey().inStoreKeyWithStoreKeyValue().businessUnits().withBusinessUnitIdValueAssociatesWithAssociateIdValue().get()`
</details>


<details>
<summary>Added Property(s)</summary>

- added property `discountTypeCombination` to type `Cart`
- added property `discountTypeCombination` to type `StagedOrder`
- added property `discountTypeCombination` to type `Order`
</details>


<details>
<summary>MarkDeprecated Property(s)</summary>

- marked property `CountOnCustomLineItemUnits::excludeCount` as deprecated
- marked property `CountOnLineItemUnits::excludeCount` as deprecated
</details>

