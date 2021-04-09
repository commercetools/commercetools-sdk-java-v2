
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ChangeGroupsChangeImpl.class)
public interface ChangeGroupsChange extends Change {

    String CHANGE_GROUPS_CHANGE = "ChangeGroupsChange";

    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
    *  <p>Update action for <code>changeGroups</code> on stores</p>
    */
    @NotNull
    @JsonProperty("change")
    public String getChange();

    @NotNull
    @JsonProperty("previousValue")
    public List<String> getPreviousValue();

    @NotNull
    @JsonProperty("nextValue")
    public List<String> getNextValue();

    public void setChange(final String change);

    @JsonIgnore
    public void setPreviousValue(final String... previousValue);

    public void setPreviousValue(final List<String> previousValue);

    @JsonIgnore
    public void setNextValue(final String... nextValue);

    public void setNextValue(final List<String> nextValue);

    public static ChangeGroupsChange of() {
        return new ChangeGroupsChangeImpl();
    }

    public static ChangeGroupsChange of(final ChangeGroupsChange template) {
        ChangeGroupsChangeImpl instance = new ChangeGroupsChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    public static ChangeGroupsChangeBuilder builder() {
        return ChangeGroupsChangeBuilder.of();
    }

    public static ChangeGroupsChangeBuilder builder(final ChangeGroupsChange template) {
        return ChangeGroupsChangeBuilder.of(template);
    }

    default <T> T withChangeGroupsChange(Function<ChangeGroupsChange, T> helper) {
        return helper.apply(this);
    }
}
