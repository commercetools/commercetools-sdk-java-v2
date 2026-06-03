
package com.commercetools.api.models.extension;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.ModelBase;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * ExtensionSetExpansionPathsAction
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ExtensionSetExpansionPathsActionImpl implements ExtensionSetExpansionPathsAction, ModelBase {

    private String action;

    private java.util.List<String> expansionPaths;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ExtensionSetExpansionPathsActionImpl(@JsonProperty("expansionPaths") final java.util.List<String> expansionPaths) {
        this.expansionPaths = expansionPaths;
        this.action = SET_EXPANSION_PATHS;
    }

    /**
     * create empty instance
     */
    public ExtensionSetExpansionPathsActionImpl() {
        this.action = SET_EXPANSION_PATHS;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p><span>Expansion paths</span> used for reference expansion of the payload.</p>
     *  <p>Be aware of the <span>limits</span> of this feature and its <span>performance impact</span>.</p>
     */

    public java.util.List<String> getExpansionPaths() {
        return this.expansionPaths;
    }

    public void setExpansionPaths(final String... expansionPaths) {
        this.expansionPaths = new ArrayList<>(Arrays.asList(expansionPaths));
    }

    public void setExpansionPaths(final java.util.List<String> expansionPaths) {
        this.expansionPaths = expansionPaths;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ExtensionSetExpansionPathsActionImpl that = (ExtensionSetExpansionPathsActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(expansionPaths, that.expansionPaths)
                .append(action, that.action)
                .append(expansionPaths, that.expansionPaths)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(expansionPaths).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("action", action)
                .append("expansionPaths", expansionPaths)
                .build();
    }

    @Override
    public ExtensionSetExpansionPathsAction copyDeep() {
        return ExtensionSetExpansionPathsAction.deepCopy(this);
    }
}
