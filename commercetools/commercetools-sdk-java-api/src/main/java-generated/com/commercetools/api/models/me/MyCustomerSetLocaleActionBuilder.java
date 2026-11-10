
package com.commercetools.api.models.me;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * MyCustomerSetLocaleActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MyCustomerSetLocaleAction myCustomerSetLocaleAction = MyCustomerSetLocaleAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class MyCustomerSetLocaleActionBuilder implements Builder<MyCustomerSetLocaleAction> {

    @Nullable
    private String locale;

    /**
     *  <p>Value to set. Must be one of the languages supported by the <a href="https://docs.commercetools.com/apis/ctp:api:type:Project" rel="nofollow">Project</a>.</p>
     * @param locale value to be set
     * @return Builder
     */

    public MyCustomerSetLocaleActionBuilder locale(@Nullable final String locale) {
        this.locale = locale;
        return this;
    }

    /**
     *  <p>Value to set. Must be one of the languages supported by the <a href="https://docs.commercetools.com/apis/ctp:api:type:Project" rel="nofollow">Project</a>.</p>
     * @return locale
     */

    @Nullable
    public String getLocale() {
        return this.locale;
    }

    /**
     * builds MyCustomerSetLocaleAction with checking for non-null required values
     * @return MyCustomerSetLocaleAction
     */
    public MyCustomerSetLocaleAction build() {
        return new MyCustomerSetLocaleActionImpl(locale);
    }

    /**
     * builds MyCustomerSetLocaleAction without checking for non-null required values
     * @return MyCustomerSetLocaleAction
     */
    public MyCustomerSetLocaleAction buildUnchecked() {
        return new MyCustomerSetLocaleActionImpl(locale);
    }

    /**
     * factory method for an instance of MyCustomerSetLocaleActionBuilder
     * @return builder
     */
    public static MyCustomerSetLocaleActionBuilder of() {
        return new MyCustomerSetLocaleActionBuilder();
    }

    /**
     * create builder for MyCustomerSetLocaleAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static MyCustomerSetLocaleActionBuilder of(final MyCustomerSetLocaleAction template) {
        MyCustomerSetLocaleActionBuilder builder = new MyCustomerSetLocaleActionBuilder();
        builder.locale = template.getLocale();
        return builder;
    }

}
