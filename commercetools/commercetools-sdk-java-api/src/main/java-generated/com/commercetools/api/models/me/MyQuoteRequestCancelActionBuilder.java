
package com.commercetools.api.models.me;

import java.util.*;

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
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class MyQuoteRequestCancelActionBuilder implements Builder<MyQuoteRequestCancelAction> {

    public MyQuoteRequestCancelAction build() {
        return new MyQuoteRequestCancelActionImpl();
    }

    /**
     * builds MyQuoteRequestCancelAction without checking for non null required values
     */
    public MyQuoteRequestCancelAction buildUnchecked() {
        return new MyQuoteRequestCancelActionImpl();
    }

    public static MyQuoteRequestCancelActionBuilder of() {
        return new MyQuoteRequestCancelActionBuilder();
    }

    public static MyQuoteRequestCancelActionBuilder of(final MyQuoteRequestCancelAction template) {
        MyQuoteRequestCancelActionBuilder builder = new MyQuoteRequestCancelActionBuilder();
        return builder;
    }

}
