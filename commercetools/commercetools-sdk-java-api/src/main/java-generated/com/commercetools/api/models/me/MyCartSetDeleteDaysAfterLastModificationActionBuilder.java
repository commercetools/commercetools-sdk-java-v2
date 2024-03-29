
package com.commercetools.api.models.me;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * MyCartSetDeleteDaysAfterLastModificationActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MyCartSetDeleteDaysAfterLastModificationAction myCartSetDeleteDaysAfterLastModificationAction = MyCartSetDeleteDaysAfterLastModificationAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class MyCartSetDeleteDaysAfterLastModificationActionBuilder
        implements Builder<MyCartSetDeleteDaysAfterLastModificationAction> {

    @Nullable
    private Integer deleteDaysAfterLastModification;

    /**
     *  <p>Value to set. If not provided, the default value for this field configured in Project settings is assigned.</p>
     * @param deleteDaysAfterLastModification value to be set
     * @return Builder
     */

    public MyCartSetDeleteDaysAfterLastModificationActionBuilder deleteDaysAfterLastModification(
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
     * builds MyCartSetDeleteDaysAfterLastModificationAction with checking for non-null required values
     * @return MyCartSetDeleteDaysAfterLastModificationAction
     */
    public MyCartSetDeleteDaysAfterLastModificationAction build() {
        return new MyCartSetDeleteDaysAfterLastModificationActionImpl(deleteDaysAfterLastModification);
    }

    /**
     * builds MyCartSetDeleteDaysAfterLastModificationAction without checking for non-null required values
     * @return MyCartSetDeleteDaysAfterLastModificationAction
     */
    public MyCartSetDeleteDaysAfterLastModificationAction buildUnchecked() {
        return new MyCartSetDeleteDaysAfterLastModificationActionImpl(deleteDaysAfterLastModification);
    }

    /**
     * factory method for an instance of MyCartSetDeleteDaysAfterLastModificationActionBuilder
     * @return builder
     */
    public static MyCartSetDeleteDaysAfterLastModificationActionBuilder of() {
        return new MyCartSetDeleteDaysAfterLastModificationActionBuilder();
    }

    /**
     * create builder for MyCartSetDeleteDaysAfterLastModificationAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static MyCartSetDeleteDaysAfterLastModificationActionBuilder of(
            final MyCartSetDeleteDaysAfterLastModificationAction template) {
        MyCartSetDeleteDaysAfterLastModificationActionBuilder builder = new MyCartSetDeleteDaysAfterLastModificationActionBuilder();
        builder.deleteDaysAfterLastModification = template.getDeleteDaysAfterLastModification();
        return builder;
    }

}
