
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.history.models.common.Address;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetDeliveryAddressChange
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetDeliveryAddressChange setDeliveryAddressChange = SetDeliveryAddressChange.builder()
 *             .change("{change}")
 *             .deliveryId("{deliveryId}")
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = SetDeliveryAddressChangeImpl.class)
public interface SetDeliveryAddressChange extends Change {

    /**
     * discriminator value for SetDeliveryAddressChange
     */
    String SET_DELIVERY_ADDRESS_CHANGE = "SetDeliveryAddressChange";

    /**
     *
     * @return type
     */
    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
     *  <p>Update action for <code>setDeliveryAddress</code></p>
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
    public Address getNextValue();

    /**
     *
     * @return previousValue
     */
    @NotNull
    @Valid
    @JsonProperty("previousValue")
    public Address getPreviousValue();

    /**
     *  <p>Update action for <code>setDeliveryAddress</code></p>
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

    public void setNextValue(final Address nextValue);

    /**
     * set previousValue
     * @param previousValue value to be set
     */

    public void setPreviousValue(final Address previousValue);

    /**
     * factory method
     * @return instance of SetDeliveryAddressChange
     */
    public static SetDeliveryAddressChange of() {
        return new SetDeliveryAddressChangeImpl();
    }

    /**
     * factory method to copy an instance of SetDeliveryAddressChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static SetDeliveryAddressChange of(final SetDeliveryAddressChange template) {
        SetDeliveryAddressChangeImpl instance = new SetDeliveryAddressChangeImpl();
        instance.setChange(template.getChange());
        instance.setDeliveryId(template.getDeliveryId());
        instance.setNextValue(template.getNextValue());
        instance.setPreviousValue(template.getPreviousValue());
        return instance;
    }

    /**
     * builder factory method for SetDeliveryAddressChange
     * @return builder
     */
    public static SetDeliveryAddressChangeBuilder builder() {
        return SetDeliveryAddressChangeBuilder.of();
    }

    /**
     * create builder for SetDeliveryAddressChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetDeliveryAddressChangeBuilder builder(final SetDeliveryAddressChange template) {
        return SetDeliveryAddressChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withSetDeliveryAddressChange(Function<SetDeliveryAddressChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<SetDeliveryAddressChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SetDeliveryAddressChange>() {
            @Override
            public String toString() {
                return "TypeReference<SetDeliveryAddressChange>";
            }
        };
    }
}
