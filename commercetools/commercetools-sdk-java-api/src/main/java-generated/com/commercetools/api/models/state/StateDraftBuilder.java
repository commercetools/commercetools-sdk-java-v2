
package com.commercetools.api.models.state;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * StateDraftBuilder
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
public class StateDraftBuilder implements Builder<StateDraft> {

    private String key;

    private com.commercetools.api.models.state.StateTypeEnum type;

    @Nullable
    private com.commercetools.api.models.common.LocalizedString name;

    @Nullable
    private com.commercetools.api.models.common.LocalizedString description;

    @Nullable
    private Boolean initial;

    @Nullable
    private java.util.List<com.commercetools.api.models.state.StateRoleEnum> roles;

    @Nullable
    private java.util.List<com.commercetools.api.models.state.StateResourceIdentifier> transitions;

    /**
     *  <p>User-defined unique identifier for the State.</p>
     * @param key value to be set
     * @return Builder
     */

    public StateDraftBuilder key(final String key) {
        this.key = key;
        return this;
    }

    /**
     *  <p>Specify to which resource or object type the State is assigned to.</p>
     * @param type value to be set
     * @return Builder
     */

    public StateDraftBuilder type(final com.commercetools.api.models.state.StateTypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     *  <p>Name of the State.</p>
     * @param builder function to build the name value
     * @return Builder
     */

    public StateDraftBuilder name(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.name = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Name of the State.</p>
     * @param builder function to build the name value
     * @return Builder
     */

    public StateDraftBuilder withName(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedString> builder) {
        this.name = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of());
        return this;
    }

    /**
     *  <p>Name of the State.</p>
     * @param name value to be set
     * @return Builder
     */

    public StateDraftBuilder name(@Nullable final com.commercetools.api.models.common.LocalizedString name) {
        this.name = name;
        return this;
    }

    /**
     *  <p>Description of the State.</p>
     * @param builder function to build the description value
     * @return Builder
     */

    public StateDraftBuilder description(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.description = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Description of the State.</p>
     * @param builder function to build the description value
     * @return Builder
     */

    public StateDraftBuilder withDescription(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedString> builder) {
        this.description = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of());
        return this;
    }

    /**
     *  <p>Description of the State.</p>
     * @param description value to be set
     * @return Builder
     */

    public StateDraftBuilder description(
            @Nullable final com.commercetools.api.models.common.LocalizedString description) {
        this.description = description;
        return this;
    }

    /**
     *  <p>Set to <code>false</code> if the State is not the first step in a workflow.</p>
     * @param initial value to be set
     * @return Builder
     */

    public StateDraftBuilder initial(@Nullable final Boolean initial) {
        this.initial = initial;
        return this;
    }

    /**
     *  <p>If suitable, assign predifined roles the State can fulfill in case the State's <code>type</code> is <code>LineItemState</code> or <code>ReviewState</code>.</p>
     * @param roles value to be set
     * @return Builder
     */

    public StateDraftBuilder roles(@Nullable final com.commercetools.api.models.state.StateRoleEnum... roles) {
        this.roles = new ArrayList<>(Arrays.asList(roles));
        return this;
    }

    /**
     *  <p>If suitable, assign predifined roles the State can fulfill in case the State's <code>type</code> is <code>LineItemState</code> or <code>ReviewState</code>.</p>
     * @param roles value to be set
     * @return Builder
     */

    public StateDraftBuilder roles(
            @Nullable final java.util.List<com.commercetools.api.models.state.StateRoleEnum> roles) {
        this.roles = roles;
        return this;
    }

    /**
     *  <p>If suitable, assign predifined roles the State can fulfill in case the State's <code>type</code> is <code>LineItemState</code> or <code>ReviewState</code>.</p>
     * @param roles value to be set
     * @return Builder
     */

    public StateDraftBuilder plusRoles(@Nullable final com.commercetools.api.models.state.StateRoleEnum... roles) {
        if (this.roles == null) {
            this.roles = new ArrayList<>();
        }
        this.roles.addAll(Arrays.asList(roles));
        return this;
    }

    /**
     *  <p>Define the list of States of the same <code>type</code> to which the current State can be transitioned to.</p>
     *  <ul>
     *   <li>If, for example, the current State is the <em>Initial</em> State of StateType <code>OrderState</code> and you want to allow the transition <em>Initial</em> -&gt; <em>Shipped</em>, then add the StateResourceIdentifier to the <em>Shipped</em> <code>OrderState</code> to this list.</li>
     *   <li>Set to empty list for not allowing any transition from the current State and defining it as final State for a workflow.</li>
     *   <li>Do not set this field at all to turn off validation and allowing transitions to any other State of the same <code>type</code> as the current State.</li>
     *  </ul>
     * @param transitions value to be set
     * @return Builder
     */

    public StateDraftBuilder transitions(
            @Nullable final com.commercetools.api.models.state.StateResourceIdentifier... transitions) {
        this.transitions = new ArrayList<>(Arrays.asList(transitions));
        return this;
    }

    /**
     *  <p>Define the list of States of the same <code>type</code> to which the current State can be transitioned to.</p>
     *  <ul>
     *   <li>If, for example, the current State is the <em>Initial</em> State of StateType <code>OrderState</code> and you want to allow the transition <em>Initial</em> -&gt; <em>Shipped</em>, then add the StateResourceIdentifier to the <em>Shipped</em> <code>OrderState</code> to this list.</li>
     *   <li>Set to empty list for not allowing any transition from the current State and defining it as final State for a workflow.</li>
     *   <li>Do not set this field at all to turn off validation and allowing transitions to any other State of the same <code>type</code> as the current State.</li>
     *  </ul>
     * @param transitions value to be set
     * @return Builder
     */

    public StateDraftBuilder transitions(
            @Nullable final java.util.List<com.commercetools.api.models.state.StateResourceIdentifier> transitions) {
        this.transitions = transitions;
        return this;
    }

    /**
     *  <p>Define the list of States of the same <code>type</code> to which the current State can be transitioned to.</p>
     *  <ul>
     *   <li>If, for example, the current State is the <em>Initial</em> State of StateType <code>OrderState</code> and you want to allow the transition <em>Initial</em> -&gt; <em>Shipped</em>, then add the StateResourceIdentifier to the <em>Shipped</em> <code>OrderState</code> to this list.</li>
     *   <li>Set to empty list for not allowing any transition from the current State and defining it as final State for a workflow.</li>
     *   <li>Do not set this field at all to turn off validation and allowing transitions to any other State of the same <code>type</code> as the current State.</li>
     *  </ul>
     * @param transitions value to be set
     * @return Builder
     */

    public StateDraftBuilder plusTransitions(
            @Nullable final com.commercetools.api.models.state.StateResourceIdentifier... transitions) {
        if (this.transitions == null) {
            this.transitions = new ArrayList<>();
        }
        this.transitions.addAll(Arrays.asList(transitions));
        return this;
    }

    /**
     *  <p>Define the list of States of the same <code>type</code> to which the current State can be transitioned to.</p>
     *  <ul>
     *   <li>If, for example, the current State is the <em>Initial</em> State of StateType <code>OrderState</code> and you want to allow the transition <em>Initial</em> -&gt; <em>Shipped</em>, then add the StateResourceIdentifier to the <em>Shipped</em> <code>OrderState</code> to this list.</li>
     *   <li>Set to empty list for not allowing any transition from the current State and defining it as final State for a workflow.</li>
     *   <li>Do not set this field at all to turn off validation and allowing transitions to any other State of the same <code>type</code> as the current State.</li>
     *  </ul>
     * @param builder function to build the transitions value
     * @return Builder
     */

    public StateDraftBuilder plusTransitions(
            Function<com.commercetools.api.models.state.StateResourceIdentifierBuilder, com.commercetools.api.models.state.StateResourceIdentifierBuilder> builder) {
        if (this.transitions == null) {
            this.transitions = new ArrayList<>();
        }
        this.transitions
                .add(builder.apply(com.commercetools.api.models.state.StateResourceIdentifierBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Define the list of States of the same <code>type</code> to which the current State can be transitioned to.</p>
     *  <ul>
     *   <li>If, for example, the current State is the <em>Initial</em> State of StateType <code>OrderState</code> and you want to allow the transition <em>Initial</em> -&gt; <em>Shipped</em>, then add the StateResourceIdentifier to the <em>Shipped</em> <code>OrderState</code> to this list.</li>
     *   <li>Set to empty list for not allowing any transition from the current State and defining it as final State for a workflow.</li>
     *   <li>Do not set this field at all to turn off validation and allowing transitions to any other State of the same <code>type</code> as the current State.</li>
     *  </ul>
     * @param builder function to build the transitions value
     * @return Builder
     */

    public StateDraftBuilder withTransitions(
            Function<com.commercetools.api.models.state.StateResourceIdentifierBuilder, com.commercetools.api.models.state.StateResourceIdentifierBuilder> builder) {
        this.transitions = new ArrayList<>();
        this.transitions
                .add(builder.apply(com.commercetools.api.models.state.StateResourceIdentifierBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Define the list of States of the same <code>type</code> to which the current State can be transitioned to.</p>
     *  <ul>
     *   <li>If, for example, the current State is the <em>Initial</em> State of StateType <code>OrderState</code> and you want to allow the transition <em>Initial</em> -&gt; <em>Shipped</em>, then add the StateResourceIdentifier to the <em>Shipped</em> <code>OrderState</code> to this list.</li>
     *   <li>Set to empty list for not allowing any transition from the current State and defining it as final State for a workflow.</li>
     *   <li>Do not set this field at all to turn off validation and allowing transitions to any other State of the same <code>type</code> as the current State.</li>
     *  </ul>
     * @param builder function to build the transitions value
     * @return Builder
     */

    public StateDraftBuilder addTransitions(
            Function<com.commercetools.api.models.state.StateResourceIdentifierBuilder, com.commercetools.api.models.state.StateResourceIdentifier> builder) {
        return plusTransitions(builder.apply(com.commercetools.api.models.state.StateResourceIdentifierBuilder.of()));
    }

    /**
     *  <p>Define the list of States of the same <code>type</code> to which the current State can be transitioned to.</p>
     *  <ul>
     *   <li>If, for example, the current State is the <em>Initial</em> State of StateType <code>OrderState</code> and you want to allow the transition <em>Initial</em> -&gt; <em>Shipped</em>, then add the StateResourceIdentifier to the <em>Shipped</em> <code>OrderState</code> to this list.</li>
     *   <li>Set to empty list for not allowing any transition from the current State and defining it as final State for a workflow.</li>
     *   <li>Do not set this field at all to turn off validation and allowing transitions to any other State of the same <code>type</code> as the current State.</li>
     *  </ul>
     * @param builder function to build the transitions value
     * @return Builder
     */

    public StateDraftBuilder setTransitions(
            Function<com.commercetools.api.models.state.StateResourceIdentifierBuilder, com.commercetools.api.models.state.StateResourceIdentifier> builder) {
        return transitions(builder.apply(com.commercetools.api.models.state.StateResourceIdentifierBuilder.of()));
    }

    /**
     *  <p>User-defined unique identifier for the State.</p>
     * @return key
     */

    public String getKey() {
        return this.key;
    }

    /**
     *  <p>Specify to which resource or object type the State is assigned to.</p>
     * @return type
     */

    public com.commercetools.api.models.state.StateTypeEnum getType() {
        return this.type;
    }

    /**
     *  <p>Name of the State.</p>
     * @return name
     */

    @Nullable
    public com.commercetools.api.models.common.LocalizedString getName() {
        return this.name;
    }

    /**
     *  <p>Description of the State.</p>
     * @return description
     */

    @Nullable
    public com.commercetools.api.models.common.LocalizedString getDescription() {
        return this.description;
    }

    /**
     *  <p>Set to <code>false</code> if the State is not the first step in a workflow.</p>
     * @return initial
     */

    @Nullable
    public Boolean getInitial() {
        return this.initial;
    }

    /**
     *  <p>If suitable, assign predifined roles the State can fulfill in case the State's <code>type</code> is <code>LineItemState</code> or <code>ReviewState</code>.</p>
     * @return roles
     */

    @Nullable
    public java.util.List<com.commercetools.api.models.state.StateRoleEnum> getRoles() {
        return this.roles;
    }

    /**
     *  <p>Define the list of States of the same <code>type</code> to which the current State can be transitioned to.</p>
     *  <ul>
     *   <li>If, for example, the current State is the <em>Initial</em> State of StateType <code>OrderState</code> and you want to allow the transition <em>Initial</em> -&gt; <em>Shipped</em>, then add the StateResourceIdentifier to the <em>Shipped</em> <code>OrderState</code> to this list.</li>
     *   <li>Set to empty list for not allowing any transition from the current State and defining it as final State for a workflow.</li>
     *   <li>Do not set this field at all to turn off validation and allowing transitions to any other State of the same <code>type</code> as the current State.</li>
     *  </ul>
     * @return transitions
     */

    @Nullable
    public java.util.List<com.commercetools.api.models.state.StateResourceIdentifier> getTransitions() {
        return this.transitions;
    }

    /**
     * builds StateDraft with checking for non-null required values
     * @return StateDraft
     */
    public StateDraft build() {
        Objects.requireNonNull(key, StateDraft.class + ": key is missing");
        Objects.requireNonNull(type, StateDraft.class + ": type is missing");
        return new StateDraftImpl(key, type, name, description, initial, roles, transitions);
    }

    /**
     * builds StateDraft without checking for non-null required values
     * @return StateDraft
     */
    public StateDraft buildUnchecked() {
        return new StateDraftImpl(key, type, name, description, initial, roles, transitions);
    }

    /**
     * factory method for an instance of StateDraftBuilder
     * @return builder
     */
    public static StateDraftBuilder of() {
        return new StateDraftBuilder();
    }

    /**
     * create builder for StateDraft instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StateDraftBuilder of(final StateDraft template) {
        StateDraftBuilder builder = new StateDraftBuilder();
        builder.key = template.getKey();
        builder.type = template.getType();
        builder.name = template.getName();
        builder.description = template.getDescription();
        builder.initial = template.getInitial();
        builder.roles = template.getRoles();
        builder.transitions = template.getTransitions();
        return builder;
    }

}
