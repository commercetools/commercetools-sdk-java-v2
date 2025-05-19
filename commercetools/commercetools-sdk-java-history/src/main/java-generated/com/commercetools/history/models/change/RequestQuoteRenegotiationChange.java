
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.history.models.common.QuoteState;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 *  <p>Change triggered by the Request Quote Renegotiation update action.</p>
 *
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
@io.vrap.rmf.base.client.utils.json.SubType("RequestQuoteRenegotiationChange")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = RequestQuoteRenegotiationChangeImpl.class)
public interface RequestQuoteRenegotiationChange extends Change {

    /**
     * discriminator value for RequestQuoteRenegotiationChange
     */
    String REQUEST_QUOTE_RENEGOTIATION_CHANGE = "RequestQuoteRenegotiationChange";

    /**
     *
     * @return type
     */
    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
     *
     * @return change
     */
    @NotNull
    @JsonProperty("change")
    public String getChange();

    /**
     *  <p>Value before the change.</p>
     * @return previousValue
     */
    @NotNull
    @JsonProperty("previousValue")
    public QuoteState getPreviousValue();

    /**
     *  <p>Value after the change.</p>
     * @return nextValue
     */
    @NotNull
    @JsonProperty("nextValue")
    public QuoteState getNextValue();

    /**
     *  <p>Message from the Buyer regarding the Quote renegotiation request.</p>
     * @return buyerComment
     */
    @NotNull
    @JsonProperty("buyerComment")
    public String getBuyerComment();

    /**
     * set change
     * @param change value to be set
     */

    public void setChange(final String change);

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     */

    public void setPreviousValue(final QuoteState previousValue);

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     */

    public void setNextValue(final QuoteState nextValue);

    /**
     *  <p>Message from the Buyer regarding the Quote renegotiation request.</p>
     * @param buyerComment value to be set
     */

    public void setBuyerComment(final String buyerComment);

    /**
     * factory method
     * @return instance of RequestQuoteRenegotiationChange
     */
    public static RequestQuoteRenegotiationChange of() {
        return new RequestQuoteRenegotiationChangeImpl();
    }

    /**
     * factory method to create a shallow copy RequestQuoteRenegotiationChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static RequestQuoteRenegotiationChange of(final RequestQuoteRenegotiationChange template) {
        RequestQuoteRenegotiationChangeImpl instance = new RequestQuoteRenegotiationChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        instance.setBuyerComment(template.getBuyerComment());
        return instance;
    }

    public RequestQuoteRenegotiationChange copyDeep();

    /**
     * factory method to create a deep copy of RequestQuoteRenegotiationChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static RequestQuoteRenegotiationChange deepCopy(@Nullable final RequestQuoteRenegotiationChange template) {
        if (template == null) {
            return null;
        }
        RequestQuoteRenegotiationChangeImpl instance = new RequestQuoteRenegotiationChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        instance.setBuyerComment(template.getBuyerComment());
        return instance;
    }

    /**
     * builder factory method for RequestQuoteRenegotiationChange
     * @return builder
     */
    public static RequestQuoteRenegotiationChangeBuilder builder() {
        return RequestQuoteRenegotiationChangeBuilder.of();
    }

    /**
     * create builder for RequestQuoteRenegotiationChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static RequestQuoteRenegotiationChangeBuilder builder(final RequestQuoteRenegotiationChange template) {
        return RequestQuoteRenegotiationChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withRequestQuoteRenegotiationChange(Function<RequestQuoteRenegotiationChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<RequestQuoteRenegotiationChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<RequestQuoteRenegotiationChange>() {
            @Override
            public String toString() {
                return "TypeReference<RequestQuoteRenegotiationChange>";
            }
        };
    }
}
