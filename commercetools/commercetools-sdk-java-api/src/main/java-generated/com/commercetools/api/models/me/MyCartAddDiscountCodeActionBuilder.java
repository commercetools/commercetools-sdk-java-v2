package com.commercetools.api.models.me;

import com.commercetools.api.models.me.MyCartUpdateAction;
import com.commercetools.api.models.me.MyCartAddDiscountCodeAction;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * MyCartAddDiscountCodeActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MyCartAddDiscountCodeAction myCartAddDiscountCodeAction = MyCartAddDiscountCodeAction.builder()
 *             .code("{code}")
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class MyCartAddDiscountCodeActionBuilder implements Builder<MyCartAddDiscountCodeAction> {

    
    
    private String code;

    
    /**
     *  <p><code>code</code> of a DiscountCode.</p>
     * @param code value to be set
     * @return Builder
     */
    
    public MyCartAddDiscountCodeActionBuilder code( final String code) {
        this.code = code;
        return this;
    }
    
    

    /**
     *  <p><code>code</code> of a DiscountCode.</p>
     * @return code
     */
    
    
    public String getCode(){
        return this.code;
    }

    /**
     * builds MyCartAddDiscountCodeAction with checking for non-null required values
     * @return MyCartAddDiscountCodeAction
     */
    public MyCartAddDiscountCodeAction build() {
        Objects.requireNonNull(code, MyCartAddDiscountCodeAction.class + ": code is missing");
        return new MyCartAddDiscountCodeActionImpl(code);
    }
    
    /**
     * builds MyCartAddDiscountCodeAction without checking for non-null required values
     * @return MyCartAddDiscountCodeAction
     */
    public MyCartAddDiscountCodeAction buildUnchecked() {
        return new MyCartAddDiscountCodeActionImpl(code);
    }

    /**
     * factory method for an instance of MyCartAddDiscountCodeActionBuilder
     * @return builder 
     */
    public static MyCartAddDiscountCodeActionBuilder of() {
        return new MyCartAddDiscountCodeActionBuilder();
    }

    /**
     * create builder for MyCartAddDiscountCodeAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static MyCartAddDiscountCodeActionBuilder of(final MyCartAddDiscountCodeAction template) {
        MyCartAddDiscountCodeActionBuilder builder = new MyCartAddDiscountCodeActionBuilder();
        builder.code = template.getCode();
        return builder;
    }

}
