
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

/**
 * ReviewSetTextAction
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ReviewSetTextActionImpl implements ReviewSetTextAction, ModelBase {

    private String action;

    private String text;

    @JsonCreator
    ReviewSetTextActionImpl(@JsonProperty("text") final String text) {
        this.text = text;
        this.action = SET_TEXT;
    }

    public ReviewSetTextActionImpl() {
        this.action = SET_TEXT;
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

    public String getText() {
        return this.text;
    }

    public void setText(final String text) {
        this.text = text;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ReviewSetTextActionImpl that = (ReviewSetTextActionImpl) o;

        return new EqualsBuilder().append(action, that.action).append(text, that.text).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(text).toHashCode();
    }

}
