package com.commercetools.api.models.me;

import com.commercetools.api.models.me.MyPaymentUpdateAction;
import com.commercetools.api.models.me.MyPaymentSetMethodInfoMethodAction;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * MyPaymentSetMethodInfoMethodActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MyPaymentSetMethodInfoMethodAction myPaymentSetMethodInfoMethodAction = MyPaymentSetMethodInfoMethodAction.builder()
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class MyPaymentSetMethodInfoMethodActionBuilder implements Builder<MyPaymentSetMethodInfoMethodAction> {

    
    @Nullable
    private String method;

    
    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @param method value to be set
     * @return Builder
     */
    
    public MyPaymentSetMethodInfoMethodActionBuilder method(@Nullable final String method) {
        this.method = method;
        return this;
    }
    
    

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @return method
     */
    
    @Nullable
    public String getMethod(){
        return this.method;
    }

    /**
     * builds MyPaymentSetMethodInfoMethodAction with checking for non-null required values
     * @return MyPaymentSetMethodInfoMethodAction
     */
    public MyPaymentSetMethodInfoMethodAction build() {
        return new MyPaymentSetMethodInfoMethodActionImpl(method);
    }
    
    /**
     * builds MyPaymentSetMethodInfoMethodAction without checking for non-null required values
     * @return MyPaymentSetMethodInfoMethodAction
     */
    public MyPaymentSetMethodInfoMethodAction buildUnchecked() {
        return new MyPaymentSetMethodInfoMethodActionImpl(method);
    }

    /**
     * factory method for an instance of MyPaymentSetMethodInfoMethodActionBuilder
     * @return builder 
     */
    public static MyPaymentSetMethodInfoMethodActionBuilder of() {
        return new MyPaymentSetMethodInfoMethodActionBuilder();
    }

    /**
     * create builder for MyPaymentSetMethodInfoMethodAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static MyPaymentSetMethodInfoMethodActionBuilder of(final MyPaymentSetMethodInfoMethodAction template) {
        MyPaymentSetMethodInfoMethodActionBuilder builder = new MyPaymentSetMethodInfoMethodActionBuilder();
        builder.method = template.getMethod();
        return builder;
    }

}
