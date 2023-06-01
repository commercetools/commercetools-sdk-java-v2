package com.commercetools.api.models.cart;

import com.commercetools.api.models.cart.CartUpdateAction;
import java.lang.Object;
import com.commercetools.api.models.cart.CartSetShippingAddressCustomFieldAction;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CartSetShippingAddressCustomFieldActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartSetShippingAddressCustomFieldAction cartSetShippingAddressCustomFieldAction = CartSetShippingAddressCustomFieldAction.builder()
 *             .name("{name}")
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class CartSetShippingAddressCustomFieldActionBuilder implements Builder<CartSetShippingAddressCustomFieldAction> {

    
    
    private String name;
    
    
    @Nullable
    private java.lang.Object value;

    
    /**
     *  <p>Name of the Custom Field.</p>
     * @param name value to be set
     * @return Builder
     */
    
    public CartSetShippingAddressCustomFieldActionBuilder name( final String name) {
        this.name = name;
        return this;
    }
    
    
    
    
    /**
     *  <p>If <code>value</code> is absent or <code>null</code>, this field will be removed if it exists. Removing a field that does not exist returns an InvalidOperation error. If <code>value</code> is provided, it is set for the field defined by <code>name</code>.</p>
     * @param value value to be set
     * @return Builder
     */
    
    public CartSetShippingAddressCustomFieldActionBuilder value(@Nullable final java.lang.Object value) {
        this.value = value;
        return this;
    }
    
    

    /**
     *  <p>Name of the Custom Field.</p>
     * @return name
     */
    
    
    public String getName(){
        return this.name;
    }
    
    /**
     *  <p>If <code>value</code> is absent or <code>null</code>, this field will be removed if it exists. Removing a field that does not exist returns an InvalidOperation error. If <code>value</code> is provided, it is set for the field defined by <code>name</code>.</p>
     * @return value
     */
    
    @Nullable
    public java.lang.Object getValue(){
        return this.value;
    }

    /**
     * builds CartSetShippingAddressCustomFieldAction with checking for non-null required values
     * @return CartSetShippingAddressCustomFieldAction
     */
    public CartSetShippingAddressCustomFieldAction build() {
        Objects.requireNonNull(name, CartSetShippingAddressCustomFieldAction.class + ": name is missing");
        return new CartSetShippingAddressCustomFieldActionImpl(name, value);
    }
    
    /**
     * builds CartSetShippingAddressCustomFieldAction without checking for non-null required values
     * @return CartSetShippingAddressCustomFieldAction
     */
    public CartSetShippingAddressCustomFieldAction buildUnchecked() {
        return new CartSetShippingAddressCustomFieldActionImpl(name, value);
    }

    /**
     * factory method for an instance of CartSetShippingAddressCustomFieldActionBuilder
     * @return builder 
     */
    public static CartSetShippingAddressCustomFieldActionBuilder of() {
        return new CartSetShippingAddressCustomFieldActionBuilder();
    }

    /**
     * create builder for CartSetShippingAddressCustomFieldAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CartSetShippingAddressCustomFieldActionBuilder of(final CartSetShippingAddressCustomFieldAction template) {
        CartSetShippingAddressCustomFieldActionBuilder builder = new CartSetShippingAddressCustomFieldActionBuilder();
        builder.name = template.getName();
        builder.value = template.getValue();
        return builder;
    }

}
