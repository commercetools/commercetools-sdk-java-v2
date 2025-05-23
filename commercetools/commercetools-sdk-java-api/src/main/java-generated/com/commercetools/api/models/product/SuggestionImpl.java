
package com.commercetools.api.models.product;

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
 * Suggestion
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SuggestionImpl implements Suggestion, ModelBase {

    private String text;

    /**
     * create instance with all properties
     */
    @JsonCreator
    SuggestionImpl(@JsonProperty("text") final String text) {
        this.text = text;
    }

    /**
     * create empty instance
     */
    public SuggestionImpl() {
    }

    /**
     *  <p>The suggested text.</p>
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

        SuggestionImpl that = (SuggestionImpl) o;

        return new EqualsBuilder().append(text, that.text).append(text, that.text).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(text).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("text", text).build();
    }

    @Override
    public Suggestion copyDeep() {
        return Suggestion.deepCopy(this);
    }
}
