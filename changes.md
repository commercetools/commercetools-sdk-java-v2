**Api changes**

<details>
<summary>Added Property(s)</summary>

- added property `discountCodeId` to type `DiscountCodeNonApplicableError` (file:/home/runner/work/commercetools-api-reference/commercetools-api-reference/commercetools-api-reference/api-specs/api/types/error/DiscountCodeNonApplicableError.raml:27:2)
- added property `extensionErrors` to type `ExtensionBadResponseError` (file:/home/runner/work/commercetools-api-reference/commercetools-api-reference/commercetools-api-reference/api-specs/api/types/error/ExtensionBadResponseError.raml:23:2)
- added property `extensionBody` to type `ExtensionBadResponseError` (file:/home/runner/work/commercetools-api-reference/commercetools-api-reference/commercetools-api-reference/api-specs/api/types/error/ExtensionBadResponseError.raml:27:2)
- added property `extensionStatusCode` to type `ExtensionBadResponseError` (file:/home/runner/work/commercetools-api-reference/commercetools-api-reference/commercetools-api-reference/api-specs/api/types/error/ExtensionBadResponseError.raml:30:2)
- added property `extensionId` to type `ExtensionBadResponseError` (file:/home/runner/work/commercetools-api-reference/commercetools-api-reference/commercetools-api-reference/api-specs/api/types/error/ExtensionBadResponseError.raml:33:2)
- added property `extensionKey` to type `ExtensionBadResponseError` (file:/home/runner/work/commercetools-api-reference/commercetools-api-reference/commercetools-api-reference/api-specs/api/types/error/ExtensionBadResponseError.raml:36:2)
- added property `extensionErrors` to type `ExtensionUpdateActionsFailedError` (file:/home/runner/work/commercetools-api-reference/commercetools-api-reference/commercetools-api-reference/api-specs/api/types/error/ExtensionUpdateActionsFailedError.raml:24:2)
- added property `detailedErrorMessage` to type `InvalidJsonInputError` (file:/home/runner/work/commercetools-api-reference/commercetools-api-reference/commercetools-api-reference/api-specs/api/types/error/InvalidJsonInputError.raml:17:2)
- added property `countries` to type `StoreCreatedMessage` (file:/home/runner/work/commercetools-api-reference/commercetools-api-reference/commercetools-api-reference/api-specs/api/types/message/StoreCreatedMessage.raml:17:2)
- added property `countries` to type `StoreCreatedMessagePayload` (file:/home/runner/work/commercetools-api-reference/commercetools-api-reference/commercetools-api-reference/api-specs/api/types/message/payload/StoreCreatedMessagePayload.raml:17:2)
- added property `priceMode` to type `ProductProjection` (file:/home/runner/work/commercetools-api-reference/commercetools-api-reference/commercetools-api-reference/api-specs/api/types/product/ProductProjection.raml:103:2)
- added property `countries` to type `Store` (file:/home/runner/work/commercetools-api-reference/commercetools-api-reference/commercetools-api-reference/api-specs/api/types/store/Store.raml:51:2)
- added property `countries` to type `StoreDraft` (file:/home/runner/work/commercetools-api-reference/commercetools-api-reference/commercetools-api-reference/api-specs/api/types/store/StoreDraft.raml:23:2)
</details>


<details>
<summary>Removed Property(s)</summary>

