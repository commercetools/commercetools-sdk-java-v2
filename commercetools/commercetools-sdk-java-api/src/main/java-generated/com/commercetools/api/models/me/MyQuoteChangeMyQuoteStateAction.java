
package com.commercetools.api.models.me;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * MyQuoteChangeMyQuoteStateAction
 *
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
@JsonDeserialize(as = MyQuoteChangeMyQuoteStateActionImpl.class)
public interface MyQuoteChangeMyQuoteStateAction extends MyQuoteUpdateAction {

    String CHANGE_MY_QUOTE_STATE = "changeMyQuoteState";

    /**
     *  <p>New state to be set for the Quote.</p>
     * @return quoteState
     */
    @NotNull
    @JsonProperty("quoteState")
    public MyQuoteState getQuoteState();

    public void setQuoteState(final MyQuoteState quoteState);

    public static MyQuoteChangeMyQuoteStateAction of() {
        return new MyQuoteChangeMyQuoteStateActionImpl();
    }

    public static MyQuoteChangeMyQuoteStateAction of(final MyQuoteChangeMyQuoteStateAction template) {
        MyQuoteChangeMyQuoteStateActionImpl instance = new MyQuoteChangeMyQuoteStateActionImpl();
        instance.setQuoteState(template.getQuoteState());
        return instance;
    }

    public static MyQuoteChangeMyQuoteStateActionBuilder builder() {
        return MyQuoteChangeMyQuoteStateActionBuilder.of();
    }

    public static MyQuoteChangeMyQuoteStateActionBuilder builder(final MyQuoteChangeMyQuoteStateAction template) {
        return MyQuoteChangeMyQuoteStateActionBuilder.of(template);
    }

    default <T> T withMyQuoteChangeMyQuoteStateAction(Function<MyQuoteChangeMyQuoteStateAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<MyQuoteChangeMyQuoteStateAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<MyQuoteChangeMyQuoteStateAction>() {
            @Override
            public String toString() {
                return "TypeReference<MyQuoteChangeMyQuoteStateAction>";
            }
        };
    }
}
