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
</details>

**Import changes**

<details>
<summary>Added Property(s)</summary>

- added property `product` to type `ProductVariantPatch`
</details>

