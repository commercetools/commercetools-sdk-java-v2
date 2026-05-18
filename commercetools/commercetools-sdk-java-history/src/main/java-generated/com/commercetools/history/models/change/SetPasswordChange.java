
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 *  <p>Change triggered by the <span>Change password of Customer</span> or <span>Change password of Customer in Store</span> request.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetPasswordChange setPasswordChange = SetPasswordChange.builder()
 *             .change("{change}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("SetPasswordChange")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = SetPasswordChangeImpl.class)
public interface SetPasswordChange extends Change {

    /**
     * discriminator value for SetPasswordChange
     */
    String SET_PASSWORD_CHANGE = "SetPasswordChange";

    /**
     *
     * @return change
     */
    @NotNull
    @JsonProperty("change")
    public String getChange();

    /**
     *
     * @return type
     */
    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
     * set change
     * @param change value to be set
     */

    public void setChange(final String change);

    /**
     * factory method
     * @return instance of SetPasswordChange
     */
    public static SetPasswordChange of() {
        return new SetPasswordChangeImpl();
    }

    /**
     * factory method to create a shallow copy SetPasswordChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static SetPasswordChange of(final SetPasswordChange template) {
        SetPasswordChangeImpl instance = new SetPasswordChangeImpl();
        instance.setChange(template.getChange());
        return instance;
    }

    public SetPasswordChange copyDeep();

    /**
     * factory method to create a deep copy of SetPasswordChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static SetPasswordChange deepCopy(@Nullable final SetPasswordChange template) {
        if (template == null) {
            return null;
        }
        SetPasswordChangeImpl instance = new SetPasswordChangeImpl();
        instance.setChange(template.getChange());
        return instance;
    }

    /**
     * builder factory method for SetPasswordChange
     * @return builder
     */
    public static SetPasswordChangeBuilder builder() {
        return SetPasswordChangeBuilder.of();
    }

    /**
     * create builder for SetPasswordChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetPasswordChangeBuilder builder(final SetPasswordChange template) {
        return SetPasswordChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withSetPasswordChange(Function<SetPasswordChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<SetPasswordChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SetPasswordChange>() {
            @Override
            public String toString() {
                return "TypeReference<SetPasswordChange>";
            }
        };
    }
}
