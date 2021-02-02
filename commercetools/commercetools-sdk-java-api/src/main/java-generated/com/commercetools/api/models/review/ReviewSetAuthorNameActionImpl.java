
package com.commercetools.api.models.review;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ReviewSetAuthorNameActionImpl implements ReviewSetAuthorNameAction {

    private String action;

    private String authorName;

    @JsonCreator
    ReviewSetAuthorNameActionImpl(@JsonProperty("authorName") final String authorName) {
        this.authorName = authorName;
        this.action = SET_AUTHOR_NAME;
    }

    public ReviewSetAuthorNameActionImpl() {
        this.action = SET_AUTHOR_NAME;
    }

    public String getAction() {
        return this.action;
    }

    /**
    *  <p>If <code>authorName</code> is absent or <code>null</code>, this field will be removed if it exists.</p>
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

        return new EqualsBuilder().append(action, that.action).append(authorName, that.authorName).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(authorName).toHashCode();
    }

}
