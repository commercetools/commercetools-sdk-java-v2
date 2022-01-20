
package com.commercetools.history.models.label;

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
public class ReviewLabelImpl implements ReviewLabel, ModelBase {

    private String type;

    private String key;

    private String title;

    @JsonCreator
    ReviewLabelImpl(@JsonProperty("key") final String key, @JsonProperty("title") final String title) {
        this.key = key;
        this.title = title;
        this.type = REVIEW_LABEL;
    }

    public ReviewLabelImpl() {
        this.type = REVIEW_LABEL;
    }

    public String getType() {
        return this.type;
    }

    public String getKey() {
        return this.key;
    }

    public String getTitle() {
        return this.title;
    }

    public void setKey(final String key) {
        this.key = key;
    }

    public void setTitle(final String title) {
        this.title = title;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ReviewLabelImpl that = (ReviewLabelImpl) o;

        return new EqualsBuilder().append(type, that.type).append(key, that.key).append(title, that.title).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).append(key).append(title).toHashCode();
    }

}
