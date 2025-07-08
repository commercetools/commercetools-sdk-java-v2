**Api changes**

<details>
<summary>Added Enum(s)</summary>

- added enum `RecurringOrder` to type `CartOrigin`
- added enum `ApplicationStoppedByGroupBestDeal` to type `DiscountCodeState`
- added enum `discount-group` to type `ReferenceTypeId`
- added enum `payment-method` to type `ReferenceTypeId`
- added enum `recurrence-policy` to type `ReferenceTypeId`
- added enum `recurring-order` to type `ReferenceTypeId`
- added enum `payment-method` to type `ExtensionResourceTypeId`
- added enum `RecurringOrderState` to type `StateTypeEnum`
- added enum `recurrence-policy` to type `ChangeSubscriptionResourceTypeId`
- added enum `recurring-order` to type `ChangeSubscriptionResourceTypeId`
- added enum `recurring-order` to type `ResourceTypeId`
</details>


<details>
<summary>Added Property(s)</summary>

- added property `makeInheritedAssociatesExplicit` to type `BusinessUnitChangeAssociateModeAction`
- added property `discountGroup` to type `CartDiscount`
- added property `discountGroup` to type `CartDiscountDraft`
- added property `priceRoundingMode` to type `Cart`
- added property `priceRoundingMode` to type `CartDraft`
- added property `recurrenceInfo` to type `CustomLineItem`
- added property `recurrenceInfo` to type `CustomLineItemDraft`
- added property `recurrenceInfo` to type `LineItem`
- added property `recurrenceInfo` to type `LineItemDraft`
- added property `recurrenceInfo` to type `CartAddCustomLineItemAction`
- added property `recurrenceInfo` to type `CartAddLineItemAction`
- added property `recurrencePolicy` to type `Price`
- added property `recurrencePolicy` to type `PriceDraft`
- added property `recurrenceInfo` to type `MyLineItemDraft`
- added property `recurrenceInfo` to type `MyCartAddLineItemAction`
- added property `attributes` to type `ProductTailoringCreatedMessage`
- added property `attributes` to type `ProductTailoringCreatedMessagePayload`
- added property `priceRoundingMode` to type `StagedOrder`
- added property `recurringOrder` to type `StagedOrder`
- added property `recurrenceInfo` to type `StagedOrderAddCustomLineItemAction`
- added property `recurrenceInfo` to type `StagedOrderAddLineItemAction`
- added property `priceRoundingMode` to type `Order`
- added property `recurringOrder` to type `Order`
- added property `priceRoundingMode` to type `OrderImportDraft`
- added property `token` to type `PaymentMethodInfo`
- added property `interfaceAccount` to type `PaymentMethodInfo`
- added property `custom` to type `PaymentMethodInfo`
- added property `attributes` to type `ProductTailoringData`
- added property `attributes` to type `ProductTailoringDraft`
- added property `attributes` to type `ProductTailoringInStoreDraft`
- added property `level` to type `AttributeDefinition`
- added property `level` to type `AttributeDefinitionDraft`
- added property `attributes` to type `ProductData`
- added property `attributes` to type `ProductDraft`
- added property `attributes` to type `ProductProjection`
- added property `recurrencePrices` to type `ProductVariant`
- added property `priceRoundingMode` to type `CartsConfiguration`
- added property `taxRoundingMode` to type `CartsConfiguration`
- added property `priceRoundingMode` to type `QuoteRequest`
- added property `priceRoundingMode` to type `Quote`
- added property `recurrencePolicy` to type `StandalonePrice`
- added property `recurrencePolicy` to type `StandalonePriceDraft`
- added property `events` to type `SubscriptionSetEventsAction`
</details>


<details>
<summary>Changed Property(s)</summary>

- :warning: changed property `paymentMethodInfo` of type `MyPaymentDraft` from type `PaymentMethodInfo` to `PaymentMethodInfoDraft`
- :warning: changed property `paymentMethodInfo` of type `PaymentDraft` from type `PaymentMethodInfo` to `PaymentMethodInfoDraft`
</details>


<details>
<summary>Required Property(s)</summary>

- changed property `sortOrder` of type `CartDiscountDraft` to be optional
</details>


<details>
<summary>Removed Property(s)</summary>

- :warning: removed property `messages` from type `SubscriptionSetEventsAction`
</details>


<details>
<summary>Added Method(s)</summary>

