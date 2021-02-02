
package com.commercetools.api.models.extension;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ExtensionChangeTriggersActionImpl implements ExtensionChangeTriggersAction {

    private String action;

    private java.util.List<com.commercetools.api.models.extension.ExtensionTrigger> triggers;

    @JsonCreator
    ExtensionChangeTriggersActionImpl(
            @JsonProperty("triggers") final java.util.List<com.commercetools.api.models.extension.ExtensionTrigger> triggers) {
        this.triggers = triggers;
        this.action = CHANGE_TRIGGERS;
    }

    public ExtensionChangeTriggersActionImpl() {
        this.action = CHANGE_TRIGGERS;
    }

    public String getAction() {
        return this.action;
    }

    public java.util.List<com.commercetools.api.models.extension.ExtensionTrigger> getTriggers() {
        return this.triggers;
    }

    public void setTriggers(final com.commercetools.api.models.extension.ExtensionTrigger... triggers) {
        this.triggers = new ArrayList<>(Arrays.asList(triggers));
    }

    public void setTriggers(final java.util.List<com.commercetools.api.models.extension.ExtensionTrigger> triggers) {
        this.triggers = triggers;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ExtensionChangeTriggersActionImpl that = (ExtensionChangeTriggersActionImpl) o;

        return new EqualsBuilder().append(action, that.action).append(triggers, that.triggers).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(triggers).toHashCode();
    }

}
