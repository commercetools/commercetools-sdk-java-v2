package com.commercetools.api.models.me;

import com.commercetools.api.models.me.MyShoppingListUpdateAction;
import com.commercetools.api.models.me.MyShoppingListUpdate;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * MyShoppingListUpdateBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MyShoppingListUpdate myShoppingListUpdate = MyShoppingListUpdate.builder()
 *             .version(0.3)
 *             .plusActions(actionsBuilder -> actionsBuilder)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class MyShoppingListUpdateBuilder implements Builder<MyShoppingListUpdate> {

    
    
    private Long version;
    
    
    
    private java.util.List<com.commercetools.api.models.me.MyShoppingListUpdateAction> actions;

    
    /**
     *  <p>Expected version of the ShoppingList on which the changes should be applied. If the expected version does not match the actual version, a 409 Conflict will be returned.</p>
     * @param version value to be set
     * @return Builder
     */
    
    public MyShoppingListUpdateBuilder version( final Long version) {
        this.version = version;
        return this;
    }
    
    
    
    /**
     *  <p>List of update actions to be performed on the ShoppingList.</p>
     * @param actions value to be set
     * @return Builder
     */
    
    public MyShoppingListUpdateBuilder actions( final com.commercetools.api.models.me.MyShoppingListUpdateAction ...actions) {
        this.actions = new ArrayList<>(Arrays.asList(actions));
        return this;
    }
    
    /**
     *  <p>List of update actions to be performed on the ShoppingList.</p>
     * @param actions value to be set
     * @return Builder
     */
    
    public MyShoppingListUpdateBuilder actions( final java.util.List<com.commercetools.api.models.me.MyShoppingListUpdateAction> actions) {
        this.actions = actions;
        return this;
    }
    
    /**
     *  <p>List of update actions to be performed on the ShoppingList.</p>
     * @param actions value to be set
     * @return Builder
     */
    
    public MyShoppingListUpdateBuilder plusActions( final com.commercetools.api.models.me.MyShoppingListUpdateAction ...actions) {
        if (this.actions == null) {
            this.actions = new ArrayList<>();
        }
        this.actions.addAll(Arrays.asList(actions));
        return this;
    }
    
    
    /**
     *  <p>List of update actions to be performed on the ShoppingList.</p>
     * @param builder function to build the actions value
     * @return Builder
     */
    
    public MyShoppingListUpdateBuilder plusActions(Function<com.commercetools.api.models.me.MyShoppingListUpdateActionBuilder, Builder<? extends com.commercetools.api.models.me.MyShoppingListUpdateAction>> builder) {
        if (this.actions == null) {
            this.actions = new ArrayList<>();
        }
        this.actions.add(builder.apply(com.commercetools.api.models.me.MyShoppingListUpdateActionBuilder.of()).build());
        return this;
    }
    
    /**
     *  <p>List of update actions to be performed on the ShoppingList.</p>
     * @param builder function to build the actions value
     * @return Builder
     */
    
    public MyShoppingListUpdateBuilder withActions(Function<com.commercetools.api.models.me.MyShoppingListUpdateActionBuilder, Builder<? extends com.commercetools.api.models.me.MyShoppingListUpdateAction>> builder) {
        this.actions = new ArrayList<>();
        this.actions.add(builder.apply(com.commercetools.api.models.me.MyShoppingListUpdateActionBuilder.of()).build());
        return this;
    }
                    
    

    /**
     *  <p>Expected version of the ShoppingList on which the changes should be applied. If the expected version does not match the actual version, a 409 Conflict will be returned.</p>
     * @return version
     */
    
    
    public Long getVersion(){
        return this.version;
    }
    
    /**
     *  <p>List of update actions to be performed on the ShoppingList.</p>
     * @return actions
     */
    
    
    public java.util.List<com.commercetools.api.models.me.MyShoppingListUpdateAction> getActions(){
        return this.actions;
    }

    /**
     * builds MyShoppingListUpdate with checking for non-null required values
     * @return MyShoppingListUpdate
     */
    public MyShoppingListUpdate build() {
        Objects.requireNonNull(version, MyShoppingListUpdate.class + ": version is missing");
        Objects.requireNonNull(actions, MyShoppingListUpdate.class + ": actions is missing");
        return new MyShoppingListUpdateImpl(version, actions);
    }
    
    /**
     * builds MyShoppingListUpdate without checking for non-null required values
     * @return MyShoppingListUpdate
     */
    public MyShoppingListUpdate buildUnchecked() {
        return new MyShoppingListUpdateImpl(version, actions);
    }

    /**
     * factory method for an instance of MyShoppingListUpdateBuilder
     * @return builder 
     */
    public static MyShoppingListUpdateBuilder of() {
        return new MyShoppingListUpdateBuilder();
    }

    /**
     * create builder for MyShoppingListUpdate instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static MyShoppingListUpdateBuilder of(final MyShoppingListUpdate template) {
        MyShoppingListUpdateBuilder builder = new MyShoppingListUpdateBuilder();
        builder.version = template.getVersion();
        builder.actions = template.getActions();
        return builder;
    }

}
