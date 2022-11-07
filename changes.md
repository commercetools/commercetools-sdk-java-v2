**Api changes**

<details>
<summary>Added Property(s)</summary>

- added property `shippingKey` to type `CartSetLineItemTaxAmountAction` (file:/home/runner/work/commercetools-api-reference/commercetools-api-reference/commercetools-api-reference/api-specs/api/types/cart/updates/CartSetLineItemTaxAmountAction.raml:12:2)
- added property `shippingKey` to type `CartSetLineItemTaxRateAction` (file:/home/runner/work/commercetools-api-reference/commercetools-api-reference/commercetools-api-reference/api-specs/api/types/cart/updates/CartSetLineItemTaxRateAction.raml:12:2)
- added property `salutation` to type `MyCustomerDraft` (file:/home/runner/work/commercetools-api-reference/commercetools-api-reference/commercetools-api-reference/api-specs/api/types/me/MyCustomerDraft.raml:32:2)
- added property `shippingKey` to type `StagedOrderSetLineItemTaxAmountAction` (file:/home/runner/work/commercetools-api-reference/commercetools-api-reference/commercetools-api-reference/api-specs/api/types/order-edit/updates/StagedOrderSetLineItemTaxAmountAction.raml:12:2)
- added property `shippingKey` to type `StagedOrderSetLineItemTaxRateAction` (file:/home/runner/work/commercetools-api-reference/commercetools-api-reference/commercetools-api-reference/api-specs/api/types/order-edit/updates/StagedOrderSetLineItemTaxRateAction.raml:12:2)
- added property `quoteStateToAccepted` to type `OrderFromQuoteDraft` (file:/home/runner/work/commercetools-api-reference/commercetools-api-reference/commercetools-api-reference/api-specs/api/types/order/OrderFromQuoteDraft.raml:13:2)
- added property `stagedQuoteStateToSent` to type `QuoteDraft` (file:/home/runner/work/commercetools-api-reference/commercetools-api-reference/commercetools-api-reference/api-specs/api/types/quote/QuoteDraft.raml:14:2)
- added property `quoteRequestStateToAccepted` to type `StagedQuoteDraft` (file:/home/runner/work/commercetools-api-reference/commercetools-api-reference/commercetools-api-reference/api-specs/api/types/staged-quote/StagedQuoteDraft.raml:15:2)
- added property `authenticationMode` to type `SnsDestination` (file:/home/runner/work/commercetools-api-reference/commercetools-api-reference/commercetools-api-reference/api-specs/api/types/subscription/SnsDestination.raml:23:2)
- added property `authenticationMode` to type `SqsDestination` (file:/home/runner/work/commercetools-api-reference/commercetools-api-reference/commercetools-api-reference/api-specs/api/types/subscription/SqsDestination.raml:29:2)
</details>


<details>
<summary>Changed Property(s)</summary>

- :warning: changed property `locale` of type `Customer` from type `string` to `Locale` (file:/home/runner/work/commercetools-api-reference/commercetools-api-reference/commercetools-api-reference/api-specs/api/types/customer/Customer.raml:124:2)
- :warning: changed property `locale` of type `CustomerDraft` from type `string` to `Locale` (file:/home/runner/work/commercetools-api-reference/commercetools-api-reference/commercetools-api-reference/api-specs/api/types/customer/CustomerDraft.raml:117:2)
- :warning: changed property `locale` of type `CustomerSetLocaleAction` from type `string` to `Locale` (file:/home/runner/work/commercetools-api-reference/commercetools-api-reference/commercetools-api-reference/api-specs/api/types/customer/updates/CustomerSetLocaleAction.raml:8:2)
- :warning: changed property `locale` of type `MyCustomerDraft` from type `string` to `Locale` (file:/home/runner/work/commercetools-api-reference/commercetools-api-reference/commercetools-api-reference/api-specs/api/types/me/MyCustomerDraft.raml:68:2)
- :warning: changed property `locale` of type `MyCustomerSetLocaleAction` from type `string` to `Locale` (file:/home/runner/work/commercetools-api-reference/commercetools-api-reference/commercetools-api-reference/api-specs/api/types/me/updates/MyCustomerSetLocaleAction.raml:8:2)
- :warning: changed property `sort` of type `OrderSearchRequest` from type `OrderSearchSorting` to `null` (file:/home/runner/work/commercetools-api-reference/commercetools-api-reference/commercetools-api-reference/api-specs/api/types/order/OrderSearchRequest.raml:8:2)
- :warning: changed property `resourceTypeId` of type `ChangeSubscription` from type `string` to `ChangeSubscriptionResourceTypeId` (file:/home/runner/work/commercetools-api-reference/commercetools-api-reference/commercetools-api-reference/api-specs/api/types/subscription/ChangeSubscription.raml:9:2)
- :warning: changed property `resourceTypeId` of type `MessageSubscription` from type `string` to `MessageSubscriptionResourceTypeId` (file:/home/runner/work/commercetools-api-reference/commercetools-api-reference/commercetools-api-reference/api-specs/api/types/subscription/MessageSubscription.raml:9:2)
- :warning: changed property `payloadNotIncluded` of type `MessageDeliveryPayload` to be optional (file:/home/runner/work/commercetools-api-reference/commercetools-api-reference/commercetools-api-reference/api-specs/api/types/subscription/MessageDeliveryPayload.raml:38:2)
- :warning: changed property `accessKey` of type `SnsDestination` to be optional (file:/home/runner/work/commercetools-api-reference/commercetools-api-reference/commercetools-api-reference/api-specs/api/types/subscription/SnsDestination.raml:14:2)
- :warning: changed property `accessSecret` of type `SnsDestination` to be optional (file:/home/runner/work/commercetools-api-reference/commercetools-api-reference/commercetools-api-reference/api-specs/api/types/subscription/SnsDestination.raml:17:2)
- :warning: changed property `accessKey` of type `SqsDestination` to be optional (file:/home/runner/work/commercetools-api-reference/commercetools-api-reference/commercetools-api-reference/api-specs/api/types/subscription/SqsDestination.raml:15:2)
- :warning: changed property `accessSecret` of type `SqsDestination` to be optional (file:/home/runner/work/commercetools-api-reference/commercetools-api-reference/commercetools-api-reference/api-specs/api/types/subscription/SqsDestination.raml:18:2)
- :warning: changed property `authenticationMode` of type `Customer` to be required (file:/home/runner/work/commercetools-api-reference/commercetools-api-reference/commercetools-api-reference/api-specs/api/types/customer/Customer.raml:139:2)
</details>


