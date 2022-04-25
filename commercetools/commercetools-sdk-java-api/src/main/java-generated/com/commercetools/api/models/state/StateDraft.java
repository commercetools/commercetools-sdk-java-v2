
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

    /**
    *  <p>User-defined unique identifier for the State.</p>
    */
    @NotNull
    @JsonProperty("key")
    public String getKey();

    /**
    *  <p>Specify to which resource or object type the State is assigned to.</p>
    */
    @NotNull
    @JsonProperty("type")
    public StateTypeEnum getType();

    /**
    *  <p>Name of the State.</p>
    */
    @Valid
    @JsonProperty("name")
    public LocalizedString getName();

    /**
    *  <p>Description of the State.</p>
    */
    @Valid
    @JsonProperty("description")
    public LocalizedString getDescription();

    /**
    *  <p>Set to <code>false</code> if the State is not the first step in a workflow.</p>
    */

    @JsonProperty("initial")
    public Boolean getInitial();

    /**
    *  <p>If suitable, assign predifined roles the State can fulfill in case the State's <code>type</code> is <code>LineItemState</code> or <code>ReviewState</code>.</p>
    */

    @JsonProperty("roles")
    public List<StateRoleEnum> getRoles();

    /**
    *  <p>Define the list of States of the same <code>type</code> to which the current State can be transitioned to.</p>
    *  <ul>
    *  <li>If, for example, the current State is the <em>Initial</em> State of <a href="ctp:api:type:StateTypeEnum">StateType</a> <code>OrderState</code> and you want to allow the transition <em>Initial</em> -&gt; <em>Shipped</em>, then add the <a href="ctp:api:type:StateResourceIdentifier">StateResourceIdentifier</a> to the <em>Shipped</em> <code>OrderState</code> to this list.</li>
    *  <li>Set to empty list for not allowing any transition from the current State and defining it as final State for a workflow.</li>
    *  <li>Do not set this field at all to turn off validation and allowing transitions to any other State of the same <code>type</code> as the current State.</li>
    *  </ul>
    */
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

    public static com.fasterxml.jackson.core.type.TypeReference<StateDraft> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StateDraft>() {
            @Override
            public String toString() {
                return "TypeReference<StateDraft>";
            }
        };
    }
}
