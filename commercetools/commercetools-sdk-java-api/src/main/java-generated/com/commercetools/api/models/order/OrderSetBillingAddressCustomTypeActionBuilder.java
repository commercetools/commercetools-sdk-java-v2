package com.commercetools.api.models.order;

import com.commercetools.api.models.order.OrderUpdateAction;
import com.commercetools.api.models.type.FieldContainer;
import com.commercetools.api.models.type.TypeResourceIdentifier;
import com.commercetools.api.models.order.OrderSetBillingAddressCustomTypeAction;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * OrderSetBillingAddressCustomTypeActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderSetBillingAddressCustomTypeAction orderSetBillingAddressCustomTypeAction = OrderSetBillingAddressCustomTypeAction.builder()
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class OrderSetBillingAddressCustomTypeActionBuilder implements Builder<OrderSetBillingAddressCustomTypeAction> {

    
    @Nullable
    private com.commercetools.api.models.type.TypeResourceIdentifier type;
    
    
    @Nullable
    private com.commercetools.api.models.type.FieldContainer fields;

    
    /**
     *  <p>Defines the Type that extends the <code>billingAddress</code> with Custom Fields. If absent, any existing Type and Custom Fields are removed from the <code>billingAddress</code>.</p>
     * @param builder function to build the type value
     * @return Builder
     */
    
    public OrderSetBillingAddressCustomTypeActionBuilder type(Function<com.commercetools.api.models.type.TypeResourceIdentifierBuilder, com.commercetools.api.models.type.TypeResourceIdentifierBuilder> builder) {
        this.type = builder.apply(com.commercetools.api.models.type.TypeResourceIdentifierBuilder.of()).build();
        return this;
    }
    
    /**
     *  <p>Defines the Type that extends the <code>billingAddress</code> with Custom Fields. If absent, any existing Type and Custom Fields are removed from the <code>billingAddress</code>.</p>
     * @param builder function to build the type value
     * @return Builder
     */
    
    public OrderSetBillingAddressCustomTypeActionBuilder withType(Function<com.commercetools.api.models.type.TypeResourceIdentifierBuilder, com.commercetools.api.models.type.TypeResourceIdentifier> builder) {
        this.type = builder.apply(com.commercetools.api.models.type.TypeResourceIdentifierBuilder.of());
        return this;
    }
                    
    /**
     *  <p>Defines the Type that extends the <code>billingAddress</code> with Custom Fields. If absent, any existing Type and Custom Fields are removed from the <code>billingAddress</code>.</p>
     * @param type value to be set
     * @return Builder
     */
    
    public OrderSetBillingAddressCustomTypeActionBuilder type(@Nullable final com.commercetools.api.models.type.TypeResourceIdentifier type) {
        this.type = type;
        return this;
    }
    
    
    
    
    /**
     *  <p>Sets the Custom Fields fields for the <code>billingAddress</code>.</p>
     * @param builder function to build the fields value
     * @return Builder
     */
    
    public OrderSetBillingAddressCustomTypeActionBuilder fields(Function<com.commercetools.api.models.type.FieldContainerBuilder, com.commercetools.api.models.type.FieldContainerBuilder> builder) {
        this.fields = builder.apply(com.commercetools.api.models.type.FieldContainerBuilder.of()).build();
        return this;
    }
    
    /**
     *  <p>Sets the Custom Fields fields for the <code>billingAddress</code>.</p>
     * @param builder function to build the fields value
     * @return Builder
     */
    
    public OrderSetBillingAddressCustomTypeActionBuilder withFields(Function<com.commercetools.api.models.type.FieldContainerBuilder, com.commercetools.api.models.type.FieldContainer> builder) {
        this.fields = builder.apply(com.commercetools.api.models.type.FieldContainerBuilder.of());
        return this;
    }
                    
    /**
     *  <p>Sets the Custom Fields fields for the <code>billingAddress</code>.</p>
     * @param fields value to be set
     * @return Builder
     */
    
    public OrderSetBillingAddressCustomTypeActionBuilder fields(@Nullable final com.commercetools.api.models.type.FieldContainer fields) {
        this.fields = fields;
        return this;
    }
    
    

    /**
     *  <p>Defines the Type that extends the <code>billingAddress</code> with Custom Fields. If absent, any existing Type and Custom Fields are removed from the <code>billingAddress</code>.</p>
     * @return type
     */
    
    @Nullable
    public com.commercetools.api.models.type.TypeResourceIdentifier getType(){
        return this.type;
    }
    
    /**
     *  <p>Sets the Custom Fields fields for the <code>billingAddress</code>.</p>
     * @return fields
     */
    
    @Nullable
    public com.commercetools.api.models.type.FieldContainer getFields(){
        return this.fields;
    }

    /**
     * builds OrderSetBillingAddressCustomTypeAction with checking for non-null required values
     * @return OrderSetBillingAddressCustomTypeAction
     */
    public OrderSetBillingAddressCustomTypeAction build() {
        return new OrderSetBillingAddressCustomTypeActionImpl(type, fields);
    }
    
    /**
     * builds OrderSetBillingAddressCustomTypeAction without checking for non-null required values
     * @return OrderSetBillingAddressCustomTypeAction
     */
    public OrderSetBillingAddressCustomTypeAction buildUnchecked() {
        return new OrderSetBillingAddressCustomTypeActionImpl(type, fields);
    }

    /**
     * factory method for an instance of OrderSetBillingAddressCustomTypeActionBuilder
     * @return builder 
     */
    public static OrderSetBillingAddressCustomTypeActionBuilder of() {
        return new OrderSetBillingAddressCustomTypeActionBuilder();
    }

    /**
     * create builder for OrderSetBillingAddressCustomTypeAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderSetBillingAddressCustomTypeActionBuilder of(final OrderSetBillingAddressCustomTypeAction template) {
        OrderSetBillingAddressCustomTypeActionBuilder builder = new OrderSetBillingAddressCustomTypeActionBuilder();
        builder.type = template.getType();
        builder.fields = template.getFields();
        return builder;
    }

}
