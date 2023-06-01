package com.commercetools.api.models.order;

import com.commercetools.api.models.order.ReturnItem;
import java.time.ZonedDateTime;
import com.commercetools.api.models.order.ReturnInfoImpl;

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
 * ReturnInfo
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ReturnInfo returnInfo = ReturnInfo.builder()
 *             .plusItems(itemsBuilder -> itemsBuilder)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
@JsonDeserialize(as = ReturnInfoImpl.class)
public interface ReturnInfo  {


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
    
    @JsonProperty("returnTrackingId")
    public String getReturnTrackingId();
    /**
     *
     * @return returnDate
     */
    
    @JsonProperty("returnDate")
    public ZonedDateTime getReturnDate();

    /**
     * set items
     * @param items values to be set
     */
    
    @JsonIgnore
    public void setItems(final ReturnItem ...items);
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
    
    public void setReturnDate(final ZonedDateTime returnDate);
    

    /**
     * factory method
     * @return instance of ReturnInfo
     */
    public static ReturnInfo of(){
        return new ReturnInfoImpl();
    }
    

    /**
     * factory method to create a shallow copy ReturnInfo
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
     * factory method to create a deep copy of ReturnInfo
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ReturnInfo deepCopy(@Nullable final ReturnInfo template) {
        if (template == null) {
            return null;
        }
        ReturnInfoImpl instance = new ReturnInfoImpl();
        instance.setItems(Optional.ofNullable(template.getItems())
                .map(t -> t.stream().map(com.commercetools.api.models.order.ReturnItem::deepCopy).collect(Collectors.toList()))
                .orElse(null));
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
