package com.commercetools.api.models.me;

import com.commercetools.api.models.me.MyQuoteState;
import com.commercetools.api.models.me.MyQuoteUpdateAction;
import com.commercetools.api.models.me.MyQuoteChangeMyQuoteStateAction;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * MyQuoteChangeMyQuoteStateActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MyQuoteChangeMyQuoteStateAction myQuoteChangeMyQuoteStateAction = MyQuoteChangeMyQuoteStateAction.builder()
 *             .quoteState(MyQuoteState.DECLINED)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class MyQuoteChangeMyQuoteStateActionBuilder implements Builder<MyQuoteChangeMyQuoteStateAction> {

    
    
    private com.commercetools.api.models.me.MyQuoteState quoteState;

    
    /**
     *  <p>New state to be set for the Quote.</p>
     * @param quoteState value to be set
     * @return Builder
     */
    
    public MyQuoteChangeMyQuoteStateActionBuilder quoteState( final com.commercetools.api.models.me.MyQuoteState quoteState) {
        this.quoteState = quoteState;
        return this;
    }
    
    

    /**
     *  <p>New state to be set for the Quote.</p>
     * @return quoteState
     */
    
    
    public com.commercetools.api.models.me.MyQuoteState getQuoteState(){
        return this.quoteState;
    }

    /**
     * builds MyQuoteChangeMyQuoteStateAction with checking for non-null required values
     * @return MyQuoteChangeMyQuoteStateAction
     */
    public MyQuoteChangeMyQuoteStateAction build() {
        Objects.requireNonNull(quoteState, MyQuoteChangeMyQuoteStateAction.class + ": quoteState is missing");
        return new MyQuoteChangeMyQuoteStateActionImpl(quoteState);
    }
    
    /**
     * builds MyQuoteChangeMyQuoteStateAction without checking for non-null required values
     * @return MyQuoteChangeMyQuoteStateAction
     */
    public MyQuoteChangeMyQuoteStateAction buildUnchecked() {
        return new MyQuoteChangeMyQuoteStateActionImpl(quoteState);
    }

    /**
     * factory method for an instance of MyQuoteChangeMyQuoteStateActionBuilder
     * @return builder 
     */
    public static MyQuoteChangeMyQuoteStateActionBuilder of() {
        return new MyQuoteChangeMyQuoteStateActionBuilder();
    }

    /**
     * create builder for MyQuoteChangeMyQuoteStateAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static MyQuoteChangeMyQuoteStateActionBuilder of(final MyQuoteChangeMyQuoteStateAction template) {
        MyQuoteChangeMyQuoteStateActionBuilder builder = new MyQuoteChangeMyQuoteStateActionBuilder();
        builder.quoteState = template.getQuoteState();
        return builder;
    }

}
