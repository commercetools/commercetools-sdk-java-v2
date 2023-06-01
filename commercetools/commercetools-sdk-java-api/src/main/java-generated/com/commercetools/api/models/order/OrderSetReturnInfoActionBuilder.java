package com.commercetools.api.models.order;

import com.commercetools.api.models.order.OrderUpdateAction;
import com.commercetools.api.models.order.ReturnInfoDraft;
import com.commercetools.api.models.order.OrderSetReturnInfoAction;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * OrderSetReturnInfoActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderSetReturnInfoAction orderSetReturnInfoAction = OrderSetReturnInfoAction.builder()
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class OrderSetReturnInfoActionBuilder implements Builder<OrderSetReturnInfoAction> {

    
    @Nullable
    private java.util.List<com.commercetools.api.models.order.ReturnInfoDraft> items;

    /**
     * set values to the items
     * @param items value to be set
     * @return Builder
     */
    
    public OrderSetReturnInfoActionBuilder items(@Nullable final com.commercetools.api.models.order.ReturnInfoDraft ...items) {
        this.items = new ArrayList<>(Arrays.asList(items));
        return this;
    }
    
    /**
     * set value to the items
     * @param items value to be set
     * @return Builder
     */
    
    public OrderSetReturnInfoActionBuilder items(@Nullable final java.util.List<com.commercetools.api.models.order.ReturnInfoDraft> items) {
        this.items = items;
        return this;
    }
    
    /**
     * add values to the items
     * @param items value to be set
     * @return Builder
     */
    
    public OrderSetReturnInfoActionBuilder plusItems(@Nullable final com.commercetools.api.models.order.ReturnInfoDraft ...items) {
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
    
    public OrderSetReturnInfoActionBuilder plusItems(Function<com.commercetools.api.models.order.ReturnInfoDraftBuilder, com.commercetools.api.models.order.ReturnInfoDraftBuilder> builder) {
        if (this.items == null) {
            this.items = new ArrayList<>();
        }
        this.items.add(builder.apply(com.commercetools.api.models.order.ReturnInfoDraftBuilder.of()).build());
        return this;
    }
    
    /**
     * set the value to the items using the builder function
     * @param builder function to build the items value
     * @return Builder
     */
    
    public OrderSetReturnInfoActionBuilder withItems(Function<com.commercetools.api.models.order.ReturnInfoDraftBuilder, com.commercetools.api.models.order.ReturnInfoDraftBuilder> builder) {
        this.items = new ArrayList<>();
        this.items.add(builder.apply(com.commercetools.api.models.order.ReturnInfoDraftBuilder.of()).build());
        return this;
    }
    
    /**
     * add the value to the items using the builder function
     * @param builder function to build the items value
     * @return Builder
     */
    
    public OrderSetReturnInfoActionBuilder addItems(Function<com.commercetools.api.models.order.ReturnInfoDraftBuilder, com.commercetools.api.models.order.ReturnInfoDraft> builder) {
        return plusItems(builder.apply(com.commercetools.api.models.order.ReturnInfoDraftBuilder.of()));
    }
    
    /**
     * set the value to the items using the builder function
     * @param builder function to build the items value
     * @return Builder
     */
    
    public OrderSetReturnInfoActionBuilder setItems(Function<com.commercetools.api.models.order.ReturnInfoDraftBuilder, com.commercetools.api.models.order.ReturnInfoDraft> builder) {
        return items(builder.apply(com.commercetools.api.models.order.ReturnInfoDraftBuilder.of()));
    }
                    

    /**
     * value of items}
     * @return items
     */
    
    @Nullable
    public java.util.List<com.commercetools.api.models.order.ReturnInfoDraft> getItems(){
        return this.items;
    }

    /**
     * builds OrderSetReturnInfoAction with checking for non-null required values
     * @return OrderSetReturnInfoAction
     */
    public OrderSetReturnInfoAction build() {
        return new OrderSetReturnInfoActionImpl(items);
    }
    
    /**
     * builds OrderSetReturnInfoAction without checking for non-null required values
     * @return OrderSetReturnInfoAction
     */
    public OrderSetReturnInfoAction buildUnchecked() {
        return new OrderSetReturnInfoActionImpl(items);
    }

    /**
     * factory method for an instance of OrderSetReturnInfoActionBuilder
     * @return builder 
     */
    public static OrderSetReturnInfoActionBuilder of() {
        return new OrderSetReturnInfoActionBuilder();
    }

    /**
     * create builder for OrderSetReturnInfoAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderSetReturnInfoActionBuilder of(final OrderSetReturnInfoAction template) {
        OrderSetReturnInfoActionBuilder builder = new OrderSetReturnInfoActionBuilder();
        builder.items = template.getItems();
        return builder;
    }

}
