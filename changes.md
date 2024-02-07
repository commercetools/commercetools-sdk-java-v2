**Api changes**

<details>
<summary>Added Method(s)</summary>

- added method `apiRoot.withProjectKey().discountCodes().withKey().get()`
- added method `apiRoot.withProjectKey().discountCodes().withKey().head()`
- added method `apiRoot.withProjectKey().discountCodes().withKey().post()`
- added method `apiRoot.withProjectKey().discountCodes().withKey().delete()`
</details>


<details>
<summary>Added Property(s)</summary>

- added property `perMethodExternalTaxRate` to type `CartAddLineItemAction`
- added property `key` to type `DiscountCode`
- added property `key` to type `DiscountCodeDraft`
- added property `shippingMode` to type `MyCartDraft`
</details>


<details>
<summary>Added Resource(s)</summary>

- added resource `/{projectKey}/discount-codes/key={key}`
</details>


<details>
<summary>Added Type(s)</summary>

- added type `DiscountCodeSetKeyAction`
- added type `DiscountCodeCreatedMessage`
- added type `DiscountCodeDeletedMessage`
- added type `DiscountCodeKeySetMessage`
- added type `DiscountCodeCreatedMessagePayload`
- added type `DiscountCodeDeletedMessagePayload`
- added type `DiscountCodeKeySetMessagePayload`
</details>

