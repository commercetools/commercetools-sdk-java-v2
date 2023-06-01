package com.commercetools.api.models.me;

import com.commercetools.api.models.me.MyQuoteState;
import com.commercetools.api.models.me.MyQuoteUpdateAction;
import com.commercetools.api.models.me.MyQuoteChangeMyQuoteStateActionImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.annotation.Nullable;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.io.IOException;

/**
 *  <p>When accepting, declining, or renegotiating B2B Quotes, the Customer must have the <code>AcceptMyQuotes</code>, <code>DeclineMyQuotes</code>, or <code>RenegotiateMyQuotes</code> Permission, respectively. If the required Permission is missing, an AssociateMissingPermission error is returned.</p>
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
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
@JsonDeserialize(as = MyQuoteChangeMyQuoteStateActionImpl.class)
public interface MyQuoteChangeMyQuoteStateAction extends MyQuoteUpdateAction {

    /**
     * discriminator value for MyQuoteChangeMyQuoteStateAction
     */
    String CHANGE_MY_QUOTE_STATE = "changeMyQuoteState";

    /**
     *  <p>New state to be set for the Quote.</p>
     * @return quoteState
     */
    @NotNull
    @JsonProperty("quoteState")
    public MyQuoteState getQuoteState();

    /**
     *  <p>New state to be set for the Quote.</p>
     * @param quoteState value to be set
     */
    
    public void setQuoteState(final MyQuoteState quoteState);
    

    /**
     * factory method
     * @return instance of MyQuoteChangeMyQuoteStateAction
     */
    public static MyQuoteChangeMyQuoteStateAction of(){
        return new MyQuoteChangeMyQuoteStateActionImpl();
    }
    

    /**
     * factory method to create a shallow copy MyQuoteChangeMyQuoteStateAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static MyQuoteChangeMyQuoteStateAction of(final MyQuoteChangeMyQuoteStateAction template) {
        MyQuoteChangeMyQuoteStateActionImpl instance = new MyQuoteChangeMyQuoteStateActionImpl();
        instance.setQuoteState(template.getQuoteState());
        return instance;
    }

    /**
     * factory method to create a deep copy of MyQuoteChangeMyQuoteStateAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static MyQuoteChangeMyQuoteStateAction deepCopy(@Nullable final MyQuoteChangeMyQuoteStateAction template) {
        if (template == null) {
            return null;
        }
        MyQuoteChangeMyQuoteStateActionImpl instance = new MyQuoteChangeMyQuoteStateActionImpl();
        instance.setQuoteState(template.getQuoteState());
        return instance;
    }

    /**
     * builder factory method for MyQuoteChangeMyQuoteStateAction
     * @return builder
     */
    public static MyQuoteChangeMyQuoteStateActionBuilder builder() {
        return MyQuoteChangeMyQuoteStateActionBuilder.of();
    }
    
    /**
     * create builder for MyQuoteChangeMyQuoteStateAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static MyQuoteChangeMyQuoteStateActionBuilder builder(final MyQuoteChangeMyQuoteStateAction template) {
        return MyQuoteChangeMyQuoteStateActionBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withMyQuoteChangeMyQuoteStateAction(Function<MyQuoteChangeMyQuoteStateAction, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<MyQuoteChangeMyQuoteStateAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<MyQuoteChangeMyQuoteStateAction>() {
            @Override
            public String toString() {
                return "TypeReference<MyQuoteChangeMyQuoteStateAction>";
            }
        };
    }
}
