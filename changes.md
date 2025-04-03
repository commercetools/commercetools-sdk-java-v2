**Api changes**

<details>
<summary>Changed Type(s)</summary>

- :warning: changed type `DeliveryPayload` from type `object` to `SubscriptionNotification`
</details>


<details>
<summary>Added Type(s)</summary>

- added type `BusinessUnitSetUnitTypeAction`
- added type `BaseEvent`
- added type `Event`
- added type `ImportContainerCreatedEvent`
- added type `ImportContainerCreatedEventData`
- added type `ImportContainerDeletedEvent`
- added type `ImportContainerDeletedEventData`
- added type `ImportOperationRejectedEvent`
- added type `ImportOperationRejectedEventData`
- added type `ImportUnresolvedEvent`
- added type `ImportUnresolvedEventData`
- added type `ImportValidationFailedEvent`
- added type `ImportValidationFailedEventData`
- added type `ImportWaitForMasterVariantEvent`
- added type `ImportWaitForMasterVariantEventData`
- added type `BusinessUnitTopLevelUnitSetMessage`
- added type `BusinessUnitTypeSetMessage`
- added type `BusinessUnitTopLevelUnitSetMessagePayload`
- added type `BusinessUnitTypeSetMessagePayload`
- added type `EventDeliveryPayload`
- added type `EventSubscription`
- added type `EventSubscriptionResourceTypeId`
- added type `EventType`
- added type `SubscriptionNotification`
- added type `SubscriptionSetEventsAction`
</details>


<details>
<summary>Required Property(s)</summary>

- changed property `facets` of type `ProductProjectionPagedSearchResponse` to be optional
</details>


<details>
<summary>Added Property(s)</summary>

- added property `events` to type `Subscription`
- added property `events` to type `SubscriptionDraft`
</details>


<details>
<summary>Removed QueryParameter(s)</summary>

- :warning: removed query parameter `withTotal` from method `get /{projectKey}/product-projections/search`
</details>

