**Api changes**

<details>
<summary>Removed Type(s)</summary>

- :warning: removed type `Expansion`
- :warning: removed type `QueryPredicate`
- :warning: removed type `Sort`
</details>


<details>
<summary>MarkDeprecated Type(s)</summary>

- marked type `FacetRange` as deprecated
- marked type `FacetResult` as deprecated
- marked type `FacetResults` as deprecated
- marked type `FacetTerm` as deprecated
- marked type `FacetTypes` as deprecated
- marked type `FilteredFacetResult` as deprecated
- marked type `ProductProjectionPagedSearchResponse` as deprecated
- marked type `RangeFacetResult` as deprecated
- marked type `Suggestion` as deprecated
- marked type `SuggestionResult` as deprecated
- marked type `TermFacetResult` as deprecated
- marked type `TermFacetResultType` as deprecated
</details>


<details>
<summary>Added Type(s)</summary>

- added type `AgentBusinessUnitAmbiguousError`
- added type `AgentBusinessUnitLimitExceededError`
- added type `AgentBusinessUnitUnresolvedError`
- added type `AgentExtractionFailedError`
- added type `AgentFeatureDisabledError`
- added type `AgentFileNotProcessedWarning`
- added type `AgentMissingCountryError`
- added type `AgentMissingCustomerEmailError`
- added type `AgentMissingEntityTypeError`
- added type `AgentNoLineItemsExtractedError`
- added type `AgentOutOfScopeError`
- added type `AgentProductSearchNotEnabledError`
- added type `AgentProductsNotFoundError`
- added type `AgentProductsNotFoundWarning`
- added type `AgentQuoteRequestCreationFailedError`
- added type `AgentResponsesAuthError`
- added type `AgentResponsesCartSuccess`
- added type `AgentResponsesErrorResponse`
- added type `AgentResponsesMultipartRequest`
- added type `AgentResponsesOutputType`
- added type `AgentResponsesPayload`
- added type `AgentResponsesQuoteRequestSuccess`
- added type `AgentResponsesRequest`
- added type `AgentResponsesSuccess`
- added type `AgentStoreAmbiguousError`
- added type `AgentStoreDistributionChannelsUnsupportedError`
- added type `AgentStoreUnresolvedError`
- added type `EstimatedDelivery`
- added type `CartSetEstimatedDeliveryAction`
- added type `UnauthorizedError`
- added type `GraphQLUnauthorizedError`
- added type `CommerceMcpServerConfig`
- added type `CommerceMcpServerConfigDraft`
- added type `McpServer`
- added type `McpServerAuthenticationMode`
- added type `McpServerConfig`
- added type `McpServerConfigDraft`
- added type `McpServerDraft`
- added type `McpServerJsonOutputFiltering`
- added type `McpServerJsonOutputFilteringMatcher`
- added type `McpServerPagedQueryResponse`
- added type `McpServerState`
- added type `McpServerTool`
- added type `McpServerToolOutputFormatting`
- added type `McpServerType`
- added type `McpServerTypeTool`
- added type `McpServerUpdate`
- added type `McpServerUpdateAction`
- added type `ParameterOverride`
- added type `RemoveToolCustomizationTarget`
- added type `ToolCustomization`
- added type `McpServerAddToolAction`
- added type `McpServerAddToolCustomizationAction`
- added type `McpServerRemoveToolAction`
- added type `McpServerRemoveToolCustomizationAction`
- added type `McpServerSetAuthenticationModeAction`
- added type `McpServerSetDescriptionAction`
- added type `McpServerSetJsonOutputFilteringAction`
- added type `McpServerSetNameAction`
- added type `McpServerSetStateAction`
- added type `McpServerSetToolCustomizationsAction`
- added type `McpServerSetToolOutputFormattingAction`
- added type `McpServerSetToolsAction`
- added type `CartEstimatedDeliverySetMessage`
- added type `OrderEstimatedDeliverySetMessage`
- added type `ProductTailoringKeySetMessage`
- added type `StoreCheckoutUrlTemplateSetMessage`
- added type `StoreContactUrlSetMessage`
- added type `StoreCookiePolicyUrlSetMessage`
- added type `StoreFaqUrlSetMessage`
- added type `StoreImprintUrlSetMessage`
- added type `StoreOrderUrlTemplateSetMessage`
- added type `StorePrivacyPolicyUrlSetMessage`
- added type `StoreRefundPolicyUrlSetMessage`
- added type `StoreShippingPolicyUrlSetMessage`
- added type `StoreTermsOfServiceUrlSetMessage`
- added type `CartEstimatedDeliverySetMessagePayload`
- added type `OrderEstimatedDeliverySetMessagePayload`
- added type `ProductTailoringKeySetMessagePayload`
- added type `StoreCheckoutUrlTemplateSetMessagePayload`
- added type `StoreContactUrlSetMessagePayload`
- added type `StoreCookiePolicyUrlSetMessagePayload`
- added type `StoreFaqUrlSetMessagePayload`
- added type `StoreImprintUrlSetMessagePayload`
- added type `StoreOrderUrlTemplateSetMessagePayload`
- added type `StorePrivacyPolicyUrlSetMessagePayload`
- added type `StoreRefundPolicyUrlSetMessagePayload`
- added type `StoreShippingPolicyUrlSetMessagePayload`
- added type `StoreTermsOfServiceUrlSetMessagePayload`
- added type `OrderSetEstimatedDeliveryAction`
- added type `ProductTailoringSetKeyAction`
- added type `ShippingMethodSetCarrierAction`
- added type `Storefront`
- added type `StoreSetCheckoutUrlTemplateAction`
- added type `StoreSetContactUrlAction`
- added type `StoreSetCookiePolicyUrlAction`
- added type `StoreSetFaqUrlAction`
- added type `StoreSetImprintUrlAction`
- added type `StoreSetOrderUrlTemplateAction`
- added type `StoreSetPrivacyPolicyUrlAction`
- added type `StoreSetRefundPolicyUrlAction`
- added type `StoreSetShippingPolicyUrlAction`
- added type `StoreSetTermsOfServiceUrlAction`
- added type `TypeRemoveEnumValuesAction`
- added type `TypeRemoveLocalizedEnumValuesAction`
- added type `VariantMoveImageToPositionAction`
- added type `VariantSetImageLabelAction`
</details>


