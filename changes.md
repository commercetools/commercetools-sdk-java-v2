**Api changes**

<details>
<summary>Changed Property(s)</summary>

- :warning: changed property `line` of type `GraphQLErrorLocation` from type `integer` to `number`
- :warning: changed property `column` of type `GraphQLErrorLocation` from type `integer` to `number`
- :warning: changed property `totalPrice` of type `StagedOrder` from type `TypedMoney` to `CentPrecisionMoney`
- :warning: changed property `totalPrice` of type `Order` from type `TypedMoney` to `CentPrecisionMoney`
</details>


<details>
<summary>Added QueryParameter(s)</summary>

- added query parameter `where` to method `get /{projectKey}/product-selections/key={key}/products`
- added query parameter `where` to method `get /{projectKey}/product-selections/{ID}/products`
</details>

