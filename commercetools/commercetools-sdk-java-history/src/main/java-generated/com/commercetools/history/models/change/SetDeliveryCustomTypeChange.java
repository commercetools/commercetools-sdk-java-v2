
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.history.models.common.CustomFields;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Change triggered by the <a href="https://docs.commercetools.com/apis/ctp:api:type:OrderSetDeliveryCustomTypeAction" rel="nofollow">Set Delivery Custom Type</a> update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetDeliveryCustomTypeChange setDeliveryCustomTypeChange = SetDeliveryCustomTypeChange.builder()
 *             .change("{change}")
 *             .deliveryId("{deliveryId}")
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("SetDeliveryCustomTypeChange")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = SetDeliveryCustomTypeChangeImpl.class)
public interface SetDeliveryCustomTypeChange extends Change {

    /**
     * discriminator value for SetDeliveryCustomTypeChange
     */
    String SET_DELIVERY_CUSTOM_TYPE_CHANGE = "SetDeliveryCustomTypeChange";

    /**
     *
     * @return change
     */
    @NotNull
    @JsonProperty("change")
    public String getChange();

    /**
     *
     * @return type
     */
    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
     *  <p><code>id</code> of the updated <a href="https://docs.commercetools.com/apis/ctp:api:type:Delivery" rel="nofollow">Delivery</a>.</p>
     * @return deliveryId
     */
    @NotNull
    @JsonProperty("deliveryId")
    public String getDeliveryId();

    /**
     *  <p>Value before the change.</p>
     * @return previousValue
     */
    @NotNull
    @Valid
    @JsonProperty("previousValue")
    public CustomFields getPreviousValue();

    /**
     *  <p>Value after the change.</p>
     * @return nextValue
     */
    @NotNull
    @Valid
    @JsonProperty("nextValue")
    public CustomFields getNextValue();

    /**
     * set change
     * @param change value to be set
     */

    public void setChange(final String change);

    /**
     *  <p><code>id</code> of the updated <a href="https://docs.commercetools.com/apis/ctp:api:type:Delivery" rel="nofollow">Delivery</a>.</p>
     * @param deliveryId value to be set
     */

    public void setDeliveryId(final String deliveryId);

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     */

    public void setPreviousValue(final CustomFields previousValue);

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     */

    public void setNextValue(final CustomFields nextValue);

    /**
     * factory method
     * @return instance of SetDeliveryCustomTypeChange
     */
    public static SetDeliveryCustomTypeChange of() {
        return new SetDeliveryCustomTypeChangeImpl();
    }

    /**
     * factory method to create a shallow copy SetDeliveryCustomTypeChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static SetDeliveryCustomTypeChange of(final SetDeliveryCustomTypeChange template) {
        SetDeliveryCustomTypeChangeImpl instance = new SetDeliveryCustomTypeChangeImpl();
        instance.setChange(template.getChange());
        instance.setDeliveryId(template.getDeliveryId());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    public SetDeliveryCustomTypeChange copyDeep();

    /**
     * factory method to create a deep copy of SetDeliveryCustomTypeChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static SetDeliveryCustomTypeChange deepCopy(@Nullable final SetDeliveryCustomTypeChange template) {
        if (template == null) {
            return null;
        }
        SetDeliveryCustomTypeChangeImpl instance = new SetDeliveryCustomTypeChangeImpl();
        instance.setChange(template.getChange());
        instance.setDeliveryId(template.getDeliveryId());
        instance.setPreviousValue(
            com.commercetools.history.models.common.CustomFields.deepCopy(template.getPreviousValue()));
        instance.setNextValue(com.commercetools.history.models.common.CustomFields.deepCopy(template.getNextValue()));
        return instance;
    }

    /**
     * builder factory method for SetDeliveryCustomTypeChange
     * @return builder
     */
    public static SetDeliveryCustomTypeChangeBuilder builder() {
        return SetDeliveryCustomTypeChangeBuilder.of();
    }

    /**
     * create builder for SetDeliveryCustomTypeChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetDeliveryCustomTypeChangeBuilder builder(final SetDeliveryCustomTypeChange template) {
        return SetDeliveryCustomTypeChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withSetDeliveryCustomTypeChange(Function<SetDeliveryCustomTypeChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<SetDeliveryCustomTypeChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SetDeliveryCustomTypeChange>() {
            @Override
            public String toString() {
                return "TypeReference<SetDeliveryCustomTypeChange>";
            }
        };
    }
}
