
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.history.models.change_value.DeliveryChangeValue;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * AddDeliveryChange
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AddDeliveryChange addDeliveryChange = AddDeliveryChange.builder()
 *             .change("{change}")
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = AddDeliveryChangeImpl.class)
public interface AddDeliveryChange extends Change {

    /**
     * discriminator value for AddDeliveryChange
     */
    String ADD_DELIVERY_CHANGE = "AddDeliveryChange";

    /**
     *
     * @return type
     */
    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
     *  <p>Update action for <code>addDelivery</code></p>
     * @return change
     */
    @NotNull
    @JsonProperty("change")
    public String getChange();

    /**
     *
     * @return nextValue
     */
    @NotNull
    @Valid
    @JsonProperty("nextValue")
    public DeliveryChangeValue getNextValue();

    /**
     *
     * @return previousValue
     */
    @NotNull
    @Valid
    @JsonProperty("previousValue")
    public DeliveryChangeValue getPreviousValue();

    /**
     *  <p>Update action for <code>addDelivery</code></p>
     * @param change value to be set
     */

    public void setChange(final String change);

    /**
     * set nextValue
     * @param nextValue value to be set
     */

    public void setNextValue(final DeliveryChangeValue nextValue);

    /**
     * set previousValue
     * @param previousValue value to be set
     */

    public void setPreviousValue(final DeliveryChangeValue previousValue);

    /**
     * factory method
     * @return instance of AddDeliveryChange
     */
    public static AddDeliveryChange of() {
        return new AddDeliveryChangeImpl();
    }

    /**
     * factory method to create a shallow copy AddDeliveryChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static AddDeliveryChange of(final AddDeliveryChange template) {
        AddDeliveryChangeImpl instance = new AddDeliveryChangeImpl();
        instance.setChange(template.getChange());
        instance.setNextValue(template.getNextValue());
        instance.setPreviousValue(template.getPreviousValue());
        return instance;
    }

    /**
     * factory method to create a deep copy of AddDeliveryChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static AddDeliveryChange deepCopy(@Nullable final AddDeliveryChange template) {
        if (template == null) {
            return null;
        }
        AddDeliveryChangeImpl instance = new AddDeliveryChangeImpl();
        instance.setChange(template.getChange());
        instance.setNextValue(
            com.commercetools.history.models.change_value.DeliveryChangeValue.deepCopy(template.getNextValue()));
        instance.setPreviousValue(
            com.commercetools.history.models.change_value.DeliveryChangeValue.deepCopy(template.getPreviousValue()));
        return instance;
    }

    /**
     * builder factory method for AddDeliveryChange
     * @return builder
     */
    public static AddDeliveryChangeBuilder builder() {
        return AddDeliveryChangeBuilder.of();
    }

    /**
     * create builder for AddDeliveryChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static AddDeliveryChangeBuilder builder(final AddDeliveryChange template) {
        return AddDeliveryChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withAddDeliveryChange(Function<AddDeliveryChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<AddDeliveryChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<AddDeliveryChange>() {
            @Override
            public String toString() {
                return "TypeReference<AddDeliveryChange>";
            }
        };
    }
}