- added method `apiRoot.withProjectKey().discountGroups().get()`
- added method `apiRoot.withProjectKey().discountGroups().head()`
- added method `apiRoot.withProjectKey().discountGroups().post()`
- added method `apiRoot.withProjectKey().paymentMethods().get()`
- added method `apiRoot.withProjectKey().paymentMethods().head()`
- added method `apiRoot.withProjectKey().paymentMethods().post()`
- added method `apiRoot.withProjectKey().recurringOrders().get()`
- added method `apiRoot.withProjectKey().recurringOrders().head()`
- added method `apiRoot.withProjectKey().recurringOrders().post()`
- added method `apiRoot.withProjectKey().recurrencePolicies().get()`
- added method `apiRoot.withProjectKey().recurrencePolicies().head()`
- added method `apiRoot.withProjectKey().recurrencePolicies().post()`
- added method `apiRoot.withProjectKey().discountGroups().withKey().get()`
- added method `apiRoot.withProjectKey().discountGroups().withKey().head()`
- added method `apiRoot.withProjectKey().discountGroups().withKey().post()`
- added method `apiRoot.withProjectKey().discountGroups().withKey().delete()`
- added method `apiRoot.withProjectKey().discountGroups().withId().get()`
- added method `apiRoot.withProjectKey().discountGroups().withId().head()`
- added method `apiRoot.withProjectKey().discountGroups().withId().post()`
- added method `apiRoot.withProjectKey().discountGroups().withId().delete()`
- added method `apiRoot.withProjectKey().paymentMethods().withKey().get()`
- added method `apiRoot.withProjectKey().paymentMethods().withKey().head()`
- added method `apiRoot.withProjectKey().paymentMethods().withKey().post()`
- added method `apiRoot.withProjectKey().paymentMethods().withKey().delete()`
- added method `apiRoot.withProjectKey().paymentMethods().withId().get()`
- added method `apiRoot.withProjectKey().paymentMethods().withId().head()`
- added method `apiRoot.withProjectKey().paymentMethods().withId().post()`
- added method `apiRoot.withProjectKey().paymentMethods().withId().delete()`
- added method `apiRoot.withProjectKey().recurringOrders().withId().get()`
- added method `apiRoot.withProjectKey().recurringOrders().withId().head()`
- added method `apiRoot.withProjectKey().recurringOrders().withId().post()`
- added method `apiRoot.withProjectKey().recurringOrders().withKey().get()`
- added method `apiRoot.withProjectKey().recurringOrders().withKey().head()`
- added method `apiRoot.withProjectKey().recurringOrders().withKey().post()`
- added method `apiRoot.withProjectKey().recurrencePolicies().withKey().get()`
- added method `apiRoot.withProjectKey().recurrencePolicies().withKey().head()`
- added method `apiRoot.withProjectKey().recurrencePolicies().withKey().post()`
- added method `apiRoot.withProjectKey().recurrencePolicies().withId().get()`
- added method `apiRoot.withProjectKey().recurrencePolicies().withId().head()`
- added method `apiRoot.withProjectKey().recurrencePolicies().withId().post()`
</details>


<details>
<summary>Added Type(s)</summary>

