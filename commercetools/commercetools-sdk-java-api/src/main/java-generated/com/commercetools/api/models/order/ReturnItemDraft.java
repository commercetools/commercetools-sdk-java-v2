
package com.commercetools.api.models.order;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.type.CustomFieldsDraft;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * ReturnItemDraft
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ReturnItemDraft returnItemDraft = ReturnItemDraft.builder()
 *             .quantity(0.3)
 *             .shipmentState(ReturnShipmentState.ADVISED)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ReturnItemDraftImpl.class)
public interface ReturnItemDraft extends com.commercetools.api.models.CustomizableDraft<ReturnItemDraft>,
        io.vrap.rmf.base.client.Draft<ReturnItemDraft> {

    /**
     *
     * @return quantity
     */
    @NotNull
    @JsonProperty("quantity")
    public Long getQuantity();

    /**
     *
     * @return lineItemId
     */

    @JsonProperty("lineItemId")
    public String getLineItemId();

    /**
     *
     * @return customLineItemId
     */

    @JsonProperty("customLineItemId")
    public String getCustomLineItemId();

    /**
     *
     * @return comment
     */

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
     *  <p>Custom Fields of this return item.</p>
     * @return custom
     */
    @Valid
    @JsonProperty("custom")
    public CustomFieldsDraft getCustom();

    /**
     * set quantity
     * @param quantity value to be set
     */

    public void setQuantity(final Long quantity);

    /**
     * set lineItemId
     * @param lineItemId value to be set
     */

    public void setLineItemId(final String lineItemId);

    /**
     * set customLineItemId
     * @param customLineItemId value to be set
     */

    public void setCustomLineItemId(final String customLineItemId);

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
     *  <p>Custom Fields of this return item.</p>
     * @param custom value to be set
     */

    public void setCustom(final CustomFieldsDraft custom);

    /**
     * factory method
     * @return instance of ReturnItemDraft
     */
    public static ReturnItemDraft of() {
        return new ReturnItemDraftImpl();
    }

    /**
     * factory method to create a shallow copy ReturnItemDraft
     * @param template instance to be copied
     * @return copy instance
     */
    public static ReturnItemDraft of(final ReturnItemDraft template) {
        ReturnItemDraftImpl instance = new ReturnItemDraftImpl();
        instance.setQuantity(template.getQuantity());
        instance.setLineItemId(template.getLineItemId());
        instance.setCustomLineItemId(template.getCustomLineItemId());
        instance.setComment(template.getComment());
        instance.setShipmentState(template.getShipmentState());
        instance.setCustom(template.getCustom());
        return instance;
    }

    /**
     * factory method to create a deep copy of ReturnItemDraft
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ReturnItemDraft deepCopy(@Nullable final ReturnItemDraft template) {
        if (template == null) {
            return null;
        }
        ReturnItemDraftImpl instance = new ReturnItemDraftImpl();
        instance.setQuantity(template.getQuantity());
        instance.setLineItemId(template.getLineItemId());
        instance.setCustomLineItemId(template.getCustomLineItemId());
        instance.setComment(template.getComment());
        instance.setShipmentState(template.getShipmentState());
        instance.setCustom(Optional.ofNullable(template.getCustom())
                .map(com.commercetools.api.models.type.CustomFieldsDraft::deepCopy)
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for ReturnItemDraft
     * @return builder
     */
    public static ReturnItemDraftBuilder builder() {
        return ReturnItemDraftBuilder.of();
    }

    /**
     * create builder for ReturnItemDraft instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ReturnItemDraftBuilder builder(final ReturnItemDraft template) {
        return ReturnItemDraftBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withReturnItemDraft(Function<ReturnItemDraft, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ReturnItemDraft> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ReturnItemDraft>() {
            @Override
            public String toString() {
                return "TypeReference<ReturnItemDraft>";
            }
        };
    }
}
