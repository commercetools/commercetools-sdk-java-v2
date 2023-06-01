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