- added type `CartDiscountSetDiscountGroupAction`
- added type `CartChangePriceRoundingModeAction`
- added type `CartSetCustomLineItemRecurrenceInfoAction`
- added type `CartSetLineItemRecurrenceInfoAction`
- added type `DiscountGroup`
- added type `DiscountGroupDraft`
- added type `DiscountGroupPagedQueryResponse`
- added type `DiscountGroupReference`
- added type `DiscountGroupResourceIdentifier`
- added type `DiscountGroupUpdate`
- added type `DiscountGroupUpdateAction`
- added type `DiscountGroupSetDescriptionAction`
- added type `DiscountGroupSetKeyAction`
- added type `DiscountGroupSetNameAction`
- added type `DiscountGroupSetSortOrderAction`
- added type `MyCartSetCustomLineItemRecurrenceInfoAction`
- added type `MyCartSetLineItemRecurrenceInfoAction`
- added type `MyPaymentSetMethodInfoCustomFieldAction`
- added type `MyPaymentSetMethodInfoCustomTypeAction`
- added type `MyPaymentSetMethodInfoInterfaceAccountAction`
- added type `DiscountGroupCreatedMessage`
- added type `DiscountGroupDeletedMessage`
- added type `DiscountGroupKeySetMessage`
- added type `DiscountGroupSortOrderSetMessage`
- added type `OrderCreatedFromRecurringOrderMessage`
- added type `PaymentInterfaceIdSetMessage`
- added type `PaymentMethodCreatedMessage`
- added type `PaymentMethodCustomFieldAddedMessage`
- added type `PaymentMethodCustomFieldChangedMessage`
- added type `PaymentMethodCustomFieldRemovedMessage`
- added type `PaymentMethodCustomTypeRemovedMessage`
- added type `PaymentMethodCustomTypeSetMessage`
- added type `PaymentMethodDefaultSetMessage`
- added type `PaymentMethodDeletedMessage`
- added type `PaymentMethodInfoCustomFieldAddedMessage`
- added type `PaymentMethodInfoCustomFieldChangedMessage`
- added type `PaymentMethodInfoCustomFieldRemovedMessage`
- added type `PaymentMethodInfoCustomTypeRemovedMessage`
- added type `PaymentMethodInfoCustomTypeSetMessage`
- added type `PaymentMethodInfoInterfaceAccountSetMessage`
- added type `PaymentMethodInfoInterfaceSetMessage`
- added type `PaymentMethodInfoMethodSetMessage`
- added type `PaymentMethodInfoNameSetMessage`
- added type `PaymentMethodInfoTokenSetMessage`
- added type `PaymentMethodInterfaceAccountSetMessage`
- added type `PaymentMethodKeySetMessage`
- added type `PaymentMethodMethodSetMessage`
- added type `PaymentMethodNameSetMessage`
- added type `PaymentMethodPaymentInterfaceSetMessage`
- added type `PaymentMethodPaymentMethodStatusSetMessage`
- added type `RecurringOrderCreatedMessage`
- added type `RecurringOrderCustomFieldAddedMessage`
- added type `RecurringOrderCustomFieldChangedMessage`
- added type `RecurringOrderCustomFieldRemovedMessage`
- added type `RecurringOrderCustomTypeRemovedMessage`
- added type `RecurringOrderCustomTypeSetMessage`
- added type `RecurringOrderKeySetMessage`
- added type `RecurringOrderScheduleSetMessage`
- added type `RecurringOrderStartsAtSetMessage`
- added type `RecurringOrderStateChangedMessage`
- added type `RecurringOrderStateTransitionMessage`
- added type `DiscountGroupCreatedMessagePayload`
- added type `DiscountGroupDeletedMessagePayload`
- added type `DiscountGroupKeySetMessagePayload`
- added type `DiscountGroupSortOrderSetMessagePayload`
- added type `OrderCreatedFromRecurringOrderMessagePayload`
- added type `PaymentInterfaceIdSetMessagePayload`
- added type `PaymentMethodCreatedMessagePayload`
- added type `PaymentMethodCustomFieldAddedMessagePayload`
- added type `PaymentMethodCustomFieldChangedMessagePayload`
- added type `PaymentMethodCustomFieldRemovedMessagePayload`
- added type `PaymentMethodCustomTypeRemovedMessagePayload`
- added type `PaymentMethodCustomTypeSetMessagePayload`
- added type `PaymentMethodDefaultSetMessagePayload`
- added type `PaymentMethodDeletedMessagePayload`
- added type `PaymentMethodInfoCustomFieldAddedMessagePayload`
- added type `PaymentMethodInfoCustomFieldChangedMessagePayload`
- added type `PaymentMethodInfoCustomFieldRemovedMessagePayload`
- added type `PaymentMethodInfoCustomTypeRemovedMessagePayload`
- added type `PaymentMethodInfoCustomTypeSetMessagePayload`
- added type `PaymentMethodInfoInterfaceAccountSetMessagePayload`
- added type `PaymentMethodInfoInterfaceSetMessagePayload`
- added type `PaymentMethodInfoMethodSetMessagePayload`
- added type `PaymentMethodInfoNameSetMessagePayload`
- added type `PaymentMethodInfoTokenSetMessagePayload`
- added type `PaymentMethodInterfaceAccountSetMessagePayload`
- added type `PaymentMethodKeySetMessagePayload`
- added type `PaymentMethodMethodSetMessagePayload`
- added type `PaymentMethodNameSetMessagePayload`
- added type `PaymentMethodPaymentInterfaceSetMessagePayload`
- added type `PaymentMethodPaymentMethodStatusSetMessagePayload`
- added type `RecurringOrderCreatedMessagePayload`
- added type `RecurringOrderCustomFieldAddedMessagePayload`
- added type `RecurringOrderCustomFieldChangedMessagePayload`
- added type `RecurringOrderCustomFieldRemovedMessagePayload`
- added type `RecurringOrderCustomTypeRemovedMessagePayload`
- added type `RecurringOrderCustomTypeSetMessagePayload`
- added type `RecurringOrderKeySetMessagePayload`
- added type `RecurringOrderMessagePayload`
- added type `RecurringOrderScheduleSetMessagePayload`
- added type `RecurringOrderStartsAtSetMessagePayload`
- added type `RecurringOrderStateChangedMessagePayload`
- added type `RecurringOrderStateTransitionMessagePayload`
- added type `StagedOrderChangePriceRoundingModeAction`
- added type `PaymentMethod`
- added type `PaymentMethodDraft`
- added type `PaymentMethodPagedQueryResponse`
- added type `PaymentMethodReference`
- added type `PaymentMethodStatus`
- added type `PaymentMethodToken`
- added type `PaymentMethodUpdate`
- added type `PaymentMethodUpdateAction`
- added type `PaymentMethodSetCustomFieldAction`
- added type `PaymentMethodSetCustomTypeAction`
- added type `PaymentMethodSetDefaultAction`
- added type `PaymentMethodSetInterfaceAccountAction`
- added type `PaymentMethodSetKeyAction`
- added type `PaymentMethodSetMethodAction`
- added type `PaymentMethodSetNameAction`
- added type `PaymentMethodSetPaymentInterfaceAction`
- added type `PaymentMethodSetPaymentMethodStatusAction`
- added type `PaymentMethodInfoDraft`
- added type `PaymentSetMethodInfoAction`
- added type `PaymentSetMethodInfoCustomFieldAction`
- added type `PaymentSetMethodInfoCustomTypeAction`
- added type `PaymentSetMethodInfoInterfaceAccountAction`
- added type `PaymentSetMethodInfoTokenAction`
- added type `ProductTailoringSetProductAttributeAction`
- added type `AttributeLevelEnum`
- added type `ProductSetProductAttributeAction`
- added type `ProjectChangePriceRoundingModeAction`
- added type `ProjectChangeTaxRoundingModeAction`
- added type `DayOfMonthSchedule`
- added type `DayOfMonthScheduleDraft`
- added type `IntervalUnit`
- added type `RecurrencePolicy`
- added type `RecurrencePolicyDraft`
- added type `RecurrencePolicyPagedQueryResponse`
- added type `RecurrencePolicyReference`
- added type `RecurrencePolicyResourceIdentifier`
- added type `RecurrencePolicySchedule`
- added type `RecurrencePolicyScheduleDraft`
- added type `RecurrencePolicyUpdate`
- added type `RecurrencePolicyUpdateAction`
- added type `StandardSchedule`
- added type `StandardScheduleDraft`
- added type `RecurrencePolicySetDescriptionAction`
- added type `RecurrencePolicySetKeyAction`
- added type `RecurrencePolicySetNameAction`
- added type `RecurrencePolicySetScheduleAction`
- added type `Counter`
- added type `CounterDraft`
- added type `CustomLineItemRecurrenceInfo`
- added type `CustomLineItemRecurrenceInfoDraft`
- added type `LineItemRecurrenceInfo`
- added type `LineItemRecurrenceInfoDraft`
- added type `PriceSelectionMode`
- added type `RecurringOrder`
- added type `RecurringOrderActive`
- added type `RecurringOrderCanceled`
- added type `RecurringOrderDraft`
- added type `RecurringOrderExpired`
- added type `RecurringOrderPagedQueryResponse`
- added type `RecurringOrderPaused`
- added type `RecurringOrderReference`
- added type `RecurringOrderResourceIdentifier`
- added type `RecurringOrderState`
- added type `RecurringOrderStateDraft`
- added type `RecurringOrderUpdate`
- added type `RecurringOrderUpdateAction`
- added type `SkipConfiguration`
- added type `SkipConfigurationDraft`
- added type `RecurringOrderSetCustomFieldAction`
- added type `RecurringOrderSetCustomTypeAction`
- added type `RecurringOrderSetKeyAction`
- added type `RecurringOrderSetOrderSkipConfigurationAction`
- added type `RecurringOrderSetScheduleAction`
- added type `RecurringOrderSetStartsAtAction`
- added type `RecurringOrderSetStateAction`
- added type `RecurringOrderTransitionStateAction`
</details>


