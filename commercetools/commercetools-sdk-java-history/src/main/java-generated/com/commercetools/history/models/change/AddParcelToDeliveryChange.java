
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.history.models.common.Parcel;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Change triggered by the following update actions:</p>
 *  <ul>
 *   <li><a href="https://docs.commercetools.com/apis/ctp:api:type:OrderAddParcelToDeliveryAction" rel="nofollow">Add Parcel</a> on Orders.</li>
 *   <li><a href="https://docs.commercetools.com/apis/ctp:api:type:StagedOrderAddParcelToDeliveryAction" rel="nofollow">Add Parcel</a> on Staged Orders.</li>
 *  </ul>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AddParcelToDeliveryChange addParcelToDeliveryChange = AddParcelToDeliveryChange.builder()
 *             .change("{change}")
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .deliveryId("{deliveryId}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("AddParcelToDeliveryChange")
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
     *
     * @return change
     */
    @NotNull
    @JsonProperty("change")
    public String getChange();

    /**
     *  <p>Value after the change.</p>
     * @return nextValue
     */
    @NotNull
    @Valid
    @JsonProperty("nextValue")
    public Parcel getNextValue();

    /**
     *  <p><code>id</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Delivery" rel="nofollow">Delivery</a> to which the Parcel was added.</p>
     * @return deliveryId
     */
    @NotNull
    @JsonProperty("deliveryId")
    public String getDeliveryId();

    /**
     * set change
     * @param change value to be set
     */

    public void setChange(final String change);

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     */

    public void setNextValue(final Parcel nextValue);

    /**
     *  <p><code>id</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Delivery" rel="nofollow">Delivery</a> to which the Parcel was added.</p>
     * @param deliveryId value to be set
     */

    public void setDeliveryId(final String deliveryId);

    /**
     * factory method
     * @return instance of AddParcelToDeliveryChange
     */
    public static AddParcelToDeliveryChange of() {
        return new AddParcelToDeliveryChangeImpl();
    }

    /**
     * factory method to create a shallow copy AddParcelToDeliveryChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static AddParcelToDeliveryChange of(final AddParcelToDeliveryChange template) {
        AddParcelToDeliveryChangeImpl instance = new AddParcelToDeliveryChangeImpl();
        instance.setChange(template.getChange());
        instance.setNextValue(template.getNextValue());
        instance.setDeliveryId(template.getDeliveryId());
        return instance;
    }

    public AddParcelToDeliveryChange copyDeep();

    /**
     * factory method to create a deep copy of AddParcelToDeliveryChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static AddParcelToDeliveryChange deepCopy(@Nullable final AddParcelToDeliveryChange template) {
        if (template == null) {
            return null;
        }
        AddParcelToDeliveryChangeImpl instance = new AddParcelToDeliveryChangeImpl();
        instance.setChange(template.getChange());
        instance.setNextValue(com.commercetools.history.models.common.Parcel.deepCopy(template.getNextValue()));
        instance.setDeliveryId(template.getDeliveryId());
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
