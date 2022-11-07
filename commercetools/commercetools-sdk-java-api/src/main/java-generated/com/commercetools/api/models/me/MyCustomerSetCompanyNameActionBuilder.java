
package com.commercetools.api.models.me;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * MyCustomerSetCompanyNameActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MyCustomerSetCompanyNameAction myCustomerSetCompanyNameAction = MyCustomerSetCompanyNameAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class MyCustomerSetCompanyNameActionBuilder implements Builder<MyCustomerSetCompanyNameAction> {

    @Nullable
    private String companyName;

    /**
     *  <p>Value to set. If empty, any existing value is removed.</p>
     */

    public MyCustomerSetCompanyNameActionBuilder companyName(@Nullable final String companyName) {
        this.companyName = companyName;
        return this;
    }

    @Nullable
    public String getCompanyName() {
        return this.companyName;
    }

    public MyCustomerSetCompanyNameAction build() {
        return new MyCustomerSetCompanyNameActionImpl(companyName);
    }

    /**
     * builds MyCustomerSetCompanyNameAction without checking for non null required values
     */
    public MyCustomerSetCompanyNameAction buildUnchecked() {
        return new MyCustomerSetCompanyNameActionImpl(companyName);
    }

    public static MyCustomerSetCompanyNameActionBuilder of() {
        return new MyCustomerSetCompanyNameActionBuilder();
    }

    public static MyCustomerSetCompanyNameActionBuilder of(final MyCustomerSetCompanyNameAction template) {
        MyCustomerSetCompanyNameActionBuilder builder = new MyCustomerSetCompanyNameActionBuilder();
        builder.companyName = template.getCompanyName();
        return builder;
    }

}
