
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.commercetools.history.models.common.QuoteRequestState;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Update action for <code>changeQuoteRequestState</code> on <code>quote-request</code></p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ChangeQuoteRequestStateChange changeQuoteRequestStateChange = ChangeQuoteRequestStateChange.builder()
 *             .change("{change}")
 *             .nextValue(QuoteRequestState.SUBMITTED)
 *             .previousValue(QuoteRequestState.SUBMITTED)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ChangeQuoteRequestStateChangeImpl.class)
public interface ChangeQuoteRequestStateChange extends Change {

    String CHANGE_QUOTE_REQUEST_STATE_CHANGE = "ChangeQuoteRequestStateChange";

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
     *
     * @return nextValue
     */
    @NotNull
    @JsonProperty("nextValue")
    public QuoteRequestState getNextValue();

    /**
     *
     * @return previousValue
     */
    @NotNull
    @JsonProperty("previousValue")
    public QuoteRequestState getPreviousValue();

    public void setChange(final String change);

    public void setNextValue(final QuoteRequestState nextValue);

    public void setPreviousValue(final QuoteRequestState previousValue);

    public static ChangeQuoteRequestStateChange of() {
        return new ChangeQuoteRequestStateChangeImpl();
    }

    public static ChangeQuoteRequestStateChange of(final ChangeQuoteRequestStateChange template) {
        ChangeQuoteRequestStateChangeImpl instance = new ChangeQuoteRequestStateChangeImpl();
        instance.setChange(template.getChange());
        instance.setNextValue(template.getNextValue());
        instance.setPreviousValue(template.getPreviousValue());
        return instance;
    }

    public static ChangeQuoteRequestStateChangeBuilder builder() {
        return ChangeQuoteRequestStateChangeBuilder.of();
    }

    public static ChangeQuoteRequestStateChangeBuilder builder(final ChangeQuoteRequestStateChange template) {
        return ChangeQuoteRequestStateChangeBuilder.of(template);
    }

    default <T> T withChangeQuoteRequestStateChange(Function<ChangeQuoteRequestStateChange, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ChangeQuoteRequestStateChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ChangeQuoteRequestStateChange>() {
            @Override
            public String toString() {
                return "TypeReference<ChangeQuoteRequestStateChange>";
            }
        };
    }
}
