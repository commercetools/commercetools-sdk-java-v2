package com.commercetools.api.models.order_edit;

import com.commercetools.api.models.order.ReturnItemDraft;
import com.commercetools.api.models.order.StagedOrderUpdateAction;
import java.time.ZonedDateTime;
import com.commercetools.api.models.order_edit.StagedOrderAddReturnInfoAction;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * StagedOrderAddReturnInfoActionBuilder
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
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class StagedOrderAddReturnInfoActionBuilder implements Builder<StagedOrderAddReturnInfoAction> {

    
    @Nullable
    private String returnTrackingId;
    
    
    
    private java.util.List<com.commercetools.api.models.order.ReturnItemDraft> items;
    
    
    @Nullable
    private java.time.ZonedDateTime returnDate;

    
    /**
     * set the value to the returnTrackingId
     * @param returnTrackingId value to be set
     * @return Builder
     */
    
    public StagedOrderAddReturnInfoActionBuilder returnTrackingId(@Nullable final String returnTrackingId) {
        this.returnTrackingId = returnTrackingId;
        return this;
    }
    
    
    
    /**
     * set values to the items
     * @param items value to be set
     * @return Builder
     */
    
    public StagedOrderAddReturnInfoActionBuilder items( final com.commercetools.api.models.order.ReturnItemDraft ...items) {
        this.items = new ArrayList<>(Arrays.asList(items));
        return this;
    }
    
    /**
     * set value to the items
     * @param items value to be set
     * @return Builder
     */
    
    public StagedOrderAddReturnInfoActionBuilder items( final java.util.List<com.commercetools.api.models.order.ReturnItemDraft> items) {
        this.items = items;
        return this;
    }
    
    /**
     * add values to the items
     * @param items value to be set
     * @return Builder
     */
    
    public StagedOrderAddReturnInfoActionBuilder plusItems( final com.commercetools.api.models.order.ReturnItemDraft ...items) {
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
    
    public StagedOrderAddReturnInfoActionBuilder plusItems(Function<com.commercetools.api.models.order.ReturnItemDraftBuilder, com.commercetools.api.models.order.ReturnItemDraftBuilder> builder) {
        if (this.items == null) {
            this.items = new ArrayList<>();
        }
        this.items.add(builder.apply(com.commercetools.api.models.order.ReturnItemDraftBuilder.of()).build());
        return this;
    }
    
    /**
     * set the value to the items using the builder function
     * @param builder function to build the items value
     * @return Builder
     */
    
    public StagedOrderAddReturnInfoActionBuilder withItems(Function<com.commercetools.api.models.order.ReturnItemDraftBuilder, com.commercetools.api.models.order.ReturnItemDraftBuilder> builder) {
        this.items = new ArrayList<>();
        this.items.add(builder.apply(com.commercetools.api.models.order.ReturnItemDraftBuilder.of()).build());
        return this;
    }
    
    /**
     * add the value to the items using the builder function
     * @param builder function to build the items value
     * @return Builder
     */
    
    public StagedOrderAddReturnInfoActionBuilder addItems(Function<com.commercetools.api.models.order.ReturnItemDraftBuilder, com.commercetools.api.models.order.ReturnItemDraft> builder) {
        return plusItems(builder.apply(com.commercetools.api.models.order.ReturnItemDraftBuilder.of()));
    }
    
    /**
     * set the value to the items using the builder function
     * @param builder function to build the items value
     * @return Builder
     */
    
    public StagedOrderAddReturnInfoActionBuilder setItems(Function<com.commercetools.api.models.order.ReturnItemDraftBuilder, com.commercetools.api.models.order.ReturnItemDraft> builder) {
        return items(builder.apply(com.commercetools.api.models.order.ReturnItemDraftBuilder.of()));
    }
                    
    
    
    /**
     * set the value to the returnDate
     * @param returnDate value to be set
     * @return Builder
     */
    
    public StagedOrderAddReturnInfoActionBuilder returnDate(@Nullable final java.time.ZonedDateTime returnDate) {
        this.returnDate = returnDate;
        return this;
    }
    
    

    /**
     * value of returnTrackingId}
     * @return returnTrackingId
     */
    
    @Nullable
    public String getReturnTrackingId(){
        return this.returnTrackingId;
    }
    
    /**
     * value of items}
     * @return items
     */
    
    
    public java.util.List<com.commercetools.api.models.order.ReturnItemDraft> getItems(){
        return this.items;
    }
    
    /**
     * value of returnDate}
     * @return returnDate
     */
    
    @Nullable
    public java.time.ZonedDateTime getReturnDate(){
        return this.returnDate;
    }

    /**
     * builds StagedOrderAddReturnInfoAction with checking for non-null required values
     * @return StagedOrderAddReturnInfoAction
     */
    public StagedOrderAddReturnInfoAction build() {
        Objects.requireNonNull(items, StagedOrderAddReturnInfoAction.class + ": items is missing");
        return new StagedOrderAddReturnInfoActionImpl(returnTrackingId, items, returnDate);
    }
    
    /**
     * builds StagedOrderAddReturnInfoAction without checking for non-null required values
     * @return StagedOrderAddReturnInfoAction
     */
    public StagedOrderAddReturnInfoAction buildUnchecked() {
        return new StagedOrderAddReturnInfoActionImpl(returnTrackingId, items, returnDate);
    }

    /**
     * factory method for an instance of StagedOrderAddReturnInfoActionBuilder
     * @return builder 
     */
    public static StagedOrderAddReturnInfoActionBuilder of() {
        return new StagedOrderAddReturnInfoActionBuilder();
    }

    /**
     * create builder for StagedOrderAddReturnInfoAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StagedOrderAddReturnInfoActionBuilder of(final StagedOrderAddReturnInfoAction template) {
        StagedOrderAddReturnInfoActionBuilder builder = new StagedOrderAddReturnInfoActionBuilder();
        builder.returnTrackingId = template.getReturnTrackingId();
        builder.items = template.getItems();
        builder.returnDate = template.getReturnDate();
        return builder;
    }

}
