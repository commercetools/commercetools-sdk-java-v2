**Api changes**

<details>
<summary>Added QueryParameter(s)</summary>

- added query parameter `dataErasure` to method `delete /{projectKey}/business-units/key={key}`
- added query parameter `dataErasure` to method `delete /{projectKey}/business-units/{ID}`
- added query parameter `dataErasure` to method `delete /{projectKey}/in-store/key={storeKey}/business-units/key={key}`
- added query parameter `dataErasure` to method `delete /{projectKey}/in-store/key={storeKey}/business-units/{ID}`
</details>


<details>
<summary>Added Property(s)</summary>

- added property `stores` to type `ShippingMethod`
- added property `stores` to type `ShippingMethodDraft`
</details>


<details>
<summary>Added Type(s)</summary>

- added type `ShippingMethodAddStoreAction`
- added type `ShippingMethodRemoveStoreAction`
- added type `ShippingMethodSetStoresAction`
</details>

**Checkout changes**

<details>
<summary>Changed MethodResponseBody(s)</summary>

- :warning: changed response body for `200: application/json` of method `post /{projectKey}/payment-intents/{paymentId}` from type `any` to `PaymentIntentResponse`
</details>


<details>
<summary>Added Type(s)</summary>

- added type `PaymentIntentOutcome`
- added type `PaymentIntentResponse`
</details>

