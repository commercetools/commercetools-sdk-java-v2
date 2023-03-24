
package com.commercetools.api.models.me;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * MyCustomerSetMiddleNameActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MyCustomerSetMiddleNameAction myCustomerSetMiddleNameAction = MyCustomerSetMiddleNameAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class MyCustomerSetMiddleNameActionBuilder implements Builder<MyCustomerSetMiddleNameAction> {

    @Nullable
    private String middleName;

    /**
     *  <p>Value to set. If empty, any existing value is removed.</p>
     * @param middleName value to be set
     * @return Builder
     */

    public MyCustomerSetMiddleNameActionBuilder middleName(@Nullable final String middleName) {
        this.middleName = middleName;
        return this;
    }

    @Nullable
    public String getMiddleName() {
        return this.middleName;
    }

    /**
     * builds MyCustomerSetMiddleNameAction with checking for non-null required values
     * @return MyCustomerSetMiddleNameAction
     */
    public MyCustomerSetMiddleNameAction build() {
        return new MyCustomerSetMiddleNameActionImpl(middleName);
    }

    /**
     * builds MyCustomerSetMiddleNameAction without checking for non-null required values
     * @return MyCustomerSetMiddleNameAction
     */
    public MyCustomerSetMiddleNameAction buildUnchecked() {
        return new MyCustomerSetMiddleNameActionImpl(middleName);
    }

    public static MyCustomerSetMiddleNameActionBuilder of() {
        return new MyCustomerSetMiddleNameActionBuilder();
    }

    public static MyCustomerSetMiddleNameActionBuilder of(final MyCustomerSetMiddleNameAction template) {
        MyCustomerSetMiddleNameActionBuilder builder = new MyCustomerSetMiddleNameActionBuilder();
        builder.middleName = template.getMiddleName();
        return builder;
    }

}
