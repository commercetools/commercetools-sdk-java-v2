
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
     <>
     */

    public MyShoppingListSetDeleteDaysAfterLastModificationActionBuilder deleteDaysAfterLastModification(
            @Nullable final Long deleteDaysAfterLastModification) {
        this.deleteDaysAfterLastModification = deleteDaysAfterLastModification;
        return this;
    }

    @Nullable
    public Long getDeleteDaysAfterLastModification() {
        return this.deleteDaysAfterLastModification;
    }

    public MyShoppingListSetDeleteDaysAfterLastModificationAction build() {
        return new MyShoppingListSetDeleteDaysAfterLastModificationActionImpl(deleteDaysAfterLastModification);
    }

    /**
     * builds MyShoppingListSetDeleteDaysAfterLastModificationAction without checking for non null required values
     */
    public MyShoppingListSetDeleteDaysAfterLastModificationAction buildUnchecked() {
        return new MyShoppingListSetDeleteDaysAfterLastModificationActionImpl(deleteDaysAfterLastModification);
    }

    public static MyShoppingListSetDeleteDaysAfterLastModificationActionBuilder of() {
        return new MyShoppingListSetDeleteDaysAfterLastModificationActionBuilder();
    }

    public static MyShoppingListSetDeleteDaysAfterLastModificationActionBuilder of(
            final MyShoppingListSetDeleteDaysAfterLastModificationAction template) {
        MyShoppingListSetDeleteDaysAfterLastModificationActionBuilder builder = new MyShoppingListSetDeleteDaysAfterLastModificationActionBuilder();
        builder.deleteDaysAfterLastModification = template.getDeleteDaysAfterLastModification();
        return builder;
    }

}
