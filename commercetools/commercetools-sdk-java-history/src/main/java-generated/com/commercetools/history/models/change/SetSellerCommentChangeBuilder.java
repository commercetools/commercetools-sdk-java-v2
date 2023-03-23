
package com.commercetools.history.models.change;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetSellerCommentChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetSellerCommentChange setSellerCommentChange = SetSellerCommentChange.builder()
 *             .change("{change}")
 *             .previousValue("{previousValue}")
 *             .nextValue("{nextValue}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SetSellerCommentChangeBuilder implements Builder<SetSellerCommentChange> {

    private String change;

    private String previousValue;

    private String nextValue;

    /**
     *  <p>Shape of the action for <code>setSellerComment</code></p>
     * @param change
     * @return Builder
     */

    public SetSellerCommentChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     *
     * @param previousValue
     * @return Builder
     */

    public SetSellerCommentChangeBuilder previousValue(final String previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     *
     * @param nextValue
     * @return Builder
     */

    public SetSellerCommentChangeBuilder nextValue(final String nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    public String getChange() {
        return this.change;
    }

    public String getPreviousValue() {
        return this.previousValue;
    }

    public String getNextValue() {
        return this.nextValue;
    }

    public SetSellerCommentChange build() {
        Objects.requireNonNull(change, SetSellerCommentChange.class + ": change is missing");
        Objects.requireNonNull(previousValue, SetSellerCommentChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, SetSellerCommentChange.class + ": nextValue is missing");
        return new SetSellerCommentChangeImpl(change, previousValue, nextValue);
    }

    /**
     * builds SetSellerCommentChange without checking for non null required values
     */
    public SetSellerCommentChange buildUnchecked() {
        return new SetSellerCommentChangeImpl(change, previousValue, nextValue);
    }

    public static SetSellerCommentChangeBuilder of() {
        return new SetSellerCommentChangeBuilder();
    }

    public static SetSellerCommentChangeBuilder of(final SetSellerCommentChange template) {
        SetSellerCommentChangeBuilder builder = new SetSellerCommentChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
