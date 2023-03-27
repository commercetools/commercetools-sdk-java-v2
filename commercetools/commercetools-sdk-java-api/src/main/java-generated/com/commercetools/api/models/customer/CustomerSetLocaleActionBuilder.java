
package com.commercetools.api.models.customer;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CustomerSetLocaleActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomerSetLocaleAction customerSetLocaleAction = CustomerSetLocaleAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CustomerSetLocaleActionBuilder implements Builder<CustomerSetLocaleAction> {

    @Nullable
    private String locale;

    /**
     *  <p>Value to set. Must be one of the languages supported by the Project.</p>
     * @param locale value to be set
     * @return Builder
     */

    public CustomerSetLocaleActionBuilder locale(@Nullable final String locale) {
        this.locale = locale;
        return this;
    }

    /**
     *  <p>Value to set. Must be one of the languages supported by the Project.</p>
     * @return locale
     */

    @Nullable
    public String getLocale() {
        return this.locale;
    }

    /**
     * builds CustomerSetLocaleAction with checking for non-null required values
     * @return CustomerSetLocaleAction
     */
    public CustomerSetLocaleAction build() {
        return new CustomerSetLocaleActionImpl(locale);
    }

    /**
     * builds CustomerSetLocaleAction without checking for non-null required values
     * @return CustomerSetLocaleAction
     */
    public CustomerSetLocaleAction buildUnchecked() {
        return new CustomerSetLocaleActionImpl(locale);
    }

    /**
     * factory method for an instance of CustomerSetLocaleActionBuilder
     * @return builder
     */
    public static CustomerSetLocaleActionBuilder of() {
        return new CustomerSetLocaleActionBuilder();
    }

    /**
     * create builder for CustomerSetLocaleAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CustomerSetLocaleActionBuilder of(final CustomerSetLocaleAction template) {
        CustomerSetLocaleActionBuilder builder = new CustomerSetLocaleActionBuilder();
        builder.locale = template.getLocale();
        return builder;
    }

}
