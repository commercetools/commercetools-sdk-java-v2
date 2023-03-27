
package com.commercetools.history.models.common;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * ReturnInfo
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ReturnInfo returnInfo = ReturnInfo.builder()
 *             .plusItems(itemsBuilder -> itemsBuilder)
 *             .returnTrackingId("{returnTrackingId}")
 *             .returnDate("{returnDate}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ReturnInfoImpl.class)
public interface ReturnInfo {

    /**
     *
     * @return items
     */
    @NotNull
    @Valid
    @JsonProperty("items")
    public List<ReturnItem> getItems();

    /**
     *  <p>Identifies, which return tracking ID is connected to this particular return.</p>
     * @return returnTrackingId
     */
    @NotNull
    @JsonProperty("returnTrackingId")
    public String getReturnTrackingId();

    /**
     *
     * @return returnDate
     */
    @NotNull
    @JsonProperty("returnDate")
    public String getReturnDate();

    /**
     * set items
     * @param items values to be set
     */

    @JsonIgnore
    public void setItems(final ReturnItem... items);

    /**
     * set items
     * @param items values to be set
     */

    public void setItems(final List<ReturnItem> items);

    /**
     *  <p>Identifies, which return tracking ID is connected to this particular return.</p>
     * @param returnTrackingId value to be set
     */

    public void setReturnTrackingId(final String returnTrackingId);

    /**
     * set returnDate
     * @param returnDate value to be set
     */

    public void setReturnDate(final String returnDate);

    /**
     * factory method
     * @return instance of ReturnInfo
     */
    public static ReturnInfo of() {
        return new ReturnInfoImpl();
    }

    /**
     * factory method to copy an instance of ReturnInfo
     * @param template instance to be copied
     * @return copy instance
     */
    public static ReturnInfo of(final ReturnInfo template) {
        ReturnInfoImpl instance = new ReturnInfoImpl();
        instance.setItems(template.getItems());
        instance.setReturnTrackingId(template.getReturnTrackingId());
        instance.setReturnDate(template.getReturnDate());
        return instance;
    }

    /**
     * builder factory method for ReturnInfo
     * @return builder
     */
    public static ReturnInfoBuilder builder() {
        return ReturnInfoBuilder.of();
    }

    /**
     * create builder for ReturnInfo instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ReturnInfoBuilder builder(final ReturnInfo template) {
        return ReturnInfoBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withReturnInfo(Function<ReturnInfo, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ReturnInfo> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ReturnInfo>() {
            @Override
            public String toString() {
                return "TypeReference<ReturnInfo>";
            }
        };
    }
}
