**Api changes**

<details>
<summary>Added Type(s)</summary>

- added type `CartMergeMode`
- added type `MergeCartDraft`
- added type `DiscountCombinationMode`
- added type `DiscountsConfiguration`
- added type `ProjectSetDiscountsConfigurationAction`
</details>


<details>
<summary>Added Method(s)</summary>

- added method `apiRoot.withProjectKey().carts().customerIdWithCustomerIdValueMerge().post()`
- added method `apiRoot.withProjectKey().inStoreKeyWithStoreKeyValue().carts().customerIdWithCustomerIdValueMerge().post()`
</details>


<details>
<summary>Removed Property(s)</summary>

- :warning: removed property `skipConfiguration` from type `RecurringOrderSetOrderSkipConfigurationAction`
</details>


<details>
<summary>Added Property(s)</summary>

- added property `discounts` to type `Project`
- added property `skipConfigurationInputDraft` to type `RecurringOrderSetOrderSkipConfigurationAction`
</details>


<details>
<summary>Added Resource(s)</summary>

- added resource `/{projectKey}/carts/customer-id={customerId}/merge`
- added resource `/{projectKey}/in-store/key={storeKey}/carts/customer-id={customerId}/merge`
</details>