<details>
<summary>Added Type(s)</summary>

- added type `AttributeGroup` (file:/home/runner/work/commercetools-api-reference/commercetools-api-reference/commercetools-api-reference/api-specs/api/types/types.raml:6:0)
- added type `AttributeGroupDraft` (file:/home/runner/work/commercetools-api-reference/commercetools-api-reference/commercetools-api-reference/api-specs/api/types/types.raml:7:0)
- added type `AttributeGroupPagedQueryResponse` (file:/home/runner/work/commercetools-api-reference/commercetools-api-reference/commercetools-api-reference/api-specs/api/types/types.raml:8:0)
- added type `AttributeGroupReference` (file:/home/runner/work/commercetools-api-reference/commercetools-api-reference/commercetools-api-reference/api-specs/api/types/types.raml:9:0)
- added type `AttributeGroupResourceIdentifier` (file:/home/runner/work/commercetools-api-reference/commercetools-api-reference/commercetools-api-reference/api-specs/api/types/types.raml:10:0)
- added type `AttributeGroupUpdate` (file:/home/runner/work/commercetools-api-reference/commercetools-api-reference/commercetools-api-reference/api-specs/api/types/types.raml:11:0)
- added type `AttributeGroupUpdateAction` (file:/home/runner/work/commercetools-api-reference/commercetools-api-reference/commercetools-api-reference/api-specs/api/types/types.raml:12:0)
- added type `AttributeReference` (file:/home/runner/work/commercetools-api-reference/commercetools-api-reference/commercetools-api-reference/api-specs/api/types/types.raml:13:0)
- added type `AttributeGroupAddAttributeAction` (file:/home/runner/work/commercetools-api-reference/commercetools-api-reference/commercetools-api-reference/api-specs/api/types/types.raml:14:0)
- added type `AttributeGroupChangeNameAction` (file:/home/runner/work/commercetools-api-reference/commercetools-api-reference/commercetools-api-reference/api-specs/api/types/types.raml:15:0)
- added type `AttributeGroupRemoveAttributeAction` (file:/home/runner/work/commercetools-api-reference/commercetools-api-reference/commercetools-api-reference/api-specs/api/types/types.raml:16:0)
- added type `AttributeGroupSetAttributesAction` (file:/home/runner/work/commercetools-api-reference/commercetools-api-reference/commercetools-api-reference/api-specs/api/types/types.raml:17:0)
- added type `AttributeGroupSetDescriptionAction` (file:/home/runner/work/commercetools-api-reference/commercetools-api-reference/commercetools-api-reference/api-specs/api/types/types.raml:18:0)
- added type `AttributeGroupSetKeyAction` (file:/home/runner/work/commercetools-api-reference/commercetools-api-reference/commercetools-api-reference/api-specs/api/types/types.raml:19:0)
- added type `MyCustomerEmailVerify` (file:/home/runner/work/commercetools-api-reference/commercetools-api-reference/commercetools-api-reference/api-specs/api/types/types.raml:353:0)
- added type `AwsAuthenticationMode` (file:/home/runner/work/commercetools-api-reference/commercetools-api-reference/commercetools-api-reference/api-specs/api/types/types.raml:1629:0)
- added type `ChangeSubscriptionResourceTypeId` (file:/home/runner/work/commercetools-api-reference/commercetools-api-reference/commercetools-api-reference/api-specs/api/types/types.raml:1633:0)
- added type `CloudEventsPayload` (file:/home/runner/work/commercetools-api-reference/commercetools-api-reference/commercetools-api-reference/api-specs/api/types/types.raml:1635:0)
- added type `MessageSubscriptionResourceTypeId` (file:/home/runner/work/commercetools-api-reference/commercetools-api-reference/commercetools-api-reference/api-specs/api/types/types.raml:1644:0)
</details>


