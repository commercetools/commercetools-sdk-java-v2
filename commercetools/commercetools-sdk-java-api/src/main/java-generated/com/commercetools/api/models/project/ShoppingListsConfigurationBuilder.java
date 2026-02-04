
package com.commercetools.api.models.project;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ShoppingListsConfigurationBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ShoppingListsConfiguration shoppingListsConfiguration = ShoppingListsConfiguration.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ShoppingListsConfigurationBuilder implements Builder<ShoppingListsConfiguration> {

    @Nullable
    private Long deleteDaysAfterLastModification;

    /**
     *  <p>Default value for the <code>deleteDaysAfterLastModification</code> parameter of the <a href="https://docs.commercetools.com/apis/ctp:api:type:ShoppingListDraft" rel="nofollow">ShoppingListDraft</a>.</p>
     * @param deleteDaysAfterLastModification value to be set
     * @return Builder
     */

    public ShoppingListsConfigurationBuilder deleteDaysAfterLastModification(
            @Nullable final Long deleteDaysAfterLastModification) {
        this.deleteDaysAfterLastModification = deleteDaysAfterLastModification;
        return this;
    }

    /**
     *  <p>Default value for the <code>deleteDaysAfterLastModification</code> parameter of the <a href="https://docs.commercetools.com/apis/ctp:api:type:ShoppingListDraft" rel="nofollow">ShoppingListDraft</a>.</p>
     * @return deleteDaysAfterLastModification
     */

    @Nullable
    public Long getDeleteDaysAfterLastModification() {
        return this.deleteDaysAfterLastModification;
    }

    /**
     * builds ShoppingListsConfiguration with checking for non-null required values
     * @return ShoppingListsConfiguration
     */
    public ShoppingListsConfiguration build() {
        return new ShoppingListsConfigurationImpl(deleteDaysAfterLastModification);
    }

    /**
     * builds ShoppingListsConfiguration without checking for non-null required values
     * @return ShoppingListsConfiguration
     */
    public ShoppingListsConfiguration buildUnchecked() {
        return new ShoppingListsConfigurationImpl(deleteDaysAfterLastModification);
    }

    /**
     * factory method for an instance of ShoppingListsConfigurationBuilder
     * @return builder
     */
    public static ShoppingListsConfigurationBuilder of() {
        return new ShoppingListsConfigurationBuilder();
    }

    /**
     * create builder for ShoppingListsConfiguration instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ShoppingListsConfigurationBuilder of(final ShoppingListsConfiguration template) {
        ShoppingListsConfigurationBuilder builder = new ShoppingListsConfigurationBuilder();
        builder.deleteDaysAfterLastModification = template.getDeleteDaysAfterLastModification();
        return builder;
    }

}
