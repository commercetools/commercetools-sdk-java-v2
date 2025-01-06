**Api changes**

<details>
<summary>Changed Property(s)</summary>

- :warning: changed property `exact` of type `SearchExactExpression` from type `SearchAnyValue` to `SearchExactValue`
</details>


<details>
<summary>Added Property(s)</summary>

- added property `businessUnits` to type `SearchIndexingConfiguration`
</details>


<details>
<summary>Added Resource(s)</summary>

- added resource `/{projectKey}/business-units/search`
- added resource `/{projectKey}/business-units/search/indexing-status`
</details>


<details>
<summary>Added Method(s)</summary>

- added method `apiRoot.withProjectKey().businessUnits().search().post()`
- added method `apiRoot.withProjectKey().businessUnits().search().head()`
- added method `apiRoot.withProjectKey().businessUnits().searchIndexingStatus().get()`
</details>


<details>
<summary>Added Type(s)</summary>

- added type `BusinessUnitIndexingProgress`
- added type `BusinessUnitIndexingStatus`
- added type `BusinessUnitPagedSearchResponse`
- added type `BusinessUnitSearchIndexingStatusResponse`
- added type `BusinessUnitSearchRequest`
- added type `BusinessUnitSearchResult`
- added type `BusinessUnitSearchStatus`
- added type `ProjectChangeBusinessUnitSearchStatusAction`
- added type `SearchExactValue`
</details>

**History changes**

<details>
<summary>Added Resource(s)</summary>

- added resource `/{projectKey}/graphql`
</details>


<details>
<summary>Added Method(s)</summary>

- added method `apiRoot.withProjectKeyValue().graphql().post()`
</details>


<details>
<summary>Added Type(s)</summary>

- added type `GraphQLRequest`
- added type `GraphQLResponse`
- added type `GraphQLError`
- added type `GraphQLErrorLocation`
- added type `GraphQLVariablesMap`
- added type `GraphQLErrorObject`
</details>

