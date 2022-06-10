
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
     *  <p>JSON object where the keys are of type Locale, and the values are the strings used for the corresponding language.</p>
     */

    public MyPaymentSetMethodInfoNameActionBuilder name(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.name = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>JSON object where the keys are of type Locale, and the values are the strings used for the corresponding language.</p>
     */

    public MyPaymentSetMethodInfoNameActionBuilder name(
            @Nullable final com.commercetools.api.models.common.LocalizedString name) {
        this.name = name;
        return this;
    }

    @Nullable
    public com.commercetools.api.models.common.LocalizedString getName() {
        return this.name;
    }

    public MyPaymentSetMethodInfoNameAction build() {
        return new MyPaymentSetMethodInfoNameActionImpl(name);
    }

    /**
     * builds MyPaymentSetMethodInfoNameAction without checking for non null required values
     */
    public MyPaymentSetMethodInfoNameAction buildUnchecked() {
        return new MyPaymentSetMethodInfoNameActionImpl(name);
    }

    public static MyPaymentSetMethodInfoNameActionBuilder of() {
        return new MyPaymentSetMethodInfoNameActionBuilder();
    }

    public static MyPaymentSetMethodInfoNameActionBuilder of(final MyPaymentSetMethodInfoNameAction template) {
        MyPaymentSetMethodInfoNameActionBuilder builder = new MyPaymentSetMethodInfoNameActionBuilder();
        builder.name = template.getName();
        return builder;
    }

}
