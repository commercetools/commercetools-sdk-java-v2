package com.commercetools.api.models.shopping_list;

import com.commercetools.api.models.shopping_list.ShoppingListUpdateAction;
import java.lang.Object;
import com.commercetools.api.models.shopping_list.ShoppingListSetTextLineItemCustomFieldAction;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ShoppingListSetTextLineItemCustomFieldActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ShoppingListSetTextLineItemCustomFieldAction shoppingListSetTextLineItemCustomFieldAction = ShoppingListSetTextLineItemCustomFieldAction.builder()
 *             .textLineItemId("{textLineItemId}")
 *             .name("{name}")
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class ShoppingListSetTextLineItemCustomFieldActionBuilder implements Builder<ShoppingListSetTextLineItemCustomFieldAction> {

    
    
    private String textLineItemId;
    
    
    
    private String name;
    
    
    @Nullable
    private java.lang.Object value;

    
    /**
     *  <p>The <code>id</code> of the TextLineItem to update.</p>
     * @param textLineItemId value to be set
     * @return Builder
     */
    
    public ShoppingListSetTextLineItemCustomFieldActionBuilder textLineItemId( final String textLineItemId) {
        this.textLineItemId = textLineItemId;
        return this;
    }
    
    
    
    
    /**
     *  <p>Name of the Custom Field.</p>
     * @param name value to be set
     * @return Builder
     */
    
    public ShoppingListSetTextLineItemCustomFieldActionBuilder name( final String name) {
        this.name = name;
        return this;
    }
    
    
    
    
    /**
     *  <p>If <code>value</code> is absent or <code>null</code>, this field will be removed if it exists. Removing a field that does not exist returns an InvalidOperation error. If <code>value</code> is provided, it is set for the field defined by <code>name</code>.</p>
     * @param value value to be set
     * @return Builder
     */
    
    public ShoppingListSetTextLineItemCustomFieldActionBuilder value(@Nullable final java.lang.Object value) {
        this.value = value;
        return this;
    }
    
    

    /**
     *  <p>The <code>id</code> of the TextLineItem to update.</p>
     * @return textLineItemId
     */
    
    
    public String getTextLineItemId(){
        return this.textLineItemId;
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
     * builds ShoppingListSetTextLineItemCustomFieldAction with checking for non-null required values
     * @return ShoppingListSetTextLineItemCustomFieldAction
     */
    public ShoppingListSetTextLineItemCustomFieldAction build() {
        Objects.requireNonNull(textLineItemId, ShoppingListSetTextLineItemCustomFieldAction.class + ": textLineItemId is missing");
        Objects.requireNonNull(name, ShoppingListSetTextLineItemCustomFieldAction.class + ": name is missing");
        return new ShoppingListSetTextLineItemCustomFieldActionImpl(textLineItemId, name, value);
    }
    
    /**
     * builds ShoppingListSetTextLineItemCustomFieldAction without checking for non-null required values
     * @return ShoppingListSetTextLineItemCustomFieldAction
     */
    public ShoppingListSetTextLineItemCustomFieldAction buildUnchecked() {
        return new ShoppingListSetTextLineItemCustomFieldActionImpl(textLineItemId, name, value);
    }

    /**
     * factory method for an instance of ShoppingListSetTextLineItemCustomFieldActionBuilder
     * @return builder 
     */
    public static ShoppingListSetTextLineItemCustomFieldActionBuilder of() {
        return new ShoppingListSetTextLineItemCustomFieldActionBuilder();
    }

    /**
     * create builder for ShoppingListSetTextLineItemCustomFieldAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ShoppingListSetTextLineItemCustomFieldActionBuilder of(final ShoppingListSetTextLineItemCustomFieldAction template) {
        ShoppingListSetTextLineItemCustomFieldActionBuilder builder = new ShoppingListSetTextLineItemCustomFieldActionBuilder();
        builder.textLineItemId = template.getTextLineItemId();
        builder.name = template.getName();
        builder.value = template.getValue();
        return builder;
    }

}
