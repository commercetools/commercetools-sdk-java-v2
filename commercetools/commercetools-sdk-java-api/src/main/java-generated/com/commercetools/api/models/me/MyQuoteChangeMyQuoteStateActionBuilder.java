
package com.commercetools.api.models.me;

import java.util.*;

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
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class MyQuoteChangeMyQuoteStateActionBuilder implements Builder<MyQuoteChangeMyQuoteStateAction> {

    private com.commercetools.api.models.me.MyQuoteState quoteState;

    /**
     *  <p>New state to be set for the Quote.</p>
     * @param quoteState value to be set
     * @return Builder
     */

    public MyQuoteChangeMyQuoteStateActionBuilder quoteState(
            final com.commercetools.api.models.me.MyQuoteState quoteState) {
        this.quoteState = quoteState;
        return this;
    }

    public com.commercetools.api.models.me.MyQuoteState getQuoteState() {
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

    public static MyQuoteChangeMyQuoteStateActionBuilder of() {
        return new MyQuoteChangeMyQuoteStateActionBuilder();
    }

    public static MyQuoteChangeMyQuoteStateActionBuilder of(final MyQuoteChangeMyQuoteStateAction template) {
        MyQuoteChangeMyQuoteStateActionBuilder builder = new MyQuoteChangeMyQuoteStateActionBuilder();
        builder.quoteState = template.getQuoteState();
        return builder;
    }

}
