
package com.commercetools.history.models.change;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * RequestQuoteRenegotiationChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     RequestQuoteRenegotiationChange requestQuoteRenegotiationChange = RequestQuoteRenegotiationChange.builder()
 *             .change("{change}")
 *             .previousValue(QuoteState.PENDING)
 *             .nextValue(QuoteState.PENDING)
 *             .buyerComment("{buyerComment}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class RequestQuoteRenegotiationChangeBuilder implements Builder<RequestQuoteRenegotiationChange> {

    private String change;

    private com.commercetools.history.models.common.QuoteState previousValue;

    private com.commercetools.history.models.common.QuoteState nextValue;

    private String buyerComment;

    /**
     * set the value to the change
     * @param change value to be set
     * @return Builder
     */

    public RequestQuoteRenegotiationChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     * @return Builder
     */

    public RequestQuoteRenegotiationChangeBuilder previousValue(
            final com.commercetools.history.models.common.QuoteState previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     * @return Builder
     */

    public RequestQuoteRenegotiationChangeBuilder nextValue(
            final com.commercetools.history.models.common.QuoteState nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    /**
     *  <p>Message from the Buyer regarding the Quote renegotiation request.</p>
     * @param buyerComment value to be set
     * @return Builder
     */

    public RequestQuoteRenegotiationChangeBuilder buyerComment(final String buyerComment) {
        this.buyerComment = buyerComment;
        return this;
    }

    /**
     * value of change}
     * @return change
     */

    public String getChange() {
        return this.change;
    }

    /**
     *  <p>Value before the change.</p>
     * @return previousValue
     */

    public com.commercetools.history.models.common.QuoteState getPreviousValue() {
        return this.previousValue;
    }

    /**
     *  <p>Value after the change.</p>
     * @return nextValue
     */

    public com.commercetools.history.models.common.QuoteState getNextValue() {
        return this.nextValue;
    }

    /**
     *  <p>Message from the Buyer regarding the Quote renegotiation request.</p>
     * @return buyerComment
     */

    public String getBuyerComment() {
        return this.buyerComment;
    }

    /**
     * builds RequestQuoteRenegotiationChange with checking for non-null required values
     * @return RequestQuoteRenegotiationChange
     */
    public RequestQuoteRenegotiationChange build() {
        Objects.requireNonNull(change, RequestQuoteRenegotiationChange.class + ": change is missing");
        Objects.requireNonNull(previousValue, RequestQuoteRenegotiationChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, RequestQuoteRenegotiationChange.class + ": nextValue is missing");
        Objects.requireNonNull(buyerComment, RequestQuoteRenegotiationChange.class + ": buyerComment is missing");
        return new RequestQuoteRenegotiationChangeImpl(change, previousValue, nextValue, buyerComment);
    }

    /**
     * builds RequestQuoteRenegotiationChange without checking for non-null required values
     * @return RequestQuoteRenegotiationChange
     */
    public RequestQuoteRenegotiationChange buildUnchecked() {
        return new RequestQuoteRenegotiationChangeImpl(change, previousValue, nextValue, buyerComment);
    }

    /**
     * factory method for an instance of RequestQuoteRenegotiationChangeBuilder
     * @return builder
     */
    public static RequestQuoteRenegotiationChangeBuilder of() {
        return new RequestQuoteRenegotiationChangeBuilder();
    }

    /**
     * create builder for RequestQuoteRenegotiationChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static RequestQuoteRenegotiationChangeBuilder of(final RequestQuoteRenegotiationChange template) {
        RequestQuoteRenegotiationChangeBuilder builder = new RequestQuoteRenegotiationChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        builder.buyerComment = template.getBuyerComment();
        return builder;
    }

}