- :warning: removed property `dicountCodeId` from type `DiscountCodeNonApplicableError` (file:/home/runner/work/commercetools-api-reference/commercetools-api-reference/commercetools-api-reference-previous/api-specs/api/types/error/DiscountCodeNonApplicableError.raml:10:2)
- :warning: removed property `conflictingResource` from type `DuplicateFieldError` (file:/home/runner/work/commercetools-api-reference/commercetools-api-reference/commercetools-api-reference-previous/api-specs/api/types/error/DuplicateFieldError.raml:10:2)
- :warning: removed property `error` from type `ErrorResponse` (file:/home/runner/work/commercetools-api-reference/commercetools-api-reference/commercetools-api-reference-previous/api-specs/api/types/error/ErrorResponse.raml:9:2)
- :warning: removed property `error_description` from type `ErrorResponse` (file:/home/runner/work/commercetools-api-reference/commercetools-api-reference/commercetools-api-reference-previous/api-specs/api/types/error/ErrorResponse.raml:11:2)
- :warning: removed property `errorByExtension` from type `ExtensionBadResponseError` (file:/home/runner/work/commercetools-api-reference/commercetools-api-reference/commercetools-api-reference-previous/api-specs/api/types/error/ExtensionBadResponseError.raml:10:2)
- :warning: removed property `errorByExtension` from type `ExtensionUpdateActionsFailedError` (file:/home/runner/work/commercetools-api-reference/commercetools-api-reference/commercetools-api-reference-previous/api-specs/api/types/error/ExtensionUpdateActionsFailedError.raml:10:2)
</details>


<details>
<summary>Changed Property(s)</summary>

- :warning: changed property `currency` of type `DuplicateStandalonePriceScopeError` from type `string` to `CurrencyCode` (file:/home/runner/work/commercetools-api-reference/commercetools-api-reference/commercetools-api-reference/api-specs/api/types/error/DuplicateStandalonePriceScopeError.raml:25:2)
- :warning: changed property `country` of type `DuplicateStandalonePriceScopeError` from type `string` to `CountryCode` (file:/home/runner/work/commercetools-api-reference/commercetools-api-reference/commercetools-api-reference/api-specs/api/types/error/DuplicateStandalonePriceScopeError.raml:29:2)
- :warning: changed property `currency` of type `MatchingPriceNotFoundError` from type `string` to `CurrencyCode` (file:/home/runner/work/commercetools-api-reference/commercetools-api-reference/commercetools-api-reference/api-specs/api/types/error/MatchingPriceNotFoundError.raml:29:2)
- :warning: changed property `country` of type `MatchingPriceNotFoundError` from type `string` to `CountryCode` (file:/home/runner/work/commercetools-api-reference/commercetools-api-reference/commercetools-api-reference/api-specs/api/types/error/MatchingPriceNotFoundError.raml:33:2)
- :warning: changed property `country` of type `MissingTaxRateForCountryError` from type `string` to `CountryCode` (file:/home/runner/work/commercetools-api-reference/commercetools-api-reference/commercetools-api-reference/api-specs/api/types/error/MissingTaxRateForCountryError.raml:23:2)
- :warning: changed property `currency` of type `OverlappingStandalonePriceValidityError` from type `string` to `CurrencyCode` (file:/home/runner/work/commercetools-api-reference/commercetools-api-reference/commercetools-api-reference/api-specs/api/types/error/OverlappingStandalonePriceValidityError.raml:25:2)
- :warning: changed property `country` of type `OverlappingStandalonePriceValidityError` from type `string` to `CountryCode` (file:/home/runner/work/commercetools-api-reference/commercetools-api-reference/commercetools-api-reference/api-specs/api/types/error/OverlappingStandalonePriceValidityError.raml:29:2)
- :warning: changed property `amountPlanned` of type `MyPayment` from type `TypedMoney` to `CentPrecisionMoney` (file:/home/runner/work/commercetools-api-reference/commercetools-api-reference/commercetools-api-reference/api-specs/api/types/me/MyPayment.raml:27:2)
- :warning: changed property `amountPlanned` of type `Payment` from type `TypedMoney` to `CentPrecisionMoney` (file:/home/runner/work/commercetools-api-reference/commercetools-api-reference/commercetools-api-reference/api-specs/api/types/payment/Payment.raml:49:2)
</details>


<details>
<summary>Required Property(s)</summary>

