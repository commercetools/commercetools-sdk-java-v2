
package com.commercetools.api.models.order_edit;

import java.time.*;
import java.time.ZonedDateTime;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;

import com.commercetools.api.models.order.ReturnItemDraft;
import com.commercetools.api.models.order.StagedOrderUpdateAction;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Produces the Return Info Added Message.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StagedOrderAddReturnInfoAction stagedOrderAddReturnInfoAction = StagedOrderAddReturnInfoAction.builder()
 *             .plusItems(itemsBuilder -> itemsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("addReturnInfo")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = StagedOrderAddReturnInfoActionImpl.class)
public interface StagedOrderAddReturnInfoAction extends StagedOrderUpdateAction {

    /**
     * discriminator value for StagedOrderAddReturnInfoAction
     */
    String ADD_RETURN_INFO = "addReturnInfo";

    /**
     *  <p>Value to set.</p>
     * @return returnTrackingId
     */

    @JsonProperty("returnTrackingId")
    public String getReturnTrackingId();

    /**
     *  <p>Items to be returned. Must not be empty.</p>
     * @return items
     */
    @NotNull
    @Valid
    @JsonProperty("items")
    public List<ReturnItemDraft> getItems();

    /**
     *  <p>Value to set. If not set, it defaults to the current date and time.</p>
     * @return returnDate
     */

    @JsonProperty("returnDate")
    public ZonedDateTime getReturnDate();

    /**
     *  <p>Value to set.</p>
     * @param returnTrackingId value to be set
     */

    public void setReturnTrackingId(final String returnTrackingId);

    /**
     *  <p>Items to be returned. Must not be empty.</p>
     * @param items values to be set
     */

    @JsonIgnore
    public void setItems(final ReturnItemDraft... items);

    /**
     *  <p>Items to be returned. Must not be empty.</p>
     * @param items values to be set
     */

    public void setItems(final List<ReturnItemDraft> items);

    /**
     *  <p>Value to set. If not set, it defaults to the current date and time.</p>
     * @param returnDate value to be set
     */

    public void setReturnDate(final ZonedDateTime returnDate);

    /**
     * factory method
     * @return instance of StagedOrderAddReturnInfoAction
     */
    public static StagedOrderAddReturnInfoAction of() {
        return new StagedOrderAddReturnInfoActionImpl();
    }

    /**
     * factory method to create a shallow copy StagedOrderAddReturnInfoAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static StagedOrderAddReturnInfoAction of(final StagedOrderAddReturnInfoAction template) {
        StagedOrderAddReturnInfoActionImpl instance = new StagedOrderAddReturnInfoActionImpl();
        instance.setReturnTrackingId(template.getReturnTrackingId());
        instance.setItems(template.getItems());
        instance.setReturnDate(template.getReturnDate());
        return instance;
    }

    public StagedOrderAddReturnInfoAction copyDeep();

    /**
     * factory method to create a deep copy of StagedOrderAddReturnInfoAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static StagedOrderAddReturnInfoAction deepCopy(@Nullable final StagedOrderAddReturnInfoAction template) {
        if (template == null) {
            return null;
        }
        StagedOrderAddReturnInfoActionImpl instance = new StagedOrderAddReturnInfoActionImpl();
        instance.setReturnTrackingId(template.getReturnTrackingId());
        instance.setItems(Optional.ofNullable(template.getItems())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.order.ReturnItemDraft::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        instance.setReturnDate(template.getReturnDate());
        return instance;
    }

    /**
     * builder factory method for StagedOrderAddReturnInfoAction
     * @return builder
     */
    public static StagedOrderAddReturnInfoActionBuilder builder() {
        return StagedOrderAddReturnInfoActionBuilder.of();
    }

    /**
     * create builder for StagedOrderAddReturnInfoAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StagedOrderAddReturnInfoActionBuilder builder(final StagedOrderAddReturnInfoAction template) {
        return StagedOrderAddReturnInfoActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withStagedOrderAddReturnInfoAction(Function<StagedOrderAddReturnInfoAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<StagedOrderAddReturnInfoAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StagedOrderAddReturnInfoAction>() {
            @Override
            public String toString() {
                return "TypeReference<StagedOrderAddReturnInfoAction>";
            }
        };
    }
}
