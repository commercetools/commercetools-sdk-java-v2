
package com.commercetools.api.models.cart;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CartSetDeleteDaysAfterLastModificationActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartSetDeleteDaysAfterLastModificationAction cartSetDeleteDaysAfterLastModificationAction = CartSetDeleteDaysAfterLastModificationAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CartSetDeleteDaysAfterLastModificationActionBuilder
        implements Builder<CartSetDeleteDaysAfterLastModificationAction> {

    @Nullable
    private Integer deleteDaysAfterLastModification;

    /**
     *  <p>Value to set. If not provided, the default value for this field configured in Project settings is assigned.</p>
     * @param deleteDaysAfterLastModification value to be set
     * @return Builder
     */

    public CartSetDeleteDaysAfterLastModificationActionBuilder deleteDaysAfterLastModification(
            @Nullable final Integer deleteDaysAfterLastModification) {
        this.deleteDaysAfterLastModification = deleteDaysAfterLastModification;
        return this;
    }

    /**
     *  <p>Value to set. If not provided, the default value for this field configured in Project settings is assigned.</p>
     * @return deleteDaysAfterLastModification
     */

    @Nullable
    public Integer getDeleteDaysAfterLastModification() {
        return this.deleteDaysAfterLastModification;
    }

    /**
     * builds CartSetDeleteDaysAfterLastModificationAction with checking for non-null required values
     * @return CartSetDeleteDaysAfterLastModificationAction
     */
    public CartSetDeleteDaysAfterLastModificationAction build() {
        return new CartSetDeleteDaysAfterLastModificationActionImpl(deleteDaysAfterLastModification);
    }

    /**
     * builds CartSetDeleteDaysAfterLastModificationAction without checking for non-null required values
     * @return CartSetDeleteDaysAfterLastModificationAction
     */
    public CartSetDeleteDaysAfterLastModificationAction buildUnchecked() {
        return new CartSetDeleteDaysAfterLastModificationActionImpl(deleteDaysAfterLastModification);
    }

    /**
     * factory method for an instance of CartSetDeleteDaysAfterLastModificationActionBuilder
     * @return builder
     */
    public static CartSetDeleteDaysAfterLastModificationActionBuilder of() {
        return new CartSetDeleteDaysAfterLastModificationActionBuilder();
    }

    /**
     * create builder for CartSetDeleteDaysAfterLastModificationAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CartSetDeleteDaysAfterLastModificationActionBuilder of(
            final CartSetDeleteDaysAfterLastModificationAction template) {
        CartSetDeleteDaysAfterLastModificationActionBuilder builder = new CartSetDeleteDaysAfterLastModificationActionBuilder();
        builder.deleteDaysAfterLastModification = template.getDeleteDaysAfterLastModification();
        return builder;
    }

}
