
package com.commercetools.api.models.me;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * MyShoppingListSetDeleteDaysAfterLastModificationActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MyShoppingListSetDeleteDaysAfterLastModificationAction myShoppingListSetDeleteDaysAfterLastModificationAction = MyShoppingListSetDeleteDaysAfterLastModificationAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class MyShoppingListSetDeleteDaysAfterLastModificationActionBuilder
        implements Builder<MyShoppingListSetDeleteDaysAfterLastModificationAction> {

    @Nullable
    private Long deleteDaysAfterLastModification;

    /**
     *  <p>Value to set. If not provided, the default value for this field configured in <a href="https://docs.commercetools.com/apis/ctp:api:type:ShoppingListsConfiguration" rel="nofollow">Project settings</a> is assigned.</p>
     * @param deleteDaysAfterLastModification value to be set
     * @return Builder
     */

    public MyShoppingListSetDeleteDaysAfterLastModificationActionBuilder deleteDaysAfterLastModification(
            @Nullable final Long deleteDaysAfterLastModification) {
        this.deleteDaysAfterLastModification = deleteDaysAfterLastModification;
        return this;
    }

    /**
     *  <p>Value to set. If not provided, the default value for this field configured in <a href="https://docs.commercetools.com/apis/ctp:api:type:ShoppingListsConfiguration" rel="nofollow">Project settings</a> is assigned.</p>
     * @return deleteDaysAfterLastModification
     */

    @Nullable
    public Long getDeleteDaysAfterLastModification() {
        return this.deleteDaysAfterLastModification;
    }

    /**
     * builds MyShoppingListSetDeleteDaysAfterLastModificationAction with checking for non-null required values
     * @return MyShoppingListSetDeleteDaysAfterLastModificationAction
     */
    public MyShoppingListSetDeleteDaysAfterLastModificationAction build() {
        return new MyShoppingListSetDeleteDaysAfterLastModificationActionImpl(deleteDaysAfterLastModification);
    }

    /**
     * builds MyShoppingListSetDeleteDaysAfterLastModificationAction without checking for non-null required values
     * @return MyShoppingListSetDeleteDaysAfterLastModificationAction
     */
    public MyShoppingListSetDeleteDaysAfterLastModificationAction buildUnchecked() {
        return new MyShoppingListSetDeleteDaysAfterLastModificationActionImpl(deleteDaysAfterLastModification);
    }

    /**
     * factory method for an instance of MyShoppingListSetDeleteDaysAfterLastModificationActionBuilder
     * @return builder
     */
    public static MyShoppingListSetDeleteDaysAfterLastModificationActionBuilder of() {
        return new MyShoppingListSetDeleteDaysAfterLastModificationActionBuilder();
    }

    /**
     * create builder for MyShoppingListSetDeleteDaysAfterLastModificationAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static MyShoppingListSetDeleteDaysAfterLastModificationActionBuilder of(
            final MyShoppingListSetDeleteDaysAfterLastModificationAction template) {
        MyShoppingListSetDeleteDaysAfterLastModificationActionBuilder builder = new MyShoppingListSetDeleteDaysAfterLastModificationActionBuilder();
        builder.deleteDaysAfterLastModification = template.getDeleteDaysAfterLastModification();
        return builder;
    }

}