<details>
<summary>Added Property(s)</summary>

- added property `estimatedDelivery` to type `ShippingInfo`
- added property `estimatedDelivery` to type `CartAddShippingMethodAction`
- added property `estimatedDelivery` to type `CartSetCustomShippingMethodAction`
- added property `estimatedDelivery` to type `CartSetShippingMethodAction`
- added property `stores` to type `DiscountCode`
- added property `product` to type `VariantCreatedMessage`
- added property `product` to type `VariantDeletedMessage`
- added property `product` to type `VariantImageAddedMessage`
- added property `product` to type `VariantImagesSetMessage`
- added property `product` to type `VariantKeySetMessage`
- added property `product` to type `VariantPublishedMessage`
- added property `product` to type `VariantSkuSetMessage`
- added property `product` to type `VariantStagedChangesRemovedMessage`
- added property `product` to type `VariantCreatedMessagePayload`
- added property `product` to type `VariantDeletedMessagePayload`
- added property `product` to type `VariantImageAddedMessagePayload`
- added property `product` to type `VariantImagesSetMessagePayload`
- added property `product` to type `VariantKeySetMessagePayload`
- added property `product` to type `VariantPublishedMessagePayload`
- added property `product` to type `VariantSkuSetMessagePayload`
- added property `product` to type `VariantStagedChangesRemovedMessagePayload`
- added property `taxedPrice` to type `CustomLineItemImportDraft`
- added property `taxedPrice` to type `LineItemImportDraft`
- added property `taxedPrice` to type `ShippingInfoImportDraft`
- added property `carrier` to type `ShippingMethod`
- added property `carrier` to type `ShippingMethodDraft`
- added property `storefront` to type `Store`
- added property `storefront` to type `StoreDraft`
- added property `warnings` to type `Variant`
- added property `categories` to type `VariantProjection`
- added property `categoryOrderHints` to type `VariantProjection`
</details>


<details>
<summary>MarkDeprecated Property(s)</summary>

- marked property `FacetResult::type` as deprecated
- marked property `FacetResults::/^[a-z].*$/` as deprecated
- marked property `FilteredFacetResult::type` as deprecated
- marked property `ProductProjectionPagedSearchResponse::facets` as deprecated
- marked property `RangeFacetResult::type` as deprecated
- marked property `TermFacetResult::type` as deprecated
- marked property `TermFacetResult::dataType` as deprecated
</details>


