
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
     * @param deleteDaysAfterLastModification
     * @return Builder
     */

    public MyCartSetDeleteDaysAfterLastModificationActionBuilder deleteDaysAfterLastModification(
            @Nullable final Integer deleteDaysAfterLastModification) {
        this.deleteDaysAfterLastModification = deleteDaysAfterLastModification;
        return this;
    }

    @Nullable
    public Integer getDeleteDaysAfterLastModification() {
        return this.deleteDaysAfterLastModification;
    }

    public MyCartSetDeleteDaysAfterLastModificationAction build() {
        return new MyCartSetDeleteDaysAfterLastModificationActionImpl(deleteDaysAfterLastModification);
    }

    /**
     * builds MyCartSetDeleteDaysAfterLastModificationAction without checking for non null required values
     */
    public MyCartSetDeleteDaysAfterLastModificationAction buildUnchecked() {
        return new MyCartSetDeleteDaysAfterLastModificationActionImpl(deleteDaysAfterLastModification);
    }

    public static MyCartSetDeleteDaysAfterLastModificationActionBuilder of() {
        return new MyCartSetDeleteDaysAfterLastModificationActionBuilder();
    }

    public static MyCartSetDeleteDaysAfterLastModificationActionBuilder of(
            final MyCartSetDeleteDaysAfterLastModificationAction template) {
        MyCartSetDeleteDaysAfterLastModificationActionBuilder builder = new MyCartSetDeleteDaysAfterLastModificationActionBuilder();
        builder.deleteDaysAfterLastModification = template.getDeleteDaysAfterLastModification();
        return builder;
    }

}
