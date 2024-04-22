
package com.commercetools.docs.meta;

/**
 * {@include.toc}
 <h2 id="subscriptions">Subscriptions</h2>

 <h3 id="delivery-payloads">Delivery Payloads</h3>
 <p>The SDK provides the JsonUtils class which can be used to deserialize the delivery payload sent
 by a subscription. Using the {@link com.commercetools.api.models.subscription.DeliveryPayload} class
 it will deserialize it correctly to a {@link com.commercetools.api.models.subscription.MessageDeliveryPayload},
 {@link com.commercetools.api.models.subscription.ResourceCreatedDeliveryPayload},
 {@link com.commercetools.api.models.subscription.ResourceUpdatedDeliveryPayload}, or
 {@link com.commercetools.api.models.subscription.ResourceDeletedDeliveryPayload}</p>

 {@include.example example.SerializationTest#deliveryPayloads()}

 <h4 id="message-payloads">Message Payloads</h4>
 <p>The {@link com.commercetools.api.models.subscription.MessageDeliveryPayload} include a helper method to
 cast to the inner message delivery and return the wrapped message.</p>

 {@include.example example.SerializationTest#messageDeliveryPayloads()}

 <h4 id="change-payloads">Change Payloads</h4>
 <p></p>

 {@include.example example.SerializationTest#changeDeliveryPayloads()}

 */
public final class Subscriptions {
    private Subscriptions() {
    }
}
