**Api changes**

<details>
<summary>Added Property(s)</summary>

- added property `estimatedDelivery` to type `ShippingInfo`
- added property `estimatedDelivery` to type `CartAddShippingMethodAction`
- added property `estimatedDelivery` to type `CartSetCustomShippingMethodAction`
- added property `estimatedDelivery` to type `CartSetShippingMethodAction`
- added property `stores` to type `DiscountCode`
- added property `carrier` to type `ShippingMethod`
- added property `carrier` to type `ShippingMethodDraft`
- added property `storefront` to type `Store`
- added property `storefront` to type `StoreDraft`
- added property `warnings` to type `Variant`
- added property `categories` to type `VariantProjection`
- added property `categoryOrderHints` to type `VariantProjection`
</details>


<details>
<summary>Added Enum(s)</summary>

- added enum `variant` to type `AttributeReferenceTypeId`
- added enum `variant` to type `CustomFieldReferenceValue`
</details>


<details>
<summary>Added Resource(s)</summary>

- added resource `/{projectKey}/mcp-servers`
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
<summary>Added Method(s)</summary>

- added method `apiRoot.withProjectKey().mcpServers().get()`
- added method `apiRoot.withProjectKey().mcpServers().post()`
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


<details>
<summary>Added Type(s)</summary>

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
- added type `VariantMoveImageToPositionAction`
- added type `VariantSetImageLabelAction`
</details>

**History changes**

<details>
<summary>Added QueryParameter(s)</summary>

- added query parameter `withTotal` to method `get /{projectKey}`
- added query parameter `withTotal` to method `get /{projectKey}/{resourceType}`
- added query parameter `withTotal` to method `get /{projectKey}/{resourceType}/{ID}`
</details>


<details>
<summary>Required Property(s)</summary>

- changed property `total` of type `RecordPagedQueryResponse` to be optional
</details>

