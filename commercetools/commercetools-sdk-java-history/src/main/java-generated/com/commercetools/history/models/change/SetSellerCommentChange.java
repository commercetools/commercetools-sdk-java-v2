
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Change triggered by the Set Seller Comment update action.</p>
 *
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
@JsonDeserialize(as = SetSellerCommentChangeImpl.class)
public interface SetSellerCommentChange extends Change {

    /**
     * discriminator value for SetSellerCommentChange
     */
    String SET_SELLER_COMMENT_CHANGE = "SetSellerCommentChange";

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
    public String getPreviousValue();

    /**
     *  <p>Value after the change.</p>
     * @return nextValue
     */
    @NotNull
    @JsonProperty("nextValue")
    public String getNextValue();

    /**
     * set change
     * @param change value to be set
     */

    public void setChange(final String change);

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     */

    public void setPreviousValue(final String previousValue);

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     */

    public void setNextValue(final String nextValue);

    /**
     * factory method
     * @return instance of SetSellerCommentChange
     */
    public static SetSellerCommentChange of() {
        return new SetSellerCommentChangeImpl();
    }

    /**
     * factory method to create a shallow copy SetSellerCommentChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static SetSellerCommentChange of(final SetSellerCommentChange template) {
        SetSellerCommentChangeImpl instance = new SetSellerCommentChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    /**
     * factory method to create a deep copy of SetSellerCommentChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static SetSellerCommentChange deepCopy(@Nullable final SetSellerCommentChange template) {
        if (template == null) {
            return null;
        }
        SetSellerCommentChangeImpl instance = new SetSellerCommentChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    /**
     * builder factory method for SetSellerCommentChange
     * @return builder
     */
    public static SetSellerCommentChangeBuilder builder() {
        return SetSellerCommentChangeBuilder.of();
    }

    /**
     * create builder for SetSellerCommentChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetSellerCommentChangeBuilder builder(final SetSellerCommentChange template) {
        return SetSellerCommentChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withSetSellerCommentChange(Function<SetSellerCommentChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<SetSellerCommentChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SetSellerCommentChange>() {
            @Override
            public String toString() {
                return "TypeReference<SetSellerCommentChange>";
            }
        };
    }
}
