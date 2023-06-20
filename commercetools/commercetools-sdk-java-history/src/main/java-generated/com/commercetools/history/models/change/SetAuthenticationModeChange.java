
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.constraints.NotNull;

import com.commercetools.history.models.common.AuthenticationMode;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Change triggered by the Set AuthenticationMode update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetAuthenticationModeChange setAuthenticationModeChange = SetAuthenticationModeChange.builder()
 *             .change("{change}")
 *             .previousValue(AuthenticationMode.PASSWORD)
 *             .nextValue(AuthenticationMode.PASSWORD)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = SetAuthenticationModeChangeImpl.class)
public interface SetAuthenticationModeChange extends Change {

    /**
     * discriminator value for SetAuthenticationModeChange
     */
    String SET_AUTHENTICATION_MODE_CHANGE = "SetAuthenticationModeChange";

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
    public AuthenticationMode getPreviousValue();

    /**
     *  <p>Value after the change.</p>
     * @return nextValue
     */
    @NotNull
    @JsonProperty("nextValue")
    public AuthenticationMode getNextValue();

    /**
     * set change
     * @param change value to be set
     */

    public void setChange(final String change);

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     */

    public void setPreviousValue(final AuthenticationMode previousValue);

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     */

    public void setNextValue(final AuthenticationMode nextValue);

    /**
     * factory method
     * @return instance of SetAuthenticationModeChange
     */
    public static SetAuthenticationModeChange of() {
        return new SetAuthenticationModeChangeImpl();
    }

    /**
     * factory method to create a shallow copy SetAuthenticationModeChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static SetAuthenticationModeChange of(final SetAuthenticationModeChange template) {
        SetAuthenticationModeChangeImpl instance = new SetAuthenticationModeChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    /**
     * factory method to create a deep copy of SetAuthenticationModeChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static SetAuthenticationModeChange deepCopy(@Nullable final SetAuthenticationModeChange template) {
        if (template == null) {
            return null;
        }
        SetAuthenticationModeChangeImpl instance = new SetAuthenticationModeChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    /**
     * builder factory method for SetAuthenticationModeChange
     * @return builder
     */
    public static SetAuthenticationModeChangeBuilder builder() {
        return SetAuthenticationModeChangeBuilder.of();
    }

    /**
     * create builder for SetAuthenticationModeChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetAuthenticationModeChangeBuilder builder(final SetAuthenticationModeChange template) {
        return SetAuthenticationModeChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withSetAuthenticationModeChange(Function<SetAuthenticationModeChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<SetAuthenticationModeChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SetAuthenticationModeChange>() {
            @Override
            public String toString() {
                return "TypeReference<SetAuthenticationModeChange>";
            }
        };
    }
}