<details>
<summary>Changed Property(s)</summary>

- :warning: changed property `expand` of type `ProductSearchProjectionParams` from type `Expansion[]` to `string[]`
</details>


<details>
<summary>Removed Property(s)</summary>

- :warning: removed property `productId` from type `VariantCreatedMessage`
- :warning: removed property `productId` from type `VariantCreatedMessagePayload`
</details>


<details>
<summary>Added Resource(s)</summary>

- added resource `/{projectKey}/agents`
- added resource `/{projectKey}/mcp-servers`
- added resource `/{projectKey}/agents/intake`
- added resource `/{projectKey}/agents/intake/v1`
- added resource `/{projectKey}/agents/intake/v1/responses`
- added resource `/{projectKey}/variants/{ID}/images`
- added resource `/{projectKey}/in-store/key={storeKey}/discount-codes`
- added resource `/{projectKey}/in-store/key={storeKey}/discount-codes/key={key}`
- added resource `/{projectKey}/in-store/key={storeKey}/discount-codes/{ID}`
- added resource `/{projectKey}/mcp-servers/types`
- added resource `/{projectKey}/mcp-servers/key={key}`
- added resource `/{projectKey}/mcp-servers/{ID}`
- added resource `/{projectKey}/mcp-servers/types/{mcpServerType}`
</details>


<details>
<summary>Added Enum(s)</summary>

- added enum `variant` to type `AttributeReferenceTypeId`
- added enum `variant` to type `ChangeSubscriptionResourceTypeId`
- added enum `variant` to type `MessageSubscriptionResourceTypeId`
- added enum `variant` to type `CustomFieldReferenceValue`
</details>


<details>
<summary>MarkDeprecated Method(s)</summary>

- marked method `post /{projectKey}/product-projections/search` as deprecated
- marked method `get /{projectKey}/product-projections/search` as deprecated
- marked method `get /{projectKey}/product-projections/suggest` as deprecated
</details>


<details>
<summary>Added Method(s)</summary>

- added method `apiRoot.withProjectKey().mcpServers().get()`
- added method `apiRoot.withProjectKey().mcpServers().post()`
- added method `apiRoot.withProjectKey().agents().intake().v1().responses().post()`
- added method `apiRoot.withProjectKey().variants().withId().images().post()`
- added method `apiRoot.withProjectKey().inStoreKeyWithStoreKeyValue().discountCodes().get()`
- added method `apiRoot.withProjectKey().inStoreKeyWithStoreKeyValue().discountCodes().head()`
- added method `apiRoot.withProjectKey().inStoreKeyWithStoreKeyValue().discountCodes().withKey().get()`
- added method `apiRoot.withProjectKey().inStoreKeyWithStoreKeyValue().discountCodes().withKey().head()`
- added method `apiRoot.withProjectKey().inStoreKeyWithStoreKeyValue().discountCodes().withId().get()`
- added method `apiRoot.withProjectKey().inStoreKeyWithStoreKeyValue().discountCodes().withId().head()`
- added method `apiRoot.withProjectKey().mcpServers().types().get()`
- added method `apiRoot.withProjectKey().mcpServers().withKey().get()`
- added method `apiRoot.withProjectKey().mcpServers().withKey().post()`
- added method `apiRoot.withProjectKey().mcpServers().withKey().delete()`
- added method `apiRoot.withProjectKey().mcpServers().withId().get()`
- added method `apiRoot.withProjectKey().mcpServers().withId().post()`
- added method `apiRoot.withProjectKey().mcpServers().withId().delete()`
- added method `apiRoot.withProjectKey().mcpServers().types().withMcpServerType().get()`
</details>

**History changes**

<details>
<summary>Required Property(s)</summary>

- changed property `total` of type `RecordPagedQueryResponse` to be optional
</details>


<details>
<summary>Added QueryParameter(s)</summary>

- added query parameter `withTotal` to method `get /{projectKey}`
- added query parameter `withTotal` to method `get /{projectKey}/{resourceType}`
- added query parameter `withTotal` to method `get /{projectKey}/{resourceType}/{ID}`
</details>

