
package com.commercetools.api.models.state;

import java.time.*;
import java.time.ZonedDateTime;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;

import com.commercetools.api.models.common.BaseResource;
import com.commercetools.api.models.common.CreatedBy;
import com.commercetools.api.models.common.LastModifiedBy;
import com.commercetools.api.models.common.LocalizedString;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

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
     * @return id
     */
    @NotNull
    @JsonProperty("id")
    public String getId();

    /**
     *  <p>Current version of the State.</p>
     * @return version
     */
    @NotNull
    @JsonProperty("version")
    public Long getVersion();

    /**
     *  <p>Date and time (UTC) the State was initially created.</p>
     * @return createdAt
     */
    @NotNull
    @JsonProperty("createdAt")
    public ZonedDateTime getCreatedAt();

    /**
     *  <p>Date and time (UTC) the State was last updated.</p>
     * @return lastModifiedAt
     */
    @NotNull
    @JsonProperty("lastModifiedAt")
    public ZonedDateTime getLastModifiedAt();

    /**
     *  <p>IDs and references that last modified the State.</p>
     * @return lastModifiedBy
     */
    @Valid
    @JsonProperty("lastModifiedBy")
    public LastModifiedBy getLastModifiedBy();

    /**
     *  <p>IDs and references that created the State.</p>
     * @return createdBy
     */
    @Valid
    @JsonProperty("createdBy")
    public CreatedBy getCreatedBy();

    /**
     *  <p>User-defined unique identifier of the State.</p>
     * @return key
     */
    @NotNull
    @JsonProperty("key")
    public String getKey();

    /**
     *  <p>Indicates to which resource or object types the State is assigned to.</p>
     * @return type
     */
    @NotNull
    @JsonProperty("type")
    public StateTypeEnum getType();

    /**
     *  <p>Name of the State.</p>
     * @return name
     */
    @Valid
    @JsonProperty("name")
    public LocalizedString getName();

    /**
     *  <p>Description of the State.</p>
     * @return description
     */
    @Valid
    @JsonProperty("description")
    public LocalizedString getDescription();

    /**
     *  <p><code>true</code> for an initial State, the first State in a workflow.</p>
     * @return initial
     */
    @NotNull
    @JsonProperty("initial")
    public Boolean getInitial();

    /**
     *  <p><code>true</code> for States that are an integral part of the Project. Those States cannot be deleted and their <code>key</code> cannot be changed.</p>
     * @return builtIn
     */
    @NotNull
    @JsonProperty("builtIn")
    public Boolean getBuiltIn();

    /**
     *  <p>Roles the State can fulfill for Reviews and Line Items.</p>
     * @return roles
     */

    @JsonProperty("roles")
    public List<StateRoleEnum> getRoles();

    /**
     *  <ul>
     *   <li>list of States of the same <code>type</code> that the current State can be transitioned to. For example, when the current State is the <em>Initial</em> State of StateType <code>OrderState</code> and this list contains the reference to the <em>Shipped</em> <code>OrderState</code>, the transition <em>Initial</em> -&gt; <em>Shipped</em> is allowed.</li>
     *   <li>if empty, no transitions are allowed from the current State, defining the current State as final for this workflow.</li>
     *   <li>if not set, the validation is turned off and the current State can be transitioned to any other State of the same <code>type</code> as the current State.</li>
     *  </ul>
     * @return transitions
     */
    @Valid
    @JsonProperty("transitions")
    public List<StateReference> getTransitions();

    /**
     *  <p>Unique identifier of the State.</p>
     * @param id value to be set
     */

    public void setId(final String id);

    /**
     *  <p>Current version of the State.</p>
     * @param version value to be set
     */

    public void setVersion(final Long version);

    /**
     *  <p>Date and time (UTC) the State was initially created.</p>
     * @param createdAt value to be set
     */

    public void setCreatedAt(final ZonedDateTime createdAt);

    /**
     *  <p>Date and time (UTC) the State was last updated.</p>
     * @param lastModifiedAt value to be set
     */

    public void setLastModifiedAt(final ZonedDateTime lastModifiedAt);

    /**
     *  <p>IDs and references that last modified the State.</p>
     * @param lastModifiedBy value to be set
     */

    public void setLastModifiedBy(final LastModifiedBy lastModifiedBy);

    /**
     *  <p>IDs and references that created the State.</p>
     * @param createdBy value to be set
     */

    public void setCreatedBy(final CreatedBy createdBy);

    /**
     *  <p>User-defined unique identifier of the State.</p>
     * @param key value to be set
     */

    public void setKey(final String key);

    /**
     *  <p>Indicates to which resource or object types the State is assigned to.</p>
     * @param type value to be set
     */

    public void setType(final StateTypeEnum type);

    /**
     *  <p>Name of the State.</p>
     * @param name value to be set
     */

    public void setName(final LocalizedString name);

    /**
     *  <p>Description of the State.</p>
     * @param description value to be set
     */

    public void setDescription(final LocalizedString description);

    /**
     *  <p><code>true</code> for an initial State, the first State in a workflow.</p>
     * @param initial value to be set
     */

    public void setInitial(final Boolean initial);

    /**
     *  <p><code>true</code> for States that are an integral part of the Project. Those States cannot be deleted and their <code>key</code> cannot be changed.</p>
     * @param builtIn value to be set
     */

    public void setBuiltIn(final Boolean builtIn);

    /**
     *  <p>Roles the State can fulfill for Reviews and Line Items.</p>
     * @param roles values to be set
     */

    @JsonIgnore
    public void setRoles(final StateRoleEnum... roles);

    /**
     *  <p>Roles the State can fulfill for Reviews and Line Items.</p>
     * @param roles values to be set
     */

    public void setRoles(final List<StateRoleEnum> roles);

    /**
     *  <ul>
     *   <li>list of States of the same <code>type</code> that the current State can be transitioned to. For example, when the current State is the <em>Initial</em> State of StateType <code>OrderState</code> and this list contains the reference to the <em>Shipped</em> <code>OrderState</code>, the transition <em>Initial</em> -&gt; <em>Shipped</em> is allowed.</li>
     *   <li>if empty, no transitions are allowed from the current State, defining the current State as final for this workflow.</li>
     *   <li>if not set, the validation is turned off and the current State can be transitioned to any other State of the same <code>type</code> as the current State.</li>
     *  </ul>
     * @param transitions values to be set
     */

    @JsonIgnore
    public void setTransitions(final StateReference... transitions);

    /**
     *  <ul>
     *   <li>list of States of the same <code>type</code> that the current State can be transitioned to. For example, when the current State is the <em>Initial</em> State of StateType <code>OrderState</code> and this list contains the reference to the <em>Shipped</em> <code>OrderState</code>, the transition <em>Initial</em> -&gt; <em>Shipped</em> is allowed.</li>
     *   <li>if empty, no transitions are allowed from the current State, defining the current State as final for this workflow.</li>
     *   <li>if not set, the validation is turned off and the current State can be transitioned to any other State of the same <code>type</code> as the current State.</li>
     *  </ul>
     * @param transitions values to be set
     */

    public void setTransitions(final List<StateReference> transitions);

    /**
     * factory method
     * @return instance of State
     */
    public static State of() {
        return new StateImpl();
    }

    /**
     * factory method to create a shallow copy State
     * @param template instance to be copied
     * @return copy instance
     */
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

    public State copyDeep();

    /**
     * factory method to create a deep copy of State
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static State deepCopy(@Nullable final State template) {
        if (template == null) {
            return null;
        }
        StateImpl instance = new StateImpl();
        instance.setId(template.getId());
        instance.setVersion(template.getVersion());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setLastModifiedAt(template.getLastModifiedAt());
        instance.setLastModifiedBy(
            com.commercetools.api.models.common.LastModifiedBy.deepCopy(template.getLastModifiedBy()));
        instance.setCreatedBy(com.commercetools.api.models.common.CreatedBy.deepCopy(template.getCreatedBy()));
        instance.setKey(template.getKey());
        instance.setType(template.getType());
        instance.setName(com.commercetools.api.models.common.LocalizedString.deepCopy(template.getName()));
        instance.setDescription(
            com.commercetools.api.models.common.LocalizedString.deepCopy(template.getDescription()));
        instance.setInitial(template.getInitial());
        instance.setBuiltIn(template.getBuiltIn());
        instance.setRoles(Optional.ofNullable(template.getRoles()).map(ArrayList::new).orElse(null));
        instance.setTransitions(Optional.ofNullable(template.getTransitions())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.state.StateReference::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for State
     * @return builder
     */
    public static StateBuilder builder() {
        return StateBuilder.of();
    }

    /**
     * create builder for State instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StateBuilder builder(final State template) {
        return StateBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withState(Function<State, T> helper) {
        return helper.apply(this);
    }

    public static com.commercetools.api.models.common.ReferenceTypeId referenceTypeId() {
        return com.commercetools.api.models.common.ReferenceTypeId.STATE;
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<State> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<State>() {
            @Override
            public String toString() {
                return "TypeReference<State>";
            }
        };
    }
}
