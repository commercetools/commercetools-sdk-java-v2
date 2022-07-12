
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.commercetools.history.models.common.AuthenticationMode;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetAuthenticationModeChange
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

    String SET_AUTHENTICATION_MODE_CHANGE = "SetAuthenticationModeChange";

    /**
     *
     */
    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
     *  <p>Update action for <code>setAuthenticationMode</code></p>
     */
    @NotNull
    @JsonProperty("change")
    public String getChange();

    /**
     *
     */
    @NotNull
    @JsonProperty("previousValue")
    public AuthenticationMode getPreviousValue();

    /**
     *
     */
    @NotNull
    @JsonProperty("nextValue")
    public AuthenticationMode getNextValue();

    public void setChange(final String change);

    public void setPreviousValue(final AuthenticationMode previousValue);

    public void setNextValue(final AuthenticationMode nextValue);

    public static SetAuthenticationModeChange of() {
        return new SetAuthenticationModeChangeImpl();
    }

    public static SetAuthenticationModeChange of(final SetAuthenticationModeChange template) {
        SetAuthenticationModeChangeImpl instance = new SetAuthenticationModeChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    public static SetAuthenticationModeChangeBuilder builder() {
        return SetAuthenticationModeChangeBuilder.of();
    }

    public static SetAuthenticationModeChangeBuilder builder(final SetAuthenticationModeChange template) {
        return SetAuthenticationModeChangeBuilder.of(template);
    }

    default <T> T withSetAuthenticationModeChange(Function<SetAuthenticationModeChange, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<SetAuthenticationModeChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SetAuthenticationModeChange>() {
            @Override
            public String toString() {
                return "TypeReference<SetAuthenticationModeChange>";
            }
        };
    }
}
