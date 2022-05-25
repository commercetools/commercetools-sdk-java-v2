
package com.commercetools.api.models.state;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * StateBuilder
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
public class StateBuilder implements Builder<State> {

    private String id;

    private Long version;

    private java.time.ZonedDateTime createdAt;

    private java.time.ZonedDateTime lastModifiedAt;

    @Nullable
    private com.commercetools.api.models.common.LastModifiedBy lastModifiedBy;

    @Nullable
    private com.commercetools.api.models.common.CreatedBy createdBy;

    private String key;

    private com.commercetools.api.models.state.StateTypeEnum type;

    @Nullable
    private com.commercetools.api.models.common.LocalizedString name;

    @Nullable
    private com.commercetools.api.models.common.LocalizedString description;

    private Boolean initial;

    private Boolean builtIn;

    @Nullable
    private java.util.List<com.commercetools.api.models.state.StateRoleEnum> roles;

    @Nullable
    private java.util.List<com.commercetools.api.models.state.StateReference> transitions;

    /**
     *  <p>Unique identifier of the State.</p>
     */

    public StateBuilder id(final String id) {
        this.id = id;
        return this;
    }

    /**
     *  <p>Current version of the State.</p>
     */

    public StateBuilder version(final Long version) {
        this.version = version;
        return this;
    }

    /**
     *  <p>Date and time (UTC) the State was initially created.</p>
     */

