package com.commercetools.history.models.change;

import com.commercetools.history.models.change.Change;
import com.commercetools.history.models.common.Parcel;
import com.commercetools.history.models.change.RemoveParcelFromDeliveryChangeImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.annotation.Nullable;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.io.IOException;

/**
 * RemoveParcelFromDeliveryChange
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     RemoveParcelFromDeliveryChange removeParcelFromDeliveryChange = RemoveParcelFromDeliveryChange.builder()
 *             .change("{change}")
 *             .deliveryId("{deliveryId}")
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
@JsonDeserialize(as = RemoveParcelFromDeliveryChangeImpl.class)
public interface RemoveParcelFromDeliveryChange extends Change {

    /**
     * discriminator value for RemoveParcelFromDeliveryChange
     */
    String REMOVE_PARCEL_FROM_DELIVERY_CHANGE = "RemoveParcelFromDeliveryChange";

    /**
     *
     * @return type
     */
    @NotNull
    @JsonProperty("type")
    public String getType();
    /**
     *  <p>Update action for <code>removeParcelFromDelivery</code></p>
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
     * @return previousValue
     */
    @NotNull
    @Valid
    @JsonProperty("previousValue")
    public Parcel getPreviousValue();

    /**
     *  <p>Update action for <code>removeParcelFromDelivery</code></p>
     * @param change value to be set
     */
    
    public void setChange(final String change);
    
    
    /**
     * set deliveryId
     * @param deliveryId value to be set
     */
    
    public void setDeliveryId(final String deliveryId);
    
    
    /**
     * set previousValue
     * @param previousValue value to be set
     */
    
    public void setPreviousValue(final Parcel previousValue);
    

    /**
     * factory method
     * @return instance of RemoveParcelFromDeliveryChange
     */
    public static RemoveParcelFromDeliveryChange of(){
        return new RemoveParcelFromDeliveryChangeImpl();
    }
    

    /**
     * factory method to create a shallow copy RemoveParcelFromDeliveryChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static RemoveParcelFromDeliveryChange of(final RemoveParcelFromDeliveryChange template) {
        RemoveParcelFromDeliveryChangeImpl instance = new RemoveParcelFromDeliveryChangeImpl();
        instance.setChange(template.getChange());
        instance.setDeliveryId(template.getDeliveryId());
        instance.setPreviousValue(template.getPreviousValue());
        return instance;
    }

    /**
     * factory method to create a deep copy of RemoveParcelFromDeliveryChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static RemoveParcelFromDeliveryChange deepCopy(@Nullable final RemoveParcelFromDeliveryChange template) {
        if (template == null) {
            return null;
        }
        RemoveParcelFromDeliveryChangeImpl instance = new RemoveParcelFromDeliveryChangeImpl();
        instance.setChange(template.getChange());
        instance.setDeliveryId(template.getDeliveryId());
        instance.setPreviousValue(com.commercetools.history.models.common.Parcel.deepCopy(template.getPreviousValue()));
        return instance;
    }

    /**
     * builder factory method for RemoveParcelFromDeliveryChange
     * @return builder
     */
    public static RemoveParcelFromDeliveryChangeBuilder builder() {
        return RemoveParcelFromDeliveryChangeBuilder.of();
    }
    
    /**
     * create builder for RemoveParcelFromDeliveryChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static RemoveParcelFromDeliveryChangeBuilder builder(final RemoveParcelFromDeliveryChange template) {
        return RemoveParcelFromDeliveryChangeBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withRemoveParcelFromDeliveryChange(Function<RemoveParcelFromDeliveryChange, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<RemoveParcelFromDeliveryChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<RemoveParcelFromDeliveryChange>() {
            @Override
            public String toString() {
                return "TypeReference<RemoveParcelFromDeliveryChange>";
            }
        };
    }
}
