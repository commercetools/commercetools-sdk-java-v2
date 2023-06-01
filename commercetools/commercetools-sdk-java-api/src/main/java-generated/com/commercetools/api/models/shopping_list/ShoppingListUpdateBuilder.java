package com.commercetools.api.models.shopping_list;

import com.commercetools.api.models.shopping_list.ShoppingListUpdateAction;
import com.commercetools.api.models.shopping_list.ShoppingListUpdate;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ShoppingListUpdateBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ShoppingListUpdate shoppingListUpdate = ShoppingListUpdate.builder()
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
public class ShoppingListUpdateBuilder implements Builder<ShoppingListUpdate> {

    
    
    private Long version;
    
    
    
    private java.util.List<com.commercetools.api.models.shopping_list.ShoppingListUpdateAction> actions;

    
    /**
     *  <p>Expected version of the ShoppingList on which the changes should be applied. If the expected version does not match the actual version, a 409 Conflict will be returned.</p>
     * @param version value to be set
     * @return Builder
     */
    
    public ShoppingListUpdateBuilder version( final Long version) {
        this.version = version;
        return this;
    }
    
    
    
    /**
     *  <p>List of update actions to be performed on the ShoppingList.</p>
     * @param actions value to be set
     * @return Builder
     */
    
    public ShoppingListUpdateBuilder actions( final com.commercetools.api.models.shopping_list.ShoppingListUpdateAction ...actions) {
        this.actions = new ArrayList<>(Arrays.asList(actions));
        return this;
    }
    
    /**
     *  <p>List of update actions to be performed on the ShoppingList.</p>
     * @param actions value to be set
     * @return Builder
     */
    
    public ShoppingListUpdateBuilder actions( final java.util.List<com.commercetools.api.models.shopping_list.ShoppingListUpdateAction> actions) {
        this.actions = actions;
        return this;
    }
    
    /**
     *  <p>List of update actions to be performed on the ShoppingList.</p>
     * @param actions value to be set
     * @return Builder
     */
    
    public ShoppingListUpdateBuilder plusActions( final com.commercetools.api.models.shopping_list.ShoppingListUpdateAction ...actions) {
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
    
    public ShoppingListUpdateBuilder plusActions(Function<com.commercetools.api.models.shopping_list.ShoppingListUpdateActionBuilder, Builder<? extends com.commercetools.api.models.shopping_list.ShoppingListUpdateAction>> builder) {
        if (this.actions == null) {
            this.actions = new ArrayList<>();
        }
        this.actions.add(builder.apply(com.commercetools.api.models.shopping_list.ShoppingListUpdateActionBuilder.of()).build());
        return this;
    }
    
    /**
     *  <p>List of update actions to be performed on the ShoppingList.</p>
     * @param builder function to build the actions value
     * @return Builder
     */
    
    public ShoppingListUpdateBuilder withActions(Function<com.commercetools.api.models.shopping_list.ShoppingListUpdateActionBuilder, Builder<? extends com.commercetools.api.models.shopping_list.ShoppingListUpdateAction>> builder) {
        this.actions = new ArrayList<>();
        this.actions.add(builder.apply(com.commercetools.api.models.shopping_list.ShoppingListUpdateActionBuilder.of()).build());
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
    
    
    public java.util.List<com.commercetools.api.models.shopping_list.ShoppingListUpdateAction> getActions(){
        return this.actions;
    }

    /**
     * builds ShoppingListUpdate with checking for non-null required values
     * @return ShoppingListUpdate
     */
    public ShoppingListUpdate build() {
        Objects.requireNonNull(version, ShoppingListUpdate.class + ": version is missing");
        Objects.requireNonNull(actions, ShoppingListUpdate.class + ": actions is missing");
        return new ShoppingListUpdateImpl(version, actions);
    }
    
    /**
     * builds ShoppingListUpdate without checking for non-null required values
     * @return ShoppingListUpdate
     */
    public ShoppingListUpdate buildUnchecked() {
        return new ShoppingListUpdateImpl(version, actions);
    }

    /**
     * factory method for an instance of ShoppingListUpdateBuilder
     * @return builder 
     */
    public static ShoppingListUpdateBuilder of() {
        return new ShoppingListUpdateBuilder();
    }

    /**
     * create builder for ShoppingListUpdate instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ShoppingListUpdateBuilder of(final ShoppingListUpdate template) {
        ShoppingListUpdateBuilder builder = new ShoppingListUpdateBuilder();
        builder.version = template.getVersion();
        builder.actions = template.getActions();
        return builder;
    }

}
