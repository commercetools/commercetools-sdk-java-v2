
package com.commercetools.api.models.inventory;

import java.time.*;
import java.time.ZonedDateTime;
import java.util.*;
import java.util.function.Function;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * InventoryEntrySetExpectedDeliveryAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     InventoryEntrySetExpectedDeliveryAction inventoryEntrySetExpectedDeliveryAction = InventoryEntrySetExpectedDeliveryAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = InventoryEntrySetExpectedDeliveryActionImpl.class)
public interface InventoryEntrySetExpectedDeliveryAction extends InventoryEntryUpdateAction {

    String SET_EXPECTED_DELIVERY = "setExpectedDelivery";

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     */

    @JsonProperty("expectedDelivery")
    public ZonedDateTime getExpectedDelivery();

    public void setExpectedDelivery(final ZonedDateTime expectedDelivery);

    public static InventoryEntrySetExpectedDeliveryAction of() {
        return new InventoryEntrySetExpectedDeliveryActionImpl();
    }

    public static InventoryEntrySetExpectedDeliveryAction of(final InventoryEntrySetExpectedDeliveryAction template) {
        InventoryEntrySetExpectedDeliveryActionImpl instance = new InventoryEntrySetExpectedDeliveryActionImpl();
        instance.setExpectedDelivery(template.getExpectedDelivery());
        return instance;
    }

    public static InventoryEntrySetExpectedDeliveryActionBuilder builder() {
        return InventoryEntrySetExpectedDeliveryActionBuilder.of();
    }

    public static InventoryEntrySetExpectedDeliveryActionBuilder builder(
            final InventoryEntrySetExpectedDeliveryAction template) {
        return InventoryEntrySetExpectedDeliveryActionBuilder.of(template);
    }

    default <T> T withInventoryEntrySetExpectedDeliveryAction(
            Function<InventoryEntrySetExpectedDeliveryAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<InventoryEntrySetExpectedDeliveryAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<InventoryEntrySetExpectedDeliveryAction>() {
            @Override
            public String toString() {
                return "TypeReference<InventoryEntrySetExpectedDeliveryAction>";
            }
        };
    }
}