    public StateBuilder createdAt(final java.time.ZonedDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     *  <p>Date and time (UTC) the State was last updated.</p>
     */

    public StateBuilder lastModifiedAt(final java.time.ZonedDateTime lastModifiedAt) {
        this.lastModifiedAt = lastModifiedAt;
        return this;
    }

    /**
     *  <p>Present on resources created after 1 February 2019 except for events not tracked.</p>
     */

    public StateBuilder lastModifiedBy(
            Function<com.commercetools.api.models.common.LastModifiedByBuilder, com.commercetools.api.models.common.LastModifiedByBuilder> builder) {
        this.lastModifiedBy = builder.apply(com.commercetools.api.models.common.LastModifiedByBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Present on resources created after 1 February 2019 except for events not tracked.</p>
     */

    public StateBuilder lastModifiedBy(
            @Nullable final com.commercetools.api.models.common.LastModifiedBy lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
        return this;
    }

    /**
     *  <p>Present on resources created after 1 February 2019 except for events not tracked.</p>
     */

    public StateBuilder createdBy(
            Function<com.commercetools.api.models.common.CreatedByBuilder, com.commercetools.api.models.common.CreatedByBuilder> builder) {
        this.createdBy = builder.apply(com.commercetools.api.models.common.CreatedByBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Present on resources created after 1 February 2019 except for events not tracked.</p>
     */

    public StateBuilder createdBy(@Nullable final com.commercetools.api.models.common.CreatedBy createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    /**
     *  <p>User-defined unique identifier of the State.</p>
     */

    public StateBuilder key(final String key) {
        this.key = key;
        return this;
    }

    /**
     *  <p>Indicates to which resource or object types the State is assigned to.</p>
     */

    public StateBuilder type(final com.commercetools.api.models.state.StateTypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     *  <p>Name of the State.</p>
     */

    public StateBuilder name(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.name = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Name of the State.</p>
     */

    public StateBuilder name(@Nullable final com.commercetools.api.models.common.LocalizedString name) {
        this.name = name;
        return this;
    }

    /**
     *  <p>Description of the State.</p>
     */

    public StateBuilder description(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.description = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Description of the State.</p>
     */

    public StateBuilder description(@Nullable final com.commercetools.api.models.common.LocalizedString description) {
        this.description = description;
        return this;
    }

    /**
     *  <p><code>true</code> for an initial State, the first State in a workflow.</p>
     */

    public StateBuilder initial(final Boolean initial) {
        this.initial = initial;
        return this;
    }

    /**
     *  <p><code>true</code> for States that are an integral part of the Project. Those States cannot be deleted and their <code>key</code> cannot be changed.</p>
     */

    public StateBuilder builtIn(final Boolean builtIn) {
        this.builtIn = builtIn;
        return this;
    }

    /**
     *  <p>Roles the State can fulfill for Reviews and Line Items.</p>
     */

    public StateBuilder roles(@Nullable final com.commercetools.api.models.state.StateRoleEnum... roles) {
        this.roles = new ArrayList<>(Arrays.asList(roles));
        return this;
    }

    /**
     *  <p>Roles the State can fulfill for Reviews and Line Items.</p>
     */

    public StateBuilder roles(@Nullable final java.util.List<com.commercetools.api.models.state.StateRoleEnum> roles) {
        this.roles = roles;
        return this;
    }

    /**
     *  <p>Roles the State can fulfill for Reviews and Line Items.</p>
     */

    public StateBuilder plusRoles(@Nullable final com.commercetools.api.models.state.StateRoleEnum... roles) {
        if (this.roles == null) {
            this.roles = new ArrayList<>();
        }
        this.roles.addAll(Arrays.asList(roles));
        return this;
    }

    /**
     *  <ul>
     *   <li>list of States of the same <code>type</code> that the current State can be transitioned to. For example, when the current State is the <em>Initial</em> State of StateType <code>OrderState</code> and this list contains the reference to the <em>Shipped</em> <code>OrderState</code>, the transition <em>Initial</em> -&gt; <em>Shipped</em> is allowed.</li>
     *   <li>if empty, no transitions are allowed from the current State, defining the current State as final for this workflow.</li>
     *   <li>if not set, the validation is turned off and the current State can be transitioned to any other State of the same <code>type</code> as the current State.</li>
     *  </ul>
     */

    public StateBuilder transitions(@Nullable final com.commercetools.api.models.state.StateReference... transitions) {
        this.transitions = new ArrayList<>(Arrays.asList(transitions));
        return this;
    }

    /**
     *  <ul>
     *   <li>list of States of the same <code>type</code> that the current State can be transitioned to. For example, when the current State is the <em>Initial</em> State of StateType <code>OrderState</code> and this list contains the reference to the <em>Shipped</em> <code>OrderState</code>, the transition <em>Initial</em> -&gt; <em>Shipped</em> is allowed.</li>
     *   <li>if empty, no transitions are allowed from the current State, defining the current State as final for this workflow.</li>
     *   <li>if not set, the validation is turned off and the current State can be transitioned to any other State of the same <code>type</code> as the current State.</li>
     *  </ul>
     */

    public StateBuilder transitions(
            @Nullable final java.util.List<com.commercetools.api.models.state.StateReference> transitions) {
        this.transitions = transitions;
        return this;
    }

    /**
     *  <ul>
     *   <li>list of States of the same <code>type</code> that the current State can be transitioned to. For example, when the current State is the <em>Initial</em> State of StateType <code>OrderState</code> and this list contains the reference to the <em>Shipped</em> <code>OrderState</code>, the transition <em>Initial</em> -&gt; <em>Shipped</em> is allowed.</li>
     *   <li>if empty, no transitions are allowed from the current State, defining the current State as final for this workflow.</li>
     *   <li>if not set, the validation is turned off and the current State can be transitioned to any other State of the same <code>type</code> as the current State.</li>
     *  </ul>
     */

    public StateBuilder plusTransitions(
            @Nullable final com.commercetools.api.models.state.StateReference... transitions) {
        if (this.transitions == null) {
            this.transitions = new ArrayList<>();
        }
        this.transitions.addAll(Arrays.asList(transitions));
        return this;
    }

    /**
     *  <ul>
     *   <li>list of States of the same <code>type</code> that the current State can be transitioned to. For example, when the current State is the <em>Initial</em> State of StateType <code>OrderState</code> and this list contains the reference to the <em>Shipped</em> <code>OrderState</code>, the transition <em>Initial</em> -&gt; <em>Shipped</em> is allowed.</li>
     *   <li>if empty, no transitions are allowed from the current State, defining the current State as final for this workflow.</li>
     *   <li>if not set, the validation is turned off and the current State can be transitioned to any other State of the same <code>type</code> as the current State.</li>
     *  </ul>
     */

    public StateBuilder plusTransitions(
            Function<com.commercetools.api.models.state.StateReferenceBuilder, com.commercetools.api.models.state.StateReferenceBuilder> builder) {
        if (this.transitions == null) {
            this.transitions = new ArrayList<>();
        }
        this.transitions.add(builder.apply(com.commercetools.api.models.state.StateReferenceBuilder.of()).build());
        return this;
    }

    /**
     *  <ul>
     *   <li>list of States of the same <code>type</code> that the current State can be transitioned to. For example, when the current State is the <em>Initial</em> State of StateType <code>OrderState</code> and this list contains the reference to the <em>Shipped</em> <code>OrderState</code>, the transition <em>Initial</em> -&gt; <em>Shipped</em> is allowed.</li>
     *   <li>if empty, no transitions are allowed from the current State, defining the current State as final for this workflow.</li>
     *   <li>if not set, the validation is turned off and the current State can be transitioned to any other State of the same <code>type</code> as the current State.</li>
     *  </ul>
     */

    public StateBuilder withTransitions(
            Function<com.commercetools.api.models.state.StateReferenceBuilder, com.commercetools.api.models.state.StateReferenceBuilder> builder) {
        this.transitions = new ArrayList<>();
        this.transitions.add(builder.apply(com.commercetools.api.models.state.StateReferenceBuilder.of()).build());
        return this;
    }

    public String getId() {
        return this.id;
    }

    public Long getVersion() {
        return this.version;
    }

    public java.time.ZonedDateTime getCreatedAt() {
        return this.createdAt;
    }

    public java.time.ZonedDateTime getLastModifiedAt() {
        return this.lastModifiedAt;
    }

    @Nullable
    public com.commercetools.api.models.common.LastModifiedBy getLastModifiedBy() {
        return this.lastModifiedBy;
    }

    @Nullable
    public com.commercetools.api.models.common.CreatedBy getCreatedBy() {
        return this.createdBy;
    }

    public String getKey() {
        return this.key;
    }

    public com.commercetools.api.models.state.StateTypeEnum getType() {
        return this.type;
    }

    @Nullable
    public com.commercetools.api.models.common.LocalizedString getName() {
        return this.name;
    }

    @Nullable
    public com.commercetools.api.models.common.LocalizedString getDescription() {
        return this.description;
    }

    public Boolean getInitial() {
        return this.initial;
    }

    public Boolean getBuiltIn() {
        return this.builtIn;
    }

    @Nullable
    public java.util.List<com.commercetools.api.models.state.StateRoleEnum> getRoles() {
        return this.roles;
    }

    @Nullable
    public java.util.List<com.commercetools.api.models.state.StateReference> getTransitions() {
        return this.transitions;
    }

    public State build() {
        Objects.requireNonNull(id, State.class + ": id is missing");
        Objects.requireNonNull(version, State.class + ": version is missing");
        Objects.requireNonNull(createdAt, State.class + ": createdAt is missing");
        Objects.requireNonNull(lastModifiedAt, State.class + ": lastModifiedAt is missing");
        Objects.requireNonNull(key, State.class + ": key is missing");
        Objects.requireNonNull(type, State.class + ": type is missing");
        Objects.requireNonNull(initial, State.class + ": initial is missing");
        Objects.requireNonNull(builtIn, State.class + ": builtIn is missing");
        return new StateImpl(id, version, createdAt, lastModifiedAt, lastModifiedBy, createdBy, key, type, name,
            description, initial, builtIn, roles, transitions);
    }

    /**
     * builds State without checking for non null required values
     */
    public State buildUnchecked() {
        return new StateImpl(id, version, createdAt, lastModifiedAt, lastModifiedBy, createdBy, key, type, name,
            description, initial, builtIn, roles, transitions);
    }

    public static StateBuilder of() {
        return new StateBuilder();
    }

    public static StateBuilder of(final State template) {
        StateBuilder builder = new StateBuilder();
        builder.id = template.getId();
        builder.version = template.getVersion();
        builder.createdAt = template.getCreatedAt();
        builder.lastModifiedAt = template.getLastModifiedAt();
        builder.lastModifiedBy = template.getLastModifiedBy();
        builder.createdBy = template.getCreatedBy();
        builder.key = template.getKey();
        builder.type = template.getType();
        builder.name = template.getName();
        builder.description = template.getDescription();
        builder.initial = template.getInitial();
        builder.builtIn = template.getBuiltIn();
        builder.roles = template.getRoles();
        builder.transitions = template.getTransitions();
        return builder;
    }

}
