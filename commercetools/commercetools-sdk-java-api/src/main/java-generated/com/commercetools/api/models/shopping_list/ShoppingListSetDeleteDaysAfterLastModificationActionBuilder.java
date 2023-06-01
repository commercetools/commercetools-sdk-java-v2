package com.commercetools.api.models.shopping_list;

import com.commercetools.api.models.shopping_list.ShoppingListUpdateAction;
import com.commercetools.api.models.shopping_list.ShoppingListSetDeleteDaysAfterLastModificationAction;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ShoppingListSetDeleteDaysAfterLastModificationActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ShoppingListSetDeleteDaysAfterLastModificationAction shoppingListSetDeleteDaysAfterLastModificationAction = ShoppingListSetDeleteDaysAfterLastModificationAction.builder()
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class ShoppingListSetDeleteDaysAfterLastModificationActionBuilder implements Builder<ShoppingListSetDeleteDaysAfterLastModificationAction> {

    
    @Nullable
    private Long deleteDaysAfterLastModification;

    
    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @param deleteDaysAfterLastModification value to be set
     * @return Builder
     */
    
    public ShoppingListSetDeleteDaysAfterLastModificationActionBuilder deleteDaysAfterLastModification(@Nullable final Long deleteDaysAfterLastModification) {
        this.deleteDaysAfterLastModification = deleteDaysAfterLastModification;
        return this;
    }
    
    

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @return deleteDaysAfterLastModification
     */
    
    @Nullable
    public Long getDeleteDaysAfterLastModification(){
        return this.deleteDaysAfterLastModification;
    }

    /**
     * builds ShoppingListSetDeleteDaysAfterLastModificationAction with checking for non-null required values
     * @return ShoppingListSetDeleteDaysAfterLastModificationAction
     */
    public ShoppingListSetDeleteDaysAfterLastModificationAction build() {
        return new ShoppingListSetDeleteDaysAfterLastModificationActionImpl(deleteDaysAfterLastModification);
    }
    
    /**
     * builds ShoppingListSetDeleteDaysAfterLastModificationAction without checking for non-null required values
     * @return ShoppingListSetDeleteDaysAfterLastModificationAction
     */
    public ShoppingListSetDeleteDaysAfterLastModificationAction buildUnchecked() {
        return new ShoppingListSetDeleteDaysAfterLastModificationActionImpl(deleteDaysAfterLastModification);
    }

    /**
     * factory method for an instance of ShoppingListSetDeleteDaysAfterLastModificationActionBuilder
     * @return builder 
     */
    public static ShoppingListSetDeleteDaysAfterLastModificationActionBuilder of() {
        return new ShoppingListSetDeleteDaysAfterLastModificationActionBuilder();
    }

    /**
     * create builder for ShoppingListSetDeleteDaysAfterLastModificationAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ShoppingListSetDeleteDaysAfterLastModificationActionBuilder of(final ShoppingListSetDeleteDaysAfterLastModificationAction template) {
        ShoppingListSetDeleteDaysAfterLastModificationActionBuilder builder = new ShoppingListSetDeleteDaysAfterLastModificationActionBuilder();
        builder.deleteDaysAfterLastModification = template.getDeleteDaysAfterLastModification();
        return builder;
    }

}
