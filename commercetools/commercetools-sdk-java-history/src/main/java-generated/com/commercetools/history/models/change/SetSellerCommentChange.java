
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetSellerCommentChange
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

    String SET_SELLER_COMMENT_CHANGE = "SetSellerCommentChange";

    /**
     *
     * @return type
     */
    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
     *  <p>Shape of the action for <code>setSellerComment</code></p>
     * @return change
     */
    @NotNull
    @JsonProperty("change")
    public String getChange();

    /**
     *
     * @return previousValue
     */
    @NotNull
    @JsonProperty("previousValue")
    public String getPreviousValue();

    /**
     *
     * @return nextValue
     */
    @NotNull
    @JsonProperty("nextValue")
    public String getNextValue();

    public void setChange(final String change);

    public void setPreviousValue(final String previousValue);

    public void setNextValue(final String nextValue);

    public static SetSellerCommentChange of() {
        return new SetSellerCommentChangeImpl();
    }

    public static SetSellerCommentChange of(final SetSellerCommentChange template) {
        SetSellerCommentChangeImpl instance = new SetSellerCommentChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    public static SetSellerCommentChangeBuilder builder() {
        return SetSellerCommentChangeBuilder.of();
    }

    public static SetSellerCommentChangeBuilder builder(final SetSellerCommentChange template) {
        return SetSellerCommentChangeBuilder.of(template);
    }

    default <T> T withSetSellerCommentChange(Function<SetSellerCommentChange, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<SetSellerCommentChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SetSellerCommentChange>() {
            @Override
            public String toString() {
                return "TypeReference<SetSellerCommentChange>";
            }
        };
    }
}
