
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.history.models.common.Parcel;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * AddParcelToDeliveryChange
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AddParcelToDeliveryChange addParcelToDeliveryChange = AddParcelToDeliveryChange.builder()
 *             .change("{change}")
 *             .deliveryId("{deliveryId}")
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = AddParcelToDeliveryChangeImpl.class)
public interface AddParcelToDeliveryChange extends Change {

    /**
     * discriminator value for AddParcelToDeliveryChange
     */
    String ADD_PARCEL_TO_DELIVERY_CHANGE = "AddParcelToDeliveryChange";

    /**
     *
     * @return type
     */
    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
     *  <p>Update action for <code>addParcelToDelivery</code></p>
     * @return change
     */
    @NotNull
    @JsonProperty("change")
    public String getChange();

    /**
     *
     * @return deliveryId
     */
    @NotNull
    @JsonProperty("deliveryId")
    public String getDeliveryId();

    /**
     *
     * @return nextValue
     */
    @NotNull
    @Valid
    @JsonProperty("nextValue")
    public Parcel getNextValue();

    /**
     *  <p>Update action for <code>addParcelToDelivery</code></p>
     * @param change value to be set
     */

    public void setChange(final String change);

    /**
     * set deliveryId
     * @param deliveryId value to be set
     */

    public void setDeliveryId(final String deliveryId);

    /**
     * set nextValue
     * @param nextValue value to be set
     */

    public void setNextValue(final Parcel nextValue);

    /**
     * factory method
     * @return instance of AddParcelToDeliveryChange
     */
    public static AddParcelToDeliveryChange of() {
        return new AddParcelToDeliveryChangeImpl();
    }

    /**
     * factory method to copy an instance of AddParcelToDeliveryChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static AddParcelToDeliveryChange of(final AddParcelToDeliveryChange template) {
        AddParcelToDeliveryChangeImpl instance = new AddParcelToDeliveryChangeImpl();
        instance.setChange(template.getChange());
        instance.setDeliveryId(template.getDeliveryId());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    /**
     * builder factory method for AddParcelToDeliveryChange
     * @return builder
     */
    public static AddParcelToDeliveryChangeBuilder builder() {
        return AddParcelToDeliveryChangeBuilder.of();
    }

    /**
     * create builder for AddParcelToDeliveryChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static AddParcelToDeliveryChangeBuilder builder(final AddParcelToDeliveryChange template) {
        return AddParcelToDeliveryChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withAddParcelToDeliveryChange(Function<AddParcelToDeliveryChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<AddParcelToDeliveryChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<AddParcelToDeliveryChange>() {
            @Override
            public String toString() {
                return "TypeReference<AddParcelToDeliveryChange>";
            }
        };
    }
}
