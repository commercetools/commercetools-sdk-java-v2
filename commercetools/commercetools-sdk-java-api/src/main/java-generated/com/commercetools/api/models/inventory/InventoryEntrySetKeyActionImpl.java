
package com.commercetools.api.models.inventory;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.ModelBase;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class InventoryEntrySetKeyActionImpl implements InventoryEntrySetKeyAction, ModelBase {

    private String action;

    private String key;

    @JsonCreator
    InventoryEntrySetKeyActionImpl(@JsonProperty("key") final String key) {
        this.key = key;
        this.action = SET_KEY;
    }

    public InventoryEntrySetKeyActionImpl() {
        this.action = SET_KEY;
    }

    public String getAction() {
        return this.action;
    }

    /**
    *  <p>Value to set. If empty, any existing value will be removed.</p>
    */
    public String getKey() {
        return this.key;
    }

    public void setKey(final String key) {
        this.key = key;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        InventoryEntrySetKeyActionImpl that = (InventoryEntrySetKeyActionImpl) o;

        return new EqualsBuilder().append(action, that.action).append(key, that.key).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(key).toHashCode();
    }

}