- :warning: changed property `field` of type `DuplicateFieldError` to be required (file:/home/runner/work/commercetools-api-reference/commercetools-api-reference/commercetools-api-reference/api-specs/api/types/error/DuplicateFieldError.raml:14:2)
- :warning: changed property `duplicateValue` of type `DuplicateFieldError` to be required (file:/home/runner/work/commercetools-api-reference/commercetools-api-reference/commercetools-api-reference/api-specs/api/types/error/DuplicateFieldError.raml:18:2)
- :warning: changed property `state` of type `Transaction` to be required (file:/home/runner/work/commercetools-api-reference/commercetools-api-reference/commercetools-api-reference/api-specs/api/types/payment/Transaction.raml:27:2)
- :warning: changed property `lineItems` of type `ShoppingList` to be required (file:/home/runner/work/commercetools-api-reference/commercetools-api-reference/commercetools-api-reference/api-specs/api/types/shopping-list/ShoppingList.raml:41:2)
- :warning: changed property `textLineItems` of type `ShoppingList` to be required (file:/home/runner/work/commercetools-api-reference/commercetools-api-reference/commercetools-api-reference/api-specs/api/types/shopping-list/ShoppingList.raml:45:2)
</details>


<details>
<summary>Added Type(s)</summary>

- added type `AuthErrorResponse` (file:/home/runner/work/commercetools-api-reference/commercetools-api-reference/commercetools-api-reference/api-specs/api/types/types.raml:412:0)
- added type `CountryNotConfiguredInStore` (file:/home/runner/work/commercetools-api-reference/commercetools-api-reference/commercetools-api-reference/api-specs/api/types/types.raml:415:0)
- added type `ExtensionError` (file:/home/runner/work/commercetools-api-reference/commercetools-api-reference/commercetools-api-reference/api-specs/api/types/types.raml:434:0)
- added type `ExtensionPredicateEvaluationFailedError` (file:/home/runner/work/commercetools-api-reference/commercetools-api-reference/commercetools-api-reference/api-specs/api/types/types.raml:436:0)
- added type `ProductAssignmentMissingError` (file:/home/runner/work/commercetools-api-reference/commercetools-api-reference/commercetools-api-reference/api-specs/api/types/types.raml:465:0)
- added type `ProductPresentWithDifferentVariantSelectionError` (file:/home/runner/work/commercetools-api-reference/commercetools-api-reference/commercetools-api-reference/api-specs/api/types/types.raml:466:0)
- added type `ProductPriceAddedMessage` (file:/home/runner/work/commercetools-api-reference/commercetools-api-reference/commercetools-api-reference/api-specs/api/types/types.raml:747:0)
- added type `ProductPriceChangedMessage` (file:/home/runner/work/commercetools-api-reference/commercetools-api-reference/commercetools-api-reference/api-specs/api/types/types.raml:748:0)
- added type `ProductPriceModeSetMessage` (file:/home/runner/work/commercetools-api-reference/commercetools-api-reference/commercetools-api-reference/api-specs/api/types/types.raml:752:0)
- added type `ProductPriceRemovedMessage` (file:/home/runner/work/commercetools-api-reference/commercetools-api-reference/commercetools-api-reference/api-specs/api/types/types.raml:753:0)
- added type `ProductPriceSetMessage` (file:/home/runner/work/commercetools-api-reference/commercetools-api-reference/commercetools-api-reference/api-specs/api/types/types.raml:754:0)
- added type `StoreCountriesChangedMessage` (file:/home/runner/work/commercetools-api-reference/commercetools-api-reference/commercetools-api-reference/api-specs/api/types/types.raml:794:0)
- added type `ProductPriceAddedMessagePayload` (file:/home/runner/work/commercetools-api-reference/commercetools-api-reference/commercetools-api-reference/api-specs/api/types/types.raml:906:0)
- added type `ProductPriceChangedMessagePayload` (file:/home/runner/work/commercetools-api-reference/commercetools-api-reference/commercetools-api-reference/api-specs/api/types/types.raml:907:0)
- added type `ProductPriceModeSetMessagePayload` (file:/home/runner/work/commercetools-api-reference/commercetools-api-reference/commercetools-api-reference/api-specs/api/types/types.raml:911:0)
- added type `ProductPriceRemovedMessagePayload` (file:/home/runner/work/commercetools-api-reference/commercetools-api-reference/commercetools-api-reference/api-specs/api/types/types.raml:912:0)
- added type `ProductPriceSetMessagePayload` (file:/home/runner/work/commercetools-api-reference/commercetools-api-reference/commercetools-api-reference/api-specs/api/types/types.raml:913:0)
- added type `StoreCountriesChangedMessagePayload` (file:/home/runner/work/commercetools-api-reference/commercetools-api-reference/commercetools-api-reference/api-specs/api/types/types.raml:957:0)
- added type `StoreCountry` (file:/home/runner/work/commercetools-api-reference/commercetools-api-reference/commercetools-api-reference/api-specs/api/types/types.raml:1624:0)
- added type `StoreAddCountryAction` (file:/home/runner/work/commercetools-api-reference/commercetools-api-reference/commercetools-api-reference/api-specs/api/types/types.raml:1632:0)
- added type `StoreRemoveCountryAction` (file:/home/runner/work/commercetools-api-reference/commercetools-api-reference/commercetools-api-reference/api-specs/api/types/types.raml:1637:0)
- added type `StoreSetCountriesAction` (file:/home/runner/work/commercetools-api-reference/commercetools-api-reference/commercetools-api-reference/api-specs/api/types/types.raml:1641:0)
</details>


