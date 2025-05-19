
package com.commercetools.importapi.models.order_patches;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.importapi.models.common.Address;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 * DeliveryAddressDraft
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     DeliveryAddressDraft deliveryAddressDraft = DeliveryAddressDraft.builder()
 *             .deliveryId("{deliveryId}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = DeliveryAddressDraftImpl.class)
public interface DeliveryAddressDraft extends io.vrap.rmf.base.client.Draft<DeliveryAddressDraft> {

    /**
     *
     * @return deliveryId
     */
    @NotNull
    @JsonProperty("deliveryId")
    public String getDeliveryId();

    /**
     *
     * @return address
     */
    @Valid
    @JsonProperty("address")
    public Address getAddress();

    /**
     * set deliveryId
     * @param deliveryId value to be set
     */

    public void setDeliveryId(final String deliveryId);

    /**
     * set address
     * @param address value to be set
     */

    public void setAddress(final Address address);

    /**
     * factory method
     * @return instance of DeliveryAddressDraft
     */
    public static DeliveryAddressDraft of() {
        return new DeliveryAddressDraftImpl();
    }

    /**
     * factory method to create a shallow copy DeliveryAddressDraft
     * @param template instance to be copied
     * @return copy instance
     */
    public static DeliveryAddressDraft of(final DeliveryAddressDraft template) {
        DeliveryAddressDraftImpl instance = new DeliveryAddressDraftImpl();
        instance.setDeliveryId(template.getDeliveryId());
        instance.setAddress(template.getAddress());
        return instance;
    }

    public DeliveryAddressDraft copyDeep();

    /**
     * factory method to create a deep copy of DeliveryAddressDraft
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static DeliveryAddressDraft deepCopy(@Nullable final DeliveryAddressDraft template) {
        if (template == null) {
            return null;
        }
        DeliveryAddressDraftImpl instance = new DeliveryAddressDraftImpl();
        instance.setDeliveryId(template.getDeliveryId());
        instance.setAddress(com.commercetools.importapi.models.common.Address.deepCopy(template.getAddress()));
        return instance;
    }

    /**
     * builder factory method for DeliveryAddressDraft
     * @return builder
     */
    public static DeliveryAddressDraftBuilder builder() {
        return DeliveryAddressDraftBuilder.of();
    }

    /**
     * create builder for DeliveryAddressDraft instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static DeliveryAddressDraftBuilder builder(final DeliveryAddressDraft template) {
        return DeliveryAddressDraftBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withDeliveryAddressDraft(Function<DeliveryAddressDraft, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<DeliveryAddressDraft> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<DeliveryAddressDraft>() {
            @Override
            public String toString() {
                return "TypeReference<DeliveryAddressDraft>";
            }
        };
    }
}
