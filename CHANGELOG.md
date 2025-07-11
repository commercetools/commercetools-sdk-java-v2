
# 19.0.0 (2025-07-10)

## Breaking Changes

The field `paymentMethodInfo` in type `PaymentDraft` and `MyPaymentDraft` has been changed from `PaymentMethodInfo` to `PaymentMethodInfoDraft`. For both types a backwards compatible Setter method `setPaymentMethodInfo(final PaymentMethodInfo paymentMethodInfo)` has been added.

## New Features

Adds support for [Discount Groups](https://docs.commercetools.com/api/projects/discount-groups) and [Recurring Orders](https://docs.commercetools.com/api/recurring-orders-overview)

## What's Changed
* Update changelog by @ct-sdks in https://github.com/commercetools/commercetools-sdk-java-v2/pull/928
* fix(deps): update all dependencies by @renovate in https://github.com/commercetools/commercetools-sdk-java-v2/pull/912
* Update DGS framework to 8.1.0 by @jenschude in https://github.com/commercetools/commercetools-sdk-java-v2/pull/930
* chore(deps): update github/codeql-action action to v3 by @renovate in https://github.com/commercetools/commercetools-sdk-java-v2/pull/913
* chore(deps): update gradle/actions digest to ac638b0 by @renovate in https://github.com/commercetools/commercetools-sdk-java-v2/pull/919
* chore(deps): update stefanzweifel/git-auto-commit-action action to v6 by @renovate in https://github.com/commercetools/commercetools-sdk-java-v2/pull/920
* Update generated SDKs by @ct-sdks in https://github.com/commercetools/commercetools-sdk-java-v2/pull/929
* Update generated SDKs by @ct-sdks in https://github.com/commercetools/commercetools-sdk-java-v2/pull/931
* Update generated SDKs by @ct-sdks in https://github.com/commercetools/commercetools-sdk-java-v2/pull/932
* Update generated SDKs by @ct-sdks in https://github.com/commercetools/commercetools-sdk-java-v2/pull/933
* Add paymentdraft mixin by @jenschude in https://github.com/commercetools/commercetools-sdk-java-v2/pull/936
* add MyPaymentDraft mixins by @jenschude in https://github.com/commercetools/commercetools-sdk-java-v2/pull/937
* Update generated SDKs by @ct-sdks in https://github.com/commercetools/commercetools-sdk-java-v2/pull/938
* Update generated SDKs by @ct-sdks in https://github.com/commercetools/commercetools-sdk-java-v2/pull/939

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

**Full Changelog**: https://github.com/commercetools/commercetools-sdk-java-v2/compare/18.3.0...19.0.0

# 18.3.0 (2025-06-20)

## What's Changed
* Update changelog by @ct-sdks in https://github.com/commercetools/commercetools-sdk-java-v2/pull/910
* chore(deps): lock file maintenance by @renovate in https://github.com/commercetools/commercetools-sdk-java-v2/pull/904
* chore(deps): update gradle/actions digest to 8379f6a by @renovate in https://github.com/commercetools/commercetools-sdk-java-v2/pull/906
* fix(deps): update all dependencies by @renovate in https://github.com/commercetools/commercetools-sdk-java-v2/pull/895
* chore(deps): update actions/create-github-app-token digest to df432ce by @renovate in https://github.com/commercetools/commercetools-sdk-java-v2/pull/892
* fix(deps): update dependency lint-staged to v16 by @renovate in https://github.com/commercetools/commercetools-sdk-java-v2/pull/903
* Update generated SDKs by @ct-sdks in https://github.com/commercetools/commercetools-sdk-java-v2/pull/911
* Update generated SDKs by @ct-sdks in https://github.com/commercetools/commercetools-sdk-java-v2/pull/915
* Update generated SDKs by @ct-sdks in https://github.com/commercetools/commercetools-sdk-java-v2/pull/916
* update Maven Release process by @jenschude in https://github.com/commercetools/commercetools-sdk-java-v2/pull/917
* Update generated SDKs by @ct-sdks in https://github.com/commercetools/commercetools-sdk-java-v2/pull/918
* Update generated SDKs by @ct-sdks in https://github.com/commercetools/commercetools-sdk-java-v2/pull/921
* Update generated SDKs by @ct-sdks in https://github.com/commercetools/commercetools-sdk-java-v2/pull/922
* update service regions by @jenschude in https://github.com/commercetools/commercetools-sdk-java-v2/pull/923
* support custom attributes for metrics by @jenschude in https://github.com/commercetools/commercetools-sdk-java-v2/pull/924
* Update generated SDKs by @ct-sdks in https://github.com/commercetools/commercetools-sdk-java-v2/pull/925
* Update generated SDKs by @ct-sdks in https://github.com/commercetools/commercetools-sdk-java-v2/pull/926
* Fix Logger with unwrapped CompletionExceptions by @jenschude in https://github.com/commercetools/commercetools-sdk-java-v2/pull/927

**Api changes**

<details>
<summary>Removed Property(s)</summary>

- :warning: removed property `/[0-9].[0-9]*[1-9]/` from type `CategoryOrderHints`
- :warning: removed property `//` from type `ProductVariantChannelAvailabilityMap`
</details>


<details>
<summary>Changed Property(s)</summary>

- :warning: changed property `filter` of type `SearchSorting` from type `SearchQueryExpression` to `SearchQuery`
</details>


<details>
<summary>Added Property(s)</summary>

- added property `/^[0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{12}$/` to type `CategoryOrderHints`
- added property `/^[0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{12}$/` to type `ProductVariantChannelAvailabilityMap`
</details>

**Full Changelog**: https://github.com/commercetools/commercetools-sdk-java-v2/compare/18.2.0...18.3.0

# 18.2.0 (2025-06-05)

## Fixes

Fixed version ranges for OkHttp and Apache clients to prevent the resolution of next major alpha versions using Maven.

## What's Changed
* Update generated SDKs by @ct-sdks in https://github.com/commercetools/commercetools-sdk-java-v2/pull/908
* Update generated SDKs by @ct-sdks in https://github.com/commercetools/commercetools-sdk-java-v2/pull/909

**Api changes**

<details>
<summary>Added Type(s)</summary>

- added type `ExpiredCustomerEmailTokenError`
- added type `ExpiredCustomerPasswordTokenError`
- added type `GraphQLExpiredCustomerEmailTokenError`
- added type `GraphQLExpiredCustomerPasswordTokenError`
- added type `CheckoutOrderCreationFailedEvent`
- added type `CheckoutPaymentAuthorizationCancelledEvent`
- added type `CheckoutPaymentAuthorizationFailedEvent`
- added type `CheckoutPaymentAuthorizedEvent`
- added type `CheckoutPaymentCancelAuthorizationFailedEvent`
- added type `CheckoutPaymentChargeFailedEvent`
- added type `CheckoutPaymentChargedEvent`
- added type `CheckoutPaymentRefundFailedEvent`
- added type `CheckoutPaymentRefundedEvent`
- added type `CheckoutMessageOrderPayloadBaseData`
- added type `CheckoutMessagePaymentsPayloadBaseData`
</details>


<details>
<summary>Added Property(s)</summary>

- added property `invalidateOlderTokens` to type `CustomerCreateEmailToken`
- added property `invalidateOlderTokens` to type `CustomerCreatePasswordResetToken`
- added property `invalidateOlderTokens` to type `CustomerToken`
- added property `value` to type `CustomerEmailTokenCreatedMessage`
- added property `invalidateOlderTokens` to type `CustomerEmailTokenCreatedMessage`
- added property `value` to type `CustomerPasswordTokenCreatedMessage`
- added property `invalidateOlderTokens` to type `CustomerPasswordTokenCreatedMessage`
- added property `value` to type `CustomerEmailTokenCreatedMessagePayload`
- added property `invalidateOlderTokens` to type `CustomerEmailTokenCreatedMessagePayload`
- added property `value` to type `CustomerPasswordTokenCreatedMessagePayload`
- added property `invalidateOlderTokens` to type `CustomerPasswordTokenCreatedMessagePayload`
</details>


<details>
<summary>Added Enum(s)</summary>

- added enum `checkout` to type `EventSubscriptionResourceTypeId`
- added enum `CheckoutOrderCreationFailed` to type `EventType`
- added enum `CheckoutPaymentAuthorizationCancelled` to type `EventType`
- added enum `CheckoutPaymentAuthorizationFailed` to type `EventType`
- added enum `CheckoutPaymentAuthorized` to type `EventType`
- added enum `CheckoutPaymentCancelAuthorizationFailed` to type `EventType`
- added enum `CheckoutPaymentCharged` to type `EventType`
- added enum `CheckoutPaymentChargeFailed` to type `EventType`
- added enum `CheckoutPaymentRefunded` to type `EventType`
- added enum `CheckoutPaymentRefundFailed` to type `EventType`
</details>

**Import changes**

<details>
<summary>Removed Property(s)</summary>

- :warning: removed property `/^[a-z]{2}(-[A-Z]{2})?$/` from type `SearchKeywords`
- :warning: removed property `/^[a-z]{2}(-[A-Z]{2})?$/` from type `LocalizedString`
</details>


<details>
<summary>Added Property(s)</summary>

- added property `/^[a-zA-Z]{2,3}(?:-[a-zA-Z]{4})?(?:-(?:[a-zA-Z]{2}|\d{3}))?$/` to type `SearchKeywords`
- added property `/^[a-zA-Z]{2,3}(?:-[a-zA-Z]{4})?(?:-(?:[a-zA-Z]{2}|\d{3}))?$/` to type `LocalizedString`
</details>

**Full Changelog**: https://github.com/commercetools/commercetools-sdk-java-v2/compare/18.1.0...18.2.0

# 18.1.0 (2025-06-03)

## New features

### Split packages

Additionally to the package `commercetools-sdk-java-api` we also release packages split by domain. This allows package size optimization for deployment targets with size constrains. See also https://commercetools.github.io/commercetools-sdk-java-v2/javadoc/com/commercetools/docs/meta/SizeOptimization.html

## What's Changed
* Update changelog by @ct-sdks in https://github.com/commercetools/commercetools-sdk-java-v2/pull/891
* Update generated SDKs by @ct-sdks in https://github.com/commercetools/commercetools-sdk-java-v2/pull/894
* Update generated SDKs by @ct-sdks in https://github.com/commercetools/commercetools-sdk-java-v2/pull/897
* Update generated SDKs by @ct-sdks in https://github.com/commercetools/commercetools-sdk-java-v2/pull/898
* Update generated SDKs by @ct-sdks in https://github.com/commercetools/commercetools-sdk-java-v2/pull/899
* Package split by @jenschude in https://github.com/commercetools/commercetools-sdk-java-v2/pull/900
* Update generated SDKs by @ct-sdks in https://github.com/commercetools/commercetools-sdk-java-v2/pull/901
* Package split example by @jenschude in https://github.com/commercetools/commercetools-sdk-java-v2/pull/902
* Update generated SDKs by @ct-sdks in https://github.com/commercetools/commercetools-sdk-java-v2/pull/905

**Import changes**

<details>
<summary>Removed Property(s)</summary>

- :warning: removed property `/^[a-z]{2}(-[A-Z]{2})?$/` from type `SearchKeywords`
- :warning: removed property `/^[a-z]{2}(-[A-Z]{2})?$/` from type `LocalizedString`
</details>


<details>
<summary>Added Property(s)</summary>

- added property `/^[a-zA-Z]{2,3}(?:-[a-zA-Z]{4})?(?:-(?:[a-zA-Z]{2}|\d{3}))?$/` to type `SearchKeywords`
- added property `/^[a-zA-Z]{2,3}(?:-[a-zA-Z]{4})?(?:-(?:[a-zA-Z]{2}|\d{3}))?$/` to type `LocalizedString`
</details>


**Full Changelog**: https://github.com/commercetools/commercetools-sdk-java-v2/compare/18.0.0...18.1.0

# 18.0.0 (2025-05-02)

## New Features

### Java 11

The SDK is built with Java 11 now. We will also take advantage of different language features in future releases.

### New Request Policy Middleware

It's now possible to create request policies based on the requests context. E.g. different timeouts and retries for POST and GET requests:

```java
ProjectApiRoot b = ApiRootBuilder.of()
       ...
        .withRequestPolicies(policies -> policies
                .withRequestMatching(apiHttpRequest -> apiHttpRequest.getMethod().equals(ApiHttpMethod.POST),
                    policyBuilder -> policyBuilder.withTimeout(Duration.ofSeconds(10)))
                .withRequestMatching(apiHttpRequest -> apiHttpRequest.getMethod().equals(ApiHttpMethod.GET),
                    policyBuilder -> policyBuilder.withTimeout(Duration.ofSeconds(1)))
                .withAllOtherRequests(policyBuilder -> policyBuilder.withTimeout(Duration.ofSeconds(60))))
        .build(projectKey);
```

## What's Changed
* fix Delivery discriminators by @jenschude in https://github.com/commercetools/commercetools-sdk-java-v2/pull/866
* Update generated SDKs by @ct-sdks in https://github.com/commercetools/commercetools-sdk-java-v2/pull/867
* Update changelog by @ct-sdks in https://github.com/commercetools/commercetools-sdk-java-v2/pull/865
* Update generated SDKs by @ct-sdks in https://github.com/commercetools/commercetools-sdk-java-v2/pull/870
* Update java to 11 by @lojzatran in https://github.com/commercetools/commercetools-sdk-java-v2/pull/844
* Update generated SDKs by @ct-sdks in https://github.com/commercetools/commercetools-sdk-java-v2/pull/871
* Update generated SDKs by @ct-sdks in https://github.com/commercetools/commercetools-sdk-java-v2/pull/872
* Update generated SDKs by @ct-sdks in https://github.com/commercetools/commercetools-sdk-java-v2/pull/873
* Update generated SDKs by @ct-sdks in https://github.com/commercetools/commercetools-sdk-java-v2/pull/877
* Update generated SDKs by @ct-sdks in https://github.com/commercetools/commercetools-sdk-java-v2/pull/879
* DEVX-588 adding query predicate builder documentation by @barbara79 in https://github.com/commercetools/commercetools-sdk-java-v2/pull/874
* Update generated SDKs by @ct-sdks in https://github.com/commercetools/commercetools-sdk-java-v2/pull/883
* Update generated SDKs by @ct-sdks in https://github.com/commercetools/commercetools-sdk-java-v2/pull/885
* Update generated SDKs by @ct-sdks in https://github.com/commercetools/commercetools-sdk-java-v2/pull/886
* Add request specific policies by @jenschude in https://github.com/commercetools/commercetools-sdk-java-v2/pull/882
* chore(deps): lock file maintenance by @renovate in https://github.com/commercetools/commercetools-sdk-java-v2/pull/881
* chore(deps): update actions/setup-java digest to c5195ef by @renovate in https://github.com/commercetools/commercetools-sdk-java-v2/pull/875
* chore(deps): update actions/create-github-app-token action to v2 by @renovate in https://github.com/commercetools/commercetools-sdk-java-v2/pull/869
* chore(deps): update github/codeql-action digest to 97a2bfd by @renovate in https://github.com/commercetools/commercetools-sdk-java-v2/pull/868
* fix(deps): update all dependencies by @renovate in https://github.com/commercetools/commercetools-sdk-java-v2/pull/858
* revert junit-jupiter by @jenschude in https://github.com/commercetools/commercetools-sdk-java-v2/pull/887
* Update generated SDKs by @ct-sdks in https://github.com/commercetools/commercetools-sdk-java-v2/pull/888
* remove dataprovider library by @jenschude in https://github.com/commercetools/commercetools-sdk-java-v2/pull/889
* update junit by @jenschude in https://github.com/commercetools/commercetools-sdk-java-v2/pull/890

**Full Changelog**: https://github.com/commercetools/commercetools-sdk-java-v2/compare/17.30.0...18.0.0

# 17.30.0 (2025-03-31)

## Important information

This will be the last release for Java 8. The next released version will be built with Java 11.

## What's Changed
* Update changelog by @ct-sdks in https://github.com/commercetools/commercetools-sdk-java-v2/pull/851
* fix(deps): update all dependencies by @renovate in https://github.com/commercetools/commercetools-sdk-java-v2/pull/836
* Delete .github/workflows/scorecard.yml by @jenschude in https://github.com/commercetools/commercetools-sdk-java-v2/pull/852
* update logback by @jenschude in https://github.com/commercetools/commercetools-sdk-java-v2/pull/854
* Update generated SDKs by @ct-sdks in https://github.com/commercetools/commercetools-sdk-java-v2/pull/853
* chore(deps): update actions/setup-java digest to 3a4f6e1 by @renovate in https://github.com/commercetools/commercetools-sdk-java-v2/pull/831
* chore(deps): update actions/create-github-app-token digest to af35eda by @renovate in https://github.com/commercetools/commercetools-sdk-java-v2/pull/830
* chore(deps): update plugin com.github.johnrengelman.shadow to v8 by @renovate in https://github.com/commercetools/commercetools-sdk-java-v2/pull/800
* add semgrep workflow by @jenschude in https://github.com/commercetools/commercetools-sdk-java-v2/pull/855
* Update generated SDKs by @ct-sdks in https://github.com/commercetools/commercetools-sdk-java-v2/pull/856
* Update generated SDKs by @ct-sdks in https://github.com/commercetools/commercetools-sdk-java-v2/pull/859
* Update generated SDKs by @ct-sdks in https://github.com/commercetools/commercetools-sdk-java-v2/pull/860
* Update generated SDKs by @ct-sdks in https://github.com/commercetools/commercetools-sdk-java-v2/pull/861
* Update generated SDKs by @ct-sdks in https://github.com/commercetools/commercetools-sdk-java-v2/pull/862
* chore(deps): update gradle/actions digest to 06832c7 by @renovate in https://github.com/commercetools/commercetools-sdk-java-v2/pull/864
* chore(deps): update actions/create-github-app-token digest to d72941d by @renovate in https://github.com/commercetools/commercetools-sdk-java-v2/pull/863
* chore(deps): update github/codeql-action digest to 9f45e74 by @renovate in https://github.com/commercetools/commercetools-sdk-java-v2/pull/857

**Api changes**

<details>
<summary>Required Property(s)</summary>

- changed property `facets` of type `ProductProjectionPagedSearchResponse` to be optional
</details>


<details>
<summary>Removed QueryParameter(s)</summary>

- :warning: removed query parameter `withTotal` from method `get /{projectKey}/product-projections/search`
</details>

**Full Changelog**: https://github.com/commercetools/commercetools-sdk-java-v2/compare/17.29.0...17.30.0

# 17.29.0 (2025-03-19)

## What's Changed
* Update changelog by @ct-sdks in https://github.com/commercetools/commercetools-sdk-java-v2/pull/846
* Update generated SDKs by @ct-sdks in https://github.com/commercetools/commercetools-sdk-java-v2/pull/847
* fix exception with invalid date deserialization by @jenschude in https://github.com/commercetools/commercetools-sdk-java-v2/pull/849
* Update generated SDKs by @ct-sdks in https://github.com/commercetools/commercetools-sdk-java-v2/pull/850

**Api changes**

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

- added type `CustomerGroupAssignment`
- added type `CustomerGroupAssignmentDraft`
- added type `CustomerAddCustomerGroupAssignmentAction`
- added type `CustomerRemoveCustomerGroupAssignmentAction`
- added type `CustomerSetCustomerGroupAssignmentsAction`
- added type `CustomerGroupAssignmentAddedMessage`
- added type `CustomerGroupAssignmentRemovedMessage`
- added type `CustomerGroupAssignmentsSetMessage`
- added type `CustomerGroupAssignmentAddedMessagePayload`
- added type `CustomerGroupAssignmentRemovedMessagePayload`
- added type `CustomerGroupAssignmentsSetMessagePayload`
</details>


<details>
<summary>Added Property(s)</summary>

- added property `customerGroupAssignments` to type `Customer`
- added property `customerGroupAssignments` to type `CustomerDraft`
- added property `priceCustomerGroupAssignments` to type `ProductSearchProjectionParams`
</details>

**Full Changelog**: https://github.com/commercetools/commercetools-sdk-java-v2/compare/17.28.0...17.29.0

# 17.28.0 (2025-03-19)

## What's Changed
* Update changelog by @ct-sdks in https://github.com/commercetools/commercetools-sdk-java-v2/pull/833
* Update generated SDKs by @ct-sdks in https://github.com/commercetools/commercetools-sdk-java-v2/pull/834
* [DEVX-495] make serviceregion configurable in examples by @jenschude in https://github.com/commercetools/commercetools-sdk-java-v2/pull/835
* [DEVX-322] QueryAll allows different field than id to be used by @jenschude in https://github.com/commercetools/commercetools-sdk-java-v2/pull/837
* Update generated SDKs by @ct-sdks in https://github.com/commercetools/commercetools-sdk-java-v2/pull/838
* Update generated SDKs by @ct-sdks in https://github.com/commercetools/commercetools-sdk-java-v2/pull/839
* Update generated SDKs by @ct-sdks in https://github.com/commercetools/commercetools-sdk-java-v2/pull/840
* Update generated SDKs by @ct-sdks in https://github.com/commercetools/commercetools-sdk-java-v2/pull/841
* Update generated SDKs by @ct-sdks in https://github.com/commercetools/commercetools-sdk-java-v2/pull/842
* Update generated SDKs by @ct-sdks in https://github.com/commercetools/commercetools-sdk-java-v2/pull/843
* feat: always deserialize to long for jsonutils by @lojzatran in https://github.com/commercetools/commercetools-sdk-java-v2/pull/845


**Full Changelog**: https://github.com/commercetools/commercetools-sdk-java-v2/compare/17.27.0...17.28.0

# 17.27.0 (2025-02-19)

## What's Changed
* Update changelog by @ct-sdks in https://github.com/commercetools/commercetools-sdk-java-v2/pull/816
* [DEVX-468] Capture errors in telemetry middleware by @jenschude in https://github.com/commercetools/commercetools-sdk-java-v2/pull/817
* chore(deps): update actions/create-github-app-token digest to 67e27a7 by @renovate in https://github.com/commercetools/commercetools-sdk-java-v2/pull/815
* Fix deserialization of time attributes/custom-fields by @jenschude in https://github.com/commercetools/commercetools-sdk-java-v2/pull/818
* fix(deps): update all dependencies by @renovate in https://github.com/commercetools/commercetools-sdk-java-v2/pull/795
* chore(deps): pin gradle/actions action to 94baf22 by @renovate in https://github.com/commercetools/commercetools-sdk-java-v2/pull/812
* chore(deps): update codecov/codecov-action action to v5 by @renovate in https://github.com/commercetools/commercetools-sdk-java-v2/pull/796
* Update generated SDKs by @ct-sdks in https://github.com/commercetools/commercetools-sdk-java-v2/pull/819
* Update generated SDKs by @ct-sdks in https://github.com/commercetools/commercetools-sdk-java-v2/pull/820
* Update generated SDKs by @ct-sdks in https://github.com/commercetools/commercetools-sdk-java-v2/pull/821
* Update generated SDKs by @ct-sdks in https://github.com/commercetools/commercetools-sdk-java-v2/pull/822
* Update generated SDKs by @ct-sdks in https://github.com/commercetools/commercetools-sdk-java-v2/pull/823
* Update changelog by @ct-sdks in https://github.com/commercetools/commercetools-sdk-java-v2/pull/824
* Update generated SDKs by @ct-sdks in https://github.com/commercetools/commercetools-sdk-java-v2/pull/826
* Update generated SDKs by @ct-sdks in https://github.com/commercetools/commercetools-sdk-java-v2/pull/827
* Update generated SDKs by @ct-sdks in https://github.com/commercetools/commercetools-sdk-java-v2/pull/828
* Update generated SDKs by @ct-sdks in https://github.com/commercetools/commercetools-sdk-java-v2/pull/829
* Update generated SDKs by @ct-sdks in https://github.com/commercetools/commercetools-sdk-java-v2/pull/832
* Bump io.netty:netty-handler from 4.1.117.Final to 4.1.118.Final by @dependabot in https://github.com/commercetools/commercetools-sdk-java-v2/pull/825
* chore(deps): update plugin io.github.gradle-nexus.publish-plugin to v2 by @renovate in https://github.com/commercetools/commercetools-sdk-java-v2/pull/620


**Full Changelog**: https://github.com/commercetools/commercetools-sdk-java-v2/compare/17.26.0...17.27.0

# 17.26.0 (2025-02-03)

## What's Changed
* Update changelog by @ct-sdks in https://github.com/commercetools/commercetools-sdk-java-v2/pull/811
* Update generated SDKs by @ct-sdks in https://github.com/commercetools/commercetools-sdk-java-v2/pull/814


**Full Changelog**: https://github.com/commercetools/commercetools-sdk-java-v2/compare/17.25.0...17.26.0

# 17.25.0 (2025-01-23)

## What's Changed
* Update changelog by @ct-sdks in https://github.com/commercetools/commercetools-sdk-java-v2/pull/806
* Update generated SDKs by @ct-sdks in https://github.com/commercetools/commercetools-sdk-java-v2/pull/808
* Update generated SDKs by @ct-sdks in https://github.com/commercetools/commercetools-sdk-java-v2/pull/809
* fix NPE when server response has no body by @jenschude in https://github.com/commercetools/commercetools-sdk-java-v2/pull/810


**Full Changelog**: https://github.com/commercetools/commercetools-sdk-java-v2/compare/17.24.0...17.24.1

# 17.16.2 (2025-01-23)

## What's Changed

* Update Apache HTTP client dependency with version with fix to HTTP/2 protocol to version 5.4.1

**Full Changelog**: https://github.com/commercetools/commercetools-sdk-java-v2/compare/17.16.1...17.16.2

# 17.15.3 (2025-01-23)

## What's Changed

* Update Apache HTTP client dependency with version with fix to HTTP/2 protocol to version 5.4.1

**Full Changelog**: https://github.com/commercetools/commercetools-sdk-java-v2/compare/17.15.2...17.15.3

# 17.3.2 (2025-01-23)

## What's Changed

* Update Apache HTTP client dependency with version with fix to HTTP/2 protocol to version 5.4.1

**Full Changelog**: https://github.com/commercetools/commercetools-sdk-java-v2/compare/17.3.1...17.3.2

# 16.2.2 (2025-01-23)

## What's Changed

* Update Apache HTTP client dependency with version with fix to HTTP/2 protocol to version 5.4.1

**Full Changelog**: https://github.com/commercetools/commercetools-sdk-java-v2/compare/16.2.1...16.2.2

# 17.24.0 (2025-01-22)

## What's Changed
* Update changelog by @ct-sdks in https://github.com/commercetools/commercetools-sdk-java-v2/pull/802
* Update AHC TLS config by @jenschude in https://github.com/commercetools/commercetools-sdk-java-v2/pull/803
* [DEVX-513] configurable protocol version for HTTP clients by @jenschude in https://github.com/commercetools/commercetools-sdk-java-v2/pull/804
* Update generated SDKs by @ct-sdks in https://github.com/commercetools/commercetools-sdk-java-v2/pull/805

**Api changes**

<details>
<summary>Changed Property(s)</summary>

- :warning: changed property `discount` of type `DiscountedTotalPricePortion` from type `CartDiscountReference` to `Reference`
</details>

### Fixes

- fix deserialization issue of `DiscountedTotalPricePortion` with a direct discount reference

**Full Changelog**: https://github.com/commercetools/commercetools-sdk-java-v2/compare/17.23.0...17.24.0

# 17.16.1 (2025-01-22)

## What's Changed

* Update Apache HTTP client dependency to 5.3.1

**Full Changelog**: https://github.com/commercetools/commercetools-sdk-java-v2/compare/17.16.0...17.16.1

# 17.15.2 (2025-01-22)

## What's Changed

* Update Apache HTTP client dependency  to 5.3.1

**Full Changelog**: https://github.com/commercetools/commercetools-sdk-java-v2/compare/17.15.1...17.15.2

# 17.3.1 (2025-01-22)

## What's Changed

* Update Apache HTTP client dependency  to 5.3.1

**Full Changelog**: https://github.com/commercetools/commercetools-sdk-java-v2/compare/17.3.0...17.3.1

# 16.2.1 (2025-01-22)

## What's Changed

* Update Apache HTTP client dependency  to 5.3.1

**Full Changelog**: https://github.com/commercetools/commercetools-sdk-java-v2/compare/16.2.0...16.2.1

# 9.4.2 (2025-01-22)

## What's Changed

* Update Apache HTTP client dependency with version with fix to HTTP/2 protocol to version 5.4.1

**Full Changelog**: https://github.com/commercetools/commercetools-sdk-java-v2/compare/9.4.1...9.4.2

# 9.4.1 (2025-01-22)

## What's Changed

* Update Apache HTTP client dependency  to 5.3.1

**Full Changelog**: https://github.com/commercetools/commercetools-sdk-java-v2/compare/9.4.0...9.4.1

# 17.23.0 (2025-01-21)

## What's Changed
* Update changelog by @ct-sdks in https://github.com/commercetools/commercetools-sdk-java-v2/pull/790
* Bump micromatch from 4.0.7 to 4.0.8 by @dependabot in https://github.com/commercetools/commercetools-sdk-java-v2/pull/718
* chore(deps): update gradle/actions action to v4 by @renovate in https://github.com/commercetools/commercetools-sdk-java-v2/pull/710
* chore(deps): update actions/setup-java digest to 7a6d8a8 by @renovate in https://github.com/commercetools/commercetools-sdk-java-v2/pull/709
* chore(deps): lock file maintenance by @renovate in https://github.com/commercetools/commercetools-sdk-java-v2/pull/677
* chore(deps): update actions/checkout digest to 11bd719 by @renovate in https://github.com/commercetools/commercetools-sdk-java-v2/pull/676
* chore(deps): update actions/create-github-app-token digest to c1a2851 by @renovate in https://github.com/commercetools/commercetools-sdk-java-v2/pull/665
* Update generated SDKs by @ct-sdks in https://github.com/commercetools/commercetools-sdk-java-v2/pull/791
* Update generated SDKs by @ct-sdks in https://github.com/commercetools/commercetools-sdk-java-v2/pull/792
* Update generated SDKs by @ct-sdks in https://github.com/commercetools/commercetools-sdk-java-v2/pull/793
* Update generated SDKs by @ct-sdks in https://github.com/commercetools/commercetools-sdk-java-v2/pull/794
* Update generated SDKs by @ct-sdks in https://github.com/commercetools/commercetools-sdk-java-v2/pull/797
* Update generated SDKs by @ct-sdks in https://github.com/commercetools/commercetools-sdk-java-v2/pull/798
* Update generated SDKs by @ct-sdks in https://github.com/commercetools/commercetools-sdk-java-v2/pull/799
* [DEVX-516] add HttpClient info to UserAgent by @jenschude in https://github.com/commercetools/commercetools-sdk-java-v2/pull/784

**Api changes**

<details>
<summary>Added Resource(s)</summary>

- added resource `/{projectKey}/in-store/key={storeKey}/business-units`
- added resource `/{projectKey}/in-store/key={storeKey}/business-units/key={key}`
- added resource `/{projectKey}/in-store/key={storeKey}/business-units/{ID}`
</details>


<details>
<summary>Required Property(s)</summary>

- :warning: changed property `triggerPattern` of type `CartDiscountPatternTarget` to be required
- changed property `images` of type `ProductTailoringSetExternalImagesAction` to be optional
</details>


<details>
<summary>Added Property(s)</summary>

- added property `inheritedStores` to type `BusinessUnit`
- added property `inheritedStores` to type `Company`
- added property `inheritedStores` to type `Division`
</details>


<details>
<summary>Added Method(s)</summary>

- added method `apiRoot.withProjectKey().inStoreKeyWithStoreKeyValue().businessUnits().get()`
- added method `apiRoot.withProjectKey().inStoreKeyWithStoreKeyValue().businessUnits().head()`
- added method `apiRoot.withProjectKey().inStoreKeyWithStoreKeyValue().businessUnits().post()`
- added method `apiRoot.withProjectKey().inStoreKeyWithStoreKeyValue().businessUnits().withKey().get()`
- added method `apiRoot.withProjectKey().inStoreKeyWithStoreKeyValue().businessUnits().withKey().head()`
- added method `apiRoot.withProjectKey().inStoreKeyWithStoreKeyValue().businessUnits().withKey().post()`
- added method `apiRoot.withProjectKey().inStoreKeyWithStoreKeyValue().businessUnits().withKey().delete()`
- added method `apiRoot.withProjectKey().inStoreKeyWithStoreKeyValue().businessUnits().withId().get()`
- added method `apiRoot.withProjectKey().inStoreKeyWithStoreKeyValue().businessUnits().withId().head()`
- added method `apiRoot.withProjectKey().inStoreKeyWithStoreKeyValue().businessUnits().withId().post()`
- added method `apiRoot.withProjectKey().inStoreKeyWithStoreKeyValue().businessUnits().withId().delete()`
</details>

**History changes**

<details>
<summary>Changed Property(s)</summary>

- :warning: changed property `extensions` of type `GraphQLError` from type `GraphQLErrorObject` to `object`
</details>


<details>
<summary>Required Property(s)</summary>

- :warning: changed property `triggerPattern` of type `ChangeTargetPatternChangeValue` to be required
</details>


<details>
<summary>Removed Type(s)</summary>

- :warning: removed type `GraphQLErrorObject`
</details>


**Full Changelog**: https://github.com/commercetools/commercetools-sdk-java-v2/compare/17.22.0...17.23.0

# 17.22.0 (2025-01-06)

## What's Changed
* Update changelog by @ct-sdks in https://github.com/commercetools/commercetools-sdk-java-v2/pull/782
* Update generated SDKs by @ct-sdks in https://github.com/commercetools/commercetools-sdk-java-v2/pull/783
* Update generated SDKs by @ct-sdks in https://github.com/commercetools/commercetools-sdk-java-v2/pull/785
* Update generated SDKs by @ct-sdks in https://github.com/commercetools/commercetools-sdk-java-v2/pull/786
* Update generated SDKs by @ct-sdks in https://github.com/commercetools/commercetools-sdk-java-v2/pull/787
* Update generated SDKs by @ct-sdks in https://github.com/commercetools/commercetools-sdk-java-v2/pull/788
* Bump cross-spawn from 7.0.3 to 7.0.6 by @dependabot in https://github.com/commercetools/commercetools-sdk-java-v2/pull/758
* fix(deps): update all dependencies by @renovate in https://github.com/commercetools/commercetools-sdk-java-v2/pull/666

## New Contributors
* @dependabot made their first contribution in https://github.com/commercetools/commercetools-sdk-java-v2/pull/758

**Full Changelog**: https://github.com/commercetools/commercetools-sdk-java-v2/compare/17.21.0...17.22.0

# 17.21.0 (2024-12-19)

## What's Changed
* Update changelog by @ct-sdks in https://github.com/commercetools/commercetools-sdk-java-v2/pull/767
* Update generated SDKs by @ct-sdks in https://github.com/commercetools/commercetools-sdk-java-v2/pull/768
* DEVX-496 update spring boot version by @lojzatran in https://github.com/commercetools/commercetools-sdk-java-v2/pull/765
* Update generated SDKs by @ct-sdks in https://github.com/commercetools/commercetools-sdk-java-v2/pull/769
* Update generated SDKs by @ct-sdks in https://github.com/commercetools/commercetools-sdk-java-v2/pull/770
* Update generated SDKs by @ct-sdks in https://github.com/commercetools/commercetools-sdk-java-v2/pull/771
* Update changelog by @ct-sdks in https://github.com/commercetools/commercetools-sdk-java-v2/pull/774
* Update generated SDKs by @ct-sdks in https://github.com/commercetools/commercetools-sdk-java-v2/pull/775
* Update generated SDKs by @ct-sdks in https://github.com/commercetools/commercetools-sdk-java-v2/pull/776
* DEVX-460 make metrics more precise for values below 0 ms by @lojzatran in https://github.com/commercetools/commercetools-sdk-java-v2/pull/772
* Update generated SDKs by @ct-sdks in https://github.com/commercetools/commercetools-sdk-java-v2/pull/777
* Update generated SDKs by @ct-sdks in https://github.com/commercetools/commercetools-sdk-java-v2/pull/778
* Update generated SDKs by @ct-sdks in https://github.com/commercetools/commercetools-sdk-java-v2/pull/779
* Update generated SDKs by @ct-sdks in https://github.com/commercetools/commercetools-sdk-java-v2/pull/780
* Update generated SDKs by @ct-sdks in https://github.com/commercetools/commercetools-sdk-java-v2/pull/781
* Update Apache AsyncHttpClient by @jenschude in https://github.com/commercetools/commercetools-sdk-java-v2/pull/773

**Api changes**

<details>
<summary>Added Resource(s)</summary>

- added resource `/{projectKey}/channels/key={key}`
</details>


<details>
<summary>Added Method(s)</summary>

- added method `apiRoot.withProjectKey().channels().withKey().get()`
- added method `apiRoot.withProjectKey().channels().withKey().head()`
- added method `apiRoot.withProjectKey().channels().withKey().post()`
- added method `apiRoot.withProjectKey().channels().withKey().delete()`
</details>


<details>
<summary>Added Type(s)</summary>

- added type `CartDiscountPatternTarget`
- added type `CountOnCustomLineItemUnits`
- added type `CountOnLineItemUnits`
- added type `PatternComponent`
- added type `ShoppingListLineItemAddedMessage`
- added type `ShoppingListLineItemRemovedMessage`
- added type `ShoppingListMessage`
- added type `ShoppingListLineItemAddedMessagePayload`
- added type `ShoppingListLineItemRemovedMessagePayload`
- added type `ShoppingListMessagePayload`
</details>


<details>
<summary>Added Enum(s)</summary>

- added enum `Canceled` to type `ShipmentState`
- added enum `shopping-list` to type `MessageSubscriptionResourceTypeId`
</details>


<details>
<summary>Added Property(s)</summary>

- added property `applicationMode` to type `CartDiscountValueFixed`
- added property `applicationMode` to type `CartDiscountValueFixedDraft`
- added property `custom` to type `CartSetCustomShippingMethodAction`
- added property `custom` to type `StagedOrderSetCustomShippingMethodAction`
- added property `custom` to type `StagedOrderSetShippingAddressAndCustomShippingMethodAction`
</details>

**History changes**

<details>
<summary>Added Type(s)</summary>

- added type `ChangeTargetPatternChangeValue`
- added type `PatternComponent`
</details>


**Full Changelog**: https://github.com/commercetools/commercetools-sdk-java-v2/compare/17.20.0...17.21.0

# 17.20.0 (2024-12-02)

## What's Changed
* Update changelog by @ct-sdks in https://github.com/commercetools/commercetools-sdk-java-v2/pull/763
* Add option to provide custom auth and api url for spring example project by @lojzatran in https://github.com/commercetools/commercetools-sdk-java-v2/pull/764
* Update generated SDKs by @ct-sdks in https://github.com/commercetools/commercetools-sdk-java-v2/pull/766


**Full Changelog**: https://github.com/commercetools/commercetools-sdk-java-v2/compare/17.19.0...17.20.0

# 17.19.0 (2024-11-21)

## Important notice

Due to a regression with regards to deserialization in Jackson 2.18.x we introduced the usage of `JsonAnySetter` at some constructors e.g. to `LocalizedString`. The usage of `JsonAnySetter` annotation is made available with Jackson 2.17.x. Any version prior to Jackson 2.17 is not compatible with the SDK.

## What's Changed
* Update changelog by @ct-sdks in https://github.com/commercetools/commercetools-sdk-java-v2/pull/761
* Update generated SDKs by @ct-sdks in https://github.com/commercetools/commercetools-sdk-java-v2/pull/762
* [SUPPORT-29621] fix regression with jackson 2.18.x by @jenschude in https://github.com/commercetools/commercetools-sdk-java-v2/pull/760

**Api changes**

<details>
<summary>Changed Property(s)</summary>

- :warning: changed property `totalPrice` of type `StagedOrder` from type `TypedMoney` to `CentPrecisionMoney`
- :warning: changed property `totalPrice` of type `Order` from type `TypedMoney` to `CentPrecisionMoney`
</details>

**Full Changelog**: https://github.com/commercetools/commercetools-sdk-java-v2/compare/17.18.0...17.19.0

# 17.18.0 (2024-11-20)

## What's Changed
* Update changelog by @ct-sdks in https://github.com/commercetools/commercetools-sdk-java-v2/pull/750
* Update generated SDKs by @ct-sdks in https://github.com/commercetools/commercetools-sdk-java-v2/pull/751
* Update generated SDKs by @ct-sdks in https://github.com/commercetools/commercetools-sdk-java-v2/pull/752
* Update generated SDKs by @ct-sdks in https://github.com/commercetools/commercetools-sdk-java-v2/pull/753
* Update generated SDKs by @ct-sdks in https://github.com/commercetools/commercetools-sdk-java-v2/pull/754
* Update generated SDKs by @ct-sdks in https://github.com/commercetools/commercetools-sdk-java-v2/pull/756
* Update generated SDKs by @ct-sdks in https://github.com/commercetools/commercetools-sdk-java-v2/pull/759
* SUPPORT-28804 add custom deserializer for attrs in import api by @lojzatran in https://github.com/commercetools/commercetools-sdk-java-v2/pull/748


**Full Changelog**: https://github.com/commercetools/commercetools-sdk-java-v2/compare/17.17.0...17.18.0

# 17.17.0 (2024-11-07)

## What's Changed
* Update changelog by @ct-sdks in https://github.com/commercetools/commercetools-sdk-java-v2/pull/739
* Update generated SDKs by @ct-sdks in https://github.com/commercetools/commercetools-sdk-java-v2/pull/740
* optimize OkHttp3 client by @jenschude in https://github.com/commercetools/commercetools-sdk-java-v2/pull/741
* Update generated SDKs by @ct-sdks in https://github.com/commercetools/commercetools-sdk-java-v2/pull/743
* fix exportSignatures plugin by @jenschude in https://github.com/commercetools/commercetools-sdk-java-v2/pull/745
* Fix deserialization if subtype discriminator is missing by @jenschude in https://github.com/commercetools/commercetools-sdk-java-v2/pull/746
* Update generated SDKs by @ct-sdks in https://github.com/commercetools/commercetools-sdk-java-v2/pull/747
* Update generated SDKs by @ct-sdks in https://github.com/commercetools/commercetools-sdk-java-v2/pull/749


**Full Changelog**: https://github.com/commercetools/commercetools-sdk-java-v2/compare/17.16.0...17.17.0

# 17.16.0 (2024-10-07)

## What's Changed
* Update changelog by @ct-sdks in https://github.com/commercetools/commercetools-sdk-java-v2/pull/728
* Update generated SDKs by @ct-sdks in https://github.com/commercetools/commercetools-sdk-java-v2/pull/729
* Update generated SDKs by @ct-sdks in https://github.com/commercetools/commercetools-sdk-java-v2/pull/730
* update service regions by @jenschude in https://github.com/commercetools/commercetools-sdk-java-v2/pull/731
* Create config.yml by @jenschude in https://github.com/commercetools/commercetools-sdk-java-v2/pull/732
* Update generated SDKs by @ct-sdks in https://github.com/commercetools/commercetools-sdk-java-v2/pull/733
* Update generated SDKs by @ct-sdks in https://github.com/commercetools/commercetools-sdk-java-v2/pull/735
* Update generated SDKs by @ct-sdks in https://github.com/commercetools/commercetools-sdk-java-v2/pull/736
* Update generated SDKs by @ct-sdks in https://github.com/commercetools/commercetools-sdk-java-v2/pull/737
* Update generated SDKs by @ct-sdks in https://github.com/commercetools/commercetools-sdk-java-v2/pull/738


**Full Changelog**: https://github.com/commercetools/commercetools-sdk-java-v2/compare/17.15.1...17.16.0

# 17.15.1 (2024-09-17)

## What's Changed
* Update changelog by @ct-sdks in https://github.com/commercetools/commercetools-sdk-java-v2/pull/719
* Update generated SDKs by @ct-sdks in https://github.com/commercetools/commercetools-sdk-java-v2/pull/720
* Update generated SDKs by @ct-sdks in https://github.com/commercetools/commercetools-sdk-java-v2/pull/721
* Update generated SDKs by @ct-sdks in https://github.com/commercetools/commercetools-sdk-java-v2/pull/722
* Update generated SDKs by @ct-sdks in https://github.com/commercetools/commercetools-sdk-java-v2/pull/723
* Switch (de)serialization metrics to the correct meaning by @lojzatran in https://github.com/commercetools/commercetools-sdk-java-v2/pull/724
* Update generated SDKs by @ct-sdks in https://github.com/commercetools/commercetools-sdk-java-v2/pull/725
* add test for Datadog middleware by @jenschude in https://github.com/commercetools/commercetools-sdk-java-v2/pull/726
* Send datadog metrics in double instead of long by @lojzatran in https://github.com/commercetools/commercetools-sdk-java-v2/pull/727


**Full Changelog**: https://github.com/commercetools/commercetools-sdk-java-v2/compare/17.15.0...17.15.1

# 17.15.0 (2024-09-02)

## What's Changed
* Update changelog by @ct-sdks in https://github.com/commercetools/commercetools-sdk-java-v2/pull/704
* Update generated SDKs by @ct-sdks in https://github.com/commercetools/commercetools-sdk-java-v2/pull/705
* Update generated SDKs by @ct-sdks in https://github.com/commercetools/commercetools-sdk-java-v2/pull/706
* Update generated SDKs by @ct-sdks in https://github.com/commercetools/commercetools-sdk-java-v2/pull/707
* Update generated SDKs by @ct-sdks in https://github.com/commercetools/commercetools-sdk-java-v2/pull/708
* Update generated SDKs by @ct-sdks in https://github.com/commercetools/commercetools-sdk-java-v2/pull/711
* Update generated SDKs by @ct-sdks in https://github.com/commercetools/commercetools-sdk-java-v2/pull/713
* Update generated SDKs by @ct-sdks in https://github.com/commercetools/commercetools-sdk-java-v2/pull/714
* Update generated SDKs by @ct-sdks in https://github.com/commercetools/commercetools-sdk-java-v2/pull/715
* Update generated SDKs by @ct-sdks in https://github.com/commercetools/commercetools-sdk-java-v2/pull/716
* Update generated SDKs by @ct-sdks in https://github.com/commercetools/commercetools-sdk-java-v2/pull/717


**Full Changelog**: https://github.com/commercetools/commercetools-sdk-java-v2/compare/17.14.0...17.15.0

# 17.14.0 (2024-08-06)

## What's Changed
* Update changelog by @ct-sdks in https://github.com/commercetools/commercetools-sdk-java-v2/pull/702
* Update generated SDKs by @ct-sdks in https://github.com/commercetools/commercetools-sdk-java-v2/pull/703

### Fixes

- fixes path traversal in requests when using unsanitized path parameters


**Full Changelog**: https://github.com/commercetools/commercetools-sdk-java-v2/compare/17.13.0...17.14.0

# 17.13.0 (2024-08-05)

**Api changes**

<details>
<summary>Changed Property(s)</summary>

- :warning: changed property `customType` of type `OrderSearchAnyValue` from type `string` to `OrderSearchCustomType`
- :warning: changed property `customType` of type `OrderSearchDateRangeValue` from type `string` to `OrderSearchCustomType`
- :warning: changed property `customType` of type `OrderSearchFullTextValue` from type `string` to `OrderSearchCustomType`
- :warning: changed property `customType` of type `OrderSearchLongRangeValue` from type `string` to `OrderSearchCustomType`
- :warning: changed property `customType` of type `OrderSearchNumberRangeValue` from type `string` to `OrderSearchCustomType`
- :warning: changed property `customType` of type `OrderSearchQueryExpressionValue` from type `string` to `OrderSearchCustomType`
- :warning: changed property `customType` of type `OrderSearchStringValue` from type `string` to `OrderSearchCustomType`
</details>


<details>
<summary>Added Property(s)</summary>

- added property `approvalRuleMode` to type `BusinessUnit`
- added property `approvalRuleMode` to type `BusinessUnitDraft`
- added property `approvalRuleMode` to type `Company`
- added property `approvalRuleMode` to type `CompanyDraft`
- added property `approvalRuleMode` to type `Division`
- added property `approvalRuleMode` to type `DivisionDraft`
- added property `addressId` to type `BusinessUnitAddressCustomFieldAddedMessage`
- added property `addressId` to type `BusinessUnitAddressCustomFieldChangedMessage`
- added property `addressId` to type `BusinessUnitAddressCustomFieldRemovedMessage`
- added property `addressId` to type `BusinessUnitAddressCustomTypeRemovedMessage`
- added property `addressId` to type `BusinessUnitAddressCustomTypeSetMessage`
- added property `addressId` to type `CustomerAddressCustomFieldAddedMessage`
- added property `addressId` to type `CustomerAddressCustomFieldChangedMessage`
- added property `addressId` to type `CustomerAddressCustomFieldRemovedMessage`
- added property `addressId` to type `CustomerAddressCustomTypeRemovedMessage`
- added property `addressId` to type `CustomerAddressCustomTypeSetMessage`
- added property `metaTitle` to type `ProductTailoringCreatedMessage`
- added property `metaDescription` to type `ProductTailoringCreatedMessage`
- added property `metaKeywords` to type `ProductTailoringCreatedMessage`
- added property `variants` to type `ProductTailoringCreatedMessage`
- added property `addressId` to type `BusinessUnitAddressCustomFieldAddedMessagePayload`
- added property `addressId` to type `BusinessUnitAddressCustomFieldChangedMessagePayload`
- added property `addressId` to type `BusinessUnitAddressCustomFieldRemovedMessagePayload`
- added property `addressId` to type `BusinessUnitAddressCustomTypeRemovedMessagePayload`
- added property `addressId` to type `BusinessUnitAddressCustomTypeSetMessagePayload`
- added property `addressId` to type `CustomerAddressCustomFieldAddedMessagePayload`
- added property `addressId` to type `CustomerAddressCustomFieldChangedMessagePayload`
- added property `addressId` to type `CustomerAddressCustomFieldRemovedMessagePayload`
- added property `addressId` to type `CustomerAddressCustomTypeRemovedMessagePayload`
- added property `addressId` to type `CustomerAddressCustomTypeSetMessagePayload`
- added property `metaTitle` to type `ProductTailoringCreatedMessagePayload`
- added property `metaDescription` to type `ProductTailoringCreatedMessagePayload`
- added property `metaKeywords` to type `ProductTailoringCreatedMessagePayload`
- added property `variants` to type `ProductTailoringCreatedMessagePayload`
- added property `variants` to type `ProductTailoringData`
- added property `variants` to type `ProductTailoringDraft`
- added property `variants` to type `ProductTailoringInStoreDraft`
- added property `active` to type `ShippingMethod`
- added property `active` to type `ShippingMethodDraft`
- added property `store` to type `StagedQuote`
</details>


<details>
<summary>Added Resource(s)</summary>

- added resource `/{projectKey}/customers/search`
- added resource `/{projectKey}/customers/search/indexing-status`
- added resource `/{projectKey}/in-store/key={storeKey}/quote-requests`
- added resource `/{projectKey}/in-store/key={storeKey}/staged-quotes`
- added resource `/{projectKey}/in-store/key={storeKey}/quotes`
- added resource `/{projectKey}/in-store/key={storeKey}/orders/quotes`
- added resource `/{projectKey}/in-store/key={storeKey}/products/{productID}/product-tailoring/images`
- added resource `/{projectKey}/in-store/key={storeKey}/products/key={productKey}/product-tailoring/images`
- added resource `/{projectKey}/in-store/key={storeKey}/quote-requests/key={key}`
- added resource `/{projectKey}/in-store/key={storeKey}/quote-requests/{ID}`
- added resource `/{projectKey}/in-store/key={storeKey}/staged-quotes/key={key}`
- added resource `/{projectKey}/in-store/key={storeKey}/staged-quotes/{ID}`
- added resource `/{projectKey}/in-store/key={storeKey}/quotes/key={key}`
- added resource `/{projectKey}/in-store/key={storeKey}/quotes/{ID}`
</details>


<details>
<summary>Removed Resource(s)</summary>

- :warning: removed resource `/{projectKey}/me/carts/key={key}`
</details>


<details>
<summary>Removed QueryParameter(s)</summary>

- :warning: removed query parameter `localeProjection` from method `get /{projectKey}/products`
- :warning: removed query parameter `localeProjection` from method `post /{projectKey}/products`
- :warning: removed query parameter `localeProjection` from method `get /{projectKey}/products/key={key}`
- :warning: removed query parameter `localeProjection` from method `post /{projectKey}/products/key={key}`
- :warning: removed query parameter `localeProjection` from method `delete /{projectKey}/products/key={key}`
- :warning: removed query parameter `localeProjection` from method `get /{projectKey}/products/{ID}`
- :warning: removed query parameter `localeProjection` from method `post /{projectKey}/products/{ID}`
- :warning: removed query parameter `localeProjection` from method `delete /{projectKey}/products/{ID}`
- :warning: removed query parameter `sort` from method `get /{projectKey}/product-projections/suggest`
- :warning: removed query parameter `offset` from method `get /{projectKey}/product-projections/suggest`
- :warning: removed query parameter `withTotal` from method `get /{projectKey}/product-projections/suggest`
</details>


<details>
<summary>Added Method(s)</summary>

- added method `apiRoot.withProjectKey().customers().search().post()`
- added method `apiRoot.withProjectKey().customers().search().head()`
- added method `apiRoot.withProjectKey().customers().searchIndexingStatus().get()`
- added method `apiRoot.withProjectKey().inStoreKeyWithStoreKeyValue().quoteRequests().get()`
- added method `apiRoot.withProjectKey().inStoreKeyWithStoreKeyValue().quoteRequests().head()`
- added method `apiRoot.withProjectKey().inStoreKeyWithStoreKeyValue().quoteRequests().post()`
- added method `apiRoot.withProjectKey().inStoreKeyWithStoreKeyValue().stagedQuotes().get()`
- added method `apiRoot.withProjectKey().inStoreKeyWithStoreKeyValue().stagedQuotes().head()`
- added method `apiRoot.withProjectKey().inStoreKeyWithStoreKeyValue().stagedQuotes().post()`
- added method `apiRoot.withProjectKey().inStoreKeyWithStoreKeyValue().quotes().get()`
- added method `apiRoot.withProjectKey().inStoreKeyWithStoreKeyValue().quotes().head()`
- added method `apiRoot.withProjectKey().inStoreKeyWithStoreKeyValue().quotes().post()`
- added method `apiRoot.withProjectKey().inStoreKeyWithStoreKeyValue().orders().orderQuote().post()`
- added method `apiRoot.withProjectKey().inStoreKeyWithStoreKeyValue().products().withProductId().productTailoring().images().post()`
- added method `apiRoot.withProjectKey().inStoreKeyWithStoreKeyValue().products().withProductKey().productTailoring().images().post()`
- added method `apiRoot.withProjectKey().inStoreKeyWithStoreKeyValue().quoteRequests().withKey().get()`
- added method `apiRoot.withProjectKey().inStoreKeyWithStoreKeyValue().quoteRequests().withKey().head()`
- added method `apiRoot.withProjectKey().inStoreKeyWithStoreKeyValue().quoteRequests().withKey().post()`
- added method `apiRoot.withProjectKey().inStoreKeyWithStoreKeyValue().quoteRequests().withKey().delete()`
- added method `apiRoot.withProjectKey().inStoreKeyWithStoreKeyValue().quoteRequests().withId().get()`
- added method `apiRoot.withProjectKey().inStoreKeyWithStoreKeyValue().quoteRequests().withId().head()`
- added method `apiRoot.withProjectKey().inStoreKeyWithStoreKeyValue().quoteRequests().withId().post()`
- added method `apiRoot.withProjectKey().inStoreKeyWithStoreKeyValue().quoteRequests().withId().delete()`
- added method `apiRoot.withProjectKey().inStoreKeyWithStoreKeyValue().stagedQuotes().withKey().get()`
- added method `apiRoot.withProjectKey().inStoreKeyWithStoreKeyValue().stagedQuotes().withKey().head()`
- added method `apiRoot.withProjectKey().inStoreKeyWithStoreKeyValue().stagedQuotes().withKey().post()`
- added method `apiRoot.withProjectKey().inStoreKeyWithStoreKeyValue().stagedQuotes().withKey().delete()`
- added method `apiRoot.withProjectKey().inStoreKeyWithStoreKeyValue().stagedQuotes().withId().get()`
- added method `apiRoot.withProjectKey().inStoreKeyWithStoreKeyValue().stagedQuotes().withId().head()`
- added method `apiRoot.withProjectKey().inStoreKeyWithStoreKeyValue().stagedQuotes().withId().post()`
- added method `apiRoot.withProjectKey().inStoreKeyWithStoreKeyValue().stagedQuotes().withId().delete()`
- added method `apiRoot.withProjectKey().inStoreKeyWithStoreKeyValue().quotes().withKey().get()`
- added method `apiRoot.withProjectKey().inStoreKeyWithStoreKeyValue().quotes().withKey().head()`
- added method `apiRoot.withProjectKey().inStoreKeyWithStoreKeyValue().quotes().withKey().post()`
- added method `apiRoot.withProjectKey().inStoreKeyWithStoreKeyValue().quotes().withKey().delete()`
- added method `apiRoot.withProjectKey().inStoreKeyWithStoreKeyValue().quotes().withId().get()`
- added method `apiRoot.withProjectKey().inStoreKeyWithStoreKeyValue().quotes().withId().head()`
- added method `apiRoot.withProjectKey().inStoreKeyWithStoreKeyValue().quotes().withId().post()`
- added method `apiRoot.withProjectKey().inStoreKeyWithStoreKeyValue().quotes().withId().delete()`
</details>


<details>
<summary>Removed Method(s)</summary>

- :warning: removed method `apiRoot.withProjectKey().me().carts().withKey().get()`
- :warning: removed method `apiRoot.withProjectKey().me().carts().withKey().head()`
- :warning: removed method `apiRoot.withProjectKey().me().carts().withKey().post()`
- :warning: removed method `apiRoot.withProjectKey().me().carts().withKey().delete()`
- :warning: removed method `apiRoot.withProjectKey().me().quoteRequests().withId().delete()`
- :warning: removed method `apiRoot.withProjectKey().me().quoteRequests().withKey().delete()`
</details>


<details>
<summary>Added Enum(s)</summary>

- added enum `shopping-list` to type `ExtensionResourceTypeId`
- added enum `customer-group` to type `AttributeReferenceTypeId`
- added enum `attribute-group` to type `ChangeSubscriptionResourceTypeId`
- added enum `product-tailoring` to type `ChangeSubscriptionResourceTypeId`
- added enum `cart-discount` to type `CustomFieldReferenceValue`
- added enum `customer-group` to type `CustomFieldReferenceValue`
</details>


<details>
<summary>Removed Enum(s)</summary>

- :warning: removed enum `product-price` from type `ChangeSubscriptionResourceTypeId`
</details>


<details>
<summary>Added Type(s)</summary>

- added type `BusinessUnitApprovalRuleMode`
- added type `BusinessUnitChangeApprovalRuleModeAction`
- added type `CartChangeLineItemsOrderAction`
- added type `CustomerIndexingProgress`
- added type `CustomerIndexingStatus`
- added type `CustomerPagedSearchResponse`
- added type `CustomerSearchIndexingStatusResponse`
- added type `CustomerSearchRequest`
- added type `CustomerSearchResult`
- added type `MyCartChangeLineItemsOrderAction`
- added type `BusinessUnitApprovalRuleModeChangedMessage`
- added type `ProductPriceCustomFieldAddedMessage`
- added type `ProductPriceCustomFieldChangedMessage`
- added type `ProductPriceCustomFieldRemovedMessage`
- added type `ProductPriceCustomFieldsRemovedMessage`
- added type `ProductPriceCustomFieldsSetMessage`
- added type `ProductTailoringImageAddedMessage`
- added type `ProductTailoringImagesSetMessage`
- added type `ProductVariantTailoringAddedMessage`
- added type `ProductVariantTailoringRemovedMessage`
- added type `BusinessUnitApprovalRuleModeChangedMessagePayload`
- added type `ProductPriceCustomFieldAddedMessagePayload`
- added type `ProductPriceCustomFieldChangedMessagePayload`
- added type `ProductPriceCustomFieldRemovedMessagePayload`
- added type `ProductPriceCustomFieldsRemovedMessagePayload`
- added type `ProductPriceCustomFieldsSetMessagePayload`
- added type `ProductTailoringImageAddedMessagePayload`
- added type `ProductTailoringImagesSetMessagePayload`
- added type `ProductVariantTailoringAddedMessagePayload`
- added type `ProductVariantTailoringRemovedMessagePayload`
- added type `OrderSearchCustomType`
- added type `ProductVariantTailoring`
- added type `ProductVariantTailoringDraft`
- added type `ProductTailoringAddAssetAction`
- added type `ProductTailoringAddExternalImageAction`
- added type `ProductTailoringAddVariantAction`
- added type `ProductTailoringChangeAssetNameAction`
- added type `ProductTailoringChangeAssetOrderAction`
- added type `ProductTailoringMoveImageToPositionAction`
- added type `ProductTailoringRemoveAssetAction`
- added type `ProductTailoringRemoveImageAction`
- added type `ProductTailoringRemoveVariantAction`
- added type `ProductTailoringSetAssetCustomFieldAction`
- added type `ProductTailoringSetAssetCustomTypeAction`
- added type `ProductTailoringSetAssetDescriptionAction`
- added type `ProductTailoringSetAssetKeyAction`
- added type `ProductTailoringSetAssetSourcesAction`
- added type `ProductTailoringSetAssetTagsAction`
- added type `ProductTailoringSetExternalImagesAction`
- added type `ProductTailoringSetImageLabelAction`
- added type `CustomerSearchStatus`
- added type `ProjectChangeCustomerSearchStatusAction`
- added type `ShippingMethodChangeActiveAction`
</details>

**Import changes**

<details>
<summary>Added Enum(s)</summary>

- added enum `customer-group` to type `CustomFieldReferenceValue`
</details>


<details>
<summary>Deprecated Property(s)</summary>

- property `PriceImport::publish` is removed
- property `ProductVariantImport::publish` is removed
</details>


## What's Changed
* Update changelog by @ct-sdks in https://github.com/commercetools/commercetools-sdk-java-v2/pull/663
* Update generated SDKs by @ct-sdks in https://github.com/commercetools/commercetools-sdk-java-v2/pull/664
* Update generated SDKs by @ct-sdks in https://github.com/commercetools/commercetools-sdk-java-v2/pull/667
* Update generated SDKs by @ct-sdks in https://github.com/commercetools/commercetools-sdk-java-v2/pull/668
* Update generated SDKs by @ct-sdks in https://github.com/commercetools/commercetools-sdk-java-v2/pull/669
* Update generated SDKs by @ct-sdks in https://github.com/commercetools/commercetools-sdk-java-v2/pull/670
* Update generated SDKs by @ct-sdks in https://github.com/commercetools/commercetools-sdk-java-v2/pull/671
* Update generated SDKs by @ct-sdks in https://github.com/commercetools/commercetools-sdk-java-v2/pull/672
* Update generated SDKs by @ct-sdks in https://github.com/commercetools/commercetools-sdk-java-v2/pull/673
* Update generated SDKs by @ct-sdks in https://github.com/commercetools/commercetools-sdk-java-v2/pull/674
* Update generated SDKs by @ct-sdks in https://github.com/commercetools/commercetools-sdk-java-v2/pull/675
* Update generated SDKs by @ct-sdks in https://github.com/commercetools/commercetools-sdk-java-v2/pull/678
* Update generated SDKs by @ct-sdks in https://github.com/commercetools/commercetools-sdk-java-v2/pull/679
* Update generated SDKs by @ct-sdks in https://github.com/commercetools/commercetools-sdk-java-v2/pull/680
* Update generated SDKs by @ct-sdks in https://github.com/commercetools/commercetools-sdk-java-v2/pull/681
* Update generated SDKs by @ct-sdks in https://github.com/commercetools/commercetools-sdk-java-v2/pull/682
* Update generated SDKs by @ct-sdks in https://github.com/commercetools/commercetools-sdk-java-v2/pull/683
* Update generated SDKs by @ct-sdks in https://github.com/commercetools/commercetools-sdk-java-v2/pull/684
* Update generated SDKs by @ct-sdks in https://github.com/commercetools/commercetools-sdk-java-v2/pull/685
* Update generated SDKs by @ct-sdks in https://github.com/commercetools/commercetools-sdk-java-v2/pull/686
* Update generated SDKs by @ct-sdks in https://github.com/commercetools/commercetools-sdk-java-v2/pull/687
* Update generated SDKs by @ct-sdks in https://github.com/commercetools/commercetools-sdk-java-v2/pull/688
* Update generated SDKs by @ct-sdks in https://github.com/commercetools/commercetools-sdk-java-v2/pull/689
* Update generated SDKs by @ct-sdks in https://github.com/commercetools/commercetools-sdk-java-v2/pull/690
* Update generated SDKs by @ct-sdks in https://github.com/commercetools/commercetools-sdk-java-v2/pull/691
* Update generated SDKs by @ct-sdks in https://github.com/commercetools/commercetools-sdk-java-v2/pull/692
* Update generated SDKs by @ct-sdks in https://github.com/commercetools/commercetools-sdk-java-v2/pull/693
* Update generated SDKs by @ct-sdks in https://github.com/commercetools/commercetools-sdk-java-v2/pull/694
* Update generated SDKs by @ct-sdks in https://github.com/commercetools/commercetools-sdk-java-v2/pull/695
* Update generated SDKs by @ct-sdks in https://github.com/commercetools/commercetools-sdk-java-v2/pull/696
* Update generated SDKs by @ct-sdks in https://github.com/commercetools/commercetools-sdk-java-v2/pull/697
* Update generated SDKs by @ct-sdks in https://github.com/commercetools/commercetools-sdk-java-v2/pull/698
* Update generated SDKs by @ct-sdks in https://github.com/commercetools/commercetools-sdk-java-v2/pull/699
* Update generated SDKs by @ct-sdks in https://github.com/commercetools/commercetools-sdk-java-v2/pull/700
* Update generated SDKs by @ct-sdks in https://github.com/commercetools/commercetools-sdk-java-v2/pull/701


**Full Changelog**: https://github.com/commercetools/commercetools-sdk-java-v2/compare/17.12.0...17.13.0

# 17.12.0 (2024-06-07)

## Important information

This major release branch will be the last compatible with JDK version 8. The major release will have JDK version 11 as minimum requirement. The references to Java EE like bean validation will be updated to Jakarta EE. This will remove incompatibilities with newer frameworks and opens upgrade pathes.

## What's Changed
* Update datadog example app to include traces and add to cart by @lojzatran in https://github.com/commercetools/commercetools-sdk-java-v2/pull/617
* Update changelog by @ct-sdks in https://github.com/commercetools/commercetools-sdk-java-v2/pull/634
* Update generated SDKs by @ct-sdks in https://github.com/commercetools/commercetools-sdk-java-v2/pull/635
* Update generated SDKs by @ct-sdks in https://github.com/commercetools/commercetools-sdk-java-v2/pull/638
* Update generated SDKs by @ct-sdks in https://github.com/commercetools/commercetools-sdk-java-v2/pull/639
* Update generated SDKs by @ct-sdks in https://github.com/commercetools/commercetools-sdk-java-v2/pull/640
* Update generated SDKs by @ct-sdks in https://github.com/commercetools/commercetools-sdk-java-v2/pull/643
* Update generated SDKs by @ct-sdks in https://github.com/commercetools/commercetools-sdk-java-v2/pull/644
* Update generated SDKs by @ct-sdks in https://github.com/commercetools/commercetools-sdk-java-v2/pull/645
* Update generated SDKs by @ct-sdks in https://github.com/commercetools/commercetools-sdk-java-v2/pull/646
* Update generated SDKs by @ct-sdks in https://github.com/commercetools/commercetools-sdk-java-v2/pull/647
* Update generated SDKs by @ct-sdks in https://github.com/commercetools/commercetools-sdk-java-v2/pull/648
* Update generated SDKs by @ct-sdks in https://github.com/commercetools/commercetools-sdk-java-v2/pull/650
* Update generated SDKs by @ct-sdks in https://github.com/commercetools/commercetools-sdk-java-v2/pull/651
* Update generated SDKs by @ct-sdks in https://github.com/commercetools/commercetools-sdk-java-v2/pull/652
* Update generated SDKs by @ct-sdks in https://github.com/commercetools/commercetools-sdk-java-v2/pull/653
* Update generated SDKs by @ct-sdks in https://github.com/commercetools/commercetools-sdk-java-v2/pull/654
* Update generated SDKs by @ct-sdks in https://github.com/commercetools/commercetools-sdk-java-v2/pull/655
* Update generated SDKs by @ct-sdks in https://github.com/commercetools/commercetools-sdk-java-v2/pull/656
* Update generated SDKs by @ct-sdks in https://github.com/commercetools/commercetools-sdk-java-v2/pull/657
* Update generated SDKs by @ct-sdks in https://github.com/commercetools/commercetools-sdk-java-v2/pull/658
* Update generated SDKs by @ct-sdks in https://github.com/commercetools/commercetools-sdk-java-v2/pull/660
* Update generated SDKs by @ct-sdks in https://github.com/commercetools/commercetools-sdk-java-v2/pull/661
* update SLF4J to 2.0 by @jenschude in https://github.com/commercetools/commercetools-sdk-java-v2/pull/662
* chore(deps): update github/codeql-action digest to 2e230e8 by @renovate in https://github.com/commercetools/commercetools-sdk-java-v2/pull/641
* chore(deps): update all dependencies by @renovate in https://github.com/commercetools/commercetools-sdk-java-v2/pull/637
* chore(deps): update actions/checkout digest to a5ac7e5 by @renovate in https://github.com/commercetools/commercetools-sdk-java-v2/pull/636
* chore(deps): update actions/setup-java digest to 99b8673 by @renovate in https://github.com/commercetools/commercetools-sdk-java-v2/pull/612
* chore(deps): lock file maintenance by @renovate in https://github.com/commercetools/commercetools-sdk-java-v2/pull/642
* chore(deps): update plugin org.jetbrains.kotlin.jvm to v2 by @renovate in https://github.com/commercetools/commercetools-sdk-java-v2/pull/649

**Full Changelog**: https://github.com/commercetools/commercetools-sdk-java-v2/compare/17.11.0...17.12.0

# 17.11.0 (2024-05-03)

## What's Changed
* Update changelog by @ct-sdks in https://github.com/commercetools/commercetools-sdk-java-v2/pull/626
* Update generated SDKs by @ct-sdks in https://github.com/commercetools/commercetools-sdk-java-v2/pull/627
* [DEVX-344] add missing service regions by @jenschude in https://github.com/commercetools/commercetools-sdk-java-v2/pull/628
* Update generated SDKs by @ct-sdks in https://github.com/commercetools/commercetools-sdk-java-v2/pull/629
* Update generated SDKs by @ct-sdks in https://github.com/commercetools/commercetools-sdk-java-v2/pull/631
* update bootstrap, jquery, jquery-validation by @jenschude in https://github.com/commercetools/commercetools-sdk-java-v2/pull/632
* chore(deps): update all dependencies by @renovate in https://github.com/commercetools/commercetools-sdk-java-v2/pull/618
* use codecov GH action by @jenschude in https://github.com/commercetools/commercetools-sdk-java-v2/pull/633
* chore(deps): update actions/create-github-app-token digest to a0de6af by @renovate in https://github.com/commercetools/commercetools-sdk-java-v2/pull/611
* chore(deps): update gradle/wrapper-validation-action action to v3 by @renovate in https://github.com/commercetools/commercetools-sdk-java-v2/pull/619
* chore(deps): update github/codeql-action digest to d39d31e by @renovate in https://github.com/commercetools/commercetools-sdk-java-v2/pull/613
* Newrelic add metrics by @lojzatran in https://github.com/commercetools/commercetools-sdk-java-v2/pull/630
* fix(deps): update dependency husky to v9 by @renovate in https://github.com/commercetools/commercetools-sdk-java-v2/pull/621


**Full Changelog**: https://github.com/commercetools/commercetools-sdk-java-v2/compare/17.10.0...17.11.0

# 17.10.0 (2024-04-18)

## What's Changed
* Update changelog by @ct-sdks in https://github.com/commercetools/commercetools-sdk-java-v2/pull/616
* deserialize product search facets by @jenschude in https://github.com/commercetools/commercetools-sdk-java-v2/pull/624
* Update generated SDKs by @ct-sdks in https://github.com/commercetools/commercetools-sdk-java-v2/pull/610
* Update generated SDKs by @ct-sdks in https://github.com/commercetools/commercetools-sdk-java-v2/pull/625

**Api changes**

<details>
<summary>Changed Property(s)</summary>

- :warning: changed property `custom` of type `MyBusinessUnitDraft` from type `CustomFields` to `CustomFieldsDraft`
- :warning: changed property `custom` of type `MyCompanyDraft` from type `CustomFields` to `CustomFieldsDraft`
- :warning: changed property `custom` of type `MyDivisionDraft` from type `CustomFields` to `CustomFieldsDraft`
</details>


<details>
<summary>Added Property(s)</summary>

- added property `attributedTo` to type `CreatedBy`
- added property `attributedTo` to type `LastModifiedBy`
- added property `postFilter` to type `ProductSearchRequest`
</details>


<details>
<summary>Required Property(s)</summary>

- :warning: changed property `stores` of type `BusinessUnit` to be required
- :warning: changed property `stores` of type `Company` to be required
- :warning: changed property `stores` of type `Division` to be required
- :warning: changed property `stores` of type `BusinessUnitSetStoresAction` to be required
- :warning: changed property `stores` of type `CartDiscountSetStoresAction` to be required
- :warning: changed property `stores` of type `Customer` to be required
- :warning: changed property `stores` of type `CustomerSetStoresAction` to be required
</details>


<details>
<summary>Added Type(s)</summary>

- added type `Attribution`
- added type `AttributionSource`
</details>


<details>
<summary>Removed Method(s)</summary>

- :warning: removed method `apiRoot.withProjectKey().products().search().head()`
</details>

**Import changes**

<details>
<summary>Added Resource(s)</summary>

- added resource `/{projectKey}/discount-codes`
- added resource `/{projectKey}/discount-codes/import-containers`
- added resource `/{projectKey}/discount-codes/import-containers/{importContainerKey}`
</details>


<details>
<summary>Added Method(s)</summary>

- added method `apiRoot.withProjectKeyValue().discountCodes().importContainers().withImportContainerKeyValue().post()`
</details>


<details>
<summary>Added Type(s)</summary>

- added type `DiscountCodeImportRequest`
- added type `DiscountCodeImport`
</details>


<details>
<summary>Added Enum(s)</summary>

- added enum `discount-code` to type `ImportResourceType`
</details>


**Full Changelog**: https://github.com/commercetools/commercetools-sdk-java-v2/compare/17.9.0...17.10.0

# 17.9.0 (2024-04-08)

## What's Changed
* Update changelog by @ct-sdks in https://github.com/commercetools/commercetools-sdk-java-v2/pull/609
* Make javadoc consistent across monitoring middlewares by @lojzatran in https://github.com/commercetools/commercetools-sdk-java-v2/pull/615
* Add dogstatsd support by @lojzatran in https://github.com/commercetools/commercetools-sdk-java-v2/pull/599


**Full Changelog**: https://github.com/commercetools/commercetools-sdk-java-v2/compare/17.8.0...17.9.0

# 17.8.0 (2024-04-01)

## What's Changed
* Update changelog by @ct-sdks in https://github.com/commercetools/commercetools-sdk-java-v2/pull/592
* Update generated SDKs by @ct-sdks in https://github.com/commercetools/commercetools-sdk-java-v2/pull/593
* Update generated SDKs by @ct-sdks in https://github.com/commercetools/commercetools-sdk-java-v2/pull/594
* Update generated SDKs by @ct-sdks in https://github.com/commercetools/commercetools-sdk-java-v2/pull/597
* Update generated SDKs by @ct-sdks in https://github.com/commercetools/commercetools-sdk-java-v2/pull/598
* Update generated SDKs by @ct-sdks in https://github.com/commercetools/commercetools-sdk-java-v2/pull/600
* Update generated SDKs by @ct-sdks in https://github.com/commercetools/commercetools-sdk-java-v2/pull/602
* Update generated SDKs by @ct-sdks in https://github.com/commercetools/commercetools-sdk-java-v2/pull/603
* Replace deprecated retry middleware with policy middleware in docs by @lojzatran in https://github.com/commercetools/commercetools-sdk-java-v2/pull/601
* Add integration test to get a valid oauth token by @lojzatran in https://github.com/commercetools/commercetools-sdk-java-v2/pull/596
* Update generated SDKs by @ct-sdks in https://github.com/commercetools/commercetools-sdk-java-v2/pull/605
* Update generated SDKs by @ct-sdks in https://github.com/commercetools/commercetools-sdk-java-v2/pull/607
* Update generated SDKs by @ct-sdks in https://github.com/commercetools/commercetools-sdk-java-v2/pull/608
* chore(deps): update gradle/actions digest to 417ae3c by @renovate in https://github.com/commercetools/commercetools-sdk-java-v2/pull/582
* chore(deps): update yarn to v4 by @renovate in https://github.com/commercetools/commercetools-sdk-java-v2/pull/510
* fix(deps): update dependency org.jdrupes.taglets:plantuml-taglet to v3 by @renovate in https://github.com/commercetools/commercetools-sdk-java-v2/pull/497
* chore(deps): update all dependencies by @renovate in https://github.com/commercetools/commercetools-sdk-java-v2/pull/575
* chore(deps): update actions/create-github-app-token digest to 78e5f2d by @renovate in https://github.com/commercetools/commercetools-sdk-java-v2/pull/574
* chore(deps): update github/codeql-action digest to 1b1aada by @renovate in https://github.com/commercetools/commercetools-sdk-java-v2/pull/581
* chore(deps): update ts-graphviz/setup-graphviz action to v2 by @renovate in https://github.com/commercetools/commercetools-sdk-java-v2/pull/576
* fix(deps): update dependency com.squareup.okio:okio to v3 by @renovate in https://github.com/commercetools/commercetools-sdk-java-v2/pull/590


**Full Changelog**: https://github.com/commercetools/commercetools-sdk-java-v2/compare/17.7.0...17.8.0

# 17.7.0 (2024-02-29)

## What's Changed
* Update CODEOWNERS by @evansinho in https://github.com/commercetools/commercetools-sdk-java-v2/pull/577
* Update generated SDKs by @ct-sdks in https://github.com/commercetools/commercetools-sdk-java-v2/pull/579
* chore(deps): pin dependencies by @renovate in https://github.com/commercetools/commercetools-sdk-java-v2/pull/573
* Add how to use datadog module example by @lojzatran in https://github.com/commercetools/commercetools-sdk-java-v2/pull/578
* Update generated SDKs by @ct-sdks in https://github.com/commercetools/commercetools-sdk-java-v2/pull/580
* Update generated SDKs by @ct-sdks in https://github.com/commercetools/commercetools-sdk-java-v2/pull/584
* Update generated SDKs by @ct-sdks in https://github.com/commercetools/commercetools-sdk-java-v2/pull/585
* Update generated SDKs by @ct-sdks in https://github.com/commercetools/commercetools-sdk-java-v2/pull/586
* Update generated SDKs by @ct-sdks in https://github.com/commercetools/commercetools-sdk-java-v2/pull/587
* Update generated SDKs by @ct-sdks in https://github.com/commercetools/commercetools-sdk-java-v2/pull/588
* Update generated SDKs by @ct-sdks in https://github.com/commercetools/commercetools-sdk-java-v2/pull/591
* Highlight tests in the docs by @lojzatran in https://github.com/commercetools/commercetools-sdk-java-v2/pull/583

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

## New Contributors
* @evansinho made their first contribution in https://github.com/commercetools/commercetools-sdk-java-v2/pull/577

**Full Changelog**: https://github.com/commercetools/commercetools-sdk-java-v2/compare/17.6.0...17.7.0

# 17.6.0 (2024-02-12)

## What's Changed
* Search builder by @jenschude in https://github.com/commercetools/commercetools-sdk-java-v2/pull/542
* Remove the incorrect lines by @johthor in https://github.com/commercetools/commercetools-sdk-java-v2/pull/558
* Update generated SDKs by @ct-sdks in https://github.com/commercetools/commercetools-sdk-java-v2/pull/557
* Update generated SDKs by @ct-sdks in https://github.com/commercetools/commercetools-sdk-java-v2/pull/561
* Update generated SDKs by @ct-sdks in https://github.com/commercetools/commercetools-sdk-java-v2/pull/562
* Update generated SDKs by @ct-sdks in https://github.com/commercetools/commercetools-sdk-java-v2/pull/563
* Update generated SDKs by @ct-sdks in https://github.com/commercetools/commercetools-sdk-java-v2/pull/564
* chore(deps): update all dependencies by @renovate in https://github.com/commercetools/commercetools-sdk-java-v2/pull/549
* chore(deps): update stefanzweifel/git-auto-commit-action digest to 12f6863 by @renovate in https://github.com/commercetools/commercetools-sdk-java-v2/pull/532
* update mockito by @jenschude in https://github.com/commercetools/commercetools-sdk-java-v2/pull/565
* chore(deps): pin dependencies by @renovate in https://github.com/commercetools/commercetools-sdk-java-v2/pull/566
* chore(deps): update all dependencies by @renovate in https://github.com/commercetools/commercetools-sdk-java-v2/pull/567
* Update generated SDKs by @ct-sdks in https://github.com/commercetools/commercetools-sdk-java-v2/pull/570
* Update generated SDKs by @ct-sdks in https://github.com/commercetools/commercetools-sdk-java-v2/pull/571
* update dependencies by @jenschude in https://github.com/commercetools/commercetools-sdk-java-v2/pull/572
* Add datadog monitoring module by @lojzatran in https://github.com/commercetools/commercetools-sdk-java-v2/pull/568

## New Contributors
* @johthor made their first contribution in https://github.com/commercetools/commercetools-sdk-java-v2/pull/558

**Full Changelog**: https://github.com/commercetools/commercetools-sdk-java-v2/compare/17.5.0...17.6.0

# 17.5.0 (2024-01-22)

## What's Changed
* add option to customise log formats by @jenschude in https://github.com/commercetools/commercetools-sdk-java-v2/pull/548
* Update generated SDKs by @ct-sdks in https://github.com/commercetools/commercetools-sdk-java-v2/pull/547
* fix RetryHandler class cast exception by @jenschude in https://github.com/commercetools/commercetools-sdk-java-v2/pull/556

**Api changes**

<details>
<summary>Added Type(s)</summary>

- added type `CartDiscountCreatedMessage`
- added type `CartDiscountDeletedMessage`
- added type `CartDiscountStoreAddedMessage`
- added type `CartDiscountStoreRemovedMessage`
- added type `CartDiscountStoresSetMessage`
- added type `CartDiscountCreatedMessagePayload`
- added type `CartDiscountDeletedMessagePayload`
- added type `CartDiscountStoreAddedMessagePayload`
- added type `CartDiscountStoreRemovedMessagePayload`
- added type `CartDiscountStoresSetMessagePayload`
</details>


**Full Changelog**: https://github.com/commercetools/commercetools-sdk-java-v2/compare/17.4.0...17.5.0

# 17.5.0-alpha.1 (2024-01-12)

## What's Changed

**Full Changelog**: https://github.com/commercetools/commercetools-sdk-java-v2/compare/17.4.0...17.5.0-alpha.1

# 17.4.0 (2024-01-11)

## What's Changed
* add PolicyMiddleware by @jenschude in https://github.com/commercetools/commercetools-sdk-java-v2/pull/521
* add predicate builder for custom fields by @jenschude in https://github.com/commercetools/commercetools-sdk-java-v2/pull/543
* Oneagent dynatrace by @lojzatran in https://github.com/commercetools/commercetools-sdk-java-v2/pull/529
* Update generated SDKs by @github-actions in https://github.com/commercetools/commercetools-sdk-java-v2/pull/520
* Update generated SDKs by @github-actions in https://github.com/commercetools/commercetools-sdk-java-v2/pull/525
* Update generated SDKs by @ct-sdks in https://github.com/commercetools/commercetools-sdk-java-v2/pull/534
* Update generated SDKs by @ct-sdks in https://github.com/commercetools/commercetools-sdk-java-v2/pull/544
* chore(deps): update all dependencies by @renovate in https://github.com/commercetools/commercetools-sdk-java-v2/pull/489
* fix(deps): update all dependencies by @renovate in https://github.com/commercetools/commercetools-sdk-java-v2/pull/526
* Add example for opentelemetry export to dynatrace by @lojzatran in https://github.com/commercetools/commercetools-sdk-java-v2/pull/524
* Add an example test for static auth token by @lojzatran in https://github.com/commercetools/commercetools-sdk-java-v2/pull/536
* fix deserialization of head API requests by @jenschude in https://github.com/commercetools/commercetools-sdk-java-v2/pull/538
* fix renovate builds by @jenschude in https://github.com/commercetools/commercetools-sdk-java-v2/pull/541
* remove ML module by @jenschude in https://github.com/commercetools/commercetools-sdk-java-v2/pull/539
* remove ML package code by @jenschude in https://github.com/commercetools/commercetools-sdk-java-v2/pull/540

**Api changes**

<details>
<summary>Added Type(s)</summary>

- added type `ApprovalFlowSetCustomFieldAction`
- added type `ApprovalFlowSetCustomTypeAction`
</details>


<details>
<summary>Removed Type(s)</summary>

- :warning: removed type `NotEnabledError`
- :warning: removed type `GraphQLNotEnabledError`
</details>


<details>
<summary>Added Property(s)</summary>

- added property `custom` to type `ApprovalFlow`
</details>


<details>
<summary>Added Enum(s)</summary>

- added enum `associate-role` to type `AttributeReferenceTypeId`
- added enum `business-unit` to type `AttributeReferenceTypeId`
- added enum `cart-discount` to type `AttributeReferenceTypeId`
- added enum `approval-flow` to type `CustomFieldReferenceValue`
- added enum `approval-flow` to type `ResourceTypeId`
</details>

**History changes**

<details>
<summary>Added Type(s)</summary>

- added type `AttributeLocalizedEnumValue`
- added type `AttributePlainEnumValue`
- added type `ChannelRoleEnum`
- added type `StateRoleEnum`
- added type `StateTypeEnum`
</details>


<details>
<summary>Removed Type(s)</summary>

- :warning: removed type `ChannelRole`
- :warning: removed type `StateRole`
- :warning: removed type `StateType`
</details>


<details>
<summary>Removed Property(s)</summary>

- :warning: removed property `previousValue` from type `AddAddressChange`
- :warning: removed property `previousValue` from type `AddLocationChange`
- :warning: removed property `nextValue` from type `RemoveLocationChange`
- :warning: removed property `nextValue` from type `RemoveTaxRateChange`
</details>


<details>
<summary>Changed Property(s)</summary>

- :warning: changed property `previousValue` of type `AddChannelRolesChange` from type `ChannelRole[]` to `ChannelRoleEnum[]`
- :warning: changed property `nextValue` of type `AddChannelRolesChange` from type `ChannelRole[]` to `ChannelRoleEnum[]`
- :warning: changed property `nextValue` of type `AddLocalizedEnumValueChange` from type `LocalizedEnumValue` to `AttributeLocalizedEnumValue`
- :warning: changed property `nextValue` of type `AddPlainEnumValueChange` from type `EnumValue` to `AttributePlainEnumValue`
- :warning: changed property `previousValue` of type `AddStateRolesChange` from type `StateRole[]` to `StateRoleEnum[]`
- :warning: changed property `nextValue` of type `AddStateRolesChange` from type `StateRole[]` to `StateRoleEnum[]`
- :warning: changed property `previousValue` of type `ChangeStateTypeChange` from type `StateType` to `StateTypeEnum`
- :warning: changed property `nextValue` of type `ChangeStateTypeChange` from type `StateType` to `StateTypeEnum`
- :warning: changed property `previousValue` of type `RemoveChannelRolesChange` from type `ChannelRole[]` to `ChannelRoleEnum[]`
- :warning: changed property `nextValue` of type `RemoveChannelRolesChange` from type `ChannelRole[]` to `ChannelRoleEnum[]`
- :warning: changed property `previousValue` of type `RemoveStateRolesChange` from type `StateRole[]` to `StateRoleEnum[]`
- :warning: changed property `nextValue` of type `RemoveStateRolesChange` from type `StateRole[]` to `StateRoleEnum[]`
- :warning: changed property `previousValue` of type `SetChannelRolesChange` from type `ChannelRole[]` to `ChannelRoleEnum[]`
- :warning: changed property `nextValue` of type `SetChannelRolesChange` from type `ChannelRole[]` to `ChannelRoleEnum[]`
- :warning: changed property `previousValue` of type `SetStateRolesChange` from type `StateRole[]` to `StateRoleEnum[]`
- :warning: changed property `nextValue` of type `SetStateRolesChange` from type `StateRole[]` to `StateRoleEnum[]`
</details>

## New Contributors
* @ct-sdks made their first contribution in https://github.com/commercetools/commercetools-sdk-java-v2/pull/534

**Full Changelog**: https://github.com/commercetools/commercetools-sdk-java-v2/compare/17.3.0...17.4.0

# 17.3.0 (2023-12-04)

## What's Changed
* Override toString method. by @salander85 in https://github.com/commercetools/commercetools-sdk-java-v2/pull/519
* Update generated SDKs by @github-actions in https://github.com/commercetools/commercetools-sdk-java-v2/pull/518
* Add option to turn off histogram in opentelemetry by @lojzatran in https://github.com/commercetools/commercetools-sdk-java-v2/pull/523


**Full Changelog**: https://github.com/commercetools/commercetools-sdk-java-v2/compare/17.2.0...17.3.0

# 17.2.0 (2023-11-08)

## What's Changed
* use a fixed version for the examples by @jenschude in https://github.com/commercetools/commercetools-sdk-java-v2/pull/513
* add option to deserialize attribute/custom field numbers as double by @jenschude in https://github.com/commercetools/commercetools-sdk-java-v2/pull/515
* deserialize message payload helper by @jenschude in https://github.com/commercetools/commercetools-sdk-java-v2/pull/517
* Update generated SDKs by @github-actions in https://github.com/commercetools/commercetools-sdk-java-v2/pull/514


**Full Changelog**: https://github.com/commercetools/commercetools-sdk-java-v2/compare/17.1.0...17.2.0

# 17.1.0 (2023-11-01)

## What's Changed
* Update generated SDKs by @github-actions in https://github.com/commercetools/commercetools-sdk-java-v2/pull/507
* add ToC taglet to overview page by @jenschude in https://github.com/commercetools/commercetools-sdk-java-v2/pull/512
* Update generated SDKs by @github-actions in https://github.com/commercetools/commercetools-sdk-java-v2/pull/511
* fix Issue in AsyncHttpClient module when uploading images

**Api changes**

<details>
<summary>Added QueryParameter(s)</summary>

- added query parameter `expand` to method `get /{projectKey}/in-store/key={storeKey}/cart-discounts`
- added query parameter `sort` to method `get /{projectKey}/in-store/key={storeKey}/cart-discounts`
- added query parameter `limit` to method `get /{projectKey}/in-store/key={storeKey}/cart-discounts`
- added query parameter `offset` to method `get /{projectKey}/in-store/key={storeKey}/cart-discounts`
- added query parameter `withTotal` to method `get /{projectKey}/in-store/key={storeKey}/cart-discounts`
- added query parameter `where` to method `get /{projectKey}/in-store/key={storeKey}/cart-discounts`
- added query parameter `/^var[.][a-zA-Z0-9]+$/` to method `get /{projectKey}/in-store/key={storeKey}/cart-discounts`
- added query parameter `expand` to method `post /{projectKey}/in-store/key={storeKey}/cart-discounts`
</details>


<details>
<summary>Added Enum(s)</summary>

- added enum `approval-flow` to type `ReferenceTypeId`
- added enum `approval-rule` to type `ReferenceTypeId`
- added enum `approval-flow` to type `ChangeSubscriptionResourceTypeId`
- added enum `approval-rule` to type `ChangeSubscriptionResourceTypeId`
- added enum `approval-flow` to type `MessageSubscriptionResourceTypeId`
- added enum `approval-rule` to type `MessageSubscriptionResourceTypeId`
</details>


<details>
<summary>Changed MethodResponseBody(s)</summary>

- :warning: changed response body for `200: application/json` of method `get /{projectKey}/in-store/key={storeKey}/cart-discounts` from type `CartDiscount` to `CartDiscountPagedQueryResponse`
</details>


<details>
<summary>Added Method(s)</summary>

- added method `apiRoot.withProjectKey().head()`
- added method `apiRoot.withProjectKey().associateRoles().head()`
- added method `apiRoot.withProjectKey().businessUnits().head()`
- added method `apiRoot.withProjectKey().categories().head()`
- added method `apiRoot.withProjectKey().carts().head()`
- added method `apiRoot.withProjectKey().cartDiscounts().head()`
- added method `apiRoot.withProjectKey().channels().head()`
- added method `apiRoot.withProjectKey().customers().head()`
- added method `apiRoot.withProjectKey().customerGroups().head()`
- added method `apiRoot.withProjectKey().customObjects().head()`
- added method `apiRoot.withProjectKey().discountCodes().head()`
- added method `apiRoot.withProjectKey().inventory().head()`
- added method `apiRoot.withProjectKey().messages().head()`
- added method `apiRoot.withProjectKey().orders().head()`
- added method `apiRoot.withProjectKey().payments().head()`
- added method `apiRoot.withProjectKey().productDiscounts().head()`
- added method `apiRoot.withProjectKey().productProjections().head()`
- added method `apiRoot.withProjectKey().productSelections().head()`
- added method `apiRoot.withProjectKey().quotes().head()`
- added method `apiRoot.withProjectKey().quoteRequests().head()`
- added method `apiRoot.withProjectKey().stagedQuotes().head()`
- added method `apiRoot.withProjectKey().reviews().head()`
- added method `apiRoot.withProjectKey().shippingMethods().head()`
- added method `apiRoot.withProjectKey().shoppingLists().head()`
- added method `apiRoot.withProjectKey().states().head()`
- added method `apiRoot.withProjectKey().subscriptions().head()`
- added method `apiRoot.withProjectKey().taxCategories().head()`
- added method `apiRoot.withProjectKey().types().head()`
- added method `apiRoot.withProjectKey().zones().head()`
- added method `apiRoot.withProjectKey().extensions().head()`
- added method `apiRoot.withProjectKey().apiClients().head()`
- added method `apiRoot.withProjectKey().stores().head()`
- added method `apiRoot.withProjectKey().standalonePrices().head()`
- added method `apiRoot.withProjectKey().attributeGroups().head()`
- added method `apiRoot.withProjectKey().asAssociate().withAssociateIdValue().businessUnits().head()`
- added method `apiRoot.withProjectKey().asAssociate().withAssociateIdValue().businessUnits().withKey().head()`
- added method `apiRoot.withProjectKey().asAssociate().withAssociateIdValue().businessUnits().withId().head()`
- added method `apiRoot.withProjectKey().asAssociate().withAssociateIdValue().inBusinessUnitKeyWithBusinessUnitKeyValue().carts().head()`
- added method `apiRoot.withProjectKey().asAssociate().withAssociateIdValue().inBusinessUnitKeyWithBusinessUnitKeyValue().orders().head()`
- added method `apiRoot.withProjectKey().asAssociate().withAssociateIdValue().inBusinessUnitKeyWithBusinessUnitKeyValue().quotes().head()`
- added method `apiRoot.withProjectKey().asAssociate().withAssociateIdValue().inBusinessUnitKeyWithBusinessUnitKeyValue().quoteRequests().head()`
- added method `apiRoot.withProjectKey().asAssociate().withAssociateIdValue().inBusinessUnitKeyWithBusinessUnitKeyValue().carts().withKey().head()`
- added method `apiRoot.withProjectKey().asAssociate().withAssociateIdValue().inBusinessUnitKeyWithBusinessUnitKeyValue().carts().withId().head()`
- added method `apiRoot.withProjectKey().asAssociate().withAssociateIdValue().inBusinessUnitKeyWithBusinessUnitKeyValue().orders().withOrderNumber().head()`
- added method `apiRoot.withProjectKey().asAssociate().withAssociateIdValue().inBusinessUnitKeyWithBusinessUnitKeyValue().orders().withId().head()`
- added method `apiRoot.withProjectKey().asAssociate().withAssociateIdValue().inBusinessUnitKeyWithBusinessUnitKeyValue().quotes().withKey().head()`
- added method `apiRoot.withProjectKey().asAssociate().withAssociateIdValue().inBusinessUnitKeyWithBusinessUnitKeyValue().quotes().withId().head()`
- added method `apiRoot.withProjectKey().asAssociate().withAssociateIdValue().inBusinessUnitKeyWithBusinessUnitKeyValue().quoteRequests().withKey().head()`
- added method `apiRoot.withProjectKey().asAssociate().withAssociateIdValue().inBusinessUnitKeyWithBusinessUnitKeyValue().quoteRequests().withId().head()`
- added method `apiRoot.withProjectKey().associateRoles().withKey().head()`
- added method `apiRoot.withProjectKey().associateRoles().withId().head()`
- added method `apiRoot.withProjectKey().businessUnits().withKey().head()`
- added method `apiRoot.withProjectKey().businessUnits().withId().head()`
- added method `apiRoot.withProjectKey().categories().withKey().head()`
- added method `apiRoot.withProjectKey().categories().withId().head()`
- added method `apiRoot.withProjectKey().carts().withCustomerId().head()`
- added method `apiRoot.withProjectKey().carts().withKey().head()`
- added method `apiRoot.withProjectKey().carts().withId().head()`
- added method `apiRoot.withProjectKey().cartDiscounts().withKey().head()`
- added method `apiRoot.withProjectKey().cartDiscounts().withId().head()`
- added method `apiRoot.withProjectKey().channels().withId().head()`
- added method `apiRoot.withProjectKey().customers().withKey().head()`
- added method `apiRoot.withProjectKey().customers().withId().head()`
- added method `apiRoot.withProjectKey().customerGroups().withKey().head()`
- added method `apiRoot.withProjectKey().customerGroups().withId().head()`
- added method `apiRoot.withProjectKey().discountCodes().withId().head()`
- added method `apiRoot.withProjectKey().inventory().withId().head()`
- added method `apiRoot.withProjectKey().inventory().withKey().head()`
- added method `apiRoot.withProjectKey().messages().withId().head()`
- added method `apiRoot.withProjectKey().orders().withOrderNumber().head()`
- added method `apiRoot.withProjectKey().orders().edits().head()`
- added method `apiRoot.withProjectKey().orders().withId().head()`
- added method `apiRoot.withProjectKey().orders().edits().withKey().head()`
- added method `apiRoot.withProjectKey().orders().edits().withId().head()`
- added method `apiRoot.withProjectKey().payments().withKey().head()`
- added method `apiRoot.withProjectKey().payments().withId().head()`
- added method `apiRoot.withProjectKey().productDiscounts().withKey().head()`
- added method `apiRoot.withProjectKey().productDiscounts().withId().head()`
- added method `apiRoot.withProjectKey().productProjections().withKey().head()`
- added method `apiRoot.withProjectKey().productProjections().withId().head()`
- added method `apiRoot.withProjectKey().productSelections().withKey().head()`
- added method `apiRoot.withProjectKey().productSelections().withId().head()`
- added method `apiRoot.withProjectKey().quotes().withKey().head()`
- added method `apiRoot.withProjectKey().quotes().withId().head()`
- added method `apiRoot.withProjectKey().quoteRequests().withKey().head()`
- added method `apiRoot.withProjectKey().quoteRequests().withId().head()`
- added method `apiRoot.withProjectKey().stagedQuotes().withKey().head()`
- added method `apiRoot.withProjectKey().stagedQuotes().withId().head()`
- added method `apiRoot.withProjectKey().reviews().withKey().head()`
- added method `apiRoot.withProjectKey().reviews().withId().head()`
- added method `apiRoot.withProjectKey().shippingMethods().withKey().head()`
- added method `apiRoot.withProjectKey().shippingMethods().matchingCart().head()`
- added method `apiRoot.withProjectKey().shippingMethods().matchingCartLocation().head()`
- added method `apiRoot.withProjectKey().shippingMethods().matchingOrderedit().head()`
- added method `apiRoot.withProjectKey().shippingMethods().matchingLocation().head()`
- added method `apiRoot.withProjectKey().shippingMethods().withId().head()`
- added method `apiRoot.withProjectKey().shoppingLists().withKey().head()`
- added method `apiRoot.withProjectKey().shoppingLists().withId().head()`
- added method `apiRoot.withProjectKey().states().withKey().head()`
- added method `apiRoot.withProjectKey().states().withId().head()`
- added method `apiRoot.withProjectKey().subscriptions().withKey().head()`
- added method `apiRoot.withProjectKey().subscriptions().withId().head()`
- added method `apiRoot.withProjectKey().taxCategories().withKey().head()`
- added method `apiRoot.withProjectKey().taxCategories().withId().head()`
- added method `apiRoot.withProjectKey().types().withKey().head()`
- added method `apiRoot.withProjectKey().types().withId().head()`
- added method `apiRoot.withProjectKey().zones().withKey().head()`
- added method `apiRoot.withProjectKey().zones().withId().head()`
- added method `apiRoot.withProjectKey().me().activeCart().head()`
- added method `apiRoot.withProjectKey().me().businessUnits().head()`
- added method `apiRoot.withProjectKey().me().carts().head()`
- added method `apiRoot.withProjectKey().me().orders().head()`
- added method `apiRoot.withProjectKey().me().payments().head()`
- added method `apiRoot.withProjectKey().me().quoteRequests().head()`
- added method `apiRoot.withProjectKey().me().quotes().head()`
- added method `apiRoot.withProjectKey().me().shoppingLists().head()`
- added method `apiRoot.withProjectKey().me().businessUnits().withId().head()`
- added method `apiRoot.withProjectKey().me().businessUnits().withKey().head()`
- added method `apiRoot.withProjectKey().me().carts().withKey().head()`
- added method `apiRoot.withProjectKey().me().carts().withId().head()`
- added method `apiRoot.withProjectKey().me().orders().withId().head()`
- added method `apiRoot.withProjectKey().me().payments().withId().head()`
- added method `apiRoot.withProjectKey().me().quoteRequests().withId().head()`
- added method `apiRoot.withProjectKey().me().quoteRequests().withKey().head()`
- added method `apiRoot.withProjectKey().me().quotes().withId().head()`
- added method `apiRoot.withProjectKey().me().quotes().withKey().head()`
- added method `apiRoot.withProjectKey().me().shoppingLists().withId().head()`
- added method `apiRoot.withProjectKey().me().shoppingLists().withKey().head()`
- added method `apiRoot.withProjectKey().extensions().withKey().head()`
- added method `apiRoot.withProjectKey().extensions().withId().head()`
- added method `apiRoot.withProjectKey().apiClients().withId().head()`
- added method `apiRoot.withProjectKey().stores().withKey().head()`
- added method `apiRoot.withProjectKey().stores().withId().head()`
- added method `apiRoot.withProjectKey().inStoreKeyWithStoreKeyValue().carts().head()`
- added method `apiRoot.withProjectKey().inStoreKeyWithStoreKeyValue().orders().head()`
- added method `apiRoot.withProjectKey().inStoreKeyWithStoreKeyValue().customers().head()`
- added method `apiRoot.withProjectKey().inStoreKeyWithStoreKeyValue().shoppingLists().head()`
- added method `apiRoot.withProjectKey().inStoreKeyWithStoreKeyValue().cartDiscounts().head()`
- added method `apiRoot.withProjectKey().inStoreKeyWithStoreKeyValue().carts().withCustomerId().head()`
- added method `apiRoot.withProjectKey().inStoreKeyWithStoreKeyValue().carts().withKey().head()`
- added method `apiRoot.withProjectKey().inStoreKeyWithStoreKeyValue().carts().withId().head()`
- added method `apiRoot.withProjectKey().inStoreKeyWithStoreKeyValue().orders().withOrderNumber().head()`
- added method `apiRoot.withProjectKey().inStoreKeyWithStoreKeyValue().orders().withId().head()`
- added method `apiRoot.withProjectKey().inStoreKeyWithStoreKeyValue().me().carts().head()`
- added method `apiRoot.withProjectKey().inStoreKeyWithStoreKeyValue().me().orders().head()`
- added method `apiRoot.withProjectKey().inStoreKeyWithStoreKeyValue().me().activeCart().head()`
- added method `apiRoot.withProjectKey().inStoreKeyWithStoreKeyValue().me().shoppingLists().head()`
- added method `apiRoot.withProjectKey().inStoreKeyWithStoreKeyValue().me().carts().withId().head()`
- added method `apiRoot.withProjectKey().inStoreKeyWithStoreKeyValue().me().orders().withId().head()`
- added method `apiRoot.withProjectKey().inStoreKeyWithStoreKeyValue().me().shoppingLists().withKey().head()`
- added method `apiRoot.withProjectKey().inStoreKeyWithStoreKeyValue().me().shoppingLists().withId().head()`
- added method `apiRoot.withProjectKey().inStoreKeyWithStoreKeyValue().customers().withKey().head()`
- added method `apiRoot.withProjectKey().inStoreKeyWithStoreKeyValue().customers().withId().head()`
- added method `apiRoot.withProjectKey().inStoreKeyWithStoreKeyValue().shippingMethods().matchingCart().head()`
- added method `apiRoot.withProjectKey().inStoreKeyWithStoreKeyValue().shoppingLists().withKey().head()`
- added method `apiRoot.withProjectKey().inStoreKeyWithStoreKeyValue().shoppingLists().withId().head()`
- added method `apiRoot.withProjectKey().inStoreKeyWithStoreKeyValue().productProjections().withKey().head()`
- added method `apiRoot.withProjectKey().inStoreKeyWithStoreKeyValue().productProjections().withId().head()`
- added method `apiRoot.withProjectKey().inStoreKeyWithStoreKeyValue().cartDiscounts().withKey().head()`
- added method `apiRoot.withProjectKey().inStoreKeyWithStoreKeyValue().cartDiscounts().withId().head()`
- added method `apiRoot.withProjectKey().standalonePrices().withKey().head()`
- added method `apiRoot.withProjectKey().standalonePrices().withId().head()`
- added method `apiRoot.withProjectKey().attributeGroups().withKey().head()`
- added method `apiRoot.withProjectKey().attributeGroups().withId().head()`
</details>

**History changes**

<details>
<summary>Changed Property(s)</summary>

- :warning: changed property `previousValue` of type `SetNameChange` from type `LocalizedString` to `string`
- :warning: changed property `nextValue` of type `SetNameChange` from type `LocalizedString` to `string`
</details>


**Full Changelog**: https://github.com/commercetools/commercetools-sdk-java-v2/compare/17.0.0...17.1.0

# 17.0.1 (2023-11-01)

- fix duplicate content-type header in AHC client 01199ca9

**Full Changelog**: https://github.com/commercetools/commercetools-sdk-java-v2/compare/17.0.0...17.0.1

# 17.0.0 (2023-10-13)

## What's Changed
* Update generated SDKs by @github-actions in https://github.com/commercetools/commercetools-sdk-java-v2/pull/505
* remove deprecations by @jenschude in https://github.com/commercetools/commercetools-sdk-java-v2/pull/506
* refactor the tokenSupplier to be async by @jenschude in https://github.com/commercetools/commercetools-sdk-java-v2/pull/456
* module `commercetools-http-client` is now an alias to `commercetools-async-http-client`.

**Api changes**

<details>
<summary>Added Enum(s)</summary>

- added enum `customer-email-token` to type `ReferenceTypeId`
- added enum `customer-password-token` to type `ReferenceTypeId`
- added enum `customer-email-token` to type `MessageSubscriptionResourceTypeId`
- added enum `customer-group` to type `MessageSubscriptionResourceTypeId`
- added enum `customer-password-token` to type `MessageSubscriptionResourceTypeId`
</details>


<details>
<summary>Added Type(s)</summary>

- added type `CustomerEmailTokenReference`
- added type `CustomerPasswordTokenReference`
</details>

## Behavioral changes

### commercetools-http-client

The module `commercetools-http-client` is now an alias to `commercetools-async-http-client`.

This change should only affect you if you use this module and custom builder options or create an explicit instance.

For having previous behavior you can either pin the dependency to the version 16.5.0 or by replacing the dependency with `commercetools-okhttp-client4`.

### AuthToken supplier

The Auth token supplier and middlewares have been refactored to be asynchronous. It's not blocking anymore requests to wait till a token has been retrieved. This should prevent increased latency under high load scenarios and invalidated token.

This change should only affect you if you implemented a custom OAuthHandler and/or OAuthMiddleware.

### ApiMethod

We introduced a new subtype for ApiMethods which have a TypeReference to their result type. This simplifies the deserialization code in the client and allows future options like a reactive client implementation. As all request classes implement the ClientRequestCommand as well as the HttpRequestCommand this led to ambiguous methods in the client, so we decided to remove `execute(final ClientRequestCommand<O> method)` and replace it with `execute(final HttpRequestCommand<O> method)`.

This change should only affect you in case custom implementations are used. You may have to implement now the HttpRequestCommand interface or use the TypeApiMethod/TypeBodyApiMethod classes.

## BREAKING CHANGES

Removed deprecations:

- "rmf:okhttp-client: module
	- use `commercetools-okhttp-client4` module instead
- deprecated methods in CtAsyncHttpClient
- deprecated methods in RetryMiddleware
- ApiFactory
- ImportApiFactory
- MLApiRootFactory
- HistoryApiFactory
- ClientFactory
- MiddlewareFactory
- ExceptionFactory
- VrapJsonUtils
	- 	use JsonUtils instead

**Full Changelog**: https://github.com/commercetools/commercetools-sdk-java-v2/compare/16.5.0...17.0.0

# 16.5.0 (2023-10-12)

## What's Changed
* Update generated SDKs by @github-actions in https://github.com/commercetools/commercetools-sdk-java-v2/pull/503

- add resultType method to request classes in preparation for HttpRequestCommand interface

**Full Changelog**: https://github.com/commercetools/commercetools-sdk-java-v2/compare/16.4.0...16.5.0

# 16.4.0 (2023-10-10)

## What's Changed
* Update generated SDKs by @github-actions in https://github.com/commercetools/commercetools-sdk-java-v2/pull/496
* fix issue with dates exceeding year 9999 by @jenschude in https://github.com/commercetools/commercetools-sdk-java-v2/pull/499
* add mixin helper methods for customer by @jenschude in https://github.com/commercetools/commercetools-sdk-java-v2/pull/502
* Update generated SDKs by @github-actions in https://github.com/commercetools/commercetools-sdk-java-v2/pull/500

**Api changes**

<details>
<summary>Changed MethodResponseBody(s)</summary>

- :warning: changed response body for `200: application/json` of method `get /{projectKey}/as-associate/{associateId}/in-business-unit/key={businessUnitKey}/approval-rules` from type `<<resourceQueryType>>` to `ApprovalRulePagedQueryResponse`
- :warning: changed response body for `200: application/json` of method `get /{projectKey}/as-associate/{associateId}/in-business-unit/key={businessUnitKey}/approval-flows` from type `<<resourceQueryType>>` to `ApprovalFlowPagedQueryResponse`
</details>


<details>
<summary>Added Type(s)</summary>

- added type `ApprovalFlowPagedQueryResponse`
- added type `ApprovalRulePagedQueryResponse`
- added type `CustomerEmailTokenCreatedMessage`
- added type `CustomerPasswordTokenCreatedMessage`
- added type `CustomerEmailTokenCreatedMessagePayload`
- added type `CustomerPasswordTokenCreatedMessagePayload`
</details>

**Import changes**

<details>
<summary>Added Property(s)</summary>

- added property `product` to type `ProductVariantPatch`
</details>

**Full Changelog**: https://github.com/commercetools/commercetools-sdk-java-v2/compare/16.3.0...16.4.0

# 16.3.0 (2023-09-29)

## What's Changed
* Update all dependencies by @renovate in https://github.com/commercetools/commercetools-sdk-java-v2/pull/480
* fix predicate variable helper methods by @jenschude in https://github.com/commercetools/commercetools-sdk-java-v2/pull/486
* add new attribute accessor for type safety by @jenschude in https://github.com/commercetools/commercetools-sdk-java-v2/pull/487
* Update all dependencies by @renovate in https://github.com/commercetools/commercetools-sdk-java-v2/pull/484
* Update generated SDKs by @github-actions in https://github.com/commercetools/commercetools-sdk-java-v2/pull/481
* Update stefanzweifel/git-auto-commit-action digest to 3d1b5e0 by @renovate in https://github.com/commercetools/commercetools-sdk-java-v2/pull/470
* Update actions/checkout action to v4 by @renovate in https://github.com/commercetools/commercetools-sdk-java-v2/pull/485
* Update generated SDKs by @github-actions in https://github.com/commercetools/commercetools-sdk-java-v2/pull/488
* spring example with opentelemetry by @jenschude in https://github.com/commercetools/commercetools-sdk-java-v2/pull/492
* preparations for HttpRequestCommand by @jenschude in https://github.com/commercetools/commercetools-sdk-java-v2/pull/491
* add test for memory leaks by @jenschude in https://github.com/commercetools/commercetools-sdk-java-v2/pull/494
* Update generated SDKs by @github-actions in https://github.com/commercetools/commercetools-sdk-java-v2/pull/490
* Update generated SDKs by @github-actions in https://github.com/commercetools/commercetools-sdk-java-v2/pull/495

**Api changes**

<details>
<summary>Removed Type(s)</summary>

- :warning: removed type `CustomerMessagePayload`
</details>


<details>
<summary>Added Type(s)</summary>

- added type `ApprovalFlow`
- added type `ApprovalFlowApproval`
- added type `ApprovalFlowApproveAction`
- added type `ApprovalFlowRejectAction`
- added type `ApprovalFlowRejection`
- added type `ApprovalFlowStatus`
- added type `ApprovalFlowUpdate`
- added type `ApprovalFlowUpdateAction`
- added type `ApprovalRule`
- added type `ApprovalRuleDraft`
- added type `ApprovalRuleSetApproversAction`
- added type `ApprovalRuleSetDescriptionAction`
- added type `ApprovalRuleSetKeyAction`
- added type `ApprovalRuleSetNameAction`
- added type `ApprovalRuleSetPredicateAction`
- added type `ApprovalRuleSetRequestersAction`
- added type `ApprovalRuleSetStatusAction`
- added type `ApprovalRuleStatus`
- added type `ApprovalRuleUpdate`
- added type `ApprovalRuleUpdateAction`
- added type `ApproverConjunction`
- added type `ApproverConjunctionDraft`
- added type `ApproverDisjunction`
- added type `ApproverDisjunctionDraft`
- added type `ApproverHierarchy`
- added type `ApproverHierarchyDraft`
- added type `RuleApprover`
- added type `RuleApproverDraft`
- added type `RuleRequester`
- added type `RuleRequesterDraft`
- added type `CartDiscountTotalPriceTarget`
- added type `DiscountOnTotalPrice`
- added type `DiscountedTotalPricePortion`
- added type `ApprovalFlowApprovedMessage`
- added type `ApprovalFlowCompletedMessage`
- added type `ApprovalFlowCreatedMessage`
- added type `ApprovalFlowRejectedMessage`
- added type `ApprovalRuleApproversSetMessage`
- added type `ApprovalRuleCreatedMessage`
- added type `ApprovalRuleDescriptionSetMessage`
- added type `ApprovalRuleKeySetMessage`
- added type `ApprovalRuleNameSetMessage`
- added type `ApprovalRulePredicateSetMessage`
- added type `ApprovalRuleRequestersSetMessage`
- added type `ApprovalRuleStatusSetMessage`
- added type `BusinessUnitAddressCustomFieldAddedMessage`
- added type `BusinessUnitAddressCustomFieldChangedMessage`
- added type `BusinessUnitAddressCustomFieldRemovedMessage`
- added type `BusinessUnitAddressCustomTypeRemovedMessage`
- added type `BusinessUnitAddressCustomTypeSetMessage`
- added type `BusinessUnitCustomFieldAddedMessage`
- added type `BusinessUnitCustomFieldChangedMessage`
- added type `BusinessUnitCustomFieldRemovedMessage`
- added type `BusinessUnitCustomTypeRemovedMessage`
- added type `BusinessUnitCustomTypeSetMessage`
- added type `CustomerGroupCustomFieldAddedMessage`
- added type `CustomerGroupCustomFieldChangedMessage`
- added type `CustomerGroupCustomFieldRemovedMessage`
- added type `CustomerGroupCustomTypeRemovedMessage`
- added type `CustomerGroupCustomTypeSetMessage`
- added type `ApprovalFlowApprovedMessagePayload`
- added type `ApprovalFlowCompletedMessagePayload`
- added type `ApprovalFlowCreatedMessagePayload`
- added type `ApprovalFlowRejectedMessagePayload`
- added type `ApprovalRuleApproversSetMessagePayload`
- added type `ApprovalRuleCreatedMessagePayload`
- added type `ApprovalRuleDescriptionSetMessagePayload`
- added type `ApprovalRuleKeySetMessagePayload`
- added type `ApprovalRuleNameSetMessagePayload`
- added type `ApprovalRulePredicateSetMessagePayload`
- added type `ApprovalRuleRequestersSetMessagePayload`
- added type `ApprovalRuleStatusSetMessagePayload`
- added type `BusinessUnitAddressCustomFieldAddedMessagePayload`
- added type `BusinessUnitAddressCustomFieldChangedMessagePayload`
- added type `BusinessUnitAddressCustomFieldRemovedMessagePayload`
- added type `BusinessUnitAddressCustomTypeRemovedMessagePayload`
- added type `BusinessUnitAddressCustomTypeSetMessagePayload`
- added type `BusinessUnitCustomFieldAddedMessagePayload`
- added type `BusinessUnitCustomFieldChangedMessagePayload`
- added type `BusinessUnitCustomFieldRemovedMessagePayload`
- added type `BusinessUnitCustomTypeRemovedMessagePayload`
- added type `BusinessUnitCustomTypeSetMessagePayload`
- added type `CustomerGroupCustomFieldAddedMessagePayload`
- added type `CustomerGroupCustomFieldChangedMessagePayload`
- added type `CustomerGroupCustomFieldRemovedMessagePayload`
- added type `CustomerGroupCustomTypeRemovedMessagePayload`
- added type `CustomerGroupCustomTypeSetMessagePayload`
</details>


<details>
<summary>Added Enum(s)</summary>

- added enum `CreateApprovalRules` to type `Permission`
- added enum `UpdateApprovalRules` to type `Permission`
- added enum `UpdateApprovalFlows` to type `Permission`
</details>


<details>
<summary>Added Method(s)</summary>

- added method `apiRoot.withProjectKey().asAssociate().withAssociateIdValue().inBusinessUnitKeyWithBusinessUnitKeyValue().approvalRules().post()`
- added method `apiRoot.withProjectKey().asAssociate().withAssociateIdValue().inBusinessUnitKeyWithBusinessUnitKeyValue().approvalRules().get()`
- added method `apiRoot.withProjectKey().asAssociate().withAssociateIdValue().inBusinessUnitKeyWithBusinessUnitKeyValue().approvalFlows().get()`
- added method `apiRoot.withProjectKey().asAssociate().withAssociateIdValue().inBusinessUnitKeyWithBusinessUnitKeyValue().approvalRules().withId().get()`
- added method `apiRoot.withProjectKey().asAssociate().withAssociateIdValue().inBusinessUnitKeyWithBusinessUnitKeyValue().approvalRules().withId().post()`
- added method `apiRoot.withProjectKey().asAssociate().withAssociateIdValue().inBusinessUnitKeyWithBusinessUnitKeyValue().approvalRules().withKey().get()`
- added method `apiRoot.withProjectKey().asAssociate().withAssociateIdValue().inBusinessUnitKeyWithBusinessUnitKeyValue().approvalRules().withKey().post()`
- added method `apiRoot.withProjectKey().asAssociate().withAssociateIdValue().inBusinessUnitKeyWithBusinessUnitKeyValue().approvalFlows().withId().get()`
- added method `apiRoot.withProjectKey().asAssociate().withAssociateIdValue().inBusinessUnitKeyWithBusinessUnitKeyValue().approvalFlows().withId().post()`
</details>


<details>
<summary>Added Property(s)</summary>

- added property `discountOnTotalPrice` to type `Cart`
- added property `discountOnTotalPrice` to type `StagedOrder`
- added property `custom` to type `StagedOrderAddParcelToDeliveryAction`
- added property `discountOnTotalPrice` to type `Order`
- added property `custom` to type `OrderAddParcelToDeliveryAction`
</details>


<details>
<summary>Added Resource(s)</summary>

- added resource `/{projectKey}/as-associate/{associateId}/in-business-unit/key={businessUnitKey}/approval-rules`
- added resource `/{projectKey}/as-associate/{associateId}/in-business-unit/key={businessUnitKey}/approval-flows`
- added resource `/{projectKey}/as-associate/{associateId}/in-business-unit/key={businessUnitKey}/approval-rules/{ID}`
- added resource `/{projectKey}/as-associate/{associateId}/in-business-unit/key={businessUnitKey}/approval-rules/key={key}`
- added resource `/{projectKey}/as-associate/{associateId}/in-business-unit/key={businessUnitKey}/approval-flows/{ID}`
</details>

**History changes**

<details>
<summary>Added Property(s)</summary>

- added property `businessUnit` to type `Record`
</details>


<details>
<summary>Added QueryParameter(s)</summary>

- added query parameter `businessUnit` to method `get /{projectKey}`
- added query parameter `businessUnit` to method `get /{projectKey}/{resourceType}`
- added query parameter `businessUnit` to method `get /{projectKey}/{resourceType}/{ID}`
</details>

**Full Changelog**: https://github.com/commercetools/commercetools-sdk-java-v2/compare/16.2.0...16.3.0

# 16.2.0 (2023-09-07)

## What's Changed

* add option to deserialize attributes and custom fields as JsonNode 4c51dff

### Fixes

* Fix `localeValues` method for LocalizedStrings by @jenschude in https://github.com/commercetools/commercetools-sdk-java-v2/pull/483
  When using a `Locale` with a country part the `localeValues` method now correctly parses the key of the LocalizedString. See #482 


**Full Changelog**: https://github.com/commercetools/commercetools-sdk-java-v2/compare/16.1.0...16.2.0

# 16.1.0 (2023-09-04)

## What's Changed
* Update generated SDKs by @github-actions in https://github.com/commercetools/commercetools-sdk-java-v2/pull/479

**Api changes**

<details>
<summary>Required Property(s)</summary>

- changed property `textLineItemId` of type `MyShoppingListChangeTextLineItemNameAction` to be optional
- changed property `textLineItemId` of type `MyShoppingListChangeTextLineItemQuantityAction` to be optional
- changed property `lineItemId` of type `MyShoppingListRemoveLineItemAction` to be optional
- changed property `textLineItemId` of type `MyShoppingListRemoveTextLineItemAction` to be optional
- changed property `lineItemId` of type `MyShoppingListSetLineItemCustomFieldAction` to be optional
- changed property `textLineItemId` of type `MyShoppingListSetTextLineItemCustomFieldAction` to be optional
- changed property `textLineItemId` of type `MyShoppingListSetTextLineItemCustomTypeAction` to be optional
- changed property `textLineItemId` of type `MyShoppingListSetTextLineItemDescriptionAction` to be optional
- changed property `lineItemId` of type `ShoppingListChangeLineItemQuantityAction` to be optional
- changed property `textLineItemId` of type `ShoppingListChangeTextLineItemNameAction` to be optional
- changed property `textLineItemId` of type `ShoppingListChangeTextLineItemQuantityAction` to be optional
- changed property `lineItemId` of type `ShoppingListRemoveLineItemAction` to be optional
- changed property `textLineItemId` of type `ShoppingListRemoveTextLineItemAction` to be optional
- changed property `lineItemId` of type `ShoppingListSetLineItemCustomFieldAction` to be optional
- changed property `lineItemId` of type `ShoppingListSetLineItemCustomTypeAction` to be optional
- changed property `textLineItemId` of type `ShoppingListSetTextLineItemCustomFieldAction` to be optional
- changed property `textLineItemId` of type `ShoppingListSetTextLineItemCustomTypeAction` to be optional
- changed property `textLineItemId` of type `ShoppingListSetTextLineItemDescriptionAction` to be optional
</details>


<details>
<summary>Added Property(s)</summary>

- added property `perMethodExternalTaxRate` to type `LineItemDraft`
- added property `key` to type `MyShoppingListAddLineItemAction`
- added property `key` to type `MyShoppingListAddTextLineItemAction`
- added property `textLineItemKey` to type `MyShoppingListChangeTextLineItemNameAction`
- added property `textLineItemKey` to type `MyShoppingListChangeTextLineItemQuantityAction`
- added property `lineItemKey` to type `MyShoppingListRemoveLineItemAction`
- added property `textLineItemKey` to type `MyShoppingListRemoveTextLineItemAction`
- added property `lineItemKey` to type `MyShoppingListSetLineItemCustomFieldAction`
- added property `textLineItemKey` to type `MyShoppingListSetTextLineItemCustomFieldAction`
- added property `textLineItemKey` to type `MyShoppingListSetTextLineItemCustomTypeAction`
- added property `textLineItemKey` to type `MyShoppingListSetTextLineItemDescriptionAction`
- added property `cart` to type `QuoteRequest`
- added property `key` to type `ShoppingListLineItem`
- added property `key` to type `ShoppingListLineItemDraft`
- added property `key` to type `TextLineItem`
- added property `key` to type `TextLineItemDraft`
- added property `key` to type `ShoppingListAddLineItemAction`
- added property `key` to type `ShoppingListAddTextLineItemAction`
- added property `lineItemKey` to type `ShoppingListChangeLineItemQuantityAction`
- added property `textLineItemKey` to type `ShoppingListChangeTextLineItemNameAction`
- added property `textLineItemKey` to type `ShoppingListChangeTextLineItemQuantityAction`
- added property `lineItemKey` to type `ShoppingListRemoveLineItemAction`
- added property `textLineItemKey` to type `ShoppingListRemoveTextLineItemAction`
- added property `lineItemKey` to type `ShoppingListSetLineItemCustomFieldAction`
- added property `lineItemKey` to type `ShoppingListSetLineItemCustomTypeAction`
- added property `textLineItemKey` to type `ShoppingListSetTextLineItemCustomFieldAction`
- added property `textLineItemKey` to type `ShoppingListSetTextLineItemCustomTypeAction`
- added property `textLineItemKey` to type `ShoppingListSetTextLineItemDescriptionAction`
- added property `staged` to type `StandalonePriceDraft`
</details>


<details>
<summary>Added Type(s)</summary>

- added type `MethodExternalTaxRateDraft`
- added type `CustomerAddressCustomFieldAddedMessage`
- added type `CustomerAddressCustomFieldChangedMessage`
- added type `CustomerAddressCustomFieldRemovedMessage`
- added type `CustomerAddressCustomTypeRemovedMessage`
- added type `CustomerAddressCustomTypeSetMessage`
- added type `CustomerCustomFieldAddedMessage`
- added type `CustomerCustomFieldChangedMessage`
- added type `CustomerCustomFieldRemovedMessage`
- added type `CustomerCustomTypeRemovedMessage`
- added type `CustomerCustomTypeSetMessage`
- added type `QuoteRenegotiationRequestedMessage`
- added type `StandalonePriceStagedChangesRemovedMessage`
- added type `CustomerAddressCustomFieldAddedMessagePayload`
- added type `CustomerAddressCustomFieldChangedMessagePayload`
- added type `CustomerAddressCustomFieldRemovedMessagePayload`
- added type `CustomerAddressCustomTypeRemovedMessagePayload`
- added type `CustomerAddressCustomTypeSetMessagePayload`
- added type `CustomerCustomFieldAddedMessagePayload`
- added type `CustomerCustomFieldChangedMessagePayload`
- added type `CustomerCustomFieldRemovedMessagePayload`
- added type `CustomerCustomTypeRemovedMessagePayload`
- added type `CustomerCustomTypeSetMessagePayload`
- added type `CustomerMessagePayload`
- added type `QuoteRenegotiationRequestedMessagePayload`
- added type `StandalonePriceStagedChangesRemovedMessagePayload`
- added type `StagedPriceDraft`
- added type `StandalonePriceRemoveStagedChangesAction`
</details>


<details>
<summary>Removed Method(s)</summary>

- :warning: removed method `apiRoot.withProjectKey().me().payments().withKey().get()`
- :warning: removed method `apiRoot.withProjectKey().me().payments().withKey().post()`
- :warning: removed method `apiRoot.withProjectKey().me().payments().withKey().delete()`
</details>


<details>
<summary>Removed Resource(s)</summary>

- :warning: removed resource `/{projectKey}/me/payments/key={key}`
</details>


<details>
<summary>Removed Enum(s)</summary>

- :warning: removed enum `Failed` from type `QuoteState`
</details>

**Import changes**

<details>
<summary>Added Property(s)</summary>

- added property `canceled` to type `OperationStates`
</details>


<details>
<summary>Added Enum(s)</summary>

- added enum `canceled` to type `ProcessingState`
</details>

**History changes**

<details>
<summary>Added QueryParameter(s)</summary>

- added query parameter `associateId` to method `get /{projectKey}`
- added query parameter `associateId` to method `get /{projectKey}/{resourceType}`
- added query parameter `associateId` to method `get /{projectKey}/{resourceType}/{ID}`
</details>


<details>
<summary>Added Property(s)</summary>

- added property `associate` to type `ModifiedBy`
</details>


**Full Changelog**: https://github.com/commercetools/commercetools-sdk-java-v2/compare/16.0.0...16.1.0

# 16.0.0 (2023-09-04)

## What's Changed
* add util to create ApiRootBuilder from environment variables or prope… by @jenschude in https://github.com/commercetools/commercetools-sdk-java-v2/pull/476
* Lock file maintenance by @renovate in https://github.com/commercetools/commercetools-sdk-java-v2/pull/474
* Fix serializer initialisation by @jenschude in https://github.com/commercetools/commercetools-sdk-java-v2/pull/475
* Update generated SDKs by @github-actions in https://github.com/commercetools/commercetools-sdk-java-v2/pull/469
* Update all dependencies by @renovate in https://github.com/commercetools/commercetools-sdk-java-v2/pull/472

**Api changes**

<details>
<summary>Added Type(s)</summary>

- added type `MethodExternalTaxRateDraft`
- added type `QuoteRenegotiationRequestedMessage`
- added type `QuoteRenegotiationRequestedMessagePayload`
</details>


<details>
<summary>Added Property(s)</summary>

- added property `perMethodExternalTaxRate` to type `LineItemDraft`
- added property `key` to type `MyShoppingListAddLineItemAction`
- added property `key` to type `MyShoppingListAddTextLineItemAction`
- added property `textLineItemKey` to type `MyShoppingListChangeTextLineItemNameAction`
- added property `textLineItemKey` to type `MyShoppingListChangeTextLineItemQuantityAction`
- added property `lineItemKey` to type `MyShoppingListRemoveLineItemAction`
- added property `textLineItemKey` to type `MyShoppingListRemoveTextLineItemAction`
- added property `lineItemKey` to type `MyShoppingListSetLineItemCustomFieldAction`
- added property `textLineItemKey` to type `MyShoppingListSetTextLineItemCustomFieldAction`
- added property `textLineItemKey` to type `MyShoppingListSetTextLineItemCustomTypeAction`
- added property `textLineItemKey` to type `MyShoppingListSetTextLineItemDescriptionAction`
- added property `cart` to type `QuoteRequest`
- added property `key` to type `ShoppingListLineItem`
- added property `key` to type `ShoppingListLineItemDraft`
- added property `key` to type `TextLineItem`
- added property `key` to type `TextLineItemDraft`
- added property `key` to type `ShoppingListAddLineItemAction`
- added property `key` to type `ShoppingListAddTextLineItemAction`
- added property `lineItemKey` to type `ShoppingListChangeLineItemQuantityAction`
- added property `textLineItemKey` to type `ShoppingListChangeTextLineItemNameAction`
- added property `textLineItemKey` to type `ShoppingListChangeTextLineItemQuantityAction`
- added property `lineItemKey` to type `ShoppingListRemoveLineItemAction`
- added property `textLineItemKey` to type `ShoppingListRemoveTextLineItemAction`
- added property `lineItemKey` to type `ShoppingListSetLineItemCustomFieldAction`
- added property `lineItemKey` to type `ShoppingListSetLineItemCustomTypeAction`
- added property `textLineItemKey` to type `ShoppingListSetTextLineItemCustomFieldAction`
- added property `textLineItemKey` to type `ShoppingListSetTextLineItemCustomTypeAction`
- added property `textLineItemKey` to type `ShoppingListSetTextLineItemDescriptionAction`
</details>


<details>
<summary>Required Property(s)</summary>

- changed property `textLineItemId` of type `MyShoppingListChangeTextLineItemNameAction` to be optional
- changed property `textLineItemId` of type `MyShoppingListChangeTextLineItemQuantityAction` to be optional
- changed property `lineItemId` of type `MyShoppingListRemoveLineItemAction` to be optional
- changed property `textLineItemId` of type `MyShoppingListRemoveTextLineItemAction` to be optional
- changed property `lineItemId` of type `MyShoppingListSetLineItemCustomFieldAction` to be optional
- changed property `textLineItemId` of type `MyShoppingListSetTextLineItemCustomFieldAction` to be optional
- changed property `textLineItemId` of type `MyShoppingListSetTextLineItemCustomTypeAction` to be optional
- changed property `textLineItemId` of type `MyShoppingListSetTextLineItemDescriptionAction` to be optional
- changed property `lineItemId` of type `ShoppingListChangeLineItemQuantityAction` to be optional
- changed property `textLineItemId` of type `ShoppingListChangeTextLineItemNameAction` to be optional
- changed property `textLineItemId` of type `ShoppingListChangeTextLineItemQuantityAction` to be optional
- changed property `lineItemId` of type `ShoppingListRemoveLineItemAction` to be optional
- changed property `textLineItemId` of type `ShoppingListRemoveTextLineItemAction` to be optional
- changed property `lineItemId` of type `ShoppingListSetLineItemCustomFieldAction` to be optional
- changed property `lineItemId` of type `ShoppingListSetLineItemCustomTypeAction` to be optional
- changed property `textLineItemId` of type `ShoppingListSetTextLineItemCustomFieldAction` to be optional
- changed property `textLineItemId` of type `ShoppingListSetTextLineItemCustomTypeAction` to be optional
- changed property `textLineItemId` of type `ShoppingListSetTextLineItemDescriptionAction` to be optional
</details>


<details>
<summary>Removed Enum(s)</summary>

- :warning: removed enum `Failed` from type `QuoteState`
</details>

**Import changes**

<details>
<summary>Added Property(s)</summary>

- added property `canceled` to type `OperationStates`
</details>


<details>
<summary>Added Enum(s)</summary>

- added enum `canceled` to type `ProcessingState`
</details>

**History changes**

<details>
<summary>Added QueryParameter(s)</summary>

- added query parameter `associateId` to method `get /{projectKey}`
- added query parameter `associateId` to method `get /{projectKey}/{resourceType}`
- added query parameter `associateId` to method `get /{projectKey}/{resourceType}/{ID}`
</details>


<details>
<summary>Added Property(s)</summary>

- added property `associate` to type `ModifiedBy`
</details>


**Full Changelog**: https://github.com/commercetools/commercetools-sdk-java-v2/compare/15.0.1...16.0.0

# 15.0.1 (2023-08-11)

## Fixes

- fix deserialization error for datetime attributes and custom fields with invalid offsets

**Full Changelog**: https://github.com/commercetools/commercetools-sdk-java-v2/compare/15.0.0...15.0.1

# 15.0.0 (2023-08-10)

## What's Changed
* Update generated SDKs by @github-actions in https://github.com/commercetools/commercetools-sdk-java-v2/pull/467
* Update all dependencies by @renovate in https://github.com/commercetools/commercetools-sdk-java-v2/pull/437
* Lock file maintenance by @renovate in https://github.com/commercetools/commercetools-sdk-java-v2/pull/375
* Update generated SDKs by @github-actions in https://github.com/commercetools/commercetools-sdk-java-v2/pull/468

### Breaking changes

- deprecated properties & types removed
- CartDiscountValueFixed now supports HighPrecisionMoney and changed from CentPrecisionMoney to TypedMoney
- Business Unit & Associate beta changes
- Order Edit clarifications and corrections
- deprecated `com.commercetools.api.models.PagedQueryResourceRequest` removed

### Changelog for generated parts

**Api changes**

<details>
<summary>Changed Property(s)</summary>

- :warning: changed property `money` of type `CartDiscountValueFixed` from type `CentPrecisionMoney[]` to `TypedMoney[]`
</details>


<details>
<summary>Added Property(s)</summary>

- added property `taxedPricePortions` to type `CustomLineItem`
- added property `customLineItemKey` to type `CartApplyDeltaToCustomLineItemShippingDetailsTargetsAction`
- added property `customLineItemKey` to type `CartChangeCustomLineItemMoneyAction`
- added property `customLineItemKey` to type `CartChangeCustomLineItemPriceModeAction`
- added property `customLineItemKey` to type `CartChangeCustomLineItemQuantityAction`
- added property `customLineItemKey` to type `CartRemoveCustomLineItemAction`
- added property `customLineItemKey` to type `CartSetCustomLineItemCustomFieldAction`
- added property `customLineItemKey` to type `CartSetCustomLineItemCustomTypeAction`
- added property `customLineItemKey` to type `CartSetCustomLineItemShippingDetailsAction`
- added property `customLineItemKey` to type `CartSetCustomLineItemTaxAmountAction`
- added property `shippingKey` to type `CartSetCustomLineItemTaxAmountAction`
- added property `customLineItemKey` to type `CartSetCustomLineItemTaxRateAction`
- added property `shippingKey` to type `CartSetCustomLineItemTaxRateAction`
- added property `associate` to type `ClientLogging`
- added property `associate` to type `CreatedBy`
- added property `associate` to type `LastModifiedBy`
- added property `customLineItemKey` to type `CustomLineItemStateTransitionMessage`
- added property `lineItemKey` to type `LineItemStateTransitionMessage`
- added property `customLineItemKey` to type `OrderCustomLineItemDiscountSetMessage`
- added property `customLineItemKey` to type `OrderCustomLineItemQuantityChangedMessage`
- added property `customLineItemKey` to type `OrderCustomLineItemRemovedMessage`
- added property `lineItemKey` to type `OrderLineItemDiscountSetMessage`
- added property `lineItemKey` to type `OrderLineItemDistributionChannelSetMessage`
- added property `lineItemKey` to type `OrderLineItemRemovedMessage`
- added property `customLineItemKey` to type `CustomLineItemStateTransitionMessagePayload`
- added property `lineItemKey` to type `LineItemStateTransitionMessagePayload`
- added property `customLineItemKey` to type `OrderCustomLineItemDiscountSetMessagePayload`
- added property `customLineItemKey` to type `OrderCustomLineItemQuantityChangedMessagePayload`
- added property `customLineItemKey` to type `OrderCustomLineItemRemovedMessagePayload`
- added property `lineItemKey` to type `OrderLineItemDiscountSetMessagePayload`
- added property `lineItemKey` to type `OrderLineItemDistributionChannelSetMessagePayload`
- added property `lineItemKey` to type `OrderLineItemRemovedMessagePayload`
- added property `directDiscounts` to type `StagedOrder`
- added property `shippingDetails` to type `StagedOrderAddCustomLineItemAction`
- added property `inventoryMode` to type `StagedOrderAddLineItemAction`
- added property `customLineItemKey` to type `StagedOrderChangeCustomLineItemMoneyAction`
- added property `customLineItemKey` to type `StagedOrderChangeCustomLineItemQuantityAction`
- added property `customLineItemKey` to type `StagedOrderImportCustomLineItemStateAction`
- added property `lineItemKey` to type `StagedOrderImportLineItemStateAction`
- added property `customLineItemKey` to type `StagedOrderRemoveCustomLineItemAction`
- added property `customLineItemKey` to type `StagedOrderSetCustomLineItemCustomFieldAction`
- added property `customLineItemKey` to type `StagedOrderSetCustomLineItemCustomTypeAction`
- added property `customLineItemKey` to type `StagedOrderSetCustomLineItemShippingDetailsAction`
- added property `customLineItemKey` to type `StagedOrderSetCustomLineItemTaxAmountAction`
- added property `shippingKey` to type `StagedOrderSetCustomLineItemTaxAmountAction`
- added property `customLineItemKey` to type `StagedOrderSetCustomLineItemTaxRateAction`
- added property `shippingKey` to type `StagedOrderSetCustomLineItemTaxRateAction`
- added property `returnItemKey` to type `StagedOrderSetReturnItemCustomFieldAction`
- added property `returnItemKey` to type `StagedOrderSetReturnItemCustomTypeAction`
- added property `returnItemKey` to type `StagedOrderSetReturnPaymentStateAction`
- added property `returnItemKey` to type `StagedOrderSetReturnShipmentStateAction`
- added property `customLineItemKey` to type `StagedOrderTransitionCustomLineItemStateAction`
- added property `lineItemKey` to type `StagedOrderTransitionLineItemStateAction`
- added property `key` to type `CustomLineItemImportDraft`
- added property `key` to type `CustomLineItemReturnItem`
- added property `key` to type `LineItemImportDraft`
- added property `key` to type `LineItemReturnItem`
- added property `directDiscounts` to type `Order`
- added property `purchaseOrderNumber` to type `OrderImportDraft`
- added property `taxCalculationMode` to type `OrderImportDraft`
- added property `key` to type `ReturnItem`
- added property `key` to type `ReturnItemDraft`
- added property `customLineItemKey` to type `OrderImportCustomLineItemStateAction`
- added property `lineItemKey` to type `OrderImportLineItemStateAction`
- added property `customLineItemKey` to type `OrderSetCustomLineItemCustomFieldAction`
- added property `customLineItemKey` to type `OrderSetCustomLineItemCustomTypeAction`
- added property `customLineItemKey` to type `OrderSetCustomLineItemShippingDetailsAction`
- added property `returnItemKey` to type `OrderSetReturnItemCustomFieldAction`
- added property `returnItemKey` to type `OrderSetReturnItemCustomTypeAction`
- added property `returnItemKey` to type `OrderSetReturnPaymentStateAction`
- added property `returnItemKey` to type `OrderSetReturnShipmentStateAction`
- added property `customLineItemKey` to type `OrderTransitionCustomLineItemStateAction`
- added property `lineItemKey` to type `OrderTransitionLineItemStateAction`
</details>


<details>
<summary>Required Property(s)</summary>

- :warning: changed property `associateRoleAssignments` of type `AssociateDraft` to be required
- :warning: changed property `paymentState` of type `StagedOrderChangePaymentStateAction` to be required
- :warning: changed property `shipmentState` of type `StagedOrderChangeShipmentStateAction` to be required
- :warning: changed property `paymentState` of type `OrderChangePaymentStateAction` to be required
- :warning: changed property `shipmentState` of type `OrderChangeShipmentStateAction` to be required
- changed property `roles` of type `Associate` to be optional
- changed property `customLineItemId` of type `CartApplyDeltaToCustomLineItemShippingDetailsTargetsAction` to be optional
- changed property `customLineItemId` of type `CartChangeCustomLineItemMoneyAction` to be optional
- changed property `customLineItemId` of type `CartChangeCustomLineItemPriceModeAction` to be optional
- changed property `customLineItemId` of type `CartChangeCustomLineItemQuantityAction` to be optional
- changed property `customLineItemId` of type `CartRemoveCustomLineItemAction` to be optional
- changed property `customLineItemId` of type `CartSetCustomLineItemCustomFieldAction` to be optional
- changed property `customLineItemId` of type `CartSetCustomLineItemCustomTypeAction` to be optional
- changed property `customLineItemId` of type `CartSetCustomLineItemShippingDetailsAction` to be optional
- changed property `customLineItemId` of type `CartSetCustomLineItemTaxAmountAction` to be optional
- changed property `customLineItemId` of type `CartSetCustomLineItemTaxRateAction` to be optional
- changed property `centAmount` of type `CentPrecisionMoneyDraft` to be optional
- changed property `centAmount` of type `TypedMoneyDraft` to be optional
- changed property `comment` of type `MyQuoteRequestDraft` to be optional
- changed property `customLineItemId` of type `StagedOrderChangeCustomLineItemMoneyAction` to be optional
- changed property `customLineItemId` of type `StagedOrderChangeCustomLineItemQuantityAction` to be optional
- changed property `customLineItemId` of type `StagedOrderImportCustomLineItemStateAction` to be optional
- changed property `lineItemId` of type `StagedOrderImportLineItemStateAction` to be optional
- changed property `customLineItemId` of type `StagedOrderRemoveCustomLineItemAction` to be optional
- changed property `customLineItemId` of type `StagedOrderSetCustomLineItemCustomFieldAction` to be optional
- changed property `customLineItemId` of type `StagedOrderSetCustomLineItemCustomTypeAction` to be optional
- changed property `customLineItemId` of type `StagedOrderSetCustomLineItemShippingDetailsAction` to be optional
- changed property `customLineItemId` of type `StagedOrderSetCustomLineItemTaxAmountAction` to be optional
- changed property `customLineItemId` of type `StagedOrderSetCustomLineItemTaxRateAction` to be optional
- changed property `returnItemId` of type `StagedOrderSetReturnItemCustomFieldAction` to be optional
- changed property `returnItemId` of type `StagedOrderSetReturnItemCustomTypeAction` to be optional
- changed property `returnItemId` of type `StagedOrderSetReturnPaymentStateAction` to be optional
- changed property `returnItemId` of type `StagedOrderSetReturnShipmentStateAction` to be optional
- changed property `customLineItemId` of type `StagedOrderTransitionCustomLineItemStateAction` to be optional
- changed property `lineItemId` of type `StagedOrderTransitionLineItemStateAction` to be optional
- changed property `priceMode` of type `CustomLineItemImportDraft` to be optional
- changed property `customLineItemId` of type `OrderImportCustomLineItemStateAction` to be optional
- changed property `lineItemId` of type `OrderImportLineItemStateAction` to be optional
- changed property `customLineItemId` of type `OrderSetCustomLineItemCustomFieldAction` to be optional
- changed property `customLineItemId` of type `OrderSetCustomLineItemCustomTypeAction` to be optional
- changed property `customLineItemId` of type `OrderSetCustomLineItemShippingDetailsAction` to be optional
- changed property `returnItemId` of type `OrderSetReturnItemCustomFieldAction` to be optional
- changed property `returnItemId` of type `OrderSetReturnItemCustomTypeAction` to be optional
- changed property `returnItemId` of type `OrderSetReturnPaymentStateAction` to be optional
- changed property `returnItemId` of type `OrderSetReturnShipmentStateAction` to be optional
- changed property `customLineItemId` of type `OrderTransitionCustomLineItemStateAction` to be optional
- changed property `lineItemId` of type `OrderTransitionLineItemStateAction` to be optional
- changed property `comment` of type `QuoteRequestDraft` to be optional
</details>


<details>
<summary>Deprecated Property(s)</summary>

- property `Associate::roles` is removed
- property `AssociateDraft::roles` is removed
- property `IndividualExclusionProductSelectionType::type` is removed
- property `IndividualProductSelectionType::type` is removed
- property `ProductSelection::type` is removed
- property `ProductSelectionDraft::type` is removed
- property `ProductSelectionType::type` is removed
</details>


<details>
<summary>Added QueryParameter(s)</summary>

- added query parameter `where` to method `get /{projectKey}/in-store/key={storeKey}/product-selection-assignments`
- added query parameter `/^var[.][a-zA-Z0-9]+$/` to method `get /{projectKey}/in-store/key={storeKey}/product-selection-assignments`
</details>


<details>
<summary>Removed QueryParameter(s)</summary>

- :warning: removed query parameter `expand` from method `get /{projectKey}/subscriptions`
- :warning: removed query parameter `expand` from method `post /{projectKey}/subscriptions`
- :warning: removed query parameter `expand` from method `get /{projectKey}/extensions`
- :warning: removed query parameter `expand` from method `post /{projectKey}/extensions`
- :warning: removed query parameter `expand` from method `get /{projectKey}/subscriptions/key={key}`
- :warning: removed query parameter `expand` from method `post /{projectKey}/subscriptions/key={key}`
- :warning: removed query parameter `expand` from method `delete /{projectKey}/subscriptions/key={key}`
- :warning: removed query parameter `expand` from method `get /{projectKey}/subscriptions/{ID}`
- :warning: removed query parameter `expand` from method `post /{projectKey}/subscriptions/{ID}`
- :warning: removed query parameter `expand` from method `delete /{projectKey}/subscriptions/{ID}`
- :warning: removed query parameter `expand` from method `get /{projectKey}/extensions/key={key}`
- :warning: removed query parameter `expand` from method `post /{projectKey}/extensions/key={key}`
- :warning: removed query parameter `expand` from method `delete /{projectKey}/extensions/key={key}`
- :warning: removed query parameter `expand` from method `get /{projectKey}/extensions/{ID}`
- :warning: removed query parameter `expand` from method `post /{projectKey}/extensions/{ID}`
- :warning: removed query parameter `expand` from method `delete /{projectKey}/extensions/{ID}`
</details>


<details>
<summary>Added Type(s)</summary>

- added type `ContentTooLargeError`
- added type `GraphQLContentTooLargeError`
- added type `BusinessUnitParentChangedMessage`
- added type `OrderCustomFieldAddedMessage`
- added type `OrderCustomFieldChangedMessage`
- added type `OrderCustomFieldRemovedMessage`
- added type `OrderCustomTypeRemovedMessage`
- added type `OrderCustomTypeSetMessage`
- added type `BusinessUnitParentChangedMessagePayload`
- added type `OrderCustomFieldAddedMessagePayload`
- added type `OrderCustomFieldChangedMessagePayload`
- added type `OrderCustomFieldRemovedMessagePayload`
- added type `OrderCustomTypeRemovedMessagePayload`
- added type `OrderCustomTypeSetMessagePayload`
- added type `StagedOrderSetDirectDiscountsAction`
- added type `StagedOrderSetStoreAction`
</details>


<details>
<summary>Deprecated Type(s)</summary>

- type `AssociateRoleDeprecated` is removed
- type `IndividualExclusionProductSelectionType` is removed
- type `IndividualProductSelectionType` is removed
- type `ProductSelectionType` is removed
- type `ProductSelectionTypeEnum` is removed
</details>


<details>
<summary>Removed Type(s)</summary>

- :warning: removed type `CartSetDeliveryAddressCustomFieldAction`
- :warning: removed type `CartSetDeliveryAddressCustomTypeAction`
- :warning: removed type `BusinessUnitParentUnitChangedMessage`
- :warning: removed type `BusinessUnitParentUnitChangedMessagePayload`
- :warning: removed type `OrderResourceIdentifier`
</details>


<details>
<summary>Added Enum(s)</summary>

- added enum `associate-role` to type `ChangeSubscriptionResourceTypeId`
</details>

**Import changes**

<details>
<summary>Required Property(s)</summary>

- :warning: changed property `key` of type `PriceDraftImport` to be required
- changed property `addresses` of type `CustomerImport` to be optional
</details>

**History changes**

<details>
<summary>Added Type(s)</summary>

- added type `AddInheritedAssociateChange`
- added type `AssociateRoleLabel`
- added type `ChangeBuyerAssignableChange`
- added type `ChangeInheritedAssociateChange`
- added type `InheritedAssociate`
- added type `InheritedAssociateRoleAssignment`
- added type `Permission`
- added type `RemoveInheritedAssociateChange`
- added type `SetLocalizedNameChange`
- added type `SetPermissionsChange`
</details>


<details>
<summary>Added Enum(s)</summary>

- added enum `associate-role` to type `ChangeHistoryResourceType`
</details>


**Full Changelog**: https://github.com/commercetools/commercetools-sdk-java-v2/compare/14.6.1...15.0.0

# 14.6.1 (2023-08-07)

Minor Changes


**Full Changelog**: https://github.com/commercetools/commercetools-sdk-java-v2/compare/14.6.0...14.6.1

# 14.6.0 (2023-07-13)

## What's Changed
* add Java 11 HTTP client module by @jenschude in https://github.com/commercetools/commercetools-sdk-java-v2/pull/463
* Update generated SDKs by @github-actions in https://github.com/commercetools/commercetools-sdk-java-v2/pull/461
* add support for decorated ApiHttpClient by @jenschude in https://github.com/commercetools/commercetools-sdk-java-v2/pull/464

**Api changes**

<details>
<summary>Added Resource(s)</summary>

- added resource `/{projectKey}/in-store/key={storeKey}/cart-discounts`
- added resource `/{projectKey}/in-store/key={storeKey}/cart-discounts/key={key}`
- added resource `/{projectKey}/in-store/key={storeKey}/cart-discounts/{ID}`
</details>


<details>
<summary>Added Property(s)</summary>

- added property `stores` to type `CartDiscount`
- added property `stores` to type `CartDiscountDraft`
- added property `key` to type `CustomLineItem`
- added property `key` to type `CustomLineItemDraft`
- added property `key` to type `CartAddCustomLineItemAction`
- added property `key` to type `StagedOrderAddCustomLineItemAction`
- added property `shippingKey` to type `StagedOrderAddDeliveryAction`
</details>


<details>
<summary>Added Type(s)</summary>

- added type `CartDiscountAddStoreAction`
- added type `CartDiscountRemoveStoreAction`
- added type `CartDiscountSetStoresAction`
- added type `MaxCartDiscountsReachedError`
- added type `MaxStoreReferencesReachedError`
- added type `StoreCartDiscountsLimitReachedError`
- added type `GraphQLMaxCartDiscountsReachedError`
- added type `GraphQLMaxStoreReferencesReachedError`
- added type `GraphQLStoreCartDiscountsLimitReachedError`
</details>


<details>
<summary>Added Method(s)</summary>

- added method `apiRoot.withProjectKey().inStoreKeyWithStoreKeyValue().cartDiscounts().get()`
- added method `apiRoot.withProjectKey().inStoreKeyWithStoreKeyValue().cartDiscounts().post()`
- added method `apiRoot.withProjectKey().inStoreKeyWithStoreKeyValue().cartDiscounts().withKey().get()`
- added method `apiRoot.withProjectKey().inStoreKeyWithStoreKeyValue().cartDiscounts().withKey().post()`
- added method `apiRoot.withProjectKey().inStoreKeyWithStoreKeyValue().cartDiscounts().withKey().delete()`
- added method `apiRoot.withProjectKey().inStoreKeyWithStoreKeyValue().cartDiscounts().withId().get()`
- added method `apiRoot.withProjectKey().inStoreKeyWithStoreKeyValue().cartDiscounts().withId().post()`
- added method `apiRoot.withProjectKey().inStoreKeyWithStoreKeyValue().cartDiscounts().withId().delete()`
</details>


**Full Changelog**: https://github.com/commercetools/commercetools-sdk-java-v2/compare/14.5.0...14.6.0

# 14.5.0 (2023-07-03)

## What's Changed
* add toDraft helper methods for CartDiscountValue and subtypes by @jenschude in https://github.com/commercetools/commercetools-sdk-java-v2/pull/457
* Update generated SDKs by @github-actions in https://github.com/commercetools/commercetools-sdk-java-v2/pull/453
* avoid rebuild for example test by @jenschude in https://github.com/commercetools/commercetools-sdk-java-v2/pull/458
* Update generated SDKs by @github-actions in https://github.com/commercetools/commercetools-sdk-java-v2/pull/459
* Update generated SDKs by @github-actions in https://github.com/commercetools/commercetools-sdk-java-v2/pull/460

**Api changes**

<details>
<summary>Added Property(s)</summary>

- added property `perMethodTaxRate` to type `CustomLineItem`
- added property `lineItemKey` to type `CartApplyDeltaToLineItemShippingDetailsTargetsAction`
- added property `lineItemKey` to type `CartChangeLineItemQuantityAction`
- added property `lineItemKey` to type `CartRemoveLineItemAction`
- added property `lineItemKey` to type `CartSetLineItemCustomFieldAction`
- added property `lineItemKey` to type `CartSetLineItemCustomTypeAction`
- added property `lineItemKey` to type `CartSetLineItemDistributionChannelAction`
- added property `lineItemKey` to type `CartSetLineItemInventoryModeAction`
- added property `lineItemKey` to type `CartSetLineItemPriceAction`
- added property `lineItemKey` to type `CartSetLineItemShippingDetailsAction`
- added property `lineItemKey` to type `CartSetLineItemSupplyChannelAction`
- added property `lineItemKey` to type `CartSetLineItemTaxAmountAction`
- added property `lineItemKey` to type `CartSetLineItemTaxRateAction`
- added property `lineItemKey` to type `CartSetLineItemTotalPriceAction`
- added property `lineItemKey` to type `MyCartApplyDeltaToLineItemShippingDetailsTargetsAction`
- added property `lineItemKey` to type `MyCartChangeLineItemQuantityAction`
- added property `lineItemKey` to type `MyCartRemoveLineItemAction`
- added property `lineItemKey` to type `MyCartSetLineItemCustomFieldAction`
- added property `lineItemKey` to type `MyCartSetLineItemCustomTypeAction`
- added property `lineItemKey` to type `MyCartSetLineItemDistributionChannelAction`
- added property `lineItemKey` to type `MyCartSetLineItemShippingDetailsAction`
- added property `lineItemKey` to type `MyCartSetLineItemSupplyChannelAction`
- added property `lineItemKey` to type `MyShoppingListChangeLineItemQuantityAction`
- added property `lineItemKey` to type `StagedOrderChangeLineItemQuantityAction`
- added property `lineItemKey` to type `StagedOrderRemoveLineItemAction`
- added property `lineItemKey` to type `StagedOrderSetLineItemCustomFieldAction`
- added property `lineItemKey` to type `StagedOrderSetLineItemCustomTypeAction`
- added property `lineItemKey` to type `StagedOrderSetLineItemDistributionChannelAction`
- added property `lineItemKey` to type `StagedOrderSetLineItemPriceAction`
- added property `lineItemKey` to type `StagedOrderSetLineItemShippingDetailsAction`
- added property `lineItemKey` to type `StagedOrderSetLineItemTaxAmountAction`
- added property `lineItemKey` to type `StagedOrderSetLineItemTaxRateAction`
- added property `lineItemKey` to type `StagedOrderSetLineItemTotalPriceAction`
- added property `lineItemKey` to type `OrderSetLineItemCustomFieldAction`
- added property `lineItemKey` to type `OrderSetLineItemCustomTypeAction`
- added property `lineItemKey` to type `OrderSetLineItemShippingDetailsAction`
</details>


<details>
<summary>Required Property(s)</summary>

- changed property `lineItemId` of type `CartApplyDeltaToLineItemShippingDetailsTargetsAction` to be optional
- changed property `lineItemId` of type `CartChangeLineItemQuantityAction` to be optional
- changed property `lineItemId` of type `CartRemoveLineItemAction` to be optional
- changed property `lineItemId` of type `CartSetLineItemCustomFieldAction` to be optional
- changed property `lineItemId` of type `CartSetLineItemCustomTypeAction` to be optional
- changed property `lineItemId` of type `CartSetLineItemDistributionChannelAction` to be optional
- changed property `lineItemId` of type `CartSetLineItemInventoryModeAction` to be optional
- changed property `lineItemId` of type `CartSetLineItemPriceAction` to be optional
- changed property `lineItemId` of type `CartSetLineItemShippingDetailsAction` to be optional
- changed property `lineItemId` of type `CartSetLineItemSupplyChannelAction` to be optional
- changed property `lineItemId` of type `CartSetLineItemTaxAmountAction` to be optional
- changed property `lineItemId` of type `CartSetLineItemTaxRateAction` to be optional
- changed property `lineItemId` of type `CartSetLineItemTotalPriceAction` to be optional
- changed property `lineItemId` of type `MyCartApplyDeltaToLineItemShippingDetailsTargetsAction` to be optional
- changed property `lineItemId` of type `MyCartChangeLineItemQuantityAction` to be optional
- changed property `lineItemId` of type `MyCartRemoveLineItemAction` to be optional
- changed property `lineItemId` of type `MyCartSetLineItemCustomFieldAction` to be optional
- changed property `lineItemId` of type `MyCartSetLineItemCustomTypeAction` to be optional
- changed property `lineItemId` of type `MyCartSetLineItemDistributionChannelAction` to be optional
- changed property `lineItemId` of type `MyCartSetLineItemShippingDetailsAction` to be optional
- changed property `lineItemId` of type `MyCartSetLineItemSupplyChannelAction` to be optional
- changed property `lineItemId` of type `MyShoppingListChangeLineItemQuantityAction` to be optional
- changed property `lineItemId` of type `StagedOrderChangeLineItemQuantityAction` to be optional
- changed property `lineItemId` of type `StagedOrderRemoveLineItemAction` to be optional
- changed property `lineItemId` of type `StagedOrderSetLineItemCustomFieldAction` to be optional
- changed property `lineItemId` of type `StagedOrderSetLineItemCustomTypeAction` to be optional
- changed property `lineItemId` of type `StagedOrderSetLineItemDistributionChannelAction` to be optional
- changed property `lineItemId` of type `StagedOrderSetLineItemPriceAction` to be optional
- changed property `lineItemId` of type `StagedOrderSetLineItemShippingDetailsAction` to be optional
- changed property `lineItemId` of type `StagedOrderSetLineItemTaxAmountAction` to be optional
- changed property `lineItemId` of type `StagedOrderSetLineItemTaxRateAction` to be optional
- changed property `lineItemId` of type `StagedOrderSetLineItemTotalPriceAction` to be optional
- changed property `lineItemId` of type `OrderSetLineItemCustomFieldAction` to be optional
- changed property `lineItemId` of type `OrderSetLineItemCustomTypeAction` to be optional
- changed property `lineItemId` of type `OrderSetLineItemShippingDetailsAction` to be optional
</details>


<details>
<summary>Deprecated Type(s)</summary>

- type `ProductVariantSelectionExclusion` is removed
- type `ProductVariantSelectionInclusion` is removed
</details>


<details>
<summary>Removed Type(s)</summary>

- :warning: removed type `MyCartSetDirectDiscountsAction`
</details>

**History changes**

<details>
<summary>Added Property(s)</summary>

- added property `variantSelection` to type `AddProductChange`
</details>


<details>
<summary>Changed Property(s)</summary>

- :warning: changed property `resource` of type `Record` from type `Reference` to `ResourceIdentifier`
</details>


<details>
<summary>Added QueryParameter(s)</summary>

- added query parameter `resourceKey` to method `get /{projectKey}`
- added query parameter `resourceKey` to method `get /{projectKey}/{resourceType}`
</details>


<details>
<summary>Removed QueryParameter(s)</summary>

- :warning: removed query parameter `resourceId` from method `get /{projectKey}/{resourceType}`
</details>


<details>
<summary>Added Type(s)</summary>

- added type `AddAssociateChange`
- added type `AddProductSelectionChange`
- added type `Associate`
- added type `AssociateRoleAssignment`
- added type `AssociateRoleInheritanceMode`
- added type `BusinessUnitAssociateMode`
- added type `BusinessUnitLabel`
- added type `BusinessUnitStatus`
- added type `BusinessUnitStoreMode`
- added type `ChangeAssociateChange`
- added type `ChangeAssociateModeChange`
- added type `ChangeParentUnitChange`
- added type `ChangeProductSelectionActiveChange`
- added type `ChangeStatusChange`
- added type `ProductVariantSelection`
- added type `ProductVariantSelectionTypeEnum`
- added type `RemoveAssociateChange`
- added type `RemoveProductSelectionChange`
- added type `RequestQuoteRenegotiationChange`
- added type `ResourceIdentifier`
- added type `SetAddressCustomFieldChange`
- added type `SetAddressCustomTypeChange`
- added type `SetContactEmailChange`
- added type `SetStoreModeChange`
- added type `SetVariantSelectionChange`
</details>


<details>
<summary>Added Enum(s)</summary>

- added enum `business-unit` to type `ChangeHistoryResourceType`
- added enum `addAssociate` to type `UpdateType`
- added enum `addCustomLineItem` to type `UpdateType`
- added enum `addDiscountCode` to type `UpdateType`
- added enum `addProduct` to type `UpdateType`
- added enum `addProductSelection` to type `UpdateType`
- added enum `addProperty` to type `UpdateType`
- added enum `changeAmountAuthorized` to type `UpdateType`
- added enum `changeAssociate` to type `UpdateType`
- added enum `changeAssociateMode` to type `UpdateType`
- added enum `changeCustomLineItemQuantity` to type `UpdateType`
- added enum `changeLineItemName` to type `UpdateType`
- added enum `changeParentUnit` to type `UpdateType`
- added enum `changeProductSelectionActive` to type `UpdateType`
- added enum `changeQuoteRequestState` to type `UpdateType`
- added enum `changeQuoteState` to type `UpdateType`
- added enum `changeStagedQuoteState` to type `UpdateType`
- added enum `changeStatus` to type `UpdateType`
- added enum `changeTaxCalculationMode` to type `UpdateType`
- added enum `changeTaxMode` to type `UpdateType`
- added enum `changeTaxRoundingMode` to type `UpdateType`
- added enum `moveImageToPosition` to type `UpdateType`
- added enum `removeAssociate` to type `UpdateType`
- added enum `removeCustomLineItem` to type `UpdateType`
- added enum `removeDiscountCode` to type `UpdateType`
- added enum `removeProduct` to type `UpdateType`
- added enum `removeProductSelection` to type `UpdateType`
- added enum `removeProperty` to type `UpdateType`
- added enum `requestQuoteRenegotiation` to type `UpdateType`
- added enum `setAddressCustomField` to type `UpdateType`
- added enum `setAddressCustomType` to type `UpdateType`
- added enum `setApplicationVersion` to type `UpdateType`
- added enum `setAuthenticationMode` to type `UpdateType`
- added enum `setContactEmail` to type `UpdateType`
- added enum `setCountries` to type `UpdateType`
- added enum `setCountry` to type `UpdateType`
- added enum `setCustomLineItemMoney` to type `UpdateType`
- added enum `setCustomLineItemTaxAmount` to type `UpdateType`
- added enum `setCustomLineItemTaxCategory` to type `UpdateType`
- added enum `setCustomLineItemTaxRate` to type `UpdateType`
- added enum `setCustomLineItemTaxedPrice` to type `UpdateType`
- added enum `setCustomLineItemTotalPrice` to type `UpdateType`
- added enum `setCustomShippingMethod` to type `UpdateType`
- added enum `setIsValid` to type `UpdateType`
- added enum `setLineItemDeactivatedAt` to type `UpdateType`
- added enum `setLineItemDiscountedPrice` to type `UpdateType`
- added enum `setLineItemDiscountedPricePerQuantity` to type `UpdateType`
- added enum `setLineItemDistributionChannel` to type `UpdateType`
- added enum `setLineItemPrice` to type `UpdateType`
- added enum `setLineItemProductKey` to type `UpdateType`
- added enum `setLineItemProductSlug` to type `UpdateType`
- added enum `setLineItemTaxAmount` to type `UpdateType`
- added enum `setLineItemTaxRate` to type `UpdateType`
- added enum `setLineItemTaxedPrice` to type `UpdateType`
- added enum `setLineItemTotalPrice` to type `UpdateType`
- added enum `setOrderTaxedPrice` to type `UpdateType`
- added enum `setOrderTotalPrice` to type `UpdateType`
- added enum `setOrderTotalTax` to type `UpdateType`
- added enum `setPrices` to type `UpdateType`
- added enum `setProductCount` to type `UpdateType`
- added enum `setProductSelections` to type `UpdateType`
- added enum `setProperty` to type `UpdateType`
- added enum `setPurchaseOrderNumber` to type `UpdateType`
- added enum `setReservations` to type `UpdateType`
- added enum `setSellerComment` to type `UpdateType`
- added enum `setShippingInfoPrice` to type `UpdateType`
- added enum `setShippingInfoTaxedPrice` to type `UpdateType`
- added enum `setShippingMethod` to type `UpdateType`
- added enum `setShippingMethodTaxAmount` to type `UpdateType`
- added enum `setShippingMethodTaxRate` to type `UpdateType`
- added enum `setShippingRate` to type `UpdateType`
- added enum `setShippingRateInput` to type `UpdateType`
- added enum `setStoreMode` to type `UpdateType`
- added enum `setSupplyChannels` to type `UpdateType`
- added enum `setValidTo` to type `UpdateType`
- added enum `setValue` to type `UpdateType`
- added enum `setVariantSelection` to type `UpdateType`
- added enum `DeclinedForRenegotiation` to type `QuoteState`
- added enum `associate-role` to type `ReferenceTypeId`
- added enum `business-unit` to type `ReferenceTypeId`
</details>



**Full Changelog**: https://github.com/commercetools/commercetools-sdk-java-v2/compare/14.4.1...14.5.0

# 14.4.1 (2023-06-26)

## What's Changed
* use gradle toolchain config by @jenschude in https://github.com/commercetools/commercetools-sdk-java-v2/pull/455

### Fixes

* fix unused instantiation of OAuthMiddleware

**Full Changelog**: https://github.com/commercetools/commercetools-sdk-java-v2/compare/14.4.0...14.4.1

# 14.4.0 (2023-06-20)

## What's Changed
* Add withkey interface to CustomFieldLocalizedEnumValue and CustomFieldEnumValue by @salander85 in https://github.com/commercetools/commercetools-sdk-java-v2/pull/452
* add feature to extract the GraphQL result data directly by @jenschude in https://github.com/commercetools/commercetools-sdk-java-v2/pull/451
* Update generated SDKs by @github-actions in https://github.com/commercetools/commercetools-sdk-java-v2/pull/449

**Api changes**

<details>
<summary>Deprecated Property(s)</summary>

- property `MyCartChangeLineItemQuantityAction::externalPrice` is removed
- property `MyCartChangeLineItemQuantityAction::externalTotalPrice` is removed
</details>


<details>
<summary>Required Property(s)</summary>

- changed property `parcelId` of type `StagedOrderRemoveParcelFromDeliveryAction` to be optional
- changed property `parcelId` of type `StagedOrderSetParcelCustomFieldAction` to be optional
- changed property `parcelId` of type `StagedOrderSetParcelCustomTypeAction` to be optional
- changed property `parcelId` of type `StagedOrderSetParcelItemsAction` to be optional
- changed property `parcelId` of type `StagedOrderSetParcelMeasurementsAction` to be optional
- changed property `parcelId` of type `StagedOrderSetParcelTrackingDataAction` to be optional
- changed property `parcelId` of type `OrderRemoveParcelFromDeliveryAction` to be optional
- changed property `parcelId` of type `OrderSetParcelCustomFieldAction` to be optional
- changed property `parcelId` of type `OrderSetParcelCustomTypeAction` to be optional
- changed property `parcelId` of type `OrderSetParcelItemsAction` to be optional
- changed property `parcelId` of type `OrderSetParcelMeasurementsAction` to be optional
- changed property `parcelId` of type `OrderSetParcelTrackingDataAction` to be optional
</details>


<details>
<summary>Added Property(s)</summary>

- added property `key` to type `LineItem`
- added property `key` to type `LineItemDraft`
- added property `key` to type `CartAddLineItemAction`
- added property `key` to type `MyLineItemDraft`
- added property `key` to type `MyCartAddLineItemAction`
- added property `sku` to type `StandalonePriceDeletedMessage`
- added property `sku` to type `StandalonePriceDeletedMessagePayload`
- added property `key` to type `StagedOrderAddLineItemAction`
- added property `parcelKey` to type `StagedOrderAddParcelToDeliveryAction`
- added property `parcelKey` to type `StagedOrderRemoveParcelFromDeliveryAction`
- added property `parcelKey` to type `StagedOrderSetParcelCustomFieldAction`
- added property `parcelKey` to type `StagedOrderSetParcelCustomTypeAction`
- added property `parcelKey` to type `StagedOrderSetParcelItemsAction`
- added property `parcelKey` to type `StagedOrderSetParcelMeasurementsAction`
- added property `parcelKey` to type `StagedOrderSetParcelTrackingDataAction`
- added property `key` to type `Parcel`
- added property `key` to type `ParcelDraft`
- added property `parcelKey` to type `OrderAddParcelToDeliveryAction`
- added property `parcelKey` to type `OrderRemoveParcelFromDeliveryAction`
- added property `parcelKey` to type `OrderSetParcelCustomFieldAction`
- added property `parcelKey` to type `OrderSetParcelCustomTypeAction`
- added property `parcelKey` to type `OrderSetParcelItemsAction`
- added property `parcelKey` to type `OrderSetParcelMeasurementsAction`
- added property `parcelKey` to type `OrderSetParcelTrackingDataAction`
</details>


<details>
<summary>Added Type(s)</summary>

- added type `CartSetLineItemInventoryModeAction`
- added type `MyCartSetDirectDiscountsAction`
- added type `StandalonePriceTierAddedMessage`
- added type `StandalonePriceTierRemovedMessage`
- added type `StandalonePriceTiersSetMessage`
- added type `StandalonePriceValidFromAndUntilSetMessage`
- added type `StandalonePriceValidFromSetMessage`
- added type `StandalonePriceValidUntilSetMessage`
- added type `StandalonePriceTierAddedMessagePayload`
- added type `StandalonePriceTierRemovedMessagePayload`
- added type `StandalonePriceTiersSetMessagePayload`
- added type `StandalonePriceValidFromAndUntilSetMessagePayload`
- added type `StandalonePriceValidFromSetMessagePayload`
- added type `StandalonePriceValidUntilSetMessagePayload`
- added type `StandalonePriceAddPriceTierAction`
- added type `StandalonePriceRemovePriceTierAction`
- added type `StandalonePriceSetPriceTiersAction`
- added type `StandalonePriceSetValidFromAction`
- added type `StandalonePriceSetValidFromAndUntilAction`
- added type `StandalonePriceSetValidUntilAction`
- added type `ConfluentCloudDestination`
</details>


<details>
<summary>Added Enum(s)</summary>

- added enum `RenegotiationAddressed` to type `QuoteState`
- added enum `associate-role` to type `CustomFieldReferenceValue`
- added enum `business-unit` to type `CustomFieldReferenceValue`
</details>

**Import changes**

<details>
<summary>Added Enum(s)</summary>

- added enum `associate-role` to type `CustomFieldReferenceValue`
- added enum `business-unit` to type `CustomFieldReferenceValue`
</details>

## New Contributors
* @salander85 made their first contribution in https://github.com/commercetools/commercetools-sdk-java-v2/pull/452

**Full Changelog**: https://github.com/commercetools/commercetools-sdk-java-v2/compare/14.3.0...14.4.0

# 14.3.0 (2023-06-02)

## New Features

### GraphQL

This release introduces a new module for type safe [GraphQL support](https://central.sonatype.com/artifact/com.commercetools.sdk/commercetools-graphql-api).

```java
import com.commercetools.graphql.api.*;

final GraphQLRequest<ProductQueryResult> productQuery = GraphQL
        .products(query -> query.localeProjection(Collections.singletonList("en")))
        .projection(root -> root.results().id().key().productType().key().getParent().createdAt().key());
```

The above code will create the following query string:

```
{
  products(localeProjection: ["en"]) {
    results {
      id
      key
      productType {
        key
      }
      createdAt
    }
  }
}
```

The module supports all operations defined by our GraphQL schema and the projections can be build type safe. More documentation can be found in the [javadoc](https://commercetools.github.io/commercetools-sdk-java-v2/javadoc/com/commercetools/docs/meta/GraphQL.html)

### Query predicates with input variables

This release introduces support for [input variables](https://docs.commercetools.com/api/predicates/query#input-variables) when using the query predicate builders

```java
            final CustomerPagedQueryResponse response = projectApiRoot
                    .customers()
                    .get()
                    .withQuery(c -> c.id().isVar("customerId"), "customerId", customer.getId())
                    .executeBlocking()
                    .getBody();
```

## What's Changed

* support query predicate variables by @jenschude in https://github.com/commercetools/commercetools-sdk-java-v2/pull/445
* add GraphQL module by @jenschude in https://github.com/commercetools/commercetools-sdk-java-v2/pull/446
* Update generated SDKs by @github-actions in https://github.com/commercetools/commercetools-sdk-java-v2/pull/448

**Api changes**

<details>
<summary>Added Property(s)</summary>

- added property `shippingKey` to type `CartSetShippingMethodTaxAmountAction`
- added property `shippingKey` to type `CartSetShippingMethodTaxRateAction`
- added property `shippingKey` to type `StagedOrderSetShippingMethodTaxAmountAction`
- added property `shippingKey` to type `StagedOrderSetShippingMethodTaxRateAction`
</details>


<details>
<summary>Added Type(s)</summary>

- added type `MoneyOverflowError`
- added type `GraphQLMoneyOverflowError`
- added type `QuoteCustomerChangedMessage`
- added type `QuoteRequestCustomerChangedMessage`
- added type `QuoteCustomerChangedMessagePayload`
- added type `QuoteRequestCustomerChangedMessagePayload`
- added type `QuoteRequestChangeCustomerAction`
- added type `QuoteChangeCustomerAction`
</details>


<details>
<summary>Added Resource(s)</summary>

- added resource `/{projectKey}/as-associate/{associateId}/in-business-unit/key={businessUnitKey}/carts/replicate`
</details>


<details>
<summary>Added Enum(s)</summary>

- added enum `ReassignMyQuotes` to type `Permission`
- added enum `ReassignOthersQuotes` to type `Permission`
</details>


<details>
<summary>Added Method(s)</summary>

- added method `apiRoot.withProjectKey().asAssociate().withAssociateIdValue().inBusinessUnitKeyWithBusinessUnitKeyValue().carts().replicate().post()`
</details>

**Full Changelog**: https://github.com/commercetools/commercetools-sdk-java-v2/compare/14.2.1...14.3.0

# 14.2.1 (2023-05-24)

## What's Changed
* fix query predicate helper method in PagedQueryResourceRequest by @jenschude in https://github.com/commercetools/commercetools-sdk-java-v2/pull/444


**Full Changelog**: https://github.com/commercetools/commercetools-sdk-java-v2/compare/14.2.0...14.2.1

# 14.2.0 (2023-05-24)

## New Features

### Query predicate builders

This release introduces type safe builders for [query predicates](https://docs.commercetools.com/api/predicates/query). 
```
final CustomerPagedQueryResponse response = CommercetoolsTestUtils.getProjectApiRoot()
        .customers()
        .get()
        .withExpand("customerGroup")
        .withQuery(c -> c.id().is(customer.getId()))
        .executeBlocking() 
        .getBody();
```

More examples can be found in this [test class](https://github.com/commercetools/commercetools-sdk-java-v2/blob/main/commercetools/commercetools-sdk-java-api/src/test/java/com/commercetools/api/predicates/query/QueryTests.java)

## What's Changed
* add SolutionInfo interface for more user agent details by @jenschude in https://github.com/commercetools/commercetools-sdk-java-v2/pull/441
* add query predicate builders by @jenschude in https://github.com/commercetools/commercetools-sdk-java-v2/pull/442
* Update generated SDKs by @github-actions in https://github.com/commercetools/commercetools-sdk-java-v2/pull/440
* Add WithKey interface to AttributePlainEnumValue and AttributeLocalizedEnumValue by @lojzatran in https://github.com/commercetools/commercetools-sdk-java-v2/pull/443

**Api changes**

<details>
<summary>Added Property(s)</summary>

- added property `associateRoleAssignments` to type `Associate`
- added property `associateRoleAssignments` to type `AssociateDraft`
- added property `associateMode` to type `BusinessUnit`
- added property `inheritedAssociates` to type `BusinessUnit`
- added property `associateMode` to type `BusinessUnitDraft`
- added property `associateMode` to type `Company`
- added property `inheritedAssociates` to type `Company`
- added property `associateMode` to type `CompanyDraft`
- added property `associateMode` to type `Division`
- added property `inheritedAssociates` to type `Division`
- added property `associateMode` to type `DivisionDraft`
- added property `associateRoleAssignments` to type `MyBusinessUnitAssociateDraft`
- added property `deliveryKey` to type `StagedOrderAddDeliveryAction`
- added property `deliveryKey` to type `StagedOrderAddParcelToDeliveryAction`
- added property `deliveryKey` to type `StagedOrderRemoveDeliveryAction`
- added property `deliveryKey` to type `StagedOrderSetDeliveryAddressAction`
- added property `deliveryKey` to type `StagedOrderSetDeliveryAddressCustomFieldAction`
- added property `deliveryKey` to type `StagedOrderSetDeliveryAddressCustomTypeAction`
- added property `deliveryKey` to type `StagedOrderSetDeliveryCustomFieldAction`
- added property `deliveryKey` to type `StagedOrderSetDeliveryCustomTypeAction`
- added property `deliveryKey` to type `StagedOrderSetDeliveryItemsAction`
- added property `key` to type `Delivery`
- added property `key` to type `DeliveryDraft`
- added property `deliveryKey` to type `OrderAddDeliveryAction`
- added property `deliveryKey` to type `OrderAddParcelToDeliveryAction`
- added property `deliveryKey` to type `OrderRemoveDeliveryAction`
- added property `deliveryKey` to type `OrderSetDeliveryAddressAction`
- added property `deliveryKey` to type `OrderSetDeliveryAddressCustomFieldAction`
- added property `deliveryKey` to type `OrderSetDeliveryAddressCustomTypeAction`
- added property `deliveryKey` to type `OrderSetDeliveryCustomFieldAction`
- added property `deliveryKey` to type `OrderSetDeliveryCustomTypeAction`
- added property `deliveryKey` to type `OrderSetDeliveryItemsAction`
- added property `sku` to type `ProductRemovePriceAction`
- added property `variantId` to type `ProductRemovePriceAction`
- added property `price` to type `ProductRemovePriceAction`
- added property `myBusinessUnitAssociateRoleOnCreation` to type `BusinessUnitConfiguration`
</details>


<details>
<summary>Required Property(s)</summary>

- changed property `deliveryId` of type `StagedOrderAddParcelToDeliveryAction` to be optional
- changed property `deliveryId` of type `StagedOrderRemoveDeliveryAction` to be optional
- changed property `deliveryId` of type `StagedOrderSetDeliveryAddressAction` to be optional
- changed property `deliveryId` of type `StagedOrderSetDeliveryAddressCustomFieldAction` to be optional
- changed property `deliveryId` of type `StagedOrderSetDeliveryAddressCustomTypeAction` to be optional
- changed property `deliveryId` of type `StagedOrderSetDeliveryCustomFieldAction` to be optional
- changed property `deliveryId` of type `StagedOrderSetDeliveryCustomTypeAction` to be optional
- changed property `deliveryId` of type `StagedOrderSetDeliveryItemsAction` to be optional
- changed property `deliveryId` of type `OrderAddParcelToDeliveryAction` to be optional
- changed property `deliveryId` of type `OrderRemoveDeliveryAction` to be optional
- changed property `deliveryId` of type `OrderSetDeliveryAddressAction` to be optional
- changed property `deliveryId` of type `OrderSetDeliveryAddressCustomFieldAction` to be optional
- changed property `deliveryId` of type `OrderSetDeliveryAddressCustomTypeAction` to be optional
- changed property `deliveryId` of type `OrderSetDeliveryCustomFieldAction` to be optional
- changed property `deliveryId` of type `OrderSetDeliveryCustomTypeAction` to be optional
- changed property `deliveryId` of type `OrderSetDeliveryItemsAction` to be optional
</details>


<details>
<summary>MarkDeprecated Property(s)</summary>

- marked property `Associate::roles` as deprecated
- marked property `AssociateDraft::roles` as deprecated
</details>


<details>
<summary>Changed Property(s)</summary>

- :warning: changed property `roles` of type `Associate` from type `AssociateRole[]` to `AssociateRoleDeprecated[]`
- :warning: changed property `roles` of type `AssociateDraft` from type `AssociateRole[]` to `AssociateRoleDeprecated[]`
</details>


<details>
<summary>Added Type(s)</summary>

- added type `AssociateRoleDraft`
- added type `AssociateRoleKeyReference`
- added type `AssociateRolePagedQueryResponse`
- added type `AssociateRoleReference`
- added type `AssociateRoleResourceIdentifier`
- added type `AssociateRoleUpdate`
- added type `AssociateRoleUpdateAction`
- added type `Permission`
- added type `AssociateRoleAddPermissionAction`
- added type `AssociateRoleChangeBuyerAssignableAction`
- added type `AssociateRoleRemovePermissionAction`
- added type `AssociateRoleSetCustomFieldAction`
- added type `AssociateRoleSetCustomTypeAction`
- added type `AssociateRoleSetNameAction`
- added type `AssociateRoleSetPermissionsAction`
- added type `AssociateRoleAssignment`
- added type `AssociateRoleAssignmentDraft`
- added type `AssociateRoleDeprecated`
- added type `AssociateRoleInheritanceMode`
- added type `BusinessUnitAssociateMode`
- added type `InheritedAssociate`
- added type `InheritedAssociateRoleAssignment`
- added type `BusinessUnitChangeAssociateModeAction`
- added type `AssociateMissingPermissionError`
- added type `GraphQLAssociateMissingPermissionError`
- added type `AssociateRoleBuyerAssignableChangedMessage`
- added type `AssociateRoleCreatedMessage`
- added type `AssociateRoleDeletedMessage`
- added type `AssociateRoleNameChangedMessage`
- added type `AssociateRolePermissionAddedMessage`
- added type `AssociateRolePermissionRemovedMessage`
- added type `AssociateRolePermissionsSetMessage`
- added type `BusinessUnitAssociateModeChangedMessage`
- added type `AssociateRoleBuyerAssignableChangedMessagePayload`
- added type `AssociateRoleCreatedMessagePayload`
- added type `AssociateRoleDeletedMessagePayload`
- added type `AssociateRoleNameChangedMessagePayload`
- added type `AssociateRolePermissionAddedMessagePayload`
- added type `AssociateRolePermissionRemovedMessagePayload`
- added type `AssociateRolePermissionsSetMessagePayload`
- added type `BusinessUnitAssociateModeChangedMessagePayload`
- added type `ProjectSetBusinessUnitAssociateRoleOnCreationAction`
</details>


<details>
<summary>Changed Type(s)</summary>

- :warning: changed type `AssociateRole` from type `string` to `BaseResource`
</details>


<details>
<summary>Added Resource(s)</summary>

- added resource `/{projectKey}/as-associate`
- added resource `/{projectKey}/associate-roles`
- added resource `/{projectKey}/as-associate/{associateId}`
- added resource `/{projectKey}/as-associate/{associateId}/business-units`
- added resource `/{projectKey}/as-associate/{associateId}/in-business-unit/key={businessUnitKey}`
- added resource `/{projectKey}/as-associate/{associateId}/business-units/key={key}`
- added resource `/{projectKey}/as-associate/{associateId}/business-units/{ID}`
- added resource `/{projectKey}/as-associate/{associateId}/in-business-unit/key={businessUnitKey}/carts`
- added resource `/{projectKey}/as-associate/{associateId}/in-business-unit/key={businessUnitKey}/orders`
- added resource `/{projectKey}/as-associate/{associateId}/in-business-unit/key={businessUnitKey}/quotes`
- added resource `/{projectKey}/as-associate/{associateId}/in-business-unit/key={businessUnitKey}/quote-requests`
- added resource `/{projectKey}/as-associate/{associateId}/in-business-unit/key={businessUnitKey}/carts/key={key}`
- added resource `/{projectKey}/as-associate/{associateId}/in-business-unit/key={businessUnitKey}/carts/{ID}`
- added resource `/{projectKey}/as-associate/{associateId}/in-business-unit/key={businessUnitKey}/orders/quotes`
- added resource `/{projectKey}/as-associate/{associateId}/in-business-unit/key={businessUnitKey}/orders/order-number={orderNumber}`
- added resource `/{projectKey}/as-associate/{associateId}/in-business-unit/key={businessUnitKey}/orders/{ID}`
- added resource `/{projectKey}/as-associate/{associateId}/in-business-unit/key={businessUnitKey}/quotes/key={key}`
- added resource `/{projectKey}/as-associate/{associateId}/in-business-unit/key={businessUnitKey}/quotes/{ID}`
- added resource `/{projectKey}/as-associate/{associateId}/in-business-unit/key={businessUnitKey}/quote-requests/key={key}`
- added resource `/{projectKey}/as-associate/{associateId}/in-business-unit/key={businessUnitKey}/quote-requests/{ID}`
- added resource `/{projectKey}/associate-roles/key={key}`
- added resource `/{projectKey}/associate-roles/{ID}`
</details>


<details>
<summary>Added Enum(s)</summary>

- added enum `associate-role` to type `ReferenceTypeId`
- added enum `associate-role` to type `MessageSubscriptionResourceTypeId`
- added enum `associate-role` to type `ResourceTypeId`
</details>


<details>
<summary>Added Method(s)</summary>

- added method `apiRoot.withProjectKey().associateRoles().get()`
- added method `apiRoot.withProjectKey().associateRoles().post()`
- added method `apiRoot.withProjectKey().asAssociate().withAssociateIdValue().businessUnits().get()`
- added method `apiRoot.withProjectKey().asAssociate().withAssociateIdValue().businessUnits().post()`
- added method `apiRoot.withProjectKey().asAssociate().withAssociateIdValue().businessUnits().withKey().get()`
- added method `apiRoot.withProjectKey().asAssociate().withAssociateIdValue().businessUnits().withKey().post()`
- added method `apiRoot.withProjectKey().asAssociate().withAssociateIdValue().businessUnits().withId().get()`
- added method `apiRoot.withProjectKey().asAssociate().withAssociateIdValue().businessUnits().withId().post()`
- added method `apiRoot.withProjectKey().asAssociate().withAssociateIdValue().inBusinessUnitKeyWithBusinessUnitKeyValue().carts().get()`
- added method `apiRoot.withProjectKey().asAssociate().withAssociateIdValue().inBusinessUnitKeyWithBusinessUnitKeyValue().carts().post()`
- added method `apiRoot.withProjectKey().asAssociate().withAssociateIdValue().inBusinessUnitKeyWithBusinessUnitKeyValue().orders().get()`
- added method `apiRoot.withProjectKey().asAssociate().withAssociateIdValue().inBusinessUnitKeyWithBusinessUnitKeyValue().orders().post()`
- added method `apiRoot.withProjectKey().asAssociate().withAssociateIdValue().inBusinessUnitKeyWithBusinessUnitKeyValue().quotes().get()`
- added method `apiRoot.withProjectKey().asAssociate().withAssociateIdValue().inBusinessUnitKeyWithBusinessUnitKeyValue().quoteRequests().get()`
- added method `apiRoot.withProjectKey().asAssociate().withAssociateIdValue().inBusinessUnitKeyWithBusinessUnitKeyValue().quoteRequests().post()`
- added method `apiRoot.withProjectKey().asAssociate().withAssociateIdValue().inBusinessUnitKeyWithBusinessUnitKeyValue().carts().withKey().get()`
- added method `apiRoot.withProjectKey().asAssociate().withAssociateIdValue().inBusinessUnitKeyWithBusinessUnitKeyValue().carts().withKey().post()`
- added method `apiRoot.withProjectKey().asAssociate().withAssociateIdValue().inBusinessUnitKeyWithBusinessUnitKeyValue().carts().withKey().delete()`
- added method `apiRoot.withProjectKey().asAssociate().withAssociateIdValue().inBusinessUnitKeyWithBusinessUnitKeyValue().carts().withId().get()`
- added method `apiRoot.withProjectKey().asAssociate().withAssociateIdValue().inBusinessUnitKeyWithBusinessUnitKeyValue().carts().withId().post()`
- added method `apiRoot.withProjectKey().asAssociate().withAssociateIdValue().inBusinessUnitKeyWithBusinessUnitKeyValue().carts().withId().delete()`
- added method `apiRoot.withProjectKey().asAssociate().withAssociateIdValue().inBusinessUnitKeyWithBusinessUnitKeyValue().orders().orderQuote().post()`
- added method `apiRoot.withProjectKey().asAssociate().withAssociateIdValue().inBusinessUnitKeyWithBusinessUnitKeyValue().orders().withOrderNumber().get()`
- added method `apiRoot.withProjectKey().asAssociate().withAssociateIdValue().inBusinessUnitKeyWithBusinessUnitKeyValue().orders().withOrderNumber().post()`
- added method `apiRoot.withProjectKey().asAssociate().withAssociateIdValue().inBusinessUnitKeyWithBusinessUnitKeyValue().orders().withId().get()`
- added method `apiRoot.withProjectKey().asAssociate().withAssociateIdValue().inBusinessUnitKeyWithBusinessUnitKeyValue().orders().withId().post()`
- added method `apiRoot.withProjectKey().asAssociate().withAssociateIdValue().inBusinessUnitKeyWithBusinessUnitKeyValue().quotes().withKey().get()`
- added method `apiRoot.withProjectKey().asAssociate().withAssociateIdValue().inBusinessUnitKeyWithBusinessUnitKeyValue().quotes().withKey().post()`
- added method `apiRoot.withProjectKey().asAssociate().withAssociateIdValue().inBusinessUnitKeyWithBusinessUnitKeyValue().quotes().withId().get()`
- added method `apiRoot.withProjectKey().asAssociate().withAssociateIdValue().inBusinessUnitKeyWithBusinessUnitKeyValue().quotes().withId().post()`
- added method `apiRoot.withProjectKey().asAssociate().withAssociateIdValue().inBusinessUnitKeyWithBusinessUnitKeyValue().quoteRequests().withKey().get()`
- added method `apiRoot.withProjectKey().asAssociate().withAssociateIdValue().inBusinessUnitKeyWithBusinessUnitKeyValue().quoteRequests().withKey().post()`
- added method `apiRoot.withProjectKey().asAssociate().withAssociateIdValue().inBusinessUnitKeyWithBusinessUnitKeyValue().quoteRequests().withId().get()`
- added method `apiRoot.withProjectKey().asAssociate().withAssociateIdValue().inBusinessUnitKeyWithBusinessUnitKeyValue().quoteRequests().withId().post()`
- added method `apiRoot.withProjectKey().associateRoles().withKey().get()`
- added method `apiRoot.withProjectKey().associateRoles().withKey().post()`
- added method `apiRoot.withProjectKey().associateRoles().withKey().delete()`
- added method `apiRoot.withProjectKey().associateRoles().withId().get()`
- added method `apiRoot.withProjectKey().associateRoles().withId().post()`
- added method `apiRoot.withProjectKey().associateRoles().withId().delete()`
</details>

**Import changes**

<details>
<summary>Added Type(s)</summary>

- added type `TypeImportRequest`
- added type `TypeTextInputHint`
- added type `ResourceTypeId`
- added type `FieldType`
- added type `CustomFieldBooleanType`
- added type `CustomFieldDateTimeType`
- added type `CustomFieldDateType`
- added type `CustomFieldEnumType`
- added type `CustomFieldEnumValue`
- added type `CustomFieldLocalizedEnumType`
- added type `CustomFieldLocalizedEnumValue`
- added type `CustomFieldLocalizedStringType`
- added type `CustomFieldMoneyType`
- added type `CustomFieldNumberType`
- added type `CustomFieldReferenceType`
- added type `CustomFieldReferenceValue`
- added type `CustomFieldSetType`
- added type `CustomFieldStringType`
- added type `CustomFieldTimeType`
- added type `FieldDefinition`
- added type `TypeImport`
</details>


<details>
<summary>Added Resource(s)</summary>

- added resource `/{projectKey}/types`
- added resource `/{projectKey}/types/import-containers`
- added resource `/{projectKey}/types/import-containers/{importContainerKey}`
</details>


<details>
<summary>Added Enum(s)</summary>

- added enum `type` to type `ImportResourceType`
</details>


<details>
<summary>Added Method(s)</summary>

- added method `apiRoot.withProjectKeyValue().types().importContainers().withImportContainerKeyValue().post()`
</details>

**History changes**

<details>
<summary>Added Type(s)</summary>

- added type `SetCountriesChange`
- added type `SetPurchaseOrderNumberChange`
- added type `StoreCountry`
</details>


<details>
<summary>Removed QueryParameter(s)</summary>

- :warning: removed query parameter `resourceType` from method `get /{projectKey}`
</details>


<details>
<summary>Added QueryParameter(s)</summary>

- added query parameter `resourceTypes` to method `get /{projectKey}`
</details>


**Full Changelog**: https://github.com/commercetools/commercetools-sdk-java-v2/compare/14.1.0...14.2.0

# 14.1.0 (2023-05-02)

## What's Changed
* Update generated SDKs by @github-actions in https://github.com/commercetools/commercetools-sdk-java-v2/pull/435
* Update generated SDKs by @github-actions in https://github.com/commercetools/commercetools-sdk-java-v2/pull/436
* Update generated SDKs by @github-actions in https://github.com/commercetools/commercetools-sdk-java-v2/pull/439

**Api changes**

<details>
<summary>Added Property(s)</summary>

- added property `field` to type `OrderSearchSorting`
- added property `language` to type `OrderSearchSorting`
- added property `order` to type `OrderSearchSorting`
- added property `mode` to type `OrderSearchSorting`
- added property `filter` to type `OrderSearchSorting`
- added property `mode` to type `ProductSelection`
- added property `mode` to type `ProductSelectionDraft`
</details>


<details>
<summary>Changed Property(s)</summary>

- :warning: changed property `productSelection` of type `ProductSelectionCreatedMessage` from type `ProductSelectionType` to `ProductSelection`
- :warning: changed property `productSelection` of type `ProductSelectionCreatedMessagePayload` from type `ProductSelectionType` to `ProductSelection`
</details>


<details>
<summary>MarkDeprecated Property(s)</summary>

- marked property `IndividualExclusionProductSelectionType::type` as deprecated
- marked property `IndividualProductSelectionType::type` as deprecated
- marked property `ProductSelection::type` as deprecated
- marked property `ProductSelectionDraft::type` as deprecated
- marked property `ProductSelectionType::type` as deprecated
</details>


<details>
<summary>Required Property(s)</summary>

- changed property `type` of type `ProductSelection` to be optional
</details>


<details>
<summary>MarkDeprecated Type(s)</summary>

- marked type `IndividualExclusionProductSelectionType` as deprecated
- marked type `IndividualProductSelectionType` as deprecated
- marked type `ProductSelectionType` as deprecated
- marked type `ProductSelectionTypeEnum` as deprecated
</details>


<details>
<summary>Added Type(s)</summary>

- added type `OrderSearchAndExpression`
- added type `OrderSearchAnyValue`
- added type `OrderSearchCompoundExpression`
- added type `OrderSearchDateRangeExpression`
- added type `OrderSearchDateRangeValue`
- added type `OrderSearchExactExpression`
- added type `OrderSearchExistsExpression`
- added type `OrderSearchFilterExpression`
- added type `OrderSearchFullTextExpression`
- added type `OrderSearchFullTextValue`
- added type `OrderSearchLongRangeExpression`
- added type `OrderSearchLongRangeValue`
- added type `OrderSearchMatchType`
- added type `OrderSearchNotExpression`
- added type `OrderSearchNumberRangeExpression`
- added type `OrderSearchNumberRangeValue`
- added type `OrderSearchOrExpression`
- added type `OrderSearchPrefixExpression`
- added type `OrderSearchQueryExpression`
- added type `OrderSearchQueryExpressionValue`
- added type `OrderSearchSortMode`
- added type `OrderSearchSortOrder`
- added type `OrderSearchStringValue`
- added type `OrderSearchWildCardExpression`
- added type `ProductSelectionMode`
</details>

**Full Changelog**: https://github.com/commercetools/commercetools-sdk-java-v2/compare/14.0.0...14.1.0

# 14.0.0 (2023-04-18)

## What's Changed
* add CompletableFutureUtils by @jenschude in https://github.com/commercetools/commercetools-sdk-java-v2/pull/430
* Update generated SDKs by @github-actions in https://github.com/commercetools/commercetools-sdk-java-v2/pull/428
* Update generated SDKs by @github-actions in https://github.com/commercetools/commercetools-sdk-java-v2/pull/431
* update gradle by @jenschude in https://github.com/commercetools/commercetools-sdk-java-v2/pull/432
* Update all dependencies by @renovate in https://github.com/commercetools/commercetools-sdk-java-v2/pull/362
* Update generated SDKs by @github-actions in https://github.com/commercetools/commercetools-sdk-java-v2/pull/433

**Api changes**

<details>
<summary>Added Enum(s)</summary>

- added enum `direct-discount` to type `ReferenceTypeId`
</details>


<details>
<summary>Added Property(s)</summary>

- added property `shippingKey` to type `Cart`
- added property `shippingCustomFields` to type `Cart`
- added property `shippingKey` to type `StagedOrder`
- added property `shippingCustomFields` to type `StagedOrder`
- added property `shippingKey` to type `Order`
- added property `shippingCustomFields` to type `Order`
</details>


<details>
<summary>Changed Property(s)</summary>

- :warning: changed property `discount` of type `DiscountedLineItemPortion` from type `CartDiscountReference` to `Reference`
</details>


<details>
<summary>Added Type(s)</summary>

- added type `DirectDiscountReference`
</details>

### Breaking change ###

With the introduction of DirectDiscounts the property `discount` in `DiscountedLineItemPortion` has changed from `CartDiscountReference` to `Reference`.

**Full Changelog**: https://github.com/commercetools/commercetools-sdk-java-v2/compare/13.3.0...14.0.0

# 13.3.0 (2023-04-12)

## What's Changed
* Add new integration tests by @lojzatran in https://github.com/commercetools/commercetools-sdk-java-v2/pull/408
* Update generated SDKs by @github-actions in https://github.com/commercetools/commercetools-sdk-java-v2/pull/425
* add helper methods to set the form params for a product projection se… by @jenschude in https://github.com/commercetools/commercetools-sdk-java-v2/pull/426

**Api changes**

<details>
<summary>Added Property(s)</summary>

- added property `key` to type `TaxRate`
- added property `key` to type `TaxRateDraft`
- added property `taxRateKey` to type `TaxCategoryRemoveTaxRateAction`
- added property `taxRateKey` to type `TaxCategoryReplaceTaxRateAction`
</details>


<details>
<summary>Required Property(s)</summary>

- changed property `taxRateId` of type `TaxCategoryRemoveTaxRateAction` to be optional
- changed property `taxRateId` of type `TaxCategoryReplaceTaxRateAction` to be optional
</details>


## New Contributors
* @lojzatran made their first contribution in https://github.com/commercetools/commercetools-sdk-java-v2/pull/408

**Full Changelog**: https://github.com/commercetools/commercetools-sdk-java-v2/compare/13.2.0...13.3.0

# 13.2.0 (2023-03-31)

## What's Changed
* Update generated SDKs by @github-actions in https://github.com/commercetools/commercetools-sdk-java-v2/pull/421
* Update generated SDKs by @github-actions in https://github.com/commercetools/commercetools-sdk-java-v2/pull/422
* add Product.toProjection helper method by @jenschude in https://github.com/commercetools/commercetools-sdk-java-v2/pull/423
* Update generated SDKs by @github-actions in https://github.com/commercetools/commercetools-sdk-java-v2/pull/424

**Api changes**

<details>
<summary>Added Property(s)</summary>

- added property `extensions` to type `GraphQLError`
</details>


<details>
<summary>Required Property(s)</summary>

- changed property `roles` of type `AssociateDraft` to be optional
- changed property `path` of type `GraphQLError` to be optional
</details>


<details>
<summary>Added Type(s)</summary>

- added type `GraphQLAnonymousIdAlreadyInUseError`
- added type `GraphQLAttributeDefinitionAlreadyExistsError`
- added type `GraphQLAttributeDefinitionTypeConflictError`
- added type `GraphQLAttributeNameDoesNotExistError`
- added type `GraphQLBadGatewayError`
- added type `GraphQLConcurrentModificationError`
- added type `GraphQLCountryNotConfiguredInStoreError`
- added type `GraphQLDiscountCodeNonApplicableError`
- added type `GraphQLDuplicateAttributeValueError`
- added type `GraphQLDuplicateAttributeValuesError`
- added type `GraphQLDuplicateEnumValuesError`
- added type `GraphQLDuplicateFieldError`
- added type `GraphQLDuplicateFieldWithConflictingResourceError`
- added type `GraphQLDuplicatePriceKeyError`
- added type `GraphQLDuplicatePriceScopeError`
- added type `GraphQLDuplicateStandalonePriceScopeError`
- added type `GraphQLDuplicateVariantValuesError`
- added type `GraphQLEditPreviewFailedError`
- added type `GraphQLEnumKeyAlreadyExistsError`
- added type `GraphQLEnumKeyDoesNotExistError`
- added type `GraphQLEnumValueIsUsedError`
- added type `GraphQLEnumValuesMustMatchError`
- added type `GraphQLErrorObject`
- added type `GraphQLExtensionBadResponseError`
- added type `GraphQLExtensionNoResponseError`
- added type `GraphQLExtensionPredicateEvaluationFailedError`
- added type `GraphQLExtensionUpdateActionsFailedError`
- added type `GraphQLExternalOAuthFailedError`
- added type `GraphQLFeatureRemovedError`
- added type `GraphQLGeneralError`
- added type `GraphQLInsufficientScopeError`
- added type `GraphQLInternalConstraintViolatedError`
- added type `GraphQLInvalidCredentialsError`
- added type `GraphQLInvalidCurrentPasswordError`
- added type `GraphQLInvalidFieldError`
- added type `GraphQLInvalidInputError`
- added type `GraphQLInvalidItemShippingDetailsError`
- added type `GraphQLInvalidJsonInputError`
- added type `GraphQLInvalidOperationError`
- added type `GraphQLInvalidSubjectError`
- added type `GraphQLInvalidTokenError`
- added type `GraphQLLanguageUsedInStoresError`
- added type `GraphQLMatchingPriceNotFoundError`
- added type `GraphQLMaxResourceLimitExceededError`
- added type `GraphQLMissingRoleOnChannelError`
- added type `GraphQLMissingTaxRateForCountryError`
- added type `GraphQLNoMatchingProductDiscountFoundError`
- added type `GraphQLNotEnabledError`
- added type `GraphQLObjectNotFoundError`
- added type `GraphQLOutOfStockError`
- added type `GraphQLOverCapacityError`
- added type `GraphQLOverlappingStandalonePriceValidityError`
- added type `GraphQLPendingOperationError`
- added type `GraphQLPriceChangedError`
- added type `GraphQLProductAssignmentMissingError`
- added type `GraphQLProductPresentWithDifferentVariantSelectionError`
- added type `GraphQLProjectNotConfiguredForLanguagesError`
- added type `GraphQLQueryComplexityLimitExceededError`
- added type `GraphQLQueryTimedOutError`
- added type `GraphQLReferenceExistsError`
- added type `GraphQLReferencedResourceNotFoundError`
- added type `GraphQLRequiredFieldError`
- added type `GraphQLResourceNotFoundError`
- added type `GraphQLResourceSizeLimitExceededError`
- added type `GraphQLSearchDeactivatedError`
- added type `GraphQLSearchExecutionFailureError`
- added type `GraphQLSearchFacetPathNotFoundError`
- added type `GraphQLSearchIndexingInProgressError`
- added type `GraphQLSemanticErrorError`
- added type `GraphQLShippingMethodDoesNotMatchCartError`
- added type `GraphQLSyntaxErrorError`
</details>

**Import changes**

<details>
<summary>Added Property(s)</summary>

- added property `custom` to type `Parcel`
</details>



**Full Changelog**: https://github.com/commercetools/commercetools-sdk-java-v2/compare/13.1.0...13.2.0

# 13.1.0 (2023-03-27)

## What's Changed
* Add NewRelic monitoring middleware by @jenschude in https://github.com/commercetools/commercetools-sdk-java-v2/pull/415
* Update generated SDKs by @github-actions in https://github.com/commercetools/commercetools-sdk-java-v2/pull/411
* Update generated SDKs by @github-actions in https://github.com/commercetools/commercetools-sdk-java-v2/pull/416
* Update generated SDKs by @github-actions in https://github.com/commercetools/commercetools-sdk-java-v2/pull/417
* Update generated SDKs by @github-actions in https://github.com/commercetools/commercetools-sdk-java-v2/pull/418
* Update generated SDKs by @github-actions in https://github.com/commercetools/commercetools-sdk-java-v2/pull/419
* Update generated SDKs by @github-actions in https://github.com/commercetools/commercetools-sdk-java-v2/pull/420

**Api changes**

<details>
<summary>MarkDeprecated Type(s)</summary>

- marked type `ProductVariantSelectionExclusion` as deprecated
- marked type `ProductVariantSelectionInclusion` as deprecated
</details>


<details>
<summary>Added Type(s)</summary>

- added type `ProductSelectionProductExcludedMessage`
- added type `ProductSelectionVariantExclusionChangedMessage`
- added type `ProductSelectionProductExcludedMessagePayload`
- added type `ProductSelectionVariantExclusionChangedMessagePayload`
- added type `IndividualExclusionProductSelectionType`
- added type `ProductVariantExclusion`
- added type `ProductVariantSelectionIncludeAllExcept`
- added type `ProductVariantSelectionIncludeOnly`
- added type `ProductSelectionExcludeProductAction`
- added type `ProductSelectionSetVariantExclusionAction`
</details>


<details>
<summary>Added Enum(s)</summary>

- added enum `individualExclusion` to type `ProductSelectionTypeEnum`
- added enum `includeOnly` to type `ProductVariantSelectionTypeEnum`
- added enum `includeAllExcept` to type `ProductVariantSelectionTypeEnum`
</details>


<details>
<summary>Changed Property(s)</summary>

- :warning: changed property `productSelection` of type `ProductSelectionCreatedMessage` from type `IndividualProductSelectionType` to `ProductSelectionType`
- :warning: changed property `productSelection` of type `ProductSelectionCreatedMessagePayload` from type `IndividualProductSelectionType` to `ProductSelectionType`
</details>


<details>
<summary>Added Property(s)</summary>

- added property `variantExclusion` to type `AssignedProductReference`
- added property `variantExclusion` to type `AssignedProductSelection`
- added property `variantExclusion` to type `ProductSelectionAssignment`
- added property `type` to type `ProductSelectionDraft`
</details>


**Full Changelog**: https://github.com/commercetools/commercetools-sdk-java-v2/compare/13.0.1...13.1.0

# 13.0.1 (2023-03-20)

## What's Changed
* Javadoc by @barbara79 in https://github.com/commercetools/commercetools-sdk-java-v2/pull/413
* fix class cast exception for MoneyUtils by @jenschude in https://github.com/commercetools/commercetools-sdk-java-v2/pull/414


**Full Changelog**: https://github.com/commercetools/commercetools-sdk-java-v2/compare/13.0.0...13.0.1

# 13.0.0 (2023-03-06)

## What's Changed
* Update generated SDKs by @github-actions in https://github.com/commercetools/commercetools-sdk-java-v2/pull/398
* context aware client, request and response by @jenschude in https://github.com/commercetools/commercetools-sdk-java-v2/pull/400
* add interface for ProjectApiRoot by @jenschude in https://github.com/commercetools/commercetools-sdk-java-v2/pull/405
* update dependencies by @jenschude in https://github.com/commercetools/commercetools-sdk-java-v2/pull/406
* Update generated SDKs by @github-actions in https://github.com/commercetools/commercetools-sdk-java-v2/pull/399
* various helper methods of the v1 SDK added by @barbara79 in https://github.com/commercetools/commercetools-sdk-java-v2/pull/401
* add mapping of v1 SDK commands to v2 request builders to javadoc by @jenschude in https://github.com/commercetools/commercetools-sdk-java-v2/pull/409

**Api changes**

<details>
<summary>Removed Property(s)</summary>

- :warning: removed property `externalTaxRate` from type `MyCartAddLineItemAction`
- :warning: removed property `externalPrice` from type `MyCartAddLineItemAction`
- :warning: removed property `externalTotalPrice` from type `MyCartAddLineItemAction`
</details>


<details>
<summary>Changed Property(s)</summary>

- :warning: changed property `totalPrice` of type `Cart` from type `TypedMoney` to `CentPrecisionMoney`
- :warning: changed property `totalPrice` of type `CustomLineItem` from type `TypedMoney` to `CentPrecisionMoney`
- :warning: changed property `externalTaxRate` of type `CustomShippingDraft` from type `string` to `ExternalTaxRateDraft`
- :warning: changed property `deliveries` of type `CustomShippingDraft` from type `Delivery[]` to `DeliveryDraft[]`
- :warning: changed property `custom` of type `CustomShippingDraft` from type `string` to `CustomFieldsDraft`
- :warning: changed property `totalPrice` of type `LineItem` from type `TypedMoney` to `CentPrecisionMoney`
- :warning: changed property `externalTaxRate` of type `ShippingDraft` from type `string` to `ExternalTaxRateDraft`
- :warning: changed property `deliveries` of type `ShippingDraft` from type `Delivery[]` to `DeliveryDraft[]`
- :warning: changed property `custom` of type `ShippingDraft` from type `string` to `CustomFieldsDraft`
- :warning: changed property `price` of type `ShippingInfo` from type `TypedMoney` to `CentPrecisionMoney`
- :warning: changed property `amount` of type `TaxPortion` from type `TypedMoney` to `CentPrecisionMoney`
- :warning: changed property `totalNet` of type `TaxedItemPrice` from type `TypedMoney` to `CentPrecisionMoney`
- :warning: changed property `totalGross` of type `TaxedItemPrice` from type `TypedMoney` to `CentPrecisionMoney`
- :warning: changed property `totalTax` of type `TaxedItemPrice` from type `TypedMoney` to `CentPrecisionMoney`
- :warning: changed property `totalNet` of type `TaxedPrice` from type `TypedMoney` to `CentPrecisionMoney`
- :warning: changed property `totalGross` of type `TaxedPrice` from type `TypedMoney` to `CentPrecisionMoney`
- :warning: changed property `totalTax` of type `TaxedPrice` from type `TypedMoney` to `CentPrecisionMoney`
- :warning: changed property `externalTaxRate` of type `CartAddCustomShippingMethodAction` from type `string` to `ExternalTaxRateDraft`
- :warning: changed property `deliveries` of type `CartAddCustomShippingMethodAction` from type `Delivery[]` to `DeliveryDraft[]`
- :warning: changed property `custom` of type `CartAddCustomShippingMethodAction` from type `string` to `CustomFieldsDraft`
- :warning: changed property `shippingMethod` of type `CartAddShippingMethodAction` from type `ShippingMethodReference` to `ShippingMethodResourceIdentifier`
- :warning: changed property `externalTaxRate` of type `CartAddShippingMethodAction` from type `string` to `ExternalTaxRateDraft`
- :warning: changed property `deliveries` of type `CartAddShippingMethodAction` from type `Delivery[]` to `DeliveryDraft[]`
- :warning: changed property `custom` of type `CartAddShippingMethodAction` from type `string` to `CustomFieldsDraft`
- :warning: changed property `businessUnit` of type `MyCartDraft` from type `BusinessUnitKeyReference` to `BusinessUnitResourceIdentifier`
- :warning: changed property `store` of type `MyCartDraft` from type `StoreKeyReference` to `StoreResourceIdentifier`
</details>


<details>
<summary>Required Property(s)</summary>

- :warning: changed property `inventoryMode` of type `Cart` to be required
- :warning: changed property `itemShippingAddresses` of type `Cart` to be required
- :warning: changed property `discountCodes` of type `Cart` to be required
- :warning: changed property `directDiscounts` of type `Cart` to be required
- :warning: changed property `shippingAddress` of type `ShippingDraft` to be required
- changed property `quantity` of type `CustomLineItemDraft` to be optional
- changed property `deliveries` of type `CustomShippingDraft` to be optional
- changed property `deliveries` of type `ShippingDraft` to be optional
- changed property `quantity` of type `CartAddCustomLineItemAction` to be optional
- changed property `deliveries` of type `CartAddCustomShippingMethodAction` to be optional
- changed property `deliveries` of type `CartAddShippingMethodAction` to be optional
- changed property `email` of type `CartSetCustomerEmailAction` to be optional
- changed property `quantity` of type `MyLineItemDraft` to be optional
</details>


<details>
<summary>Added Property(s)</summary>

- added property `shippingDetails` to type `CartAddCustomLineItemAction`
- added property `addedAt` to type `CartAddLineItemAction`
- added property `inventoryMode` to type `CartAddLineItemAction`
</details>


<details>
<summary>Added Resource(s)</summary>

- added resource `/{projectKey}/me/orders/quotes`
</details>


<details>
<summary>Added Method(s)</summary>

- added method `apiRoot.withProjectKey().me().orders().quotes().post()`
</details>


<details>
<summary>Removed Type(s)</summary>

- :warning: removed type `CountryNotConfiguredInStore`
</details>


<details>
<summary>Added Type(s)</summary>

- added type `CartSetBusinessUnitAction`
- added type `CountryNotConfiguredInStoreError`
- added type `GoogleCloudFunctionDestination`
- added type `MyOrderFromQuoteDraft`
- added type `MyCartSetBusinessUnitAction`
</details>


<details>
<summary>Added QueryParameter(s)</summary>

- added query parameter `sort` to method `get /{projectKey}/product-selections/key={key}/products`
- added query parameter `sort` to method `get /{projectKey}/product-selections/{ID}/products`
- added query parameter `expand` to method `get /{projectKey}/in-store/key={storeKey}/me/active-cart`
</details>


<details>
<summary>Added Enum(s)</summary>

- added enum `shipping` to type `ResourceTypeId`
</details>

**Import changes**

<details>
<summary>Required Property(s)</summary>

- changed property `password` of type `CustomerImport` to be optional
</details>


<details>
<summary>Added Property(s)</summary>

- added property `authenticationMode` to type `CustomerImport`
- added property `state` to type `OrderImport`
- added property `custom` to type `Address`
</details>


<details>
<summary>Added Type(s)</summary>

- added type `AuthenticationMode`
</details>


**Full Changelog**: https://github.com/commercetools/commercetools-sdk-java-v2/compare/12.1.0...13.0.0

# 12.1.0 (2023-02-10)

## What's Changed
* create mixin interfaces to reduce the code in the mixin raml file by @jenschude in https://github.com/commercetools/commercetools-sdk-java-v2/pull/394
* Update generated SDKs by @github-actions in https://github.com/commercetools/commercetools-sdk-java-v2/pull/393
* Update generated SDKs by @github-actions in https://github.com/commercetools/commercetools-sdk-java-v2/pull/395
* Update generated SDKs by @github-actions in https://github.com/commercetools/commercetools-sdk-java-v2/pull/396


**Full Changelog**: https://github.com/commercetools/commercetools-sdk-java-v2/compare/12.0.0...12.1.0

# 12.0.0 (2023-01-30)

## What's Changed
* add retry handler for delete methods by @jenschude in https://github.com/commercetools/commercetools-sdk-java-v2/pull/385
* Update generated SDKs by @github-actions in https://github.com/commercetools/commercetools-sdk-java-v2/pull/383
* Update generated SDKs by @github-actions in https://github.com/commercetools/commercetools-sdk-java-v2/pull/388
* Update generated SDKs by @github-actions in https://github.com/commercetools/commercetools-sdk-java-v2/pull/389
* Update generated SDKs by @github-actions in https://github.com/commercetools/commercetools-sdk-java-v2/pull/392

**Api changes**

<details>
<summary>Deprecated Type(s)</summary>

- type `IronMqDestination` is removed
</details>


<details>
<summary>Added Type(s)</summary>

- added type `OrderPurchaseOrderNumberSetMessage`
- added type `OrderPurchaseOrderNumberSetMessagePayload`
- added type `StagedOrderSetPurchaseOrderNumberAction`
- added type `OrderSetPurchaseOrderNumberAction`
</details>


<details>
<summary>Added Property(s)</summary>

- added property `purchaseOrderNumber` to type `StagedOrder`
- added property `purchaseOrderNumber` to type `Order`
- added property `purchaseOrderNumber` to type `OrderFromCartDraft`
- added property `purchaseOrderNumber` to type `QuoteRequest`
- added property `purchaseOrderNumber` to type `QuoteRequestDraft`
- added property `purchaseOrderNumber` to type `Quote`
- added property `purchaseOrderNumber` to type `StagedQuote`
</details>

### Breaking changes

- the leading slash from request builders have been removed and return now a relative path. E.g. ByProjectKeyCategoriesPost.buildHttpRequest creates now URI 'project-key/categories' instead of the previous '/project-key/categories'
- The ApiRootBuilder adds a traling slash to the baseUri to ensure the correct building of API URLs

The changes will only affect implementations relying on the URIs of the built requests.

**Full Changelog**: https://github.com/commercetools/commercetools-sdk-java-v2/compare/11.2.0...12.0.0

# 11.2.0 (2023-01-10)

## What's Changed

* refactor properties with union types by @jenschude in https://github.com/commercetools/commercetools-sdk-java-v2/pull/382

**Api changes**

- field `target` of `Review` changed to `Reference`
- field `target` of `ReviewDraft` changed to `ResourceIdentifier`
- field `reference` of `ReplicaCartDraft` changed to type `Reference`

**Deprecations**

- deprecated use of `setTarget(Object)` for `Review` and `ReviewDraft`
- deprecated use of `setReference(Object)` for `ReplicaCartDraft`
- deprecated `ReviewMixin`
- deprecated `ReplicaCartDraftMixin`

**Full Changelog**: https://github.com/commercetools/commercetools-sdk-java-v2/compare/11.1.0...11.2.0

# 11.1.0 (2023-01-09)

## What's Changed
* Update generated SDKs by @github-actions in https://github.com/commercetools/commercetools-sdk-java-v2/pull/378
* add WithKey and Draft interface by @jenschude in https://github.com/commercetools/commercetools-sdk-java-v2/pull/379
* Update generated SDKs by @github-actions in https://github.com/commercetools/commercetools-sdk-java-v2/pull/381

### Fixes

- fixed typo in `defaultShippingAddress` field of business unit models

**Api changes**

<details>
<summary>Added Property(s)</summary>

- added property `defaultShippingAddressId` to type `BusinessUnit`
- added property `defaultShippingAddress` to type `BusinessUnitDraft`
- added property `defaultShippingAddressId` to type `Company`
- added property `defaultShippingAddress` to type `CompanyDraft`
- added property `defaultShippingAddressId` to type `Division`
- added property `defaultShippingAddress` to type `DivisionDraft`
- added property `defaultShippingAddress` to type `MyBusinessUnitDraft`
- added property `defaultShippingAddress` to type `MyCompanyDraft`
- added property `defaultShippingAddress` to type `MyDivisionDraft`
</details>


<details>
<summary>Removed Property(s)</summary>

- :warning: removed property `defaultShipingAddressId` from type `BusinessUnit`
- :warning: removed property `defaultShipingAddress` from type `BusinessUnitDraft`
- :warning: removed property `defaultShipingAddressId` from type `Company`
- :warning: removed property `defaultShipingAddress` from type `CompanyDraft`
- :warning: removed property `defaultShipingAddressId` from type `Division`
- :warning: removed property `defaultShipingAddress` from type `DivisionDraft`
- :warning: removed property `defaultShipingAddress` from type `MyBusinessUnitDraft`
- :warning: removed property `defaultShipingAddress` from type `MyCompanyDraft`
- :warning: removed property `defaultShipingAddress` from type `MyDivisionDraft`
</details>


**Full Changelog**: https://github.com/commercetools/commercetools-sdk-java-v2/compare/11.0.0...11.1.0

# 11.0.0 (2022-12-21)

## What's Changed
* Update generated SDKs by @github-actions in https://github.com/commercetools/commercetools-sdk-java-v2/pull/377

### Fixes

- `MyQuoteRequestDraft` added the `cartId`and `cartVersion` field which replace the `cart` and `version` field
- fixed property `amount` of type `Transaction` from type `TypedMoney` to `CentPrecisionMoney`
- removed `ProductPriceSetMessage` and replaced with `ProductPricesSetMessage`

**Api changes**

<details>
<summary>Added Resource(s)</summary>

- added resource `/{projectKey}/shipping-methods/matching-cart-location`
</details>


<details>
<summary>Changed Property(s)</summary>

- :warning: changed property `amount` of type `Transaction` from type `TypedMoney` to `CentPrecisionMoney`
</details>


<details>
<summary>Added Property(s)</summary>

- added property `cartId` to type `MyQuoteRequestDraft`
- added property `cartVersion` to type `MyQuoteRequestDraft`
- added property `createdAt` to type `AssignedProductSelection`
- added property `quoteState` to type `Quote`
</details>


<details>
<summary>Required Property(s)</summary>

- changed property `discounted` of type `StagedStandalonePrice` to be optional
</details>


<details>
<summary>Removed Property(s)</summary>

- :warning: removed property `cart` from type `MyQuoteRequestDraft`
- :warning: removed property `version` from type `MyQuoteRequestDraft`
</details>


<details>
<summary>Added Type(s)</summary>

- added type `ProductPricesSetMessage`
- added type `ProductPricesSetMessagePayload`
</details>


<details>
<summary>Removed Type(s)</summary>

- :warning: removed type `ProductPriceSetMessage`
- :warning: removed type `ProductPriceSetMessagePayload`
</details>


<details>
<summary>Added Method(s)</summary>

- added method `apiRoot.withProjectKey().shippingMethods().matchingCartLocation().get()`
</details>


**Full Changelog**: https://github.com/commercetools/commercetools-sdk-java-v2/compare/10.1.0...11.0.0

# 10.1.0 (2022-12-14)

## What's Changed
* add helper method equalsIgnoreId to BaseAddress by @jenschude
* Update generated SDKs by @github-actions in https://github.com/commercetools/commercetools-sdk-java-v2/pull/376
* Add methods `update`, `delete` and `create` to resource request builders which accept a Resource e.g. Category instance

**Api changes**

<details>
<summary>Added Type(s)</summary>

- added type `DuplicatePriceKeyError`
- added type `ProductPriceKeySetMessage`
- added type `StandalonePriceKeySetMessage`
- added type `ProductPriceKeySetMessagePayload`
- added type `StandalonePriceKeySetMessagePayload`
- added type `ProductSetPriceKeyAction`
- added type `StandalonePriceSetKeyAction`
</details>


<details>
<summary>Removed Property(s)</summary>

- :warning: removed property `conflictingPrices` from type `DuplicatePriceScopeError`
</details>


<details>
<summary>Added Property(s)</summary>

- added property `conflictingPrice` to type `DuplicatePriceScopeError`
</details>

### Breaking Changes ###

- removed the missing data endpoints and models from the ML SDK module.

**Full Changelog**: https://github.com/commercetools/commercetools-sdk-java-v2/compare/10.0.0...10.1.0

# 10.0.0 (2022-12-07)

## What's Changed
* add test for order update by @jenschude in https://github.com/commercetools/commercetools-sdk-java-v2/pull/364
* refactor CtAsyncHttpClient to use a ThrottleRequestFilter instead of … by @jenschude in https://github.com/commercetools/commercetools-sdk-java-v2/pull/366
* add reactor netty HttpClient by @jenschude in https://github.com/commercetools/commercetools-sdk-java-v2/pull/367

* Lock file maintenance by @renovate in https://github.com/commercetools/commercetools-sdk-java-v2/pull/363
* update dependencies by @jenschude in https://github.com/commercetools/commercetools-sdk-java-v2/pull/373
* Update generated SDKs by @github-actions in https://github.com/commercetools/commercetools-sdk-java-v2/pull/365
* Update generated SDKs by @github-actions in https://github.com/commercetools/commercetools-sdk-java-v2/pull/368
* Update generated SDKs by @github-actions in https://github.com/commercetools/commercetools-sdk-java-v2/pull/369
* Update generated SDKs by @github-actions in https://github.com/commercetools/commercetools-sdk-java-v2/pull/371

## Changes in generated code parts

**Api changes**

<details>
<summary>Added Property(s)</summary>

- added property `discountCodeId` to type `DiscountCodeNonApplicableError`
- added property `extensionErrors` to type `ExtensionBadResponseError`
- added property `extensionBody` to type `ExtensionBadResponseError`
- added property `extensionStatusCode` to type `ExtensionBadResponseError`
- added property `extensionId` to type `ExtensionBadResponseError`
- added property `extensionKey` to type `ExtensionBadResponseError`
- added property `extensionErrors` to type `ExtensionUpdateActionsFailedError`
- added property `detailedErrorMessage` to type `InvalidJsonInputError`
- added property `countries` to type `StoreCreatedMessage`
- added property `countries` to type `StoreCreatedMessagePayload`
- added property `priceMode` to type `ProductProjection`
- added property `countries` to type `Store`
- added property `countries` to type `StoreDraft`
</details>


<details>
<summary>Removed Property(s)</summary>

- :warning: removed property `dicountCodeId` from type `DiscountCodeNonApplicableError`
- :warning: removed property `conflictingResource` from type `DuplicateFieldError`
- :warning: removed property `error` from type `ErrorResponse`
- :warning: removed property `error_description` from type `ErrorResponse`
- :warning: removed property `errorByExtension` from type `ExtensionBadResponseError`
- :warning: removed property `errorByExtension` from type `ExtensionUpdateActionsFailedError`
</details>


<details>
<summary>Changed Property(s)</summary>

- :warning: changed property `amountPlanned` of type `MyPayment` from type `TypedMoney` to `CentPrecisionMoney`
- :warning: changed property `amountPlanned` of type `Payment` from type `TypedMoney` to `CentPrecisionMoney`
- :warning: changed property `assets` of type `ProductAddVariantAction` from type `Assets[]` to `AssetsDraft[]`
</details>


<details>
<summary>Required Property(s)</summary>

- :warning: changed property `field` of type `DuplicateFieldError` to be required
- :warning: changed property `duplicateValue` of type `DuplicateFieldError` to be required
- :warning: changed property `state` of type `Transaction` to be required
- :warning: changed property `lineItems` of type `ShoppingList` to be required
- :warning: changed property `textLineItems` of type `ShoppingList` to be required
</details>


<details>
<summary>Added Type(s)</summary>

- added type `AuthErrorResponse`
- added type `CountryNotConfiguredInStore`
- added type `ExtensionError`
- added type `ExtensionPredicateEvaluationFailedError`
- added type `ProductAssignmentMissingError`
- added type `ProductPresentWithDifferentVariantSelectionError`
- added type `ProductPriceAddedMessage`
- added type `ProductPriceChangedMessage`
- added type `ProductPriceModeSetMessage`
- added type `ProductPriceRemovedMessage`
- added type `ProductPriceSetMessage`
- added type `StoreCountriesChangedMessage`
- added type `ProductPriceAddedMessagePayload`
- added type `ProductPriceChangedMessagePayload`
- added type `ProductPriceModeSetMessagePayload`
- added type `ProductPriceRemovedMessagePayload`
- added type `ProductPriceSetMessagePayload`
- added type `StoreCountriesChangedMessagePayload`
- added type `StoreCountry`
- added type `StoreAddCountryAction`
- added type `StoreRemoveCountryAction`
- added type `StoreSetCountriesAction`
</details>


<details>
<summary>Removed Type(s)</summary>

- :warning: removed type `AccessDeniedError`
- :warning: removed type `WeakPasswordError`
</details>


<details>
<summary>Added QueryParameter(s)</summary>

- added query parameter `localeProjection` to method `get /{projectKey}/products`
- added query parameter `localeProjection` to method `post /{projectKey}/products`
- added query parameter `localeProjection` to method `get /{projectKey}/products/key={key}`
- added query parameter `localeProjection` to method `post /{projectKey}/products/key={key}`
- added query parameter `localeProjection` to method `delete /{projectKey}/products/key={key}`
- added query parameter `localeProjection` to method `get /{projectKey}/products/{ID}`
- added query parameter `localeProjection` to method `post /{projectKey}/products/{ID}`
- added query parameter `localeProjection` to method `delete /{projectKey}/products/{ID}`
- added query parameter `staged` to method `get /{projectKey}/in-store/key={storeKey}/product-projections/key={key}`
- added query parameter `staged` to method `get /{projectKey}/in-store/key={storeKey}/product-projections/{ID}`
</details>



**Full Changelog**: https://github.com/commercetools/commercetools-sdk-java-v2/compare/9.5.0...10.0.0

# 9.5.0 (2022-11-07)

## What's Changed
* Update generated SDKs by @github-actions in https://github.com/commercetools/commercetools-sdk-java-v2/pull/356
* add configuration methods for the queue middleware by @jenschude in https://github.com/commercetools/commercetools-sdk-java-v2/pull/355
* Update generated SDKs by @github-actions in https://github.com/commercetools/commercetools-sdk-java-v2/pull/357
* Update all dependencies by @renovate in https://github.com/commercetools/commercetools-sdk-java-v2/pull/311
* Update all dependencies by @renovate in https://github.com/commercetools/commercetools-sdk-java-v2/pull/360
* Update generated SDKs by @github-actions in https://github.com/commercetools/commercetools-sdk-java-v2/pull/358

**Api changes**

<details>
<summary>Added Property(s)</summary>

- added property `shippingKey` to type `CartSetLineItemTaxAmountAction`
- added property `shippingKey` to type `CartSetLineItemTaxRateAction`
- added property `salutation` to type `MyCustomerDraft`
- added property `shippingKey` to type `StagedOrderSetLineItemTaxAmountAction`
- added property `shippingKey` to type `StagedOrderSetLineItemTaxRateAction`
- added property `quoteStateToAccepted` to type `OrderFromQuoteDraft`
- added property `stagedQuoteStateToSent` to type `QuoteDraft`
- added property `quoteRequestStateToAccepted` to type `StagedQuoteDraft`
- added property `authenticationMode` to type `SnsDestination`
- added property `authenticationMode` to type `SqsDestination`
</details>


<details>
<summary>Changed Property(s)</summary>

- :warning: changed property `sort` of type `OrderSearchRequest` from type `OrderSearchSorting` to `List\<OrderSearchSorting\>`
- :warning: changed property `resourceTypeId` of type `ChangeSubscription` from type `string` to `ChangeSubscriptionResourceTypeId`
- :warning: changed property `resourceTypeId` of type `MessageSubscription` from type `string` to `MessageSubscriptionResourceTypeId`
- :warning: changed property `payloadNotIncluded` of type `MessageDeliveryPayload` to be optional
- :warning: changed property `accessKey` of type `SnsDestination` to be optional
- :warning: changed property `accessSecret` of type `SnsDestination` to be optional
- :warning: changed property `accessKey` of type `SqsDestination` to be optional
- :warning: changed property `accessSecret` of type `SqsDestination` to be optional
- :warning: changed property `authenticationMode` of type `Customer` to be required
</details>


<details>
<summary>Added Type(s)</summary>

- added type `AttributeGroup`
- added type `AttributeGroupDraft`
- added type `AttributeGroupPagedQueryResponse`
- added type `AttributeGroupReference`
- added type `AttributeGroupResourceIdentifier`
- added type `AttributeGroupUpdate`
- added type `AttributeGroupUpdateAction`
- added type `AttributeReference`
- added type `AttributeGroupAddAttributeAction`
- added type `AttributeGroupChangeNameAction`
- added type `AttributeGroupRemoveAttributeAction`
- added type `AttributeGroupSetAttributesAction`
- added type `AttributeGroupSetDescriptionAction`
- added type `AttributeGroupSetKeyAction`
- added type `MyCustomerEmailVerify`
- added type `AwsAuthenticationMode`
- added type `ChangeSubscriptionResourceTypeId`
- added type `CloudEventsPayload`
- added type `MessageSubscriptionResourceTypeId`
</details>


<details>
<summary>Changed Type(s)</summary>

- :warning: changed type `OrderSearchSorting` from type `string` to `object`
- marked type `ShippingMethodSetDescriptionAction` as deprecated
- marked type `IronMqDestination` as deprecated
</details>


<details>
<summary>Added Method(s)</summary>

- added method `get /{projectKey}/attribute-groups`
- added method `post /{projectKey}/attribute-groups`
- added method `get /{projectKey}/subscriptions/{ID}/health`
- added method `get /{projectKey}/attribute-groups/key={key}`
- added method `post /{projectKey}/attribute-groups/key={key}`
- added method `delete /{projectKey}/attribute-groups/key={key}`
- added method `get /{projectKey}/attribute-groups/{ID}`
- added method `post /{projectKey}/attribute-groups/{ID}`
- added method `delete /{projectKey}/attribute-groups/{ID}`
</details>


<details>
<summary>Added Resource(s)</summary>

- added resource `/{projectKey}/attribute-groups` (file:///home/runner/work/commercetools-api-reference/commercetools-api-reference/commercetools-api-reference/api-specs/api/api.raml:216:2)
- added resource `/{projectKey}/subscriptions/{ID}/health`
- added resource `/{projectKey}/attribute-groups/key={key}`
- added resource `/{projectKey}/attribute-groups/{ID}`
</details>

**Import changes**

<details>
<summary>Added Property(s)</summary>

- added property `store` to type `OrderImport`
</details>


<details>
<summary>Removed Property(s)</summary>

- :warning: removed property `totalTax` from type `TaxedPrice`
</details>


**Full Changelog**: https://github.com/commercetools/commercetools-sdk-java-v2/compare/9.4.0...9.5.0

# 9.4.0 (2022-10-13)

## What's Changed
* Update generated SDKs by @github-actions in https://github.com/commercetools/commercetools-sdk-java-v2/pull/354

### Features

- support business units
- support me quotes
- support `key` for EmbeddedPrice

**Full Changelog**: https://github.com/commercetools/commercetools-sdk-java-v2/compare/9.3.0...9.4.0

# 9.3.0 (2022-09-15)

## What's Changed
* fix ProductDataLike serialization by @jenschude in https://github.com/commercetools/commercetools-sdk-java-v2/pull/346
* Update generated SDKs by @github-actions in https://github.com/commercetools/commercetools-sdk-java-v2/pull/344
* fix deserialization of customfields with value node key by @jenschude in https://github.com/commercetools/commercetools-sdk-java-v2/pull/351
* Update generated SDKs by @github-actions in https://github.com/commercetools/commercetools-sdk-java-v2/pull/352

### Features

- add Standalone price to ResourceTypeIdentifier
- support staged StandalonePrice
- support store name set action
- support expand for Me active cart
- support order quote states
- support query for product head request
- support taxedShippingPrice and shipping mode for cart/order
- support customlineitem pricemode 

#### Import API
- support custom field in LineItem, CustomerAddress

### Fixes

- fix type for field `money` in ProductDiscountValueAbsoluteDraft to `Money`
- fix `discountCodes` to List<String> in MyCartDraft

### Breaking changes

- renamed OrderReturnInfoAddedMessage to ReturnInfoAddedMessage
- renamed OrderReturnInfoSetMessage to ReturnInfoSetMessage

### Deprecation

- deprecate ML missing data endpoint

**Full Changelog**: https://github.com/commercetools/commercetools-sdk-java-v2/compare/9.2.0...9.3.0

# 9.2.2 (2022-08-31)

## What's Changed

* fix deserialization of customfields with node key by @jenschude

**Full Changelog**: https://github.com/commercetools/commercetools-sdk-java-v2/compare/9.2.1...9.2.2

# 7.6.3 (2022-08-31)

## Fixes

- fix NullpointerException for CustomField LocalizedStrings values with a node `key`

**Full Changelog**: https://github.com/commercetools/commercetools-sdk-java-v2/compare/7.6.2...7.6.3

# 9.2.1 (2022-07-29)

- fix ProductDataLike de-/serialization

**Full Changelog**: https://github.com/commercetools/commercetools-sdk-java-v2/compare/9.2.0...9.2.1

# 8.10.1 (2022-07-29)

- fix ProductDataLike de-/serialization

**Full Changelog**: https://github.com/commercetools/commercetools-sdk-java-v2/compare/8.10.0...8.10.1

# 9.2.0 (2022-07-28)

## What's Changed
* Update generated SDKs by @github-actions in https://github.com/commercetools/commercetools-sdk-java-v2/pull/339
* Update generated SDKs by @github-actions in https://github.com/commercetools/commercetools-sdk-java-v2/pull/343
* add money serializer by @jenschude in https://github.com/commercetools/commercetools-sdk-java-v2/pull/340

### Features

- support `HEAD` requests for product types
- support cart customLineItem priceMode
- support cart lineitem inventoryMode
- support store distribution channel message
- add LocaleprojectingTrait, StoreprojectingTrait
- quotes to extension resource types

### Fixes

- removed `localeProjection` & `priceSelection` parameter from PriceselectingTrait as they are not applying to all endpoints using price selection
- remove MonetaryAmount fields from money serialization

**Full Changelog**: https://github.com/commercetools/commercetools-sdk-java-v2/compare/9.1.0...9.2.0

# 9.1.0 (2022-07-08)

## What's Changed
* add convert methods customfields & references to their drafts by @jenschude in https://github.com/commercetools/commercetools-sdk-java-v2/pull/336
* Update generated SDKs by @github-actions in https://github.com/commercetools/commercetools-sdk-java-v2/pull/335
* Update generated SDKs by @github-actions in https://github.com/commercetools/commercetools-sdk-java-v2/pull/337
* Update generated SDKs by @github-actions in https://github.com/commercetools/commercetools-sdk-java-v2/pull/338

### Features

- add convert methods customfields & references to their drafts
- add order custom lineitem messages
- add `toDraft` methods to `Address`, `Parcel`, `Delivery`
- add `DeliveryDraft` type

### Fixes

- fix type for field `version` in OrderEdit models
- OrderImport fix `ShippingInfoImportDraft` to use `DeliveryDraft`
- fix type for field score in ScoreShippingRateInput & ScoreShippingRateInputDraft

**Full Changelog**: https://github.com/commercetools/commercetools-sdk-java-v2/compare/9.0.0...9.1.0

# 8.7.2 (2022-07-08)

### Fixes

- fix type for field `score` in ScoreShippingRateInput & ScoreShippingRateInputDraft

**Full Changelog**: https://github.com/commercetools/commercetools-sdk-java-v2/compare/8.7.1...8.7.2

# 9.0.0 (2022-07-04)

## What's Changed
* add benchmark for SDK comparison by @jenschude in https://github.com/commercetools/commercetools-sdk-java-v2/pull/331
* Update generated SDKs by @github-actions in https://github.com/commercetools/commercetools-sdk-java-v2/pull/330
* add builder methods to configure executor services for http and oauth by @jenschude in https://github.com/commercetools/commercetools-sdk-java-v2/pull/333
* Update generated SDKs by @github-actions in https://github.com/commercetools/commercetools-sdk-java-v2/pull/334

### Docs

- added section to Migration about namespace and class name changes from SDK v1 to v2 to [JavaDoc](https://commercetools.github.io/commercetools-sdk-java-v2/javadoc/com/commercetools/docs/meta/MigrationModelClassMapping.html)

### Features

- add builder methods to configure executor services for http and oauth
- support in store product selections
- support quotes
- support DirectDiscounts for carts

### Fixes

- removed wrong interfaces from ByProjectKeyInStoreKeyByStoreKeyProductProjectionsGet 
- fixed type of property score in `CartScoreTier` to `Integer` (was `Double`)

### Breaking changes

- type of `AttributeReferenceType` property `referenceTypeId` changed to  `AttributeReferenceTypeId`
- removed deprecated import sink endpoints and models from Import API SDK
- removed non existing endpoint in store product projections query

**Full Changelog**: https://github.com/commercetools/commercetools-sdk-java-v2/compare/8.10.0...9.0.0

# 8.10.0 (2022-06-21)

## What's Changed
* add support for AHC by @jenschude in https://github.com/commercetools/commercetools-sdk-java-v2/pull/326
* Update generated SDKs by @github-actions in https://github.com/commercetools/commercetools-sdk-java-v2/pull/325
	* add StandalonePriceExternalDiscountSet message
* add best practices document by @barbara79 in https://github.com/commercetools/commercetools-sdk-java-v2/pull/328
* add option to unwrap completion exception by @jenschude in https://github.com/commercetools/commercetools-sdk-java-v2/pull/329
* configurable schedulers for Middlewares 6b601f9

**Full Changelog**: https://github.com/commercetools/commercetools-sdk-java-v2/compare/8.9.0...8.10.0

# 2.0.2 (2022-06-14)

Fixes:

- Fixes issue with HTTP/2 connections which result in shutdown of the HTTP client connection pool by forcing HTTP/1.1 connections

**Full Changelog**: https://github.com/commercetools/commercetools-sdk-java-v2/compare/2.0.1...2.0.2

# 8.9.0 (2022-06-10)

## What's Changed
* Update generated SDKs by @github-actions in https://github.com/commercetools/commercetools-sdk-java-v2/pull/321
* Update generated SDKs by @github-actions in https://github.com/commercetools/commercetools-sdk-java-v2/pull/324

### Features

- support `condition` field for extension triggers
- support standalone pricing

### Fixes

- fix type request/response type for my customer cmail confirm endpoints
- support File requests in the compatibility layer

**Full Changelog**: https://github.com/commercetools/commercetools-sdk-java-v2/compare/8.8.1...8.9.0

# 8.8.1 (2022-06-09)

## What's Changed
* add option to filter requests for NotFoundRequestMiddleware by @jenschude in https://github.com/commercetools/commercetools-sdk-java-v2/pull/323


**Full Changelog**: https://github.com/commercetools/commercetools-sdk-java-v2/compare/8.8.0...8.8.1

# 8.8.0 (2022-06-08)

## What's Changed
* add time information to the logger middleware by @jenschude in https://github.com/commercetools/commercetools-sdk-java-v2/pull/309
* Update generated SDKs by @github-actions in https://github.com/commercetools/commercetools-sdk-java-v2/pull/307
* Update github/codeql-action action to v2 by @renovate in https://github.com/commercetools/commercetools-sdk-java-v2/pull/305
* Update actions/checkout action to v3 by @renovate in https://github.com/commercetools/commercetools-sdk-java-v2/pull/272
* Update actions/setup-java action to v3 by @renovate in https://github.com/commercetools/commercetools-sdk-java-v2/pull/271
* Update all dependencies by @renovate in https://github.com/commercetools/commercetools-sdk-java-v2/pull/226
* Update generated SDKs by @github-actions in https://github.com/commercetools/commercetools-sdk-java-v2/pull/310
* Update generated SDKs by @github-actions in https://github.com/commercetools/commercetools-sdk-java-v2/pull/312
* Update generated SDKs by @github-actions in https://github.com/commercetools/commercetools-sdk-java-v2/pull/314
* Add example for spring application by @jenschude in https://github.com/commercetools/commercetools-sdk-java-v2/pull/313
* Update generated SDKs by @github-actions in https://github.com/commercetools/commercetools-sdk-java-v2/pull/315
* Update generated SDKs by @github-actions in https://github.com/commercetools/commercetools-sdk-java-v2/pull/316
* Update generated SDKs by @github-actions in https://github.com/commercetools/commercetools-sdk-java-v2/pull/318
* Update generated SDKs by @github-actions in https://github.com/commercetools/commercetools-sdk-java-v2/pull/319
* chore(docs): update naming to match new branding initiative by @jherey in https://github.com/commercetools/commercetools-sdk-java-v2/pull/317
* Update generated SDKs by @github-actions in https://github.com/commercetools/commercetools-sdk-java-v2/pull/320
* Compatibility Layer improvements by @jenschude in https://github.com/commercetools/commercetools-sdk-java-v2/pull/322

Fixes:
* empty instance of a LocalizedString returns an empty value map

Interface API Change:

* add `getBaseUri` method to ApiHttpClient interface

**Full Changelog**: https://github.com/commercetools/commercetools-sdk-java-v2/compare/8.7.0...8.8.0

# 8.7.1 (2022-06-08)

- fix exception to log level mapping in InternalLoggerMiddleware

**Full Changelog**: https://github.com/commercetools/commercetools-sdk-java-v2/compare/8.7.0...8.7.1

# 7.6.2 (2022-05-04)

### Fixes


* Backport of type fix from double to integer/long for quantity properties. See details in https://github.com/commercetools/commercetools-sdk-java-v2/pull/297

**Full Changelog**: https://github.com/commercetools/commercetools-sdk-java-v2/compare/7.6.1...7.6.2

# 8.7.0 (2022-05-02)

## What's Changed
* Update generated SDKs by @github-actions in https://github.com/commercetools/commercetools-sdk-java-v2/pull/301
* Update generated SDKs by @github-actions in https://github.com/commercetools/commercetools-sdk-java-v2/pull/302
* fix product variant patch by @jenschude in https://github.com/commercetools/commercetools-sdk-java-v2/pull/306
* Update generated SDKs by @github-actions in https://github.com/commercetools/commercetools-sdk-java-v2/pull/304

### Features

* add factory methods for Money types to be created from a MonetaryAmount
* add typeReference method to all model interfaces

**Full Changelog**: https://github.com/commercetools/commercetools-sdk-java-v2/compare/8.6.0...8.7.0

# 8.6.1 (2022-05-02)

* fix Import API product variant patch serializer

**Full Changelog**: https://github.com/commercetools/commercetools-sdk-java-v2/compare/8.6.0...8.6.1

# 8.6.0 (2022-04-20)

## What's Changed
* fix importApi product variant patch serializer by @jenschude in https://github.com/commercetools/commercetools-sdk-java-v2/pull/299
* add support for nested attributes to AttributesAccessor by @jenschude in https://github.com/commercetools/commercetools-sdk-java-v2/pull/295
* Update generated SDKs by @github-actions in https://github.com/commercetools/commercetools-sdk-java-v2/pull/298

### Fixes

* fixed response type for product projection suggest endpoint


**Full Changelog**: https://github.com/commercetools/commercetools-sdk-java-v2/compare/8.5.1...8.6.0

# 8.5.1 (2022-04-12)

## What's Changed
* Update generated SDKs by @github-actions in https://github.com/commercetools/commercetools-sdk-java-v2/pull/294

### Fixes:
* type fix from double to integer/long for quantity properties in https://github.com/commercetools/commercetools-sdk-java-v2/pull/297

**Full Changelog**: https://github.com/commercetools/commercetools-sdk-java-v2/compare/8.5.0...8.5.1

# 8.5.0 (2022-04-11)

## What's Changed
* Update generated SDKs by @github-actions in https://github.com/commercetools/commercetools-sdk-java-v2/pull/291
* Update generated SDKs by @github-actions in https://github.com/commercetools/commercetools-sdk-java-v2/pull/292
* add product data like interface by @jenschude in https://github.com/commercetools/commercetools-sdk-java-v2/pull/293
* fix type of field `quantity` in StagedOrderUpdateActions


**Full Changelog**: https://github.com/commercetools/commercetools-sdk-java-v2/compare/8.4.0...8.5.0

# 8.4.0 (2022-04-08)

## What's Changed
* Update generated SDKs by @github-actions in https://github.com/commercetools/commercetools-sdk-java-v2/pull/287
* fix NPE in attribute deserializer if locale key is used in LocalizedS… by @jenschude in https://github.com/commercetools/commercetools-sdk-java-v2/pull/288
* support for JavaMoney by @jenschude in https://github.com/commercetools/commercetools-sdk-java-v2/pull/290
* ConcurrentModificationException logged as Info level by default
* fix exception log level configuration


**Full Changelog**: https://github.com/commercetools/commercetools-sdk-java-v2/compare/8.3.0...8.4.0

# 7.6.1 (2022-04-07)

- fix NPE in attribute deserializer if locale key is used in LocalizedStrings

**Full Changelog**: https://github.com/commercetools/commercetools-sdk-java-v2/compare/7.6.0...7.6.1

# 8.3.0 (2022-04-04)

## What's Changed
* Update generated SDKs by @github-actions in https://github.com/commercetools/commercetools-sdk-java-v2/pull/282
* Update generated SDKs by @github-actions in https://github.com/commercetools/commercetools-sdk-java-v2/pull/286
* add decorator method to ApiMethod class by @jenschude in https://github.com/commercetools/commercetools-sdk-java-v2/pull/284
* add decorate method to ApiMethod class by @jenschude in https://github.com/commercetools/commercetools-sdk-java-v2/pull/285
* configurable Error level in the InternalLoggerMiddleware


**Full Changelog**: https://github.com/commercetools/commercetools-sdk-java-v2/compare/8.2.0...8.3.0

# 8.2.0 (2022-03-22)

## What's Changed
* add option to handle failures in RetryMiddleware by @jenschude in https://github.com/commercetools/commercetools-sdk-java-v2/pull/281


**Full Changelog**: https://github.com/commercetools/commercetools-sdk-java-v2/compare/8.1.0...8.2.0

# 8.1.0 (2022-03-21)

## What's Changed

* Add middleware for handling ConcurrentModificationExceptions
* Update generated SDKs by @github-actions in https://github.com/commercetools/commercetools-sdk-java-v2/pull/278



**Full Changelog**: https://github.com/commercetools/commercetools-sdk-java-v2/compare/8.0.1...8.1.0

# 8.0.1 (2022-03-17)

## What's Changed

Feature:
- marker interface Customizable and CustomizableDraft added

Fixes:
- type fix for `custom` field in MyCustomerDraft, MyTransactionDraft, StagedOrderAddDeliveryAction

* Update generated SDKs by @github-actions in https://github.com/commercetools/commercetools-sdk-java-v2/pull/277


**Full Changelog**: https://github.com/commercetools/commercetools-sdk-java-v2/compare/8.0.0...8.0.1

# 8.0.0 (2022-03-16)

## What's Changed

Features:
* an OrderLike interface has been introduced 
* new BodyApiMethod allow to access and add a new Body object
* added accessor to additional fields in an ErrorObject
* extended CustomFields and AttributesAccessor with more type safe methods
* add more options to fine tune the HTTP clients
* add ApiHttpExceptionFactory by @jenschude in https://github.com/commercetools/commercetools-sdk-java-v2/pull/265
* add constructors to HTTP client modules to support further customization of the underlying HTTP client
* add CategoryTree helper classes
* add Identifiable interface to DomainResources, References and ResourceIdentifiers
* new QueueMiddleware has been added
* added NotFoundException middleware which returns null instead of throwing a NotFoundException
* added RetryHandler for handling ConcurrentModification errors
* added more helper methods to LocalizedString for simpler usage

Fixes:
* querying for product selections of a product maps now to the correct type `AssignedProductSelectionPagedQueryResponse`
* correctly restore InterruptedExceptions in blocking calls
* fix InStore customer password reset return type
* fix OrderAddDelivery custom field type

Behavior changes:

* PrintStacktrace calls have been replaced by appropiate exceptions
  * Serialization errors while executing a request now throwing a JsonException
  * IOErrors errors of files while executing a requests now throwing a FileException
  * CompatRequest throws a HttpException if URL could not be encoded
  * ApiMethod throws a EncodingException for unsupported URL encoding

Breaking Changes:
* Failsafe library has been updated to 3.2
* ResourceUpdate interfaces adds a generic parameter to it's Builder class
* The following classes have been renamed for aligning the documentation and SDK type naming: 
  **Package com.commercetools.api.models.extension**
    
    ExtensionAWSLambdaDestination
    ExtensionAWSLambdaDestinationBuilder
    ExtensionAuthorizationHeaderAuthentication
    ExtensionAuthorizationHeaderAuthenticationBuilder
    ExtensionAzureFunctionsAuthentication
    ExtensionAzureFunctionsAuthenticationBuilder
    ExtensionHttpDestination
    ExtensionHttpDestinationAuthentication
    ExtensionHttpDestinationBuilder
    
  **Package com.commercetools.api.models.message**
    
    MessageConfiguration
    MessageConfigurationBuilder
    MessageConfigurationDraft
    MessageConfigurationDraftBuilder
    
  **Package com.commercetools.api.models.product**
    
    FacetResultRange.java
    FacetResultRangeBuilder.java
    FacetResultTerm.java
    FacetResultTermBuilder.java
    
  **Package com.commercetools.api.models.subscription**
    
    DeliveryCloudEventsFormat
    DeliveryCloudEventsFormatBuilder
    DeliveryPlatformFormat
    DeliveryPlatformFormatBuilder
    MessageDelivery
    MessageDeliveryBuilder
    ResourceCreatedDelivery
    ResourceCreatedDeliveryBuilder
    ResourceDeletedDelivery
    ResourceDeletedDeliveryBuilder
    ResourceUpdatedDelivery
    ResourceUpdatedDeliveryBuilder
    SubscriptionDelivery

  For helping the transition extended classes and interfaces with deprecation and replaced annotation have been added

* Update generated SDKs by @github-actions in https://github.com/commercetools/commercetools-sdk-java-v2/pull/252
* Update generated SDKs by @github-actions in https://github.com/commercetools/commercetools-sdk-java-v2/pull/255
* Update generated SDKs by @github-actions in https://github.com/commercetools/commercetools-sdk-java-v2/pull/256
* Update generated SDKs by @github-actions in https://github.com/commercetools/commercetools-sdk-java-v2/pull/260
* Update generated SDKs by @github-actions in https://github.com/commercetools/commercetools-sdk-java-v2/pull/263
* Update generated SDKs by @github-actions in https://github.com/commercetools/commercetools-sdk-java-v2/pull/266
* Update generated SDKs by @github-actions in https://github.com/commercetools/commercetools-sdk-java-v2/pull/269
* Update generated SDKs by @github-actions in https://github.com/commercetools/commercetools-sdk-java-v2/pull/270


**Full Changelog**: https://github.com/commercetools/commercetools-sdk-java-v2/compare/7.6.0...8.0.0

# 7.6.0 (2022-01-25)

## What's Changed
* Update generated SDKs by @github-actions in https://github.com/commercetools/commercetools-sdk-java-v2/pull/245

### Features

* Add support for product selection (beta)

### Fixes

* Fix returnItemDraft type of field `custom` to `CustomFieldsDraft`

**Full Changelog**: https://github.com/commercetools/commercetools-sdk-java-v2/compare/7.5.0...7.6.0

# 7.5.0 (2022-01-25)

## What's Changed
* Update generated SDKs by @github-actions in https://github.com/commercetools/commercetools-sdk-java-v2/pull/244

### Fixes

* fix SetLineItemSupplyChannelAction for me cart endpoint
* fix TransactionDraft type of field `custom` to CustomFieldDraft

**Full Changelog**: https://github.com/commercetools/commercetools-sdk-java-v2/compare/7.4.0...7.5.0

# 7.4.0 (2022-01-21)

## What's Changed
* Update generated SDKs by @github-actions in https://github.com/commercetools/commercetools-sdk-java-v2/pull/230
* Update generated SDKs by @github-actions in https://github.com/commercetools/commercetools-sdk-java-v2/pull/234
* Update generated SDKs by @github-actions in https://github.com/commercetools/commercetools-sdk-java-v2/pull/236
* Update generated SDKs by @github-actions in https://github.com/commercetools/commercetools-sdk-java-v2/pull/239
* support custom deserialization per request by @jenschude in https://github.com/commercetools/commercetools-sdk-java-v2/pull/235
* Improve internal logger by @jenschude in https://github.com/commercetools/commercetools-sdk-java-v2/pull/241
  adds option to customize the logging level for responses and deprecation notices (default: Info)
* adds support for Order search endpoint
* model implementation classes can be written out as a string using the `ModelBase#reflectionString` method
* added methods for type safe retrieval of Attribute values to the AttributeAccessor class

### Fixes
* In-Store cart query returns correct type instead Object
* query parameter customerId has been removed from Cart queries due to mapping issues use `projectApiRoot.carts().withCustomerId()` instead
* fixed type for field `custom` in CartDiscountDraft from `CustomField` to `CustomFieldDraft`
* fixed `ApiHttpResponse#getBodyAsString` method if response body is null

### Breaking changes

* removed the inventories endpoint from the Import API modules



**Full Changelog**: https://github.com/commercetools/commercetools-sdk-java-v2/compare/7.3.0...7.4.0

# 7.3.0 (2021-12-07)

## What's Changed
* Support injecting custom executor to oauth middleware by @jenschude in https://github.com/commercetools/commercetools-sdk-java-v2/pull/225
* Update all dependencies by @renovate in https://github.com/commercetools/commercetools-sdk-java-v2/pull/220
* Update plugin com.diffplug.spotless to v6 by @renovate in https://github.com/commercetools/commercetools-sdk-java-v2/pull/222
* Update all dependencies by @renovate in https://github.com/commercetools/commercetools-sdk-java-v2/pull/224

**Full Changelog**: https://github.com/commercetools/commercetools-sdk-java-v2/compare/7.2.0...7.3.0

# 7.2.0 (2021-11-22)

## What's Changed
* Update generated SDKs by @github-actions in https://github.com/commercetools/commercetools-sdk-java-v2/pull/218

### Fix
- fix type for `value` of CartDiscount. Changed from CartDiscountDraft to CartDiscount

**Full Changelog**: https://github.com/commercetools/commercetools-sdk-java-v2/compare/7.1.0...7.2.0

# 7.1.0 (2021-11-19)

## What's Changed
* Update generated SDKs by @github-actions in https://github.com/commercetools/commercetools-sdk-java-v2/pull/215
* add option for an Auth CircuitBreaker by @jenschude in https://github.com/commercetools/commercetools-sdk-java-v2/pull/219
  Can be activated using the ApiRoot or ClientBuilder e.g.:
  ```
  ApiRootBuilder.of()
      .withAuthCircuitBreaker()
  ``` 
* Fix dropping of custom CorrelationId using the compatibility layer

* Update dependencies by @renovate-bot 
   * https://github.com/commercetools/commercetools-sdk-java-v2/pull/210
   * https://github.com/commercetools/commercetools-sdk-java-v2/pull/212

**Full Changelog**: https://github.com/commercetools/commercetools-sdk-java-v2/compare/7.0.0...7.1.0

# 7.0.0 (2021-10-25)

## What's Changed
* Update generated SDKs by @github-actions in https://github.com/commercetools/commercetools-sdk-java-v2/pull/208
* fix double encoding issue in compat layer by @jenschude in https://github.com/commercetools/commercetools-sdk-java-v2/pull/217
* model Classes are not final anymore - Closes #199
* DiscountedPrice model has now separate read & write models - Closes #213
* LineItemImportDraft now uses long for quantity - Closes #203 


**Full Changelog**: https://github.com/commercetools/commercetools-sdk-java-v2/compare/6.4.0...7.0.0

# 6.4.0 (2021-10-06)

## What's Changed
* add querying helper by @jenschude in https://github.com/commercetools/commercetools-sdk-java-v2/pull/207
  ```
  import com.commercetools.api.client.QueryUtils;

  QueryUtils.queryAll(request, list -> {
      list.forEach(someFn);
  }, 100).toCompletableFuture().join();
  ``` 

**Full Changelog**: https://github.com/commercetools/commercetools-sdk-java-v2/compare/6.3.0...6.4.0

# 6.3.0 (2021-10-04)



# 6.2.3 (2021-10-04)



# 6.2.2 (2021-09-28)



# 6.2.1 (2021-09-22)

- fix package for ProjectApiRoot
  Package has been changed from com.commercetools.<module>.defaultconfig to com.commercetools.<module>.client, e.g.: `com.commercetools.api.client.ProjectApiRoot` instead of `com.commercetools.api.defaultconfig.ProjectApiRoot` 

# 6.2.0 (2021-09-13)

* adds ProjectApiRoot class to be used as project scoped api root.
  ```
  ProjectApiRoot root = ApiRootBuilder.of()
        .build("projectKey");
  ```
* adds possibilities to add multiple query parameters at once

# 6.1.0 (2021-09-02)

- adds `equals` and `hashCode` to resource method classes

# 6.0.0 (2021-08-30)

## New Features

- a new module with support for the Apache HTTP Async client has been added
- API Client and Auth client provide hints of possible misconfigurations
- Update of the Models to the latest API changes

## Breaking change

- All model builders now check if all required fields have been set. An additional method buildUnchecked has been added.



# 5.2.0 (2021-08-02)



# 5.1.0 (2021-07-13)

Examples:
- added examples and test for Maven configured projects

OkHttp:
- specify more clearly a version range of the OkHttp client
- imports of the OkHttp client projects using the FQDN to avoid clashes in the classpath

Api:
- fixed return type for customer email token confirmation
- image upload improved to detect the content type if not given for the request
- type fix for the image upload query parameter `variant`
- type fixes for deliveryAdress custom field update actions
- correct naming for StagedOrderUpdateActions

Import:
- querying import sinks allow multiply sort parameters
- added ImportOperation total
- import sink resourceType is nullable

ML:
- image upload improved to detect the content type if not given for the request

# 5.0.0 (2021-06-17)

As some return types have been changed we released a new major version.

- Added a `BaseAddress` model to be able to use `Address` & `AddressDraft` models when writing to the API. This should be mostly backwards compatible, but return types of Drafts and DraftBuilders methods for addresses have been changed.
- `DeprecatableTrait` has been split to `Deprecatable200Trait` and `Deprecatable201Trait`
- fixed InventoryEntry supplyChannel type to `ChannelReference`

# 4.1.0 (2021-04-28)

* Fixes issue with HTTP/2 connections which result in shutdown of the HTTP client connection pool by forcing HTTP/1.1 connections
* Introduces a compatibility layer for the JVM SDK
  This allows to use SDKv1 commands with the new SDK. Use the CompatClient for mapping the results to the v2 SDK models. Use the CompatSphereClient to use the v2 SDK client as a SphereClient replacement
* Query parameters use now primitive types as parameters
  This allows autoboxing/unboxing and type conversions (e.g. int to long) to simplify the usage of query parameters
* Fixed return types for Me endpoint methods
* Improved Tracing of the RetryMiddleware

# 4.0.1 (2021-04-28)

Fixed type of quantity property for MyLineItemDraft

# 4.0.0 (2021-04-28)

Introduced ClientBuilder for easier creation of an ApiHttpClient instance
Deprecated ClientFactory
DateSerializer is now configurable to return Attribute dates as String
Support for form parameters in product search requests
Attribute with Numbers are now deserialized to a long if no decimal places are given
added Audit log SDK

# 3.1.2 (2021-04-09)

Fixed legacy SDK HttpClient

# 3.1.1 (2021-03-03)

Fixes NPE with empty sets in custom fields

# 3.1.0 (2021-03-01)

From this release on the SDK modules will only made available on Maven Central due to the deprecation of Bintray and JCenter.

# 3.0.2 (2021-02-16)



# 3.0.1 (2021-02-08)

Fixes a bug related to adding format to the quantity field for DeliveryItem

# 3.0.0 (2021-02-03)

Breaking Changes:
- Properties accepting & returning JsonNode have been changed to accept and return Object. This mainly affects CustomFields, Attributes and CustomObjects.
- VrapJsonUtils have been renamed to JsonUtils

Features:
- JsonUtils can load Jackson Modules using ServiceLoaders
  A DeserializerModule has been added for the commercetools-sdk-java-api which deserializes the following entities to their respective types
  - Attributes
  - CustomFields
  - FacetResults
  - Review target property

- added additional Setters for Union type properties
- added method to return the response body to ApiMethod class
- added explicit Accept-Encoding header for GZip compression 

# 1.6.1 (2021-02-02)

Fixes a possible execution bottleneck in the OAuthMiddleware

# 2.0.1 (2021-01-19)

Fixes a possible execution bottleneck in the OAuthMiddleware

# 2.0.0 (2021-01-11)

It's now mandatory to add a http client module as a dependency to avoid resolving unsupported versions of the HTTP client

The default one would be

Maven:
```
    <dependency>
      <groupId>com.commercetools.sdk</groupId>
      <artifactId>commercetools-http-client</artifactId>
      <version>${commercetools.version}</version>
    </dependency>
```

Gradle
```
dependencies {
    implementation "com.commercetools.sdk:commercetools-http-client:${versions.commercetools}"
}
```

# 1.6.0 (2020-11-26)



# 1.5.2 (2020-11-04)



# 1.5.1 (2020-11-04)



# 1.5.0 (2020-11-03)



# 1.4.0 (2020-10-28)



# 1.3.0 (2020-10-27)



# 1.2.0 (2020-10-26)



# 1.1.3 (2020-10-01)



# 1.1.2 (2020-09-15)



# 1.1.1 (2020-09-15)



# 1.1.0 (2020-09-15)



# 1.0.1 (2020-09-09)

- fix deserialization of changed Enum. Closes #84 
- fix resolving of transient dependencies. Closes #83 

# 1.0.0 (2020-09-07)



