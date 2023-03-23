
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetDateOfBirthChange
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetDateOfBirthChange setDateOfBirthChange = SetDateOfBirthChange.builder()
 *             .change("{change}")
 *             .previousValue("{previousValue}")
 *             .nextValue("{nextValue}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = SetDateOfBirthChangeImpl.class)
public interface SetDateOfBirthChange extends Change {

    String SET_DATE_OF_BIRTH_CHANGE = "SetDateOfBirthChange";

    /**
     *
     * @return type
     */
    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
     *  <p>Shape of the action for <code>setDateOfBirth</code></p>
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

    public static SetDateOfBirthChange of() {
        return new SetDateOfBirthChangeImpl();
    }

    public static SetDateOfBirthChange of(final SetDateOfBirthChange template) {
        SetDateOfBirthChangeImpl instance = new SetDateOfBirthChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    public static SetDateOfBirthChangeBuilder builder() {
        return SetDateOfBirthChangeBuilder.of();
    }

    public static SetDateOfBirthChangeBuilder builder(final SetDateOfBirthChange template) {
        return SetDateOfBirthChangeBuilder.of(template);
    }

    default <T> T withSetDateOfBirthChange(Function<SetDateOfBirthChange, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<SetDateOfBirthChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SetDateOfBirthChange>() {
            @Override
            public String toString() {
                return "TypeReference<SetDateOfBirthChange>";
            }
        };
    }
}
