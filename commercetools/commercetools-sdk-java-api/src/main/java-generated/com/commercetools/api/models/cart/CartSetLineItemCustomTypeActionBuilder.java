package com.commercetools.api.models.cart;

import com.commercetools.api.models.cart.CartUpdateAction;
import com.commercetools.api.models.type.FieldContainer;
import com.commercetools.api.models.type.TypeResourceIdentifier;
import com.commercetools.api.models.cart.CartSetLineItemCustomTypeAction;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CartSetLineItemCustomTypeActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartSetLineItemCustomTypeAction cartSetLineItemCustomTypeAction = CartSetLineItemCustomTypeAction.builder()
 *             .lineItemId("{lineItemId}")
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class CartSetLineItemCustomTypeActionBuilder implements Builder<CartSetLineItemCustomTypeAction> {

    
    
    private String lineItemId;
    
    
    @Nullable
    private com.commercetools.api.models.type.TypeResourceIdentifier type;
    
    
    @Nullable
    private com.commercetools.api.models.type.FieldContainer fields;

    
    /**
     *  <p><code>id</code> of the LineItem to update.</p>
     * @param lineItemId value to be set
     * @return Builder
     */
    
    public CartSetLineItemCustomTypeActionBuilder lineItemId( final String lineItemId) {
        this.lineItemId = lineItemId;
        return this;
    }
    
    
    
    
    /**
     *  <p>Defines the Type that extends the Line Item with Custom Fields. If absent, any existing Type and Custom Fields are removed from the Line Item.</p>
     * @param builder function to build the type value
     * @return Builder
     */
    
    public CartSetLineItemCustomTypeActionBuilder type(Function<com.commercetools.api.models.type.TypeResourceIdentifierBuilder, com.commercetools.api.models.type.TypeResourceIdentifierBuilder> builder) {
        this.type = builder.apply(com.commercetools.api.models.type.TypeResourceIdentifierBuilder.of()).build();
        return this;
    }
    
    /**
     *  <p>Defines the Type that extends the Line Item with Custom Fields. If absent, any existing Type and Custom Fields are removed from the Line Item.</p>
     * @param builder function to build the type value
     * @return Builder
     */
    
    public CartSetLineItemCustomTypeActionBuilder withType(Function<com.commercetools.api.models.type.TypeResourceIdentifierBuilder, com.commercetools.api.models.type.TypeResourceIdentifier> builder) {
        this.type = builder.apply(com.commercetools.api.models.type.TypeResourceIdentifierBuilder.of());
        return this;
    }
                    
    /**
     *  <p>Defines the Type that extends the Line Item with Custom Fields. If absent, any existing Type and Custom Fields are removed from the Line Item.</p>
     * @param type value to be set
     * @return Builder
     */
    
    public CartSetLineItemCustomTypeActionBuilder type(@Nullable final com.commercetools.api.models.type.TypeResourceIdentifier type) {
        this.type = type;
        return this;
    }
    
    
    
    
    /**
     *  <p>Sets the Custom Fields fields for the Line Item.</p>
     * @param builder function to build the fields value
     * @return Builder
     */
    
    public CartSetLineItemCustomTypeActionBuilder fields(Function<com.commercetools.api.models.type.FieldContainerBuilder, com.commercetools.api.models.type.FieldContainerBuilder> builder) {
        this.fields = builder.apply(com.commercetools.api.models.type.FieldContainerBuilder.of()).build();
        return this;
    }
    
    /**
     *  <p>Sets the Custom Fields fields for the Line Item.</p>
     * @param builder function to build the fields value
     * @return Builder
     */
    
    public CartSetLineItemCustomTypeActionBuilder withFields(Function<com.commercetools.api.models.type.FieldContainerBuilder, com.commercetools.api.models.type.FieldContainer> builder) {
        this.fields = builder.apply(com.commercetools.api.models.type.FieldContainerBuilder.of());
        return this;
    }
                    
    /**
     *  <p>Sets the Custom Fields fields for the Line Item.</p>
     * @param fields value to be set
     * @return Builder
     */
    
    public CartSetLineItemCustomTypeActionBuilder fields(@Nullable final com.commercetools.api.models.type.FieldContainer fields) {
        this.fields = fields;
        return this;
    }
    
    

    /**
     *  <p><code>id</code> of the LineItem to update.</p>
     * @return lineItemId
     */
    
    
    public String getLineItemId(){
        return this.lineItemId;
    }
    
    /**
     *  <p>Defines the Type that extends the Line Item with Custom Fields. If absent, any existing Type and Custom Fields are removed from the Line Item.</p>
     * @return type
     */
    
    @Nullable
    public com.commercetools.api.models.type.TypeResourceIdentifier getType(){
        return this.type;
    }
    
    /**
     *  <p>Sets the Custom Fields fields for the Line Item.</p>
     * @return fields
     */
    
    @Nullable
    public com.commercetools.api.models.type.FieldContainer getFields(){
        return this.fields;
    }

    /**
     * builds CartSetLineItemCustomTypeAction with checking for non-null required values
     * @return CartSetLineItemCustomTypeAction
     */
    public CartSetLineItemCustomTypeAction build() {
        Objects.requireNonNull(lineItemId, CartSetLineItemCustomTypeAction.class + ": lineItemId is missing");
        return new CartSetLineItemCustomTypeActionImpl(lineItemId, type, fields);
    }
    
    /**
     * builds CartSetLineItemCustomTypeAction without checking for non-null required values
     * @return CartSetLineItemCustomTypeAction
     */
    public CartSetLineItemCustomTypeAction buildUnchecked() {
        return new CartSetLineItemCustomTypeActionImpl(lineItemId, type, fields);
    }

    /**
     * factory method for an instance of CartSetLineItemCustomTypeActionBuilder
     * @return builder 
     */
    public static CartSetLineItemCustomTypeActionBuilder of() {
        return new CartSetLineItemCustomTypeActionBuilder();
    }

    /**
     * create builder for CartSetLineItemCustomTypeAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CartSetLineItemCustomTypeActionBuilder of(final CartSetLineItemCustomTypeAction template) {
        CartSetLineItemCustomTypeActionBuilder builder = new CartSetLineItemCustomTypeActionBuilder();
        builder.lineItemId = template.getLineItemId();
        builder.type = template.getType();
        builder.fields = template.getFields();
        return builder;
    }

}