<details>
<summary>Changed Type(s)</summary>

- :warning: changed type `OrderSearchSorting` from type `string` to `object` (file:/home/runner/work/commercetools-api-reference/commercetools-api-reference/commercetools-api-reference/api-specs/api/types/types.raml:1096:0)
- marked type `ShippingMethodSetDescriptionAction` as deprecated (file:/home/runner/work/commercetools-api-reference/commercetools-api-reference/commercetools-api-reference/api-specs/api/types/types.raml:1512:0)
- marked type `IronMqDestination` as deprecated (file:/home/runner/work/commercetools-api-reference/commercetools-api-reference/commercetools-api-reference/api-specs/api/types/types.raml:1641:0)
</details>


<details>
<summary>Added Method(s)</summary>

- added method `get /{projectKey}/attribute-groups` (file:/home/runner/work/commercetools-api-reference/commercetools-api-reference/commercetools-api-reference/api-specs/api/resources/attribute-groups.raml:11:0)
- added method `post /{projectKey}/attribute-groups` (file:/home/runner/work/commercetools-api-reference/commercetools-api-reference/commercetools-api-reference/api-specs/api/resources/attribute-groups.raml:25:0)
- added method `get /{projectKey}/subscriptions/{ID}/health` (file:/home/runner/work/commercetools-api-reference/commercetools-api-reference/commercetools-api-reference/api-specs/api/resources/subscriptions.raml:102:4)
- added method `get /{projectKey}/attribute-groups/key={key}` (file:/home/runner/work/commercetools-api-reference/commercetools-api-reference/commercetools-api-reference/api-specs/api/resources/attribute-groups.raml:49:2)
- added method `post /{projectKey}/attribute-groups/key={key}` (file:/home/runner/work/commercetools-api-reference/commercetools-api-reference/commercetools-api-reference/api-specs/api/resources/attribute-groups.raml:63:2)
- added method `delete /{projectKey}/attribute-groups/key={key}` (file:/home/runner/work/commercetools-api-reference/commercetools-api-reference/commercetools-api-reference/api-specs/api/resources/attribute-groups.raml:80:2)
- added method `get /{projectKey}/attribute-groups/{ID}` (file:/home/runner/work/commercetools-api-reference/commercetools-api-reference/commercetools-api-reference/api-specs/api/resources/attribute-groups.raml:101:2)
- added method `post /{projectKey}/attribute-groups/{ID}` (file:/home/runner/work/commercetools-api-reference/commercetools-api-reference/commercetools-api-reference/api-specs/api/resources/attribute-groups.raml:115:2)
- added method `delete /{projectKey}/attribute-groups/{ID}` (file:/home/runner/work/commercetools-api-reference/commercetools-api-reference/commercetools-api-reference/api-specs/api/resources/attribute-groups.raml:132:2)
</details>


<details>
<summary>Added Resource(s)</summary>

- added resource `/{projectKey}/attribute-groups` (file:///home/runner/work/commercetools-api-reference/commercetools-api-reference/commercetools-api-reference/api-specs/api/api.raml:216:2)
- added resource `/{projectKey}/subscriptions/{ID}/health` (file:/home/runner/work/commercetools-api-reference/commercetools-api-reference/commercetools-api-reference/api-specs/api/resources/subscriptions.raml:100:2)
- added resource `/{projectKey}/attribute-groups/key={key}` (file:/home/runner/work/commercetools-api-reference/commercetools-api-reference/commercetools-api-reference/api-specs/api/resources/attribute-groups.raml:42:0)
- added resource `/{projectKey}/attribute-groups/{ID}` (file:/home/runner/work/commercetools-api-reference/commercetools-api-reference/commercetools-api-reference/api-specs/api/resources/attribute-groups.raml:94:0)
</details>

**Import changes**

<details>
<summary>Added Property(s)</summary>

- added property `store` to type `OrderImport` (file:/home/runner/work/commercetools-api-reference/commercetools-api-reference/commercetools-api-reference/api-specs/importapi/types/order-import.raml:535:6)
</details>


<details>
<summary>Removed Property(s)</summary>

- :warning: removed property `totalTax` from type `TaxedPrice` (file:/home/runner/work/commercetools-api-reference/commercetools-api-reference/commercetools-api-reference-previous/api-specs/importapi/types/order-import.raml:327:6)
</details>

