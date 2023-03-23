
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetValidToChange
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetValidToChange setValidToChange = SetValidToChange.builder()
 *             .change("{change}")
 *             .previousValue("{previousValue}")
 *             .nextValue("{nextValue}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = SetValidToChangeImpl.class)
public interface SetValidToChange extends Change {

    String SET_VALID_TO_CHANGE = "SetValidToChange";

    /**
     *
     * @return type
     */
    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
     *  <p>Shape of the action for <code>setValidTo</code></p>
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

    public static SetValidToChange of() {
        return new SetValidToChangeImpl();
    }

    public static SetValidToChange of(final SetValidToChange template) {
        SetValidToChangeImpl instance = new SetValidToChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    public static SetValidToChangeBuilder builder() {
        return SetValidToChangeBuilder.of();
    }

    public static SetValidToChangeBuilder builder(final SetValidToChange template) {
        return SetValidToChangeBuilder.of(template);
    }

    default <T> T withSetValidToChange(Function<SetValidToChange, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<SetValidToChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SetValidToChange>() {
            @Override
            public String toString() {
                return "TypeReference<SetValidToChange>";
            }
        };
    }
}