<details>
<summary>Added QueryParameter(s)</summary>

- added query parameter `priceRecurrencePolicy` to method `get /{projectKey}/products`
- added query parameter `priceRecurrencePolicy` to method `post /{projectKey}/products`
- added query parameter `priceRecurrencePolicy` to method `get /{projectKey}/product-projections`
- added query parameter `priceRecurrencePolicy` to method `get /{projectKey}/products/key={key}`
- added query parameter `priceRecurrencePolicy` to method `post /{projectKey}/products/key={key}`
- added query parameter `priceRecurrencePolicy` to method `delete /{projectKey}/products/key={key}`
- added query parameter `priceRecurrencePolicy` to method `get /{projectKey}/products/{ID}`
- added query parameter `priceRecurrencePolicy` to method `post /{projectKey}/products/{ID}`
- added query parameter `priceRecurrencePolicy` to method `delete /{projectKey}/products/{ID}`
- added query parameter `priceRecurrencePolicy` to method `get /{projectKey}/product-projections/search`
- added query parameter `priceRecurrencePolicy` to method `get /{projectKey}/product-projections/key={key}`
- added query parameter `priceRecurrencePolicy` to method `get /{projectKey}/product-projections/{ID}`
- added query parameter `priceRecurrencePolicy` to method `get /{projectKey}/in-store/key={storeKey}/product-projections/key={key}`
- added query parameter `priceRecurrencePolicy` to method `get /{projectKey}/in-store/key={storeKey}/product-projections/{ID}`
</details>


