
package com.commercetools.api.models.state;

import java.time.*;
import java.time.ZonedDateTime;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.common.BaseResource;
import com.commercetools.api.models.common.CreatedBy;
import com.commercetools.api.models.common.LastModifiedBy;
import com.commercetools.api.models.common.LocalizedString;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * State
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     State state = State.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .key("{key}")
 *             .type(StateTypeEnum.ORDER_STATE)
 *             .initial(true)
 *             .builtIn(true)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = StateImpl.class)
public interface State extends BaseResource, StateMixin, com.commercetools.api.models.DomainResource<State>,
        com.commercetools.api.models.Referencable<State>, com.commercetools.api.models.ResourceIdentifiable<State>,
        com.commercetools.api.models.WithKey {

    /**
     *  <p>Unique identifier of the State.</p>
     */
    @NotNull
    @JsonProperty("id")
    public String getId();

    /**
     *  <p>Current version of the State.</p>
     */
    @NotNull
    @JsonProperty("version")
    public Long getVersion();

    /**
     *  <p>Date and time (UTC) the State was initially created.</p>
     */
    @NotNull
    @JsonProperty("createdAt")
    public ZonedDateTime getCreatedAt();

    /**
     *  <p>Date and time (UTC) the State was last updated.</p>
     */
    @NotNull
    @JsonProperty("lastModifiedAt")
    public ZonedDateTime getLastModifiedAt();

    /**
     *  <p>Present on resources created after 1 February 2019 except for events not tracked.</p>
     */
    @Valid
    @JsonProperty("lastModifiedBy")
    public LastModifiedBy getLastModifiedBy();

    /**
     *  <p>Present on resources created after 1 February 2019 except for events not tracked.</p>
     */
    @Valid
    @JsonProperty("createdBy")
    public CreatedBy getCreatedBy();

    /**
     *  <p>User-defined unique identifier of the State.</p>
     */
    @NotNull
    @JsonProperty("key")
    public String getKey();

    /**
     *  <p>Indicates to which resource or object types the State is assigned to.</p>
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
     *  <p><code>true</code> for an initial State, the first State in a workflow.</p>
     */
    @NotNull
    @JsonProperty("initial")
    public Boolean getInitial();

    /**
     *  <p><code>true</code> for States that are an integral part of the Project. Those States cannot be deleted and their <code>key</code> cannot be changed.</p>
     */
    @NotNull
    @JsonProperty("builtIn")
    public Boolean getBuiltIn();

    /**
     *  <p>Roles the State can fulfill for Reviews and Line Items.</p>
     */

    @JsonProperty("roles")
    public List<StateRoleEnum> getRoles();

    /**
     *  <ul>
     *   <li>list of States of the same <code>type</code> that the current State can be transitioned to. For example, when the current State is the <em>Initial</em> State of StateType <code>OrderState</code> and this list contains the reference to the <em>Shipped</em> <code>OrderState</code>, the transition <em>Initial</em> -&gt; <em>Shipped</em> is allowed.</li>
     *   <li>if empty, no transitions are allowed from the current State, defining the current State as final for this workflow.</li>
     *   <li>if not set, the validation is turned off and the current State can be transitioned to any other State of the same <code>type</code> as the current State.</li>
     *  </ul>
     */
    @Valid
    @JsonProperty("transitions")
    public List<StateReference> getTransitions();

    public void setId(final String id);

    public void setVersion(final Long version);

    public void setCreatedAt(final ZonedDateTime createdAt);

    public void setLastModifiedAt(final ZonedDateTime lastModifiedAt);

    public void setLastModifiedBy(final LastModifiedBy lastModifiedBy);

    public void setCreatedBy(final CreatedBy createdBy);

    public void setKey(final String key);

    public void setType(final StateTypeEnum type);

    public void setName(final LocalizedString name);

    public void setDescription(final LocalizedString description);

    public void setInitial(final Boolean initial);

    public void setBuiltIn(final Boolean builtIn);

    @JsonIgnore
    public void setRoles(final StateRoleEnum... roles);

    public void setRoles(final List<StateRoleEnum> roles);

    @JsonIgnore
    public void setTransitions(final StateReference... transitions);

    public void setTransitions(final List<StateReference> transitions);

    public static State of() {
        return new StateImpl();
    }

    public static State of(final State template) {
        StateImpl instance = new StateImpl();
        instance.setId(template.getId());
        instance.setVersion(template.getVersion());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setLastModifiedAt(template.getLastModifiedAt());
        instance.setLastModifiedBy(template.getLastModifiedBy());
        instance.setCreatedBy(template.getCreatedBy());
        instance.setKey(template.getKey());
        instance.setType(template.getType());
        instance.setName(template.getName());
        instance.setDescription(template.getDescription());
        instance.setInitial(template.getInitial());
        instance.setBuiltIn(template.getBuiltIn());
        instance.setRoles(template.getRoles());
        instance.setTransitions(template.getTransitions());
        return instance;
    }

    public static StateBuilder builder() {
        return StateBuilder.of();
    }

    public static StateBuilder builder(final State template) {
        return StateBuilder.of(template);
    }

    default <T> T withState(Function<State, T> helper) {
        return helper.apply(this);
    }

    public static com.commercetools.api.models.common.ReferenceTypeId referenceTypeId() {
        return com.commercetools.api.models.common.ReferenceTypeId.STATE;
    }

    public static com.fasterxml.jackson.core.type.TypeReference<State> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<State>() {
            @Override
            public String toString() {
                return "TypeReference<State>";
            }
        };
    }
}
