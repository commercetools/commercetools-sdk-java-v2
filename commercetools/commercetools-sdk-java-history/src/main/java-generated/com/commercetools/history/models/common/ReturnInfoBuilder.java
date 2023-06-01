package com.commercetools.history.models.common;

import com.commercetools.history.models.common.ReturnItem;
import com.commercetools.history.models.common.ReturnInfo;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ReturnInfoBuilder
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
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class ReturnInfoBuilder implements Builder<ReturnInfo> {

    
    
    private java.util.List<com.commercetools.history.models.common.ReturnItem> items;
    
    
    
    private String returnTrackingId;
    
    
    
    private String returnDate;

    /**
     * set values to the items
     * @param items value to be set
     * @return Builder
     */
    
    public ReturnInfoBuilder items( final com.commercetools.history.models.common.ReturnItem ...items) {
        this.items = new ArrayList<>(Arrays.asList(items));
        return this;
    }
    
    /**
     * set value to the items
     * @param items value to be set
     * @return Builder
     */
    
    public ReturnInfoBuilder items( final java.util.List<com.commercetools.history.models.common.ReturnItem> items) {
        this.items = items;
        return this;
    }
    
    /**
     * add values to the items
     * @param items value to be set
     * @return Builder
     */
    
    public ReturnInfoBuilder plusItems( final com.commercetools.history.models.common.ReturnItem ...items) {
        if (this.items == null) {
            this.items = new ArrayList<>();
        }
        this.items.addAll(Arrays.asList(items));
        return this;
    }
    
    
    
    /**
     * add the value to the items using the builder function
     * @param builder function to build the items value
     * @return Builder
     */
    
    public ReturnInfoBuilder plusItems(Function<com.commercetools.history.models.common.ReturnItemBuilder, com.commercetools.history.models.common.ReturnItemBuilder> builder) {
        if (this.items == null) {
            this.items = new ArrayList<>();
        }
        this.items.add(builder.apply(com.commercetools.history.models.common.ReturnItemBuilder.of()).build());
        return this;
    }
    
    /**
     * set the value to the items using the builder function
     * @param builder function to build the items value
     * @return Builder
     */
    
    public ReturnInfoBuilder withItems(Function<com.commercetools.history.models.common.ReturnItemBuilder, com.commercetools.history.models.common.ReturnItemBuilder> builder) {
        this.items = new ArrayList<>();
        this.items.add(builder.apply(com.commercetools.history.models.common.ReturnItemBuilder.of()).build());
        return this;
    }
    
    /**
     * add the value to the items using the builder function
     * @param builder function to build the items value
     * @return Builder
     */
    
    public ReturnInfoBuilder addItems(Function<com.commercetools.history.models.common.ReturnItemBuilder, com.commercetools.history.models.common.ReturnItem> builder) {
        return plusItems(builder.apply(com.commercetools.history.models.common.ReturnItemBuilder.of()));
    }
    
    /**
     * set the value to the items using the builder function
     * @param builder function to build the items value
     * @return Builder
     */
    
    public ReturnInfoBuilder setItems(Function<com.commercetools.history.models.common.ReturnItemBuilder, com.commercetools.history.models.common.ReturnItem> builder) {
        return items(builder.apply(com.commercetools.history.models.common.ReturnItemBuilder.of()));
    }
                    
    
    
    /**
     *  <p>Identifies, which return tracking ID is connected to this particular return.</p>
     * @param returnTrackingId value to be set
     * @return Builder
     */
    
    public ReturnInfoBuilder returnTrackingId( final String returnTrackingId) {
        this.returnTrackingId = returnTrackingId;
        return this;
    }
    
    
    
    
    /**
     * set the value to the returnDate
     * @param returnDate value to be set
     * @return Builder
     */
    
    public ReturnInfoBuilder returnDate( final String returnDate) {
        this.returnDate = returnDate;
        return this;
    }
    
    

    /**
     * value of items}
     * @return items
     */
    
    
    public java.util.List<com.commercetools.history.models.common.ReturnItem> getItems(){
        return this.items;
    }
    
    /**
     *  <p>Identifies, which return tracking ID is connected to this particular return.</p>
     * @return returnTrackingId
     */
    
    
    public String getReturnTrackingId(){
        return this.returnTrackingId;
    }
    
    /**
     * value of returnDate}
     * @return returnDate
     */
    
    
    public String getReturnDate(){
        return this.returnDate;
    }

    /**
     * builds ReturnInfo with checking for non-null required values
     * @return ReturnInfo
     */
    public ReturnInfo build() {
        Objects.requireNonNull(items, ReturnInfo.class + ": items is missing");
        Objects.requireNonNull(returnTrackingId, ReturnInfo.class + ": returnTrackingId is missing");
        Objects.requireNonNull(returnDate, ReturnInfo.class + ": returnDate is missing");
        return new ReturnInfoImpl(items, returnTrackingId, returnDate);
    }
    
    /**
     * builds ReturnInfo without checking for non-null required values
     * @return ReturnInfo
     */
    public ReturnInfo buildUnchecked() {
        return new ReturnInfoImpl(items, returnTrackingId, returnDate);
    }

    /**
     * factory method for an instance of ReturnInfoBuilder
     * @return builder 
     */
    public static ReturnInfoBuilder of() {
        return new ReturnInfoBuilder();
    }

    /**
     * create builder for ReturnInfo instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ReturnInfoBuilder of(final ReturnInfo template) {
        ReturnInfoBuilder builder = new ReturnInfoBuilder();
        builder.items = template.getItems();
        builder.returnTrackingId = template.getReturnTrackingId();
        builder.returnDate = template.getReturnDate();
        return builder;
    }

}
