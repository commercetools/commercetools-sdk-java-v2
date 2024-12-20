**Api changes**

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
</details>


<details>
<summary>Added Property(s)</summary>

- added property `businessUnits` to type `SearchIndexingConfiguration`
</details>

