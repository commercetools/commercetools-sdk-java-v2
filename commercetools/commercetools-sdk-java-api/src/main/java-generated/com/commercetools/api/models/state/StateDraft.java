
package com.commercetools.api.models.state;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.common.LocalizedString;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = StateDraftImpl.class)
public interface StateDraft {

    @NotNull
    @JsonProperty("key")
    public String getKey();

    @NotNull
    @JsonProperty("type")
    public StateTypeEnum getType();

    @Valid
    @JsonProperty("name")
    public LocalizedString getName();

    @Valid
    @JsonProperty("description")
    public LocalizedString getDescription();

    @JsonProperty("initial")
    public Boolean getInitial();

    @JsonProperty("roles")
    public List<StateRoleEnum> getRoles();

    @Valid
    @JsonProperty("transitions")
    public List<StateResourceIdentifier> getTransitions();

    public void setKey(final String key);

    public void setType(final StateTypeEnum type);

    public void setName(final LocalizedString name);

    public void setDescription(final LocalizedString description);

    public void setInitial(final Boolean initial);

    @JsonIgnore
    public void setRoles(final StateRoleEnum... roles);

    public void setRoles(final List<StateRoleEnum> roles);

    @JsonIgnore
    public void setTransitions(final StateResourceIdentifier... transitions);

    public void setTransitions(final List<StateResourceIdentifier> transitions);

    public static StateDraft of() {
        return new StateDraftImpl();
    }

    public static StateDraft of(final StateDraft template) {
        StateDraftImpl instance = new StateDraftImpl();
        instance.setKey(template.getKey());
        instance.setType(template.getType());
        instance.setName(template.getName());
        instance.setDescription(template.getDescription());
        instance.setInitial(template.getInitial());
        instance.setRoles(template.getRoles());
        instance.setTransitions(template.getTransitions());
        return instance;
    }

    public static StateDraftBuilder builder() {
        return StateDraftBuilder.of();
    }

    public static StateDraftBuilder builder(final StateDraft template) {
        return StateDraftBuilder.of(template);
    }

    default <T> T withStateDraft(Function<StateDraft, T> helper) {
        return helper.apply(this);
    }
}
