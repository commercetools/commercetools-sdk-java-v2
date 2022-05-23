
package com.commercetools.api.models.me;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * MyCustomerSetTitleActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MyCustomerSetTitleAction myCustomerSetTitleAction = MyCustomerSetTitleAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class MyCustomerSetTitleActionBuilder implements Builder<MyCustomerSetTitleAction> {

    @Nullable
    private String title;

    /**
     <>
     */

    public MyCustomerSetTitleActionBuilder title(@Nullable final String title) {
        this.title = title;
        return this;
    }

    @Nullable
    public String getTitle() {
        return this.title;
    }

    public MyCustomerSetTitleAction build() {
        return new MyCustomerSetTitleActionImpl(title);
    }

    /**
     * builds MyCustomerSetTitleAction without checking for non null required values
     */
    public MyCustomerSetTitleAction buildUnchecked() {
        return new MyCustomerSetTitleActionImpl(title);
    }

    public static MyCustomerSetTitleActionBuilder of() {
        return new MyCustomerSetTitleActionBuilder();
    }

    public static MyCustomerSetTitleActionBuilder of(final MyCustomerSetTitleAction template) {
        MyCustomerSetTitleActionBuilder builder = new MyCustomerSetTitleActionBuilder();
        builder.title = template.getTitle();
        return builder;
    }

}