<details>
<summary>Added Resource(s)</summary>

- added resource `/{projectKey}/discount-groups`
- added resource `/{projectKey}/payment-methods`
- added resource `/{projectKey}/recurring-orders`
- added resource `/{projectKey}/recurrence-policies`
- added resource `/{projectKey}/discount-groups/key={key}`
- added resource `/{projectKey}/discount-groups/{ID}`
- added resource `/{projectKey}/payment-methods/key={key}`
- added resource `/{projectKey}/payment-methods/{ID}`
- added resource `/{projectKey}/recurring-orders/{ID}`
- added resource `/{projectKey}/recurring-orders/key={key}`
- added resource `/{projectKey}/recurrence-policies/key={key}`
- added resource `/{projectKey}/recurrence-policies/{ID}`
</details>

**Import changes**

<details>
<summary>Added Enum(s)</summary>

- added enum `product-selection` to type `ImportResourceType`
</details>


<details>
<summary>Added Property(s)</summary>

- added property `retentionPolicy` to type `ImportContainer`
- added property `expiresAt` to type `ImportContainer`
- added property `retentionPolicy` to type `ImportContainerDraft`
- added property `attributes` to type `ProductImport`
- added property `attributes` to type `ProductDraftImport`
- added property `level` to type `AttributeDefinition`
</details>


<details>
<summary>Changed Property(s)</summary>

- :warning: changed property `country` of type `ExternalTaxRateDraft` from type `string` to `CountryCode`
- :warning: changed property `value` of type `MoneySetField` from type `Money[]` to `TypedMoney[]`
</details>


<details>
<summary>Added Method(s)</summary>

- added method `apiRoot.withProjectKeyValue().productSelections().importContainers().withImportContainerKeyValue().post()`
</details>


<details>
<summary>Added Type(s)</summary>

- added type `StrategyEnum`
- added type `RetentionPolicy`
- added type `TimeToLiveConfig`
- added type `TimeToLiveRetentionPolicy`
- added type `ProductSelectionImportRequest`
- added type `AttributeLevel`
- added type `VariantSelectionType`
- added type `VariantSelection`
- added type `VariantExclusion`
- added type `ProductSelectionAssignment`
- added type `ProductSelectionMode`
- added type `ProductSelectionImport`
</details>


<details>
<summary>Added Resource(s)</summary>

- added resource `/{projectKey}/product-selections`
- added resource `/{projectKey}/product-selections/import-containers`
- added resource `/{projectKey}/product-selections/import-containers/{importContainerKey}`
</details>

**History changes**

<details>
<summary>Added Enum(s)</summary>

- added enum `ApplicationStoppedByGroupBestDeal` to type `DiscountCodeState`
- added enum `payment-method` to type `ReferenceTypeId`
- added enum `RecurringOrderState` to type `StateTypeEnum`
</details>

