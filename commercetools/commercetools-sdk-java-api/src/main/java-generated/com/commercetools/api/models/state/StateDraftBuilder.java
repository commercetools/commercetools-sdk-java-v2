
package com.commercetools.api.models.state;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class StateDraftBuilder {

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

    public StateDraftBuilder key(final String key) {
        this.key = key;
        return this;
    }

    public StateDraftBuilder type(final com.commercetools.api.models.state.StateTypeEnum type) {
        this.type = type;
        return this;
    }

    public StateDraftBuilder name(@Nullable final com.commercetools.api.models.common.LocalizedString name) {
        this.name = name;
        return this;
    }

    public StateDraftBuilder description(
            @Nullable final com.commercetools.api.models.common.LocalizedString description) {
        this.description = description;
        return this;
    }

    public StateDraftBuilder initial(@Nullable final Boolean initial) {
        this.initial = initial;
        return this;
    }

    public StateDraftBuilder roles(@Nullable final com.commercetools.api.models.state.StateRoleEnum... roles) {
        this.roles = new ArrayList<>(Arrays.asList(roles));
        return this;
    }

    public StateDraftBuilder roles(
            @Nullable final java.util.List<com.commercetools.api.models.state.StateRoleEnum> roles) {
        this.roles = roles;
        return this;
    }

    public StateDraftBuilder transitions(
            @Nullable final com.commercetools.api.models.state.StateResourceIdentifier... transitions) {
        this.transitions = new ArrayList<>(Arrays.asList(transitions));
        return this;
    }

    public StateDraftBuilder transitions(
            @Nullable final java.util.List<com.commercetools.api.models.state.StateResourceIdentifier> transitions) {
        this.transitions = transitions;
        return this;
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

    @Nullable
    public Boolean getInitial() {
        return this.initial;
    }

    @Nullable
    public java.util.List<com.commercetools.api.models.state.StateRoleEnum> getRoles() {
        return this.roles;
    }

    @Nullable
    public java.util.List<com.commercetools.api.models.state.StateResourceIdentifier> getTransitions() {
        return this.transitions;
    }

    public StateDraft build() {
        return new StateDraftImpl(key, type, name, description, initial, roles, transitions);
    }

    public static StateDraftBuilder of() {
        return new StateDraftBuilder();
    }

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
