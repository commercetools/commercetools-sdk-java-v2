
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetIsValidChange
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetIsValidChange setIsValidChange = SetIsValidChange.builder()
 *             .change("{change}")
 *             .previousValue(true)
 *             .nextValue(true)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = SetIsValidChangeImpl.class)
public interface SetIsValidChange extends Change {

    String SET_IS_VALID_CHANGE = "SetIsValidChange";

    /**
     *
     * @return type
     */
    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
     *  <p>Shape of the action for <code>setIsValid</code></p>
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
    public Boolean getPreviousValue();

    /**
     *
     * @return nextValue
     */
    @NotNull
    @JsonProperty("nextValue")
    public Boolean getNextValue();

    public void setChange(final String change);

    public void setPreviousValue(final Boolean previousValue);

    public void setNextValue(final Boolean nextValue);

    public static SetIsValidChange of() {
        return new SetIsValidChangeImpl();
    }

    public static SetIsValidChange of(final SetIsValidChange template) {
        SetIsValidChangeImpl instance = new SetIsValidChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    public static SetIsValidChangeBuilder builder() {
        return SetIsValidChangeBuilder.of();
    }

    public static SetIsValidChangeBuilder builder(final SetIsValidChange template) {
        return SetIsValidChangeBuilder.of(template);
    }

    default <T> T withSetIsValidChange(Function<SetIsValidChange, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<SetIsValidChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SetIsValidChange>() {
            @Override
            public String toString() {
                return "TypeReference<SetIsValidChange>";
            }
        };
    }
}
