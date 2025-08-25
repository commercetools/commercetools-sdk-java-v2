
package com.commercetools.api.models.me;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * MyCartSetLocaleActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MyCartSetLocaleAction myCartSetLocaleAction = MyCartSetLocaleAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class MyCartSetLocaleActionBuilder implements Builder<MyCartSetLocaleAction> {

    @Nullable
    private String locale;

    /**
     *  <p>Value to set. Must be one of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Project" rel="nofollow">Project</a>'s <code>languages</code>. If empty, any existing value will be removed.</p>
     * @param locale value to be set
     * @return Builder
     */

    public MyCartSetLocaleActionBuilder locale(@Nullable final String locale) {
        this.locale = locale;
        return this;
    }

    /**
     *  <p>Value to set. Must be one of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Project" rel="nofollow">Project</a>'s <code>languages</code>. If empty, any existing value will be removed.</p>
     * @return locale
     */

    @Nullable
    public String getLocale() {
        return this.locale;
    }

    /**
     * builds MyCartSetLocaleAction with checking for non-null required values
     * @return MyCartSetLocaleAction
     */
    public MyCartSetLocaleAction build() {
        return new MyCartSetLocaleActionImpl(locale);
    }

    /**
     * builds MyCartSetLocaleAction without checking for non-null required values
     * @return MyCartSetLocaleAction
     */
    public MyCartSetLocaleAction buildUnchecked() {
        return new MyCartSetLocaleActionImpl(locale);
    }

    /**
     * factory method for an instance of MyCartSetLocaleActionBuilder
     * @return builder
     */
    public static MyCartSetLocaleActionBuilder of() {
        return new MyCartSetLocaleActionBuilder();
    }

    /**
     * create builder for MyCartSetLocaleAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static MyCartSetLocaleActionBuilder of(final MyCartSetLocaleAction template) {
        MyCartSetLocaleActionBuilder builder = new MyCartSetLocaleActionBuilder();
        builder.locale = template.getLocale();
        return builder;
    }

}