<details>
<summary>Removed Type(s)</summary>

- :warning: removed type `AccessDeniedError` (file:/home/runner/work/commercetools-api-reference/commercetools-api-reference/commercetools-api-reference-previous/api-specs/api/types/types.raml:408:0)
- :warning: removed type `WeakPasswordError` (file:/home/runner/work/commercetools-api-reference/commercetools-api-reference/commercetools-api-reference-previous/api-specs/api/types/types.raml:478:0)
</details>


<details>
<summary>Added QueryParameter(s)</summary>

- added query parameter `localeProjection` to method `get /{projectKey}/products` (file:/home/runner/work/commercetools-api-reference/commercetools-api-reference/commercetools-api-reference/api-specs/api/traits/price-selecting.raml:23:2)
- added query parameter `localeProjection` to method `post /{projectKey}/products` (file:/home/runner/work/commercetools-api-reference/commercetools-api-reference/commercetools-api-reference/api-specs/api/traits/price-selecting.raml:23:2)
- added query parameter `localeProjection` to method `get /{projectKey}/products/key={key}` (file:/home/runner/work/commercetools-api-reference/commercetools-api-reference/commercetools-api-reference/api-specs/api/traits/price-selecting.raml:23:2)
- added query parameter `localeProjection` to method `post /{projectKey}/products/key={key}` (file:/home/runner/work/commercetools-api-reference/commercetools-api-reference/commercetools-api-reference/api-specs/api/traits/price-selecting.raml:23:2)
- added query parameter `localeProjection` to method `delete /{projectKey}/products/key={key}` (file:/home/runner/work/commercetools-api-reference/commercetools-api-reference/commercetools-api-reference/api-specs/api/traits/price-selecting.raml:23:2)
- added query parameter `localeProjection` to method `get /{projectKey}/products/{ID}` (file:/home/runner/work/commercetools-api-reference/commercetools-api-reference/commercetools-api-reference/api-specs/api/traits/price-selecting.raml:23:2)
- added query parameter `localeProjection` to method `post /{projectKey}/products/{ID}` (file:/home/runner/work/commercetools-api-reference/commercetools-api-reference/commercetools-api-reference/api-specs/api/traits/price-selecting.raml:23:2)
- added query parameter `localeProjection` to method `delete /{projectKey}/products/{ID}` (file:/home/runner/work/commercetools-api-reference/commercetools-api-reference/commercetools-api-reference/api-specs/api/traits/price-selecting.raml:23:2)
- added query parameter `staged` to method `get /{projectKey}/in-store/key={storeKey}/product-projections/key={key}` (file:/home/runner/work/commercetools-api-reference/commercetools-api-reference/commercetools-api-reference/api-specs/api/traits/projection-selecting.raml:3:2)
- added query parameter `staged` to method `get /{projectKey}/in-store/key={storeKey}/product-projections/{ID}` (file:/home/runner/work/commercetools-api-reference/commercetools-api-reference/commercetools-api-reference/api-specs/api/traits/projection-selecting.raml:3:2)
</details>

