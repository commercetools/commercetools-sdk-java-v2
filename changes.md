**Api changes**

<details>
<summary>Added Enum(s)</summary>

- added enum `ViewMyShoppingLists` to type `Permission`
- added enum `ViewOthersShoppingLists` to type `Permission`
- added enum `UpdateMyShoppingLists` to type `Permission`
- added enum `UpdateOthersShoppingLists` to type `Permission`
- added enum `CreateMyShoppingLists` to type `Permission`
- added enum `CreateOthersShoppingLists` to type `Permission`
- added enum `DeleteMyShoppingLists` to type `Permission`
- added enum `DeleteOthersShoppingLists` to type `Permission`
</details>


<details>
<summary>Added QueryParameter(s)</summary>

- added query parameter `priceCustomerGroupAssignments` to method `get /{projectKey}/products`
- added query parameter `priceCustomerGroupAssignments` to method `post /{projectKey}/products`
- added query parameter `priceCustomerGroupAssignments` to method `get /{projectKey}/product-projections`
- added query parameter `priceCustomerGroupAssignments` to method `get /{projectKey}/products/key={key}`
- added query parameter `priceCustomerGroupAssignments` to method `post /{projectKey}/products/key={key}`
- added query parameter `priceCustomerGroupAssignments` to method `delete /{projectKey}/products/key={key}`
- added query parameter `priceCustomerGroupAssignments` to method `get /{projectKey}/products/{ID}`
- added query parameter `priceCustomerGroupAssignments` to method `post /{projectKey}/products/{ID}`
- added query parameter `priceCustomerGroupAssignments` to method `delete /{projectKey}/products/{ID}`
- added query parameter `priceCustomerGroupAssignments` to method `get /{projectKey}/product-projections/search`
- added query parameter `priceCustomerGroupAssignments` to method `get /{projectKey}/product-projections/key={key}`
- added query parameter `priceCustomerGroupAssignments` to method `get /{projectKey}/product-projections/{ID}`
- added query parameter `priceCustomerGroupAssignments` to method `get /{projectKey}/in-store/key={storeKey}/product-projections/key={key}`
- added query parameter `priceCustomerGroupAssignments` to method `get /{projectKey}/in-store/key={storeKey}/product-projections/{ID}`
</details>


<details>
<summary>Added Type(s)</summary>

- added type `BusinessUnitAssociateResponse`
- added type `BestDeal`
- added type `DiscountTypeCombination`
- added type `Stacking`
- added type `CustomerGroupAssignment`
- added type `CustomerGroupAssignmentDraft`
- added type `CustomerAddCustomerGroupAssignmentAction`
- added type `CustomerRemoveCustomerGroupAssignmentAction`
- added type `CustomerSetCustomerGroupAssignmentsAction`
- added type `CustomerGroupAssignmentAddedMessage`
- added type `CustomerGroupAssignmentRemovedMessage`
- added type `CustomerGroupAssignmentsSetMessage`
- added type `OrderBusinessUnitSetMessage`
- added type `CustomerGroupAssignmentAddedMessagePayload`
- added type `CustomerGroupAssignmentRemovedMessagePayload`
- added type `CustomerGroupAssignmentsSetMessagePayload`
- added type `OrderBusinessUnitSetMessagePayload`
- added type `StagedOrderSetBusinessUnitAction`
- added type `OrderSetBusinessUnitAction`
</details>


<details>
<summary>Added Resource(s)</summary>

- added resource `/{projectKey}/as-associate/{associateId}/in-business-unit/key={businessUnitKey}/shopping-lists`
- added resource `/{projectKey}/as-associate/{associateId}/in-business-unit/key={businessUnitKey}/shopping-lists/key={key}`
- added resource `/{projectKey}/as-associate/{associateId}/in-business-unit/key={businessUnitKey}/shopping-lists/{ID}`
- added resource `/{projectKey}/business-units/key={key}/associates/{associateId}`
- added resource `/{projectKey}/business-units/{businessUnitId}/associates/{associateId}`
- added resource `/{projectKey}/in-store/key={storeKey}/business-units/key={key}/associates/{associateId}`
- added resource `/{projectKey}/in-store/key={storeKey}/business-units/{businessUnitId}/associates/{associateId}`
</details>


<details>
<summary>Added Method(s)</summary>

- added method `apiRoot.withProjectKey().asAssociate().withAssociateIdValue().inBusinessUnitKeyWithBusinessUnitKeyValue().shoppingLists().get()`
- added method `apiRoot.withProjectKey().asAssociate().withAssociateIdValue().inBusinessUnitKeyWithBusinessUnitKeyValue().shoppingLists().head()`
- added method `apiRoot.withProjectKey().asAssociate().withAssociateIdValue().inBusinessUnitKeyWithBusinessUnitKeyValue().shoppingLists().post()`
- added method `apiRoot.withProjectKey().asAssociate().withAssociateIdValue().inBusinessUnitKeyWithBusinessUnitKeyValue().shoppingLists().withKey().get()`
- added method `apiRoot.withProjectKey().asAssociate().withAssociateIdValue().inBusinessUnitKeyWithBusinessUnitKeyValue().shoppingLists().withKey().head()`
- added method `apiRoot.withProjectKey().asAssociate().withAssociateIdValue().inBusinessUnitKeyWithBusinessUnitKeyValue().shoppingLists().withKey().post()`
- added method `apiRoot.withProjectKey().asAssociate().withAssociateIdValue().inBusinessUnitKeyWithBusinessUnitKeyValue().shoppingLists().withKey().delete()`
- added method `apiRoot.withProjectKey().asAssociate().withAssociateIdValue().inBusinessUnitKeyWithBusinessUnitKeyValue().shoppingLists().withId().get()`
- added method `apiRoot.withProjectKey().asAssociate().withAssociateIdValue().inBusinessUnitKeyWithBusinessUnitKeyValue().shoppingLists().withId().head()`
- added method `apiRoot.withProjectKey().asAssociate().withAssociateIdValue().inBusinessUnitKeyWithBusinessUnitKeyValue().shoppingLists().withId().post()`
- added method `apiRoot.withProjectKey().asAssociate().withAssociateIdValue().inBusinessUnitKeyWithBusinessUnitKeyValue().shoppingLists().withId().delete()`
- added method `apiRoot.withProjectKey().businessUnits().keyWithKeyValueAssociatesWithAssociateIdValue().get()`
- added method `apiRoot.withProjectKey().businessUnits().withBusinessUnitIdValueAssociatesWithAssociateIdValue().get()`
- added method `apiRoot.withProjectKey().inStoreKeyWithStoreKeyValue().businessUnits().keyWithKeyValueAssociatesWithAssociateIdValue().get()`
- added method `apiRoot.withProjectKey().inStoreKeyWithStoreKeyValue().businessUnits().withBusinessUnitIdValueAssociatesWithAssociateIdValue().get()`
</details>


<details>
<summary>Added Property(s)</summary>

- added property `discountTypeCombination` to type `Cart`
- added property `customerGroupAssignments` to type `Customer`
- added property `customerGroupAssignments` to type `CustomerDraft`
- added property `discountTypeCombination` to type `StagedOrder`
- added property `discountTypeCombination` to type `Order`
- added property `priceCustomerGroupAssignments` to type `ProductSearchProjectionParams`
</details>


<details>
<summary>MarkDeprecated Property(s)</summary>

- marked property `CountOnCustomLineItemUnits::excludeCount` as deprecated
- marked property `CountOnLineItemUnits::excludeCount` as deprecated
</details>

