
package com.commercetools.ml.models.image_search_config;

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
public class ImageSearchConfigRequestImpl implements ImageSearchConfigRequest, ModelBase {

    private java.util.List<com.commercetools.ml.models.image_search_config.ImageSearchConfigUpdateAction> actions;

    @JsonCreator
    ImageSearchConfigRequestImpl(
            @JsonProperty("actions") final java.util.List<com.commercetools.ml.models.image_search_config.ImageSearchConfigUpdateAction> actions) {
        this.actions = actions;
    }

    public ImageSearchConfigRequestImpl() {
    }

    /**
    *  <p>The list of update actions to be performed on the project.</p>
    */
    public java.util.List<com.commercetools.ml.models.image_search_config.ImageSearchConfigUpdateAction> getActions() {
        return this.actions;
    }

    public void setActions(
            final com.commercetools.ml.models.image_search_config.ImageSearchConfigUpdateAction... actions) {
        this.actions = new ArrayList<>(Arrays.asList(actions));
    }

    public void setActions(
            final java.util.List<com.commercetools.ml.models.image_search_config.ImageSearchConfigUpdateAction> actions) {
        this.actions = actions;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ImageSearchConfigRequestImpl that = (ImageSearchConfigRequestImpl) o;

        return new EqualsBuilder().append(actions, that.actions).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(actions).toHashCode();
    }

}
