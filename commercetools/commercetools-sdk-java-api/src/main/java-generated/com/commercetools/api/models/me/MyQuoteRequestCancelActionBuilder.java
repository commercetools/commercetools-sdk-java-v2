package com.commercetools.api.models.me;

import com.commercetools.api.models.me.MyQuoteRequestUpdateAction;
import com.commercetools.api.models.me.MyQuoteRequestCancelAction;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * MyQuoteRequestCancelActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MyQuoteRequestCancelAction myQuoteRequestCancelAction = MyQuoteRequestCancelAction.builder()
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class MyQuoteRequestCancelActionBuilder implements Builder<MyQuoteRequestCancelAction> {




    /**
     * builds MyQuoteRequestCancelAction with checking for non-null required values
     * @return MyQuoteRequestCancelAction
     */
    public MyQuoteRequestCancelAction build() {
        return new MyQuoteRequestCancelActionImpl();
    }
    
    /**
     * builds MyQuoteRequestCancelAction without checking for non-null required values
     * @return MyQuoteRequestCancelAction
     */
    public MyQuoteRequestCancelAction buildUnchecked() {
        return new MyQuoteRequestCancelActionImpl();
    }

    /**
     * factory method for an instance of MyQuoteRequestCancelActionBuilder
     * @return builder 
     */
    public static MyQuoteRequestCancelActionBuilder of() {
        return new MyQuoteRequestCancelActionBuilder();
    }

    /**
     * create builder for MyQuoteRequestCancelAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static MyQuoteRequestCancelActionBuilder of(final MyQuoteRequestCancelAction template) {
        MyQuoteRequestCancelActionBuilder builder = new MyQuoteRequestCancelActionBuilder();
        return builder;
    }

}
