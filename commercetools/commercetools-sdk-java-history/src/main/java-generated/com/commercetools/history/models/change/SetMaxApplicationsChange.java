
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetMaxApplicationsChange
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetMaxApplicationsChange setMaxApplicationsChange = SetMaxApplicationsChange.builder()
 *             .change("{change}")
 *             .previousValue(1)
 *             .nextValue(1)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = SetMaxApplicationsChangeImpl.class)
public interface SetMaxApplicationsChange extends Change {

    String SET_MAX_APPLICATIONS_CHANGE = "SetMaxApplicationsChange";

    /**
     *
     * @return type
     */
    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
     *  <p>Shape of the action for <code>setMaxApplications</code></p>
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
    public Integer getPreviousValue();

    /**
     *
     * @return nextValue
     */
    @NotNull
    @JsonProperty("nextValue")
    public Integer getNextValue();

    public void setChange(final String change);

    public void setPreviousValue(final Integer previousValue);

    public void setNextValue(final Integer nextValue);

    public static SetMaxApplicationsChange of() {
        return new SetMaxApplicationsChangeImpl();
    }

    public static SetMaxApplicationsChange of(final SetMaxApplicationsChange template) {
        SetMaxApplicationsChangeImpl instance = new SetMaxApplicationsChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    public static SetMaxApplicationsChangeBuilder builder() {
        return SetMaxApplicationsChangeBuilder.of();
    }

    public static SetMaxApplicationsChangeBuilder builder(final SetMaxApplicationsChange template) {
        return SetMaxApplicationsChangeBuilder.of(template);
    }

    default <T> T withSetMaxApplicationsChange(Function<SetMaxApplicationsChange, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<SetMaxApplicationsChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SetMaxApplicationsChange>() {
            @Override
            public String toString() {
                return "TypeReference<SetMaxApplicationsChange>";
            }
        };
    }
}
