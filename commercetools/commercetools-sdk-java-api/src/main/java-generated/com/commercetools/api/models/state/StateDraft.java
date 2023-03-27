
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

/**
 * StateDraft
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StateDraft stateDraft = StateDraft.builder()
 *             .key("{key}")
 *             .type(StateTypeEnum.ORDER_STATE)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = StateDraftImpl.class)
public interface StateDraft extends com.commercetools.api.models.WithKey, io.vrap.rmf.base.client.Draft<StateDraft> {

    /**
     *  <p>User-defined unique identifier for the State.</p>
     * @return key
     */
    @NotNull
    @JsonProperty("key")
    public String getKey();

    /**
     *  <p>Specify to which resource or object type the State is assigned to.</p>
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
     *  <p>Set to <code>false</code> if the State is not the first step in a workflow.</p>
     * @return initial
     */

    @JsonProperty("initial")
    public Boolean getInitial();

    /**
     *  <p>If suitable, assign predifined roles the State can fulfill in case the State's <code>type</code> is <code>LineItemState</code> or <code>ReviewState</code>.</p>
     * @return roles
     */

    @JsonProperty("roles")
    public List<StateRoleEnum> getRoles();

    /**
     *  <p>Define the list of States of the same <code>type</code> to which the current State can be transitioned to.</p>
     *  <ul>
     *   <li>If, for example, the current State is the <em>Initial</em> State of StateType <code>OrderState</code> and you want to allow the transition <em>Initial</em> -&gt; <em>Shipped</em>, then add the StateResourceIdentifier to the <em>Shipped</em> <code>OrderState</code> to this list.</li>
     *   <li>Set to empty list for not allowing any transition from the current State and defining it as final State for a workflow.</li>
     *   <li>Do not set this field at all to turn off validation and allowing transitions to any other State of the same <code>type</code> as the current State.</li>
     *  </ul>
     * @return transitions
     */
    @Valid
    @JsonProperty("transitions")
    public List<StateResourceIdentifier> getTransitions();

    /**
     *  <p>User-defined unique identifier for the State.</p>
     * @param key value to be set
     */

    public void setKey(final String key);

    /**
     *  <p>Specify to which resource or object type the State is assigned to.</p>
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
     *  <p>Set to <code>false</code> if the State is not the first step in a workflow.</p>
     * @param initial value to be set
     */

    public void setInitial(final Boolean initial);

    /**
     *  <p>If suitable, assign predifined roles the State can fulfill in case the State's <code>type</code> is <code>LineItemState</code> or <code>ReviewState</code>.</p>
     * @param roles values to be set
     */

    @JsonIgnore
    public void setRoles(final StateRoleEnum... roles);

    /**
     *  <p>If suitable, assign predifined roles the State can fulfill in case the State's <code>type</code> is <code>LineItemState</code> or <code>ReviewState</code>.</p>
     * @param roles values to be set
     */

    public void setRoles(final List<StateRoleEnum> roles);

    /**
     *  <p>Define the list of States of the same <code>type</code> to which the current State can be transitioned to.</p>
     *  <ul>
     *   <li>If, for example, the current State is the <em>Initial</em> State of StateType <code>OrderState</code> and you want to allow the transition <em>Initial</em> -&gt; <em>Shipped</em>, then add the StateResourceIdentifier to the <em>Shipped</em> <code>OrderState</code> to this list.</li>
     *   <li>Set to empty list for not allowing any transition from the current State and defining it as final State for a workflow.</li>
     *   <li>Do not set this field at all to turn off validation and allowing transitions to any other State of the same <code>type</code> as the current State.</li>
     *  </ul>
     * @param transitions values to be set
     */

    @JsonIgnore
    public void setTransitions(final StateResourceIdentifier... transitions);

    /**
     *  <p>Define the list of States of the same <code>type</code> to which the current State can be transitioned to.</p>
     *  <ul>
     *   <li>If, for example, the current State is the <em>Initial</em> State of StateType <code>OrderState</code> and you want to allow the transition <em>Initial</em> -&gt; <em>Shipped</em>, then add the StateResourceIdentifier to the <em>Shipped</em> <code>OrderState</code> to this list.</li>
     *   <li>Set to empty list for not allowing any transition from the current State and defining it as final State for a workflow.</li>
     *   <li>Do not set this field at all to turn off validation and allowing transitions to any other State of the same <code>type</code> as the current State.</li>
     *  </ul>
     * @param transitions values to be set
     */

    public void setTransitions(final List<StateResourceIdentifier> transitions);

    /**
     * factory method
     * @return instance of StateDraft
     */
    public static StateDraft of() {
        return new StateDraftImpl();
    }

    /**
     * factory method to copy an instance of StateDraft
     * @param template instance to be copied
     * @return copy instance
     */
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

    /**
     * builder factory method for StateDraft
     * @return builder
     */
    public static StateDraftBuilder builder() {
        return StateDraftBuilder.of();
    }

    /**
     * create builder for StateDraft instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StateDraftBuilder builder(final StateDraft template) {
        return StateDraftBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withStateDraft(Function<StateDraft, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<StateDraft> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StateDraft>() {
            @Override
            public String toString() {
                return "TypeReference<StateDraft>";
            }
        };
    }
}
