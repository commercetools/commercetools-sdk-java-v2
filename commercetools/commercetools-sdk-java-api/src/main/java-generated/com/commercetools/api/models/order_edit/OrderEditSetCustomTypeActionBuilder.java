package com.commercetools.api.models.order_edit;

import com.commercetools.api.models.order_edit.OrderEditUpdateAction;
import com.commercetools.api.models.type.FieldContainer;
import com.commercetools.api.models.type.TypeResourceIdentifier;
import com.commercetools.api.models.order_edit.OrderEditSetCustomTypeAction;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * OrderEditSetCustomTypeActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderEditSetCustomTypeAction orderEditSetCustomTypeAction = OrderEditSetCustomTypeAction.builder()
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class OrderEditSetCustomTypeActionBuilder implements Builder<OrderEditSetCustomTypeAction> {

    
    @Nullable
    private com.commercetools.api.models.type.TypeResourceIdentifier type;
    
    
    @Nullable
    private com.commercetools.api.models.type.FieldContainer fields;

    
    /**
     *  <p>Defines the Type that extends the OrderEdit with Custom Fields. If absent, any existing Type and Custom Fields are removed from the OrderEdit.</p>
     * @param builder function to build the type value
     * @return Builder
     */
    
    public OrderEditSetCustomTypeActionBuilder type(Function<com.commercetools.api.models.type.TypeResourceIdentifierBuilder, com.commercetools.api.models.type.TypeResourceIdentifierBuilder> builder) {
        this.type = builder.apply(com.commercetools.api.models.type.TypeResourceIdentifierBuilder.of()).build();
        return this;
    }
    
    /**
     *  <p>Defines the Type that extends the OrderEdit with Custom Fields. If absent, any existing Type and Custom Fields are removed from the OrderEdit.</p>
     * @param builder function to build the type value
     * @return Builder
     */
    
    public OrderEditSetCustomTypeActionBuilder withType(Function<com.commercetools.api.models.type.TypeResourceIdentifierBuilder, com.commercetools.api.models.type.TypeResourceIdentifier> builder) {
        this.type = builder.apply(com.commercetools.api.models.type.TypeResourceIdentifierBuilder.of());
        return this;
    }
                    
    /**
     *  <p>Defines the Type that extends the OrderEdit with Custom Fields. If absent, any existing Type and Custom Fields are removed from the OrderEdit.</p>
     * @param type value to be set
     * @return Builder
     */
    
    public OrderEditSetCustomTypeActionBuilder type(@Nullable final com.commercetools.api.models.type.TypeResourceIdentifier type) {
        this.type = type;
        return this;
    }
    
    
    
    
    /**
     *  <p>Sets the Custom Fields fields for the OrderEdit.</p>
     * @param builder function to build the fields value
     * @return Builder
     */
    
    public OrderEditSetCustomTypeActionBuilder fields(Function<com.commercetools.api.models.type.FieldContainerBuilder, com.commercetools.api.models.type.FieldContainerBuilder> builder) {
        this.fields = builder.apply(com.commercetools.api.models.type.FieldContainerBuilder.of()).build();
        return this;
    }
    
    /**
     *  <p>Sets the Custom Fields fields for the OrderEdit.</p>
     * @param builder function to build the fields value
     * @return Builder
     */
    
    public OrderEditSetCustomTypeActionBuilder withFields(Function<com.commercetools.api.models.type.FieldContainerBuilder, com.commercetools.api.models.type.FieldContainer> builder) {
        this.fields = builder.apply(com.commercetools.api.models.type.FieldContainerBuilder.of());
        return this;
    }
                    
    /**
     *  <p>Sets the Custom Fields fields for the OrderEdit.</p>
     * @param fields value to be set
     * @return Builder
     */
    
    public OrderEditSetCustomTypeActionBuilder fields(@Nullable final com.commercetools.api.models.type.FieldContainer fields) {
        this.fields = fields;
        return this;
    }
    
    

    /**
     *  <p>Defines the Type that extends the OrderEdit with Custom Fields. If absent, any existing Type and Custom Fields are removed from the OrderEdit.</p>
     * @return type
     */
    
    @Nullable
    public com.commercetools.api.models.type.TypeResourceIdentifier getType(){
        return this.type;
    }
    
    /**
     *  <p>Sets the Custom Fields fields for the OrderEdit.</p>
     * @return fields
     */
    
    @Nullable
    public com.commercetools.api.models.type.FieldContainer getFields(){
        return this.fields;
    }

    /**
     * builds OrderEditSetCustomTypeAction with checking for non-null required values
     * @return OrderEditSetCustomTypeAction
     */
    public OrderEditSetCustomTypeAction build() {
        return new OrderEditSetCustomTypeActionImpl(type, fields);
    }
    
    /**
     * builds OrderEditSetCustomTypeAction without checking for non-null required values
     * @return OrderEditSetCustomTypeAction
     */
    public OrderEditSetCustomTypeAction buildUnchecked() {
        return new OrderEditSetCustomTypeActionImpl(type, fields);
    }

    /**
     * factory method for an instance of OrderEditSetCustomTypeActionBuilder
     * @return builder 
     */
    public static OrderEditSetCustomTypeActionBuilder of() {
        return new OrderEditSetCustomTypeActionBuilder();
    }

    /**
     * create builder for OrderEditSetCustomTypeAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderEditSetCustomTypeActionBuilder of(final OrderEditSetCustomTypeAction template) {
        OrderEditSetCustomTypeActionBuilder builder = new OrderEditSetCustomTypeActionBuilder();
        builder.type = template.getType();
        builder.fields = template.getFields();
        return builder;
    }

}
