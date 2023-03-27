
package com.commercetools.api.models.order_edit;

import java.time.*;
import java.time.ZonedDateTime;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.order.ReturnItemDraft;
import com.commercetools.api.models.order.StagedOrderUpdateAction;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * StagedOrderAddReturnInfoAction
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
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = StagedOrderAddReturnInfoActionImpl.class)
public interface StagedOrderAddReturnInfoAction extends StagedOrderUpdateAction {

    /**
     * discriminator value for StagedOrderAddReturnInfoAction
     */
    String ADD_RETURN_INFO = "addReturnInfo";

    /**
     *
     * @return returnTrackingId
     */

    @JsonProperty("returnTrackingId")
    public String getReturnTrackingId();

    /**
     *
     * @return items
     */
    @NotNull
    @Valid
    @JsonProperty("items")
    public List<ReturnItemDraft> getItems();

    /**
     *
     * @return returnDate
     */

    @JsonProperty("returnDate")
    public ZonedDateTime getReturnDate();

    /**
     * set returnTrackingId
     * @param returnTrackingId value to be set
     */

    public void setReturnTrackingId(final String returnTrackingId);

    /**
     * set items
     * @param items values to be set
     */

    @JsonIgnore
    public void setItems(final ReturnItemDraft... items);

    /**
     * set items
     * @param items values to be set
     */

    public void setItems(final List<ReturnItemDraft> items);

    /**
     * set returnDate
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
     * factory method to copy an instance of StagedOrderAddReturnInfoAction
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
