
package com.commercetools.api.models.review;

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
 * ReviewSetAuthorNameAction
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ReviewSetAuthorNameActionImpl implements ReviewSetAuthorNameAction, ModelBase {

    private String action;

    private String authorName;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ReviewSetAuthorNameActionImpl(@JsonProperty("authorName") final String authorName) {
        this.authorName = authorName;
        this.action = SET_AUTHOR_NAME;
    }

    /**
     * create empty instance
     */
    public ReviewSetAuthorNameActionImpl() {
        this.action = SET_AUTHOR_NAME;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     */

    public String getAuthorName() {
        return this.authorName;
    }

    public void setAuthorName(final String authorName) {
        this.authorName = authorName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ReviewSetAuthorNameActionImpl that = (ReviewSetAuthorNameActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(authorName, that.authorName)
                .append(action, that.action)
                .append(authorName, that.authorName)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(authorName).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("action", action)
                .append("authorName", authorName)
                .build();
    }

}
