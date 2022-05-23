
package com.commercetools.api.models.me;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 Example to create an instance using the builder pattern
 <div class=code-example>
 <pre><code class='java'>
   MyCustomerSetLocaleAction myCustomerSetLocaleAction = MyCustomerSetLocaleAction.builder()
           .build()
 </code></pre>
 </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class MyCustomerSetLocaleActionBuilder implements Builder<MyCustomerSetLocaleAction> {

    @Nullable
    private String locale;

    public MyCustomerSetLocaleActionBuilder locale(@Nullable final String locale) {
        this.locale = locale;
        return this;
    }

    @Nullable
    public String getLocale() {
        return this.locale;
    }

    public MyCustomerSetLocaleAction build() {
        return new MyCustomerSetLocaleActionImpl(locale);
    }

    /**
     * builds MyCustomerSetLocaleAction without checking for non null required values
     */
    public MyCustomerSetLocaleAction buildUnchecked() {
        return new MyCustomerSetLocaleActionImpl(locale);
    }

    public static MyCustomerSetLocaleActionBuilder of() {
        return new MyCustomerSetLocaleActionBuilder();
    }

    public static MyCustomerSetLocaleActionBuilder of(final MyCustomerSetLocaleAction template) {
        MyCustomerSetLocaleActionBuilder builder = new MyCustomerSetLocaleActionBuilder();
        builder.locale = template.getLocale();
        return builder;
    }

}
