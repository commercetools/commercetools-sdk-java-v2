**Api changes**

<details>
<summary>Added Property(s)</summary>

- added property `mode` to type `ProductSelection`
- added property `mode` to type `ProductSelectionDraft`
</details>


<details>
<summary>Changed Property(s)</summary>

- :warning: changed property `productSelection` of type `ProductSelectionCreatedMessage` from type `ProductSelectionType` to `ProductSelection`
- :warning: changed property `productSelection` of type `ProductSelectionCreatedMessagePayload` from type `ProductSelectionType` to `ProductSelection`
</details>


<details>
<summary>MarkDeprecated Property(s)</summary>

- marked property `IndividualExclusionProductSelectionType::type` as deprecated
- marked property `IndividualProductSelectionType::type` as deprecated
- marked property `ProductSelection::type` as deprecated
- marked property `ProductSelectionDraft::type` as deprecated
- marked property `ProductSelectionType::type` as deprecated
</details>


<details>
<summary>Required Property(s)</summary>

- changed property `type` of type `ProductSelection` to be optional
</details>


<details>
<summary>MarkDeprecated Type(s)</summary>

- marked type `IndividualExclusionProductSelectionType` as deprecated
- marked type `IndividualProductSelectionType` as deprecated
- marked type `ProductSelectionType` as deprecated
- marked type `ProductSelectionTypeEnum` as deprecated
</details>


<details>
<summary>Added Type(s)</summary>

- added type `ProductSelectionMode`
</details>

