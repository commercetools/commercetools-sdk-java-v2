
package com.commercetools.api.models.me;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * MyPaymentSetMethodInfoNameActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MyPaymentSetMethodInfoNameAction myPaymentSetMethodInfoNameAction = MyPaymentSetMethodInfoNameAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class MyPaymentSetMethodInfoNameActionBuilder implements Builder<MyPaymentSetMethodInfoNameAction> {

    @Nullable
    private com.commercetools.api.models.common.LocalizedString name;

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @param builder function to build the name value
     * @return Builder
     */

    public MyPaymentSetMethodInfoNameActionBuilder name(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.name = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @param name value to be set
     * @return Builder
     */

    public MyPaymentSetMethodInfoNameActionBuilder name(
            @Nullable final com.commercetools.api.models.common.LocalizedString name) {
        this.name = name;
        return this;
    }

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @return name
     */

    @Nullable
    public com.commercetools.api.models.common.LocalizedString getName() {
        return this.name;
    }

    /**
     * builds MyPaymentSetMethodInfoNameAction with checking for non-null required values
     * @return MyPaymentSetMethodInfoNameAction
     */
    public MyPaymentSetMethodInfoNameAction build() {
        return new MyPaymentSetMethodInfoNameActionImpl(name);
    }

    /**
     * builds MyPaymentSetMethodInfoNameAction without checking for non-null required values
     * @return MyPaymentSetMethodInfoNameAction
     */
    public MyPaymentSetMethodInfoNameAction buildUnchecked() {
        return new MyPaymentSetMethodInfoNameActionImpl(name);
    }

    /**
     * factory method for an instance of MyPaymentSetMethodInfoNameActionBuilder
     * @return builder
     */
    public static MyPaymentSetMethodInfoNameActionBuilder of() {
        return new MyPaymentSetMethodInfoNameActionBuilder();
    }

    /**
     * create builder for MyPaymentSetMethodInfoNameAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static MyPaymentSetMethodInfoNameActionBuilder of(final MyPaymentSetMethodInfoNameAction template) {
        MyPaymentSetMethodInfoNameActionBuilder builder = new MyPaymentSetMethodInfoNameActionBuilder();
        builder.name = template.getName();
        return builder;
    }

}
