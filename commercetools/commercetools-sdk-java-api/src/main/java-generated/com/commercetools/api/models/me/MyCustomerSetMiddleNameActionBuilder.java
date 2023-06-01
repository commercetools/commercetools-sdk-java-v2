package com.commercetools.api.models.me;

import com.commercetools.api.models.me.MyCustomerUpdateAction;
import com.commercetools.api.models.me.MyCustomerSetMiddleNameAction;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
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
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
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
    
    

    /**
     *  <p>Value to set. If empty, any existing value is removed.</p>
     * @return middleName
     */
    
    @Nullable
    public String getMiddleName(){
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

    /**
     * factory method for an instance of MyCustomerSetMiddleNameActionBuilder
     * @return builder 
     */
    public static MyCustomerSetMiddleNameActionBuilder of() {
        return new MyCustomerSetMiddleNameActionBuilder();
    }

    /**
     * create builder for MyCustomerSetMiddleNameAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static MyCustomerSetMiddleNameActionBuilder of(final MyCustomerSetMiddleNameAction template) {
        MyCustomerSetMiddleNameActionBuilder builder = new MyCustomerSetMiddleNameActionBuilder();
        builder.middleName = template.getMiddleName();
        return builder;
    }

}
