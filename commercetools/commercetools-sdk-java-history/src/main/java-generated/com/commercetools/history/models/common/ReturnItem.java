
package com.commercetools.history.models.common;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 * ReturnItem
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ReturnItem returnItem = ReturnItem.builder()
 *             .id("{id}")
 *             .quantity(1)
 *             .type("{type}")
 *             .comment("{comment}")
 *             .shipmentState(ReturnShipmentState.ADVISED)
 *             .paymentState(ReturnPaymentState.NON_REFUNDABLE)
 *             .lastModifiedAt("{lastModifiedAt}")
 *             .createdAt("{createdAt}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ReturnItemImpl.class)
public interface ReturnItem {

    /**
     *
     * @return id
     */
    @NotNull
    @JsonProperty("id")
    public String getId();

    /**
     *
     * @return quantity
     */
    @NotNull
    @JsonProperty("quantity")
    public Integer getQuantity();

    /**
     *
     * @return type
     */
    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
     *
     * @return comment
     */
    @NotNull
    @JsonProperty("comment")
    public String getComment();

    /**
     *
     * @return shipmentState
     */
    @NotNull
    @JsonProperty("shipmentState")
    public ReturnShipmentState getShipmentState();

    /**
     *
     * @return paymentState
     */
    @NotNull
    @JsonProperty("paymentState")
    public ReturnPaymentState getPaymentState();

    /**
     *
     * @return lastModifiedAt
     */
    @NotNull
    @JsonProperty("lastModifiedAt")
    public String getLastModifiedAt();

    /**
     *
     * @return createdAt
     */
    @NotNull
    @JsonProperty("createdAt")
    public String getCreatedAt();

    /**
     * set id
     * @param id value to be set
     */

    public void setId(final String id);

    /**
     * set quantity
     * @param quantity value to be set
     */

    public void setQuantity(final Integer quantity);

    /**
     * set type
     * @param type value to be set
     */

    public void setType(final String type);

    /**
     * set comment
     * @param comment value to be set
     */

    public void setComment(final String comment);

    /**
     * set shipmentState
     * @param shipmentState value to be set
     */

    public void setShipmentState(final ReturnShipmentState shipmentState);

    /**
     * set paymentState
     * @param paymentState value to be set
     */

    public void setPaymentState(final ReturnPaymentState paymentState);

    /**
     * set lastModifiedAt
     * @param lastModifiedAt value to be set
     */

    public void setLastModifiedAt(final String lastModifiedAt);

    /**
     * set createdAt
     * @param createdAt value to be set
     */

    public void setCreatedAt(final String createdAt);

    /**
     * factory method
     * @return instance of ReturnItem
     */
    public static ReturnItem of() {
        return new ReturnItemImpl();
    }

    /**
     * factory method to create a shallow copy ReturnItem
     * @param template instance to be copied
     * @return copy instance
     */
    public static ReturnItem of(final ReturnItem template) {
        ReturnItemImpl instance = new ReturnItemImpl();
        instance.setId(template.getId());
        instance.setQuantity(template.getQuantity());
        instance.setType(template.getType());
        instance.setComment(template.getComment());
        instance.setShipmentState(template.getShipmentState());
        instance.setPaymentState(template.getPaymentState());
        instance.setLastModifiedAt(template.getLastModifiedAt());
        instance.setCreatedAt(template.getCreatedAt());
        return instance;
    }

    public ReturnItem copyDeep();

    /**
     * factory method to create a deep copy of ReturnItem
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ReturnItem deepCopy(@Nullable final ReturnItem template) {
        if (template == null) {
            return null;
        }
        ReturnItemImpl instance = new ReturnItemImpl();
        instance.setId(template.getId());
        instance.setQuantity(template.getQuantity());
        instance.setType(template.getType());
        instance.setComment(template.getComment());
        instance.setShipmentState(template.getShipmentState());
        instance.setPaymentState(template.getPaymentState());
        instance.setLastModifiedAt(template.getLastModifiedAt());
        instance.setCreatedAt(template.getCreatedAt());
        return instance;
    }

    /**
     * builder factory method for ReturnItem
     * @return builder
     */
    public static ReturnItemBuilder builder() {
        return ReturnItemBuilder.of();
    }

    /**
     * create builder for ReturnItem instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ReturnItemBuilder builder(final ReturnItem template) {
        return ReturnItemBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withReturnItem(Function<ReturnItem, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ReturnItem> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ReturnItem>() {
            @Override
            public String toString() {
                return "TypeReference<ReturnItem>";
            }
        };
    }
}
