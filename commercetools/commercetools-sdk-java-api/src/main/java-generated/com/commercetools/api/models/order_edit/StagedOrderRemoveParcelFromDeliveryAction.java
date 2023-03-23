
package com.commercetools.api.models.order_edit;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.commercetools.api.models.order.StagedOrderUpdateAction;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * StagedOrderRemoveParcelFromDeliveryAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StagedOrderRemoveParcelFromDeliveryAction stagedOrderRemoveParcelFromDeliveryAction = StagedOrderRemoveParcelFromDeliveryAction.builder()
 *             .parcelId("{parcelId}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = StagedOrderRemoveParcelFromDeliveryActionImpl.class)
public interface StagedOrderRemoveParcelFromDeliveryAction extends StagedOrderUpdateAction {

    String REMOVE_PARCEL_FROM_DELIVERY = "removeParcelFromDelivery";

    /**
     *
     * @return parcelId
     */
    @NotNull
    @JsonProperty("parcelId")
    public String getParcelId();

    public void setParcelId(final String parcelId);

    public static StagedOrderRemoveParcelFromDeliveryAction of() {
        return new StagedOrderRemoveParcelFromDeliveryActionImpl();
    }

    public static StagedOrderRemoveParcelFromDeliveryAction of(
            final StagedOrderRemoveParcelFromDeliveryAction template) {
        StagedOrderRemoveParcelFromDeliveryActionImpl instance = new StagedOrderRemoveParcelFromDeliveryActionImpl();
        instance.setParcelId(template.getParcelId());
        return instance;
    }

    public static StagedOrderRemoveParcelFromDeliveryActionBuilder builder() {
        return StagedOrderRemoveParcelFromDeliveryActionBuilder.of();
    }

    public static StagedOrderRemoveParcelFromDeliveryActionBuilder builder(
            final StagedOrderRemoveParcelFromDeliveryAction template) {
        return StagedOrderRemoveParcelFromDeliveryActionBuilder.of(template);
    }

    default <T> T withStagedOrderRemoveParcelFromDeliveryAction(
            Function<StagedOrderRemoveParcelFromDeliveryAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<StagedOrderRemoveParcelFromDeliveryAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StagedOrderRemoveParcelFromDeliveryAction>() {
            @Override
            public String toString() {
                return "TypeReference<StagedOrderRemoveParcelFromDeliveryAction>";
            }
        };
    }
}
