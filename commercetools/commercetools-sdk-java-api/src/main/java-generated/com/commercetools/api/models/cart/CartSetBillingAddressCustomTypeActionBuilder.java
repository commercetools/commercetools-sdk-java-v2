package com.commercetools.api.models.cart;

import com.commercetools.api.models.cart.CartUpdateAction;
import com.commercetools.api.models.type.FieldContainer;
import com.commercetools.api.models.type.TypeResourceIdentifier;
import com.commercetools.api.models.cart.CartSetBillingAddressCustomTypeAction;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CartSetBillingAddressCustomTypeActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartSetBillingAddressCustomTypeAction cartSetBillingAddressCustomTypeAction = CartSetBillingAddressCustomTypeAction.builder()
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class CartSetBillingAddressCustomTypeActionBuilder implements Builder<CartSetBillingAddressCustomTypeAction> {

    
    @Nullable
    private com.commercetools.api.models.type.TypeResourceIdentifier type;
    
    
    @Nullable
    private com.commercetools.api.models.type.FieldContainer fields;

    
    /**
     *  <p>Defines the Type that extends the <code>billingAddress</code> with Custom Fields. If absent, any existing Type and Custom Fields are removed from the <code>billingAddress</code>.</p>
     * @param builder function to build the type value
     * @return Builder
     */
    
    public CartSetBillingAddressCustomTypeActionBuilder type(Function<com.commercetools.api.models.type.TypeResourceIdentifierBuilder, com.commercetools.api.models.type.TypeResourceIdentifierBuilder> builder) {
        this.type = builder.apply(com.commercetools.api.models.type.TypeResourceIdentifierBuilder.of()).build();
        return this;
    }
    
    /**
     *  <p>Defines the Type that extends the <code>billingAddress</code> with Custom Fields. If absent, any existing Type and Custom Fields are removed from the <code>billingAddress</code>.</p>
     * @param builder function to build the type value
     * @return Builder
     */
    
    public CartSetBillingAddressCustomTypeActionBuilder withType(Function<com.commercetools.api.models.type.TypeResourceIdentifierBuilder, com.commercetools.api.models.type.TypeResourceIdentifier> builder) {
        this.type = builder.apply(com.commercetools.api.models.type.TypeResourceIdentifierBuilder.of());
        return this;
    }
                    
    /**
     *  <p>Defines the Type that extends the <code>billingAddress</code> with Custom Fields. If absent, any existing Type and Custom Fields are removed from the <code>billingAddress</code>.</p>
     * @param type value to be set
     * @return Builder
     */
    
    public CartSetBillingAddressCustomTypeActionBuilder type(@Nullable final com.commercetools.api.models.type.TypeResourceIdentifier type) {
        this.type = type;
        return this;
    }
    
    
    
    
    /**
     *  <p>Sets the Custom Fields fields for the <code>billingAddress</code>.</p>
     * @param builder function to build the fields value
     * @return Builder
     */
    
    public CartSetBillingAddressCustomTypeActionBuilder fields(Function<com.commercetools.api.models.type.FieldContainerBuilder, com.commercetools.api.models.type.FieldContainerBuilder> builder) {
        this.fields = builder.apply(com.commercetools.api.models.type.FieldContainerBuilder.of()).build();
        return this;
    }
    
    /**
     *  <p>Sets the Custom Fields fields for the <code>billingAddress</code>.</p>
     * @param builder function to build the fields value
     * @return Builder
     */
    
    public CartSetBillingAddressCustomTypeActionBuilder withFields(Function<com.commercetools.api.models.type.FieldContainerBuilder, com.commercetools.api.models.type.FieldContainer> builder) {
        this.fields = builder.apply(com.commercetools.api.models.type.FieldContainerBuilder.of());
        return this;
    }
                    
    /**
     *  <p>Sets the Custom Fields fields for the <code>billingAddress</code>.</p>
     * @param fields value to be set
     * @return Builder
     */
    
    public CartSetBillingAddressCustomTypeActionBuilder fields(@Nullable final com.commercetools.api.models.type.FieldContainer fields) {
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
     * builds CartSetBillingAddressCustomTypeAction with checking for non-null required values
     * @return CartSetBillingAddressCustomTypeAction
     */
    public CartSetBillingAddressCustomTypeAction build() {
        return new CartSetBillingAddressCustomTypeActionImpl(type, fields);
    }
    
    /**
     * builds CartSetBillingAddressCustomTypeAction without checking for non-null required values
     * @return CartSetBillingAddressCustomTypeAction
     */
    public CartSetBillingAddressCustomTypeAction buildUnchecked() {
        return new CartSetBillingAddressCustomTypeActionImpl(type, fields);
    }

    /**
     * factory method for an instance of CartSetBillingAddressCustomTypeActionBuilder
     * @return builder 
     */
    public static CartSetBillingAddressCustomTypeActionBuilder of() {
        return new CartSetBillingAddressCustomTypeActionBuilder();
    }

    /**
     * create builder for CartSetBillingAddressCustomTypeAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CartSetBillingAddressCustomTypeActionBuilder of(final CartSetBillingAddressCustomTypeAction template) {
        CartSetBillingAddressCustomTypeActionBuilder builder = new CartSetBillingAddressCustomTypeActionBuilder();
        builder.type = template.getType();
        builder.fields = template.getFields();
        return builder;
    }

}
