package com.commercetools.importapi.models.order_patches;

import com.commercetools.importapi.models.order_patches.ReturnItemDraft;
import java.time.ZonedDateTime;
import com.commercetools.importapi.models.order_patches.ReturnInfo;
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
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class ReturnInfoBuilder implements Builder<ReturnInfo> {

    
    
    private java.util.List<com.commercetools.importapi.models.order_patches.ReturnItemDraft> items;
    
    
    @Nullable
    private String returnTrackingId;
    
    
    @Nullable
    private java.time.ZonedDateTime returnDate;

    /**
     * set values to the items
     * @param items value to be set
     * @return Builder
     */
    
    public ReturnInfoBuilder items( final com.commercetools.importapi.models.order_patches.ReturnItemDraft ...items) {
        this.items = new ArrayList<>(Arrays.asList(items));
        return this;
    }
    
    /**
     * set value to the items
     * @param items value to be set
     * @return Builder
     */
    
    public ReturnInfoBuilder items( final java.util.List<com.commercetools.importapi.models.order_patches.ReturnItemDraft> items) {
        this.items = items;
        return this;
    }
    
    /**
     * add values to the items
     * @param items value to be set
     * @return Builder
     */
    
    public ReturnInfoBuilder plusItems( final com.commercetools.importapi.models.order_patches.ReturnItemDraft ...items) {
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
    
    public ReturnInfoBuilder plusItems(Function<com.commercetools.importapi.models.order_patches.ReturnItemDraftBuilder, com.commercetools.importapi.models.order_patches.ReturnItemDraftBuilder> builder) {
        if (this.items == null) {
            this.items = new ArrayList<>();
        }
        this.items.add(builder.apply(com.commercetools.importapi.models.order_patches.ReturnItemDraftBuilder.of()).build());
        return this;
    }
    
    /**
     * set the value to the items using the builder function
     * @param builder function to build the items value
     * @return Builder
     */
    
    public ReturnInfoBuilder withItems(Function<com.commercetools.importapi.models.order_patches.ReturnItemDraftBuilder, com.commercetools.importapi.models.order_patches.ReturnItemDraftBuilder> builder) {
        this.items = new ArrayList<>();
        this.items.add(builder.apply(com.commercetools.importapi.models.order_patches.ReturnItemDraftBuilder.of()).build());
        return this;
    }
    
    /**
     * add the value to the items using the builder function
     * @param builder function to build the items value
     * @return Builder
     */
    
    public ReturnInfoBuilder addItems(Function<com.commercetools.importapi.models.order_patches.ReturnItemDraftBuilder, com.commercetools.importapi.models.order_patches.ReturnItemDraft> builder) {
        return plusItems(builder.apply(com.commercetools.importapi.models.order_patches.ReturnItemDraftBuilder.of()));
    }
    
    /**
     * set the value to the items using the builder function
     * @param builder function to build the items value
     * @return Builder
     */
    
    public ReturnInfoBuilder setItems(Function<com.commercetools.importapi.models.order_patches.ReturnItemDraftBuilder, com.commercetools.importapi.models.order_patches.ReturnItemDraft> builder) {
        return items(builder.apply(com.commercetools.importapi.models.order_patches.ReturnItemDraftBuilder.of()));
    }
                    
    
    
    /**
     *  <p>Maps to <code>ReturnInfo.returnTrackingId</code></p>
     * @param returnTrackingId value to be set
     * @return Builder
     */
    
    public ReturnInfoBuilder returnTrackingId(@Nullable final String returnTrackingId) {
        this.returnTrackingId = returnTrackingId;
        return this;
    }
    
    
    
    
    /**
     *  <p>Maps to <code>ReturnInfo.returnDate</code></p>
     * @param returnDate value to be set
     * @return Builder
     */
    
    public ReturnInfoBuilder returnDate(@Nullable final java.time.ZonedDateTime returnDate) {
        this.returnDate = returnDate;
        return this;
    }
    
    

    /**
     * value of items}
     * @return items
     */
    
    
    public java.util.List<com.commercetools.importapi.models.order_patches.ReturnItemDraft> getItems(){
        return this.items;
    }
    
    /**
     *  <p>Maps to <code>ReturnInfo.returnTrackingId</code></p>
     * @return returnTrackingId
     */
    
    @Nullable
    public String getReturnTrackingId(){
        return this.returnTrackingId;
    }
    
    /**
     *  <p>Maps to <code>ReturnInfo.returnDate</code></p>
     * @return returnDate
     */
    
    @Nullable
    public java.time.ZonedDateTime getReturnDate(){
        return this.returnDate;
    }

    /**
     * builds ReturnInfo with checking for non-null required values
     * @return ReturnInfo
     */
    public ReturnInfo build() {
        Objects.requireNonNull(items, ReturnInfo.class + ": items is missing");
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
